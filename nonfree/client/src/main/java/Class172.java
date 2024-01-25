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

@OriginalClass("client!kl")
public final class Class172 implements Interface13 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
	private int anInt6105;

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
	private int anInt6106;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "[I")
	private int[] anIntArray282;

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
	private int anInt6107;

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "[I")
	private final int[] anIntArray281 = new int[2];

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "[Z")
	private final boolean[] aBooleanArray11 = new boolean[2];

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "[[B")
	private final byte[][] aByteArrayArray18 = new byte[2][];

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "[I")
	private final int[] anIntArray280 = new int[2];

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	public Class172() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5099(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt6106 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(19) int local19 = this.anInt6107 * 65536;
		if (this.aByteArrayArray18[arg1] == null || local19 != this.aByteArrayArray18[arg1].length) {
			this.aByteArrayArray18[arg1] = new byte[local19];
			this.aDSBufferDescArray1[arg1].bufferBytes = local19;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray11[arg1] = false;
		this.anIntArray280[arg1] = 0;
		this.anIntArray281[arg1] = arg0;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V")
	@Override
	public void method5098(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(19) ComFailException local19) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)I")
	@Override
	public int method5101(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray11[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt6107;
		@Pc(41) int local41 = this.anIntArray280[arg0] - local24 & 0xFFFF;
		if (this.anIntArray281[arg0] < local41) {
			for (@Pc(57) int local57 = local24 - this.anIntArray280[arg0] & 0xFFFF; local57 > 0; local57 -= 256) {
				this.method5100(arg0, this.anIntArray282);
			}
			local41 = this.anIntArray280[arg0] - local24 & 0xFFFF;
		}
		return local41;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[I)V")
	@Override
	public void method5100(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt6105 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray280[arg0] * this.anInt6107;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray18[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray18[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray18[arg0], 0);
		this.anIntArray280[arg0] = this.anIntArray280[arg0] + local2 / this.anInt6105 & 0xFFFF;
		if (!this.aBooleanArray11[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray11[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	@Override
	public void method5096(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception {
		if (this.anInt6106 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt6107 = arg0 ? 4 : 2;
		this.anInt6105 = arg0 ? 2 : 1;
		this.anIntArray282 = new int[this.anInt6105 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(45) int local45 = 0; local45 < 2; local45++) {
			this.aDSBufferDescArray1[local45].flags = 16384;
		}
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.channels = this.anInt6105;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.avgBytesPerSec = arg2 * this.anInt6107;
		this.aWaveFormatEx1.blockAlign = this.anInt6107;
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.anInt6106 = arg2;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)V")
	@Override
	public void method5097(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray11[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray280[arg0] = 0;
	}
}
