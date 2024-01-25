import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
	public static int anInt4477;

	@OriginalMember(owner = "client!jga", name = "j", descriptor = "I")
	public static int anInt4483;

	@OriginalMember(owner = "client!jga", name = "m", descriptor = "Lclient!gda;")
	public static Class118 aClass118_1;

	@OriginalMember(owner = "client!jga", name = "p", descriptor = "Z")
	public static boolean aBoolean335;

	@OriginalMember(owner = "client!jga", name = "r", descriptor = "[Lclient!ida;")
	public static Interface10[] anInterface10Array1;

	@OriginalMember(owner = "client!jga", name = "k", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_135 = new Class235(110, 3);

	@OriginalMember(owner = "client!jga", name = "n", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_48 = new Class70(58, 15);

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Z)V")
	public static void method3633() {
		@Pc(12) Class1_Sub11 local12 = Static276.method3885(Static130.aClass70_23, Static481.aClass276_2);
		local12.aClass1_Sub35_Sub2_1.method5777(Static195.method2980());
		local12.aClass1_Sub35_Sub2_1.method5776(Static130.anInt2566);
		local12.aClass1_Sub35_Sub2_1.method5776(Static499.anInt4149);
		local12.aClass1_Sub35_Sub2_1.method5777(Static348.aClass1_Sub30_Sub1_1.anInt4869);
		Static48.method743(local12);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZLclient!wt;)Ljava/lang/String;")
	public static String method3634(@OriginalArg(1) Class1_Sub51 arg0) {
		return arg0.aString99 == null || arg0.aString99.length() <= 0 ? arg0.aString100 : arg0.aString100 + Static568.aClass351_36.method7651(Static307.anInt5279) + arg0.aString99;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZBLclient!vq;)V")
	public static void method3636(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class8_Sub3_Sub3_Sub1 arg1) {
		@Pc(9) Class140 local9 = arg1.method5425();
		if (arg1.anInt6859 == 0) {
			Static580.anInt9539 = -1;
			arg1.anInt6856 = 0;
			Static380.anInt6324 = 0;
			return;
		}
		if (arg1.anInt6822 != -1 && arg1.anInt6785 == 0) {
			@Pc(37) Class290 local37 = Static192.aClass211_1.method4277(arg1.anInt6822);
			if (arg1.anInt6858 > 0 && local37.anInt7805 == 0) {
				arg1.anInt6856++;
				Static580.anInt9539 = -1;
				Static380.anInt6324 = 0;
				return;
			}
			if (arg1.anInt6858 <= 0 && local37.anInt7796 == 0) {
				Static380.anInt6324 = 0;
				Static580.anInt9539 = -1;
				arg1.anInt6856++;
				return;
			}
		}
		@Pc(102) Class290 local102;
		@Pc(88) Class60 local88;
		if (arg1.anInt6830 != -1 && arg1.anInt6797 <= Static301.anInt5197) {
			local88 = Static107.aClass200_3.method3956(arg1.anInt6830);
			if (local88.aBoolean111 && local88.anInt1383 != -1) {
				local102 = Static192.aClass211_1.method4277(local88.anInt1383);
				if (arg1.anInt6858 > 0 && local102.anInt7805 == 0) {
					Static580.anInt9539 = -1;
					arg1.anInt6856++;
					Static380.anInt6324 = 0;
					return;
				}
				if (arg1.anInt6858 <= 0 && local102.anInt7796 == 0) {
					Static380.anInt6324 = 0;
					Static580.anInt9539 = -1;
					arg1.anInt6856++;
					return;
				}
			}
		}
		if (arg1.anInt6830 != -1 && Static301.anInt5197 >= arg1.anInt6797) {
			local88 = Static107.aClass200_3.method3956(arg1.anInt6830);
			if (local88.aBoolean111 && local88.anInt1383 != -1) {
				local102 = Static192.aClass211_1.method4277(local88.anInt1383);
				if (arg1.anInt6858 > 0 && local102.anInt7805 == 0) {
					Static580.anInt9539 = -1;
					arg1.anInt6856++;
					Static380.anInt6324 = 0;
					return;
				}
				if (arg1.anInt6858 <= 0 && local102.anInt7796 == 0) {
					Static380.anInt6324 = 0;
					arg1.anInt6856++;
					Static580.anInt9539 = -1;
					return;
				}
			}
		}
		@Pc(203) int local203 = arg1.anInt9365;
		@Pc(206) int local206 = arg1.anInt9370;
		@Pc(222) int local222 = arg1.anIntArray534[arg1.anInt6859 - 1] * 512 + arg1.method5434() * 256;
		@Pc(238) int local238 = arg1.anIntArray533[arg1.anInt6859 - 1] * 512 + arg1.method5434() * 256;
		if (local222 > local203) {
			if (local206 < local238) {
				arg1.method5433(10240);
			} else if (local238 >= local206) {
				arg1.method5433(12288);
			} else {
				arg1.method5433(14336);
			}
		} else if (local203 > local222) {
			if (local238 > local206) {
				arg1.method5433(6144);
			} else if (local206 <= local238) {
				arg1.method5433(4096);
			} else {
				arg1.method5433(2048);
			}
		} else if (local206 < local238) {
			arg1.method5433(8192);
		} else if (local238 < local206) {
			arg1.method5433(0);
		}
		@Pc(326) byte local326 = arg1.aByteArray82[arg1.anInt6859 - 1];
		if (!arg0 && (local222 - local203 > 1024 || local222 - local203 < -1024 || local238 - local206 > 1024 || local238 - local206 < -1024)) {
			arg1.anInt9365 = local222;
			arg1.anInt9370 = local238;
			arg1.method5435(arg1.anInt6812, false);
			Static580.anInt9539 = -1;
			Static380.anInt6324 = 0;
			arg1.anInt6859--;
			if (arg1.anInt6858 > 0) {
				arg1.anInt6858--;
			}
			return;
		}
		@Pc(393) int local393 = 16;
		@Pc(395) boolean local395 = true;
		if (arg1 instanceof Class8_Sub3_Sub3_Sub1_Sub2) {
			local395 = ((Class8_Sub3_Sub3_Sub1_Sub2) arg1).aClass20_1.aBoolean33;
		}
		@Pc(413) int local413;
		if (local395) {
			local413 = arg1.anInt6812 - arg1.aClass108_7.anInt2729;
			if (local413 != 0 && arg1.anInt6781 == -1 && arg1.anInt6804 != 0) {
				local393 = 8;
			}
			if (!arg0 && arg1.anInt6859 > 2) {
				local393 = 24;
			}
			if (!arg0 && arg1.anInt6859 > 3) {
				local393 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt6859 > 1) {
				local393 = 24;
			}
			if (!arg0 && arg1.anInt6859 > 2) {
				local393 = 32;
			}
		}
		if (arg1.anInt6856 > 0 && arg1.anInt6859 > 1) {
			arg1.anInt6856--;
			local393 = 32;
		}
		if (local326 == 2) {
			local393 <<= 0x1;
		} else if (local326 == 0) {
			local393 >>= 0x1;
		}
		Static380.anInt6324 = 0;
		if (local9.anInt3596 != -1) {
			local393 <<= 0x9;
			if (arg1.anInt6859 == 1) {
				local413 = arg1.anInt6857 * arg1.anInt6857;
				@Pc(551) int local551 = (arg1.anInt9365 <= local222 ? local222 - arg1.anInt9365 : -local222 + arg1.anInt9365) << 9;
				@Pc(572) int local572 = (arg1.anInt9370 <= local238 ? local238 - arg1.anInt9370 : arg1.anInt9370 - local238) << 9;
				@Pc(579) int local579 = local572 < local551 ? local551 : local572;
				@Pc(586) int local586 = local579 * local9.anInt3596 * 2;
				if (local413 > local586) {
					arg1.anInt6857 /= 2;
				} else if (local579 < local413 / 2) {
					arg1.anInt6857 -= local9.anInt3596;
					if (arg1.anInt6857 < 0) {
						arg1.anInt6857 = 0;
					}
				} else if (arg1.anInt6857 < local393) {
					arg1.anInt6857 += local9.anInt3596;
					if (local393 < arg1.anInt6857) {
						arg1.anInt6857 = local393;
					}
				}
			} else if (local393 > arg1.anInt6857) {
				arg1.anInt6857 += local9.anInt3596;
				if (local393 < arg1.anInt6857) {
					arg1.anInt6857 = local393;
				}
			} else if (arg1.anInt6857 > 0) {
				arg1.anInt6857 -= local9.anInt3596;
				if (arg1.anInt6857 < 0) {
					arg1.anInt6857 = 0;
				}
			}
			local393 = arg1.anInt6857 >> 9;
			if (local393 < 1) {
				local393 = 1;
			}
		}
		if (local203 == local222 && local238 == local206) {
			Static580.anInt9539 = -1;
		} else {
			if (local222 > local203) {
				arg1.anInt9365 += local393;
				Static380.anInt6324 |= 0x4;
				if (arg1.anInt9365 > local222) {
					arg1.anInt9365 = local222;
				}
			} else if (local203 > local222) {
				Static380.anInt6324 |= 0x8;
				arg1.anInt9365 -= local393;
				if (arg1.anInt9365 < local222) {
					arg1.anInt9365 = local222;
				}
			}
			if (local238 > local206) {
				Static380.anInt6324 |= 0x1;
				arg1.anInt9370 += local393;
				if (local238 < arg1.anInt9370) {
					arg1.anInt9370 = local238;
				}
			} else if (local206 > local238) {
				Static380.anInt6324 |= 0x2;
				arg1.anInt9370 -= local393;
				if (local238 > arg1.anInt9370) {
					arg1.anInt9370 = local238;
				}
			}
			if (local393 < 32) {
				Static580.anInt9539 = local326;
			} else {
				Static580.anInt9539 = 2;
			}
		}
		if (local222 != arg1.anInt9365 || local238 != arg1.anInt9370) {
			return;
		}
		arg1.anInt6859--;
		if (arg1.anInt6858 > 0) {
			arg1.anInt6858--;
			return;
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3637(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg5 - arg0;
		@Pc(14) int local14 = arg0 + arg1;
		for (@Pc(16) int local16 = arg1; local16 < local14; local16++) {
			Static433.method6039(arg3, arg2, Static171.anIntArrayArray79[local16], arg6);
		}
		@Pc(47) int local47 = arg6 + arg0;
		@Pc(52) int local52 = arg2 - arg0;
		for (@Pc(54) int local54 = arg5; local54 > local10; local54--) {
			Static433.method6039(arg3, arg2, Static171.anIntArrayArray79[local54], arg6);
		}
		for (@Pc(70) int local70 = local14; local70 <= local10; local70++) {
			@Pc(76) int[] local76 = Static171.anIntArrayArray79[local70];
			Static433.method6039(arg3, local47, local76, arg6);
			Static433.method6039(arg4, local52, local76, local47);
			Static433.method6039(arg3, arg2, local76, local52);
		}
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)V")
	public static void method3638() {
		Static256.method3751();
		Static585.aClass1_Sub35_Sub2_2.anInt7214 = 0;
		Static125.aClass235_83 = null;
		Static445.anInt7693 = 0;
		Static5.anInt62 = 0;
		Static504.aClass235_188 = null;
		Static122.aClass235_80 = null;
		Static73.aClass235_31 = null;
		Static388.anInt6676 = 0;
		Static137.method2093();
		Static364.method4919();
		for (@Pc(30) int local30 = 0; local30 < 2048; local30++) {
			Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local30] = null;
		}
		Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 = null;
		for (@Pc(44) int local44 = 0; local44 < Static35.anInt540; local44++) {
			@Pc(51) Class8_Sub3_Sub3_Sub1_Sub2 local51 = Static466.aClass1_Sub42Array1[local44].aClass8_Sub3_Sub3_Sub1_Sub2_2;
			if (local51 != null) {
				local51.anInt6781 = -1;
			}
		}
		Static593.method7864();
		anInt4483 = -1;
		Static442.anInt7679 = -1;
		Static340.anInt5707 = 1;
		Static426.method5887(10);
		for (@Pc(81) int local81 = 0; local81 < 100; local81++) {
			Static166.aBooleanArray5[local81] = true;
		}
		method3633();
		Static366.aLong200 = 0L;
		Static250.aClass1_Sub34_1 = null;
	}

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "(I)V")
	public static void method3639() {
		Static48.aClass353_8.method7680();
		Static291.aClass353_31.method7680();
		@Pc(29) int local29;
		for (@Pc(24) Class1_Sub51 local24 = (Class1_Sub51) Static310.aClass353_32.method7677(); local24 != null; local24 = (Class1_Sub51) Static310.aClass353_32.method7687()) {
			local29 = local24.anInt9638;
			if (local29 < 1000) {
				local24.method7859();
				if (local29 == 10 || local29 == 6 || local29 == 25 || local29 == 3 || local29 == 59 || local29 == 22 || local29 == 21) {
					Static291.aClass353_31.method7679(local24);
				} else {
					Static48.aClass353_8.method7679(local24);
				}
			}
		}
		Static48.aClass353_8.method7683(Static310.aClass353_32);
		Static291.aClass353_31.method7683(Static310.aClass353_32);
		if (Static337.anInt8004 <= 1) {
			Static446.aClass1_Sub51_5 = null;
		} else if (Static197.aBoolean491 && Static137.aClass295_1.method7719(81) && Static337.anInt8004 > 2) {
			Static446.aClass1_Sub51_5 = (Class1_Sub51) Static310.aClass353_32.aClass1_271.aClass1_286.aClass1_286;
		} else {
			Static446.aClass1_Sub51_5 = (Class1_Sub51) Static310.aClass353_32.aClass1_271.aClass1_286;
		}
		local29 = -1;
		@Pc(126) Class1_Sub16 local126 = (Class1_Sub16) Static587.aClass353_67.method7677();
		if (local126 != null) {
			local29 = local126.method3646();
		}
		if (!Static554.aBoolean708) {
			if (local29 == 0 && (Static543.anInt9075 == 1 && Static337.anInt8004 > 2 || Static86.method1502())) {
				local29 = 2;
			}
			if (local29 == 2 && Static337.anInt8004 > 0 && local126 != null) {
				if (Static93.aClass341_8 == null && Static229.anInt4305 == 0) {
					Static396.method5494(local126.method3652(), local126.method3650());
				} else {
					Static142.anInt2691 = 2;
				}
			}
			if (local29 == 0 && Static337.anInt8004 > 0) {
				Static411.method5663();
			}
			if (Static93.aClass341_8 == null && Static229.anInt4305 == 0) {
				Static142.anInt2691 = 0;
				Static129.aClass1_Sub51_3 = null;
				return;
			}
			return;
		}
		@Pc(207) int local207;
		@Pc(211) int local211;
		if (local29 == -1) {
			local207 = Static166.aClass25_1.method4783();
			local211 = Static166.aClass25_1.method4788();
			if (Static330.anInt5532 - 10 > local207 || local207 > Static330.anInt5532 + Static274.anInt307 + 10 || Static518.anInt8770 - 10 > local211 || local211 > Static110.anInt2169 + Static518.anInt8770 + 10) {
				Static497.method4933();
			}
		}
		if (local29 != 0) {
			return;
		}
		local207 = Static330.anInt5532;
		local211 = Static518.anInt8770;
		@Pc(252) int local252 = Static274.anInt307;
		@Pc(256) int local256 = local126.method3652();
		@Pc(260) int local260 = local126.method3650();
		@Pc(262) int local262 = -1;
		@Pc(282) int local282;
		for (@Pc(264) int local264 = 0; local264 < Static337.anInt8004; local264++) {
			if (Static244.aBoolean336) {
				local282 = local211 + (Static337.anInt8004 - local264 - 1) * 16 + 33;
				if (local256 > local207 && local252 + local207 > local256 && local282 - 13 < local260 && local260 < local282 + 4) {
					local262 = local264;
				}
			} else {
				local282 = local211 + (-local264 + Static337.anInt8004 + -1) * 16 + 31;
				if (local207 < local256 && local252 + local207 > local256 && local282 - 13 < local260 && local282 + 3 > local260) {
					local262 = local264;
				}
			}
		}
		if (local262 != -1) {
			local282 = 0;
			@Pc(375) Class220 local375 = new Class220(Static310.aClass353_32);
			for (@Pc(380) Class1_Sub51 local380 = (Class1_Sub51) local375.method4408(); local380 != null; local380 = (Class1_Sub51) local375.method4410()) {
				if (local262 == local282) {
					Static157.method2280(local380, local260, local256);
				}
				local282++;
			}
		}
		Static497.method4933();
	}
}
