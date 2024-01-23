import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class2_Sub2_Sub4_Sub1_Sub1 extends Class2_Sub2_Sub4_Sub1 {

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class2_Sub2_Sub4_Sub1_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub4_Sub1_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIII)V")
	@Override
	protected void method777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static64.anInt1698;
		@Pc(9) int local9 = Static64.anInt1698 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static64.anInt1699) {
			local20 = Static64.anInt1699 - arg2;
			arg4 -= local20;
			arg2 = Static64.anInt1699;
			local13 = local20 * arg3;
			local5 += local20 * Static64.anInt1698;
		}
		if (arg2 + arg4 > Static64.anInt1700) {
			arg4 -= arg2 + arg4 - Static64.anInt1700;
		}
		if (arg1 < Static64.anInt1697) {
			local20 = Static64.anInt1697 - arg1;
			arg3 -= local20;
			arg1 = Static64.anInt1697;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static64.anInt1701) {
			local20 = arg1 + arg3 - Static64.anInt1701;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static83.method1495(Static64.anIntArray163, arg3, arg6, local13, local9, super.aByteArrayArray3[arg0], arg5, local5, arg4, local11);
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(IIIIII)V")
	@Override
	protected void method773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static64.anInt1698;
		@Pc(9) int local9 = Static64.anInt1698 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static64.anInt1699) {
			local20 = Static64.anInt1699 - arg2;
			arg4 -= local20;
			arg2 = Static64.anInt1699;
			local13 = local20 * arg3;
			local5 += local20 * Static64.anInt1698;
		}
		if (arg2 + arg4 > Static64.anInt1700) {
			arg4 -= arg2 + arg4 - Static64.anInt1700;
		}
		if (arg1 < Static64.anInt1697) {
			local20 = Static64.anInt1697 - arg1;
			arg3 -= local20;
			arg1 = Static64.anInt1697;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static64.anInt1701) {
			local20 = arg1 + arg3 - Static64.anInt1701;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static69.method1265(arg5, local11, local5, super.aByteArrayArray3[arg0], arg3, arg4, local9, Static64.anIntArray163, local13);
		}
	}
}
