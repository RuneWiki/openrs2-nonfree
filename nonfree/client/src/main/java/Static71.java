import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!hh", name = "W", descriptor = "Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_3;

	@OriginalMember(owner = "client!hh", name = "fb", descriptor = "[I")
	public static int[] anIntArray174;

	@OriginalMember(owner = "client!hh", name = "Q", descriptor = "Lclient!lf;")
	private static Class49 aClass49_777 = Static32.method683("glow3:");

	@OriginalMember(owner = "client!hh", name = "J", descriptor = "Lclient!lf;")
	public static Class49 aClass49_775 = aClass49_777;

	@OriginalMember(owner = "client!hh", name = "L", descriptor = "Lclient!lf;")
	public static Class49 aClass49_776 = aClass49_777;

	@OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
	public static int anInt1459 = 0;

	@OriginalMember(owner = "client!hh", name = "bb", descriptor = "Lclient!lf;")
	private static Class49 aClass49_779 = Static32.method683("Drop");

	@OriginalMember(owner = "client!hh", name = "V", descriptor = "Lclient!lf;")
	public static Class49 aClass49_778 = aClass49_779;

	@OriginalMember(owner = "client!hh", name = "db", descriptor = "[I")
	public static int[] anIntArray173 = new int[32];

	@OriginalMember(owner = "client!hh", name = "gb", descriptor = "I")
	public static int anInt1467 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)J")
	public static long method1174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub1 local7 = Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass26_1 == null ? 0L : local7.aClass26_1.aLong44;
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(B)V")
	public static void method1179() {
		aClass49_776 = null;
		aClass49_777 = null;
		anIntArray173 = null;
		aClass49_779 = null;
		aClass2_Sub2_Sub2_Sub3_3 = null;
		aClass49_778 = null;
		anIntArray174 = null;
		aClass49_775 = null;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZIIILclient!vg;)V")
	public static void method1182(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class85 arg3) {
		if (Static36.anInt924 < 3) {
			Static38.aClass2_Sub2_Sub2_Sub3_1.method1537(arg1, arg2, arg3.anInt3858, arg3.anInt3867, Static38.aClass2_Sub2_Sub2_Sub3_1.anInt1886 / 2, Static38.aClass2_Sub2_Sub2_Sub3_1.anInt1885 / 2, Static63.anInt1356, arg3.anIntArray348, arg3.anIntArray354);
		} else {
			Static10.method1862(arg1, arg2, arg3.anIntArray348, arg3.anIntArray354);
		}
		Static164.aBooleanArray17[arg0] = true;
	}

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "(B)V")
	public static void method1183() {
		Static102.method1756(Static160.aClass85_14);
		Static107.anInt2241++;
		if (Static48.aBoolean42 && Static25.aBoolean20) {
			@Pc(26) int local26 = Static20.anInt449;
			@Pc(28) int local28 = Static96.anInt2022;
			local28 -= Static131.anInt3736;
			local26 -= Static143.anInt3033;
			if (Static170.anInt3721 > local28) {
				local28 = Static170.anInt3721;
			}
			if (Static20.anInt443 > local26) {
				local26 = Static20.anInt443;
			}
			if (Static42.aClass85_2.anInt3867 + Static170.anInt3721 < local28 + Static160.aClass85_14.anInt3867) {
				local28 = Static42.aClass85_2.anInt3867 + Static170.anInt3721 - Static160.aClass85_14.anInt3867;
			}
			if (local26 + Static160.aClass85_14.anInt3858 > Static42.aClass85_2.anInt3858 + Static20.anInt443) {
				local26 = Static20.anInt443 + Static42.aClass85_2.anInt3858 - Static160.aClass85_14.anInt3858;
			}
			@Pc(95) int local95 = local28 - Static65.anInt4025;
			@Pc(100) int local100 = local26 - Static123.anInt2732;
			@Pc(108) int local108 = local26 + Static42.aClass85_2.anInt3822 - Static20.anInt443;
			@Pc(111) int local111 = Static160.aClass85_14.anInt3859;
			if (Static107.anInt2241 > Static160.aClass85_14.anInt3852 && (local111 < local100 || -local111 > local100 || local111 < local95 || -local111 > local95)) {
				Static123.aBoolean118 = true;
			}
			@Pc(155) int local155 = local28 + Static42.aClass85_2.anInt3891 - Static170.anInt3721;
			@Pc(164) Class2_Sub12 local164;
			if (Static160.aClass85_14.anObjectArray26 != null && Static123.aBoolean118) {
				local164 = new Class2_Sub12();
				local164.aClass85_4 = Static160.aClass85_14;
				local164.anObjectArray2 = Static160.aClass85_14.anObjectArray26;
				local164.anInt1567 = local108;
				local164.anInt1560 = local155;
				Static38.method766(local164);
			}
			if (Static182.anInt4058 == 0) {
				if (Static123.aBoolean118) {
					if (Static160.aClass85_14.anObjectArray29 != null) {
						local164 = new Class2_Sub12();
						local164.anObjectArray2 = Static160.aClass85_14.anObjectArray29;
						local164.anInt1560 = local155;
						local164.aClass85_5 = Static44.aClass85_9;
						local164.anInt1567 = local108;
						local164.aClass85_4 = Static160.aClass85_14;
						Static38.method766(local164);
					}
					if (Static44.aClass85_9 != null && Static3.method46(Static160.aClass85_14) != null) {
						Static176.aClass2_Sub13_Sub1_14.method2976(161);
						Static176.aClass2_Sub13_Sub1_14.method2952(Static44.aClass85_9.anInt3849);
						Static176.aClass2_Sub13_Sub1_14.method2967(Static44.aClass85_9.anInt3866);
						Static176.aClass2_Sub13_Sub1_14.method2952(Static160.aClass85_14.anInt3849);
						Static176.aClass2_Sub13_Sub1_14.method2967(Static160.aClass85_14.anInt3866);
					}
				} else if ((Static111.anInt2307 == 1 || Static26.method476(Static133.anInt3713 - 1)) && Static133.anInt3713 > 2) {
					Static112.method1902();
				} else if (Static133.anInt3713 > 0) {
					Static6.method105(Static133.anInt3713 - 1);
				}
				Static160.aClass85_14 = null;
			}
		} else if (Static107.anInt2241 > 1) {
			Static160.aClass85_14 = null;
		}
	}
}
