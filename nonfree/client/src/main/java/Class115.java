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

@OriginalClass("client!fq")
public final class Class115 implements Interface5 {

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
	private int anInt2875;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
	private int anInt2876;

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
	private int anInt2877;

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "[I")
	private final int[] anIntArray239 = new int[2];

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "[Z")
	private final boolean[] aBooleanArray15 = new boolean[2];

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "[[B")
	private final byte[][] aByteArrayArray5 = new byte[2][];

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "[I")
	private final int[] anIntArray241 = new int[2];

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V")
	public Class115() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(55) int local55 = 0; local55 < 2; local55++) {
			this.aDSCursorsArray1[local55] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(II)V")
	@Override
	public void method2475(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BII)V")
	@Override
	public void method2471(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt2877 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(19) int local19 = this.anInt2876 * 65536;
		if (this.aByteArrayArray5[arg1] == null || this.aByteArrayArray5[arg1].length != local19) {
			this.aByteArrayArray5[arg1] = new byte[local19];
			this.aDSBufferDescArray1[arg1].bufferBytes = local19;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray15[arg1] = false;
		this.anIntArray239[arg1] = 0;
		this.anIntArray241[arg1] = arg0;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[I)V")
	@Override
	public void method2476(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt2875 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray239[arg0] * this.anInt2876;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray5[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray5[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray5[arg0], 0);
		this.anIntArray239[arg0] = this.anIntArray239[arg0] + local2 / this.anInt2875 & 0xFFFF;
		if (!this.aBooleanArray15[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray15[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)I")
	@Override
	public int method2473(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray15[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt2876;
		@Pc(34) int local34 = this.anIntArray239[arg0] - local24 & 0xFFFF;
		if (local34 > this.anIntArray241[arg0]) {
			@Pc(54) int local54 = local24 - this.anIntArray239[arg0] & 0xFFFF;
			while (local54 > 0) {
				local54 -= 256;
				this.method2476(arg0, this.anIntArray240);
			}
			local34 = this.anIntArray239[arg0] - local24 & 0xFFFF;
		}
		return local34;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IB)V")
	@Override
	public void method2474(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray15[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray239[arg0] = 0;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
	@Override
	public void method2472(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) throws Exception {
		if (this.anInt2877 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt2876 = arg0 ? 4 : 2;
		this.anInt2875 = arg0 ? 2 : 1;
		this.anIntArray240 = new int[this.anInt2875 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(49) int local49 = 0; local49 < 2; local49++) {
			this.aDSBufferDescArray1[local49].flags = 16384;
		}
		this.anInt2877 = arg2;
		this.aWaveFormatEx1.channels = this.anInt2875;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.blockAlign = this.anInt2876;
		this.aWaveFormatEx1.avgBytesPerSec = arg2 * this.anInt2876;
	}
}
