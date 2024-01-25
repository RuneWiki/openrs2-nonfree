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

@OriginalClass("client!pp")
public final class Class266 implements Interface9 {

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "[I")
	private int[] anIntArray544;

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
	private int anInt7118;

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
	private int anInt7119;

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
	private int anInt7120;

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "[Z")
	private final boolean[] aBooleanArray16 = new boolean[2];

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "[[B")
	private final byte[][] aByteArrayArray26 = new byte[2][];

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "[I")
	private final int[] anIntArray545 = new int[2];

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "[I")
	private final int[] anIntArray546 = new int[2];

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
	public Class266() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)V")
	@Override
	public void method5658(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt7118 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(19) int local19 = this.anInt7120 * 65536;
		if (this.aByteArrayArray26[arg1] == null || this.aByteArrayArray26[arg1].length != local19) {
			this.aByteArrayArray26[arg1] = new byte[local19];
			this.aDSBufferDescArray1[arg1].bufferBytes = local19;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray16[arg1] = false;
		this.anIntArray546[arg1] = 0;
		this.anIntArray545[arg1] = arg0;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)I")
	@Override
	public int method5655(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray16[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt7120;
		@Pc(34) int local34 = this.anIntArray546[arg0] - local24 & 0xFFFF;
		if (local34 > this.anIntArray545[arg0]) {
			for (@Pc(54) int local54 = local24 - this.anIntArray546[arg0] & 0xFFFF; local54 > 0; local54 -= 256) {
				this.method5660(arg0, this.anIntArray544);
			}
			local34 = this.anIntArray546[arg0] - local24 & 0xFFFF;
		}
		return local34;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I[I)V")
	@Override
	public void method5660(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt7119 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray546[arg0] * this.anInt7120;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray26[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray26[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray26[arg0], 0);
		this.anIntArray546[arg0] = this.anIntArray546[arg0] + local2 / this.anInt7119 & 0xFFFF;
		if (!this.aBooleanArray16[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray16[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(II)V")
	@Override
	public void method5659(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray16[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray546[arg0] = 0;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/awt/Component;IBZ)V")
	@Override
	public void method5656(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) throws Exception {
		if (this.anInt7118 != 0) {
			return;
		}
		if (arg1 < 8000 || arg1 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt7120 = arg2 ? 4 : 2;
		this.anInt7119 = arg2 ? 2 : 1;
		this.anIntArray544 = new int[this.anInt7119 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg0, 2);
		for (@Pc(45) int local45 = 0; local45 < 2; local45++) {
			this.aDSBufferDescArray1[local45].flags = 16384;
		}
		this.aWaveFormatEx1.blockAlign = this.anInt7120;
		this.aWaveFormatEx1.channels = this.anInt7119;
		this.aWaveFormatEx1.avgBytesPerSec = arg1 * this.anInt7120;
		this.aWaveFormatEx1.formatTag = 1;
		this.anInt7118 = arg1;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.samplesPerSec = arg1;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(II)V")
	@Override
	public void method5657(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}
}
