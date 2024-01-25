import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
	public static int anInt1236;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
	public static int anInt1231 = -1;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIILclient!qa;)V")
	public static void method1060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class75 arg2) {
		if (arg1 < 0 || arg0 < 0 || Static220.anInt4290 == 0 || Static446.anInt7541 == 0) {
			return;
		}
		arg2.GA(Static180.anInt3687, Static360.anInt6488, Static220.anInt4290, Static446.anInt7541);
		arg2.pa(anInt1231, Static214.anInt4209, Static220.anInt4290, Static446.anInt7541);
		@Pc(33) Class106 local33 = arg2.method2636();
		local33.Q(Static298.anInt5449, Static293.anInt3446, Static179.anInt3652, Static388.anInt6706, Static375.anInt6612, Static312.anInt5691);
		arg2.m(local33);
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(72) int local72;
		@Pc(81) int local81;
		@Pc(89) int local89;
		@Pc(104) int[] local104;
		@Pc(136) int local136;
		@Pc(145) int local145;
		if (Static205.aClass64Array2 != null) {
			@Pc(48) int local48 = -1;
			@Pc(50) int local50 = -1;
			@Pc(53) int local53 = arg2.d();
			local61 = local53 * (arg1 - Static180.anInt3687) / Static220.anInt4290;
			local69 = (arg0 - Static360.anInt6488) * local53 / Static446.anInt7541;
			local72 = arg2.W();
			local81 = local72 * (arg1 - Static180.anInt3687) / Static220.anInt4290;
			local89 = (arg0 - Static360.anInt6488) * local72 / Static446.anInt7541;
			local104 = new int[] { local61, local69, local53 };
			local33.X(local104);
			@Pc(122) int[] local122 = new int[] { local81, local89, local72 };
			local33.X(local122);
			@Pc(127) float local127 = 0.0F;
			local136 = local122[0] - local104[0];
			local145 = local122[1] - local104[1];
			@Pc(154) int local154 = local122[2] - local104[2];
			while (local127 < 1.0F) {
				@Pc(166) int local166 = (int) ((float) local104[0] + local127 * (float) local136);
				@Pc(170) int local170 = local166 >> 7;
				@Pc(181) int local181 = (int) ((float) local154 * local127 + (float) local104[2]);
				@Pc(185) int local185 = local181 >> 7;
				if (local170 > 0 && local185 > 0 && local170 < Static399.anInt6923 && Static127.anInt2696 > local185) {
					@Pc(198) int local198 = Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77;
					if (local198 < 3 && (Static325.aByteArrayArrayArray15[1][local170][local185] & 0x2) != 0) {
						local198++;
					}
					if ((float) Static205.aClass64Array2[local198].va(local166, local181) < (float) local104[1] + local127 * (float) local145) {
						local48 = (Static113.aClass1_Sub3_Sub3_Sub1_4.method4831() - 1 << 6) + local166 >> 7;
						local50 = local181 + (Static113.aClass1_Sub3_Sub3_Sub1_4.method4831() - 1 << 6) >> 7;
						break;
					}
				}
				local127 = (float) ((double) local127 + 0.01D);
			}
			if (local48 != -1 && local50 != -1) {
				if (Static59.aBoolean111 && (Static421.anInt4507 & 0x40) != 0) {
					@Pc(287) Class68 local287 = Static347.method4975(Static295.anInt5382, Static207.anInt4138);
					if (local287 == null) {
						Static31.method766();
					} else {
						Static112.method4934(local50, 20, 0L, -1, local48, false, " ->", true, Static276.aString52, Static108.anInt3456);
					}
				} else {
					if (Static69.aClass89_1 == Static114.aClass89_2) {
						Static112.method4934(local50, 12, 0L, -1, local48, false, "", true, Static180.aClass175_119.method4201(Static216.anInt4257), -1);
					}
					Static112.method4934(local50, 21, 0L, -1, local48, false, "", true, Static149.aString31, Static30.anInt826);
				}
			}
		}
		@Pc(341) Class40 local341 = Static201.aClass40_4;
		for (@Pc(346) Class13_Sub7 local346 = (Class13_Sub7) local341.method1188(); local346 != null; local346 = (Class13_Sub7) local341.method1195()) {
			if (local346.anInt7372 == Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77 && local346.method5761(arg0, arg1, arg2)) {
				@Pc(469) int local469;
				if (local346.aClass1_1 instanceof Class1_Sub3_Sub3_Sub1) {
					@Pc(374) Class1_Sub3_Sub3_Sub1 local374 = (Class1_Sub3_Sub3_Sub1) local346.aClass1_1;
					local61 = local374.method4831();
					if ((local61 & 0x1) == 0 && (local374.anInt6053 & 0x7F) == 0 && (local374.anInt6055 & 0x7F) == 0 || (local61 & 0x1) == 1 && (local374.anInt6053 & 0x7F) == 64 && (local374.anInt6055 & 0x7F) == 64) {
						local69 = local374.anInt6053 - (local374.method4831() - 1 << 6);
						local72 = local374.anInt6055 - (local374.method4831() - 1 << 6);
						@Pc(481) int local481;
						for (local81 = 0; local81 < Static453.anInt7682; local81++) {
							@Pc(447) Class1_Sub3_Sub3_Sub2 local447 = Static451.aClass1_Sub3_Sub3_Sub2Array1[Static29.anIntArray56[local81]];
							if (local447 != null && local447.anInt6124 != Static290.anInt5325 && local447.aBoolean427) {
								local469 = local447.anInt6053 - (local447.aClass47_1.anInt1578 - 1 << 6);
								local481 = local447.anInt6055 - (local447.aClass47_1.anInt1578 - 1 << 6);
								if (local69 <= local469 && local447.aClass47_1.anInt1578 <= local374.method4831() - (local469 - local69 >> 7) && local72 <= local481 && local447.aClass47_1.anInt1578 <= local374.method4831() - (local481 - local72 >> 7)) {
									Static116.method5253(local447, local346.anInt7372 != Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77);
									local447.anInt6124 = Static290.anInt5325;
								}
							}
						}
						local89 = Static207.anInt4136;
						local104 = Static322.anIntArray436;
						for (local481 = 0; local481 < local89; local481++) {
							@Pc(563) Class1_Sub3_Sub3_Sub1 local563 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local104[local481]];
							if (local563 != null && Static290.anInt5325 != local563.anInt6124 && local563 != local374 && local563.aBoolean427) {
								local136 = local563.anInt6053 - (local563.method4831() - 1 << 6);
								local145 = local563.anInt6055 - (local563.method4831() - 1 << 6);
								if (local69 <= local136 && local563.method4831() <= local374.method4831() - (local136 - local69 >> 7) && local145 >= local72 && local563.method4831() <= local374.method4831() - (local145 - local72 >> 7)) {
									Static1.method59(local563, local346.anInt7372 != Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77);
									local563.anInt6124 = Static290.anInt5325;
								}
							}
						}
					}
					if (local374.anInt6124 == Static290.anInt5325) {
						continue;
					}
					Static1.method59(local374, local346.anInt7372 != Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77);
					local374.anInt6124 = Static290.anInt5325;
				}
				if (local346.aClass1_1 instanceof Class1_Sub3_Sub3_Sub2) {
					@Pc(699) Class1_Sub3_Sub3_Sub2 local699 = (Class1_Sub3_Sub3_Sub2) local346.aClass1_1;
					if (local699.aClass47_1 != null) {
						if ((local699.aClass47_1.anInt1578 & 0x1) == 0 && (local699.anInt6053 & 0x7F) == 0 && (local699.anInt6055 & 0x7F) == 0 || (local699.aClass47_1.anInt1578 & 0x1) == 1 && (local699.anInt6053 & 0x7F) == 64 && (local699.anInt6055 & 0x7F) == 64) {
							local61 = local699.anInt6053 - (local699.aClass47_1.anInt1578 - 1 << 6);
							local69 = local699.anInt6055 - (local699.aClass47_1.anInt1578 - 1 << 6);
							for (local72 = 0; local72 < Static453.anInt7682; local72++) {
								@Pc(775) Class1_Sub3_Sub3_Sub2 local775 = Static451.aClass1_Sub3_Sub3_Sub2Array1[Static29.anIntArray56[local72]];
								if (local775 != null && Static290.anInt5325 != local775.anInt6124 && local775 != local699 && local775.aBoolean427) {
									local89 = local775.anInt6053 - (local775.aClass47_1.anInt1578 - 1 << 6);
									local469 = local775.anInt6055 - (local775.aClass47_1.anInt1578 - 1 << 6);
									if (local61 <= local89 && local775.aClass47_1.anInt1578 <= local699.aClass47_1.anInt1578 - (local89 - local61 >> 7) && local469 >= local69 && local699.aClass47_1.anInt1578 - (local469 - local69 >> 7) >= local775.aClass47_1.anInt1578) {
										Static116.method5253(local775, local346.anInt7372 != Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77);
										local775.anInt6124 = Static290.anInt5325;
									}
								}
							}
							local81 = Static207.anInt4136;
							@Pc(880) int[] local880 = Static322.anIntArray436;
							for (local469 = 0; local469 < local81; local469++) {
								@Pc(889) Class1_Sub3_Sub3_Sub1 local889 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local880[local469]];
								if (local889 != null && local889.anInt6124 != Static290.anInt5325 && local889.aBoolean427) {
									@Pc(914) int local914 = local889.anInt6053 - (local889.method4831() - 1 << 6);
									local136 = local889.anInt6055 - (local889.method4831() - 1 << 6);
									if (local61 <= local914 && local889.method4831() <= local699.aClass47_1.anInt1578 - (local914 - local61 >> 7) && local69 <= local136 && local889.method4831() <= local699.aClass47_1.anInt1578 - (local136 - local69 >> 7)) {
										Static1.method59(local889, local346.anInt7372 != Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77);
										local889.anInt6124 = Static290.anInt5325;
									}
								}
							}
						}
						if (Static290.anInt5325 == local699.anInt6124) {
							continue;
						}
						Static116.method5253(local699, Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77 != local346.anInt7372);
						local699.anInt6124 = Static290.anInt5325;
					}
				}
				if (local346.aClass1_1 instanceof Class1_Sub4_Sub1) {
					@Pc(1038) Class3_Sub44 local1038 = (Class3_Sub44) Static157.aClass127_15.method3246((long) (local346.anInt7372 << 28 | local346.anInt7375 << 14 | local346.anInt7373));
					if (local1038 != null) {
						for (@Pc(1046) Class3_Sub22 local1046 = (Class3_Sub22) local1038.aClass229_46.method5318(); local1046 != null; local1046 = (Class3_Sub22) local1038.aClass229_46.method5329()) {
							@Pc(1053) Class191 local1053 = Static89.aClass157_1.method3832(local1046.anInt3545);
							if (!Static59.aBoolean111) {
								if (local346.anInt7372 == Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77) {
									@Pc(1067) String[] local1067 = local1053.aStringArray139;
									for (local81 = 4; local81 >= 0; local81--) {
										if (local1067 != null && local1067[local81] != null) {
											@Pc(1078) byte local1078 = 0;
											if (local81 == 0) {
												local1078 = 15;
											}
											local469 = Static130.anInt6132;
											if (local81 == 1) {
												local1078 = 51;
											}
											if (local81 == 2) {
												local1078 = 9;
											}
											if (local81 == 3) {
												local1078 = 17;
											}
											if (local81 == local1053.anInt5833) {
												local469 = local1053.anInt5848;
											}
											if (local81 == 4) {
												local1078 = 47;
											}
											if (local1053.anInt5822 == local81) {
												local469 = local1053.anInt5824;
											}
											Static112.method4934(local346.anInt7375, local1078, (long) local1046.anInt3545, -1, local346.anInt7373, false, "<col=ff9040>" + local1053.aString56, true, local1067[local81], local469);
										}
									}
								}
								Static112.method4934(local346.anInt7375, 1012, (long) local1046.anInt3545, -1, local346.anInt7373, local346.anInt7372 != Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77, "<col=ff9040>" + local1053.aString56, true, Static171.aClass175_117.method4201(Static216.anInt4257), Static80.anInt1720);
							} else if (Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77 == local346.anInt7372) {
								@Pc(1218) Class235 local1218 = Static418.anInt7212 == -1 ? null : Static294.aClass69_2.method1740(Static418.anInt7212);
								if ((Static421.anInt4507 & 0x1) != 0 && (local1218 == null || local1053.method4662(local1218.anInt7023, Static418.anInt7212) != local1218.anInt7023)) {
									Static112.method4934(local346.anInt7375, 16, (long) local1046.anInt3545, -1, local346.anInt7373, false, Static128.aString25 + " -> <col=ff9040>" + local1053.aString56, true, Static276.aString52, Static108.anInt3456);
								}
							}
						}
					}
				}
				if (local346.aClass1_1 instanceof Interface12) {
					@Pc(1286) Interface12 local1286 = (Interface12) local346.aClass1_1;
					@Pc(1293) Class128 local1293 = Static55.aClass25_1.method855(local1286.method5847());
					if (local1293.anIntArray307 != null) {
						local1293 = local1293.method3307(Static369.aClass11_1);
					}
					if (local1293 != null) {
						if (!Static59.aBoolean111) {
							if (local346.anInt7372 == Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77) {
								@Pc(1317) String[] local1317 = local1293.aStringArray90;
								if (local1317 != null) {
									for (local72 = 4; local72 >= 0; local72--) {
										if (local1317[local72] != null) {
											@Pc(1328) short local1328 = 0;
											local89 = Static130.anInt6132;
											if (local72 == 0) {
												local1328 = 6;
											}
											if (local72 == 1) {
												local1328 = 2;
											}
											if (local72 == 2) {
												local1328 = 57;
											}
											if (local72 == 3) {
												local1328 = 48;
											}
											if (local72 == 4) {
												local1328 = 1007;
											}
											if (local1293.anInt4049 == local72) {
												local89 = local1293.anInt4019;
											}
											if (local72 == local1293.anInt4010) {
												local89 = local1293.anInt4002;
											}
											Static112.method4934(local346.anInt7375, local1328, Static356.method5051(local1286, local346.anInt7373, local346.anInt7375), -1, local346.anInt7373, false, "<col=00ffff>" + local1293.aString41, true, local1317[local72], local89);
										}
									}
								}
							}
							Static112.method4934(local346.anInt7375, 1004, (long) local1293.anInt4027, -1, local346.anInt7373, local346.anInt7372 != Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77, "<col=00ffff>" + local1293.aString41, true, Static171.aClass175_117.method4201(Static216.anInt4257), Static80.anInt1720);
						} else if (local346.anInt7372 == Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77) {
							@Pc(1467) Class235 local1467 = Static418.anInt7212 == -1 ? null : Static294.aClass69_2.method1740(Static418.anInt7212);
							if ((Static421.anInt4507 & 0x4) != 0 && (local1467 == null || local1293.method3312(Static418.anInt7212, local1467.anInt7023) != local1467.anInt7023)) {
								Static112.method4934(local346.anInt7375, 5, Static356.method5051(local1286, local346.anInt7373, local346.anInt7375), -1, local346.anInt7373, false, Static128.aString25 + " -> <col=00ffff>" + local1293.aString41, true, Static276.aString52, Static108.anInt3456);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLclient!gf;)V")
	public static void method1061(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		if (arg0 instanceof Class1_Sub3_Sub3_Sub2) {
			@Pc(32) Class1_Sub3_Sub3_Sub2 local32 = (Class1_Sub3_Sub3_Sub2) arg0;
			if (local32.aClass47_1 == null) {
				return;
			}
			Static116.method5253(local32, Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77 != local32.aByte77);
		} else if (arg0 instanceof Class1_Sub3_Sub3_Sub1) {
			@Pc(17) Class1_Sub3_Sub3_Sub1 local17 = (Class1_Sub3_Sub3_Sub1) arg0;
			Static1.method59(local17, Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77 != local17.aByte77);
			return;
		}
	}
}
