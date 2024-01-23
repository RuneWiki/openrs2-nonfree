import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "Z")
	public static boolean aBoolean258 = false;

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "J")
	public static long aLong131 = 0L;

	@OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
	public static int anInt3585 = 0;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIZ)V")
	public static void method3010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class4_Sub3_Sub9 local4 = Static43.method2329(7, arg0);
		local4.method1520();
		local4.anInt1993 = arg1;
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
	public static void method3013() {
		Static249.method3954(false);
		Static103.anInt2886 = 0;
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14;
		for (local14 = 0; local14 < Static24.aByteArrayArray4.length; local14++) {
			if (Static91.anIntArray167[local14] != -1 && Static24.aByteArrayArray4[local14] == null) {
				Static24.aByteArrayArray4[local14] = Static102.aClass58_47.method1372(Static91.anIntArray167[local14], 0);
				if (Static24.aByteArrayArray4[local14] == null) {
					local12 = false;
					Static103.anInt2886++;
				}
			}
			if (Static44.anIntArray59[local14] != -1 && Static212.aByteArrayArray31[local14] == null) {
				Static212.aByteArrayArray31[local14] = Static102.aClass58_47.method1361(0, Static44.anIntArray59[local14], Static200.anIntArrayArray35[local14]);
				if (Static212.aByteArrayArray31[local14] == null) {
					local12 = false;
					Static103.anInt2886++;
				}
			}
			if (Static94.aBoolean138) {
				if (Static171.anIntArray316[local14] != -1 && Static278.aByteArrayArray49[local14] == null) {
					Static278.aByteArrayArray49[local14] = Static102.aClass58_47.method1372(Static171.anIntArray316[local14], 0);
					if (Static278.aByteArrayArray49[local14] == null) {
						local12 = false;
						Static103.anInt2886++;
					}
				}
				if (Static118.anIntArray197[local14] != -1 && Static11.aByteArrayArray3[local14] == null) {
					Static11.aByteArrayArray3[local14] = Static102.aClass58_47.method1372(Static118.anIntArray197[local14], 0);
					if (Static11.aByteArrayArray3[local14] == null) {
						Static103.anInt2886++;
						local12 = false;
					}
				}
			}
			if (Static272.anIntArray570 != null && Static292.aByteArrayArray50[local14] == null && Static272.anIntArray570[local14] != -1) {
				Static292.aByteArrayArray50[local14] = Static102.aClass58_47.method1361(0, Static272.anIntArray570[local14], Static200.anIntArrayArray35[local14]);
				if (Static292.aByteArrayArray50[local14] == null) {
					local12 = false;
					Static103.anInt2886++;
				}
			}
		}
		if (Static294.aClass141_14 == null) {
			if (Static56.aClass4_Sub3_Sub22_1 == null || !Static219.aClass58_82.method1344(Static56.aClass4_Sub3_Sub22_1.aString365 + "_labels")) {
				Static294.aClass141_14 = new Class141(0);
			} else if (Static219.aClass58_82.method1365(Static56.aClass4_Sub3_Sub22_1.aString365 + "_labels")) {
				Static294.aClass141_14 = Static89.method1555(Static219.aClass58_82, Static56.aClass4_Sub3_Sub22_1.aString365 + "_labels", Static293.aBoolean371);
			} else {
				Static103.anInt2886++;
				local12 = false;
			}
		}
		if (!local12) {
			Static244.anInt4660 = 1;
			return;
		}
		Static295.anInt5487 = 0;
		local12 = true;
		@Pc(294) int local294;
		@Pc(305) int local305;
		for (local14 = 0; local14 < Static24.aByteArrayArray4.length; local14++) {
			@Pc(282) byte[] local282 = Static212.aByteArrayArray31[local14];
			if (local282 != null) {
				local294 = (Static278.anIntArray597[local14] >> 8) * 64 - Static220.anInt3983;
				local305 = (Static278.anIntArray597[local14] & 0xFF) * 64 - Static295.anInt5480;
				if (Static212.aBoolean294) {
					local305 = 10;
					local294 = 10;
				}
				local12 &= Static206.method3333(local305, local294, local282);
			}
			if (Static94.aBoolean138) {
				local282 = Static11.aByteArrayArray3[local14];
				if (local282 != null) {
					local294 = (Static278.anIntArray597[local14] >> 8) * 64 - Static220.anInt3983;
					local305 = (Static278.anIntArray597[local14] & 0xFF) * 64 - Static295.anInt5480;
					if (Static212.aBoolean294) {
						local294 = 10;
						local305 = 10;
					}
					local12 &= Static206.method3333(local305, local294, local282);
				}
			}
		}
		if (!local12) {
			Static244.anInt4660 = 2;
			return;
		}
		@Pc(374) boolean local374 = false;
		if (Static244.anInt4660 != 0) {
			Static306.method4753(Static156.aString187 + "<br>(100%)", true);
		}
		Static16.method763();
		Static170.method2710();
		@Pc(398) int local398;
		if (Static94.aBoolean138 && Static303.aBoolean394) {
			for (local398 = 0; local398 < Static24.aByteArrayArray4.length; local398++) {
				if (Static11.aByteArrayArray3[local398] != null || Static278.aByteArrayArray49[local398] != null) {
					local374 = true;
					break;
				}
			}
		}
		Static3.method10(Static94.aBoolean138 ? 28 : 25, local374);
		for (local398 = 0; local398 < 4; local398++) {
			Static296.aClass30Array1[local398].method579();
		}
		for (local398 = 0; local398 < 4; local398++) {
			for (local294 = 0; local294 < 104; local294++) {
				for (local305 = 0; local305 < 104; local305++) {
					Static174.aByteArrayArrayArray17[local398][local294][local305] = 0;
				}
			}
		}
		Static241.method3770(false);
		if (Static94.aBoolean138) {
			Static74.aClass56_Sub1_2.method1309();
			for (local398 = 0; local398 < 13; local398++) {
				for (local294 = 0; local294 < 13; local294++) {
					Static74.aClass104ArrayArray1[local398][local294].aBoolean197 = true;
				}
			}
		}
		if (Static94.aBoolean138) {
			Static196.method3123();
		}
		if (Static94.aBoolean138) {
			Static305.method4714();
		}
		Static16.method763();
		System.gc();
		Static249.method3954(true);
		Static246.method3840(false);
		if (!Static212.aBoolean294) {
			Static133.method2010(false);
			Static249.method3954(true);
			if (Static94.aBoolean138) {
				local398 = Static154.aClass53_Sub1_Sub1_2.anIntArray422[0] >> 3;
				local294 = Static154.aClass53_Sub1_Sub1_2.anIntArray426[0] >> 3;
				Static93.method2017(local398, local294);
			}
			Static306.method4747(false);
			if (Static292.aByteArrayArray50 != null) {
				Static67.method1062();
			}
		}
		if (Static212.aBoolean294) {
			Static186.method4396(false);
			Static249.method3954(true);
			if (Static94.aBoolean138) {
				local294 = Static154.aClass53_Sub1_Sub1_2.anIntArray426[0] >> 3;
				local398 = Static154.aClass53_Sub1_Sub1_2.anIntArray422[0] >> 3;
				Static93.method2017(local398, local294);
			}
			Static172.method2721(false);
		}
		Static170.method2710();
		Static249.method3954(true);
		Static244.method3815(Static296.aClass30Array1, Static212.aBoolean294 ? Static278.anIntArrayArrayArray15 : (int[][][]) null, false);
		if (Static94.aBoolean138) {
			Static196.method3135();
		}
		Static249.method3954(true);
		local398 = Static202.anInt3896;
		if (local398 > Static281.anInt5335) {
			local398 = Static281.anInt5335;
		}
		if (local398 >= Static281.anInt5335 - 1) {
		}
		if (Static29.method456()) {
			Static5.method90(0);
		} else {
			Static5.method90(Static202.anInt3896);
		}
		Static313.method4828();
		if (Static94.aBoolean138 && local374) {
			Static288.method4405(true);
			Static246.method3840(true);
			if (!Static212.aBoolean294) {
				Static133.method2010(true);
				Static249.method3954(true);
				Static306.method4747(true);
			}
			if (Static212.aBoolean294) {
				Static186.method4396(true);
				Static249.method3954(true);
				Static172.method2721(true);
			}
			Static170.method2710();
			Static249.method3954(true);
			Static244.method3815(Static296.aClass30Array1, Static212.aBoolean294 ? Static278.anIntArrayArrayArray15 : (int[][][]) null, true);
			Static249.method3954(true);
			Static313.method4828();
			Static288.method4405(false);
		}
		if (Static94.aBoolean138) {
			for (local294 = 0; local294 < 13; local294++) {
				for (local305 = 0; local305 < 13; local305++) {
					Static74.aClass104ArrayArray1[local294][local305].method2239(Static243.anIntArrayArrayArray13[0], local294 * 8, local305 * 8);
				}
			}
		}
		for (local294 = 0; local294 < 104; local294++) {
			for (local305 = 0; local305 < 104; local305++) {
				Static5.method89(local294, local305);
			}
		}
		Static93.method2015();
		Static16.method763();
		Static306.method4751();
		Static170.method2710();
		Static143.aBoolean189 = false;
		if (Static94.aBoolean138) {
			Static155.method1937(true);
		}
		if (Static172.aFrame2 != null && Static134.aClass52_7 != null && Static169.anInt3304 == 25) {
			Static110.aClass4_Sub10_Sub1_1.method4687(236);
			Static110.aClass4_Sub10_Sub1_1.method4654(1057001181);
		}
		if (!Static212.aBoolean294) {
			local294 = (Static177.anInt3360 - 6) / 8;
			local305 = (Static177.anInt3360 + 6) / 8;
			@Pc(834) int local834 = (Static3.anInt5 - 6) / 8;
			@Pc(840) int local840 = (Static3.anInt5 + 6) / 8;
			for (@Pc(844) int local844 = local294 - 1; local844 <= local305 + 1; local844++) {
				for (@Pc(853) int local853 = local834 - 1; local853 <= local840 + 1; local853++) {
					if (local844 < local294 || local844 > local305 || local853 < local834 || local840 < local853) {
						Static102.aClass58_47.method1357("m" + local844 + "_" + local853);
						Static102.aClass58_47.method1357("l" + local844 + "_" + local853);
					}
				}
			}
		}
		if (Static169.anInt3304 == 28) {
			Static15.method233(10);
		} else {
			Static15.method233(30);
			if (Static134.aClass52_7 != null) {
				Static110.aClass4_Sub10_Sub1_1.method4687(113);
			}
		}
		Static279.method4343();
		Static16.method763();
		Static107.method4408();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILclient!fh;I)Lclient!fe;")
	public static Class56_Sub1 method3016(@OriginalArg(2) Class58 arg0, @OriginalArg(3) int arg1) {
		return Static12.method197(arg0, arg1, 0) ? Static197.method3200() : null;
	}

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V")
	public static void method3020() {
		if (Static307.aBoolean402) {
			return;
		}
		Static182.aBoolean248 = true;
		if (Static212.aBoolean293) {
			Static202.aFloat97 = (int) Static202.aFloat97 - 65 & 0xFFFFFF80;
		} else {
			Static168.aFloat79 += (-Static168.aFloat79 - 24.0F) / 2.0F;
		}
		Static307.aBoolean402 = true;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILclient!wf;II)V")
	public static void method3023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class189 arg2, @OriginalArg(3) int arg3) {
		Static16.method763();
		if (Static94.aBoolean138) {
			Static104.method1694(arg0, arg3, arg2.anInt5897 + arg0, arg2.anInt5953 + arg3);
		} else {
			Static270.method4246(arg0, arg3, arg0 + arg2.anInt5897, arg3 - -arg2.anInt5953);
		}
		if (Static194.anInt5207 != 2 && Static194.anInt5207 != 5 && Static212.aClass4_Sub3_Sub14_4 != null) {
			@Pc(92) int local92 = (int) Static202.aFloat97 + anInt3585 & 0x7FF;
			@Pc(101) int local101 = 464 - Static154.aClass53_Sub1_Sub1_2.anInt4002 / 32;
			@Pc(109) int local109 = Static154.aClass53_Sub1_Sub1_2.anInt3974 / 32 + 48;
			if (Static94.aBoolean138) {
				((Class4_Sub3_Sub14_Sub2) Static212.aClass4_Sub3_Sub14_4).method4556(arg0, arg3, arg2.anInt5897, arg2.anInt5953, local109, local101, local92, Static250.anInt4762 + 256, (Class4_Sub3_Sub14_Sub2) arg2.method4766(false));
			} else {
				((Class4_Sub3_Sub14_Sub1) Static212.aClass4_Sub3_Sub14_4).method2168(arg0, arg3, arg2.anInt5897, arg2.anInt5953, local109, local101, local92, Static250.anInt4762 + 256, arg2.anIntArray672, arg2.anIntArray657);
			}
			@Pc(188) int local188;
			@Pc(197) int local197;
			@Pc(227) int local227;
			@Pc(239) int local239;
			if (Static294.aClass141_14 != null) {
				for (@Pc(158) int local158 = 0; local158 < Static294.aClass141_14.anInt4220; local158++) {
					if (Static294.aClass141_14.aClass4_Sub3_Sub7Array1[local158] != null && Static294.aClass141_14.anIntArray448[local158] >> 28 == Static281.anInt5335) {
						local188 = (Static294.aClass141_14.anIntArray448[local158] >> 14 & 0x3FFF) - Static220.anInt3983;
						local197 = (Static294.aClass141_14.anIntArray448[local158] & 0x3FFF) - Static295.anInt5480;
						if (local188 >= 0 && local188 < 104 && local197 >= 0 && local197 < 104) {
							local227 = local188 * 4 + 2 - Static154.aClass53_Sub1_Sub1_2.anInt3974 / 32;
							local239 = local197 * 4 + 2 - Static154.aClass53_Sub1_Sub1_2.anInt4002 / 32;
							Static287.method4397(arg3, arg2, arg0, Static294.aClass141_14.aClass4_Sub3_Sub7Array1[local158].anInt1760, local227, local239);
						}
					}
				}
			}
			for (local188 = 0; local188 < Static234.anInt4435; local188++) {
				local197 = Static113.anIntArray189[local188] * 4 + 2 - Static154.aClass53_Sub1_Sub1_2.anInt3974 / 32;
				local227 = Static52.anIntArray187[local188] * 4 + 2 - Static154.aClass53_Sub1_Sub1_2.anInt4002 / 32;
				@Pc(298) Class184 local298 = Static6.method99(Static7.anIntArray15[local188]);
				if (local298.anIntArray631 != null) {
					local298 = local298.method4490();
					if (local298 == null || local298.anInt5527 == -1) {
						continue;
					}
				}
				Static287.method4397(arg3, arg2, arg0, local298.anInt5527, local197, local227);
			}
			@Pc(374) int local374;
			for (local188 = 0; local188 < 104; local188++) {
				for (local197 = 0; local197 < 104; local197++) {
					@Pc(347) Class114 local347 = Static139.aClass114ArrayArrayArray1[Static281.anInt5335][local188][local197];
					if (local347 != null) {
						local239 = local188 * 4 + 2 - Static154.aClass53_Sub1_Sub1_2.anInt3974 / 32;
						local374 = local197 * 4 + 2 - Static154.aClass53_Sub1_Sub1_2.anInt4002 / 32;
						Static34.method525(arg0, arg2, arg3, local239, local374, Static56.aClass4_Sub3_Sub14Array6[0]);
					}
				}
			}
			for (local188 = 0; local188 < Static236.anInt4452; local188++) {
				@Pc(407) Class53_Sub1_Sub2 local407 = Static110.aClass53_Sub1_Sub2Array1[Static278.anIntArray595[local188]];
				if (local407 != null && local407.method3323()) {
					@Pc(418) Class171 local418 = local407.aClass171_1;
					if (local418 != null && local418.anIntArray590 != null) {
						local418 = local418.method4302();
					}
					if (local418 != null && local418.aBoolean357 && local418.aBoolean358) {
						local239 = local407.anInt3974 / 32 - Static154.aClass53_Sub1_Sub1_2.anInt3974 / 32;
						local374 = local407.anInt4002 / 32 - Static154.aClass53_Sub1_Sub1_2.anInt4002 / 32;
						if (local418.anInt5268 == -1) {
							Static34.method525(arg0, arg2, arg3, local239, local374, Static56.aClass4_Sub3_Sub14Array6[1]);
						} else {
							Static287.method4397(arg3, arg2, arg0, local418.anInt5268, local239, local374);
						}
					}
				}
			}
			for (local188 = 0; local188 < Static129.anInt2510; local188++) {
				@Pc(502) Class53_Sub1_Sub1 local502 = Static182.aClass53_Sub1_Sub1Array1[Static172.anIntArray317[local188]];
				if (local502 != null && local502.method3323()) {
					local227 = local502.anInt3974 / 32 - Static154.aClass53_Sub1_Sub1_2.anInt3974 / 32;
					@Pc(522) boolean local522 = false;
					local239 = local502.anInt4002 / 32 - Static154.aClass53_Sub1_Sub1_2.anInt4002 / 32;
					@Pc(540) long local540 = Static108.method1747(local502.aString88);
					for (@Pc(542) int local542 = 0; local542 < Static272.anInt5215; local542++) {
						if (local540 == Static285.aLongArray54[local542] && Static157.anIntArray293[local542] != 0) {
							local522 = true;
							break;
						}
					}
					@Pc(567) boolean local567 = false;
					for (@Pc(569) int local569 = 0; local569 < Static164.anInt3260; local569++) {
						if (Static255.aClass4_Sub15Array1[local569].aLong217 == local540) {
							local567 = true;
							break;
						}
					}
					@Pc(588) boolean local588 = false;
					if (Static154.aClass53_Sub1_Sub1_2.anInt1593 != 0 && local502.anInt1593 != 0 && Static154.aClass53_Sub1_Sub1_2.anInt1593 == local502.anInt1593) {
						local588 = true;
					}
					if (local522) {
						Static34.method525(arg0, arg2, arg3, local227, local239, Static56.aClass4_Sub3_Sub14Array6[3]);
					} else if (local567) {
						Static34.method525(arg0, arg2, arg3, local227, local239, Static56.aClass4_Sub3_Sub14Array6[5]);
					} else if (local588) {
						Static34.method525(arg0, arg2, arg3, local227, local239, Static56.aClass4_Sub3_Sub14Array6[4]);
					} else {
						Static34.method525(arg0, arg2, arg3, local227, local239, Static56.aClass4_Sub3_Sub14Array6[2]);
					}
				}
			}
			local197 = 0;
			@Pc(672) Class95[] local672 = Static305.aClass95Array1;
			while (local672.length > local197) {
				@Pc(684) Class95 local684 = local672[local197];
				if (local684 != null && local684.anInt2561 != 0 && Static50.anInt954 % 20 < 10) {
					@Pc(731) int local731;
					if (local684.anInt2561 == 1 && local684.anInt2560 >= 0 && local684.anInt2560 < Static110.aClass53_Sub1_Sub2Array1.length) {
						@Pc(717) Class53_Sub1_Sub2 local717 = Static110.aClass53_Sub1_Sub2Array1[local684.anInt2560];
						if (local717 != null) {
							local731 = local717.anInt4002 / 32 - Static154.aClass53_Sub1_Sub1_2.anInt4002 / 32;
							local374 = local717.anInt3974 / 32 - Static154.aClass53_Sub1_Sub1_2.anInt3974 / 32;
							Static230.method3656(arg2, 360000, arg0, local731, arg3, local374, local684.anInt2559);
						}
					}
					if (local684.anInt2561 == 2) {
						local374 = (local684.anInt2565 - Static295.anInt5480) * 4 + 2 - Static154.aClass53_Sub1_Sub1_2.anInt4002 / 32;
						local731 = local684.anInt2562 * 4;
						local239 = (local684.anInt2558 - Static220.anInt3983) * 4 + 2 - Static154.aClass53_Sub1_Sub1_2.anInt3974 / 32;
						local731 *= local731;
						Static230.method3656(arg2, local731, arg0, local374, arg3, local239, local684.anInt2559);
					}
					if (local684.anInt2561 == 10 && local684.anInt2560 >= 0 && local684.anInt2560 < Static182.aClass53_Sub1_Sub1Array1.length) {
						@Pc(834) Class53_Sub1_Sub1 local834 = Static182.aClass53_Sub1_Sub1Array1[local684.anInt2560];
						if (local834 != null) {
							local374 = local834.anInt3974 / 32 - Static154.aClass53_Sub1_Sub1_2.anInt3974 / 32;
							local731 = local834.anInt4002 / 32 - Static154.aClass53_Sub1_Sub1_2.anInt4002 / 32;
							Static230.method3656(arg2, 360000, arg0, local731, arg3, local374, local684.anInt2559);
						}
					}
				}
				local197++;
			}
			if (Static239.anInt4507 != 0) {
				local188 = Static239.anInt4507 * 4 + Static154.aClass53_Sub1_Sub1_2.method3324() * 2 + 2 - Static154.aClass53_Sub1_Sub1_2.anInt3974 / 32 - 2;
				local197 = Static102.anInt2140 * 4 + Static154.aClass53_Sub1_Sub1_2.method3324() * 2 + 2 - Static154.aClass53_Sub1_Sub1_2.anInt4002 / 32 - 2;
				Static34.method525(arg0, arg2, arg3, local188, local197, Static11.aClass4_Sub3_Sub14Array2[Static105.aBoolean147 ? 1 : 0]);
			}
			if (Static94.aBoolean138) {
				Static104.method1702(arg0 + arg2.anInt5897 / 2 - 1, arg2.anInt5953 / 2 + -1 + arg3, 3, 3, 16777215);
			} else {
				Static270.method4242(arg0 + arg2.anInt5897 / 2 - 1, arg2.anInt5953 / 2 + -1 + arg3, 3, 3, 16777215);
			}
		} else if (Static94.aBoolean138) {
			@Pc(64) Class4_Sub3_Sub14 local64 = arg2.method4766(false);
			if (local64 != null) {
				local64.method4543(arg0, arg3);
			}
		} else {
			Static270.method4247(arg0, arg3, arg2.anIntArray672, arg2.anIntArray657);
		}
		Static259.aBooleanArray24[arg1] = true;
	}
}
