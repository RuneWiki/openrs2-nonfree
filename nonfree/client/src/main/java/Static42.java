import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!dc", name = "K", descriptor = "Lclient!jd;")
	public static Class84 aClass84_19;

	@OriginalMember(owner = "client!dc", name = "W", descriptor = "Lclient!jd;")
	public static Class84 aClass84_20;

	@OriginalMember(owner = "client!dc", name = "X", descriptor = "Lclient!e;")
	public static Class45 aClass45_1;

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
	public static int anInt1046 = 0;

	@OriginalMember(owner = "client!dc", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString52 = "flash1:";

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V")
	public static void method823() {
		Static269.aClass46_38.method1079();
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V")
	public static void method826() {
		@Pc(3) int local3 = Static221.anInt4607;
		@Pc(5) int local5 = Static297.anInt6219;
		@Pc(7) int local7 = Static243.anInt3779;
		@Pc(11) int local11 = Static63.anInt1431 - 3;
		if (Static191.aClass2_Sub3_Sub1_2 == null || Static251.aClass2_Sub3_Sub1_10 == null) {
			if (Static201.aClass84_85.method2138(Static129.anInt2674) && Static201.aClass84_85.method2138(Static34.anInt1969)) {
				Static191.aClass2_Sub3_Sub1_2 = Static250.method4003(Static129.anInt2674, Static201.aClass84_85);
				Static251.aClass2_Sub3_Sub1_10 = Static250.method4003(Static34.anInt1969, Static201.aClass84_85);
				if (Static60.aBoolean106) {
					if (Static191.aClass2_Sub3_Sub1_2 instanceof Class2_Sub3_Sub1_Sub1_Sub1) {
						Static191.aClass2_Sub3_Sub1_2 = new Class2_Sub3_Sub1_Sub2_Sub1((Class2_Sub3_Sub1_Sub1) Static191.aClass2_Sub3_Sub1_2);
					} else {
						Static191.aClass2_Sub3_Sub1_2 = new Class2_Sub3_Sub1_Sub2((Class2_Sub3_Sub1_Sub1) Static191.aClass2_Sub3_Sub1_2);
					}
					if (Static251.aClass2_Sub3_Sub1_10 instanceof Class2_Sub3_Sub1_Sub1_Sub1) {
						Static251.aClass2_Sub3_Sub1_10 = new Class2_Sub3_Sub1_Sub2_Sub1((Class2_Sub3_Sub1_Sub1) Static251.aClass2_Sub3_Sub1_10);
					} else {
						Static251.aClass2_Sub3_Sub1_10 = new Class2_Sub3_Sub1_Sub2((Class2_Sub3_Sub1_Sub1) Static251.aClass2_Sub3_Sub1_10);
					}
				}
			} else if (Static60.aBoolean106) {
				Static94.method1747(local3, local7, local5, 20, Static247.anInt4920, 256 - Static79.anInt1761);
			} else {
				Static160.method2779(local3, local7, local5, 20, Static247.anInt4920, 256 - Static79.anInt1761);
			}
		}
		@Pc(120) int local120;
		@Pc(122) int local122;
		if (Static191.aClass2_Sub3_Sub1_2 != null && Static251.aClass2_Sub3_Sub1_10 != null) {
			local120 = (local5 - Static251.aClass2_Sub3_Sub1_10.anInt5453 * 2) / Static191.aClass2_Sub3_Sub1_2.anInt5453;
			for (local122 = 0; local122 < local120; local122++) {
				Static191.aClass2_Sub3_Sub1_2.method4367(local3 + Static251.aClass2_Sub3_Sub1_10.anInt5453 + local122 * Static191.aClass2_Sub3_Sub1_2.anInt5453, local7);
			}
			Static251.aClass2_Sub3_Sub1_10.method4367(local3, local7);
			Static251.aClass2_Sub3_Sub1_10.method4362(local5 + local3 - Static251.aClass2_Sub3_Sub1_10.anInt5453, local7);
		}
		Static153.aClass2_Sub3_Sub5_1.method3317(Static169.aString178, local3 + 3, local7 - -14, Static126.anInt2655, -1);
		if (Static60.aBoolean106) {
			Static94.method1747(local3, local7 + 20, local5, local11 - 20, Static247.anInt4920, 256 - Static79.anInt1761);
		} else {
			Static160.method2779(local3, local7 + 20, local5, local11 - 20, Static247.anInt4920, 256 - Static79.anInt1761);
		}
		local120 = Static86.anInt1911;
		local122 = Static238.anInt4852;
		@Pc(209) int local209;
		@Pc(232) int local232;
		for (local209 = 0; local209 < Static216.anInt4481; local209++) {
			local232 = (Static216.anInt4481 - local209 - 1) * 15 + local7 + 33;
			if (local3 < local120 && local120 < local3 + local5 && local122 > local232 - 13 && local122 < local232 + 3) {
				if (Static60.aBoolean106) {
					Static94.method1747(local3, local232 - 12, local5, 15, Static200.anInt4164, 256 - Static191.anInt703);
				} else {
					Static160.method2779(local3, local232 - 12, local5, 15, Static200.anInt4164, 256 - Static191.anInt703);
				}
			}
		}
		if ((Static242.aClass2_Sub3_Sub1_9 == null || Static186.aClass2_Sub3_Sub1_7 == null || Static200.aClass2_Sub3_Sub1_8 == null) && Static201.aClass84_85.method2138(Static18.anInt464) && Static201.aClass84_85.method2138(Static290.anInt6020) && Static201.aClass84_85.method2138(Static25.anInt5784)) {
			Static242.aClass2_Sub3_Sub1_9 = Static250.method4003(Static18.anInt464, Static201.aClass84_85);
			Static186.aClass2_Sub3_Sub1_7 = Static250.method4003(Static290.anInt6020, Static201.aClass84_85);
			Static200.aClass2_Sub3_Sub1_8 = Static250.method4003(Static25.anInt5784, Static201.aClass84_85);
			if (Static60.aBoolean106) {
				if (Static242.aClass2_Sub3_Sub1_9 instanceof Class2_Sub3_Sub1_Sub1_Sub1) {
					Static242.aClass2_Sub3_Sub1_9 = new Class2_Sub3_Sub1_Sub2_Sub1((Class2_Sub3_Sub1_Sub1) Static242.aClass2_Sub3_Sub1_9);
				} else {
					Static242.aClass2_Sub3_Sub1_9 = new Class2_Sub3_Sub1_Sub2((Class2_Sub3_Sub1_Sub1) Static242.aClass2_Sub3_Sub1_9);
				}
				if (Static186.aClass2_Sub3_Sub1_7 instanceof Class2_Sub3_Sub1_Sub1_Sub1) {
					Static186.aClass2_Sub3_Sub1_7 = new Class2_Sub3_Sub1_Sub2_Sub1((Class2_Sub3_Sub1_Sub1) Static186.aClass2_Sub3_Sub1_7);
				} else {
					Static186.aClass2_Sub3_Sub1_7 = new Class2_Sub3_Sub1_Sub2((Class2_Sub3_Sub1_Sub1) Static186.aClass2_Sub3_Sub1_7);
				}
				if (Static200.aClass2_Sub3_Sub1_8 instanceof Class2_Sub3_Sub1_Sub1_Sub1) {
					Static200.aClass2_Sub3_Sub1_8 = new Class2_Sub3_Sub1_Sub2_Sub1((Class2_Sub3_Sub1_Sub1) Static200.aClass2_Sub3_Sub1_8);
				} else {
					Static200.aClass2_Sub3_Sub1_8 = new Class2_Sub3_Sub1_Sub2((Class2_Sub3_Sub1_Sub1) Static200.aClass2_Sub3_Sub1_8);
				}
			}
		}
		@Pc(448) int local448;
		if (Static242.aClass2_Sub3_Sub1_9 != null && Static186.aClass2_Sub3_Sub1_7 != null && Static200.aClass2_Sub3_Sub1_8 != null) {
			local209 = (local5 - Static200.aClass2_Sub3_Sub1_8.anInt5453 * 2) / Static242.aClass2_Sub3_Sub1_9.anInt5453;
			for (local232 = 0; local232 < local209; local232++) {
				Static242.aClass2_Sub3_Sub1_9.method4367(local3 + Static200.aClass2_Sub3_Sub1_8.anInt5453 + Static242.aClass2_Sub3_Sub1_9.anInt5453 * local232, -Static242.aClass2_Sub3_Sub1_9.anInt5462 + local7 + local11);
			}
			local232 = (local11 - Static200.aClass2_Sub3_Sub1_8.anInt5462 - 20) / Static186.aClass2_Sub3_Sub1_7.anInt5462;
			for (local448 = 0; local448 < local232; local448++) {
				Static186.aClass2_Sub3_Sub1_7.method4367(local3, local7 + local448 * Static186.aClass2_Sub3_Sub1_7.anInt5462 + 20);
				Static186.aClass2_Sub3_Sub1_7.method4362(local5 + local3 - Static186.aClass2_Sub3_Sub1_7.anInt5453, local448 * Static186.aClass2_Sub3_Sub1_7.anInt5462 + local7 + 20);
			}
			Static200.aClass2_Sub3_Sub1_8.method4367(local3, local7 + local11 - Static200.aClass2_Sub3_Sub1_8.anInt5462);
			Static200.aClass2_Sub3_Sub1_8.method4362(local3 + local5 - Static200.aClass2_Sub3_Sub1_8.anInt5453, -Static200.aClass2_Sub3_Sub1_8.anInt5462 + local7 - -local11);
		}
		for (local209 = 0; local209 < Static216.anInt4481; local209++) {
			local232 = local7 + (Static216.anInt4481 - (1 - -local209)) * 15 + 20 + 13;
			local448 = Static126.anInt2655;
			if (local3 < local120 && local120 < local5 + local3 && local232 - 13 < local122 && local232 + 3 > local122) {
				local448 = Static11.anInt299;
			}
			Static153.aClass2_Sub3_Sub5_1.method3317(Static196.method3333(local209), local3 + 3, local232, local448, 0);
		}
		Static75.method1374(Static221.anInt4607, Static243.anInt3779, Static297.anInt6219, Static63.anInt1431);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)Z")
	public static boolean method827(@OriginalArg(1) boolean arg0) {
		@Pc(10) boolean local10 = Static276.method4597();
		if (local10 == arg0) {
			return true;
		}
		if (!arg0) {
			Static276.method4598();
		} else if (!Static276.method4590() || !Static276.method4591() || !Static276.method4587()) {
			arg0 = false;
		}
		Static97.aBoolean169 = arg0;
		Static67.method4884(Static299.aClass177_5);
		if (local10 == arg0) {
			return false;
		} else {
			((Class127_Sub1) Static93.anInterface5_1).method3528();
			return true;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Frame;BLclient!vl;)V")
	public static void method829(@OriginalArg(0) Frame arg0, @OriginalArg(2) Class177 arg1) {
		while (true) {
			@Pc(6) Class28 local6 = arg1.method4684(arg0);
			while (local6.anInt726 == 0) {
				Static134.method2329(10L);
			}
			if (local6.anInt726 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static134.method2329(100L);
		}
	}
}
