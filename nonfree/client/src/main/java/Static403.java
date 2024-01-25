import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!mf", name = "N", descriptor = "D")
	public static double aDouble12;

	@OriginalMember(owner = "client!mf", name = "Bb", descriptor = "[I")
	public static final int[] anIntArray482 = new int[1];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIII)V")
	public static void method5425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class197[] local7 = Static110.aClass197Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class197 local15 = local7[local9];
			if (local15 != null && local15.anInt5073 == 2) {
				Static454.method6013(local15.anInt5083 * 2, local15.anInt5078, local15.anInt5081, arg2 >> 1, local15.anInt5074, arg0 >> 1);
				if (Static143.anIntArray165[0] > -1 && Static716.anInt11157 % 20 < 10) {
					@Pc(66) Class178 local66 = Static708.aClass178Array18[local15.anInt5072];
					@Pc(74) int local74 = Static143.anIntArray165[0] + arg3 - 12;
					@Pc(82) int local82 = Static143.anIntArray165[1] + arg1 - 28;
					local66.method7637(local74, local82);
					Static218.method3251(local82 + local66.method7632(), local74, local74 + local66.method7627(), local82);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)Lclient!en;")
	public static Class3_Sub1 method5431(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class3_Sub1_Sub9();
		} else if (arg0 == 1) {
			return new Class3_Sub1_Sub31();
		} else if (arg0 == 2) {
			return new Class3_Sub1_Sub10();
		} else if (arg0 == 3) {
			return new Class3_Sub1_Sub4();
		} else if (arg0 == 4) {
			return new Class3_Sub1_Sub25();
		} else if (arg0 == 5) {
			return new Class3_Sub1_Sub27();
		} else if (arg0 == 6) {
			return new Class3_Sub1_Sub30();
		} else if (arg0 == 7) {
			return new Class3_Sub1_Sub22();
		} else if (arg0 == 8) {
			return new Class3_Sub1_Sub2();
		} else if (arg0 == 9) {
			return new Class3_Sub1_Sub34();
		} else if (arg0 == 10) {
			return new Class3_Sub1_Sub11();
		} else if (arg0 == 11) {
			return new Class3_Sub1_Sub20();
		} else if (arg0 == 12) {
			return new Class3_Sub1_Sub17();
		} else if (arg0 == 13) {
			return new Class3_Sub1_Sub33();
		} else if (arg0 == 14) {
			return new Class3_Sub1_Sub28();
		} else if (arg0 == 15) {
			return new Class3_Sub1_Sub29();
		} else if (arg0 == 16) {
			return new Class3_Sub1_Sub37();
		} else if (arg0 == 17) {
			return new Class3_Sub1_Sub21();
		} else if (arg0 == 18) {
			return new Class3_Sub1_Sub12_Sub1();
		} else if (arg0 == 19) {
			return new Class3_Sub1_Sub16();
		} else if (arg0 == 20) {
			return new Class3_Sub1_Sub39();
		} else if (arg0 == 21) {
			return new Class3_Sub1_Sub38();
		} else if (arg0 == 22) {
			return new Class3_Sub1_Sub5();
		} else if (arg0 == 23) {
			return new Class3_Sub1_Sub36();
		} else if (arg0 == 24) {
			return new Class3_Sub1_Sub1();
		} else if (arg0 == 25) {
			return new Class3_Sub1_Sub7();
		} else if (arg0 == 26) {
			return new Class3_Sub1_Sub23();
		} else if (arg0 == 27) {
			return new Class3_Sub1_Sub8();
		} else if (arg0 == 28) {
			return new Class3_Sub1_Sub18();
		} else if (arg0 == 29) {
			return new Class3_Sub1_Sub15();
		} else if (arg0 == 30) {
			return new Class3_Sub1_Sub26();
		} else if (arg0 == 31) {
			return new Class3_Sub1_Sub19();
		} else if (arg0 == 32) {
			return new Class3_Sub1_Sub35();
		} else if (arg0 == 33) {
			return new Class3_Sub1_Sub13();
		} else if (arg0 == 34) {
			return new Class3_Sub1_Sub32();
		} else if (arg0 == 35) {
			return new Class3_Sub1_Sub3();
		} else if (arg0 == 36) {
			return new Class3_Sub1_Sub6();
		} else if (arg0 == 37) {
			return new Class3_Sub1_Sub24();
		} else if (arg0 == 38) {
			return new Class3_Sub1_Sub14();
		} else if (arg0 == 39) {
			return new Class3_Sub1_Sub12();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
	public static void method5440(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub7_Sub21 local9 = Static136.method2378((long) arg0, 6);
		local9.method9260();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII[BI)Z")
	public static boolean method5443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class3_Sub2 local12 = new Class3_Sub2(arg3);
		@Pc(27) int local27 = -1;
		label68: while (true) {
			@Pc(33) int local33 = local12.method2013();
			if (local33 == 0) {
				return local7;
			}
			local27 += local33;
			@Pc(44) int local44 = 0;
			@Pc(48) boolean local48 = false;
			while (true) {
				@Pc(84) int local84;
				@Pc(122) Class247 local122;
				do {
					@Pc(89) int local89;
					@Pc(93) int local93;
					do {
						do {
							do {
								do {
									@Pc(54) int local54;
									while (local48) {
										local54 = local12.method2054();
										if (local54 == 0) {
											continue label68;
										}
										local12.method2048(255);
									}
									local54 = local12.method2054();
									if (local54 == 0) {
										continue label68;
									}
									local44 += local54 - 1;
									@Pc(70) int local70 = local44 & 0x3F;
									@Pc(76) int local76 = local44 >> 6 & 0x3F;
									local84 = local12.method2048(255) >> 2;
									local89 = local76 + arg4;
									local93 = arg2 + local70;
								} while (local89 <= 0);
							} while (local93 <= 0);
						} while (local89 >= arg1 - 1);
					} while (local93 >= arg0 - 1);
					local122 = Static216.aClass53_3.method1523(local27);
				} while (local84 == 22 && Static580.aClass3_Sub22_24.aClass21_Sub5_1.method2407() == 0 && local122.anInt6278 == 0 && local122.anInt6289 != 1 && !local122.aBoolean418);
				local48 = true;
				if (!local122.method5430()) {
					Static208.anInt3445++;
					local7 = false;
				}
			}
		}
	}
}
