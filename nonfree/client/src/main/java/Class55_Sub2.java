import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public class Class55_Sub2 extends Class55 {

	@OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
	private int anInt2927;

	@OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
	private int anInt2930;

	@OriginalMember(owner = "client!sa", name = "H", descriptor = "[B")
	private byte[] aByteArray63;

	@OriginalMember(owner = "client!sa", name = "D", descriptor = "[I")
	private int[] anIntArray361 = new int[this.anInt2920];

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class55_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < this.anInt2920; local15++) {
			this.anIntArray361[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
	@Override
	protected final void method2434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2930 += this.anIntArray361[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
	@Override
	protected final void method2436() {
		this.anInt2930 = Math.abs(this.anInt2930);
		if (this.anInt2930 >= 4096) {
			this.anInt2930 = 4095;
		}
		this.method2438(this.anInt2927++, (byte) (this.anInt2930 >> 4));
		this.anInt2930 = 0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)V")
	protected void method2438(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray63[this.anInt2927++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
	@Override
	protected final void method2437() {
		this.anInt2930 = 0;
		this.anInt2927 = 0;
	}
}
