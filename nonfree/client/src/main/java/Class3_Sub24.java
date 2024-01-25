import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public final class Class3_Sub24 extends Class3 {

	@OriginalMember(owner = "client!jca", name = "n", descriptor = "I")
	private final int anInt5041;

	@OriginalMember(owner = "client!jca", name = "C", descriptor = "I")
	public final int anInt5054;

	@OriginalMember(owner = "client!jca", name = "u", descriptor = "I")
	public final int anInt5047;

	@OriginalMember(owner = "client!jca", name = "D", descriptor = "I")
	private final int anInt5055;

	@OriginalMember(owner = "client!jca", name = "z", descriptor = "I")
	private final int anInt5052;

	@OriginalMember(owner = "client!jca", name = "j", descriptor = "I")
	private final int anInt5037;

	@OriginalMember(owner = "client!jca", name = "w", descriptor = "I")
	public final int anInt5049;

	@OriginalMember(owner = "client!jca", name = "t", descriptor = "I")
	private final int anInt5046;

	@OriginalMember(owner = "client!jca", name = "p", descriptor = "I")
	public final int anInt5043;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class3_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5041 = arg0;
		this.anInt5054 = arg6;
		this.anInt5047 = arg8;
		this.anInt5055 = arg1;
		this.anInt5052 = arg3;
		this.anInt5037 = arg2;
		this.anInt5049 = arg7;
		this.anInt5046 = arg4;
		this.anInt5043 = arg5;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(III)Z")
	public boolean method4337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt5043 <= arg1 && this.anInt5049 >= arg1 && arg0 >= this.anInt5054 && arg0 <= this.anInt5047;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIII)Z")
	public boolean method4340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg2 == this.anInt5041 && arg1 >= this.anInt5055 && arg1 <= this.anInt5052 && this.anInt5037 <= arg0 && this.anInt5046 >= arg0;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I[IZI)V")
	public void method4341(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[1] = arg0 + this.anInt5043 - this.anInt5055;
		arg1[0] = 0;
		arg1[2] = arg2 + this.anInt5054 - this.anInt5037;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(III[I)V")
	public void method4342(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = arg0 + this.anInt5055 - this.anInt5043;
		arg2[2] = this.anInt5037 + arg1 - this.anInt5054;
		arg2[0] = this.anInt5041;
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(III)Z")
	public boolean method4343(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt5055 && this.anInt5052 >= arg1 && arg0 >= this.anInt5037 && this.anInt5046 >= arg0;
	}
}
