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

@OriginalClass("client!dg")
public final class Class79 implements Interface4 {

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
	private int anInt1569;

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
	private int anInt1570;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
	private int anInt1571;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "[Z")
	private final boolean[] aBooleanArray3 = new boolean[2];

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "[I")
	private final int[] anIntArray92 = new int[2];

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "[I")
	private final int[] anIntArray91 = new int[2];

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "[[B")
	private final byte[][] aByteArrayArray3 = new byte[2][];

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	private Class79() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[I)V")
	@Override
	public void method1477(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt1570 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(21) int local21 = this.anIntArray92[arg0] * this.anInt1571;
		for (@Pc(23) int local23 = 0; local23 < local2; local23++) {
			@Pc(28) int local28 = arg1[local23];
			if ((local28 + 8388608 & 0xFF000000) != 0) {
				local28 = local28 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray3[arg0][local21 + local23 * 2] = (byte) (local28 >> 8);
			this.aByteArrayArray3[arg0][local21 + local23 * 2 + 1] = (byte) (local28 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local21, local2 * 2, this.aByteArrayArray3[arg0], 0);
		this.anIntArray92[arg0] = this.anIntArray92[arg0] + local2 / this.anInt1570 & 0xFFFF;
		if (!this.aBooleanArray3[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray3[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(IB)V")
	@Override
	public void method1479(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray3[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray92[arg0] = 0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I")
	@Override
	public int method1475(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray3[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(25) int local25 = this.aDSCursorsArray1[arg0].write / this.anInt1571;
		@Pc(35) int local35 = this.anIntArray92[arg0] - local25 & 0xFFFF;
		if (local35 > this.anIntArray91[arg0]) {
			@Pc(55) int local55 = local25 - this.anIntArray92[arg0] & 0xFFFF;
			while (local55 > 0) {
				local55 -= 256;
				this.method1477(arg0, this.anIntArray90);
			}
			local35 = this.anIntArray92[arg0] - local25 & 0xFFFF;
		}
		return local35;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
	@Override
	public void method1478(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception {
		if (this.anInt1569 == 0 || this.aDirectSoundBufferArray1[arg0] != null) {
			throw new IllegalStateException();
		}
		@Pc(22) int local22 = this.anInt1571 * 65536;
		if (this.aByteArrayArray3[arg0] == null || this.aByteArrayArray3[arg0].length != local22) {
			this.aByteArrayArray3[arg0] = new byte[local22];
			this.aDSBufferDescArray1[arg0].bufferBytes = local22;
		}
		this.aDirectSoundBufferArray1[arg0] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg0], this.aWaveFormatEx1);
		this.aBooleanArray3[arg0] = false;
		this.anIntArray92[arg0] = 0;
		this.anIntArray91[arg0] = arg1;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
	@Override
	public void method1480(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) throws Exception {
		if (this.anInt1569 != 0) {
			return;
		}
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt1570 = arg2 ? 2 : 1;
		this.anInt1571 = arg2 ? 4 : 2;
		this.anIntArray90 = new int[this.anInt1570 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg1, 2);
		for (@Pc(65) int local65 = 0; local65 < 2; local65++) {
			this.aDSBufferDescArray1[local65].flags = 16384;
		}
		this.aWaveFormatEx1.blockAlign = this.anInt1571;
		this.aWaveFormatEx1.avgBytesPerSec = this.anInt1571 * arg0;
		this.aWaveFormatEx1.bitsPerSample = 16;
		this.anInt1569 = arg0;
		this.aWaveFormatEx1.channels = this.anInt1570;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.samplesPerSec = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V")
	@Override
	public void method1476(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(21) ComFailException local21) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}
}
