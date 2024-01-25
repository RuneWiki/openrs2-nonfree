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

@OriginalClass("client!rfa")
public final class Class287 implements Interface8 {

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "I")
	private int anInt8603;

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "I")
	private int anInt8604;

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "[I")
	private int[] anIntArray539;

	@OriginalMember(owner = "client!rfa", name = "l", descriptor = "I")
	private int anInt8605;

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "[Z")
	private final boolean[] aBooleanArray21 = new boolean[2];

	@OriginalMember(owner = "client!rfa", name = "h", descriptor = "[I")
	private final int[] anIntArray540 = new int[2];

	@OriginalMember(owner = "client!rfa", name = "f", descriptor = "[[B")
	private final byte[][] aByteArrayArray20 = new byte[2][];

	@OriginalMember(owner = "client!rfa", name = "m", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!rfa", name = "i", descriptor = "[I")
	private final int[] anIntArray541 = new int[2];

	@OriginalMember(owner = "client!rfa", name = "k", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!rfa", name = "j", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "()V")
	public Class287() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[I)V")
	@Override
	public void method7102(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt8604 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray540[arg0] * this.anInt8603;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray20[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray20[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray20[arg0], 0);
		this.anIntArray540[arg0] = this.anIntArray540[arg0] + local2 / this.anInt8604 & 0xFFFF;
		if (!this.aBooleanArray21[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray21[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BI)V")
	@Override
	public void method7104(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray21[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray540[arg0] = 0;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	@Override
	public void method7101(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) throws Exception {
		if (this.anInt8605 != 0) {
			return;
		}
		if (arg1 < 8000 || arg1 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt8604 = arg0 ? 2 : 1;
		this.anInt8603 = arg0 ? 4 : 2;
		this.anIntArray539 = new int[this.anInt8604 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg2, 2);
		for (@Pc(50) int local50 = 0; local50 < 2; local50++) {
			this.aDSBufferDescArray1[local50].flags = 16384;
		}
		this.aWaveFormatEx1.avgBytesPerSec = this.anInt8603 * arg1;
		this.aWaveFormatEx1.blockAlign = this.anInt8603;
		this.aWaveFormatEx1.channels = this.anInt8604;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.samplesPerSec = arg1;
		this.anInt8605 = arg1;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)V")
	@Override
	public void method7100(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(II)I")
	@Override
	public int method7105(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray21[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(32) int local32 = this.aDSCursorsArray1[arg0].write / this.anInt8603;
		@Pc(42) int local42 = this.anIntArray540[arg0] - local32 & 0xFFFF;
		if (this.anIntArray541[arg0] < local42) {
			for (@Pc(61) int local61 = local32 - this.anIntArray540[arg0] & 0xFFFF; local61 > 0; local61 -= 256) {
				this.method7102(arg0, this.anIntArray539);
			}
			local42 = this.anIntArray540[arg0] - local32 & 0xFFFF;
		}
		return local42;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(III)V")
	@Override
	public void method7103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt8605 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(19) int local19 = this.anInt8603 * 65536;
		if (this.aByteArrayArray20[arg0] == null || local19 != this.aByteArrayArray20[arg0].length) {
			this.aByteArrayArray20[arg0] = new byte[local19];
			this.aDSBufferDescArray1[arg0].bufferBytes = local19;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray21[arg0] = false;
		this.anIntArray540[arg0] = 0;
		this.anIntArray541[arg0] = arg1;
	}
}
