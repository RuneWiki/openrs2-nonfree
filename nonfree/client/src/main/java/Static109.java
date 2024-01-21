import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "Lclient!pc;")
	public static Class12 aClass12_61;

	@OriginalMember(owner = "client!wd", name = "Nb", descriptor = "I")
	public static int anInt2067;

	@OriginalMember(owner = "client!wd", name = "Qb", descriptor = "I")
	public static int anInt2069;

	@OriginalMember(owner = "client!wd", name = "Ub", descriptor = "Lclient!pc;")
	public static Class12 aClass12_62;

	@OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
	public static int anInt2025 = -1;

	@OriginalMember(owner = "client!wd", name = "U", descriptor = "Lclient!hb;")
	public static Class27 aClass27_960 = null;

	@OriginalMember(owner = "client!wd", name = "W", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger3 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!wd", name = "Y", descriptor = "Lclient!hb;")
	public static Class27 aClass27_961 = Static87.method1648("weiss:");

	@OriginalMember(owner = "client!wd", name = "nb", descriptor = "J")
	public static volatile long aLong63 = 0L;

	@OriginalMember(owner = "client!wd", name = "Cb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_962 = Static87.method1648(" (X");

	@OriginalMember(owner = "client!wd", name = "Lb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_963 = Static87.method1648("backtop1");

	@OriginalMember(owner = "client!wd", name = "Mb", descriptor = "[I")
	public static int[] anIntArray325 = new int[25];

	@OriginalMember(owner = "client!wd", name = "Tb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_966 = Static87.method1648("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!wd", name = "Ob", descriptor = "Lclient!hb;")
	public static Class27 aClass27_964 = aClass27_966;

	@OriginalMember(owner = "client!wd", name = "Pb", descriptor = "I")
	public static int anInt2068 = -1;

	@OriginalMember(owner = "client!wd", name = "Rb", descriptor = "I")
	public static final int anInt2070 = 7759444;

	@OriginalMember(owner = "client!wd", name = "Sb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_965 = Static87.method1648("backvmid3");

	@OriginalMember(owner = "client!wd", name = "Vb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_967 = Static87.method1648("Ausw-=hlen");

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(II)V")
	public static void method1438(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static3.aClass3_Sub3_Sub2_Sub2_1.anIntArray172;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(38) int local38;
		@Pc(40) int local40;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local38 = (103 - local25) * 4 * 512 + 24628;
			for (local40 = 1; local40 < 103; local40++) {
				if ((Static89.aByteArrayArrayArray11[arg0][local40][local25] & 0x18) == 0) {
					Static76.aClass18_1.method523(local8, local38, arg0, local40, local25);
				}
				if (arg0 < 3 && (Static89.aByteArrayArrayArray11[arg0 + 1][local40][local25] & 0x8) != 0) {
					Static76.aClass18_1.method523(local8, local38, arg0 + 1, local40, local25);
				}
				local38 += 4;
			}
		}
		Static3.aClass3_Sub3_Sub2_Sub2_1.method793();
		local38 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
		local40 = (int) (Math.random() * (double) 20) + 228 << 16;
		@Pc(144) int local144;
		for (@Pc(140) int local140 = 1; local140 < 103; local140++) {
			for (local144 = 1; local144 < 103; local144++) {
				if ((Static89.aByteArrayArrayArray11[arg0][local144][local140] & 0x18) == 0) {
					Static108.method1904(local144, local38, local40, arg0, local140);
				}
				if (arg0 < 3 && (Static89.aByteArrayArrayArray11[arg0 + 1][local144][local140] & 0x8) != 0) {
					Static108.method1904(local144, local38, local40, arg0 + 1, local140);
				}
			}
		}
		Static72.anInt1912 = 0;
		for (local144 = 0; local144 < 104; local144++) {
			for (@Pc(208) int local208 = 0; local208 < 104; local208++) {
				@Pc(216) int local216 = Static76.aClass18_1.method531(Static68.anInt1747, local144, local208);
				if (local216 != 0) {
					local216 = local216 >> 14 & 0x7FFF;
					@Pc(234) int local234 = Static108.method1902(local216).anInt1317;
					if (local234 >= 0) {
						@Pc(241) int local241 = local144;
						@Pc(243) int local243 = local208;
						if (local234 != 22 && local234 != 29 && local234 != 34 && local234 != 36 && local234 != 46 && local234 != 47 && local234 != 48) {
							@Pc(277) int[][] local277 = Static57.aClass49Array1[Static68.anInt1747].anIntArrayArray56;
							for (@Pc(279) int local279 = 0; local279 < 10; local279++) {
								@Pc(286) int local286 = (int) (Math.random() * 4.0D);
								if (local286 == 0 && local241 > 0 && local241 > local144 - 3 && (local277[local241 - 1][local243] & 0x1280108) == 0) {
									local241--;
								}
								if (local286 == 1 && local241 < 103 && local241 < local144 + 3 && (local277[local241 + 1][local243] & 0x1280180) == 0) {
									local241++;
								}
								if (local286 == 2 && local243 > 0 && local208 - 3 < local243 && (local277[local241][local243 - 1] & 0x1280102) == 0) {
									local243--;
								}
								if (local286 == 3 && local243 < 103 && local208 + 3 > local243 && (local277[local241][local243 + 1] & 0x1280120) == 0) {
									local243++;
								}
							}
						}
						Static2.aClass3_Sub3_Sub2_Sub2Array2[Static72.anInt1912] = Static108.aClass3_Sub3_Sub2_Sub2Array13[local234];
						Static20.anIntArray65[Static72.anInt1912] = local241;
						Static4.anIntArray399[Static72.anInt1912] = local243;
						Static72.anInt1912++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "(B)V")
	public static void method1453() {
		aClass12_62 = null;
		anIntArray325 = null;
		aClass27_961 = null;
		aClass27_962 = null;
		aClass27_966 = null;
		aClass12_61 = null;
		aClass27_967 = null;
		aBigInteger3 = null;
		aClass27_965 = null;
		aClass27_963 = null;
		aClass27_960 = null;
		aClass27_964 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method1456(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "(II)V")
	public static void method1459(@OriginalArg(0) int arg0) {
		if (Static59.anInt1508 == arg0) {
			return;
		}
		if (Static59.anInt1508 == 0) {
			Static59.method1107();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static84.anInt2212 = 0;
			Static84.anInt2219 = 0;
			Static74.anInt2071 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static52.aClass20_26 != null) {
			Static52.aClass20_26.method656();
			Static52.aClass20_26 = null;
		}
		if (Static59.anInt1508 == 25 || Static59.anInt1508 == 40) {
			Static50.method978();
			Static95.method1320();
		}
		if (Static59.anInt1508 == 25) {
			Static69.anInt1787 = 0;
			Static25.anInt659 = 1;
			Static66.anInt1702 = 0;
			Static24.anInt644 = 0;
			Static92.anInt2541 = 1;
		}
		if (arg0 == 35) {
			Static15.method256();
			Static7.method161();
			if (Static1.aClass12_1 == null) {
				Static1.aClass12_1 = Static8.method182(Static19.aCanvas1, 765, 503);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static1.aClass12_1 = null;
			Static15.method256();
			Static3.method70(Static90.aClass54_Sub1_43, Static106.aClass54_Sub1_15, Static19.aCanvas1);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static1.aClass12_1 = null;
			Static7.method161();
			Static41.method878(Static19.aCanvas1, Static90.aClass54_Sub1_43);
		}
		Static89.aBoolean121 = true;
		Static59.anInt1508 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(Z)Lclient!wa;")
	public static Class7 method1460() {
		try {
			return (Class7) Class.forName("Class7_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class7_Sub2();
		}
	}
}
