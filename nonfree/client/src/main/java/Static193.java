import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "Lclient!ip;")
	public static final Class111 aClass111_3 = new Class111("", 12);

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
	public static int anInt3509 = 0;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "Lclient!la;")
	public static final Class136 aClass136_96 = new Class136(26, 8);

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "[B")
	public static final byte[] aByteArray66 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BIILclient!kv;II)V")
	public static void method3012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub29 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt3787 == -1 && arg2.anIntArray252 == null) {
			return;
		}
		@Pc(20) int local20 = 0;
		@Pc(28) int local28 = arg2.anInt3790 * Static39.aClass79_Sub1_1.anInt2163 >> 8;
		if (arg2.anInt3789 < arg1) {
			local20 = arg1 - arg2.anInt3789;
		} else if (arg1 < arg2.anInt3783) {
			local20 = arg2.anInt3783 - arg1;
		}
		if (arg0 > arg2.anInt3788) {
			local20 += arg0 - arg2.anInt3788;
		} else if (arg2.anInt3781 > arg0) {
			local20 += arg2.anInt3781 - arg0;
		}
		if (arg2.anInt3778 == 0 || local20 - 64 > arg2.anInt3778 || Static39.aClass79_Sub1_1.anInt2163 == 0 || arg2.anInt3791 != arg3) {
			if (arg2.aClass3_Sub1_Sub3_2 != null) {
				Static440.aClass3_Sub1_Sub2_2.method5098(arg2.aClass3_Sub1_Sub3_2);
				arg2.aClass3_Sub1_Sub3_2 = null;
			}
			if (arg2.aClass3_Sub1_Sub3_1 != null) {
				Static440.aClass3_Sub1_Sub2_2.method5098(arg2.aClass3_Sub1_Sub3_1);
				arg2.aClass3_Sub1_Sub3_1 = null;
			}
			return;
		}
		local20 -= 64;
		if (local20 < 0) {
			local20 = 0;
		}
		@Pc(153) int local153 = local28 * (arg2.anInt3778 - local20) / arg2.anInt3778;
		if (arg2.aClass3_Sub1_Sub3_2 != null) {
			arg2.aClass3_Sub1_Sub3_2.method5353(local153);
		} else if (arg2.anInt3787 >= 0) {
			@Pc(168) Class204 local168 = Static472.method4861(Static156.aClass250_45, arg2.anInt3787, 0);
			if (local168 != null) {
				@Pc(175) Class3_Sub28_Sub1 local175 = local168.method4862().method3073(Static459.aClass164_2);
				@Pc(180) Class3_Sub1_Sub3 local180 = Static474.method5372(local175, local153);
				local180.method5358(-1);
				Static440.aClass3_Sub1_Sub2_2.method5094(local180);
				arg2.aClass3_Sub1_Sub3_2 = local180;
			}
		}
		if (arg2.aClass3_Sub1_Sub3_1 != null) {
			arg2.aClass3_Sub1_Sub3_1.method5353(local153);
			if (!arg2.aClass3_Sub1_Sub3_1.method6287()) {
				arg2.aClass3_Sub1_Sub3_1 = null;
			}
		} else if (arg2.anIntArray252 != null && (arg2.anInt3779 -= arg4) <= 0) {
			@Pc(233) int local233 = (int) (Math.random() * (double) arg2.anIntArray252.length);
			@Pc(241) Class204 local241 = Static472.method4861(Static156.aClass250_45, arg2.anIntArray252[local233], 0);
			if (local241 != null) {
				@Pc(248) Class3_Sub28_Sub1 local248 = local241.method4862().method3073(Static459.aClass164_2);
				@Pc(253) Class3_Sub1_Sub3 local253 = Static474.method5372(local248, local153);
				local253.method5358(0);
				Static440.aClass3_Sub1_Sub2_2.method5094(local253);
				arg2.aClass3_Sub1_Sub3_1 = local253;
				arg2.anInt3779 = arg2.anInt3792 + (int) (Math.random() * (double) (arg2.anInt3782 - arg2.anInt3792));
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIII)V")
	public static void method3013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class3_Sub3_Sub4 local16 = Static281.method3883(8, arg3);
		local16.method1003();
		local16.anInt972 = arg2;
		local16.anInt970 = arg1;
		local16.anInt974 = arg0;
	}
}
