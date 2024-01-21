import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!va", name = "x", descriptor = "Lclient!le;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!va", name = "G", descriptor = "Lclient!ac;")
	public static Class4 aClass4_2;

	@OriginalMember(owner = "client!va", name = "J", descriptor = "Lclient!fb;")
	public static Class24 aClass24_4;

	@OriginalMember(owner = "client!va", name = "D", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!va", name = "F", descriptor = "Lclient!cd;")
	public static Class13 aClass13_18 = new Class13();

	@OriginalMember(owner = "client!va", name = "I", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1151 = Static119.method1462("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!va", name = "K", descriptor = "I")
	public static volatile int anInt2641 = 0;

	@OriginalMember(owner = "client!va", name = "L", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1152 = Static119.method1462("Prepared sound engine");

	@OriginalMember(owner = "client!va", name = "M", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1153 = Static119.method1462("null");

	@OriginalMember(owner = "client!va", name = "N", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1154 = aClass65_1152;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public static void method1894() {
		Static116.method1853(Static52.aClass2_Sub22_6);
		Static23.anInt1753++;
		if (Static94.aBoolean85 && Static66.aBoolean57) {
			@Pc(28) int local28 = Static39.anInt837;
			@Pc(30) int local30 = Static66.anInt1586;
			local30 -= Static48.anInt1180;
			local28 -= Static60.anInt460;
			if (Static18.anInt402 > local28) {
				local28 = Static18.anInt402;
			}
			if (Static91.anInt2029 > local30) {
				local30 = Static91.anInt2029;
			}
			if (local28 + Static52.aClass2_Sub22_6.anInt2765 > Static82.aClass2_Sub22_17.anInt2765 + Static18.anInt402) {
				local28 = Static18.anInt402 + Static82.aClass2_Sub22_17.anInt2765 - Static52.aClass2_Sub22_6.anInt2765;
			}
			if (local30 + Static52.aClass2_Sub22_6.anInt2787 > Static91.anInt2029 + Static82.aClass2_Sub22_17.anInt2787) {
				local30 = Static91.anInt2029 + Static82.aClass2_Sub22_17.anInt2787 - Static52.aClass2_Sub22_6.anInt2787;
			}
			@Pc(107) int local107 = local30 - Static20.anInt505;
			@Pc(110) int local110 = Static52.aClass2_Sub22_6.anInt2772;
			@Pc(118) int local118 = local30 + Static82.aClass2_Sub22_17.anInt2817 - Static91.anInt2029;
			@Pc(123) int local123 = local28 - Static18.anInt401;
			@Pc(131) int local131 = local28 + Static82.aClass2_Sub22_17.anInt2781 - Static18.anInt402;
			if (Static52.aClass2_Sub22_6.anInt2827 < Static23.anInt1753 && (local110 < local107 || local107 < -local110 || local123 > local110 || -local110 > local123)) {
				Static26.aBoolean24 = true;
			}
			@Pc(180) Class2_Sub9 local180;
			if (Static52.aClass2_Sub22_6.anObjectArray20 != null && Static26.aBoolean24) {
				local180 = new Class2_Sub9();
				local180.anObjectArray2 = Static52.aClass2_Sub22_6.anObjectArray20;
				local180.anInt1718 = local131;
				local180.anInt1723 = local118;
				local180.aClass2_Sub22_7 = Static52.aClass2_Sub22_6;
				Static103.method1703(local180);
			}
			if (Static17.anInt380 == 0) {
				if (Static26.aBoolean24) {
					if (Static52.aClass2_Sub22_6.anObjectArray23 != null) {
						local180 = new Class2_Sub9();
						local180.aClass2_Sub22_7 = Static52.aClass2_Sub22_6;
						local180.anInt1718 = local131;
						local180.anObjectArray2 = Static52.aClass2_Sub22_6.anObjectArray23;
						local180.aClass2_Sub22_8 = Static17.aClass2_Sub22_2;
						local180.anInt1723 = local118;
						Static103.method1703(local180);
					}
					if (Static17.aClass2_Sub22_2 != null && Static95.method1568(Static52.aClass2_Sub22_6) != null) {
						Static49.aClass2_Sub4_Sub1_1.method962(151);
						Static49.aClass2_Sub4_Sub1_1.method925(Static17.aClass2_Sub22_2.anInt2814);
						Static49.aClass2_Sub4_Sub1_1.method920(Static52.aClass2_Sub22_6.anInt2814);
						Static49.aClass2_Sub4_Sub1_1.method947(Static17.aClass2_Sub22_2.anInt2835);
						Static49.aClass2_Sub4_Sub1_1.method909(Static52.aClass2_Sub22_6.anInt2835);
					}
				} else if ((Static107.anInt2410 == 1 || Static20.method343(Static49.anInt1205 - 1)) && Static49.anInt1205 > 2) {
					Static33.method631();
				} else if (Static49.anInt1205 > 0) {
					Static76.method1279(Static49.anInt1205 - 1);
				}
				Static52.aClass2_Sub22_6 = null;
			}
		} else if (Static23.anInt1753 > 1) {
			Static52.aClass2_Sub22_6 = null;
		}
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)I")
	public static int method1895() {
		@Pc(3) int local3 = 3;
		if (Static97.anInt2216 < 310) {
			@Pc(17) int local17 = Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958 >> 7;
			@Pc(21) int local21 = Static130.anInt2838 >> 7;
			@Pc(25) int local25 = Static69.anInt1610 >> 7;
			@Pc(30) int local30 = Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948 >> 7;
			if ((Static88.aByteArrayArrayArray3[Static59.anInt1479][local25][local21] & 0x4) != 0) {
				local3 = Static59.anInt1479;
			}
			@Pc(54) int local54;
			if (local30 > local25) {
				local54 = local30 - local25;
			} else {
				local54 = local25 - local30;
			}
			@Pc(73) int local73;
			if (local17 > local21) {
				local73 = local17 - local21;
			} else {
				local73 = local21 - local17;
			}
			@Pc(89) int local89;
			@Pc(91) int local91;
			if (local54 <= local73) {
				local89 = local54 * 65536 / local73;
				local91 = 32768;
				while (local17 != local21) {
					if (local17 > local21) {
						local21++;
					} else if (local17 < local21) {
						local21--;
					}
					if ((Static88.aByteArrayArrayArray3[Static59.anInt1479][local25][local21] & 0x4) != 0) {
						local3 = Static59.anInt1479;
					}
					local91 += local89;
					if (local91 >= 65536) {
						local91 -= 65536;
						if (local25 < local30) {
							local25++;
						} else if (local25 > local30) {
							local25--;
						}
						if ((Static88.aByteArrayArrayArray3[Static59.anInt1479][local25][local21] & 0x4) != 0) {
							local3 = Static59.anInt1479;
						}
					}
				}
			} else {
				local89 = local73 * 65536 / local54;
				local91 = 32768;
				while (local25 != local30) {
					local91 += local89;
					if (local25 < local30) {
						local25++;
					} else if (local30 < local25) {
						local25--;
					}
					if ((Static88.aByteArrayArrayArray3[Static59.anInt1479][local25][local21] & 0x4) != 0) {
						local3 = Static59.anInt1479;
					}
					if (local91 >= 65536) {
						if (local17 > local21) {
							local21++;
						} else if (local17 < local21) {
							local21--;
						}
						local91 -= 65536;
						if ((Static88.aByteArrayArrayArray3[Static59.anInt1479][local25][local21] & 0x4) != 0) {
							local3 = Static59.anInt1479;
						}
					}
				}
			}
		}
		if ((Static88.aByteArrayArrayArray3[Static59.anInt1479][Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948 >> 7][Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958 >> 7] & 0x4) != 0) {
			local3 = Static59.anInt1479;
		}
		return local3;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(B)V")
	public static void method1896() {
		aClass65_1151 = null;
		aClass13_18 = null;
		aClass24_4 = null;
		aBigInteger2 = null;
		aClass49_1 = null;
		aClass65_1154 = null;
		aClass4_2 = null;
		aClass65_1153 = null;
		aClass65_1152 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
	public static void method1897() {
		if (aClass4_2 != null) {
			aClass4_2.method857();
		}
		if (Static40.aClass4_1 != null) {
			Static40.aClass4_1.method857();
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)V")
	public static void method1898() {
		Static5.anIntArrayArrayArray1 = new int[4][105][105];
		Static129.aByteArrayArrayArray7 = new byte[4][104][104];
		Static93.anIntArray277 = new int[104];
		Static106.aByteArrayArrayArray4 = new byte[4][105][105];
		Static83.anIntArray237 = new int[104];
		Static66.aByteArrayArrayArray2 = new byte[4][104][104];
		Static113.aByteArrayArrayArray5 = new byte[4][104][104];
		Static110.anIntArrayArray24 = new int[105][105];
		Static10.anIntArray418 = new int[104];
		Static14.anInt354 = 99;
		Static12.anIntArray34 = new int[104];
		Static73.anIntArray199 = new int[104];
		Static53.aByteArrayArrayArray1 = new byte[4][104][104];
	}
}
