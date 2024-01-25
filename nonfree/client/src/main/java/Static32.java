import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bca", name = "k", descriptor = "I")
	public static int anInt1172;

	@OriginalMember(owner = "client!bca", name = "f", descriptor = "I")
	public static int anInt1167 = 0;

	@OriginalMember(owner = "client!bca", name = "i", descriptor = "I")
	public static int anInt1170 = 0;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!we;Lclient!vh;B)Lclient!ph;")
	public static Class4_Sub39 method999(@OriginalArg(0) Class356 arg0, @OriginalArg(1) Class344 arg1) {
		@Pc(8) Class4_Sub39 local8 = Static423.method6346();
		local8.aClass344_67 = arg1;
		local8.anInt7831 = arg1.anInt10156;
		if (local8.anInt7831 == -1) {
			local8.aClass4_Sub13_Sub2_1 = new Class4_Sub13_Sub2(260);
		} else if (local8.anInt7831 == -2) {
			local8.aClass4_Sub13_Sub2_1 = new Class4_Sub13_Sub2(10000);
		} else if (local8.anInt7831 <= 18) {
			local8.aClass4_Sub13_Sub2_1 = new Class4_Sub13_Sub2(20);
		} else if (local8.anInt7831 <= 98) {
			local8.aClass4_Sub13_Sub2_1 = new Class4_Sub13_Sub2(100);
		} else {
			local8.aClass4_Sub13_Sub2_1 = new Class4_Sub13_Sub2(260);
		}
		local8.aClass4_Sub13_Sub2_1.method7058(arg0);
		local8.aClass4_Sub13_Sub2_1.method7060(local8.aClass344_67.method7893());
		local8.anInt7832 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!la;)V")
	public static void method1000(@OriginalArg(0) Class45 arg0) {
		Static386.aClass45_6 = arg0;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1001(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static270.anInt5671 >= 200 && !Static56.aBoolean120 || Static270.anInt5671 >= 200) {
			Static412.method6231(Static223.aClass152_14.method3624(Static142.anInt3088));
			local30 = Static223.aClass152_15.method3624(Static142.anInt3088);
			if (local30 != null) {
				Static412.method6231(local30);
			}
			return;
		}
		local30 = Static377.method5881(arg0);
		if (local30 == null) {
			return;
		}
		for (@Pc(46) int local46 = 0; local46 < Static270.anInt5671; local46++) {
			@Pc(54) String local54 = Static377.method5881(Static94.aStringArray7[local46]);
			if (local54 != null && local54.equals(local30)) {
				Static412.method6231(arg0 + Static223.aClass152_42.method3624(Static142.anInt3088));
				return;
			}
			if (Static348.aStringArray25[local46] != null) {
				@Pc(85) String local85 = Static377.method5881(Static348.aStringArray25[local46]);
				if (local85 != null && local85.equals(local30)) {
					Static412.method6231(arg0 + Static223.aClass152_42.method3624(Static142.anInt3088));
					return;
				}
			}
		}
		for (@Pc(120) int local120 = 0; local120 < Static577.anInt10405; local120++) {
			@Pc(128) String local128 = Static377.method5881(Static154.aStringArray13[local120]);
			if (local128 != null && local128.equals(local30)) {
				Static412.method6231(Static223.aClass152_47.method3624(Static142.anInt3088) + arg0 + Static223.aClass152_48.method3624(Static142.anInt3088));
				return;
			}
			if (Static320.aStringArray23[local120] != null) {
				@Pc(164) String local164 = Static377.method5881(Static320.aStringArray23[local120]);
				if (local164 != null && local164.equals(local30)) {
					Static412.method6231(Static223.aClass152_47.method3624(Static142.anInt3088) + arg0 + Static223.aClass152_48.method3624(Static142.anInt3088));
					return;
				}
			}
		}
		if (Static377.method5881(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aString87).equals(local30)) {
			Static412.method6231(Static223.aClass152_45.method3624(Static142.anInt3088));
		} else {
			@Pc(218) Class4_Sub39 local218 = method999(Static402.aClass356_1, Static405.aClass344_69);
			local218.aClass4_Sub13_Sub2_1.method7052(Static393.method6014(arg0));
			local218.aClass4_Sub13_Sub2_1.method7002(arg0);
			Static50.method1166(local218);
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IB)Z")
	public static boolean method1002(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}
}
