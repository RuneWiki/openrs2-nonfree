import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cfa", name = "q", descriptor = "I")
	public static int anInt953;

	@OriginalMember(owner = "client!cfa", name = "i", descriptor = "[[B")
	public static final byte[][] aByteArrayArray2 = new byte[250][];

	@OriginalMember(owner = "client!cfa", name = "l", descriptor = "Lclient!uea;")
	public static Class314 aClass314_1 = null;

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "(I)V")
	public static void method747() {
		Static28.aClass251_7.anInt6998 = 1;
		Static153.method2254();
		Static359.aBoolean432 = true;
		Static241.aBoolean259 = true;
		Static162.method2373();
		for (@Pc(7261) int local7261 = 0; local7261 < Static34.aClass129Array4.length; local7261++) {
			Static34.aClass129Array4[local7261] = null;
		}
		Static492.aBoolean560 = false;
		Static56.method745();
		Static574.anInt6272 = (int) (Math.random() * 120.0D) - 60;
		Static399.aFloat167 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static343.anInt6094 = (int) (Math.random() * 100.0D) - 50;
		Static291.anInt4749 = (int) (Math.random() * 30.0D) - 20;
		Static316.anInt5715 = (int) (Math.random() * 110.0D) - 55;
		Static74.anInt1216 = (int) (Math.random() * 80.0D) - 40;
		Static502.method6917();
		for (@Pc(7331) int local7331 = 0; local7331 < 2048; local7331++) {
			Static346.aClass29_Sub2_Sub1_Sub2Array1[local7331] = null;
		}
		Static505.anInt8419 = 0;
		Static516.anInt8936 = 0;
		Static31.aClass212_1.method5110();
		Static475.aClass275_170.method6357();
		Static463.aClass275_203.method6357();
		Static206.aClass249_3.method5818();
		Static303.aClass212_22.method5110();
		Static419.aClass275_193 = new Class275();
		Static505.aClass30_1.method499();
		Static181.method2730();
		Static190.anInt4029 = 0;
		Static309.anInt5560 = 0;
		Static430.anInt5650 = 0;
		Static205.anInt3498 = 0;
		Static168.anInt3051 = 0;
		Static152.anInt2703 = 0;
		Static159.anInt2791 = 0;
		Static277.anInt4615 = 0;
		Static65.anInt1116 = 0;
		Static71.anInt1189 = 0;
		for (@Pc(7393) int local7393 = 0; local7393 < Static402.anIntArray568.length; local7393++) {
			if (!Static248.aBooleanArray25[local7393]) {
				Static402.anIntArray568[local7393] = -1;
			}
		}
		if (Static487.anInt8139 != -1) {
			Static26.method400(Static487.anInt8139);
		}
		for (@Pc(7423) Class6_Sub31 local7423 = (Class6_Sub31) Static564.aClass212_39.method5099(); local7423 != null; local7423 = (Class6_Sub31) Static564.aClass212_39.method5103()) {
			if (!local7423.method7848()) {
				local7423 = (Class6_Sub31) Static564.aClass212_39.method5099();
				if (local7423 == null) {
					break;
				}
			}
			Static160.method2336(true, false, local7423);
		}
		Static487.anInt8139 = -1;
		Static564.aClass212_39 = new Class212(8);
		Static505.method6943();
		Static473.aClass97_13 = null;
		for (@Pc(7463) int local7463 = 0; local7463 < 8; local7463++) {
			Static293.aStringArray20[local7463] = null;
			Static24.aBooleanArray28[local7463] = false;
			Static556.anIntArray698[local7463] = -1;
		}
		Static397.method267();
		Static31.aBoolean19 = true;
		for (@Pc(7489) int local7489 = 0; local7489 < 100; local7489++) {
			Static258.aBooleanArray27[local7489] = true;
		}
		for (@Pc(7503) int local7503 = 0; local7503 < 6; local7503++) {
			Static434.aClass49Array1[local7503] = new Class49();
		}
		for (@Pc(7519) int local7519 = 0; local7519 < 25; local7519++) {
			Static138.anIntArray303[local7519] = 0;
			Static109.anIntArray696[local7519] = 0;
			Static498.anIntArray641[local7519] = 0;
		}
		Static528.method7588();
		Static221.aShortArray75 = Static553.aShortArray145 = Static15.aShortArray136 = Static172.aShortArray59 = new short[256];
		Static244.aBoolean263 = true;
		Static287.aString122 = Static141.aClass104_71.method2145(Static470.anInt7957);
		Static138.anInt2445 = 0;
		Static480.aClass6_Sub37_Sub1_1.aBoolean416 = false;
		Static480.aClass6_Sub37_Sub1_1.aBoolean417 = false;
		Static322.method4982();
		Static507.method6978();
		Static154.aClass6_Sub15_2 = null;
		Static28.aClass251_7.anInt6998 = 2;
		Static404.aLong185 = 0L;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!fca;ILclient!oa;)V")
	public static void method748(@OriginalArg(0) Class97 arg0, @OriginalArg(2) Class121 arg1) {
		@Pc(33) boolean local33 = Static295.aClass256_2.method5921(arg0.anInt2277, arg0.anInt2329, arg1, arg0.anInt2308, arg0.anInt2333, arg0.anInt2300 | 0xFF000000, arg0.aBoolean148 ? Static426.aClass29_Sub2_Sub1_Sub2_2.aClass246_1 : null) == null;
		if (local33) {
			Static161.aClass275_56.method6370(new Class6_Sub42(arg0.anInt2277, arg0.anInt2329, arg0.anInt2308, arg0.anInt2300 | 0xFF000000, arg0.anInt2333, arg0.aBoolean148));
			Static390.method5794(arg0);
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z)Z")
	public static boolean method749(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static518.anInt3345; local1 < Static41.anInt687; local1++) {
			@Pc(6) Class9[][] local6 = Static208.aClass9ArrayArrayArray3[local1];
			for (@Pc(9) int local9 = -Static387.anInt6907; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static325.anInt5850 + local9;
				@Pc(18) int local18 = Static325.anInt5850 - local9;
				if (local14 >= Static264.anInt4353 || local18 < Static312.anInt8640) {
					for (@Pc(27) int local27 = -Static387.anInt6907; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static486.anInt8128 + local27;
						@Pc(36) int local36 = Static486.anInt8128 - local27;
						@Pc(48) Class9 local48;
						if (local14 >= Static264.anInt4353) {
							if (local32 >= Static69.anInt1154) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean9) {
									Static358.aBoolean429 = arg0;
									Static325.aClass158_1.method5353(local48);
									Static325.aClass158_1.method5352();
								}
							}
							if (local36 < Static317.anInt5746) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean9) {
									Static358.aBoolean429 = arg0;
									Static325.aClass158_1.method5353(local48);
									Static325.aClass158_1.method5352();
								}
							}
						}
						if (local18 < Static312.anInt8640) {
							if (local32 >= Static69.anInt1154) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean9) {
									Static358.aBoolean429 = arg0;
									Static325.aClass158_1.method5353(local48);
									Static325.aClass158_1.method5352();
								}
							}
							if (local36 < Static317.anInt5746) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean9) {
									Static358.aBoolean429 = arg0;
									Static325.aClass158_1.method5353(local48);
									Static325.aClass158_1.method5352();
								}
							}
						}
						if (Static15.anInt8428 == 0) {
							if (Static164.aBoolean192) {
								Static325.aClass158_1.method5351(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(II)I")
	public static int method750(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z[B)Z")
	public static boolean method751(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class6_Sub14 local13 = new Class6_Sub14(arg0);
		@Pc(17) int local17 = local13.method6041();
		if (local17 != 2) {
			return false;
		}
		@Pc(31) boolean local31 = local13.method6041() == 1;
		if (local31) {
			method755(local13);
		}
		Static328.method5057(local13);
		return true;
	}

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "(I)Lclient!kba;")
	public static Class119 method753() {
		try {
			return new Class119_Sub3();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class119) Class.forName("Class119_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class119_Sub2();
			}
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!dga;I)V")
	private static void method755(@OriginalArg(0) Class6_Sub14 arg0) {
		@Pc(9) int local9 = arg0.method5998();
		Static130.aClass323Array1 = new Class323[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static130.aClass323Array1[local14] = new Class323();
			Static130.aClass323Array1[local14].anInt8996 = arg0.method5998();
			Static130.aClass323Array1[local14].aString113 = arg0.method6023();
		}
		Static123.anInt2133 = arg0.method5998();
		Static329.anInt5898 = arg0.method5998();
		Static274.anInt3317 = arg0.method5998();
		Static303.aClass8_Sub1Array1 = new Class8_Sub1[Static329.anInt5898 + 1 - Static123.anInt2133];
		for (@Pc(66) int local66 = 0; local66 < Static274.anInt3317; local66++) {
			@Pc(74) int local74 = arg0.method5998();
			@Pc(82) Class8_Sub1 local82 = Static303.aClass8_Sub1Array1[local74] = new Class8_Sub1();
			local82.anInt2012 = arg0.method6041();
			local82.anInt2009 = arg0.method6027();
			local82.anInt2019 = local74 + Static123.anInt2133;
			local82.aString32 = arg0.method6023();
			local82.aString33 = arg0.method6023();
		}
		Static457.anInt4062 = arg0.method6027();
		Static498.aBoolean571 = true;
	}
}
