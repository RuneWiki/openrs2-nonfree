import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!qi", name = "ji", descriptor = "Lclient!rca;")
	public static Class278 aClass278_1;

	@OriginalMember(owner = "client!qi", name = "Lh", descriptor = "Lclient!rr;")
	public static final Class290 aClass290_6 = new Class290(2);

	@OriginalMember(owner = "client!qi", name = "bi", descriptor = "Lclient!nq;")
	public static final Class230 aClass230_4 = new Class230("runescape", 0);

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "(II)V")
	public static void method6289(@OriginalArg(1) int arg0) {
		Static248.anInt4641 = -1;
		Static536.anInt8850 = arg0;
		Static248.anInt4641 = -1;
		Static341.method5077();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!he;I)V")
	public static void method6290(@OriginalArg(0) Class20_Sub2_Sub4_Sub1 arg0) {
		if (arg0 instanceof Class20_Sub2_Sub4_Sub1_Sub2) {
			@Pc(28) Class20_Sub2_Sub4_Sub1_Sub2 local28 = (Class20_Sub2_Sub4_Sub1_Sub2) arg0;
			if (local28.aClass162_1 != null) {
				Static140.method2303(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 != local28.aByte116, local28);
			}
		} else if (arg0 instanceof Class20_Sub2_Sub4_Sub1_Sub1) {
			@Pc(8) Class20_Sub2_Sub4_Sub1_Sub1 local8 = (Class20_Sub2_Sub4_Sub1_Sub1) arg0;
			Static296.method4672(local8.aByte116 != Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116, local8);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!jw;B)V")
	public static void method6296(@OriginalArg(0) Class181 arg0) {
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(45) int local45;
		if (Static282.aClass181_7 == arg0) {
			local14 = Static480.aClass1_Sub20_Sub1_1.method4382();
			local22 = Static252.anInt9487 + (local14 >> 4 & 0x7);
			local29 = Static215.anInt4175 + (local14 & 0x7);
			local33 = Static480.aClass1_Sub20_Sub1_1.method4393();
			local37 = local33 >> 2;
			local41 = local33 & 0x3;
			local45 = Static130.anIntArray520[local37];
			if (Static79.method1641(Static102.anInt2115) || local22 >= 0 && local29 >= 0 && Static500.anInt6888 > local22 && Static573.anInt9325 > local29) {
				Static391.method5583(local41, Static212.anInt4155, local22, local37, local29, -1, local45);
			}
		} else if (arg0 == Static134.aClass181_16) {
			local14 = Static480.aClass1_Sub20_Sub1_1.method4426();
			local22 = Static480.aClass1_Sub20_Sub1_1.method4393();
			Static146.aClass214_1.method4897(local14).method6979(local22);
		} else {
			@Pc(141) int local141;
			if (Static387.aClass181_10 == arg0) {
				local14 = Static480.aClass1_Sub20_Sub1_1.method4426();
				local22 = Static480.aClass1_Sub20_Sub1_1.method4393();
				local29 = Static252.anInt9487 + (local22 >> 4 & 0x7);
				local33 = (local22 & 0x7) + Static215.anInt4175;
				local37 = Static480.aClass1_Sub20_Sub1_1.method4372();
				local41 = local37 >> 2;
				local45 = local37 & 0x3;
				local141 = Static130.anIntArray520[local41];
				if (Static79.method1641(Static102.anInt2115) || local29 >= 0 && local33 >= 0 && Static500.anInt6888 > local29 && local33 < Static573.anInt9325) {
					Static391.method5583(local45, Static212.anInt4155, local29, local41, local33, local14, local141);
				}
			} else if (Static359.aClass181_9 == arg0) {
				local14 = Static480.aClass1_Sub20_Sub1_1.method4393();
				local22 = Static215.anInt4175 + (local14 & 0x7);
				local29 = Static24.anInt674 + local22;
				local33 = (local14 >> 4 & 0x7) + Static252.anInt9487;
				local37 = local33 + Static376.anInt6631;
				local41 = Static480.aClass1_Sub20_Sub1_1.method4426();
				local45 = Static480.aClass1_Sub20_Sub1_1.method4426();
				local141 = Static480.aClass1_Sub20_Sub1_1.method4426();
				if (Static186.aClass356_13 != null) {
					@Pc(236) Class1_Sub37 local236 = (Class1_Sub37) Static186.aClass356_13.method7796((long) (local29 << 14 | Static212.anInt4155 << 28 | local37));
					if (local236 != null) {
						for (@Pc(244) Class1_Sub34 local244 = (Class1_Sub34) local236.aClass361_66.method7854(); local244 != null; local244 = (Class1_Sub34) local236.aClass361_66.method7853()) {
							if ((local41 & 0x7FFF) == local244.anInt6203 && local45 == local244.anInt6204) {
								local244.method7878();
								local244.anInt6204 = local141;
								Static273.method4261(local29, local244, local37, Static212.anInt4155);
								break;
							}
						}
						if (local33 >= 0 && local22 >= 0 && local33 < Static500.anInt6888 && local22 < Static573.anInt9325) {
							Static213.method3552(local33, local22, Static212.anInt4155);
						}
					}
				}
			} else if (arg0 == Static63.aClass181_3) {
				local14 = Static480.aClass1_Sub20_Sub1_1.method4394();
				local22 = Static480.aClass1_Sub20_Sub1_1.method4393();
				local29 = (local22 & 0x7) + Static215.anInt4175;
				local33 = Static24.anInt674 + local29;
				local37 = Static252.anInt9487 + (local22 >> 4 & 0x7);
				local41 = Static376.anInt6631 + local37;
				local45 = Static480.aClass1_Sub20_Sub1_1.method4417();
				local141 = Static480.aClass1_Sub20_Sub1_1.method4426();
				if (local45 != Static594.anInt9653) {
					@Pc(374) boolean local374 = local37 >= 0 && local29 >= 0 && local37 < Static500.anInt6888 && local29 < Static573.anInt9325;
					if (local374 || Static79.method1641(Static102.anInt2115)) {
						Static273.method4261(local33, new Class1_Sub34(local141, local14), local41, Static212.anInt4155);
						if (local374) {
							Static213.method3552(local37, local29, Static212.anInt4155);
						}
					}
				}
			} else if (Static464.aClass181_11 == arg0) {
				local14 = Static480.aClass1_Sub20_Sub1_1.method4382();
				local22 = Static252.anInt9487 + (local14 >> 4 & 0x7);
				local29 = (local14 & 0x7) + Static215.anInt4175;
				local33 = Static480.aClass1_Sub20_Sub1_1.method4424();
				if (local33 == 65535) {
					local33 = -1;
				}
				local37 = Static480.aClass1_Sub20_Sub1_1.method4382();
				local41 = local37 >> 2;
				local45 = local37 & 0x3;
				local141 = Static130.anIntArray520[local41];
				Static530.method7225(local29, local41, local33, local45, local141, local22, Static212.anInt4155);
			} else if (Static146.aClass181_5 == arg0) {
				local14 = Static480.aClass1_Sub20_Sub1_1.method4394();
				local22 = Static480.aClass1_Sub20_Sub1_1.method4382();
				local29 = (local22 & 0x7) + Static215.anInt4175;
				local33 = local29 + Static24.anInt674;
				local37 = Static252.anInt9487 + (local22 >> 4 & 0x7);
				local41 = local37 + Static376.anInt6631;
				@Pc(516) Class1_Sub37 local516 = (Class1_Sub37) Static186.aClass356_13.method7796((long) (local41 | Static212.anInt4155 << 28 | local33 << 14));
				if (local516 != null) {
					for (@Pc(524) Class1_Sub34 local524 = (Class1_Sub34) local516.aClass361_66.method7854(); local524 != null; local524 = (Class1_Sub34) local516.aClass361_66.method7853()) {
						if (local524.anInt6203 == (local14 & 0x7FFF)) {
							local524.method7878();
							break;
						}
					}
					if (local516.aClass361_66.method7847()) {
						local516.method7878();
					}
					if (local37 >= 0 && local29 >= 0 && Static500.anInt6888 > local37 && local29 < Static573.anInt9325) {
						Static213.method3552(local37, local29, Static212.anInt4155);
					}
				}
			} else if (arg0 == Static568.aClass181_15) {
				Static480.aClass1_Sub20_Sub1_1.method4393();
				local14 = Static480.aClass1_Sub20_Sub1_1.method4393();
				local22 = Static252.anInt9487 + (local14 >> 4 & 0x7);
				local29 = Static215.anInt4175 + (local14 & 0x7);
				local33 = Static480.aClass1_Sub20_Sub1_1.method4426();
				local37 = Static480.aClass1_Sub20_Sub1_1.method4393();
				local41 = Static480.aClass1_Sub20_Sub1_1.method4396();
				@Pc(629) String local629 = Static480.aClass1_Sub20_Sub1_1.method4388();
				Static560.method7547(local629, Static212.anInt4155, local37, local22, local41, local29, local33);
			} else {
				@Pc(695) int local695;
				@Pc(723) int local723;
				if (Static465.aClass181_12 == arg0) {
					local14 = Static480.aClass1_Sub20_Sub1_1.method4393();
					local22 = Static252.anInt9487 + (local14 >> 4 & 0x7);
					local29 = Static215.anInt4175 + (local14 & 0x7);
					local33 = Static480.aClass1_Sub20_Sub1_1.method4426();
					if (local33 == 65535) {
						local33 = -1;
					}
					local37 = Static480.aClass1_Sub20_Sub1_1.method4393();
					local41 = local37 >> 4 & 0xF;
					local45 = local37 & 0x7;
					local141 = Static480.aClass1_Sub20_Sub1_1.method4393();
					local695 = Static480.aClass1_Sub20_Sub1_1.method4393();
					if (local22 >= 0 && local29 >= 0 && Static500.anInt6888 > local22 && local29 < Static573.anInt9325) {
						local723 = local41 + 1;
						if (local22 - local723 <= Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray437[0] && Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray437[0] <= local723 + local22 && local29 - local723 <= Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray436[0] && Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray436[0] <= local723 + local29) {
							Static414.method5807(local45, local141, local695, local33, local41 + (local22 << 16) + (Static212.anInt4155 << 24) + (local29 << 8));
						}
					}
				} else {
					@Pc(853) int local853;
					@Pc(857) int local857;
					@Pc(861) int local861;
					@Pc(865) int local865;
					@Pc(961) Class20_Sub2_Sub4_Sub4 local961;
					if (Class17_Sub3.lb == arg0) {
						local14 = Static480.aClass1_Sub20_Sub1_1.method4393();
						@Pc(798) boolean local798 = (local14 & 0x80) != 0;
						local29 = Static252.anInt9487 + (local14 >> 3 & 0x7);
						local33 = Static215.anInt4175 + (local14 & 0x7);
						local37 = local29 + Static480.aClass1_Sub20_Sub1_1.method4432();
						local41 = Static480.aClass1_Sub20_Sub1_1.method4432() + local33;
						local45 = Static480.aClass1_Sub20_Sub1_1.method4391();
						local141 = Static480.aClass1_Sub20_Sub1_1.method4426();
						local695 = Static480.aClass1_Sub20_Sub1_1.method4393() * 4;
						local723 = Static480.aClass1_Sub20_Sub1_1.method4393() * 4;
						local853 = Static480.aClass1_Sub20_Sub1_1.method4426();
						local857 = Static480.aClass1_Sub20_Sub1_1.method4426();
						local861 = Static480.aClass1_Sub20_Sub1_1.method4393();
						local865 = Static480.aClass1_Sub20_Sub1_1.method4426();
						if (local861 == 255) {
							local861 = -1;
						}
						if (local29 >= 0 && local33 >= 0 && Static500.anInt6888 > local29 && Static573.anInt9325 > local33 && local37 >= 0 && local41 >= 0 && Static500.anInt6888 > local37 && Static573.anInt9325 > local41 && local141 != 65535) {
							local37 = local37 * 512 + 256;
							local695 <<= 0x2;
							local723 <<= 0x2;
							local41 = local41 * 512 + 256;
							local865 <<= 0x2;
							local29 = local29 * 512 + 256;
							local33 = local33 * 512 + 256;
							local961 = new Class20_Sub2_Sub4_Sub4(local141, Static212.anInt4155, Static212.anInt4155, local29, local33, local695, local853 + Static81.anInt1910, Static81.anInt1910 + local857, local861, local865, local45, local723, local798);
							local961.method6802(local41, local37, Static122.method2103(Static212.anInt4155, local37, local41) - local723, Static81.anInt1910 + local853);
							Static518.aClass361_93.method7855(new Class1_Sub3_Sub14(local961));
						}
					} else if (Static564.aClass181_14 == arg0) {
						local14 = Static480.aClass1_Sub20_Sub1_1.method4393();
						local22 = Static252.anInt9487 + (local14 >> 4 & 0x7);
						local29 = Static215.anInt4175 + (local14 & 0x7);
						local33 = Static480.aClass1_Sub20_Sub1_1.method4426();
						local37 = Static480.aClass1_Sub20_Sub1_1.method4393();
						local41 = Static480.aClass1_Sub20_Sub1_1.method4426();
						local45 = Static480.aClass1_Sub20_Sub1_1.method4393();
						if (local22 >= 0 && local29 >= 0 && local22 < Static500.anInt6888 && Static573.anInt9325 > local29) {
							local141 = local22 * 512 + 256;
							local695 = local29 * 512 + 256;
							local723 = Static212.anInt4155;
							if (local723 < 3 && Static70.method1506(local29, local22)) {
								local723++;
							}
							@Pc(1081) Class20_Sub2_Sub4_Sub2 local1081 = new Class20_Sub2_Sub4_Sub2(local33, local41, Static81.anInt1910, Static212.anInt4155, local723, local141, Static122.method2103(Static212.anInt4155, local141, local695) - local37, local695, local22, local22, local29, local29, local45);
							Static140.aClass361_34.method7855(new Class1_Sub3_Sub18(local1081));
						}
					} else if (Static495.aClass181_13 == arg0) {
						local14 = Static480.aClass1_Sub20_Sub1_1.method4424();
						local22 = Static480.aClass1_Sub20_Sub1_1.method4382();
						local29 = (local22 & 0x7) + Static215.anInt4175;
						local33 = Static24.anInt674 + local29;
						local37 = Static252.anInt9487 + (local22 >> 4 & 0x7);
						local41 = local37 + Static376.anInt6631;
						local45 = Static480.aClass1_Sub20_Sub1_1.method4424();
						@Pc(1148) boolean local1148 = local37 >= 0 && local29 >= 0 && local37 < Static500.anInt6888 && local29 < Static573.anInt9325;
						if (local1148 || Static79.method1641(Static102.anInt2115)) {
							Static273.method4261(local33, new Class1_Sub34(local14, local45), local41, Static212.anInt4155);
							if (local1148) {
								Static213.method3552(local37, local29, Static212.anInt4155);
							}
						}
					} else if (arg0 == Static219.aClass181_6) {
						local14 = Static480.aClass1_Sub20_Sub1_1.method4393();
						local22 = Static252.anInt9487 + (local14 >> 4 & 0x7);
						local29 = (local14 & 0x7) + Static215.anInt4175;
						local33 = Static480.aClass1_Sub20_Sub1_1.method4426();
						if (local33 == 65535) {
							local33 = -1;
						}
						local37 = Static480.aClass1_Sub20_Sub1_1.method4393();
						local41 = local37 >> 4 & 0xF;
						local45 = local37 & 0x7;
						local141 = Static480.aClass1_Sub20_Sub1_1.method4393();
						local695 = Static480.aClass1_Sub20_Sub1_1.method4393();
						if (local22 >= 0 && local29 >= 0 && Static500.anInt6888 > local22 && Static573.anInt9325 > local29) {
							local723 = local41 + 1;
							if (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray437[0] >= local22 - local723 && Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray437[0] <= local22 + local723 && local29 - local723 <= Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray436[0] && Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray436[0] <= local723 + local29) {
								Static269.method4225((local29 << 8) + (Static212.anInt4155 << 24) + (local22 << 16) + local41, local33, local45, local141, local695);
							}
						}
					} else if (Static44.aClass181_2 == arg0) {
						local14 = Static480.aClass1_Sub20_Sub1_1.method4393();
						local22 = (local14 >> 4 & 0xF) + Static252.anInt9487 * 2;
						local29 = (local14 & 0xF) + Static215.anInt4175 * 2;
						local33 = Static480.aClass1_Sub20_Sub1_1.method4393();
						@Pc(1356) boolean local1356 = (local33 & 0x1) != 0;
						local41 = local33 >> 1;
						local45 = Static480.aClass1_Sub20_Sub1_1.method4432() + local22;
						local141 = local29 + Static480.aClass1_Sub20_Sub1_1.method4432();
						local695 = Static480.aClass1_Sub20_Sub1_1.method4391();
						local723 = Static480.aClass1_Sub20_Sub1_1.method4391();
						local853 = Static480.aClass1_Sub20_Sub1_1.method4426();
						@Pc(1393) byte local1393 = Static480.aClass1_Sub20_Sub1_1.method4432();
						local861 = Static480.aClass1_Sub20_Sub1_1.method4393() * 4;
						local865 = Static480.aClass1_Sub20_Sub1_1.method4426();
						@Pc(1409) int local1409 = Static480.aClass1_Sub20_Sub1_1.method4426();
						@Pc(1413) int local1413 = Static480.aClass1_Sub20_Sub1_1.method4393();
						if (local1413 == 255) {
							local1413 = -1;
						}
						@Pc(1424) int local1424 = Static480.aClass1_Sub20_Sub1_1.method4426();
						if (local22 >= 0 && local29 >= 0 && Static500.anInt6888 * 2 > local22 && local29 < Static500.anInt6888 * 2 && local45 >= 0 && local141 >= 0 && local45 < Static573.anInt9325 * 2 && Static573.anInt9325 * 2 > local141 && local853 != 65535) {
							local857 = local1393 << 2;
							local141 *= 256;
							local22 = local22 * 256;
							local861 <<= 0x2;
							local45 = local45 * 256;
							local1424 <<= 0x2;
							local29 *= 256;
							if (local695 != 0) {
								@Pc(1503) Class20_Sub2_Sub4_Sub1 local1503 = null;
								@Pc(1509) int local1509;
								if (local695 >= 0) {
									local1509 = local695 - 1;
									@Pc(1516) Class1_Sub39 local1516 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local1509);
									if (local1516 != null) {
										local1503 = local1516.aClass20_Sub2_Sub4_Sub1_Sub2_2;
									}
								} else {
									local1509 = -local695 - 1;
									if (local1509 == Static594.anInt9653) {
										local1503 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2;
									} else {
										local1503 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local1509];
									}
								}
								if (local1503 != null) {
									@Pc(1543) Class138 local1543 = local1503.method5346();
									if (local1543.anIntArrayArray26 != null && local1543.anIntArrayArray26[local41] != null) {
										@Pc(1558) int local1558 = local1543.anIntArrayArray26[local41][0];
										@Pc(1565) int local1565 = local1543.anIntArrayArray26[local41][2];
										@Pc(1572) int local1572 = local1503.aClass66_7.method1724();
										@Pc(1576) int local1576 = Class151.anIntArray244[local1572];
										@Pc(1580) int local1580 = Class151.anIntArray245[local1572];
										@Pc(1590) int local1590 = local1558 * local1580 + local1565 * local1576 >> 14;
										@Pc(1601) int local1601 = local1565 * local1580 - local1576 * local1558 >> 14;
										local22 += local1590;
										local29 += local1601;
										local857 -= local1543.anIntArrayArray26[local41][1];
									}
								}
							}
							@Pc(1642) Class20_Sub2_Sub4_Sub4 local1642 = new Class20_Sub2_Sub4_Sub4(local853, Static212.anInt4155, Static212.anInt4155, local22, local29, local857, Static81.anInt1910 + local865, local1409 - -Static81.anInt1910, local1413, local1424, local723, local861, local1356);
							local1642.method6802(local141, local45, Static122.method2103(Static212.anInt4155, local45, local141) - local861, local865 + Static81.anInt1910);
							Static518.aClass361_93.method7855(new Class1_Sub3_Sub14(local1642));
						}
					} else if (arg0 == Static37.aClass181_1) {
						local14 = Static480.aClass1_Sub20_Sub1_1.method4393();
						local22 = (local14 >> 4 & 0xF) + Static252.anInt9487 * 2;
						local29 = Static215.anInt4175 * 2 + (local14 & 0xF);
						@Pc(1702) boolean local1702 = Static480.aClass1_Sub20_Sub1_1.method4393() != 0;
						local37 = local22 + Static480.aClass1_Sub20_Sub1_1.method4432();
						local41 = Static480.aClass1_Sub20_Sub1_1.method4432() + local29;
						local45 = Static480.aClass1_Sub20_Sub1_1.method4391();
						local141 = Static480.aClass1_Sub20_Sub1_1.method4426();
						local695 = Static480.aClass1_Sub20_Sub1_1.method4393() * 4;
						local723 = Static480.aClass1_Sub20_Sub1_1.method4393() * 4;
						local853 = Static480.aClass1_Sub20_Sub1_1.method4426();
						local857 = Static480.aClass1_Sub20_Sub1_1.method4426();
						local861 = Static480.aClass1_Sub20_Sub1_1.method4393();
						local865 = Static480.aClass1_Sub20_Sub1_1.method4426();
						if (local861 == 255) {
							local861 = -1;
						}
						if (local22 >= 0 && local29 >= 0 && Static500.anInt6888 * 2 > local22 && Static500.anInt6888 * 2 > local29 && local37 >= 0 && local41 >= 0 && local37 < Static573.anInt9325 * 2 && local41 < Static573.anInt9325 * 2 && local141 != 65535) {
							local29 *= 256;
							local723 <<= 0x2;
							local41 *= 256;
							local865 <<= 0x2;
							local695 <<= 0x2;
							local37 = local37 * 256;
							local22 *= 256;
							local961 = new Class20_Sub2_Sub4_Sub4(local141, Static212.anInt4155, Static212.anInt4155, local22, local29, local695, Static81.anInt1910 + local853, Static81.anInt1910 + local857, local861, local865, local45, local723, local1702);
							local961.method6802(local41, local37, Static122.method2103(Static212.anInt4155, local37, local41) - local723, local853 - -Static81.anInt1910);
							Static518.aClass361_93.method7855(new Class1_Sub3_Sub14(local961));
						}
					} else {
						Static259.method4059("T3 - " + arg0, null);
						Static340.method5070(false);
					}
				}
			}
		}
	}
}
