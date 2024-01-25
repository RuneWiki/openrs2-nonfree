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

@OriginalClass("client!rg")
public final class Class322 implements Interface14 {

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "[I")
	private int[] anIntArray614;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
	private int anInt8635;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
	private int anInt8636;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
	private int anInt8637;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "[Z")
	private final boolean[] aBooleanArray34 = new boolean[2];

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "[I")
	private final int[] anIntArray612 = new int[2];

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "[I")
	private final int[] anIntArray613 = new int[2];

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "[[B")
	private final byte[][] aByteArrayArray18 = new byte[2][];

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	private Class322() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V")
	@Override
	public void method7649(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray34[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray613[arg0] = 0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)V")
	@Override
	public void method7646(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(17) ComFailException local17) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	@Override
	public void method7645(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) throws Exception {
		if (this.anInt8637 != 0) {
			return;
		}
		if (arg1 < 8000 || arg1 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt8635 = arg0 ? 4 : 2;
		this.anInt8636 = arg0 ? 2 : 1;
		this.anIntArray614 = new int[this.anInt8636 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg2, 2);
		for (@Pc(58) int local58 = 0; local58 < 2; local58++) {
			this.aDSBufferDescArray1[local58].flags = 16384;
		}
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.blockAlign = this.anInt8635;
		this.aWaveFormatEx1.avgBytesPerSec = this.anInt8635 * arg1;
		this.anInt8637 = arg1;
		this.aWaveFormatEx1.samplesPerSec = arg1;
		this.aWaveFormatEx1.channels = this.anInt8636;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)I")
	@Override
	public int method7648(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray34[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(25) int local25 = this.aDSCursorsArray1[arg0].write / this.anInt8635;
		@Pc(43) int local43 = this.anIntArray613[arg0] - local25 & 0xFFFF;
		if (this.anIntArray612[arg0] < local43) {
			for (@Pc(58) int local58 = local25 - this.anIntArray613[arg0] & 0xFFFF; local58 > 0; local58 -= 256) {
				this.method7647(arg0, this.anIntArray614);
			}
			local43 = this.anIntArray613[arg0] - local25 & 0xFFFF;
		}
		return local43;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
	@Override
	public void method7644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt8637 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(27) int local27 = this.anInt8635 * 65536;
		if (this.aByteArrayArray18[arg0] == null || this.aByteArrayArray18[arg0].length != local27) {
			this.aByteArrayArray18[arg0] = new byte[local27];
			this.aDSBufferDescArray1[arg0].bufferBytes = local27;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray34[arg0] = false;
		this.anIntArray613[arg0] = 0;
		this.anIntArray612[arg0] = arg1;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[I)V")
	@Override
	public void method7647(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt8636 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(21) int local21 = this.anIntArray613[arg0] * this.anInt8635;
		for (@Pc(23) int local23 = 0; local23 < local2; local23++) {
			@Pc(28) int local28 = arg1[local23];
			if ((local28 + 8388608 & 0xFF000000) != 0) {
				local28 = local28 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray18[arg0][local21 + local23 * 2] = (byte) (local28 >> 8);
			this.aByteArrayArray18[arg0][local21 + local23 * 2 + 1] = (byte) (local28 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local21, local2 * 2, this.aByteArrayArray18[arg0], 0);
		this.anIntArray613[arg0] = this.anIntArray613[arg0] + local2 / this.anInt8636 & 0xFFFF;
		if (!this.aBooleanArray34[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray34[arg0] = true;
		}
	}
}
