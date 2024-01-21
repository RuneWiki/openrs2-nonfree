import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class4_Sub3_Sub6_Sub1_Sub1 extends Class4_Sub3_Sub6_Sub1 {

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "([B)V")
	public Class4_Sub3_Sub6_Sub1_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class4_Sub3_Sub6_Sub1_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BIIIIII)V")
	@Override
	protected void method1198(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static34.anInt2345;
		@Pc(9) int local9 = Static34.anInt2345 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static34.anInt2344) {
			local20 = Static34.anInt2344 - arg2;
			arg4 -= local20;
			arg2 = Static34.anInt2344;
			local13 = local20 * arg3;
			local5 += local20 * Static34.anInt2345;
		}
		if (arg2 + arg4 > Static34.anInt2347) {
			arg4 -= arg2 + arg4 - Static34.anInt2347;
		}
		if (arg1 < Static34.anInt2349) {
			local20 = Static34.anInt2349 - arg1;
			arg3 -= local20;
			arg1 = Static34.anInt2349;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static34.anInt2346) {
			local20 = arg1 + arg3 - Static34.anInt2346;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static93.method1222(Static34.anIntArray298, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BIIIII)V")
	@Override
	protected void method1201(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static34.anInt2345;
		@Pc(9) int local9 = Static34.anInt2345 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static34.anInt2344) {
			local20 = Static34.anInt2344 - arg2;
			arg4 -= local20;
			arg2 = Static34.anInt2344;
			local13 = local20 * arg3;
			local5 += local20 * Static34.anInt2345;
		}
		if (arg2 + arg4 > Static34.anInt2347) {
			arg4 -= arg2 + arg4 - Static34.anInt2347;
		}
		if (arg1 < Static34.anInt2349) {
			local20 = Static34.anInt2349 - arg1;
			arg3 -= local20;
			arg1 = Static34.anInt2349;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static34.anInt2346) {
			local20 = arg1 + arg3 - Static34.anInt2346;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static93.method1211(Static34.anIntArray298, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}
}
