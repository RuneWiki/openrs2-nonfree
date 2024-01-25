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

@OriginalClass("client!pja")
public final class Class284 implements Interface7 {

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "I")
	private int anInt8276;

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "I")
	private int anInt8277;

	@OriginalMember(owner = "client!pja", name = "g", descriptor = "[I")
	private int[] anIntArray415;

	@OriginalMember(owner = "client!pja", name = "j", descriptor = "I")
	private int anInt8278;

	@OriginalMember(owner = "client!pja", name = "c", descriptor = "[[B")
	private final byte[][] aByteArrayArray17 = new byte[2][];

	@OriginalMember(owner = "client!pja", name = "f", descriptor = "[I")
	private final int[] anIntArray414 = new int[2];

	@OriginalMember(owner = "client!pja", name = "k", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!pja", name = "d", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!pja", name = "l", descriptor = "[Z")
	private final boolean[] aBooleanArray48 = new boolean[2];

	@OriginalMember(owner = "client!pja", name = "h", descriptor = "[I")
	private final int[] anIntArray416 = new int[2];

	@OriginalMember(owner = "client!pja", name = "m", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!pja", name = "e", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!pja", name = "i", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!pja", name = "<init>", descriptor = "()V")
	public Class284() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(III)V")
	@Override
	public void method7400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt8278 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(19) int local19 = this.anInt8276 * 65536;
		if (this.aByteArrayArray17[arg1] == null || local19 != this.aByteArrayArray17[arg1].length) {
			this.aByteArrayArray17[arg1] = new byte[local19];
			this.aDSBufferDescArray1[arg1].bufferBytes = local19;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray48[arg1] = false;
		this.anIntArray416[arg1] = 0;
		this.anIntArray414[arg1] = arg0;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(I[I)V")
	@Override
	public void method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt8277 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray416[arg0] * this.anInt8276;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray17[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray17[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray17[arg0], 0);
		this.anIntArray416[arg0] = this.anIntArray416[arg0] + local2 / this.anInt8277 & 0xFFFF;
		if (!this.aBooleanArray48[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray48[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(IB)I")
	@Override
	public int method7399(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray48[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(30) int local30 = this.aDSCursorsArray1[arg0].write / this.anInt8276;
		@Pc(40) int local40 = this.anIntArray416[arg0] - local30 & 0xFFFF;
		if (local40 > this.anIntArray414[arg0]) {
			for (@Pc(59) int local59 = local30 - this.anIntArray416[arg0] & 0xFFFF; local59 > 0; local59 -= 256) {
				this.method7402(arg0, this.anIntArray415);
			}
			local40 = this.anIntArray416[arg0] - local30 & 0xFFFF;
		}
		return local40;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(II)V")
	@Override
	public void method7398(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray48[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray416[arg0] = 0;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
	@Override
	public void method7401(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) throws Exception {
		if (this.anInt8278 != 0) {
			return;
		}
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt8277 = arg2 ? 2 : 1;
		this.anInt8276 = arg2 ? 4 : 2;
		this.anIntArray415 = new int[this.anInt8277 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(58) int local58 = 0; local58 < 2; local58++) {
			this.aDSBufferDescArray1[local58].flags = 16384;
		}
		this.aWaveFormatEx1.channels = this.anInt8277;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.blockAlign = this.anInt8276;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.anInt8278 = arg0;
		this.aWaveFormatEx1.samplesPerSec = arg0;
		this.aWaveFormatEx1.avgBytesPerSec = this.anInt8276 * arg0;
	}

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "(II)V")
	@Override
	public void method7403(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}
}
