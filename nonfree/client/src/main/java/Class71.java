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

@OriginalClass("client!dda")
public final class Class71 implements Interface26 {

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "[I")
	private int[] anIntArray84;

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
	private int anInt1380;

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
	private int anInt1381;

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
	private int anInt1382;

	@OriginalMember(owner = "client!dda", name = "m", descriptor = "[[B")
	private final byte[][] aByteArrayArray32 = new byte[2][];

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!dda", name = "j", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!dda", name = "k", descriptor = "[I")
	private final int[] anIntArray85 = new int[2];

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "[Z")
	private final boolean[] aBooleanArray7 = new boolean[2];

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "[I")
	private final int[] anIntArray86 = new int[2];

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!dda", name = "l", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "()V")
	private Class71() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(III)V")
	@Override
	public void method1352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception {
		if (this.anInt1382 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(19) int local19 = this.anInt1380 * 65536;
		if (this.aByteArrayArray32[arg0] == null || local19 != this.aByteArrayArray32[arg0].length) {
			this.aByteArrayArray32[arg0] = new byte[local19];
			this.aDSBufferDescArray1[arg0].bufferBytes = local19;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray7[arg0] = false;
		this.anIntArray85[arg0] = 0;
		this.anIntArray86[arg0] = arg1;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(BI)V")
	@Override
	public void method1349(@OriginalArg(1) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(12) ComFailException local12) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(II)I")
	@Override
	public int method1350(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray7[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(33) int local33 = this.aDSCursorsArray1[arg0].write / this.anInt1380;
		@Pc(43) int local43 = this.anIntArray85[arg0] - local33 & 0xFFFF;
		if (local43 > this.anIntArray86[arg0]) {
			for (@Pc(59) int local59 = local33 - this.anIntArray85[arg0] & 0xFFFF; local59 > 0; local59 -= 256) {
				this.method1353(arg0, this.anIntArray84);
			}
			local43 = this.anIntArray85[arg0] - local33 & 0xFFFF;
		}
		return local43;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(II)V")
	@Override
	public void method1351(@OriginalArg(1) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray7[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray85[arg0] = 0;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZZLjava/awt/Component;I)V")
	@Override
	public void method1354(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception {
		if (this.anInt1382 != 0) {
			return;
		}
		if (arg2 < 8000 || arg2 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt1381 = arg0 ? 2 : 1;
		this.anInt1380 = arg0 ? 4 : 2;
		this.anIntArray84 = new int[this.anInt1381 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(53) int local53 = 0; local53 < 2; local53++) {
			this.aDSBufferDescArray1[local53].flags = 16384;
		}
		this.anInt1382 = arg2;
		this.aWaveFormatEx1.blockAlign = this.anInt1380;
		this.aWaveFormatEx1.channels = this.anInt1381;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.aWaveFormatEx1.avgBytesPerSec = this.anInt1380 * arg2;
		this.aWaveFormatEx1.samplesPerSec = arg2;
		this.aWaveFormatEx1.formatTag = 1;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I[I)V")
	@Override
	public void method1353(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt1381 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(21) int local21 = this.anIntArray85[arg0] * this.anInt1380;
		for (@Pc(23) int local23 = 0; local23 < local2; local23++) {
			@Pc(28) int local28 = arg1[local23];
			if ((local28 + 8388608 & 0xFF000000) != 0) {
				local28 = local28 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray32[arg0][local21 + local23 * 2] = (byte) (local28 >> 8);
			this.aByteArrayArray32[arg0][local21 + local23 * 2 + 1] = (byte) (local28 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local21, local2 * 2, this.aByteArrayArray32[arg0], 0);
		this.anIntArray85[arg0] = this.anIntArray85[arg0] + local2 / this.anInt1381 & 0xFFFF;
		if (!this.aBooleanArray7[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray7[arg0] = true;
		}
	}
}
