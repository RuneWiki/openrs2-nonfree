import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!us", name = "kb", descriptor = "F")
	public static float aFloat120;

	@OriginalMember(owner = "client!us", name = "ab", descriptor = "Z")
	public static boolean aBoolean462 = false;

	@OriginalMember(owner = "client!us", name = "ob", descriptor = "Z")
	public static boolean aBoolean463 = true;

	@OriginalMember(owner = "client!us", name = "pb", descriptor = "Lclient!s;")
	public static final Class217 aClass217_149 = new Class217(43, -2);

	@OriginalMember(owner = "client!us", name = "qb", descriptor = "[[I")
	public static final int[][] anIntArrayArray66 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!us", name = "rb", descriptor = "I")
	public static int anInt7040 = 0;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BILclient!za;)Z")
	public static boolean method5511(@OriginalArg(1) int arg0, @OriginalArg(2) Class50 arg1) {
		@Pc(11) int local11 = (Static2.anInt7 - 104) / 2;
		@Pc(17) int local17 = (Static17.anInt315 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(34) int local34;
		@Pc(45) int local45;
		for (@Pc(26) int local26 = local11; local26 < local11 + 104; local26++) {
			for (@Pc(30) int local30 = local17; local30 < local17 + 104; local30++) {
				for (local34 = arg0; local34 <= 3; local34++) {
					if (Static28.method367(local34, arg0, local30, local26)) {
						local45 = local34;
						if (Static178.method2948(local30, local26)) {
							local45 = local34 - 1;
						}
						if (local45 >= 0) {
							local19 &= Static157.method2654(local45, local30, local26);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(97) int[] local97 = new int[262144];
		for (local34 = 0; local34 < local97.length; local34++) {
			local97[local34] = -16777216;
		}
		Static162.aClass80_7 = arg1.method5823(local97, 512, 512, 512);
		Static298.method4145();
		local45 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D)) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(171) int local171 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(190) int local190 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(194) boolean[][] local194 = new boolean[Static287.anInt5022][Static287.anInt5022];
		@Pc(200) int local200;
		@Pc(217) int local217;
		@Pc(221) int local221;
		@Pc(225) int local225;
		@Pc(276) int local276;
		@Pc(282) int local282;
		@Pc(286) int local286;
		@Pc(305) int local305;
		for (@Pc(196) int local196 = local11; local196 < local11 + 104; local196 += Static287.anInt5022) {
			for (local200 = local17; local200 < local17 + 104; local200 += Static287.anInt5022) {
				arg1.ba(0, 0, Static287.anInt5022 * 4, Static287.anInt5022 * 4);
				arg1.t(-16777216);
				for (local217 = arg0; local217 <= 3; local217++) {
					for (local221 = 0; local221 < Static287.anInt5022; local221++) {
						for (local225 = 0; local225 < Static287.anInt5022; local225++) {
							local194[local221][local225] = Static28.method367(local217, arg0, local200 + local225, local196 + local221);
						}
					}
					Static256.aClass154Array2[local217].method6075(local196, local200, local196 + Static287.anInt5022, local200 - -Static287.anInt5022, local194);
					if (!Static66.aBoolean75) {
						for (local225 = -4; local225 < Static287.anInt5022; local225++) {
							for (local276 = -4; local276 < Static287.anInt5022; local276++) {
								local282 = local225 + local196;
								local286 = local276 + local200;
								if (local282 >= local11 && local286 >= local17 && Static28.method367(local217, arg0, local286, local282)) {
									local305 = local217;
									if (Static178.method2948(local286, local282)) {
										local305 = local217 - 1;
									}
									if (local305 >= 0) {
										Static97.method1068(local286, local171, local45, arg1, local305, (Static287.anInt5022 - local276) * 4 - 4, local282, local225 * 4);
									}
								}
							}
						}
					}
				}
				if (Static66.aBoolean75) {
					@Pc(359) Class220 local359 = Static11.aClass220Array1[arg0];
					for (local225 = 0; local225 < Static287.anInt5022; local225++) {
						for (local276 = 0; local276 < Static287.anInt5022; local276++) {
							local282 = local196 + local225;
							local286 = local276 + local200;
							local305 = local359.anIntArrayArray56[local282 - local359.anInt6196][local286 - local359.anInt6189];
							if ((local305 & 0x40240000) != 0) {
								arg1.method5853((Static287.anInt5022 - local276) * 4 - 4, local225 * 4, -1713569622, 4, 4);
							} else if ((local305 & 0x800000) != 0) {
								arg1.method5870(4, -1713569622, (Static287.anInt5022 - local276) * 4 - 4, local225 * 4);
							} else if ((local305 & 0x2000000) != 0) {
								arg1.method5831(4, local225 * 4 + 3, (-local276 + Static287.anInt5022) * 4 - 4, -1713569622);
							} else if ((local305 & 0x8000000) != 0) {
								arg1.method5870(4, -1713569622, (Static287.anInt5022 - local276) * 4 - 1, local225 * 4);
							} else if ((local305 & 0x20000000) != 0) {
								arg1.method5831(4, local225 * 4, (Static287.anInt5022 - local276) * 4 - 4, -1713569622);
							}
						}
					}
				}
				arg1.P(0, 0, Static287.anInt5022 * 4, Static287.anInt5022 * 4, local190, 2);
				Static162.aClass80_7.XA((local196 - local11) * 4 + 48, -((local200 + -local17) * 4) + 464 + -(Static287.anInt5022 * 4), Static287.anInt5022 * 4, Static287.anInt5022 * 4, 0, 0);
			}
		}
		arg1.va();
		arg1.t(-16777215);
		Static448.method5473();
		Static328.anInt7217 = 0;
		Static70.aClass163_14.method3619();
		if (!Static66.aBoolean75) {
			for (local200 = local11; local200 < local11 + 104; local200++) {
				for (local217 = local17; local217 < local17 + 104; local217++) {
					for (local221 = arg0; local221 <= arg0 + 1 && local221 <= 3; local221++) {
						if (Static28.method367(local221, arg0, local217, local200)) {
							@Pc(623) Interface10 local623 = (Interface10) Static447.method5138(local221, local200, local217);
							if (local623 == null) {
								local623 = (Interface10) Static106.method1867(local221, local200, local217, rj.class);
							}
							if (local623 == null) {
								local623 = (Interface10) Static96.method1755(local221, local200, local217);
							}
							if (local623 == null) {
								local623 = (Interface10) Static137.method2391(local221, local200, local217);
							}
							if (local623 != null) {
								@Pc(664) Class126 local664 = Static342.aClass237_4.method5212(local623.method5706());
								if (!local664.aBoolean255 || Static175.aBoolean118) {
									local282 = local664.anInt3792;
									if (local664.anIntArray380 != null) {
										for (local286 = 0; local286 < local664.anIntArray380.length; local286++) {
											if (local664.anIntArray380[local286] != -1) {
												@Pc(693) Class126 local693 = Static342.aClass237_4.method5212(local664.anIntArray380[local286]);
												if (local693.anInt3792 >= 0) {
													local282 = local693.anInt3792;
												}
											}
										}
									}
									if (local282 >= 0) {
										@Pc(715) boolean local715 = false;
										if (local282 >= 0) {
											@Pc(725) Class208 local725 = Static300.aClass88_3.method2268(local282);
											if (local725 != null && local725.aBoolean387) {
												local715 = true;
											}
										}
										local305 = local200;
										@Pc(736) int local736 = local217;
										if (local715) {
											@Pc(743) int[][] local743 = Static11.aClass220Array1[local221].anIntArrayArray56;
											@Pc(748) int local748 = Static11.aClass220Array1[local221].anInt6196;
											@Pc(753) int local753 = Static11.aClass220Array1[local221].anInt6189;
											for (@Pc(755) int local755 = 0; local755 < 10; local755++) {
												@Pc(762) int local762 = (int) (Math.random() * 4.0D);
												if (local762 == 0 && local11 < local305 && local200 - 3 < local305 && (local743[local305 - local748 - 1][local736 - local753] & 0x2C0108) == 0) {
													local305--;
												}
												if (local762 == 1 && local11 + 104 - 1 > local305 && local305 < local200 + 3 && (local743[local305 + 1 - local748][local736 - local753] & 0x2C0180) == 0) {
													local305++;
												}
												if (local762 == 2 && local736 > local17 && local217 - 3 < local736 && (local743[local305 - local748][local736 - local753 - 1] & 0x2C0102) == 0) {
													local736--;
												}
												if (local762 == 3 && local736 < local17 + 104 - 1 && local217 + 3 > local736 && (local743[local305 - local748][local736 + 1 - local753] & 0x2C0120) == 0) {
													local736++;
												}
											}
										}
										Static47.anIntArray69[Static328.anInt7217] = local664.anInt3798;
										Static219.anIntArray412[Static328.anInt7217] = local305;
										Static307.anIntArray514[Static328.anInt7217] = local736;
										Static328.anInt7217++;
									}
								}
							}
						}
					}
				}
			}
			if (Static33.aClass125_5 != null) {
				Static255.aClass187_81.anInt5387 = 1;
				Static300.aClass88_3.method2270(64, 1024);
				for (local217 = 0; local217 < Static33.aClass125_5.anInt3753; local217++) {
					local221 = Static33.aClass125_5.anIntArray379[local217];
					if (Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98 == local221 >> 28) {
						local225 = (local221 >> 14 & 0x3FFF) - Static168.anInt3353;
						local276 = (local221 & 0x3FFF) - Static72.anInt1488;
						if (local225 >= 0 && Static2.anInt7 > local225 && local276 >= 0 && Static17.anInt315 > local276) {
							Static70.aClass163_14.method3613(new Class10_Sub12(local217));
						} else {
							@Pc(1037) Class208 local1037 = Static300.aClass88_3.method2268(Static33.aClass125_5.anIntArray378[local217]);
							if (local1037.anIntArray574 != null && local225 + local1037.anInt6017 >= 0 && local225 + local1037.anInt6008 < Static2.anInt7 && local276 + local1037.anInt6010 >= 0 && local276 + local1037.anInt6012 < Static17.anInt315) {
								Static70.aClass163_14.method3613(new Class10_Sub12(local217));
							}
						}
					}
				}
				Static300.aClass88_3.method2270(64, 128);
				Static255.aClass187_81.anInt5387 = 2;
				Static255.aClass187_81.method4285();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!qi;)V")
	public static void method5515(@OriginalArg(0) Class24_Sub3 arg0) {
		for (@Pc(2) int local2 = arg0.aShort107; local2 <= arg0.aShort106; local2++) {
			for (@Pc(6) int local6 = arg0.aShort105; local6 <= arg0.aShort104; local6++) {
				@Pc(16) Class11 local16 = Static309.aClass11ArrayArrayArray2[arg0.aByte98][local2][local6];
				if (local16 != null) {
					@Pc(21) Class1 local21 = local16.aClass1_3;
					@Pc(23) Class1 local23 = null;
					while (local21 != null) {
						if (local21.aClass24_Sub3_1 == arg0) {
							if (local23 == null) {
								local16.aClass1_3 = local21.aClass1_1;
							} else {
								local23.aClass1_1 = local21.aClass1_1;
							}
							local21.method2();
							break;
						}
						local23 = local21;
						local21 = local21.aClass1_1;
					}
					local16.aByte4 = 0;
					for (@Pc(56) Class1 local56 = local16.aClass1_3; local56 != null; local56 = local56.aClass1_1) {
						local16.aByte4 = (byte) (local16.aByte4 | local56.anInt1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!i;III[Z)Z")
	public static boolean method5516(@OriginalArg(0) Class10_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static332.aClass154Array3 != Static173.aClass154Array1) {
			@Pc(11) int local11 = Static256.aClass154Array2[arg1].ca(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class154 local18 = Static256.aClass154Array2[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.ca(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method6077(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.H(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I[BII)I")
	public static int method5517(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg0; local9 < arg2; local9++) {
			local7 = Class214.anIntArray581[(local7 ^ arg1[local9]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(II)Z")
	public static boolean method5518(@OriginalArg(0) int arg0) {
		if (Static416.aBooleanArray22[arg0]) {
			return true;
		} else if (Static348.aClass187_107.method4287(arg0)) {
			@Pc(30) int local30 = Static348.aClass187_107.method4306(arg0);
			if (local30 == 0) {
				Static416.aBooleanArray22[arg0] = true;
				return true;
			}
			if (Static166.aClass89ArrayArray2[arg0] == null) {
				Static166.aClass89ArrayArray2[arg0] = new Class89[local30];
			}
			for (@Pc(49) int local49 = 0; local49 < local30; local49++) {
				if (Static166.aClass89ArrayArray2[arg0][local49] == null) {
					@Pc(63) byte[] local63 = Static348.aClass187_107.method4300(arg0, local49);
					if (local63 != null) {
						@Pc(75) Class89 local75 = Static166.aClass89ArrayArray2[arg0][local49] = new Class89();
						local75.anInt2677 = (arg0 << 16) + local49;
						if (local63[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local75.method2281(new Class10_Sub8(local63));
					}
				}
			}
			Static416.aBooleanArray22[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
