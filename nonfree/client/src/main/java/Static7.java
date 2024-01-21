import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!b", name = "m", descriptor = "I")
	public static int anInt213;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "I")
	public static int anInt210 = 0;

	@OriginalMember(owner = "client!b", name = "i", descriptor = "Lclient!af;")
	private static Class5 aClass5_111 = Static45.method1937("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!b", name = "k", descriptor = "Lclient!af;")
	public static Class5 aClass5_112 = Static45.method1937("Weiter");

	@OriginalMember(owner = "client!b", name = "u", descriptor = "Lclient!af;")
	public static Class5 aClass5_113 = aClass5_111;

	@OriginalMember(owner = "client!b", name = "A", descriptor = "Lclient!af;")
	public static Class5 aClass5_114 = Static45.method1937("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!b", name = "M", descriptor = "Lclient!af;")
	public static Class5 aClass5_115 = Static45.method1937("k");

	@OriginalMember(owner = "client!b", name = "S", descriptor = "Z")
	public static volatile boolean aBoolean5 = true;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V")
	public static void method222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class53 local11 = Static8.aClass53ArrayArrayArray1[anInt213][arg0][arg1];
		if (local11 == null) {
			Static44.aClass68_1.method1855(anInt213, arg0, arg1);
			return;
		}
		@Pc(21) Class1_Sub3_Sub4_Sub3 local21 = null;
		@Pc(26) Class1_Sub3_Sub4_Sub3 local26 = (Class1_Sub3_Sub4_Sub3) local11.method1442();
		@Pc(28) int local28 = -99999999;
		while (local26 != null) {
			@Pc(34) Class1_Sub3_Sub16 local34 = Static56.method1022(local26.anInt643);
			@Pc(37) int local37 = local34.anInt2865;
			if (local34.anInt2857 == 1) {
				local37 *= local26.anInt641 + 1;
			}
			if (local37 > local28) {
				local21 = local26;
				local28 = local37;
			}
			local26 = (Class1_Sub3_Sub4_Sub3) local11.method1450();
		}
		if (local21 == null) {
			Static44.aClass68_1.method1855(anInt213, arg0, arg1);
			return;
		}
		local11.method1451(local21);
		local26 = (Class1_Sub3_Sub4_Sub3) local11.method1442();
		@Pc(87) Class1_Sub3_Sub4_Sub3 local87 = null;
		@Pc(95) int local95 = arg0 + (arg1 << 7) + 1610612736;
		@Pc(97) Class1_Sub3_Sub4_Sub3 local97 = null;
		while (local26 != null) {
			if (local21.anInt643 != local26.anInt643) {
				if (local97 == null) {
					local97 = local26;
				}
				if (local97.anInt643 != local26.anInt643 && local87 == null) {
					local87 = local26;
				}
			}
			local26 = (Class1_Sub3_Sub4_Sub3) local11.method1450();
		}
		Static44.aClass68_1.method1834(anInt213, arg0, arg1, Static102.method1746(arg1 * 128 + 64, anInt213, arg0 * 128 + 64), local21, local95, local97, local87);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BLclient!af;)V")
	public static void method223(@OriginalArg(1) Class5 arg0) {
		if (Static40.anInt1047 >= 2) {
			if (arg0.method207(Static57.aClass5_704)) {
				System.gc();
			}
			if (arg0.method207(Static102.aClass5_1201)) {
				Static3.method64();
			}
			if (arg0.method207(Static40.aClass5_492)) {
				Static63.aBoolean60 = true;
			}
			if (arg0.method207(Static58.aClass5_720)) {
				Static63.aBoolean60 = false;
			}
			if (arg0.method207(Static32.aClass5_432)) {
				for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
					for (@Pc(48) int local48 = 1; local48 < 103; local48++) {
						for (@Pc(52) int local52 = 1; local52 < 103; local52++) {
							Static131.aClass49Array1[local44].anIntArrayArray58[local48][local52] = 0;
						}
					}
				}
			}
			if (arg0.method207(Static50.aClass5_647) && Static22.anInt728 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method217(Static82.aClass5_1012)) {
				Static108.anInt2660 = arg0.method184(12).method194().method196();
				Static50.method893(Static100.method1696(new Class5[] { Static128.aClass5_1467, Static48.method838(Static108.anInt2660) }), 0, null);
			}
			if (arg0.method207(Static28.aClass5_401)) {
				Static93.aBoolean91 = true;
			}
		}
		Static44.aClass1_Sub20_Sub1_1.method2108(94);
		Static44.aClass1_Sub20_Sub1_1.method2081(arg0.method215() - 1);
		Static44.aClass1_Sub20_Sub1_1.method2054(arg0.method184(2));
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public static void method224() {
		aClass5_112 = null;
		aClass5_115 = null;
		aClass5_111 = null;
		aClass5_114 = null;
		aClass5_113 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	public static void method225() {
		if (Static11.aClass78_2 != null) {
			Static11.aClass78_2.method2176();
			Static11.aClass78_2 = null;
		}
		Static11.method283();
		Static44.aClass68_1.method1874();
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			Static131.aClass49Array1[local24].method1327();
		}
		System.gc();
		Static1.method52();
		Static108.anInt2659 = -1;
		Static18.aBoolean117 = false;
		Static71.method1227();
		Static97.method1636(10);
	}
}
