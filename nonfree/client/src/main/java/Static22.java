import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!d", name = "r", descriptor = "Lclient!af;")
	public static Class5 aClass5_334 = Static45.method1937("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!d", name = "w", descriptor = "I")
	public static int anInt716 = 0;

	@OriginalMember(owner = "client!d", name = "F", descriptor = "Lclient!af;")
	public static Class5 aClass5_335 = Static45.method1937("ams");

	@OriginalMember(owner = "client!d", name = "I", descriptor = "[I")
	public static int[] anIntArray85 = new int[128];

	@OriginalMember(owner = "client!d", name = "K", descriptor = "I")
	public static int anInt728 = 0;

	@OriginalMember(owner = "client!d", name = "L", descriptor = "Lclient!af;")
	public static Class5 aClass5_336 = Static45.method1937(")3");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method507() {
		aClass5_336 = null;
		anIntArray85 = null;
		aClass5_335 = null;
		aClass5_334 = null;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public static void method513() {
		Static79.aBoolean64 = true;
		Static107.aBoolean103 = true;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(JB)V")
	public static void method514(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static44.aClass1_Sub20_Sub1_1.method2108(47);
			Static44.aClass1_Sub20_Sub1_1.method2078(arg0);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIBI)V")
	public static void method524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class1_Sub16 local11 = (Class1_Sub16) Static38.aClass53_7.method1442(); local11 != null; local11 = (Class1_Sub16) Static38.aClass53_7.method1450()) {
			if (local11.anInt2137 != -1 || local11.anIntArray329 != null) {
				@Pc(22) int local22 = 0;
				if (local11.anInt2142 < arg1) {
					local22 = arg1 - local11.anInt2142;
				} else if (arg1 < local11.anInt2140) {
					local22 = local11.anInt2140 - arg1;
				}
				if (local11.anInt2135 < arg2) {
					local22 += arg2 - local11.anInt2135;
				} else if (local11.anInt2144 > arg2) {
					local22 += local11.anInt2144 - arg2;
				}
				if (local11.anInt2147 < local22 - 64 || Static27.anInt844 == 0 || local11.anInt2132 != arg0) {
					if (local11.aClass1_Sub1_Sub2_3 != null) {
						Static122.aClass1_Sub1_Sub1_2.method37(local11.aClass1_Sub1_Sub2_3);
						local11.aClass1_Sub1_Sub2_3 = null;
					}
					if (local11.aClass1_Sub1_Sub2_2 != null) {
						Static122.aClass1_Sub1_Sub1_2.method37(local11.aClass1_Sub1_Sub2_2);
						local11.aClass1_Sub1_Sub2_2 = null;
					}
				} else {
					local22 -= 64;
					if (local22 < 0) {
						local22 = 0;
					}
					@Pc(143) int local143 = (local11.anInt2147 - local22) * Static27.anInt844 / local11.anInt2147;
					if (local11.aClass1_Sub1_Sub2_3 != null) {
						local11.aClass1_Sub1_Sub2_3.method977(local143);
					} else if (local11.anInt2137 >= 0) {
						@Pc(158) Class37 local158 = Static134.method1005(Static38.aClass41_Sub1_5, local11.anInt2137, 0);
						if (local158 != null) {
							@Pc(165) Class1_Sub9_Sub1 local165 = local158.method1007().method2191(Static104.aClass4_1);
							@Pc(170) Class1_Sub1_Sub2 local170 = Static133.method988(local165, local143);
							local170.method980(-1);
							Static122.aClass1_Sub1_Sub1_2.method38(local170);
							local11.aClass1_Sub1_Sub2_3 = local170;
						}
					}
					if (local11.aClass1_Sub1_Sub2_2 != null) {
						local11.aClass1_Sub1_Sub2_2.method977(local143);
						if (!local11.aClass1_Sub1_Sub2_2.method2226()) {
							local11.aClass1_Sub1_Sub2_2 = null;
						}
					} else if (local11.anIntArray329 != null && (local11.anInt2146 -= arg3) <= 0) {
						@Pc(221) int local221 = (int) (Math.random() * (double) local11.anIntArray329.length);
						@Pc(229) Class37 local229 = Static134.method1005(Static38.aClass41_Sub1_5, local11.anIntArray329[local221], 0);
						if (local229 != null) {
							@Pc(236) Class1_Sub9_Sub1 local236 = local229.method1007().method2191(Static104.aClass4_1);
							@Pc(241) Class1_Sub1_Sub2 local241 = Static133.method988(local236, local143);
							local241.method980(0);
							Static122.aClass1_Sub1_Sub1_2.method38(local241);
							local11.aClass1_Sub1_Sub2_2 = local241;
							local11.anInt2146 = (int) ((double) (local11.anInt2145 - local11.anInt2133) * Math.random()) + local11.anInt2133;
						}
					}
				}
			}
		}
	}
}
