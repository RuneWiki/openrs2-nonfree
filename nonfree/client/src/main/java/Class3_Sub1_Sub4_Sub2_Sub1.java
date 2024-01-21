import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class3_Sub1_Sub4_Sub2_Sub1 extends Class3_Sub1_Sub4_Sub2 {

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class3_Sub1_Sub4_Sub2_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "([B)V")
	public Class3_Sub1_Sub4_Sub2_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "([BIIIIII)V")
	@Override
	protected void method1598(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static77.anInt3239;
		@Pc(9) int local9 = Static77.anInt3239 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static77.anInt3243) {
			local20 = Static77.anInt3243 - arg2;
			arg4 -= local20;
			arg2 = Static77.anInt3243;
			local13 = local20 * arg3;
			local5 += local20 * Static77.anInt3239;
		}
		if (arg2 + arg4 > Static77.anInt3240) {
			arg4 -= arg2 + arg4 - Static77.anInt3240;
		}
		if (arg1 < Static77.anInt3241) {
			local20 = Static77.anInt3241 - arg1;
			arg3 -= local20;
			arg1 = Static77.anInt3241;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static77.anInt3238) {
			local20 = arg1 + arg3 - Static77.anInt3238;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static129.method1622(Static77.anIntArray389, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "([BIIIII)V")
	@Override
	protected void method1618(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static77.anInt3239;
		@Pc(9) int local9 = Static77.anInt3239 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static77.anInt3243) {
			local20 = Static77.anInt3243 - arg2;
			arg4 -= local20;
			arg2 = Static77.anInt3243;
			local13 = local20 * arg3;
			local5 += local20 * Static77.anInt3239;
		}
		if (arg2 + arg4 > Static77.anInt3240) {
			arg4 -= arg2 + arg4 - Static77.anInt3240;
		}
		if (arg1 < Static77.anInt3241) {
			local20 = Static77.anInt3241 - arg1;
			arg3 -= local20;
			arg1 = Static77.anInt3241;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static77.anInt3238) {
			local20 = arg1 + arg3 - Static77.anInt3238;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static129.method1621(Static77.anIntArray389, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}
}
