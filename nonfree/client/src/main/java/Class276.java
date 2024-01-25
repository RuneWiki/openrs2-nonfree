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

@OriginalClass("client!og")
public final class Class276 implements Interface7 {

	@OriginalMember(owner = "client!og", name = "k", descriptor = "I")
	private int anInt7303;

	@OriginalMember(owner = "client!og", name = "l", descriptor = "I")
	private int anInt7304;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "[I")
	private int[] anIntArray544;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "I")
	private int anInt7305;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "[I")
	private final int[] anIntArray543 = new int[2];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!og", name = "d", descriptor = "[[B")
	private final byte[][] aByteArrayArray12 = new byte[2][];

	@OriginalMember(owner = "client!og", name = "h", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!og", name = "m", descriptor = "[I")
	private final int[] anIntArray545 = new int[2];

	@OriginalMember(owner = "client!og", name = "j", descriptor = "[Z")
	private final boolean[] aBooleanArray18 = new boolean[2];

	@OriginalMember(owner = "client!og", name = "i", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!og", name = "g", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!og", name = "f", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	private Class276() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(55) int local55 = 0; local55 < 2; local55++) {
			this.aDSCursorsArray1[local55] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
	@Override
	public void method6312(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) throws Exception {
		if (this.anInt7305 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt7304 = arg1 ? 4 : 2;
		this.anInt7303 = arg1 ? 2 : 1;
		this.anIntArray544 = new int[this.anInt7303 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg0, 2);
		for (@Pc(65) int local65 = 0; local65 < 2; local65++) {
			this.aDSBufferDescArray1[local65].flags = 16384;
		}
		this.aWaveFormatEx1.channels = this.anInt7303;
		this.aWaveFormatEx1.blockAlign = this.anInt7304;
		this.aWaveFormatEx1.avgBytesPerSec = this.anInt7304 * arg2;
		this.anInt7305 = arg2;
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.bitsPerSample = 16;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6313(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt7305 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(19) int local19 = this.anInt7304 * 65536;
		if (this.aByteArrayArray12[arg1] == null || local19 != this.aByteArrayArray12[arg1].length) {
			this.aByteArrayArray12[arg1] = new byte[local19];
			this.aDSBufferDescArray1[arg1].bufferBytes = local19;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray18[arg1] = false;
		this.anIntArray545[arg1] = 0;
		this.anIntArray543[arg1] = arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)V")
	@Override
	public void method6308(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(12) ComFailException local12) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)V")
	@Override
	public void method6310(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray18[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray545[arg0] = 0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)I")
	@Override
	public int method6311(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray18[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(25) int local25 = this.aDSCursorsArray1[arg0].write / this.anInt7304;
		@Pc(35) int local35 = this.anIntArray545[arg0] - local25 & 0xFFFF;
		if (local35 > this.anIntArray543[arg0]) {
			@Pc(61) int local61 = local25 - this.anIntArray545[arg0] & 0xFFFF;
			while (local61 > 0) {
				local61 -= 256;
				this.method6309(arg0, this.anIntArray544);
			}
			local35 = this.anIntArray545[arg0] - local25 & 0xFFFF;
		}
		return local35;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I[I)V")
	@Override
	public void method6309(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt7303 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(21) int local21 = this.anIntArray545[arg0] * this.anInt7304;
		for (@Pc(23) int local23 = 0; local23 < local2; local23++) {
			@Pc(28) int local28 = arg1[local23];
			if ((local28 + 8388608 & 0xFF000000) != 0) {
				local28 = local28 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray12[arg0][local21 + local23 * 2] = (byte) (local28 >> 8);
			this.aByteArrayArray12[arg0][local21 + local23 * 2 + 1] = (byte) (local28 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local21, local2 * 2, this.aByteArrayArray12[arg0], 0);
		this.anIntArray545[arg0] = this.anIntArray545[arg0] + local2 / this.anInt7303 & 0xFFFF;
		if (!this.aBooleanArray18[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray18[arg0] = true;
		}
	}
}
