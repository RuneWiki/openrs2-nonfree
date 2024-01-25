import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!cea;")
	public static Class2_Sub11_Sub1 aClass2_Sub11_Sub1_1;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	public static int anInt2089;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	public static int anInt2092;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Lclient!rj;")
	public static Class304 aClass304_2;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
	public static boolean aBoolean178 = true;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	public static int anInt2093 = 64;

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)[Lclient!kg;")
	public static Class200[] method1721() {
		return new Class200[] { Static431.aClass200_179, Static70.aClass200_41, Static328.aClass200_126, Static162.aClass200_68, Static315.aClass200_124, Static457.aClass200_203, Static230.aClass200_83, Static333.aClass200_130, Static424.aClass200_156, Static93.aClass200_42, Static287.aClass200_226, Static310.aClass200_121, Static18.aClass200_17, Static310.aClass200_120, Static167.aClass200_70, Static473.aClass200_176, Static385.aClass200_145, Static233.aClass200_87, Static520.aClass200_193, Static345.aClass200_208, Static380.aClass200_228, Static457.aClass200_204, Static499.aClass200_151, Static488.aClass200_188, Static435.aClass200_164, Static269.aClass200_106, Static431.aClass200_180, Static229.aClass200_82, Static299.aClass200_114, Static521.aClass200_195, Static17.aClass200_16, Static318.aClass200_125, Static233.aClass200_88, Static367.aClass200_141, Static529.aClass200_196, Static529.aClass200_197, Static264.aClass200_102, Static2.aClass200_1, Static11.aClass200_3, Static55.aClass200_26, Static163.aClass200_69, Static620.aClass200_218, Static115.aClass200_50, Static409.aClass200_149, Static250.aClass200_96, Static29.aClass200_22, Static414.aClass200_152, Static420.aClass200_155, Static284.aClass200_110, Static429.aClass200_229, Static187.aClass200_75, Static635.aClass200_223, Static331.aClass200_128, Static450.aClass200_170, Static282.aClass200_175, Static31.aClass200_23, Static283.aClass200_108, Static333.aClass200_131, Static329.aClass200_127, Static114.aClass200_45, Static364.aClass200_140, Static191.aClass200_78, Static638.aClass200_224, Static61.aClass200_35, Static520.aClass200_194, Static425.aClass200_159, Static333.aClass200_129, Static572.aClass200_207, Static45.aClass200_25, Static229.aClass200_81, Static544.aClass200_202, Static626.aClass200_219, Static585.aClass200_209, Static536.aClass200_200, Static347.aClass200_215, Static643.aClass200_221, Static6.aClass200_2, Static135.aClass200_59, Static444.aClass200_167, Static448.aClass200_168, Static286.aClass200_111, Static592.aClass200_210, Static467.aClass200_227, Static450.aClass200_169, Static643.aClass200_220, Static428.aClass200_161, Static291.aClass200_113, Static359.aClass200_139, Static302.aClass200_116, Static155.aClass200_65, Static302.aClass200_115, Static335.aClass200_132, Static416.aClass200_154, Static136.aClass200_60, Static233.aClass200_86, Static186.aClass200_74, Static103.aClass200_43, Static159.aClass200_66, Static238.aClass200_189, Static564.aClass200_190, Static23.aClass200_18, Static425.aClass200_160, Static232.aClass200_85, Static266.aClass200_103, Static540.aClass200_201, Static173.aClass200_71, Static639.aClass200_225, Static231.aClass200_84, Static487.aClass200_184, Static492.aClass200_185, Static34.aClass200_24, Static159.aClass200_67, Static480.aClass200_181, Static107.aClass200_44, Static415.aClass200_162, Static244.aClass200_94, Static433.aClass200_163, Static374.aClass200_143, Static443.aClass200_166, Static284.aClass200_109, Static509.aClass200_191, Static356.aClass200_138 };
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1722() {
		@Pc(1) int local1 = Static649.anInt10495;
		@Pc(3) int[] local3 = Static426.anIntArray476;
		@Pc(8) int local8 = Static305.aClass2_Sub49_15.aClass33_Sub16_1.method5162();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class16_Sub1_Sub1_Sub3_Sub2 local32 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local3[local25]];
			if (!local32.method7021()) {
				local32.anInt8057 = -1;
			} else if (local32.aBoolean595) {
				local32.anInt8057 = -1;
			} else {
				local32.method6992();
				if (local32.aShort103 >= 0 && local32.aShort106 >= 0 && local32.aShort104 < Static456.anInt7428 && local32.aShort105 < Static5.anInt112) {
					local32.aBoolean593 = local32.aBoolean588 ? local23 : false;
					if (local32 == Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1) {
						local32.anInt8057 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean587) {
							local85++;
						}
						if (local32.anInt8119 > Static389.anInt6694) {
							local85 += 2;
						}
						local85 += 5 - local32.method6999() << 2;
						if (local32.aBoolean592) {
							local85 += 512;
						} else {
							if (Static616.anInt8094 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt8057 = local85 + 1;
					}
				} else {
					local32.anInt8057 = -1;
				}
			}
		}
		for (@Pc(126) int local126 = 0; local126 < Static317.anInt5602; local126++) {
			@Pc(137) Class16_Sub1_Sub1_Sub3_Sub1 local137 = ((Class2_Sub32) Static514.aClass323_32.method7484((long) Static363.anIntArray409[local126])).aClass16_Sub1_Sub1_Sub3_Sub1_2;
			if (local137.method1414() && local137.aClass113_1.method2749(Static382.aClass282_1)) {
				local137.method6992();
				if (local137.aShort103 >= 0 && local137.aShort106 >= 0 && local137.aShort104 < Static456.anInt7428 && local137.aShort105 < Static5.anInt112) {
					@Pc(174) int local174 = 0;
					if (!local137.aBoolean587) {
						local174++;
					}
					if (local137.anInt8119 > Static389.anInt6694) {
						local174 += 2;
					}
					local174 += 5 - local137.method6999() << 2;
					if (Static616.anInt8094 == 0) {
						if (local137.aClass113_1.aBoolean256) {
							local174 += 64;
						} else {
							local174 += 128;
						}
					} else if (Static616.anInt8094 == 1) {
						if (local137.aClass113_1.aBoolean256) {
							local174 += 32;
						} else {
							local174 += 64;
						}
					}
					if (local137.aClass113_1.aBoolean249) {
						local174 += 1024;
					} else if (!local137.aClass113_1.aBoolean255) {
						local174 += 256;
					}
					local137.anInt8057 = local174 + 1;
				} else {
					local137.anInt8057 = -1;
				}
			} else {
				local137.anInt8057 = -1;
			}
		}
		for (local85 = 0; local85 < Static448.aClass110Array1.length; local85++) {
			@Pc(240) Class110 local240 = Static448.aClass110Array1[local85];
			if (local240 != null) {
				if (local240.anInt3142 == 1) {
					@Pc(254) Class2_Sub32 local254 = (Class2_Sub32) Static514.aClass323_32.method7484((long) local240.anInt3136);
					if (local254 != null) {
						@Pc(259) Class16_Sub1_Sub1_Sub3_Sub1 local259 = local254.aClass16_Sub1_Sub1_Sub3_Sub1_2;
						if (local259.anInt8057 >= 0) {
							local259.anInt8057 += 2048;
						}
					}
				} else if (local240.anInt3142 == 10) {
					@Pc(278) Class16_Sub1_Sub1_Sub3_Sub2 local278 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local240.anInt3136];
					if (local278 != null && local278 != Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 && local278.anInt8057 >= 0) {
						local278.anInt8057 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ria;)Z")
	public static boolean method1725(@OriginalArg(0) Class303 arg0) {
		if (Static179.aBoolean273) {
			if (method1734(arg0).anInt3087 != 0) {
				return false;
			}
			if (arg0.anInt7935 == 0) {
				return false;
			}
		}
		return arg0.aBoolean567;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1727(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static649.anInt10495;
		@Pc(3) int[] local3 = Static426.anIntArray476;
		@Pc(11) int local11 = Static55.aBoolean128 ? local1 : local1 + Static317.anInt5602;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class16_Sub1_Sub1_Sub3 local23;
			if (local13 < local1) {
				local23 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub32) Static514.aClass323_32.method7484((long) Static363.anIntArray409[local13 - local1])).aClass16_Sub1_Sub1_Sub3_Sub1_2;
			}
			if (local23.aByte109 == arg0) {
				local23.anInt8106 = 0;
				if (local23.anInt8057 < 0) {
					local23.aBoolean587 = false;
				} else {
					@Pc(54) int local54 = local23.method6999();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt8037 & 0x1FF) != 0 || (local23.anInt8034 & 0x1FF) != 0) {
							local23.aBoolean587 = false;
							continue;
						}
					} else if ((local23.anInt8037 & 0x1FF) != 256 || (local23.anInt8034 & 0x1FF) != 256) {
						local23.aBoolean587 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt8037 >> 9;
						local101 = local23.anInt8034 >> 9;
						if (local23.anInt8057 != Static219.anIntArrayArray43[local96][local101]) {
							local23.aBoolean587 = true;
							continue;
						}
						if (Static133.anIntArrayArray27[local96][local101] > 1) {
							local126 = Static133.anIntArrayArray27[local96][local101]--;
							local23.aBoolean587 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt8037 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt8034 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt8037 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt8034 + local96 >> 9;
						if (!Static547.method7570(local169, local162, local101, local155, local23.anInt8057)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt8057 == Static219.anIntArrayArray43[local180][local183]) {
										local126 = Static133.anIntArrayArray27[local180][local183]--;
									}
								}
							}
							local23.aBoolean587 = true;
							continue;
						}
					}
					local23.aBoolean587 = false;
					local23.anInt8036 = Static392.method5799(local23.aByte109, local23.anInt8037, local23.anInt8034);
					Static196.method3387(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1728() {
		@Pc(1) int local1 = Static649.anInt10495;
		@Pc(3) int[] local3 = Static426.anIntArray476;
		@Pc(11) int local11 = Static55.aBoolean128 ? local1 : local1 + Static317.anInt5602;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class16_Sub1_Sub1_Sub3 local23;
			if (local13 < local1) {
				local23 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub32) Static514.aClass323_32.method7484((long) Static363.anIntArray409[local13 - local1])).aClass16_Sub1_Sub1_Sub3_Sub1_2;
			}
			if (local23.anInt8057 >= 0) {
				@Pc(43) int local43 = local23.method6999();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt8037 & 0x1FF) == 0 && (local23.anInt8034 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt8037 & 0x1FF) == 256 && (local23.anInt8034 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt8036 = Static392.method5799(local23.aByte109, local23.anInt8037, local23.anInt8034);
				Static196.method3387(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([IIIILclient!je;I[IZIIIIIII)I")
	public static int method1729(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class175 arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(5) int local5 = 0; local5 < 128; local5++) {
			for (@Pc(8) int local8 = 0; local8 < 128; local8++) {
				Static220.anIntArrayArray44[local5][local8] = 0;
				Static314.anIntArrayArray58[local5][local8] = 99999999;
			}
		}
		@Pc(47) boolean local47;
		if (arg11 == 1) {
			local47 = Static496.method6466(arg10, arg12, arg1, arg3, arg2, arg4, arg8, arg7, arg13, arg9);
		} else if (arg11 == 2) {
			local47 = Static287.method8827(arg7, arg9, arg10, arg3, arg13, arg4, arg2, arg8, arg12, arg1);
		} else {
			local47 = Static7.method102(arg2, arg13, arg7, arg8, arg1, arg9, arg4, arg11, arg12, arg3, arg10);
		}
		@Pc(85) int local85 = arg10 - 64;
		@Pc(89) int local89 = arg13 - 64;
		@Pc(91) int local91 = Static166.anInt3402;
		@Pc(93) int local93 = Static530.anInt8535;
		@Pc(101) int local101;
		@Pc(103) int local103;
		@Pc(110) int local110;
		if (!local47) {
			if (!arg6) {
				return -1;
			}
			local101 = Integer.MAX_VALUE;
			local103 = Integer.MAX_VALUE;
			for (local110 = arg12 - 10; local110 <= arg12 + 10; local110++) {
				for (@Pc(115) int local115 = arg1 - 10; local115 <= arg1 + 10; local115++) {
					@Pc(121) int local121 = local110 - local85;
					@Pc(126) int local126 = local115 - local89;
					if (local121 >= 0 && local126 >= 0 && local121 < 128 && local126 < 128 && Static314.anIntArrayArray58[local121][local126] < 100) {
						@Pc(147) int local147 = 0;
						if (arg12 > local110) {
							local147 = arg12 - local110;
						} else if (local110 > arg12 + arg2 - 1) {
							local147 = local110 + 1 - arg2 - arg12;
						}
						@Pc(177) int local177 = 0;
						if (arg1 > local115) {
							local177 = arg1 - local115;
						} else if (local115 > arg1 + arg7 - 1) {
							local177 = local115 + 1 - arg7 - arg1;
						}
						@Pc(215) int local215 = local147 * local147 + local177 * local177;
						if (local101 > local215 || local215 == local101 && Static314.anIntArrayArray58[local121][local126] < local103) {
							local101 = local215;
							local103 = Static314.anIntArrayArray58[local121][local126];
							local91 = local110;
							local93 = local115;
						}
					}
				}
			}
			if (local101 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local91 == arg10 && arg13 == local93) {
			return 0;
		}
		@Pc(290) byte local290 = 0;
		Static55.anIntArray87[0] = local91;
		local101 = local290 + 1;
		Static335.anIntArray379[0] = local93;
		@Pc(312) int local312;
		local103 = local312 = Static220.anIntArrayArray44[local91 - local85][local93 - local89];
		while (local91 != arg10 || local93 != arg13) {
			if (local312 != local103) {
				local312 = local103;
				Static55.anIntArray87[local101] = local91;
				Static335.anIntArray379[local101++] = local93;
			}
			if ((local103 & 0x1) != 0) {
				local93++;
			} else if ((local103 & 0x4) != 0) {
				local93--;
			}
			if ((local103 & 0x2) != 0) {
				local91++;
			} else if ((local103 & 0x8) != 0) {
				local91--;
			}
			local103 = Static220.anIntArrayArray44[local91 - local85][local93 - local89];
		}
		local110 = 0;
		while (local101-- > 0) {
			arg5[local110] = Static55.anIntArray87[local101];
			arg0[local110++] = Static335.anIntArray379[local101];
			if (local110 >= arg5.length) {
				break;
			}
		}
		return local110;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)V")
	public static void method1730(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class2_Sub7_Sub2 local14 = Static188.method3210(1, arg1);
		local14.method925();
		local14.anInt852 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1731() {
		for (@Pc(1) int local1 = 0; local1 < Static456.anInt7428; local1++) {
			@Pc(6) int[] local6 = Static219.anIntArrayArray43[local1];
			for (@Pc(8) int local8 = 0; local8 < Static5.anInt112; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ria;)Lclient!ria;")
	public static Class303 method1732(@OriginalArg(0) Class303 arg0) {
		@Pc(4) int local4 = method1734(arg0).method2652();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static43.method1101(arg0.anInt7985);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1733(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static649.anInt10495;
		@Pc(3) int[] local3 = Static426.anIntArray476;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static317.anInt5602; local5++) {
			@Pc(15) Class16_Sub1_Sub1_Sub3 local15;
			if (local5 < local1) {
				local15 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class2_Sub32) Static514.aClass323_32.method7484((long) Static363.anIntArray409[local5 - local1])).aClass16_Sub1_Sub1_Sub3_Sub1_2;
			}
			if (local15.aByte109 == arg0 && local15.anInt8057 >= 0) {
				@Pc(39) int local39 = local15.method6999();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt8037 & 0x1FF) != 0 || (local15.anInt8034 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt8037 & 0x1FF) != 256 || (local15.anInt8034 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt8037 >> 9;
					local80 = local15.anInt8034 >> 9;
					if (local15.anInt8057 > Static219.anIntArrayArray43[local75][local80]) {
						Static219.anIntArrayArray43[local75][local80] = local15.anInt8057;
						Static133.anIntArrayArray27[local75][local80] = 1;
					} else if (local15.anInt8057 == Static219.anIntArrayArray43[local75][local80]) {
						local116 = Static133.anIntArrayArray27[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt8037 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt8034 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt8037 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt8034 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt8057 > Static219.anIntArrayArray43[local158][local161]) {
								Static219.anIntArrayArray43[local158][local161] = local15.anInt8057;
								Static133.anIntArrayArray27[local158][local161] = 1;
							} else if (local15.anInt8057 == Static219.anIntArrayArray43[local158][local161]) {
								local116 = Static133.anIntArrayArray27[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!ria;)Lclient!fc;")
	public static Class2_Sub19 method1734(@OriginalArg(0) Class303 arg0) {
		@Pc(13) Class2_Sub19 local13 = (Class2_Sub19) Static472.aClass323_28.method7484(((long) arg0.anInt7962 << 32) + (long) arg0.anInt7983);
		return local13 == null ? arg0.aClass2_Sub19_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!ria;IIIIIIIIIII)V")
	public static void method1735(@OriginalArg(0) Class303[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label800: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class303 local6 = arg0[local1];
			if (local6 != null && local6.anInt7985 == arg1) {
				@Pc(17) int local17 = local6.anInt7923 + arg6;
				@Pc(22) int local22 = local6.anInt7955 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt7935 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt7914;
					local45 = local22 + local6.anInt7971;
					if (local6.anInt7935 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt7935 == 0 || local6.aBoolean579 || method1734(local6).anInt3087 != 0 || local6 == Static373.aClass303_14 || local6.anInt7972 == Static451.anInt7363 || local6.anInt7972 == Static195.anInt3895) {
					if (!method1725(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static148.aBoolean241) {
							local40 = Static100.method1939();
							local45 = Static260.method4303();
						}
						if (local6 == Static351.aClass303_13 && Static394.method5830(Static351.aClass303_13) != null) {
							Static551.aBoolean626 = true;
							Static432.anInt7146 = local17;
							Static594.anInt9862 = local22;
						}
						if (local6.aBoolean578 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean564 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class2_Sub18 local168 = (Class2_Sub18) Static102.aClass114_11.method2772(); local168 != null; local168 = (Class2_Sub18) Static102.aClass114_11.method2762()) {
									if (local168.aBoolean237) {
										local168.method8920();
										local168.aClass303_4.aBoolean570 = false;
									}
								}
								if (Static450.anInt7360 == 0) {
									Static351.aClass303_13 = null;
									Static373.aClass303_14 = null;
								}
								Static272.anInt5078 = 0;
								Static603.aBoolean719 = false;
								Static224.aBoolean307 = false;
								if (!Static113.aBoolean192) {
									Static298.method4717();
								}
							}
							@Pc(232) boolean local232;
							if (Static186.aClass358_1.method8722() + local40 >= local28 && Static186.aClass358_1.method8721() + local45 >= local30 && Static186.aClass358_1.method8722() + local40 < local32 && Static186.aClass358_1.method8721() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static557.aBoolean660 && local232) {
								if (local6.anInt7999 >= 0) {
									Static398.anInt6843 = local6.anInt7999;
								} else if (local6.aBoolean564) {
									Static398.anInt6843 = -1;
								}
							}
							if (!Static113.aBoolean192 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static571.method7943(arg11 - local22, arg10 - local17, local6);
							}
							@Pc(276) boolean local276 = false;
							if (Static186.aClass358_1.method8723() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class2_Sub1 local291 = (Class2_Sub1) Static574.aClass114_53.method2772();
							if (local291 != null && local291.method7153() == 0 && local291.method7155() + local40 >= local28 && local291.method7157() + local45 >= local30 && local291.method7155() + local40 < local32 && local291.method7157() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray83 != null && !Static331.method5045()) {
								for (local335 = 0; local335 < local6.aByteArray83.length; local335++) {
									if (Static185.aClass221_1.method8050(local6.aByteArray83[local335])) {
										if (local6.lb == null || Static389.anInt6694 >= local6.lb[local335]) {
											@Pc(367) byte local367 = local6.aByteArray84[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static185.aClass221_1.method8050(86) && !Static185.aClass221_1.method8050(82) && !Static185.aClass221_1.method8050(81)) && ((local367 & 0x2) == 0 || Static185.aClass221_1.method8050(86)) && ((local367 & 0x1) == 0 || Static185.aClass221_1.method8050(82)) && ((local367 & 0x4) == 0 || Static185.aClass221_1.method8050(81))) {
												if (local335 < 10) {
													Static195.method3375(local335 + 1, "", local6.anInt7962, -1);
												} else if (local335 == 10) {
													Static210.method8326();
													@Pc(438) Class2_Sub19 local438 = method1734(local6);
													Static265.method4370(local438.anInt3092, local438.method2650(), local6);
													Static184.aString32 = Static270.method4444(local6);
													if (Static184.aString32 == null) {
														Static184.aString32 = "Null";
													}
													Static80.aString17 = local6.aString78 + "<col=ffffff>";
												}
												local469 = local6.anIntArray575[local335];
												if (local6.lb == null) {
													local6.lb = new int[local6.aByteArray83.length];
												}
												if (local469 == 0) {
													local6.lb[local335] = Integer.MAX_VALUE;
												} else {
													local6.lb[local335] = Static389.anInt6694 + local469;
												}
											}
										}
									} else if (local6.lb != null) {
										local6.lb[local335] = 0;
									}
								}
							}
							if (local286) {
								Static74.method7159(local40 + local291.method7155() - local17, local45 + local291.method7157() - local22, local6);
							}
							if (Static351.aClass303_13 != null && Static351.aClass303_13 != local6 && local232 && method1734(local6).method2655()) {
								Static582.aClass303_21 = local6;
							}
							if (local6 == Static373.aClass303_14) {
								Static252.aBoolean360 = true;
								Static518.anInt8367 = local17;
								Static335.anInt5865 = local22;
							}
							if (local6.aBoolean579 || local6.anInt7972 != 0) {
								@Pc(558) Class2_Sub18 local558;
								if (local232 && Static617.anInt10101 != 0 && local6.anObjectArray5 != null) {
									local558 = new Class2_Sub18();
									local558.aBoolean237 = true;
									local558.aClass303_4 = local6;
									local558.anInt3016 = Static617.anInt10101;
									local558.anObjectArray1 = local6.anObjectArray5;
									Static102.aClass114_11.method2771(local558);
								}
								if (Static351.aClass303_13 != null || Static113.aBoolean192 || local6.anInt7972 != Static473.anInt7620 && Static272.anInt5078 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt7972 != 0) {
									if (local6.anInt7972 == Static40.anInt838 || local6.anInt7972 == Static600.anInt9941) {
										Static216.aClass303_11 = local6;
										if (Static593.aClass224_1 != null) {
											Static593.aClass224_1.method5317(Static141.aClass13_27, local6.anInt7971);
										}
										if (local6.anInt7972 == Static40.anInt838) {
											if (Static113.aBoolean192 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static292.method4623(Static141.aClass13_27, arg8, arg9);
											@Pc(641) Class16_Sub4 local641 = (Class16_Sub4) Static176.aClass19_4.method562();
											while (true) {
												if (local641 == null) {
													continue label800;
												}
												if (arg10 >= local641.anInt4796 && arg10 < local641.anInt4795 && arg11 >= local641.anInt4797 && arg11 < local641.anInt4798) {
													Static298.method4717();
													Static470.method6669(local641.aClass16_Sub1_Sub1_Sub3_1);
												}
												local641 = (Class16_Sub4) Static176.aClass19_4.method558();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt7972 == Static451.anInt7363) {
										if (local6.method6948(Static141.aClass13_27) == null || Static502.anInt9931 != 0 && Static502.anInt9931 != 3 || Static113.aBoolean192 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray581[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray574[local708]) {
											continue;
										}
										local335 -= local6.anInt7914 / 2;
										local708 -= local6.anInt7971 / 2;
										if (Static407.anInt6909 == 4) {
											local747 = (int) Static225.aFloat85 & 0x3FFF;
										} else {
											local747 = (int) Static225.aFloat85 + Static463.anInt7491 & 0x3FFF;
										}
										@Pc(759) int local759 = Class290.anIntArray546[local747];
										@Pc(763) int local763 = Class290.anIntArray547[local747];
										if (Static407.anInt6909 != 4) {
											local759 = local759 * (Static594.anInt9866 + 256) >> 8;
											local763 = local763 * (Static594.anInt9866 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static407.anInt6909 == 4) {
											local813 = (Static595.anInt9886 >> 9) + (local792 >> 2);
											local821 = (Static33.anInt661 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.method6999() - 1) * 256;
											local813 = (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037 - local830 >> 9) + (local792 >> 2);
											local821 = (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034 - local830 >> 9) - (local802 >> 2);
										}
										if (Static557.aBoolean660 && (Static613.anInt10082 & 0x40) != 0) {
											@Pc(863) Class303 local863 = Static71.method1631(Static252.anInt4804, Static454.anInt7419);
											if (local863 == null) {
												Static210.method8326();
											} else {
												Static244.method4145(1L, (long) (local6.anInt7983 << 0 | local6.anInt7962), false, true, " ->", local6.anInt7964, Static237.anInt4365, 45, local821, Static184.aString32, true, local813);
											}
											continue;
										}
										if (Static51.aClass17_2 == Static112.aClass17_3) {
											Static244.method4145(1L, 0L, false, true, "", -1, -1, 44, local821, Static573.aClass345_29.method7951(Static496.anInt7407), true, local813);
										}
										Static244.method4145(1L, 0L, false, true, "", -1, Static621.anInt10148, 13, local821, Static298.aString48, true, local813);
										continue;
									}
									if (local6.anInt7972 == Static473.anInt7620) {
										Static422.aClass303_15 = local6;
										if (local232) {
											Static603.aBoolean719 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method7155() - local17 - local6.anInt7914 / 2) * 2.0D / (double) Static371.aFloat186);
											local708 = (int) -((double) (local45 + local291.method7157() - local22 - local6.anInt7971 / 2) * 2.0D / (double) Static371.aFloat186);
											local469 = Static331.anInt5801 + local335 + Static371.anInt9384;
											local747 = Static611.anInt10071 + local708 + Static371.anInt9385;
											@Pc(994) Class2_Sub7_Sub3 local994 = Static435.method6279();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method2284(local999, local747, local469);
											if (local999 != null) {
												if (Static185.aClass221_1.method8050(82) && Static463.anInt7496 > 0) {
													Static99.method1935(local999[2], local999[1], local999[0]);
													continue;
												}
												Static224.aBoolean307 = true;
												Static514.anInt8279 = local999[0];
												Static166.anInt3399 = local999[1];
												Static591.anInt9827 = local999[2];
											}
											Static272.anInt5078 = 1;
											Static584.aBoolean681 = false;
											Static521.anInt8409 = Static186.aClass358_1.method8722();
											Static474.anInt7662 = Static186.aClass358_1.method8721();
											continue;
										}
										if (local276 && Static272.anInt5078 > 0) {
											if (Static272.anInt5078 == 1 && (Static521.anInt8409 != Static186.aClass358_1.method8722() || Static474.anInt7662 != Static186.aClass358_1.method8721())) {
												Static608.anInt10050 = Static331.anInt5801;
												Static531.anInt8551 = Static611.anInt10071;
												Static272.anInt5078 = 2;
											}
											if (Static272.anInt5078 == 2) {
												Static584.aBoolean681 = true;
												Static4.method74(Static608.anInt10050 + (int) ((double) (Static521.anInt8409 - Static186.aClass358_1.method8722()) * 2.0D / (double) Static371.aFloat187));
												Static507.method8712(Static531.anInt8551 - (int) ((double) (Static474.anInt7662 - Static186.aClass358_1.method8721()) * 2.0D / (double) Static371.aFloat187));
											}
											continue;
										}
										if (Static272.anInt5078 > 0 && !Static584.aBoolean681) {
											if ((Static193.anInt10392 == 1 || Static622.method8631()) && Static633.anInt10265 > 2) {
												Static368.method5466(Static521.anInt8409, Static474.anInt7662);
											} else if (Static591.method8349()) {
												Static368.method5466(Static521.anInt8409, Static474.anInt7662);
											}
										}
										Static272.anInt5078 = 0;
										continue;
									}
									if (local6.anInt7972 == Static430.anInt7139) {
										if (local276) {
											Static647.method8882(local45 + Static186.aClass358_1.method8721() - local22, local6.anInt7914, local40 + Static186.aClass358_1.method8722() - local17, local6.anInt7971);
										}
										continue;
									}
									if (local6.anInt7972 == Static195.anInt3895) {
										Static577.method8013(local6, local17, local22);
										continue;
									}
								}
								if (!local6.aBoolean574 && local286) {
									local6.aBoolean574 = true;
									if (local6.anObjectArray26 != null) {
										local558 = new Class2_Sub18();
										local558.aBoolean237 = true;
										local558.aClass303_4 = local6;
										local558.anInt3019 = local40 + local291.method7155() - local17;
										local558.anInt3016 = local45 + local291.method7157() - local22;
										local558.anObjectArray1 = local6.anObjectArray26;
										Static102.aClass114_11.method2771(local558);
									}
								}
								if (local6.aBoolean574 && local276 && local6.anObjectArray25 != null) {
									local558 = new Class2_Sub18();
									local558.aBoolean237 = true;
									local558.aClass303_4 = local6;
									local558.anInt3019 = local40 + Static186.aClass358_1.method8722() - local17;
									local558.anInt3016 = local45 + Static186.aClass358_1.method8721() - local22;
									local558.anObjectArray1 = local6.anObjectArray25;
									Static102.aClass114_11.method2771(local558);
								}
								if (local6.aBoolean574 && !local276) {
									local6.aBoolean574 = false;
									if (local6.anObjectArray21 != null) {
										local558 = new Class2_Sub18();
										local558.aBoolean237 = true;
										local558.aClass303_4 = local6;
										local558.anInt3019 = local40 + Static186.aClass358_1.method8722() - local17;
										local558.anInt3016 = local45 + Static186.aClass358_1.method8721() - local22;
										local558.anObjectArray1 = local6.anObjectArray21;
										Static289.aClass114_27.method2771(local558);
									}
								}
								if (local276 && local6.anObjectArray27 != null) {
									local558 = new Class2_Sub18();
									local558.aBoolean237 = true;
									local558.aClass303_4 = local6;
									local558.anInt3019 = local40 + Static186.aClass358_1.method8722() - local17;
									local558.anInt3016 = local45 + Static186.aClass358_1.method8721() - local22;
									local558.anObjectArray1 = local6.anObjectArray27;
									Static102.aClass114_11.method2771(local558);
								}
								if (!local6.aBoolean570 && local232) {
									local6.aBoolean570 = true;
									if (local6.anObjectArray10 != null) {
										local558 = new Class2_Sub18();
										local558.aBoolean237 = true;
										local558.aClass303_4 = local6;
										local558.anInt3019 = local40 + Static186.aClass358_1.method8722() - local17;
										local558.anInt3016 = local45 + Static186.aClass358_1.method8721() - local22;
										local558.anObjectArray1 = local6.anObjectArray10;
										Static102.aClass114_11.method2771(local558);
									}
								}
								if (local6.aBoolean570 && local232 && local6.anObjectArray8 != null) {
									local558 = new Class2_Sub18();
									local558.aBoolean237 = true;
									local558.aClass303_4 = local6;
									local558.anInt3019 = local40 + Static186.aClass358_1.method8722() - local17;
									local558.anInt3016 = local45 + Static186.aClass358_1.method8721() - local22;
									local558.anObjectArray1 = local6.anObjectArray8;
									Static102.aClass114_11.method2771(local558);
								}
								if (local6.aBoolean570 && !local232) {
									local6.aBoolean570 = false;
									if (local6.anObjectArray33 != null) {
										local558 = new Class2_Sub18();
										local558.aBoolean237 = true;
										local558.aClass303_4 = local6;
										local558.anInt3019 = local40 + Static186.aClass358_1.method8722() - local17;
										local558.anInt3016 = local45 + Static186.aClass358_1.method8721() - local22;
										local558.anObjectArray1 = local6.anObjectArray33;
										Static289.aClass114_27.method2771(local558);
									}
								}
								if (local6.anObjectArray22 != null) {
									local558 = new Class2_Sub18();
									local558.aClass303_4 = local6;
									local558.anObjectArray1 = local6.anObjectArray22;
									Static596.aClass114_59.method2771(local558);
								}
								@Pc(1570) Class2_Sub18 local1570;
								if (local6.anObjectArray23 != null && Static547.anInt8830 > local6.anInt7969) {
									if (local6.anIntArray579 == null || Static547.anInt8830 - local6.anInt7969 > 32) {
										local558 = new Class2_Sub18();
										local558.aClass303_4 = local6;
										local558.anObjectArray1 = local6.anObjectArray23;
										Static102.aClass114_11.method2771(local558);
									} else {
										label687: for (local335 = local6.anInt7969; local335 < Static547.anInt8830; local335++) {
											local708 = Static329.anIntArray373[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray579.length; local469++) {
												if (local6.anIntArray579[local469] == local708) {
													local1570 = new Class2_Sub18();
													local1570.aClass303_4 = local6;
													local1570.anObjectArray1 = local6.anObjectArray23;
													Static102.aClass114_11.method2771(local1570);
													break label687;
												}
											}
										}
									}
									local6.anInt7969 = Static547.anInt8830;
								}
								if (local6.anObjectArray20 != null && Static28.anInt10469 > local6.anInt7958) {
									if (local6.anIntArray580 == null || Static28.anInt10469 - local6.anInt7958 > 32) {
										local558 = new Class2_Sub18();
										local558.aClass303_4 = local6;
										local558.anObjectArray1 = local6.anObjectArray20;
										Static102.aClass114_11.method2771(local558);
									} else {
										label663: for (local335 = local6.anInt7958; local335 < Static28.anInt10469; local335++) {
											local708 = Static141.anIntArray192[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray580.length; local469++) {
												if (local6.anIntArray580[local469] == local708) {
													local1570 = new Class2_Sub18();
													local1570.aClass303_4 = local6;
													local1570.anObjectArray1 = local6.anObjectArray20;
													Static102.aClass114_11.method2771(local1570);
													break label663;
												}
											}
										}
									}
									local6.anInt7958 = Static28.anInt10469;
								}
								if (local6.anObjectArray29 != null && Static134.anInt9427 > local6.anInt7921) {
									if (local6.anIntArray578 == null || Static134.anInt9427 - local6.anInt7921 > 32) {
										local558 = new Class2_Sub18();
										local558.aClass303_4 = local6;
										local558.anObjectArray1 = local6.anObjectArray29;
										Static102.aClass114_11.method2771(local558);
									} else {
										label639: for (local335 = local6.anInt7921; local335 < Static134.anInt9427; local335++) {
											local708 = Static238.anIntArray584[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray578.length; local469++) {
												if (local6.anIntArray578[local469] == local708) {
													local1570 = new Class2_Sub18();
													local1570.aClass303_4 = local6;
													local1570.anObjectArray1 = local6.anObjectArray29;
													Static102.aClass114_11.method2771(local1570);
													break label639;
												}
											}
										}
									}
									local6.anInt7921 = Static134.anInt9427;
								}
								if (local6.anObjectArray9 != null && Static43.anInt1122 > local6.anInt7965) {
									if (local6.anIntArray582 == null || Static43.anInt1122 - local6.anInt7965 > 32) {
										local558 = new Class2_Sub18();
										local558.aClass303_4 = local6;
										local558.anObjectArray1 = local6.anObjectArray9;
										Static102.aClass114_11.method2771(local558);
									} else {
										label615: for (local335 = local6.anInt7965; local335 < Static43.anInt1122; local335++) {
											local708 = Static434.anIntArray484[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray582.length; local469++) {
												if (local6.anIntArray582[local469] == local708) {
													local1570 = new Class2_Sub18();
													local1570.aClass303_4 = local6;
													local1570.anObjectArray1 = local6.anObjectArray9;
													Static102.aClass114_11.method2771(local1570);
													break label615;
												}
											}
										}
									}
									local6.anInt7965 = Static43.anInt1122;
								}
								if (local6.anObjectArray31 != null && Static260.anInt4890 > local6.anInt7915) {
									if (local6.anIntArray576 == null || Static260.anInt4890 - local6.anInt7915 > 32) {
										local558 = new Class2_Sub18();
										local558.aClass303_4 = local6;
										local558.anObjectArray1 = local6.anObjectArray31;
										Static102.aClass114_11.method2771(local558);
									} else {
										label591: for (local335 = local6.anInt7915; local335 < Static260.anInt4890; local335++) {
											local708 = Static550.anIntArray658[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray576.length; local469++) {
												if (local6.anIntArray576[local469] == local708) {
													local1570 = new Class2_Sub18();
													local1570.aClass303_4 = local6;
													local1570.anObjectArray1 = local6.anObjectArray31;
													Static102.aClass114_11.method2771(local1570);
													break label591;
												}
											}
										}
									}
									local6.anInt7915 = Static260.anInt4890;
								}
								if (Static30.anInt557 > local6.anInt7954 && local6.anObjectArray16 != null) {
									local558 = new Class2_Sub18();
									local558.aClass303_4 = local6;
									local558.anObjectArray1 = local6.anObjectArray16;
									Static102.aClass114_11.method2771(local558);
								}
								if (Static76.anInt1945 > local6.anInt7954 && local6.anObjectArray12 != null) {
									local558 = new Class2_Sub18();
									local558.aClass303_4 = local6;
									local558.anObjectArray1 = local6.anObjectArray12;
									Static102.aClass114_11.method2771(local558);
								}
								if (Static48.anInt1289 > local6.anInt7954 && local6.anObjectArray19 != null) {
									local558 = new Class2_Sub18();
									local558.aClass303_4 = local6;
									local558.anObjectArray1 = local6.anObjectArray19;
									Static102.aClass114_11.method2771(local558);
								}
								if (Static313.anInt8606 > local6.anInt7954 && local6.anObjectArray7 != null) {
									local558 = new Class2_Sub18();
									local558.aClass303_4 = local6;
									local558.anObjectArray1 = local6.anObjectArray7;
									Static102.aClass114_11.method2771(local558);
								}
								if (Static82.anInt2146 > local6.anInt7954 && local6.anObjectArray30 != null) {
									local558 = new Class2_Sub18();
									local558.aClass303_4 = local6;
									local558.anObjectArray1 = local6.anObjectArray30;
									Static102.aClass114_11.method2771(local558);
								}
								local6.anInt7954 = Static148.anInt3063;
								if (local6.anObjectArray6 != null) {
									for (local335 = 0; local335 < Static206.anInt3998; local335++) {
										@Pc(2038) Class2_Sub18 local2038 = new Class2_Sub18();
										local2038.aClass303_4 = local6;
										local2038.anInt3021 = Static248.anInterface20Array3[local335].method7060();
										local2038.anInt3014 = Static248.anInterface20Array3[local335].method7056();
										local2038.anObjectArray1 = local6.anObjectArray6;
										Static102.aClass114_11.method2771(local2038);
									}
								}
								if (Static163.aBoolean261 && local6.anObjectArray14 != null) {
									local558 = new Class2_Sub18();
									local558.aClass303_4 = local6;
									local558.anObjectArray1 = local6.anObjectArray14;
									Static102.aClass114_11.method2771(local558);
								}
							}
							if (local6.anInt7935 == 5 && local6.anInt7993 != -1) {
								local6.method6941(Static405.aClass231_1, Static302.aClass181_1).method5317(Static141.aClass13_27, local6.anInt7971);
							}
							Static574.method7970(local6);
							if (local6.anInt7935 == 0) {
								method1735(arg0, local6.anInt7962, local28, local30, local32, local34, local17 - local6.anInt7920, local22 - local6.anInt7982, arg8, arg9, arg10, arg11);
								if (local6.aClass303Array2 != null) {
									method1735(local6.aClass303Array2, local6.anInt7962, local28, local30, local32, local34, local17 - local6.anInt7920, local22 - local6.anInt7982, arg8, arg9, arg10, arg11);
								}
								@Pc(2164) Class2_Sub28 local2164 = (Class2_Sub28) Static22.aClass323_4.method7484((long) local6.anInt7962);
								if (local2164 != null) {
									if (Static51.aClass17_2 == Static579.aClass17_5 && local2164.anInt5452 == 0 && !Static113.aBoolean192 && local232 && !Static179.aBoolean273) {
										Static298.method4717();
									}
									Static104.method1960(local22, arg9, arg11, local2164.anInt5454, local34, local32, local17, arg10, local28, local30, arg8);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static574.method7970(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1738() {
		Static348.anInt6055 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static317.anInt5602; local3++) {
			@Pc(14) Class16_Sub1_Sub1_Sub3_Sub1 local14 = ((Class2_Sub32) Static514.aClass323_32.method7484((long) Static363.anIntArray409[local3])).aClass16_Sub1_Sub1_Sub3_Sub1_2;
			if (local14.aBoolean587 && local14.method6997() != -1) {
				@Pc(32) int local32 = (local14.method6999() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt8037 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt8034 - local32 >> 9;
				@Pc(53) Class16_Sub1_Sub1_Sub3 local53 = Static62.method6047(local46, local14.aByte109, local39);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt8075;
					if (local53 instanceof Class16_Sub1_Sub1_Sub3_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt8106 == 0 && local53.method6997() != -1) {
						Static233.anIntArray279[Static348.anInt6055] = local58;
						Static70.anIntArray141[Static348.anInt6055] = local58;
						Static348.anInt6055++;
						local53.anInt8106++;
					}
					Static233.anIntArray279[Static348.anInt6055] = local58;
					Static70.anIntArray141[Static348.anInt6055] = local14.anInt8075 + 2048;
					Static348.anInt6055++;
					local53.anInt8106++;
				}
			}
		}
		Static630.method8717(Static348.anInt6055 - 1, 0, Static233.anIntArray279, Static70.anIntArray141);
	}
}
