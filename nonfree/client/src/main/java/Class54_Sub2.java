import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class54_Sub2 extends Class54 {

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
	private final int anInt2566;

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
	private final int anInt2560;

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
	private final int anInt2561;

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
	private final int anInt2563;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(IIIIIII)V")
	public Class54_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2566 = arg2;
		this.anInt2560 = arg1;
		this.anInt2561 = arg0;
		this.anInt2563 = arg3;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(III)V")
	@Override
	public void method2769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = this.anInt2566 * arg0 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt2561 >> 12;
		@Pc(32) int local32 = this.anInt2560 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt2563 * arg1 >> 12;
		Static38.method645(super.anInt3669, local25, super.anInt3663, local18, super.anInt3666, local32, local39);
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(III)V")
	@Override
	public void method2770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2561 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt2563 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt2560 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt2566 * arg0 >> 12;
		Static216.method3180(super.anInt3666, local31, local10, local17, local24, super.anInt3669);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)V")
	@Override
	public void method2767(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt2561 >> 12;
		@Pc(13) int local13 = this.anInt2566 * arg1 >> 12;
		@Pc(20) int local20 = this.anInt2560 * arg0 >> 12;
		@Pc(27) int local27 = this.anInt2563 * arg0 >> 12;
		Static150.method2303(local20, local27, local6, local13, super.anInt3663);
	}
}
