import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class4_Sub3_Sub5_Sub2 extends Class4_Sub3_Sub5 {

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "[[B")
	private byte[][] aByteArrayArray18 = new byte[256][];

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class4_Sub3_Sub5_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray18 = arg5;
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([B)V")
	public Class4_Sub3_Sub5_Sub2(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method2271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static270.anInt5189;
		@Pc(9) int local9 = Static270.anInt5189 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static270.anInt5184) {
			local20 = Static270.anInt5184 - arg2;
			arg4 -= local20;
			arg2 = Static270.anInt5184;
			local13 = local20 * arg3;
			local5 += local20 * Static270.anInt5189;
		}
		if (arg2 + arg4 > Static270.anInt5188) {
			arg4 -= arg2 + arg4 - Static270.anInt5188;
		}
		if (arg1 < Static270.anInt5186) {
			local20 = Static270.anInt5186 - arg1;
			arg3 -= local20;
			arg1 = Static270.anInt5186;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static270.anInt5187) {
			local20 = arg1 + arg3 - Static270.anInt5187;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static321.method2287(Static270.anIntArray561, this.aByteArrayArray18[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method2260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static270.anInt5189;
		@Pc(9) int local9 = Static270.anInt5189 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static270.anInt5184) {
			local20 = Static270.anInt5184 - arg2;
			arg4 -= local20;
			arg2 = Static270.anInt5184;
			local13 = local20 * arg3;
			local5 += local20 * Static270.anInt5189;
		}
		if (arg2 + arg4 > Static270.anInt5188) {
			arg4 -= arg2 + arg4 - Static270.anInt5188;
		}
		if (arg1 < Static270.anInt5186) {
			local20 = Static270.anInt5186 - arg1;
			arg3 -= local20;
			arg1 = Static270.anInt5186;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static270.anInt5187) {
			local20 = arg1 + arg3 - Static270.anInt5187;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (Static270.anIntArray559 == null) {
			Static321.method2289(Static270.anIntArray561, this.aByteArrayArray18[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static321.method2288(Static270.anIntArray561, this.aByteArrayArray18[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, Static270.anIntArray559, Static270.anIntArray560);
		}
	}
}
