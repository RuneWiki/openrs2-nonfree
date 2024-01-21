import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!dc", name = "Ab", descriptor = "Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 aClass6_Sub3_Sub3_Sub3_21;

	@OriginalMember(owner = "client!dc", name = "Cc", descriptor = "I")
	public static int anInt2345;

	@OriginalMember(owner = "client!dc", name = "rc", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1233 = Static80.method1463("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!dc", name = "uc", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1234 = Static80.method1463("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!dc", name = "Hc", descriptor = "Lclient!la;")
	public static Class6_Sub4_Sub1 aClass6_Sub4_Sub1_4 = new Class6_Sub4_Sub1(5000);

	@OriginalMember(owner = "client!dc", name = "Ic", descriptor = "I")
	public static int anInt2350 = 0;

	@OriginalMember(owner = "client!dc", name = "Kc", descriptor = "[I")
	public static int[] anIntArray275 = new int[1000];

	@OriginalMember(owner = "client!dc", name = "Lc", descriptor = "I")
	public static int anInt2352 = 0;

	@OriginalMember(owner = "client!dc", name = "Mc", descriptor = "I")
	public static final int anInt2353 = 2301979;

	@OriginalMember(owner = "client!dc", name = "Nc", descriptor = "I")
	public static int anInt2354 = 0;

	@OriginalMember(owner = "client!dc", name = "Oc", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1235 = Static80.method1463("Aus");

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "(I)V")
	public static void method1542() {
		@Pc(14) int local14 = Static91.anInt2560 + (Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347 >> 7);
		Static102.anInt2822 = 0;
		@Pc(23) int local23 = (Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319 >> 7) + Static80.anInt2169;
		if (local23 >= 3053 && local23 <= 3156 && local14 >= 3056 && local14 <= 3136) {
			Static102.anInt2822 = 1;
		}
		if (local23 >= 3072 && local23 <= 3118 && local14 >= 9492 && local14 <= 9535) {
			Static102.anInt2822 = 1;
		}
		if (Static102.anInt2822 == 1 && local23 >= 3139 && local23 <= 3199 && local14 >= 3008 && local14 <= 3062) {
			Static102.anInt2822 = 0;
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(IB)Lclient!rd;")
	public static Class63 method1546(@OriginalArg(0) int arg0) {
		return Static15.method374(new Class63[] { Static118.method2114(arg0 >> 24 & 0xFF), Static36.aClass63_645, Static118.method2114(arg0 >> 16 & 0xFF), Static36.aClass63_645, Static118.method2114(arg0 >> 8 & 0xFF), Static36.aClass63_645, Static118.method2114(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V")
	public static void method1549() {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = -1; local3 < Static81.anInt2219; local3++) {
			if (local3 == -1) {
				local11 = 2047;
			} else {
				local11 = Static114.anIntArray356[local3];
			}
			@Pc(21) Class6_Sub3_Sub1_Sub2_Sub2 local21 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local11];
			if (local21 != null && local21.anInt2291 > 0) {
				local21.anInt2291--;
				if (local21.anInt2291 == 0) {
					local21.aClass63_1232 = null;
				}
			}
		}
		for (local11 = 0; local11 < Static22.anInt689; local11++) {
			@Pc(58) int local58 = Static80.anIntArray247[local11];
			@Pc(62) Class6_Sub3_Sub1_Sub2_Sub1 local62 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local58];
			if (local62 != null && local62.anInt2291 > 0) {
				local62.anInt2291--;
				if (local62.anInt2291 == 0) {
					local62.aClass63_1232 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ge;BLclient!ge;)V")
	public static void method1550(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		Static15.aClass7_7 = arg0;
		Static58.aClass7_35 = arg1;
		Static13.anInt429 = Static15.aClass7_7.method103(3);
	}

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "(I)V")
	public static void method1551() {
		aClass6_Sub3_Sub3_Sub3_21 = null;
		Class6_Sub3_Sub1_Sub2.anIntArray272 = null;
		aClass6_Sub4_Sub1_4 = null;
		aClass63_1234 = null;
		aClass63_1233 = null;
		aClass63_1235 = null;
		anIntArray275 = null;
	}
}
