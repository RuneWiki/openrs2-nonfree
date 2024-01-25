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

@OriginalClass("client!wr")
public final class Class360 implements Interface22 {

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
	private int anInt9604;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
	private int anInt9605;

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
	private int anInt9606;

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "[I")
	private int[] anIntArray721;

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "[[B")
	private final byte[][] aByteArrayArray33 = new byte[2][];

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "[Z")
	private final boolean[] aBooleanArray43 = new boolean[2];

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "[I")
	private final int[] anIntArray720 = new int[2];

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "[I")
	private final int[] anIntArray719 = new int[2];

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V")
	public Class360() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)V")
	@Override
	public void method7827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception {
		if (this.anInt9605 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(23) int local23 = this.anInt9606 * 65536;
		if (this.aByteArrayArray33[arg0] == null || this.aByteArrayArray33[arg0].length != local23) {
			this.aByteArrayArray33[arg0] = new byte[local23];
			this.aDSBufferDescArray1[arg0].bufferBytes = local23;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray43[arg0] = false;
		this.anIntArray720[arg0] = 0;
		this.anIntArray719[arg0] = arg1;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BILjava/awt/Component;Z)V")
	@Override
	public void method7826(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception {
		if (this.anInt9605 != 0) {
			return;
		}
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt9606 = arg2 ? 4 : 2;
		this.anInt9604 = arg2 ? 2 : 1;
		this.anIntArray721 = new int[this.anInt9604 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(50) int local50 = 0; local50 < 2; local50++) {
			this.aDSBufferDescArray1[local50].flags = 16384;
		}
		this.aWaveFormatEx1.avgBytesPerSec = this.anInt9606 * arg0;
		this.aWaveFormatEx1.channels = this.anInt9604;
		this.anInt9605 = arg0;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.samplesPerSec = arg0;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.blockAlign = this.anInt9606;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(II)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(17) ComFailException local17) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[I)V")
	@Override
	public void method7829(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt9604 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray720[arg0] * this.anInt9606;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray33[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray33[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray33[arg0], 0);
		this.anIntArray720[arg0] = this.anIntArray720[arg0] + local2 / this.anInt9604 & 0xFFFF;
		if (!this.aBooleanArray43[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray43[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)I")
	@Override
	public int method7830(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray43[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(30) int local30 = this.aDSCursorsArray1[arg0].write / this.anInt9606;
		@Pc(40) int local40 = this.anIntArray720[arg0] - local30 & 0xFFFF;
		if (local40 > this.anIntArray719[arg0]) {
			@Pc(59) int local59 = local30 - this.anIntArray720[arg0] & 0xFFFF;
			while (local59 > 0) {
				local59 -= 256;
				this.method7829(arg0, this.anIntArray721);
			}
			local40 = this.anIntArray720[arg0] - local30 & 0xFFFF;
		}
		return local40;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)V")
	@Override
	public void method7828(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray43[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray720[arg0] = 0;
	}
}
