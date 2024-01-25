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

@OriginalClass("client!mq")
public final class Class214 implements Interface23 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
	private int anInt5647;

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "[I")
	private int[] anIntArray315;

	@OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
	private int anInt5648;

	@OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
	private int anInt5649;

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "[I")
	private final int[] anIntArray316 = new int[2];

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!mq", name = "i", descriptor = "[I")
	private final int[] anIntArray317 = new int[2];

	@OriginalMember(owner = "client!mq", name = "k", descriptor = "[[B")
	private final byte[][] aByteArrayArray17 = new byte[2][];

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "[Z")
	private final boolean[] aBooleanArray19 = new boolean[2];

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
	public Class214() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(55) int local55 = 0; local55 < 2; local55++) {
			this.aDSCursorsArray1[local55] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BI)V")
	@Override
	public void method4817(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray19[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray316[arg0] = 0;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)I")
	@Override
	public int method4813(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray19[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(29) int local29 = this.aDSCursorsArray1[arg0].write / this.anInt5649;
		@Pc(39) int local39 = this.anIntArray316[arg0] - local29 & 0xFFFF;
		if (this.anIntArray317[arg0] < local39) {
			@Pc(59) int local59 = local29 - this.anIntArray316[arg0] & 0xFFFF;
			while (local59 > 0) {
				local59 -= 256;
				this.method4815(arg0, this.anIntArray315);
			}
			local39 = this.anIntArray316[arg0] - local29 & 0xFFFF;
		}
		return local39;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)V")
	@Override
	public void method4816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt5648 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(19) int local19 = this.anInt5649 * 65536;
		if (this.aByteArrayArray17[arg1] == null || this.aByteArrayArray17[arg1].length != local19) {
			this.aByteArrayArray17[arg1] = new byte[local19];
			this.aDSBufferDescArray1[arg1].bufferBytes = local19;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray19[arg1] = false;
		this.anIntArray316[arg1] = 0;
		this.anIntArray317[arg1] = arg0;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)V")
	@Override
	public void method4818(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I[I)V")
	@Override
	public void method4815(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt5647 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray316[arg0] * this.anInt5649;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray17[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray17[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray17[arg0], 0);
		this.anIntArray316[arg0] = this.anIntArray316[arg0] + local2 / this.anInt5647 & 0xFFFF;
		if (!this.aBooleanArray19[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray19[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
	@Override
	public void method4814(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) throws Exception {
		if (this.anInt5648 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt5647 = arg1 ? 2 : 1;
		this.anInt5649 = arg1 ? 4 : 2;
		this.anIntArray315 = new int[this.anInt5647 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg0, 2);
		for (@Pc(52) int local52 = 0; local52 < 2; local52++) {
			this.aDSBufferDescArray1[local52].flags = 16384;
		}
		this.anInt5648 = arg2;
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.aWaveFormatEx1.blockAlign = this.anInt5649;
		this.aWaveFormatEx1.avgBytesPerSec = arg2 * this.anInt5649;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.channels = this.anInt5647;
	}
}
