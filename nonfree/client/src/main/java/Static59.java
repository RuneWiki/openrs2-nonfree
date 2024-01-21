import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!hc", name = "M", descriptor = "Lclient!dd;")
	public static Class16 aClass16_3;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_211 = Static8.method128("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
	public static final int anInt796 = 5063219;

	@OriginalMember(owner = "client!hc", name = "I", descriptor = "Lclient!ea;")
	private static Class18 aClass18_214 = Static8.method128("OFF");

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "Lclient!ea;")
	public static Class18 aClass18_212 = aClass18_214;

	@OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
	public static int anInt800 = 0;

	@OriginalMember(owner = "client!hc", name = "B", descriptor = "I")
	public static int anInt805 = -1;

	@OriginalMember(owner = "client!hc", name = "F", descriptor = "Lclient!ea;")
	private static Class18 aClass18_213 = Static8.method128("Hidden");

	@OriginalMember(owner = "client!hc", name = "K", descriptor = "Lclient!eb;")
	public static Applet_Sub1 anApplet_Sub1_2 = null;

	@OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
	public static final int anInt818 = 3353893;

	@OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
	public static int anInt819 = 0;

	@OriginalMember(owner = "client!hc", name = "Z", descriptor = "Lclient!ea;")
	public static Class18 aClass18_215 = Static8.method128("<col=ff7000>");

	@OriginalMember(owner = "client!hc", name = "cb", descriptor = "[Lclient!ea;")
	public static Class18[] aClass18Array4 = new Class18[100];

	@OriginalMember(owner = "client!hc", name = "fb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_216 = Static8.method128("Konfig geladen)3");

	@OriginalMember(owner = "client!hc", name = "ub", descriptor = "Lclient!ea;")
	public static Class18 aClass18_217 = aClass18_213;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)V")
	public static void method500(@OriginalArg(1) boolean arg0) {
		Static106.aBoolean127 = arg0;
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(25) int local25;
		@Pc(118) int local118;
		@Pc(122) int local122;
		@Pc(126) int local126;
		@Pc(151) int local151;
		@Pc(155) int local155;
		@Pc(159) int local159;
		if (!Static106.aBoolean127) {
			local10 = Static167.aClass1_Sub6_Sub1_3.method522();
			local14 = Static167.aClass1_Sub6_Sub1_3.method544();
			local18 = Static167.aClass1_Sub6_Sub1_3.method546();
			local25 = (Static12.anInt4661 - Static167.aClass1_Sub6_Sub1_3.anInt839) / 16;
			Static169.anIntArrayArray131 = new int[local25][4];
			for (local118 = 0; local118 < local25; local118++) {
				for (local122 = 0; local122 < 4; local122++) {
					Static169.anIntArrayArray131[local118][local122] = Static167.aClass1_Sub6_Sub1_3.method545();
				}
			}
			local122 = Static167.aClass1_Sub6_Sub1_3.method550();
			local126 = Static167.aClass1_Sub6_Sub1_3.method546();
			Static109.aByteArrayArray16 = new byte[local25][];
			Static92.anIntArray251 = new int[local25];
			Static62.anIntArray163 = new int[local25];
			Static54.aByteArrayArray9 = new byte[local25][];
			Static137.anIntArray356 = new int[local25];
			@Pc(398) boolean local398 = false;
			if ((local18 / 8 == 48 || local18 / 8 == 49) && local126 / 8 == 48) {
				local398 = true;
			}
			if (local18 / 8 == 48 && local126 / 8 == 148) {
				local398 = true;
			}
			local25 = 0;
			for (local151 = (local18 - 6) / 8; local151 <= (local18 + 6) / 8; local151++) {
				for (local155 = (local126 - 6) / 8; local155 <= (local126 + 6) / 8; local155++) {
					local159 = local155 + (local151 << 8);
					if (!local398 || local155 != 49 && local155 != 149 && local155 != 147 && local151 != 50 && (local151 != 49 || local155 != 47)) {
						Static137.anIntArray356[local25] = local159;
						Static92.anIntArray251[local25] = Static42.aClass16_Sub1_16.method2246(Static144.method2735(new Class18[] { Static174.aClass18_1217, Static132.method2564(local151), Static146.aClass18_1034, Static132.method2564(local155) }));
						Static62.anIntArray163[local25] = Static42.aClass16_Sub1_16.method2246(Static144.method2735(new Class18[] { Static84.aClass18_616, Static132.method2564(local151), Static146.aClass18_1034, Static132.method2564(local155) }));
						local25++;
					}
				}
			}
			Static121.method2376(local126, local18, local10, local14, local122);
			return;
		}
		Static167.aClass1_Sub6_Sub1_3.method559();
		for (local10 = 0; local10 < 4; local10++) {
			for (local14 = 0; local14 < 13; local14++) {
				for (local18 = 0; local18 < 13; local18++) {
					local25 = Static167.aClass1_Sub6_Sub1_3.method562(1);
					if (local25 == 1) {
						Static144.anIntArrayArrayArray8[local10][local14][local18] = Static167.aClass1_Sub6_Sub1_3.method562(26);
					} else {
						Static144.anIntArrayArrayArray8[local10][local14][local18] = -1;
					}
				}
			}
		}
		Static167.aClass1_Sub6_Sub1_3.method554();
		local14 = (Static12.anInt4661 - Static167.aClass1_Sub6_Sub1_3.anInt839) / 16;
		Static169.anIntArrayArray131 = new int[local14][4];
		for (local18 = 0; local18 < local14; local18++) {
			for (local25 = 0; local25 < 4; local25++) {
				Static169.anIntArrayArray131[local18][local25] = Static167.aClass1_Sub6_Sub1_3.method535();
			}
		}
		local25 = Static167.aClass1_Sub6_Sub1_3.method522();
		local118 = Static167.aClass1_Sub6_Sub1_3.method541();
		local122 = Static167.aClass1_Sub6_Sub1_3.method541();
		local126 = Static167.aClass1_Sub6_Sub1_3.method544();
		@Pc(132) int local132 = Static167.aClass1_Sub6_Sub1_3.method550();
		Static54.aByteArrayArray9 = new byte[local14][];
		Static92.anIntArray251 = new int[local14];
		Static109.aByteArrayArray16 = new byte[local14][];
		Static62.anIntArray163 = new int[local14];
		Static137.anIntArray356 = new int[local14];
		local14 = 0;
		for (local151 = 0; local151 < 4; local151++) {
			for (local155 = 0; local155 < 13; local155++) {
				for (local159 = 0; local159 < 13; local159++) {
					@Pc(169) int local169 = Static144.anIntArrayArrayArray8[local151][local155][local159];
					if (local169 != -1) {
						@Pc(179) int local179 = local169 >> 14 & 0x3FF;
						@Pc(185) int local185 = local169 >> 3 & 0x7FF;
						@Pc(195) int local195 = (local179 / 8 << 8) + local185 / 8;
						for (@Pc(197) int local197 = 0; local197 < local14; local197++) {
							if (Static137.anIntArray356[local197] == local195) {
								local195 = -1;
								break;
							}
						}
						if (local195 != -1) {
							Static137.anIntArray356[local14] = local195;
							@Pc(229) int local229 = local195 >> 8 & 0xFF;
							@Pc(233) int local233 = local195 & 0xFF;
							Static92.anIntArray251[local14] = Static42.aClass16_Sub1_16.method2246(Static144.method2735(new Class18[] { Static174.aClass18_1217, Static132.method2564(local229), Static146.aClass18_1034, Static132.method2564(local233) }));
							Static62.anIntArray163[local14] = Static42.aClass16_Sub1_16.method2246(Static144.method2735(new Class18[] { Static84.aClass18_616, Static132.method2564(local229), Static146.aClass18_1034, Static132.method2564(local233) }));
							local14++;
						}
					}
				}
			}
		}
		Static121.method2376(local132, local25, local122, local126, local118);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I")
	public static int method516(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "(II)I")
	public static int method549(@OriginalArg(0) int arg0) {
		@Pc(3) Class1_Sub1_Sub6 local3 = Static60.method1242(arg0);
		@Pc(10) int local10 = local3.anInt610;
		@Pc(13) int local13 = local3.anInt609;
		@Pc(23) int local23 = local3.anInt608;
		@Pc(30) int local30 = Class1_Sub1_Sub10.anIntArray193[local23 - local10];
		return local30 & Static170.anIntArray420[local13] >> local10;
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(Z)V")
	public static void method551() {
		aClass18_211 = null;
		aClass16_3 = null;
		aClass18_217 = null;
		aClass18Array4 = null;
		aClass18_212 = null;
		aClass18_214 = null;
		aClass18_215 = null;
		aClass18_216 = null;
		aClass18_213 = null;
	}
}
