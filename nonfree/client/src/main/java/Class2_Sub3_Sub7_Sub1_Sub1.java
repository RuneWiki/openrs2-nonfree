import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class2_Sub3_Sub7_Sub1_Sub1 extends Class2_Sub3_Sub7_Sub1 {

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([B)V")
	public Class2_Sub3_Sub7_Sub1_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class2_Sub3_Sub7_Sub1_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIII)V")
	@Override
	protected void method899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static217.anInt4732;
		@Pc(9) int local9 = Static217.anInt4732 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static217.anInt4734) {
			local20 = Static217.anInt4734 - arg2;
			arg4 -= local20;
			arg2 = Static217.anInt4734;
			local13 = local20 * arg3;
			local5 += local20 * Static217.anInt4732;
		}
		if (arg2 + arg4 > Static217.anInt4730) {
			arg4 -= arg2 + arg4 - Static217.anInt4730;
		}
		if (arg1 < Static217.anInt4735) {
			local20 = Static217.anInt4735 - arg1;
			arg3 -= local20;
			arg1 = Static217.anInt4735;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static217.anInt4731) {
			local20 = arg1 + arg3 - Static217.anInt4731;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static200.method3567(arg3, local9, local5, local13, super.aByteArrayArray7[arg0], Static217.anIntArray752, arg5, arg4, arg6, local11);
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIIIII)V")
	@Override
	protected void method898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static217.anInt4732;
		@Pc(9) int local9 = Static217.anInt4732 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static217.anInt4734) {
			local20 = Static217.anInt4734 - arg2;
			arg4 -= local20;
			arg2 = Static217.anInt4734;
			local13 = local20 * arg3;
			local5 += local20 * Static217.anInt4732;
		}
		if (arg2 + arg4 > Static217.anInt4730) {
			arg4 -= arg2 + arg4 - Static217.anInt4730;
		}
		if (arg1 < Static217.anInt4735) {
			local20 = Static217.anInt4735 - arg1;
			arg3 -= local20;
			arg1 = Static217.anInt4735;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static217.anInt4731) {
			local20 = arg1 + arg3 - Static217.anInt4731;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static77.method1313(arg4, local11, local9, local13, arg5, super.aByteArrayArray7[arg0], Static217.anIntArray752, local5, arg3);
		}
	}
}
