import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cd", name = "O", descriptor = "Lclient!bj;")
	public static Class36 aClass36_1;

	@OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
	public static int anInt1551;

	@OriginalMember(owner = "client!cd", name = "K", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_20 = new Class90(88, -2);

	@OriginalMember(owner = "client!cd", name = "N", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_21 = new Class90(19, 7);

	@OriginalMember(owner = "client!cd", name = "R", descriptor = "Lclient!lfa;")
	public static final Class195 aClass195_1 = new Class195(14, 1);

	@OriginalMember(owner = "client!cd", name = "U", descriptor = "Lclient!lfa;")
	public static final Class195 aClass195_2 = new Class195(15, 4);

	@OriginalMember(owner = "client!cd", name = "V", descriptor = "Lclient!lfa;")
	public static final Class195 aClass195_3 = new Class195(16, -2);

	@OriginalMember(owner = "client!cd", name = "W", descriptor = "Lclient!lfa;")
	public static final Class195 aClass195_4 = new Class195(17, 0);

	@OriginalMember(owner = "client!cd", name = "X", descriptor = "Lclient!lfa;")
	public static final Class195 aClass195_5 = new Class195(18, -2);

	@OriginalMember(owner = "client!cd", name = "Y", descriptor = "Lclient!lfa;")
	public static final Class195 aClass195_6 = new Class195(19, -2);

	@OriginalMember(owner = "client!cd", name = "Z", descriptor = "Lclient!lfa;")
	public static final Class195 aClass195_7 = new Class195(20, 6);

	@OriginalMember(owner = "client!cd", name = "ab", descriptor = "Lclient!lfa;")
	public static final Class195 aClass195_8 = new Class195(21, 9);

	@OriginalMember(owner = "client!cd", name = "bb", descriptor = "Lclient!lfa;")
	public static final Class195 aClass195_9 = new Class195(22, -2);

	@OriginalMember(owner = "client!cd", name = "cb", descriptor = "Lclient!lfa;")
	public static final Class195 aClass195_10 = new Class195(23, 4);

	@OriginalMember(owner = "client!cd", name = "db", descriptor = "Lclient!lfa;")
	public static final Class195 aClass195_11 = new Class195(24, -1);

	@OriginalMember(owner = "client!cd", name = "eb", descriptor = "Lclient!lfa;")
	public static final Class195 aClass195_12 = new Class195(25, -2);

	@OriginalMember(owner = "client!cd", name = "fb", descriptor = "Lclient!lfa;")
	public static final Class195 aClass195_13 = new Class195(26, 0);

	@OriginalMember(owner = "client!cd", name = "gb", descriptor = "Lclient!lfa;")
	public static final Class195 aClass195_14 = new Class195(27, 0);

	@OriginalMember(owner = "client!cd", name = "ib", descriptor = "I")
	public static int anInt1554 = -1;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZZLjava/lang/String;)V")
	public static void method1348(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static577.anInt10405 >= 100) {
			Static412.method6231(Static223.aClass152_43.method3624(Static142.anInt3088));
			return;
		}
		@Pc(25) String local25 = Static377.method5881(arg1);
		if (local25 == null) {
			return;
		}
		@Pc(69) String local69;
		for (@Pc(30) int local30 = 0; local30 < Static577.anInt10405; local30++) {
			@Pc(38) String local38 = Static377.method5881(Static154.aStringArray13[local30]);
			if (local38 != null && local38.equals(local25)) {
				Static412.method6231(arg1 + Static223.aClass152_44.method3624(Static142.anInt3088));
				return;
			}
			if (Static320.aStringArray23[local30] != null) {
				local69 = Static377.method5881(Static320.aStringArray23[local30]);
				if (local69 != null && local69.equals(local25)) {
					Static412.method6231(arg1 + Static223.aClass152_44.method3624(Static142.anInt3088));
					return;
				}
			}
		}
		for (@Pc(96) int local96 = 0; local96 < Static270.anInt5671; local96++) {
			local69 = Static377.method5881(Static94.aStringArray7[local96]);
			if (local69 != null && local69.equals(local25)) {
				Static412.method6231(Static223.aClass152_49.method3624(Static142.anInt3088) + arg1 + Static223.aClass152_50.method3624(Static142.anInt3088));
				return;
			}
			if (Static348.aStringArray25[local96] != null) {
				@Pc(140) String local140 = Static377.method5881(Static348.aStringArray25[local96]);
				if (local140 != null && local140.equals(local25)) {
					Static412.method6231(Static223.aClass152_49.method3624(Static142.anInt3088) + arg1 + Static223.aClass152_50.method3624(Static142.anInt3088));
					return;
				}
			}
		}
		if (Static377.method5881(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aString87).equals(local25)) {
			Static412.method6231(Static223.aClass152_46.method3624(Static142.anInt3088));
			return;
		}
		@Pc(194) Class4_Sub39 local194 = Static32.method999(Static402.aClass356_1, Static180.aClass344_93);
		local194.aClass4_Sub13_Sub2_1.method7052(Static393.method6014(arg1) + 1);
		local194.aClass4_Sub13_Sub2_1.method7002(arg1);
		local194.aClass4_Sub13_Sub2_1.method7052(arg0 ? 1 : 0);
		Static50.method1166(local194);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)V")
	public static void method1349(@OriginalArg(1) int arg0) {
		@Pc(16) Class4_Sub6_Sub5 local16 = Static396.method6079(arg0, 4);
		local16.method2302();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[B)V")
	public static void method1350(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class4_Sub13 local15 = new Class4_Sub13(arg0);
		while (true) {
			while (true) {
				@Pc(19) int local19 = local15.method7004();
				if (local19 == 0) {
					return;
				}
				if (local19 == 1) {
					@Pc(29) int[] local29 = Static411.anIntArray444 = new int[6];
					local29[0] = local15.method7054();
					local29[1] = local15.method7054();
					local29[2] = local15.method7054();
					local29[3] = local15.method7054();
					local29[4] = local15.method7054();
					local29[5] = local15.method7054();
				} else {
					@Pc(76) int local76;
					@Pc(81) int local81;
					if (local19 == 4) {
						local76 = local15.method7004();
						Static292.anIntArray326 = new int[local76];
						for (local81 = 0; local81 < local76; local81++) {
							Static292.anIntArray326[local81] = local15.method7054();
							if (Static292.anIntArray326[local81] == 65535) {
								Static292.anIntArray326[local81] = -1;
							}
						}
					} else if (local19 == 5) {
						local76 = local15.method7004();
						Static153.anIntArray161 = new int[local76];
						for (local81 = 0; local81 < local76; local81++) {
							Static153.anIntArray161[local81] = local15.method7054();
							if (Static153.anIntArray161[local81] == 65535) {
								Static153.anIntArray161[local81] = -1;
							}
						}
					}
				}
			}
		}
	}
}
