import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class3_Sub3_Sub2_Sub4_Sub1 extends Class3_Sub3_Sub2_Sub4 {

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "([B)V")
	public Class3_Sub3_Sub2_Sub4_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class3_Sub3_Sub2_Sub4_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII)V")
	@Override
	protected void method3124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static104.anInt3996;
		@Pc(9) int local9 = Static104.anInt3996 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static104.anInt3994) {
			local20 = Static104.anInt3994 - arg2;
			arg4 -= local20;
			arg2 = Static104.anInt3994;
			local13 = local20 * arg3;
			local5 += local20 * Static104.anInt3996;
		}
		if (arg2 + arg4 > Static104.anInt3998) {
			arg4 -= arg2 + arg4 - Static104.anInt3998;
		}
		if (arg1 < Static104.anInt3999) {
			local20 = Static104.anInt3999 - arg1;
			arg3 -= local20;
			arg1 = Static104.anInt3999;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static104.anInt3995) {
			local20 = arg1 + arg3 - Static104.anInt3995;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static173.method3100(Static104.anIntArray347, super.aByteArrayArray8[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(IIIIII)V")
	@Override
	protected void method3127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static104.anInt3996;
		@Pc(9) int local9 = Static104.anInt3996 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static104.anInt3994) {
			local20 = Static104.anInt3994 - arg2;
			arg4 -= local20;
			arg2 = Static104.anInt3994;
			local13 = local20 * arg3;
			local5 += local20 * Static104.anInt3996;
		}
		if (arg2 + arg4 > Static104.anInt3998) {
			arg4 -= arg2 + arg4 - Static104.anInt3998;
		}
		if (arg1 < Static104.anInt3999) {
			local20 = Static104.anInt3999 - arg1;
			arg3 -= local20;
			arg1 = Static104.anInt3999;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static104.anInt3995) {
			local20 = arg1 + arg3 - Static104.anInt3995;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static173.method3117(Static104.anIntArray347, super.aByteArrayArray8[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}
}
