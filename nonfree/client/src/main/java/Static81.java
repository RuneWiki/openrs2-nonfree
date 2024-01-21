import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!r", name = "i", descriptor = "I")
	public static int anInt1935;

	@OriginalMember(owner = "client!r", name = "k", descriptor = "[Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3[] aClass2_Sub2_Sub2_Sub3Array10;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_15;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "Lclient!qc;")
	public static Class47 aClass47_16 = new Class47(64);

	@OriginalMember(owner = "client!r", name = "h", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!r", name = "j", descriptor = "Lclient!vd;")
	public static Class62 aClass62_1 = new Class62();

	@OriginalMember(owner = "client!r", name = "l", descriptor = "Lclient!o;")
	public static Class40 aClass40_558 = Static13.method257("Checking for updates )2 ");

	@OriginalMember(owner = "client!r", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_559 = Static13.method257("Error loading your profile)3");

	@OriginalMember(owner = "client!r", name = "o", descriptor = "Lclient!o;")
	public static Class40 aClass40_560 = Static13.method257("::fpson");

	@OriginalMember(owner = "client!r", name = "p", descriptor = "Lclient!o;")
	public static Class40 aClass40_561 = Static13.method257("null");

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)Z")
	public static boolean method1335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(20) Class2_Sub2_Sub10 local20 = Static91.method1470(arg0);
		return local20.method769(arg1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!hc;BZ)V")
	public static void method1336(@OriginalArg(0) Class25 arg0, @OriginalArg(2) boolean arg1) {
		if (Static31.aClass25_48 != null) {
			try {
				Static31.aClass25_48.method730();
			} catch (@Pc(19) Exception local19) {
			}
			Static31.aClass25_48 = null;
		}
		Static31.aClass25_48 = arg0;
		Static44.method787(arg1);
		Static90.aClass2_Sub2_Sub9_1 = null;
		Static11.anInt274 = 0;
		Static97.aClass2_Sub3_5.anInt2546 = 0;
		Static29.aClass2_Sub3_2 = null;
		while (true) {
			@Pc(40) Class2_Sub2_Sub9 local40 = (Class2_Sub2_Sub9) Static76.aClass6_5.method184();
			if (local40 == null) {
				while (true) {
					local40 = (Class2_Sub2_Sub9) Static36.aClass6_2.method184();
					if (local40 == null) {
						if (Static7.aByte1 != 0) {
							try {
								@Pc(92) Class2_Sub3 local92 = new Class2_Sub3(4);
								local92.method1703(4);
								local92.method1703(Static7.aByte1);
								local92.method1694(0);
								Static31.aClass25_48.method731(local92.aByteArray24, 4);
							} catch (@Pc(115) IOException local115) {
								try {
									Static31.aClass25_48.method730();
								} catch (@Pc(120) Exception local120) {
								}
								Static101.anInt2401++;
								Static31.aClass25_48 = null;
							}
						}
						Static60.anInt1510 = 0;
						Static31.aLong151 = System.currentTimeMillis();
						return;
					}
					Static74.aClass41_1.method1204(local40);
					Static105.aClass6_7.method195(local40, local40.aLong152);
					Static93.anInt2182--;
					Static44.anInt1077++;
				}
			}
			Static93.aClass6_6.method195(local40, local40.aLong152);
			Static2.anInt34++;
			Static96.anInt2333--;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public static void method1337() {
		if (Static86.anInt2030 != 1) {
			return;
		}
		if (Static107.anInt2500 >= 539 && Static107.anInt2500 <= 573 && Static90.anInt2133 >= 169 && Static90.anInt2133 < 205 && Static2.anIntArray2[0] != -1) {
			Static62.anInt1551 = 0;
			Static33.aBoolean59 = true;
			Static22.aBoolean184 = true;
		}
		if (Static107.anInt2500 >= 569 && Static107.anInt2500 <= 599 && Static90.anInt2133 >= 168 && Static90.anInt2133 < 205 && Static2.anIntArray2[1] != -1) {
			Static33.aBoolean59 = true;
			Static22.aBoolean184 = true;
			Static62.anInt1551 = 1;
		}
		if (Static107.anInt2500 >= 597 && Static107.anInt2500 <= 627 && Static90.anInt2133 >= 168 && Static90.anInt2133 < 205 && Static2.anIntArray2[2] != -1) {
			Static33.aBoolean59 = true;
			Static22.aBoolean184 = true;
			Static62.anInt1551 = 2;
		}
		if (Static107.anInt2500 >= 625 && Static107.anInt2500 <= 669 && Static90.anInt2133 >= 168 && Static90.anInt2133 < 203 && Static2.anIntArray2[3] != -1) {
			Static33.aBoolean59 = true;
			Static22.aBoolean184 = true;
			Static62.anInt1551 = 3;
		}
		if (Static107.anInt2500 >= 666 && Static107.anInt2500 <= 696 && Static90.anInt2133 >= 168 && Static90.anInt2133 < 205 && Static2.anIntArray2[4] != -1) {
			Static33.aBoolean59 = true;
			Static62.anInt1551 = 4;
			Static22.aBoolean184 = true;
		}
		if (Static107.anInt2500 >= 694 && Static107.anInt2500 <= 724 && Static90.anInt2133 >= 168 && Static90.anInt2133 < 205 && Static2.anIntArray2[5] != -1) {
			Static22.aBoolean184 = true;
			Static62.anInt1551 = 5;
			Static33.aBoolean59 = true;
		}
		if (Static107.anInt2500 >= 722 && Static107.anInt2500 <= 756 && Static90.anInt2133 >= 169 && Static90.anInt2133 < 205 && Static2.anIntArray2[6] != -1) {
			Static33.aBoolean59 = true;
			Static22.aBoolean184 = true;
			Static62.anInt1551 = 6;
		}
		if (Static107.anInt2500 >= 540 && Static107.anInt2500 <= 574 && Static90.anInt2133 >= 466 && Static90.anInt2133 < 502 && Static2.anIntArray2[7] != -1) {
			Static22.aBoolean184 = true;
			Static62.anInt1551 = 7;
			Static33.aBoolean59 = true;
		}
		if (Static107.anInt2500 >= 572 && Static107.anInt2500 <= 602 && Static90.anInt2133 >= 466 && Static90.anInt2133 < 503 && Static2.anIntArray2[8] != -1) {
			Static22.aBoolean184 = true;
			Static33.aBoolean59 = true;
			Static62.anInt1551 = 8;
		}
		if (Static107.anInt2500 >= 599 && Static107.anInt2500 <= 629 && Static90.anInt2133 >= 466 && Static90.anInt2133 < 503 && Static2.anIntArray2[9] != -1) {
			Static62.anInt1551 = 9;
			Static33.aBoolean59 = true;
			Static22.aBoolean184 = true;
		}
		if (Static107.anInt2500 >= 627 && Static107.anInt2500 <= 671 && Static90.anInt2133 >= 467 && Static90.anInt2133 < 502 && Static2.anIntArray2[10] != -1) {
			Static33.aBoolean59 = true;
			Static22.aBoolean184 = true;
			Static62.anInt1551 = 10;
		}
		if (Static107.anInt2500 >= 669 && Static107.anInt2500 <= 699 && Static90.anInt2133 >= 466 && Static90.anInt2133 < 503 && Static2.anIntArray2[11] != -1) {
			Static22.aBoolean184 = true;
			Static33.aBoolean59 = true;
			Static62.anInt1551 = 11;
		}
		if (Static107.anInt2500 >= 696 && Static107.anInt2500 <= 726 && Static90.anInt2133 >= 466 && Static90.anInt2133 < 503 && Static2.anIntArray2[12] != -1) {
			Static33.aBoolean59 = true;
			Static62.anInt1551 = 12;
			Static22.aBoolean184 = true;
		}
		if (Static107.anInt2500 >= 724 && Static107.anInt2500 <= 758 && Static90.anInt2133 >= 466 && Static90.anInt2133 < 502 && Static2.anIntArray2[13] != -1) {
			Static62.anInt1551 = 13;
			Static33.aBoolean59 = true;
			Static22.aBoolean184 = true;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Lclient!ec;")
	public static Class2_Sub2_Sub4 method1338(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub4 local10 = (Class2_Sub2_Sub4) Static22.aClass47_23.method1325((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static30.aClass5_10.method68(arg0, 4);
		local10 = new Class2_Sub2_Sub4();
		if (local28 != null) {
			local10.method478(new Class2_Sub3(local28), arg0);
		}
		local10.method476();
		Static22.aClass47_23.method1332((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public static void method1339() {
		aClass40_561 = null;
		aClass40_560 = null;
		aClass62_1 = null;
		aClass2_Sub2_Sub2_Sub3Array10 = null;
		aClass47_16 = null;
		aClass5_Sub1_15 = null;
		aCRC32_1 = null;
		aClass40_558 = null;
		aClass40_559 = null;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)Lclient!mc;")
	public static Class2_Sub2_Sub13 method1340(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static51.aClass2_Sub2_Sub13ArrayArray1[local3] == null || Static51.aClass2_Sub2_Sub13ArrayArray1[local3][local11] == null) {
			@Pc(30) boolean local30 = Static107.method1665(local3);
			if (!local30) {
				return null;
			}
		}
		return Static51.aClass2_Sub2_Sub13ArrayArray1[local3][local11];
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public static void method1341() {
		while (true) {
			@Pc(13) Class44 local13 = Static20.aClass44_2;
			@Pc(20) Class2_Sub9 local20;
			synchronized (Static20.aClass44_2) {
				local20 = (Class2_Sub9) Static5.aClass44_1.method1220();
			}
			if (local20 == null) {
				return;
			}
			local20.aClass5_Sub1_11.method95(local20.aClass11_3, (int) local20.aLong152, local20.aByteArray13, false);
		}
	}
}
