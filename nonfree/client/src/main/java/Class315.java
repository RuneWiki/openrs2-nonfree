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

@OriginalClass("client!so")
public final class Class315 implements Interface1 {

	@OriginalMember(owner = "client!so", name = "b", descriptor = "I")
	private int anInt7811;

	@OriginalMember(owner = "client!so", name = "c", descriptor = "[I")
	private int[] anIntArray522;

	@OriginalMember(owner = "client!so", name = "k", descriptor = "I")
	private int anInt7812;

	@OriginalMember(owner = "client!so", name = "l", descriptor = "I")
	private int anInt7813;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!so", name = "e", descriptor = "[I")
	private final int[] anIntArray523 = new int[2];

	@OriginalMember(owner = "client!so", name = "d", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!so", name = "h", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!so", name = "j", descriptor = "[I")
	private final int[] anIntArray524 = new int[2];

	@OriginalMember(owner = "client!so", name = "f", descriptor = "[[B")
	private final byte[][] aByteArrayArray20 = new byte[2][];

	@OriginalMember(owner = "client!so", name = "g", descriptor = "[Z")
	private final boolean[] aBooleanArray28 = new boolean[2];

	@OriginalMember(owner = "client!so", name = "m", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!so", name = "i", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	public Class315() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(II)V")
	@Override
	public void method6309(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray28[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray524[arg0] = 0;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BI)V")
	@Override
	public void method6307(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(15) ComFailException local15) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	@Override
	public void method6310(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) throws Exception {
		if (this.anInt7813 != 0) {
			return;
		}
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt7812 = arg1 ? 4 : 2;
		this.anInt7811 = arg1 ? 2 : 1;
		this.anIntArray522 = new int[this.anInt7811 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg2, 2);
		for (@Pc(49) int local49 = 0; local49 < 2; local49++) {
			this.aDSBufferDescArray1[local49].flags = 16384;
		}
		this.aWaveFormatEx1.channels = this.anInt7811;
		this.aWaveFormatEx1.samplesPerSec = arg0;
		this.aWaveFormatEx1.blockAlign = this.anInt7812;
		this.aWaveFormatEx1.avgBytesPerSec = this.anInt7812 * arg0;
		this.anInt7813 = arg0;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.bitsPerSample = 16;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)I")
	@Override
	public int method6305(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray28[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt7812;
		@Pc(33) int local33 = this.anIntArray524[arg0] - local24 & 0xFFFF;
		if (this.anIntArray523[arg0] < local33) {
			for (@Pc(57) int local57 = local24 - this.anIntArray524[arg0] & 0xFFFF; local57 > 0; local57 -= 256) {
				this.method6306(arg0, this.anIntArray522);
			}
			local33 = this.anIntArray524[arg0] - local24 & 0xFFFF;
		}
		return local33;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(III)V")
	@Override
	public void method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception {
		if (this.anInt7813 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(22) int local22 = this.anInt7812 * 65536;
		if (this.aByteArrayArray20[arg0] == null || this.aByteArrayArray20[arg0].length != local22) {
			this.aByteArrayArray20[arg0] = new byte[local22];
			this.aDSBufferDescArray1[arg0].bufferBytes = local22;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray28[arg0] = false;
		this.anIntArray524[arg0] = 0;
		this.anIntArray523[arg0] = arg1;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I[I)V")
	@Override
	public void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt7811 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray524[arg0] * this.anInt7812;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray20[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray20[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray20[arg0], 0);
		this.anIntArray524[arg0] = this.anIntArray524[arg0] + local2 / this.anInt7811 & 0xFFFF;
		if (!this.aBooleanArray28[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray28[arg0] = true;
		}
	}
}
