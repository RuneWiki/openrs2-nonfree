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

@OriginalClass("client!hh")
public final class Class143 implements Interface17 {

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
	private int anInt3961;

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
	private int anInt3962;

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
	private int anInt3963;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "[I")
	private final int[] anIntArray195 = new int[2];

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "[I")
	private final int[] anIntArray197 = new int[2];

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "[[B")
	private final byte[][] aByteArrayArray10 = new byte[2][];

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "[Z")
	private final boolean[] aBooleanArray12 = new boolean[2];

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	public Class143() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(55) int local55 = 0; local55 < 2; local55++) {
			this.aDSCursorsArray1[local55] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLjava/awt/Component;ZI)V")
	@Override
	public void method3564(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) throws Exception {
		if (this.anInt3962 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt3963 = arg1 ? 2 : 1;
		this.anInt3961 = arg1 ? 4 : 2;
		this.anIntArray196 = new int[this.anInt3963 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg0, 2);
		for (@Pc(47) int local47 = 0; local47 < 2; local47++) {
			this.aDSBufferDescArray1[local47].flags = 16384;
		}
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.aWaveFormatEx1.blockAlign = this.anInt3961;
		this.aWaveFormatEx1.avgBytesPerSec = arg2 * this.anInt3961;
		this.aWaveFormatEx1.channels = this.anInt3963;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.anInt3962 = arg2;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[I)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt3963 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray195[arg0] * this.anInt3961;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray10[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray10[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray10[arg0], 0);
		this.anIntArray195[arg0] = this.anIntArray195[arg0] + local2 / this.anInt3963 & 0xFFFF;
		if (!this.aBooleanArray12[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray12[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method3563(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray12[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray195[arg0] = 0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZI)V")
	@Override
	public void method3566(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt3962 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(16) int local16 = this.anInt3961 * 65536;
		if (this.aByteArrayArray10[arg1] == null || local16 != this.aByteArrayArray10[arg1].length) {
			this.aByteArrayArray10[arg1] = new byte[local16];
			this.aDSBufferDescArray1[arg1].bufferBytes = local16;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray12[arg1] = false;
		this.anIntArray195[arg1] = 0;
		this.anIntArray197[arg1] = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)I")
	@Override
	public int method3567(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray12[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt3961;
		@Pc(39) int local39 = this.anIntArray195[arg0] - local24 & 0xFFFF;
		if (local39 > this.anIntArray197[arg0]) {
			for (@Pc(55) int local55 = local24 - this.anIntArray195[arg0] & 0xFFFF; local55 > 0; local55 -= 256) {
				this.method3565(arg0, this.anIntArray196);
			}
			local39 = this.anIntArray195[arg0] - local24 & 0xFFFF;
		}
		return local39;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
	@Override
	public void method3562(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(17) ComFailException local17) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}
}
