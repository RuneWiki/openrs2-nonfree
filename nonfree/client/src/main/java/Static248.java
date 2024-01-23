import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "Lclient!oh;")
	public static Class123 aClass123_5;

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "[I")
	public static int[] anIntArray429 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method3756(@OriginalArg(1) long arg0) {
		Static63.aCalendar1.setTime(new Date(arg0));
		@Pc(18) int local18 = Static63.aCalendar1.get(7);
		@Pc(22) int local22 = Static63.aCalendar1.get(5);
		@Pc(26) int local26 = Static63.aCalendar1.get(2);
		@Pc(30) int local30 = Static63.aCalendar1.get(1);
		@Pc(34) int local34 = Static63.aCalendar1.get(11);
		@Pc(38) int local38 = Static63.aCalendar1.get(12);
		@Pc(42) int local42 = Static63.aCalendar1.get(13);
		return Static169.aStringArray27[local18 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static88.aStringArray14[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIZLclient!lc;)[Lclient!af;")
	public static Class4_Sub2_Sub1_Sub1[] method3757(@OriginalArg(0) int arg0, @OriginalArg(3) Class98 arg1) {
		return Static292.method4344(arg0, 0, arg1) ? Static222.method3555() : null;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BI)Lclient!nn;")
	public static Class4_Sub2_Sub14 method3758(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub2_Sub14 local10 = (Class4_Sub2_Sub14) Static276.aClass69_13.method1930((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24;
		if (arg0 < 32768) {
			local24 = Static256.aClass98_146.method2396(arg0, 1);
		} else {
			local24 = Static227.aClass98_123.method2396(arg0 & 0x7FFF, 1);
		}
		local10 = new Class4_Sub2_Sub14();
		if (local24 != null) {
			local10.method2877(new Class4_Sub17(local24));
		}
		if (arg0 >= 32768) {
			local10.method2881();
		}
		Static276.aClass69_13.method1933((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
	public static void method3759() {
		@Pc(3) int local3 = Static261.anInt4963;
		@Pc(9) int local9 = Static206.anInt4044;
		@Pc(11) int local11 = Static205.anInt4000;
		@Pc(15) int local15 = Static139.anInt2867 - 3;
		if (Static170.aClass4_Sub2_Sub1_6 == null || Static3.aClass4_Sub2_Sub1_1 == null) {
			if (Static288.aClass98_66.method2391(Static281.anInt5347) && Static288.aClass98_66.method2391(Static202.anInt3944)) {
				Static170.aClass4_Sub2_Sub1_6 = Static236.method2951(Static281.anInt5347, Static288.aClass98_66);
				Static3.aClass4_Sub2_Sub1_1 = Static236.method2951(Static202.anInt3944, Static288.aClass98_66);
				if (Static178.aBoolean216) {
					if (Static170.aClass4_Sub2_Sub1_6 instanceof Class4_Sub2_Sub1_Sub1_Sub1) {
						Static170.aClass4_Sub2_Sub1_6 = new Class4_Sub2_Sub1_Sub2_Sub1((Class4_Sub2_Sub1_Sub1) Static170.aClass4_Sub2_Sub1_6);
					} else {
						Static170.aClass4_Sub2_Sub1_6 = new Class4_Sub2_Sub1_Sub2((Class4_Sub2_Sub1_Sub1) Static170.aClass4_Sub2_Sub1_6);
					}
					if (Static3.aClass4_Sub2_Sub1_1 instanceof Class4_Sub2_Sub1_Sub1_Sub1) {
						Static3.aClass4_Sub2_Sub1_1 = new Class4_Sub2_Sub1_Sub2_Sub1((Class4_Sub2_Sub1_Sub1) Static3.aClass4_Sub2_Sub1_1);
					} else {
						Static3.aClass4_Sub2_Sub1_1 = new Class4_Sub2_Sub1_Sub2((Class4_Sub2_Sub1_Sub1) Static3.aClass4_Sub2_Sub1_1);
					}
				}
			} else if (Static178.aBoolean216) {
				Static186.method2954(local3, local11, local9, 20, Static16.anInt313, 256 - Static292.anInt5467);
			} else {
				Static166.method2616(local3, local11, local9, 20, Static16.anInt313, 256 - Static292.anInt5467);
			}
		}
		@Pc(125) int local125;
		@Pc(127) int local127;
		if (Static170.aClass4_Sub2_Sub1_6 != null && Static3.aClass4_Sub2_Sub1_1 != null) {
			local125 = (local9 - Static3.aClass4_Sub2_Sub1_1.anInt4301 * 2) / Static170.aClass4_Sub2_Sub1_6.anInt4301;
			for (local127 = 0; local127 < local125; local127++) {
				Static170.aClass4_Sub2_Sub1_6.method3454(Static3.aClass4_Sub2_Sub1_1.anInt4301 + local3 + Static170.aClass4_Sub2_Sub1_6.anInt4301 * local127, local11);
			}
			Static3.aClass4_Sub2_Sub1_1.method3454(local3, local11);
			Static3.aClass4_Sub2_Sub1_1.method3463(local3 + local9 - Static3.aClass4_Sub2_Sub1_1.anInt4301, local11);
		}
		Static289.aClass4_Sub2_Sub12_3.method4173(Static288.aString71, local3 + 3, local11 + 14, Static100.anInt2131, -1);
		if (Static178.aBoolean216) {
			Static186.method2954(local3, local11 + 20, local9, local15 - 20, Static16.anInt313, 256 - Static292.anInt5467);
		} else {
			Static166.method2616(local3, local11 + 20, local9, local15 - 20, Static16.anInt313, 256 - Static292.anInt5467);
		}
		local127 = Static117.anInt2589;
		local125 = Static72.anInt1326;
		@Pc(214) int local214;
		@Pc(237) int local237;
		for (local214 = 0; local214 < Static60.anInt1152; local214++) {
			local237 = local11 + (Static60.anInt1152 - local214 + -1) * 15 + 33;
			if (local3 < local125 && local3 + local9 > local125 && local127 > local237 - 13 && local237 + 3 > local127) {
				if (Static178.aBoolean216) {
					Static186.method2954(local3, local237 - 12, local9, 15, Static172.anInt3407, 256 - Static277.anInt5180);
				} else {
					Static166.method2616(local3, local237 - 12, local9, 15, Static172.anInt3407, 256 - Static277.anInt5180);
				}
			}
		}
		if ((Static28.aClass4_Sub2_Sub1_2 == null || Static250.aClass4_Sub2_Sub1_8 == null || Static266.aClass4_Sub2_Sub1_10 == null) && Static288.aClass98_66.method2391(Static32.anInt638) && Static288.aClass98_66.method2391(Static218.anInt5362) && Static288.aClass98_66.method2391(Static202.anInt3934)) {
			Static28.aClass4_Sub2_Sub1_2 = Static236.method2951(Static32.anInt638, Static288.aClass98_66);
			Static250.aClass4_Sub2_Sub1_8 = Static236.method2951(Static218.anInt5362, Static288.aClass98_66);
			Static266.aClass4_Sub2_Sub1_10 = Static236.method2951(Static202.anInt3934, Static288.aClass98_66);
			if (Static178.aBoolean216) {
				if (Static28.aClass4_Sub2_Sub1_2 instanceof Class4_Sub2_Sub1_Sub1_Sub1) {
					Static28.aClass4_Sub2_Sub1_2 = new Class4_Sub2_Sub1_Sub2_Sub1((Class4_Sub2_Sub1_Sub1) Static28.aClass4_Sub2_Sub1_2);
				} else {
					Static28.aClass4_Sub2_Sub1_2 = new Class4_Sub2_Sub1_Sub2((Class4_Sub2_Sub1_Sub1) Static28.aClass4_Sub2_Sub1_2);
				}
				if (Static250.aClass4_Sub2_Sub1_8 instanceof Class4_Sub2_Sub1_Sub1_Sub1) {
					Static250.aClass4_Sub2_Sub1_8 = new Class4_Sub2_Sub1_Sub2_Sub1((Class4_Sub2_Sub1_Sub1) Static250.aClass4_Sub2_Sub1_8);
				} else {
					Static250.aClass4_Sub2_Sub1_8 = new Class4_Sub2_Sub1_Sub2((Class4_Sub2_Sub1_Sub1) Static250.aClass4_Sub2_Sub1_8);
				}
				if (Static266.aClass4_Sub2_Sub1_10 instanceof Class4_Sub2_Sub1_Sub1_Sub1) {
					Static266.aClass4_Sub2_Sub1_10 = new Class4_Sub2_Sub1_Sub2_Sub1((Class4_Sub2_Sub1_Sub1) Static266.aClass4_Sub2_Sub1_10);
				} else {
					Static266.aClass4_Sub2_Sub1_10 = new Class4_Sub2_Sub1_Sub2((Class4_Sub2_Sub1_Sub1) Static266.aClass4_Sub2_Sub1_10);
				}
			}
		}
		@Pc(466) int local466;
		if (Static28.aClass4_Sub2_Sub1_2 != null && Static250.aClass4_Sub2_Sub1_8 != null && Static266.aClass4_Sub2_Sub1_10 != null) {
			local214 = (local9 - Static266.aClass4_Sub2_Sub1_10.anInt4301 * 2) / Static28.aClass4_Sub2_Sub1_2.anInt4301;
			for (local237 = 0; local237 < local214; local237++) {
				Static28.aClass4_Sub2_Sub1_2.method3454(Static28.aClass4_Sub2_Sub1_2.anInt4301 * local237 + local3 + Static266.aClass4_Sub2_Sub1_10.anInt4301, local15 + local11 - Static28.aClass4_Sub2_Sub1_2.anInt4308);
			}
			local237 = (local15 - Static266.aClass4_Sub2_Sub1_10.anInt4308 - 20) / Static250.aClass4_Sub2_Sub1_8.anInt4308;
			for (local466 = 0; local466 < local237; local466++) {
				Static250.aClass4_Sub2_Sub1_8.method3454(local3, Static250.aClass4_Sub2_Sub1_8.anInt4308 * local466 + local11 + 20);
				Static250.aClass4_Sub2_Sub1_8.method3463(local9 + local3 - Static250.aClass4_Sub2_Sub1_8.anInt4301, local466 * Static250.aClass4_Sub2_Sub1_8.anInt4308 + 20 + local11);
			}
			Static266.aClass4_Sub2_Sub1_10.method3454(local3, local11 + local15 - Static266.aClass4_Sub2_Sub1_10.anInt4308);
			Static266.aClass4_Sub2_Sub1_10.method3463(local3 + local9 - Static266.aClass4_Sub2_Sub1_10.anInt4301, -Static266.aClass4_Sub2_Sub1_10.anInt4308 + local11 - -local15);
		}
		for (local214 = 0; local214 < Static60.anInt1152; local214++) {
			local237 = (Static60.anInt1152 - local214 - 1) * 15 + local11 + 20 + 13;
			local466 = Static100.anInt2131;
			if (local3 < local125 && local9 + local3 > local125 && local237 - 13 < local127 && local127 < local237 + 3) {
				local466 = Static183.anInt3594;
			}
			Static289.aClass4_Sub2_Sub12_3.method4173(Static249.method3767(local214), local3 + 3, local237, local466, 0);
		}
		Static113.method1929(Static206.anInt4044, Static261.anInt4963, Static139.anInt2867, Static205.anInt4000);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
	public static void method3760() {
		aClass123_5 = null;
		anIntArray429 = null;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZI)V")
	public static void method3761(@OriginalArg(0) boolean arg0) {
		Static125.anIntArray242 = new int[104];
		Static126.anIntArray243 = new int[104];
		Static145.anInt2969 = 99;
		Static179.anIntArray299 = new int[5];
		Static280.anIntArray472 = new int[104];
		Static121.anIntArray239 = new int[104];
		Static210.anIntArray373 = new int[104];
		@Pc(33) byte local33;
		if (arg0) {
			local33 = 1;
		} else {
			local33 = 4;
		}
		Static84.aByteArrayArrayArray4 = new byte[local33][104][104];
		Static200.aByteArrayArrayArray12 = new byte[local33][104][104];
		Static218.aByteArrayArrayArray21 = new byte[local33][104][104];
		Static227.aByteArrayArrayArray14 = new byte[local33][105][105];
		Static81.aByteArrayArrayArray15 = new byte[local33][104][104];
		Static84.anIntArrayArrayArray6 = new int[local33][105][105];
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V")
	public static void method3764() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static231.aBooleanArray21[local3] = false;
		}
		Static297.anInt5494 = -1;
		Static239.anInt4616 = 1;
		Static121.anInt2644 = 0;
		Static126.anInt2695 = -1;
		Static47.anInt951 = 0;
	}
}
