import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Lclient!li;")
	public static Class143 aClass143_2;

	@OriginalMember(owner = "client!de", name = "r", descriptor = "I")
	public static int anInt1701;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "Lclient!bu;")
	public static Class32 aClass32_29;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_49 = new Class189(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!de", name = "s", descriptor = "I")
	public static int anInt1702 = 0;

	@OriginalMember(owner = "client!de", name = "t", descriptor = "I")
	public static int anInt1703 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIILclient!no;)Lclient!dj;")
	public static Class3_Sub4_Sub7 method1311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class167 arg2) {
		@Pc(10) int local10 = arg0 << 8 | arg2.anInt5066;
		@Pc(19) Class3_Sub4_Sub7 local19 = (Class3_Sub4_Sub7) Static312.aClass101_2.method2479((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static46.aClass32_17.method811(Static46.aClass32_17.method798(local10));
		if (local31 == null) {
			local10 = arg2.anInt5066 | arg1 + 65536 << 8;
			local19 = (Class3_Sub4_Sub7) Static312.aClass101_2.method2479((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static46.aClass32_17.method811(Static46.aClass32_17.method798(local10));
			if (local31 == null) {
				local10 = arg2.anInt5066 | 0xFFFF00;
				local19 = (Class3_Sub4_Sub7) Static312.aClass101_2.method2479((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static46.aClass32_17.method811(Static46.aClass32_17.method798(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					local19 = Static9.method117(local31);
					local19.aClass167_2 = arg2;
					Static312.aClass101_2.method2477((long) local10 << 16, local19);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				local19 = Static9.method117(local31);
				local19.aClass167_2 = arg2;
				Static312.aClass101_2.method2477((long) local10 << 16, local19);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			local19 = Static9.method117(local31);
			local19.aClass167_2 = arg2;
			Static312.aClass101_2.method2477((long) local10 << 16, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method1312() {
		@Pc(12) int local12 = Static299.aByteArrayArray15.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			if (Static299.aByteArrayArray15[local14] != null) {
				@Pc(22) int local22 = -1;
				for (@Pc(24) int local24 = 0; local24 < Static138.anInt2891; local24++) {
					if (Static81.anIntArray204[local14] == Static389.anIntArray411[local24]) {
						local22 = local24;
						break;
					}
				}
				if (local22 == -1) {
					Static389.anIntArray411[Static138.anInt2891] = Static81.anIntArray204[local14];
					local22 = Static138.anInt2891++;
				}
				@Pc(68) Class3_Sub7 local68 = new Class3_Sub7(Static299.aByteArrayArray15[local14]);
				@Pc(70) int local70 = 0;
				while (local68.anInt3235 < Static299.aByteArrayArray15[local14].length && local70 < 511 && Static54.anInt1472 < 1023) {
					@Pc(89) int local89 = local70++ << 6 | local22;
					@Pc(93) int local93 = local68.method2588();
					@Pc(97) int local97 = local93 >> 14;
					@Pc(103) int local103 = local93 >> 7 & 0x3F;
					@Pc(107) int local107 = local93 & 0x3F;
					@Pc(119) int local119 = local103 + (Static81.anIntArray204[local14] >> 8) * 64 - Static223.anInt7618;
					@Pc(132) int local132 = (Static81.anIntArray204[local14] & 0xFF) * 64 + local107 - Static57.anInt5085;
					@Pc(139) Class47 local139 = Static364.aClass96_2.method2199(local68.method2588());
					if (Static139.aClass7_Sub2_Sub3_Sub1Array11[local89] == null && (local139.aByte28 & 0x1) > 0 && Static228.anInt4246 == local97 && local119 >= 0 && local119 + local139.anInt1616 < Static40.anInt1089 && local132 >= 0 && local132 + local139.anInt1616 < Static44.anInt7276) {
						Static139.aClass7_Sub2_Sub3_Sub1Array11[local89] = new Class7_Sub2_Sub3_Sub1();
						Static139.aClass7_Sub2_Sub3_Sub1Array11[local89].anInt4391 = local89;
						@Pc(198) Class7_Sub2_Sub3_Sub1 local198 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local89];
						Static319.anIntArray114[Static54.anInt1472++] = local89;
						local198.anInt4357 = Static253.anInt4787;
						local198.method454(local139);
						local198.method3515(local198.aClass47_1.anInt1616);
						local198.anInt4363 = local198.aClass47_1.anInt1592 << 3;
						if (local198.anInt4363 == 0) {
							local198.method3503(0);
						} else {
							local198.method3503((local198.aClass47_1.aByte26 + 4 & 0xCB000007) << 11);
						}
						local198.method458(local198.method3499(), local97, true, local132, local119);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!qa;I)Z")
	public static boolean method1317(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = (Static40.anInt1089 - 104) / 2;
		@Pc(15) int local15 = (Static44.anInt7276 - 104) / 2;
		@Pc(17) boolean local17 = true;
		@Pc(25) int local25;
		@Pc(35) int local35;
		for (@Pc(19) int local19 = local9; local19 < local9 + 104; local19++) {
			for (@Pc(22) int local22 = local15; local22 < local15 + 104; local22++) {
				for (local25 = arg1; local25 <= 3; local25++) {
					if (Static222.method3354(local22, local19, local25, arg1)) {
						local35 = local25;
						if (Static309.method4307(local19, local22)) {
							local35 = local25 - 1;
						}
						if (local35 >= 0) {
							local17 &= Static255.method3775(local35, local22, local19);
						}
					}
				}
			}
		}
		if (!local17) {
			return false;
		}
		@Pc(76) int[] local76 = new int[262144];
		for (local25 = 0; local25 < local76.length; local25++) {
			local76[local25] = -16777216;
		}
		Static378.aClass8_25 = arg0.method5478(local76, 512, 512, 512);
		Static373.method4873();
		local35 = ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(142) int local142 = ((int) (Math.random() * 20.0D) + 228 | 0xC009FF00) << 16;
		@Pc(161) int local161 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(165) boolean[][] local165 = new boolean[Static420.anInt6877][Static420.anInt6877];
		@Pc(170) int local170;
		@Pc(186) int local186;
		@Pc(189) int local189;
		@Pc(192) int local192;
		@Pc(245) int local245;
		@Pc(250) int local250;
		@Pc(254) int local254;
		@Pc(273) int local273;
		for (@Pc(167) int local167 = local9; local167 < local9 + 104; local167 += Static420.anInt6877) {
			for (local170 = local15; local170 < local15 + 104; local170 += Static420.anInt6877) {
				arg0.pa(0, 0, Static420.anInt6877 * 4, Static420.anInt6877 * 4);
				arg0.M(-16777216);
				for (local186 = arg1; local186 <= 3; local186++) {
					for (local189 = 0; local189 < Static420.anInt6877; local189++) {
						for (local192 = 0; local192 < Static420.anInt6877; local192++) {
							local165[local189][local192] = Static222.method3354(local192 + local170, local167 + local189, local186, arg1);
						}
					}
					Static26.aClass159Array1[local186].method4832(local167, local170, Static420.anInt6877 + local167, Static420.anInt6877 + local170, local165);
					if (!Static25.aBoolean65) {
						for (local192 = -4; local192 < Static420.anInt6877; local192++) {
							for (local245 = -4; local245 < Static420.anInt6877; local245++) {
								local250 = local167 + local192;
								local254 = local245 + local170;
								if (local250 >= local9 && local15 <= local254 && Static222.method3354(local254, local250, local186, arg1)) {
									local273 = local186;
									if (Static309.method4307(local250, local254)) {
										local273 = local186 - 1;
									}
									if (local273 >= 0) {
										Static24.method587(local254, local142, (Static420.anInt6877 - local245) * 4 - 4, local250, local192 * 4, local273, arg0, local35);
									}
								}
							}
						}
					}
				}
				if (Static25.aBoolean65) {
					@Pc(327) Class29 local327 = Static382.aClass29Array3[arg1];
					for (local192 = 0; local192 < Static420.anInt6877; local192++) {
						for (local245 = 0; local245 < Static420.anInt6877; local245++) {
							local250 = local167 + local192;
							local254 = local245 + local170;
							local273 = local327.anIntArrayArray8[local250 - local327.anInt1055][local254 - local327.anInt1062];
							if ((local273 & 0x40240000) != 0) {
								arg0.method5507(-1713569622, 4, local192 * 4, (Static420.anInt6877 - local245) * 4 - 4, 4);
							} else if ((local273 & 0x800000) != 0) {
								arg0.method5517(local192 * 4, -1713569622, (Static420.anInt6877 - local245) * 4 - 4, 4);
							} else if ((local273 & 0x2000000) != 0) {
								arg0.method5504(4, local192 * 4 + 3, (-local245 + Static420.anInt6877) * 4 + -4, -1713569622);
							} else if ((local273 & 0x8000000) != 0) {
								arg0.method5517(local192 * 4, -1713569622, (Static420.anInt6877 - local245) * 4 + 3 - 4, 4);
							} else if ((local273 & 0x20000000) != 0) {
								arg0.method5504(4, local192 * 4, (Static420.anInt6877 - local245) * 4 - 4, -1713569622);
							}
						}
					}
				}
				arg0.NA(0, 0, Static420.anInt6877 * 4, Static420.anInt6877 * 4, local161, 2);
				Static378.aClass8_25.W((local167 - local9) * 4 + 48, -(Static420.anInt6877 * 4) + 464 + -((-local15 + local170) * 4), Static420.anInt6877 * 4, Static420.anInt6877 * 4, 0, 0);
			}
		}
		arg0.va();
		arg0.M(-16777215);
		Static36.method725();
		Static154.anInt3098 = 0;
		Static347.aClass243_37.method5200();
		if (!Static25.aBoolean65) {
			for (local170 = local9; local170 < local9 + 104; local170++) {
				for (local186 = local15; local186 < local15 + 104; local186++) {
					for (local189 = arg1; local189 <= arg1 + 1 && local189 <= 3; local189++) {
						if (Static222.method3354(local186, local170, local189, arg1)) {
							@Pc(592) Interface8 local592 = (Interface8) Static166.method2721(local189, local170, local186);
							if (local592 == null) {
								local592 = (Interface8) Static314.method4348(local189, local170, local186, pa.class);
							}
							if (local592 == null) {
								local592 = (Interface8) Static321.method4376(local189, local170, local186);
							}
							if (local592 == null) {
								local592 = (Interface8) Static113.method4396(local189, local170, local186);
							}
							if (local592 != null) {
								@Pc(633) Class93 local633 = Static435.aClass30_4.method769(local592.method4808());
								if (!local633.aBoolean250 || Static187.aBoolean320) {
									local250 = local633.anInt2790;
									if (local633.anIntArray171 != null) {
										for (local254 = 0; local254 < local633.anIntArray171.length; local254++) {
											if (local633.anIntArray171[local254] != -1) {
												@Pc(661) Class93 local661 = Static435.aClass30_4.method769(local633.anIntArray171[local254]);
												if (local661.anInt2790 >= 0) {
													local250 = local661.anInt2790;
												}
											}
										}
									}
									if (local250 >= 0) {
										@Pc(684) boolean local684 = false;
										if (local250 >= 0) {
											@Pc(694) Class90 local694 = Static168.aClass171_3.method3940(local250);
											if (local694 != null && local694.aBoolean242) {
												local684 = true;
											}
										}
										local273 = local170;
										@Pc(705) int local705 = local186;
										if (local684) {
											@Pc(712) int[][] local712 = Static382.aClass29Array3[local189].anIntArrayArray8;
											@Pc(717) int local717 = Static382.aClass29Array3[local189].anInt1055;
											@Pc(722) int local722 = Static382.aClass29Array3[local189].anInt1062;
											for (@Pc(724) int local724 = 0; local724 < 10; local724++) {
												@Pc(730) int local730 = (int) (Math.random() * 4.0D);
												if (local730 == 0 && local9 < local273 && local170 - 3 < local273 && (local712[local273 - local717 - 1][local705 - local722] & 0x2C0108) == 0) {
													local273--;
												}
												if (local730 == 1 && local273 < local9 + 103 && local273 < local170 + 3 && (local712[local273 + 1 - local717][local705 - local722] & 0x2C0180) == 0) {
													local273++;
												}
												if (local730 == 2 && local15 < local705 && local186 - 3 < local705 && (local712[local273 - local717][local705 - local722 - 1] & 0x2C0102) == 0) {
													local705--;
												}
												if (local730 == 3 && local705 < local15 + 104 - 1 && local186 + 3 > local705 && (local712[local273 - local717][local705 + 1 - local722] & 0x2C0120) == 0) {
													local705++;
												}
											}
										}
										Static13.anIntArray49[Static154.anInt3098] = local633.anInt2747;
										Static328.anIntArray376[Static154.anInt3098] = local273;
										Static380.anIntArray221[Static154.anInt3098] = local705;
										Static154.anInt3098++;
									}
								}
							}
						}
					}
				}
			}
			if (Static240.aClass116_2 != null) {
				Static13.aClass32_4.anInt1093 = 1;
				Static168.aClass171_3.method3941(64, 1024);
				for (local186 = 0; local186 < Static240.aClass116_2.anInt3457; local186++) {
					local189 = Static240.aClass116_2.anIntArray224[local186];
					if (Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77 == local189 >> 28) {
						local192 = (local189 >> 14 & 0x3FFF) - Static223.anInt7618;
						local245 = (local189 & 0x3FFF) - Static57.anInt5085;
						if (local192 >= 0 && local192 < Static40.anInt1089 && local245 >= 0 && Static44.anInt7276 > local245) {
							Static347.aClass243_37.method5198(new Class3_Sub34(local186));
						} else {
							@Pc(970) Class90 local970 = Static168.aClass171_3.method3940(Static240.aClass116_2.anIntArray225[local186]);
							if (local970.anIntArray162 != null && local970.anInt2710 + local192 >= 0 && local970.anInt2705 + local192 < Static40.anInt1089 && local970.anInt2712 + local245 >= 0 && Static44.anInt7276 > local970.anInt2726 + local245) {
								Static347.aClass243_37.method5198(new Class3_Sub34(local186));
							}
						}
					}
				}
				Static168.aClass171_3.method3941(64, 128);
				Static13.aClass32_4.anInt1093 = 2;
				Static13.aClass32_4.method803();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIII)V")
	public static void method1318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) int local7 = Static160.anInt3271;
		Static70.anInt1795 = 0;
		@Pc(11) int[] local11 = Static162.anIntArray212;
		@Pc(191) int local191;
		@Pc(245) int local245;
		@Pc(324) int local324;
		@Pc(409) int local409;
		@Pc(865) int local865;
		@Pc(499) int local499;
		for (@Pc(13) int local13 = 0; local13 < Static54.anInt1472 + local7; local13++) {
			@Pc(17) Class47 local17 = null;
			@Pc(30) Class7_Sub2_Sub3 local30;
			if (local13 < local7) {
				local30 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local11[local13]];
			} else {
				local30 = Static139.aClass7_Sub2_Sub3_Sub1Array11[Static319.anIntArray114[local13 - local7]];
				local17 = ((Class7_Sub2_Sub3_Sub1) local30).aClass47_1;
				if (local17.anIntArray94 != null) {
					local17 = local17.method1251(Static85.aClass49_1);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local30.lb >= 0 && (Static52.anInt1374 == local30.anInt4375 || local30.aByte77 == Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77)) {
				Static329.method4447(arg0 >> 1, arg3 >> 1, local30, local30.method3511());
				if (Static196.anIntArray248[0] >= 0) {
					if (local30.aString35 != null && (local7 <= local13 || Static1.anInt23 == 0 || Static1.anInt23 == 3 || Static1.anInt23 == 1 && Static422.method5383(((Class7_Sub2_Sub3_Sub2) local30).aString36)) && Static70.anInt1795 < Static131.anInt2720) {
						Static131.anIntArray161[Static70.anInt1795] = Static269.aClass70_27.method1759(local30.aString35) / 2;
						Static131.anIntArray163[Static70.anInt1795] = Static196.anIntArray248[0];
						Static131.anIntArray165[Static70.anInt1795] = Static196.anIntArray248[1];
						Static131.anIntArray166[Static70.anInt1795] = local30.anInt4367;
						Static131.anIntArray164[Static70.anInt1795] = local30.anInt4377;
						Static131.anIntArray167[Static70.anInt1795] = local30.anInt4335;
						Static131.aStringArray26[Static70.anInt1795] = local30.aString35;
						Static70.anInt1795++;
					}
					@Pc(174) int local174 = arg2 + Static196.anIntArray248[1];
					@Pc(230) Class8[] local230;
					@Pc(237) Class264[] local237;
					@Pc(297) Class8 local297;
					if (local30.aBoolean375 || Static253.anInt4787 >= local30.anInt4344) {
						local174 -= Math.max(Static269.aClass70_27.anInt2278, Static387.aClass8Array185[0].qa());
					} else {
						@Pc(185) byte local185 = 1;
						if (local7 <= local13) {
							local191 = local17.anInt1620;
							if (local191 == -1) {
								local191 = local30.method3514().anInt24;
							}
						} else {
							@Pc(207) Class7_Sub2_Sub3_Sub2 local207 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local11[local13]];
							local191 = local30.method3514().anInt24;
							if (local207.aBoolean380) {
								local185 = 2;
							}
						}
						@Pc(219) Class8[] local219 = Static387.aClass8Array185;
						if (local191 != -1) {
							local230 = (Class8[]) Static266.aClass126_30.method3141((long) local191);
							if (local230 == null) {
								local237 = Static464.method5837(Static405.aClass32_82, local191);
								if (local237 != null) {
									local230 = new Class8[local237.length];
									for (local245 = 0; local245 < local237.length; local245++) {
										local230[local245] = Static121.aClass172_3.method5542(local237[local245]);
									}
									Static266.aClass126_30.method3132((long) local191, local230);
								}
							}
							if (local230 != null && local230.length >= 2) {
								local219 = local230;
							}
						}
						if (local185 >= local219.length) {
							local185 = 1;
						}
						@Pc(293) Class8 local293 = local219[0];
						local297 = local219[local185];
						local174 -= Math.max(Static269.aClass70_27.anInt2278, local293.qa());
						local245 = Static196.anIntArray248[0] + arg1 - (local293.UA() >> 1);
						local324 = local293.UA() * local30.anInt4376 / 255;
						if (local30.anInt4376 > 0 && local324 < 2) {
							local324 = 2;
						}
						local293.method6001(local245, local174);
						Static121.aClass172_3.Z(local245, local174, local324 + local245, local293.qa() + local174);
						local297.method6001(local245, local174);
						Static121.aClass172_3.pa(arg1, arg2, arg0 + arg1, arg3 + arg2);
					}
					local174 -= 2;
					if (!local30.aBoolean375) {
						@Pc(390) Class8 local390;
						if (Static253.anInt4787 < local30.anInt4334) {
							local390 = Static331.aClass8Array209[local30.aBoolean377 ? 2 : 0];
							@Pc(399) Class8 local399 = Static331.aClass8Array209[local30.aBoolean377 ? 3 : 1];
							if (local30 instanceof Class7_Sub2_Sub3_Sub1) {
								local409 = local17.anInt1600;
								if (local409 == -1) {
									local409 = local30.method3514().anInt25;
								}
							} else {
								local409 = local30.method3514().anInt25;
							}
							if (local409 != -1) {
								local230 = (Class8[]) Static38.aClass126_4.method3141((long) local409);
								if (local230 == null) {
									local237 = Static464.method5837(Static405.aClass32_82, local409);
									if (local237 != null) {
										local230 = new Class8[local237.length];
										for (local245 = 0; local245 < local237.length; local245++) {
											local230[local245] = Static121.aClass172_3.method5542(local237[local245]);
										}
										Static38.aClass126_4.method3132((long) local409, local230);
									}
								}
								if (local230 != null && local230.length == 4) {
									local399 = local230[local30.aBoolean377 ? 3 : 1];
									local390 = local230[local30.aBoolean377 ? 2 : 0];
								}
							}
							local499 = local30.anInt4334 - Static253.anInt4787;
							@Pc(510) int local510;
							if (local30.anInt4383 >= local499) {
								local510 = local390.UA();
							} else {
								local499 -= local30.anInt4383;
								local245 = local30.anInt4358 == 0 ? 0 : local30.anInt4358 * ((local30.anInt4337 - local499) / local30.anInt4358);
								local510 = local245 * local390.UA() / local30.anInt4337;
							}
							local245 = local390.qa();
							local174 -= local245;
							local324 = arg1 + Static196.anIntArray248[0] - (local390.UA() >> 1);
							local390.method6001(local324, local174);
							Static121.aClass172_3.Z(local324, local174, local324 + local510, local174 - -local245);
							local399.method6001(local324, local174);
							Static121.aClass172_3.pa(arg1, arg2, arg0 + arg1, arg2 - -arg3);
							local174 -= 2;
						}
						if (local13 < local7) {
							@Pc(640) Class7_Sub2_Sub3_Sub2 local640 = (Class7_Sub2_Sub3_Sub2) local30;
							if (local640.anInt4413 != -1) {
								local174 -= 25;
								Static161.aClass8Array89[local640.anInt4413].method6001(Static196.anIntArray248[0] + arg1 - 12, local174);
								local174 -= 2;
							}
							if (local640.anInt4431 != -1) {
								local174 -= 25;
								Static165.aClass8Array91[local640.anInt4431].method6001(arg1 + Static196.anIntArray248[0] - 12, local174);
								local174 -= 2;
							}
						} else if (local17.anInt1601 >= 0 && local17.anInt1601 < Static165.aClass8Array91.length) {
							local174 -= 25;
							local390 = Static165.aClass8Array91[local17.anInt1601];
							local390.method6001(Static196.anIntArray248[0] + arg1 - (local390.UA() >> 1), local174);
							local174 -= 2;
						}
					}
					@Pc(686) Class196[] local686;
					@Pc(694) Class196 local694;
					if (!(local30 instanceof Class7_Sub2_Sub3_Sub2)) {
						local191 = 0;
						local686 = Static331.aClass196Array41;
						for (local409 = 0; local409 < local686.length; local409++) {
							local694 = local686[local409];
							if (local694 != null && local694.anInt5507 == 1 && local694.anInt5501 == Static319.anIntArray114[local13 - local7]) {
								local297 = Static37.aClass8Array28[local694.anInt5502];
								if (local191 < local297.qa()) {
									local191 = local297.qa();
								}
								if (Static253.anInt4787 % 20 < 10) {
									local297.method6001(Static196.anIntArray248[0] + arg1 - 12, -local297.qa() + local174);
								}
							}
						}
						if (local191 > 0) {
						}
					} else if (local13 >= 0) {
						local191 = 0;
						local686 = Static331.aClass196Array41;
						for (local409 = 0; local409 < local686.length; local409++) {
							local694 = local686[local409];
							if (local694 != null && local694.anInt5507 == 10 && local11[local13] == local694.anInt5501) {
								local297 = Static37.aClass8Array28[local694.anInt5502];
								if (local191 < local297.qa()) {
									local191 = local297.qa();
								}
								local297.method6001(arg1 + Static196.anIntArray248[0] - 12, local174 + -local297.qa());
							}
						}
						if (local191 > 0) {
						}
					}
					for (local191 = 0; local191 < 4; local191++) {
						if (Static253.anInt4787 < local30.anIntArray286[local191]) {
							local865 = local30.method3511() / 2;
							Static329.method4447(arg0 >> 1, arg3 >> 1, local30, local865);
							if (Static196.anIntArray248[0] > -1) {
								if (local191 == 1) {
									Static196.anIntArray248[1] -= 20;
								}
								if (local191 == 2) {
									Static196.anIntArray248[1] -= 10;
									Static196.anIntArray248[0] -= 15;
								}
								if (local191 == 3) {
									Static196.anIntArray248[0] += 15;
									Static196.anIntArray248[1] -= 10;
								}
								Static99.aClass8Array65[local30.anIntArray284[local191]].method6001(arg1 + Static196.anIntArray248[0] - 12, arg2 + Static196.anIntArray248[1] + -12);
								Static271.aClass59_2.method5774(Integer.toString(local30.anIntArray285[local191]), -1, 0, arg2 + Static196.anIntArray248[1] + 3, Static196.anIntArray248[0] + -1 + arg1);
							}
						}
					}
				}
			}
		}
		@Pc(998) int local998;
		for (@Pc(992) int local992 = 0; local992 < Static235.anInt4541; local992++) {
			local998 = Static255.anIntArray319[local992];
			@Pc(1009) Class7_Sub2_Sub3 local1009;
			if (local998 >= 2048) {
				local1009 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local998 - 2048];
			} else {
				local1009 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local998];
			}
			local191 = Static153.anIntArray195[local992];
			@Pc(1028) Class7_Sub2_Sub3 local1028;
			if (local191 < 2048) {
				local1028 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local191];
			} else {
				local1028 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local191 - 2048];
			}
			Static2.method10(--local1009.anInt4373, arg1, local1028, arg2, arg0, arg3, local1009);
		}
		local998 = Static269.aClass70_27.anInt2270 + Static269.aClass70_27.anInt2278 + 2;
		for (local191 = 0; local191 < Static70.anInt1795; local191++) {
			local865 = Static131.anIntArray163[local191];
			local409 = Static131.anIntArray165[local191];
			local499 = Static131.anIntArray161[local191];
			@Pc(1091) boolean local1091 = true;
			while (local1091) {
				local1091 = false;
				for (local245 = 0; local245 < local191; local245++) {
					if (local409 + 2 > -local998 + Static131.anIntArray165[local245] && Static131.anIntArray165[local245] + 2 > -local998 + local409 && Static131.anIntArray163[local245] + Static131.anIntArray161[local245] > local865 + -local499 && local865 + local499 > Static131.anIntArray163[local245] + -Static131.anIntArray161[local245] && local409 > Static131.anIntArray165[local245] - local998) {
						local1091 = true;
						local409 = Static131.anIntArray165[local245] - local998;
					}
				}
			}
			Static131.anIntArray165[local191] = local409;
			@Pc(1176) String local1176 = Static131.aStringArray26[local191];
			if (Static43.anInt1143 == 0) {
				local324 = 16776960;
				if (Static131.anIntArray166[local191] < 6) {
					local324 = Static229.anIntArray282[Static131.anIntArray166[local191]];
				}
				if (Static131.anIntArray166[local191] == 6) {
					local324 = Static52.anInt1374 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static131.anIntArray166[local191] == 7) {
					local324 = Static52.anInt1374 % 20 < 10 ? 255 : 65535;
				}
				if (Static131.anIntArray166[local191] == 8) {
					local324 = Static52.anInt1374 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(1267) int local1267;
				if (Static131.anIntArray166[local191] == 9) {
					local1267 = 150 - Static131.anIntArray167[local191];
					if (local1267 < 50) {
						local324 = local1267 * 1280 + 16711680;
					} else if (local1267 < 100) {
						local324 = 16384000 + 16776960 - local1267 * 327680;
					} else if (local1267 < 150) {
						local324 = (local1267 - 100) * 5 + 65280;
					}
				}
				if (Static131.anIntArray166[local191] == 10) {
					local1267 = 150 - Static131.anIntArray167[local191];
					if (local1267 < 50) {
						local324 = local1267 * 5 + 16711680;
					} else if (local1267 < 100) {
						local324 = 16384000 + 16711935 - local1267 * 327680;
					} else if (local1267 < 150) {
						local324 = (local1267 - 100) * 327680 + 500 + 255 - local1267 * 5;
					}
				}
				if (Static131.anIntArray166[local191] == 11) {
					local1267 = 150 - Static131.anIntArray167[local191];
					if (local1267 < 50) {
						local324 = 16777215 - local1267 * 327685;
					} else if (local1267 < 100) {
						local324 = (local1267 - 50) * 327685 + 65280;
					} else if (local1267 < 150) {
						local324 = 16777215 - (local1267 - 100) * 327680;
					}
				}
				local1267 = local324 | 0xFF000000;
				if (Static131.anIntArray164[local191] == 0) {
					Static321.aClass59_4.method5774(local1176, local1267, -16777216, local409 + arg2, arg1 - -local865);
				}
				if (Static131.anIntArray164[local191] == 1) {
					Static321.aClass59_4.method5772(local1176, Static52.anInt1374, arg2 + local409, local1267, local865 + arg1);
				}
				if (Static131.anIntArray164[local191] == 2) {
					Static321.aClass59_4.method5779(local1267, local409 + arg2, local1176, arg1 + local865, Static52.anInt1374);
				}
				if (Static131.anIntArray164[local191] == 3) {
					Static321.aClass59_4.method5773(local409 + arg2, Static52.anInt1374, local1267, local865 + arg1, -Static131.anIntArray167[local191] + 150, local1176);
				}
				@Pc(1526) int local1526;
				if (Static131.anIntArray164[local191] == 4) {
					local1526 = (150 - Static131.anIntArray167[local191]) * (Static269.aClass70_27.method1759(local1176) + 100) / 150;
					Static121.aClass172_3.Z(local865 + arg1 - 50, arg2, local865 + arg1 + 50, arg2 + arg3);
					Static321.aClass59_4.method5788(-16777216, local1176, local1267, arg1 + local865 + 50 - local1526, local409 + arg2);
					Static121.aClass172_3.pa(arg1, arg2, arg0 + arg1, arg2 - -arg3);
				}
				if (Static131.anIntArray164[local191] == 5) {
					local1526 = 150 - Static131.anIntArray167[local191];
					@Pc(1584) int local1584 = 0;
					if (local1526 < 25) {
						local1584 = local1526 - 25;
					} else if (local1526 > 125) {
						local1584 = local1526 - 125;
					}
					@Pc(1610) int local1610 = Static269.aClass70_27.anInt2278 + Static269.aClass70_27.anInt2270;
					Static121.aClass172_3.Z(arg1, arg2 + local409 - local1610 - 1, arg1 - -arg0, local409 + arg2 + 5);
					Static321.aClass59_4.method5774(local1176, local1267, -16777216, local1584 + local409 + arg2, arg1 - -local865);
					Static121.aClass172_3.pa(arg1, arg2, arg1 + arg0, arg3 + arg2);
				}
			} else {
				Static321.aClass59_4.method5774(local1176, -256, -16777216, arg2 + local409, local865 + arg1);
			}
		}
	}
}
