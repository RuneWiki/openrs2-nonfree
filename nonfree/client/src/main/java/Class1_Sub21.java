import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!gm", name = "w", descriptor = "I")
	public final int anInt2631;

	@OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
	public final int anInt2629;

	@OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
	private final int anInt2626;

	@OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
	private final int anInt2624;

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
	private final int anInt2622;

	@OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
	public final int anInt2625;

	@OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
	private final int anInt2628;

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
	private final int anInt2619;

	@OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
	public final int anInt2634;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt2631 = arg5;
		this.anInt2629 = arg6;
		this.anInt2626 = arg1;
		this.anInt2624 = arg0;
		this.anInt2622 = arg4;
		this.anInt2625 = arg8;
		this.anInt2628 = arg3;
		this.anInt2619 = arg2;
		this.anInt2634 = arg7;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)Z")
	public boolean method2279(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt2631 && arg1 <= this.anInt2634 && arg0 >= this.anInt2629 && this.anInt2625 >= arg0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II[II)V")
	public void method2280(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[1] = this.anInt2631 + arg0 - this.anInt2626;
		arg1[0] = 0;
		arg1[2] = arg2 + this.anInt2629 - this.anInt2619;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "([IIII)V")
	public void method2281(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0[2] = arg1 + this.anInt2619 - this.anInt2629;
		arg0[1] = this.anInt2626 + arg2 - this.anInt2631;
		arg0[0] = this.anInt2624;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BII)Z")
	public boolean method2284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt2626 && arg0 <= this.anInt2628 && this.anInt2619 <= arg1 && this.anInt2622 >= arg1;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIB)Z")
	public boolean method2286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg1 == this.anInt2624 && this.anInt2626 <= arg2 && arg2 <= this.anInt2628 && arg0 >= this.anInt2619 && this.anInt2622 >= arg0;
	}
}
