import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
	public static int anInt414;

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Lclient!qc;")
	public static Class2_Sub1_Sub13 aClass2_Sub1_Sub13_1;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "Lclient!wb;")
	public static Class65 aClass65_215 = Static24.method441("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "Lclient!wb;")
	public static Class65 aClass65_216 = Static24.method441("Wordpack geladen)3");

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "Lclient!wb;")
	private static Class65 aClass65_220 = Static24.method441("M");

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Lclient!wb;")
	public static Class65 aClass65_217 = aClass65_220;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "Lclient!wb;")
	public static Class65 aClass65_218 = Static24.method441("(Z");

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "Lclient!wb;")
	public static Class65 aClass65_219 = Static24.method441("blinken2:");

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
	public static int anInt416 = 0;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!qa;")
	public static Class2_Sub8_Sub1 aClass2_Sub8_Sub1_8 = new Class2_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "[I")
	public static int[] anIntArray70 = new int[500];

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "[I")
	public static int[] anIntArray71 = new int[200];

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
	public static int anInt419 = 0;

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "Lclient!wb;")
	private static Class65 aClass65_221 = Static24.method441("To");

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "Lclient!wb;")
	public static Class65 aClass65_222 = aClass65_221;

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "Lclient!wb;")
	private static Class65 aClass65_224 = Static24.method441("Please try again)3");

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "Lclient!wb;")
	public static Class65 aClass65_223 = aClass65_224;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V")
	public static void method261(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) long local15 = (long) ((arg1 << 16) + arg0);
		@Pc(21) Class2_Sub1_Sub13 local21 = (Class2_Sub1_Sub13) Static80.aClass7_4.method165(local15);
		if (local21 != null) {
			Static90.aClass28_4.method828(local21);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public static void method262() {
		Static100.anInt2785++;
		Static63.method1111(true);
		Static30.method571(true);
		Static63.method1111(false);
		Static30.method571(false);
		Static16.method319();
		Static41.method788();
		@Pc(29) int local29;
		@Pc(36) int local36;
		if (!Static35.aBoolean73) {
			local29 = Static63.anInt1905;
			local36 = Static3.anInt160 + Static80.anInt2290 & 0x7FF;
			if (Static7.anInt288 / 256 > local29) {
				local29 = Static7.anInt288 / 256;
			}
			if (Static70.aBooleanArray20[4] && Static96.anIntArray395[4] + 128 > local29) {
				local29 = Static96.anIntArray395[4] + 128;
			}
			Static61.method1081(Static106.anInt2834, local29 * 3 + 600, local29, Static13.anInt461, Static25.method447(Static62.anInt1879, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1562, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1518) - 50, local36);
		}
		if (Static35.aBoolean73) {
			local29 = Static84.method1449();
		} else {
			local29 = Static39.method762();
		}
		@Pc(94) int local94 = Static26.anInt2923;
		local36 = Static87.anInt2520;
		@Pc(98) int local98 = Static51.anInt1481;
		@Pc(100) int local100 = Static9.anInt318;
		@Pc(102) int local102 = Static97.anInt2699;
		for (@Pc(104) int local104 = 0; local104 < 5; local104++) {
			if (Static70.aBooleanArray20[local104]) {
				@Pc(146) int local146 = (int) ((double) -Static39.anIntArray164[local104] + Math.random() * (double) (Static39.anIntArray164[local104] * 2 + 1) + Math.sin((double) Static28.anIntArray111[local104] / 100.0D * (double) Static106.anIntArray413[local104]) * (double) Static96.anIntArray395[local104]);
				if (local104 == 2) {
					Static51.anInt1481 += local146;
				}
				if (local104 == 3) {
					Static97.anInt2699 = Static97.anInt2699 + local146 & 0x7FF;
				}
				if (local104 == 0) {
					Static87.anInt2520 += local146;
				}
				if (local104 == 1) {
					Static26.anInt2923 += local146;
				}
				if (local104 == 4) {
					Static9.anInt318 += local146;
					if (Static9.anInt318 < 128) {
						Static9.anInt318 = 128;
					}
					if (Static9.anInt318 > 383) {
						Static9.anInt318 = 383;
					}
				}
			}
		}
		Static70.method1260();
		Static86.aBoolean128 = true;
		Static86.anInt2516 = Static85.anInt2459 - 4;
		Static86.anInt2517 = 0;
		Static86.anInt2513 = Static16.anInt480 - 4;
		Static43.method1808();
		Static67.aClass18_1.method619(Static87.anInt2520, Static26.anInt2923, Static51.anInt1481, Static9.anInt318, Static97.anInt2699, local29);
		Static67.aClass18_1.method593();
		Static61.method1082();
		Static18.method1556();
		((Class4) Static10.anInterface1_1).method120(Static28.anInt794);
		Static107.method1754();
		if (Static30.aBoolean64 && Static25.method450() == 0) {
			Static30.aBoolean64 = false;
		}
		if (Static30.aBoolean64) {
			Static70.method1260();
			Static43.method1808();
			Static4.method94(null, false, Static39.aClass65_537);
		}
		Static26.method1805();
		Static26.anInt2923 = local94;
		Static51.anInt1481 = local98;
		Static9.anInt318 = local100;
		Static97.anInt2699 = local102;
		Static87.anInt2520 = local36;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
	public static void method263() {
		aClass65_218 = null;
		aClass65_220 = null;
		aClass2_Sub8_Sub1_8 = null;
		aClass65_221 = null;
		aClass2_Sub1_Sub13_1 = null;
		aClass65_223 = null;
		aClass65_216 = null;
		aClass65_222 = null;
		aClass65_217 = null;
		anIntArray70 = null;
		aClass65_219 = null;
		anIntArray71 = null;
		aClass65_215 = null;
		aClass65_224 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIB)I")
	public static int method265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(18) int local18 = arg2 & arg1 - 1;
		@Pc(22) int local22 = arg2 / arg1;
		@Pc(27) int local27 = Static87.method1546(local7, local22);
		@Pc(33) int local33 = arg0 & arg1 - 1;
		@Pc(40) int local40 = Static87.method1546(local7 + 1, local22);
		@Pc(47) int local47 = Static87.method1546(local7, local22 + 1);
		@Pc(56) int local56 = Static87.method1546(local7 + 1, local22 + 1);
		@Pc(63) int local63 = Static19.method1102(arg1, local40, local27, local33);
		@Pc(70) int local70 = Static19.method1102(arg1, local56, local47, local33);
		return Static19.method1102(arg1, local70, local63, local18);
	}
}
