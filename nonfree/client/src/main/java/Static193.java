import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!jt", name = "D", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!jt", name = "x", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_56 = new Class231("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!jt", name = "C", descriptor = "[I")
	public static final int[] anIntArray305 = new int[1000];

	@OriginalMember(owner = "client!jt", name = "E", descriptor = "Lclient!ft;")
	public static final Class88 aClass88_30 = new Class88();

	@OriginalMember(owner = "client!jt", name = "H", descriptor = "Lclient!cm;")
	public static final Class44 aClass44_3 = new Class44("stellardawn", 1);

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IILclient!qq;)Z")
	public static boolean method3047(@OriginalArg(0) int arg0, @OriginalArg(2) Class28 arg1) {
		@Pc(11) int local11 = (Static84.anInt1632 - 104) / 2;
		@Pc(17) int local17 = (Static261.anInt4480 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static418.method5687(local21, local25, local29, arg0)) {
						local40 = local29;
						if (Static132.method2150(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static89.method1262(local40, local21, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(86) int[] local86 = new int[262144];
		for (local29 = 0; local29 < local86.length; local29++) {
			local86[local29] = -16777216;
		}
		Static397.aClass12_18 = arg1.method3512(local86, 512, 512, 512);
		Static116.method1890();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (-10 + 238 + (int) (Math.random() * 20.0D) << 8) + 238 - 10 | 0xFF000000;
		@Pc(155) int local155 = ((int) (Math.random() * 20.0D) + 228 | 0xFF00) << 16;
		@Pc(174) int local174 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(178) boolean[][] local178 = new boolean[Static399.anInt6596][Static399.anInt6596];
		@Pc(192) int local192;
		@Pc(209) int local209;
		@Pc(213) int local213;
		@Pc(217) int local217;
		@Pc(271) int local271;
		@Pc(277) int local277;
		@Pc(281) int local281;
		@Pc(300) int local300;
		for (@Pc(180) int local180 = local11; local180 < local11 + 104; local180 += Static399.anInt6596) {
			for (local192 = local17; local192 < local17 + 104; local192 += Static399.anInt6596) {
				arg1.method3570(0, 0, Static399.anInt6596 * 4, Static399.anInt6596 * 4);
				arg1.method3553(-16777216);
				for (local209 = arg0; local209 <= 3; local209++) {
					for (local213 = 0; local213 < Static399.anInt6596; local213++) {
						for (local217 = 0; local217 < Static399.anInt6596; local217++) {
							local178[local213][local217] = Static418.method5687(local180 + local213, local192 + local217, local209, arg0);
						}
					}
					Static93.aClass84Array1[local209].method5330(local180, local192, local180 + Static399.anInt6596, local192 - -Static399.anInt6596, local178);
					if (!Static17.aBoolean14) {
						for (local217 = -4; local217 < Static399.anInt6596; local217++) {
							for (local271 = -4; local271 < Static399.anInt6596; local271++) {
								local277 = local217 + local180;
								local281 = local192 + local271;
								if (local11 <= local277 && local17 <= local281 && Static418.method5687(local277, local281, local209, arg0)) {
									local300 = local209;
									if (Static132.method2150(local277, local281)) {
										local300 = local209 - 1;
									}
									if (local300 >= 0) {
										Static341.method4810(local281, local217 * 4, arg1, local300, local277, local40, local155, (Static399.anInt6596 - local271) * 4 - 4);
									}
								}
							}
						}
					}
				}
				if (Static17.aBoolean14) {
					@Pc(350) Class61 local350 = Static254.aClass61Array2[arg0];
					for (local217 = 0; local217 < Static399.anInt6596; local217++) {
						for (local271 = 0; local271 < Static399.anInt6596; local271++) {
							local277 = local180 + local217;
							local281 = local271 + local192;
							local300 = local350.anIntArrayArray18[local277 - local350.anInt1585][local281 - local350.anInt1580];
							if ((local300 & 0x40240000) != 0) {
								arg1.method3531(local217 * 4, -1713569622, (Static399.anInt6596 - local271) * 4 - 4, 4, 4);
							} else if ((local300 & 0x800000) != 0) {
								arg1.method3477((Static399.anInt6596 - local271) * 4 - 4, -1713569622, 4, local217 * 4);
							} else if ((local300 & 0x2000000) != 0) {
								arg1.method3534(local217 * 4 + 3, (-local271 + Static399.anInt6596) * 4 + -4, -1713569622, 4);
							} else if ((local300 & 0x8000000) != 0) {
								arg1.method3477((Static399.anInt6596 - local271) * 4 + 3 - 4, -1713569622, 4, local217 * 4);
							} else if ((local300 & 0x20000000) != 0) {
								arg1.method3534(local217 * 4, (Static399.anInt6596 - local271) * 4 - 4, -1713569622, 4);
							}
						}
					}
				}
				arg1.method3559(0, 0, Static399.anInt6596 * 4, Static399.anInt6596 * 4, local174, 2);
				Static397.aClass12_18.method5656((local180 - local11) * 4 + 48, -((local192 - local17) * 4) + 464 + -(Static399.anInt6596 * 4), Static399.anInt6596 * 4, Static399.anInt6596 * 4);
			}
		}
		arg1.method3554();
		arg1.method3553(-16777215);
		Static207.method3239();
		Static279.anInt4745 = 0;
		aClass88_30.method1887();
		if (!Static17.aBoolean14) {
			for (local192 = local11; local192 < local11 + 104; local192++) {
				for (local209 = local17; local209 < local17 + 104; local209++) {
					for (local213 = arg0; local213 <= arg0 + 1 && local213 <= 3; local213++) {
						if (Static418.method5687(local192, local209, local213, arg0)) {
							@Pc(618) Interface10 local618 = (Interface10) Static91.method1566(local213, local192, local209);
							if (local618 == null) {
								local618 = (Interface10) Static49.method903(local213, local192, local209, tf.class);
							}
							if (local618 == null) {
								local618 = (Interface10) Static428.method5836(local213, local192, local209);
							}
							if (local618 == null) {
								local618 = (Interface10) Static64.method1227(local213, local192, local209);
							}
							if (local618 != null) {
								@Pc(659) Class118 local659 = Static113.aClass127_2.method2820(local618.method5812());
								if (!local659.aBoolean219 || Static118.aBoolean158) {
									local277 = local659.anInt3024;
									if (local659.anIntArray273 != null) {
										for (local281 = 0; local281 < local659.anIntArray273.length; local281++) {
											if (local659.anIntArray273[local281] != -1) {
												@Pc(689) Class118 local689 = Static113.aClass127_2.method2820(local659.anIntArray273[local281]);
												if (local689.anInt3024 >= 0) {
													local277 = local689.anInt3024;
												}
											}
										}
									}
									if (local277 >= 0) {
										@Pc(712) boolean local712 = false;
										if (local277 >= 0) {
											@Pc(722) Class94 local722 = Static171.aClass254_3.method5834(local277);
											if (local722 != null && local722.aBoolean165) {
												local712 = true;
											}
										}
										local300 = local192;
										@Pc(733) int local733 = local209;
										if (local712) {
											@Pc(740) int[][] local740 = Static254.aClass61Array2[local213].anIntArrayArray18;
											@Pc(745) int local745 = Static254.aClass61Array2[local213].anInt1585;
											@Pc(750) int local750 = Static254.aClass61Array2[local213].anInt1580;
											for (@Pc(752) int local752 = 0; local752 < 10; local752++) {
												@Pc(759) int local759 = (int) (Math.random() * 4.0D);
												if (local759 == 0 && local11 < local300 && local300 > local192 - 3 && (local740[local300 - local745 - 1][local733 - local750] & 0x2C0108) == 0) {
													local300--;
												}
												if (local759 == 1 && local11 + 104 - 1 > local300 && local192 + 3 > local300 && (local740[local300 + 1 - local745][local733 - local750] & 0x2C0180) == 0) {
													local300++;
												}
												if (local759 == 2 && local733 > local17 && local733 > local209 - 3 && (local740[local300 - local745][local733 - local750 - 1] & 0x2C0102) == 0) {
													local733--;
												}
												if (local759 == 3 && local17 + 104 - 1 > local733 && local209 + 3 > local733 && (local740[local300 - local745][local733 + 1 - local750] & 0x2C0120) == 0) {
													local733++;
												}
											}
										}
										Static221.anIntArray322[Static279.anInt4745] = local659.anInt3021;
										Static113.anIntArray214[Static279.anInt4745] = local300;
										anIntArray305[Static279.anInt4745] = local733;
										Static279.anInt4745++;
									}
								}
							}
						}
					}
				}
			}
			if (Static63.aClass267_2 != null) {
				Static435.aClass158_94.anInt4036 = 1;
				Static171.aClass254_3.method5842(64, 1024);
				for (local209 = 0; local209 < Static63.aClass267_2.anInt7259; local209++) {
					local213 = Static63.aClass267_2.anIntArray636[local209];
					if (Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93 == local213 >> 28) {
						local217 = (local213 >> 14 & 0x3FFF) - Static206.anInt3592;
						local271 = (local213 & 0x3FFF) - Static99.anInt1814;
						if (local217 >= 0 && Static84.anInt1632 > local217 && local271 >= 0 && local271 < Static261.anInt4480) {
							aClass88_30.method1878(new Class6_Sub44(local209));
						} else {
							@Pc(1021) Class94 local1021 = Static171.aClass254_3.method5834(Static63.aClass267_2.anIntArray637[local209]);
							if (local1021.anIntArray230 != null && local1021.anInt2171 + local217 >= 0 && local217 + local1021.anInt2165 < Static84.anInt1632 && local1021.anInt2188 + local271 >= 0 && Static261.anInt4480 > local1021.anInt2173 + local271) {
								aClass88_30.method1878(new Class6_Sub44(local209));
							}
						}
					}
				}
				Static171.aClass254_3.method5842(64, 128);
				Static435.aClass158_94.anInt4036 = 2;
				Static435.aClass158_94.method3689();
			}
		}
		return true;
	}
}
