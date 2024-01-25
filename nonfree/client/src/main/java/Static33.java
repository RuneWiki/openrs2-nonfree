import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
	public static int anInt493;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString19 = " ";

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "[J")
	public static final long[] aLongArray1 = new long[100];

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)V")
	public static void method523(@OriginalArg(0) int arg0) {
		Static297.anInt6000 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static151.anInt3338; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static220.anInt4569; local6++) {
				if (Static18.aClass57ArrayArrayArray1[arg0][local3][local6] == null) {
					Static18.aClass57ArrayArrayArray1[arg0][local3][local6] = new Class57(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method524(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static164.anInt3686; local16++) {
			if (arg0.equalsIgnoreCase(Static284.aStringArray41[local16])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static110.aClass2_Sub2_Sub1_Sub1_1.aString22);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V")
	public static void method525() {
		Static200.aClass4_Sub7_Sub1_2.method1239();
		@Pc(11) int local11 = Static200.aClass4_Sub7_Sub1_2.method1247(1);
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static200.aClass4_Sub7_Sub1_2.method1247(2);
		if (local22 == 0) {
			Static49.anIntArray122[Static104.anInt6829++] = 2047;
			return;
		}
		@Pc(44) int local44;
		@Pc(54) int local54;
		if (local22 == 1) {
			local44 = Static200.aClass4_Sub7_Sub1_2.method1247(3);
			Static110.aClass2_Sub2_Sub1_Sub1_1.method5438(1, local44);
			local54 = Static200.aClass4_Sub7_Sub1_2.method1247(1);
			if (local54 == 1) {
				Static49.anIntArray122[Static104.anInt6829++] = 2047;
			}
		} else if (local22 == 2) {
			if (Static200.aClass4_Sub7_Sub1_2.method1247(1) == 1) {
				local44 = Static200.aClass4_Sub7_Sub1_2.method1247(3);
				Static110.aClass2_Sub2_Sub1_Sub1_1.method5438(2, local44);
				local54 = Static200.aClass4_Sub7_Sub1_2.method1247(3);
				Static110.aClass2_Sub2_Sub1_Sub1_1.method5438(2, local54);
			} else {
				local44 = Static200.aClass4_Sub7_Sub1_2.method1247(3);
				Static110.aClass2_Sub2_Sub1_Sub1_1.method5438(0, local44);
			}
			local44 = Static200.aClass4_Sub7_Sub1_2.method1247(1);
			if (local44 == 1) {
				Static49.anIntArray122[Static104.anInt6829++] = 2047;
			}
		} else if (local22 == 3) {
			Static279.anInt5645 = Static200.aClass4_Sub7_Sub1_2.method1247(2);
			local44 = Static200.aClass4_Sub7_Sub1_2.method1247(1);
			local54 = Static200.aClass4_Sub7_Sub1_2.method1247(7);
			@Pc(158) int local158 = Static200.aClass4_Sub7_Sub1_2.method1247(7);
			@Pc(163) int local163 = Static200.aClass4_Sub7_Sub1_2.method1247(1);
			if (local163 == 1) {
				Static49.anIntArray122[Static104.anInt6829++] = 2047;
			}
			Static110.aClass2_Sub2_Sub1_Sub1_1.method654(Static279.anInt5645, local54, local44 == 1, local158);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method526(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(12) String local12 = Static164.method3147(arg0);
		if (local12 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static173.anInt3827; local17++) {
			@Pc(25) String local25 = Static164.method3147(Static202.aStringArray33[local17]);
			if (local25 != null && local25.equals(local12)) {
				Static173.anInt3827--;
				for (@Pc(37) int local37 = local17; local37 < Static173.anInt3827; local37++) {
					Static202.aStringArray33[local37] = Static202.aStringArray33[local37 + 1];
					Static36.aStringArray3[local37] = Static36.aStringArray3[local37 + 1];
					Static80.aStringArray16[local37] = Static80.aStringArray16[local37 + 1];
					Static207.aStringArray34[local37] = Static207.aStringArray34[local37 + 1];
					Static41.aBooleanArray6[local37] = Static41.aBooleanArray6[local37 + 1];
				}
				Static345.anInt6764 = Static344.anInt6736;
				Static320.aClass4_Sub7_Sub1_3.method1237(91);
				Static320.aClass4_Sub7_Sub1_3.method2416(Static204.method3620(arg0));
				Static320.aClass4_Sub7_Sub1_3.method2373(arg0);
				break;
			}
		}
	}
}
