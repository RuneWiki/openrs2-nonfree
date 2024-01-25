import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public final class Class4_Sub22 extends Class4 {

	@OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
	public final int anInt3668;

	@OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
	public final int anInt3675;

	@OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
	public final int anInt3677;

	@OriginalMember(owner = "client!gp", name = "F", descriptor = "I")
	private final int anInt3680;

	@OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
	private final int anInt3674;

	@OriginalMember(owner = "client!gp", name = "H", descriptor = "I")
	private final int anInt3682;

	@OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
	private final int anInt3673;

	@OriginalMember(owner = "client!gp", name = "s", descriptor = "I")
	public final int anInt3670;

	@OriginalMember(owner = "client!gp", name = "D", descriptor = "I")
	private final int anInt3679;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class4_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt3668 = arg5;
		this.anInt3675 = arg8;
		this.anInt3677 = arg6;
		this.anInt3680 = arg3;
		this.anInt3674 = arg2;
		this.anInt3682 = arg0;
		this.anInt3673 = arg1;
		this.anInt3670 = arg7;
		this.anInt3679 = arg4;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I[III)V")
	public void method2894(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = this.anInt3673 + arg1 - this.anInt3668;
		arg0[0] = this.anInt3682;
		arg0[2] = arg2 + this.anInt3674 - this.anInt3677;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIII)Z")
	public boolean method2895(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt3682 == arg0 && this.anInt3673 <= arg1 && arg1 <= this.anInt3680 && arg2 >= this.anInt3674 && this.anInt3679 >= arg2;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)Z")
	public boolean method2896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt3668 <= arg1 && arg1 <= this.anInt3670 && arg0 >= this.anInt3677 && arg0 <= this.anInt3675;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(III)Z")
	public boolean method2898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt3673 <= arg0 && this.anInt3680 >= arg0 && this.anInt3674 <= arg1 && this.anInt3679 >= arg1;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "([IIII)V")
	public void method2899(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = this.anInt3668 + arg2 - this.anInt3673;
		arg0[0] = 0;
		arg0[2] = this.anInt3677 + arg1 - this.anInt3674;
	}
}
