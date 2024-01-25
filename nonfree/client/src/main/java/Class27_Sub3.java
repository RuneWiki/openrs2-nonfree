import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class27_Sub3 extends Class27 {

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
	private final int anInt3894;

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
	private final int anInt3901;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
	private final int anInt3899;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
	private final int anInt3898;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIIII)V")
	public Class27_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3894 = arg2;
		this.anInt3901 = arg1;
		this.anInt3899 = arg0;
		this.anInt3898 = arg3;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
	@Override
	public void method3935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3899 * arg1 >> 12;
		@Pc(22) int local22 = this.anInt3894 * arg1 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt3901 >> 12;
		@Pc(36) int local36 = this.anInt3898 * arg0 >> 12;
		Static166.method2735(local22, super.anInt5152, super.anInt5154, local36, local10, local29);
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(III)V")
	@Override
	public void method3939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3899 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt3894 >> 12;
		@Pc(34) int local34 = arg0 * this.anInt3901 >> 12;
		@Pc(41) int local41 = arg0 * this.anInt3898 >> 12;
		Static349.method4709(local41, local10, super.anInt5155, local17, local34);
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(III)V")
	@Override
	public void method3936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3899 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt3894 >> 12;
		@Pc(24) int local24 = this.anInt3901 * arg0 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt3898 >> 12;
		Static266.method3827(local24, super.anInt5152, local17, local10, super.anInt5154, local31, super.anInt5155);
	}
}
