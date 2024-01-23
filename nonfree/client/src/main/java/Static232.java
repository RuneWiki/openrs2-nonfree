import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ua", name = "T", descriptor = "Lclient!hc;")
	public static Class51 aClass51_77;

	@OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
	public static int anInt5102;

	@OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
	public static int anInt5088 = -1;

	@OriginalMember(owner = "client!ua", name = "R", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!ua", name = "cb", descriptor = "[I")
	public static int[] anIntArray437 = new int[32];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIZILclient!gj;)V")
	public static void method3865(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class49 arg4) {
		if (Static139.anInt5524 >= 50 || (arg4.anIntArrayArray17 == null || arg3 >= arg4.anIntArrayArray17.length || arg4.anIntArrayArray17[arg3] == null)) {
			return;
		}
		@Pc(30) int local30 = arg4.anIntArrayArray17[arg3][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(51) int local51;
		if (arg4.anIntArrayArray17[arg3].length > 1) {
			local51 = (int) (Math.random() * (double) arg4.anIntArrayArray17[arg3].length);
			if (local51 > 0) {
				local34 = arg4.anIntArrayArray17[arg3][local51];
			}
		}
		@Pc(64) int local64 = local30 & 0x1F;
		@Pc(70) int local70 = local30 >> 5 & 0x7;
		if (local64 == 0) {
			if (arg2) {
				Static3.method40(local70, 0, local34, 255);
			}
		} else if (Static47.anInt1385 != 0) {
			Static222.anIntArray427[Static139.anInt5524] = local34;
			Static11.anIntArray44[Static139.anInt5524] = local70;
			Static52.anIntArray111[Static139.anInt5524] = 0;
			local51 = (arg1 - 64) / 128;
			@Pc(111) int local111 = (arg0 - 64) / 128;
			Static185.aClass76Array1[Static139.anInt5524] = null;
			Static5.anIntArray6[Static139.anInt5524] = 255;
			Static207.anIntArray350[Static139.anInt5524] = (local111 << 8) + ((local51 << 16) + local64);
			Static139.anInt5524++;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(3) int local3 = 0; local3 < Static254.aClass151_2.anInt5555; local3++) {
			if (Static254.aClass151_2.method4224(local3)) {
				@Pc(36) int[] local36 = Static122.aClass1_Sub2_Sub11_2.method2860(Static254.aClass151_2.anIntArray470[local3] >> 28 & 0x3, Static254.aClass151_2.anIntArray470[local3] & 0x3FFF, Static254.aClass151_2.anIntArray470[local3] >> 14 & 0x3FFF);
				if (local36 != null) {
					@Pc(44) int local44 = local36[1] - Static209.anInt4574;
					@Pc(54) int local54 = Static46.anInt1376 + Static174.anInt3997 - local36[2] - 1;
					@Pc(72) int local72 = arg4 + (arg1 - arg4) * (-arg2 + local44) / (arg6 - arg2);
					@Pc(87) int local87 = arg0 + (arg7 - arg0) * (local54 - arg3) / (arg5 - arg3);
					@Pc(92) int local92 = Static254.aClass151_2.method4218(local3);
					@Pc(94) Class103 local94 = null;
					@Pc(96) int local96 = 16777215;
					if (local92 == 0) {
						if ((double) Static57.aFloat12 == 3.0D) {
							local94 = Static57.aClass103_2;
						}
						if ((double) Static57.aFloat12 == 4.0D) {
							local94 = Static251.aClass103_8;
						}
						if ((double) Static57.aFloat12 == 6.0D) {
							local94 = Static84.aClass103_4;
						}
						if ((double) Static57.aFloat12 >= 8.0D) {
							local94 = Static240.aClass103_7;
						}
					}
					if (local92 == 1) {
						if ((double) Static57.aFloat12 == 3.0D) {
							local94 = Static84.aClass103_4;
						}
						if ((double) Static57.aFloat12 == 4.0D) {
							local94 = Static240.aClass103_7;
						}
						if ((double) Static57.aFloat12 == 6.0D) {
							local94 = Static125.aClass103_5;
						}
						if ((double) Static57.aFloat12 >= 8.0D) {
							local94 = Static221.aClass103_6;
						}
					}
					if (local92 == 2) {
						local96 = 16755200;
						if ((double) Static57.aFloat12 == 3.0D) {
							local94 = Static125.aClass103_5;
						}
						if ((double) Static57.aFloat12 == 4.0D) {
							local94 = Static221.aClass103_6;
						}
						if ((double) Static57.aFloat12 == 6.0D) {
							local94 = Static77.aClass103_3;
						}
						if ((double) Static57.aFloat12 >= 8.0D) {
							local94 = Static28.aClass103_1;
						}
					}
					if (Static254.aClass151_2.anIntArray471[local3] != -1) {
						local96 = Static254.aClass151_2.anIntArray471[local3];
					}
					if (local94 != null) {
						@Pc(213) int local213 = Static244.aClass1_Sub2_Sub7_3.method1926(Static254.aClass151_2.aStringArray39[local3], null, Static260.aStringArray19);
						local87 -= (local213 - 1) * local94.method3019() / 2;
						local87 += local94.method3025() / 2;
						for (@Pc(233) int local233 = 0; local233 < local213; local233++) {
							@Pc(239) String local239 = Static260.aStringArray19[local233];
							if (local213 - 1 > local233) {
								local239 = local239.substring(0, local239.length() - 4);
							}
							local94.method3026(local239, local72, local87, local96);
							local87 += local94.method3019();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIILclient!tb;I)V")
	public static void method3869(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub28 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt4858 == -1 && arg3.anIntArray426 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(22) int local22 = arg3.anInt4867 * Static47.anInt1385 >> 8;
		if (arg1 > arg3.anInt4857) {
			local15 = arg1 - arg3.anInt4857;
		} else if (arg3.anInt4863 > arg1) {
			local15 = arg3.anInt4863 - arg1;
		}
		if (arg3.anInt4865 < arg0) {
			local15 += arg0 - arg3.anInt4865;
		} else if (arg3.anInt4856 > arg0) {
			local15 += arg3.anInt4856 - arg0;
		}
		if (arg3.anInt4870 == 0 || local15 - 64 > arg3.anInt4870 || Static47.anInt1385 == 0 || arg4 != arg3.anInt4869) {
			if (arg3.aClass1_Sub4_Sub3_2 != null) {
				Static24.aClass1_Sub4_Sub4_1.method3081(arg3.aClass1_Sub4_Sub3_2);
				arg3.aClass1_Sub4_Sub3_2 = null;
			}
			if (arg3.aClass1_Sub4_Sub3_3 != null) {
				Static24.aClass1_Sub4_Sub4_1.method3081(arg3.aClass1_Sub4_Sub3_3);
				arg3.aClass1_Sub4_Sub3_3 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(142) int local142 = local22 * (arg3.anInt4870 - local15) / arg3.anInt4870;
		if (arg3.aClass1_Sub4_Sub3_2 != null) {
			arg3.aClass1_Sub4_Sub3_2.method1421(local142);
		} else if (arg3.anInt4858 >= 0) {
			@Pc(163) Class76 local163 = Static273.method2416(Static146.aClass51_48, arg3.anInt4858, 0);
			if (local163 != null) {
				@Pc(170) Class1_Sub7_Sub1 local170 = local163.method2415().method1067(Static13.aClass46_1);
				@Pc(175) Class1_Sub4_Sub3 local175 = Static269.method1408(local170, local142);
				local175.method1422(-1);
				Static24.aClass1_Sub4_Sub4_1.method3080(local175);
				arg3.aClass1_Sub4_Sub3_2 = local175;
			}
		}
		if (arg3.aClass1_Sub4_Sub3_3 != null) {
			arg3.aClass1_Sub4_Sub3_3.method1421(local142);
			if (!arg3.aClass1_Sub4_Sub3_3.method4187()) {
				arg3.aClass1_Sub4_Sub3_3 = null;
			}
		} else if (arg3.anIntArray426 != null && (arg3.anInt4859 -= arg2) <= 0) {
			@Pc(219) int local219 = (int) ((double) arg3.anIntArray426.length * Math.random());
			@Pc(227) Class76 local227 = Static273.method2416(Static146.aClass51_48, arg3.anIntArray426[local219], 0);
			if (local227 != null) {
				@Pc(234) Class1_Sub7_Sub1 local234 = local227.method2415().method1067(Static13.aClass46_1);
				@Pc(239) Class1_Sub4_Sub3 local239 = Static269.method1408(local234, local142);
				local239.method1422(0);
				Static24.aClass1_Sub4_Sub4_1.method3080(local239);
				arg3.aClass1_Sub4_Sub3_3 = local239;
				arg3.anInt4859 = arg3.anInt4855 + (int) (Math.random() * (double) (arg3.anInt4868 - arg3.anInt4855));
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "(I)V")
	public static void method3870() {
		if (Static154.aClass78_5 != null) {
			@Pc(16) Class78 local16 = Static154.aClass78_5;
			synchronized (Static154.aClass78_5) {
				Static154.aClass78_5 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
	public static void method3871(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub2_Sub18 local16 = Static13.method232(arg0, 4);
		local16.method3805();
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(IB)I")
	public static int method3872(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
