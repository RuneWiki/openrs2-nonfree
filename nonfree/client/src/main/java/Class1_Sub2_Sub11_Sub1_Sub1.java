import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class1_Sub2_Sub11_Sub1_Sub1 extends Class1_Sub2_Sub11_Sub1 {

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class1_Sub2_Sub11_Sub1_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub11_Sub1_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIIIIII)V")
	@Override
	protected void method2037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static96.anInt2126;
		@Pc(9) int local9 = Static96.anInt2126 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static96.anInt2124) {
			local20 = Static96.anInt2124 - arg2;
			arg4 -= local20;
			arg2 = Static96.anInt2124;
			local13 = local20 * arg3;
			local5 += local20 * Static96.anInt2126;
		}
		if (arg2 + arg4 > Static96.anInt2125) {
			arg4 -= arg2 + arg4 - Static96.anInt2125;
		}
		if (arg1 < Static96.anInt2121) {
			local20 = Static96.anInt2121 - arg1;
			arg3 -= local20;
			arg1 = Static96.anInt2121;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static96.anInt2123) {
			local20 = arg1 + arg3 - Static96.anInt2123;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static147.method2522(arg4, Static96.anIntArray137, super.aByteArrayArray6[arg0], local13, arg6, arg3, local9, local5, local11, arg5);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIII)V")
	@Override
	protected void method2016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static96.anInt2126;
		@Pc(9) int local9 = Static96.anInt2126 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static96.anInt2124) {
			local20 = Static96.anInt2124 - arg2;
			arg4 -= local20;
			arg2 = Static96.anInt2124;
			local13 = local20 * arg3;
			local5 += local20 * Static96.anInt2126;
		}
		if (arg2 + arg4 > Static96.anInt2125) {
			arg4 -= arg2 + arg4 - Static96.anInt2125;
		}
		if (arg1 < Static96.anInt2121) {
			local20 = Static96.anInt2121 - arg1;
			arg3 -= local20;
			arg1 = Static96.anInt2121;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static96.anInt2123) {
			local20 = arg1 + arg3 - Static96.anInt2123;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static103.method3818(local9, super.aByteArrayArray6[arg0], Static96.anIntArray137, arg5, local5, arg3, local13, arg4, local11);
		}
	}
}
