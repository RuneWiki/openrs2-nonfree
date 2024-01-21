import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "N", descriptor = "Z")
	public static boolean aBoolean5;

	@OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
	public static int anInt82 = 0;

	@OriginalMember(owner = "client!ab", name = "V", descriptor = "Lclient!kb;")
	public static Class46 aClass46_18 = Static65.method1172("<col=ffffff>");

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)Z")
	public static boolean method56(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIILclient!qf;IILclient!og;II)V")
	public static void method57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class69 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class62 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) Class3_Sub2_Sub9 local9 = Static136.method2319(arg7);
		@Pc(23) int local23;
		@Pc(20) int local20;
		if (arg5 == 1 || arg5 == 3) {
			local20 = local9.anInt1795;
			local23 = local9.anInt1825;
		} else {
			local20 = local9.anInt1825;
			local23 = local9.anInt1795;
		}
		@Pc(35) int[][] local35 = Static133.anIntArrayArrayArray8[arg2];
		@Pc(56) int local56;
		@Pc(50) int local50;
		if (local23 + arg3 <= 104) {
			local50 = arg3 + (local23 + 1 >> 1);
			local56 = arg3 + (local23 >> 1);
		} else {
			local56 = arg3;
			local50 = arg3 + 1;
		}
		@Pc(72) int local72 = (local23 << 6) + (arg3 << 7);
		@Pc(84) int local84 = (arg1 << 7) + arg3 + (arg7 << 14) + 1073741824;
		if (local9.anInt1818 == 0) {
			local84 += Integer.MIN_VALUE;
		}
		@Pc(102) int local102 = (arg1 << 7) + (local20 << 6);
		@Pc(110) int local110;
		@Pc(114) int local114;
		if (arg1 + local20 > 104) {
			local110 = arg1;
			local114 = arg1 + 1;
		} else {
			local110 = (local20 >> 1) + arg1;
			local114 = arg1 + (local20 + 1 >> 1);
		}
		@Pc(156) int local156 = local35[local50][local114] + local35[local56][local114] + local35[local50][local110] + local35[local56][local110] >> 2;
		@Pc(163) int local163 = (arg5 << 6) + arg8;
		if (local9.anInt1803 == 1) {
			local163 += 256;
		}
		@Pc(196) Class3_Sub2_Sub1 local196;
		if (arg8 == 22) {
			if (local9.anInt1830 == -1 && local9.anIntArray171 == null) {
				local196 = local9.method1209(local156, local72, local35, 22, local102, arg5);
			} else {
				local196 = new Class3_Sub2_Sub1_Sub5(arg7, 22, arg5, arg2, arg3, arg1, local9.anInt1830, true, null);
			}
			arg6.method1970(arg0, arg3, arg1, local156, local196, local84, local163);
			if (local9.anInt1820 == 1) {
				arg4.method2251(arg3, arg1);
			}
		} else if (arg8 == 10 || arg8 == 11) {
			if (local9.anInt1830 == -1 && local9.anIntArray171 == null) {
				local196 = local9.method1209(local156, local72, local35, 10, local102, arg5);
			} else {
				local196 = new Class3_Sub2_Sub1_Sub5(arg7, 10, arg5, arg2, arg3, arg1, local9.anInt1830, true, null);
			}
			if (local196 != null) {
				arg6.method2014(arg0, arg3, arg1, local156, local23, local20, local196, arg8 == 11 ? 256 : 0, local84, local163);
			}
			if (local9.anInt1820 != 0) {
				arg4.method2257(arg3, local23, arg1, local9.aBoolean69, local20);
			}
		} else if (arg8 >= 12) {
			if (local9.anInt1830 == -1 && local9.anIntArray171 == null) {
				local196 = local9.method1209(local156, local72, local35, arg8, local102, arg5);
			} else {
				local196 = new Class3_Sub2_Sub1_Sub5(arg7, arg8, arg5, arg2, arg3, arg1, local9.anInt1830, true, null);
			}
			arg6.method2014(arg0, arg3, arg1, local156, 1, 1, local196, 0, local84, local163);
			if (local9.anInt1820 != 0) {
				arg4.method2257(arg3, local23, arg1, local9.aBoolean69, local20);
			}
		} else if (arg8 == 0) {
			if (local9.anInt1830 == -1 && local9.anIntArray171 == null) {
				local196 = local9.method1209(local156, local72, local35, 0, local102, arg5);
			} else {
				local196 = new Class3_Sub2_Sub1_Sub5(arg7, 0, arg5, arg2, arg3, arg1, local9.anInt1830, true, null);
			}
			arg6.method2010(arg0, arg3, arg1, local156, local196, null, Static24.anIntArray40[arg5], 0, local84, local163);
			if (local9.anInt1820 != 0) {
				arg4.method2253(arg8, arg1, arg3, arg5, local9.aBoolean69);
			}
		} else if (arg8 == 1) {
			if (local9.anInt1830 == -1 && local9.anIntArray171 == null) {
				local196 = local9.method1209(local156, local72, local35, 1, local102, arg5);
			} else {
				local196 = new Class3_Sub2_Sub1_Sub5(arg7, 1, arg5, arg2, arg3, arg1, local9.anInt1830, true, null);
			}
			arg6.method2010(arg0, arg3, arg1, local156, local196, null, Static36.anIntArray84[arg5], 0, local84, local163);
			if (local9.anInt1820 != 0) {
				arg4.method2253(arg8, arg1, arg3, arg5, local9.aBoolean69);
			}
		} else {
			@Pc(545) Class3_Sub2_Sub1 local545;
			@Pc(506) int local506;
			if (arg8 == 2) {
				local506 = arg5 + 1 & 0x3;
				@Pc(531) Class3_Sub2_Sub1 local531;
				if (local9.anInt1830 == -1 && local9.anIntArray171 == null) {
					local531 = local9.method1209(local156, local72, local35, 2, local102, arg5 + 4);
					local545 = local9.method1209(local156, local72, local35, 2, local102, local506);
				} else {
					local531 = new Class3_Sub2_Sub1_Sub5(arg7, 2, arg5 + 4, arg2, arg3, arg1, local9.anInt1830, true, null);
					local545 = new Class3_Sub2_Sub1_Sub5(arg7, 2, local506, arg2, arg3, arg1, local9.anInt1830, true, null);
				}
				arg6.method2010(arg0, arg3, arg1, local156, local531, local545, Static24.anIntArray40[arg5], Static24.anIntArray40[local506], local84, local163);
				if (local9.anInt1820 != 0) {
					arg4.method2253(arg8, arg1, arg3, arg5, local9.aBoolean69);
				}
			} else if (arg8 == 3) {
				if (local9.anInt1830 == -1 && local9.anIntArray171 == null) {
					local196 = local9.method1209(local156, local72, local35, 3, local102, arg5);
				} else {
					local196 = new Class3_Sub2_Sub1_Sub5(arg7, 3, arg5, arg2, arg3, arg1, local9.anInt1830, true, null);
				}
				arg6.method2010(arg0, arg3, arg1, local156, local196, null, Static36.anIntArray84[arg5], 0, local84, local163);
				if (local9.anInt1820 != 0) {
					arg4.method2253(arg8, arg1, arg3, arg5, local9.aBoolean69);
				}
			} else if (arg8 == 9) {
				if (local9.anInt1830 == -1 && local9.anIntArray171 == null) {
					local196 = local9.method1209(local156, local72, local35, arg8, local102, arg5);
				} else {
					local196 = new Class3_Sub2_Sub1_Sub5(arg7, arg8, arg5, arg2, arg3, arg1, local9.anInt1830, true, null);
				}
				arg6.method2014(arg0, arg3, arg1, local156, 1, 1, local196, 0, local84, local163);
				if (local9.anInt1820 != 0) {
					arg4.method2257(arg3, local23, arg1, local9.aBoolean69, local20);
				}
			} else if (arg8 == 4) {
				if (local9.anInt1830 == -1 && local9.anIntArray171 == null) {
					local196 = local9.method1209(local156, local72, local35, 4, local102, arg5);
				} else {
					local196 = new Class3_Sub2_Sub1_Sub5(arg7, 4, arg5, arg2, arg3, arg1, local9.anInt1830, true, null);
				}
				arg6.method1965(arg0, arg3, arg1, local156, local196, null, Static24.anIntArray40[arg5], 0, 0, 0, local84, local163);
			} else {
				@Pc(806) int local806;
				if (arg8 == 5) {
					local506 = 16;
					local806 = arg6.method2008(arg0, arg3, arg1);
					if (local806 != 0) {
						local506 = Static136.method2319(local806 >> 14 & 0x7FFF).anInt1823;
					}
					if (local9.anInt1830 == -1 && local9.anIntArray171 == null) {
						local545 = local9.method1209(local156, local72, local35, 4, local102, arg5);
					} else {
						local545 = new Class3_Sub2_Sub1_Sub5(arg7, 4, arg5, arg2, arg3, arg1, local9.anInt1830, true, null);
					}
					arg6.method1965(arg0, arg3, arg1, local156, local545, null, Static24.anIntArray40[arg5], 0, Static59.anIntArray151[arg5] * local506, local506 * Static40.anIntArray103[arg5], local84, local163);
				} else if (arg8 == 6) {
					local506 = 8;
					local806 = arg6.method2008(arg0, arg3, arg1);
					if (local806 != 0) {
						local506 = Static136.method2319(local806 >> 14 & 0x7FFF).anInt1823 / 2;
					}
					if (local9.anInt1830 == -1 && local9.anIntArray171 == null) {
						local545 = local9.method1209(local156, local72, local35, 4, local102, arg5 + 4);
					} else {
						local545 = new Class3_Sub2_Sub1_Sub5(arg7, 4, arg5 + 4, arg2, arg3, arg1, local9.anInt1830, true, null);
					}
					arg6.method1965(arg0, arg3, arg1, local156, local545, null, 256, arg5, Static182.anIntArray446[arg5] * local506, Static150.anIntArray392[arg5] * local506, local84, local163);
				} else if (arg8 == 7) {
					local806 = arg5 + 2 & 0x3;
					if (local9.anInt1830 == -1 && local9.anIntArray171 == null) {
						local196 = local9.method1209(local156, local72, local35, 4, local102, local806 + 4);
					} else {
						local196 = new Class3_Sub2_Sub1_Sub5(arg7, 4, local806 + 4, arg2, arg3, arg1, local9.anInt1830, true, null);
					}
					arg6.method1965(arg0, arg3, arg1, local156, local196, null, 256, local806, 0, 0, local84, local163);
				} else if (arg8 == 8) {
					local806 = arg6.method2008(arg0, arg3, arg1);
					local506 = 8;
					@Pc(1045) int local1045 = arg5 + 2 & 0x3;
					if (local806 != 0) {
						local506 = Static136.method2319(local806 >> 14 & 0x7FFF).anInt1823 / 2;
					}
					@Pc(1098) Class3_Sub2_Sub1 local1098;
					if (local9.anInt1830 == -1 && local9.anIntArray171 == null) {
						local545 = local9.method1209(local156, local72, local35, 4, local102, arg5 + 4);
						local1098 = local9.method1209(local156, local72, local35, 4, local102, local1045 + 4);
					} else {
						local545 = new Class3_Sub2_Sub1_Sub5(arg7, 4, arg5 + 4, arg2, arg3, arg1, local9.anInt1830, true, null);
						local1098 = new Class3_Sub2_Sub1_Sub5(arg7, 4, local1045 + 4, arg2, arg3, arg1, local9.anInt1830, true, null);
					}
					arg6.method1965(arg0, arg3, arg1, local156, local545, local1098, 256, arg5, Static182.anIntArray446[arg5] * local506, Static150.anIntArray392[arg5] * local506, local84, local163);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
	public static void method58() {
		aClass46_18 = null;
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
	public static void method59() {
		Static44.aClass57_11.method1715();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!h;IIIIIII)V")
	public static void method60(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static147.aBoolean141) {
			Static61.anInt1647 = 32;
		} else {
			Static61.anInt1647 = 0;
		}
		Static147.aBoolean141 = false;
		@Pc(139) int local139;
		if (Static56.anInt1508 != 0) {
			if (arg4 >= arg1 && arg4 < arg1 + 16 && arg3 >= arg5 && arg3 < arg5 + 16) {
				arg0.anInt1486 -= 4;
				Static142.method2373(arg0);
			} else if (arg4 >= arg1 && arg1 + 16 > arg4 && arg3 >= arg2 + arg5 - 16 && arg5 + arg2 > arg3) {
				arg0.anInt1486 += 4;
				Static142.method2373(arg0);
			} else if (arg4 >= arg1 - Static61.anInt1647 && arg1 + Static61.anInt1647 + 16 > arg4 && arg5 + 16 <= arg3 && arg2 + arg5 - 16 > arg3) {
				local139 = (arg2 - 32) * arg2 / arg6;
				if (local139 < 8) {
					local139 = 8;
				}
				@Pc(156) int local156 = arg3 - arg5 - local139 / 2 - 16;
				@Pc(163) int local163 = arg2 - local139 - 32;
				arg0.anInt1486 = local156 * (arg6 - arg2) / local163;
				Static142.method2373(arg0);
				Static147.aBoolean141 = true;
			}
		}
		if (Static105.anInt2516 == 0) {
			return;
		}
		local139 = arg0.anInt1424;
		if (arg4 >= arg1 - local139 && arg3 >= arg5 && arg1 + 16 > arg4 && arg2 + arg5 >= arg3) {
			arg0.anInt1486 += Static105.anInt2516 * 45;
			Static142.method2373(arg0);
		}
	}
}
