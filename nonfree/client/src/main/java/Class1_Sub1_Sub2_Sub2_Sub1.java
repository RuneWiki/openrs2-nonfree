import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class1_Sub1_Sub2_Sub2_Sub1 extends Class1_Sub1_Sub2_Sub2 {

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub2_Sub2_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class1_Sub1_Sub2_Sub2_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "([BIIIII)V")
	@Override
	protected void method789(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static115.anInt2366;
		@Pc(9) int local9 = Static115.anInt2366 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static115.anInt2367) {
			local20 = Static115.anInt2367 - arg2;
			arg4 -= local20;
			arg2 = Static115.anInt2367;
			local13 = local20 * arg3;
			local5 += local20 * Static115.anInt2366;
		}
		if (arg2 + arg4 > Static115.anInt2368) {
			arg4 -= arg2 + arg4 - Static115.anInt2368;
		}
		if (arg1 < Static115.anInt2370) {
			local20 = Static115.anInt2370 - arg1;
			arg3 -= local20;
			arg1 = Static115.anInt2370;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static115.anInt2369) {
			local20 = arg1 + arg3 - Static115.anInt2369;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static110.method770(Static115.anIntArray395, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "([BIIIIII)V")
	@Override
	protected void method792(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static115.anInt2366;
		@Pc(9) int local9 = Static115.anInt2366 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static115.anInt2367) {
			local20 = Static115.anInt2367 - arg2;
			arg4 -= local20;
			arg2 = Static115.anInt2367;
			local13 = local20 * arg3;
			local5 += local20 * Static115.anInt2366;
		}
		if (arg2 + arg4 > Static115.anInt2368) {
			arg4 -= arg2 + arg4 - Static115.anInt2368;
		}
		if (arg1 < Static115.anInt2370) {
			local20 = Static115.anInt2370 - arg1;
			arg3 -= local20;
			arg1 = Static115.anInt2370;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static115.anInt2369) {
			local20 = arg1 + arg3 - Static115.anInt2369;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static110.method784(Static115.anIntArray395, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}
}
