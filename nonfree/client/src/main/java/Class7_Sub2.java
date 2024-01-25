import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!jh", name = "t", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
	private int anInt5904;

	@OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
	private int anInt5907;

	@OriginalMember(owner = "client!jh", name = "w", descriptor = "[I")
	private final int[] anIntArray517 = new int[this.anInt5891];

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class7_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt5891; local15++) {
			this.anIntArray517[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
	@Override
	protected final void method4955() {
		this.anInt5904 = Math.abs(this.anInt5904);
		if (this.anInt5904 >= 4096) {
			this.anInt5904 = 4095;
		}
		this.method4962(this.anInt5907++, (byte) (this.anInt5904 >> 4));
		this.anInt5904 = 0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4951() {
		this.anInt5907 = 0;
		this.anInt5904 = 0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4953(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5904 += arg0 * this.anIntArray517[arg1] >> 12;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIB)V")
	protected void method4962(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray77[this.anInt5907++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
