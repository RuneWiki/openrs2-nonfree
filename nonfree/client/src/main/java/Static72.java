import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
	public static int anInt801;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Lclient!ja;")
	public static Class39 aClass39_421 = Static28.method504(")4l");

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Lclient!ja;")
	public static Class39 aClass39_422 = Static28.method504("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Lclient!ja;")
	public static Class39 aClass39_423 = Static28.method504("");

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
	public static int anInt794 = 127;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "Lclient!ja;")
	private static Class39 aClass39_424 = Static28.method504("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Lclient!ja;")
	public static Class39 aClass39_425 = aClass39_424;

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "Lclient!ja;")
	public static Class39 aClass39_426 = aClass39_423;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
	public static int anInt799 = 0;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
	public static int anInt800 = 0;

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
	public static int anInt802 = 10;

	@OriginalMember(owner = "client!ma", name = "z", descriptor = "Lclient!ja;")
	public static Class39 aClass39_427 = Static28.method504("<)4col> x");

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!pd;BZII)V")
	public static void method528(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static78.anInt1860 = arg2;
		Static54.anInt1478 = 10000;
		Static20.anInt563 = arg3;
		Static40.anInt1002 = 1;
		Static77.aBoolean100 = false;
		Static130.anInt3174 = arg0;
		Static14.aClass20_10 = arg1;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
	public static void method529() {
		Static61.aBoolean91 = true;
		Static123.aBoolean150 = true;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	public static void method530() {
		@Pc(11) int local11;
		if (Static6.anInt244 > 0) {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static6.anInt244 > 768) {
					Static30.anIntArray86[local11] = Static44.method741(Static97.anIntArray276[local11], 1024 - Static6.anInt244, Static28.anIntArray84[local11]);
				} else if (Static6.anInt244 > 256) {
					Static30.anIntArray86[local11] = Static97.anIntArray276[local11];
				} else {
					Static30.anIntArray86[local11] = Static44.method741(Static28.anIntArray84[local11], 256 - Static6.anInt244, Static97.anIntArray276[local11]);
				}
			}
		} else if (Static36.anInt910 <= 0) {
			for (local11 = 0; local11 < 256; local11++) {
				Static30.anIntArray86[local11] = Static28.anIntArray84[local11];
			}
		} else {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static36.anInt910 > 768) {
					Static30.anIntArray86[local11] = Static44.method741(Static20.anIntArray59[local11], 1024 - Static36.anInt910, Static28.anIntArray84[local11]);
				} else if (Static36.anInt910 > 256) {
					Static30.anIntArray86[local11] = Static20.anIntArray59[local11];
				} else {
					Static30.anIntArray86[local11] = Static44.method741(Static28.anIntArray84[local11], 256 - Static36.anInt910, Static20.anIntArray59[local11]);
				}
			}
		}
		Static17.method1680(0, 9, 128, 263);
		Static93.aClass4_Sub2_Sub3_Sub1_9.method870(0, 0);
		local11 = 0;
		Static17.method1681();
		@Pc(154) int local154 = 6885;
		@Pc(169) int local169;
		@Pc(173) int local173;
		@Pc(186) int local186;
		@Pc(193) int local193;
		@Pc(203) int local203;
		@Pc(212) int local212;
		@Pc(208) int local208;
		for (@Pc(156) int local156 = 1; local156 < 255; local156++) {
			local169 = Static85.anIntArray223[local156] * (256 - local156) / 256;
			local173 = local169 + 22;
			if (local173 < 0) {
				local173 = 0;
			}
			local11 += local173;
			for (local186 = local173; local186 < 128; local186++) {
				local193 = Static113.anIntArray306[local11++];
				if (local193 == 0) {
					local154++;
				} else {
					local203 = local193;
					local208 = Static91.aClass6_1.anIntArray90[local154];
					local212 = 256 - local193;
					local193 = Static30.anIntArray86[local193];
					Static91.aClass6_1.anIntArray90[local154++] = ((local208 & 0xFF00FF) * local212 + (local193 & 0xFF00FF) * local203 & 0xFF00FF00) + (local212 * (local208 & 0xFF00) + local203 * (local193 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local154 += local173 + 637;
		}
		local154 = 7546;
		Static17.method1680(637, 9, 765, 263);
		Static51.aClass4_Sub2_Sub3_Sub1_5.method870(382, 0);
		Static17.method1681();
		local11 = 0;
		for (local169 = 1; local169 < 255; local169++) {
			local173 = Static85.anIntArray223[local169] * (256 - local169) / 256;
			local154 += local173;
			local186 = 103 - local173;
			for (local193 = 0; local193 < local186; local193++) {
				local203 = Static113.anIntArray306[local11++];
				if (local203 == 0) {
					local154++;
				} else {
					local208 = 256 - local203;
					local212 = local203;
					@Pc(339) int local339 = Static91.aClass6_1.anIntArray90[local154];
					local203 = Static30.anIntArray86[local203];
					Static91.aClass6_1.anIntArray90[local154++] = ((local339 & 0xFF00FF) * local208 + local212 * (local203 & 0xFF00FF) & 0xFF00FF00) + ((local339 & 0xFF00) * local208 + (local203 & 0xFF00) * local212 & 0xFF0000) >> 8;
				}
			}
			local11 += 128 - local186;
			local154 += 765 - local173 - local186;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Z")
	public static boolean method532(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(11) int local11 = Static125.anIntArray358[arg0];
		if (local11 >= 2000) {
			local11 -= 2000;
		}
		return local11 == 1003;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!ja;Lclient!he;)Lclient!ja;")
	public static Class39 method534(@OriginalArg(1) Class39 arg0, @OriginalArg(2) Class4_Sub5 arg1) {
		if (arg0.method960(Static44.aClass39_668) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(21) int local21 = arg0.method960(Static29.aClass39_410);
			if (local21 == -1) {
				while (true) {
					local21 = arg0.method960(Static75.aClass39_940);
					if (local21 == -1) {
						while (true) {
							local21 = arg0.method960(Static65.aClass39_883);
							if (local21 == -1) {
								while (true) {
									local21 = arg0.method960(Static100.aClass39_1297);
									if (local21 == -1) {
										while (true) {
											local21 = arg0.method960(Static20.aClass39_333);
											if (local21 == -1) {
												while (true) {
													local21 = arg0.method960(Static44.aClass39_672);
													if (local21 == -1) {
														return arg0;
													}
													@Pc(246) Class39 local246 = aClass39_423;
													if (Static87.aClass16_7 != null) {
														local246 = Static71.method1197(Static87.aClass16_7.anInt443);
														try {
															if (Static87.aClass16_7.anObject2 != null) {
																@Pc(262) byte[] local262 = ((String) Static87.aClass16_7.anObject2).getBytes("ISO-8859-1");
																local246 = Static41.method688(local262, local262.length, 0);
															}
														} catch (@Pc(271) UnsupportedEncodingException local271) {
														}
													}
													arg0 = Static62.method1123(new Class39[] { arg0.method938(local21, 0), local246, arg0.method964(local21 + 4) });
												}
											}
											arg0 = Static62.method1123(new Class39[] { arg0.method938(local21, 0), Static20.method382(Static117.method2039(4, arg1)), arg0.method964(local21 + 2) });
										}
									}
									arg0 = Static62.method1123(new Class39[] { arg0.method938(local21, 0), Static20.method382(Static117.method2039(3, arg1)), arg0.method964(local21 + 2) });
								}
							}
							arg0 = Static62.method1123(new Class39[] { arg0.method938(local21, 0), Static20.method382(Static117.method2039(2, arg1)), arg0.method964(local21 + 2) });
						}
					}
					arg0 = Static62.method1123(new Class39[] { arg0.method938(local21, 0), Static20.method382(Static117.method2039(1, arg1)), arg0.method964(local21 + 2) });
				}
			}
			arg0 = Static62.method1123(new Class39[] { arg0.method938(local21, 0), Static20.method382(Static117.method2039(0, arg1)), arg0.method964(local21 + 2) });
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	public static void method535() {
		aClass39_424 = null;
		aClass39_427 = null;
		aClass39_426 = null;
		aClass39_425 = null;
		anIntArrayArrayArray4 = null;
		aClass39_423 = null;
		aClass39_422 = null;
		aClass39_421 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B[B)[B")
	public static byte[] method537(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class4_Sub16 local8 = new Class4_Sub16(arg0);
		@Pc(14) int local14 = local8.method1474();
		@Pc(30) int local30 = local8.method1486();
		if (local30 < 0 || Static51.anInt2483 != 0 && local30 > Static51.anInt2483) {
			throw new RuntimeException();
		} else if (local14 == 0) {
			@Pc(96) byte[] local96 = new byte[local30];
			local8.method1483(local96, local30);
			return local96;
		} else {
			@Pc(53) int local53 = local8.method1486();
			if (local53 < 0 || Static51.anInt2483 != 0 && local53 > Static51.anInt2483) {
				throw new RuntimeException();
			}
			@Pc(73) byte[] local73 = new byte[local53];
			if (local14 == 1) {
				Static56.method990(local73, local53, arg0, local30);
			} else {
				Static82.aClass51_1.method1185(local8, local73);
			}
			return local73;
		}
	}
}
