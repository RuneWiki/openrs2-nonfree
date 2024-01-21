import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class2_Sub2_Sub3_Sub4_Sub1 extends Class2_Sub2_Sub3_Sub4 {

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub3_Sub4_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class2_Sub2_Sub3_Sub4_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(IIIIII)V")
	@Override
	protected void method1261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static113.anInt1736;
		@Pc(9) int local9 = Static113.anInt1736 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static113.anInt1737) {
			local20 = Static113.anInt1737 - arg2;
			arg4 -= local20;
			arg2 = Static113.anInt1737;
			local13 = local20 * arg3;
			local5 += local20 * Static113.anInt1736;
		}
		if (arg2 + arg4 > Static113.anInt1739) {
			arg4 -= arg2 + arg4 - Static113.anInt1739;
		}
		if (arg1 < Static113.anInt1734) {
			local20 = Static113.anInt1734 - arg1;
			arg3 -= local20;
			arg1 = Static113.anInt1734;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static113.anInt1735) {
			local20 = arg1 + arg3 - Static113.anInt1735;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static102.method1267(Static113.anIntArray275, super.aByteArrayArray3[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(IIIIIII)V")
	@Override
	protected void method1268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static113.anInt1736;
		@Pc(9) int local9 = Static113.anInt1736 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static113.anInt1737) {
			local20 = Static113.anInt1737 - arg2;
			arg4 -= local20;
			arg2 = Static113.anInt1737;
			local13 = local20 * arg3;
			local5 += local20 * Static113.anInt1736;
		}
		if (arg2 + arg4 > Static113.anInt1739) {
			arg4 -= arg2 + arg4 - Static113.anInt1739;
		}
		if (arg1 < Static113.anInt1734) {
			local20 = Static113.anInt1734 - arg1;
			arg3 -= local20;
			arg1 = Static113.anInt1734;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static113.anInt1735) {
			local20 = arg1 + arg3 - Static113.anInt1735;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static102.method1271(Static113.anIntArray275, super.aByteArrayArray3[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}
}
