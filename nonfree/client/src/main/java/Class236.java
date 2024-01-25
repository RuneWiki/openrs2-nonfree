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

@OriginalClass("client!ow")
public final class Class236 implements Interface21 {

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
	private int anInt6452;

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
	private int anInt6453;

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "[I")
	private int[] anIntArray545;

	@OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
	private int anInt6454;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "[[B")
	private final byte[][] aByteArrayArray21 = new byte[2][];

	@OriginalMember(owner = "client!ow", name = "f", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!ow", name = "h", descriptor = "[Z")
	private final boolean[] aBooleanArray36 = new boolean[2];

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!ow", name = "j", descriptor = "[I")
	private final int[] anIntArray546 = new int[2];

	@OriginalMember(owner = "client!ow", name = "l", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!ow", name = "m", descriptor = "[I")
	private final int[] anIntArray547 = new int[2];

	@OriginalMember(owner = "client!ow", name = "i", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!ow", name = "g", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "()V")
	public Class236() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(II)V")
	@Override
	public void method5490(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray36[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray547[arg0] = 0;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IB)I")
	@Override
	public int method5492(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray36[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(24) int local24 = this.aDSCursorsArray1[arg0].write / this.anInt6453;
		@Pc(40) int local40 = this.anIntArray547[arg0] - local24 & 0xFFFF;
		if (local40 > this.anIntArray546[arg0]) {
			@Pc(56) int local56 = local24 - this.anIntArray547[arg0] & 0xFFFF;
			while (local56 > 0) {
				local56 -= 256;
				this.method5488(arg0, this.anIntArray545);
			}
			local40 = this.anIntArray547[arg0] - local24 & 0xFFFF;
		}
		return local40;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I[I)V")
	@Override
	public void method5488(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt6452 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray547[arg0] * this.anInt6453;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray21[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray21[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray21[arg0], 0);
		this.anIntArray547[arg0] = this.anIntArray547[arg0] + local2 / this.anInt6452 & 0xFFFF;
		if (!this.aBooleanArray36[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray36[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(III)V")
	@Override
	public void method5487(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt6454 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(19) int local19 = this.anInt6453 * 65536;
		if (this.aByteArrayArray21[arg0] == null || this.aByteArrayArray21[arg0].length != local19) {
			this.aByteArrayArray21[arg0] = new byte[local19];
			this.aDSBufferDescArray1[arg0].bufferBytes = local19;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray36[arg0] = false;
		this.anIntArray547[arg0] = 0;
		this.anIntArray546[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)V")
	@Override
	public void method5489(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(16) ComFailException local16) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	@Override
	public void method5491(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception {
		if (this.anInt6454 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt6453 = arg0 ? 4 : 2;
		this.anInt6452 = arg0 ? 2 : 1;
		this.anIntArray545 = new int[this.anInt6452 * 256];
		this.aDirectSound1.initialize(null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(50) int local50 = 0; local50 < 2; local50++) {
			this.aDSBufferDescArray1[local50].flags = 16384;
		}
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.aWaveFormatEx1.blockAlign = this.anInt6453;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.anInt6454 = arg2;
		this.aWaveFormatEx1.channels = this.anInt6452;
		this.aWaveFormatEx1.avgBytesPerSec = arg2 * this.anInt6453;
	}
}
