import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class1_Sub1_Sub12_Sub3_Sub1 extends Class1_Sub1_Sub12_Sub3 {

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub12_Sub3_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class1_Sub1_Sub12_Sub3_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(IIIIII)V")
	@Override
	protected void method3048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static150.anInt4227;
		@Pc(9) int local9 = Static150.anInt4227 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static150.anInt4225) {
			local20 = Static150.anInt4225 - arg2;
			arg4 -= local20;
			arg2 = Static150.anInt4225;
			local13 = local20 * arg3;
			local5 += local20 * Static150.anInt4227;
		}
		if (arg2 + arg4 > Static150.anInt4228) {
			arg4 -= arg2 + arg4 - Static150.anInt4228;
		}
		if (arg1 < Static150.anInt4229) {
			local20 = Static150.anInt4229 - arg1;
			arg3 -= local20;
			arg1 = Static150.anInt4229;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static150.anInt4224) {
			local20 = arg1 + arg3 - Static150.anInt4224;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static136.method3054(Static150.anIntArray586, super.aByteArrayArray11[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIII)V")
	@Override
	protected void method3061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static150.anInt4227;
		@Pc(9) int local9 = Static150.anInt4227 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static150.anInt4225) {
			local20 = Static150.anInt4225 - arg2;
			arg4 -= local20;
			arg2 = Static150.anInt4225;
			local13 = local20 * arg3;
			local5 += local20 * Static150.anInt4227;
		}
		if (arg2 + arg4 > Static150.anInt4228) {
			arg4 -= arg2 + arg4 - Static150.anInt4228;
		}
		if (arg1 < Static150.anInt4229) {
			local20 = Static150.anInt4229 - arg1;
			arg3 -= local20;
			arg1 = Static150.anInt4229;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static150.anInt4224) {
			local20 = arg1 + arg3 - Static150.anInt4224;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static136.method3051(Static150.anIntArray586, super.aByteArrayArray11[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}
}
