import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IZI)I")
	public static int method6470(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static534.anInt9256 == -1) {
			return 1;
		}
		if (Static382.anInt7091 != arg0) {
			Static269.method4698(arg0);
			if (arg0 != Static382.anInt7091) {
				return -1;
			}
		}
		try {
			@Pc(25) Dimension local25 = Static549.aCanvas15.getSize();
			Static141.method2464(true, Static164.aClass59_1, Static427.aClass67_128.method1934(Static193.anInt7803));
			@Pc(39) Class222 local39 = Static264.method4649(Static534.anInt9256, Static549.aClass161_119);
			@Pc(42) long local42 = Static12.method647();
			Static121.aClass5_7.F();
			Static181.aClass205_5.GA(0, Static467.anInt8424, 0);
			Static121.aClass5_7.method7469(Static181.aClass205_5);
			Static121.aClass5_7.m(local25.width / 2, local25.height / 2, 512, 512);
			Static121.aClass5_7.ha(1.0F);
			Static121.aClass5_7.YA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(83) Class2 local83 = Static121.aClass5_7.method7443(local39, 2048, 64, 64, 768);
			@Pc(85) int local85 = 0;
			label41: for (@Pc(87) int local87 = 0; local87 < 500; local87++) {
				Static121.aClass5_7.D(0);
				Static121.aClass5_7.method7444();
				for (@Pc(96) int local96 = 15; local96 >= 0; local96--) {
					for (@Pc(100) int local100 = 0; local100 <= local96; local100++) {
						Static131.aClass205_3.GA((int) ((float) Static219.anInt4777 * (-((float) local96 / 2.0F) + (float) local100)), 0, Static219.anInt4777 * (local96 + 1));
						local83.method5774(Static131.aClass205_3, null, 0);
						local85++;
						if (Static12.method647() - local42 >= (long) arg1) {
							break label41;
						}
					}
				}
			}
			Static121.aClass5_7.method7413();
			@Pc(172) long local172 = (long) (local85 * 1000) / (Static12.method647() - local42);
			Static121.aClass5_7.D(0);
			Static121.aClass5_7.method7444();
			return (int) local172;
		} catch (@Pc(181) Throwable local181) {
			local181.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILclient!hb;)V")
	public static void method6473(@OriginalArg(1) Class117 arg0) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(45) int local45;
		@Pc(72) int local72;
		@Pc(78) int local78;
		@Pc(80) int local80;
		if (Static272.aClass117_17 == arg0) {
			local12 = Static90.aClass3_Sub27_Sub1_1.method7548();
			local20 = (local12 >> 4 & 0x7) + Static495.anInt5643;
			local27 = Static327.anInt6264 + (local12 & 0x7);
			local33 = Static90.aClass3_Sub27_Sub1_1.method7591();
			local37 = Static90.aClass3_Sub27_Sub1_1.method7548();
			local41 = Static90.aClass3_Sub27_Sub1_1.method7591();
			local45 = Static90.aClass3_Sub27_Sub1_1.method7548();
			if (local20 >= 0 && local27 >= 0 && Static118.anInt2527 > local20 && Static549.anInt9482 > local27) {
				local72 = local20 * 512 + 256;
				local78 = local27 * 512 + 256;
				local80 = Static119.anInt2569;
				if (local80 < 3 && Static307.method4073(local20, local27)) {
					local80++;
				}
				@Pc(112) Class6_Sub1_Sub1 local112 = new Class6_Sub1_Sub1(local33, local41, Static223.anInt4829, Static119.anInt2569, local80, local72, Static58.method1166(local78, local72, Static119.anInt2569) - local37, local78, local20, local20, local27, local27, local45);
				Static422.aClass71_65.method2076(new Class3_Sub10_Sub17(local112));
			}
		} else if (Static157.aClass117_9 == arg0) {
			local12 = Static90.aClass3_Sub27_Sub1_1.method7591();
			if (local12 == 65535) {
				local12 = -1;
			}
			local20 = Static90.aClass3_Sub27_Sub1_1.method7580();
			local27 = Static495.anInt5643 + (local20 >> 4 & 0x7);
			local33 = Static327.anInt6264 + (local20 & 0x7);
			local37 = Static90.aClass3_Sub27_Sub1_1.method7548();
			local41 = local37 >> 2;
			local45 = local37 & 0x3;
			local72 = Static447.anIntArray696[local41];
			Static187.method3526(Static119.anInt2569, local12, local45, local41, local72, local33, local27);
		} else if (Static27.aClass117_1 == arg0) {
			local12 = Static90.aClass3_Sub27_Sub1_1.method7580();
			local20 = (local12 & 0x7) + Static327.anInt6264;
			local27 = Static150.anInt3027 + local20;
			local33 = (local12 >> 4 & 0x7) + Static495.anInt5643;
			local37 = Static223.anInt4827 + local33;
			local41 = Static90.aClass3_Sub27_Sub1_1.method7610();
			local45 = Static90.aClass3_Sub27_Sub1_1.method7610();
			@Pc(247) boolean local247 = local33 >= 0 && local20 >= 0 && Static118.anInt2527 > local33 && Static549.anInt9482 > local20;
			if (local247 || Static23.method5780(Static318.anInt5230)) {
				Static500.method7214(new Class3_Sub32(local41, local45), local27, Static119.anInt2569, local37);
				if (local247) {
					Static71.method1459(Static119.anInt2569, local33, local20);
				}
			}
		} else {
			@Pc(343) int local343;
			@Pc(347) int local347;
			@Pc(351) int local351;
			@Pc(360) int local360;
			@Pc(460) Class6_Sub1_Sub3 local460;
			if (Static108.aClass117_8 == arg0) {
				local12 = Static90.aClass3_Sub27_Sub1_1.method7548();
				@Pc(288) boolean local288 = (local12 & 0x80) != 0;
				local27 = Static495.anInt5643 + (local12 >> 3 & 0x7);
				local33 = Static327.anInt6264 + (local12 & 0x7);
				local37 = Static90.aClass3_Sub27_Sub1_1.method7584() + local27;
				local41 = Static90.aClass3_Sub27_Sub1_1.method7584() + local33;
				local45 = Static90.aClass3_Sub27_Sub1_1.method7604();
				local72 = Static90.aClass3_Sub27_Sub1_1.method7591();
				local78 = Static90.aClass3_Sub27_Sub1_1.method7548() * 4;
				local80 = Static90.aClass3_Sub27_Sub1_1.method7548() * 4;
				local343 = Static90.aClass3_Sub27_Sub1_1.method7591();
				local347 = Static90.aClass3_Sub27_Sub1_1.method7591();
				local351 = Static90.aClass3_Sub27_Sub1_1.method7548();
				if (local351 == 255) {
					local351 = -1;
				}
				local360 = Static90.aClass3_Sub27_Sub1_1.method7591();
				if (local27 >= 0 && local33 >= 0 && Static118.anInt2527 > local27 && local33 < Static549.anInt9482 && local37 >= 0 && local41 >= 0 && local37 < Static118.anInt2527 && Static549.anInt9482 > local41 && local72 != 65535) {
					local80 <<= 0x2;
					local41 = local41 * 512 + 256;
					local78 <<= 0x2;
					local33 = local33 * 512 + 256;
					local27 = local27 * 512 + 256;
					local37 = local37 * 512 + 256;
					local360 <<= 0x2;
					local460 = new Class6_Sub1_Sub3(local72, Static119.anInt2569, local27, local33, local78, local343 + Static223.anInt4829, Static223.anInt4829 + local347, local351, local360, local45, local80, local288);
					local460.method2451(local37, Static58.method1166(local41, local37, Static119.anInt2569) - local80, local343 + Static223.anInt4829, local41);
					Static436.aClass71_60.method2076(new Class3_Sub10_Sub15(local460));
				}
			} else if (Static38.aClass117_2 == arg0) {
				local12 = Static90.aClass3_Sub27_Sub1_1.method7591();
				local20 = Static90.aClass3_Sub27_Sub1_1.method7597();
				local27 = Static327.anInt6264 + (local20 & 0x7);
				local33 = local27 + Static150.anInt3027;
				local37 = Static495.anInt5643 + (local20 >> 4 & 0x7);
				local41 = local37 + Static223.anInt4827;
				@Pc(537) Class3_Sub12 local537 = (Class3_Sub12) Static476.aClass267_37.method6644((long) (Static119.anInt2569 << 28 | local33 << 14 | local41));
				if (local537 != null) {
					for (@Pc(545) Class3_Sub32 local545 = (Class3_Sub32) local537.aClass71_13.method2089(); local545 != null; local545 = (Class3_Sub32) local537.aClass71_13.method2086()) {
						if ((local12 & 0x7FFF) == local545.anInt5999) {
							local545.method7820();
							break;
						}
					}
					if (local537.aClass71_13.method2085()) {
						local537.method7820();
					}
					if (local37 >= 0 && local27 >= 0 && local37 < Static118.anInt2527 && Static549.anInt9482 > local27) {
						Static71.method1459(Static119.anInt2569, local37, local27);
					}
				}
			} else if (arg0 == Static223.aClass117_14) {
				local12 = Static90.aClass3_Sub27_Sub1_1.method7548();
				local20 = Static495.anInt5643 + (local12 >> 4 & 0x7);
				local27 = (local12 & 0x7) + Static327.anInt6264;
				local33 = Static90.aClass3_Sub27_Sub1_1.method7591();
				if (local33 == 65535) {
					local33 = -1;
				}
				local37 = Static90.aClass3_Sub27_Sub1_1.method7548();
				local41 = local37 >> 4 & 0xF;
				local45 = local37 & 0x7;
				local72 = Static90.aClass3_Sub27_Sub1_1.method7548();
				local78 = Static90.aClass3_Sub27_Sub1_1.method7548();
				if (local20 >= 0 && local27 >= 0 && Static118.anInt2527 > local20 && local27 < Static549.anInt9482) {
					local80 = local41 + 1;
					if (local20 - local80 <= Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray733[0] && local80 + local20 >= Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray733[0] && Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray734[0] >= local27 - local80 && Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray734[0] <= local27 + local80) {
						Static68.method1376((Static119.anInt2569 << 24) + (local20 << 16) + (local27 << 8) + local41, local33, local72, local78, local45);
					}
				}
			} else if (arg0 == Static169.aClass117_10) {
				local12 = Static90.aClass3_Sub27_Sub1_1.method7561();
				local20 = Static327.anInt6264 + (local12 & 0x7);
				local27 = local20 + Static150.anInt3027;
				local33 = (local12 >> 4 & 0x7) + Static495.anInt5643;
				local37 = Static223.anInt4827 + local33;
				local41 = Static90.aClass3_Sub27_Sub1_1.method7566();
				local45 = Static90.aClass3_Sub27_Sub1_1.method7610();
				local72 = Static90.aClass3_Sub27_Sub1_1.method7568();
				if (local41 != Static342.anInt6448) {
					@Pc(818) boolean local818 = local33 >= 0 && local20 >= 0 && local33 < Static118.anInt2527 && Static549.anInt9482 > local20;
					if (local818 || Static23.method5780(Static318.anInt5230)) {
						Static500.method7214(new Class3_Sub32(local45, local72), local27, Static119.anInt2569, local37);
						if (local818) {
							Static71.method1459(Static119.anInt2569, local33, local20);
						}
					}
				}
			} else if (arg0 == Static54.aClass117_3) {
				local12 = Static90.aClass3_Sub27_Sub1_1.method7597();
				local20 = Static495.anInt5643 + (local12 >> 4 & 0x7);
				local27 = Static327.anInt6264 + (local12 & 0x7);
				local33 = Static90.aClass3_Sub27_Sub1_1.method7548();
				local37 = local33 >> 2;
				local41 = local33 & 0x3;
				local45 = Static447.anIntArray696[local37];
				local72 = Static90.aClass3_Sub27_Sub1_1.method7568();
				if (Static23.method5780(Static318.anInt5230) || local20 >= 0 && local27 >= 0 && local20 < Static118.anInt2527 && Static549.anInt9482 > local27) {
					Static206.method3806(local41, local45, local20, local72, Static119.anInt2569, local27, local37);
				}
			} else if (Static432.aClass117_18 == arg0) {
				Static90.aClass3_Sub27_Sub1_1.method7548();
				local12 = Static90.aClass3_Sub27_Sub1_1.method7548();
				local20 = Static495.anInt5643 + (local12 >> 4 & 0x7);
				local27 = Static327.anInt6264 + (local12 & 0x7);
				local33 = Static90.aClass3_Sub27_Sub1_1.method7591();
				local37 = Static90.aClass3_Sub27_Sub1_1.method7548();
				local41 = Static90.aClass3_Sub27_Sub1_1.method7551();
				@Pc(967) String local967 = Static90.aClass3_Sub27_Sub1_1.method7589();
				Static337.method5393(local33, local27, local967, Static119.anInt2569, local41, local37, local20);
			} else if (Static179.aClass117_15 == arg0) {
				@Pc(986) byte local986 = Static90.aClass3_Sub27_Sub1_1.method7598();
				local20 = Static90.aClass3_Sub27_Sub1_1.method7609();
				@Pc(996) byte local996 = Static90.aClass3_Sub27_Sub1_1.method7557();
				@Pc(1000) byte local1000 = Static90.aClass3_Sub27_Sub1_1.method7598();
				@Pc(1004) byte local1004 = Static90.aClass3_Sub27_Sub1_1.method7557();
				local41 = Static90.aClass3_Sub27_Sub1_1.method7561();
				local45 = local41 >> 2;
				local72 = local41 & 0x3;
				local78 = Static90.aClass3_Sub27_Sub1_1.method7591();
				local80 = Static90.aClass3_Sub27_Sub1_1.method7591();
				local343 = Static90.aClass3_Sub27_Sub1_1.method7597();
				local347 = Static495.anInt5643 + (local343 >> 4 & 0x7);
				local351 = (local343 & 0x7) + Static327.anInt6264;
				local360 = Static90.aClass3_Sub27_Sub1_1.method7568();
				if (!Static121.aClass5_7.method7462()) {
					Static417.method6464(local351, local1004, Static119.anInt2569, local80, local360, local347, local20, local72, local78, local986, local45, local996, local1000);
				}
			} else {
				@Pc(1103) boolean local1103;
				if (Static256.aClass117_16 == arg0) {
					local12 = Static90.aClass3_Sub27_Sub1_1.method7548();
					local20 = (local12 >> 4 & 0xF) + Static495.anInt5643 * 2;
					local27 = (local12 & 0xF) + Static327.anInt6264 * 2;
					local1103 = Static90.aClass3_Sub27_Sub1_1.method7548() != 0;
					local37 = local20 + Static90.aClass3_Sub27_Sub1_1.method7584();
					local41 = local27 + Static90.aClass3_Sub27_Sub1_1.method7584();
					local45 = Static90.aClass3_Sub27_Sub1_1.method7604();
					local72 = Static90.aClass3_Sub27_Sub1_1.method7591();
					local78 = Static90.aClass3_Sub27_Sub1_1.method7548() * 4;
					local80 = Static90.aClass3_Sub27_Sub1_1.method7548() * 4;
					local343 = Static90.aClass3_Sub27_Sub1_1.method7591();
					local347 = Static90.aClass3_Sub27_Sub1_1.method7591();
					local351 = Static90.aClass3_Sub27_Sub1_1.method7548();
					if (local351 == 255) {
						local351 = -1;
					}
					local360 = Static90.aClass3_Sub27_Sub1_1.method7591();
					if (local20 >= 0 && local27 >= 0 && local20 < Static118.anInt2527 * 2 && local27 < Static118.anInt2527 * 2 && local37 >= 0 && local41 >= 0 && local37 < Static549.anInt9482 * 2 && Static549.anInt9482 * 2 > local41 && local72 != 65535) {
						local78 <<= 0x2;
						local360 <<= 0x2;
						local41 *= 256;
						local37 = local37 * 256;
						local20 *= 256;
						local27 *= 256;
						local80 <<= 0x2;
						local460 = new Class6_Sub1_Sub3(local72, Static119.anInt2569, local20, local27, local78, local343 + Static223.anInt4829, Static223.anInt4829 + local347, local351, local360, local45, local80, local1103);
						local460.method2451(local37, Static58.method1166(local41, local37, Static119.anInt2569) - local80, local343 + Static223.anInt4829, local41);
						Static436.aClass71_60.method2076(new Class3_Sub10_Sub15(local460));
					}
				} else if (Static84.aClass117_4 == arg0) {
					local12 = Static90.aClass3_Sub27_Sub1_1.method7591();
					local20 = Static90.aClass3_Sub27_Sub1_1.method7548();
					Static454.aClass298_3.method7185(local12).method5980(local20);
				} else if (Static97.aClass117_7 == arg0) {
					local12 = Static90.aClass3_Sub27_Sub1_1.method7597();
					local20 = Static495.anInt5643 + (local12 >> 4 & 0x7);
					local27 = (local12 & 0x7) + Static327.anInt6264;
					local33 = Static90.aClass3_Sub27_Sub1_1.method7561();
					local37 = local33 >> 2;
					local41 = local33 & 0x3;
					local45 = Static447.anIntArray696[local37];
					if (Static23.method5780(Static318.anInt5230) || local20 >= 0 && local27 >= 0 && Static118.anInt2527 > local20 && local27 < Static549.anInt9482) {
						Static206.method3806(local41, local45, local20, -1, Static119.anInt2569, local27, local37);
					}
				} else if (Static461.aClass117_19 == arg0) {
					local12 = Static90.aClass3_Sub27_Sub1_1.method7548();
					local20 = (local12 & 0x7) + Static327.anInt6264;
					local27 = Static150.anInt3027 + local20;
					local33 = (local12 >> 4 & 0x7) + Static495.anInt5643;
					local37 = local33 + Static223.anInt4827;
					local41 = Static90.aClass3_Sub27_Sub1_1.method7591();
					local45 = Static90.aClass3_Sub27_Sub1_1.method7591();
					local72 = Static90.aClass3_Sub27_Sub1_1.method7591();
					if (Static476.aClass267_37 != null) {
						@Pc(1434) Class3_Sub12 local1434 = (Class3_Sub12) Static476.aClass267_37.method6644((long) (local37 | local27 << 14 | Static119.anInt2569 << 28));
						if (local1434 != null) {
							for (@Pc(1442) Class3_Sub32 local1442 = (Class3_Sub32) local1434.aClass71_13.method2089(); local1442 != null; local1442 = (Class3_Sub32) local1434.aClass71_13.method2086()) {
								if (local1442.anInt5999 == (local41 & 0x7FFF) && local1442.anInt5994 == local45) {
									local1442.method7820();
									local1442.anInt5994 = local72;
									Static500.method7214(local1442, local27, Static119.anInt2569, local37);
									break;
								}
							}
							if (local33 >= 0 && local20 >= 0 && Static118.anInt2527 > local33 && Static549.anInt9482 > local20) {
								Static71.method1459(Static119.anInt2569, local33, local20);
							}
						}
					}
				} else if (Static173.aClass117_11 == arg0) {
					local12 = Static90.aClass3_Sub27_Sub1_1.method7548();
					local20 = Static495.anInt5643 + (local12 >> 4 & 0x7);
					local27 = (local12 & 0x7) + Static327.anInt6264;
					local33 = Static90.aClass3_Sub27_Sub1_1.method7591();
					if (local33 == 65535) {
						local33 = -1;
					}
					local37 = Static90.aClass3_Sub27_Sub1_1.method7548();
					local41 = local37 >> 4 & 0xF;
					local45 = local37 & 0x7;
					local72 = Static90.aClass3_Sub27_Sub1_1.method7548();
					local78 = Static90.aClass3_Sub27_Sub1_1.method7548();
					if (local20 >= 0 && local27 >= 0 && Static118.anInt2527 > local20 && Static549.anInt9482 > local27) {
						local80 = local41 + 1;
						if (local20 - local80 <= Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray733[0] && Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray733[0] <= local80 + local20 && local27 - local80 <= Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray734[0] && Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray734[0] <= local27 + local80) {
							Static173.method3296(local33, local72, local78, local45, (Static119.anInt2569 << 24) - (-(local20 << 16) - ((local27 << 8) + local41)));
						}
					}
				} else if (Static196.aClass117_13 == arg0) {
					local12 = Static90.aClass3_Sub27_Sub1_1.method7548();
					local20 = (local12 >> 4 & 0xF) + Static495.anInt5643 * 2;
					local27 = Static327.anInt6264 * 2 + (local12 & 0xF);
					local1103 = Static90.aClass3_Sub27_Sub1_1.method7548() != 0;
					local37 = local20 + Static90.aClass3_Sub27_Sub1_1.method7584();
					local41 = local27 + Static90.aClass3_Sub27_Sub1_1.method7584();
					local45 = Static90.aClass3_Sub27_Sub1_1.method7604();
					local72 = Static90.aClass3_Sub27_Sub1_1.method7604();
					local78 = Static90.aClass3_Sub27_Sub1_1.method7591();
					@Pc(1712) byte local1712 = Static90.aClass3_Sub27_Sub1_1.method7584();
					local343 = Static90.aClass3_Sub27_Sub1_1.method7548() * 4;
					local347 = Static90.aClass3_Sub27_Sub1_1.method7591();
					local351 = Static90.aClass3_Sub27_Sub1_1.method7591();
					local360 = Static90.aClass3_Sub27_Sub1_1.method7548();
					if (local360 == 255) {
						local360 = -1;
					}
					@Pc(1741) int local1741 = Static90.aClass3_Sub27_Sub1_1.method7591();
					if (local20 >= 0 && local27 >= 0 && Static118.anInt2527 * 2 > local20 && local27 < Static118.anInt2527 * 2 && local37 >= 0 && local41 >= 0 && Static549.anInt9482 * 2 > local37 && local41 < Static549.anInt9482 * 2 && local78 != 65535) {
						local20 *= 256;
						local343 <<= 0x2;
						local37 *= 256;
						local80 = local1712 << 2;
						local27 *= 256;
						local1741 <<= 0x2;
						local41 = local41 * 256;
						if (local45 != 0) {
							@Pc(1812) Class6_Sub1_Sub2 local1812 = null;
							@Pc(1832) int local1832;
							@Pc(1822) int local1822;
							@Pc(1826) int local1826;
							if (local45 < 0) {
								local1822 = -local45 - 1;
								local1826 = local1822 & 0x7FF;
								local1832 = local1822 >> 11 & 0xF;
								if (local1826 == Static342.anInt6448) {
									local1812 = Static111.aClass6_Sub1_Sub2_Sub1_3;
								} else {
									local1812 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local1826];
								}
							} else {
								local1822 = local45 - 1;
								local1832 = local1822 >> 11 & 0xF;
								local1826 = local1822 & 0x7FF;
								@Pc(1864) Class3_Sub3 local1864 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local1826);
								if (local1864 != null) {
									local1812 = local1864.aClass6_Sub1_Sub2_Sub2_1;
								}
							}
							if (local1812 != null) {
								@Pc(1875) Class73 local1875 = local1812.method7088();
								if (local1875.anIntArrayArray29 != null && local1875.anIntArrayArray29[local1832] != null) {
									local1826 = local1875.anIntArrayArray29[local1832][0];
									@Pc(1897) int local1897 = local1875.anIntArrayArray29[local1832][2];
									@Pc(1902) int local1902 = local1812.aClass173_7.method4694();
									@Pc(1906) int local1906 = Class5.anIntArray761[local1902];
									@Pc(1910) int local1910 = Class5.anIntArray760[local1902];
									@Pc(1920) int local1920 = local1826 * local1910 + local1897 * local1906 >> 14;
									@Pc(1931) int local1931 = local1910 * local1897 - local1906 * local1826 >> 14;
									local20 += local1920;
									local27 += local1931;
									local80 -= local1875.anIntArrayArray29[local1832][1];
								}
							}
						}
						@Pc(1970) Class6_Sub1_Sub3 local1970 = new Class6_Sub1_Sub3(local78, Static119.anInt2569, local20, local27, local80, local347 + Static223.anInt4829, local351 + Static223.anInt4829, local360, local1741, local72, local343, local1103);
						local1970.method2451(local37, Static58.method1166(local41, local37, Static119.anInt2569) - local343, Static223.anInt4829 + local347, local41);
						Static436.aClass71_60.method2076(new Class3_Sub10_Sub15(local1970));
					}
				} else {
					Static2.method220(null, "T3 - " + arg0);
					Static180.method3441(false);
				}
			}
		}
	}
}
