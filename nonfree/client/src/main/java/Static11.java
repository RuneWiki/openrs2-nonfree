import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!b", name = "d", descriptor = "I")
	public static int anInt650;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "[Lclient!di;")
	public static Class15[] aClass15Array2 = new Class15[50];

	@OriginalMember(owner = "client!b", name = "b", descriptor = "Lclient!tg;")
	public static Class81 aClass81_220 = Static120.method2057("<col=ff3000>");

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Lclient!tg;")
	public static Class81 aClass81_221 = Static120.method2057("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!b", name = "k", descriptor = "Lclient!tg;")
	private static Class81 aClass81_225 = Static120.method2057("Loading sprites )2 ");

	@OriginalMember(owner = "client!b", name = "e", descriptor = "Lclient!tg;")
	public static Class81 aClass81_222 = aClass81_225;

	@OriginalMember(owner = "client!b", name = "h", descriptor = "Lclient!tg;")
	private static Class81 aClass81_224 = Static120.method2057("Examine");

	@OriginalMember(owner = "client!b", name = "f", descriptor = "Lclient!tg;")
	public static Class81 aClass81_223 = aClass81_224;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "I")
	public static int anInt651 = 0;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "[S")
	public static short[] aShortArray3 = new short[] { 16, 30, 40, 43, 5, 39, 36, 1 };

	@OriginalMember(owner = "client!b", name = "n", descriptor = "Lclient!tg;")
	public static Class81 aClass81_226 = Static120.method2057("blinken3:");

	@OriginalMember(owner = "client!b", name = "o", descriptor = "I")
	public static int anInt655 = 0;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!ka;)V")
	public static void method560(@OriginalArg(1) Class1_Sub8 arg0) {
		if (Static19.aClass67_1 != null) {
			try {
				Static19.aClass67_1.method2168(0L);
				Static19.aClass67_1.method2174(arg0.anInt446, 24, arg0.aByteArray3);
			} catch (@Pc(15) Exception local15) {
			}
		}
		arg0.anInt446 += 24;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	public static void method561() {
		@Pc(3) Class14 local3 = Static43.aClass14_1;
		synchronized (Static43.aClass14_1) {
			Static56.anInt1352 = Static122.anInt2746;
			@Pc(11) int local11;
			if (Static35.anInt969 < 0) {
				for (local11 = 0; local11 < 112; local11++) {
					Static107.aBooleanArray13[local11] = false;
				}
				Static35.anInt969 = Static114.anInt2143;
			} else {
				while (Static114.anInt2143 != Static35.anInt969) {
					local11 = Static108.anIntArray250[Static114.anInt2143];
					Static114.anInt2143 = Static114.anInt2143 + 1 & 0x7F;
					if (local11 >= 0) {
						Static107.aBooleanArray13[local11] = true;
					} else {
						Static107.aBooleanArray13[~local11] = false;
					}
				}
			}
			Static122.anInt2746 = Static56.anInt1355;
		}
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	public static void method563() {
		aClass81_226 = null;
		aClass81_220 = null;
		aClass81_222 = null;
		aClass81_224 = null;
		aClass81_223 = null;
		aClass81_221 = null;
		aClass15Array2 = null;
		aClass81_225 = null;
		aShortArray3 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	public static void method564() {
		Static150.method2606();
		Static155.method2685();
		Static109.method1827();
		Static101.method1672();
		Static160.method2788();
		Static56.method1006();
		Static85.method360();
		Static94.method1586();
		Static128.method2198();
		Static140.method2369();
		Static150.method2607();
		Static92.method1573();
		((Class27) Static22.anInterface3_2).method1030();
		Static10.aClass59_1.method1967();
		Static144.aClass82_Sub1_14.method2956();
		Static176.aClass82_Sub1_18.method2956();
		Static149.aClass82_Sub1_15.method2956();
		Static7.aClass82_Sub1_2.method2956();
		Static17.aClass82_Sub1_6.method2956();
		Static158.aClass82_Sub1_17.method2956();
		Static3.aClass82_Sub1_1.method2956();
		Static104.aClass82_Sub1_11.method2956();
		Static111.aClass82_Sub1_12.method2956();
		Static14.aClass82_Sub1_3.method2956();
		Static152.aClass82_Sub1_16.method2956();
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
	public static void method565() {
		if (Static130.aString4.toLowerCase().indexOf("microsoft") != -1) {
			Static138.anIntArray321[189] = 26;
			Static138.anIntArray321[219] = 42;
			Static138.anIntArray321[187] = 27;
			Static138.anIntArray321[223] = 28;
			Static138.anIntArray321[221] = 43;
			Static138.anIntArray321[191] = 73;
			Static138.anIntArray321[186] = 57;
			Static138.anIntArray321[192] = 58;
			Static138.anIntArray321[190] = 72;
			Static138.anIntArray321[222] = 59;
			Static138.anIntArray321[220] = 74;
			Static138.anIntArray321[188] = 71;
			return;
		}
		Static138.anIntArray321[91] = 42;
		Static138.anIntArray321[59] = 57;
		if (Static130.aMethod1 == null) {
			Static138.anIntArray321[222] = 59;
			Static138.anIntArray321[192] = 58;
		} else {
			Static138.anIntArray321[192] = 28;
			Static138.anIntArray321[222] = 58;
			Static138.anIntArray321[520] = 59;
		}
		Static138.anIntArray321[93] = 43;
		Static138.anIntArray321[46] = 72;
		Static138.anIntArray321[47] = 73;
		Static138.anIntArray321[45] = 26;
		Static138.anIntArray321[61] = 27;
		Static138.anIntArray321[44] = 71;
		Static138.anIntArray321[92] = 74;
	}
}
