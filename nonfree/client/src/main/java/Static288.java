import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "[I")
	public static int[] anIntArray677;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString186 = "Members object";

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(JB)V")
	public static void method4403(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static150.anInt2784; local14++) {
			if (arg0 == Static65.aLongArray5[local14]) {
				Static150.anInt2784--;
				for (@Pc(34) int local34 = local14; local34 < Static150.anInt2784; local34++) {
					Static65.aLongArray5[local34] = Static65.aLongArray5[local34 + 1];
					Static259.aStringArray29[local34] = Static259.aStringArray29[local34 + 1];
					Static74.aBooleanArray7[local34] = Static74.aBooleanArray7[local34 + 1];
				}
				Static145.anInt2688 = Static56.anInt1175;
				Static270.aClass1_Sub18_Sub1_3.method3130(87);
				Static270.aClass1_Sub18_Sub1_3.method3091(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII[I)V")
	public static void method4405(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg2--;
		@Pc(9) int local9 = arg1 - 1;
		@Pc(13) int local13 = local9 - 7;
		while (local13 > arg2) {
			@Pc(22) int local22 = arg2 + 1;
			arg3[local22] = arg0;
			@Pc(27) int local27 = local22 + 1;
			arg3[local27] = arg0;
			@Pc(32) int local32 = local27 + 1;
			arg3[local32] = arg0;
			@Pc(37) int local37 = local32 + 1;
			arg3[local37] = arg0;
			@Pc(42) int local42 = local37 + 1;
			arg3[local42] = arg0;
			@Pc(47) int local47 = local42 + 1;
			arg3[local47] = arg0;
			@Pc(52) int local52 = local47 + 1;
			arg3[local52] = arg0;
			arg2 = local52 + 1;
			arg3[arg2] = arg0;
		}
		while (local9 > arg2) {
			arg2++;
			arg3[arg2] = arg0;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZIZI)V")
	public static void method4406(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(3) int local3;
		@Pc(12) Class6_Sub6_Sub1 local12;
		@Pc(110) int local110;
		@Pc(126) int local126;
		@Pc(132) int local132;
		@Pc(156) int local156;
		@Pc(165) int local165;
		@Pc(174) int local174;
		for (local3 = 0; local3 < Static293.anInt5831; local3++) {
			local12 = Static211.aClass6_Sub6_Sub1Array2[Static75.anIntArray178[local3]];
			if (local12 != null && local12.method3514() && local12.aClass19_1.method494()) {
				@Pc(28) int local28 = local12.method3509();
				if (arg0) {
					if (!local12.aClass19_1.aBoolean60) {
						continue;
					}
				} else if (local12.aClass19_1.aBoolean63 != arg2 || arg1 != 0 && local28 != arg1) {
					continue;
				}
				@Pc(120) int local120;
				if (local28 == 1) {
					if ((local12.anInt4562 & 0x7F) == 64 && (local12.anInt4569 & 0x7F) == 64) {
						local120 = local12.anInt4562 >> 7;
						local110 = local12.anInt4569 >> 7;
						if (local120 >= 0 && local120 < 104 && local110 >= 0 && local110 < 104) {
							local174 = Static232.anIntArrayArray39[local120][local110]++;
						}
					}
				} else if (((local28 & 0x1) != 0 || (local12.anInt4562 & 0x7F) == 0 && (local12.anInt4569 & 0x7F) == 0) && ((local28 & 0x1) != 1 || (local12.anInt4562 & 0x7F) == 64 && (local12.anInt4569 & 0x7F) == 64)) {
					local110 = local12.anInt4569 - local28 * 64 >> 7;
					local120 = local12.anInt4562 - local28 * 64 >> 7;
					local126 = local120 + local12.method3509();
					local132 = local12.method3509() + local110;
					if (local126 > 104) {
						local126 = 104;
					}
					if (local110 < 0) {
						local110 = 0;
					}
					if (local132 > 104) {
						local132 = 104;
					}
					if (local120 < 0) {
						local120 = 0;
					}
					for (local156 = local120; local156 < local126; local156++) {
						for (local165 = local110; local165 < local132; local165++) {
							local174 = Static232.anIntArrayArray39[local156][local165]++;
						}
					}
				}
			}
		}
		label216: for (local3 = 0; local3 < Static293.anInt5831; local3++) {
			local12 = Static211.aClass6_Sub6_Sub1Array2[Static75.anIntArray178[local3]];
			@Pc(258) long local258 = (long) Static75.anIntArray178[local3] << 32 | 0x20000000L;
			if (local12 != null && local12.method3514() && local12.aClass19_1.method494()) {
				local110 = local12.method3509();
				if (arg0) {
					if (!local12.aClass19_1.aBoolean60) {
						continue;
					}
				} else if (arg2 != local12.aClass19_1.aBoolean63 || arg1 != 0 && local110 != arg1) {
					continue;
				}
				local12.aBoolean339 = true;
				if (local110 == 1) {
					if ((local12.anInt4562 & 0x7F) == 64 && (local12.anInt4569 & 0x7F) == 64) {
						local126 = local12.anInt4562 >> 7;
						local132 = local12.anInt4569 >> 7;
						if (local126 < 0 || local126 >= 104 || local132 < 0 || local132 >= 104) {
							continue;
						}
						if (Static232.anIntArrayArray39[local126][local132] > 1) {
							local174 = Static232.anIntArrayArray39[local126][local132]--;
							continue;
						}
					}
				} else if ((local110 & 0x1) == 0 && (local12.anInt4562 & 0x7F) == 0 && (local12.anInt4569 & 0x7F) == 0 || (local110 & 0x1) == 1 && (local12.anInt4562 & 0x7F) == 64 && (local12.anInt4569 & 0x7F) == 64) {
					local126 = local12.anInt4562 - local110 * 64 >> 7;
					local132 = local12.anInt4569 - local110 * 64 >> 7;
					local156 = local126 + local110;
					if (local156 > 104) {
						local156 = 104;
					}
					if (local126 < 0) {
						local126 = 0;
					}
					@Pc(389) boolean local389 = true;
					local165 = local132 + local110;
					if (local165 > 104) {
						local165 = 104;
					}
					if (local132 < 0) {
						local132 = 0;
					}
					@Pc(407) int local407;
					@Pc(412) int local412;
					for (local407 = local126; local407 < local156; local407++) {
						for (local412 = local132; local412 < local165; local412++) {
							if (Static232.anIntArrayArray39[local407][local412] <= 1) {
								local389 = false;
								break;
							}
						}
					}
					if (local389) {
						local407 = local126;
						while (true) {
							if (local407 >= local156) {
								continue label216;
							}
							for (local412 = local132; local412 < local165; local412++) {
								local174 = Static232.anIntArrayArray39[local407][local412]--;
							}
							local407++;
						}
					}
				}
				local12.aBoolean339 = false;
				if (!local12.aClass19_1.aBoolean58) {
					local258 |= Long.MIN_VALUE;
				}
				local12.anInt4533 = Static124.method1919(Static159.anInt2978, local12.anInt4562, local12.anInt4569);
				Static279.method4292(Static159.anInt2978, local12.anInt4562, local12.anInt4569, local12.anInt4533, local110 * 64 + 60 - 64, local12, local12.anInt4511, local258, local12.aBoolean340);
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Lclient!o;")
	public static Class1_Sub1 method4407(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub1_Sub26();
		} else if (arg0 == 1) {
			return new Class1_Sub1_Sub20();
		} else if (arg0 == 2) {
			return new Class1_Sub1_Sub22();
		} else if (arg0 == 3) {
			return new Class1_Sub1_Sub21();
		} else if (arg0 == 4) {
			return new Class1_Sub1_Sub13();
		} else if (arg0 == 5) {
			return new Class1_Sub1_Sub18();
		} else if (arg0 == 6) {
			return new Class1_Sub1_Sub37();
		} else if (arg0 == 7) {
			return new Class1_Sub1_Sub30();
		} else if (arg0 == 8) {
			return new Class1_Sub1_Sub24();
		} else if (arg0 == 9) {
			return new Class1_Sub1_Sub23();
		} else if (arg0 == 10) {
			return new Class1_Sub1_Sub33();
		} else if (arg0 == 11) {
			return new Class1_Sub1_Sub15();
		} else if (arg0 == 12) {
			return new Class1_Sub1_Sub14();
		} else if (arg0 == 13) {
			return new Class1_Sub1_Sub35();
		} else if (arg0 == 14) {
			return new Class1_Sub1_Sub4();
		} else if (arg0 == 15) {
			return new Class1_Sub1_Sub6();
		} else if (arg0 == 16) {
			return new Class1_Sub1_Sub31();
		} else if (arg0 == 17) {
			return new Class1_Sub1_Sub16();
		} else if (arg0 == 18) {
			return new Class1_Sub1_Sub7_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub1_Sub25();
		} else if (arg0 == 20) {
			return new Class1_Sub1_Sub19();
		} else if (arg0 == 21) {
			return new Class1_Sub1_Sub3();
		} else if (arg0 == 22) {
			return new Class1_Sub1_Sub8();
		} else if (arg0 == 23) {
			return new Class1_Sub1_Sub28();
		} else if (arg0 == 24) {
			return new Class1_Sub1_Sub38();
		} else if (arg0 == 25) {
			return new Class1_Sub1_Sub34();
		} else if (arg0 == 26) {
			return new Class1_Sub1_Sub32();
		} else if (arg0 == 27) {
			return new Class1_Sub1_Sub17();
		} else if (arg0 == 28) {
			return new Class1_Sub1_Sub11();
		} else if (arg0 == 29) {
			return new Class1_Sub1_Sub12();
		} else if (arg0 == 30) {
			return new Class1_Sub1_Sub36();
		} else if (arg0 == 31) {
			return new Class1_Sub1_Sub2();
		} else if (arg0 == 32) {
			return new Class1_Sub1_Sub5();
		} else if (arg0 == 33) {
			return new Class1_Sub1_Sub29();
		} else if (arg0 == 34) {
			return new Class1_Sub1_Sub9();
		} else if (arg0 == 35) {
			return new Class1_Sub1_Sub27();
		} else if (arg0 == 36) {
			return new Class1_Sub1_Sub1();
		} else if (arg0 == 37) {
			return new Class1_Sub1_Sub39();
		} else if (arg0 == 38) {
			return new Class1_Sub1_Sub10();
		} else if (arg0 == 39) {
			return new Class1_Sub1_Sub7();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4408(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static245.anInt1237 <= arg6 && arg4 <= Static28.anInt606 && Static24.anInt556 <= arg1 && Static284.anInt5643 >= arg5) {
			Static162.method2492(arg2, arg3, arg1, arg0, arg6, arg5, arg4);
		} else {
			Static30.method493(arg3, arg4, arg6, arg5, arg2, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!rf;I)V")
	public static void method4409(@OriginalArg(0) Class6_Sub6 arg0) {
		if (Static261.anInt5259 == arg0.anInt4559 || arg0.anInt4572 == -1 || arg0.anInt4506 != 0 || arg0.anInt4516 + 1 > Static262.method4031(arg0.anInt4572).anIntArray460[arg0.anInt4570]) {
			@Pc(37) int local37 = arg0.anInt4559 - arg0.anInt4515;
			@Pc(43) int local43 = Static261.anInt5259 - arg0.anInt4515;
			@Pc(55) int local55 = arg0.anInt4553 * 128 + arg0.method3509() * 64;
			@Pc(69) int local69 = arg0.anInt4537 * 128 + arg0.method3509() * 64;
			@Pc(80) int local80 = arg0.anInt4566 * 128 + arg0.method3509() * 64;
			@Pc(92) int local92 = arg0.anInt4501 * 128 + arg0.method3509() * 64;
			arg0.anInt4569 = (local43 * local92 + local69 * (local37 - local43)) / local37;
			arg0.anInt4562 = ((local37 - local43) * local55 + local43 * local80) / local37;
		}
		arg0.anInt4551 = 0;
		if (arg0.anInt4524 == 0) {
			arg0.anInt4579 = 1024;
		}
		if (arg0.anInt4524 == 1) {
			arg0.anInt4579 = 1536;
		}
		if (arg0.anInt4524 == 2) {
			arg0.anInt4579 = 0;
		}
		if (arg0.anInt4524 == 3) {
			arg0.anInt4579 = 512;
		}
		arg0.anInt4511 = arg0.anInt4579;
	}
}
