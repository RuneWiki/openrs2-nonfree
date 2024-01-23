import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
	public static int anInt3867;

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
	public static int anInt3868;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "[Lclient!wm;")
	public static Class188[] aClass188Array1;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
	public static int anInt3864 = -1;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString134 = "";

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)Z")
	public static boolean method3149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static153.anInt3108; local1++) {
			@Pc(8) Class75 local8 = Static280.aClass75Array3[local1];
			@Pc(17) int local17;
			@Pc(29) int local29;
			@Pc(39) int local39;
			@Pc(49) int local49;
			@Pc(59) int local59;
			if (local8.anInt2349 == 1) {
				local17 = local8.anInt2336 - arg0;
				if (local17 > 0) {
					local29 = local8.anInt2346 + (local8.anInt2338 * local17 >> 8);
					local39 = local8.anInt2339 + (local8.anInt2351 * local17 >> 8);
					local49 = local8.anInt2347 + (local8.anInt2334 * local17 >> 8);
					local59 = local8.anInt2345 + (local8.anInt2332 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt2349 == 2) {
				local17 = arg0 - local8.anInt2336;
				if (local17 > 0) {
					local29 = local8.anInt2346 + (local8.anInt2338 * local17 >> 8);
					local39 = local8.anInt2339 + (local8.anInt2351 * local17 >> 8);
					local49 = local8.anInt2347 + (local8.anInt2334 * local17 >> 8);
					local59 = local8.anInt2345 + (local8.anInt2332 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt2349 == 3) {
				local17 = local8.anInt2346 - arg2;
				if (local17 > 0) {
					local29 = local8.anInt2336 + (local8.anInt2328 * local17 >> 8);
					local39 = local8.anInt2352 + (local8.anInt2341 * local17 >> 8);
					local49 = local8.anInt2347 + (local8.anInt2334 * local17 >> 8);
					local59 = local8.anInt2345 + (local8.anInt2332 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt2349 == 4) {
				local17 = arg2 - local8.anInt2346;
				if (local17 > 0) {
					local29 = local8.anInt2336 + (local8.anInt2328 * local17 >> 8);
					local39 = local8.anInt2352 + (local8.anInt2341 * local17 >> 8);
					local49 = local8.anInt2347 + (local8.anInt2334 * local17 >> 8);
					local59 = local8.anInt2345 + (local8.anInt2332 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt2349 == 5) {
				local17 = arg1 - local8.anInt2347;
				if (local17 > 0) {
					local29 = local8.anInt2336 + (local8.anInt2328 * local17 >> 8);
					local39 = local8.anInt2352 + (local8.anInt2341 * local17 >> 8);
					local49 = local8.anInt2346 + (local8.anInt2338 * local17 >> 8);
					local59 = local8.anInt2339 + (local8.anInt2351 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg2 >= local49 && arg2 <= local59) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BIILclient!wh;I)V")
	public static void method3150(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class185 arg2, @OriginalArg(4) int arg3) {
		if (Static286.anInt5602 >= 400) {
			return;
		}
		if (arg2.anIntArray466 != null) {
			arg2 = arg2.method4658();
		}
		if (arg2 == null || !arg2.aBoolean400) {
			return;
		}
		@Pc(31) String local31 = arg2.aString200;
		if (arg2.anInt5766 != 0) {
			@Pc(44) String local44 = Static122.anInt2465 == 1 ? Static47.aString37 : Static98.aString75;
			local31 = local31 + Static84.method1417(Static72.aClass13_Sub5_Sub1_1.anInt4452, arg2.anInt5766) + " (" + local44 + arg2.anInt5766 + ")";
		}
		if (Static116.anInt5523 == 1) {
			Static140.method2241((short) 37, Static137.aString92 + " -> <col=ffff00>" + local31, Static118.aString86, Static303.anInt5779, (long) arg1, arg3, arg0);
		} else if (Static145.aBoolean386) {
			@Pc(120) Class4_Sub2_Sub7 local120 = Static221.anInt4243 == -1 ? null : Static58.method2508(Static221.anInt4243);
			if ((Static282.anInt5536 & 0x2) != 0 && (local120 == null || arg2.method4661(Static221.anInt4243, local120.anInt1697) != local120.anInt1697)) {
				Static140.method2241((short) 9, Static160.aString115 + " -> <col=ffff00>" + local31, Static201.aString139, Static43.anInt871, (long) arg1, arg3, arg0);
			}
		} else {
			@Pc(173) String[] local173 = arg2.aStringArray36;
			if (Static36.aBoolean51) {
				local173 = Static167.method2666(local173);
			}
			@Pc(185) int local185;
			if (local173 != null) {
				for (local185 = 4; local185 >= 0; local185--) {
					if (local173[local185] != null && (Static122.anInt2465 != 0 || !local173[local185].equalsIgnoreCase(Static31.aString26))) {
						@Pc(211) int local211 = -1;
						@Pc(213) byte local213 = 0;
						if (local185 == arg2.anInt5780) {
							local211 = arg2.anInt5798;
						}
						if (local185 == 0) {
							local213 = 3;
						}
						if (local185 == 1) {
							local213 = 40;
						}
						if (local185 == arg2.anInt5765) {
							local211 = arg2.anInt5778;
						}
						if (local185 == 2) {
							local213 = 20;
						}
						if (local185 == 3) {
							local213 = 33;
						}
						if (local185 == 4) {
							local213 = 60;
						}
						Static140.method2241(local213, "<col=ffff00>" + local31, local173[local185], local211, (long) arg1, arg3, arg0);
					}
				}
			}
			if (Static122.anInt2465 == 0 && local173 != null) {
				for (local185 = 4; local185 >= 0; local185--) {
					if (local173[local185] != null && local173[local185].equalsIgnoreCase(Static31.aString26)) {
						@Pc(315) short local315 = 0;
						if (local185 == 0) {
							local315 = 3;
						}
						@Pc(322) short local322 = 0;
						if (Static72.aClass13_Sub5_Sub1_1.anInt4452 < arg2.anInt5766) {
							local322 = 2000;
						}
						if (local185 == 1) {
							local315 = 40;
						}
						if (local185 == 2) {
							local315 = 20;
						}
						if (local185 == 3) {
							local315 = 33;
						}
						if (local185 == 4) {
							local315 = 60;
						}
						if (local315 != 0) {
							local315 += local322;
						}
						Static140.method2241(local315, "<col=ffff00>" + local31, local173[local185], arg2.anInt5796, (long) arg1, arg3, arg0);
					}
				}
			}
			Static140.method2241((short) 1006, "<col=ffff00>" + local31, Static250.aString164, Static55.anInt1250, (long) arg1, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB[III)V")
	public static void method3151(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(8) int local8 = arg0 - 1;
		@Pc(11) int local11 = local8 - 7;
		while (arg3 < local11) {
			@Pc(16) int local16 = arg3 + 1;
			arg1[local16] = arg2;
			@Pc(21) int local21 = local16 + 1;
			arg1[local21] = arg2;
			@Pc(26) int local26 = local21 + 1;
			arg1[local26] = arg2;
			@Pc(31) int local31 = local26 + 1;
			arg1[local31] = arg2;
			@Pc(36) int local36 = local31 + 1;
			arg1[local36] = arg2;
			@Pc(41) int local41 = local36 + 1;
			arg1[local41] = arg2;
			@Pc(46) int local46 = local41 + 1;
			arg1[local46] = arg2;
			arg3 = local46 + 1;
			arg1[arg3] = arg2;
		}
		while (arg3 < local8) {
			arg3++;
			arg1[arg3] = arg2;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)V")
	public static void method3152(@OriginalArg(0) int arg0) {
		Static115.aClass4_Sub2_Sub18_1 = (Class4_Sub2_Sub18) Static154.aClass163_23.method4188((long) arg0);
	}
}
