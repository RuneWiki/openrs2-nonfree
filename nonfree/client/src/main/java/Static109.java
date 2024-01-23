import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!i", name = "M", descriptor = "I")
	public static int anInt2414;

	@OriginalMember(owner = "client!i", name = "bb", descriptor = "[I")
	public static int[] anIntArray240;

	@OriginalMember(owner = "client!i", name = "J", descriptor = "I")
	public static volatile int anInt2412 = 0;

	@OriginalMember(owner = "client!i", name = "K", descriptor = "I")
	public static int anInt2413 = -1;

	@OriginalMember(owner = "client!i", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString142 = "yellow:";

	@OriginalMember(owner = "client!i", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString143 = "Checking for updates - ";

	@OriginalMember(owner = "client!i", name = "Z", descriptor = "Z")
	public static boolean aBoolean152 = false;

	@OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
	public static int anInt2425 = 0;

	@OriginalMember(owner = "client!i", name = "eb", descriptor = "[I")
	public static int[] anIntArray241 = new int[14];

	@OriginalMember(owner = "client!i", name = "fb", descriptor = "Ljava/lang/String;")
	public static String aString145 = "Loading sprites - ";

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
	public static void method1793() {
		@Pc(9) int local9 = Static82.anInt1930 * 128 + 64;
		@Pc(15) int local15 = Static206.anInt4454 * 128 + 64;
		@Pc(25) int local25 = Static93.method1576(local15, local9, Static185.anInt4085) - Static232.anInt4886;
		if (Static211.anInt4570 >= 100) {
			Static94.anInt2161 = Static206.anInt4454 * 128 + 64;
			Static58.anInt1269 = Static82.anInt1930 * 128 + 64;
			Static315.anInt6297 = Static93.method1576(Static94.anInt2161, Static58.anInt1269, Static185.anInt4085) - Static232.anInt4886;
		} else {
			if (local25 > Static315.anInt6297) {
				Static315.anInt6297 += (local25 - Static315.anInt6297) * Static211.anInt4570 / 1000 + Static130.anInt2879;
				if (local25 < Static315.anInt6297) {
					Static315.anInt6297 = local25;
				}
			}
			if (local15 > Static94.anInt2161) {
				Static94.anInt2161 += Static211.anInt4570 * (local15 - Static94.anInt2161) / 1000 + Static130.anInt2879;
				if (Static94.anInt2161 > local15) {
					Static94.anInt2161 = local15;
				}
			}
			if (Static58.anInt1269 < local9) {
				Static58.anInt1269 += Static130.anInt2879 + Static211.anInt4570 * (local9 - Static58.anInt1269) / 1000;
				if (local9 < Static58.anInt1269) {
					Static58.anInt1269 = local9;
				}
			}
			if (local9 < Static58.anInt1269) {
				Static58.anInt1269 -= (Static58.anInt1269 - local9) * Static211.anInt4570 / 1000 + Static130.anInt2879;
				if (local9 > Static58.anInt1269) {
					Static58.anInt1269 = local9;
				}
			}
			if (Static315.anInt6297 > local25) {
				Static315.anInt6297 -= Static211.anInt4570 * (Static315.anInt6297 - local25) / 1000 + Static130.anInt2879;
				if (Static315.anInt6297 < local25) {
					Static315.anInt6297 = local25;
				}
			}
			if (Static94.anInt2161 > local15) {
				Static94.anInt2161 -= Static211.anInt4570 * (Static94.anInt2161 - local15) / 1000 + Static130.anInt2879;
				if (local15 > Static94.anInt2161) {
					Static94.anInt2161 = local15;
				}
			}
		}
		local15 = Static222.anInt4708 * 128 + 64;
		local9 = Static49.anInt1170 * 128 + 64;
		local25 = Static93.method1576(local15, local9, Static185.anInt4085) - Static100.anInt2282;
		@Pc(240) int local240 = local15 - Static94.anInt2161;
		@Pc(245) int local245 = local25 - Static315.anInt6297;
		@Pc(250) int local250 = local9 - Static58.anInt1269;
		@Pc(261) int local261 = (int) Math.sqrt((double) (local250 * local250 + local240 * local240));
		@Pc(272) int local272 = (int) (Math.atan2((double) local245, (double) local261) * 325.949D) & 0x7FF;
		if (local272 < 128) {
			local272 = 128;
		}
		if (local272 > 383) {
			local272 = 383;
		}
		@Pc(297) int local297 = (int) (-325.949D * Math.atan2((double) local250, (double) local240)) & 0x7FF;
		@Pc(302) int local302 = local297 - Static120.anInt6251;
		if (local302 > 1024) {
			local302 -= 2048;
		}
		if (Static44.anInt1071 < local272) {
			Static44.anInt1071 += Static121.anInt2627 * (local272 - Static44.anInt1071) / 1000 + Static186.anInt4094;
			if (local272 < Static44.anInt1071) {
				Static44.anInt1071 = local272;
			}
		}
		if (local272 < Static44.anInt1071) {
			Static44.anInt1071 -= Static186.anInt4094 + Static121.anInt2627 * (Static44.anInt1071 - local272) / 1000;
			if (Static44.anInt1071 < local272) {
				Static44.anInt1071 = local272;
			}
		}
		if (local302 < -1024) {
			local302 += 2048;
		}
		if (local302 > 0) {
			Static120.anInt6251 += Static121.anInt2627 * local302 / 1000 + Static186.anInt4094;
			Static120.anInt6251 &= 0x7FF;
		}
		if (local302 < 0) {
			Static120.anInt6251 -= -local302 * Static121.anInt2627 / 1000 + Static186.anInt4094;
			Static120.anInt6251 &= 0x7FF;
		}
		@Pc(407) int local407 = local297 - Static120.anInt6251;
		if (local407 > 1024) {
			local407 -= 2048;
		}
		if (local407 < -1024) {
			local407 += 2048;
		}
		if (local407 < 0 && local302 > 0 || local407 > 0 && local302 < 0) {
			Static120.anInt6251 = local297;
		}
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V")
	public static void method1795() {
		Static2.aClass1_Sub14_Sub1_1.method2252(148);
		Static2.aClass1_Sub14_Sub1_1.method2208(Static241.anInt5007);
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(III)V")
	public static void method1797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static207.anInt4464 = arg0 - Static268.anInt2655;
		Static202.anInt4408 = Static268.anInt2656 + Static268.anInt2659 - arg1 - 1;
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(B)V")
	public static void method1798() {
		Static166.aClass89_23.method2265();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIBI)V")
	public static void method1799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub7 local8 = (Class1_Sub7) Static111.aClass186_7.method4570((long) arg3);
		if (local8 == null) {
			local8 = new Class1_Sub7();
			Static111.aClass186_7.method4575((long) arg3, local8);
		}
		if (arg0 >= local8.anIntArray164.length) {
			@Pc(38) int[] local38 = new int[arg0 + 1];
			@Pc(43) int[] local43 = new int[arg0 + 1];
			@Pc(45) int local45;
			for (local45 = 0; local45 < local8.anIntArray164.length; local45++) {
				local43[local45] = local8.anIntArray164[local45];
				local38[local45] = local8.anIntArray165[local45];
			}
			for (local45 = local8.anIntArray164.length; local45 < arg0; local45++) {
				local43[local45] = -1;
				local38[local45] = 0;
			}
			local8.anIntArray165 = local38;
			local8.anIntArray164 = local43;
		}
		local8.anIntArray164[arg0] = arg1;
		local8.anIntArray165[arg0] = arg2;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)V")
	public static void method1800(@OriginalArg(1) int arg0) {
		@Pc(9) Class1_Sub3_Sub22 local9 = Static271.method4108(4, arg0);
		local9.method4464();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method1802(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		@Pc(14) long local14 = Static270.method4100(arg0, arg2 + 0, arg4);
		@Pc(26) int local26;
		@Pc(33) int local33;
		@Pc(40) int local40;
		@Pc(44) Class92 local44;
		@Pc(63) int local63;
		@Pc(73) int[] local73;
		@Pc(90) int local90;
		if (local14 != 0L) {
			local26 = (int) local14 >> 20 & 0x3;
			local33 = (int) local14 >> 14 & 0x1F;
			local40 = Integer.MAX_VALUE & (int) (local14 >>> 32);
			local44 = Static166.method2725(local40);
			if (local44.anInt3197 == -1) {
				local63 = arg3;
				if (local14 > 0L) {
					local63 = arg1;
				}
				local73 = Static231.anIntArray448;
				local90 = arg2 * 4 + (-arg4 + 103) * 512 * 4 + 24624;
				if (local33 == 0 || local33 == 2) {
					if (local26 == 0) {
						local73[local90] = local63;
						local73[local90 + 512] = local63;
						local73[local90 + 1024] = local63;
						local73[local90 + 1536] = local63;
					} else if (local26 == 1) {
						local73[local90] = local63;
						local73[local90 + 1] = local63;
						local73[local90 + 2] = local63;
						local73[local90 + 3] = local63;
					} else if (local26 == 2) {
						local73[local90 + 3] = local63;
						local73[local90 + 512 + 3] = local63;
						local73[local90 + 1024 + 3] = local63;
						local73[local90 + 1536 + 3] = local63;
					} else if (local26 == 3) {
						local73[local90 + 1536] = local63;
						local73[local90 + 1 + 1536] = local63;
						local73[local90 + 1536 + 2] = local63;
						local73[local90 + 1539] = local63;
					}
				}
				if (local33 == 3) {
					if (local26 == 0) {
						local73[local90] = local63;
					} else if (local26 == 1) {
						local73[local90 + 3] = local63;
					} else if (local26 == 2) {
						local73[local90 + 1539] = local63;
					} else if (local26 == 3) {
						local73[local90 + 1536] = local63;
					}
				}
				if (local33 == 2) {
					if (local26 == 3) {
						local73[local90] = local63;
						local73[local90 + 512] = local63;
						local73[local90 + 1024] = local63;
						local73[local90 + 1536] = local63;
					} else if (local26 == 0) {
						local73[local90] = local63;
						local73[local90 + 1] = local63;
						local73[local90 + 2] = local63;
						local73[local90 + 3] = local63;
					} else if (local26 == 1) {
						local73[local90 + 3] = local63;
						local73[local90 + 512 + 3] = local63;
						local73[local90 + 1024 + 3] = local63;
						local73[local90 + 3 + 1536] = local63;
					} else if (local26 == 2) {
						local73[local90 + 1536] = local63;
						local73[local90 + 1537] = local63;
						local73[local90 + 2 + 1536] = local63;
						local73[local90 + 3 + 1536] = local63;
					}
				}
			} else if (!Static48.method956(arg4, arg2, local26, local44)) {
				return false;
			}
		}
		local14 = Static228.method3616(arg0, arg2 + 0, arg4);
		if (local14 != 0L) {
			local26 = (int) local14 >> 20 & 0x3;
			local40 = (int) (local14 >>> 32) & Integer.MAX_VALUE;
			local33 = (int) local14 >> 14 & 0x1F;
			local44 = Static166.method2725(local40);
			if (local44.anInt3197 == -1) {
				if (local33 == 9) {
					local63 = 15658734;
					if (local14 > 0L) {
						local63 = 15597568;
					}
					local73 = Static231.anIntArray448;
					local90 = arg2 * 4 + (103 - arg4) * 512 * 4 + 24624;
					if (local26 == 0 || local26 == 2) {
						local73[local90 + 1536] = local63;
						local73[local90 + 1024 + 1] = local63;
						local73[local90 + 2 + 512] = local63;
						local73[local90 + 3] = local63;
					} else {
						local73[local90] = local63;
						local73[local90 + 513] = local63;
						local73[local90 + 1026] = local63;
						local73[local90 + 3 + 1536] = local63;
					}
				}
			} else if (!Static48.method956(arg4, arg2, local26, local44)) {
				return false;
			}
		}
		local14 = Static163.method2577(arg0, arg2 + 0, arg4);
		if (local14 != 0L) {
			local26 = (int) local14 >> 20 & 0x3;
			local33 = Integer.MAX_VALUE & (int) (local14 >>> 32);
			@Pc(588) Class92 local588 = Static166.method2725(local33);
			if (local588.anInt3197 != -1 && !Static48.method956(arg4, arg2, local26, local588)) {
				return false;
			}
		}
		return true;
	}
}
