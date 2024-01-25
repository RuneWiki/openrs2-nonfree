import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class6_Sub20 extends Class6 {

	@OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
	public final int anInt3053;

	@OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
	private final int anInt3051;

	@OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
	public final int anInt3059;

	@OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
	public final int anInt3054;

	@OriginalMember(owner = "client!fk", name = "C", descriptor = "I")
	private final int anInt3058;

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
	private final int anInt3048;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
	private final int anInt3046;

	@OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
	private final int anInt3057;

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
	public final int anInt3049;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class6_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt3053 = arg8;
		this.anInt3051 = arg2;
		this.anInt3059 = arg6;
		this.anInt3054 = arg5;
		this.anInt3058 = arg1;
		this.anInt3048 = arg0;
		this.anInt3046 = arg4;
		this.anInt3057 = arg3;
		this.anInt3049 = arg7;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "([IIII)V")
	public void method2691(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0[2] = arg2 + this.anInt3059 - this.anInt3051;
		arg0[0] = 0;
		arg0[1] = arg1 + this.anInt3054 - this.anInt3058;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(III)Z")
	public boolean method2692(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt3058 && arg1 <= this.anInt3057 && arg0 >= this.anInt3051 && this.anInt3046 >= arg0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BII)Z")
	public boolean method2695(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt3054 && arg0 <= this.anInt3049 && arg1 >= this.anInt3059 && arg1 <= this.anInt3053;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[III)V")
	public void method2696(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		arg1[2] = arg0 + this.anInt3051 - this.anInt3059;
		arg1[1] = this.anInt3058 + arg2 - this.anInt3054;
		arg1[0] = this.anInt3048;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIII)Z")
	public boolean method2697(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt3048 == arg1 && this.anInt3058 <= arg2 && arg2 <= this.anInt3057 && arg0 >= this.anInt3051 && arg0 <= this.anInt3046;
	}
}
