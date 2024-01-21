import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1495 = Static170.method3101("Benutzername: ");

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "Lclient!ub;")
	public static Class76 aClass76_2 = new Class76();

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1496 = Static170.method3101("Clientscript error in: ");

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1497 = Static170.method3101("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1498 = Static170.method3101("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1499 = Static170.method3101("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
	public static int anInt4279 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public static void method3206() {
		aClass76_2 = null;
		aClass28_1495 = null;
		aClass28_1497 = null;
		aClass28_1498 = null;
		aClass28_1499 = null;
		aClass28_1496 = null;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IJ)V")
	public static void method3208(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static4.anInt128 >= 100) {
			Static51.method1192(Static156.aClass28_1306, 0, Static137.aClass28_1150);
			return;
		}
		@Pc(27) Class28 local27 = Static149.method2829(arg0).method912();
		for (@Pc(29) int local29 = 0; local29 < Static4.anInt128; local29++) {
			if (Static21.aLongArray3[local29] == arg0) {
				Static51.method1192(Static156.aClass28_1306, 0, Static4.method96(new Class28[] { local27, Static81.aClass28_741 }));
				return;
			}
		}
		for (@Pc(65) int local65 = 0; local65 < Static66.anInt2068; local65++) {
			if (Static26.aLongArray4[local65] == arg0) {
				Static51.method1192(Static156.aClass28_1306, 0, Static4.method96(new Class28[] { Static152.aClass28_1266, local27, Static33.aClass28_339 }));
				return;
			}
		}
		if (local27.method934(Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.aClass28_296)) {
			Static51.method1192(Static156.aClass28_1306, 0, Static20.aClass28_229);
			return;
		}
		Static21.aLongArray3[Static4.anInt128] = arg0;
		Static11.aClass28Array2[Static4.anInt128++] = Static149.method2829(arg0);
		Static31.anInt968 = Static90.anInt2570;
		Static51.aClass3_Sub8_Sub1_2.method1559(47);
		Static51.aClass3_Sub8_Sub1_2.method1541(arg0);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZLclient!ah;Lclient!ah;)I")
	public static int method3209(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method1028(Static140.aClass28_1184, Static33.aClass28_341)) {
			local5++;
		}
		if (arg1.method1028(Static140.aClass28_1184, Static2.aClass28_25)) {
			local5++;
		}
		if (arg1.method1028(Static140.aClass28_1184, Static122.aClass28_1037)) {
			local5++;
		}
		if (arg1.method1028(Static140.aClass28_1184, Static114.aClass28_943)) {
			local5++;
		}
		if (arg1.method1028(Static140.aClass28_1184, Static128.aClass28_1076)) {
			local5++;
		}
		if (arg1.method1028(Static140.aClass28_1184, Static78.aClass28_729)) {
			local5++;
		}
		arg1.method1028(Static140.aClass28_1184, Static155.aClass28_1299);
		arg1.method1028(Static140.aClass28_1184, Static94.aClass28_821);
		arg1.method1028(Static140.aClass28_1184, Static58.aClass28_587);
		arg1.method1028(Static140.aClass28_1184, Static68.aClass28_621);
		arg1.method1028(Static140.aClass28_1184, Static84.aClass28_769);
		return local5;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILjava/awt/Component;ILclient!qf;I)Lclient!mf;")
	public static Class30 method3210(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) Class68 arg2, @OriginalArg(4) int arg3) {
		if (Static96.anInt4194 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(40) Class30 local40 = (Class30) Class.forName("Class30_Sub2").getDeclaredConstructor().newInstance();
			local40.anIntArray596 = new int[(Static31.aBoolean51 ? 2 : 1) * 256];
			local40.anInt3503 = arg3;
			local40.method2682(arg1);
			local40.anInt3502 = (arg3 & 0xFFFFFC00) + 1024;
			if (local40.anInt3502 > 16384) {
				local40.anInt3502 = 16384;
			}
			local40.method2672(local40.anInt3502);
			if (Static41.anInt1147 > 0 && Static9.aClass15_1 == null) {
				Static9.aClass15_1 = new Class15();
				Static9.aClass15_1.aClass68_1 = arg2;
				arg2.method2525(Static41.anInt1147, Static9.aClass15_1);
			}
			if (Static9.aClass15_1 != null) {
				if (Static9.aClass15_1.aClass30Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static9.aClass15_1.aClass30Array1[arg0] = local40;
			}
			return local40;
		} catch (@Pc(113) Throwable local113) {
			try {
				@Pc(119) Class30_Sub1 local119 = new Class30_Sub1(arg2, arg0);
				local119.anIntArray596 = new int[(Static31.aBoolean51 ? 2 : 1) * 256];
				local119.anInt3503 = arg3;
				local119.method2682(arg1);
				local119.anInt3502 = 16384;
				local119.method2672(local119.anInt3502);
				if (Static41.anInt1147 > 0 && Static9.aClass15_1 == null) {
					Static9.aClass15_1 = new Class15();
					Static9.aClass15_1.aClass68_1 = arg2;
					arg2.method2525(Static41.anInt1147, Static9.aClass15_1);
				}
				if (Static9.aClass15_1 != null) {
					if (Static9.aClass15_1.aClass30Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static9.aClass15_1.aClass30Array1[arg0] = local119;
				}
				return local119;
			} catch (@Pc(183) Throwable local183) {
				return new Class30();
			}
		}
	}
}
