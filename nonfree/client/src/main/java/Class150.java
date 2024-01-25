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

@OriginalClass("client!hfa")
public final class Class150 implements Interface21 {

	@OriginalMember(owner = "client!hfa", name = "k", descriptor = "I")
	private int anInt4274;

	@OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
	private int anInt4275;

	@OriginalMember(owner = "client!hfa", name = "i", descriptor = "I")
	private int anInt4276;

	@OriginalMember(owner = "client!hfa", name = "g", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!hfa", name = "l", descriptor = "[I")
	private final int[] anIntArray218 = new int[2];

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "[Z")
	private final boolean[] aBooleanArray12 = new boolean[2];

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!hfa", name = "e", descriptor = "[I")
	private final int[] anIntArray219 = new int[2];

	@OriginalMember(owner = "client!hfa", name = "d", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!hfa", name = "j", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!hfa", name = "h", descriptor = "[[B")
	private final byte[][] aByteArrayArray6 = new byte[2][];

	@OriginalMember(owner = "client!hfa", name = "m", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "()V")
	private Class150() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(55) int local55 = 0; local55 < 2; local55++) {
			this.aDSCursorsArray1[local55] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(III)V")
	@Override
	public void method3780(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt4275 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(19) int local19 = this.anInt4274 * 65536;
		if (this.aByteArrayArray6[arg1] == null || local19 != this.aByteArrayArray6[arg1].length) {
			this.aByteArrayArray6[arg1] = new byte[local19];
			this.aDSBufferDescArray1[arg1].bufferBytes = local19;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray12[arg1] = false;
		this.anIntArray218[arg1] = 0;
		this.anIntArray219[arg1] = arg0;
	}

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "(II)V")
	@Override
	public void method3782(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray12[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray218[arg0] = 0;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I[I)V")
	@Override
	public void method3783(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt4276 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(21) int local21 = this.anIntArray218[arg0] * this.anInt4274;
		for (@Pc(23) int local23 = 0; local23 < local2; local23++) {
			@Pc(28) int local28 = arg1[local23];
			if ((local28 + 8388608 & 0xFF000000) != 0) {
				local28 = local28 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray6[arg0][local21 + local23 * 2] = (byte) (local28 >> 8);
			this.aByteArrayArray6[arg0][local21 + local23 * 2 + 1] = (byte) (local28 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local21, local2 * 2, this.aByteArrayArray6[arg0], 0);
		this.anIntArray218[arg0] = this.anIntArray218[arg0] + local2 / this.anInt4276 & 0xFFFF;
		if (!this.aBooleanArray12[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray12[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BZLjava/awt/Component;I)V")
	@Override
	public void method3781(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception {
		if (this.anInt4275 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt4274 = arg0 ? 4 : 2;
		this.anInt4276 = arg0 ? 2 : 1;
		this.anIntArray220 = new int[this.anInt4276 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(58) int local58 = 0; local58 < 2; local58++) {
			this.aDSBufferDescArray1[local58].flags = 16384;
		}
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.anInt4275 = arg2;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.avgBytesPerSec = arg2 * this.anInt4274;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.channels = this.anInt4276;
		this.aWaveFormatEx1.blockAlign = this.anInt4274;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II)V")
	@Override
	public void method3778(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(17) ComFailException local17) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IB)I")
	@Override
	public int method3779(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray12[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(34) int local34 = this.aDSCursorsArray1[arg0].write / this.anInt4274;
		@Pc(44) int local44 = this.anIntArray218[arg0] - local34 & 0xFFFF;
		if (local44 > this.anIntArray219[arg0]) {
			@Pc(60) int local60 = local34 - this.anIntArray218[arg0] & 0xFFFF;
			while (local60 > 0) {
				local60 -= 256;
				this.method3783(arg0, this.anIntArray220);
			}
			local44 = this.anIntArray218[arg0] - local34 & 0xFFFF;
		}
		return local44;
	}
}
