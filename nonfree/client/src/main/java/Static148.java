import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	public static int anInt3502;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
	public static int anInt3504;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
	public static int anInt3505;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Z")
	public static boolean aBoolean175 = false;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
	public static int anInt3503 = 0;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
	public static int anInt3506 = 0;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[8];

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
	public static void method2781() {
		if (Static176.aClass1_Sub2_Sub9_2 == null) {
			return;
		}
		if (Static191.anInt4244 < 10) {
			if (!Static112.aClass83_72.method2316(Static176.aClass1_Sub2_Sub9_2.aString69)) {
				Static191.anInt4244 = Static241.aClass83_162.method2320(Static176.aClass1_Sub2_Sub9_2.aString69) / 10;
				return;
			}
			Static229.method4020();
			Static191.anInt4244 = 10;
		}
		if (Static191.anInt4244 == 10) {
			Static48.anInt1347 = Static176.aClass1_Sub2_Sub9_2.anInt2176 >> 6 << 6;
			Static234.anInt5158 = Static176.aClass1_Sub2_Sub9_2.anInt2171 >> 6 << 6;
			Static173.anInt3932 = (Static176.aClass1_Sub2_Sub9_2.anInt2173 >> 6 << 6) + 64 - Static48.anInt1347;
			Static178.anInt4022 = (Static176.aClass1_Sub2_Sub9_2.anInt2169 >> 6 << 6) + 64 - Static234.anInt5158;
			@Pc(94) int[] local94 = Static176.aClass1_Sub2_Sub9_2.method1638(Static145.anInt3477, (Static239.aClass25_Sub1_Sub1_2.anInt1604 >> 7) + Static266.anInt5790, Static82.anInt1972 - -(Static239.aClass25_Sub1_Sub1_2.anInt1635 >> 7));
			@Pc(96) int local96 = -1;
			@Pc(98) int local98 = -1;
			if (local94 != null) {
				local98 = Static173.anInt3932 + Static48.anInt1347 - local94[2] - 1;
				local96 = local94[1] - Static234.anInt5158;
			}
			if (local96 >= 0 && Static178.anInt4022 > local96 && local98 >= 0 && local98 < Static173.anInt3932) {
				local98 += (int) (Math.random() * 10.0D) - 5;
				Static88.anInt2053 = local98;
				local96 += (int) (Math.random() * 10.0D) - 5;
				Static87.anInt2033 = local96;
			} else {
				@Pc(175) int[] local175;
				if (Static192.anInt4280 == -1 || Static97.anInt6053 == -1) {
					local175 = Static176.aClass1_Sub2_Sub9_2.method1642(Static176.aClass1_Sub2_Sub9_2.anInt2175 & 0x3FFF, Static176.aClass1_Sub2_Sub9_2.anInt2175 >> 14 & 0x3FFF);
					Static87.anInt2033 = local175[1] - Static234.anInt5158;
					Static88.anInt2053 = Static173.anInt3932 + Static48.anInt1347 - local175[2] - 1;
				} else {
					local175 = Static176.aClass1_Sub2_Sub9_2.method1642(Static97.anInt6053, Static192.anInt4280);
					if (local175 != null) {
						Static87.anInt2033 = local175[1] - Static234.anInt5158;
						Static88.anInt2053 = Static48.anInt1347 + Static173.anInt3932 - local175[2] - 1;
					}
					Static97.anInt6053 = -1;
					Static192.anInt4280 = -1;
				}
			}
			if (Static176.aClass1_Sub2_Sub9_2.anInt2177 == 37) {
				Static241.aFloat173 = 3.0F;
				Static105.aFloat200 = 3.0F;
			} else if (Static176.aClass1_Sub2_Sub9_2.anInt2177 == 50) {
				Static241.aFloat173 = 4.0F;
				Static105.aFloat200 = 4.0F;
			} else if (Static176.aClass1_Sub2_Sub9_2.anInt2177 == 75) {
				Static241.aFloat173 = 6.0F;
				Static105.aFloat200 = 6.0F;
			} else if (Static176.aClass1_Sub2_Sub9_2.anInt2177 == 100) {
				Static241.aFloat173 = 8.0F;
				Static105.aFloat200 = 8.0F;
			} else if (Static176.aClass1_Sub2_Sub9_2.anInt2177 == 200) {
				Static241.aFloat173 = 16.0F;
				Static105.aFloat200 = 16.0F;
			} else {
				Static241.aFloat173 = 8.0F;
				Static105.aFloat200 = 8.0F;
			}
			Static104.method850();
			@Pc(301) int local301 = Static178.anInt4022 >> 6;
			@Pc(305) int local305 = Static173.anInt3932 >> 6;
			Static62.anIntArray168 = new int[Static202.anInt4503 + 1];
			Static139.aByteArrayArrayArray54 = new byte[local301][local305][];
			Static76.anIntArrayArrayArray17 = new int[local301][local305][];
			Static136.aByteArrayArrayArray26 = new byte[local301][local305][];
			Static164.aByteArrayArrayArray31 = new byte[local301][local305][];
			Static205.aByteArrayArrayArray41 = new byte[local301][local305][];
			Static92.anIntArrayArrayArray7 = new int[local301][local305][];
			Static179.anIntArrayArrayArray15 = new int[local301][local305][];
			Static191.aByteArrayArrayArray38 = new byte[local301][local305][];
			@Pc(346) int local346 = Static141.anInt3233 >> 1;
			@Pc(352) int local352 = Static290.anInt6099 >> 2 << 10;
			Static130.method2203(local352, local346);
			Static191.anInt4244 = 20;
		} else if (Static191.anInt4244 == 20) {
			Static274.method2241(new Class1_Sub16(Static112.aClass83_72.method2314(Static176.aClass1_Sub2_Sub9_2.aString69, "underlay")));
			Static191.anInt4244 = 30;
			Static32.method671(true);
			Static54.method1101();
		} else if (Static191.anInt4244 == 30) {
			Static36.method806(new Class1_Sub16(Static112.aClass83_72.method2314(Static176.aClass1_Sub2_Sub9_2.aString69, "overlay")));
			Static191.anInt4244 = 40;
			Static54.method1101();
		} else if (Static191.anInt4244 == 40) {
			Static71.method1320(new Class1_Sub16(Static112.aClass83_72.method2314(Static176.aClass1_Sub2_Sub9_2.aString69, "overlay2")));
			Static191.anInt4244 = 50;
			Static54.method1101();
		} else if (Static191.anInt4244 == 50) {
			Static14.method312(new Class1_Sub16(Static112.aClass83_72.method2314(Static176.aClass1_Sub2_Sub9_2.aString69, "loc")));
			Static191.anInt4244 = 60;
			Static32.method671(true);
			Static54.method1101();
		} else if (Static191.anInt4244 == 60) {
			if (Static112.aClass83_72.method2325(Static176.aClass1_Sub2_Sub9_2.aString69 + "_labels")) {
				if (!Static112.aClass83_72.method2316(Static176.aClass1_Sub2_Sub9_2.aString69 + "_labels")) {
					return;
				}
				Static159.aClass78_2 = Static126.method2147(Static112.aClass83_72, Static176.aClass1_Sub2_Sub9_2.aString69 + "_labels");
			} else {
				Static159.aClass78_2 = new Class78(0);
			}
			Static191.anInt4244 = 70;
			Static54.method1101();
		} else if (Static191.anInt4244 == 70) {
			Static236.aClass100_6 = new Class100(11, true, Static9.aCanvas1);
			Static191.anInt4244 = 73;
			Static32.method671(true);
			Static54.method1101();
		} else if (Static191.anInt4244 == 73) {
			Static80.aClass100_1 = new Class100(12, true, Static9.aCanvas1);
			Static191.anInt4244 = 76;
			Static32.method671(true);
			Static54.method1101();
		} else if (Static191.anInt4244 == 76) {
			Static190.aClass100_4 = new Class100(14, true, Static9.aCanvas1);
			Static191.anInt4244 = 79;
			Static32.method671(true);
			Static54.method1101();
		} else if (Static191.anInt4244 == 79) {
			Static166.aClass100_3 = new Class100(17, true, Static9.aCanvas1);
			Static191.anInt4244 = 82;
			Static32.method671(true);
			Static54.method1101();
		} else if (Static191.anInt4244 == 82) {
			Static99.aClass100_2 = new Class100(19, true, Static9.aCanvas1);
			Static191.anInt4244 = 85;
			Static32.method671(true);
			Static54.method1101();
		} else if (Static191.anInt4244 == 85) {
			Static258.aClass100_7 = new Class100(22, true, Static9.aCanvas1);
			Static191.anInt4244 = 88;
			Static32.method671(true);
			Static54.method1101();
		} else if (Static191.anInt4244 == 88) {
			Static280.aClass100_8 = new Class100(26, true, Static9.aCanvas1);
			Static191.anInt4244 = 91;
			Static32.method671(true);
			Static54.method1101();
		} else {
			Static210.aClass100_5 = new Class100(30, true, Static9.aCanvas1);
			Static191.anInt4244 = 100;
			Static32.method671(true);
			Static54.method1101();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method2782() {
		Static15.aClass155_4.method4362();
		Static129.aClass155_24.method4362();
		Static194.aClass155_36.method4362();
		Static173.aClass155_33.method4362();
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	public static void method2784() {
		Static15.aClass155_4.method4354();
		Static129.aClass155_24.method4354();
		Static194.aClass155_36.method4354();
		Static173.aClass155_33.method4354();
	}
}
