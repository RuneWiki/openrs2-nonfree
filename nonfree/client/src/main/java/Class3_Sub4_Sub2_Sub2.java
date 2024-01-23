import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class3_Sub4_Sub2_Sub2 extends Class3_Sub4_Sub2 {

	@OriginalMember(owner = "client!qk", name = "X", descriptor = "[[B")
	private byte[][] aByteArrayArray99 = new byte[256][];

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class3_Sub4_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray99 = arg5;
	}

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "([B)V")
	public Class3_Sub4_Sub2_Sub2(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method3683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static143.anInt2745;
		@Pc(9) int local9 = Static143.anInt2745 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static143.anInt2746) {
			local20 = Static143.anInt2746 - arg2;
			arg4 -= local20;
			arg2 = Static143.anInt2746;
			local13 = local20 * arg3;
			local5 += local20 * Static143.anInt2745;
		}
		if (arg2 + arg4 > Static143.anInt2744) {
			arg4 -= arg2 + arg4 - Static143.anInt2744;
		}
		if (arg1 < Static143.anInt2748) {
			local20 = Static143.anInt2748 - arg1;
			arg3 -= local20;
			arg1 = Static143.anInt2748;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static143.anInt2747) {
			local20 = arg1 + arg3 - Static143.anInt2747;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (Static143.anIntArray318 == null) {
			Static323.method3713(Static143.anIntArray316, this.aByteArrayArray99[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static323.method3714(Static143.anIntArray316, this.aByteArrayArray99[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, Static143.anIntArray318, Static143.anIntArray317);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method3689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static143.anInt2745;
		@Pc(9) int local9 = Static143.anInt2745 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static143.anInt2746) {
			local20 = Static143.anInt2746 - arg2;
			arg4 -= local20;
			arg2 = Static143.anInt2746;
			local13 = local20 * arg3;
			local5 += local20 * Static143.anInt2745;
		}
		if (arg2 + arg4 > Static143.anInt2744) {
			arg4 -= arg2 + arg4 - Static143.anInt2744;
		}
		if (arg1 < Static143.anInt2748) {
			local20 = Static143.anInt2748 - arg1;
			arg3 -= local20;
			arg1 = Static143.anInt2748;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static143.anInt2747) {
			local20 = arg1 + arg3 - Static143.anInt2747;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static323.method3712(Static143.anIntArray316, this.aByteArrayArray99[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}
}
