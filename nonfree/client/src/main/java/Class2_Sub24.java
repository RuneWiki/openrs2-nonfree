import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public final class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
	private final int anInt3608;

	@OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
	public final int anInt3618;

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
	private final int anInt3617;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
	private final int anInt3606;

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
	public final int anInt3614;

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
	public final int anInt3609;

	@OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
	private final int anInt3621;

	@OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
	public final int anInt3620;

	@OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
	private final int anInt3619;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt3608 = arg3;
		this.anInt3618 = arg8;
		this.anInt3617 = arg4;
		this.anInt3606 = arg0;
		this.anInt3614 = arg6;
		this.anInt3609 = arg5;
		this.anInt3621 = arg2;
		this.anInt3620 = arg7;
		this.anInt3619 = arg1;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BIII)Z")
	public boolean method2985(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg2 == this.anInt3606 && this.anInt3619 <= arg0 && this.anInt3608 >= arg0 && this.anInt3621 <= arg1 && arg1 <= this.anInt3617;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBI[I)V")
	public void method2986(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = this.anInt3619 + arg1 - this.anInt3609;
		arg2[2] = arg0 + this.anInt3621 - this.anInt3614;
		arg2[0] = this.anInt3606;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B[III)V")
	public void method2987(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = this.anInt3609 + arg1 - this.anInt3619;
		arg0[0] = 0;
		arg0[2] = this.anInt3614 + arg2 - this.anInt3621;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Z")
	public boolean method2988(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt3609 <= arg1 && arg1 <= this.anInt3620 && arg0 >= this.anInt3614 && arg0 <= this.anInt3618;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB)Z")
	public boolean method2990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt3619 <= arg1 && arg1 <= this.anInt3608 && this.anInt3621 <= arg0 && arg0 <= this.anInt3617;
	}
}
