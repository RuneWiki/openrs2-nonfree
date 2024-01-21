import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!j", name = "b", descriptor = "I")
	public static int anInt1735 = 1;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!rh;IIIIBII)V")
	public static void method1199(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static96.aBoolean83 && (Static18.aByteArrayArrayArray1[0][arg6][arg3] & 0x2) == 0) {
			if ((Static18.aByteArrayArrayArray1[arg5][arg6][arg3] & 0x10) != 0) {
				return;
			}
			if (Static135.method2054(arg3, arg5, arg6) != Static181.anInt4055) {
				return;
			}
		}
		if (Static13.anInt315 > arg5) {
			Static13.anInt315 = arg5;
		}
		@Pc(56) Class3_Sub1_Sub1 local56 = Static162.method2627(arg4);
		@Pc(67) int local67;
		@Pc(70) int local70;
		if (arg2 == 1 || arg2 == 3) {
			local67 = local56.anInt150;
			local70 = local56.anInt145;
		} else {
			local67 = local56.anInt145;
			local70 = local56.anInt150;
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (local67 + arg6 > 104) {
			local87 = arg6 + 1;
			local89 = arg6;
		} else {
			local87 = arg6 + (local67 + 1 >> 1);
			local89 = (local67 >> 1) + arg6;
		}
		@Pc(119) int local119;
		@Pc(117) int local117;
		if (local70 + arg3 > 104) {
			local117 = arg3 + 1;
			local119 = arg3;
		} else {
			local119 = arg3 + (local70 >> 1);
			local117 = arg3 + (local70 + 1 >> 1);
		}
		@Pc(141) int[][] local141 = Static42.anIntArrayArrayArray1[arg5];
		@Pc(149) int local149 = (arg3 << 7) + (local70 << 6);
		@Pc(157) int local157 = (local67 << 6) + (arg6 << 7);
		@Pc(184) int local184 = local141[local87][local117] + local141[local89][local117] + local141[local89][local119] + local141[local87][local119] >> 2;
		@Pc(201) long local201 = (long) ((arg2 | 0x400) << 20 | arg6 | arg3 << 7 | arg1 << 14);
		if (local56.anInt159 == 0) {
			local201 |= Long.MIN_VALUE;
		}
		if (local56.anInt130 == 1) {
			local201 |= 0x400000L;
		}
		if (local56.method123()) {
			Static169.method695(arg2, arg3, local56, arg5, arg6);
		}
		local201 |= (long) arg4 << 32;
		@Pc(278) Class3_Sub1_Sub5 local278;
		@Pc(275) Class3_Sub1_Sub9 local275;
		if (arg1 != 22) {
			@Pc(384) int local384;
			if (arg1 == 10 || arg1 == 11) {
				if (local56.anInt142 == -1 && local56.anIntArray23 == null) {
					local275 = local56.method120(local184, local149, local157, 10, arg2, local141);
					local278 = local275.aClass3_Sub1_Sub5_3;
				} else {
					local278 = new Class3_Sub1_Sub5_Sub6(arg4, 10, arg2, arg5, arg6, arg3, local56.anInt142, local56.aBoolean8, null);
				}
				if (local278 != null && Static93.method1424(arg5, arg6, arg3, local184, local67, local70, local278, arg1 == 11 ? 256 : 0, local201) && local56.aBoolean9) {
					local384 = 15;
					if (local278 instanceof Class3_Sub1_Sub5_Sub3) {
						local384 = ((Class3_Sub1_Sub5_Sub3) local278).method1378() / 4;
						if (local384 > 30) {
							local384 = 30;
						}
					}
					for (@Pc(402) int local402 = 0; local402 <= local67; local402++) {
						for (@Pc(406) int local406 = 0; local406 <= local70; local406++) {
							if (local384 > Static126.aByteArrayArrayArray5[arg5][arg6 + local402][arg3 + local406]) {
								Static126.aByteArrayArrayArray5[arg5][arg6 + local402][local406 + arg3] = (byte) local384;
							}
						}
					}
				}
				if (local56.anInt134 != 0 && arg0 != null) {
					arg0.method2510(arg3, local70, local67, local56.aBoolean14, arg6);
				}
			} else if (arg1 >= 12) {
				if (local56.anInt142 == -1 && local56.anIntArray23 == null) {
					local275 = local56.method120(local184, local149, local157, arg1, arg2, local141);
					local278 = local275.aClass3_Sub1_Sub5_3;
				} else {
					local278 = new Class3_Sub1_Sub5_Sub6(arg4, arg1, arg2, arg5, arg6, arg3, local56.anInt142, local56.aBoolean8, null);
				}
				Static93.method1424(arg5, arg6, arg3, local184, 1, 1, local278, 0, local201);
				if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg5 > 0) {
					Static72.anIntArrayArrayArray10[arg5][arg6][arg3] |= 0x924;
				}
				if (local56.anInt134 != 0 && arg0 != null) {
					arg0.method2510(arg3, local70, local67, local56.aBoolean14, arg6);
				}
			} else if (arg1 == 0) {
				if (local56.anInt142 == -1 && local56.anIntArray23 == null) {
					local275 = local56.method120(local184, local149, local157, 0, arg2, local141);
					local278 = local275.aClass3_Sub1_Sub5_3;
				} else {
					local278 = new Class3_Sub1_Sub5_Sub6(arg4, 0, arg2, arg5, arg6, arg3, local56.anInt142, local56.aBoolean8, null);
				}
				Static75.method1110(arg5, arg6, arg3, local184, local278, null, Static28.anIntArray88[arg2], 0, local201);
				if (arg2 == 0) {
					if (local56.aBoolean9) {
						Static126.aByteArrayArrayArray5[arg5][arg6][arg3] = 50;
						Static126.aByteArrayArrayArray5[arg5][arg6][arg3 + 1] = 50;
					}
					if (local56.aBoolean11) {
						Static72.anIntArrayArrayArray10[arg5][arg6][arg3] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (local56.aBoolean9) {
						Static126.aByteArrayArrayArray5[arg5][arg6][arg3 + 1] = 50;
						Static126.aByteArrayArrayArray5[arg5][arg6 + 1][arg3 + 1] = 50;
					}
					if (local56.aBoolean11) {
						Static72.anIntArrayArrayArray10[arg5][arg6][arg3 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (local56.aBoolean9) {
						Static126.aByteArrayArrayArray5[arg5][arg6 + 1][arg3] = 50;
						Static126.aByteArrayArrayArray5[arg5][arg6 + 1][arg3 + 1] = 50;
					}
					if (local56.aBoolean11) {
						Static72.anIntArrayArrayArray10[arg5][arg6 + 1][arg3] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (local56.aBoolean9) {
						Static126.aByteArrayArrayArray5[arg5][arg6][arg3] = 50;
						Static126.aByteArrayArrayArray5[arg5][arg6 + 1][arg3] = 50;
					}
					if (local56.aBoolean11) {
						Static72.anIntArrayArrayArray10[arg5][arg6][arg3] |= 0x492;
					}
				}
				if (local56.anInt134 != 0 && arg0 != null) {
					arg0.method2505(arg3, arg1, local56.aBoolean14, arg2, arg6);
				}
				if (local56.anInt163 != 16) {
					Static54.method800(arg5, arg6, arg3, local56.anInt163);
				}
			} else if (arg1 == 1) {
				if (local56.anInt142 == -1 && local56.anIntArray23 == null) {
					local275 = local56.method120(local184, local149, local157, 1, arg2, local141);
					local278 = local275.aClass3_Sub1_Sub5_3;
				} else {
					local278 = new Class3_Sub1_Sub5_Sub6(arg4, 1, arg2, arg5, arg6, arg3, local56.anInt142, local56.aBoolean8, null);
				}
				Static75.method1110(arg5, arg6, arg3, local184, local278, null, Static64.anIntArray180[arg2], 0, local201);
				if (local56.aBoolean9) {
					if (arg2 == 0) {
						Static126.aByteArrayArrayArray5[arg5][arg6][arg3 + 1] = 50;
					} else if (arg2 == 1) {
						Static126.aByteArrayArrayArray5[arg5][arg6 + 1][arg3 + 1] = 50;
					} else if (arg2 == 2) {
						Static126.aByteArrayArrayArray5[arg5][arg6 + 1][arg3] = 50;
					} else if (arg2 == 3) {
						Static126.aByteArrayArrayArray5[arg5][arg6][arg3] = 50;
					}
				}
				if (local56.anInt134 != 0 && arg0 != null) {
					arg0.method2505(arg3, arg1, local56.aBoolean14, arg2, arg6);
				}
			} else {
				@Pc(1007) int local1007;
				@Pc(1038) Class3_Sub1_Sub9 local1038;
				if (arg1 == 2) {
					local1007 = arg2 + 1 & 0x3;
					@Pc(1044) Class3_Sub1_Sub5 local1044;
					@Pc(1041) Class3_Sub1_Sub5 local1041;
					if (local56.anInt142 == -1 && local56.anIntArray23 == null) {
						@Pc(1028) Class3_Sub1_Sub9 local1028 = local56.method120(local184, local149, local157, 2, arg2 + 4, local141);
						local1038 = local56.method120(local184, local149, local157, 2, local1007, local141);
						local1041 = local1028.aClass3_Sub1_Sub5_3;
						local1044 = local1038.aClass3_Sub1_Sub5_3;
					} else {
						local1041 = new Class3_Sub1_Sub5_Sub6(arg4, 2, arg2 + 4, arg5, arg6, arg3, local56.anInt142, local56.aBoolean8, null);
						local1044 = new Class3_Sub1_Sub5_Sub6(arg4, 2, local1007, arg5, arg6, arg3, local56.anInt142, local56.aBoolean8, null);
					}
					Static75.method1110(arg5, arg6, arg3, local184, local1041, local1044, Static28.anIntArray88[arg2], Static28.anIntArray88[local1007], local201);
					if (local56.aBoolean11) {
						if (arg2 == 0) {
							Static72.anIntArrayArrayArray10[arg5][arg6][arg3] |= 0x249;
							Static72.anIntArrayArrayArray10[arg5][arg6][arg3 + 1] |= 0x492;
						} else if (arg2 == 1) {
							Static72.anIntArrayArrayArray10[arg5][arg6][arg3 + 1] |= 0x492;
							Static72.anIntArrayArrayArray10[arg5][arg6 + 1][arg3] |= 0x249;
						} else if (arg2 == 2) {
							Static72.anIntArrayArrayArray10[arg5][arg6 + 1][arg3] |= 0x249;
							Static72.anIntArrayArrayArray10[arg5][arg6][arg3] |= 0x492;
						} else if (arg2 == 3) {
							Static72.anIntArrayArrayArray10[arg5][arg6][arg3] |= 0x492;
							Static72.anIntArrayArrayArray10[arg5][arg6][arg3] |= 0x249;
						}
					}
					if (local56.anInt134 != 0 && arg0 != null) {
						arg0.method2505(arg3, arg1, local56.aBoolean14, arg2, arg6);
					}
					if (local56.anInt163 != 16) {
						Static54.method800(arg5, arg6, arg3, local56.anInt163);
					}
				} else if (arg1 == 3) {
					if (local56.anInt142 == -1 && local56.anIntArray23 == null) {
						local275 = local56.method120(local184, local149, local157, 3, arg2, local141);
						local278 = local275.aClass3_Sub1_Sub5_3;
					} else {
						local278 = new Class3_Sub1_Sub5_Sub6(arg4, 3, arg2, arg5, arg6, arg3, local56.anInt142, local56.aBoolean8, null);
					}
					Static75.method1110(arg5, arg6, arg3, local184, local278, null, Static64.anIntArray180[arg2], 0, local201);
					if (local56.aBoolean9) {
						if (arg2 == 0) {
							Static126.aByteArrayArrayArray5[arg5][arg6][arg3 + 1] = 50;
						} else if (arg2 == 1) {
							Static126.aByteArrayArrayArray5[arg5][arg6 + 1][arg3 + 1] = 50;
						} else if (arg2 == 2) {
							Static126.aByteArrayArrayArray5[arg5][arg6 + 1][arg3] = 50;
						} else if (arg2 == 3) {
							Static126.aByteArrayArrayArray5[arg5][arg6][arg3] = 50;
						}
					}
					if (local56.anInt134 != 0 && arg0 != null) {
						arg0.method2505(arg3, arg1, local56.aBoolean14, arg2, arg6);
					}
				} else if (arg1 == 9) {
					if (local56.anInt142 == -1 && local56.anIntArray23 == null) {
						local275 = local56.method120(local184, local149, local157, arg1, arg2, local141);
						local278 = local275.aClass3_Sub1_Sub5_3;
					} else {
						local278 = new Class3_Sub1_Sub5_Sub6(arg4, arg1, arg2, arg5, arg6, arg3, local56.anInt142, local56.aBoolean8, null);
					}
					Static93.method1424(arg5, arg6, arg3, local184, 1, 1, local278, 0, local201);
					if (local56.anInt134 != 0 && arg0 != null) {
						arg0.method2510(arg3, local70, local67, local56.aBoolean14, arg6);
					}
					if (local56.anInt163 != 16) {
						Static54.method800(arg5, arg6, arg3, local56.anInt163);
					}
				} else if (arg1 == 4) {
					if (local56.anInt142 == -1 && local56.anIntArray23 == null) {
						local275 = local56.method120(local184, local149, local157, 4, arg2, local141);
						local278 = local275.aClass3_Sub1_Sub5_3;
					} else {
						local278 = new Class3_Sub1_Sub5_Sub6(arg4, 4, arg2, arg5, arg6, arg3, local56.anInt142, local56.aBoolean8, null);
					}
					Static32.method3053(arg5, arg6, arg3, local184, local278, null, Static28.anIntArray88[arg2], 0, 0, 0, local201);
				} else {
					@Pc(1568) long local1568;
					@Pc(1604) Class3_Sub1_Sub5 local1604;
					if (arg1 == 5) {
						local1007 = 16;
						local1568 = Static11.method218(arg5, arg6, arg3);
						if (local1568 != 0L) {
							local1007 = Static162.method2627(Integer.MAX_VALUE & (int) (local1568 >>> 32)).anInt163;
						}
						if (local56.anInt142 == -1 && local56.anIntArray23 == null) {
							local1038 = local56.method120(local184, local149, local157, 4, arg2, local141);
							local1604 = local1038.aClass3_Sub1_Sub5_3;
						} else {
							local1604 = new Class3_Sub1_Sub5_Sub6(arg4, 4, arg2, arg5, arg6, arg3, local56.anInt142, local56.aBoolean8, null);
						}
						Static32.method3053(arg5, arg6, arg3, local184, local1604, null, Static28.anIntArray88[arg2], 0, Static95.anIntArray455[arg2] * local1007, Static88.anIntArray223[arg2] * local1007, local201);
					} else if (arg1 == 6) {
						local1007 = 8;
						local1568 = Static11.method218(arg5, arg6, arg3);
						if (local1568 != 0L) {
							local1007 = Static162.method2627((int) (local1568 >>> 32) & Integer.MAX_VALUE).anInt163 / 2;
						}
						if (local56.anInt142 == -1 && local56.anIntArray23 == null) {
							local1038 = local56.method120(local184, local149, local157, 4, arg2 + 4, local141);
							local1604 = local1038.aClass3_Sub1_Sub5_3;
						} else {
							local1604 = new Class3_Sub1_Sub5_Sub6(arg4, 4, arg2 + 4, arg5, arg6, arg3, local56.anInt142, local56.aBoolean8, null);
						}
						Static32.method3053(arg5, arg6, arg3, local184, local1604, null, 256, arg2, Static103.anIntArray297[arg2] * local1007, Static53.anIntArray164[arg2] * local1007, local201);
					} else if (arg1 == 7) {
						local384 = arg2 + 2 & 0x3;
						if (local56.anInt142 == -1 && local56.anIntArray23 == null) {
							@Pc(1762) Class3_Sub1_Sub9 local1762 = local56.method120(local184, local149, local157, 4, local384 + 4, local141);
							local278 = local1762.aClass3_Sub1_Sub5_3;
						} else {
							local278 = new Class3_Sub1_Sub5_Sub6(arg4, 4, local384 + 4, arg5, arg6, arg3, local56.anInt142, local56.aBoolean8, null);
						}
						Static32.method3053(arg5, arg6, arg3, local184, local278, null, 256, local384, 0, 0, local201);
					} else if (arg1 == 8) {
						local1007 = 8;
						local1568 = Static11.method218(arg5, arg6, arg3);
						if (local1568 != 0L) {
							local1007 = Static162.method2627(Integer.MAX_VALUE & (int) (local1568 >>> 32)).anInt163 / 2;
						}
						@Pc(1831) int local1831 = arg2 + 2 & 0x3;
						@Pc(1872) Class3_Sub1_Sub5 local1872;
						if (local56.anInt142 == -1 && local56.anIntArray23 == null) {
							@Pc(1886) Class3_Sub1_Sub9 local1886 = local56.method120(local184, local149, local157, 4, arg2 + 4, local141);
							@Pc(1898) Class3_Sub1_Sub9 local1898 = local56.method120(local184, local149, local157, 4, local1831 + 4, local141);
							local1604 = local1886.aClass3_Sub1_Sub5_3;
							local1872 = local1898.aClass3_Sub1_Sub5_3;
						} else {
							local1604 = new Class3_Sub1_Sub5_Sub6(arg4, 4, arg2 + 4, arg5, arg6, arg3, local56.anInt142, local56.aBoolean8, null);
							local1872 = new Class3_Sub1_Sub5_Sub6(arg4, 4, local1831 + 4, arg5, arg6, arg3, local56.anInt142, local56.aBoolean8, null);
						}
						Static32.method3053(arg5, arg6, arg3, local184, local1604, local1872, 256, arg2, Static103.anIntArray297[arg2] * local1007, Static53.anIntArray164[arg2] * local1007, local201);
					}
				}
			}
		} else if (!Static96.aBoolean83 || local56.anInt159 != 0 || local56.anInt134 == 1 || local56.aBoolean15) {
			if (local56.anInt142 == -1 && local56.anIntArray23 == null) {
				local275 = local56.method120(local184, local149, local157, 22, arg2, local141);
				local278 = local275.aClass3_Sub1_Sub5_3;
			} else {
				local278 = new Class3_Sub1_Sub5_Sub6(arg4, 22, arg2, arg5, arg6, arg3, local56.anInt142, local56.aBoolean8, null);
			}
			Static137.method2077(arg5, arg6, arg3, local184, local278, local201, local56.aBoolean10);
			if (local56.anInt134 == 1 && arg0 != null) {
				arg0.method2515(arg6, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()V")
	public static void method1200() {
		for (@Pc(1) int local1 = 0; local1 < Static170.anInt3814; local1++) {
			@Pc(6) Class4 local6 = Static153.aClass4Array2[local1];
			Static64.method922(local6);
			Static153.aClass4Array2[local1] = null;
		}
		Static170.anInt3814 = 0;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Z")
	public static boolean method1201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static192.anInt4403; local1++) {
			@Pc(6) Class60 local6 = Static191.aClass60Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2540 == 1) {
				local15 = local6.anInt2542 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2541 + (local6.anInt2544 * local15 >> 8);
					local37 = local6.anInt2533 + (local6.anInt2529 * local15 >> 8);
					local47 = local6.anInt2538 + (local6.anInt2535 * local15 >> 8);
					local57 = local6.anInt2532 + (local6.anInt2534 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2540 == 2) {
				local15 = arg0 - local6.anInt2542;
				if (local15 > 0) {
					local27 = local6.anInt2541 + (local6.anInt2544 * local15 >> 8);
					local37 = local6.anInt2533 + (local6.anInt2529 * local15 >> 8);
					local47 = local6.anInt2538 + (local6.anInt2535 * local15 >> 8);
					local57 = local6.anInt2532 + (local6.anInt2534 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2540 == 3) {
				local15 = local6.anInt2541 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2542 + (local6.anInt2543 * local15 >> 8);
					local37 = local6.anInt2530 + (local6.anInt2546 * local15 >> 8);
					local47 = local6.anInt2538 + (local6.anInt2535 * local15 >> 8);
					local57 = local6.anInt2532 + (local6.anInt2534 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2540 == 4) {
				local15 = arg2 - local6.anInt2541;
				if (local15 > 0) {
					local27 = local6.anInt2542 + (local6.anInt2543 * local15 >> 8);
					local37 = local6.anInt2530 + (local6.anInt2546 * local15 >> 8);
					local47 = local6.anInt2538 + (local6.anInt2535 * local15 >> 8);
					local57 = local6.anInt2532 + (local6.anInt2534 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2540 == 5) {
				local15 = arg1 - local6.anInt2538;
				if (local15 > 0) {
					local27 = local6.anInt2542 + (local6.anInt2543 * local15 >> 8);
					local37 = local6.anInt2530 + (local6.anInt2546 * local15 >> 8);
					local47 = local6.anInt2541 + (local6.anInt2544 * local15 >> 8);
					local57 = local6.anInt2533 + (local6.anInt2529 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
