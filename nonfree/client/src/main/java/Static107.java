import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public static int anInt2523 = 0;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1021 = Static121.method2047("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1022 = aClass60_1021;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1023 = Static121.method2047("");

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1024 = Static121.method2047("Members only world");

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1025 = Static121.method2047("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "J")
	public static long aLong89 = 0L;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1026 = Static121.method2047("(U2");

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "[[I")
	public static int[][] anIntArrayArray28 = new int[104][104];

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
	public static int anInt2533 = 0;

	@OriginalMember(owner = "client!sb", name = "B", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1027 = aClass60_1024;

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
	public static int anInt2537 = 127;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)I")
	public static int method1829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 2) {
			@Pc(17) int local17 = method1829(arg0 >> 1, arg1 * arg1);
			if ((arg0 & 0x1) != 0) {
				local17 *= arg1;
			}
			return local17;
		} else if (arg0 == 1) {
			return arg1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)I")
	public static int method1832() {
		return Static93.anInt2268++;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZB)V")
	public static void method1833(@OriginalArg(0) boolean arg0) {
		for (@Pc(14) int local14 = 0; local14 < Static114.anInt2750; local14++) {
			@Pc(22) Class4_Sub4_Sub1_Sub2_Sub1 local22 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[Static38.anIntArray72[local14]];
			@Pc(30) int local30 = (Static38.anIntArray72[local14] << 14) + 536870912;
			if (local22 != null && local22.method1877() && arg0 == local22.aClass4_Sub4_Sub11_1.aBoolean84 && local22.aClass4_Sub4_Sub11_1.method1491()) {
				@Pc(59) int local59 = local22.anInt2620 >> 7;
				@Pc(64) int local64 = local22.anInt2601 >> 7;
				if (local59 >= 0 && local59 < 104 && local64 >= 0 && local64 < 104) {
					if (local22.anInt2612 == 1 && (local22.anInt2620 & 0x7F) == 64 && (local22.anInt2601 & 0x7F) == 64) {
						if (Static87.anInt2044 == anIntArrayArray28[local59][local64]) {
							continue;
						}
						anIntArrayArray28[local59][local64] = Static87.anInt2044;
					}
					if (!local22.aClass4_Sub4_Sub11_1.aBoolean82) {
						local30 += Integer.MIN_VALUE;
					}
					Static7.aClass28_3.method774(Static129.anInt3003, local22.anInt2620, local22.anInt2601, Static54.method1001(local22.anInt2612 * 64 + local22.anInt2620 - 64, local22.anInt2601 + -64 + local22.anInt2612 * 64, Static129.anInt3003), local22.anInt2612 * 64 + 60 - 64, local22, local22.anInt2591, local30, local22.aBoolean112);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!sd;II)V")
	public static void method1835(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub4_Sub1_Sub2_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg1.anInt2633 == arg2 && arg2 != -1) {
			@Pc(52) int local52 = Static127.method2102(arg2).anInt2715;
			if (local52 == 1) {
				arg1.anInt2595 = 0;
				arg1.anInt2626 = 0;
				arg1.anInt2639 = 0;
				arg1.anInt2645 = arg0;
			}
			if (local52 == 2) {
				arg1.anInt2626 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt2633 == -1 || Static127.method2102(arg2).anInt2724 >= Static127.method2102(arg1.anInt2633).anInt2724) {
			arg1.anInt2645 = arg0;
			arg1.anInt2633 = arg2;
			arg1.anInt2626 = 0;
			arg1.anInt2639 = 0;
			arg1.anInt2599 = arg1.anInt2600;
			arg1.anInt2595 = 0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V")
	public static void method1836() {
		aClass63_1 = null;
		aClass60_1025 = null;
		aClass60_1026 = null;
		aClass60_1023 = null;
		aClass60_1022 = null;
		aClass60_1021 = null;
		aClass60_1027 = null;
		aFrame1 = null;
		anIntArrayArray28 = null;
		aClass60_1024 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)Lclient!ve;")
	public static Class4_Sub4_Sub17 method1837(@OriginalArg(1) int arg0) {
		@Pc(15) Class4_Sub4_Sub17 local15 = (Class4_Sub4_Sub17) Static95.aClass48_53.method1390((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static106.aClass40_77.method1110(arg0, 16);
		local15 = new Class4_Sub4_Sub17();
		if (local25 != null) {
			local15.method2103(new Class4_Sub13(local25));
		}
		Static95.aClass48_53.method1392(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IJ)V")
	public static void method1840(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static85.anInt2032 >= 100) {
			Static73.method1386(Static92.aClass60_890, 0, Static22.aClass60_241);
			return;
		}
		@Pc(35) Class60 local35 = Static87.method1501(arg0).method1651();
		for (@Pc(37) int local37 = 0; local37 < Static85.anInt2032; local37++) {
			if (arg0 == Static39.aLongArray7[local37]) {
				Static73.method1386(Static125.method2072(new Class60[] { local35, Static19.aClass60_189 }), 0, Static22.aClass60_241);
				return;
			}
		}
		for (@Pc(72) int local72 = 0; local72 < Static46.anInt1193; local72++) {
			if (arg0 == Static122.aLongArray13[local72]) {
				Static73.method1386(Static125.method2072(new Class60[] { Static110.aClass60_1073, local35, Static98.aClass60_982 }), 0, Static22.aClass60_241);
				return;
			}
		}
		if (local35.method1660(Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.aClass60_1066)) {
			Static73.method1386(Static19.aClass60_188, 0, Static22.aClass60_241);
		} else {
			Static39.aLongArray7[Static85.anInt2032++] = arg0;
			Static92.anInt2194 = Static63.anInt1698;
			Static56.aClass4_Sub13_Sub1_1.method1265(92);
			Static56.aClass4_Sub13_Sub1_1.method1242(arg0);
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	public static void method1841() {
		Static43.aFont1 = null;
		Static31.aFontMetrics1 = null;
		Static59.anImage4 = null;
	}
}
