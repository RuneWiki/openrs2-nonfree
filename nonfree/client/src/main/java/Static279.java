import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
	public static int anInt5302 = 0;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!vj;B)[Lclient!t;")
	public static Class189[] method4822(@OriginalArg(0) Class206 arg0) {
		if (!arg0.method5531()) {
			return new Class189[0];
		}
		@Pc(16) Class196 local16 = arg0.method5508();
		while (local16.anInt5851 == 0) {
			Static278.method5283(10L);
		}
		if (local16.anInt5851 == 2) {
			return new Class189[0];
		}
		@Pc(37) int[] local37 = (int[]) local16.anObject8;
		@Pc(43) Class189[] local43 = new Class189[local37.length >> 2];
		for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
			@Pc(54) Class189 local54 = new Class189();
			local43[local45] = local54;
			local54.anInt5577 = local37[local45 << 2];
			local54.anInt5580 = local37[(local45 << 2) + 1];
			local54.anInt5583 = local37[(local45 << 2) + 2];
			local54.anInt5575 = local37[(local45 << 2) + 3];
		}
		return local43;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BI)Lclient!lo;")
	public static Class128 method4823(@OriginalArg(1) int arg0) {
		@Pc(13) Class70 local13 = Static69.aClass70_17;
		@Pc(22) Class128 local22;
		synchronized (Static69.aClass70_17) {
			local22 = (Class128) Static69.aClass70_17.method1396((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(38) byte[] local38 = Static154.aClass53_87.method1033(arg0, 32);
		local22 = new Class128();
		if (local38 != null) {
			local22.method3455(new Class6_Sub10(local38));
		}
		local22.method3456();
		@Pc(56) Class70 local56 = Static69.aClass70_17;
		synchronized (Static69.aClass70_17) {
			Static69.aClass70_17.method1406(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BIILclient!mb;)V")
	public static void method4824(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class132 arg2) {
		if (arg2.anInt3544 == 1) {
			Static52.method870(0, arg2.aString149, 33, arg2.anInt3551, -1, "", 0L);
		}
		if (arg2.anInt3544 == 2 && !Static79.aBoolean97) {
			@Pc(43) String local43 = Static354.method5812(arg2);
			if (local43 != null) {
				Static52.method870(-1, local43, 29, arg2.anInt3551, -1, "<col=00ff00>" + arg2.aString148, 0L);
			}
		}
		if (arg2.anInt3544 == 3) {
			Static52.method870(0, Static239.aString305, 50, arg2.anInt3551, -1, "", 0L);
		}
		if (arg2.anInt3544 == 4) {
			Static52.method870(0, arg2.aString149, 6, arg2.anInt3551, -1, "", 0L);
		}
		if (arg2.anInt3544 == 5) {
			Static52.method870(0, arg2.aString149, 22, arg2.anInt3551, -1, "", 0L);
		}
		if (arg2.anInt3544 == 6 && Static109.aClass132_7 == null) {
			Static52.method870(-1, arg2.aString149, 14, arg2.anInt3551, -1, "", 0L);
		}
		@Pc(163) int local163;
		@Pc(157) int local157;
		if (arg2.anInt3524 == 2) {
			local157 = 0;
			for (@Pc(159) int local159 = 0; local159 < arg2.anInt3536; local159++) {
				for (local163 = 0; local163 < arg2.anInt3580; local163++) {
					@Pc(173) int local173 = (arg2.anInt3511 + 32) * local163;
					@Pc(180) int local180 = (arg2.anInt3501 + 32) * local159;
					if (local157 < 20) {
						local180 += arg2.anIntArray418[local157];
						local173 += arg2.anIntArray412[local157];
					}
					if (local173 <= arg1 && arg0 >= local180 && local173 + 32 > arg1 && local180 + 32 > arg0) {
						Static10.aClass132_2 = arg2;
						Static22.anInt363 = local157;
						if (arg2.anIntArray414[local157] > 0) {
							@Pc(236) Class6_Sub34 local236 = Static43.method751(arg2);
							@Pc(245) Class147 local245 = Static211.method3762(arg2.anIntArray414[local157] - 1);
							if (Static14.anInt257 == 1 && local236.method4576()) {
								if (arg2.anInt3551 != Static338.anInt6174 || Static102.anInt5263 != local157) {
									Static52.method870(local157, Static165.aString287, 9, arg2.anInt3551, Static71.anInt1345, Static237.aString188 + " -> <col=ff9040>" + local245.aString170, (long) local245.anInt3953);
								}
							} else if (Static79.aBoolean97 && local236.method4576()) {
								@Pc(269) Class6_Sub2_Sub13 local269 = Static221.anInt4061 == -1 ? null : Static219.method3902(Static221.anInt4061);
								if ((Static288.anInt5432 & 0x10) != 0 && (local269 == null || local245.method3848(Static221.anInt4061, local269.anInt3777) != local269.anInt3777)) {
									Static52.method870(local157, Static312.aString270, 40, arg2.anInt3551, Static1.anInt38, Static303.aString264 + " -> <col=ff9040>" + local245.aString170, (long) local245.anInt3953);
								}
							} else {
								@Pc(319) String[] local319 = local245.aStringArray27;
								@Pc(325) int local325;
								@Pc(340) byte local340;
								@Pc(335) int local335;
								if (local236.method4576()) {
									for (local325 = 4; local325 >= 3; local325--) {
										if (local319 != null && local319[local325] != null) {
											local335 = -1;
											if (local325 == 3) {
												local340 = 24;
											} else {
												local340 = 34;
											}
											if (local325 == local245.anInt3994) {
												local335 = local245.anInt3954;
											}
											if (local325 == local245.anInt3985) {
												local335 = local245.anInt3978;
											}
											Static52.method870(local157, local319[local325], local340, arg2.anInt3551, local335, "<col=ff9040>" + local245.aString170, (long) local245.anInt3953);
										}
									}
								}
								if (local236.method4569()) {
									Static52.method870(local157, Static165.aString287, 11, arg2.anInt3551, Static71.anInt1345, "<col=ff9040>" + local245.aString170, (long) local245.anInt3953);
								}
								if (local236.method4576() && local319 != null) {
									for (local325 = 2; local325 >= 0; local325--) {
										if (local319[local325] != null) {
											local340 = 0;
											local335 = -1;
											if (local325 == 0) {
												local340 = 28;
											}
											if (local325 == 1) {
												local340 = 42;
											}
											if (local245.anInt3994 == local325) {
												local335 = local245.anInt3954;
											}
											if (local325 == 2) {
												local340 = 23;
											}
											if (local245.anInt3985 == local325) {
												local335 = local245.anInt3978;
											}
											Static52.method870(local157, local319[local325], local340, arg2.anInt3551, local335, "<col=ff9040>" + local245.aString170, (long) local245.anInt3953);
										}
									}
								}
								local319 = arg2.aStringArray22;
								if (local319 != null) {
									for (local325 = 4; local325 >= 0; local325--) {
										if (local319[local325] != null) {
											local340 = 0;
											local335 = -1;
											if (local325 == 0) {
												local340 = 7;
											}
											if (local325 == 1) {
												local340 = 8;
											}
											if (local325 == 2) {
												local340 = 10;
											}
											if (local325 == 3) {
												local340 = 48;
											}
											if (local325 == local245.anInt3994) {
												local335 = local245.anInt3954;
											}
											if (local325 == 4) {
												local340 = 16;
											}
											if (local325 == local245.anInt3985) {
												local335 = local245.anInt3978;
											}
											Static52.method870(local157, local319[local325], local340, arg2.anInt3551, local335, "<col=ff9040>" + local245.aString170, (long) local245.anInt3953);
										}
									}
								}
								Static52.method870(local157, Static153.aString126, 1005, arg2.anInt3551, Static148.anInt2741, "<col=ff9040>" + local245.aString170, (long) local245.anInt3953);
							}
						}
					}
					local157++;
				}
			}
		}
		if (!arg2.aBoolean261) {
			return;
		}
		if (Static79.aBoolean97) {
			if (Static43.method751(arg2).method4570() && (Static288.anInt5432 & 0x20) != 0) {
				Static52.method870(arg2.anInt3555, Static312.aString270, 5, arg2.anInt3551, Static1.anInt38, Static303.aString264 + " -> " + arg2.aString150, 0L);
				return;
			}
			return;
		}
		@Pc(720) String local720;
		for (local157 = 9; local157 >= 5; local157--) {
			local720 = Static49.method841(local157, arg2);
			if (local720 != null) {
				Static52.method870(arg2.anInt3555, local720, 1010, arg2.anInt3551, Static281.method4843(arg2, local157), arg2.aString150, (long) (local157 + 1));
			}
		}
		local720 = Static354.method5812(arg2);
		if (local720 != null) {
			Static52.method870(arg2.anInt3555, local720, 29, arg2.anInt3551, -1, arg2.aString150, 0L);
		}
		for (local163 = 4; local163 >= 0; local163--) {
			@Pc(781) String local781 = Static49.method841(local163, arg2);
			if (local781 != null) {
				Static52.method870(arg2.anInt3555, local781, 37, arg2.anInt3551, Static281.method4843(arg2, local163), arg2.aString150, (long) (local163 + 1));
			}
		}
		if (!Static43.method751(arg2).method4582()) {
			return;
		}
		if (arg2.aString145 == null) {
			Static52.method870(arg2.anInt3555, Static286.aString232, 14, arg2.anInt3551, -1, "", 0L);
		} else {
			Static52.method870(arg2.anInt3555, arg2.aString145, 14, arg2.anInt3551, -1, "", 0L);
		}
		return;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
	public static void method4825() {
		Static173.anInt3276 = 0;
		Static171.anInt3185 = 0;
		Static350.anInt6303 = 0;
		Static298.anInt5636 = 0;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V")
	public static void method4826() {
		if (Static88.aClass48_1 != null) {
			@Pc(7) Class48 local7 = Static88.aClass48_1;
			synchronized (Static88.aClass48_1) {
				Static88.aClass48_1 = null;
			}
		}
	}
}
