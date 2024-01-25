import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
	public static int anInt3208;

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
	public static int anInt3214;

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_74 = new Class150(86, -2);

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_29 = new Class236(16, 6);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZB)V")
	public static void method2859(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static245.aClass5_Sub2_Sub5_3 != null) {
			Static422.anInt7461 = Static245.aClass5_Sub2_Sub5_3.anInt888;
		} else {
			Static422.anInt7461 = -1;
		}
		Static213.anInt4055 = 0;
		Static245.aClass5_Sub2_Sub5_3 = null;
		Static75.aClass220_4 = null;
		Static357.aClass99_56 = null;
		Static245.method5967();
		Static245.aClass99_60.method2524();
		Static37.aClass94_1 = null;
		Static159.aClass94_4 = null;
		Static107.anInt2341 = -1;
		Static313.aClass94_7 = null;
		Static63.aClass94_2 = null;
		Static320.aClass94_8 = null;
		Static392.aClass25_21 = null;
		Static245.aClass197_3 = null;
		Static229.aClass94_5 = null;
		Static201.anInt3833 = -1;
		Static503.aClass94_9 = null;
		Static77.aClass94_6 = null;
		if (Static245.aClass246_4 != null) {
			Static245.aClass246_4.method5846();
			Static245.aClass246_4.method5844(128, 64);
		}
		if (Static245.aClass274_3 != null) {
			Static245.aClass274_3.method6384(64, 64);
		}
		if (Static245.aClass88_2 != null) {
			Static245.aClass88_2.method2286(64);
		}
		Static304.aClass162_1.method4082(64);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(Z)V")
	public static void method2861() {
		Static206.method4278(Static300.aClass5_Sub28_Sub1_1.aBoolean338);
		Static336.aClass5_Sub15_Sub4_3 = new Class5_Sub15_Sub4();
		Static336.aClass5_Sub15_Sub4_3.method6514();
		Static164.aClass146_1 = Static542.method7399(22050, 0, Static159.aClass9_10, Static209.aCanvas6);
		Static164.aClass146_1.method5761(Static336.aClass5_Sub15_Sub4_3);
		Static47.method1046(Static476.aClass117_204, Static371.aClass117_157, Static393.aClass117_164, Static336.aClass5_Sub15_Sub4_3);
		Static301.aClass146_2 = Static542.method7399(2048, 1, Static159.aClass9_10, Static209.aCanvas6);
		Static373.aClass5_Sub15_Sub2_1 = new Class5_Sub15_Sub2();
		Static301.aClass146_2.method5761(Static373.aClass5_Sub15_Sub2_1);
		Static151.aClass157_1 = new Class157(22050, Static527.anInt8915);
		Static50.anInt1097 = Static108.aClass117_61.method2982("scape main");
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "()V")
	public static void method2862() {
		Static65.anInt1248 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static88.anInt2110; local3++) {
			@Pc(8) Class160 local8 = Static491.aClass160Array2[local3];
			@Pc(12) int local12;
			if (Static379.anIntArray548 != null) {
				for (local12 = 0; local12 < Static379.anIntArray548.length; local12++) {
					if (Static379.anIntArray548[local12] != -1000000 && (local8.anInt4411 <= Static379.anIntArray548[local12] || local8.anInt4412 <= Static379.anIntArray548[local12]) && (local8.anInt4404 <= Static137.anIntArray163[local12] || local8.anInt4409 <= Static137.anIntArray163[local12]) && (local8.anInt4404 >= Static173.anIntArray254[local12] || local8.anInt4409 >= Static173.anIntArray254[local12]) && (local8.anInt4408 <= Static133.anIntArray232[local12] || local8.anInt4405 <= Static133.anIntArray232[local12]) && (local8.anInt4408 >= Static337.anIntArray472[local12] || local8.anInt4405 >= Static337.anIntArray472[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt4402 == 1) {
				local12 = local8.anInt4416 + Static479.anInt8261 - Static489.anInt8410;
				if (local12 >= 0 && local12 <= Static479.anInt8261 + Static479.anInt8261) {
					local110 = local8.anInt4415 + Static479.anInt8261 - Static461.anInt7924;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static479.anInt8261 + Static479.anInt8261) {
						continue;
					}
					local128 = local8.anInt4410 + Static479.anInt8261 - Static461.anInt7924;
					if (local128 > Static479.anInt8261 + Static479.anInt8261) {
						local128 = Static479.anInt8261 + Static479.anInt8261;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static398.aBooleanArrayArray4[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static287.anInt5832 - local8.anInt4404;
						if (local164 > Static335.anInt6316) {
							local8.anInt4413 = 1;
						} else {
							if (local164 >= -Static335.anInt6316) {
								continue;
							}
							local8.anInt4413 = 2;
							local164 = -local164;
						}
						local8.anInt4418 = (local8.anInt4408 - Static500.anInt8550 << 8) / local164;
						local8.anInt4403 = (local8.anInt4405 - Static500.anInt8550 << 8) / local164;
						local8.anInt4421 = (local8.anInt4411 - Static90.anInt2124 << 8) / local164;
						local8.anInt4422 = (local8.anInt4412 - Static90.anInt2124 << 8) / local164;
						Static325.aClass160Array1[Static65.anInt1248++] = local8;
					}
				}
			} else if (local8.anInt4402 == 2) {
				local12 = local8.anInt4415 + Static479.anInt8261 - Static461.anInt7924;
				if (local12 >= 0 && local12 <= Static479.anInt8261 + Static479.anInt8261) {
					local110 = local8.anInt4416 + Static479.anInt8261 - Static489.anInt8410;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static479.anInt8261 + Static479.anInt8261) {
						continue;
					}
					local128 = local8.anInt4420 + Static479.anInt8261 - Static489.anInt8410;
					if (local128 > Static479.anInt8261 + Static479.anInt8261) {
						local128 = Static479.anInt8261 + Static479.anInt8261;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static398.aBooleanArrayArray4[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static500.anInt8550 - local8.anInt4408;
						if (local164 > Static335.anInt6316) {
							local8.anInt4413 = 3;
						} else {
							if (local164 >= -Static335.anInt6316) {
								continue;
							}
							local8.anInt4413 = 4;
							local164 = -local164;
						}
						local8.anInt4417 = (local8.anInt4404 - Static287.anInt5832 << 8) / local164;
						local8.anInt4414 = (local8.anInt4409 - Static287.anInt5832 << 8) / local164;
						local8.anInt4421 = (local8.anInt4411 - Static90.anInt2124 << 8) / local164;
						local8.anInt4422 = (local8.anInt4412 - Static90.anInt2124 << 8) / local164;
						Static325.aClass160Array1[Static65.anInt1248++] = local8;
					}
				}
			} else if (local8.anInt4402 == 4) {
				local12 = local8.anInt4411 - Static90.anInt2124;
				if (local12 > Static280.anInt5466) {
					local110 = local8.anInt4415 + Static479.anInt8261 - Static461.anInt7924;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static479.anInt8261 + Static479.anInt8261) {
						continue;
					}
					local128 = local8.anInt4410 + Static479.anInt8261 - Static461.anInt7924;
					if (local128 > Static479.anInt8261 + Static479.anInt8261) {
						local128 = Static479.anInt8261 + Static479.anInt8261;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt4416 + Static479.anInt8261 - Static489.anInt8410;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static479.anInt8261 + Static479.anInt8261) {
						continue;
					}
					local164 = local8.anInt4420 + Static479.anInt8261 - Static489.anInt8410;
					if (local164 > Static479.anInt8261 + Static479.anInt8261) {
						local164 = Static479.anInt8261 + Static479.anInt8261;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static398.aBooleanArrayArray4[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt4413 = 5;
						local8.anInt4417 = (local8.anInt4404 - Static287.anInt5832 << 8) / local12;
						local8.anInt4414 = (local8.anInt4409 - Static287.anInt5832 << 8) / local12;
						local8.anInt4418 = (local8.anInt4408 - Static500.anInt8550 << 8) / local12;
						local8.anInt4403 = (local8.anInt4405 - Static500.anInt8550 << 8) / local12;
						Static325.aClass160Array1[Static65.anInt1248++] = local8;
					}
				}
			}
		}
	}
}
