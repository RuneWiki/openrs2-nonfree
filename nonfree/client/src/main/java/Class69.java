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

@OriginalClass("client!df")
public final class Class69 implements Interface22 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "I")
	private int anInt2586;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "[I")
	private int[] anIntArray113;

	@OriginalMember(owner = "client!df", name = "l", descriptor = "I")
	private int anInt2587;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "I")
	private int anInt2588;

	@OriginalMember(owner = "client!df", name = "c", descriptor = "[I")
	private final int[] anIntArray112 = new int[2];

	@OriginalMember(owner = "client!df", name = "a", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!df", name = "f", descriptor = "[I")
	private final int[] anIntArray114 = new int[2];

	@OriginalMember(owner = "client!df", name = "g", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!df", name = "i", descriptor = "[[B")
	private final byte[][] aByteArrayArray38 = new byte[2][];

	@OriginalMember(owner = "client!df", name = "j", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!df", name = "d", descriptor = "[Z")
	private final boolean[] aBooleanArray3 = new boolean[2];

	@OriginalMember(owner = "client!df", name = "k", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!df", name = "h", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class69() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
	@Override
	public void method2194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception {
		if (this.anInt2586 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(16) int local16 = this.anInt2587 * 65536;
		if (this.aByteArrayArray38[arg1] == null || local16 != this.aByteArrayArray38[arg1].length) {
			this.aByteArrayArray38[arg1] = new byte[local16];
			this.aDSBufferDescArray1[arg1].bufferBytes = local16;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray3[arg1] = false;
		this.anIntArray114[arg1] = 0;
		this.anIntArray112[arg1] = arg0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I[I)V")
	@Override
	public void method2196(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt2588 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray114[arg0] * this.anInt2587;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray38[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray38[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray38[arg0], 0);
		this.anIntArray114[arg0] = this.anIntArray114[arg0] + local2 / this.anInt2588 & 0xFFFF;
		if (!this.aBooleanArray3[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray3[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)V")
	@Override
	public void method2195(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(II)I")
	@Override
	public int method2193(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray3[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt2587;
		@Pc(34) int local34 = this.anIntArray114[arg0] - local24 & 0xFFFF;
		if (this.anIntArray112[arg0] < local34) {
			for (@Pc(50) int local50 = local24 - this.anIntArray114[arg0] & 0xFFFF; local50 > 0; local50 -= 256) {
				this.method2196(arg0, this.anIntArray113);
			}
			local34 = this.anIntArray114[arg0] - local24 & 0xFFFF;
		}
		return local34;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
	@Override
	public void method2192(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray3[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray114[arg0] = 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/awt/Component;BZ)V")
	@Override
	public void method2197(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) boolean arg2) throws Exception {
		if (this.anInt2586 != 0) {
			return;
		}
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt2588 = arg2 ? 2 : 1;
		this.anInt2587 = arg2 ? 4 : 2;
		this.anIntArray113 = new int[this.anInt2588 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(56) int local56 = 0; local56 < 2; local56++) {
			this.aDSBufferDescArray1[local56].flags = 16384;
		}
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.avgBytesPerSec = arg0 * this.anInt2587;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.samplesPerSec = arg0;
		this.anInt2586 = arg0;
		this.aWaveFormatEx1.channels = this.anInt2588;
		this.aWaveFormatEx1.blockAlign = this.anInt2587;
	}
}
