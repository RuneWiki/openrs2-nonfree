import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_807 = Static81.method1507("Nov");

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_808 = Static81.method1507("Jun");

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_809 = Static81.method1507("Sep");

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_810 = Static81.method1507("Mar");

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_811 = Static81.method1507("Hidden)2use");

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_815 = Static81.method1507(" ");

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "Lclient!dj;")
	public static Class24 aClass24_812 = aClass24_815;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_813 = Static81.method1507("Feb");

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_814 = Static81.method1507("Jan");

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "[I")
	public static final int[] anIntArray214 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_816 = Static81.method1507("May");

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_817 = Static81.method1507("Aug");

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_818 = Static81.method1507("Jul");

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_819 = Static81.method1507("Apr");

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_820 = Static81.method1507("Oct");

	@OriginalMember(owner = "client!mf", name = "v", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_821 = Static81.method1507("Dec");

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "[Lclient!dj;")
	public static final Class24[] aClass24Array18 = new Class24[] { aClass24_814, aClass24_813, aClass24_810, aClass24_819, aClass24_816, aClass24_808, aClass24_818, aClass24_817, aClass24_809, aClass24_820, aClass24_807, aClass24_821 };

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!fj;)Lclient!ub;")
	public static Class22_Sub4 method2072(@OriginalArg(1) Class1_Sub7 arg0) {
		return new Class22_Sub4(arg0.method2779(), arg0.method2779(), arg0.method2779(), arg0.method2779(), arg0.method2745(), arg0.method2745(), arg0.method2771());
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
	public static void method2074() {
		Static199.method2199(Static208.aClass98_21);
		Static181.anInt4037++;
		if (Static179.aBoolean186 && Static149.aBoolean154) {
			@Pc(24) int local24 = Static24.anInt661;
			@Pc(27) int local27 = Static208.aClass98_21.anInt4366;
			local24 -= Static188.anInt4178;
			@Pc(33) int local33 = Static7.anInt174;
			local33 -= Static190.anInt4266;
			if (local33 < Static63.anInt1594) {
				local33 = Static63.anInt1594;
			}
			if (Static63.anInt1594 + Static56.aClass98_8.anInt4403 < local33 - -Static208.aClass98_21.anInt4403) {
				local33 = Static56.aClass98_8.anInt4403 + Static63.anInt1594 - Static208.aClass98_21.anInt4403;
			}
			@Pc(70) int local70 = local33 - Static69.anInt1687;
			@Pc(78) int local78 = Static56.aClass98_8.anInt4348 + local33 - Static63.anInt1594;
			if (local24 < Static188.anInt4179) {
				local24 = Static188.anInt4179;
			}
			if (local24 + Static208.aClass98_21.anInt4400 > Static188.anInt4179 + Static56.aClass98_8.anInt4400) {
				local24 = Static56.aClass98_8.anInt4400 + Static188.anInt4179 - Static208.aClass98_21.anInt4400;
			}
			@Pc(117) int local117 = local24 + Static56.aClass98_8.anInt4401 - Static188.anInt4179;
			@Pc(121) int local121 = local24 - Static63.anInt1609;
			if (Static208.aClass98_21.anInt4369 < Static181.anInt4037 && (local121 > local27 || local121 < -local27 || local27 < local70 || local70 < -local27)) {
				Static101.aBoolean108 = true;
			}
			@Pc(162) Class1_Sub16 local162;
			if (Static208.aClass98_21.anObjectArray11 != null && Static101.aBoolean108) {
				local162 = new Class1_Sub16();
				local162.anInt2762 = local117;
				local162.aClass98_13 = Static208.aClass98_21;
				local162.anInt2760 = local78;
				local162.anObjectArray1 = Static208.aClass98_21.anObjectArray11;
				Static131.method2258(local162);
			}
			if (Static188.anInt4176 == 0) {
				if (Static101.aBoolean108) {
					if (Static208.aClass98_21.anObjectArray17 != null) {
						local162 = new Class1_Sub16();
						local162.anInt2762 = local117;
						local162.anInt2760 = local78;
						local162.anObjectArray1 = Static208.aClass98_21.anObjectArray17;
						local162.aClass98_14 = Static181.aClass98_15;
						local162.aClass98_13 = Static208.aClass98_21;
						Static131.method2258(local162);
					}
					if (Static181.aClass98_15 != null && Static54.method2989(Static208.aClass98_21) != null) {
						Static176.aClass1_Sub7_Sub1_34.method2808(87);
						Static176.aClass1_Sub7_Sub1_34.method2758(Static208.aClass98_21.anInt4379);
						Static176.aClass1_Sub7_Sub1_34.method2791(Static181.aClass98_15.anInt4379);
						Static176.aClass1_Sub7_Sub1_34.method2754(Static181.aClass98_15.anInt4357);
						Static176.aClass1_Sub7_Sub1_34.method2787(Static208.aClass98_21.anInt4357);
					}
				} else if ((Static181.anInt4036 == 1 || Static34.method664(Static156.anInt3437 - 1)) && Static156.anInt3437 > 2) {
					Static12.method295();
				} else if (Static156.anInt3437 > 0) {
					Static63.method1279(Static156.anInt3437 - 1);
				}
				Static208.aClass98_21 = null;
			}
		} else if (Static181.anInt4037 > 1) {
			Static208.aClass98_21 = null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
	public static void method2075() {
		try {
			if (Static100.aClass89_1 == null) {
				Static100.aClass89_1 = new Class89(Static76.aClass99_1, Static63.method1281(new Class24[] { Static169.aClass24_1085, Static175.method3020(Static107.anInt2426), Static50.aClass24_313 }).method749());
			} else {
				@Pc(40) byte[] local40 = Static100.aClass89_1.method2985();
				if (local40 != null) {
					@Pc(47) Class1_Sub7 local47 = new Class1_Sub7(local40);
					Static190.anInt4253 = local47.method2765();
					Static160.aClass63Array105 = new Class63[Static190.anInt4253];
					for (@Pc(56) int local56 = 0; local56 < Static190.anInt4253; local56++) {
						@Pc(65) Class63 local65 = Static160.aClass63Array105[local56] = new Class63();
						@Pc(69) int local69 = local47.method2765();
						local65.anInt2671 = local69 & 0x7FFF;
						local65.aBoolean121 = (local69 & 0x8000) != 0;
						local65.aClass24_789 = local47.method2761();
						local65.anInt2667 = local47.method2779();
						local65.anInt2665 = local56;
						local65.anInt2668 = Static20.method438(local47.method2765());
					}
					Static173.method2980(0, Static160.aClass63Array105.length - 1, Static160.aClass63Array105, Static15.anIntArray36, Static136.anIntArray250);
					Static122.aBoolean123 = true;
					Static100.aClass89_1 = null;
				}
			}
		} catch (@Pc(130) Exception local130) {
			local130.printStackTrace();
			Static100.aClass89_1 = null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)Z")
	public static boolean method2076(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)Lclient!dj;")
	public static Class24 method2077(@OriginalArg(0) int arg0) {
		return Static66.aClass24Array11[arg0].method781() <= 0 ? Static27.aClass24Array4[arg0] : Static63.method1281(new Class24[] { Static27.aClass24Array4[arg0], aClass24_812, Static66.aClass24Array11[arg0] });
	}
}
