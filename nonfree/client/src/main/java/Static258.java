import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "[I")
	public static int[] anIntArray440;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "[I")
	public static int[] anIntArray442;

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "Lclient!nr;")
	public static Class129 aClass129_1;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "Z")
	public static boolean aBoolean449 = false;

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "[I")
	public static final int[] anIntArray438 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "Z")
	public static boolean aBoolean450 = false;

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
	public static int anInt5309 = 1;

	@OriginalMember(owner = "client!qh", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method4400(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static164.anInt3686 >= 100 && !Static282.aBoolean504 || Static164.anInt3686 >= 200) {
			Static159.method3073(Static164.aString120);
			return;
		}
		@Pc(26) String local26 = Static164.method3147(arg0);
		if (local26 == null) {
			return;
		}
		@Pc(66) String local66;
		for (@Pc(31) int local31 = 0; local31 < Static164.anInt3686; local31++) {
			@Pc(39) String local39 = Static164.method3147(Static284.aStringArray41[local31]);
			if (local39 != null && local39.equals(local26)) {
				Static159.method3073(arg0 + Static217.aString167);
				return;
			}
			if (Static116.aStringArray6[local31] != null) {
				local66 = Static164.method3147(Static116.aStringArray6[local31]);
				if (local66 != null && local66.equals(local26)) {
					Static159.method3073(arg0 + Static217.aString167);
					return;
				}
			}
		}
		for (@Pc(93) int local93 = 0; local93 < Static173.anInt3827; local93++) {
			local66 = Static164.method3147(Static202.aStringArray33[local93]);
			if (local66 != null && local66.equals(local26)) {
				Static159.method3073(Static3.aString1 + arg0 + Static112.aString83);
				return;
			}
			if (Static80.aStringArray16[local93] != null) {
				@Pc(130) String local130 = Static164.method3147(Static80.aStringArray16[local93]);
				if (local130 != null && local130.equals(local26)) {
					Static159.method3073(Static3.aString1 + arg0 + Static112.aString83);
					return;
				}
			}
		}
		if (Static164.method3147(Static110.aClass2_Sub2_Sub1_Sub1_1.aString22).equals(local26)) {
			Static159.method3073(Static27.aString15);
		} else {
			Static320.aClass4_Sub7_Sub1_3.method1237(34);
			Static320.aClass4_Sub7_Sub1_3.method2416(Static204.method3620(arg0));
			Static320.aClass4_Sub7_Sub1_3.method2373(arg0);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
	public static void method4401() {
		Static322.aClass154_100.method4220(5);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!vm;I)V")
	public static void method4403(@OriginalArg(0) int arg0, @OriginalArg(1) Class92 arg1) {
		Static109.method2033(arg1);
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 > 1) {
			for (local16 = 0; local16 < Static92.anInt2048; local16++) {
				for (local20 = 0; local20 < Static290.anInt5893; local20++) {
					if ((Static348.aByteArrayArrayArray11[1][local16][local20] & 0x2) == 2) {
						Static297.method5046(local16, local20);
					}
				}
			}
		}
		for (local16 = 0; local16 < arg0; local16++) {
			for (local20 = 0; local20 <= Static290.anInt5893; local20++) {
				for (@Pc(56) int local56 = 0; local56 <= Static92.anInt2048; local56++) {
					@Pc(70) int local70;
					@Pc(72) int local72;
					@Pc(74) int local74;
					@Pc(96) int local96;
					@Pc(121) int local121;
					@Pc(210) int local210;
					@Pc(218) int local218;
					@Pc(238) int local238;
					@Pc(242) int local242;
					if ((Static83.aByteArrayArrayArray2[local16][local56][local20] & 0x1) != 0) {
						local70 = local20;
						local72 = local20;
						local74 = local16;
						while (local70 > 0 && (Static83.aByteArrayArrayArray2[local16][local56][local70 - 1] & 0x1) != 0) {
							local70--;
						}
						local96 = local16;
						while (local72 < Static290.anInt5893 && (Static83.aByteArrayArrayArray2[local16][local56][local72 + 1] & 0x1) != 0) {
							local72++;
						}
						label164: while (local74 > 0) {
							for (local121 = local70; local121 <= local72; local121++) {
								if ((Static83.aByteArrayArrayArray2[local74 - 1][local56][local121] & 0x1) == 0) {
									break label164;
								}
							}
							local74--;
						}
						label153: while (local96 < 3) {
							for (local121 = local70; local121 <= local72; local121++) {
								if ((Static83.aByteArrayArrayArray2[local96 + 1][local56][local121] & 0x1) == 0) {
									break label153;
								}
							}
							local96++;
						}
						local121 = (local72 + 1 - local70) * (local96 + 1 - local74);
						if (local121 >= 2) {
							local210 = Static57.anIntArrayArrayArray4[local96][local56][local70] - 240;
							local218 = Static57.anIntArrayArrayArray4[local74][local56][local70];
							Static40.method770(1, local56 * 128, local56 * 128, local70 * 128, local72 * 128 + 128, local210, local218);
							for (local238 = local74; local238 <= local96; local238++) {
								for (local242 = local70; local242 <= local72; local242++) {
									Static83.aByteArrayArrayArray2[local238][local56][local242] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static83.aByteArrayArrayArray2[local16][local56][local20] & 0x2) != 0) {
						local70 = local56;
						local72 = local56;
						local74 = local16;
						local96 = local16;
						while (local70 > 0 && (Static83.aByteArrayArrayArray2[local16][local70 - 1][local20] & 0x2) != 0) {
							local70--;
						}
						while (local72 < Static92.anInt2048 && (Static83.aByteArrayArrayArray2[local16][local72 + 1][local20] & 0x2) != 0) {
							local72++;
						}
						label218: while (local74 > 0) {
							for (local121 = local70; local121 <= local72; local121++) {
								if ((Static83.aByteArrayArrayArray2[local74 - 1][local121][local20] & 0x2) == 0) {
									break label218;
								}
							}
							local74--;
						}
						label207: while (local96 < 3) {
							for (local121 = local70; local121 <= local72; local121++) {
								if ((Static83.aByteArrayArrayArray2[local96 + 1][local121][local20] & 0x2) == 0) {
									break label207;
								}
							}
							local96++;
						}
						local121 = (local96 + 1 - local74) * (local72 + 1 - local70);
						if (local121 >= 2) {
							local210 = Static57.anIntArrayArrayArray4[local96][local70][local20] - 240;
							local218 = Static57.anIntArrayArrayArray4[local74][local70][local20];
							Static40.method770(2, local70 * 128, local72 * 128 + 128, local20 * 128, local20 * 128, local210, local218);
							for (local238 = local74; local238 <= local96; local238++) {
								for (local242 = local70; local242 <= local72; local242++) {
									Static83.aByteArrayArrayArray2[local238][local242][local20] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static83.aByteArrayArrayArray2[local16][local56][local20] & 0x4) != 0) {
						local70 = local56;
						local72 = local56;
						for (local74 = local20; local74 > 0 && (Static83.aByteArrayArrayArray2[local16][local56][local74 - 1] & 0x4) != 0; local74--) {
						}
						for (local96 = local20; local96 < Static290.anInt5893 && (Static83.aByteArrayArrayArray2[local16][local56][local96 + 1] & 0x4) != 0; local96++) {
						}
						label271: while (local70 > 0) {
							for (local121 = local74; local121 <= local96; local121++) {
								if ((Static83.aByteArrayArrayArray2[local16][local70 - 1][local121] & 0x4) == 0) {
									break label271;
								}
							}
							local70--;
						}
						label260: while (local72 < Static92.anInt2048) {
							for (local121 = local74; local121 <= local96; local121++) {
								if ((Static83.aByteArrayArrayArray2[local16][local72 + 1][local121] & 0x4) == 0) {
									break label260;
								}
							}
							local72++;
						}
						if ((local96 + 1 - local74) * (local72 + 1 - local70) >= 4) {
							local121 = Static57.anIntArrayArrayArray4[local16][local70][local74];
							Static40.method770(4, local70 * 128, local72 * 128 + 128, local74 * 128, local96 * 128 + 128, local121, local121);
							for (@Pc(648) int local648 = local70; local648 <= local72; local648++) {
								for (local210 = local74; local210 <= local96; local210++) {
									Static83.aByteArrayArrayArray2[local16][local648][local210] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}
}
