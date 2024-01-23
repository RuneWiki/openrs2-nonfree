import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class4_Sub2_Sub9_Sub2 extends Class4_Sub2_Sub9 {

	@OriginalMember(owner = "client!ti", name = "M", descriptor = "[[B")
	private byte[][] aByteArrayArray14 = new byte[256][];

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "([B)V")
	public Class4_Sub2_Sub9_Sub2(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class4_Sub2_Sub9_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray14 = arg5;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method4103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static258.anInt5069;
		@Pc(9) int local9 = Static258.anInt5069 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static258.anInt5065) {
			local20 = Static258.anInt5065 - arg2;
			arg4 -= local20;
			arg2 = Static258.anInt5065;
			local13 = local20 * arg3;
			local5 += local20 * Static258.anInt5069;
		}
		if (arg2 + arg4 > Static258.anInt5068) {
			arg4 -= arg2 + arg4 - Static258.anInt5068;
		}
		if (arg1 < Static258.anInt5067) {
			local20 = Static258.anInt5067 - arg1;
			arg3 -= local20;
			arg1 = Static258.anInt5067;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static258.anInt5066) {
			local20 = arg1 + arg3 - Static258.anInt5066;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (Static258.anIntArray400 == null) {
			Static319.method4112(Static258.anIntArray399, this.aByteArrayArray14[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static319.method4111(Static258.anIntArray399, this.aByteArrayArray14[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, Static258.anIntArray400, Static258.anIntArray398);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method4098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static258.anInt5069;
		@Pc(9) int local9 = Static258.anInt5069 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static258.anInt5065) {
			local20 = Static258.anInt5065 - arg2;
			arg4 -= local20;
			arg2 = Static258.anInt5065;
			local13 = local20 * arg3;
			local5 += local20 * Static258.anInt5069;
		}
		if (arg2 + arg4 > Static258.anInt5068) {
			arg4 -= arg2 + arg4 - Static258.anInt5068;
		}
		if (arg1 < Static258.anInt5067) {
			local20 = Static258.anInt5067 - arg1;
			arg3 -= local20;
			arg1 = Static258.anInt5067;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static258.anInt5066) {
			local20 = arg1 + arg3 - Static258.anInt5066;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static319.method4113(Static258.anIntArray399, this.aByteArrayArray14[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}
}
