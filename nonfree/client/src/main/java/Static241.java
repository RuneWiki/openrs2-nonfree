import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
	public static int anInt4320;

	@OriginalMember(owner = "client!oc", name = "P", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_69 = new Class11(62, 15);

	@OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
	public static int anInt4323 = -1;

	@OriginalMember(owner = "client!oc", name = "W", descriptor = "Lclient!mo;")
	public static final Class160 aClass160_37 = new Class160(10);

	@OriginalMember(owner = "client!oc", name = "X", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_61 = new Class32(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
	public static int anInt4325 = 0;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!vc;II)Z")
	public static boolean method3899(@OriginalArg(0) Class63 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static246.anInt4374 - 104) / 2;
		@Pc(17) int local17 = (Static185.anInt3485 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(37) int local37;
		@Pc(48) int local48;
		for (@Pc(29) int local29 = local11; local29 < local11 + 104; local29++) {
			for (@Pc(33) int local33 = local17; local33 < local17 + 104; local33++) {
				for (local37 = arg1; local37 <= 3; local37++) {
					if (Static90.method1687(local33, arg1, local37, local29)) {
						local48 = local37;
						if (Static210.method3518(local29, local33)) {
							local48 = local37 - 1;
						}
						if (local48 >= 0) {
							local19 &= Static250.method3959(local33, local48, local29);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(92) int[] local92 = new int[262144];
		for (local37 = 0; local37 < local92.length; local37++) {
			local92[local37] = -16777216;
		}
		Static348.aClass18_26 = arg0.method2029(local92, 512, 512, 512);
		Static281.method4295();
		local48 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D)) - 10) + 238 | 0xFF000000;
		@Pc(163) int local163 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(182) int local182 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(186) boolean[][] local186 = new boolean[Static128.anInt2624][Static128.anInt2624];
		@Pc(192) int local192;
		@Pc(209) int local209;
		@Pc(213) int local213;
		@Pc(217) int local217;
		@Pc(270) int local270;
		@Pc(277) int local277;
		@Pc(281) int local281;
		@Pc(300) int local300;
		for (@Pc(188) int local188 = local11; local188 < local11 + 104; local188 += Static128.anInt2624) {
			for (local192 = local17; local192 < local17 + 104; local192 += Static128.anInt2624) {
				arg0.method1958(0, 0, Static128.anInt2624 * 4, Static128.anInt2624 * 4);
				arg0.method2020(-16777216);
				for (local209 = arg1; local209 <= 3; local209++) {
					for (local213 = 0; local213 < Static128.anInt2624; local213++) {
						for (local217 = 0; local217 < Static128.anInt2624; local217++) {
							local186[local213][local217] = Static90.method1687(local217 + local192, arg1, local209, local213 + local188);
						}
					}
					Static90.aClass107Array1[local209].method4671(local188, local192, Static128.anInt2624 + local188, Static128.anInt2624 + local192, local186);
					if (!Static359.aBoolean435) {
						for (local217 = -4; local217 < Static128.anInt2624; local217++) {
							for (local270 = -4; local270 < Static128.anInt2624; local270++) {
								local277 = local188 + local217;
								local281 = local270 + local192;
								if (local11 <= local277 && local17 <= local281 && Static90.method1687(local281, arg1, local209, local277)) {
									local300 = local209;
									if (Static210.method3518(local277, local281)) {
										local300 = local209 - 1;
									}
									if (local300 >= 0) {
										Static149.method5443(local300, (Static128.anInt2624 - local270) * 4 - 4, local277, local281, local163, local48, local217 * 4, arg0);
									}
								}
							}
						}
					}
				}
				if (Static359.aBoolean435) {
					@Pc(350) Class188 local350 = Static58.aClass188Array1[arg1];
					for (local217 = 0; local217 < Static128.anInt2624; local217++) {
						for (local270 = 0; local270 < Static128.anInt2624; local270++) {
							local277 = local217 + local188;
							local281 = local270 + local192;
							local300 = local350.anIntArrayArray34[local277 - local350.anInt4570][local281 - local350.anInt4574];
							if ((local300 & 0x40240000) != 0) {
								arg0.method1951((Static128.anInt2624 - local270) * 4 - 4, 4, 4, -1713569622, local217 * 4);
							} else if ((local300 & 0x800000) != 0) {
								arg0.method1954(4, (Static128.anInt2624 - local270) * 4 - 4, local217 * 4, -1713569622);
							} else if ((local300 & 0x2000000) != 0) {
								arg0.method1999(4, -1713569622, (Static128.anInt2624 - local270) * 4 - 4, local217 * 4 - -3);
							} else if ((local300 & 0x8000000) != 0) {
								arg0.method1954(4, (Static128.anInt2624 - local270) * 4 + 3 - 4, local217 * 4, -1713569622);
							} else if ((local300 & 0x20000000) != 0) {
								arg0.method1999(4, -1713569622, (Static128.anInt2624 - local270) * 4 - 4, local217 * 4);
							}
						}
					}
				}
				arg0.method1982(0, 0, Static128.anInt2624 * 4, Static128.anInt2624 * 4, local182, 2);
				Static348.aClass18_26.method4553((local188 - local11) * 4 + 48, -(Static128.anInt2624 * 4) + 464 - (local192 + -local17) * 4, Static128.anInt2624 * 4, Static128.anInt2624 * 4);
			}
		}
		arg0.method1967();
		arg0.method2020(-16777215);
		Static240.method3873();
		Static113.anInt2428 = 0;
		Static104.aClass30_14.method692();
		if (!Static359.aBoolean435) {
			for (local192 = local11; local192 < local11 + 104; local192++) {
				for (local209 = local17; local209 < local17 + 104; local209++) {
					for (local213 = arg1; arg1 + 1 >= local213 && local213 <= 3; local213++) {
						if (Static90.method1687(local209, arg1, local213, local192)) {
							@Pc(619) Interface2 local619 = (Interface2) Static102.method2138(local213, local192, local209);
							if (local619 == null) {
								local619 = (Interface2) Static292.method4418(local213, local192, local209, dc.class);
							}
							if (local619 == null) {
								local619 = (Interface2) Static368.method4614(local213, local192, local209);
							}
							if (local619 == null) {
								local619 = (Interface2) Static95.method5549(local213, local192, local209);
							}
							if (local619 != null) {
								@Pc(660) Class172 local660 = Static221.aClass118_6.method2858(local619.method5651());
								if (!local660.aBoolean320 || Static269.aBoolean348) {
									local277 = local660.anInt4105;
									if (local660.anIntArray801 != null) {
										for (local281 = 0; local281 < local660.anIntArray801.length; local281++) {
											if (local660.anIntArray801[local281] != -1) {
												@Pc(689) Class172 local689 = Static221.aClass118_6.method2858(local660.anIntArray801[local281]);
												if (local689.anInt4105 >= 0) {
													local277 = local689.anInt4105;
												}
											}
										}
									}
									if (local277 >= 0) {
										@Pc(705) boolean local705 = false;
										if (local277 >= 0) {
											@Pc(712) Class243 local712 = Static158.aClass226_1.method4913(local277);
											if (local712 != null && local712.aBoolean453) {
												local705 = true;
											}
										}
										local300 = local192;
										@Pc(723) int local723 = local209;
										if (local705) {
											@Pc(730) int[][] local730 = Static58.aClass188Array1[local213].anIntArrayArray34;
											@Pc(735) int local735 = Static58.aClass188Array1[local213].anInt4570;
											@Pc(740) int local740 = Static58.aClass188Array1[local213].anInt4574;
											for (@Pc(742) int local742 = 0; local742 < 10; local742++) {
												@Pc(749) int local749 = (int) (Math.random() * 4.0D);
												if (local749 == 0 && local300 > local11 && local300 > local192 - 3 && (local730[local300 - local735 - 1][local723 - local740] & 0x2C0108) == 0) {
													local300--;
												}
												if (local749 == 1 && local300 < local11 + 103 && local192 + 3 > local300 && (local730[local300 + 1 - local735][local723 - local740] & 0x2C0180) == 0) {
													local300++;
												}
												if (local749 == 2 && local723 > local17 && local723 > local209 - 3 && (local730[local300 - local735][local723 - local740 - 1] & 0x2C0102) == 0) {
													local723--;
												}
												if (local749 == 3 && local17 + 104 - 1 > local723 && local723 < local209 + 3 && (local730[local300 - local735][local723 + 1 - local740] & 0x2C0120) == 0) {
													local723++;
												}
											}
										}
										Static128.anIntArray535[Static113.anInt2428] = local660.anInt4131;
										Static168.anIntArray641[Static113.anInt2428] = local300;
										Static26.anIntArray115[Static113.anInt2428] = local723;
										Static113.anInt2428++;
									}
								}
							}
						}
					}
				}
			}
			if (Static47.aClass209_1 != null) {
				Static29.aClass171_10.anInt4076 = 1;
				Static158.aClass226_1.method4912(1024, 64);
				for (local209 = 0; local209 < Static47.aClass209_1.anInt5088; local209++) {
					local213 = Static47.aClass209_1.anIntArray1006[local209];
					if (Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69 == local213 >> 28) {
						local217 = (local213 >> 14 & 0x3FFF) - Static28.anInt606;
						local270 = (local213 & 0x3FFF) - Static319.anInt5425;
						if (local217 >= 0 && local217 < Static246.anInt4374 && local270 >= 0 && Static185.anInt3485 > local270) {
							Static104.aClass30_14.method685(new Class2_Sub14(local209));
						} else {
							@Pc(1022) Class243 local1022 = Static158.aClass226_1.method4913(Static47.aClass209_1.anIntArray1007[local209]);
							if (local1022.anIntArray1317 != null && local1022.anInt6375 + local217 >= 0 && local217 + local1022.anInt6366 < Static246.anInt4374 && local1022.anInt6357 + local270 >= 0 && Static185.anInt3485 > local1022.anInt6350 + local270) {
								Static104.aClass30_14.method685(new Class2_Sub14(local209));
							}
						}
					}
				}
				Static158.aClass226_1.method4912(128, 64);
				Static29.aClass171_10.anInt4076 = 2;
				Static29.aClass171_10.method3763();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "(I)V")
	public static void method3900() {
		Static333.aClass160_54.method3605();
		Static340.aClass160_58.method3605();
		Static41.aClass160_6.method3605();
		Static1.aClass160_63.method3605();
		Static298.aClass160_47.method3605();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B[[[Lclient!wr;)V")
	public static void method3901(@OriginalArg(1) Class251[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class251[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class251 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass1_Sub3_2 instanceof Interface2) {
							((Interface2) local23.aClass1_Sub3_2).method5653();
						}
						if (local23.aClass1_Sub2_2 instanceof Interface2) {
							((Interface2) local23.aClass1_Sub2_2).method5653();
						}
						if (local23.aClass1_Sub2_3 instanceof Interface2) {
							((Interface2) local23.aClass1_Sub2_3).method5653();
						}
						if (local23.aClass1_Sub1_3 instanceof Interface2) {
							((Interface2) local23.aClass1_Sub1_3).method5653();
						}
						if (local23.aClass1_Sub1_2 instanceof Interface2) {
							((Interface2) local23.aClass1_Sub1_2).method5653();
						}
						for (@Pc(75) Class46 local75 = local23.aClass46_3; local75 != null; local75 = local75.aClass46_1) {
							@Pc(80) Class1_Sub5 local80 = local75.aClass1_Sub5_1;
							if (local80 instanceof Interface2) {
								((Interface2) local80).method5653();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)Lclient!vb;")
	public static Class193 method3902() {
		try {
			return (Class193) Class.forName("Class193_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "(I)Lclient!kk;")
	public static Class2_Sub16 method3903() {
		@Pc(8) Class2_Sub16 local8 = new Class2_Sub16(38);
		local8.method5358(15);
		local8.method5358(Static3.anInt131);
		local8.method5358(Static273.aBoolean353 ? 1 : 0);
		local8.method5358(Static272.aBoolean352 ? 1 : 0);
		local8.method5358(Static349.aBoolean351 ? 1 : 0);
		local8.method5358(Static6.aBoolean21 ? 1 : 0);
		local8.method5358(0);
		local8.method5358(Static10.aBoolean424 ? 1 : 0);
		local8.method5358(Static187.aBoolean270 ? 1 : 0);
		local8.method5358(Static178.aBoolean265 ? 1 : 0);
		local8.method5358(Static202.anInt3721);
		local8.method5358(Static212.aBoolean293 ? 1 : 0);
		local8.method5358(Static385.aBoolean467 ? 1 : 0);
		local8.method5358(Static58.aBoolean89 ? 1 : 0);
		local8.method5358(Static132.anInt2709);
		local8.method5358(Static343.aBoolean422 ? 1 : 0);
		local8.method5358(Static143.anInt2862);
		local8.method5358(Static322.anInt5529);
		local8.method5358(Static330.anInt5659);
		local8.method5351(Static364.anInt6192);
		local8.method5351(Static132.anInt2711);
		local8.method5358(Static232.method3779());
		local8.method5355(Static80.anInt1467);
		local8.method5358(Static213.anInt3866);
		local8.method5358(Static214.aBoolean294 ? 1 : 0);
		local8.method5358(Static207.aBoolean371 ? 1 : 0);
		local8.method5358(Static81.anInt1473);
		local8.method5358(Static262.aBoolean340 ? 1 : 0);
		local8.method5358(Static278.aBoolean357 ? 1 : 0);
		local8.method5358(Static116.anInt2496);
		local8.method5358(Static358.aBoolean142 ? 1 : 0);
		local8.method5358(Static182.anInt3879);
		local8.method5358(Static29.anInt617);
		return local8;
	}
}
