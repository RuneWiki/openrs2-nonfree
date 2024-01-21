import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!nd", name = "fd", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!nd", name = "gd", descriptor = "Lclient!jd;")
	public static Class37 aClass37_26;

	@OriginalMember(owner = "client!nd", name = "ec", descriptor = "J")
	public static volatile long aLong50 = 0L;

	@OriginalMember(owner = "client!nd", name = "Bc", descriptor = "Lclient!w;")
	public static Class69 aClass69_1 = new Class69();

	@OriginalMember(owner = "client!nd", name = "pd", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1070 = Static69.method1153("wave:");

	@OriginalMember(owner = "client!nd", name = "qd", descriptor = "I")
	public static int anInt1750 = 0;

	@OriginalMember(owner = "client!nd", name = "td", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1071 = aClass64_1070;

	@OriginalMember(owner = "client!nd", name = "ud", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1072 = Static69.method1153("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!nd", name = "wd", descriptor = "I")
	public static int anInt1753 = 0;

	@OriginalMember(owner = "client!nd", name = "xd", descriptor = "[Lclient!nc;")
	public static Class52[] aClass52Array1 = new Class52[4];

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V")
	public static void method1225() {
		aClass64_1070 = null;
		aFont1 = null;
		aClass52Array1 = null;
		aClass64_1071 = null;
		aClass69_1 = null;
		aClass64_1072 = null;
		aClass37_26 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)Z")
	public static boolean method1227(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)V")
	public static void method1231(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static62.aBooleanArray8[arg0]) {
			return;
		}
		Static25.aClass41_74.method1070(arg0);
		if (Static65.aClass1_Sub1_Sub11ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(30) boolean local30 = true;
		for (@Pc(32) int local32 = 0; local32 < Static65.aClass1_Sub1_Sub11ArrayArray1[arg0].length; local32++) {
			if (Static65.aClass1_Sub1_Sub11ArrayArray1[arg0][local32] != null) {
				if (Static65.aClass1_Sub1_Sub11ArrayArray1[arg0][local32].anInt1697 == 2) {
					local30 = false;
				} else {
					Static65.aClass1_Sub1_Sub11ArrayArray1[arg0][local32] = null;
				}
			}
		}
		if (local30) {
			Static65.aClass1_Sub1_Sub11ArrayArray1[arg0] = null;
		}
		Static62.aBooleanArray8[arg0] = false;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)Z")
	public static boolean method1232(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!rd;ZLclient!rd;)V")
	public static void method1233(@OriginalArg(1) Class64 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class64 arg2) {
		if (Static27.aBoolean59) {
			Static27.aBoolean59 = false;
			Static48.method1859();
			Static75.method1257();
			Static75.method1246();
			Static77.method1330();
			Static108.method1806(Static108.anInt2556, Static10.anInt406, Static3.aClass1_Sub1_Sub5_Sub1_1, Static80.anInt1901);
			Static19.method392(Static83.anInt1922, Static101.anIntArray334, -1, Static101.anInt2274 == -1);
			Static63.aBoolean83 = true;
			Static34.aBoolean52 = true;
			Static49.aBoolean67 = true;
		}
		@Pc(42) short local42 = 151;
		@Pc(43) int local43 = local42 - 3;
		Static49.method891();
		Static3.aClass1_Sub1_Sub5_Sub1_1.method665(arg2, 257, 148, 0);
		Static3.aClass1_Sub1_Sub5_Sub1_1.method665(arg2, 256, 147, 16777215);
		if (arg0 != null) {
			local43 += 15;
			if (arg1) {
				@Pc(70) int local70 = Static3.aClass1_Sub1_Sub5_Sub1_1.method654(arg0) + 4;
				Static47.method1957(257 - local70 / 2, 152, local70, 11, 0);
			}
			Static3.aClass1_Sub1_Sub5_Sub1_1.method665(arg0, 257, 163, 0);
			Static3.aClass1_Sub1_Sub5_Sub1_1.method665(arg0, 256, 162, 16777215);
		}
		Static80.method1368();
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V")
	public static void method1234() {
		Static64.aClass1_Sub6_Sub1_2.method1879();
		@Pc(13) int local13 = Static64.aClass1_Sub6_Sub1_2.method1873(8);
		@Pc(22) int local22;
		if (Static64.anInt1488 > local13) {
			for (local22 = local13; local22 < Static64.anInt1488; local22++) {
				Static83.anIntArray286[Static70.anInt1581++] = Static13.anIntArray65[local22];
			}
		}
		if (local13 > Static64.anInt1488) {
			throw new RuntimeException("gnpov1");
		}
		Static64.anInt1488 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(69) int local69 = Static13.anIntArray65[local22];
			@Pc(73) Class1_Sub1_Sub2_Sub1_Sub1 local73 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local69];
			@Pc(78) int local78 = Static64.aClass1_Sub6_Sub1_2.method1873(1);
			if (local78 == 0) {
				Static13.anIntArray65[Static64.anInt1488++] = local69;
				local73.anInt2377 = Static15.anInt471;
			} else {
				@Pc(98) int local98 = Static64.aClass1_Sub6_Sub1_2.method1873(2);
				if (local98 == 0) {
					Static13.anIntArray65[Static64.anInt1488++] = local69;
					local73.anInt2377 = Static15.anInt471;
					Static96.anIntArray436[Static39.anInt914++] = local69;
				} else {
					@Pc(145) int local145;
					@Pc(155) int local155;
					if (local98 == 1) {
						Static13.anIntArray65[Static64.anInt1488++] = local69;
						local73.anInt2377 = Static15.anInt471;
						local145 = Static64.aClass1_Sub6_Sub1_2.method1873(3);
						local73.method1688(false, local145);
						local155 = Static64.aClass1_Sub6_Sub1_2.method1873(1);
						if (local155 == 1) {
							Static96.anIntArray436[Static39.anInt914++] = local69;
						}
					} else if (local98 == 2) {
						Static13.anIntArray65[Static64.anInt1488++] = local69;
						local73.anInt2377 = Static15.anInt471;
						local145 = Static64.aClass1_Sub6_Sub1_2.method1873(3);
						local73.method1688(true, local145);
						local155 = Static64.aClass1_Sub6_Sub1_2.method1873(3);
						local73.method1688(true, local155);
						@Pc(207) int local207 = Static64.aClass1_Sub6_Sub1_2.method1873(1);
						if (local207 == 1) {
							Static96.anIntArray436[Static39.anInt914++] = local69;
						}
					} else if (local98 == 3) {
						Static83.anIntArray286[Static70.anInt1581++] = local69;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(JZ)V")
	public static void method1236(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static106.anInt2498; local14++) {
			if (arg0 == Static14.aLongArray1[local14]) {
				Static106.anInt2498--;
				Static19.aBoolean41 = true;
				for (@Pc(40) int local40 = local14; local40 < Static106.anInt2498; local40++) {
					Static3.aClass64Array1[local40] = Static3.aClass64Array1[local40 + 1];
					Static27.anIntArray139[local40] = Static27.anIntArray139[local40 + 1];
					Static14.aLongArray1[local40] = Static14.aLongArray1[local40 + 1];
					Static55.anIntArray447[local40] = Static55.anIntArray447[local40 + 1];
				}
				Static26.anInt762 = Static15.anInt471 + 1;
				Static49.aClass1_Sub6_Sub1_1.method1877(190);
				Static49.aClass1_Sub6_Sub1_1.method1830(arg0);
				return;
			}
		}
	}
}
