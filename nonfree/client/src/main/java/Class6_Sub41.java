import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class6_Sub41 extends Class6 {

	@OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
	public final int anInt6943;

	@OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
	private final int anInt6951;

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
	private final int anInt6939;

	@OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
	private final int anInt6941;

	@OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
	private final int anInt6952;

	@OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
	public final int anInt6947;

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
	public final int anInt6950;

	@OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
	private final int anInt6946;

	@OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
	public final int anInt6942;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class6_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt6943 = arg8;
		this.anInt6951 = arg3;
		this.anInt6939 = arg4;
		this.anInt6941 = arg1;
		this.anInt6952 = arg2;
		this.anInt6947 = arg5;
		this.anInt6950 = arg7;
		this.anInt6946 = arg0;
		this.anInt6942 = arg6;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II[IB)V")
	public void method5791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[2] = arg1 + this.anInt6952 - this.anInt6942;
		arg2[1] = arg0 + this.anInt6941 - this.anInt6947;
		arg2[0] = this.anInt6946;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZI)Z")
	public boolean method5792(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt6941 && arg0 <= this.anInt6951 && arg1 >= this.anInt6952 && this.anInt6939 >= arg1;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II[IZ)V")
	public void method5793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[0] = 0;
		arg2[2] = this.anInt6942 + arg1 - this.anInt6952;
		arg2[1] = arg0 + this.anInt6947 - this.anInt6941;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIII)Z")
	public boolean method5795(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg2 == this.anInt6946 && arg0 >= this.anInt6941 && this.anInt6951 >= arg0 && this.anInt6952 <= arg1 && arg1 <= this.anInt6939;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIB)Z")
	public boolean method5797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt6947 && this.anInt6950 >= arg0 && this.anInt6942 <= arg1 && this.anInt6943 >= arg1;
	}
}
