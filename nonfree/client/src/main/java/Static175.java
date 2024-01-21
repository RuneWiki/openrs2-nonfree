import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!se", name = "F", descriptor = "I")
	public static int anInt3547;

	@OriginalMember(owner = "client!se", name = "J", descriptor = "Lclient!tc;")
	public static Class3_Sub19_Sub2 aClass3_Sub19_Sub2_2;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "[I")
	public static final int[] anIntArray292 = new int[100];

	@OriginalMember(owner = "client!se", name = "u", descriptor = "I")
	public static int anInt3539 = 0;

	@OriginalMember(owner = "client!se", name = "z", descriptor = "[I")
	public static final int[] anIntArray293 = new int[500];

	@OriginalMember(owner = "client!se", name = "B", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1706 = Static193.method3027("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!se", name = "C", descriptor = "[I")
	public static final int[] anIntArray294 = new int[5];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!b;II)V")
	public static void method2705(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt267 == 1) {
			Static50.method784((short) 36, 0, arg1.aClass70_121, Static61.aClass70_596, 0L, arg1.anInt229);
		}
		if (arg1.anInt267 == 2 && !Static5.aBoolean7) {
			@Pc(31) Class70 local31 = Static146.method2126(arg1);
			if (local31 != null) {
				Static50.method784((short) 17, -1, local31, Static207.method3296(new Class70[] { Static22.aClass70_223, arg1.aClass70_120 }), 0L, arg1.anInt229);
			}
		}
		if (arg1.anInt267 == 3) {
			Static50.method784((short) 18, 0, Static43.aClass70_455, Static61.aClass70_596, 0L, arg1.anInt229);
		}
		if (arg1.anInt267 == 4) {
			Static50.method784((short) 7, 0, arg1.aClass70_121, Static61.aClass70_596, 0L, arg1.anInt229);
		}
		if (arg1.anInt267 == 5) {
			Static50.method784((short) 31, 0, arg1.aClass70_121, Static61.aClass70_596, 0L, arg1.anInt229);
		}
		if (arg1.anInt267 == 6 && Static72.aClass6_40 == null) {
			Static50.method784((short) 47, -1, arg1.aClass70_121, Static61.aClass70_596, 0L, arg1.anInt229);
		}
		@Pc(153) int local153;
		@Pc(159) int local159;
		if (arg1.anInt250 == 2) {
			local153 = 0;
			for (@Pc(155) int local155 = 0; local155 < arg1.anInt234; local155++) {
				for (local159 = 0; local159 < arg1.anInt247; local159++) {
					@Pc(168) int local168 = (arg1.anInt240 + 32) * local159;
					@Pc(176) int local176 = (arg1.anInt272 + 32) * local155;
					if (local153 < 20) {
						local168 += arg1.anIntArray11[local153];
						local176 += arg1.anIntArray8[local153];
					}
					if (local168 <= arg0 && arg2 >= local176 && local168 + 32 > arg0 && arg2 < local176 + 32) {
						anInt3539 = local153;
						Static57.aClass6_34 = arg1;
						if (arg1.anIntArray15[local153] > 0) {
							@Pc(236) Class3_Sub3_Sub11 local236 = Static14.method275(arg1.anIntArray15[local153] - 1);
							if (Static210.anInt4244 == 1 && Static176.method2726(Static157.method2365(arg1))) {
								if (Static55.anInt1195 != arg1.anInt229 || Static60.anInt3272 != local153) {
									Static50.method784((short) 16, local153, Static41.aClass70_428, Static207.method3296(new Class70[] { Static2.aClass70_2, Static174.aClass70_1701, local236.aClass70_579 }), (long) local236.anInt1234, arg1.anInt229);
								}
							} else if (!Static5.aBoolean7 || !Static176.method2726(Static157.method2365(arg1))) {
								@Pc(262) Class70[] local262 = local236.aClass70Array25;
								if (Static179.aBoolean80) {
									local262 = Static22.method372(local262);
								}
								@Pc(276) int local276;
								@Pc(325) byte local325;
								if (Static176.method2726(Static157.method2365(arg1))) {
									for (local276 = 4; local276 >= 3; local276--) {
										if (local262 != null && local262[local276] != null) {
											if (local276 == 3) {
												local325 = 34;
											} else {
												local325 = 15;
											}
											Static50.method784(local325, local153, local262[local276], Static207.method3296(new Class70[] { Static149.aClass70_1432, local236.aClass70_579 }), (long) local236.anInt1234, arg1.anInt229);
										} else if (local276 == 4) {
											Static50.method784((short) 15, local153, Static69.aClass70_656, Static207.method3296(new Class70[] { Static149.aClass70_1432, local236.aClass70_579 }), (long) local236.anInt1234, arg1.anInt229);
										}
									}
								}
								if (Static153.method2267(Static157.method2365(arg1))) {
									Static50.method784((short) 19, local153, Static41.aClass70_428, Static207.method3296(new Class70[] { Static149.aClass70_1432, local236.aClass70_579 }), (long) local236.anInt1234, arg1.anInt229);
								}
								if (Static176.method2726(Static157.method2365(arg1)) && local262 != null) {
									for (local276 = 2; local276 >= 0; local276--) {
										if (local262[local276] != null) {
											local325 = 0;
											if (local276 == 0) {
												local325 = 42;
											}
											if (local276 == 1) {
												local325 = 45;
											}
											if (local276 == 2) {
												local325 = 2;
											}
											Static50.method784(local325, local153, local262[local276], Static207.method3296(new Class70[] { Static149.aClass70_1432, local236.aClass70_579 }), (long) local236.anInt1234, arg1.anInt229);
										}
									}
								}
								local262 = arg1.aClass70Array4;
								if (Static179.aBoolean80) {
									local262 = Static22.method372(local262);
								}
								if (local262 != null) {
									for (local276 = 4; local276 >= 0; local276--) {
										if (local262[local276] != null) {
											local325 = 0;
											if (local276 == 0) {
												local325 = 29;
											}
											if (local276 == 1) {
												local325 = 48;
											}
											if (local276 == 2) {
												local325 = 49;
											}
											if (local276 == 3) {
												local325 = 5;
											}
											if (local276 == 4) {
												local325 = 13;
											}
											Static50.method784(local325, local153, local262[local276], Static207.method3296(new Class70[] { Static149.aClass70_1432, local236.aClass70_579 }), (long) local236.anInt1234, arg1.anInt229);
										}
									}
								}
								Static50.method784((short) 1001, local153, Static210.aClass70_2094, Static207.method3296(new Class70[] { Static149.aClass70_1432, local236.aClass70_579 }), (long) local236.anInt1234, arg1.anInt229);
							} else if ((Static117.anInt2370 & 0x10) == 16) {
								Static50.method784((short) 44, local153, Static136.aClass70_1289, Static207.method3296(new Class70[] { Static110.aClass70_1097, Static174.aClass70_1701, local236.aClass70_579 }), (long) local236.anInt1234, arg1.anInt229);
							}
						}
					}
					local153++;
				}
			}
		}
		if (!arg1.aBoolean21) {
			return;
		}
		if (!Static5.aBoolean7) {
			@Pc(676) Class70 local676;
			for (local153 = 9; local153 >= 5; local153--) {
				local676 = Static180.method2798(local153, arg1);
				if (local676 != null) {
					Static50.method784((short) 1007, arg1.anInt261, local676, arg1.aClass70_125, (long) (local153 + 1), arg1.anInt229);
				}
			}
			local676 = Static146.method2126(arg1);
			if (local676 != null) {
				Static50.method784((short) 17, arg1.anInt261, local676, arg1.aClass70_125, 0L, arg1.anInt229);
			}
			for (local159 = 4; local159 >= 0; local159--) {
				@Pc(730) Class70 local730 = Static180.method2798(local159, arg1);
				if (local730 != null) {
					Static50.method784((short) 21, arg1.anInt261, local730, arg1.aClass70_125, (long) (local159 + 1), arg1.anInt229);
				}
			}
			if (Static208.method1859(Static157.method2365(arg1))) {
				Static50.method784((short) 47, arg1.anInt261, Static163.aClass70_1590, Static61.aClass70_596, 0L, arg1.anInt229);
				return;
			}
			return;
		}
		if (Static133.method1864(Static157.method2365(arg1)) && (Static117.anInt2370 & 0x20) == 32) {
			Static50.method784((short) 10, arg1.anInt261, Static136.aClass70_1289, Static207.method3296(new Class70[] { Static110.aClass70_1097, Static10.aClass70_128, arg1.aClass70_125 }), 0L, arg1.anInt229);
			return;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZIIIII)V")
	public static void method2706(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static16.method304(arg2);
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = arg2;
		@Pc(15) int local15 = -arg2;
		@Pc(19) int local19 = arg2 - arg5;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(28) int local28 = local19;
		@Pc(31) int local31 = -local19;
		@Pc(40) int local40 = arg0 - local19;
		@Pc(44) int[] local44 = Static157.anIntArrayArray24[arg3];
		@Pc(49) int local49 = arg0 + local19;
		@Pc(51) int local51 = -1;
		Static16.method302(arg1, arg0 - arg2, local40, local44);
		@Pc(62) int local62 = -1;
		Static16.method302(arg4, local40, local49, local44);
		Static16.method302(arg1, local49, arg0 + arg2, local44);
		while (local12 > local10) {
			local51 += 2;
			local62 += 2;
			local31 += local62;
			local15 += local51;
			if (local31 >= 0 && local28 >= 1) {
				Static22.anIntArray32[local28] = local10;
				local28--;
				local31 -= local28 << 1;
			}
			local10++;
			@Pc(129) int[] local129;
			@Pc(141) int[] local141;
			@Pc(134) int local134;
			@Pc(146) int local146;
			@Pc(182) int local182;
			@Pc(186) int local186;
			@Pc(195) int local195;
			if (local15 >= 0) {
				local12--;
				local15 -= local12 << 1;
				if (local19 <= local12) {
					local129 = Static157.anIntArrayArray24[local12 + arg3];
					local134 = arg0 + local10;
					local141 = Static157.anIntArrayArray24[arg3 - local12];
					local146 = arg0 - local10;
					Static16.method302(arg1, local146, local134, local129);
					Static16.method302(arg1, local146, local134, local141);
				} else {
					local141 = Static157.anIntArrayArray24[arg3 - local12];
					local134 = Static22.anIntArray32[local12];
					local129 = Static157.anIntArrayArray24[arg3 + local12];
					local182 = arg0 - local10;
					local186 = local134 + arg0;
					local146 = local10 + arg0;
					local195 = arg0 - local134;
					Static16.method302(arg1, local182, local195, local129);
					Static16.method302(arg4, local195, local186, local129);
					Static16.method302(arg1, local186, local146, local129);
					Static16.method302(arg1, local182, local195, local141);
					Static16.method302(arg4, local195, local186, local141);
					Static16.method302(arg1, local186, local146, local141);
				}
			}
			local129 = Static157.anIntArrayArray24[arg3 + local10];
			local141 = Static157.anIntArrayArray24[arg3 - local10];
			local146 = arg0 - local12;
			local134 = arg0 + local12;
			if (local19 <= local10) {
				Static16.method302(arg1, local146, local134, local129);
				Static16.method302(arg1, local146, local134, local141);
			} else {
				local182 = local10 <= local28 ? local28 : Static22.anIntArray32[local10];
				local186 = local182 + arg0;
				local195 = arg0 - local182;
				Static16.method302(arg1, local146, local195, local129);
				Static16.method302(arg4, local195, local186, local129);
				Static16.method302(arg1, local186, local134, local129);
				Static16.method302(arg1, local146, local195, local141);
				Static16.method302(arg4, local195, local186, local141);
				Static16.method302(arg1, local186, local134, local141);
			}
		}
	}
}
