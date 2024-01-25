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

@OriginalClass("client!ku")
public final class Class195 implements Interface24 {

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "[I")
	private int[] anIntArray321;

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
	private int anInt5992;

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
	private int anInt5993;

	@OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
	private int anInt5994;

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "[Z")
	private final boolean[] aBooleanArray20 = new boolean[2];

	@OriginalMember(owner = "client!ku", name = "h", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!ku", name = "i", descriptor = "[[B")
	private final byte[][] aByteArrayArray14 = new byte[2][];

	@OriginalMember(owner = "client!ku", name = "k", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!ku", name = "m", descriptor = "[I")
	private final int[] anIntArray323 = new int[2];

	@OriginalMember(owner = "client!ku", name = "l", descriptor = "[I")
	private final int[] anIntArray322 = new int[2];

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
	public Class195() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(55) int local55 = 0; local55 < 2; local55++) {
			this.aDSCursorsArray1[local55] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(IZ)V")
	@Override
	public void method5173(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(15) ComFailException local15) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)V")
	@Override
	public void method5168(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray20[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray322[arg0] = 0;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I[I)V")
	@Override
	public void method5171(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt5992 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray322[arg0] * this.anInt5994;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray14[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray14[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray14[arg0], 0);
		this.anIntArray322[arg0] = this.anIntArray322[arg0] + local2 / this.anInt5992 & 0xFFFF;
		if (!this.aBooleanArray20[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray20[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)V")
	@Override
	public void method5169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception {
		if (this.anInt5993 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(16) int local16 = this.anInt5994 * 65536;
		if (this.aByteArrayArray14[arg0] == null || this.aByteArrayArray14[arg0].length != local16) {
			this.aByteArrayArray14[arg0] = new byte[local16];
			this.aDSBufferDescArray1[arg0].bufferBytes = local16;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray20[arg0] = false;
		this.anIntArray322[arg0] = 0;
		this.anIntArray323[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZ)I")
	@Override
	public int method5172(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray20[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(30) int local30 = this.aDSCursorsArray1[arg0].write / this.anInt5994;
		@Pc(40) int local40 = this.anIntArray322[arg0] - local30 & 0xFFFF;
		if (this.anIntArray323[arg0] < local40) {
			for (@Pc(55) int local55 = local30 - this.anIntArray322[arg0] & 0xFFFF; local55 > 0; local55 -= 256) {
				this.method5171(arg0, this.anIntArray321);
			}
			local40 = this.anIntArray322[arg0] - local30 & 0xFFFF;
		}
		return local40;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
	@Override
	public void method5170(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception {
		if (this.anInt5993 != 0) {
			return;
		}
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt5994 = arg2 ? 4 : 2;
		this.anInt5992 = arg2 ? 2 : 1;
		this.anIntArray321 = new int[this.anInt5992 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(53) int local53 = 0; local53 < 2; local53++) {
			this.aDSBufferDescArray1[local53].flags = 16384;
		}
		this.aWaveFormatEx1.avgBytesPerSec = this.anInt5994 * arg0;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.samplesPerSec = arg0;
		this.aWaveFormatEx1.channels = this.anInt5992;
		this.aWaveFormatEx1.blockAlign = this.anInt5994;
		this.anInt5993 = arg0;
		this.aWaveFormatEx1.formatTag = 1;
	}
}
