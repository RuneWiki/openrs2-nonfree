import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "F")
	public static float aFloat135;

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
	public static int anInt7391;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
	public static int anInt7390 = 0;

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "Z")
	public static boolean aBoolean518 = false;

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "[I")
	public static final int[] anIntArray393 = new int[13];

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
	public static int anInt7394 = 1;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
	public static void method6531() {
		@Pc(16) Class14_Sub21_Sub2 local16 = Static277.aClass347_2.aClass14_Sub21_Sub2_1;
		while (local16.method7765(Static277.aClass347_2.anInt9628) >= 15) {
			@Pc(28) int local28 = local16.method7764(15);
			if (local28 == 32767) {
				break;
			}
			@Pc(35) boolean local35 = false;
			@Pc(42) Class14_Sub44 local42 = (Class14_Sub44) Static100.aClass125_9.method2630((long) local28);
			@Pc(48) Class4_Sub3_Sub3_Sub3_Sub1 local48;
			if (local42 == null) {
				local48 = new Class4_Sub3_Sub3_Sub3_Sub1();
				local48.anInt3238 = local28;
				local42 = new Class14_Sub44(local48);
				Static100.aClass125_9.method2626(local42, (long) local28);
				local35 = true;
				Static28.aClass14_Sub44Array2[Static549.anInt1216++] = local42;
			}
			local48 = local42.aClass4_Sub3_Sub3_Sub3_Sub1_2;
			Static253.anIntArray241[Static662.anInt10795++] = local28;
			local48.anInt3285 = Static522.anInt8991;
			if (local48.aClass362_1 != null && local48.aClass362_1.method8644()) {
				Static55.method995(local48);
			}
			@Pc(106) int local106 = local16.method7764(1);
			@Pc(117) int local117 = (local16.method7764(3) + 4 & 0x25400007) << 11;
			@Pc(122) int local122 = local16.method7764(2);
			@Pc(127) int local127 = local16.method7764(1);
			if (local127 == 1) {
				Static551.anIntArray477[Static185.anInt3047++] = local28;
			}
			@Pc(145) int local145 = local16.method7764(5);
			if (local145 > 15) {
				local145 -= 32;
			}
			@Pc(156) int local156 = local16.method7764(5);
			if (local156 > 15) {
				local156 -= 32;
			}
			local48.method2572(Static152.aClass61_1.method1230(local16.method7764(14)));
			local48.method2882(local48.aClass362_1.anInt10069);
			local48.anInt3295 = local48.aClass362_1.anInt10063 << 3;
			if (local35) {
				local48.method2873(local117, true);
			}
			local48.method2571(local48.method2870(0), local122, local156 + Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray200[0], local106 == 1, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray201[0] + local145);
			if (local48.aClass362_1.method8644()) {
				Static399.method6096(local48.anIntArray200[0], local48.aByte146, 0, (Class4_Sub3_Sub3_Sub3_Sub2) null, local48, (Class128) null, local48.anIntArray201[0]);
			}
		}
		local16.method7768();
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
	public static void method6532() {
		for (@Pc(1) int local1 = 0; local1 < 100; local1++) {
			Static415.aBooleanArray17[local1] = true;
		}
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
	public static void method6533() {
		Static332.aBoolean410 = true;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)Z")
	public static boolean method6534(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method6535(@OriginalArg(0) Class144 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (Static656.aBoolean741) {
			local5 = Static532.method7876();
			local7 = Static276.method4674();
		}
		arg0.KA(local5, local7, local5 + Static563.anInt4939, local7 + 350);
		arg0.aa(local5, local7, Static563.anInt4939, 350, Static417.anInt7162 << 24 | 0x332277, 1);
		Static140.method2127(local5 + Static563.anInt4939, local5, local7 + 350, local7);
		@Pc(59) int local59 = 350 / Static590.anInt9759;
		@Pc(65) int local65;
		if (Static46.anInt765 > 0) {
			local65 = 342 - Static590.anInt9759;
			@Pc(75) int local75 = local59 * local65 / (local59 + Static46.anInt765 - 1);
			@Pc(77) int local77 = 4;
			if (Static46.anInt765 > 1) {
				local77 = (local65 - local75) * (-Static411.anInt7100 + Static46.anInt765 - 1) / (Static46.anInt765 - 1) + 4;
			}
			arg0.aa(local5 + Static563.anInt4939 - 16, local77 + local7, 12, local75, Static417.anInt7162 << 24 | 0x332277, 2);
			for (@Pc(120) int local120 = Static411.anInt7100; local59 + Static411.anInt7100 > local120 && local120 < Static46.anInt765; local120++) {
				@Pc(128) String[] local128 = Static407.method2868(Static658.aStringArray47[local120], '\b');
				@Pc(135) int local135 = (Static563.anInt4939 - 24) / local128.length;
				for (@Pc(137) int local137 = 0; local137 < local128.length; local137++) {
					@Pc(145) int local145 = local135 * local137 + 8;
					arg0.KA(local5 + local145, local7, local135 + local5 + local145 - 8, local7 + 350);
					Static446.aClass68_8.method9422(Static367.method5510(local128[local137]), local7 + 350 - (local120 - Static411.anInt7100) * Static590.anInt9759 - Static372.aClass350_5.anInt9699 - Static514.anInt8874 - 2, -16777216, local5 + local145, -1);
				}
			}
		}
		Static474.aClass68_9.method9429(-1, local5 + Static563.anInt4939 - 25, local7 + 350 - 20, -16777216, "Build: 661");
		arg0.KA(local5, local7, local5 + Static563.anInt4939, local7 + 350);
		arg0.method6949(-1, local5, 24805, Static563.anInt4939, local7 + 350 - Static514.anInt8874);
		Static255.aClass68_4.method9422("--> " + Static367.method5510(Static434.aString85), local7 + 350 - Static497.aClass350_9.anInt9699 - 1, -16777216, local5 + 10, -1);
		if (!Static271.aBoolean373) {
			return;
		}
		local65 = -1;
		if (Static530.anInt9105 % 30 > 15) {
			local65 = 16777215;
		}
		arg0.method6925(local65, local7 + 350 - Static497.aClass350_9.anInt9699 - 11, 12, Static497.aClass350_9.method8356("--> " + Static367.method5510(Static434.aString85).substring(0, Static340.anInt5803)) + local5 + 10);
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)Ljava/lang/String;")
	public static String method6537() {
		if (Static455.aBoolean533 || Static379.aClass14_Sub2_Sub20_3 == null) {
			return "";
		} else if ((Static379.aClass14_Sub2_Sub20_3.aString113 == null || Static379.aClass14_Sub2_Sub20_3.aString113.length() == 0) && Static379.aClass14_Sub2_Sub20_3.aString112 != null && Static379.aClass14_Sub2_Sub20_3.aString112.length() > 0) {
			return Static379.aClass14_Sub2_Sub20_3.aString112;
		} else {
			return Static379.aClass14_Sub2_Sub20_3.aString113;
		}
	}
}
