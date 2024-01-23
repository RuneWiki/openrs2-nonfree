import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class45_Sub3 extends Class45 {

	@OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
	private final int anInt3415;

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
	private final int anInt3410;

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
	private final int anInt3408;

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
	private final int anInt3409;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIIII)V")
	public Class45_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3415 = arg3;
		this.anInt3410 = arg1;
		this.anInt3408 = arg0;
		this.anInt3409 = arg2;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BII)V")
	@Override
	public void method2628(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3408 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt3409 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt3410 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt3415 >> 12;
		Static217.method3439(local24, local17, super.anInt3461, local10, local39);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
	@Override
	public void method2632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3409 >> 12;
		@Pc(17) int local17 = this.anInt3408 * arg1 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt3410 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt3415 >> 12;
		Static159.method2682(local35, local10, local17, super.anInt3466, local28, super.anInt3465);
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(BII)V")
	@Override
	public void method2629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt3408 >> 12;
		@Pc(17) int local17 = this.anInt3409 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt3415 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt3410 >> 12;
		Static153.method2604(super.anInt3461, local24, super.anInt3465, local17, local31, local10, super.anInt3466);
	}
}
