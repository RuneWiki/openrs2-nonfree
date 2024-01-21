import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Z")
	public static boolean aBoolean47;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "[I")
	public static int[] anIntArray158;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Lclient!mb;")
	private static Class45 aClass45_464 = Static63.method1251("Login server offline)3");

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!mb;")
	public static Class45 aClass45_465 = Static63.method1251("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!g", name = "f", descriptor = "Lclient!mb;")
	public static Class45 aClass45_466 = Static63.method1251("::");

	@OriginalMember(owner = "client!g", name = "s", descriptor = "Lclient!mb;")
	private static Class45 aClass45_474 = Static63.method1251("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!g", name = "g", descriptor = "Lclient!mb;")
	public static Class45 aClass45_467 = aClass45_474;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "Lclient!mb;")
	public static Class45 aClass45_468 = aClass45_464;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Lclient!mb;")
	private static Class45 aClass45_472 = Static63.method1251("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!g", name = "j", descriptor = "Lclient!mb;")
	public static Class45 aClass45_469 = aClass45_472;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!mb;")
	public static Class45 aClass45_470 = Static63.method1251(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Lclient!mb;")
	private static Class45 aClass45_473 = Static63.method1251("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!g", name = "m", descriptor = "Lclient!mb;")
	public static Class45 aClass45_471 = aClass45_473;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
	public static void method683(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = Static84.aClass5_Sub2_Sub6_Sub3_2.anIntArray377;
		@Pc(16) int local16 = local13.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			local13[local18] = 0;
		}
		@Pc(42) int local42;
		@Pc(44) int local44;
		for (@Pc(30) int local30 = 1; local30 < 103; local30++) {
			local42 = (103 - local30) * 512 * 4 + 24628;
			for (local44 = 1; local44 < 103; local44++) {
				if ((Static48.aByteArrayArrayArray3[arg0][local44][local30] & 0x18) == 0) {
					Static110.aClass34_1.method881(local13, local42, arg0, local44, local30);
				}
				if (arg0 < 3 && (Static48.aByteArrayArrayArray3[arg0 + 1][local44][local30] & 0x8) != 0) {
					Static110.aClass34_1.method881(local13, local42, arg0 + 1, local44, local30);
				}
				local42 += 4;
			}
		}
		Static84.aClass5_Sub2_Sub6_Sub3_2.method1759();
		local42 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + -10 + 238 << 16) + 228;
		local44 = (int) (Math.random() * 20.0D) + 228 << 16;
		@Pc(144) int local144;
		for (@Pc(140) int local140 = 1; local140 < 103; local140++) {
			for (local144 = 1; local144 < 103; local144++) {
				if ((Static48.aByteArrayArrayArray3[arg0][local144][local140] & 0x18) == 0) {
					Static59.method1210(local140, arg0, local44, local144, local42);
				}
				if (arg0 < 3 && (Static48.aByteArrayArrayArray3[arg0 + 1][local144][local140] & 0x8) != 0) {
					Static59.method1210(local140, arg0 + 1, local44, local144, local42);
				}
			}
		}
		Static50.anInt1606 = 0;
		for (local144 = 0; local144 < 104; local144++) {
			for (@Pc(213) int local213 = 0; local213 < 104; local213++) {
				@Pc(221) int local221 = Static110.aClass34_1.method888(Static8.anInt262, local144, local213);
				if (local221 != 0) {
					local221 = local221 >> 14 & 0x7FFF;
					@Pc(237) int local237 = Static62.method1232(local221).anInt841;
					if (local237 >= 0) {
						@Pc(241) int local241 = local213;
						@Pc(243) int local243 = local144;
						if (local237 != 22 && local237 != 29 && local237 != 34 && local237 != 36 && local237 != 46 && local237 != 47 && local237 != 48) {
							@Pc(273) int[][] local273 = Static51.aClass37Array1[Static8.anInt262].anIntArrayArray19;
							for (@Pc(275) int local275 = 0; local275 < 10; local275++) {
								@Pc(282) int local282 = (int) (Math.random() * 4.0D);
								if (local282 == 0 && local243 > 0 && local144 - 3 < local243 && (local273[local243 - 1][local241] & 0x1280108) == 0) {
									local243--;
								}
								if (local282 == 1 && local243 < 103 && local243 < local144 + 3 && (local273[local243 + 1][local241] & 0x1280180) == 0) {
									local243++;
								}
								if (local282 == 2 && local241 > 0 && local213 - 3 < local241 && (local273[local243][local241 - 1] & 0x1280102) == 0) {
									local241--;
								}
								if (local282 == 3 && local241 < 103 && local241 < local213 + 3 && (local273[local243][local241 + 1] & 0x1280120) == 0) {
									local241++;
								}
							}
						}
						Static119.aClass5_Sub2_Sub6_Sub3Array11[Static50.anInt1606] = Static107.aClass5_Sub2_Sub6_Sub3Array8[local237];
						Static16.anIntArray70[Static50.anInt1606] = local243;
						Static89.anIntArray367[Static50.anInt1606] = local241;
						Static50.anInt1606++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V")
	public static void method684(@OriginalArg(0) boolean arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static62.anInt1819; local11++) {
			@Pc(19) Class5_Sub2_Sub4_Sub3_Sub2 local19 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[Static70.anIntArray297[local11]];
			@Pc(28) int local28 = (Static70.anIntArray297[local11] << 14) + 536870912;
			if (local19 != null && local19.method1614() && arg0 == local19.aClass5_Sub2_Sub17_1.aBoolean132 && local19.aClass5_Sub2_Sub17_1.method2120()) {
				@Pc(53) int local53 = local19.anInt2428 >> 7;
				@Pc(58) int local58 = local19.anInt2417 >> 7;
				if (local53 >= 0 && local53 < 104 && local58 >= 0 && local58 < 104) {
					if (local19.anInt2440 == 1 && (local19.anInt2428 & 0x7F) == 64 && (local19.anInt2417 & 0x7F) == 64) {
						if (Static50.anIntArrayArray18[local53][local58] == Static14.anInt421) {
							continue;
						}
						Static50.anIntArrayArray18[local53][local58] = Static14.anInt421;
					}
					if (!local19.aClass5_Sub2_Sub17_1.aBoolean133) {
						local28 += Integer.MIN_VALUE;
					}
					Static110.aClass34_1.method923(Static8.anInt262, local19.anInt2428, local19.anInt2417, Static32.method676(local19.anInt2428 + local19.anInt2440 * 64 - 64, (local19.anInt2440 + -1) * 64 + local19.anInt2417, Static8.anInt262), local19.anInt2440 * 64 - 4, local19, local19.anInt2407, local28, local19.aBoolean109);
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method685() {
		aClass45_469 = null;
		aClass45_466 = null;
		aClass45_467 = null;
		aBooleanArray9 = null;
		aClass45_473 = null;
		aClass45_468 = null;
		aClass45_465 = null;
		aClass45_472 = null;
		aClass45_464 = null;
		aClass45_470 = null;
		anIntArray158 = null;
		aClass45_471 = null;
		aClass45_474 = null;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)V")
	public static void method686(@OriginalArg(1) int arg0) {
		for (@Pc(11) Class5_Sub3 local11 = (Class5_Sub3) Static38.aClass66_6.method1815(); local11 != null; local11 = (Class5_Sub3) Static38.aClass66_6.method1809()) {
			if ((local11.aLong146 >> 48 & 0xFFFFL) == (long) arg0) {
				local11.method2144();
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!ia;I[Ljava/lang/Object;ZILclient!ia;)V")
	public static void method687(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5_Sub2_Sub8 arg5) {
		@Pc(11) int local11 = (Integer) arg3[0];
		@Pc(15) Class5_Sub2_Sub13 local15 = Static112.method2042(local11);
		if (local15 == null) {
			return;
		}
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = -1;
		@Pc(36) int[] local36 = local15.anIntArray409;
		@Pc(39) int[] local39 = local15.anIntArray410;
		@Pc(41) int local41 = 0;
		@Pc(43) byte local43 = -1;
		try {
			Static89.aClass45Array17 = new Class45[local15.anInt2697];
			Static31.anIntArray156 = new int[local15.anInt2696];
			@Pc(53) int local53 = 0;
			@Pc(55) int local55 = 0;
			@Pc(85) int local85;
			for (@Pc(57) int local57 = 1; local57 < arg3.length; local57++) {
				if (arg3[local57] instanceof Integer) {
					local85 = (Integer) arg3[local57];
					if (local85 == -2147483647) {
						local85 = arg4;
					}
					if (local85 == -2147483646) {
						local85 = arg2;
					}
					if (local85 == -2147483645) {
						local85 = arg5 == null ? -1 : arg5.anInt1262;
					}
					if (local85 == -2147483644) {
						local85 = arg0;
					}
					if (local85 == -2147483643) {
						local85 = arg5 == null ? -1 : arg5.anInt1288;
					}
					if (local85 == -2147483642) {
						local85 = arg1 == null ? -1 : arg1.anInt1262;
					}
					if (local85 == -2147483641) {
						local85 = arg1 == null ? -1 : arg1.anInt1288;
					}
					Static31.anIntArray156[local53++] = local85;
				} else if (arg3[local57] instanceof Class45) {
					Static89.aClass45Array17[local55++] = (Class45) arg3[local57];
				}
			}
			local85 = 0;
			label1241: while (true) {
				local85++;
				if (local85 > 200000) {
					throw new RuntimeException("slow");
				}
				local33++;
				@Pc(180) int local180 = local36[local33];
				@Pc(737) int local737;
				@Pc(732) int local732;
				@Pc(557) Class45 local557;
				@Pc(601) int local601;
				@Pc(621) int local621;
				if (local180 < 100) {
					if (local180 == 0) {
						Static117.anIntArray481[local31++] = local39[local33];
						continue;
					}
					@Pc(208) int local208;
					if (local180 == 1) {
						local208 = local39[local33];
						Static117.anIntArray481[local31++] = Static117.anIntArray483[local208];
						continue;
					}
					if (local180 == 2) {
						local208 = local39[local33];
						local31--;
						Static117.anIntArray483[local208] = Static117.anIntArray481[local31];
						continue;
					}
					if (local180 == 3) {
						Static14.aClass45Array4[local41++] = local15.aClass45Array18[local33];
						continue;
					}
					if (local180 == 6) {
						local33 += local39[local33];
						continue;
					}
					if (local180 == 7) {
						local31 -= 2;
						if (Static117.anIntArray481[local31 + 1] != Static117.anIntArray481[local31]) {
							local33 += local39[local33];
						}
						continue;
					}
					if (local180 == 8) {
						local31 -= 2;
						if (Static117.anIntArray481[local31 + 1] == Static117.anIntArray481[local31]) {
							local33 += local39[local33];
						}
						continue;
					}
					if (local180 == 9) {
						local31 -= 2;
						if (Static117.anIntArray481[local31 + 1] > Static117.anIntArray481[local31]) {
							local33 += local39[local33];
						}
						continue;
					}
					if (local180 == 10) {
						local31 -= 2;
						if (Static117.anIntArray481[local31 + 1] < Static117.anIntArray481[local31]) {
							local33 += local39[local33];
						}
						continue;
					}
					if (local180 == 21) {
						if (Static106.anInt2794 == 0) {
							return;
						}
						@Pc(382) Class38 local382 = Static96.aClass38Array1[--Static106.anInt2794];
						Static31.anIntArray156 = local382.anIntArray259;
						local15 = local382.aClass5_Sub2_Sub13_1;
						local36 = local15.anIntArray409;
						local39 = local15.anIntArray410;
						Static89.aClass45Array17 = local382.aClass45Array15;
						local33 = local382.anInt1701;
						continue;
					}
					if (local180 == 25) {
						local208 = local39[local33];
						Static117.anIntArray481[local31++] = Static112.method2047(local208);
						continue;
					}
					if (local180 == 27) {
						local208 = local39[local33];
						local31--;
						Static70.method1356(Static117.anIntArray481[local31], local208);
						continue;
					}
					if (local180 == 31) {
						local31 -= 2;
						if (Static117.anIntArray481[local31] <= Static117.anIntArray481[local31 + 1]) {
							local33 += local39[local33];
						}
						continue;
					}
					if (local180 == 32) {
						local31 -= 2;
						if (Static117.anIntArray481[local31] >= Static117.anIntArray481[local31 + 1]) {
							local33 += local39[local33];
						}
						continue;
					}
					if (local180 == 33) {
						Static117.anIntArray481[local31++] = Static31.anIntArray156[local39[local33]];
						continue;
					}
					@Pc(503) int local503;
					if (local180 == 34) {
						local503 = local39[local33];
						local31--;
						Static31.anIntArray156[local503] = Static117.anIntArray481[local31];
						continue;
					}
					if (local180 == 35) {
						Static14.aClass45Array4[local41++] = Static89.aClass45Array17[local39[local33]];
						continue;
					}
					if (local180 == 36) {
						local503 = local39[local33];
						local41--;
						Static89.aClass45Array17[local503] = Static14.aClass45Array4[local41];
						continue;
					}
					if (local180 == 37) {
						local208 = local39[local33];
						local41 -= local208;
						local557 = Static98.method1814(local208, local41, Static14.aClass45Array4);
						Static14.aClass45Array4[local41++] = local557;
						continue;
					}
					if (local180 == 38) {
						local31--;
						continue;
					}
					if (local180 == 39) {
						local41--;
						continue;
					}
					if (local180 == 40) {
						local208 = local39[local33];
						@Pc(591) Class5_Sub2_Sub13 local591 = Static112.method2042(local208);
						@Pc(595) int[] local595 = new int[local591.anInt2696];
						@Pc(599) Class45[] local599 = new Class45[local591.anInt2697];
						for (local601 = 0; local601 < local591.anInt2687; local601++) {
							local595[local601] = Static117.anIntArray481[local601 + local31 - local591.anInt2687];
						}
						for (local621 = 0; local621 < local591.anInt2695; local621++) {
							local599[local621] = Static14.aClass45Array4[local621 + local41 - local591.anInt2695];
						}
						local31 -= local591.anInt2687;
						local41 -= local591.anInt2695;
						@Pc(657) Class38 local657 = new Class38();
						local657.anIntArray259 = Static31.anIntArray156;
						local657.aClass5_Sub2_Sub13_1 = local15;
						local657.aClass45Array15 = Static89.aClass45Array17;
						local657.anInt1701 = local33;
						local15 = local591;
						Static96.aClass38Array1[Static106.anInt2794++] = local657;
						local39 = local591.anIntArray410;
						local36 = local591.anIntArray409;
						Static89.aClass45Array17 = local599;
						Static31.anIntArray156 = local595;
						local33 = -1;
						continue;
					}
					if (local180 == 42) {
						Static117.anIntArray481[local31++] = Static63.anIntArray280[local39[local33]];
						continue;
					}
					if (local180 == 43) {
						local503 = local39[local33];
						local31--;
						Static63.anIntArray280[local503] = Static117.anIntArray481[local31];
						continue;
					}
					if (local180 == 44) {
						local732 = local39[local33] & 0xFFFF;
						local31--;
						local737 = Static117.anIntArray481[local31];
						local208 = local39[local33] >> 16;
						if (local737 >= 0 && local737 <= 5000) {
							Static10.anIntArray46[local208] = local737;
							@Pc(758) byte local758 = -1;
							if (local732 == 105) {
								local758 = 0;
							}
							local601 = 0;
							while (true) {
								if (local737 <= local601) {
									continue label1241;
								}
								Static80.anIntArrayArray22[local208][local601] = local758;
								local601++;
							}
						}
						throw new RuntimeException();
					}
					if (local180 == 45) {
						local31--;
						local732 = Static117.anIntArray481[local31];
						local208 = local39[local33];
						if (local732 >= 0 && local732 < Static10.anIntArray46[local208]) {
							Static117.anIntArray481[local31++] = Static80.anIntArrayArray22[local208][local732];
							continue;
						}
						throw new RuntimeException();
					}
					if (local180 == 46) {
						local31 -= 2;
						local208 = local39[local33];
						local732 = Static117.anIntArray481[local31];
						if (local732 >= 0 && Static10.anIntArray46[local208] > local732) {
							Static80.anIntArrayArray22[local208][local732] = Static117.anIntArray481[local31 + 1];
							continue;
						}
						throw new RuntimeException();
					}
				}
				@Pc(865) boolean local865;
				if (local39[local33] == 1) {
					local865 = true;
				} else {
					local865 = false;
				}
				@Pc(913) Class5_Sub2_Sub8 local913;
				@Pc(1389) int local1389;
				@Pc(1996) int local1996;
				if (local180 < 1000) {
					if (local180 == 100) {
						local31 -= 3;
						local737 = Static117.anIntArray481[local31 + 1];
						local732 = Static117.anIntArray481[local31];
						local1389 = Static117.anIntArray481[local31 + 2];
						if (local737 == 0) {
							throw new RuntimeException();
						}
						@Pc(4203) Class5_Sub2_Sub8 local4203 = Static80.method1507(local732);
						if (local4203.aClass5_Sub2_Sub8Array1 == null) {
							local4203.aClass5_Sub2_Sub8Array1 = new Class5_Sub2_Sub8[local1389 + 1];
						}
						if (local1389 >= local4203.aClass5_Sub2_Sub8Array1.length) {
							@Pc(4226) Class5_Sub2_Sub8[] local4226 = new Class5_Sub2_Sub8[local1389 + 1];
							for (local1996 = 0; local1996 < local4203.aClass5_Sub2_Sub8Array1.length; local1996++) {
								local4226[local1996] = local4203.aClass5_Sub2_Sub8Array1[local1996];
							}
							local4203.aClass5_Sub2_Sub8Array1 = local4226;
						}
						if (local1389 > 0 && local4203.aClass5_Sub2_Sub8Array1[local1389 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1389 - 1));
						}
						@Pc(4272) Class5_Sub2_Sub8 local4272 = new Class5_Sub2_Sub8();
						local4272.aBoolean66 = true;
						local4272.anInt1301 = local4272.anInt1262 = local4203.anInt1262;
						local4272.anInt1269 = local737;
						local4272.anInt1288 = local1389;
						local4203.aClass5_Sub2_Sub8Array1[local1389] = local4272;
						if (local865) {
							Static110.aClass5_Sub2_Sub8_6 = local4272;
						} else {
							Static42.aClass5_Sub2_Sub8_2 = local4272;
						}
						Static115.method2090(local4203);
						continue;
					}
					if (local180 == 101) {
						local913 = local865 ? Static110.aClass5_Sub2_Sub8_6 : Static42.aClass5_Sub2_Sub8_2;
						@Pc(4322) Class5_Sub2_Sub8 local4322 = Static80.method1507(local913.anInt1262);
						local4322.aClass5_Sub2_Sub8Array1[local913.anInt1288] = null;
						Static115.method2090(local4322);
						continue;
					}
					if (local180 == 102) {
						local31--;
						local913 = Static80.method1507(Static117.anIntArray481[local31]);
						local913.aClass5_Sub2_Sub8Array1 = null;
						Static115.method2090(local913);
						continue;
					}
					if (local180 == 200) {
						local31 -= 2;
						local732 = Static117.anIntArray481[local31];
						local737 = Static117.anIntArray481[local31 + 1];
						@Pc(4370) Class5_Sub2_Sub8 local4370 = Static38.method798(local732, local737);
						if (local4370 != null && local737 != -1) {
							Static117.anIntArray481[local31++] = 1;
							if (local865) {
								Static110.aClass5_Sub2_Sub8_6 = local4370;
							} else {
								Static42.aClass5_Sub2_Sub8_2 = local4370;
							}
							continue;
						}
						Static117.anIntArray481[local31++] = 0;
						continue;
					}
				} else if (local180 >= 1000 && local180 < 1100 || local180 >= 2000 && local180 < 2100) {
					if (local180 >= 2000) {
						local31--;
						local913 = Static80.method1507(Static117.anIntArray481[local31]);
						local180 -= 1000;
					} else {
						local913 = local865 ? Static110.aClass5_Sub2_Sub8_6 : Static42.aClass5_Sub2_Sub8_2;
					}
					Static115.method2090(local913);
					if (local180 == 1000) {
						local31 -= 2;
						local913.anInt1252 = Static117.anIntArray481[local31];
						local913.anInt1294 = Static117.anIntArray481[local31 + 1];
						continue;
					}
					if (local180 == 1001) {
						local31 -= 2;
						local913.anInt1260 = Static117.anIntArray481[local31];
						local913.anInt1243 = Static117.anIntArray481[local31 + 1];
						continue;
					}
					if (local180 == 1003) {
						local31--;
						local913.aBoolean68 = Static117.anIntArray481[local31] == 1;
						continue;
					}
				} else if (local180 >= 1100 && local180 < 1200 || !(local180 < 2100 || local180 >= 2200)) {
					if (local180 < 2000) {
						local913 = local865 ? Static110.aClass5_Sub2_Sub8_6 : Static42.aClass5_Sub2_Sub8_2;
					} else {
						local180 -= 1000;
						local31--;
						local913 = Static80.method1507(Static117.anIntArray481[local31]);
					}
					Static115.method2090(local913);
					if (local180 == 1100) {
						local31 -= 2;
						local913.anInt1265 = Static117.anIntArray481[local31];
						if (local913.anInt1265 > local913.anInt1241 - local913.anInt1260) {
							local913.anInt1265 = local913.anInt1241 - local913.anInt1260;
						}
						if (local913.anInt1265 < 0) {
							local913.anInt1265 = 0;
						}
						local913.anInt1244 = Static117.anIntArray481[local31 + 1];
						if (local913.anInt1232 - local913.anInt1243 < local913.anInt1244) {
							local913.anInt1244 = local913.anInt1232 - local913.anInt1243;
						}
						if (local913.anInt1244 < 0) {
							local913.anInt1244 = 0;
						}
						continue;
					}
					if (local180 == 1101) {
						local31--;
						local913.anInt1233 = Static117.anIntArray481[local31];
						continue;
					}
					if (local180 == 1102) {
						local31--;
						local913.aBoolean60 = Static117.anIntArray481[local31] == 1;
						continue;
					}
					if (local180 == 1103) {
						local31--;
						local913.anInt1259 = Static117.anIntArray481[local31];
						continue;
					}
					if (local180 == 1104) {
						local31--;
						local913.anInt1298 = Static117.anIntArray481[local31];
						continue;
					}
					if (local180 == 1105) {
						local31--;
						local913.anInt1237 = Static117.anIntArray481[local31];
						continue;
					}
					if (local180 == 1106) {
						local31--;
						local913.anInt1274 = Static117.anIntArray481[local31];
						continue;
					}
					if (local180 == 1107) {
						local31--;
						local913.aBoolean62 = Static117.anIntArray481[local31] == 1;
						continue;
					}
					if (local180 == 1108) {
						local913.anInt1291 = 1;
						local31--;
						local913.anInt1254 = Static117.anIntArray481[local31];
						continue;
					}
					if (local180 == 1109) {
						local31 -= 6;
						local913.anInt1297 = Static117.anIntArray481[local31];
						local913.anInt1286 = Static117.anIntArray481[local31 + 1];
						local913.anInt1266 = Static117.anIntArray481[local31 + 2];
						local913.anInt1235 = Static117.anIntArray481[local31 + 3];
						local913.anInt1270 = Static117.anIntArray481[local31 + 4];
						local913.anInt1281 = Static117.anIntArray481[local31 + 5];
						continue;
					}
					if (local180 == 1110) {
						local31--;
						local913.anInt1279 = Static117.anIntArray481[local31];
						continue;
					}
					if (local180 == 1111) {
						local31--;
						local913.aBoolean64 = Static117.anIntArray481[local31] == 1;
						continue;
					}
					if (local180 == 1112) {
						local41--;
						local913.aClass45_544 = Static14.aClass45Array4[local41];
						continue;
					}
					if (local180 == 1113) {
						local31--;
						local913.anInt1300 = Static117.anIntArray481[local31];
						continue;
					}
					if (local180 == 1114) {
						local31 -= 3;
						local913.anInt1280 = Static117.anIntArray481[local31];
						local913.anInt1238 = Static117.anIntArray481[local31 + 1];
						local913.anInt1242 = Static117.anIntArray481[local31 + 2];
						continue;
					}
					if (local180 == 1115) {
						local31--;
						local913.aBoolean61 = Static117.anIntArray481[local31] == 1;
						continue;
					}
					if (local180 == 1116) {
						local31--;
						local913.anInt1271 = Static117.anIntArray481[local31];
						continue;
					}
					if (local180 == 1117) {
						local31--;
						local913.anInt1272 = Static117.anIntArray481[local31];
						continue;
					}
					if (local180 == 1118) {
						local31--;
						local913.aBoolean65 = Static117.anIntArray481[local31] == 1;
						continue;
					}
					if (local180 == 1119) {
						local31--;
						local913.aBoolean59 = Static117.anIntArray481[local31] == 1;
						continue;
					}
					if (local180 == 1120) {
						local31 -= 2;
						local913.anInt1241 = Static117.anIntArray481[local31];
						local913.anInt1232 = Static117.anIntArray481[local31 + 1];
						continue;
					}
				} else if (local180 >= 1200 && local180 < 1300 || local180 >= 2200 && local180 < 2300) {
					if (local180 >= 2000) {
						local31--;
						local913 = Static80.method1507(Static117.anIntArray481[local31]);
						local180 -= 1000;
					} else {
						local913 = local865 ? Static110.aClass5_Sub2_Sub8_6 : Static42.aClass5_Sub2_Sub8_2;
					}
					Static115.method2090(local913);
					if (local180 == 1200) {
						local31 -= 2;
						local737 = Static117.anIntArray481[local31];
						local1389 = Static117.anIntArray481[local31 + 1];
						local913.anInt1285 = local1389;
						local913.anInt1289 = local737;
						@Pc(1399) Class5_Sub2_Sub3 local1399 = Static81.method1515(local737);
						local913.anInt1266 = local1399.anInt246;
						local913.anInt1286 = local1399.anInt249;
						local913.anInt1235 = local1399.anInt269;
						local913.anInt1297 = local1399.anInt270;
						local913.anInt1281 = local1399.anInt237;
						if (local913.anInt1260 > 0) {
							local913.anInt1281 = local913.anInt1281 * 32 / local913.anInt1260;
						}
						local913.anInt1270 = local1399.anInt253;
						continue;
					}
					if (local180 == 1201) {
						local913.anInt1291 = 2;
						local31--;
						local913.anInt1254 = Static117.anIntArray481[local31];
						continue;
					}
					if (local180 == 1202) {
						local913.anInt1291 = 3;
						local913.anInt1254 = Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.aClass32_2.method868();
						continue;
					}
				} else if (local180 >= 1300 && local180 < 1400 || local180 >= 2300 && local180 < 2400) {
					if (local180 >= 2000) {
						local180 -= 1000;
						local31--;
						local913 = Static80.method1507(Static117.anIntArray481[local31]);
					} else {
						local913 = local865 ? Static110.aClass5_Sub2_Sub8_6 : Static42.aClass5_Sub2_Sub8_2;
					}
					if (local180 == 1300) {
						local31--;
						local737 = Static117.anIntArray481[local31] - 1;
						if (local737 >= 0 && local737 <= 9) {
							local41--;
							local913.method952(local737, Static14.aClass45Array4[local41]);
							continue;
						}
						local41--;
						continue;
					}
					if (local180 == 1301) {
						local31 -= 2;
						local737 = Static117.anIntArray481[local31];
						local1389 = Static117.anIntArray481[local31 + 1];
						local913.aClass5_Sub2_Sub8_3 = Static38.method798(local737, local1389);
						continue;
					}
					if (local180 == 1302) {
						local31--;
						local913.aBoolean69 = Static117.anIntArray481[local31] == 1;
						continue;
					}
					if (local180 == 1303) {
						local31--;
						local913.anInt1295 = Static117.anIntArray481[local31];
						continue;
					}
					if (local180 == 1304) {
						local31--;
						local913.anInt1293 = Static117.anIntArray481[local31];
						continue;
					}
					if (local180 == 1305) {
						local41--;
						local913.aClass45_545 = Static14.aClass45Array4[local41];
						continue;
					}
					if (local180 == 1306) {
						local41--;
						local913.aClass45_548 = Static14.aClass45Array4[local41];
						continue;
					}
				} else {
					@Pc(1888) Class45 local1888;
					if (local180 >= 1400 && local180 < 1500 || local180 >= 2400 && local180 < 2500) {
						if (local180 < 2000) {
							local913 = local865 ? Static110.aClass5_Sub2_Sub8_6 : Static42.aClass5_Sub2_Sub8_2;
						} else {
							local180 -= 1000;
							local31--;
							local913 = Static80.method1507(Static117.anIntArray481[local31]);
						}
						local41--;
						local1888 = Static14.aClass45Array4[local41];
						@Pc(3776) Object[] local3776 = new Object[local1888.method1317() + 1];
						for (local601 = local3776.length - 1; local601 >= 1; local601--) {
							if (local1888.method1324(local601 - 1) == 115) {
								local41--;
								local3776[local601] = Static14.aClass45Array4[local41];
							} else {
								local31--;
								local3776[local601] = Integer.valueOf(Static117.anIntArray481[local31]);
							}
						}
						local31--;
						local3776[0] = Integer.valueOf(Static117.anIntArray481[local31]);
						if (local180 == 1407) {
							local913.anObjectArray9 = local3776;
						}
						if (local180 == 1404) {
							local913.anObjectArray5 = local3776;
						}
						if (local180 == 1400) {
							local913.anObjectArray15 = local3776;
						}
						if (local180 == 1410) {
							local913.anObjectArray18 = local3776;
						}
						if (local180 == 1408) {
							local913.anObjectArray12 = local3776;
						}
						if (local180 == 1406) {
							local913.anObjectArray7 = local3776;
						}
						if (local180 == 1414) {
							local913.anObjectArray8 = local3776;
						}
						if (local180 == 1417) {
							local913.anObjectArray16 = local3776;
						}
						if (local180 == 1411) {
							local913.anObjectArray21 = local3776;
						}
						if (local180 == 1413) {
							local913.anObjectArray3 = local3776;
						}
						if (local180 == 1402) {
							local913.anObjectArray4 = local3776;
						}
						if (local180 == 1416) {
							local913.anObjectArray20 = local3776;
						}
						if (local180 == 1412) {
							local913.anObjectArray13 = local3776;
						}
						local913.aBoolean70 = true;
						if (local180 == 1415) {
							local913.anObjectArray6 = local3776;
						}
						if (local180 == 1409) {
							local913.anObjectArray19 = local3776;
						}
						if (local180 == 1403) {
							local913.anObjectArray17 = local3776;
						}
						if (local180 == 1405) {
							local913.anObjectArray11 = local3776;
						}
						if (local180 == 1401) {
							local913.anObjectArray14 = local3776;
						}
						continue;
					}
					if (local180 < 1600) {
						local913 = local865 ? Static110.aClass5_Sub2_Sub8_6 : Static42.aClass5_Sub2_Sub8_2;
						if (local180 == 1500) {
							Static117.anIntArray481[local31++] = local913.anInt1252;
							continue;
						}
						if (local180 == 1501) {
							Static117.anIntArray481[local31++] = local913.anInt1294;
							continue;
						}
						if (local180 == 1502) {
							Static117.anIntArray481[local31++] = local913.anInt1260;
							continue;
						}
						if (local180 == 1503) {
							Static117.anIntArray481[local31++] = local913.anInt1243;
							continue;
						}
						if (local180 == 1504) {
							Static117.anIntArray481[local31++] = local913.aBoolean68 ? 1 : 0;
							continue;
						}
						if (local180 == 1505) {
							Static117.anIntArray481[local31++] = local913.anInt1301;
							continue;
						}
					} else if (local180 < 1700) {
						local913 = local865 ? Static110.aClass5_Sub2_Sub8_6 : Static42.aClass5_Sub2_Sub8_2;
						if (local180 == 1600) {
							Static117.anIntArray481[local31++] = local913.anInt1265;
							continue;
						}
						if (local180 == 1601) {
							Static117.anIntArray481[local31++] = local913.anInt1244;
							continue;
						}
						if (local180 == 1602) {
							Static14.aClass45Array4[local41++] = local913.aClass45_544;
							continue;
						}
						if (local180 == 1603) {
							Static117.anIntArray481[local31++] = local913.anInt1241;
							continue;
						}
						if (local180 == 1604) {
							Static117.anIntArray481[local31++] = local913.anInt1232;
							continue;
						}
						if (local180 == 1605) {
							Static117.anIntArray481[local31++] = local913.anInt1281;
							continue;
						}
					} else if (local180 < 1800) {
						local913 = local865 ? Static110.aClass5_Sub2_Sub8_6 : Static42.aClass5_Sub2_Sub8_2;
						if (local180 == 1700) {
							Static117.anIntArray481[local31++] = local913.anInt1289;
							continue;
						}
						if (local180 == 1701) {
							if (local913.anInt1289 == -1) {
								Static117.anIntArray481[local31++] = 0;
							} else {
								Static117.anIntArray481[local31++] = local913.anInt1285;
							}
							continue;
						}
						if (local180 == 1702) {
							Static117.anIntArray481[local31++] = local913.anInt1288;
							continue;
						}
					} else if (local180 < 1900) {
						local913 = local865 ? Static110.aClass5_Sub2_Sub8_6 : Static42.aClass5_Sub2_Sub8_2;
						if (local180 == 1800) {
							Static117.anIntArray481[local31++] = Static13.method268(Static74.method1700(local913));
							continue;
						}
					} else if (local180 < 2600) {
						local31--;
						local913 = Static80.method1507(Static117.anIntArray481[local31]);
						if (local180 == 2500) {
							Static117.anIntArray481[local31++] = local913.anInt1252;
							continue;
						}
						if (local180 == 2501) {
							Static117.anIntArray481[local31++] = local913.anInt1294;
							continue;
						}
						if (local180 == 2502) {
							Static117.anIntArray481[local31++] = local913.anInt1260;
							continue;
						}
						if (local180 == 2503) {
							Static117.anIntArray481[local31++] = local913.anInt1243;
							continue;
						}
						if (local180 == 2504) {
							Static117.anIntArray481[local31++] = local913.aBoolean68 ? 1 : 0;
							continue;
						}
						if (local180 == 2505) {
							Static117.anIntArray481[local31++] = local913.anInt1301;
							continue;
						}
					} else if (local180 < 2700) {
						local31--;
						local913 = Static80.method1507(Static117.anIntArray481[local31]);
						if (local180 == 2600) {
							Static117.anIntArray481[local31++] = local913.anInt1265;
							continue;
						}
						if (local180 == 2601) {
							Static117.anIntArray481[local31++] = local913.anInt1244;
							continue;
						}
						if (local180 == 2602) {
							Static14.aClass45Array4[local41++] = local913.aClass45_544;
							continue;
						}
						if (local180 == 2603) {
							Static117.anIntArray481[local31++] = local913.anInt1241;
							continue;
						}
						if (local180 == 2604) {
							Static117.anIntArray481[local31++] = local913.anInt1232;
							continue;
						}
						if (local180 == 2605) {
							Static117.anIntArray481[local31++] = local913.anInt1281;
							continue;
						}
					} else if (local180 < 2800) {
						local31--;
						local913 = Static80.method1507(Static117.anIntArray481[local31]);
						if (local180 == 2700) {
							Static117.anIntArray481[local31++] = local913.anInt1289;
							continue;
						}
						if (local180 == 2701) {
							if (local913.anInt1289 == -1) {
								Static117.anIntArray481[local31++] = 0;
							} else {
								Static117.anIntArray481[local31++] = local913.anInt1285;
							}
							continue;
						}
					} else if (local180 < 2900) {
						local31--;
						local913 = Static80.method1507(Static117.anIntArray481[local31]);
						if (local180 == 2800) {
							Static117.anIntArray481[local31++] = Static13.method268(Static74.method1700(local913));
							continue;
						}
					} else if (local180 < 3200) {
						if (local180 == 3100) {
							local41--;
							local557 = Static14.aClass45Array4[local41];
							Static7.method138(local557, Static54.aClass45_651, 0);
							continue;
						}
						if (local180 == 3101) {
							local31 -= 2;
							Static71.method1385(Static117.anIntArray481[local31 + 1], Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1, Static117.anIntArray481[local31]);
							continue;
						}
						if (local180 == 3102) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							if (local732 >= 0 && Static57.anIntArray262.length > local732 && Static57.anIntArray262[local732] != -1) {
								Static53.anInt2372 = local732;
								Static72.aBoolean99 = true;
								Static78.aBoolean102 = true;
							}
							continue;
						}
						if (local180 == 3103) {
							Static110.method1983();
							continue;
						}
					} else if (local180 < 3300) {
						if (local180 == 3200) {
							local31 -= 3;
							Static72.method1461(Static117.anIntArray481[local31 + 2], Static117.anIntArray481[local31], Static117.anIntArray481[local31 + 1]);
							continue;
						}
						if (local180 == 3201) {
							local31--;
							Static37.method792(Static117.anIntArray481[local31]);
							continue;
						}
						if (local180 == 3202) {
							local31 -= 2;
							Static25.method556(Static117.anIntArray481[local31], Static117.anIntArray481[local31 + 1]);
							continue;
						}
					} else if (local180 < 3400) {
						if (local180 == 3300) {
							Static117.anIntArray481[local31++] = Static3.anInt94;
							continue;
						}
						if (local180 == 3301) {
							local31 -= 2;
							local737 = Static117.anIntArray481[local31 + 1];
							local732 = Static117.anIntArray481[local31];
							Static117.anIntArray481[local31++] = Static36.method765(local732, local737);
							continue;
						}
						if (local180 == 3302) {
							local31 -= 2;
							local737 = Static117.anIntArray481[local31 + 1];
							local732 = Static117.anIntArray481[local31];
							Static117.anIntArray481[local31++] = Static51.method1126(local737, local732);
							continue;
						}
						if (local180 == 3303) {
							local31 -= 2;
							local732 = Static117.anIntArray481[local31];
							local737 = Static117.anIntArray481[local31 + 1];
							Static117.anIntArray481[local31++] = Static112.method2040(local732, local737);
							continue;
						}
						if (local180 == 3304) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							Static117.anIntArray481[local31++] = Static93.method1729(local732).anInt2832;
							continue;
						}
						if (local180 == 3305) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							Static117.anIntArray481[local31++] = Static23.anIntArray130[local732];
							continue;
						}
						if (local180 == 3306) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							Static117.anIntArray481[local31++] = Static57.anIntArray260[local732];
							continue;
						}
						if (local180 == 3307) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							Static117.anIntArray481[local31++] = Static52.anIntArray488[local732];
							continue;
						}
						if (local180 == 3308) {
							local732 = Static8.anInt262;
							local737 = (Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428 >> 7) + Static78.anInt2210;
							local1389 = Static6.anInt162 + (Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417 >> 7);
							Static117.anIntArray481[local31++] = (local737 << 14) + (local732 << 28) + local1389;
							continue;
						}
						if (local180 == 3309) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							Static117.anIntArray481[local31++] = local732 >> 14 & 0x3FFF;
							continue;
						}
						if (local180 == 3310) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							Static117.anIntArray481[local31++] = local732 >> 28;
							continue;
						}
						if (local180 == 3311) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							Static117.anIntArray481[local31++] = local732 & 0x3FFF;
							continue;
						}
						if (local180 == 3312) {
							Static117.anIntArray481[local31++] = Static68.aBoolean95 ? 1 : 0;
							continue;
						}
						if (local180 == 3313) {
							local31 -= 2;
							local732 = Static117.anIntArray481[local31] + 32768;
							local737 = Static117.anIntArray481[local31 + 1];
							Static117.anIntArray481[local31++] = Static36.method765(local732, local737);
							continue;
						}
						if (local180 == 3314) {
							local31 -= 2;
							local732 = Static117.anIntArray481[local31] + 32768;
							local737 = Static117.anIntArray481[local31 + 1];
							Static117.anIntArray481[local31++] = Static51.method1126(local737, local732);
							continue;
						}
						if (local180 == 3315) {
							local31 -= 2;
							local732 = Static117.anIntArray481[local31] + 32768;
							local737 = Static117.anIntArray481[local31 + 1];
							Static117.anIntArray481[local31++] = Static112.method2040(local732, local737);
							continue;
						}
					} else if (local180 < 3700) {
						if (local180 == 3600) {
							if (Static62.anInt1817 == 0) {
								Static117.anIntArray481[local31++] = -2;
							} else if (Static62.anInt1817 == 1) {
								Static117.anIntArray481[local31++] = -1;
							} else {
								Static117.anIntArray481[local31++] = Static104.anInt2772;
							}
							continue;
						}
						if (local180 == 3601) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							if (Static62.anInt1817 == 2 && local732 < Static104.anInt2772) {
								Static14.aClass45Array4[local41++] = Static21.aClass45Array7[local732];
								continue;
							}
							Static14.aClass45Array4[local41++] = Static54.aClass45_651;
							continue;
						}
						if (local180 == 3602) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							if (Static62.anInt1817 == 2 && local732 < Static104.anInt2772) {
								Static117.anIntArray481[local31++] = Static56.anIntArray257[local732];
								continue;
							}
							Static117.anIntArray481[local31++] = 0;
							continue;
						}
						if (local180 == 3603) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							if (Static62.anInt1817 == 2 && local732 < Static104.anInt2772) {
								Static117.anIntArray481[local31++] = Static9.anIntArray41[local732];
								continue;
							}
							Static117.anIntArray481[local31++] = 0;
							continue;
						}
						if (local180 == 3604) {
							local31--;
							local737 = Static117.anIntArray481[local31];
							local41--;
							local557 = Static14.aClass45Array4[local41];
							Static52.method2147(local737, local557);
							continue;
						}
					} else if (local180 < 4100) {
						if (local180 == 4000) {
							local31 -= 2;
							local732 = Static117.anIntArray481[local31];
							local737 = Static117.anIntArray481[local31 + 1];
							Static117.anIntArray481[local31++] = local737 + local732;
							continue;
						}
						if (local180 == 4001) {
							local31 -= 2;
							local732 = Static117.anIntArray481[local31];
							local737 = Static117.anIntArray481[local31 + 1];
							Static117.anIntArray481[local31++] = local732 - local737;
							continue;
						}
						if (local180 == 4002) {
							local31 -= 2;
							local737 = Static117.anIntArray481[local31 + 1];
							local732 = Static117.anIntArray481[local31];
							Static117.anIntArray481[local31++] = local732 * local737;
							continue;
						}
						if (local180 == 4003) {
							local31 -= 2;
							local737 = Static117.anIntArray481[local31 + 1];
							local732 = Static117.anIntArray481[local31];
							Static117.anIntArray481[local31++] = local732 / local737;
							continue;
						}
						if (local180 == 4004) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							Static117.anIntArray481[local31++] = (int) ((double) local732 * Math.random());
							continue;
						}
						if (local180 == 4005) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							Static117.anIntArray481[local31++] = (int) ((double) (local732 + 1) * Math.random());
							continue;
						}
						if (local180 == 4006) {
							local31 -= 5;
							local732 = Static117.anIntArray481[local31];
							local737 = Static117.anIntArray481[local31 + 1];
							local1389 = Static117.anIntArray481[local31 + 2];
							local621 = Static117.anIntArray481[local31 + 4];
							local601 = Static117.anIntArray481[local31 + 3];
							Static117.anIntArray481[local31++] = (local621 - local1389) * (local737 - local732) / (local601 - local1389) + local732;
							continue;
						}
						if (local180 == 4007) {
							local31 -= 2;
							local732 = Static117.anIntArray481[local31];
							local737 = Static117.anIntArray481[local31 + 1];
							Static117.anIntArray481[local31++] = local737 * local732 / 100 + local732;
							continue;
						}
						if (local180 == 4008) {
							local31 -= 2;
							local737 = Static117.anIntArray481[local31 + 1];
							local732 = Static117.anIntArray481[local31];
							Static117.anIntArray481[local31++] = 0x1 << local737 | local732;
							continue;
						}
						if (local180 == 4009) {
							local31 -= 2;
							local732 = Static117.anIntArray481[local31];
							local737 = Static117.anIntArray481[local31 + 1];
							Static117.anIntArray481[local31++] = -(0x1 << local737) - 1 & local732;
							continue;
						}
						if (local180 == 4010) {
							local31 -= 2;
							local732 = Static117.anIntArray481[local31];
							local737 = Static117.anIntArray481[local31 + 1];
							Static117.anIntArray481[local31++] = (0x1 << local737 & local732) == 0 ? 0 : 1;
							continue;
						}
						if (local180 == 4011) {
							local31 -= 2;
							local732 = Static117.anIntArray481[local31];
							local737 = Static117.anIntArray481[local31 + 1];
							Static117.anIntArray481[local31++] = local732 % local737;
							continue;
						}
						if (local180 == 4012) {
							local31 -= 2;
							local732 = Static117.anIntArray481[local31];
							local737 = Static117.anIntArray481[local31 + 1];
							if (local732 == 0) {
								Static117.anIntArray481[local31++] = 0;
							} else {
								Static117.anIntArray481[local31++] = (int) Math.pow((double) local732, (double) local737);
							}
							continue;
						}
						if (local180 == 4013) {
							local31 -= 2;
							local732 = Static117.anIntArray481[local31];
							local737 = Static117.anIntArray481[local31 + 1];
							if (local732 == 0) {
								Static117.anIntArray481[local31++] = 0;
							} else if (local737 == 0) {
								Static117.anIntArray481[local31++] = Integer.MAX_VALUE;
							} else {
								Static117.anIntArray481[local31++] = (int) Math.pow((double) local732, 1.0D / (double) local737);
							}
							continue;
						}
						if (local180 == 4014) {
							local31 -= 2;
							local732 = Static117.anIntArray481[local31];
							local737 = Static117.anIntArray481[local31 + 1];
							Static117.anIntArray481[local31++] = local737 & local732;
							continue;
						}
						if (local180 == 4015) {
							local31 -= 2;
							local732 = Static117.anIntArray481[local31];
							local737 = Static117.anIntArray481[local31 + 1];
							Static117.anIntArray481[local31++] = local732 | local737;
							continue;
						}
					} else if (local180 < 4200) {
						if (local180 == 4100) {
							local31--;
							local737 = Static117.anIntArray481[local31];
							local41--;
							local557 = Static14.aClass45Array4[local41];
							Static14.aClass45Array4[local41++] = Static39.method1443(new Class45[] { local557, Static76.method1476(local737) });
							continue;
						}
						if (local180 == 4101) {
							local41 -= 2;
							local557 = Static14.aClass45Array4[local41];
							local1888 = Static14.aClass45Array4[local41 + 1];
							Static14.aClass45Array4[local41++] = Static39.method1443(new Class45[] { local557, local1888 });
							continue;
						}
						if (local180 == 4102) {
							local31--;
							local737 = Static117.anIntArray481[local31];
							local41--;
							local557 = Static14.aClass45Array4[local41];
							Static14.aClass45Array4[local41++] = Static39.method1443(new Class45[] { local557, Static59.method1211(local737) });
							continue;
						}
						if (local180 == 4103) {
							local41--;
							local557 = Static14.aClass45Array4[local41];
							Static14.aClass45Array4[local41++] = local557.method1327();
							continue;
						}
						if (local180 == 4104) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							@Pc(1978) long local1978 = ((long) local732 + 11745L) * 86400000L;
							Static40.aCalendar1.setTime(new Date(local1978));
							local601 = Static40.aCalendar1.get(5);
							local621 = Static40.aCalendar1.get(2);
							local1996 = Static40.aCalendar1.get(1);
							Static14.aClass45Array4[local41++] = Static39.method1443(new Class45[] { Static76.method1476(local601), Static61.aClass45_761, Static17.aClass45Array6[local621], Static61.aClass45_761, Static76.method1476(local1996) });
							continue;
						}
						if (local180 == 4105) {
							local41 -= 2;
							local557 = Static14.aClass45Array4[local41];
							local1888 = Static14.aClass45Array4[local41 + 1];
							if (Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.aClass32_2 != null && Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.aClass32_2.aBoolean56) {
								Static14.aClass45Array4[local41++] = local1888;
								continue;
							}
							Static14.aClass45Array4[local41++] = local557;
							continue;
						}
						if (local180 == 4106) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							Static14.aClass45Array4[local41++] = Static76.method1476(local732);
							continue;
						}
						if (local180 == 4107) {
							local41 -= 2;
							Static117.anIntArray481[local31++] = Static14.aClass45Array4[local41].method1312(Static14.aClass45Array4[local41 + 1]);
							continue;
						}
						@Pc(2133) byte[] local2133;
						@Pc(2138) Class5_Sub2_Sub6_Sub1 local2138;
						if (local180 == 4108) {
							local31 -= 2;
							local41--;
							local557 = Static14.aClass45Array4[local41];
							local737 = Static117.anIntArray481[local31];
							local1389 = Static117.anIntArray481[local31 + 1];
							local2133 = Static92.aClass29_Sub1_50.method733(0, local1389);
							local2138 = new Class5_Sub2_Sub6_Sub1(local2133);
							Static117.anIntArray481[local31++] = local2138.method511(local557, local737);
							continue;
						}
						if (local180 == 4109) {
							local41--;
							local557 = Static14.aClass45Array4[local41];
							local31 -= 2;
							local1389 = Static117.anIntArray481[local31 + 1];
							local737 = Static117.anIntArray481[local31];
							local2133 = Static92.aClass29_Sub1_50.method733(0, local1389);
							local2138 = new Class5_Sub2_Sub6_Sub1(local2133);
							Static117.anIntArray481[local31++] = local2138.method510(local557, local737);
							continue;
						}
					} else if (local180 < 4300) {
						if (local180 == 4200) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							Static14.aClass45Array4[local41++] = Static81.method1515(local732).aClass45_108;
							continue;
						}
						@Pc(2231) Class5_Sub2_Sub3 local2231;
						if (local180 == 4201) {
							local31 -= 2;
							local732 = Static117.anIntArray481[local31];
							local737 = Static117.anIntArray481[local31 + 1];
							local2231 = Static81.method1515(local732);
							if (local737 >= 1 && local737 <= 5 && local2231.aClass45Array2[local737 - 1] != null) {
								Static14.aClass45Array4[local41++] = local2231.aClass45Array2[local737 - 1];
								continue;
							}
							Static14.aClass45Array4[local41++] = Static54.aClass45_651;
							continue;
						}
						if (local180 == 4202) {
							local31 -= 2;
							local732 = Static117.anIntArray481[local31];
							local737 = Static117.anIntArray481[local31 + 1];
							local2231 = Static81.method1515(local732);
							if (local737 >= 1 && local737 <= 5 && local2231.aClass45Array1[local737 - 1] != null) {
								Static14.aClass45Array4[local41++] = local2231.aClass45Array1[local737 - 1];
								continue;
							}
							Static14.aClass45Array4[local41++] = Static54.aClass45_651;
							continue;
						}
						if (local180 == 4203) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							Static117.anIntArray481[local31++] = Static81.method1515(local732).anInt241;
							continue;
						}
						if (local180 == 4204) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							Static117.anIntArray481[local31++] = Static81.method1515(local732).anInt268 == 1 ? 1 : 0;
							continue;
						}
						@Pc(2374) Class5_Sub2_Sub3 local2374;
						if (local180 == 4205) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							local2374 = Static81.method1515(local732);
							if (local2374.anInt275 == -1 && local2374.anInt232 >= 0) {
								Static117.anIntArray481[local31++] = local2374.anInt232;
								continue;
							}
							Static117.anIntArray481[local31++] = local732;
							continue;
						}
						if (local180 == 4206) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							local2374 = Static81.method1515(local732);
							if (local2374.anInt275 >= 0 && local2374.anInt232 >= 0) {
								Static117.anIntArray481[local31++] = local2374.anInt232;
								continue;
							}
							Static117.anIntArray481[local31++] = local732;
							continue;
						}
						if (local180 == 4207) {
							local31--;
							local732 = Static117.anIntArray481[local31];
							Static117.anIntArray481[local31++] = Static81.method1515(local732).aBoolean9 ? 1 : 0;
							continue;
						}
					}
				}
				Static53.method1609("CS2 - nosuchop:" + local180, null);
				return;
			}
		} catch (@Pc(4410) Exception local4410) {
			Static53.method1609("CS2 - scr:" + local15.aLong146 + " op:" + local43, local4410);
		}
	}
}
