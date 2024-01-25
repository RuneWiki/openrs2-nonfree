import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Lclient!sj;")
	public static Class37 aClass37_5;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "Lclient!tq;")
	public static Class191 aClass191_164;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "Z")
	public static boolean aBoolean459;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIILclient!bo;B)V")
	public static void method4600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub7 arg4) {
		if (arg4.anInt536 == -1 && arg4.anIntArray33 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (arg3 > arg4.anInt535) {
			local15 = arg3 - arg4.anInt535;
		} else if (arg4.anInt534 > arg3) {
			local15 = arg4.anInt534 - arg3;
		}
		@Pc(47) int local47 = arg4.anInt531 * Static303.anInt6082 >> 8;
		if (arg1 > arg4.anInt548) {
			local15 += arg1 - arg4.anInt548;
		} else if (arg4.anInt539 > arg1) {
			local15 += arg4.anInt539 - arg1;
		}
		if (arg4.anInt533 == 0 || arg4.anInt533 < local15 - 64 || Static303.anInt6082 == 0 || arg2 != arg4.anInt540) {
			if (arg4.aClass2_Sub3_Sub2_2 != null) {
				Static313.aClass2_Sub3_Sub1_2.method365(arg4.aClass2_Sub3_Sub2_2);
				arg4.aClass2_Sub3_Sub2_2 = null;
			}
			if (arg4.aClass2_Sub3_Sub2_1 != null) {
				Static313.aClass2_Sub3_Sub1_2.method365(arg4.aClass2_Sub3_Sub2_1);
				arg4.aClass2_Sub3_Sub2_1 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(143) int local143 = local47 * (arg4.anInt533 - local15) / arg4.anInt533;
		if (arg4.aClass2_Sub3_Sub2_2 != null) {
			arg4.aClass2_Sub3_Sub2_2.method1718(local143);
		} else if (arg4.anInt536 >= 0) {
			@Pc(159) Class134 local159 = Static367.method3758(aClass191_164, arg4.anInt536, 0);
			if (local159 != null) {
				@Pc(166) Class2_Sub12_Sub1 local166 = local159.method3760().method5838(Static351.aClass46_8);
				@Pc(171) Class2_Sub3_Sub2 local171 = Static360.method1696(local166, local143);
				local171.method1716(-1);
				Static313.aClass2_Sub3_Sub1_2.method367(local171);
				arg4.aClass2_Sub3_Sub2_2 = local171;
			}
		}
		if (arg4.aClass2_Sub3_Sub2_1 != null) {
			arg4.aClass2_Sub3_Sub2_1.method1718(local143);
			if (arg4.aClass2_Sub3_Sub2_1.method5949()) {
				return;
			}
			arg4.aClass2_Sub3_Sub2_1 = null;
		} else if (arg4.anIntArray33 != null && (arg4.anInt543 -= arg0) <= 0) {
			@Pc(211) int local211 = (int) (Math.random() * (double) arg4.anIntArray33.length);
			@Pc(219) Class134 local219 = Static367.method3758(aClass191_164, arg4.anIntArray33[local211], 0);
			if (local219 != null) {
				@Pc(226) Class2_Sub12_Sub1 local226 = local219.method3760().method5838(Static351.aClass46_8);
				@Pc(231) Class2_Sub3_Sub2 local231 = Static360.method1696(local226, local143);
				local231.method1716(0);
				Static313.aClass2_Sub3_Sub1_2.method367(local231);
				arg4.anInt543 = arg4.anInt542 + (int) (Math.random() * (double) (arg4.anInt545 - arg4.anInt542));
				arg4.aClass2_Sub3_Sub2_1 = local231;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)Z")
	public static boolean method4601() throws IOException {
		if (Static157.aClass173_1 == null) {
			return false;
		}
		@Pc(13) int local13 = Static157.aClass173_1.method5024();
		if (local13 == 0) {
			return false;
		}
		if (Static48.anInt1097 == -1) {
			Static157.aClass173_1.method5020(Static269.aClass2_Sub10_Sub1_3.aByteArray57, 0, 1);
			Static269.aClass2_Sub10_Sub1_3.anInt4807 = 0;
			Static48.anInt1097 = Static269.aClass2_Sub10_Sub1_3.method2048();
			Static71.anInt1574 = Static89.anIntArray202[Static48.anInt1097];
			local13--;
		}
		if (Static71.anInt1574 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static157.aClass173_1.method5020(Static269.aClass2_Sub10_Sub1_3.aByteArray57, 0, 1);
			Static71.anInt1574 = Static269.aClass2_Sub10_Sub1_3.aByteArray57[0] & 0xFF;
			local13--;
		}
		if (Static71.anInt1574 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static157.aClass173_1.method5020(Static269.aClass2_Sub10_Sub1_3.aByteArray57, 0, 2);
			Static269.aClass2_Sub10_Sub1_3.anInt4807 = 0;
			local13 -= 2;
			Static71.anInt1574 = Static269.aClass2_Sub10_Sub1_3.method4464();
		}
		if (Static71.anInt1574 > local13) {
			return false;
		}
		Static269.aClass2_Sub10_Sub1_3.anInt4807 = 0;
		Static157.aClass173_1.method5020(Static269.aClass2_Sub10_Sub1_3.aByteArray57, 0, Static71.anInt1574);
		Static236.anInt4527 = Static196.anInt3834;
		Static351.anInt5290 = 0;
		Static196.anInt3834 = Static8.anInt165;
		Static8.anInt165 = Static48.anInt1097;
		@Pc(155) int local155;
		@Pc(167) int local167;
		@Pc(175) int local175;
		@Pc(128) int local128;
		@Pc(139) int local139;
		@Pc(151) int local151;
		@Pc(145) int local145;
		@Pc(159) int local159;
		@Pc(163) int local163;
		if (Static48.anInt1097 == 11) {
			local128 = Static269.aClass2_Sub10_Sub1_3.method4432();
			if (local128 == 65535) {
				local128 = -1;
			}
			local139 = Static269.aClass2_Sub10_Sub1_3.method4416();
			local145 = local139 >> 28 & 0x3;
			local151 = local139 >> 14 & 0x3FFF;
			local155 = local139 & 0x3FFF;
			local159 = Static269.aClass2_Sub10_Sub1_3.method4422();
			local163 = local159 >> 2;
			local167 = local159 & 0x3;
			local151 -= Static138.anInt2879;
			local175 = Static166.anIntArray283[local163];
			local155 -= Static342.anInt6864;
			Static234.method4055(local167, local128, local151, local155, local175, local145, local163);
			Static48.anInt1097 = -1;
			return true;
		} else if (Static48.anInt1097 == 104) {
			local128 = Static269.aClass2_Sub10_Sub1_3.method4421();
			if (Static269.aClass2_Sub10_Sub1_3.method4421() == 0) {
				Static306.aClass95Array1[local128] = new Class95();
			} else {
				Static269.aClass2_Sub10_Sub1_3.anInt4807--;
				Static306.aClass95Array1[local128] = new Class95(Static269.aClass2_Sub10_Sub1_3);
			}
			Static77.anInt1706 = Static157.anInt3179;
			Static48.anInt1097 = -1;
			return true;
		} else if (Static48.anInt1097 == 103) {
			if (Static111.anInt2471 != -1) {
				Static103.method2286(0, Static111.anInt2471);
			}
			Static48.anInt1097 = -1;
			return true;
		} else if (Static48.anInt1097 == 83 || Static48.anInt1097 == 126 || Static48.anInt1097 == 31 || Static48.anInt1097 == 181 || Static48.anInt1097 == 15 || Static48.anInt1097 == 13 || Static48.anInt1097 == 143 || Static48.anInt1097 == 199 || Static48.anInt1097 == 155 || Static48.anInt1097 == 203 || Static48.anInt1097 == 81 || Static48.anInt1097 == 246 || Static48.anInt1097 == 102 || Static48.anInt1097 == 82 || Static48.anInt1097 == 38) {
			Static285.method5111();
			Static48.anInt1097 = -1;
			return true;
		} else {
			@Pc(347) Class2_Sub8 local347;
			if (Static48.anInt1097 == 180) {
				local128 = Static269.aClass2_Sub10_Sub1_3.method4427();
				local139 = Static269.aClass2_Sub10_Sub1_3.method4421();
				local145 = Static269.aClass2_Sub10_Sub1_3.method4464();
				local151 = Static269.aClass2_Sub10_Sub1_3.method4437();
				if (Static307.method5417(local145)) {
					local347 = (Class2_Sub8) Static273.aClass199_25.method5751((long) local128);
					if (local347 != null) {
						Static148.method2868(local347, local151 != local347.anInt694, false);
					}
					Static332.method3249(local139, false, local151, local128);
				}
				Static48.anInt1097 = -1;
				return true;
			} else if (Static48.anInt1097 == 101) {
				if (Static71.anInt1574 == 0) {
					Static7.aString1 = Static89.aClass93_33.method2819(Static21.anInt455);
				} else {
					Static7.aString1 = Static269.aClass2_Sub10_Sub1_3.method4409();
				}
				Static48.anInt1097 = -1;
				return true;
			} else if (Static48.anInt1097 == 53) {
				local128 = Static269.aClass2_Sub10_Sub1_3.method4437();
				local139 = Static269.aClass2_Sub10_Sub1_3.method4444();
				Static169.method3191(local128, local139);
				Static48.anInt1097 = -1;
				return true;
			} else if (Static48.anInt1097 == 220) {
				Static40.method945();
				Static48.anInt1097 = -1;
				return true;
			} else if (Static48.anInt1097 == 206) {
				for (local128 = 0; local128 < Static133.anIntArray238.length; local128++) {
					if (Static147.anIntArray22[local128] != Static133.anIntArray238[local128]) {
						Static133.anIntArray238[local128] = Static147.anIntArray22[local128];
						Static249.method4527(local128);
						Static221.anIntArray336[Static215.anInt4141++ & 0x1F] = local128;
					}
				}
				Static48.anInt1097 = -1;
				return true;
			} else if (Static48.anInt1097 == 217) {
				local128 = Static269.aClass2_Sub10_Sub1_3.method4432();
				if (local128 == 65535) {
					local128 = -1;
				}
				local139 = Static269.aClass2_Sub10_Sub1_3.method4421();
				Static19.method673(local128, local139);
				Static48.anInt1097 = -1;
				return true;
			} else if (Static48.anInt1097 == 163) {
				local128 = Static269.aClass2_Sub10_Sub1_3.method4414();
				local139 = Static269.aClass2_Sub10_Sub1_3.method4463();
				local145 = Static269.aClass2_Sub10_Sub1_3.method4437();
				if (local145 == 65535) {
					local145 = -1;
				}
				Static200.method5576(local128, local145, local139);
				Static48.anInt1097 = -1;
				return true;
			} else {
				@Pc(665) boolean local665;
				@Pc(700) int local700;
				if (Static48.anInt1097 == 100) {
					local128 = Static269.aClass2_Sub10_Sub1_3.method4449();
					local139 = Static269.aClass2_Sub10_Sub1_3.method4464();
					local145 = Static269.aClass2_Sub10_Sub1_3.method4437();
					local151 = Static269.aClass2_Sub10_Sub1_3.method4413();
					if (local128 >> 30 == 0) {
						@Pc(685) Class215 local685;
						@Pc(751) Class107 local751;
						@Pc(746) Class107 local746;
						@Pc(732) Class215 local732;
						@Pc(697) Class107 local697;
						if (local128 >> 29 != 0) {
							local155 = local128 & 0xFFFF;
							@Pc(654) Class62_Sub1_Sub2_Sub1 local654 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local155];
							if (local654 != null) {
								if (local145 == 65535) {
									local145 = -1;
								}
								local665 = true;
								if (local145 != -1 && local654.anInt5321 != -1) {
									if (local145 == local654.anInt5321) {
										local685 = Static44.method1076(local145);
										if (local685.aBoolean621 && local685.anInt6968 != -1) {
											local697 = Static212.method3773(local685.anInt6968);
											local700 = local697.anInt3273;
											if (local700 == 0 || local700 == 2) {
												local665 = false;
											} else if (local700 == 1) {
												local665 = true;
											}
										}
									} else {
										local685 = Static44.method1076(local145);
										local732 = Static44.method1076(local654.anInt5321);
										if (local685.anInt6968 != -1 && local732.anInt6968 != -1) {
											local746 = Static212.method3773(local685.anInt6968);
											local751 = Static212.method3773(local732.anInt6968);
											if (local746.anInt3287 < local751.anInt3287) {
												local665 = false;
											}
										}
									}
								}
								if (local665) {
									local654.anInt5307 = 1;
									local654.anInt5317 = 0;
									local654.anInt5321 = local145;
									local654.anInt5356 = 0;
									local654.anInt5357 = Static212.anInt4090 + local139;
									local654.anInt5316 = local151;
									if (local654.anInt5357 > Static212.anInt4090) {
										local654.anInt5356 = -1;
									}
									if (local654.anInt5321 != -1 && local654.anInt5357 == Static212.anInt4090) {
										local167 = Static44.method1076(local654.anInt5321).anInt6968;
										if (local167 != -1) {
											local697 = Static212.method3773(local167);
											if (local697 != null && local697.anIntArray280 != null) {
												Static343.method5928(false, local697, local654.anInt5289, 0, local654.anInt5280);
											}
										}
									}
								}
							}
						} else if (local128 >> 28 != 0) {
							local155 = local128 & 0xFFFF;
							@Pc(849) Class62_Sub1_Sub2_Sub2 local849;
							if (Static40.anInt797 == local155) {
								local849 = Static41.aClass62_Sub1_Sub2_Sub2_2;
							} else {
								local849 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local155];
							}
							if (local849 != null) {
								if (local145 == 65535) {
									local145 = -1;
								}
								local665 = true;
								if (local145 != -1 && local849.anInt5321 != -1) {
									if (local145 == local849.anInt5321) {
										local685 = Static44.method1076(local145);
										if (local685.aBoolean621 && local685.anInt6968 != -1) {
											local697 = Static212.method3773(local685.anInt6968);
											local700 = local697.anInt3273;
											if (local700 == 0 || local700 == 2) {
												local665 = false;
											} else if (local700 == 1) {
												local665 = true;
											}
										}
									} else {
										local685 = Static44.method1076(local145);
										local732 = Static44.method1076(local849.anInt5321);
										if (local685.anInt6968 != -1 && local732.anInt6968 != -1) {
											local746 = Static212.method3773(local685.anInt6968);
											local751 = Static212.method3773(local732.anInt6968);
											if (local746.anInt3287 < local751.anInt3287) {
												local665 = false;
											}
										}
									}
								}
								if (local665) {
									local849.anInt5356 = 0;
									local849.anInt5307 = 1;
									local849.anInt5357 = Static212.anInt4090 + local139;
									local849.anInt5317 = 0;
									local849.anInt5321 = local145;
									local849.anInt5316 = local151;
									if (local849.anInt5321 == 65535) {
										local849.anInt5321 = -1;
									}
									if (local849.anInt5357 > Static212.anInt4090) {
										local849.anInt5356 = -1;
									}
									if (local849.anInt5321 != -1 && local849.anInt5357 == Static212.anInt4090) {
										local167 = Static44.method1076(local849.anInt5321).anInt6968;
										if (local167 != -1) {
											local697 = Static212.method3773(local167);
											if (local697 != null && local697.anIntArray280 != null) {
												Static343.method5928(local849 == Static41.aClass62_Sub1_Sub2_Sub2_2, local697, local849.anInt5289, 0, local849.anInt5280);
											}
										}
									}
								}
							}
						}
					} else {
						local155 = local128 >> 28 & 0x3;
						local159 = (local128 >> 14 & 0x3FFF) - Static138.anInt2879;
						local163 = (local128 & 0x3FFF) - Static342.anInt6864;
						if (local159 >= 0 && local163 >= 0 && local159 < Static95.anInt6381 && local163 < Static237.anInt4532) {
							local167 = local159 * 128 + 64;
							local175 = local163 * 128 + 64;
							@Pc(633) Class62_Sub1_Sub4 local633 = new Class62_Sub1_Sub4(local145, 0, Static212.anInt4090, local155, local167, Static138.method2745(local155, local167, local175) - local151, local175, local159, local159, local163, local163);
							Static347.aClass216_36.method5995(new Class2_Sub11_Sub13(local633));
						}
					}
					Static48.anInt1097 = -1;
					return true;
				} else if (Static48.anInt1097 == 215) {
					local128 = Static269.aClass2_Sub10_Sub1_3.method4464();
					local139 = Static269.aClass2_Sub10_Sub1_3.method4414();
					local145 = Static269.aClass2_Sub10_Sub1_3.method4413();
					@Pc(1055) Class62_Sub1_Sub2_Sub1 local1055 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local128];
					if (local1055 != null) {
						Static103.method2285(local139, local1055, local145);
					}
					Static48.anInt1097 = -1;
					return true;
				} else if (Static48.anInt1097 == 112) {
					local128 = Static269.aClass2_Sub10_Sub1_3.method4421();
					local139 = Static269.aClass2_Sub10_Sub1_3.method4464();
					local145 = Static269.aClass2_Sub10_Sub1_3.method4464();
					if (Static307.method5417(local145)) {
						if (local128 == 2) {
							Static193.method3474();
						}
						Static111.anInt2471 = local139;
						Static15.method630(local139);
						Static121.method2514(false);
						Static72.method1645(Static111.anInt2471);
						for (local151 = 0; local151 < 100; local151++) {
							Static200.aBooleanArray29[local151] = true;
						}
					}
					Static48.anInt1097 = -1;
					return true;
				} else if (Static48.anInt1097 == 149) {
					local128 = Static269.aClass2_Sub10_Sub1_3.method4427();
					local139 = Static269.aClass2_Sub10_Sub1_3.method4413();
					local145 = Static269.aClass2_Sub10_Sub1_3.method4437();
					if (Static307.method5417(local139)) {
						Static303.method5322(local145, local128);
					}
					Static48.anInt1097 = -1;
					return true;
				} else if (Static48.anInt1097 == 33) {
					local128 = Static269.aClass2_Sub10_Sub1_3.method4432();
					local139 = Static269.aClass2_Sub10_Sub1_3.method4432();
					local145 = Static269.aClass2_Sub10_Sub1_3.method4437();
					local151 = Static269.aClass2_Sub10_Sub1_3.method4437();
					local155 = Static269.aClass2_Sub10_Sub1_3.method4449();
					if (Static307.method5417(local145)) {
						Static11.method420(local139, local128, local151, local155);
					}
					Static48.anInt1097 = -1;
					return true;
				} else if (Static48.anInt1097 == 99) {
					local128 = Static269.aClass2_Sub10_Sub1_3.method4437();
					local139 = Static269.aClass2_Sub10_Sub1_3.method4416();
					local145 = Static269.aClass2_Sub10_Sub1_3.method4432();
					if (local145 == 65535) {
						local145 = -1;
					}
					if (Static307.method5417(local128)) {
						Static214.method3805(2, -1, local145, local139);
					}
					Static48.anInt1097 = -1;
					return true;
				} else if (Static48.anInt1097 == 164) {
					local128 = Static269.aClass2_Sub10_Sub1_3.method4437();
					local139 = Static269.aClass2_Sub10_Sub1_3.method4464();
					if (local139 == 65535) {
						local139 = -1;
					}
					local145 = Static269.aClass2_Sub10_Sub1_3.method4449();
					if (Static307.method5417(local128)) {
						Static312.method5478(local139, local145);
					}
					Static48.anInt1097 = -1;
					return true;
				} else if (Static48.anInt1097 == 131) {
					@Pc(1267) byte local1267 = Static269.aClass2_Sub10_Sub1_3.method4420();
					local139 = Static269.aClass2_Sub10_Sub1_3.method4437();
					Static169.method3191(local139, local1267);
					Static48.anInt1097 = -1;
					return true;
				} else if (Static48.anInt1097 == 46) {
					local128 = Static269.aClass2_Sub10_Sub1_3.method4449();
					local139 = Static269.aClass2_Sub10_Sub1_3.method4421();
					local145 = Static269.aClass2_Sub10_Sub1_3.method4403();
					Static104.anIntArray407[local139] = local128;
					Static144.anIntArray246[local139] = local145;
					Static36.anIntArray43[local139] = 1;
					local151 = Static307.anIntArray457[local139] - 1;
					for (local155 = 0; local155 < local151; local155++) {
						if (Class5_Sub1_Sub1.anIntArray4[local155] <= local128) {
							Static36.anIntArray43[local139] = local155 + 2;
						}
					}
					Static41.anIntArray78[Static145.anInt6944++ & 0x1F] = local139;
					Static48.anInt1097 = -1;
					return true;
				} else {
					@Pc(1381) String local1381;
					if (Static48.anInt1097 == 69) {
						if (Static335.aFrame1 != null) {
							Static46.method1099(Static6.anInt150, false, -1, -1);
						}
						@Pc(1369) byte[] local1369 = new byte[Static71.anInt1574];
						Static269.aClass2_Sub10_Sub1_3.method2050(Static71.anInt1574, local1369);
						local1381 = Static161.method3040(Static71.anInt1574, 0, local1369);
						Static325.method5707(Static129.anInt2728 == 1, Static177.aClass168_2, true, local1381);
						Static48.anInt1097 = -1;
						return true;
					}
					@Pc(1422) boolean local1422;
					if (Static48.anInt1097 == 24) {
						local128 = Static269.aClass2_Sub10_Sub1_3.method4422();
						local139 = Static269.aClass2_Sub10_Sub1_3.method4437();
						local1422 = (local128 & 0x1) == 1;
						Static280.method5069(local1422, local139);
						Static157.anIntArray268[Static146.anInt3018++ & 0x1F] = local139;
						Static48.anInt1097 = -1;
						return true;
					} else if (Static48.anInt1097 == 26) {
						Static216.anInt4151 = Static269.aClass2_Sub10_Sub1_3.method4464() * 30;
						Static48.anInt1097 = -1;
						Static164.anInt3284 = Static157.anInt3179;
						return true;
					} else if (Static48.anInt1097 == 156) {
						Static321.method5613();
						Static48.anInt1097 = -1;
						Static215.anInt4141 += 32;
						return true;
					} else if (Static48.anInt1097 == 196) {
						local128 = Static269.aClass2_Sub10_Sub1_3.method4444();
						local139 = Static269.aClass2_Sub10_Sub1_3.method4464();
						local145 = Static269.aClass2_Sub10_Sub1_3.method4464();
						local151 = Static269.aClass2_Sub10_Sub1_3.method4432();
						local155 = Static269.aClass2_Sub10_Sub1_3.method4437();
						if (Static307.method5417(local155)) {
							Static214.method3805(7, local151, local145 << 16 | local139, local128);
						}
						Static48.anInt1097 = -1;
						return true;
					} else if (Static48.anInt1097 == 8) {
						local128 = Static269.aClass2_Sub10_Sub1_3.method4427();
						local139 = Static269.aClass2_Sub10_Sub1_3.method4437();
						Static202.method3644(local139, local128);
						Static48.anInt1097 = -1;
						return true;
					} else if (Static48.anInt1097 == 209) {
						Static38.method868();
						Static48.anInt1097 = -1;
						return false;
					} else {
						@Pc(1562) String local1562;
						@Pc(1586) String local1586;
						@Pc(1560) String local1560;
						if (Static48.anInt1097 == 226) {
							local128 = Static269.aClass2_Sub10_Sub1_3.method4441();
							local139 = Static269.aClass2_Sub10_Sub1_3.method4444();
							local145 = Static269.aClass2_Sub10_Sub1_3.method4421();
							local1560 = "";
							local1562 = local1560;
							if ((local145 & 0x1) != 0) {
								local1560 = Static269.aClass2_Sub10_Sub1_3.method4409();
								if ((local145 & 0x2) == 0) {
									local1562 = local1560;
								} else {
									local1562 = Static269.aClass2_Sub10_Sub1_3.method4409();
								}
							}
							local1586 = Static269.aClass2_Sub10_Sub1_3.method4409();
							if (local128 == 99) {
								Static261.method4670(local1586);
							} else if (local1562.equals("") || !Static312.method5481(local1562)) {
								Static66.method1501(local1586, local139, local128, local1560, local1562);
							} else {
								Static48.anInt1097 = -1;
								return true;
							}
							Static48.anInt1097 = -1;
							return true;
						} else if (Static48.anInt1097 == 141) {
							local128 = Static269.aClass2_Sub10_Sub1_3.method4427();
							Static215.aClass193_3 = Static177.aClass168_2.method4840(local128);
							Static48.anInt1097 = -1;
							return true;
						} else {
							@Pc(1646) String local1646;
							if (Static48.anInt1097 == 35) {
								local1646 = Static269.aClass2_Sub10_Sub1_3.method4409();
								local139 = Static269.aClass2_Sub10_Sub1_3.method4432();
								local145 = Static269.aClass2_Sub10_Sub1_3.method4464();
								if (Static307.method5417(local145)) {
									Static182.method3298(local139, local1646);
								}
								Static48.anInt1097 = -1;
								return true;
							} else if (Static48.anInt1097 == 225) {
								for (local128 = 0; local128 < Static129.aClass62_Sub1_Sub2_Sub2Array1.length; local128++) {
									if (Static129.aClass62_Sub1_Sub2_Sub2Array1[local128] != null) {
										Static129.aClass62_Sub1_Sub2_Sub2Array1[local128].anInt5322 = -1;
									}
								}
								for (local139 = 0; local139 < Static37.aClass62_Sub1_Sub2_Sub1Array1.length; local139++) {
									if (Static37.aClass62_Sub1_Sub2_Sub1Array1[local139] != null) {
										Static37.aClass62_Sub1_Sub2_Sub1Array1[local139].anInt5322 = -1;
									}
								}
								Static48.anInt1097 = -1;
								return true;
							} else if (Static48.anInt1097 == 61) {
								Static179.anInt3567 = Static269.aClass2_Sub10_Sub1_3.method4414();
								Static193.anInt3777 = Static269.aClass2_Sub10_Sub1_3.method4403();
								while (Static71.anInt1574 > Static269.aClass2_Sub10_Sub1_3.anInt4807) {
									Static48.anInt1097 = Static269.aClass2_Sub10_Sub1_3.method4421();
									Static285.method5111();
								}
								Static48.anInt1097 = -1;
								return true;
							} else if (Static48.anInt1097 == 77) {
								Static36.anInt684 = Static269.aClass2_Sub10_Sub1_3.method4421();
								Static164.anInt3284 = Static157.anInt3179;
								Static48.anInt1097 = -1;
								return true;
							} else {
								@Pc(1767) boolean local1767;
								@Pc(1773) String local1773;
								@Pc(1783) long local1783;
								@Pc(1788) long local1788;
								@Pc(1793) long local1793;
								@Pc(1869) String local1869;
								if (Static48.anInt1097 == 49) {
									local1767 = Static269.aClass2_Sub10_Sub1_3.method4421() == 1;
									local1381 = Static269.aClass2_Sub10_Sub1_3.method4409();
									local1773 = local1381;
									if (local1767) {
										local1773 = Static269.aClass2_Sub10_Sub1_3.method4409();
									}
									local1783 = Static269.aClass2_Sub10_Sub1_3.method4447();
									local1788 = Static269.aClass2_Sub10_Sub1_3.method4464();
									local1793 = Static269.aClass2_Sub10_Sub1_3.method4463();
									local700 = Static269.aClass2_Sub10_Sub1_3.method4421();
									@Pc(1803) long local1803 = (local1788 << 32) + local1793;
									@Pc(1805) boolean local1805 = false;
									@Pc(1807) int local1807 = 0;
									while (true) {
										if (local1807 >= 100) {
											if (local700 <= 1) {
												if (Static81.aBoolean157 && !Static97.aBoolean601 || Static297.aBoolean539) {
													local1805 = true;
												} else if (Static312.method5481(local1773)) {
													local1805 = true;
												}
											}
											break;
										}
										if (Static306.aLongArray5[local1807] == local1803) {
											local1805 = true;
											break;
										}
										local1807++;
									}
									if (!local1805 && Static8.anInt164 == 0) {
										Static306.aLongArray5[Static313.anInt6324] = local1803;
										Static313.anInt6324 = (Static313.anInt6324 + 1) % 100;
										local1869 = Static147.method416(Static26.method739(Static73.method3195(Static269.aClass2_Sub10_Sub1_3)));
										if (local700 == 2 || local700 == 3) {
											Static320.method5406(-1, "<img=1>" + local1773, "<img=1>" + local1381, 0, local1869, 9, Static101.method2255(local1783));
										} else if (local700 == 1) {
											Static320.method5406(-1, "<img=0>" + local1773, "<img=0>" + local1381, 0, local1869, 9, Static101.method2255(local1783));
										} else {
											Static320.method5406(-1, local1773, local1381, 0, local1869, 9, Static101.method2255(local1783));
										}
									}
									Static48.anInt1097 = -1;
									return true;
								} else if (Static48.anInt1097 == 36) {
									local128 = Static269.aClass2_Sub10_Sub1_3.method4464();
									if (local128 == 65535) {
										local128 = -1;
									}
									local139 = Static269.aClass2_Sub10_Sub1_3.method4421();
									local145 = Static269.aClass2_Sub10_Sub1_3.method4464();
									local151 = Static269.aClass2_Sub10_Sub1_3.method4421();
									Static76.method1678(local128, local151, local139, local145);
									Static48.anInt1097 = -1;
									return true;
								} else if (Static48.anInt1097 == 89) {
									local128 = Static269.aClass2_Sub10_Sub1_3.method4464();
									local139 = Static269.aClass2_Sub10_Sub1_3.method4432();
									local145 = Static269.aClass2_Sub10_Sub1_3.method4444();
									if (Static307.method5417(local139)) {
										Static203.method3128(local145, local128);
									}
									Static48.anInt1097 = -1;
									return true;
								} else if (Static48.anInt1097 == 59) {
									Static355.anInt6969 = Static269.aClass2_Sub10_Sub1_3.method4421();
									for (local128 = 0; local128 < Static355.anInt6969; local128++) {
										Static283.aStringArray51[local128] = Static269.aClass2_Sub10_Sub1_3.method4409();
										Static34.aStringArray2[local128] = Static269.aClass2_Sub10_Sub1_3.method4409();
										if (Static34.aStringArray2[local128].equals("")) {
											Static34.aStringArray2[local128] = Static283.aStringArray51[local128];
										}
										Static266.aStringArray48[local128] = Static269.aClass2_Sub10_Sub1_3.method4409();
										Static336.aStringArray62[local128] = Static269.aClass2_Sub10_Sub1_3.method4409();
										if (Static336.aStringArray62[local128].equals("")) {
											Static336.aStringArray62[local128] = Static266.aStringArray48[local128];
										}
										Static327.aBooleanArray31[local128] = false;
									}
									Static48.anInt1097 = -1;
									Static266.anInt5439 = Static157.anInt3179;
									return true;
								} else if (Static48.anInt1097 == 157) {
									local128 = Static269.aClass2_Sub10_Sub1_3.method4464();
									local139 = Static269.aClass2_Sub10_Sub1_3.method4421();
									local1422 = (local139 & 0x1) == 1;
									Static234.method4052(local1422, local128);
									local151 = Static269.aClass2_Sub10_Sub1_3.method4464();
									for (local155 = 0; local155 < local151; local155++) {
										local159 = Static269.aClass2_Sub10_Sub1_3.method4464();
										local163 = Static269.aClass2_Sub10_Sub1_3.method4414();
										if (local163 == 255) {
											local163 = Static269.aClass2_Sub10_Sub1_3.method4449();
										}
										Static266.method4812(local128, local1422, local159 - 1, local163, local155);
									}
									Static157.anIntArray268[Static146.anInt3018++ & 0x1F] = local128;
									Static48.anInt1097 = -1;
									return true;
								} else if (Static48.anInt1097 == 229) {
									local128 = Static269.aClass2_Sub10_Sub1_3.method4414();
									local139 = Static269.aClass2_Sub10_Sub1_3.method4437();
									Static202.method3644(local139, local128);
									Static48.anInt1097 = -1;
									return true;
								} else if (Static48.anInt1097 == 193) {
									local1646 = Static269.aClass2_Sub10_Sub1_3.method4409();
									local139 = Static269.aClass2_Sub10_Sub1_3.method4464();
									local1773 = Static10.method374(local139).method2126(Static269.aClass2_Sub10_Sub1_3);
									Static320.method5406(local139, local1646, local1646, 0, local1773, 19, null);
									Static48.anInt1097 = -1;
									return true;
								} else if (Static48.anInt1097 == 210) {
									local128 = Static269.aClass2_Sub10_Sub1_3.method4464();
									local139 = Static269.aClass2_Sub10_Sub1_3.method4464();
									local145 = Static269.aClass2_Sub10_Sub1_3.method4464();
									local151 = Static269.aClass2_Sub10_Sub1_3.method4464();
									if (Static307.method5417(local128) && Static265.aClass146ArrayArray41[local139] != null) {
										for (local155 = local145; local155 < local151; local155++) {
											local159 = Static269.aClass2_Sub10_Sub1_3.method4463();
											if (Static265.aClass146ArrayArray41[local139].length > local155 && Static265.aClass146ArrayArray41[local139][local155] != null) {
												Static265.aClass146ArrayArray41[local139][local155].anInt4445 = local159;
											}
										}
									}
									Static48.anInt1097 = -1;
									return true;
								} else if (Static48.anInt1097 == 2) {
									local128 = Static269.aClass2_Sub10_Sub1_3.method4444();
									local139 = Static269.aClass2_Sub10_Sub1_3.method4413();
									local145 = Static269.aClass2_Sub10_Sub1_3.method4413();
									if (Static307.method5417(local139)) {
										Static89.method2057(local128, local145);
									}
									Static48.anInt1097 = -1;
									return true;
								} else if (Static48.anInt1097 == 216) {
									local128 = Static269.aClass2_Sub10_Sub1_3.method4464();
									local139 = Static269.aClass2_Sub10_Sub1_3.method4414();
									local145 = Static269.aClass2_Sub10_Sub1_3.method4444();
									if (Static307.method5417(local128)) {
										Static78.method1808(local139, local145);
									}
									Static48.anInt1097 = -1;
									return true;
								} else if (Static48.anInt1097 == 40) {
									local128 = Static269.aClass2_Sub10_Sub1_3.method4413();
									local139 = Static269.aClass2_Sub10_Sub1_3.method4432();
									@Pc(2350) byte local2350 = Static269.aClass2_Sub10_Sub1_3.method4420();
									if (Static307.method5417(local128)) {
										Static203.method3128(local2350, local139);
									}
									Static48.anInt1097 = -1;
									return true;
								} else if (Static48.anInt1097 == 5) {
									local128 = Static269.aClass2_Sub10_Sub1_3.method4449();
									local139 = Static269.aClass2_Sub10_Sub1_3.method4432();
									local145 = Static269.aClass2_Sub10_Sub1_3.method4437();
									local151 = Static269.aClass2_Sub10_Sub1_3.method4437();
									if (Static307.method5417(local151)) {
										Static25.method1410((local139 << 16) + local145, local128);
									}
									Static48.anInt1097 = -1;
									return true;
								} else if (Static48.anInt1097 == 165) {
									Static179.anInt3567 = Static269.aClass2_Sub10_Sub1_3.method4414();
									Static193.anInt3777 = Static269.aClass2_Sub10_Sub1_3.method4414();
									for (@Pc(2416) Class2_Sub1 local2416 = (Class2_Sub1) Static136.aClass199_12.method5747(); local2416 != null; local2416 = (Class2_Sub1) Static136.aClass199_12.method5753()) {
										local139 = (int) (local2416.aLong213 & 0x3FFFL);
										local145 = (int) (local2416.aLong213 >> 14 & 0x3FFFL);
										local151 = (int) (local2416.aLong213 >> 28 & 0x3L);
										if (Static182.anInt3603 == local151 && local139 >= Static179.anInt3567 && Static179.anInt3567 + 8 > local139 && Static193.anInt3777 <= local145 && Static193.anInt3777 + 8 > local145) {
											local2416.method5945();
											Static304.method5349(local139, local145, Static182.anInt3603);
										}
									}
									for (@Pc(2491) Class2_Sub20 local2491 = (Class2_Sub20) Static147.aClass216_8.method5992(); local2491 != null; local2491 = (Class2_Sub20) Static147.aClass216_8.method6000()) {
										if (local2491.anInt2464 >= Static179.anInt3567 && Static179.anInt3567 + 8 > local2491.anInt2464 && Static193.anInt3777 <= local2491.anInt2468 && Static193.anInt3777 + 8 > local2491.anInt2468 && Static182.anInt3603 == local2491.anInt2461) {
											local2491.anInt2467 = 0;
										}
									}
									Static48.anInt1097 = -1;
									return true;
								} else if (Static48.anInt1097 == 110) {
									local128 = Static269.aClass2_Sub10_Sub1_3.method4464();
									local1381 = Static269.aClass2_Sub10_Sub1_3.method4409();
									@Pc(2556) Object[] local2556 = new Object[local1381.length() + 1];
									for (local151 = local1381.length() - 1; local151 >= 0; local151--) {
										if (local1381.charAt(local151) == 's') {
											local2556[local151 + 1] = Static269.aClass2_Sub10_Sub1_3.method4409();
										} else {
											local2556[local151 + 1] = Integer.valueOf(Static269.aClass2_Sub10_Sub1_3.method4444());
										}
									}
									local2556[0] = Integer.valueOf(Static269.aClass2_Sub10_Sub1_3.method4444());
									if (Static307.method5417(local128)) {
										@Pc(2614) Class2_Sub44 local2614 = new Class2_Sub44();
										local2614.anObjectArray35 = local2556;
										Static72.method1646(local2614);
									}
									Static48.anInt1097 = -1;
									return true;
								} else if (Static48.anInt1097 == 130) {
									local128 = Static269.aClass2_Sub10_Sub1_3.method4464();
									if (Static307.method5417(local128)) {
										Static27.method5764();
									}
									Static48.anInt1097 = -1;
									return true;
								} else if (Static48.anInt1097 == 58) {
									local128 = Static269.aClass2_Sub10_Sub1_3.method4464();
									local139 = Static269.aClass2_Sub10_Sub1_3.method4421();
									local1422 = (local139 & 0x1) == 1;
									while (Static269.aClass2_Sub10_Sub1_3.anInt4807 < Static71.anInt1574) {
										local151 = Static269.aClass2_Sub10_Sub1_3.method4441();
										local155 = Static269.aClass2_Sub10_Sub1_3.method4464();
										local159 = 0;
										if (local155 != 0) {
											local159 = Static269.aClass2_Sub10_Sub1_3.method4421();
											if (local159 == 255) {
												local159 = Static269.aClass2_Sub10_Sub1_3.method4444();
											}
										}
										Static266.method4812(local128, local1422, local155 - 1, local159, local151);
									}
									Static157.anIntArray268[Static146.anInt3018++ & 0x1F] = local128;
									Static48.anInt1097 = -1;
									return true;
								} else if (Static48.anInt1097 == 219) {
									Static269.aClass2_Sub10_Sub1_3.anInt4807 += 28;
									if (Static269.aClass2_Sub10_Sub1_3.method4439()) {
										Static321.method5615(Static269.aClass2_Sub10_Sub1_3.anInt4807 - 28, Static269.aClass2_Sub10_Sub1_3);
									}
									Static48.anInt1097 = -1;
									return true;
								} else if (Static48.anInt1097 == 214) {
									local1646 = Static269.aClass2_Sub10_Sub1_3.method4409();
									local139 = Static269.aClass2_Sub10_Sub1_3.method4416();
									local145 = Static269.aClass2_Sub10_Sub1_3.method4413();
									if (Static307.method5417(local145)) {
										Static49.method1189(local1646, local139);
									}
									Static48.anInt1097 = -1;
									return true;
								} else if (Static48.anInt1097 == 161) {
									local128 = Static269.aClass2_Sub10_Sub1_3.method4421();
									local139 = Static269.aClass2_Sub10_Sub1_3.method4421();
									if (local128 == 255) {
										local128 = -1;
										local139 = -1;
									}
									Static170.method2881(local128, local139);
									Static48.anInt1097 = -1;
									return true;
								} else if (Static48.anInt1097 == 178) {
									Static154.method5676();
									Static48.anInt1097 = -1;
									return true;
								} else {
									@Pc(2857) long local2857;
									@Pc(2879) Class2_Sub5 local2879;
									@Pc(2863) Class2_Sub5 local2863;
									if (Static48.anInt1097 == 92) {
										local128 = Static269.aClass2_Sub10_Sub1_3.method4437();
										if (local128 == 65535) {
											local128 = -1;
										}
										local139 = Static269.aClass2_Sub10_Sub1_3.method4432();
										local145 = Static269.aClass2_Sub10_Sub1_3.method4432();
										if (local145 == 65535) {
											local145 = -1;
										}
										local151 = Static269.aClass2_Sub10_Sub1_3.method4449();
										local155 = Static269.aClass2_Sub10_Sub1_3.method4432();
										if (Static307.method5417(local139)) {
											for (local159 = local145; local159 <= local128; local159++) {
												local2857 = (long) local159 + ((long) local151 << 32);
												local2863 = (Class2_Sub5) Static179.aClass199_18.method5751(local2857);
												if (local2863 != null) {
													local2879 = new Class2_Sub5(local2863.anInt478, local155);
													local2863.method5945();
												} else if (local159 == -1) {
													local2879 = new Class2_Sub5(Static1.method16(local151).aClass2_Sub5_2.anInt478, local155);
												} else {
													local2879 = new Class2_Sub5(0, local155);
												}
												Static179.aClass199_18.method5749(local2879, local2857);
											}
										}
										Static48.anInt1097 = -1;
										return true;
									} else if (Static48.anInt1097 == 172) {
										local128 = Static269.aClass2_Sub10_Sub1_3.method4413();
										local1381 = Static269.aClass2_Sub10_Sub1_3.method4409();
										local145 = Static269.aClass2_Sub10_Sub1_3.method4437();
										if (Static307.method5417(local128)) {
											Static182.method3298(local145, local1381);
										}
										Static48.anInt1097 = -1;
										return true;
									} else {
										@Pc(2994) Class11 local2994;
										if (Static48.anInt1097 == 85) {
											local1646 = Static269.aClass2_Sub10_Sub1_3.method4409();
											local1422 = Static269.aClass2_Sub10_Sub1_3.method4421() == 1;
											if (local1422) {
												local1381 = Static269.aClass2_Sub10_Sub1_3.method4409();
											} else {
												local1381 = local1646;
											}
											local151 = Static269.aClass2_Sub10_Sub1_3.method4464();
											@Pc(2977) byte local2977 = Static269.aClass2_Sub10_Sub1_3.method4436();
											@Pc(2979) boolean local2979 = false;
											if (local2977 == -128) {
												local2979 = true;
											}
											if (local2979) {
												if (Static151.anInt3097 == 0) {
													Static48.anInt1097 = -1;
													return true;
												}
												for (local163 = 0; Static151.anInt3097 > local163 && (!Static88.aClass11Array1[local163].aString3.equals(local1381) || local151 != Static88.aClass11Array1[local163].anInt298); local163++) {
												}
												if (Static151.anInt3097 > local163) {
													while (local163 < Static151.anInt3097 - 1) {
														Static88.aClass11Array1[local163] = Static88.aClass11Array1[local163 + 1];
														local163++;
													}
													Static151.anInt3097--;
													Static88.aClass11Array1[Static151.anInt3097] = null;
												}
											} else {
												@Pc(2990) String local2990 = Static269.aClass2_Sub10_Sub1_3.method4409();
												local2994 = new Class11();
												local2994.aString3 = local1381;
												local2994.aString4 = local1646;
												local2994.aString6 = Static335.method5804(local2994.aString3);
												local2994.aByte9 = local2977;
												local2994.aString5 = local2990;
												local2994.anInt298 = local151;
												for (local175 = Static151.anInt3097 - 1; local175 >= 0; local175--) {
													local700 = Static88.aClass11Array1[local175].aString6.compareTo(local2994.aString6);
													if (local700 == 0) {
														Static88.aClass11Array1[local175].anInt298 = local151;
														Static88.aClass11Array1[local175].aByte9 = local2977;
														Static88.aClass11Array1[local175].aString5 = local2990;
														if (local1381.equals(Static41.aClass62_Sub1_Sub2_Sub2_2.aString48)) {
															Static107.aByte23 = local2977;
														}
														Static48.anInt1097 = -1;
														Static214.anInt4132 = Static157.anInt3179;
														return true;
													}
													if (local700 < 0) {
														break;
													}
												}
												if (Static151.anInt3097 >= Static88.aClass11Array1.length) {
													Static48.anInt1097 = -1;
													return true;
												}
												for (local700 = Static151.anInt3097 - 1; local700 > local175; local700--) {
													Static88.aClass11Array1[local700 + 1] = Static88.aClass11Array1[local700];
												}
												if (Static151.anInt3097 == 0) {
													Static88.aClass11Array1 = new Class11[100];
												}
												Static88.aClass11Array1[local175 + 1] = local2994;
												Static151.anInt3097++;
												if (local1381.equals(Static41.aClass62_Sub1_Sub2_Sub2_2.aString48)) {
													Static107.aByte23 = local2977;
												}
											}
											Static48.anInt1097 = -1;
											Static214.anInt4132 = Static157.anInt3179;
											return true;
										} else if (Static48.anInt1097 == 67) {
											local128 = Static269.aClass2_Sub10_Sub1_3.method4464();
											local139 = Static269.aClass2_Sub10_Sub1_3.method4444();
											if (Static307.method5417(local128)) {
												@Pc(3223) Class2_Sub8 local3223 = (Class2_Sub8) Static273.aClass199_25.method5751((long) local139);
												if (local3223 != null) {
													Static148.method2868(local3223, true, false);
												}
												if (Static27.aClass146_16 != null) {
													Static152.method2932(Static27.aClass146_16);
													Static27.aClass146_16 = null;
												}
											}
											Static48.anInt1097 = -1;
											return true;
										} else if (Static48.anInt1097 == 169) {
											Static214.anInt4132 = Static157.anInt3179;
											if (Static71.anInt1574 == 0) {
												Static48.anInt1097 = -1;
												Static88.aClass11Array1 = null;
												Static42.aString11 = null;
												Static151.anInt3097 = 0;
												Static221.aString35 = null;
												return true;
											}
											Static42.aString11 = Static269.aClass2_Sub10_Sub1_3.method4409();
											local1767 = Static269.aClass2_Sub10_Sub1_3.method4421() == 1;
											if (local1767) {
												Static269.aClass2_Sub10_Sub1_3.method4409();
											}
											@Pc(3285) long local3285 = Static269.aClass2_Sub10_Sub1_3.method4447();
											Static221.aString35 = Static330.method5776(local3285);
											Static216.aByte34 = Static269.aClass2_Sub10_Sub1_3.method4436();
											local151 = Static269.aClass2_Sub10_Sub1_3.method4421();
											if (local151 == 255) {
												Static48.anInt1097 = -1;
												return true;
											}
											Static151.anInt3097 = local151;
											@Pc(3309) Class11[] local3309 = new Class11[100];
											for (local159 = 0; local159 < Static151.anInt3097; local159++) {
												local3309[local159] = new Class11();
												local3309[local159].aString4 = Static269.aClass2_Sub10_Sub1_3.method4409();
												local1767 = Static269.aClass2_Sub10_Sub1_3.method4421() == 1;
												if (local1767) {
													local3309[local159].aString3 = Static269.aClass2_Sub10_Sub1_3.method4409();
												} else {
													local3309[local159].aString3 = local3309[local159].aString4;
												}
												local3309[local159].aString6 = Static335.method5804(local3309[local159].aString3);
												local3309[local159].anInt298 = Static269.aClass2_Sub10_Sub1_3.method4464();
												local3309[local159].aByte9 = Static269.aClass2_Sub10_Sub1_3.method4436();
												local3309[local159].aString5 = Static269.aClass2_Sub10_Sub1_3.method4409();
												if (local3309[local159].aString3.equals(Static41.aClass62_Sub1_Sub2_Sub2_2.aString48)) {
													Static107.aByte23 = local3309[local159].aByte9;
												}
											}
											local175 = Static151.anInt3097;
											while (local175 > 0) {
												local175--;
												local665 = true;
												for (local700 = 0; local700 < local175; local700++) {
													if (local3309[local700].aString6.compareTo(local3309[local700 + 1].aString6) > 0) {
														local2994 = local3309[local700];
														local3309[local700] = local3309[local700 + 1];
														local665 = false;
														local3309[local700 + 1] = local2994;
													}
												}
												if (local665) {
													break;
												}
											}
											Static88.aClass11Array1 = local3309;
											Static48.anInt1097 = -1;
											return true;
										} else if (Static48.anInt1097 == 191) {
											Static5.anInt4680 = Static269.aClass2_Sub10_Sub1_3.method4421();
											Static128.anInt2716 = Static269.aClass2_Sub10_Sub1_3.method4421();
											Static249.anInt4901 = Static269.aClass2_Sub10_Sub1_3.method4421();
											Static48.anInt1097 = -1;
											return true;
										} else if (Static48.anInt1097 == 136) {
											Static260.anInt5271 = Static269.aClass2_Sub10_Sub1_3.method4421();
											Static48.anInt1097 = -1;
											return true;
										} else if (Static48.anInt1097 == 134) {
											Static238.method4110(Static269.aClass2_Sub10_Sub1_3.method4409());
											Static48.anInt1097 = -1;
											return true;
										} else if (Static48.anInt1097 == 4) {
											local128 = Static269.aClass2_Sub10_Sub1_3.method4416();
											local139 = Static269.aClass2_Sub10_Sub1_3.method4464();
											if (Static307.method5417(local139)) {
												Static214.method3805(5, 0, 2047, local128);
											}
											Static48.anInt1097 = -1;
											return true;
										} else if (Static48.anInt1097 == 84) {
											local128 = Static269.aClass2_Sub10_Sub1_3.method4437();
											local139 = Static269.aClass2_Sub10_Sub1_3.method4444();
											local145 = Static269.aClass2_Sub10_Sub1_3.method4464();
											if (local145 == 65535) {
												local145 = -1;
											}
											if (Static307.method5417(local128)) {
												Static214.method3805(1, -1, local145, local139);
											}
											Static48.anInt1097 = -1;
											return true;
										} else {
											@Pc(3789) int local3789;
											@Pc(3846) String local3846;
											@Pc(3828) int local3828;
											@Pc(3882) String local3882;
											if (Static48.anInt1097 == 207) {
												local1767 = Static269.aClass2_Sub10_Sub1_3.method4421() == 1;
												local1381 = Static269.aClass2_Sub10_Sub1_3.method4409();
												local1773 = Static269.aClass2_Sub10_Sub1_3.method4409();
												local151 = Static269.aClass2_Sub10_Sub1_3.method4464();
												local155 = Static269.aClass2_Sub10_Sub1_3.method4421();
												local1586 = "";
												local665 = false;
												if (local151 > 0) {
													local1586 = Static269.aClass2_Sub10_Sub1_3.method4409();
													local665 = Static269.aClass2_Sub10_Sub1_3.method4421() == 1;
												}
												for (local167 = 0; local167 < Static296.anInt6002; local167++) {
													if (local1767) {
														if (local1773.equals(Static287.aStringArray53[local167])) {
															Static287.aStringArray53[local167] = local1381;
															Static110.aStringArray15[local167] = local1773;
															local1381 = null;
															break;
														}
													} else if (local1381.equals(Static287.aStringArray53[local167])) {
														if (Static226.anIntArray275[local167] != local151) {
															Static226.anIntArray275[local167] = local151;
															if (local151 > 0) {
																Static66.method1501(local1381 + Static103.aClass93_45.method2819(Static21.anInt455), 0, 5, "", "");
															}
															if (local151 == 0) {
																Static66.method1501(local1381 + Static289.aClass93_105.method2819(Static21.anInt455), 0, 5, "", "");
															}
														}
														Static110.aStringArray15[local167] = local1773;
														Static83.aStringArray11[local167] = local1586;
														Static308.anIntArray385[local167] = local155;
														local1381 = null;
														Static227.aBooleanArray20[local167] = local665;
														break;
													}
												}
												if (local1381 != null && Static296.anInt6002 < 200) {
													Static287.aStringArray53[Static296.anInt6002] = local1381;
													Static110.aStringArray15[Static296.anInt6002] = local1773;
													Static226.anIntArray275[Static296.anInt6002] = local151;
													Static83.aStringArray11[Static296.anInt6002] = local1586;
													Static308.anIntArray385[Static296.anInt6002] = local155;
													Static227.aBooleanArray20[Static296.anInt6002] = local665;
													Static296.anInt6002++;
												}
												Static266.anInt5439 = Static157.anInt3179;
												local700 = Static296.anInt6002;
												while (local700 > 0) {
													@Pc(3786) boolean local3786 = true;
													local700--;
													for (local3789 = 0; local3789 < local700; local3789++) {
														if (Static226.anIntArray275[local3789] != Static261.anInt5114 && Static226.anIntArray275[local3789 + 1] == Static261.anInt5114 || Static226.anIntArray275[local3789] == 0 && Static226.anIntArray275[local3789 + 1] != 0) {
															local3828 = Static226.anIntArray275[local3789];
															Static226.anIntArray275[local3789] = Static226.anIntArray275[local3789 + 1];
															Static226.anIntArray275[local3789 + 1] = local3828;
															local3846 = Static83.aStringArray11[local3789];
															Static83.aStringArray11[local3789] = Static83.aStringArray11[local3789 + 1];
															Static83.aStringArray11[local3789 + 1] = local3846;
															local1869 = Static287.aStringArray53[local3789];
															Static287.aStringArray53[local3789] = Static287.aStringArray53[local3789 + 1];
															Static287.aStringArray53[local3789 + 1] = local1869;
															local3882 = Static110.aStringArray15[local3789];
															Static110.aStringArray15[local3789] = Static110.aStringArray15[local3789 + 1];
															Static110.aStringArray15[local3789 + 1] = local3882;
															@Pc(3900) int local3900 = Static308.anIntArray385[local3789];
															Static308.anIntArray385[local3789] = Static308.anIntArray385[local3789 + 1];
															Static308.anIntArray385[local3789 + 1] = local3900;
															@Pc(3918) boolean local3918 = Static227.aBooleanArray20[local3789];
															Static227.aBooleanArray20[local3789] = Static227.aBooleanArray20[local3789 + 1];
															local3786 = false;
															Static227.aBooleanArray20[local3789 + 1] = local3918;
														}
													}
													if (local3786) {
														break;
													}
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 62) {
												local128 = Static269.aClass2_Sub10_Sub1_3.method4421();
												@Pc(3968) boolean local3968 = (local128 & 0x1) == 1;
												local1773 = Static269.aClass2_Sub10_Sub1_3.method4409();
												local1560 = Static269.aClass2_Sub10_Sub1_3.method4409();
												if (local1560.equals("")) {
													local1560 = local1773;
												}
												local1562 = Static269.aClass2_Sub10_Sub1_3.method4409();
												local1586 = Static269.aClass2_Sub10_Sub1_3.method4409();
												if (local1586.equals("")) {
													local1586 = local1562;
												}
												if (local3968) {
													for (local163 = 0; local163 < Static355.anInt6969; local163++) {
														if (Static34.aStringArray2[local163].equals(local1586)) {
															Static283.aStringArray51[local163] = local1773;
															Static34.aStringArray2[local163] = local1560;
															Static266.aStringArray48[local163] = local1562;
															Static336.aStringArray62[local163] = local1586;
															break;
														}
													}
												} else {
													Static283.aStringArray51[Static355.anInt6969] = local1773;
													Static34.aStringArray2[Static355.anInt6969] = local1560;
													Static266.aStringArray48[Static355.anInt6969] = local1562;
													Static336.aStringArray62[Static355.anInt6969] = local1586;
													Static327.aBooleanArray31[Static355.anInt6969] = (local128 & 0x2) == 2;
													Static355.anInt6969++;
												}
												Static266.anInt5439 = Static157.anInt3179;
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 152) {
												local128 = Static269.aClass2_Sub10_Sub1_3.method4421();
												local139 = local128 >> 5;
												local145 = local128 & 0x1F;
												if (local145 == 0) {
													Static264.aClass189Array1[local139] = null;
													Static48.anInt1097 = -1;
													return true;
												}
												@Pc(4103) Class189 local4103 = new Class189();
												local4103.anInt6225 = local145;
												local4103.anInt6215 = Static269.aClass2_Sub10_Sub1_3.method4421();
												if (local4103.anInt6215 >= 0 && Static170.aClass31Array11.length > local4103.anInt6215) {
													if (local4103.anInt6225 == 1 || local4103.anInt6225 == 10) {
														local4103.anInt6219 = Static269.aClass2_Sub10_Sub1_3.method4464();
														Static269.aClass2_Sub10_Sub1_3.anInt4807 += 5;
													} else if (local4103.anInt6225 >= 2 && local4103.anInt6225 <= 6) {
														if (local4103.anInt6225 == 2) {
															local4103.anInt6216 = 64;
															local4103.anInt6213 = 64;
														}
														if (local4103.anInt6225 == 3) {
															local4103.anInt6213 = 0;
															local4103.anInt6216 = 64;
														}
														if (local4103.anInt6225 == 4) {
															local4103.anInt6216 = 64;
															local4103.anInt6213 = 128;
														}
														if (local4103.anInt6225 == 5) {
															local4103.anInt6213 = 64;
															local4103.anInt6216 = 0;
														}
														if (local4103.anInt6225 == 6) {
															local4103.anInt6216 = 128;
															local4103.anInt6213 = 64;
														}
														local4103.anInt6225 = 2;
														local4103.anInt6222 = Static269.aClass2_Sub10_Sub1_3.method4464();
														local4103.anInt6227 = Static269.aClass2_Sub10_Sub1_3.method4464();
														local4103.anInt6221 = Static269.aClass2_Sub10_Sub1_3.method4421();
														local4103.anInt6220 = Static269.aClass2_Sub10_Sub1_3.method4464();
													}
													local4103.anInt6224 = Static269.aClass2_Sub10_Sub1_3.method4464();
													if (local4103.anInt6224 == 65535) {
														local4103.anInt6224 = -1;
													}
													Static264.aClass189Array1[local139] = local4103;
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 202) {
												local1767 = Static269.aClass2_Sub10_Sub1_3.method4421() == 1;
												local1381 = Static269.aClass2_Sub10_Sub1_3.method4409();
												local1773 = local1381;
												if (local1767) {
													local1773 = Static269.aClass2_Sub10_Sub1_3.method4409();
												}
												local1783 = Static269.aClass2_Sub10_Sub1_3.method4464();
												local1788 = Static269.aClass2_Sub10_Sub1_3.method4463();
												local167 = Static269.aClass2_Sub10_Sub1_3.method4421();
												@Pc(4301) long local4301 = (local1783 << 32) + local1788;
												@Pc(4303) boolean local4303 = false;
												local3828 = 0;
												while (true) {
													if (local3828 >= 100) {
														if (local167 <= 1) {
															if (Static81.aBoolean157 && !Static97.aBoolean601 || Static297.aBoolean539) {
																local4303 = true;
															} else if (Static312.method5481(local1773)) {
																local4303 = true;
															}
														}
														break;
													}
													if (local4301 == Static306.aLongArray5[local3828]) {
														local4303 = true;
														break;
													}
													local3828++;
												}
												if (!local4303 && Static8.anInt164 == 0) {
													Static306.aLongArray5[Static313.anInt6324] = local4301;
													Static313.anInt6324 = (Static313.anInt6324 + 1) % 100;
													@Pc(4366) String local4366 = Static147.method416(Static26.method739(Static73.method3195(Static269.aClass2_Sub10_Sub1_3)));
													if (local167 == 2) {
														Static320.method5406(-1, "<img=1>" + local1773, "<img=1>" + local1381, 0, local4366, 7, null);
													} else if (local167 == 1) {
														Static320.method5406(-1, "<img=0>" + local1773, "<img=0>" + local1381, 0, local4366, 7, null);
													} else {
														Static320.method5406(-1, local1773, local1381, 0, local4366, 3, null);
													}
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 12) {
												local128 = Static269.aClass2_Sub10_Sub1_3.method4437();
												local139 = Static269.aClass2_Sub10_Sub1_3.method4403();
												if (Static307.method5417(local128)) {
													Static333.anInt6676 = local139;
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 249) {
												Static112.anInt2503 = Static269.aClass2_Sub10_Sub1_3.method4421();
												Static266.anInt5439 = Static157.anInt3179;
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 168) {
												local128 = Static269.aClass2_Sub10_Sub1_3.method4464();
												if (Static307.method5417(local128)) {
													Static60.method1380();
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 117) {
												local1767 = Static269.aClass2_Sub10_Sub1_3.method4421() == 1;
												local1381 = Static269.aClass2_Sub10_Sub1_3.method4409();
												local1773 = local1381;
												if (local1767) {
													local1773 = Static269.aClass2_Sub10_Sub1_3.method4409();
												}
												local1783 = Static269.aClass2_Sub10_Sub1_3.method4447();
												local1788 = Static269.aClass2_Sub10_Sub1_3.method4464();
												local1793 = Static269.aClass2_Sub10_Sub1_3.method4463();
												local700 = Static269.aClass2_Sub10_Sub1_3.method4421();
												local3789 = Static269.aClass2_Sub10_Sub1_3.method4464();
												@Pc(4544) long local4544 = local1793 + (local1788 << 32);
												@Pc(4546) boolean local4546 = false;
												@Pc(4548) int local4548 = 0;
												while (true) {
													if (local4548 >= 100) {
														if (local700 <= 1 && Static312.method5481(local1773)) {
															local4546 = true;
														}
														break;
													}
													if (Static306.aLongArray5[local4548] == local4544) {
														local4546 = true;
														break;
													}
													local4548++;
												}
												if (!local4546 && Static8.anInt164 == 0) {
													Static306.aLongArray5[Static313.anInt6324] = local4544;
													Static313.anInt6324 = (Static313.anInt6324 + 1) % 100;
													local3882 = Static10.method374(local3789).method2126(Static269.aClass2_Sub10_Sub1_3);
													if (local700 == 2) {
														Static320.method5406(local3789, "<img=1>" + local1773, "<img=1>" + local1381, 0, local3882, 20, Static101.method2255(local1783));
													} else if (local700 == 1) {
														Static320.method5406(local3789, "<img=0>" + local1773, "<img=0>" + local1381, 0, local3882, 20, Static101.method2255(local1783));
													} else {
														Static320.method5406(local3789, local1773, local1381, 0, local3882, 20, Static101.method2255(local1783));
													}
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 194) {
												Static114.method5710(false);
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 48) {
												local128 = Static269.aClass2_Sub10_Sub1_3.method4413();
												local139 = Static269.aClass2_Sub10_Sub1_3.method4416();
												local145 = Static269.aClass2_Sub10_Sub1_3.method4413();
												if (Static307.method5417(local145)) {
													Static261.method4667(local128, local139);
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 183) {
												local128 = Static269.aClass2_Sub10_Sub1_3.method4464();
												local139 = Static269.aClass2_Sub10_Sub1_3.method4421();
												local145 = Static269.aClass2_Sub10_Sub1_3.method4421();
												local151 = Static269.aClass2_Sub10_Sub1_3.method4464();
												local155 = Static269.aClass2_Sub10_Sub1_3.method4421();
												local159 = Static269.aClass2_Sub10_Sub1_3.method4421();
												if (Static307.method5417(local128)) {
													Static227.method3969(local145, local155, local151, local159, local139);
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 30) {
												local128 = Static269.aClass2_Sub10_Sub1_3.method4427();
												local139 = Static269.aClass2_Sub10_Sub1_3.method4444();
												local145 = Static269.aClass2_Sub10_Sub1_3.method4437();
												local151 = Static269.aClass2_Sub10_Sub1_3.method4437();
												if (Static307.method5417(local145)) {
													Static214.method3805(5, local128, local151, local139);
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 42) {
												local128 = Static269.aClass2_Sub10_Sub1_3.method4413();
												local139 = Static269.aClass2_Sub10_Sub1_3.method4464();
												local145 = Static269.aClass2_Sub10_Sub1_3.method4464();
												if (Static307.method5417(local139)) {
													Static305.method5358(local145, local128);
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 253) {
												local128 = Static269.aClass2_Sub10_Sub1_3.method4433();
												local139 = Static269.aClass2_Sub10_Sub1_3.method4416();
												local145 = Static269.aClass2_Sub10_Sub1_3.method4432();
												if (Static307.method5417(local145)) {
													Static177.method3263(local139, local128);
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 140) {
												Static114.method5710(true);
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 197) {
												Static272.anInt5535 = Static269.aClass2_Sub10_Sub1_3.method4460();
												Static48.anInt1097 = -1;
												Static164.anInt3284 = Static157.anInt3179;
												return true;
											} else if (Static48.anInt1097 == 107) {
												local128 = Static269.aClass2_Sub10_Sub1_3.method4464();
												local139 = Static269.aClass2_Sub10_Sub1_3.method4421();
												local145 = Static269.aClass2_Sub10_Sub1_3.method4421();
												local151 = Static269.aClass2_Sub10_Sub1_3.method4421();
												local155 = Static269.aClass2_Sub10_Sub1_3.method4421();
												local159 = Static269.aClass2_Sub10_Sub1_3.method4464();
												if (Static307.method5417(local128)) {
													Static171.aBooleanArray16[local139] = true;
													Static73.anIntArray290[local139] = local145;
													Static6.anIntArray5[local139] = local151;
													Static267.anIntArray402[local139] = local155;
													Static154.anIntArray477[local139] = local159;
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 78) {
												Static193.anInt3777 = Static269.aClass2_Sub10_Sub1_3.method4422();
												Static179.anInt3567 = Static269.aClass2_Sub10_Sub1_3.method4421();
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 113) {
												local128 = Static269.aClass2_Sub10_Sub1_3.method4449();
												local139 = Static269.aClass2_Sub10_Sub1_3.method4416();
												local145 = Static269.aClass2_Sub10_Sub1_3.method4432();
												if (Static307.method5417(local145)) {
													@Pc(4976) Class2_Sub8 local4976 = (Class2_Sub8) Static273.aClass199_25.method5751((long) local128);
													local347 = (Class2_Sub8) Static273.aClass199_25.method5751((long) local139);
													if (local347 != null) {
														Static148.method2868(local347, local4976 == null || local347.anInt694 != local4976.anInt694, false);
													}
													if (local4976 != null) {
														local4976.method5945();
														Static273.aClass199_25.method5749(local4976, (long) local139);
													}
													@Pc(5018) Class146 local5018 = Static1.method16(local128);
													if (local5018 != null) {
														Static152.method2932(local5018);
													}
													local5018 = Static1.method16(local139);
													if (local5018 != null) {
														Static152.method2932(local5018);
														Static41.method968(true, local5018);
													}
													if (Static111.anInt2471 != -1) {
														Static103.method2286(1, Static111.anInt2471);
													}
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 23) {
												local128 = Static269.aClass2_Sub10_Sub1_3.method4413();
												if (local128 == 65535) {
													local128 = -1;
												}
												local139 = Static269.aClass2_Sub10_Sub1_3.method4427();
												local145 = Static269.aClass2_Sub10_Sub1_3.method4437();
												local151 = Static269.aClass2_Sub10_Sub1_3.method4444();
												local155 = Static269.aClass2_Sub10_Sub1_3.method4464();
												if (local155 == 65535) {
													local155 = -1;
												}
												if (Static307.method5417(local145)) {
													for (local159 = local128; local159 <= local155; local159++) {
														local2857 = ((long) local139 << 32) + (long) local159;
														local2863 = (Class2_Sub5) Static179.aClass199_18.method5751(local2857);
														if (local2863 != null) {
															local2879 = new Class2_Sub5(local151, local2863.anInt475);
															local2863.method5945();
														} else if (local159 == -1) {
															local2879 = new Class2_Sub5(local151, Static1.method16(local139).aClass2_Sub5_2.anInt475);
														} else {
															local2879 = new Class2_Sub5(local151, -1);
														}
														Static179.aClass199_18.method5749(local2879, local2857);
													}
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 55) {
												local128 = Static269.aClass2_Sub10_Sub1_3.method4422();
												local1381 = Static269.aClass2_Sub10_Sub1_3.method4409();
												local145 = Static269.aClass2_Sub10_Sub1_3.method4421();
												local151 = Static269.aClass2_Sub10_Sub1_3.method4437();
												if (local151 == 65535) {
													local151 = -1;
												}
												if (local145 >= 1 && local145 <= 8) {
													if (local1381.equalsIgnoreCase("null")) {
														local1381 = null;
													}
													Static170.aStringArray26[local145 - 1] = local1381;
													Static32.anIntArray41[local145 - 1] = local151;
													Static86.aBooleanArray9[local145 - 1] = local128 == 0;
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 198) {
												local1767 = Static269.aClass2_Sub10_Sub1_3.method4421() == 1;
												local1381 = Static269.aClass2_Sub10_Sub1_3.method4409();
												local1773 = local1381;
												if (local1767) {
													local1773 = Static269.aClass2_Sub10_Sub1_3.method4409();
												}
												local1783 = Static269.aClass2_Sub10_Sub1_3.method4464();
												local1788 = Static269.aClass2_Sub10_Sub1_3.method4463();
												local167 = Static269.aClass2_Sub10_Sub1_3.method4421();
												local175 = Static269.aClass2_Sub10_Sub1_3.method4464();
												@Pc(5270) long local5270 = (local1783 << 32) + local1788;
												@Pc(5272) boolean local5272 = false;
												@Pc(5274) int local5274 = 0;
												while (true) {
													if (local5274 >= 100) {
														if (local167 <= 1 && Static312.method5481(local1773)) {
															local5272 = true;
														}
														break;
													}
													if (Static306.aLongArray5[local5274] == local5270) {
														local5272 = true;
														break;
													}
													local5274++;
												}
												if (!local5272 && Static8.anInt164 == 0) {
													Static306.aLongArray5[Static313.anInt6324] = local5270;
													Static313.anInt6324 = (Static313.anInt6324 + 1) % 100;
													local3846 = Static10.method374(local175).method2126(Static269.aClass2_Sub10_Sub1_3);
													if (local167 == 2) {
														Static320.method5406(local175, "<img=1>" + local1773, "<img=1>" + local1381, 0, local3846, 18, null);
													} else if (local167 == 1) {
														Static320.method5406(local175, "<img=0>" + local1773, "<img=0>" + local1381, 0, local3846, 18, null);
													} else {
														Static320.method5406(local175, local1773, local1381, 0, local3846, 18, null);
													}
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 73) {
												local1646 = Static269.aClass2_Sub10_Sub1_3.method4409();
												local1381 = Static147.method416(Static26.method739(Static73.method3195(Static269.aClass2_Sub10_Sub1_3)));
												Static66.method1501(local1381, 0, 6, local1646, local1646);
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 151) {
												local128 = Static269.aClass2_Sub10_Sub1_3.method4444();
												local139 = Static269.aClass2_Sub10_Sub1_3.method4413();
												local145 = Static269.aClass2_Sub10_Sub1_3.method4444();
												local151 = Static269.aClass2_Sub10_Sub1_3.method4464();
												if (local151 == 65535) {
													local151 = -1;
												}
												if (Static307.method5417(local139)) {
													Static350.method5848(local145, local128, local151);
													@Pc(5454) Class208 local5454 = Static282.method5080(local151);
													Static11.method420(local5454.anInt6799, local5454.anInt6770, local5454.anInt6769, local128);
													Static165.method3080(local128, local5454.anInt6796, local5454.anInt6755, local5454.anInt6795);
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 147) {
												local128 = Static269.aClass2_Sub10_Sub1_3.method4437();
												local139 = Static269.aClass2_Sub10_Sub1_3.method4427();
												local145 = Static269.aClass2_Sub10_Sub1_3.method4460();
												local151 = Static269.aClass2_Sub10_Sub1_3.method4460();
												if (Static307.method5417(local128)) {
													Static77.method1768(local139, local145, local151);
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 144) {
												local128 = Static269.aClass2_Sub10_Sub1_3.method4464();
												local139 = Static269.aClass2_Sub10_Sub1_3.method4421();
												local145 = Static269.aClass2_Sub10_Sub1_3.method4421();
												local151 = Static269.aClass2_Sub10_Sub1_3.method4464();
												local155 = Static269.aClass2_Sub10_Sub1_3.method4421();
												local159 = Static269.aClass2_Sub10_Sub1_3.method4421();
												if (Static307.method5417(local128)) {
													Static146.method2862(local151, local159, local145, local155, local139, true);
												}
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 248) {
												Static166.method3086(Static177.aClass168_2, Static71.anInt1574, Static269.aClass2_Sub10_Sub1_3);
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 137) {
												local128 = Static269.aClass2_Sub10_Sub1_3.method4414();
												local139 = Static269.aClass2_Sub10_Sub1_3.method4403();
												local145 = Static269.aClass2_Sub10_Sub1_3.method4403();
												Static182.anInt3603 = local145 >> 1;
												Static41.aClass62_Sub1_Sub2_Sub2_2.method4792(Static182.anInt3603, local139, (local145 & 0x1) == 1, local128);
												Static48.anInt1097 = -1;
												return true;
											} else if (Static48.anInt1097 == 233) {
												local128 = Static269.aClass2_Sub10_Sub1_3.method4416();
												local139 = Static269.aClass2_Sub10_Sub1_3.method4464();
												if (Static307.method5417(local139)) {
													Static214.method3805(3, -1, -1, local128);
												}
												Static48.anInt1097 = -1;
												return true;
											} else {
												Static69.method1566("T1 - " + Static48.anInt1097 + "," + Static196.anInt3834 + "," + Static236.anInt4527 + " - " + Static71.anInt1574, null);
												Static38.method868();
												return true;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	public static void method4604() {
		Static93.aClass119_54.method3304();
		Static277.aClass119_169.method3304();
	}
}
