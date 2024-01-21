import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!v", name = "X", descriptor = "I")
	public static int anInt2913;

	@OriginalMember(owner = "client!v", name = "eb", descriptor = "[Lclient!e;")
	public static Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array10;

	@OriginalMember(owner = "client!v", name = "R", descriptor = "[I")
	public static int[] anIntArray358 = new int[4000];

	@OriginalMember(owner = "client!v", name = "S", descriptor = "Lclient!id;")
	public static Class34 aClass34_1501 = Static9.method266("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!v", name = "lb", descriptor = "Lclient!id;")
	private static Class34 aClass34_1508 = Static9.method266("Please wait)3)3)3");

	@OriginalMember(owner = "client!v", name = "T", descriptor = "Lclient!id;")
	public static Class34 aClass34_1502 = aClass34_1508;

	@OriginalMember(owner = "client!v", name = "W", descriptor = "Lclient!id;")
	public static Class34 aClass34_1503 = Static9.method266(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
	public static int anInt2914 = 0;

	@OriginalMember(owner = "client!v", name = "ab", descriptor = "I")
	public static int anInt2916 = -1;

	@OriginalMember(owner = "client!v", name = "fb", descriptor = "Lclient!id;")
	private static Class34 aClass34_1504 = Static9.method266("flash2:");

	@OriginalMember(owner = "client!v", name = "hb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1505 = aClass34_1504;

	@OriginalMember(owner = "client!v", name = "ib", descriptor = "Lclient!id;")
	public static Class34 aClass34_1506 = aClass34_1504;

	@OriginalMember(owner = "client!v", name = "nb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1509 = Static9.method266("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)I")
	public static int method1936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class1_Sub1_Sub2_Sub4.anIntArray334[arg2 * 1024 / arg1] >> 1;
		return (local16 * arg3 >> 16) + (arg0 * (65536 - local16) >> 16);
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
	public static void method1937() {
		@Pc(19) int local19;
		if (Static39.anInt1145 > 0) {
			for (local19 = 0; local19 < 256; local19++) {
				if (Static39.anInt1145 > 768) {
					Static81.anIntArray262[local19] = Static32.method896(Static20.anIntArray75[local19], 1024 - Static39.anInt1145, Static23.anIntArray80[local19]);
				} else if (Static39.anInt1145 <= 256) {
					Static81.anIntArray262[local19] = Static32.method896(Static23.anIntArray80[local19], 256 - Static39.anInt1145, Static20.anIntArray75[local19]);
				} else {
					Static81.anIntArray262[local19] = Static23.anIntArray80[local19];
				}
			}
		} else if (Static109.anInt3087 > 0) {
			for (local19 = 0; local19 < 256; local19++) {
				if (Static109.anInt3087 > 768) {
					Static81.anIntArray262[local19] = Static32.method896(Static20.anIntArray75[local19], 1024 - Static109.anInt3087, Static47.anIntArray143[local19]);
				} else if (Static109.anInt3087 <= 256) {
					Static81.anIntArray262[local19] = Static32.method896(Static47.anIntArray143[local19], 256 - Static109.anInt3087, Static20.anIntArray75[local19]);
				} else {
					Static81.anIntArray262[local19] = Static47.anIntArray143[local19];
				}
			}
		} else {
			for (local19 = 0; local19 < 256; local19++) {
				Static81.anIntArray262[local19] = Static20.anIntArray75[local19];
			}
		}
		Static111.method1753(0, 9, 128, 263);
		local19 = 0;
		Static21.aClass1_Sub1_Sub2_Sub1_1.method192(0, 0);
		@Pc(160) int local160 = 6885;
		Static111.method1748();
		@Pc(181) int local181;
		@Pc(185) int local185;
		@Pc(195) int local195;
		@Pc(202) int local202;
		@Pc(209) int local209;
		@Pc(213) int local213;
		@Pc(218) int local218;
		for (@Pc(163) int local163 = 1; local163 < 255; local163++) {
			local181 = Static95.anIntArray311[local163] * (256 - local163) / 256;
			local185 = local181 + 22;
			if (local185 < 0) {
				local185 = 0;
			}
			local19 += local185;
			for (local195 = local185; local195 < 128; local195++) {
				local202 = Static49.anIntArray152[local19++];
				if (local202 == 0) {
					local160++;
				} else {
					local209 = local202;
					local213 = 256 - local202;
					local218 = Static62.aClass6_1.anIntArray241[local160];
					local202 = Static81.anIntArray262[local202];
					Static62.aClass6_1.anIntArray241[local160++] = (local209 * (local202 & 0xFF00) + local213 * (local218 & 0xFF00) & 0xFF0000) + (local213 * (local218 & 0xFF00FF) + local209 * (local202 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local160 += local185 + 765 - 128;
		}
		local19 = 0;
		Static111.method1753(637, 9, 765, 263);
		local160 = 7546;
		Static75.aClass1_Sub1_Sub2_Sub1_4.method192(382, 0);
		Static111.method1748();
		for (local181 = 1; local181 < 255; local181++) {
			local185 = Static95.anIntArray311[local181] * (256 - local181) / 256;
			local160 += local185;
			local195 = 103 - local185;
			for (local202 = 0; local202 < local195; local202++) {
				local209 = Static49.anIntArray152[local19++];
				if (local209 == 0) {
					local160++;
				} else {
					local213 = local209;
					local218 = 256 - local209;
					local209 = Static81.anIntArray262[local209];
					@Pc(348) int local348 = Static62.aClass6_1.anIntArray241[local160];
					Static62.aClass6_1.anIntArray241[local160++] = (local213 * (local209 & 0xFF00FF) + (local348 & 0xFF00FF) * local218 & 0xFF00FF00) + (local218 * (local348 & 0xFF00) + (local209 & 0xFF00) * local213 & 0xFF0000) >> 8;
				}
			}
			local19 += 128 - local195;
			local160 += 765 - local185 - local195;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IBII)Lclient!le;")
	public static Class1_Sub16 method1938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub16 local7 = new Class1_Sub16();
		local7.anInt1893 = arg2;
		local7.anInt1897 = arg0;
		Static35.aClass48_5.method1336((long) arg1, local7);
		Static32.method907(arg2);
		Static6.method228(arg2);
		@Pc(29) Class1_Sub9 local29 = Static113.method1814(arg1);
		if (local29 != null) {
			Static10.method277(local29);
		}
		if (Static105.aClass1_Sub9_13 != null) {
			Static10.method277(Static105.aClass1_Sub9_13);
			Static105.aClass1_Sub9_13 = null;
		}
		Static71.anInt1876 = 0;
		Static115.aBoolean158 = false;
		Static8.method259(Static2.anInt274, Static88.anInt2288, Static15.anInt605, Static58.anInt1621);
		if (Static9.anInt451 != -1) {
			Static14.method348(Static9.anInt451, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)I")
	public static int method1939(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(20) int local20 = (local9 & 0x33333333) + (local9 >>> 2 & 0x33333333);
		@Pc(32) int local32 = local20 + (local20 >>> 4) & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(49) int local49 = local38 + (local38 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
	public static void method1940() {
		aClass34_1501 = null;
		aClass34_1505 = null;
		aClass34_1502 = null;
		aClass34_1504 = null;
		aClass34_1508 = null;
		aClass34_1503 = null;
		aClass34_1506 = null;
		anIntArray358 = null;
		aClass34_1509 = null;
		aClass1_Sub1_Sub2_Sub2Array10 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ie;III)[Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1[] method1941(@OriginalArg(0) Class35 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static69.method1193(arg2, arg1, arg0) ? Static67.method1132() : null;
	}
}
