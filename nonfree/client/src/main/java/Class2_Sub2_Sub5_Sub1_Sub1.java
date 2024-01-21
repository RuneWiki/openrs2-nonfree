import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class2_Sub2_Sub5_Sub1_Sub1 extends Class2_Sub2_Sub5_Sub1 {

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub5_Sub1_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class2_Sub2_Sub5_Sub1_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(IIIIII)V")
	@Override
	protected void method1096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static126.anInt2775;
		@Pc(9) int local9 = Static126.anInt2775 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static126.anInt2776) {
			local20 = Static126.anInt2776 - arg2;
			arg4 -= local20;
			arg2 = Static126.anInt2776;
			local13 = local20 * arg3;
			local5 += local20 * Static126.anInt2775;
		}
		if (arg2 + arg4 > Static126.anInt2778) {
			arg4 -= arg2 + arg4 - Static126.anInt2778;
		}
		if (arg1 < Static126.anInt2774) {
			local20 = Static126.anInt2774 - arg1;
			arg3 -= local20;
			arg1 = Static126.anInt2774;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static126.anInt2777) {
			local20 = arg1 + arg3 - Static126.anInt2777;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static142.method2283(local9, local11, arg5, Static126.anIntArray279, arg3, super.aByteArrayArray8[arg0], local13, arg4, local5);
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(IIIIIII)V")
	@Override
	protected void method1081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static126.anInt2775;
		@Pc(9) int local9 = Static126.anInt2775 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static126.anInt2776) {
			local20 = Static126.anInt2776 - arg2;
			arg4 -= local20;
			arg2 = Static126.anInt2776;
			local13 = local20 * arg3;
			local5 += local20 * Static126.anInt2775;
		}
		if (arg2 + arg4 > Static126.anInt2778) {
			arg4 -= arg2 + arg4 - Static126.anInt2778;
		}
		if (arg1 < Static126.anInt2774) {
			local20 = Static126.anInt2774 - arg1;
			arg3 -= local20;
			arg1 = Static126.anInt2774;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static126.anInt2777) {
			local20 = arg1 + arg3 - Static126.anInt2777;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static82.method1479(local11, arg5, Static126.anIntArray279, arg3, local9, local13, super.aByteArrayArray8[arg0], arg4, arg6, local5);
		}
	}
}
