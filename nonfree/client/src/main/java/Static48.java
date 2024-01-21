import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	public static int anInt1746;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Lclient!lc;")
	public static Class31 aClass31_618 = Static56.method1206("Add ignore @whi@");

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Lclient!lc;")
	public static Class31 aClass31_619 = Static56.method1206("No reply from loginserver)3");

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "[I")
	public static int[] anIntArray257 = new int[25];

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "Lclient!lc;")
	public static Class31 aClass31_620 = Static56.method1206("Feb");

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([BIZ)I")
	public static int method1110(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static13.method379(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public static void method1113() {
		if (Static46.anInt1615 != 0) {
			return;
		}
		Static85.aClass31Array14[0] = Static55.aClass31_663;
		Static63.anIntArray296[0] = 1001;
		Static59.anInt2044 = 1;
		if (Static16.anInt773 != -1) {
			Static25.anInt1112 = -1;
			Static58.anInt1939 = -1;
			Static8.method202(0, 0, Static16.anInt773, 503, 765, 0, Static85.anInt2508, Static61.anInt2102, 0, -1);
			Static17.anInt792 = Static58.anInt1939;
			Static11.anInt524 = Static25.anInt1112;
			return;
		}
		Static49.method1699();
		@Pc(49) boolean local49 = false;
		Static58.anInt1939 = -1;
		Static25.anInt1112 = -1;
		if (Static85.anInt2508 > 4 && Static61.anInt2102 > 4 && Static85.anInt2508 < 516 && Static61.anInt2102 < 338) {
			if (Static42.anInt1586 == -1) {
				Static27.method779();
			} else {
				Static8.method202(0, 0, Static42.anInt1586, 338, 516, 4, Static85.anInt2508, Static61.anInt2102, 4, -1);
			}
		}
		Static17.anInt792 = Static58.anInt1939;
		Static11.anInt524 = Static25.anInt1112;
		Static25.anInt1112 = -1;
		Static58.anInt1939 = -1;
		if (Static85.anInt2508 > 553 && Static61.anInt2102 > 205 && Static85.anInt2508 < 743 && Static61.anInt2102 < 466) {
			if (Static54.anInt1802 != -1) {
				Static8.method202(0, 1, Static54.anInt1802, 466, 743, 553, Static85.anInt2508, Static61.anInt2102, 205, -1);
			} else if (Static41.anIntArray245[Static31.anInt1279] != -1) {
				Static8.method202(0, 1, Static41.anIntArray245[Static31.anInt1279], 466, 743, 553, Static85.anInt2508, Static61.anInt2102, 205, -1);
			}
		}
		if (Static99.anInt2669 != Static25.anInt1112) {
			Static92.aBoolean81 = true;
			Static99.anInt2669 = Static25.anInt1112;
		}
		if (Static103.anInt2764 != Static58.anInt1939) {
			Static103.anInt2764 = Static58.anInt1939;
			Static92.aBoolean81 = true;
		}
		Static58.anInt1939 = -1;
		Static25.anInt1112 = -1;
		if (Static85.anInt2508 > 17 && Static61.anInt2102 > 357 && Static85.anInt2508 < 496 && Static61.anInt2102 < 453) {
			if (Static47.anInt1736 != -1) {
				Static8.method202(0, 2, Static47.anInt1736, 453, 496, 17, Static85.anInt2508, Static61.anInt2102, 357, -1);
			} else if (Static37.anInt1409 != -1) {
				Static8.method202(0, 3, Static37.anInt1409, 453, 496, 17, Static85.anInt2508, Static61.anInt2102, 357, -1);
			} else if (Static61.anInt2102 < 434 && Static85.anInt2508 < 426) {
				Static105.method1744(Static85.anInt2508 - 17, Static61.anInt2102 + -357);
			}
		}
		if ((Static47.anInt1736 != -1 || Static37.anInt1409 != -1) && Static103.anInt2779 != Static25.anInt1112) {
			Static27.aBoolean65 = true;
			Static103.anInt2779 = Static25.anInt1112;
		}
		if ((Static47.anInt1736 != -1 || Static37.anInt1409 != -1) && Static75.anInt2244 != Static58.anInt1939) {
			Static27.aBoolean65 = true;
			Static75.anInt2244 = Static58.anInt1939;
		}
		while (!local49) {
			local49 = true;
			for (@Pc(284) int local284 = 0; local284 < Static59.anInt2044 - 1; local284++) {
				if (Static63.anIntArray296[local284] < 1000 && Static63.anIntArray296[local284 + 1] > 1000) {
					local49 = false;
					@Pc(306) Class31 local306 = Static85.aClass31Array14[local284];
					Static85.aClass31Array14[local284] = Static85.aClass31Array14[local284 + 1];
					Static85.aClass31Array14[local284 + 1] = local306;
					@Pc(324) int local324 = Static63.anIntArray296[local284];
					Static63.anIntArray296[local284] = Static63.anIntArray296[local284 + 1];
					Static63.anIntArray296[local284 + 1] = local324;
					@Pc(342) int local342 = Static55.anIntArray274[local284];
					Static55.anIntArray274[local284] = Static55.anIntArray274[local284 + 1];
					Static55.anIntArray274[local284 + 1] = local342;
					@Pc(360) int local360 = Static64.anIntArray84[local284];
					Static64.anIntArray84[local284] = Static64.anIntArray84[local284 + 1];
					Static64.anIntArray84[local284 + 1] = local360;
					@Pc(378) int local378 = Static64.anIntArray85[local284];
					Static64.anIntArray85[local284] = Static64.anIntArray85[local284 + 1];
					Static64.anIntArray85[local284 + 1] = local378;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
	public static void method1115() {
		Static44.aClass17_63.method782();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Lclient!aa;")
	public static Class2_Sub1_Sub1 method1116(@OriginalArg(1) int arg0) {
		@Pc(18) Class2_Sub1_Sub1 local18 = (Class2_Sub1_Sub1) Static14.aClass17_23.method786((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static87.aClass11_18.method338(14, arg0);
		local18 = new Class2_Sub1_Sub1();
		if (local28 != null) {
			local18.method84(new Class2_Sub6(local28));
		}
		Static14.aClass17_23.method783(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
	public static void method1117() {
		anIntArray257 = null;
		aClass31_620 = null;
		aClass31_618 = null;
		aClass31_619 = null;
	}
}
