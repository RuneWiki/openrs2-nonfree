import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "Lclient!pn;")
	public static Class1_Sub2_Sub11 aClass1_Sub2_Sub11_12;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "Lclient!km;")
	public static Class91 aClass91_102;

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "Lclient!ng;")
	public static Class111 aClass111_4;

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "[S")
	public static short[] aShortArray49 = new short[256];

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II[Lclient!la;II[BZIIII)[I")
	public static int[] method2222(@OriginalArg(1) int arg0, @OriginalArg(2) Class92[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(11) int local11 = (arg9 & 0x7) * 8;
		@Pc(21) int local21;
		@Pc(38) int local38;
		if (!arg5) {
			for (@Pc(16) int local16 = 0; local16 < 8; local16++) {
				for (local21 = 0; local21 < 8; local21++) {
					local38 = Static163.method2821(arg2, local21 & 0x7, local16 & 0x7) + arg7;
					@Pc(51) int local51 = arg3 + Static122.method3204(local16 & 0x7, arg2, local21 & 0x7);
					if (local38 > 0 && local38 < 103 && local51 > 0 && local51 < 103) {
						arg1[arg0].anIntArrayArray15[local38][local51] &= 0xFFDFFFFF;
					}
				}
			}
		}
		@Pc(95) Class1_Sub11 local95 = new Class1_Sub11(arg4);
		local21 = (arg9 & 0xFFFFFFF8) << 3;
		@Pc(105) byte local105;
		if (arg5) {
			local105 = 1;
		} else {
			local105 = 4;
		}
		@Pc(115) int local115 = (arg8 & 0x7) * 8;
		local38 = (arg8 & 0x1FFFFFF8) << 3;
		@Pc(123) byte local123 = 0;
		@Pc(125) byte local125 = 0;
		if (arg2 == 1) {
			local125 = 1;
		} else if (arg2 == 2) {
			local123 = 1;
			local125 = 1;
		} else if (arg2 == 3) {
			local123 = 1;
		}
		@Pc(167) int local167;
		@Pc(260) int local260;
		@Pc(251) int local251;
		@Pc(391) int local391;
		@Pc(400) int local400;
		@Pc(414) int local414;
		@Pc(422) int local422;
		for (@Pc(153) int local153 = 0; local153 < local105; local153++) {
			for (@Pc(162) int local162 = 0; local162 < 64; local162++) {
				for (local167 = 0; local167 < 64; local167++) {
					if (arg6 != local153 || local162 < local11 || local162 > local11 + 8 || local115 > local167 || local167 > local115 + 8) {
						Static1.method3383(0, 0, false, -1, 0, 0, -1, local95, 0, arg5, 0);
					} else if (local11 + 8 == local162 || local115 + 8 == local167) {
						if (arg2 == 0) {
							local260 = local162 + arg7 - local11;
							local251 = local167 + arg3 - local115;
						} else if (arg2 == 1) {
							local251 = local11 + arg3 + 8 - local162;
							local260 = local167 + arg7 - local115;
						} else if (arg2 == 2) {
							local251 = local115 + arg3 + 8 - local167;
							local260 = local11 + arg7 + 8 - local162;
						} else {
							local251 = arg3 + local162 - local11;
							local260 = arg7 + local115 + 8 - local167;
						}
						Static1.method3383(0, 0, true, local260, local21 + local162, local167 + local38, local251, local95, 0, arg5, arg0);
					} else {
						local260 = Static163.method2821(arg2, local167 & 0x7, local162 & 0x7) + arg7;
						local251 = arg3 + Static122.method3204(local162 & 0x7, arg2, local167 & 0x7);
						Static1.method3383(arg2, local123, false, local260, local162 + local21, local167 + local38, local251, local95, local125, arg5, arg0);
						if (local162 == 63 || local167 == 63) {
							local391 = local162 == 63 ? 64 : local162;
							local400 = local167 == 63 ? 64 : local167;
							if (arg2 == 0) {
								local422 = local400 + arg3 - local115;
								local414 = local391 + arg7 - local11;
							} else if (arg2 == 1) {
								local414 = local400 + arg7 - local115;
								local422 = local11 + arg3 + 8 - local391;
							} else if (arg2 == 2) {
								local414 = arg7 + local11 + 8 - local391;
								local422 = arg3 + local115 + 8 - local400;
							} else {
								local414 = local115 + arg7 + 8 - local400;
								local422 = arg3 + local391 - local11;
							}
							if (local414 >= 0 && local414 < 104 && local422 >= 0 && local422 < 104) {
								Static55.anIntArrayArrayArray3[arg0][local414][local422] = Static55.anIntArrayArrayArray3[arg0][local260 + local123][local125 + local251];
							}
						}
					}
				}
			}
		}
		@Pc(526) boolean local526 = false;
		@Pc(642) int local642;
		@Pc(692) int local692;
		while (local95.anInt3264 < local95.aByteArray47.length) {
			local167 = local95.method2690();
			if (local167 == 128) {
				local526 = true;
				Static67.anIntArray140[0] = local95.method2691();
				Static67.anIntArray140[1] = local95.method2632();
				Static67.anIntArray140[2] = local95.method2632();
				Static67.anIntArray140[3] = local95.method2632();
				Static67.anIntArray140[4] = local95.method2691();
			} else {
				if (local167 != 129) {
					local95.anInt3264--;
					break;
				}
				for (local260 = 0; local260 < 4; local260++) {
					@Pc(597) byte local597 = local95.method2663();
					if (local597 == 0) {
						if (arg6 >= local260) {
							local391 = arg7;
							if (arg7 < 0) {
								local391 = 0;
							} else if (arg7 >= 104) {
								local391 = 104;
							}
							local414 = arg3;
							local400 = arg7 + 7;
							local422 = arg3 + 7;
							if (local422 < 0) {
								local422 = 0;
							} else if (local422 >= 104) {
								local422 = 104;
							}
							if (arg3 < 0) {
								local414 = 0;
							} else if (arg3 >= 104) {
								local414 = 104;
							}
							if (local400 < 0) {
								local400 = 0;
							} else if (local400 >= 104) {
								local400 = 104;
							}
							while (local391 < local400) {
								while (local422 > local414) {
									Static106.aByteArrayArrayArray17[arg0][local391][local414] = 0;
									local414++;
								}
								local391++;
							}
						}
					} else if (local597 == 1) {
						for (local391 = 0; local391 < 64; local391 += 4) {
							for (local400 = 0; local400 < 64; local400 += 4) {
								@Pc(625) byte local625 = local95.method2663();
								if (local260 <= arg6) {
									for (local422 = local391; local422 < local391 + 4; local422++) {
										for (local642 = local400; local642 < local400 + 4; local642++) {
											if (local11 <= local422 && local11 + 8 > local422 && local642 >= local115 && local115 < local115 + 8) {
												local692 = arg7 + Static163.method2821(arg2, local642 & 0x7, local422 & 0x7);
												@Pc(705) int local705 = arg3 + Static122.method3204(local422 & 0x7, arg2, local642 & 0x7);
												if (local692 >= 0 && local692 < 104 && local705 >= 0 && local705 < 104) {
													Static106.aByteArrayArrayArray17[arg0][local692][local705] = local625;
												}
											}
										}
									}
								}
							}
						}
					} else if (local597 == 2) {
					}
				}
			}
		}
		if (Static277.aBoolean412 && !arg5) {
			@Pc(856) Class62 local856 = null;
			while (true) {
				while (local95.aByteArray47.length > local95.anInt3264) {
					local260 = local95.method2690();
					if (local260 == 0) {
						local856 = new Class62(local95);
					} else if (local260 == 1) {
						local251 = local95.method2690();
						if (local251 > 0) {
							for (local391 = 0; local391 < local251; local391++) {
								@Pc(900) Class144 local900 = new Class144(local95);
								if (local900.anInt4499 == 31) {
									@Pc(911) Class142 local911 = Static64.method1189(local95.method2691());
									local900.method3549(local911.anInt4388, local911.anInt4382, local911.anInt4387, local911.anInt4381);
								}
								local414 = local900.anInt4502 >> 7;
								local422 = local900.anInt4490 >> 7;
								if (arg6 == local900.anInt4492 && local414 >= local11 && local11 + 8 > local414 && local422 >= local115 && local422 < local115 + 8) {
									local642 = Static30.method2682(local900.anInt4502 & 0x3FF, arg2, local900.anInt4490 & 0x3FF) + (arg7 << 7);
									local692 = (arg3 << 7) + Static187.method3138(arg2, local900.anInt4502 & 0x3FF, local900.anInt4490 & 0x3FF);
									local900.anInt4502 = local642;
									local414 = local900.anInt4502 >> 7;
									local900.anInt4490 = local692;
									local422 = local900.anInt4490 >> 7;
									if (local414 >= 0 && local422 >= 0 && local414 < 104 && local422 < 104) {
										local900.aBoolean349 = (Static260.aByteArrayArrayArray25[1][local414][local422] & 0x2) != 0;
										local900.anInt4484 = Static55.anIntArrayArrayArray3[local900.anInt4492][local414][local422] - local900.anInt4484;
										Static120.method2147(local900);
									}
								}
							}
						}
					} else if (local260 == 2) {
						if (local856 == null) {
							local856 = new Class62();
						}
						local856.method1906(local95);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local856 == null) {
					local856 = new Class62();
				}
				Static73.aClass62ArrayArray1[arg7 >> 3][arg3 >> 3] = local856;
				break;
			}
		}
		local167 = arg7 + 7;
		local260 = arg3 + 7;
		for (local251 = arg7; local251 < local167; local251++) {
			for (local391 = arg3; local391 < local260; local391++) {
				Static106.aByteArrayArrayArray17[arg0][local251][local391] = 0;
			}
		}
		return local526 ? Static67.anIntArray140 : null;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIII)I")
	public static int method2223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static149.aBoolean238) {
			Static149.aBoolean238 = false;
			arg3 = 1000000;
		}
		@Pc(18) Class62 local18 = Static73.aClass62ArrayArray1[arg0][arg2];
		@Pc(21) int local21 = local18.anInt2416;
		@Pc(24) int local24 = local18.anInt2411;
		@Pc(44) float local44 = local18.aFloat17;
		@Pc(47) Class1_Sub2_Sub7 local47 = local18.aClass1_Sub2_Sub7_4;
		@Pc(50) float local50 = local18.aFloat13;
		@Pc(53) int local53 = local18.anInt2414;
		@Pc(63) float local63 = local18.aFloat14 * ((float) arg1 * 0.1F + 0.7F);
		if (!Static129.aBoolean213) {
			local53 = 0;
		}
		@Pc(70) float local70 = local18.aFloat16;
		@Pc(73) float local73 = local18.aFloat12;
		@Pc(76) float local76 = local18.aFloat15;
		if (Static244.anInt4847 != local21 || local63 != Static49.aFloat9 || Static238.aFloat37 != local50 || Static291.aFloat56 != local44 || Static83.anInt1871 != local24 || local53 != Static169.anInt3626 || local47 != Static60.aClass1_Sub2_Sub7_3 || Static141.aFloat26 != local73 || Static276.aFloat22 != local76 || Static8.aFloat2 != local70) {
			Static33.aFloat8 = Static138.aFloat47;
			Static134.aFloat23 = Static225.aFloat44;
			Static298.aFloat57 = Static239.aFloat48;
			Static162.anInt3470 = Static64.anInt1379;
			Static43.anInt890 = Static80.anInt1776;
			Static152.aFloat34 = Static121.aFloat19;
			Static56.aClass1_Sub2_Sub7_2 = Static123.aClass1_Sub2_Sub7_5;
			Static22.aFloat4 = Static218.aFloat42;
			Static90.aFloat11 = Static217.aFloat41;
			Static60.anInt1267 = Static274.anInt5345;
			if (Static183.aClass1_Sub2_Sub7_8 == null || Static56.aClass1_Sub2_Sub7_2 == Static183.aClass1_Sub2_Sub7_8) {
				Static183.aClass1_Sub2_Sub7_8 = new Class1_Sub2_Sub7();
			}
			Static238.aFloat37 = local50;
			Static140.anInt3033 = 0;
			Static276.aFloat22 = local76;
			Static8.aFloat2 = local70;
			Static83.anInt1871 = local24;
			Static169.anInt3626 = local53;
			Static141.aFloat26 = local73;
			Static291.aFloat56 = local44;
			Static49.aFloat9 = local63;
			Static60.aClass1_Sub2_Sub7_3 = local47;
			Static244.anInt4847 = local21;
		}
		if (Static140.anInt3033 < 65536) {
			Static140.anInt3033 += arg3 * 250;
			if (Static140.anInt3033 >= 65536) {
				Static123.aClass1_Sub2_Sub7_5 = Static60.aClass1_Sub2_Sub7_3;
				Static217.aFloat41 = Static8.aFloat2;
				Static239.aFloat48 = Static291.aFloat56;
				Static225.aFloat44 = Static238.aFloat37;
				Static140.anInt3033 = 65536;
				Static80.anInt1776 = Static244.anInt4847;
				Static218.aFloat42 = Static49.aFloat9;
				Static64.anInt1379 = Static83.anInt1871;
				Static138.aFloat47 = Static141.aFloat26;
				Static274.anInt5345 = Static169.anInt3626;
				Static121.aFloat19 = Static276.aFloat22;
				Static56.aClass1_Sub2_Sub7_2 = null;
			} else {
				@Pc(217) int local217 = Static140.anInt3033 >> 8;
				@Pc(224) int local224 = 65536 - Static140.anInt3033 >> 8;
				@Pc(232) float local232 = (float) (65536 - Static140.anInt3033) / 65536.0F;
				@Pc(237) float local237 = (float) Static140.anInt3033 / 65536.0F;
				Static218.aFloat42 = Static49.aFloat9 * local237 + local232 * Static22.aFloat4;
				Static64.anInt1379 = (local217 * (Static83.anInt1871 & 0xFF00) + (Static162.anInt3470 & 0xFF00) * local224 & 0xFF0000) + (local217 * (Static83.anInt1871 & 0xFF00FF) + (Static162.anInt3470 & 0xFF00FF) * local224 & 0xFF00FF00) >> 8;
				Static225.aFloat44 = Static134.aFloat23 * local232 + Static238.aFloat37 * local237;
				Static80.anInt1776 = ((Static43.anInt890 & 0xFF00) * local224 + (Static244.anInt4847 & 0xFF00) * local217 & 0xFF0000) + (local224 * (Static43.anInt890 & 0xFF00FF) + (local217 * (Static244.anInt4847 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				Static239.aFloat48 = local232 * Static298.aFloat57 + local237 * Static291.aFloat56;
				Static217.aFloat41 = Static90.aFloat11 * local232 + local237 * Static8.aFloat2;
				Static274.anInt5345 = local217 * Static169.anInt3626 + Static60.anInt1267 * local224 >> 8;
				Static121.aFloat19 = local237 * Static276.aFloat22 + local232 * Static152.aFloat34;
				Static138.aFloat47 = local237 * Static141.aFloat26 + Static33.aFloat8 * local232;
				if (Static56.aClass1_Sub2_Sub7_2 != Static60.aClass1_Sub2_Sub7_3) {
					if (Static56.aClass1_Sub2_Sub7_2 == null || Static60.aClass1_Sub2_Sub7_3 == null) {
						Static123.aClass1_Sub2_Sub7_5 = null;
					} else {
						Static123.aClass1_Sub2_Sub7_5 = Static183.aClass1_Sub2_Sub7_8.method864(Static56.aClass1_Sub2_Sub7_2, Static60.aClass1_Sub2_Sub7_3, (float) Static140.anInt3033 / 65536.0F);
					}
				}
			}
		}
		return Static64.anInt1379;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IB)V")
	public static void method2225() {
		Static205.aClass135_23.method3320(5);
		Static232.aClass135_28.method3320(5);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(III[I[Ljava/lang/Object;)V")
	public static void method2226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(27) int local27 = (arg0 + arg1) / 2;
		@Pc(31) int local31 = arg2[local27];
		arg2[local27] = arg2[arg1];
		arg2[arg1] = local31;
		@Pc(43) int local43 = arg0;
		@Pc(47) Object local47 = arg3[local27];
		arg3[local27] = arg3[arg1];
		arg3[arg1] = local47;
		for (@Pc(59) int local59 = arg0; local59 < arg1; local59++) {
			if (arg2[local59] < (local59 & 0x1) + local31) {
				@Pc(84) int local84 = arg2[local59];
				arg2[local59] = arg2[local43];
				arg2[local43] = local84;
				@Pc(98) Object local98 = arg3[local59];
				arg3[local59] = arg3[local43];
				arg3[local43++] = local98;
			}
		}
		arg2[arg1] = arg2[local43];
		arg2[local43] = local31;
		arg3[arg1] = arg3[local43];
		arg3[local43] = local47;
		method2226(arg0, local43 - 1, arg2, arg3);
		method2226(local43 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BII)Lclient!th;")
	public static Class1_Sub2_Sub18 method2227(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(23) Class1_Sub2_Sub18 local23 = (Class1_Sub2_Sub18) Static272.aClass70_20.method2075((long) arg1 << 32 | (long) arg0);
		if (local23 == null) {
			local23 = new Class1_Sub2_Sub18(arg1, arg0);
			Static272.aClass70_20.method2084(local23.aLong205, local23);
		}
		return local23;
	}
}
