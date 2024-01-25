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

@OriginalClass("client!uba")
public final class Class346 implements Interface13 {

	@OriginalMember(owner = "client!uba", name = "f", descriptor = "I")
	private int anInt9675;

	@OriginalMember(owner = "client!uba", name = "i", descriptor = "I")
	private int anInt9676;

	@OriginalMember(owner = "client!uba", name = "j", descriptor = "I")
	private int anInt9677;

	@OriginalMember(owner = "client!uba", name = "m", descriptor = "[I")
	private int[] anIntArray536;

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "[[B")
	private final byte[][] aByteArrayArray30 = new byte[2][];

	@OriginalMember(owner = "client!uba", name = "h", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!uba", name = "e", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "[Z")
	private final boolean[] aBooleanArray37 = new boolean[2];

	@OriginalMember(owner = "client!uba", name = "k", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!uba", name = "l", descriptor = "[I")
	private final int[] anIntArray535 = new int[2];

	@OriginalMember(owner = "client!uba", name = "g", descriptor = "[I")
	private final int[] anIntArray534 = new int[2];

	@OriginalMember(owner = "client!uba", name = "d", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "()V")
	public Class346() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(55) int local55 = 0; local55 < 2; local55++) {
			this.aDSCursorsArray1[local55] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception {
		if (this.anInt9676 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(16) int local16 = this.anInt9677 * 65536;
		if (this.aByteArrayArray30[arg0] == null || this.aByteArrayArray30[arg0].length != local16) {
			this.aByteArrayArray30[arg0] = new byte[local16];
			this.aDSBufferDescArray1[arg0].bufferBytes = local16;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray37[arg0] = false;
		this.anIntArray534[arg0] = 0;
		this.anIntArray535[arg0] = arg1;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(I[I)V")
	@Override
	public void method8088(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt9675 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = this.anIntArray534[arg0] * this.anInt9677;
		for (@Pc(22) int local22 = 0; local22 < local2; local22++) {
			@Pc(27) int local27 = arg1[local22];
			if ((local27 + 8388608 & 0xFF000000) != 0) {
				local27 = local27 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray30[arg0][local20 + local22 * 2] = (byte) (local27 >> 8);
			this.aByteArrayArray30[arg0][local20 + local22 * 2 + 1] = (byte) (local27 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local20, local2 * 2, this.aByteArrayArray30[arg0], 0);
		this.anIntArray534[arg0] = this.anIntArray534[arg0] + local2 / this.anInt9675 & 0xFFFF;
		if (!this.aBooleanArray37[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray37[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(II)V")
	@Override
	public void method8087(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray37[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray534[arg0] = 0;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)I")
	@Override
	public int method8086(@OriginalArg(1) int arg0) {
		if (!this.aBooleanArray37[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(32) int local32 = this.aDSCursorsArray1[arg0].write / this.anInt9677;
		@Pc(42) int local42 = this.anIntArray534[arg0] - local32 & 0xFFFF;
		if (local42 > this.anIntArray535[arg0]) {
			for (@Pc(57) int local57 = local32 - this.anIntArray534[arg0] & 0xFFFF; local57 > 0; local57 -= 256) {
				this.method8088(arg0, this.anIntArray536);
			}
			local42 = this.anIntArray534[arg0] - local32 & 0xFFFF;
		}
		return local42;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IB)V")
	@Override
	public void method8090(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(11) ComFailException local11) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	@Override
	public void method8089(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception {
		if (this.anInt9676 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt9677 = arg0 ? 4 : 2;
		this.anInt9675 = arg0 ? 2 : 1;
		this.anIntArray536 = new int[this.anInt9675 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(48) int local48 = 0; local48 < 2; local48++) {
			this.aDSBufferDescArray1[local48].flags = 16384;
		}
		this.aWaveFormatEx1.blockAlign = this.anInt9677;
		this.aWaveFormatEx1.avgBytesPerSec = arg2 * this.anInt9677;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.aWaveFormatEx1.channels = this.anInt9675;
		this.anInt9676 = arg2;
	}
}
