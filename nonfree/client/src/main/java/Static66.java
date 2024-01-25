import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "Lclient!tga;")
	public static Class106 aClass106_1;

	@OriginalMember(owner = "client!bv", name = "i", descriptor = "I")
	public static int anInt1152 = 0;

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "Z")
	public static boolean aBoolean131 = false;

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)V")
	public static void method993() {
		if (!Static345.method4787()) {
			return;
		}
		if (Static371.aStringArray22 == null) {
			Static204.method2897();
		}
		Static599.anInt9311 = 0;
		Static359.aBoolean487 = true;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILclient!et;)V")
	public static void method997(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (Static70.aClass260_1 == null) {
			return;
		}
		try {
			Static70.aClass260_1.method6257(0L);
			Static70.aClass260_1.method6263(24, arg0, arg1.aByteArray111);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "()V")
	public static void method998() {
		for (@Pc(1) int local1 = Static726.anInt11286; local1 < Static97.anInt1761; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static372.anInt5930; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static545.anInt8590; local7++) {
					@Pc(16) Class311 local16 = Static632.aClass311ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class4_Sub2_Sub3 local21 = local16.aClass4_Sub2_Sub3_2;
						@Pc(24) Class4_Sub2_Sub3 local24 = local16.aClass4_Sub2_Sub3_1;
						if (local21 != null && local21.method8968()) {
							Static730.method8701(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8968()) {
								Static730.method8701(local24, local1, local4, local7, 1, 1);
								local24.method8967(local21, 0, Static689.aClass145_16, 0, false, 0, (byte) 89);
								local24.method8973();
							}
							local21.method8973();
						}
						for (@Pc(76) Class142 local76 = local16.aClass142_2; local76 != null; local76 = local76.aClass142_1) {
							@Pc(80) Class4_Sub2_Sub1 local80 = local76.aClass4_Sub2_Sub1_1;
							if (local80 != null && local80.method8968()) {
								Static730.method8701(local80, local1, local4, local7, local80.aShort128 + 1 - local80.aShort130, local80.aShort129 - local80.aShort127 + 1);
								local80.method8973();
							}
						}
						@Pc(120) Class4_Sub2_Sub2 local120 = local16.aClass4_Sub2_Sub2_1;
						if (local120 != null && local120.method8968()) {
							Static103.method9370(local120, local1, local4, local7);
							local120.method8973();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(III)B")
	public static byte method999(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)Lclient!dv;")
	public static Class88_Sub1 method1001() {
		Static55.anInt901 = 0;
		return Static149.method2163();
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(III)V")
	public static void method1004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class311 local7 = Static632.aClass311ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static192.method2751(local7.aClass4_Sub2_Sub3_2);
		Static192.method2751(local7.aClass4_Sub2_Sub3_1);
		if (local7.aClass4_Sub2_Sub3_2 != null) {
			local7.aClass4_Sub2_Sub3_2 = null;
		}
		if (local7.aClass4_Sub2_Sub3_1 != null) {
			local7.aClass4_Sub2_Sub3_1 = null;
		}
	}
}
