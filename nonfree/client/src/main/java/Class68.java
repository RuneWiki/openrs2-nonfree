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

@OriginalClass("client!cu")
public final class Class68 implements Interface9 {

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
	private int anInt1907;

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "[I")
	private int[] anIntArray112;

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
	private int anInt1908;

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
	private int anInt1909;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "[I")
	private final int[] anIntArray113 = new int[2];

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "[I")
	private final int[] anIntArray114 = new int[2];

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "[Z")
	private final boolean[] aBooleanArray8 = new boolean[2];

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "[[B")
	private final byte[][] aByteArrayArray6 = new byte[2][];

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "()V")
	public Class68() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(55) int local55 = 0; local55 < 2; local55++) {
			this.aDSCursorsArray1[local55] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZI)V")
	@Override
	public void method1581(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I[I)V")
	@Override
	public void method1579(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt1907 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray114[arg0] * this.anInt1908;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray6[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray6[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray6[arg0], 0);
		this.anIntArray114[arg0] = this.anIntArray114[arg0] + local2 / this.anInt1907 & 0xFFFF;
		if (!this.aBooleanArray8[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray8[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BIZLjava/awt/Component;)V")
	@Override
	public void method1580(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Component arg2) throws Exception {
		if (this.anInt1909 != 0) {
			return;
		}
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt1908 = arg1 ? 4 : 2;
		this.anInt1907 = arg1 ? 2 : 1;
		this.anIntArray112 = new int[this.anInt1907 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg2, 2);
		for (@Pc(55) int local55 = 0; local55 < 2; local55++) {
			this.aDSBufferDescArray1[local55].flags = 16384;
		}
		this.aWaveFormatEx1.avgBytesPerSec = arg0 * this.anInt1908;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.channels = this.anInt1907;
		this.aWaveFormatEx1.samplesPerSec = arg0;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.blockAlign = this.anInt1908;
		this.anInt1909 = arg0;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)V")
	@Override
	public void method1582(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt1909 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(19) int local19 = this.anInt1908 * 65536;
		if (this.aByteArrayArray6[arg1] == null || local19 != this.aByteArrayArray6[arg1].length) {
			this.aByteArrayArray6[arg1] = new byte[local19];
			this.aDSBufferDescArray1[arg1].bufferBytes = local19;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray8[arg1] = false;
		this.anIntArray114[arg1] = 0;
		this.anIntArray113[arg1] = arg0;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BI)I")
	@Override
	public int method1583(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray8[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(32) int local32 = this.aDSCursorsArray1[arg0].write / this.anInt1908;
		@Pc(42) int local42 = this.anIntArray114[arg0] - local32 & 0xFFFF;
		if (local42 > this.anIntArray113[arg0]) {
			@Pc(58) int local58 = local32 - this.anIntArray114[arg0] & 0xFFFF;
			while (local58 > 0) {
				local58 -= 256;
				this.method1579(arg0, this.anIntArray112);
			}
			local42 = this.anIntArray114[arg0] - local32 & 0xFFFF;
		}
		return local42;
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(ZI)V")
	@Override
	public void method1584(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray8[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray114[arg0] = 0;
	}
}
