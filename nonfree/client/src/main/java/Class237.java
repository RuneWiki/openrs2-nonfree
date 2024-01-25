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

@OriginalClass("client!nea")
public final class Class237 implements Interface10 {

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "I")
	private int anInt6522;

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "[I")
	private int[] anIntArray413;

	@OriginalMember(owner = "client!nea", name = "e", descriptor = "I")
	private int anInt6523;

	@OriginalMember(owner = "client!nea", name = "l", descriptor = "I")
	private int anInt6524;

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "[I")
	private final int[] anIntArray412 = new int[2];

	@OriginalMember(owner = "client!nea", name = "h", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!nea", name = "f", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!nea", name = "i", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!nea", name = "k", descriptor = "[Z")
	private final boolean[] aBooleanArray22 = new boolean[2];

	@OriginalMember(owner = "client!nea", name = "d", descriptor = "[I")
	private final int[] anIntArray414 = new int[2];

	@OriginalMember(owner = "client!nea", name = "m", descriptor = "[[B")
	private final byte[][] aByteArrayArray17 = new byte[2][];

	@OriginalMember(owner = "client!nea", name = "g", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!nea", name = "j", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "()V")
	public Class237() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	@Override
	public void method5526(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception {
		if (this.anInt6523 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt6524 = arg0 ? 2 : 1;
		this.anInt6522 = arg0 ? 4 : 2;
		this.anIntArray413 = new int[this.anInt6524 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(58) int local58 = 0; local58 < 2; local58++) {
			this.aDSBufferDescArray1[local58].flags = 16384;
		}
		this.aWaveFormatEx1.channels = this.anInt6524;
		this.anInt6523 = arg2;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.blockAlign = this.anInt6522;
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.avgBytesPerSec = this.anInt6522 * arg2;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(II)V")
	@Override
	public void method5528(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(I[I)V")
	@Override
	public void method5529(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt6524 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray412[arg0] * this.anInt6522;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray17[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray17[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray17[arg0], 0);
		this.anIntArray412[arg0] = this.anIntArray412[arg0] + local2 / this.anInt6524 & 0xFFFF;
		if (!this.aBooleanArray22[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray22[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(III)V")
	@Override
	public void method5530(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt6523 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(23) int local23 = this.anInt6522 * 65536;
		if (this.aByteArrayArray17[arg0] == null || this.aByteArrayArray17[arg0].length != local23) {
			this.aByteArrayArray17[arg0] = new byte[local23];
			this.aDSBufferDescArray1[arg0].bufferBytes = local23;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray22[arg0] = false;
		this.anIntArray412[arg0] = 0;
		this.anIntArray414[arg0] = arg1;
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(II)V")
	@Override
	public void method5531(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray22[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray412[arg0] = 0;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BI)I")
	@Override
	public int method5527(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray22[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(30) int local30 = this.aDSCursorsArray1[arg0].write / this.anInt6522;
		@Pc(40) int local40 = this.anIntArray412[arg0] - local30 & 0xFFFF;
		if (this.anIntArray414[arg0] < local40) {
			for (@Pc(60) int local60 = local30 - this.anIntArray412[arg0] & 0xFFFF; local60 > 0; local60 -= 256) {
				this.method5529(arg0, this.anIntArray413);
			}
			local40 = this.anIntArray412[arg0] - local30 & 0xFFFF;
		}
		return local40;
	}
}
