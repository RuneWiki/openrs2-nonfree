import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!h", name = "T", descriptor = "Lclient!kh;")
	public static Class60 aClass60_546 = Static200.method3116("mapfunction");

	@OriginalMember(owner = "client!h", name = "V", descriptor = "Lclient!kh;")
	public static Class60 aClass60_547 = Static200.method3116("zap");

	@OriginalMember(owner = "client!h", name = "cb", descriptor = "I")
	public static volatile int anInt1745 = 0;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)Lclient!pc;")
	public static Class1_Sub2 method1278(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub2_Sub29();
		} else if (arg0 == 1) {
			return new Class1_Sub2_Sub18();
		} else if (arg0 == 2) {
			return new Class1_Sub2_Sub16();
		} else if (arg0 == 3) {
			return new Class1_Sub2_Sub23();
		} else if (arg0 == 4) {
			return new Class1_Sub2_Sub38();
		} else if (arg0 == 5) {
			return new Class1_Sub2_Sub9();
		} else if (arg0 == 6) {
			return new Class1_Sub2_Sub14();
		} else if (arg0 == 7) {
			return new Class1_Sub2_Sub22();
		} else if (arg0 == 8) {
			return new Class1_Sub2_Sub25();
		} else if (arg0 == 9) {
			return new Class1_Sub2_Sub24();
		} else if (arg0 == 10) {
			return new Class1_Sub2_Sub8();
		} else if (arg0 == 11) {
			return new Class1_Sub2_Sub17();
		} else if (arg0 == 12) {
			return new Class1_Sub2_Sub13();
		} else if (arg0 == 13) {
			return new Class1_Sub2_Sub33();
		} else if (arg0 == 14) {
			return new Class1_Sub2_Sub7();
		} else if (arg0 == 15) {
			return new Class1_Sub2_Sub34();
		} else if (arg0 == 16) {
			return new Class1_Sub2_Sub1();
		} else if (arg0 == 17) {
			return new Class1_Sub2_Sub30();
		} else if (arg0 == 18) {
			return new Class1_Sub2_Sub19_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub2_Sub20();
		} else if (arg0 == 20) {
			return new Class1_Sub2_Sub3();
		} else if (arg0 == 21) {
			return new Class1_Sub2_Sub2();
		} else if (arg0 == 22) {
			return new Class1_Sub2_Sub35();
		} else if (arg0 == 23) {
			return new Class1_Sub2_Sub5();
		} else if (arg0 == 24) {
			return new Class1_Sub2_Sub21();
		} else if (arg0 == 25) {
			return new Class1_Sub2_Sub36();
		} else if (arg0 == 26) {
			return new Class1_Sub2_Sub31();
		} else if (arg0 == 27) {
			return new Class1_Sub2_Sub27();
		} else if (arg0 == 28) {
			return new Class1_Sub2_Sub15();
		} else if (arg0 == 29) {
			return new Class1_Sub2_Sub28();
		} else if (arg0 == 30) {
			return new Class1_Sub2_Sub39();
		} else if (arg0 == 31) {
			return new Class1_Sub2_Sub6();
		} else if (arg0 == 32) {
			return new Class1_Sub2_Sub11();
		} else if (arg0 == 33) {
			return new Class1_Sub2_Sub26();
		} else if (arg0 == 34) {
			return new Class1_Sub2_Sub32();
		} else if (arg0 == 35) {
			return new Class1_Sub2_Sub12();
		} else if (arg0 == 36) {
			return new Class1_Sub2_Sub10();
		} else if (arg0 == 37) {
			return new Class1_Sub2_Sub37();
		} else if (arg0 == 38) {
			return new Class1_Sub2_Sub4();
		} else if (arg0 == 39) {
			return new Class1_Sub2_Sub19();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII)V")
	public static void method1281(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static134.anInt2900 == arg3 && arg1 == Static36.anInt3891 && (Static204.anInt4327 == arg4 || !Static148.aBoolean266)) {
			return;
		}
		Static36.anInt3891 = arg1;
		Static204.anInt4327 = arg4;
		if (!Static148.aBoolean266) {
			Static204.anInt4327 = 0;
		}
		Static134.anInt2900 = arg3;
		Static85.method1486(25);
		Static199.method3114(Static56.aClass60_449, true);
		@Pc(49) int local49 = Static163.anInt3587;
		Static163.anInt3587 = (arg1 - 6) * 8;
		@Pc(57) int local57 = Static128.anInt2813;
		@Pc(62) int local62 = Static163.anInt3587 - local49;
		Static128.anInt2813 = (arg3 - 6) * 8;
		@Pc(75) int local75 = Static128.anInt2813 - local57;
		for (@Pc(79) int local79 = 0; local79 < 32768; local79++) {
			@Pc(85) Class9_Sub4_Sub2 local85 = Static1.aClass9_Sub4_Sub2Array1[local79];
			if (local85 != null) {
				for (@Pc(89) int local89 = 0; local89 < 10; local89++) {
					local85.anIntArray510[local89] -= local75;
					local85.anIntArray511[local89] -= local62;
				}
				local85.anInt3903 -= local62 * 128;
				local85.anInt3925 -= local75 * 128;
			}
		}
		for (@Pc(133) int local133 = 0; local133 < 2048; local133++) {
			@Pc(139) Class9_Sub4_Sub1 local139 = Static41.aClass9_Sub4_Sub1Array2[local133];
			if (local139 != null) {
				for (@Pc(143) int local143 = 0; local143 < 10; local143++) {
					local139.anIntArray510[local143] -= local75;
					local139.anIntArray511[local143] -= local62;
				}
				local139.anInt3903 -= local62 * 128;
				local139.anInt3925 -= local75 * 128;
			}
		}
		Static180.anInt3841 = arg4;
		Static84.aClass9_Sub4_Sub1_2.method2909(arg0, arg2, false);
		@Pc(197) byte local197 = 0;
		@Pc(199) byte local199 = 104;
		@Pc(201) byte local201 = 104;
		@Pc(203) byte local203 = 0;
		@Pc(205) byte local205 = 1;
		@Pc(207) byte local207 = 1;
		if (local75 < 0) {
			local197 = 103;
			local199 = -1;
			local207 = -1;
		}
		if (local62 < 0) {
			local203 = 103;
			local201 = -1;
			local205 = -1;
		}
		for (@Pc(228) int local228 = local197; local228 != local199; local228 += local207) {
			for (@Pc(232) int local232 = local203; local232 != local201; local232 += local205) {
				@Pc(238) int local238 = local62 + local232;
				@Pc(242) int local242 = local75 + local228;
				for (@Pc(244) int local244 = 0; local244 < 4; local244++) {
					if (local242 >= 0 && local238 >= 0 && local242 < 104 && local238 < 104) {
						Static128.aClass19ArrayArrayArray1[local244][local228][local232] = Static128.aClass19ArrayArrayArray1[local244][local242][local238];
					} else {
						Static128.aClass19ArrayArrayArray1[local244][local228][local232] = null;
					}
				}
			}
		}
		for (@Pc(310) Class1_Sub21 local310 = (Class1_Sub21) Static129.aClass19_7.method609(); local310 != null; local310 = (Class1_Sub21) Static129.aClass19_7.method615()) {
			local310.anInt3155 -= local75;
			local310.anInt3148 -= local62;
			if (local310.anInt3155 < 0 || local310.anInt3148 < 0 || local310.anInt3155 >= 104 || local310.anInt3148 >= 104) {
				local310.method3530();
			}
		}
		Static144.aBoolean179 = false;
		if (Static56.anInt1484 != 0) {
			Static56.anInt1484 -= local75;
			Static170.anInt3695 -= local62;
		}
		Static196.anInt4181 = 0;
		Static179.anInt4185 = -1;
		Static107.aClass19_10.method619();
		Static153.aClass19_14.method619();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZIIIIIIIIII)Z")
	public static boolean method1282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static6.anIntArrayArray4[local3][local7] = 0;
				Static42.anIntArrayArray17[local3][local7] = 99999999;
			}
		}
		Static6.anIntArrayArray4[arg5][arg1] = 99;
		local7 = arg5;
		Static42.anIntArrayArray17[arg5][arg1] = 0;
		@Pc(49) byte local49 = 0;
		@Pc(51) int local51 = arg1;
		Static22.anIntArray88[0] = arg5;
		@Pc(63) int local63 = local49 + 1;
		Static214.anIntArray615[0] = arg1;
		@Pc(67) int local67 = 0;
		@Pc(72) int[][] local72 = Static153.aClass3Array1[Static180.anInt3841].anIntArrayArray1;
		@Pc(74) boolean local74 = false;
		@Pc(197) int local197;
		@Pc(237) int local237;
		label367: while (local63 != local67) {
			local7 = Static22.anIntArray88[local67];
			local51 = Static214.anIntArray615[local67];
			local67 = local67 + 1 & 0xFFF;
			if (arg0 == local7 && arg8 == local51) {
				local74 = true;
				break;
			}
			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && Static153.aClass3Array1[Static180.anInt3841].method37(arg8, arg4, local51, arg7 - 1, local7, arg11, arg0)) {
					local74 = true;
					break;
				}
				if (arg7 < 10 && Static153.aClass3Array1[Static180.anInt3841].method53(local7, arg11, arg7 - 1, arg8, local51, arg4, arg0)) {
					local74 = true;
					break;
				}
			}
			if (arg6 != 0 && arg3 != 0 && Static153.aClass3Array1[Static180.anInt3841].method48(arg3, arg11, arg8, local51, arg0, arg9, arg6, local7)) {
				local74 = true;
				break;
			}
			local197 = Static42.anIntArrayArray17[local7][local51] + 1;
			if (local7 > 0 && Static6.anIntArrayArray4[local7 - 1][local51] == 0 && (local72[local7 - 1][local51] & 0x12C010E) == 0 && (local72[local7 - 1][local51 + arg11 - 1] & 0x12C0138) == 0) {
				local237 = 1;
				while (true) {
					if (arg11 - 1 <= local237) {
						Static22.anIntArray88[local63] = local7 - 1;
						Static214.anIntArray615[local63] = local51;
						Static6.anIntArrayArray4[local7 - 1][local51] = 2;
						local63 = local63 + 1 & 0xFFF;
						Static42.anIntArrayArray17[local7 - 1][local51] = local197;
						break;
					}
					if ((local72[local7 - 1][local51 + local237] & 0x12C013E) != 0) {
						break;
					}
					local237++;
				}
			}
			if (local7 < 102 && Static6.anIntArrayArray4[local7 + 1][local51] == 0 && (local72[arg11 + local7][local51] & 0x12C0183) == 0 && (local72[arg11 + local7][arg11 + local51 - 1] & 0x12C01E0) == 0) {
				local237 = 1;
				while (true) {
					if (arg11 - 1 <= local237) {
						Static22.anIntArray88[local63] = local7 + 1;
						Static214.anIntArray615[local63] = local51;
						Static6.anIntArrayArray4[local7 + 1][local51] = 8;
						Static42.anIntArrayArray17[local7 + 1][local51] = local197;
						local63 = local63 + 1 & 0xFFF;
						break;
					}
					if ((local72[arg11 + local7][local237 + local51] & 0x12C01E3) != 0) {
						break;
					}
					local237++;
				}
			}
			if (local51 > 0 && Static6.anIntArrayArray4[local7][local51 - 1] == 0 && (local72[local7][local51 - 1] & 0x12C010E) == 0 && (local72[local7 + arg11 - 1][local51 - 1] & 0x12C0183) == 0) {
				local237 = 1;
				while (true) {
					if (local237 >= arg11 - 1) {
						Static22.anIntArray88[local63] = local7;
						Static214.anIntArray615[local63] = local51 - 1;
						local63 = local63 + 1 & 0xFFF;
						Static6.anIntArrayArray4[local7][local51 - 1] = 1;
						Static42.anIntArrayArray17[local7][local51 - 1] = local197;
						break;
					}
					if ((local72[local237 + local7][local51 - 1] & 0x12C018F) != 0) {
						break;
					}
					local237++;
				}
			}
			if (local51 < 102 && Static6.anIntArrayArray4[local7][local51 + 1] == 0 && (local72[local7][local51 + arg11] & 0x12C0138) == 0 && (local72[local7 + arg11 - 1][arg11 + local51] & 0x12C01E0) == 0) {
				local237 = 1;
				while (true) {
					if (arg11 - 1 <= local237) {
						Static22.anIntArray88[local63] = local7;
						Static214.anIntArray615[local63] = local51 + 1;
						local63 = local63 + 1 & 0xFFF;
						Static6.anIntArrayArray4[local7][local51 + 1] = 4;
						Static42.anIntArrayArray17[local7][local51 + 1] = local197;
						break;
					}
					if ((local72[local7 + local237][arg11 + local51] & 0x12C01F8) != 0) {
						break;
					}
					local237++;
				}
			}
			if (local7 > 0 && local51 > 0 && Static6.anIntArrayArray4[local7 - 1][local51 - 1] == 0 && (local72[local7 - 1][local51 + arg11 - 1 - 1] & 0x12C0138) == 0 && (local72[local7 - 1][local51 - 1] & 0x12C010E) == 0 && (local72[local7 + arg11 - 1 - 1][local51 - 1] & 0x12C0183) == 0) {
				local237 = 1;
				while (true) {
					if (arg11 - 1 <= local237) {
						Static22.anIntArray88[local63] = local7 - 1;
						Static214.anIntArray615[local63] = local51 - 1;
						Static6.anIntArrayArray4[local7 - 1][local51 - 1] = 3;
						local63 = local63 + 1 & 0xFFF;
						Static42.anIntArrayArray17[local7 - 1][local51 - 1] = local197;
						break;
					}
					if ((local72[local7 - 1][local51 + local237 - 1] & 0x12C013E) != 0 || (local72[local7 + local237 - 1][local51 - 1] & 0x12C018F) != 0) {
						break;
					}
					local237++;
				}
			}
			if (local7 < 102 && local51 > 0 && Static6.anIntArrayArray4[local7 + 1][local51 - 1] == 0 && (local72[local7 + 1][local51 - 1] & 0x12C010E) == 0 && (local72[arg11 + local7][local51 - 1] & 0x12C0183) == 0 && (local72[arg11 + local7][arg11 + local51 - 2] & 0x12C01E0) == 0) {
				local237 = 1;
				while (true) {
					if (local237 >= arg11 - 1) {
						Static22.anIntArray88[local63] = local7 + 1;
						Static214.anIntArray615[local63] = local51 - 1;
						Static6.anIntArrayArray4[local7 + 1][local51 - 1] = 9;
						local63 = local63 + 1 & 0xFFF;
						Static42.anIntArrayArray17[local7 + 1][local51 - 1] = local197;
						break;
					}
					if ((local72[local7 + arg11][local237 + local51 - 1] & 0x12C01E3) != 0 || (local72[local7 + local237 + 1][local51 - 1] & 0x12C018F) != 0) {
						break;
					}
					local237++;
				}
			}
			if (local7 > 0 && local51 < 102 && Static6.anIntArrayArray4[local7 - 1][local51 + 1] == 0 && (local72[local7 - 1][local51 + 1] & 0x12C010E) == 0 && (local72[local7 - 1][local51 + arg11] & 0x12C0138) == 0 && (local72[local7][local51 + arg11] & 0x12C01E0) == 0) {
				local237 = 1;
				while (true) {
					if (arg11 - 1 <= local237) {
						Static22.anIntArray88[local63] = local7 - 1;
						Static214.anIntArray615[local63] = local51 + 1;
						local63 = local63 + 1 & 0xFFF;
						Static6.anIntArrayArray4[local7 - 1][local51 + 1] = 6;
						Static42.anIntArrayArray17[local7 - 1][local51 + 1] = local197;
						break;
					}
					if ((local72[local7 - 1][local237 + local51 + 1] & 0x12C013E) != 0 || (local72[local7 + local237 - 1][arg11 + local51] & 0x12C01F8) != 0) {
						break;
					}
					local237++;
				}
			}
			if (local7 < 102 && local51 < 102 && Static6.anIntArrayArray4[local7 + 1][local51 + 1] == 0 && (local72[local7 + 1][local51 + arg11] & 0x12C0138) == 0 && (local72[arg11 + local7][arg11 + local51] & 0x12C01E0) == 0 && (local72[local7 + arg11][local51 + 1] & 0x12C0183) == 0) {
				for (local237 = 1; local237 < arg11 - 1; local237++) {
					if ((local72[local7 + local237 + 1][arg11 + local51] & 0x12C01F8) != 0 || (local72[local7 + arg11][local237 + local51 + 1] & 0x12C01E3) != 0) {
						continue label367;
					}
				}
				Static22.anIntArray88[local63] = local7 + 1;
				Static214.anIntArray615[local63] = local51 + 1;
				local63 = local63 + 1 & 0xFFF;
				Static6.anIntArrayArray4[local7 + 1][local51 + 1] = 12;
				Static42.anIntArrayArray17[local7 + 1][local51 + 1] = local197;
			}
		}
		Static193.anInt4130 = 0;
		if (!local74) {
			if (!arg2) {
				return false;
			}
			local197 = 1000;
			local237 = 100;
			for (@Pc(1198) int local1198 = arg0 - 10; local1198 <= arg0 + 10; local1198++) {
				for (@Pc(1205) int local1205 = arg8 - 10; local1205 <= arg8 + 10; local1205++) {
					if (local1198 >= 0 && local1205 >= 0 && local1198 < 104 && local1205 < 104 && Static42.anIntArrayArray17[local1198][local1205] < 100) {
						@Pc(1234) int local1234 = 0;
						if (arg0 > local1198) {
							local1234 = arg0 - local1198;
						} else if (arg6 + arg0 - 1 < local1198) {
							local1234 = local1198 + 1 - arg6 - arg0;
						}
						@Pc(1267) int local1267 = 0;
						if (arg8 > local1205) {
							local1267 = arg8 - local1205;
						} else if (local1205 > arg8 + arg3 - 1) {
							local1267 = local1205 + 1 - arg8 - arg3;
						}
						@Pc(1310) int local1310 = local1267 * local1267 + local1234 * local1234;
						if (local197 > local1310 || local1310 == local197 && local237 > Static42.anIntArrayArray17[local1198][local1205]) {
							local237 = Static42.anIntArrayArray17[local1198][local1205];
							local51 = local1205;
							local197 = local1310;
							local7 = local1198;
						}
					}
				}
			}
			if (local197 == 1000) {
				return false;
			}
			if (arg5 == local7 && local51 == arg1) {
				return false;
			}
			Static193.anInt4130 = 1;
		}
		@Pc(1382) byte local1382 = 0;
		Static22.anIntArray88[0] = local7;
		local67 = local1382 + 1;
		Static214.anIntArray615[0] = local51;
		local197 = local237 = Static6.anIntArrayArray4[local7][local51];
		while (arg5 != local7 || local51 != arg1) {
			if (local237 != local197) {
				local237 = local197;
				Static22.anIntArray88[local67] = local7;
				Static214.anIntArray615[local67++] = local51;
			}
			if ((local197 & 0x2) != 0) {
				local7++;
			} else if ((local197 & 0x8) != 0) {
				local7--;
			}
			if ((local197 & 0x1) != 0) {
				local51++;
			} else if ((local197 & 0x4) != 0) {
				local51--;
			}
			local197 = Static6.anIntArrayArray4[local7][local51];
		}
		if (local67 > 0) {
			Static94.method1625(arg10, Static214.anIntArray615, local67, Static22.anIntArray88);
			return true;
		} else if (arg10 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
