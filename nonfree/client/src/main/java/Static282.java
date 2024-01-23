import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!uh", name = "S", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray44;

	@OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
	public static int anInt5659;

	@OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
	public static int anInt5661;

	@OriginalMember(owner = "client!uh", name = "L", descriptor = "Z")
	public static boolean aBoolean355 = true;

	@OriginalMember(owner = "client!uh", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString400 = "Drop";

	@OriginalMember(owner = "client!uh", name = "R", descriptor = "[I")
	public static int[] anIntArray511 = new int[14];

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZI[B[Lclient!ic;IIBIII)V")
	public static void method4293(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) Class75[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(18) Class1_Sub14 local18 = new Class1_Sub14(arg3);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method2221();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(34) int local34 = 0;
			while (true) {
				@Pc(38) int local38 = local18.method2187();
				if (local38 == 0) {
					break;
				}
				local34 += local38 - 1;
				@Pc(57) int local57 = local34 >> 6 & 0x3F;
				@Pc(61) int local61 = local34 >> 12;
				@Pc(65) int local65 = local34 & 0x3F;
				@Pc(69) int local69 = local18.method2199();
				@Pc(73) int local73 = local69 >> 2;
				@Pc(77) int local77 = local69 & 0x3;
				if (arg8 == local61 && local57 >= arg0 && arg0 + 8 > local57 && local65 >= arg2 && local65 < arg2 + 8) {
					@Pc(104) Class92 local104 = Static166.method2725(local20);
					@Pc(122) int local122 = arg9 + Static14.method361(local65 & 0x7, local57 & 0x7, local104.anInt3227, local77, arg5, local104.anInt3182);
					@Pc(140) int local140 = arg6 + Static183.method2970(arg5, local104.anInt3182, local65 & 0x7, local77, local104.anInt3227, local57 & 0x7);
					if (local122 > 0 && local140 > 0 && local122 < 103 && local140 < 103) {
						@Pc(161) Class75 local161 = null;
						if (!arg1) {
							@Pc(165) int local165 = arg7;
							if ((Static303.aByteArrayArrayArray19[1][local122][local140] & 0x2) == 2) {
								local165 = arg7 - 1;
							}
							if (local165 >= 0) {
								local161 = arg4[local165];
							}
						}
						Static247.method3808(local20, arg1, arg7, local73, arg5 + local77 & 0x3, arg7, local140, local122, !arg1, local161);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ug;I)V")
	public static void method4295(@OriginalArg(0) Class2_Sub4 arg0) {
		@Pc(9) Class91 local9 = arg0.method2095();
		arg0.anInt2820 = local9.anInt3138;
		if (arg0.anInt2787 == 0) {
			arg0.anInt2842 = 0;
			return;
		}
		if (arg0.anInt2822 != -1 && arg0.anInt2830 == 0) {
			@Pc(37) Class32 local37 = Static202.method3231(arg0.anInt2822);
			if (arg0.anInt2778 > 0 && local37.anInt963 == 0) {
				arg0.anInt2842++;
				return;
			}
			if (arg0.anInt2778 <= 0 && local37.anInt973 == 0) {
				arg0.anInt2842++;
				return;
			}
		}
		if (arg0.anInt2825 != -1 && arg0.anInt2786 <= Static133.anInt3061) {
			@Pc(86) Class94 local86 = Static28.method611(arg0.anInt2825);
			if (local86.aBoolean220 && local86.anInt3368 != -1) {
				@Pc(100) Class32 local100 = Static202.method3231(local86.anInt3368);
				if (arg0.anInt2778 > 0 && local100.anInt963 == 0) {
					arg0.anInt2842++;
					return;
				}
				if (arg0.anInt2778 <= 0 && local100.anInt973 == 0) {
					arg0.anInt2842++;
					return;
				}
			}
		}
		@Pc(137) int local137 = arg0.anInt2794;
		@Pc(140) int local140 = arg0.anInt2846;
		@Pc(156) int local156 = arg0.anIntArray283[arg0.anInt2787 - 1] * 128 + arg0.method2088() * 64;
		@Pc(173) int local173 = arg0.anIntArray286[arg0.anInt2787 - 1] * 128 + arg0.method2088() * 64;
		if (local156 - local140 > 256 || local156 - local140 < -256 || local173 - local137 > 256 || local173 - local137 < -256) {
			arg0.anInt2846 = local156;
			arg0.anInt2794 = local173;
			return;
		}
		if (local140 >= local156) {
			if (local140 <= local156) {
				if (local173 > local137) {
					arg0.anInt2823 = 1024;
				} else if (local173 < local137) {
					arg0.anInt2823 = 0;
				}
			} else if (local137 < local173) {
				arg0.anInt2823 = 768;
			} else if (local137 > local173) {
				arg0.anInt2823 = 256;
			} else {
				arg0.anInt2823 = 512;
			}
		} else if (local173 > local137) {
			arg0.anInt2823 = 1280;
		} else if (local137 > local173) {
			arg0.anInt2823 = 1792;
		} else {
			arg0.anInt2823 = 1536;
		}
		@Pc(298) int local298 = local9.anInt3141;
		@Pc(307) int local307 = arg0.anInt2823 - arg0.anInt2766 & 0x7FF;
		@Pc(309) boolean local309 = true;
		if (local307 > 1024) {
			local307 -= 2048;
		}
		@Pc(317) int local317 = 4;
		if (local307 >= -256 && local307 <= 256) {
			local298 = local9.anInt3128;
		} else if (local307 >= 256 && local307 < 768) {
			local298 = local9.anInt3157;
		} else if (local307 >= -768 && local307 <= -256) {
			local298 = local9.anInt3150;
		}
		if (local298 == -1) {
			local298 = local9.anInt3128;
		}
		arg0.anInt2820 = local298;
		if (arg0 instanceof Class2_Sub4_Sub1) {
			local309 = ((Class2_Sub4_Sub1) arg0).aClass145_1.aBoolean303;
		}
		if (local309) {
			if (arg0.anInt2766 != arg0.anInt2823 && arg0.anInt2838 == -1 && arg0.anInt2797 != 0) {
				local317 = 2;
			}
			if (arg0.anInt2787 > 2) {
				local317 = 6;
			}
			if (arg0.anInt2787 > 3) {
				local317 = 8;
			}
			if (arg0.anInt2842 > 0 && arg0.anInt2787 > 1) {
				arg0.anInt2842--;
				local317 = 8;
			}
		} else {
			if (arg0.anInt2787 > 1) {
				local317 = 6;
			}
			if (arg0.anInt2787 > 2) {
				local317 = 8;
			}
			if (arg0.anInt2842 > 0 && arg0.anInt2787 > 1) {
				local317 = 8;
				arg0.anInt2842--;
			}
		}
		@Pc(465) byte local465 = 1;
		if (arg0.aByteArray53[arg0.anInt2787 - 1] == 2) {
			local317 <<= 0x1;
			local465 = 2;
		} else if (arg0.aByteArray53[arg0.anInt2787 - 1] == 0) {
			local465 = 0;
			local317 >>= 0x1;
		}
		if (local317 < 8 || local9.anInt3125 == -1) {
			if (local9.anInt3134 != -1 && local465 == 0) {
				if (arg0.anInt2820 == local9.anInt3141 && local9.anInt3131 != -1) {
					arg0.anInt2820 = local9.anInt3131;
				} else if (local9.anInt3150 == arg0.anInt2820 && local9.anInt3148 != -1) {
					arg0.anInt2820 = local9.anInt3148;
				} else if (arg0.anInt2820 == local9.anInt3157 && local9.anInt3147 != -1) {
					arg0.anInt2820 = local9.anInt3147;
				} else {
					arg0.anInt2820 = local9.anInt3134;
				}
			}
		} else if (local9.anInt3141 == arg0.anInt2820 && local9.anInt3130 != -1) {
			arg0.anInt2820 = local9.anInt3130;
		} else if (local9.anInt3150 == arg0.anInt2820 && local9.anInt3155 != -1) {
			arg0.anInt2820 = local9.anInt3155;
		} else if (arg0.anInt2820 == local9.anInt3157 && local9.anInt3132 != -1) {
			arg0.anInt2820 = local9.anInt3132;
		} else {
			arg0.anInt2820 = local9.anInt3125;
		}
		if (local9.anInt3120 != -1) {
			local317 <<= 0x7;
			if (arg0.anInt2787 == 1) {
				@Pc(692) int local692 = arg0.anInt2770 * arg0.anInt2770;
				@Pc(709) int local709 = (arg0.anInt2846 <= local156 ? local156 - arg0.anInt2846 : arg0.anInt2846 - local156) << 7;
				@Pc(729) int local729 = (local173 < arg0.anInt2794 ? arg0.anInt2794 - local173 : local173 - arg0.anInt2794) << 7;
				@Pc(740) int local740 = local709 <= local729 ? local729 : local709;
				@Pc(747) int local747 = local9.anInt3120 * 2 * local740;
				if (local747 < local692) {
					arg0.anInt2770 /= 2;
				} else if (local692 / 2 > local740) {
					arg0.anInt2770 -= local9.anInt3120;
					if (arg0.anInt2770 < 0) {
						arg0.anInt2770 = 0;
					}
				} else if (arg0.anInt2770 < local317) {
					arg0.anInt2770 += local9.anInt3120;
					if (arg0.anInt2770 > local317) {
						arg0.anInt2770 = local317;
					}
				}
			} else if (local317 > arg0.anInt2770) {
				arg0.anInt2770 += local9.anInt3120;
				if (local317 < arg0.anInt2770) {
					arg0.anInt2770 = local317;
				}
			} else if (arg0.anInt2770 > 0) {
				arg0.anInt2770 -= local9.anInt3120;
				if (arg0.anInt2770 < 0) {
					arg0.anInt2770 = 0;
				}
			}
			local317 = arg0.anInt2770 >> 7;
			if (local317 < 1) {
				local317 = 1;
			}
		}
		if (local137 < local173) {
			arg0.anInt2794 += local317;
			if (arg0.anInt2794 > local173) {
				arg0.anInt2794 = local173;
			}
		} else if (local173 < local137) {
			arg0.anInt2794 -= local317;
			if (arg0.anInt2794 < local173) {
				arg0.anInt2794 = local173;
			}
		}
		if (local156 > local140) {
			arg0.anInt2846 += local317;
			if (local156 < arg0.anInt2846) {
				arg0.anInt2846 = local156;
			}
		} else if (local156 < local140) {
			arg0.anInt2846 -= local317;
			if (local156 > arg0.anInt2846) {
				arg0.anInt2846 = local156;
			}
		}
		if (local156 == arg0.anInt2846 && arg0.anInt2794 == local173) {
			arg0.anInt2787--;
			if (arg0.anInt2778 > 0) {
				arg0.anInt2778--;
			}
		}
	}
}
