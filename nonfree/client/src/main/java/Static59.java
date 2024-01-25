import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!bv", name = "y", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!bv", name = "A", descriptor = "Lclient!la;")
	public static Class208 aClass208_11;

	@OriginalMember(owner = "client!bv", name = "I", descriptor = "I")
	public static int anInt893 = 0;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "([Ljava/lang/String;IZ[SI)V")
	public static void method839(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) short[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(29) int local29 = (arg3 + arg1) / 2;
		@Pc(31) int local31 = arg1;
		@Pc(35) String local35 = arg0[local29];
		arg0[local29] = arg0[arg3];
		arg0[arg3] = local35;
		@Pc(49) short local49 = arg2[local29];
		arg2[local29] = arg2[arg3];
		arg2[arg3] = local49;
		for (@Pc(61) int local61 = arg1; local61 < arg3; local61++) {
			if (local35 == null || arg0[local61] != null && arg0[local61].compareTo(local35) < (local61 & 0x1)) {
				@Pc(92) String local92 = arg0[local61];
				arg0[local61] = arg0[local31];
				arg0[local31] = local92;
				@Pc(106) short local106 = arg2[local61];
				arg2[local61] = arg2[local31];
				arg2[local31++] = local106;
			}
		}
		arg0[arg3] = arg0[local31];
		arg0[local31] = local35;
		arg2[arg3] = arg2[local31];
		arg2[local31] = local49;
		method839(arg0, arg1, arg2, local31 - 1);
		method839(arg0, local31 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(CB)C")
	public static char method840(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "(I)I")
	public static int method842() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static294.aClass230_3.aBoolean471 && !Static294.aClass230_3.aBoolean472) {
			local7 = true;
			if (Static528.aClass5_Sub19_1.anInt3442 < 512 && Static528.aClass5_Sub19_1.anInt3442 != 0) {
				local7 = false;
			}
			if (Static359.aString85.startsWith("win")) {
				local9 = true;
				local11 = true;
			} else {
				local9 = true;
			}
		}
		if (Static110.aBoolean167) {
			local11 = false;
		}
		if (Static206.aBoolean268) {
			local9 = false;
		}
		if (Static613.aBoolean757) {
			local7 = false;
		}
		if (!local7 && !local9 && !local11) {
			return Static344.method5208();
		}
		@Pc(74) int local74 = -1;
		@Pc(76) int local76 = -1;
		if (local7) {
			try {
				local74 = Static288.method4701(2, 1000);
			} catch (@Pc(85) Exception local85) {
			}
		}
		@Pc(88) int local88 = -1;
		if (local11) {
			try {
				local88 = Static288.method4701(3, 1000);
				if (Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() == 3) {
					@Pc(106) Class236 local106 = Static457.aClass57_11.method7656();
					@Pc(111) long local111 = local106.aLong197 & 0xFFFFFFFFFFFFL;
					@Pc(114) int local114 = local106.anInt6354;
					if (local114 == 4318) {
						local9 &= local111 >= 64425238954L;
					} else if (local114 == 4098) {
						local9 &= local111 >= 60129613779L;
					}
				}
			} catch (@Pc(160) Exception local160) {
			}
		}
		if (local9) {
			try {
				local76 = Static288.method4701(1, 1000);
			} catch (@Pc(170) Exception local170) {
			}
		}
		if (local74 == -1 && local76 == -1 && local88 == -1) {
			return Static344.method5208();
		}
		local88 = (int) ((float) local88 * 1.1F);
		local76 = (int) ((float) local76 * 1.1F);
		if (local74 > local88 && local74 > local76) {
			return Static358.method5337(local74);
		} else if (local76 >= local88) {
			return Static31.method495(local76, 1);
		} else {
			return Static31.method495(local88, 3);
		}
	}

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "(I)V")
	public static void method843() {
		for (@Pc(14) int local14 = 0; local14 < Static560.anInt9473; local14++) {
			@Pc(20) int local20 = Static222.anIntArray207[local14];
			@Pc(28) Class8_Sub1_Sub3_Sub2_Sub2 local28 = ((Class5_Sub35) Static623.aClass291_43.method6993((long) local20, 1)).aClass8_Sub1_Sub3_Sub2_Sub2_2;
			@Pc(32) int local32 = Static515.aClass5_Sub23_Sub2_1.method8529();
			if ((local32 & 0x10) != 0) {
				local32 += Static515.aClass5_Sub23_Sub2_1.method8529() << 8;
			}
			if ((local32 & 0x2000) != 0) {
				local32 += Static515.aClass5_Sub23_Sub2_1.method8529() << 16;
			}
			if ((local32 & 0x4000) != 0) {
				local28.aByte120 = Static515.aClass5_Sub23_Sub2_1.method8488();
				local28.aByte121 = Static515.aClass5_Sub23_Sub2_1.method8536();
				local28.aByte119 = Static515.aClass5_Sub23_Sub2_1.method8521();
				local28.aByte118 = (byte) Static515.aClass5_Sub23_Sub2_1.method8500();
				local28.anInt7013 = Static44.anInt740 + Static515.aClass5_Sub23_Sub2_1.method8519();
				local28.anInt7029 = Static44.anInt740 + Static515.aClass5_Sub23_Sub2_1.method8519();
			}
			@Pc(115) int local115;
			if ((local32 & 0x400) != 0) {
				local115 = Static515.aClass5_Sub23_Sub2_1.method8519();
				local28.anInt7034 = Static515.aClass5_Sub23_Sub2_1.method8483();
				local28.anInt7007 = Static515.aClass5_Sub23_Sub2_1.method8529();
				local28.anInt6985 = local115 & 0x7FFF;
				local28.aBoolean542 = (local115 & 0x8000) != 0;
				local28.anInt6983 = local28.anInt6985 + Static44.anInt740 + local28.anInt7034;
			}
			if ((local32 & 0x800) != 0) {
				local28.anInt7025 = Static515.aClass5_Sub23_Sub2_1.method8521();
				local28.anInt6982 = Static515.aClass5_Sub23_Sub2_1.method8508();
				local28.anInt7003 = Static515.aClass5_Sub23_Sub2_1.method8488();
				local28.anInt7001 = Static515.aClass5_Sub23_Sub2_1.method8508();
				local28.anInt7032 = Static515.aClass5_Sub23_Sub2_1.method8519() + Static44.anInt740;
				local28.anInt7037 = Static515.aClass5_Sub23_Sub2_1.method8519() + Static44.anInt740;
				local28.anInt7036 = Static515.aClass5_Sub23_Sub2_1.method8500();
				local28.anInt7001 += local28.anIntArray415[0];
				local28.anInt7049 = 0;
				local28.anInt6982 += local28.anIntArray415[0];
				local28.anInt7050 = 1;
				local28.anInt7025 += local28.anIntArray414[0];
				local28.anInt7003 += local28.anIntArray414[0];
			}
			if ((local32 & 0x80) != 0) {
				local28.aString92 = Static515.aClass5_Sub23_Sub2_1.method8497();
				local28.anInt7022 = 100;
			}
			@Pc(274) int[] local274;
			@Pc(277) int[] local277;
			@Pc(282) int local282;
			@Pc(290) int local290;
			if ((local32 & 0x200) != 0) {
				local115 = Static515.aClass5_Sub23_Sub2_1.method8529();
				local274 = new int[local115];
				local277 = new int[local115];
				@Pc(280) int[] local280 = new int[local115];
				for (local282 = 0; local282 < local115; local282++) {
					local290 = Static515.aClass5_Sub23_Sub2_1.method8519();
					if (local290 == 65535) {
						local290 = -1;
					}
					local274[local282] = local290;
					local277[local282] = Static515.aClass5_Sub23_Sub2_1.method8483();
					local280[local282] = Static515.aClass5_Sub23_Sub2_1.method8519();
				}
				Static1.method8128(local28, local280, local277, local274);
			}
			@Pc(408) int local408;
			@Pc(437) int local437;
			@Pc(339) int local339;
			@Pc(350) int local350;
			@Pc(363) int local363;
			@Pc(370) int[] local370;
			@Pc(398) short[] local398;
			@Pc(427) short[] local427;
			@Pc(466) long local466;
			if ((local32 & 0x8000) != 0) {
				local115 = local28.aClass227_1.anIntArray343.length;
				local339 = 0;
				if (local28.aClass227_1.aShortArray86 != null) {
					local339 = local28.aClass227_1.aShortArray86.length;
				}
				local350 = 0;
				if (local28.aClass227_1.aShortArray85 != null) {
					local350 = local28.aClass227_1.aShortArray85.length;
				}
				local363 = Static515.aClass5_Sub23_Sub2_1.method8483();
				if ((local363 & 0x1) == 1) {
					local28.aClass133_1 = null;
				} else {
					local370 = null;
					if ((local363 & 0x2) == 2) {
						local370 = new int[local115];
						for (local290 = 0; local290 < local115; local290++) {
							local370[local290] = Static515.aClass5_Sub23_Sub2_1.method8515();
						}
					}
					local398 = null;
					if ((local363 & 0x4) == 4) {
						local398 = new short[local339];
						for (local408 = 0; local408 < local339; local408++) {
							local398[local408] = (short) Static515.aClass5_Sub23_Sub2_1.method8518();
						}
					}
					local427 = null;
					if ((local363 & 0x8) == 8) {
						local427 = new short[local350];
						for (local437 = 0; local437 < local350; local437++) {
							local427[local437] = (short) Static515.aClass5_Sub23_Sub2_1.method8506();
						}
					}
					local466 = (long) local28.anInt7077++ << 32 | (long) local20;
					local28.aClass133_1 = new Class133(local466, local370, local398, local427);
				}
			}
			if ((local32 & 0x20000) != 0) {
				local115 = Static515.aClass5_Sub23_Sub2_1.method8518();
				if (local115 == 65535) {
					local115 = -1;
				}
				local339 = Static515.aClass5_Sub23_Sub2_1.method8503();
				local350 = Static515.aClass5_Sub23_Sub2_1.method8483();
				local363 = local350 & 0x7;
				local282 = local350 >> 3 & 0xF;
				if (local282 == 15) {
					local282 = -1;
				}
				local28.method5999(local115, local282, local363, 2, local339);
			}
			if ((local32 & 0x1) != 0) {
				local115 = Static515.aClass5_Sub23_Sub2_1.method8519();
				local339 = Static515.aClass5_Sub23_Sub2_1.method8474();
				if (local115 == 65535) {
					local115 = -1;
				}
				local350 = Static515.aClass5_Sub23_Sub2_1.method8529();
				local363 = local350 & 0x7;
				local282 = local350 >> 3 & 0xF;
				if (local282 == 15) {
					local282 = -1;
				}
				local28.method5999(local115, local282, local363, 0, local339);
			}
			if ((local32 & 0x100) != 0) {
				local115 = Static515.aClass5_Sub23_Sub2_1.method8483();
				local274 = new int[local115];
				local277 = new int[local115];
				for (local363 = 0; local363 < local115; local363++) {
					local282 = Static515.aClass5_Sub23_Sub2_1.method8518();
					if ((local282 & 0xC000) == 49152) {
						local290 = Static515.aClass5_Sub23_Sub2_1.method8518();
						local274[local363] = local282 << 16 | local290;
					} else {
						local274[local363] = local282;
					}
					local277[local363] = Static515.aClass5_Sub23_Sub2_1.method8506();
				}
				local28.method5988(95, local277, local274);
			}
			if ((local32 & 0x80000) != 0) {
				local28.aString93 = Static515.aClass5_Sub23_Sub2_1.method8497();
				if ("".equals(local28.aString93) || local28.aString93.equals(local28.aClass227_1.aString79)) {
					local28.aString93 = local28.aClass227_1.aString79;
				}
			}
			if ((local32 & 0x40000) != 0) {
				local28.anInt7069 = Static515.aClass5_Sub23_Sub2_1.method8518();
				if (local28.anInt7069 == 65535) {
					local28.anInt7069 = local28.aClass227_1.anInt6257;
				}
			}
			if ((local32 & 0x10000) != 0) {
				local115 = local28.aClass227_1.anIntArray344.length;
				local339 = 0;
				if (local28.aClass227_1.aShortArray86 != null) {
					local339 = local28.aClass227_1.aShortArray86.length;
				}
				if (local28.aClass227_1.aShortArray85 != null) {
					local339 = local28.aClass227_1.aShortArray85.length;
				}
				local363 = Static515.aClass5_Sub23_Sub2_1.method8505();
				if ((local363 & 0x1) != 1) {
					local370 = null;
					if ((local363 & 0x2) == 2) {
						local370 = new int[local115];
						for (local290 = 0; local290 < local115; local290++) {
							local370[local290] = Static515.aClass5_Sub23_Sub2_1.method8519();
						}
					}
					local398 = null;
					if ((local363 & 0x4) == 4) {
						local398 = new short[local339];
						for (local408 = 0; local408 < local339; local408++) {
							local398[local408] = (short) Static515.aClass5_Sub23_Sub2_1.method8515();
						}
					}
					local427 = null;
					if ((local363 & 0x8) == 8) {
						local427 = new short[0];
						for (local437 = 0; local437 < 0; local437++) {
							local427[local437] = (short) Static515.aClass5_Sub23_Sub2_1.method8506();
						}
					}
					local466 = (long) local28.anInt7074++ << 32 | (long) local20;
					new Class133(local466, local370, local398, local427);
				}
			}
			if ((local32 & 0x1000) != 0) {
				local115 = Static515.aClass5_Sub23_Sub2_1.method8506();
				local339 = Static515.aClass5_Sub23_Sub2_1.method8523();
				if (local115 == 65535) {
					local115 = -1;
				}
				local350 = Static515.aClass5_Sub23_Sub2_1.method8529();
				local363 = local350 & 0x7;
				local282 = local350 >> 3 & 0xF;
				if (local282 == 15) {
					local282 = -1;
				}
				local28.method5999(local115, local282, local363, 1, local339);
			}
			if ((local32 & 0x20) != 0) {
				@Pc(918) int[] local918 = new int[4];
				for (local339 = 0; local339 < 4; local339++) {
					local918[local339] = Static515.aClass5_Sub23_Sub2_1.method8506();
					if (local918[local339] == 65535) {
						local918[local339] = -1;
					}
				}
				local350 = Static515.aClass5_Sub23_Sub2_1.method8529();
				Static205.method2933(local28, local350, local918);
			}
			if ((local32 & 0x2) != 0) {
				local28.anInt7058 = Static515.aClass5_Sub23_Sub2_1.method8519();
				local28.anInt7059 = Static515.aClass5_Sub23_Sub2_1.method8519();
			}
			if ((local32 & 0x40) != 0) {
				local28.anInt7041 = Static515.aClass5_Sub23_Sub2_1.method8515();
				if (local28.anInt7041 == 65535) {
					local28.anInt7041 = -1;
				}
			}
			if ((local32 & 0x4) != 0) {
				local115 = Static515.aClass5_Sub23_Sub2_1.method8500();
				if (local115 > 0) {
					for (local339 = 0; local339 < local115; local339++) {
						local363 = -1;
						local282 = -1;
						local350 = Static515.aClass5_Sub23_Sub2_1.method8499();
						local290 = -1;
						if (local350 == 32767) {
							local350 = Static515.aClass5_Sub23_Sub2_1.method8499();
							local282 = Static515.aClass5_Sub23_Sub2_1.method8499();
							local363 = Static515.aClass5_Sub23_Sub2_1.method8499();
							local290 = Static515.aClass5_Sub23_Sub2_1.method8499();
						} else if (local350 == 32766) {
							local350 = -1;
						} else {
							local282 = Static515.aClass5_Sub23_Sub2_1.method8499();
						}
						local408 = Static515.aClass5_Sub23_Sub2_1.method8499();
						local437 = Static515.aClass5_Sub23_Sub2_1.method8500();
						local28.method6001(local282, local408, local437, local290, local363, local350, Static44.anInt740);
					}
				}
			}
			if ((local32 & 0x8) != 0) {
				if (local28.aClass227_1.method5327(27420)) {
					Static616.method8741(local28);
				}
				local28.method6004(Static325.aClass231_1.method5363(Static515.aClass5_Sub23_Sub2_1.method8519(), 2));
				local28.method5987(local28.aClass227_1.anInt6248);
				local28.anInt7020 = local28.aClass227_1.anInt6262 << 3;
				if (local28.aClass227_1.method5327(27420)) {
					Static545.method7956(local28.anIntArray414[0], 0, local28, local28.aByte145, (Class8_Sub1_Sub3_Sub2_Sub1) null, local28.anIntArray415[0], (Class55) null);
				}
			}
		}
	}
}
