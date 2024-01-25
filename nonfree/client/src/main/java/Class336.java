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

@OriginalClass("client!vaa")
public final class Class336 implements Interface10 {

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "[I")
	private int[] anIntArray563;

	@OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
	private int anInt10014;

	@OriginalMember(owner = "client!vaa", name = "f", descriptor = "I")
	private int anInt10015;

	@OriginalMember(owner = "client!vaa", name = "g", descriptor = "I")
	private int anInt10016;

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!vaa", name = "j", descriptor = "[[B")
	private final byte[][] aByteArrayArray29 = new byte[2][];

	@OriginalMember(owner = "client!vaa", name = "k", descriptor = "[Z")
	private final boolean[] aBooleanArray27 = new boolean[2];

	@OriginalMember(owner = "client!vaa", name = "h", descriptor = "[I")
	private final int[] anIntArray564 = new int[2];

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!vaa", name = "l", descriptor = "[I")
	private final int[] anIntArray565 = new int[2];

	@OriginalMember(owner = "client!vaa", name = "m", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!vaa", name = "i", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "()V")
	public Class336() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(55) int local55 = 0; local55 < 2; local55++) {
			this.aDSCursorsArray1[local55] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I[I)V")
	@Override
	public void method7707(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt10015 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray564[arg0] * this.anInt10016;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray29[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray29[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray29[arg0], 0);
		this.anIntArray564[arg0] = this.anIntArray564[arg0] + local2 / this.anInt10015 & 0xFFFF;
		if (!this.aBooleanArray27[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray27[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BII)V")
	@Override
	public void method7709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt10014 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(16) int local16 = this.anInt10016 * 65536;
		if (this.aByteArrayArray29[arg0] == null || local16 != this.aByteArrayArray29[arg0].length) {
			this.aByteArrayArray29[arg0] = new byte[local16];
			this.aDSBufferDescArray1[arg0].bufferBytes = local16;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray27[arg0] = false;
		this.anIntArray564[arg0] = 0;
		this.anIntArray565[arg0] = arg1;
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(II)V")
	@Override
	public void method7708(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7706(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray27[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray564[arg0] = 0;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)I")
	@Override
	public int method7705(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray27[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(31) int local31 = this.aDSCursorsArray1[arg0].write / this.anInt10016;
		@Pc(40) int local40 = this.anIntArray564[arg0] - local31 & 0xFFFF;
		if (this.anIntArray565[arg0] < local40) {
			@Pc(56) int local56 = local31 - this.anIntArray564[arg0] & 0xFFFF;
			while (local56 > 0) {
				local56 -= 256;
				this.method7707(arg0, this.anIntArray563);
			}
			local40 = this.anIntArray564[arg0] - local31 & 0xFFFF;
		}
		return local40;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
	@Override
	public void method7704(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) throws Exception {
		if (this.anInt10014 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt10015 = arg1 ? 2 : 1;
		this.anInt10016 = arg1 ? 4 : 2;
		this.anIntArray563 = new int[this.anInt10015 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg0, 2);
		for (@Pc(55) int local55 = 0; local55 < 2; local55++) {
			this.aDSBufferDescArray1[local55].flags = 16384;
		}
		this.anInt10014 = arg2;
		this.aWaveFormatEx1.blockAlign = this.anInt10016;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.aWaveFormatEx1.channels = this.anInt10015;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.avgBytesPerSec = this.anInt10016 * arg2;
	}
}
