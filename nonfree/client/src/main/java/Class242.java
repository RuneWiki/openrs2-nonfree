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

@OriginalClass("client!np")
public final class Class242 implements Interface23 {

	@OriginalMember(owner = "client!np", name = "b", descriptor = "[I")
	private int[] anIntArray439;

	@OriginalMember(owner = "client!np", name = "g", descriptor = "I")
	private int anInt6690;

	@OriginalMember(owner = "client!np", name = "i", descriptor = "I")
	private int anInt6691;

	@OriginalMember(owner = "client!np", name = "l", descriptor = "I")
	private int anInt6692;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!np", name = "f", descriptor = "[I")
	private final int[] anIntArray441 = new int[2];

	@OriginalMember(owner = "client!np", name = "h", descriptor = "[[B")
	private final byte[][] aByteArrayArray17 = new byte[2][];

	@OriginalMember(owner = "client!np", name = "j", descriptor = "[Z")
	private final boolean[] aBooleanArray15 = new boolean[2];

	@OriginalMember(owner = "client!np", name = "c", descriptor = "[I")
	private final int[] anIntArray440 = new int[2];

	@OriginalMember(owner = "client!np", name = "e", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!np", name = "m", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!np", name = "d", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!np", name = "k", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "()V")
	public Class242() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(55) int local55 = 0; local55 < 2; local55++) {
			this.aDSCursorsArray1[local55] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	@Override
	public void method5749(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) throws Exception {
		if (this.anInt6691 != 0) {
			return;
		}
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt6690 = arg1 ? 2 : 1;
		this.anInt6692 = arg1 ? 4 : 2;
		this.anIntArray439 = new int[this.anInt6690 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg2, 2);
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSBufferDescArray1[local57].flags = 16384;
		}
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.blockAlign = this.anInt6692;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.samplesPerSec = arg0;
		this.aWaveFormatEx1.avgBytesPerSec = this.anInt6692 * arg0;
		this.aWaveFormatEx1.channels = this.anInt6690;
		this.anInt6691 = arg0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I[I)V")
	@Override
	public void method5751(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt6690 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray441[arg0] * this.anInt6692;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray17[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray17[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray17[arg0], 0);
		this.anIntArray441[arg0] = this.anIntArray441[arg0] + local2 / this.anInt6690 & 0xFFFF;
		if (!this.aBooleanArray15[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray15[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5752(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt6691 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(19) int local19 = this.anInt6692 * 65536;
		if (this.aByteArrayArray17[arg0] == null || this.aByteArrayArray17[arg0].length != local19) {
			this.aByteArrayArray17[arg0] = new byte[local19];
			this.aDSBufferDescArray1[arg0].bufferBytes = local19;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray15[arg0] = false;
		this.anIntArray441[arg0] = 0;
		this.anIntArray440[arg0] = arg1;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)I")
	@Override
	public int method5753(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray15[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(32) int local32 = this.aDSCursorsArray1[arg0].write / this.anInt6692;
		@Pc(42) int local42 = this.anIntArray441[arg0] - local32 & 0xFFFF;
		if (local42 > this.anIntArray440[arg0]) {
			for (@Pc(58) int local58 = local32 - this.anIntArray441[arg0] & 0xFFFF; local58 > 0; local58 -= 256) {
				this.method5751(arg0, this.anIntArray439);
			}
			local42 = this.anIntArray441[arg0] - local32 & 0xFFFF;
		}
		return local42;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V")
	@Override
	public void method5754(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray15[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray441[arg0] = 0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5750(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(15) ComFailException local15) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}
}
