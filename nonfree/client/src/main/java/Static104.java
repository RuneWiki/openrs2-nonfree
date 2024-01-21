import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1420 = Static33.method650("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1421 = Static33.method650("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "J")
	public static volatile long aLong82 = 0L;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1422 = Static33.method650("Benutzen");

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	public static int anInt2594 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!wc;IIIIIIIILclient!d;)V")
	public static void method1740(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class14 arg8) {
		@Pc(13) int local13 = Static22.anIntArrayArrayArray4[arg3][arg5][arg7];
		@Pc(23) int local23 = Static22.anIntArrayArrayArray4[arg3][arg5][arg7 + 1];
		@Pc(33) int local33 = Static22.anIntArrayArrayArray4[arg3][arg5 + 1][arg7];
		@Pc(45) int local45 = Static22.anIntArrayArrayArray4[arg3][arg5 + 1][arg7 + 1];
		@Pc(58) int local58 = (arg7 << 7) + arg5 + (arg2 << 14) + 1073741824;
		@Pc(69) int local69 = local23 + local33 + local13 + local45 >> 2;
		@Pc(73) Class3_Sub1_Sub15 local73 = Static122.method1962(arg2);
		@Pc(94) int local94 = (arg4 << 6) + arg1;
		if (local73.anInt2728 == 0) {
			local58 += Integer.MIN_VALUE;
		}
		if (local73.anInt2722 == 1) {
			local94 += 256;
		}
		@Pc(131) Class3_Sub1_Sub2 local131;
		if (arg1 == 22) {
			if (local73.anInt2742 == -1 && local73.anIntArray259 == null) {
				local131 = local73.method1816(arg4, 22, local13, local23, local45, local33);
			} else {
				local131 = new Class3_Sub1_Sub2_Sub5(arg2, 22, arg4, local13, local33, local45, local23, local73.anInt2742, true, null);
			}
			arg8.method433(arg6, arg5, arg7, local69, local131, local58, local94);
			if (local73.anInt2717 == 1) {
				arg0.method2002(arg7, arg5);
			}
			return;
		}
		@Pc(228) int local228;
		if (arg1 == 10 || arg1 == 11) {
			if (local73.anInt2742 == -1 && local73.anIntArray259 == null) {
				local131 = local73.method1816(arg4, 10, local13, local23, local45, local33);
			} else {
				local131 = new Class3_Sub1_Sub2_Sub5(arg2, 10, arg4, local13, local33, local45, local23, local73.anInt2742, true, null);
			}
			if (local131 != null) {
				@Pc(225) int local225;
				if (arg4 == 1 || arg4 == 3) {
					local225 = local73.anInt2745;
					local228 = local73.anInt2743;
				} else {
					local225 = local73.anInt2743;
					local228 = local73.anInt2745;
				}
				@Pc(238) int local238 = 0;
				if (arg1 == 11) {
					local238 += 256;
				}
				arg8.method425(arg6, arg5, arg7, local69, local228, local225, local131, local238, local58, local94);
			}
			if (local73.anInt2717 != 0) {
				arg0.method2001(arg7, arg4, local73.anInt2743, local73.anInt2745, local73.aBoolean136, arg5);
			}
		} else if (arg1 >= 12) {
			if (local73.anInt2742 == -1 && local73.anIntArray259 == null) {
				local131 = local73.method1816(arg4, arg1, local13, local23, local45, local33);
			} else {
				local131 = new Class3_Sub1_Sub2_Sub5(arg2, arg1, arg4, local13, local33, local45, local23, local73.anInt2742, true, null);
			}
			arg8.method425(arg6, arg5, arg7, local69, 1, 1, local131, 0, local58, local94);
			if (local73.anInt2717 != 0) {
				arg0.method2001(arg7, arg4, local73.anInt2743, local73.anInt2745, local73.aBoolean136, arg5);
			}
		} else if (arg1 == 0) {
			if (local73.anInt2742 == -1 && local73.anIntArray259 == null) {
				local131 = local73.method1816(arg4, 0, local13, local23, local45, local33);
			} else {
				local131 = new Class3_Sub1_Sub2_Sub5(arg2, 0, arg4, local13, local33, local45, local23, local73.anInt2742, true, null);
			}
			arg8.method445(arg6, arg5, arg7, local69, local131, null, Static41.anIntArray74[arg4], 0, local58, local94);
			if (local73.anInt2717 != 0) {
				arg0.method2005(arg1, arg4, arg7, arg5, local73.aBoolean136);
			}
		} else if (arg1 == 1) {
			if (local73.anInt2742 == -1 && local73.anIntArray259 == null) {
				local131 = local73.method1816(arg4, 1, local13, local23, local45, local33);
			} else {
				local131 = new Class3_Sub1_Sub2_Sub5(arg2, 1, arg4, local13, local33, local45, local23, local73.anInt2742, true, null);
			}
			arg8.method445(arg6, arg5, arg7, local69, local131, null, Static111.anIntArray271[arg4], 0, local58, local94);
			if (local73.anInt2717 != 0) {
				arg0.method2005(arg1, arg4, arg7, arg5, local73.aBoolean136);
			}
		} else {
			@Pc(491) int local491;
			@Pc(520) Class3_Sub1_Sub2 local520;
			if (arg1 == 2) {
				local491 = arg4 + 1 & 0x3;
				@Pc(510) Class3_Sub1_Sub2 local510;
				if (local73.anInt2742 == -1 && local73.anIntArray259 == null) {
					local510 = local73.method1816(arg4 + 4, 2, local13, local23, local45, local33);
					local520 = local73.method1816(local491, 2, local13, local23, local45, local33);
				} else {
					local510 = new Class3_Sub1_Sub2_Sub5(arg2, 2, arg4 + 4, local13, local33, local45, local23, local73.anInt2742, true, null);
					local520 = new Class3_Sub1_Sub2_Sub5(arg2, 2, local491, local13, local33, local45, local23, local73.anInt2742, true, null);
				}
				arg8.method445(arg6, arg5, arg7, local69, local510, local520, Static41.anIntArray74[arg4], Static41.anIntArray74[local491], local58, local94);
				if (local73.anInt2717 != 0) {
					arg0.method2005(arg1, arg4, arg7, arg5, local73.aBoolean136);
				}
			} else if (arg1 == 3) {
				if (local73.anInt2742 == -1 && local73.anIntArray259 == null) {
					local131 = local73.method1816(arg4, 3, local13, local23, local45, local33);
				} else {
					local131 = new Class3_Sub1_Sub2_Sub5(arg2, 3, arg4, local13, local33, local45, local23, local73.anInt2742, true, null);
				}
				arg8.method445(arg6, arg5, arg7, local69, local131, null, Static111.anIntArray271[arg4], 0, local58, local94);
				if (local73.anInt2717 != 0) {
					arg0.method2005(arg1, arg4, arg7, arg5, local73.aBoolean136);
				}
			} else if (arg1 == 9) {
				if (local73.anInt2742 == -1 && local73.anIntArray259 == null) {
					local131 = local73.method1816(arg4, arg1, local13, local23, local45, local33);
				} else {
					local131 = new Class3_Sub1_Sub2_Sub5(arg2, arg1, arg4, local13, local33, local45, local23, local73.anInt2742, true, null);
				}
				arg8.method425(arg6, arg5, arg7, local69, 1, 1, local131, 0, local58, local94);
				if (local73.anInt2717 != 0) {
					arg0.method2001(arg7, arg4, local73.anInt2743, local73.anInt2745, local73.aBoolean136, arg5);
				}
			} else {
				if (local73.aBoolean131) {
					if (arg4 == 1) {
						local491 = local23;
						local23 = local45;
						local45 = local33;
						local33 = local13;
						local13 = local491;
					} else if (arg4 == 2) {
						local491 = local23;
						local23 = local33;
						local33 = local491;
						@Pc(744) int local744 = local45;
						local45 = local13;
						local13 = local744;
					} else if (arg4 == 3) {
						local491 = local23;
						local23 = local13;
						local13 = local33;
						local33 = local45;
						local45 = local491;
					}
				}
				if (arg1 == 4) {
					if (local73.anInt2742 == -1 && local73.anIntArray259 == null) {
						local131 = local73.method1816(0, 4, local13, local23, local45, local33);
					} else {
						local131 = new Class3_Sub1_Sub2_Sub5(arg2, 4, 0, local13, local33, local45, local23, local73.anInt2742, true, null);
					}
					arg8.method427(arg6, arg5, arg7, local69, local131, Static41.anIntArray74[arg4], arg4 * 512, 0, 0, local58, local94);
				} else if (arg1 == 5) {
					local491 = 16;
					local228 = arg8.method436(arg6, arg5, arg7);
					if (local228 != 0) {
						local491 = Static122.method1962(local228 >> 14 & 0x7FFF).anInt2718;
					}
					if (local73.anInt2742 == -1 && local73.anIntArray259 == null) {
						local520 = local73.method1816(0, 4, local13, local23, local45, local33);
					} else {
						local520 = new Class3_Sub1_Sub2_Sub5(arg2, 4, 0, local13, local33, local45, local23, local73.anInt2742, true, null);
					}
					arg8.method427(arg6, arg5, arg7, local69, local520, Static41.anIntArray74[arg4], arg4 * 512, local491 * Static116.anIntArray294[arg4], local491 * Static27.anIntArray53[arg4], local58, local94);
				} else if (arg1 == 6) {
					if (local73.anInt2742 == -1 && local73.anIntArray259 == null) {
						local131 = local73.method1816(0, 4, local13, local23, local45, local33);
					} else {
						local131 = new Class3_Sub1_Sub2_Sub5(arg2, 4, 0, local13, local33, local45, local23, local73.anInt2742, true, null);
					}
					arg8.method427(arg6, arg5, arg7, local69, local131, 256, arg4, 0, 0, local58, local94);
				} else if (arg1 == 7) {
					if (local73.anInt2742 == -1 && local73.anIntArray259 == null) {
						local131 = local73.method1816(0, 4, local13, local23, local45, local33);
					} else {
						local131 = new Class3_Sub1_Sub2_Sub5(arg2, 4, 0, local13, local33, local45, local23, local73.anInt2742, true, null);
					}
					arg8.method427(arg6, arg5, arg7, local69, local131, 512, arg4, 0, 0, local58, local94);
				} else if (arg1 == 8) {
					if (local73.anInt2742 == -1 && local73.anIntArray259 == null) {
						local131 = local73.method1816(0, 4, local13, local23, local45, local33);
					} else {
						local131 = new Class3_Sub1_Sub2_Sub5(arg2, 4, 0, local13, local33, local45, local23, local73.anInt2742, true, null);
					}
					arg8.method427(arg6, arg5, arg7, local69, local131, 768, arg4, 0, 0, local58, local94);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public static void method1741() {
		aClass56_1421 = null;
		aClass56_1422 = null;
		aClass56_1420 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
	public static void method1742() {
		@Pc(5) Object local5 = Static118.anObject4;
		synchronized (Static118.anObject4) {
			if (Static7.anInt375 == 0) {
				Static8.aClass43_1.method1093(5, new Class49());
			}
			Static7.anInt375 = 600;
		}
	}
}
