import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class348 {

	@OriginalMember(owner = "client!th", name = "e", descriptor = "I")
	private int anInt9636;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "I")
	private int anInt9643;

	@OriginalMember(owner = "client!th", name = "o", descriptor = "I")
	private int anInt9634;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "I")
	private int anInt9639;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "I")
	public int anInt9647;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "I")
	public int anInt9644;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "I")
	public int anInt9641;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "I")
	public int anInt9637;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "I")
	public int anInt9640;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	public int anInt9635;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt9636 = arg3 * arg3;
		this.anInt9643 = arg1;
		this.anInt9634 = arg0;
		this.anInt9639 = arg2;
		this.anInt9647 = this.anInt9643 + arg7;
		this.anInt9644 = this.anInt9643 + arg6;
		this.anInt9641 = arg9 + this.anInt9639;
		this.anInt9637 = arg4 + this.anInt9634;
		this.anInt9640 = this.anInt9634 + arg5;
		this.anInt9635 = this.anInt9639 + arg8;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZIIIIIIIII)V")
	public void method8310(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt9639 = arg2;
		this.anInt9636 = arg3 * arg3;
		this.anInt9643 = arg8;
		this.anInt9634 = arg0;
		this.anInt9637 = this.anInt9634 + arg9;
		this.anInt9635 = this.anInt9639 + arg4;
		this.anInt9647 = this.anInt9643 + arg5;
		this.anInt9640 = arg6 + this.anInt9634;
		this.anInt9644 = arg1 + this.anInt9643;
		this.anInt9641 = this.anInt9639 + arg7;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII)Z")
	public boolean method8313(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt9637 > arg1 || this.anInt9640 < arg1) {
			return false;
		} else if (arg2 < this.anInt9644 || this.anInt9647 < arg2) {
			return false;
		} else if (this.anInt9635 <= arg0 && this.anInt9641 >= arg0) {
			@Pc(71) int local71 = arg1 - this.anInt9634;
			@Pc(77) int local77 = arg0 - this.anInt9639;
			return this.anInt9636 > local71 * local71 + local77 * local77;
		} else {
			return false;
		}
	}
}
