import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class2_Sub1_Sub12_Sub1_Sub1 extends Class2_Sub1_Sub12_Sub1 {

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub12_Sub1_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class2_Sub1_Sub12_Sub1_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIIIII)V")
	@Override
	protected void method1379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static212.anInt4430;
		@Pc(9) int local9 = Static212.anInt4430 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static212.anInt4426) {
			local20 = Static212.anInt4426 - arg2;
			arg4 -= local20;
			arg2 = Static212.anInt4426;
			local13 = local20 * arg3;
			local5 += local20 * Static212.anInt4430;
		}
		if (arg2 + arg4 > Static212.anInt4428) {
			arg4 -= arg2 + arg4 - Static212.anInt4428;
		}
		if (arg1 < Static212.anInt4429) {
			local20 = Static212.anInt4429 - arg1;
			arg3 -= local20;
			arg1 = Static212.anInt4429;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static212.anInt4427) {
			local20 = arg1 + arg3 - Static212.anInt4427;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static26.method2652(arg4, arg5, Static212.anIntArray398, super.aByteArrayArray5[arg0], local5, local11, local9, arg6, arg3, local13);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
	@Override
	protected void method1361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static212.anInt4430;
		@Pc(9) int local9 = Static212.anInt4430 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static212.anInt4426) {
			local20 = Static212.anInt4426 - arg2;
			arg4 -= local20;
			arg2 = Static212.anInt4426;
			local13 = local20 * arg3;
			local5 += local20 * Static212.anInt4430;
		}
		if (arg2 + arg4 > Static212.anInt4428) {
			arg4 -= arg2 + arg4 - Static212.anInt4428;
		}
		if (arg1 < Static212.anInt4429) {
			local20 = Static212.anInt4429 - arg1;
			arg3 -= local20;
			arg1 = Static212.anInt4429;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static212.anInt4427) {
			local20 = arg1 + arg3 - Static212.anInt4427;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static197.method2840(arg4, local11, arg5, local5, arg3, local9, super.aByteArrayArray5[arg0], Static212.anIntArray398, local13);
		}
	}
}
