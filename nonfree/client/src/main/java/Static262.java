import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "Lclient!fh;")
	public static Class58 aClass58_93;

	@OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
	public static int anInt5002;

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
	public static int anInt4997 = 0;

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "[I")
	public static int[] anIntArray543 = new int[500];

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "[S")
	public static short[] aShortArray100 = new short[500];

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)I")
	public static int method4125(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(18) Class4_Sub18 local18 = (Class4_Sub18) Static189.aClass85_17.method1845((long) arg0);
		if (local18 == null) {
			return Static18.method264(arg0).anInt1963;
		}
		@Pc(32) int local32 = 0;
		for (@Pc(34) int local34 = 0; local34 < local18.anIntArray385.length; local34++) {
			if (local18.anIntArray385[local34] == -1) {
				local32++;
			}
		}
		return local32 + Static18.method264(arg0).anInt1963 - local18.anIntArray385.length;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)V")
	public static void method4126(@OriginalArg(0) boolean arg0) {
		Static212.aBoolean294 = arg0;
		@Pc(144) boolean local144;
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(39) int local39;
		@Pc(46) int local46;
		@Pc(189) int local189;
		@Pc(194) int local194;
		@Pc(207) int local207;
		if (!Static212.aBoolean294) {
			local144 = Static195.method3117(Static189.aClass4_Sub10_Sub1_2.method4642());
			local19 = Static189.aClass4_Sub10_Sub1_2.method4653();
			local23 = (Static21.anInt1052 - Static189.aClass4_Sub10_Sub1_2.anInt5713) / 16;
			Static200.anIntArrayArray35 = new int[local23][4];
			for (local27 = 0; local27 < local23; local27++) {
				for (local32 = 0; local32 < 4; local32++) {
					Static200.anIntArrayArray35[local27][local32] = Static189.aClass4_Sub10_Sub1_2.method4657();
				}
			}
			local27 = Static189.aClass4_Sub10_Sub1_2.method4626();
			local32 = Static189.aClass4_Sub10_Sub1_2.method4667();
			local39 = Static189.aClass4_Sub10_Sub1_2.method4653();
			@Pc(435) boolean local435 = false;
			local46 = Static189.aClass4_Sub10_Sub1_2.method4653();
			if ((local46 / 8 == 48 || local46 / 8 == 49) && local19 / 8 == 48) {
				local435 = true;
			}
			Static171.anIntArray316 = new int[local23];
			if (local46 / 8 == 48 && local19 / 8 == 148) {
				local435 = true;
			}
			Static91.anIntArray167 = new int[local23];
			Static24.aByteArrayArray4 = new byte[local23][];
			Static118.anIntArray197 = new int[local23];
			Static44.anIntArray59 = new int[local23];
			Static292.aByteArrayArray50 = null;
			Static278.aByteArrayArray49 = new byte[local23][];
			Static212.aByteArrayArray31 = new byte[local23][];
			Static272.anIntArray570 = null;
			Static11.aByteArrayArray3 = new byte[local23][];
			Static278.anIntArray597 = new int[local23];
			local23 = 0;
			for (local189 = (local46 - 6) / 8; local189 <= (local46 + 6) / 8; local189++) {
				for (local194 = (local19 - 6) / 8; local194 <= (local19 + 6) / 8; local194++) {
					local207 = (local189 << 8) + local194;
					if (local435 && (local194 == 49 || local194 == 149 || local194 == 147 || local189 == 50 || local189 == 49 && local194 == 47)) {
						Static278.anIntArray597[local23] = local207;
						Static91.anIntArray167[local23] = -1;
						Static44.anIntArray59[local23] = -1;
						Static171.anIntArray316[local23] = -1;
						Static118.anIntArray197[local23] = -1;
					} else {
						Static278.anIntArray597[local23] = local207;
						Static91.anIntArray167[local23] = Static102.aClass58_47.method1362("m" + local189 + "_" + local194);
						Static44.anIntArray59[local23] = Static102.aClass58_47.method1362("l" + local189 + "_" + local194);
						Static171.anIntArray316[local23] = Static102.aClass58_47.method1362("um" + local189 + "_" + local194);
						Static118.anIntArray197[local23] = Static102.aClass58_47.method1362("ul" + local189 + "_" + local194);
					}
					local23++;
				}
			}
			Static2.method2(false, local46, local144, local39, local32, local19, local27);
			return;
		}
		local19 = Static189.aClass4_Sub10_Sub1_2.method4625();
		local23 = Static189.aClass4_Sub10_Sub1_2.method4667();
		local27 = Static189.aClass4_Sub10_Sub1_2.method4672();
		Static189.aClass4_Sub10_Sub1_2.method4679();
		@Pc(56) int local56;
		for (local32 = 0; local32 < 4; local32++) {
			for (local39 = 0; local39 < 13; local39++) {
				for (local46 = 0; local46 < 13; local46++) {
					local56 = Static189.aClass4_Sub10_Sub1_2.method4689(1);
					if (local56 == 1) {
						Static278.anIntArrayArrayArray15[local32][local39][local46] = Static189.aClass4_Sub10_Sub1_2.method4689(26);
					} else {
						Static278.anIntArrayArrayArray15[local32][local39][local46] = -1;
					}
				}
			}
		}
		Static189.aClass4_Sub10_Sub1_2.method4681();
		local32 = (Static21.anInt1052 - Static189.aClass4_Sub10_Sub1_2.anInt5713) / 16;
		Static200.anIntArrayArray35 = new int[local32][4];
		for (local39 = 0; local39 < local32; local39++) {
			for (local46 = 0; local46 < 4; local46++) {
				Static200.anIntArrayArray35[local39][local46] = Static189.aClass4_Sub10_Sub1_2.method4624();
			}
		}
		local39 = Static189.aClass4_Sub10_Sub1_2.method4653();
		local144 = Static195.method3117(Static189.aClass4_Sub10_Sub1_2.method4642());
		local46 = Static189.aClass4_Sub10_Sub1_2.method4660();
		Static118.anIntArray197 = new int[local32];
		Static292.aByteArrayArray50 = null;
		Static278.aByteArrayArray49 = new byte[local32][];
		Static278.anIntArray597 = new int[local32];
		Static272.anIntArray570 = null;
		Static171.anIntArray316 = new int[local32];
		Static91.anIntArray167 = new int[local32];
		Static11.aByteArrayArray3 = new byte[local32][];
		Static212.aByteArrayArray31 = new byte[local32][];
		Static44.anIntArray59 = new int[local32];
		Static24.aByteArrayArray4 = new byte[local32][];
		local32 = 0;
		for (local56 = 0; local56 < 4; local56++) {
			for (local189 = 0; local189 < 13; local189++) {
				for (local194 = 0; local194 < 13; local194++) {
					local207 = Static278.anIntArrayArrayArray15[local56][local189][local194];
					if (local207 != -1) {
						@Pc(217) int local217 = local207 >> 14 & 0x3FF;
						@Pc(223) int local223 = local207 >> 3 & 0x7FF;
						@Pc(233) int local233 = (local217 / 8 << 8) + local223 / 8;
						@Pc(235) int local235;
						for (local235 = 0; local235 < local32; local235++) {
							if (Static278.anIntArray597[local235] == local233) {
								local233 = -1;
								break;
							}
						}
						if (local233 != -1) {
							Static278.anIntArray597[local32] = local233;
							local235 = local233 >> 8 & 0xFF;
							@Pc(276) int local276 = local233 & 0xFF;
							Static91.anIntArray167[local32] = Static102.aClass58_47.method1362("m" + local235 + "_" + local276);
							Static44.anIntArray59[local32] = Static102.aClass58_47.method1362("l" + local235 + "_" + local276);
							Static171.anIntArray316[local32] = Static102.aClass58_47.method1362("um" + local235 + "_" + local276);
							Static118.anIntArray197[local32] = Static102.aClass58_47.method1362("ul" + local235 + "_" + local276);
							local32++;
						}
					}
				}
			}
		}
		Static2.method2(false, local27, local144, local19, local39, local23, local46);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
	public static int method4127(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(ZI)V")
	public static void method4129(@OriginalArg(1) int arg0) {
		@Pc(14) Class4_Sub3_Sub9 local14 = Static43.method2329(6, arg0);
		local14.method1519();
	}
}
