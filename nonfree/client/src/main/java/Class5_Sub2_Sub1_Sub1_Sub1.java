import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class5_Sub2_Sub1_Sub1_Sub1 extends Class5_Sub2_Sub1_Sub1 {

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "([B)V")
	public Class5_Sub2_Sub1_Sub1_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class5_Sub2_Sub1_Sub1_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIII)V")
	@Override
	protected void method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static46.anInt3188;
		@Pc(9) int local9 = Static46.anInt3188 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static46.anInt3189) {
			local20 = Static46.anInt3189 - arg2;
			arg4 -= local20;
			arg2 = Static46.anInt3189;
			local13 = local20 * arg3;
			local5 += local20 * Static46.anInt3188;
		}
		if (arg2 + arg4 > Static46.anInt3190) {
			arg4 -= arg2 + arg4 - Static46.anInt3190;
		}
		if (arg1 < Static46.anInt3186) {
			local20 = Static46.anInt3186 - arg1;
			arg3 -= local20;
			arg1 = Static46.anInt3186;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static46.anInt3185) {
			local20 = arg1 + arg3 - Static46.anInt3185;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static7.method563(Static46.anIntArray385, super.aByteArrayArray4[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(IIIIII)V")
	@Override
	protected void method547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static46.anInt3188;
		@Pc(9) int local9 = Static46.anInt3188 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static46.anInt3189) {
			local20 = Static46.anInt3189 - arg2;
			arg4 -= local20;
			arg2 = Static46.anInt3189;
			local13 = local20 * arg3;
			local5 += local20 * Static46.anInt3188;
		}
		if (arg2 + arg4 > Static46.anInt3190) {
			arg4 -= arg2 + arg4 - Static46.anInt3190;
		}
		if (arg1 < Static46.anInt3186) {
			local20 = Static46.anInt3186 - arg1;
			arg3 -= local20;
			arg1 = Static46.anInt3186;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static46.anInt3185) {
			local20 = arg1 + arg3 - Static46.anInt3185;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static7.method559(Static46.anIntArray385, super.aByteArrayArray4[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}
}
