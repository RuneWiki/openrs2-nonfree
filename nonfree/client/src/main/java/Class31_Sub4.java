import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class31_Sub4 extends Class31 {

	@OriginalMember(owner = "client!th", name = "u", descriptor = "I")
	private final int anInt3947;

	@OriginalMember(owner = "client!th", name = "o", descriptor = "I")
	private final int anInt3941;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "I")
	private final int anInt3949;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "I")
	private final int anInt3943;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(IIIIIII)V")
	public Class31_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3947 = arg0;
		this.anInt3941 = arg1;
		this.anInt3949 = arg3;
		this.anInt3943 = arg2;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V")
	@Override
	public void method2819(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3947 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt3943 * arg1 >> 12;
		@Pc(28) int local28 = this.anInt3941 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt3949 >> 12;
		Static75.method1116(local35, local28, local10, local17, super.anInt3938);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIB)V")
	@Override
	public void method2821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt3947 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt3943 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt3941 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt3949 >> 12;
		Static165.method2655(local10, local39, super.anInt3940, super.anInt3936, local17, super.anInt3938, local24);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
	@Override
	public void method2817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3947 >> 12;
		@Pc(20) int local20 = this.anInt3941 * arg0 >> 12;
		@Pc(27) int local27 = this.anInt3943 * arg1 >> 12;
		@Pc(34) int local34 = arg0 * this.anInt3949 >> 12;
		Static160.method2547(local20, local10, super.anInt3940, super.anInt3936, local27, local34);
	}
}
