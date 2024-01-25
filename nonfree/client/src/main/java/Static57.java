import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!l;")
	public static Class143 aClass143_9;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	public static int anInt1398 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)I")
	public static int method1234(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1236() {
		for (@Pc(1) int local1 = 0; local1 < Static195.anInt3537; local1++) {
			@Pc(6) int[] local6 = Static59.anIntArrayArray10[local1];
			for (@Pc(8) int local8 = 0; local8 < Static118.anInt2419; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1238() {
		@Pc(1) int local1 = Static155.anInt2952;
		@Pc(3) int[] local3 = Static381.anIntArray619;
		@Pc(11) int local11 = Static305.aBoolean379 ? local1 : local1 + Static5.anInt163;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class31_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = Static98.aClass31_Sub2_Sub1_Sub2Array1[Static331.anIntArray648[local13 - local1]];
			}
			if (local23.anInt7349 >= 0) {
				@Pc(39) int local39 = local23.method5989();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt7300 & 0x7F) == 0 && (local23.anInt7298 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt7300 & 0x7F) == 64 && (local23.anInt7298 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class31_Sub2_Sub1_Sub1 && local23.aClass1_Sub28_3 != null && Static378.anInt4244 >= local23.aClass1_Sub28_3.anInt4383 && Static378.anInt4244 < local23.aClass1_Sub28_3.anInt4397) {
					((Class31_Sub2_Sub1_Sub1) local23).aBoolean71 = false;
				}
				local23.anInt7296 = Static301.method4312(local23.aByte100, local23.anInt7300, local23.anInt7298);
				Static162.method2630(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)I")
	public static int method1240(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(30) int local30 = (local10 & 0x33333333) + ((local10 & 0xCCCCCCCD) >>> 2);
		@Pc(38) int local38 = (local30 >>> 4) + local30 & 0xF0F0F0F;
		@Pc(44) int local44 = local38 + (local38 >>> 8);
		@Pc(50) int local50 = local44 + (local44 >>> 16);
		return local50 & 0xFF;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1242() {
		Static67.anInt1513 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static5.anInt163; local3++) {
			@Pc(10) Class31_Sub2_Sub1_Sub2 local10 = Static98.aClass31_Sub2_Sub1_Sub2Array1[Static331.anIntArray648[local3]];
			if (local10.aBoolean506 && local10.method5983() != -1) {
				@Pc(28) int local28 = (local10.method5989() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt7300 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt7298 - local28 >> 7;
				@Pc(49) Class31_Sub2_Sub1 local49 = Static429.method5686(local42, local35, local10.aByte100);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt7301;
					if (local49 instanceof Class31_Sub2_Sub1_Sub2) {
						local54 += 2048;
					}
					if (local49.anInt7322 == 0 && local49.method5983() != -1) {
						Static303.anIntArray452[Static67.anInt1513] = local54;
						Static139.anIntArray210[Static67.anInt1513] = local54;
						Static67.anInt1513++;
						local49.anInt7322++;
					}
					Static303.anIntArray452[Static67.anInt1513] = local54;
					Static139.anIntArray210[Static67.anInt1513] = local10.anInt7301 + 2048;
					Static67.anInt1513++;
					local49.anInt7322++;
				}
			}
		}
		Static88.method1627(Static139.anIntArray210, 0, Static303.anIntArray452, Static67.anInt1513 - 1);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1243() {
		@Pc(1) int local1 = Static155.anInt2952;
		@Pc(3) int[] local3 = Static381.anIntArray619;
		@Pc(20) boolean local20 = Static38.aClass135_Sub1_1.anInt5093 == 1 && local1 > 200 || Static38.aClass135_Sub1_1.anInt5093 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class31_Sub2_Sub1_Sub1 local29 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local3[local22]];
			if (local29.method1184()) {
				local29.method5975();
				if (local29.aShort103 >= 0 && local29.aShort102 >= 0 && local29.aShort100 < Static195.anInt3537 && local29.aShort101 < Static118.anInt2419) {
					local29.aBoolean71 = local29.aBoolean505 ? local20 : false;
					if (local29 == Static452.aClass31_Sub2_Sub1_Sub1_2) {
						local29.anInt7349 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean506) {
							local75++;
						}
						if (local29.anInt7340 > Static378.anInt4244) {
							local75 += 2;
						}
						local75 += 5 - local29.method5989() << 2;
						if (local29.aBoolean70) {
							local75 += 512;
						} else {
							if (Static446.anInt7154 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt7349 = local75 + 1;
					}
				} else {
					local29.anInt7349 = -1;
				}
			} else {
				local29.anInt7349 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static5.anInt163; local116++) {
			@Pc(123) Class31_Sub2_Sub1_Sub2 local123 = Static98.aClass31_Sub2_Sub1_Sub2Array1[Static331.anIntArray648[local116]];
			if (local123.method6001() && local123.aClass53_1.method1504(Static394.aClass23_1)) {
				local123.method5975();
				if (local123.aShort103 >= 0 && local123.aShort102 >= 0 && local123.aShort100 < Static195.anInt3537 && local123.aShort101 < Static118.anInt2419) {
					@Pc(160) int local160 = 0;
					if (!local123.aBoolean506) {
						local160++;
					}
					if (local123.anInt7340 > Static378.anInt4244) {
						local160 += 2;
					}
					local160 += 5 - local123.method5989() << 2;
					if (Static446.anInt7154 == 0) {
						if (local123.aClass53_1.aBoolean96) {
							local160 += 64;
						} else {
							local160 += 128;
						}
					} else if (Static446.anInt7154 == 1) {
						if (local123.aClass53_1.aBoolean96) {
							local160 += 32;
						} else {
							local160 += 64;
						}
					}
					if (local123.aClass53_1.aBoolean98) {
						local160 += 1024;
					} else if (!local123.aClass53_1.aBoolean100) {
						local160 += 256;
					}
					local123.anInt7349 = local160 + 1;
				} else {
					local123.anInt7349 = -1;
				}
			} else {
				local123.anInt7349 = -1;
			}
		}
		for (local75 = 0; local75 < Static353.aClass83Array2.length; local75++) {
			@Pc(226) Class83 local226 = Static353.aClass83Array2[local75];
			if (local226 != null) {
				if (local226.anInt2462 == 1) {
					@Pc(237) Class31_Sub2_Sub1_Sub2 local237 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local226.anInt2459];
					if (local237 != null && local237.anInt7349 >= 0) {
						local237.anInt7349 += 2048;
					}
				} else if (local226.anInt2462 == 10) {
					@Pc(258) Class31_Sub2_Sub1_Sub1 local258 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local226.anInt2459];
					if (local258 != null && local258 != Static452.aClass31_Sub2_Sub1_Sub1_2 && local258.anInt7349 >= 0) {
						local258.anInt7349 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1244(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static155.anInt2952;
		@Pc(3) int[] local3 = Static381.anIntArray619;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static5.anInt163; local5++) {
			@Pc(15) Class31_Sub2_Sub1 local15;
			if (local5 < local1) {
				local15 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local3[local5]];
			} else {
				local15 = Static98.aClass31_Sub2_Sub1_Sub2Array1[Static331.anIntArray648[local5 - local1]];
			}
			if (local15.aByte100 == arg0 && local15.anInt7349 >= 0) {
				@Pc(35) int local35 = local15.method5989();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt7300 & 0x7F) != 0 || (local15.anInt7298 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt7300 & 0x7F) != 64 || (local15.anInt7298 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt7300 >> 7;
					local76 = local15.anInt7298 >> 7;
					if (local15.anInt7349 > Static59.anIntArrayArray10[local71][local76]) {
						Static59.anIntArrayArray10[local71][local76] = local15.anInt7349;
						Static409.anIntArrayArray60[local71][local76] = 1;
					} else if (local15.anInt7349 == Static59.anIntArrayArray10[local71][local76]) {
						local112 = Static409.anIntArrayArray60[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt7300 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt7298 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt7300 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt7298 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt7349 > Static59.anIntArrayArray10[local154][local157]) {
								Static59.anIntArrayArray10[local154][local157] = local15.anInt7349;
								Static409.anIntArrayArray60[local154][local157] = 1;
							} else if (local15.anInt7349 == Static59.anIntArrayArray10[local154][local157]) {
								local112 = Static409.anIntArrayArray60[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!uq;)Lclient!uq;")
	public static Class251 method1245(@OriginalArg(0) Class251 arg0) {
		@Pc(4) int local4 = method1248(arg0).method1738();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static378.method3544(arg0.anInt6722);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BIIIIIB[B)V")
	public static void method1247(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(20) int local20 = -(arg6 & 0x3);
		for (@Pc(23) int local23 = -arg3; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg5++;
				arg7[local31] += arg1[arg0++];
				@Pc(43) int local43 = arg5++;
				arg7[local43] += arg1[arg0++];
				@Pc(55) int local55 = arg5++;
				arg7[local55] += arg1[arg0++];
				@Pc(67) int local67 = arg5++;
				arg7[local67] += arg1[arg0++];
			}
			for (@Pc(85) int local85 = local20; local85 < 0; local85++) {
				local31 = arg5++;
				arg7[local31] += arg1[arg0++];
			}
			arg0 += arg4;
			arg5 += arg2;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!uq;)Lclient!el;")
	public static Class1_Sub17 method1248(@OriginalArg(0) Class251 arg0) {
		@Pc(13) Class1_Sub17 local13 = (Class1_Sub17) Static176.aClass96_20.method2335(((long) arg0.anInt6689 << 32) + (long) arg0.anInt6679);
		return local13 == null ? arg0.aClass1_Sub17_5 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!uq;)Z")
	public static boolean method1250(@OriginalArg(0) Class251 arg0) {
		if (Static313.aBoolean387) {
			if (method1248(arg0).anInt2012 != 0) {
				return false;
			}
			if (arg0.anInt6654 == 0) {
				return false;
			}
		}
		return arg0.aBoolean462;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1252(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static155.anInt2952;
		@Pc(3) int[] local3 = Static381.anIntArray619;
		@Pc(11) int local11 = Static305.aBoolean379 ? local1 : local1 + Static5.anInt163;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class31_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = Static98.aClass31_Sub2_Sub1_Sub2Array1[Static331.anIntArray648[local13 - local1]];
			}
			if (local23.aByte100 == arg0) {
				local23.anInt7322 = 0;
				if (local23.anInt7349 < 0) {
					local23.aBoolean506 = false;
				} else {
					@Pc(50) int local50 = local23.method5989();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt7300 & 0x7F) != 0 || (local23.anInt7298 & 0x7F) != 0) {
							local23.aBoolean506 = false;
							continue;
						}
					} else if ((local23.anInt7300 & 0x7F) != 64 || (local23.anInt7298 & 0x7F) != 64) {
						local23.aBoolean506 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt7300 >> 7;
						local97 = local23.anInt7298 >> 7;
						if (local23.anInt7349 != Static59.anIntArrayArray10[local92][local97]) {
							local23.aBoolean506 = true;
							continue;
						}
						if (Static409.anIntArrayArray60[local92][local97] > 1) {
							local122 = Static409.anIntArrayArray60[local92][local97]--;
							local23.aBoolean506 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt7300 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt7298 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt7300 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt7298 + local92 >> 7;
						if (!Static176.method2825(local165, local97, local158, local151, local23.anInt7349)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt7349 == Static59.anIntArrayArray10[local176][local179]) {
										local122 = Static409.anIntArrayArray60[local176][local179]--;
									}
								}
							}
							local23.aBoolean506 = true;
							continue;
						}
					}
					if (local23 instanceof Class31_Sub2_Sub1_Sub1 && local23.aClass1_Sub28_3 != null && Static378.anInt4244 >= local23.aClass1_Sub28_3.anInt4383 && Static378.anInt4244 < local23.aClass1_Sub28_3.anInt4397) {
						((Class31_Sub2_Sub1_Sub1) local23).aBoolean71 = false;
					}
					local23.aBoolean506 = false;
					local23.anInt7296 = Static301.method4312(local23.aByte100, local23.anInt7300, local23.anInt7298);
					Static162.method2630(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!uq;IIIIIIIII)V")
	public static void method1254(@OriginalArg(0) Class251[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class251 local6 = arg0[local1];
			if (local6 != null && local6.anInt6722 == arg1) {
				@Pc(17) int local17 = local6.anInt6690 + arg6;
				@Pc(22) int local22 = local6.anInt6723 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt6654 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt6687;
					@Pc(45) int local45 = local22 + local6.anInt6677;
					if (local6.anInt6654 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt6654 == 0 || local6.aBoolean461 || method1248(local6).anInt2012 != 0 || local6 == Static377.aClass251_10 || local6.anInt6660 == Static94.anInt1952) {
					if (!method1250(local6)) {
						if (local6 == Static455.aClass251_14) {
							Static16.aBoolean13 = true;
							Static242.anInt4461 = local17;
							Static85.anInt1840 = local22;
						}
						if (local6.aBoolean459 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean466 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class1_Sub24 local148 = (Class1_Sub24) Static249.aClass181_43.method4112(); local148 != null; local148 = (Class1_Sub24) Static249.aClass181_43.method4104()) {
									if (local148.aBoolean184) {
										local148.method6020();
										local148.aClass251_5.aBoolean470 = false;
									}
								}
								if (Static290.anInt5067 == 0) {
									Static455.aClass251_14 = null;
									Static377.aClass251_10 = null;
								}
								Static34.anInt714 = 0;
								Static452.aBoolean500 = false;
								Static409.aBoolean449 = false;
								if (!Static385.aBoolean436) {
									Static220.method3399();
								}
							}
							@Pc(204) boolean local204;
							if (Static125.aClass114_1.method2701() >= local28 && Static125.aClass114_1.method2698() >= local30 && Static125.aClass114_1.method2701() < local32 && Static125.aClass114_1.method2698() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static355.aBoolean412 && local204) {
								if (local6.anInt6659 >= 0) {
									Static221.anInt2659 = local6.anInt6659;
								} else if (local6.aBoolean466) {
									Static221.anInt2659 = -1;
								}
							}
							if (!Static385.aBoolean436 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static348.method4850(arg9 - local22, arg8 - local17, local6);
							}
							@Pc(248) boolean local248 = false;
							if (Static125.aClass114_1.method2705() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class1_Sub7 local263 = (Class1_Sub7) Static447.aClass181_64.method4112();
							if (local263 != null && local263.method3628() == 0 && local263.method3633() >= local28 && local263.method3632() >= local30 && local263.method3633() < local32 && local263.method3632() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray91 != null) {
								for (local296 = 0; local296 < local6.aByteArray91.length; local296++) {
									if (Static306.aClass155_1.method3516(local6.aByteArray91[local296])) {
										if (local6.anIntArray609 == null || Static378.anInt4244 >= local6.anIntArray609[local296]) {
											@Pc(328) byte local328 = local6.aByteArray90[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static306.aClass155_1.method3516(86) && !Static306.aClass155_1.method3516(82) && !Static306.aClass155_1.method3516(81)) && ((local328 & 0x2) == 0 || Static306.aClass155_1.method3516(86)) && ((local328 & 0x1) == 0 || Static306.aClass155_1.method3516(82)) && ((local328 & 0x4) == 0 || Static306.aClass155_1.method3516(81))) {
												if (local296 < 10) {
													Static87.method1621(local6.anInt6689, "", -1, local296 + 1);
												} else if (local296 == 10) {
													Static61.method1293();
													@Pc(399) Class1_Sub17 local399 = method1248(local6);
													Static19.method504(local6, local399.anInt2009, local399.method1731());
													Static139.aString22 = Static287.method4171(local6);
													if (Static139.aString22 == null) {
														Static139.aString22 = "Null";
													}
													Static289.aString63 = local6.aString66 + "<col=ffffff>";
												}
												local430 = local6.anIntArray606[local296];
												if (local6.anIntArray609 == null) {
													local6.anIntArray609 = new int[local6.aByteArray91.length];
												}
												if (local430 == 0) {
													local6.anIntArray609[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray609[local296] = Static378.anInt4244 + local430;
												}
											}
										}
									} else if (local6.anIntArray609 != null) {
										local6.anIntArray609[local296] = 0;
									}
								}
							}
							if (local258) {
								Static360.method4963(local263.method3632() - local22, local6, local263.method3633() - local17);
							}
							if (Static455.aClass251_14 != null && Static455.aClass251_14 != local6 && local204 && method1248(local6).method1736()) {
								Static312.aClass251_8 = local6;
							}
							if (local6 == Static377.aClass251_10) {
								Static281.aBoolean419 = true;
								Static131.anInt2627 = local17;
								Static401.anInt6424 = local22;
							}
							if (local6.aBoolean461 || local6.anInt6660 != 0) {
								@Pc(515) Class1_Sub24 local515;
								if (local204 && Static268.anInt4749 != 0 && local6.anObjectArray22 != null) {
									local515 = new Class1_Sub24();
									local515.aBoolean184 = true;
									local515.aClass251_5 = local6;
									local515.anInt3105 = Static268.anInt4749;
									local515.anObjectArray3 = local6.anObjectArray22;
									Static249.aClass181_43.method4102(local515);
								}
								if (Static455.aClass251_14 != null || Static385.aBoolean436 || local6.anInt6660 != Static140.anInt2733 && Static34.anInt714 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt6660 != 0) {
									if (local6.anInt6660 == Static406.anInt6511 || local6.anInt6660 == Static108.anInt2278) {
										Static400.aClass251_11 = local6;
										if (Static432.aClass171_1 != null) {
											Static432.aClass171_1.method3879(Static415.aClass39_11, local6.anInt6677);
										}
										if (local6.anInt6660 == Static406.anInt6511) {
											if (!Static385.aBoolean436 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static298.method5254(arg9, arg8, Static415.aClass39_11);
												for (@Pc(598) Class4_Sub4 local598 = (Class4_Sub4) Static228.aClass141_5.method3357(); local598 != null; local598 = (Class4_Sub4) Static228.aClass141_5.method3360()) {
													if (arg8 >= local598.anInt3334 && arg8 < local598.anInt3337 && arg9 >= local598.anInt3332 && arg9 < local598.anInt3330) {
														Static220.method3399();
														Static378.method3529(local598.aClass31_Sub2_Sub1_1);
													}
												}
											}
											Static187.method2936(local6, local22, local17);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt6660 == Static94.anInt1952) {
										if (local6.method5550(Static415.aClass39_11) == null || Static264.anInt4692 != 0 && Static264.anInt4692 != 3 || Static385.aBoolean436 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray603[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray604[local670]) {
											continue;
										}
										local296 -= local6.anInt6687 / 2;
										local670 -= local6.anInt6677 / 2;
										if (Static345.anInt5797 == 4) {
											local709 = (int) Static142.aFloat89 & 0x3FFF;
										} else {
											local709 = (int) Static142.aFloat89 + Static82.anInt1815 & 0x3FFF;
										}
										@Pc(721) int local721 = Class183.anIntArray433[local709];
										@Pc(725) int local725 = Class183.anIntArray434[local709];
										if (Static345.anInt5797 != 4) {
											local721 = local721 * (Static119.anInt840 + 256) >> 8;
											local725 = local725 * (Static119.anInt840 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static345.anInt5797 == 4) {
											local775 = (Static190.anInt3416 >> 7) + (local754 >> 2);
											local783 = (Static2.anInt63 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static452.aClass31_Sub2_Sub1_Sub1_2.method5989() - 1) * 64;
											local775 = (Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300 - local792 >> 7) + (local754 >> 2);
											local783 = (Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298 - local792 >> 7) - (local764 >> 2);
										}
										if (Static355.aBoolean412 && (Static410.anInt6626 & 0x40) != 0) {
											@Pc(825) Class251 local825 = Static201.method3261(Static135.anInt2708, Static314.anInt5418);
											if (local825 == null) {
												Static61.method1293();
											} else {
												Static373.method5165(local6.anInt6704, " ->", local775, local783, true, 5, false, Static139.aString22, Static347.anInt5821, 1L);
											}
											continue;
										}
										if (Static337.aClass61_5 == Static147.aClass61_4) {
											Static373.method5165(-1, "", local775, local783, true, 50, false, Static241.aClass7_103.method331(Static341.anInt5770), -1, 1L);
										}
										Static373.method5165(-1, "", local775, local783, true, 8, false, Static420.aString70, Static228.anInt4143, 1L);
										continue;
									}
									if (local6.anInt6660 == Static140.anInt2733) {
										Static325.aClass251_9 = local6;
										if (local204) {
											Static452.aBoolean500 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method3633() - local17 - local6.anInt6687 / 2) * 2.0D / (double) Static168.aFloat4);
											local670 = (int) -((double) (local263.method3632() - local22 - local6.anInt6677 / 2) * 2.0D / (double) Static168.aFloat4);
											local430 = Static307.anInt5296 + local296 + Static168.anInt432;
											local709 = Static138.anInt6309 + local670 + Static168.anInt430;
											@Pc(939) Class1_Sub2_Sub11 local939 = Static268.method3947();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method4717(local944, local709, local430);
											if (local944 != null) {
												if (Static306.aClass155_1.method3516(82) && Static225.anInt4107 > 0) {
													Static192.method2982(local944[0], local944[2], local944[1]);
													continue;
												}
												Static409.aBoolean449 = true;
												Static177.anInt3266 = local944[0];
												Static348.anInt5826 = local944[1];
												Static34.anInt713 = local944[2];
											}
											Static34.anInt714 = 1;
											Static274.aBoolean319 = false;
											Static369.anInt6061 = Static125.aClass114_1.method2701();
											Static296.anInt5168 = Static125.aClass114_1.method2698();
											continue;
										}
										if (local248 && Static34.anInt714 > 0) {
											if (Static34.anInt714 == 1 && (Static369.anInt6061 != Static125.aClass114_1.method2701() || Static296.anInt5168 != Static125.aClass114_1.method2698())) {
												Static337.anInt2834 = Static307.anInt5296;
												Static8.anInt347 = Static138.anInt6309;
												Static34.anInt714 = 2;
											}
											if (Static34.anInt714 == 2) {
												Static274.aBoolean319 = true;
												Static391.method5233(Static337.anInt2834 + (int) ((double) (Static369.anInt6061 - Static125.aClass114_1.method2701()) * 2.0D / (double) Static168.aFloat5));
												Static38.method695(Static8.anInt347 - (int) ((double) (Static296.anInt5168 - Static125.aClass114_1.method2698()) * 2.0D / (double) Static168.aFloat5));
											}
											continue;
										}
										if (Static34.anInt714 > 0 && !Static274.aBoolean319) {
											if ((Static357.anInt5884 == 1 || Static352.method4870()) && Static217.anInt4004 > 2) {
												Static126.method2238(Static369.anInt6061, Static296.anInt5168);
											} else if (Static51.method6019()) {
												Static126.method2238(Static369.anInt6061, Static296.anInt5168);
											}
										}
										Static34.anInt714 = 0;
										continue;
									}
									if (local6.anInt6660 == Static352.anInt5852) {
										if (local248) {
											Static110.method1981(Static125.aClass114_1.method2701() - local17, local6.anInt6687, local6.anInt6677, Static125.aClass114_1.method2698() - local22);
										}
										continue;
									}
									if (local6.anInt6660 == Static300.anInt7013) {
										Static413.method5646(local6, local22, local17);
										continue;
									}
								}
								if (!local6.aBoolean467 && local258) {
									local6.aBoolean467 = true;
									if (local6.anObjectArray32 != null) {
										local515 = new Class1_Sub24();
										local515.aBoolean184 = true;
										local515.aClass251_5 = local6;
										local515.anInt3097 = local263.method3633() - local17;
										local515.anInt3105 = local263.method3632() - local22;
										local515.anObjectArray3 = local6.anObjectArray32;
										Static249.aClass181_43.method4102(local515);
									}
								}
								if (local6.aBoolean467 && local248 && local6.anObjectArray17 != null) {
									local515 = new Class1_Sub24();
									local515.aBoolean184 = true;
									local515.aClass251_5 = local6;
									local515.anInt3097 = Static125.aClass114_1.method2701() - local17;
									local515.anInt3105 = Static125.aClass114_1.method2698() - local22;
									local515.anObjectArray3 = local6.anObjectArray17;
									Static249.aClass181_43.method4102(local515);
								}
								if (local6.aBoolean467 && !local248) {
									local6.aBoolean467 = false;
									if (local6.anObjectArray18 != null) {
										local515 = new Class1_Sub24();
										local515.aBoolean184 = true;
										local515.aClass251_5 = local6;
										local515.anInt3097 = Static125.aClass114_1.method2701() - local17;
										local515.anInt3105 = Static125.aClass114_1.method2698() - local22;
										local515.anObjectArray3 = local6.anObjectArray18;
										Static257.aClass181_47.method4102(local515);
									}
								}
								if (local248 && local6.anObjectArray11 != null) {
									local515 = new Class1_Sub24();
									local515.aBoolean184 = true;
									local515.aClass251_5 = local6;
									local515.anInt3097 = Static125.aClass114_1.method2701() - local17;
									local515.anInt3105 = Static125.aClass114_1.method2698() - local22;
									local515.anObjectArray3 = local6.anObjectArray11;
									Static249.aClass181_43.method4102(local515);
								}
								if (!local6.aBoolean470 && local204) {
									local6.aBoolean470 = true;
									if (local6.anObjectArray6 != null) {
										local515 = new Class1_Sub24();
										local515.aBoolean184 = true;
										local515.aClass251_5 = local6;
										local515.anInt3097 = Static125.aClass114_1.method2701() - local17;
										local515.anInt3105 = Static125.aClass114_1.method2698() - local22;
										local515.anObjectArray3 = local6.anObjectArray6;
										Static249.aClass181_43.method4102(local515);
									}
								}
								if (local6.aBoolean470 && local204 && local6.anObjectArray25 != null) {
									local515 = new Class1_Sub24();
									local515.aBoolean184 = true;
									local515.aClass251_5 = local6;
									local515.anInt3097 = Static125.aClass114_1.method2701() - local17;
									local515.anInt3105 = Static125.aClass114_1.method2698() - local22;
									local515.anObjectArray3 = local6.anObjectArray25;
									Static249.aClass181_43.method4102(local515);
								}
								if (local6.aBoolean470 && !local204) {
									local6.aBoolean470 = false;
									if (local6.anObjectArray35 != null) {
										local515 = new Class1_Sub24();
										local515.aBoolean184 = true;
										local515.aClass251_5 = local6;
										local515.anInt3097 = Static125.aClass114_1.method2701() - local17;
										local515.anInt3105 = Static125.aClass114_1.method2698() - local22;
										local515.anObjectArray3 = local6.anObjectArray35;
										Static257.aClass181_47.method4102(local515);
									}
								}
								if (local6.anObjectArray16 != null) {
									local515 = new Class1_Sub24();
									local515.aClass251_5 = local6;
									local515.anObjectArray3 = local6.anObjectArray16;
									Static176.aClass181_30.method4102(local515);
								}
								@Pc(1483) Class1_Sub24 local1483;
								if (local6.anObjectArray8 != null && Static59.anInt1424 > local6.anInt6713) {
									if (local6.anIntArray611 == null || Static59.anInt1424 - local6.anInt6713 > 32) {
										local515 = new Class1_Sub24();
										local515.aClass251_5 = local6;
										local515.anObjectArray3 = local6.anObjectArray8;
										Static249.aClass181_43.method4102(local515);
									} else {
										label678: for (local296 = local6.anInt6713; local296 < Static59.anInt1424; local296++) {
											local670 = Static320.anIntArray560[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray611.length; local430++) {
												if (local6.anIntArray611[local430] == local670) {
													local1483 = new Class1_Sub24();
													local1483.aClass251_5 = local6;
													local1483.anObjectArray3 = local6.anObjectArray8;
													Static249.aClass181_43.method4102(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt6713 = Static59.anInt1424;
								}
								if (local6.anObjectArray20 != null && Static5.anInt159 > local6.anInt6670) {
									if (local6.anIntArray610 == null || Static5.anInt159 - local6.anInt6670 > 32) {
										local515 = new Class1_Sub24();
										local515.aClass251_5 = local6;
										local515.anObjectArray3 = local6.anObjectArray20;
										Static249.aClass181_43.method4102(local515);
									} else {
										label654: for (local296 = local6.anInt6670; local296 < Static5.anInt159; local296++) {
											local670 = Static336.anIntArray525[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray610.length; local430++) {
												if (local6.anIntArray610[local430] == local670) {
													local1483 = new Class1_Sub24();
													local1483.aClass251_5 = local6;
													local1483.anObjectArray3 = local6.anObjectArray20;
													Static249.aClass181_43.method4102(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt6670 = Static5.anInt159;
								}
								if (local6.anObjectArray28 != null && Static183.anInt3335 > local6.anInt6705) {
									if (local6.anIntArray605 == null || Static183.anInt3335 - local6.anInt6705 > 32) {
										local515 = new Class1_Sub24();
										local515.aClass251_5 = local6;
										local515.anObjectArray3 = local6.anObjectArray28;
										Static249.aClass181_43.method4102(local515);
									} else {
										label630: for (local296 = local6.anInt6705; local296 < Static183.anInt3335; local296++) {
											local670 = Static194.anIntArray307[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray605.length; local430++) {
												if (local6.anIntArray605[local430] == local670) {
													local1483 = new Class1_Sub24();
													local1483.aClass251_5 = local6;
													local1483.anObjectArray3 = local6.anObjectArray28;
													Static249.aClass181_43.method4102(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt6705 = Static183.anInt3335;
								}
								if (local6.anObjectArray9 != null && Static422.anInt6829 > local6.anInt6740) {
									if (local6.anIntArray608 == null || Static422.anInt6829 - local6.anInt6740 > 32) {
										local515 = new Class1_Sub24();
										local515.aClass251_5 = local6;
										local515.anObjectArray3 = local6.anObjectArray9;
										Static249.aClass181_43.method4102(local515);
									} else {
										label606: for (local296 = local6.anInt6740; local296 < Static422.anInt6829; local296++) {
											local670 = Static70.anIntArray112[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray608.length; local430++) {
												if (local6.anIntArray608[local430] == local670) {
													local1483 = new Class1_Sub24();
													local1483.aClass251_5 = local6;
													local1483.anObjectArray3 = local6.anObjectArray9;
													Static249.aClass181_43.method4102(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt6740 = Static422.anInt6829;
								}
								if (local6.anObjectArray27 != null && Static248.anInt4545 > local6.anInt6682) {
									if (local6.anIntArray602 == null || Static248.anInt4545 - local6.anInt6682 > 32) {
										local515 = new Class1_Sub24();
										local515.aClass251_5 = local6;
										local515.anObjectArray3 = local6.anObjectArray27;
										Static249.aClass181_43.method4102(local515);
									} else {
										label582: for (local296 = local6.anInt6682; local296 < Static248.anInt4545; local296++) {
											local670 = Static22.anIntArray44[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray602.length; local430++) {
												if (local6.anIntArray602[local430] == local670) {
													local1483 = new Class1_Sub24();
													local1483.aClass251_5 = local6;
													local1483.anObjectArray3 = local6.anObjectArray27;
													Static249.aClass181_43.method4102(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt6682 = Static248.anInt4545;
								}
								if (Static343.anInt6982 > local6.anInt6666 && local6.anObjectArray31 != null) {
									local515 = new Class1_Sub24();
									local515.aClass251_5 = local6;
									local515.anObjectArray3 = local6.anObjectArray31;
									Static249.aClass181_43.method4102(local515);
								}
								if (Static254.anInt4601 > local6.anInt6666 && local6.anObjectArray34 != null) {
									local515 = new Class1_Sub24();
									local515.aClass251_5 = local6;
									local515.anObjectArray3 = local6.anObjectArray34;
									Static249.aClass181_43.method4102(local515);
								}
								if (Static152.anInt2903 > local6.anInt6666 && local6.anObjectArray21 != null) {
									local515 = new Class1_Sub24();
									local515.aClass251_5 = local6;
									local515.anObjectArray3 = local6.anObjectArray21;
									Static249.aClass181_43.method4102(local515);
								}
								if (Static349.anInt5828 > local6.anInt6666 && local6.anObjectArray29 != null) {
									local515 = new Class1_Sub24();
									local515.aClass251_5 = local6;
									local515.anObjectArray3 = local6.anObjectArray29;
									Static249.aClass181_43.method4102(local515);
								}
								if (Static433.anInt7017 > local6.anInt6666 && local6.anObjectArray23 != null) {
									local515 = new Class1_Sub24();
									local515.aClass251_5 = local6;
									local515.anObjectArray3 = local6.anObjectArray23;
									Static249.aClass181_43.method4102(local515);
								}
								local6.anInt6666 = Static319.anInt4221;
								if (local6.anObjectArray13 != null) {
									for (local296 = 0; local296 < Static150.anInt2864; local296++) {
										@Pc(1951) Class1_Sub24 local1951 = new Class1_Sub24();
										local1951.aClass251_5 = local6;
										local1951.anInt3103 = Static344.aClass250Array1[local296].method5639();
										local1951.anInt3099 = Static344.aClass250Array1[local296].method5645();
										local1951.anObjectArray3 = local6.anObjectArray13;
										Static249.aClass181_43.method4102(local1951);
									}
								}
								if (Static229.aBoolean293 && local6.anObjectArray36 != null) {
									local515 = new Class1_Sub24();
									local515.aClass251_5 = local6;
									local515.anObjectArray3 = local6.anObjectArray36;
									Static249.aClass181_43.method4102(local515);
								}
							}
							if (local6.anInt6654 == 5 && local6.anInt6703 != -1) {
								local6.method5545(Static303.aClass161_1, Static117.aClass142_1).method3879(Static415.aClass39_11, local6.anInt6677);
							}
							Static20.method4147(local6);
							if (local6.anInt6654 == 0) {
								method1254(arg0, local6.anInt6689, local28, local30, local32, local34, local17 - local6.anInt6678, local22 - local6.anInt6741, arg8, arg9);
								if (local6.aClass251Array2 != null) {
									method1254(local6.aClass251Array2, local6.anInt6689, local28, local30, local32, local34, local17 - local6.anInt6678, local22 - local6.anInt6741, arg8, arg9);
								}
								@Pc(2073) Class1_Sub23 local2073 = (Class1_Sub23) Static101.aClass96_16.method2335((long) local6.anInt6689);
								if (local2073 != null) {
									if (Static337.aClass61_5 == Static444.aClass61_7 && local2073.anInt3058 == 0 && !Static385.aBoolean436 && local204 && !Static313.aBoolean387) {
										Static220.method3399();
									}
									Static43.method807(arg9, local34, local30, local2073.anInt3059, local17, arg8, local32, local22, local28);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static20.method4147(local6);
				}
			}
		}
	}
}
