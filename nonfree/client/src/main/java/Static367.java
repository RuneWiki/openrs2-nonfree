import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!si", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString66;

	@OriginalMember(owner = "client!si", name = "r", descriptor = "Lclient!lt;")
	public static Class158 aClass158_90;

	@OriginalMember(owner = "client!si", name = "t", descriptor = "I")
	public static int anInt7090;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "[I")
	public static final int[] anIntArray613 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!si", name = "m", descriptor = "Z")
	public static boolean aBoolean484 = false;

	@OriginalMember(owner = "client!si", name = "n", descriptor = "F")
	public static float aFloat104 = 1024.0F;

	@OriginalMember(owner = "client!si", name = "s", descriptor = "I")
	public static int anInt7089 = 0;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IZIIIIIII)Z")
	public static boolean method5800(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static134.aClass3_Sub3_Sub6_Sub1_1.anIntArray582[0];
		@Pc(13) int local13 = Static134.aClass3_Sub3_Sub6_Sub1_1.anIntArray583[0];
		if (local8 < 0 || local8 >= Static84.anInt1632 || local13 < 0 || local13 >= Static261.anInt4480) {
			return false;
		} else if (arg4 >= 0 && arg4 < Static84.anInt1632 && arg5 >= 0 && arg5 < Static261.anInt4480) {
			@Pc(73) int local73 = Static434.method5877(arg0, local13, arg5, arg1, arg7, local8, arg6, Static134.aClass3_Sub3_Sub6_Sub1_1.method5512(), Static401.anIntArray576, arg3, Static254.aClass61Array2[Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93], arg4, arg2, Static120.anIntArray217);
			if (local73 < 1) {
				return false;
			}
			Static278.anInt4731 = Static120.anIntArray217[local73 - 1];
			Static58.anInt1221 = Static401.anIntArray576[local73 - 1];
			Static305.aBoolean353 = false;
			Static190.method2937();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!si", name = "g", descriptor = "(I)V")
	public static void method5801() {
		for (@Pc(6) Class6_Sub28 local6 = (Class6_Sub28) Static49.aClass88_11.method1882(); local6 != null; local6 = (Class6_Sub28) Static49.aClass88_11.method1891()) {
			if (Static30.aClass189ArrayArrayArray2 == null) {
				local6.method5977();
			} else {
				@Pc(28) int local28;
				@Pc(170) Class3_Sub1 local170;
				@Pc(183) Class3_Sub1_Sub3 local183;
				@Pc(131) Class3_Sub3 local131;
				@Pc(88) Class3_Sub5 local88;
				@Pc(46) Class3_Sub4 local46;
				@Pc(101) Class3_Sub5_Sub3 local101;
				@Pc(59) Class3_Sub4_Sub1 local59;
				if (Static125.anInt2225 >= local6.anInt5229) {
					local28 = Static125.anIntArray233[local6.anInt5230];
					if (local28 == 0) {
						local170 = Static428.method5836(local6.anInt5224, local6.anInt5222, local6.anInt5227);
						if (local170 instanceof Class3_Sub1_Sub3) {
							Static246.method3786(local6.anInt5224, local6.anInt5222, local6.anInt5227);
							local183 = (Class3_Sub1_Sub3) local170;
							if (local183.aClass3_Sub1_3 != null) {
								Static226.method3456(local6.anInt5224, local6.anInt5222, local6.anInt5227, local183.aClass3_Sub1_3, null);
							}
						}
					} else if (local28 == 1) {
						local46 = Static64.method1227(local6.anInt5224, local6.anInt5222, local6.anInt5227);
						if (local46 instanceof Class3_Sub4_Sub1) {
							Static1.method3(local6.anInt5224, local6.anInt5222, local6.anInt5227);
							local59 = (Class3_Sub4_Sub1) local46;
							if (local59.aClass3_Sub4_1 != null) {
								Static377.method5521(local6.anInt5224, local6.anInt5222, local6.anInt5227, local59.aClass3_Sub4_1, null);
							}
						}
					} else if (local28 == 2) {
						local131 = Static49.method903(local6.anInt5224, local6.anInt5222, local6.anInt5227, tf.class);
						if (local131 instanceof Class3_Sub3_Sub3) {
							Static71.method1389(local6.anInt5224, local6.anInt5222, local6.anInt5227, tf.class);
							@Pc(152) Class3_Sub3_Sub3 local152 = (Class3_Sub3_Sub3) local131;
							if (local152.aClass3_Sub3_1 != null) {
								Static9.method128(local152.aClass3_Sub3_1, false);
							}
						}
					} else if (local28 == 3) {
						local88 = Static91.method1566(local6.anInt5224, local6.anInt5222, local6.anInt5227);
						if (local88 instanceof Class3_Sub5_Sub3) {
							Static375.method5204(local6.anInt5224, local6.anInt5222, local6.anInt5227);
							local101 = (Class3_Sub5_Sub3) local88;
							if (local101.aClass3_Sub5_2 != null) {
								Static53.method975(local6.anInt5224, local6.anInt5222, local6.anInt5227, local101.aClass3_Sub5_2);
							}
						}
					}
					local6.method5977();
				} else if (local6.anInt5228 == Static125.anInt2225) {
					local28 = Static125.anIntArray233[local6.anInt5230];
					if (local28 == 0) {
						local170 = Static428.method5836(local6.anInt5224, local6.anInt5222, local6.anInt5227);
						if (local170 instanceof Class3_Sub1_Sub3) {
							local6.method5977();
						} else if (Static55.method1031(local6.anInt5224, local6.anInt5222, local6.anInt5227) == null) {
							local183 = new Class3_Sub1_Sub3(local6.anInt5230, local6.anInt5221, local6.anInt5235, local6.anInt5223, local6.anInt5231, local170);
							Static226.method3456(local6.anInt5224, local6.anInt5222, local6.anInt5227, local183, null);
						} else {
							local6.method5977();
						}
					} else if (local28 == 1) {
						local46 = Static64.method1227(local6.anInt5224, local6.anInt5222, local6.anInt5227);
						if (local46 instanceof Class3_Sub4_Sub1) {
							local6.method5977();
						} else if (Static199.method3152(local6.anInt5224, local6.anInt5222, local6.anInt5227) == null) {
							local59 = new Class3_Sub4_Sub1(local6.anInt5230, local6.anInt5221, local6.anInt5235, local6.anInt5223, local6.anInt5231, local46);
							Static377.method5521(local6.anInt5224, local6.anInt5222, local6.anInt5227, local59, null);
						} else {
							local6.method5977();
						}
					} else if (local28 == 2) {
						local131 = Static49.method903(local6.anInt5224, local6.anInt5222, local6.anInt5227, tf.class);
						if (local131 instanceof Class3_Sub3_Sub3) {
							local6.method5977();
						} else {
							Static71.method1389(local6.anInt5224, local6.anInt5222, local6.anInt5227, tf.class);
							@Pc(311) Class118 local311 = Static113.aClass127_2.method2820(local6.anInt5218);
							@Pc(322) int local322;
							@Pc(325) int local325;
							if (local6.anInt5221 == 1 || local6.anInt5221 == 3) {
								local322 = local311.anInt3025;
								local325 = local311.anInt2997;
							} else {
								local322 = local311.anInt2997;
								local325 = local311.anInt3025;
							}
							@Pc(367) Class3_Sub3_Sub3 local367 = new Class3_Sub3_Sub3(local6.anInt5230, local6.anInt5221, local6.anInt5224, local6.anInt5235, local6.anInt5223, local6.anInt5231, local6.anInt5222, local322 + local6.anInt5222 - 1, local6.anInt5227, local6.anInt5227 + local325 - 1, local131);
							Static9.method128(local367, false);
						}
					} else if (local28 == 3) {
						local88 = Static91.method1566(local6.anInt5224, local6.anInt5222, local6.anInt5227);
						if (local88 instanceof Class3_Sub5_Sub3) {
							local6.method5977();
						} else {
							local101 = new Class3_Sub5_Sub3(local6.anInt5235, local6.anInt5223, local6.anInt5231, local88);
							Static53.method975(local6.anInt5224, local6.anInt5222, local6.anInt5227, local101);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)Z")
	public static boolean method5802(@OriginalArg(1) int arg0) {
		if (Static34.aBooleanArray2[arg0]) {
			return true;
		} else if (Static223.aClass158_52.method3694(arg0)) {
			@Pc(23) int local23 = Static223.aClass158_52.method3683(arg0);
			if (local23 == 0) {
				Static34.aBooleanArray2[arg0] = true;
				return true;
			}
			if (Static129.aClass239ArrayArray1[arg0] == null) {
				Static129.aClass239ArrayArray1[arg0] = new Class239[local23];
			}
			for (@Pc(47) int local47 = 0; local47 < local23; local47++) {
				if (Static129.aClass239ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static223.aClass158_52.method3672(local47, arg0);
					if (local61 != null) {
						@Pc(73) Class239 local73 = Static129.aClass239ArrayArray1[arg0][local47] = new Class239();
						local73.anInt6423 = local47 + (arg0 << 16);
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method5360(new Class6_Sub15(local61));
					}
				}
			}
			Static34.aBooleanArray2[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method5803(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static301.anInt2759 = 7;
		Static22.anInt397 = 0x1 << Static301.anInt2759;
		Static25.anInt7191 = Static22.anInt397 >> 1;
		Static290.anInt4870 = (int) Math.sqrt((double) (Static25.anInt7191 * Static25.anInt7191 + Static25.anInt7191 * Static25.anInt7191));
		Static113.anInt2013 = Static22.anInt397 >> 2;
		Static192.anInt3387 = Static22.anInt397;
		Static401.anInt6621 = arg0;
		Static364.anInt6134 = arg1;
		Static99.anInt1813 = arg2;
		Static14.aClass189ArrayArrayArray1 = new Class189[4][Static401.anInt6621][Static364.anInt6134];
		Static93.aClass84Array1 = new Class84[4];
		if (arg3) {
			Static5.anIntArrayArray1 = new int[Static401.anInt6621][Static364.anInt6134];
			Static426.aByteArrayArray46 = new byte[Static401.anInt6621][Static364.anInt6134];
			Static340.aByteArrayArray34 = new byte[Static401.anInt6621][Static364.anInt6134];
			Static280.aClass189ArrayArrayArray3 = new Class189[1][Static401.anInt6621][Static364.anInt6134];
			Static365.aClass84Array3 = new Class84[1];
		} else {
			Static5.anIntArrayArray1 = null;
			Static426.aByteArrayArray46 = null;
			Static340.aByteArrayArray34 = null;
			Static280.aClass189ArrayArrayArray3 = null;
			Static365.aClass84Array3 = null;
		}
		if (arg4) {
			Static267.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static304.aClass66Array1 = new Class66[65535];
			Static198.aBooleanArray18 = new boolean[65535];
			Static208.anInt3623 = 0;
		} else {
			Static267.aLongArrayArrayArray1 = null;
			Static304.aClass66Array1 = null;
			Static198.aBooleanArray18 = null;
			Static208.anInt3623 = 0;
		}
		Static165.method2688(false);
		Static84.aClass219Array2 = new Class219[1000];
		Static269.anInt4605 = 0;
		Static51.aClass219Array1 = new Class219[1000];
		Static268.anInt4599 = 0;
		Static41.anIntArrayArrayArray2 = new int[4][Static401.anInt6621 + 1][Static364.anInt6134 + 1];
		Static81.aClass3_Sub3Array1 = new Class3_Sub3[5000];
		Static215.anInt3735 = 0;
		Static27.aBooleanArrayArray2 = new boolean[Static99.anInt1813 + Static99.anInt1813 + 1][Static99.anInt1813 + Static99.anInt1813 + 1];
		Static87.aBooleanArrayArray3 = new boolean[Static99.anInt1813 + Static99.anInt1813 + 2][Static99.anInt1813 + Static99.anInt1813 + 2];
		Static19.aClass10_1 = null;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!pi;Lclient!oh;)V")
	public static void method5805(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class189 arg1) {
		if (!arg1.aBoolean344) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort66;
		@Pc(9) short local9 = arg1.aShort65;
		@Pc(12) byte local12 = arg1.aByte53;
		@Pc(15) byte local15 = arg1.aByte58;
		@Pc(21) int local21 = (local6 << Static301.anInt2759) + Static25.anInt7191;
		@Pc(27) int local27 = (local9 << Static301.anInt2759) + Static25.anInt7191;
		@Pc(31) Class189[][] local31 = Static30.aClass189ArrayArrayArray2[local12];
		@Pc(53) float local53;
		if (Static365.aClass84Array3 == Static420.aClass84Array4) {
			Static291.aClass28_132.method3565(Static93.aClass84Array1[0].method5334(local21, local27), Static156.method2608(local6, local9), Static123.method2002(local6, local9), Static364.method5133(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static291.aClass28_132.method3581(3000.0F, local53 * 1.5F);
		@Pc(86) Class189 local86;
		@Pc(616) Class48_Sub6 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class48_Sub6 local377;
		@Pc(408) int local408;
		@Pc(411) Class3_Sub1 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean342) {
			if (Static446.aBoolean494) {
				if (local12 > 0) {
					local86 = Static30.aClass189ArrayArrayArray2[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean344) {
						return;
					}
				}
				if (local6 <= Static165.anInt2942 && local6 > Static167.anInt2998) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean344 && (local86.aBoolean342 || (arg1.aByte52 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static165.anInt2942 && local6 < Static117.anInt2049 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean344 && (local86.aBoolean342 || (arg1.aByte52 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static97.anInt1799 && local9 > Static57.anInt1201) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean344 && (local86.aBoolean342 || (arg1.aByte52 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static97.anInt1799 && local9 < Static329.anInt5591 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean344 && (local86.aBoolean342 || (arg1.aByte52 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static446.aBoolean494 = true;
			}
			arg1.aBoolean342 = false;
			if (arg1.aClass189_1 != null) {
				local86 = arg1.aClass189_1;
				Static291.aClass28_132.method3581(3000.0F, (201.5F - (float) (local86.aByte58 + 1) * 50.0F) * 1.5F);
				if (!Static275.method4186(local86.aByte58, local6, local9)) {
					Static420.aClass84Array4[local86.aByte58].method5325(local6, local9);
				}
				@Pc(249) Class3_Sub1 local249 = local86.aClass3_Sub1_1;
				if (local249 != null) {
					if (Static439.aBoolean490) {
						if ((local249.anInt6326 & arg1.aShort64) == 0) {
							Static26.method2141(arg0, local12, local6, local9);
						} else {
							Static331.method4736(arg0, local249.anInt6326, local15, local6, local9);
						}
						Static291.aClass28_132.method3504(arg0.anInt2147, arg0.aClass6_Sub6Array3);
					}
					local249.method5790(Static291.aClass28_132);
				}
				for (@Pc(286) Class242 local286 = local86.aClass242_2; local286 != null; local286 = local286.aClass242_4) {
					@Pc(290) Class3_Sub3 local290 = local286.aClass3_Sub3_2;
					if (local290 != null) {
						if (Static439.aBoolean490) {
							Static26.method2141(arg0, local12, local6, local9);
							Static291.aClass28_132.method3504(arg0.anInt2147, arg0.aClass6_Sub6Array3);
						}
						local290.method5790(Static291.aClass28_132);
					}
				}
				Static291.aClass28_132.method3581(3000.0F, local53 * 1.5F);
			}
			local330 = !Static275.method4186(local15, local6, local9);
			if (local330) {
				Static420.aClass84Array4[local15].method5325(local6, local9);
				@Pc(341) Class3_Sub5 local341 = arg1.aClass3_Sub5_1;
				if (local341 != null && local341.aBoolean483) {
					if (local341.aBoolean485) {
						Static291.aClass28_132.method3581(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static439.aBoolean490) {
						Static26.method2141(arg0, local12, local6, local9);
						Static291.aClass28_132.method3504(arg0.anInt2147, arg0.aClass6_Sub6Array3);
					}
					local377 = local341.method5790(Static291.aClass28_132);
					if (local377 != null) {
						local377.aClass3_1 = local341;
						local377.anInt3646 = local12;
						local377.anInt3647 = local6;
						local377.anInt3644 = local9;
						Static412.aClass128_10.method2833(local377);
					}
					if (local341.aBoolean485) {
						Static291.aClass28_132.method3581(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass3_Sub1_1;
			@Pc(414) Class3_Sub4 local414 = arg1.aClass3_Sub4_3;
			if (local411 != null || local414 != null) {
				if (Static165.anInt2942 == local6) {
					local406++;
				} else if (Static165.anInt2942 < local6) {
					local406 += 2;
				}
				if (Static97.anInt1799 == local9) {
					local406 += 3;
				} else if (Static97.anInt1799 > local9) {
					local406 += 6;
				}
				local408 = Static126.anIntArray400[local406];
				arg1.aShort64 = Static343.aShortArray74[local406];
			}
			if (local411 != null) {
				if ((local411.anInt6326 & Static277.anIntArray413[local406]) == 0) {
					arg1.aByte54 = 0;
				} else if (local411.anInt6326 == 16) {
					arg1.aByte54 = 3;
					arg1.aByte55 = Static60.aByteArray17[local406];
					arg1.aByte57 = (byte) (3 - arg1.aByte55);
				} else if (local411.anInt6326 == 32) {
					arg1.aByte54 = 6;
					arg1.aByte55 = Static212.aByteArray52[local406];
					arg1.aByte57 = (byte) (6 - arg1.aByte55);
				} else if (local411.anInt6326 == 64) {
					arg1.aByte54 = 12;
					arg1.aByte55 = Static433.aByteArray60[local406];
					arg1.aByte57 = (byte) (12 - arg1.aByte55);
				} else {
					arg1.aByte54 = 9;
					arg1.aByte55 = Static182.aByteArray42[local406];
					arg1.aByte57 = (byte) (9 - arg1.aByte55);
				}
				if ((local411.anInt6326 & local408) != 0 && !Static66.method1264(local15, local6, local9, local411.anInt6326)) {
					if (Static439.aBoolean490) {
						Static26.method2141(arg0, local12, local6, local9);
						Static291.aClass28_132.method3504(arg0.anInt2147, arg0.aClass6_Sub6Array3);
					}
					@Pc(563) Class48_Sub6 local563 = local411.method5790(Static291.aClass28_132);
					if (local563 != null) {
						local563.aClass3_1 = local411;
						local563.anInt3646 = local12;
						local563.anInt3647 = local6;
						local563.anInt3644 = local9;
						Static412.aClass128_10.method2833(local563);
					}
				}
				@Pc(584) Class3_Sub1 local584 = arg1.aClass3_Sub1_2;
				if (local584 != null && (local584.anInt6326 & local408) != 0 && !Static66.method1264(local15, local6, local9, local584.anInt6326)) {
					if (Static439.aBoolean490) {
						Static26.method2141(arg0, local12, local6, local9);
						Static291.aClass28_132.method3504(arg0.anInt2147, arg0.aClass6_Sub6Array3);
					}
					local616 = local584.method5790(Static291.aClass28_132);
					if (local616 != null) {
						local616.aClass3_1 = local584;
						local616.anInt3646 = local12;
						local616.anInt3647 = local6;
						local616.anInt3644 = local9;
						Static412.aClass128_10.method2833(local616);
					}
				}
			}
			if (local414 != null && !Static176.method2769(local15, local6, local9, local414.method4354())) {
				@Pc(647) Class3_Sub4 local647 = arg1.aClass3_Sub4_2;
				Static291.aClass28_132.method3581(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt4915 & local408) != 0) {
					if (Static439.aBoolean490) {
						Static26.method2141(arg0, local12, local6, local9);
						Static291.aClass28_132.method3504(arg0.anInt2147, arg0.aClass6_Sub6Array3);
					}
					local616 = local414.method5790(Static291.aClass28_132);
					if (local616 != null) {
						local616.aClass3_1 = local414;
						local616.anInt3646 = local12;
						local616.anInt3647 = local6;
						local616.anInt3644 = local9;
						Static412.aClass128_10.method2833(local616);
					}
				} else if (local414.anInt4915 == 256) {
					local706 = local414.anInt4924 - Static385.anInt6349;
					local711 = local414.anInt4917 - Static352.anInt5944;
					local714 = local414.anInt4923;
					if (local714 == 1 || local714 == 2) {
						local723 = -local706;
					} else {
						local723 = local706;
					}
					if (local714 == 2 || local714 == 3) {
						local735 = -local711;
					} else {
						local735 = local711;
					}
					if (Static439.aBoolean490) {
						Static26.method2141(arg0, local12, local6, local9);
						Static291.aClass28_132.method3504(arg0.anInt2147, arg0.aClass6_Sub6Array3);
					}
					@Pc(759) Class48_Sub6 local759;
					if (local735 < local723) {
						local759 = local414.method5790(Static291.aClass28_132);
						if (local759 != null) {
							local759.aClass3_1 = local414;
							local759.anInt3646 = local12;
							local759.anInt3647 = local6;
							local759.anInt3644 = local9;
							Static412.aClass128_10.method2833(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5790(Static291.aClass28_132);
						if (local759 != null) {
							local759.aClass3_1 = local647;
							local759.anInt3646 = local12;
							local759.anInt3647 = local6;
							local759.anInt3644 = local9;
							Static412.aClass128_10.method2833(local759);
						}
					}
				}
				Static291.aClass28_132.method3581(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class3_Sub5 local814 = arg1.aClass3_Sub5_1;
				if (local814 != null && !local814.aBoolean483) {
					if (local814.aBoolean485) {
						Static291.aClass28_132.method3581(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static439.aBoolean490) {
						Static26.method2141(arg0, local12, local6, local9);
						Static291.aClass28_132.method3504(arg0.anInt2147, arg0.aClass6_Sub6Array3);
					}
					local616 = local814.method5790(Static291.aClass28_132);
					if (local616 != null) {
						local616.aClass3_1 = local814;
						local616.anInt3646 = local12;
						local616.anInt3647 = local6;
						local616.anInt3644 = local9;
						Static412.aClass128_10.method2833(local616);
					}
					if (local814.aBoolean485) {
						Static291.aClass28_132.method3581(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class3_Sub2 local880 = arg1.aClass3_Sub2_1;
				if (local880 != null && !local880.aBoolean448) {
					if (Static439.aBoolean490) {
						Static26.method2141(arg0, local12, local6, local9);
						Static291.aClass28_132.method3504(arg0.anInt2147, arg0.aClass6_Sub6Array3);
					}
					@Pc(903) Class48_Sub6 local903 = local880.method5790(Static291.aClass28_132);
					if (local903 != null) {
						local903.aClass3_1 = local880;
						local903.anInt3646 = local12;
						local903.anInt3647 = local6;
						local903.anInt3644 = local9;
						Static412.aClass128_10.method2833(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte52;
			if (local924 != 0) {
				@Pc(941) Class189 local941;
				if (local6 < Static165.anInt2942 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean344) {
						Static19.aClass10_1.method5383(local941);
					}
				}
				if (local9 < Static97.anInt1799 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean344) {
						Static19.aClass10_1.method5383(local941);
					}
				}
				if (local6 > Static165.anInt2942 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean344) {
						Static19.aClass10_1.method5383(local941);
					}
				}
				if (local9 > Static97.anInt1799 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean344) {
						Static19.aClass10_1.method5383(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class3_Sub1 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class242 local1030;
		if (arg1.aByte54 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass242_2; local1030 != null; local1030 = local1030.aClass242_4) {
				if (local1030.aClass3_Sub3_2.anInt6676 != Static30.anInt498 && (local1030.anInt6605 & arg1.aByte54) == arg1.aByte55) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass3_Sub1_1;
				if (!Static66.method1264(local15, local6, local9, local1057.anInt6326)) {
					if (Static439.aBoolean490) {
						label682: {
							if (local1057.anInt6326 >= 16) {
								local1074 = local6 - Static165.anInt2942;
								local1078 = local9 - Static97.anInt1799;
								if (local1057.anInt6326 == 16) {
									local1074 -= Static25.anInt7191;
									local1078 += Static25.anInt7191;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static364.anInt6134) {
										Static26.method2141(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt6326 == 32) {
									local1074 += Static25.anInt7191;
									local1078 += Static25.anInt7191;
									if (local1078 < -local1074 && local6 < Static401.anInt6621 && local9 < Static364.anInt6134) {
										Static26.method2141(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt6326 == 64) {
									local1074 += Static25.anInt7191;
									local1078 -= Static25.anInt7191;
									if (local1078 > local1074 && local6 < Static401.anInt6621 && local9 > 0) {
										Static26.method2141(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt6326 == 128) {
									local1074 -= Static25.anInt7191;
									local1078 -= Static25.anInt7191;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static26.method2141(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static26.method2141(arg0, local12, local6, local9);
						}
						Static291.aClass28_132.method3504(arg0.anInt2147, arg0.aClass6_Sub6Array3);
					}
					@Pc(1216) Class48_Sub6 local1216 = local1057.method5790(Static291.aClass28_132);
					if (local1216 != null) {
						local1216.aClass3_1 = local1057;
						local1216.anInt3646 = local12;
						local1216.anInt3647 = local6;
						local1216.anInt3644 = local9;
						Static412.aClass128_10.method2833(local1216);
					}
				}
				arg1.aByte54 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean343) {
			try {
				arg1.aBoolean343 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass242_2; local1030 != null; local1030 = local1030.aClass242_4) {
					@Pc(1252) Class3_Sub3 local1252 = local1030.aClass3_Sub3_2;
					if (local1252.anInt6676 != Static30.anInt498) {
						for (local1074 = local1252.aShort97; local1074 <= local1252.aShort98; local1074++) {
							for (local1078 = local1252.aShort95; local1078 <= local1252.aShort96; local1078++) {
								@Pc(1270) Class189 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean342) {
									arg1.aBoolean343 = true;
									continue label625;
								}
								if (local1270.aByte54 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort97) {
										local706++;
									}
									if (local1074 < local1252.aShort98) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort95) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort96) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte54) == arg1.aByte57) {
										arg1.aBoolean343 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static165.anInt2942 - local1252.aShort97;
						local1333 = local1252.aShort98 - Static165.anInt2942;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static97.anInt1799 - local1252.aShort95;
						local711 = local1252.aShort96 - Static97.anInt1799;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass3_Sub3Array3[local1245] = local1252;
						arg0.anIntArray229[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class3_Sub3 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass3_Sub3Array3[local1078];
						if (local1384.anInt6676 != Static30.anInt498) {
							local706 = arg0.anIntArray229[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt6675 - Static385.anInt6349;
								local714 = local1384.anInt6677 - Static352.anInt5944;
								local723 = arg0.aClass3_Sub3Array3[local1074].anInt6675 - Static385.anInt6349;
								local735 = arg0.aClass3_Sub3Array3[local1074].anInt6677 - Static352.anInt5944;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass3_Sub3Array3[local1074];
					local1384.anInt6676 = Static30.anInt498;
					if (!Static57.method1069(local15, local1384.aShort97, local1384.aShort98, local1384.aShort95, local1384.aShort96, local1384.method5503())) {
						if (Static439.aBoolean490) {
							if (local1384.aByte94 == 0) {
								Static234.method3697(arg0, local12, local1384.aShort97, local1384.aShort95, local1384.aShort98, local1384.aShort96);
							} else {
								Static26.method2141(arg0, local12, local6, local9);
								local706 = local6 - Static165.anInt2942;
								local711 = local9 - Static97.anInt1799;
								if (local1384.aByte94 == 2) {
									if (local711 > -local706) {
										Static19.method277(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static19.method277(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static19.method277(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static19.method277(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static291.aClass28_132.method3504(arg0.anInt2147, arg0.aClass6_Sub6Array3);
						}
						local616 = local1384.method5790(Static291.aClass28_132);
						if (local616 != null) {
							local616.aClass3_1 = local1384;
							local616.anInt3646 = local12;
							local616.anInt3647 = local1384.aShort97;
							local616.anInt3644 = local1384.aShort95;
							Static412.aClass128_10.method2833(local616);
						}
					}
					for (local706 = local1384.aShort97; local706 <= local1384.aShort98; local706++) {
						for (local711 = local1384.aShort95; local711 <= local1384.aShort96; local711++) {
							@Pc(1609) Class189 local1609 = local31[local706][local711];
							if (local1609.aByte54 != 0) {
								Static19.aClass10_1.method5383(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean344) {
								Static19.aClass10_1.method5383(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean343) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean343 = false;
			}
		}
		if (arg1.aClass115_2 != null && arg1.aByte56 == (byte) (Static339.anInt5697 & 0xFF)) {
			@Pc(1664) Class115 local1664 = arg1.aClass115_2;
			local406 = Static420.aClass84Array4[local12].method5322(local6, local9);
			if (local12 < Static268.anInt4600 - 1) {
				local408 = Static420.aClass84Array4[local12].method5322(local6, local9) - Static420.aClass84Array4[local12 + 1].method5322(local6, local9);
			} else {
				local408 = 0x8 << Static301.anInt2759;
			}
			Static357.aClass132_4.method3990(local21, local406, local27, arg0.anIntArray228);
			local1074 = arg0.anIntArray228[2];
			Static357.aClass132_4.method3990(local21, local406 - local408, local27, arg0.anIntArray228);
			local1078 = arg0.anIntArray228[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static290.anInt4870;
			local706 += Static290.anInt4870;
			local1664.anInt2907 = local1333;
			local1664.anInt2908 = local706;
			local1664.aBoolean202 = true;
			Static291.aClass28_132.method3488(local1664);
		}
		if (!arg1.aBoolean344) {
			return;
		}
		if (arg1.aByte54 != 0) {
			return;
		}
		if (local6 <= Static165.anInt2942 && local6 > Static167.anInt2998) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean344) {
				return;
			}
		}
		if (local6 >= Static165.anInt2942 && local6 < Static117.anInt2049 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean344) {
				return;
			}
		}
		if (local9 <= Static97.anInt1799 && local9 > Static57.anInt1201) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean344) {
				return;
			}
		}
		if (local9 >= Static97.anInt1799 && local9 < Static329.anInt5591 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean344) {
				return;
			}
		}
		arg1.aBoolean344 = false;
		Static96.anInt1790--;
		@Pc(1855) Class3_Sub2 local1855 = arg1.aClass3_Sub2_1;
		if (local1855 != null && local1855.aBoolean448) {
			if (Static439.aBoolean490) {
				Static26.method2141(arg0, local12, local6, local9);
				Static291.aClass28_132.method3504(arg0.anInt2147, arg0.aClass6_Sub6Array3);
			}
			@Pc(1878) Class48_Sub6 local1878 = local1855.method5790(Static291.aClass28_132);
			if (local1878 != null) {
				local1878.aClass3_1 = local1855;
				local1878.anInt3646 = local12;
				local1878.anInt3647 = local6;
				local1878.anInt3644 = local9;
				Static412.aClass128_10.method2833(local1878);
			}
		}
		if (arg1.aShort64 != 0) {
			@Pc(1902) Class3_Sub4 local1902 = arg1.aClass3_Sub4_3;
			if (local1902 != null && !Static176.method2769(local15, local6, local9, local1902.method4354())) {
				if ((local1902.anInt4915 & arg1.aShort64) != 0) {
					if (Static439.aBoolean490) {
						Static26.method2141(arg0, local12, local6, local9);
						Static291.aClass28_132.method3504(arg0.anInt2147, arg0.aClass6_Sub6Array3);
					}
					local377 = local1902.method5790(Static291.aClass28_132);
					if (local377 != null) {
						local377.aClass3_1 = local1902;
						local377.anInt3646 = local12;
						local377.anInt3647 = local6;
						local377.anInt3644 = local9;
						Static412.aClass128_10.method2833(local377);
					}
				} else if (local1902.anInt4915 == 256) {
					local408 = local1902.anInt4924 - Static385.anInt6349;
					local1074 = local1902.anInt4917 - Static352.anInt5944;
					local1078 = local1902.anInt4923;
					if (local1078 == 1 || local1078 == 2) {
						local1333 = -local408;
					} else {
						local1333 = local408;
					}
					if (local1078 == 2 || local1078 == 3) {
						local706 = -local1074;
					} else {
						local706 = local1074;
					}
					if (Static439.aBoolean490) {
						Static26.method2141(arg0, local12, local6, local9);
						Static291.aClass28_132.method3504(arg0.anInt2147, arg0.aClass6_Sub6Array3);
					}
					@Pc(2012) Class3_Sub4 local2012 = arg1.aClass3_Sub4_2;
					@Pc(2020) Class48_Sub6 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method5790(Static291.aClass28_132);
						if (local2020 != null) {
							local2020.aClass3_1 = local1902;
							local2020.anInt3646 = local12;
							local2020.anInt3647 = local6;
							local2020.anInt3644 = local9;
							Static412.aClass128_10.method2833(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method5790(Static291.aClass28_132);
						if (local2020 != null) {
							local2020.aClass3_1 = local2012;
							local2020.anInt3646 = local12;
							local2020.anInt3647 = local6;
							local2020.anInt3644 = local9;
							Static412.aClass128_10.method2833(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass3_Sub1_1;
			local411 = arg1.aClass3_Sub1_2;
			@Pc(2105) Class48_Sub6 local2105;
			if (local411 != null && (local411.anInt6326 & arg1.aShort64) != 0 && !Static66.method1264(local15, local6, local9, local411.anInt6326)) {
				if (Static439.aBoolean490) {
					Static331.method4736(arg0, local411.anInt6326, local12, local6, local9);
					Static291.aClass28_132.method3504(arg0.anInt2147, arg0.aClass6_Sub6Array3);
				}
				local2105 = local411.method5790(Static291.aClass28_132);
				if (local2105 != null) {
					local2105.aClass3_1 = local411;
					local2105.anInt3646 = local12;
					local2105.anInt3647 = local6;
					local2105.anInt3644 = local9;
					Static412.aClass128_10.method2833(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt6326 & arg1.aShort64) != 0 && !Static66.method1264(local15, local6, local9, local1057.anInt6326)) {
				if (Static439.aBoolean490) {
					Static331.method4736(arg0, local1057.anInt6326, local12, local6, local9);
					Static291.aClass28_132.method3504(arg0.anInt2147, arg0.aClass6_Sub6Array3);
				}
				local2105 = local1057.method5790(Static291.aClass28_132);
				if (local2105 != null) {
					local2105.aClass3_1 = local1057;
					local2105.anInt3646 = local12;
					local2105.anInt3647 = local6;
					local2105.anInt3644 = local9;
					Static412.aClass128_10.method2833(local2105);
				}
			}
		}
		@Pc(2191) Class189 local2191;
		if (local12 < Static268.anInt4600 - 1) {
			local2191 = Static30.aClass189ArrayArrayArray2[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean344) {
				Static19.aClass10_1.method5380(local2191);
			}
		}
		if (local6 < Static165.anInt2942) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean344) {
				Static19.aClass10_1.method5383(local2191);
			}
		}
		if (local9 < Static97.anInt1799) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean344) {
				Static19.aClass10_1.method5383(local2191);
			}
		}
		if (local6 > Static165.anInt2942) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean344) {
				Static19.aClass10_1.method5383(local2191);
			}
		}
		if (local9 > Static97.anInt1799) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean344) {
				Static19.aClass10_1.method5383(local2191);
			}
		}
	}
}
