import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!nh", name = "M", descriptor = "Lclient!tq;")
	public static final Class238 aClass238_20 = new Class238(8, 7);

	@OriginalMember(owner = "client!nh", name = "S", descriptor = "[I")
	public static final int[] anIntArray325 = new int[50];

	@OriginalMember(owner = "client!nh", name = "T", descriptor = "F")
	public static float aFloat51 = 0.0F;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(II)V")
	public static void method4073(@OriginalArg(0) int arg0) {
		Static219.anInt3948 = arg0;
		Static252.aClass44_35.method1351();
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(II)I")
	public static int method4074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static316.aByteArrayArray22 == null ? 0 : Static316.aByteArrayArray22[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V")
	public static void method4076() {
		for (@Pc(10) Class57_Sub3 local10 = (Class57_Sub3) Static328.aClass111_6.method2687(); local10 != null; local10 = (Class57_Sub3) Static328.aClass111_6.method2687()) {
			Static178.method6351(local10);
		}
		@Pc(36) int local36;
		@Pc(35) int local35;
		if (Static291.aClass28_Sub1_1.method832(Static294.anInt5208)) {
			local35 = 3;
			local36 = 0;
		} else {
			local35 = Static232.anInt4221;
			local36 = Static232.anInt4221;
		}
		Static50.method1155();
		for (@Pc(45) int local45 = local36; local45 <= local35; local45++) {
			Static50.method1146();
			Static50.method1152(local45);
			Static50.method1145(local45);
		}
		Static50.method1144();
		Static50.method1137();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!eq;)Z")
	public static boolean method4077(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1) {
		@Pc(11) int local11 = (Static181.anInt3574 - 104) / 2;
		@Pc(17) int local17 = (Static117.anInt2450 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static426.method6223(arg0, local21, local29, local25)) {
						local40 = local29;
						if (Static313.method4558(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static227.method3402(local40, local21, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(88) int[] local88 = new int[262144];
		for (local29 = 0; local29 < local88.length; local29++) {
			local88[local29] = -16777216;
		}
		Static405.aClass87_29 = arg1.method5018(local88, 512, 512, 512);
		Static421.method6169();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 + -10 << 8) + 238 - 10 | 0xFF000000;
		@Pc(163) int local163 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xCDB9FF00) << 16;
		@Pc(182) int local182 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(186) boolean[][] local186 = new boolean[Static435.anInt7707][Static435.anInt7707];
		@Pc(192) int local192;
		@Pc(209) int local209;
		@Pc(213) int local213;
		@Pc(217) int local217;
		@Pc(266) int local266;
		@Pc(272) int local272;
		@Pc(276) int local276;
		@Pc(295) int local295;
		for (@Pc(188) int local188 = local11; local188 < local11 + 104; local188 += Static435.anInt7707) {
			for (local192 = local17; local192 < local17 + 104; local192 += Static435.anInt7707) {
				arg1.method5044(0, 0, Static435.anInt7707 * 4, Static435.anInt7707 * 4);
				arg1.method5045(-16777216);
				for (local209 = arg0; local209 <= 3; local209++) {
					for (local213 = 0; local213 < Static435.anInt7707; local213++) {
						for (local217 = 0; local217 < Static435.anInt7707; local217++) {
							local186[local213][local217] = Static426.method6223(arg0, local213 + local188, local209, local192 + local217);
						}
					}
					Static87.aClass86Array2[local209].method6597(local188, local192, local188 + Static435.anInt7707, Static435.anInt7707 + local192, local186);
					if (!Static225.aBoolean271) {
						for (local217 = -4; local217 < Static435.anInt7707; local217++) {
							for (local266 = -4; local266 < Static435.anInt7707; local266++) {
								local272 = local217 + local188;
								local276 = local192 + local266;
								if (local272 >= local11 && local17 <= local276 && Static426.method6223(arg0, local272, local209, local276)) {
									local295 = local209;
									if (Static313.method4558(local276, local272)) {
										local295 = local209 - 1;
									}
									if (local295 >= 0) {
										Static174.method2880(local40, local217 * 4, (Static435.anInt7707 - local266) * 4 - 4, arg1, local276, local163, local295, local272);
									}
								}
							}
						}
					}
				}
				if (Static225.aBoolean271) {
					@Pc(344) Class210 local344 = Static209.aClass210Array2[arg0];
					for (local217 = 0; local217 < Static435.anInt7707; local217++) {
						for (local266 = 0; local266 < Static435.anInt7707; local266++) {
							local272 = local217 + local188;
							local276 = local192 + local266;
							local295 = local344.anIntArrayArray34[local272 - local344.anInt5599][local276 - local344.anInt5598];
							if ((local295 & 0x40240000) != 0) {
								arg1.method5035(4, (Static435.anInt7707 - local266) * 4 - 4, -1713569622, local217 * 4, 4);
							} else if ((local295 & 0x800000) != 0) {
								arg1.method4975(4, local217 * 4, (Static435.anInt7707 - local266) * 4 - 4, -1713569622);
							} else if ((local295 & 0x2000000) != 0) {
								arg1.method4988(local217 * 4 + 3, 4, -1713569622, (Static435.anInt7707 - local266) * 4 - 4);
							} else if ((local295 & 0x8000000) != 0) {
								arg1.method4975(4, local217 * 4, (Static435.anInt7707 - local266) * 4 + 3 - 4, -1713569622);
							} else if ((local295 & 0x20000000) != 0) {
								arg1.method4988(local217 * 4, 4, -1713569622, (Static435.anInt7707 - local266) * 4 - 4);
							}
						}
					}
				}
				arg1.method5004(0, 0, Static435.anInt7707 * 4, Static435.anInt7707 * 4, local182, 2);
				Static405.aClass87_29.method6566((local188 - local11) * 4 + 48, -(Static435.anInt7707 * 4) + -((-local17 + local192) * 4) + 464, Static435.anInt7707 * 4, Static435.anInt7707 * 4);
			}
		}
		arg1.method5070();
		arg1.method5045(-16777215);
		Static206.method3172();
		Static365.anInt6515 = 0;
		Static220.aClass244_19.method5969();
		if (!Static225.aBoolean271) {
			for (local192 = local11; local192 < local11 + 104; local192++) {
				for (local209 = local17; local209 < local17 + 104; local209++) {
					for (local213 = arg0; local213 <= arg0 + 1 && local213 <= 3; local213++) {
						if (Static426.method6223(arg0, local192, local213, local209)) {
							@Pc(609) Interface10 local609 = (Interface10) Static109.method4308(local213, local192, local209);
							if (local609 == null) {
								local609 = (Interface10) Static415.method6101(local213, local192, local209, sq.class);
							}
							if (local609 == null) {
								local609 = (Interface10) Static86.method825(local213, local192, local209);
							}
							if (local609 == null) {
								local609 = (Interface10) Static273.method4127(local213, local192, local209);
							}
							if (local609 != null) {
								@Pc(650) Class106 local650 = Static448.aClass104_4.method2616(local609.method5325());
								if (!local650.aBoolean205 || Static48.aBoolean101) {
									local272 = local650.anInt3162;
									if (local650.anIntArray188 != null) {
										for (local276 = 0; local276 < local650.anIntArray188.length; local276++) {
											if (local650.anIntArray188[local276] != -1) {
												@Pc(679) Class106 local679 = Static448.aClass104_4.method2616(local650.anIntArray188[local276]);
												if (local679.anInt3162 >= 0) {
													local272 = local679.anInt3162;
												}
											}
										}
									}
									if (local272 >= 0) {
										@Pc(698) boolean local698 = false;
										if (local272 >= 0) {
											@Pc(705) Class260 local705 = Static244.aClass169_29.method3948(local272);
											if (local705 != null && local705.aBoolean484) {
												local698 = true;
											}
										}
										local295 = local192;
										@Pc(716) int local716 = local209;
										if (local698) {
											@Pc(723) int[][] local723 = Static209.aClass210Array2[local213].anIntArrayArray34;
											@Pc(728) int local728 = Static209.aClass210Array2[local213].anInt5599;
											@Pc(733) int local733 = Static209.aClass210Array2[local213].anInt5598;
											for (@Pc(735) int local735 = 0; local735 < 10; local735++) {
												@Pc(742) int local742 = (int) (Math.random() * 4.0D);
												if (local742 == 0 && local11 < local295 && local295 > local192 - 3 && (local723[local295 - local728 - 1][local716 - local733] & 0x2C0108) == 0) {
													local295--;
												}
												if (local742 == 1 && local295 < local11 + 104 - 1 && local192 + 3 > local295 && (local723[local295 + 1 - local728][local716 - local733] & 0x2C0180) == 0) {
													local295++;
												}
												if (local742 == 2 && local17 < local716 && local209 - 3 < local716 && (local723[local295 - local728][local716 - local733 - 1] & 0x2C0102) == 0) {
													local716--;
												}
												if (local742 == 3 && local17 + 104 - 1 > local716 && local209 + 3 > local716 && (local723[local295 - local728][local716 + 1 - local733] & 0x2C0120) == 0) {
													local716++;
												}
											}
										}
										Static372.anIntArray461[Static365.anInt6515] = local650.anInt3167;
										Static357.anIntArray412[Static365.anInt6515] = local295;
										Static44.anIntArray75[Static365.anInt6515] = local716;
										Static365.anInt6515++;
									}
								}
							}
						}
					}
				}
			}
			if (Static39.aClass202_3 != null) {
				Static22.aClass100_4.anInt2998 = 1;
				Static244.aClass169_29.method3951(1024, 64);
				for (local209 = 0; local209 < Static39.aClass202_3.anInt5488; local209++) {
					local213 = Static39.aClass202_3.anIntArray365[local209];
					if (local213 >> 28 == Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103) {
						local217 = (local213 >> 14 & 0x3FFF) - Static2.anInt6396;
						local266 = (local213 & 0x3FFF) - Static348.anInt6273;
						if (local217 >= 0 && local217 < Static181.anInt3574 && local266 >= 0 && Static117.anInt2450 > local266) {
							Static220.aClass244_19.method5966(new Class6_Sub39(local209));
						} else {
							@Pc(1007) Class260 local1007 = Static244.aClass169_29.method3948(Static39.aClass202_3.anIntArray366[local209]);
							if (local1007.anIntArray531 != null && local1007.anInt7748 + local217 >= 0 && local1007.anInt7734 + local217 < Static181.anInt3574 && local1007.anInt7727 + local266 >= 0 && Static117.anInt2450 > local1007.anInt7737 + local266) {
								Static220.aClass244_19.method5966(new Class6_Sub39(local209));
							}
						}
					}
				}
				Static244.aClass169_29.method3951(128, 64);
				Static22.aClass100_4.anInt2998 = 2;
				Static22.aClass100_4.method2507();
			}
		}
		return true;
	}
}
