import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "Lclient!dp;")
	public static Class53 aClass53_129;

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
	public static int anInt5315;

	@OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
	public static int anInt5316;

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
	public static int anInt5318;

	@OriginalMember(owner = "client!rr", name = "v", descriptor = "Lclient!po;")
	public static Class72 aClass72_5;

	@OriginalMember(owner = "client!rr", name = "x", descriptor = "Z")
	public static boolean aBoolean369;

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "[I")
	public static final int[] anIntArray571 = new int[13];

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "Z")
	public static boolean aBoolean368 = false;

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
	public static int anInt5319 = 0;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZII)V")
	public static void method4840(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg1 != 0 && arg0) {
				Static289.aClass81_7 = Static220.method3909(Static308.aClass206_5, Static354.aCanvas5, Static263.anInterface2_5, 0, 0);
				Static289.aClass81_7.method2987(0);
				@Pc(27) Class26 local27 = Static61.method994(Static210.anInt3845, Static5.aClass53_8);
				@Pc(36) Class30 local36 = Static289.aClass81_7.method3046(local27, Static363.method2249(Static269.aClass53_124, Static210.anInt3845));
				Static113.method2274(true, Static171.aString133, local36);
				Static289.aClass81_7.method3030();
				Static66.method1126();
			}
			Static289.aClass81_7 = Static220.method3909(Static308.aClass206_5, Static354.aCanvas5, Static263.anInterface2_5, arg1, Static297.anInt5582 * 2);
			if (Static289.aClass81_7.method3044()) {
				@Pc(62) Class6_Sub29 local62 = Static289.aClass81_7.method2984();
				Static289.aClass81_7.method3048(local62);
			}
		} catch (@Pc(67) Throwable local67) {
			if (arg1 != 0) {
				arg1 = 0;
				Static289.aClass81_7 = Static220.method3909(Static308.aClass206_5, Static354.aCanvas5, Static263.anInterface2_5, 0, 0);
			}
		}
		Static13.anInt232 = arg1;
		Static306.method5248();
		if (!Static289.aClass81_7.method2964()) {
			Static220.anInt4057 = 1;
		}
		Static289.aClass81_7.method3013(Static220.anInt4057);
		Static289.aClass81_7.method3039(0);
		Static160.aClass72_3 = Static289.aClass81_7.method3029();
		aClass72_5 = Static289.aClass81_7.method3029();
		@Pc(114) int local114 = (int) ((double) Static153.anInt2883 * 34.46D);
		if (Static289.aClass81_7.method2949()) {
			local114 += 128;
		}
		Static289.aClass81_7.method3019(50, local114);
		Static289.aClass81_7.method2995(!Static61.aBoolean81);
		if (Static289.aClass81_7.method2997()) {
			Static50.method846(Static131.aBoolean201);
		}
		Static259.aBoolean337 = !Static16.method287();
		Static16.method281(Static246.anInt4606 >> 3, Static153.anInt2883 >> 3, Static289.aClass81_7);
		Static262.method4419();
		Static263.aBoolean339 = false;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(II)I")
	public static int method4841(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILclient!mb;I)I")
	public static int method4843(@OriginalArg(1) Class132 arg0, @OriginalArg(2) int arg1) {
		if (!Static43.method751(arg0).method4580(arg1) && arg0.anObjectArray19 == null) {
			return -1;
		} else if (arg0.anIntArray410 == null || arg0.anIntArray410.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray410[arg1];
		}
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)V")
	public static void method4844() {
		Static162.anInt3066 = 0;
		Static15.anInt281 = 0;
		Static103.method2107();
		Static273.method5574();
		Static16.method285();
		Static173.method3392();
		@Pc(33) int local33;
		for (@Pc(27) int local27 = 0; local27 < Static162.anInt3066; local27++) {
			local33 = Static105.anIntArray264[local27];
			if (Static343.aClass44_Sub4_Sub4_Sub1Array1[local33].anInt5105 != Static76.anInt2853) {
				if (Static343.aClass44_Sub4_Sub4_Sub1Array1[local33].anInt4904 > 0) {
					Static285.method4910(Static343.aClass44_Sub4_Sub4_Sub1Array1[local33]);
				}
				Static343.aClass44_Sub4_Sub4_Sub1Array1[local33] = null;
			}
		}
		if (Static142.aClass6_Sub10_Sub1_3.anInt4188 != Static31.anInt578) {
			throw new RuntimeException("gpp1 pos:" + Static142.aClass6_Sub10_Sub1_3.anInt4188 + " psize:" + Static31.anInt578);
		}
		for (local33 = 0; local33 < Static200.anInt3712; local33++) {
			if (Static343.aClass44_Sub4_Sub4_Sub1Array1[Static183.anIntArray400[local33]] == null) {
				throw new RuntimeException("gpp2 pos:" + local33 + " size:" + Static200.anInt3712);
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BI)V")
	public static void method4845(@OriginalArg(1) int arg0) {
		Static23.anInt371 = arg0;
		Static192.anInt3645 = -1;
		Static192.anInt3645 = -1;
		Static323.method5376();
	}
}
