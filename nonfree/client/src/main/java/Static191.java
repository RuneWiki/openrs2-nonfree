import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
	public static int anInt3881;

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "Lclient!b;")
	public static Class6 aClass6_105;

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1892 = Static193.method3027("hitmarks");

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1893 = Static193.method3027("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1894 = Static193.method3027(" more options");

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
	public static int anInt3883 = 0;

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1895 = aClass70_1894;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1896 = Static193.method3027("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
	public static int anInt3884 = 0;

	@OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
	public static int anInt3886 = -1;

	@OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
	public static int anInt3890 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Lclient!eg;")
	public static Class3_Sub2 method2998(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class3_Sub2_Sub12();
		} else if (arg0 == 1) {
			return new Class3_Sub2_Sub36();
		} else if (arg0 == 2) {
			return new Class3_Sub2_Sub39();
		} else if (arg0 == 3) {
			return new Class3_Sub2_Sub3();
		} else if (arg0 == 4) {
			return new Class3_Sub2_Sub31();
		} else if (arg0 == 5) {
			return new Class3_Sub2_Sub15();
		} else if (arg0 == 6) {
			return new Class3_Sub2_Sub28();
		} else if (arg0 == 7) {
			return new Class3_Sub2_Sub37();
		} else if (arg0 == 8) {
			return new Class3_Sub2_Sub25();
		} else if (arg0 == 9) {
			return new Class3_Sub2_Sub32();
		} else if (arg0 == 10) {
			return new Class3_Sub2_Sub10();
		} else if (arg0 == 11) {
			return new Class3_Sub2_Sub21();
		} else if (arg0 == 12) {
			return new Class3_Sub2_Sub22();
		} else if (arg0 == 13) {
			return new Class3_Sub2_Sub35();
		} else if (arg0 == 14) {
			return new Class3_Sub2_Sub18();
		} else if (arg0 == 15) {
			return new Class3_Sub2_Sub30();
		} else if (arg0 == 16) {
			return new Class3_Sub2_Sub2();
		} else if (arg0 == 17) {
			return new Class3_Sub2_Sub38();
		} else if (arg0 == 18) {
			return new Class3_Sub2_Sub9_Sub1();
		} else if (arg0 == 19) {
			return new Class3_Sub2_Sub29();
		} else if (arg0 == 20) {
			return new Class3_Sub2_Sub16();
		} else if (arg0 == 21) {
			return new Class3_Sub2_Sub7();
		} else if (arg0 == 22) {
			return new Class3_Sub2_Sub5();
		} else if (arg0 == 23) {
			return new Class3_Sub2_Sub19();
		} else if (arg0 == 24) {
			return new Class3_Sub2_Sub11();
		} else if (arg0 == 25) {
			return new Class3_Sub2_Sub23();
		} else if (arg0 == 26) {
			return new Class3_Sub2_Sub8();
		} else if (arg0 == 27) {
			return new Class3_Sub2_Sub20();
		} else if (arg0 == 28) {
			return new Class3_Sub2_Sub13();
		} else if (arg0 == 29) {
			return new Class3_Sub2_Sub27();
		} else if (arg0 == 30) {
			return new Class3_Sub2_Sub34();
		} else if (arg0 == 31) {
			return new Class3_Sub2_Sub17();
		} else if (arg0 == 32) {
			return new Class3_Sub2_Sub24();
		} else if (arg0 == 33) {
			return new Class3_Sub2_Sub1();
		} else if (arg0 == 34) {
			return new Class3_Sub2_Sub4();
		} else if (arg0 == 35) {
			return new Class3_Sub2_Sub6();
		} else if (arg0 == 36) {
			return new Class3_Sub2_Sub26();
		} else if (arg0 == 37) {
			return new Class3_Sub2_Sub14();
		} else if (arg0 == 38) {
			return new Class3_Sub2_Sub33();
		} else if (arg0 == 39) {
			return new Class3_Sub2_Sub9();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	public static void method2999() {
		@Pc(11) int local11;
		if (Static138.anInt2811 > 0) {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static138.anInt2811 > 768) {
					Static55.anIntArray65[local11] = Static142.method2051(Static178.anIntArray305[local11], Static75.anIntArray79[local11], 1024 - Static138.anInt2811);
				} else if (Static138.anInt2811 <= 256) {
					Static55.anIntArray65[local11] = Static142.method2051(Static75.anIntArray79[local11], Static178.anIntArray305[local11], 256 - Static138.anInt2811);
				} else {
					Static55.anIntArray65[local11] = Static178.anIntArray305[local11];
				}
			}
		} else if (Static9.anInt205 <= 0) {
			for (local11 = 0; local11 < 256; local11++) {
				Static55.anIntArray65[local11] = Static75.anIntArray79[local11];
			}
		} else {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static9.anInt205 > 768) {
					Static55.anIntArray65[local11] = Static142.method2051(Static111.anIntArray137[local11], Static75.anIntArray79[local11], 1024 - Static9.anInt205);
				} else if (Static9.anInt205 > 256) {
					Static55.anIntArray65[local11] = Static111.anIntArray137[local11];
				} else {
					Static55.anIntArray65[local11] = Static142.method2051(Static75.anIntArray79[local11], Static111.anIntArray137[local11], 256 - Static9.anInt205);
				}
			}
		}
		local11 = 0;
		@Pc(147) int local147 = Static31.aClass3_Sub3_Sub2_Sub1_2.anInt164 * 9;
		@Pc(149) int local149 = 0;
		@Pc(165) int local165;
		@Pc(178) int local178;
		@Pc(184) int local184;
		@Pc(190) int local190;
		@Pc(201) int local201;
		@Pc(206) int local206;
		for (@Pc(151) int local151 = 1; local151 < 255; local151++) {
			local165 = (256 - local151) * Static184.anIntArray323[local151] / 256 + 22;
			if (local165 < 0) {
				local165 = 0;
			}
			local11 += local165;
			for (local178 = local165; local178 < 128; local178++) {
				local184 = Static209.anIntArray380[local11++];
				local190 = Static31.aClass3_Sub3_Sub2_Sub1_2.anIntArray6[local147++];
				if (local184 == 0) {
					Static113.aClass3_Sub3_Sub2_Sub1_6.anIntArray6[local149++] = local190;
				} else {
					local201 = local184;
					local206 = 256 - local184;
					local184 = Static55.anIntArray65[local184];
					Static113.aClass3_Sub3_Sub2_Sub1_6.anIntArray6[local149++] = (local201 * (local184 & 0xFF00) + (local190 & 0xFF00) * local206 & 0xFF0000) + ((local184 & 0xFF00FF) * local201 + local206 * (local190 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			for (local184 = 0; local184 < local165; local184++) {
				Static113.aClass3_Sub3_Sub2_Sub1_6.anIntArray6[local149++] = Static31.aClass3_Sub3_Sub2_Sub1_2.anIntArray6[local147++];
			}
			local147 += Static31.aClass3_Sub3_Sub2_Sub1_2.anInt164 - 128;
		}
		local149 = 0;
		Static113.aClass3_Sub3_Sub2_Sub1_6.method194(0, 9);
		local11 = 0;
		local147 = Static31.aClass3_Sub3_Sub2_Sub1_2.anInt164 * 9 + 128;
		for (local165 = 1; local165 < 255; local165++) {
			local178 = (256 - local165) * Static184.anIntArray323[local165] / 256 + 22;
			if (local178 < 0) {
				local178 = 0;
			}
			for (local184 = 0; local184 < local178; local184++) {
				@Pc(333) int local333 = local149++;
				local147--;
				Static44.aClass3_Sub3_Sub2_Sub1_3.anIntArray6[local333] = Static31.aClass3_Sub3_Sub2_Sub1_2.anIntArray6[local147];
			}
			for (local190 = local178; local190 < 128; local190++) {
				local201 = Static209.anIntArray380[local11++];
				local147--;
				local206 = Static31.aClass3_Sub3_Sub2_Sub1_2.anIntArray6[local147];
				if (local201 == 0) {
					Static44.aClass3_Sub3_Sub2_Sub1_3.anIntArray6[local149++] = local206;
				} else {
					@Pc(372) int local372 = 256 - local201;
					@Pc(374) int local374 = local201;
					local201 = Static55.anIntArray65[local201];
					Static44.aClass3_Sub3_Sub2_Sub1_3.anIntArray6[local149++] = ((local201 & 0xFF00FF) * local374 + local372 * (local206 & 0xFF00FF) & 0xFF00FF00) + ((local201 & 0xFF00) * local374 + ((local206 & 0xFF00) * local372) & 0xFF0000) >> 8;
				}
			}
			local147 += Static31.aClass3_Sub3_Sub2_Sub1_2.anInt164 + 128;
			local11 += local178;
		}
		Static44.aClass3_Sub3_Sub2_Sub1_3.method194(637, 9);
	}
}
