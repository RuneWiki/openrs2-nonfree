import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class2_Sub4_Sub3_Sub2_Sub1 extends Class2_Sub4_Sub3_Sub2 {

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "([B)V")
	public Class2_Sub4_Sub3_Sub2_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class2_Sub4_Sub3_Sub2_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(IIIIIII)V")
	@Override
	protected void method2473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static161.anInt3975;
		@Pc(9) int local9 = Static161.anInt3975 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static161.anInt3979) {
			local20 = Static161.anInt3979 - arg2;
			arg4 -= local20;
			arg2 = Static161.anInt3979;
			local13 = local20 * arg3;
			local5 += local20 * Static161.anInt3975;
		}
		if (arg2 + arg4 > Static161.anInt3977) {
			arg4 -= arg2 + arg4 - Static161.anInt3977;
		}
		if (arg1 < Static161.anInt3976) {
			local20 = Static161.anInt3976 - arg1;
			arg3 -= local20;
			arg1 = Static161.anInt3976;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static161.anInt3978) {
			local20 = arg1 + arg3 - Static161.anInt3978;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static68.method2471(Static161.anIntArray365, super.aByteArrayArray9[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(IIIIII)V")
	@Override
	protected void method2466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static161.anInt3975;
		@Pc(9) int local9 = Static161.anInt3975 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static161.anInt3979) {
			local20 = Static161.anInt3979 - arg2;
			arg4 -= local20;
			arg2 = Static161.anInt3979;
			local13 = local20 * arg3;
			local5 += local20 * Static161.anInt3975;
		}
		if (arg2 + arg4 > Static161.anInt3977) {
			arg4 -= arg2 + arg4 - Static161.anInt3977;
		}
		if (arg1 < Static161.anInt3976) {
			local20 = Static161.anInt3976 - arg1;
			arg3 -= local20;
			arg1 = Static161.anInt3976;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static161.anInt3978) {
			local20 = arg1 + arg3 - Static161.anInt3978;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static68.method2474(Static161.anIntArray365, super.aByteArrayArray9[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}
}
