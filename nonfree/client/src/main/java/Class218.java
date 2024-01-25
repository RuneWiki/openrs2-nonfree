import com.ms.com.ComFailException;
import com.ms.com._Guid;
import com.ms.directX.DSBufferDesc;
import com.ms.directX.DSCursors;
import com.ms.directX.DirectSound;
import com.ms.directX.DirectSoundBuffer;
import com.ms.directX.WaveFormatEx;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class218 implements Interface22 {

	@OriginalMember(owner = "client!mda", name = "h", descriptor = "I")
	private int anInt5796;

	@OriginalMember(owner = "client!mda", name = "i", descriptor = "[I")
	private int[] anIntArray342;

	@OriginalMember(owner = "client!mda", name = "k", descriptor = "I")
	private int anInt5797;

	@OriginalMember(owner = "client!mda", name = "m", descriptor = "I")
	private int anInt5798;

	@OriginalMember(owner = "client!mda", name = "e", descriptor = "[Z")
	private final boolean[] aBooleanArray24 = new boolean[2];

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "[I")
	private final int[] anIntArray340 = new int[2];

	@OriginalMember(owner = "client!mda", name = "f", descriptor = "[I")
	private final int[] anIntArray341 = new int[2];

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!mda", name = "j", descriptor = "[[B")
	private final byte[][] aByteArrayArray14 = new byte[2][];

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!mda", name = "g", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!mda", name = "l", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "()V")
	public Class218() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(I[I)V")
	@Override
	public void method4725(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt5798 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray341[arg0] * this.anInt5797;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray14[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray14[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray14[arg0], 0);
		this.anIntArray341[arg0] = this.anIntArray341[arg0] + local2 / this.anInt5798 & 0xFFFF;
		if (!this.aBooleanArray24[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray24[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
	@Override
	public void method4722(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) throws Exception {
		if (this.anInt5796 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt5798 = arg1 ? 2 : 1;
		this.anInt5797 = arg1 ? 4 : 2;
		this.anIntArray342 = new int[this.anInt5798 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg0, 2);
		for (@Pc(55) int local55 = 0; local55 < 2; local55++) {
			this.aDSBufferDescArray1[local55].flags = 16384;
		}
		this.aWaveFormatEx1.avgBytesPerSec = arg2 * this.anInt5797;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.blockAlign = this.anInt5797;
		this.anInt5796 = arg2;
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.aWaveFormatEx1.channels = this.anInt5798;
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(II)I")
	@Override
	public int method4724(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray24[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt5797;
		@Pc(34) int local34 = this.anIntArray341[arg0] - local24 & 0xFFFF;
		if (this.anIntArray340[arg0] < local34) {
			for (@Pc(50) int local50 = local24 - this.anIntArray341[arg0] & 0xFFFF; local50 > 0; local50 -= 256) {
				this.method4725(arg0, this.anIntArray342);
			}
			local34 = this.anIntArray341[arg0] - local24 & 0xFFFF;
		}
		return local34;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BI)V")
	@Override
	public void method4723(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(II)V")
	@Override
	public void method4721(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray24[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray341[arg0] = 0;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IZI)V")
	@Override
	public void method4720(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt5796 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(16) int local16 = this.anInt5797 * 65536;
		if (this.aByteArrayArray14[arg0] == null || local16 != this.aByteArrayArray14[arg0].length) {
			this.aByteArrayArray14[arg0] = new byte[local16];
			this.aDSBufferDescArray1[arg0].bufferBytes = local16;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray24[arg0] = false;
		this.anIntArray341[arg0] = 0;
		this.anIntArray340[arg0] = arg1;
	}
}
