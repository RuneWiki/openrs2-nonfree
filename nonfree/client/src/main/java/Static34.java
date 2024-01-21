import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!f", name = "l", descriptor = "[Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2[] aClass8_Sub1_Sub3_Sub2Array2;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "Lclient!ic;")
	public static Class34 aClass34_484 = Static56.method816("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!f", name = "i", descriptor = "Lclient!ic;")
	private static Class34 aClass34_485 = Static56.method816("purple:");

	@OriginalMember(owner = "client!f", name = "j", descriptor = "Lclient!ic;")
	public static Class34 aClass34_486 = Static56.method816("_");

	@OriginalMember(owner = "client!f", name = "o", descriptor = "I")
	public static int anInt907 = 0;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "Lclient!ic;")
	public static Class34 aClass34_487 = Static56.method816("::gc");

	@OriginalMember(owner = "client!f", name = "r", descriptor = "Lclient!ic;")
	public static Class34 aClass34_488 = null;

	@OriginalMember(owner = "client!f", name = "s", descriptor = "Lclient!ic;")
	public static Class34 aClass34_489 = aClass34_485;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "I")
	public static int anInt908 = 0;

	@OriginalMember(owner = "client!f", name = "u", descriptor = "Lclient!ic;")
	public static Class34 aClass34_490 = aClass34_485;

	@OriginalMember(owner = "client!f", name = "v", descriptor = "Lclient!ic;")
	private static Class34 aClass34_491 = Static56.method816("New User");

	@OriginalMember(owner = "client!f", name = "w", descriptor = "Lclient!ic;")
	public static Class34 aClass34_492 = aClass34_491;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ic;II)V")
	public static void method553(@OriginalArg(0) Class34 arg0, @OriginalArg(2) int arg1) {
		Static106.aClass8_Sub20_Sub1_3.method1907(209);
		Static106.aClass8_Sub20_Sub1_3.method1862(arg0.method830());
		Static106.aClass8_Sub20_Sub1_3.method1866(arg1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
	public static void method554() {
		aClass34_489 = null;
		aClass8_Sub1_Sub3_Sub2Array2 = null;
		aClass34_492 = null;
		aClass34_486 = null;
		aClass34_487 = null;
		aClass34_488 = null;
		aClass34_485 = null;
		aClass34_490 = null;
		aClass34_491 = null;
		aClass34_484 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IBIILclient!dc;)V")
	private static void method555(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class8_Sub1_Sub6 arg3) {
		if (Static64.anInt2023 >= 50 || Static67.anInt1640 == 0 || (arg3.anIntArray78 == null || arg3.anIntArray78.length <= arg1)) {
			return;
		}
		@Pc(25) int local25 = arg3.anIntArray78[arg1];
		if (local25 == 0) {
			return;
		}
		@Pc(43) int local43 = local25 >> 8;
		@Pc(47) int local47 = local25 & 0xF;
		Static68.anIntArray207[Static64.anInt2023] = local43;
		@Pc(57) int local57 = local25 >> 4 & 0x7;
		@Pc(63) int local63 = (arg0 - 64) / 128;
		@Pc(69) int local69 = (arg2 - 64) / 128;
		Static58.anIntArray191[Static64.anInt2023] = local57;
		Static36.anIntArray126[Static64.anInt2023] = 0;
		Static4.aClass57Array1[Static64.anInt2023] = null;
		Static20.anIntArray67[Static64.anInt2023] = (local63 << 16) - (-(local69 << 8) - local47);
		Static64.anInt2023++;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static void method557() {
		for (@Pc(16) Class8_Sub18 local16 = (Class8_Sub18) Static20.aClass49_2.method1107(); local16 != null; local16 = (Class8_Sub18) Static20.aClass49_2.method1109()) {
			if (local16.anInt2369 == -1) {
				local16.anInt2372 = 0;
				Static18.method304(local16);
			} else {
				local16.method2013();
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
	public static int method558(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(19) int local19 = (local9 & 0x33333333) + ((local9 & 0xCCCCCCCF) >>> 2);
		@Pc(36) int local36 = local19 + (local19 >>> 4) & 0xF0F0F0F;
		@Pc(42) int local42 = local36 + (local36 >>> 8);
		@Pc(48) int local48 = local42 + (local42 >>> 16);
		return local48 & 0xFF;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!jf;Z)V")
	public static void method559(@OriginalArg(0) Class8_Sub1_Sub1_Sub4 arg0) {
		arg0.aBoolean78 = false;
		@Pc(14) Class8_Sub1_Sub6 local14;
		if (arg0.anInt2010 != -1) {
			local14 = Static47.method733(arg0.anInt2010);
			if (local14 == null || local14.anIntArray79 == null) {
				arg0.anInt2010 = -1;
			} else {
				arg0.anInt2064++;
				if (arg0.anInt2025 < local14.anIntArray79.length && arg0.anInt2064 > local14.anIntArray76[arg0.anInt2025]) {
					arg0.anInt2064 = 1;
					arg0.anInt2025++;
					method555(arg0.anInt2043, arg0.anInt2025, arg0.anInt2059, local14);
				}
				if (local14.anIntArray79.length <= arg0.anInt2025) {
					arg0.anInt2025 = 0;
					arg0.anInt2064 = 0;
					method555(arg0.anInt2043, arg0.anInt2025, arg0.anInt2059, local14);
				}
			}
		}
		if (arg0.anInt2006 != -1 && Static21.anInt655 >= arg0.anInt2055) {
			if (arg0.anInt2050 < 0) {
				arg0.anInt2050 = 0;
			}
			@Pc(122) int local122 = Static14.method235(arg0.anInt2006).anInt638;
			if (local122 == -1) {
				arg0.anInt2006 = -1;
			} else {
				@Pc(135) Class8_Sub1_Sub6 local135 = Static47.method733(local122);
				if (local135 == null || local135.anIntArray79 == null) {
					arg0.anInt2006 = -1;
				} else {
					arg0.anInt2024++;
					if (local135.anIntArray79.length > arg0.anInt2050 && local135.anIntArray76[arg0.anInt2050] < arg0.anInt2024) {
						arg0.anInt2050++;
						arg0.anInt2024 = 1;
						method555(arg0.anInt2043, arg0.anInt2050, arg0.anInt2059, local135);
					}
					if (arg0.anInt2050 >= local135.anIntArray79.length && (arg0.anInt2050 < 0 || local135.anIntArray79.length <= arg0.anInt2050)) {
						arg0.anInt2006 = -1;
					}
				}
			}
		}
		if (arg0.anInt2009 != -1 && arg0.anInt2027 <= 1) {
			local14 = Static47.method733(arg0.anInt2009);
			if (local14.anInt718 == 1 && arg0.anInt2005 > 0 && Static21.anInt655 >= arg0.anInt2026 && arg0.anInt2039 < Static21.anInt655) {
				arg0.anInt2027 = 1;
				return;
			}
		}
		if (arg0.anInt2009 != -1 && arg0.anInt2027 == 0) {
			local14 = Static47.method733(arg0.anInt2009);
			if (local14 == null || local14.anIntArray79 == null) {
				arg0.anInt2009 = -1;
			} else {
				arg0.anInt2060++;
				if (arg0.anInt2015 < local14.anIntArray79.length && arg0.anInt2060 > local14.anIntArray76[arg0.anInt2015]) {
					arg0.anInt2060 = 1;
					arg0.anInt2015++;
					method555(arg0.anInt2043, arg0.anInt2015, arg0.anInt2059, local14);
				}
				if (arg0.anInt2015 >= local14.anIntArray79.length) {
					arg0.anInt2052++;
					arg0.anInt2015 -= local14.anInt724;
					if (local14.anInt704 <= arg0.anInt2052) {
						arg0.anInt2009 = -1;
					} else if (arg0.anInt2015 >= 0 && arg0.anInt2015 < local14.anIntArray79.length) {
						method555(arg0.anInt2043, arg0.anInt2015, arg0.anInt2059, local14);
					} else {
						arg0.anInt2009 = -1;
					}
				}
				arg0.aBoolean78 = local14.aBoolean33;
			}
		}
		if (arg0.anInt2027 > 0) {
			arg0.anInt2027--;
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)I")
	public static int method560() {
		return 6;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIILclient!q;IILclient!kd;III)V")
	public static void method561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class64 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class42 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) Class8_Sub1_Sub4 local11 = Static50.method752(arg1);
		@Pc(22) int local22;
		@Pc(25) int local25;
		if (arg4 == 1 || arg4 == 3) {
			local25 = local11.anInt443;
			local22 = local11.anInt455;
		} else {
			local22 = local11.anInt443;
			local25 = local11.anInt455;
		}
		@Pc(41) int local41;
		@Pc(45) int local45;
		if (arg7 + local25 > 104) {
			local41 = arg7;
			local45 = arg7 + 1;
		} else {
			local41 = (local25 >> 1) + arg7;
			local45 = (local25 + 1 >> 1) + arg7;
		}
		@Pc(73) int local73;
		@Pc(81) int local81;
		if (local22 + arg6 <= 104) {
			local73 = arg6 + (local22 >> 1);
			local81 = (local22 + 1 >> 1) + arg6;
		} else {
			local73 = arg6;
			local81 = arg6 + 1;
		}
		@Pc(93) int[][] local93 = Static24.anIntArrayArrayArray4[arg2];
		@Pc(119) int local119 = local93[local81][local45] + local93[local73][local45] + local93[local73][local41] + local93[local81][local41] >> 2;
		@Pc(128) int local128 = (arg6 << 7) + (local22 << 6);
		@Pc(140) int local140 = (arg1 << 14) + arg6 + (arg7 << 7) + 1073741824;
		@Pc(148) int local148 = (arg7 << 7) + (local25 << 6);
		@Pc(154) int local154 = arg8 + (arg4 << 6);
		if (local11.anInt454 == 1) {
			local154 += 256;
		}
		if (local11.anInt414 == 0) {
			local140 += Integer.MIN_VALUE;
		}
		@Pc(190) Class8_Sub1_Sub1 local190;
		if (arg8 == 22) {
			if (local11.anInt438 == -1 && local11.anIntArray56 == null) {
				local190 = local11.method259(arg4, 22, local93, local148, local119, local128);
			} else {
				local190 = new Class8_Sub1_Sub1_Sub1(arg1, 22, arg4, arg2, arg6, arg7, local11.anInt438, true, null);
			}
			arg3.method1392(arg0, arg6, arg7, local119, local190, local140, local154);
			if (local11.anInt424 == 1) {
				arg5.method1023(arg6, arg7);
			}
		} else if (arg8 == 10 || arg8 == 11) {
			if (local11.anInt438 == -1 && local11.anIntArray56 == null) {
				local190 = local11.method259(arg4, 10, local93, local148, local119, local128);
			} else {
				local190 = new Class8_Sub1_Sub1_Sub1(arg1, 10, arg4, arg2, arg6, arg7, local11.anInt438, true, null);
			}
			if (local190 != null) {
				arg3.method1396(arg0, arg6, arg7, local119, local22, local25, local190, arg8 == 11 ? 256 : 0, local140, local154);
			}
			if (local11.anInt424 != 0) {
				arg5.method1027(local22, local25, arg7, arg6, local11.aBoolean22);
			}
		} else if (arg8 >= 12) {
			if (local11.anInt438 == -1 && local11.anIntArray56 == null) {
				local190 = local11.method259(arg4, arg8, local93, local148, local119, local128);
			} else {
				local190 = new Class8_Sub1_Sub1_Sub1(arg1, arg8, arg4, arg2, arg6, arg7, local11.anInt438, true, null);
			}
			arg3.method1396(arg0, arg6, arg7, local119, 1, 1, local190, 0, local140, local154);
			if (local11.anInt424 != 0) {
				arg5.method1027(local22, local25, arg7, arg6, local11.aBoolean22);
			}
		} else if (arg8 == 0) {
			if (local11.anInt438 == -1 && local11.anIntArray56 == null) {
				local190 = local11.method259(arg4, 0, local93, local148, local119, local128);
			} else {
				local190 = new Class8_Sub1_Sub1_Sub1(arg1, 0, arg4, arg2, arg6, arg7, local11.anInt438, true, null);
			}
			arg3.method1410(arg0, arg6, arg7, local119, local190, null, Static18.anIntArray63[arg4], 0, local140, local154);
			if (local11.anInt424 != 0) {
				arg5.method1017(local11.aBoolean22, arg4, arg7, arg6, arg8);
			}
		} else if (arg8 == 1) {
			if (local11.anInt438 == -1 && local11.anIntArray56 == null) {
				local190 = local11.method259(arg4, 1, local93, local148, local119, local128);
			} else {
				local190 = new Class8_Sub1_Sub1_Sub1(arg1, 1, arg4, arg2, arg6, arg7, local11.anInt438, true, null);
			}
			arg3.method1410(arg0, arg6, arg7, local119, local190, null, Static14.anIntArray51[arg4], 0, local140, local154);
			if (local11.anInt424 != 0) {
				arg5.method1017(local11.aBoolean22, arg4, arg7, arg6, arg8);
			}
		} else {
			@Pc(545) Class8_Sub1_Sub1 local545;
			@Pc(508) int local508;
			if (arg8 == 2) {
				local508 = arg4 + 1 & 0x3;
				@Pc(531) Class8_Sub1_Sub1 local531;
				if (local11.anInt438 == -1 && local11.anIntArray56 == null) {
					local531 = local11.method259(arg4 + 4, 2, local93, local148, local119, local128);
					local545 = local11.method259(local508, 2, local93, local148, local119, local128);
				} else {
					local531 = new Class8_Sub1_Sub1_Sub1(arg1, 2, arg4 + 4, arg2, arg6, arg7, local11.anInt438, true, null);
					local545 = new Class8_Sub1_Sub1_Sub1(arg1, 2, local508, arg2, arg6, arg7, local11.anInt438, true, null);
				}
				arg3.method1410(arg0, arg6, arg7, local119, local531, local545, Static18.anIntArray63[arg4], Static18.anIntArray63[local508], local140, local154);
				if (local11.anInt424 != 0) {
					arg5.method1017(local11.aBoolean22, arg4, arg7, arg6, arg8);
				}
			} else if (arg8 == 3) {
				if (local11.anInt438 == -1 && local11.anIntArray56 == null) {
					local190 = local11.method259(arg4, 3, local93, local148, local119, local128);
				} else {
					local190 = new Class8_Sub1_Sub1_Sub1(arg1, 3, arg4, arg2, arg6, arg7, local11.anInt438, true, null);
				}
				arg3.method1410(arg0, arg6, arg7, local119, local190, null, Static14.anIntArray51[arg4], 0, local140, local154);
				if (local11.anInt424 != 0) {
					arg5.method1017(local11.aBoolean22, arg4, arg7, arg6, arg8);
				}
			} else if (arg8 == 9) {
				if (local11.anInt438 == -1 && local11.anIntArray56 == null) {
					local190 = local11.method259(arg4, arg8, local93, local148, local119, local128);
				} else {
					local190 = new Class8_Sub1_Sub1_Sub1(arg1, arg8, arg4, arg2, arg6, arg7, local11.anInt438, true, null);
				}
				arg3.method1396(arg0, arg6, arg7, local119, 1, 1, local190, 0, local140, local154);
				if (local11.anInt424 != 0) {
					arg5.method1027(local22, local25, arg7, arg6, local11.aBoolean22);
				}
			} else if (arg8 == 4) {
				if (local11.anInt438 == -1 && local11.anIntArray56 == null) {
					local190 = local11.method259(arg4, 4, local93, local148, local119, local128);
				} else {
					local190 = new Class8_Sub1_Sub1_Sub1(arg1, 4, arg4, arg2, arg6, arg7, local11.anInt438, true, null);
				}
				arg3.method1414(arg0, arg6, arg7, local119, local190, null, Static18.anIntArray63[arg4], 0, 0, 0, local140, local154);
			} else {
				@Pc(797) int local797;
				if (arg8 == 5) {
					local797 = arg3.method1397(arg0, arg6, arg7);
					local508 = 16;
					if (local797 != 0) {
						local508 = Static50.method752(local797 >> 14 & 0x7FFF).anInt448;
					}
					if (local11.anInt438 == -1 && local11.anIntArray56 == null) {
						local545 = local11.method259(arg4, 4, local93, local148, local119, local128);
					} else {
						local545 = new Class8_Sub1_Sub1_Sub1(arg1, 4, arg4, arg2, arg6, arg7, local11.anInt438, true, null);
					}
					arg3.method1414(arg0, arg6, arg7, local119, local545, null, Static18.anIntArray63[arg4], 0, Static79.anIntArray241[arg4] * local508, local508 * Static44.anIntArray144[arg4], local140, local154);
				} else if (arg8 == 6) {
					local508 = 8;
					local797 = arg3.method1397(arg0, arg6, arg7);
					if (local797 != 0) {
						local508 = Static50.method752(local797 >> 14 & 0x7FFF).anInt448 / 2;
					}
					if (local11.anInt438 == -1 && local11.anIntArray56 == null) {
						local545 = local11.method259(arg4 + 4, 4, local93, local148, local119, local128);
					} else {
						local545 = new Class8_Sub1_Sub1_Sub1(arg1, 4, arg4 + 4, arg2, arg6, arg7, local11.anInt438, true, null);
					}
					arg3.method1414(arg0, arg6, arg7, local119, local545, null, 256, arg4, Static109.anIntArray338[arg4] * local508, local508 * Static107.anIntArray334[arg4], local140, local154);
				} else if (arg8 == 7) {
					local797 = arg4 + 2 & 0x3;
					if (local11.anInt438 == -1 && local11.anIntArray56 == null) {
						local190 = local11.method259(local797 + 4, 4, local93, local148, local119, local128);
					} else {
						local190 = new Class8_Sub1_Sub1_Sub1(arg1, 4, local797 + 4, arg2, arg6, arg7, local11.anInt438, true, null);
					}
					arg3.method1414(arg0, arg6, arg7, local119, local190, null, 256, local797, 0, 0, local140, local154);
				} else if (arg8 == 8) {
					local508 = 8;
					@Pc(1030) int local1030 = arg4 + 2 & 0x3;
					local797 = arg3.method1397(arg0, arg6, arg7);
					if (local797 != 0) {
						local508 = Static50.method752(local797 >> 14 & 0x7FFF).anInt448 / 2;
					}
					@Pc(1084) Class8_Sub1_Sub1 local1084;
					if (local11.anInt438 == -1 && local11.anIntArray56 == null) {
						local545 = local11.method259(arg4 + 4, 4, local93, local148, local119, local128);
						local1084 = local11.method259(local1030 + 4, 4, local93, local148, local119, local128);
					} else {
						local545 = new Class8_Sub1_Sub1_Sub1(arg1, 4, arg4 + 4, arg2, arg6, arg7, local11.anInt438, true, null);
						local1084 = new Class8_Sub1_Sub1_Sub1(arg1, 4, local1030 + 4, arg2, arg6, arg7, local11.anInt438, true, null);
					}
					arg3.method1414(arg0, arg6, arg7, local119, local545, local1084, 256, arg4, local508 * Static109.anIntArray338[arg4], Static107.anIntArray334[arg4] * local508, local140, local154);
				}
			}
		}
	}
}
