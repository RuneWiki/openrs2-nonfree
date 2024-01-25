import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "Lclient!dq;")
	public static Class51 aClass51_6;

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
	public static int anInt7408;

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
	public static int anInt7411;

	@OriginalMember(owner = "client!vr", name = "w", descriptor = "Lclient!aa;")
	public static Class2 aClass2_20;

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
	public static int anInt7406 = 0;

	@OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
	public static final int anInt7415 = 52;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!kw;Lclient!sn;)V")
	public static void method6042(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class227 arg1) {
		if (!arg1.aBoolean435) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort90;
		@Pc(9) short local9 = arg1.aShort92;
		@Pc(12) byte local12 = arg1.aByte82;
		@Pc(15) byte local15 = arg1.aByte81;
		@Pc(21) int local21 = (local6 << Static437.anInt7308) + Static22.anInt382;
		@Pc(27) int local27 = (local9 << Static437.anInt7308) + Static22.anInt382;
		@Pc(31) Class227[][] local31 = Static389.aClass227ArrayArrayArray3[local12];
		@Pc(53) float local53;
		if (Static349.aClass55Array3 == Static178.aClass55Array1) {
			Static157.aClass167_7.KA(Static182.aClass55Array2[0].R(local21, local27), Static370.method5157(local6, local9), Static298.method4263(local6, local9), Static127.method2003(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static157.aClass167_7.PA(3000.0F, local53 * 1.5F);
		@Pc(86) Class227 local86;
		@Pc(616) Class23_Sub5 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class23_Sub5 local377;
		@Pc(408) int local408;
		@Pc(411) Class1_Sub3 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean433) {
			if (Static232.aBoolean291) {
				if (local12 > 0) {
					local86 = Static389.aClass227ArrayArrayArray3[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean435) {
						return;
					}
				}
				if (local6 <= Static366.anInt6203 && local6 > Static266.anInt4437) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean435 && (local86.aBoolean433 || (arg1.aByte77 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static366.anInt6203 && local6 < Static33.anInt605 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean435 && (local86.aBoolean433 || (arg1.aByte77 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static465.anInt3909 && local9 > Static423.anInt7132) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean435 && (local86.aBoolean433 || (arg1.aByte77 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static465.anInt3909 && local9 < Static439.anInt7312 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean435 && (local86.aBoolean433 || (arg1.aByte77 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static232.aBoolean291 = true;
			}
			arg1.aBoolean433 = false;
			if (arg1.aClass227_1 != null) {
				local86 = arg1.aClass227_1;
				Static157.aClass167_7.PA(3000.0F, (201.5F - (float) (local86.aByte81 + 1) * 50.0F) * 1.5F);
				if (!Static456.method6229(local86.aByte81, local6, local9)) {
					Static178.aClass55Array1[local86.aByte81].method3814(local6, local9);
				}
				@Pc(249) Class1_Sub3 local249 = local86.aClass1_Sub3_3;
				if (local249 != null) {
					if (Static30.aBoolean29) {
						if ((local249.anInt6690 & arg1.aShort91) == 0) {
							Static61.method1149(arg0, local12, local6, local9);
						} else {
							Static308.method4351(arg0, local249.anInt6690, local15, local6, local9);
						}
						Static157.aClass167_7.method5985(arg0.anInt6979, arg0.aClass3_Sub7Array3);
					}
					local249.method6242(Static157.aClass167_7);
				}
				for (@Pc(286) Class114 local286 = local86.aClass114_2; local286 != null; local286 = local286.aClass114_1) {
					@Pc(290) Class1_Sub2 local290 = local286.aClass1_Sub2_1;
					if (local290 != null) {
						if (Static30.aBoolean29) {
							Static61.method1149(arg0, local12, local6, local9);
							Static157.aClass167_7.method5985(arg0.anInt6979, arg0.aClass3_Sub7Array3);
						}
						local290.method6242(Static157.aClass167_7);
					}
				}
				Static157.aClass167_7.PA(3000.0F, local53 * 1.5F);
			}
			local330 = !Static456.method6229(local15, local6, local9);
			if (local330) {
				Static178.aClass55Array1[local15].method3814(local6, local9);
				@Pc(341) Class1_Sub4 local341 = arg1.aClass1_Sub4_2;
				if (local341 != null && local341.aBoolean331) {
					if (local341.aBoolean330) {
						Static157.aClass167_7.PA(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static30.aBoolean29) {
						Static61.method1149(arg0, local12, local6, local9);
						Static157.aClass167_7.method5985(arg0.anInt6979, arg0.aClass3_Sub7Array3);
					}
					local377 = local341.method6242(Static157.aClass167_7);
					if (local377 != null) {
						local377.aClass1_1 = local341;
						local377.anInt5282 = local12;
						local377.anInt5279 = local6;
						local377.anInt5281 = local9;
						Static74.aClass194_1.method4582(local377);
					}
					if (local341.aBoolean330) {
						Static157.aClass167_7.PA(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass1_Sub3_3;
			@Pc(414) Class1_Sub1 local414 = arg1.aClass1_Sub1_1;
			if (local411 != null || local414 != null) {
				if (Static366.anInt6203 == local6) {
					local406++;
				} else if (Static366.anInt6203 < local6) {
					local406 += 2;
				}
				if (Static465.anInt3909 == local9) {
					local406 += 3;
				} else if (Static465.anInt3909 > local9) {
					local406 += 6;
				}
				local408 = Static133.anIntArray122[local406];
				arg1.aShort91 = Static59.aShortArray14[local406];
			}
			if (local411 != null) {
				if ((local411.anInt6690 & Static282.anIntArray317[local406]) == 0) {
					arg1.aByte78 = 0;
				} else if (local411.anInt6690 == 16) {
					arg1.aByte78 = 3;
					arg1.aByte79 = Static116.aByteArray39[local406];
					arg1.aByte76 = (byte) (3 - arg1.aByte79);
				} else if (local411.anInt6690 == 32) {
					arg1.aByte78 = 6;
					arg1.aByte79 = Static12.aByteArray3[local406];
					arg1.aByte76 = (byte) (6 - arg1.aByte79);
				} else if (local411.anInt6690 == 64) {
					arg1.aByte78 = 12;
					arg1.aByte79 = Static414.aByteArray120[local406];
					arg1.aByte76 = (byte) (12 - arg1.aByte79);
				} else {
					arg1.aByte78 = 9;
					arg1.aByte79 = Static193.aByteArray66[local406];
					arg1.aByte76 = (byte) (9 - arg1.aByte79);
				}
				if ((local411.anInt6690 & local408) != 0 && !Static133.method2050(local15, local6, local9, local411.anInt6690)) {
					if (Static30.aBoolean29) {
						Static61.method1149(arg0, local12, local6, local9);
						Static157.aClass167_7.method5985(arg0.anInt6979, arg0.aClass3_Sub7Array3);
					}
					@Pc(563) Class23_Sub5 local563 = local411.method6242(Static157.aClass167_7);
					if (local563 != null) {
						local563.aClass1_1 = local411;
						local563.anInt5282 = local12;
						local563.anInt5279 = local6;
						local563.anInt5281 = local9;
						Static74.aClass194_1.method4582(local563);
					}
				}
				@Pc(584) Class1_Sub3 local584 = arg1.aClass1_Sub3_2;
				if (local584 != null && (local584.anInt6690 & local408) != 0 && !Static133.method2050(local15, local6, local9, local584.anInt6690)) {
					if (Static30.aBoolean29) {
						Static61.method1149(arg0, local12, local6, local9);
						Static157.aClass167_7.method5985(arg0.anInt6979, arg0.aClass3_Sub7Array3);
					}
					local616 = local584.method6242(Static157.aClass167_7);
					if (local616 != null) {
						local616.aClass1_1 = local584;
						local616.anInt5282 = local12;
						local616.anInt5279 = local6;
						local616.anInt5281 = local9;
						Static74.aClass194_1.method4582(local616);
					}
				}
			}
			if (local414 != null && !Static412.method5680(local15, local6, local9, local414.method6252())) {
				@Pc(647) Class1_Sub1 local647 = arg1.aClass1_Sub1_2;
				Static157.aClass167_7.PA(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt7727 & local408) != 0) {
					if (Static30.aBoolean29) {
						Static61.method1149(arg0, local12, local6, local9);
						Static157.aClass167_7.method5985(arg0.anInt6979, arg0.aClass3_Sub7Array3);
					}
					local616 = local414.method6242(Static157.aClass167_7);
					if (local616 != null) {
						local616.aClass1_1 = local414;
						local616.anInt5282 = local12;
						local616.anInt5279 = local6;
						local616.anInt5281 = local9;
						Static74.aClass194_1.method4582(local616);
					}
				} else if (local414.anInt7727 == 256) {
					local706 = local414.anInt7724 - Static257.anInt4288;
					local711 = local414.anInt7728 - Static344.anInt5818;
					local714 = local414.anInt7730;
					if (local714 == 1 || local714 == 2) {
						local723 = -local706;
					} else {
						local723 = local706;
					}
					if (local714 == 2 || local714 == 3) {
						local735 = -local711;
					} else {
						local735 = local711;
					}
					if (Static30.aBoolean29) {
						Static61.method1149(arg0, local12, local6, local9);
						Static157.aClass167_7.method5985(arg0.anInt6979, arg0.aClass3_Sub7Array3);
					}
					@Pc(759) Class23_Sub5 local759;
					if (local735 < local723) {
						local759 = local414.method6242(Static157.aClass167_7);
						if (local759 != null) {
							local759.aClass1_1 = local414;
							local759.anInt5282 = local12;
							local759.anInt5279 = local6;
							local759.anInt5281 = local9;
							Static74.aClass194_1.method4582(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method6242(Static157.aClass167_7);
						if (local759 != null) {
							local759.aClass1_1 = local647;
							local759.anInt5282 = local12;
							local759.anInt5279 = local6;
							local759.anInt5281 = local9;
							Static74.aClass194_1.method4582(local759);
						}
					}
				}
				Static157.aClass167_7.PA(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class1_Sub4 local814 = arg1.aClass1_Sub4_2;
				if (local814 != null && !local814.aBoolean331) {
					if (local814.aBoolean330) {
						Static157.aClass167_7.PA(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static30.aBoolean29) {
						Static61.method1149(arg0, local12, local6, local9);
						Static157.aClass167_7.method5985(arg0.anInt6979, arg0.aClass3_Sub7Array3);
					}
					local616 = local814.method6242(Static157.aClass167_7);
					if (local616 != null) {
						local616.aClass1_1 = local814;
						local616.anInt5282 = local12;
						local616.anInt5279 = local6;
						local616.anInt5281 = local9;
						Static74.aClass194_1.method4582(local616);
					}
					if (local814.aBoolean330) {
						Static157.aClass167_7.PA(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class1_Sub5 local880 = arg1.aClass1_Sub5_1;
				if (local880 != null && !local880.aBoolean405) {
					if (Static30.aBoolean29) {
						Static61.method1149(arg0, local12, local6, local9);
						Static157.aClass167_7.method5985(arg0.anInt6979, arg0.aClass3_Sub7Array3);
					}
					@Pc(903) Class23_Sub5 local903 = local880.method6242(Static157.aClass167_7);
					if (local903 != null) {
						local903.aClass1_1 = local880;
						local903.anInt5282 = local12;
						local903.anInt5279 = local6;
						local903.anInt5281 = local9;
						Static74.aClass194_1.method4582(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte77;
			if (local924 != 0) {
				@Pc(941) Class227 local941;
				if (local6 < Static366.anInt6203 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean435) {
						Static316.aClass12_1.method3101(local941);
					}
				}
				if (local9 < Static465.anInt3909 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean435) {
						Static316.aClass12_1.method3101(local941);
					}
				}
				if (local6 > Static366.anInt6203 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean435) {
						Static316.aClass12_1.method3101(local941);
					}
				}
				if (local9 > Static465.anInt3909 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean435) {
						Static316.aClass12_1.method3101(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class1_Sub3 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class114 local1030;
		if (arg1.aByte78 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass114_2; local1030 != null; local1030 = local1030.aClass114_1) {
				if (local1030.aClass1_Sub2_1.anInt7555 != Static460.anInt7719 && (local1030.anInt3395 & arg1.aByte78) == arg1.aByte79) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass1_Sub3_3;
				if (!Static133.method2050(local15, local6, local9, local1057.anInt6690)) {
					if (Static30.aBoolean29) {
						label682: {
							if (local1057.anInt6690 >= 16) {
								local1074 = local6 - Static366.anInt6203;
								local1078 = local9 - Static465.anInt3909;
								if (local1057.anInt6690 == 16) {
									local1074 -= Static22.anInt382;
									local1078 += Static22.anInt382;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static342.anInt5746) {
										Static61.method1149(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt6690 == 32) {
									local1074 += Static22.anInt382;
									local1078 += Static22.anInt382;
									if (local1078 < -local1074 && local6 < Static459.anInt5916 && local9 < Static342.anInt5746) {
										Static61.method1149(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt6690 == 64) {
									local1074 += Static22.anInt382;
									local1078 -= Static22.anInt382;
									if (local1078 > local1074 && local6 < Static459.anInt5916 && local9 > 0) {
										Static61.method1149(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt6690 == 128) {
									local1074 -= Static22.anInt382;
									local1078 -= Static22.anInt382;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static61.method1149(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static61.method1149(arg0, local12, local6, local9);
						}
						Static157.aClass167_7.method5985(arg0.anInt6979, arg0.aClass3_Sub7Array3);
					}
					@Pc(1216) Class23_Sub5 local1216 = local1057.method6242(Static157.aClass167_7);
					if (local1216 != null) {
						local1216.aClass1_1 = local1057;
						local1216.anInt5282 = local12;
						local1216.anInt5279 = local6;
						local1216.anInt5281 = local9;
						Static74.aClass194_1.method4582(local1216);
					}
				}
				arg1.aByte78 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean434) {
			try {
				arg1.aBoolean434 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass114_2; local1030 != null; local1030 = local1030.aClass114_1) {
					@Pc(1252) Class1_Sub2 local1252 = local1030.aClass1_Sub2_1;
					if (local1252.anInt7555 != Static460.anInt7719) {
						for (local1074 = local1252.aShort108; local1074 <= local1252.aShort109; local1074++) {
							for (local1078 = local1252.aShort107; local1078 <= local1252.aShort110; local1078++) {
								@Pc(1270) Class227 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean433) {
									arg1.aBoolean434 = true;
									continue label625;
								}
								if (local1270.aByte78 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort108) {
										local706++;
									}
									if (local1074 < local1252.aShort109) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort107) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort110) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte78) == arg1.aByte76) {
										arg1.aBoolean434 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static366.anInt6203 - local1252.aShort108;
						local1333 = local1252.aShort109 - Static366.anInt6203;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static465.anInt3909 - local1252.aShort107;
						local711 = local1252.aShort110 - Static465.anInt3909;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass1_Sub2Array2[local1245] = local1252;
						arg0.anIntArray442[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class1_Sub2 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass1_Sub2Array2[local1078];
						if (local1384.anInt7555 != Static460.anInt7719) {
							local706 = arg0.anIntArray442[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt7560 - Static257.anInt4288;
								local714 = local1384.anInt7557 - Static344.anInt5818;
								local723 = arg0.aClass1_Sub2Array2[local1074].anInt7560 - Static257.anInt4288;
								local735 = arg0.aClass1_Sub2Array2[local1074].anInt7557 - Static344.anInt5818;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass1_Sub2Array2[local1074];
					local1384.anInt7555 = Static460.anInt7719;
					if (!Static293.method4194(local15, local1384.aShort108, local1384.aShort109, local1384.aShort107, local1384.aShort110, local1384.method6184())) {
						if (Static30.aBoolean29) {
							if (local1384.aByte100 == 0) {
								Static33.method588(arg0, local12, local1384.aShort108, local1384.aShort107, local1384.aShort109, local1384.aShort110);
							} else {
								Static61.method1149(arg0, local12, local6, local9);
								local706 = local6 - Static366.anInt6203;
								local711 = local9 - Static465.anInt3909;
								if (local1384.aByte100 == 2) {
									if (local711 > -local706) {
										Static44.method859(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static44.method859(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static44.method859(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static44.method859(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static157.aClass167_7.method5985(arg0.anInt6979, arg0.aClass3_Sub7Array3);
						}
						local616 = local1384.method6242(Static157.aClass167_7);
						if (local616 != null) {
							local616.aClass1_1 = local1384;
							local616.anInt5282 = local12;
							local616.anInt5279 = local1384.aShort108;
							local616.anInt5281 = local1384.aShort107;
							Static74.aClass194_1.method4582(local616);
						}
					}
					for (local706 = local1384.aShort108; local706 <= local1384.aShort109; local706++) {
						for (local711 = local1384.aShort107; local711 <= local1384.aShort110; local711++) {
							@Pc(1609) Class227 local1609 = local31[local706][local711];
							if (local1609.aByte78 != 0) {
								Static316.aClass12_1.method3101(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean435) {
								Static316.aClass12_1.method3101(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean434) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean434 = false;
			}
		}
		if (arg1.aClass77_2 != null && arg1.aByte80 == (byte) (Static427.anInt7198 & 0xFF)) {
			@Pc(1664) Class77 local1664 = arg1.aClass77_2;
			local406 = Static178.aClass55Array1[local12].oa(local6, local9);
			if (local12 < Static174.anInt3263 - 1) {
				local408 = Static178.aClass55Array1[local12].oa(local6, local9) - Static178.aClass55Array1[local12 + 1].oa(local6, local9);
			} else {
				local408 = 0x8 << Static437.anInt7308;
			}
			Static56.aClass11_2.method2902(local21, local406, local27, arg0.anIntArray441);
			local1074 = arg0.anIntArray441[2];
			Static56.aClass11_2.method2902(local21, local406 - local408, local27, arg0.anIntArray441);
			local1078 = arg0.anIntArray441[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static84.anInt6076;
			local706 += Static84.anInt6076;
			local1664.anInt2077 = local1333;
			local1664.anInt2075 = local706;
			local1664.aBoolean124 = true;
			Static157.aClass167_7.method5976(local1664);
		}
		if (!arg1.aBoolean435) {
			return;
		}
		if (arg1.aByte78 != 0) {
			return;
		}
		if (local6 <= Static366.anInt6203 && local6 > Static266.anInt4437) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean435) {
				return;
			}
		}
		if (local6 >= Static366.anInt6203 && local6 < Static33.anInt605 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean435) {
				return;
			}
		}
		if (local9 <= Static465.anInt3909 && local9 > Static423.anInt7132) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean435) {
				return;
			}
		}
		if (local9 >= Static465.anInt3909 && local9 < Static439.anInt7312 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean435) {
				return;
			}
		}
		arg1.aBoolean435 = false;
		Static146.anInt2678--;
		@Pc(1855) Class1_Sub5 local1855 = arg1.aClass1_Sub5_1;
		if (local1855 != null && local1855.aBoolean405) {
			if (Static30.aBoolean29) {
				Static61.method1149(arg0, local12, local6, local9);
				Static157.aClass167_7.method5985(arg0.anInt6979, arg0.aClass3_Sub7Array3);
			}
			@Pc(1878) Class23_Sub5 local1878 = local1855.method6242(Static157.aClass167_7);
			if (local1878 != null) {
				local1878.aClass1_1 = local1855;
				local1878.anInt5282 = local12;
				local1878.anInt5279 = local6;
				local1878.anInt5281 = local9;
				Static74.aClass194_1.method4582(local1878);
			}
		}
		if (arg1.aShort91 != 0) {
			@Pc(1902) Class1_Sub1 local1902 = arg1.aClass1_Sub1_1;
			if (local1902 != null && !Static412.method5680(local15, local6, local9, local1902.method6252())) {
				if ((local1902.anInt7727 & arg1.aShort91) != 0) {
					if (Static30.aBoolean29) {
						Static61.method1149(arg0, local12, local6, local9);
						Static157.aClass167_7.method5985(arg0.anInt6979, arg0.aClass3_Sub7Array3);
					}
					local377 = local1902.method6242(Static157.aClass167_7);
					if (local377 != null) {
						local377.aClass1_1 = local1902;
						local377.anInt5282 = local12;
						local377.anInt5279 = local6;
						local377.anInt5281 = local9;
						Static74.aClass194_1.method4582(local377);
					}
				} else if (local1902.anInt7727 == 256) {
					local408 = local1902.anInt7724 - Static257.anInt4288;
					local1074 = local1902.anInt7728 - Static344.anInt5818;
					local1078 = local1902.anInt7730;
					if (local1078 == 1 || local1078 == 2) {
						local1333 = -local408;
					} else {
						local1333 = local408;
					}
					if (local1078 == 2 || local1078 == 3) {
						local706 = -local1074;
					} else {
						local706 = local1074;
					}
					if (Static30.aBoolean29) {
						Static61.method1149(arg0, local12, local6, local9);
						Static157.aClass167_7.method5985(arg0.anInt6979, arg0.aClass3_Sub7Array3);
					}
					@Pc(2012) Class1_Sub1 local2012 = arg1.aClass1_Sub1_2;
					@Pc(2020) Class23_Sub5 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method6242(Static157.aClass167_7);
						if (local2020 != null) {
							local2020.aClass1_1 = local1902;
							local2020.anInt5282 = local12;
							local2020.anInt5279 = local6;
							local2020.anInt5281 = local9;
							Static74.aClass194_1.method4582(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method6242(Static157.aClass167_7);
						if (local2020 != null) {
							local2020.aClass1_1 = local2012;
							local2020.anInt5282 = local12;
							local2020.anInt5279 = local6;
							local2020.anInt5281 = local9;
							Static74.aClass194_1.method4582(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass1_Sub3_3;
			local411 = arg1.aClass1_Sub3_2;
			@Pc(2105) Class23_Sub5 local2105;
			if (local411 != null && (local411.anInt6690 & arg1.aShort91) != 0 && !Static133.method2050(local15, local6, local9, local411.anInt6690)) {
				if (Static30.aBoolean29) {
					Static308.method4351(arg0, local411.anInt6690, local12, local6, local9);
					Static157.aClass167_7.method5985(arg0.anInt6979, arg0.aClass3_Sub7Array3);
				}
				local2105 = local411.method6242(Static157.aClass167_7);
				if (local2105 != null) {
					local2105.aClass1_1 = local411;
					local2105.anInt5282 = local12;
					local2105.anInt5279 = local6;
					local2105.anInt5281 = local9;
					Static74.aClass194_1.method4582(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt6690 & arg1.aShort91) != 0 && !Static133.method2050(local15, local6, local9, local1057.anInt6690)) {
				if (Static30.aBoolean29) {
					Static308.method4351(arg0, local1057.anInt6690, local12, local6, local9);
					Static157.aClass167_7.method5985(arg0.anInt6979, arg0.aClass3_Sub7Array3);
				}
				local2105 = local1057.method6242(Static157.aClass167_7);
				if (local2105 != null) {
					local2105.aClass1_1 = local1057;
					local2105.anInt5282 = local12;
					local2105.anInt5279 = local6;
					local2105.anInt5281 = local9;
					Static74.aClass194_1.method4582(local2105);
				}
			}
		}
		@Pc(2191) Class227 local2191;
		if (local12 < Static174.anInt3263 - 1) {
			local2191 = Static389.aClass227ArrayArrayArray3[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean435) {
				Static316.aClass12_1.method3109(local2191);
			}
		}
		if (local6 < Static366.anInt6203) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean435) {
				Static316.aClass12_1.method3101(local2191);
			}
		}
		if (local9 < Static465.anInt3909) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean435) {
				Static316.aClass12_1.method3101(local2191);
			}
		}
		if (local6 > Static366.anInt6203) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean435) {
				Static316.aClass12_1.method3101(local2191);
			}
		}
		if (local9 > Static465.anInt3909) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean435) {
				Static316.aClass12_1.method3101(local2191);
			}
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZLclient!qw;)I")
	public static int method6043(@OriginalArg(1) Class3_Sub38 arg0) {
		@Pc(7) String local7 = Static413.method5691(arg0);
		@Pc(9) int[] local9 = null;
		if (Static56.method1096(arg0.anInt5875)) {
			local9 = Static158.aClass272_1.method6283((int) arg0.aLong199).anIntArray365;
		} else if (arg0.anInt5869 != -1) {
			local9 = Static158.aClass272_1.method6283(arg0.anInt5869).anIntArray365;
		} else if (Static419.method5747(arg0.anInt5875)) {
			@Pc(32) Class3_Sub40 local32 = (Class3_Sub40) Static63.aClass140_37.method3490((long) arg0.aLong199);
			if (local32 != null) {
				@Pc(37) Class1_Sub2_Sub6_Sub1 local37 = local32.aClass1_Sub2_Sub6_Sub1_2;
				@Pc(40) Class158 local40 = local37.aClass158_1;
				if (local40.anIntArray294 != null) {
					local40 = local40.method3705(Static119.aClass47_1);
				}
				if (local40 != null) {
					local9 = local40.anIntArray295;
				}
			}
		} else if (Static396.method5462(arg0.anInt5875)) {
			@Pc(80) Class31 local80;
			if (arg0.anInt5875 == 1007) {
				local80 = Static9.aClass149_1.method3573((int) arg0.aLong199);
			} else {
				local80 = Static9.aClass149_1.method3573((int) (arg0.aLong199 >>> 32 & 0x7FFFFFFFL));
			}
			if (local80.anIntArray44 != null) {
				local80 = local80.method863(Static119.aClass47_1);
			}
			if (local80 != null) {
				local9 = local80.anIntArray43;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static270.method3761(local9);
		}
		@Pc(137) int local137 = Static251.aClass124_14.method3095(Static306.aClass2Array15, local7);
		if (arg0.aBoolean412) {
			local137 += Static330.aClass2_13.TA() + 4;
		}
		return local137;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method6044(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!dq;Ljava/awt/Frame;)V")
	public static void method6045(@OriginalArg(1) Class51 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(18) Class181 local18 = arg0.method1376(arg1);
			while (local18.anInt5298 == 0) {
				Static83.method1499(10L);
			}
			if (local18.anInt5298 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static83.method1499(100L);
		}
	}
}
