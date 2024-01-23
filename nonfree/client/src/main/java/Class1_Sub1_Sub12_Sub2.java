import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class1_Sub1_Sub12_Sub2 extends Class1_Sub1_Sub12 {

	@OriginalMember(owner = "client!vf", name = "P", descriptor = "[[B")
	private byte[][] aByteArrayArray17 = new byte[256][];

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class1_Sub1_Sub12_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray17 = arg5;
	}

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub12_Sub2(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method4430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static41.anInt829;
		@Pc(9) int local9 = Static41.anInt829 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static41.anInt824) {
			local20 = Static41.anInt824 - arg2;
			arg4 -= local20;
			arg2 = Static41.anInt824;
			local13 = local20 * arg3;
			local5 += local20 * Static41.anInt829;
		}
		if (arg2 + arg4 > Static41.anInt827) {
			arg4 -= arg2 + arg4 - Static41.anInt827;
		}
		if (arg1 < Static41.anInt828) {
			local20 = Static41.anInt828 - arg1;
			arg3 -= local20;
			arg1 = Static41.anInt828;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static41.anInt825) {
			local20 = arg1 + arg3 - Static41.anInt825;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static326.method4445(Static41.anIntArray62, this.aByteArrayArray17[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method4419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static41.anInt829;
		@Pc(9) int local9 = Static41.anInt829 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static41.anInt824) {
			local20 = Static41.anInt824 - arg2;
			arg4 -= local20;
			arg2 = Static41.anInt824;
			local13 = local20 * arg3;
			local5 += local20 * Static41.anInt829;
		}
		if (arg2 + arg4 > Static41.anInt827) {
			arg4 -= arg2 + arg4 - Static41.anInt827;
		}
		if (arg1 < Static41.anInt828) {
			local20 = Static41.anInt828 - arg1;
			arg3 -= local20;
			arg1 = Static41.anInt828;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static41.anInt825) {
			local20 = arg1 + arg3 - Static41.anInt825;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (Static41.anIntArray61 == null) {
			Static326.method4443(Static41.anIntArray62, this.aByteArrayArray17[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static326.method4444(Static41.anIntArray62, this.aByteArrayArray17[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, Static41.anIntArray61, Static41.anIntArray60);
		}
	}
}
