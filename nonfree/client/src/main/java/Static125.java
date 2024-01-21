import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ve", name = "Vc", descriptor = "Lclient!u;")
	private static Class74 aClass74_1694 = Static72.method1077("Add ignore");

	@OriginalMember(owner = "client!ve", name = "Z", descriptor = "Lclient!u;")
	public static Class74 aClass74_1688 = aClass74_1694;

	@OriginalMember(owner = "client!ve", name = "Ib", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[5];

	@OriginalMember(owner = "client!ve", name = "Xc", descriptor = "Lclient!u;")
	public static Class74 aClass74_1695 = Static72.method1077("mapback");

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZ)I")
	public static int method1885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 0) {
				arg0 = 0;
			} else if (arg0 > 127) {
				arg0 = 127;
			}
			return 127 - arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) / 128;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!u;B)V")
	public static void method1886(@OriginalArg(0) Class74 arg0) {
		if (arg0 == null || arg0.method1695() == 0) {
			Static65.anInt1449 = 0;
			return;
		}
		@Pc(20) Class74 local20 = arg0;
		@Pc(23) Class74[] local23 = new Class74[100];
		@Pc(25) int local25 = 0;
		while (true) {
			@Pc(30) int local30 = local20.method1700();
			if (local30 == -1) {
				local20 = local20.method1718();
				if (local20.method1695() > 0) {
					local23[local25++] = local20.method1729();
				}
				Static65.anInt1449 = 0;
				label46: for (local30 = 0; local30 < Static106.anInt2328; local30++) {
					@Pc(92) Class2_Sub2_Sub12 local92 = Static35.method1934(local30);
					if (local92.anInt1725 == -1 && local92.aClass74_1184 != null) {
						@Pc(104) Class74 local104 = local92.aClass74_1184.method1729();
						for (@Pc(106) int local106 = 0; local106 < local25; local106++) {
							if (local104.method1722(local23[local106]) == -1) {
								continue label46;
							}
						}
						Static126.aClass74Array20[Static65.anInt1449] = local104;
						Static67.anIntArray184[Static65.anInt1449] = local30;
						Static65.anInt1449++;
						if (Static126.aClass74Array20.length <= Static65.anInt1449) {
							return;
						}
					}
				}
				return;
			}
			@Pc(59) Class74 local59 = local20.method1706(0, local30).method1718();
			if (local59.method1695() > 0) {
				local23[local25++] = local59.method1729();
			}
			local20 = local20.method1697(local30 + 1);
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)Lclient!ua;")
	public static Class2_Sub2_Sub16 method1890(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub16 local10 = (Class2_Sub2_Sub16) Static53.aClass16_43.method490((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static105.method1595(arg0, Static78.aClass26_18, Static29.aClass26_4);
		if (local10 != null) {
			Static53.aClass16_43.method492(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(IZ)Z")
	public static boolean method1893(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILjava/awt/Component;Lclient!g;)V")
	public static void method1895(@OriginalArg(1) Component arg0, @OriginalArg(2) Class26 arg1) {
		if (Static120.aBoolean111) {
			return;
		}
		Static83.aClass2_Sub2_Sub1_Sub1_36 = Static29.method517(Static51.aClass74_1429, Static1.aClass74_1407, arg1);
		Static42.aClass2_Sub2_Sub1_Sub1_20 = Static29.method517(Static51.aClass74_1429, Static40.aClass74_691, arg1);
		Static42.aClass2_Sub2_Sub1_Sub1_21 = Static29.method517(Static51.aClass74_1429, aClass74_1695, arg1);
		Static90.aClass2_Sub2_Sub1_Sub1_38 = Static29.method517(Static51.aClass74_1429, Static65.aClass74_1011, arg1);
		Static8.aClass2_Sub2_Sub1_Sub1_6 = Static29.method517(Static51.aClass74_1429, Static25.aClass74_524, arg1);
		Static41.aClass2_Sub2_Sub1_Sub1_19 = Static29.method517(Static51.aClass74_1429, Static45.aClass74_738, arg1);
		Static99.aClass9_48 = Static80.method1253(96, 479, arg0);
		Static42.aClass2_Sub2_Sub1_Sub1_20.method97(0, 0);
		Static63.aClass9_30 = Static80.method1253(156, 172, arg0);
		Static58.method698();
		Static42.aClass2_Sub2_Sub1_Sub1_21.method97(0, 0);
		Static78.aClass9_38 = Static80.method1253(261, 190, arg0);
		Static83.aClass2_Sub2_Sub1_Sub1_36.method97(0, 0);
		Static107.aClass9_52 = Static80.method1253(334, 512, arg0);
		Static58.method698();
		Static37.aClass9_43 = Static80.method1253(50, 496, arg0);
		Static53.aClass9_27 = Static80.method1253(37, 269, arg0);
		Static128.aClass9_59 = Static80.method1253(45, 249, arg0);
		@Pc(114) Class2_Sub2_Sub1_Sub2 local114 = Static10.method246(Static49.aClass74_856, arg1, Static51.aClass74_1429);
		Static23.aClass9_14 = Static80.method1253(local114.anInt287, local114.anInt289, arg0);
		local114.method207(0, 0);
		@Pc(132) Class2_Sub2_Sub1_Sub2 local132 = Static10.method246(Static64.aClass74_1004, arg1, Static51.aClass74_1429);
		Static68.aClass9_32 = Static80.method1253(local132.anInt287, local132.anInt289, arg0);
		local132.method207(0, 0);
		@Pc(150) Class2_Sub2_Sub1_Sub2 local150 = Static10.method246(Static69.aClass74_1084, arg1, Static51.aClass74_1429);
		Static102.aClass9_51 = Static80.method1253(local150.anInt287, local150.anInt289, arg0);
		local150.method207(0, 0);
		@Pc(168) Class2_Sub2_Sub1_Sub2 local168 = Static10.method246(Static24.aClass74_512, arg1, Static51.aClass74_1429);
		Static99.aClass9_49 = Static80.method1253(local168.anInt287, local168.anInt289, arg0);
		local168.method207(0, 0);
		@Pc(188) Class2_Sub2_Sub1_Sub2 local188 = Static10.method246(Static16.aClass74_416, arg1, Static51.aClass74_1429);
		Static50.aClass9_25 = Static80.method1253(local188.anInt287, local188.anInt289, arg0);
		local188.method207(0, 0);
		@Pc(208) Class2_Sub2_Sub1_Sub2 local208 = Static10.method246(Static65.aClass74_1013, arg1, Static51.aClass74_1429);
		Static72.aClass9_34 = Static80.method1253(local208.anInt287, local208.anInt289, arg0);
		local208.method207(0, 0);
		@Pc(228) Class2_Sub2_Sub1_Sub2 local228 = Static10.method246(Static81.aClass74_1223, arg1, Static51.aClass74_1429);
		Static67.aClass9_31 = Static80.method1253(local228.anInt287, local228.anInt289, arg0);
		local228.method207(0, 0);
		@Pc(246) Class2_Sub2_Sub1_Sub2 local246 = Static10.method246(Static90.aClass74_1298, arg1, Static51.aClass74_1429);
		Static83.aClass9_40 = Static80.method1253(local246.anInt287, local246.anInt289, arg0);
		local246.method207(0, 0);
		@Pc(264) Class2_Sub2_Sub1_Sub2 local264 = Static10.method246(Static120.aClass74_1609, arg1, Static51.aClass74_1429);
		Static23.aClass9_13 = Static80.method1253(local264.anInt287, local264.anInt289, arg0);
		local264.method207(0, 0);
		Static91.aClass2_Sub2_Sub1_Sub1_39 = Static29.method517(Static51.aClass74_1429, Static27.aClass74_529, arg1);
		Static111.aClass2_Sub2_Sub1_Sub1_45 = Static29.method517(Static51.aClass74_1429, Static20.aClass74_468, arg1);
		Static63.aClass2_Sub2_Sub1_Sub1_30 = Static29.method517(Static51.aClass74_1429, Static56.aClass74_948, arg1);
		Static111.aClass2_Sub2_Sub1_Sub1_46 = Static91.aClass2_Sub2_Sub1_Sub1_39.method96();
		Static111.aClass2_Sub2_Sub1_Sub1_46.method99();
		Static97.aClass2_Sub2_Sub1_Sub1_51 = Static111.aClass2_Sub2_Sub1_Sub1_45.method96();
		Static97.aClass2_Sub2_Sub1_Sub1_51.method99();
		Static62.aClass2_Sub2_Sub1_Sub1_29 = Static91.aClass2_Sub2_Sub1_Sub1_39.method96();
		Static62.aClass2_Sub2_Sub1_Sub1_29.method93();
		Static14.aClass2_Sub2_Sub1_Sub1_13 = Static111.aClass2_Sub2_Sub1_Sub1_45.method96();
		Static14.aClass2_Sub2_Sub1_Sub1_13.method93();
		Static52.aClass2_Sub2_Sub1_Sub1_26 = Static63.aClass2_Sub2_Sub1_Sub1_30.method96();
		Static52.aClass2_Sub2_Sub1_Sub1_26.method93();
		Static10.aClass2_Sub2_Sub1_Sub1_8 = Static91.aClass2_Sub2_Sub1_Sub1_39.method96();
		Static10.aClass2_Sub2_Sub1_Sub1_8.method99();
		Static10.aClass2_Sub2_Sub1_Sub1_8.method93();
		Static14.aClass2_Sub2_Sub1_Sub1_12 = Static111.aClass2_Sub2_Sub1_Sub1_45.method96();
		Static14.aClass2_Sub2_Sub1_Sub1_12.method99();
		Static14.aClass2_Sub2_Sub1_Sub1_12.method93();
		Static48.aClass2_Sub2_Sub1_Sub1Array6 = Static25.method494(Static43.aClass74_710, arg1, Static51.aClass74_1429);
		Static64.anIntArray175 = new int[33];
		Static43.anIntArray114 = new int[151];
		Static52.anIntArray142 = new int[33];
		Static45.anIntArray124 = new int[151];
		@Pc(359) int local359;
		@Pc(357) int local357;
		@Pc(361) int local361;
		for (@Pc(353) int local353 = 0; local353 < 33; local353++) {
			local357 = 0;
			local359 = 999;
			for (local361 = 0; local361 < 34; local361++) {
				if (Static42.aClass2_Sub2_Sub1_Sub1_21.aByteArray1[local353 * Static42.aClass2_Sub2_Sub1_Sub1_21.anInt116 + local361] == 0) {
					if (local359 == 999) {
						local359 = local361;
					}
				} else if (local359 != 999) {
					local357 = local361;
					break;
				}
			}
			Static64.anIntArray175[local353] = local359;
			Static52.anIntArray142[local353] = local357 - local359;
		}
		for (local359 = 5; local359 < 156; local359++) {
			local361 = 0;
			local357 = 999;
			for (@Pc(418) int local418 = 25; local418 < 172; local418++) {
				if (Static42.aClass2_Sub2_Sub1_Sub1_21.aByteArray1[local359 * Static42.aClass2_Sub2_Sub1_Sub1_21.anInt116 + local418] == 0 && (local418 > 34 || local359 > 34)) {
					if (local357 == 999) {
						local357 = local418;
					}
				} else if (local357 != 999) {
					local361 = local418;
					break;
				}
			}
			Static45.anIntArray124[local359 - 5] = local357 - 25;
			Static43.anIntArray114[local359 - 5] = local361 - local357;
		}
		Static120.aBoolean111 = true;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
	public static void method1897() {
		aClass74_1695 = null;
		aClass74_1694 = null;
		aClass74_1688 = null;
		aBooleanArray15 = null;
	}
}
