import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "J")
	public static long aLong5;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4 aClass1_Sub2_Sub2_Sub4_1;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "[I")
	public static int[] anIntArray12 = new int[200];

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
	public static int anInt52 = 0;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "Lclient!fc;")
	private static Class25 aClass25_35 = Static78.method1313("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "Lclient!fc;")
	private static Class25 aClass25_43 = Static78.method1313("Loaded input handler");

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!fc;")
	public static Class25 aClass25_36 = aClass25_43;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	public static int anInt54 = 0;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	public static int anInt56 = 0;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
	public static int anInt59 = 0;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Lclient!fc;")
	public static Class25 aClass25_37 = Static78.method1313("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "Lclient!fc;")
	public static Class25 aClass25_38 = Static78.method1313("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "Lclient!fc;")
	public static Class25 aClass25_39 = Static78.method1313("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "Lclient!fc;")
	private static Class25 aClass25_41 = Static78.method1313("Report abuse");

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "Lclient!fc;")
	public static Class25 aClass25_40 = aClass25_41;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
	public static final int anInt62 = 20;

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "Lclient!fc;")
	public static Class25 aClass25_42 = Static78.method1313("sl_flags");

	@OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
	public static int anInt64 = 0;

	@OriginalMember(owner = "client!ab", name = "G", descriptor = "Lclient!fc;")
	public static Class25 aClass25_44 = aClass25_35;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!lf;")
	public static Class7 method37(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class7_Sub2");
			@Pc(10) Class7 local10 = (Class7) local6.getDeclaredConstructor().newInstance();
			local10.method1097(arg0, arg1, arg2);
			return local10;
		} catch (@Pc(19) Throwable local19) {
			@Pc(23) Class7_Sub1 local23 = new Class7_Sub1();
			local23.method1097(arg0, arg1, arg2);
			return local23;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method38() {
		for (@Pc(18) Class1_Sub2_Sub3_Sub1 local18 = (Class1_Sub2_Sub3_Sub1) Static100.aClass2_10.method22(); local18 != null; local18 = (Class1_Sub2_Sub3_Sub1) Static100.aClass2_10.method23()) {
			if (Static21.anInt596 != local18.anInt326 || local18.aBoolean8) {
				local18.method2024();
			} else if (local18.anInt324 <= Static60.anInt1366) {
				local18.method285(Static18.anInt522);
				if (local18.aBoolean8) {
					local18.method2024();
				} else {
					Static118.aClass4_1.method66(local18.anInt326, local18.anInt328, local18.anInt329, local18.anInt322, 60, local18, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public static void method39() {
		@Pc(11) int local11;
		if (anInt64 > 0) {
			for (local11 = 0; local11 < 256; local11++) {
				if (anInt64 > 768) {
					Static80.anIntArray322[local11] = Static56.method1046(Static127.anIntArray499[local11], Static124.anIntArray494[local11], 1024 - anInt64);
				} else if (anInt64 <= 256) {
					Static80.anIntArray322[local11] = Static56.method1046(Static124.anIntArray494[local11], Static127.anIntArray499[local11], 256 - anInt64);
				} else {
					Static80.anIntArray322[local11] = Static124.anIntArray494[local11];
				}
			}
		} else if (Static111.anInt2596 <= 0) {
			for (local11 = 0; local11 < 256; local11++) {
				Static80.anIntArray322[local11] = Static127.anIntArray499[local11];
			}
		} else {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static111.anInt2596 > 768) {
					Static80.anIntArray322[local11] = Static56.method1046(Static127.anIntArray499[local11], Static101.anIntArray411[local11], 1024 - Static111.anInt2596);
				} else if (Static111.anInt2596 <= 256) {
					Static80.anIntArray322[local11] = Static56.method1046(Static101.anIntArray411[local11], Static127.anIntArray499[local11], 256 - Static111.anInt2596);
				} else {
					Static80.anIntArray322[local11] = Static101.anIntArray411[local11];
				}
			}
		}
		local11 = 0;
		Static128.method1942(0, 9, 128, 263);
		Static57.aClass1_Sub2_Sub2_Sub1_13.method207(0, 0);
		Static128.method1946();
		@Pc(159) int local159 = 6885;
		@Pc(174) int local174;
		@Pc(179) int local179;
		@Pc(189) int local189;
		@Pc(196) int local196;
		@Pc(203) int local203;
		@Pc(207) int local207;
		@Pc(216) int local216;
		for (@Pc(161) int local161 = 1; local161 < 255; local161++) {
			local174 = (256 - local161) * Static35.anIntArray180[local161] / 256;
			local179 = local174 + 22;
			if (local179 < 0) {
				local179 = 0;
			}
			local11 += local179;
			for (local189 = local179; local189 < 128; local189++) {
				local196 = Static53.anIntArray430[local11++];
				if (local196 == 0) {
					local159++;
				} else {
					local203 = local196;
					local207 = 256 - local196;
					local196 = Static80.anIntArray322[local196];
					local216 = Static88.aClass7_14.anIntArray269[local159];
					Static88.aClass7_14.anIntArray269[local159++] = ((local216 & 0xFF00FF) * local207 + local203 * (local196 & 0xFF00FF) & 0xFF00FF00) + ((local216 & 0xFF00) * local207 + (local196 & 0xFF00) * local203 & 0xFF0000) >> 8;
				}
			}
			local159 += local179 + 637;
		}
		local159 = 7546;
		Static128.method1942(637, 9, 765, 263);
		local11 = 0;
		Static98.aClass1_Sub2_Sub2_Sub1_16.method207(382, 0);
		Static128.method1946();
		for (local174 = 1; local174 < 255; local174++) {
			local179 = Static35.anIntArray180[local174] * (256 - local174) / 256;
			local159 += local179;
			local189 = 103 - local179;
			for (local196 = 0; local196 < local189; local196++) {
				local203 = Static53.anIntArray430[local11++];
				if (local203 == 0) {
					local159++;
				} else {
					local216 = 256 - local203;
					local207 = local203;
					local203 = Static80.anIntArray322[local203];
					@Pc(344) int local344 = Static88.aClass7_14.anIntArray269[local159];
					Static88.aClass7_14.anIntArray269[local159++] = (local216 * (local344 & 0xFF00) + (local203 & 0xFF00) * local207 & 0xFF0000) + (local207 * (local203 & 0xFF00FF) + local216 * (local344 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local11 += 128 - local189;
			local159 += 765 - local179 - local189;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)Z")
	public static boolean method41(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
	public static void method42() {
		aClass25_43 = null;
		aClass25_35 = null;
		aClass25_40 = null;
		aClass25_37 = null;
		aClass25_38 = null;
		aClass25_42 = null;
		aClass25_36 = null;
		anIntArray12 = null;
		aClass25_41 = null;
		aClass25_44 = null;
		aClass25_39 = null;
		aClass1_Sub2_Sub2_Sub4_1 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIB)V")
	public static void method43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = 2048 - arg0 & 0x7FF;
		@Pc(16) int local16 = 2048 - arg4 & 0x7FF;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg3;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32;
		@Pc(28) int local28;
		@Pc(43) int local43;
		if (local9 != 0) {
			local28 = Class1_Sub2_Sub2_Sub2.anIntArray185[local9];
			local32 = Class1_Sub2_Sub2_Sub2.anIntArray189[local9];
			local43 = local28 * 0 - arg3 * local32 >> 16;
			local20 = local32 * 0 + arg3 * local28 >> 16;
			local22 = local43;
		}
		if (local16 != 0) {
			local32 = Class1_Sub2_Sub2_Sub2.anIntArray189[local16];
			local28 = Class1_Sub2_Sub2_Sub2.anIntArray185[local16];
			local43 = local28 * 0 + local32 * local20 >> 16;
			local20 = local28 * local20 - local32 * 0 >> 16;
			local18 = local43;
		}
		Static106.anInt2477 = arg4;
		Static90.anInt2026 = arg1 - local22;
		Static67.anInt1471 = arg2 - local20;
		Static75.anInt1566 = arg5 - local18;
		Static35.anInt1003 = arg0;
	}
}
