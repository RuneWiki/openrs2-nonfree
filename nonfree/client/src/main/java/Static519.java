import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "[I")
	public static final int[] anIntArray758 = new int[8];

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IZI[[[Lclient!uaa;IB)Z")
	public static boolean method7385(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class290[][][] arg3, @OriginalArg(4) int arg4) {
		@Pc(14) byte local14 = arg1 ? 1 : (byte) (Static127.anInt2665 & 0xFF);
		if (Static58.aByteArrayArrayArray2[Static420.anInt7829][arg2][arg4] == local14) {
			return false;
		} else if ((Static232.aByteArrayArrayArray18[Static420.anInt7829][arg2][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(44) byte local44 = 0;
			Static247.anIntArray453[0] = arg2;
			@Pc(50) int local50 = 0;
			@Pc(53) int local53 = local44 + 1;
			Static29.anIntArray130[0] = arg4;
			Static58.aByteArrayArrayArray2[Static420.anInt7829][arg2][arg4] = local14;
			while (local53 != local50) {
				@Pc(71) int local71 = Static247.anIntArray453[local50] & 0xFFFF;
				@Pc(79) int local79 = Static247.anIntArray453[local50] >> 16 & 0xFF;
				@Pc(87) int local87 = Static247.anIntArray453[local50] >> 24 & 0xFF;
				@Pc(93) int local93 = Static29.anIntArray130[local50] & 0xFFFF;
				@Pc(101) int local101 = Static29.anIntArray130[local50] >> 16 & 0xFF;
				local50 = local50 + 1 & 0xFFF;
				@Pc(109) boolean local109 = false;
				if ((Static232.aByteArrayArrayArray18[Static420.anInt7829][local71][local93] & 0x4) == 0) {
					local109 = true;
				}
				@Pc(126) boolean local126 = false;
				@Pc(168) int local168;
				@Pc(211) int local211;
				label231: for (@Pc(130) int local130 = Static420.anInt7829 + 1; local130 <= 3; local130++) {
					if ((Static232.aByteArrayArrayArray18[local130][local71][local93] & 0x8) == 0) {
						@Pc(306) Class6_Sub1 local306;
						@Pc(316) int local316;
						@Pc(295) Class290 local295;
						@Pc(301) Class98 local301;
						if (local109 && arg3[local130][local71][local93] != null) {
							if (arg3[local130][local71][local93].aClass6_Sub2_2 != null) {
								local168 = Static66.method1327(local79);
								if (local168 == arg3[local130][local71][local93].aClass6_Sub2_2.anInt9382 || arg3[local130][local71][local93].aClass6_Sub2_3 != null && arg3[local130][local71][local93].aClass6_Sub2_3.anInt9382 == local168) {
									continue;
								}
								if (local87 != 0) {
									local211 = Static66.method1327(local87);
									if (local211 == arg3[local130][local71][local93].aClass6_Sub2_2.anInt9382 || arg3[local130][local71][local93].aClass6_Sub2_3 != null && local211 == arg3[local130][local71][local93].aClass6_Sub2_3.anInt9382) {
										continue;
									}
								}
								if (local101 != 0) {
									local211 = Static66.method1327(local101);
									if (arg3[local130][local71][local93].aClass6_Sub2_2.anInt9382 == local211 || arg3[local130][local71][local93].aClass6_Sub2_3 != null && local211 == arg3[local130][local71][local93].aClass6_Sub2_3.anInt9382) {
										continue;
									}
								}
							}
							local295 = arg3[local130][local71][local93];
							if (local295.aClass98_3 != null) {
								for (local301 = local295.aClass98_3; local301 != null; local301 = local301.aClass98_1) {
									local306 = local301.aClass6_Sub1_1;
									if (local306 instanceof Interface15) {
										@Pc(312) Interface15 local312 = (Interface15) local306;
										local316 = local312.method7761();
										@Pc(320) int local320 = local312.method7764();
										if (local316 == 21) {
											local316 = 19;
										}
										@Pc(333) int local333 = local316 | local320 << 6;
										if (local79 == local333 || local87 != 0 && local87 == local333 || local101 != 0 && local101 == local333) {
											continue label231;
										}
									}
								}
							}
						}
						local295 = arg3[local130][local71][local93];
						if (local295 != null && local295.aClass98_3 != null) {
							for (local301 = local295.aClass98_3; local301 != null; local301 = local301.aClass98_1) {
								local306 = local301.aClass6_Sub1_1;
								if (local306.aShort123 != local306.aShort122 || local306.aShort121 != local306.aShort120) {
									for (@Pc(398) int local398 = local306.aShort123; local398 <= local306.aShort122; local398++) {
										for (local316 = local306.aShort120; local316 <= local306.aShort121; local316++) {
											Static58.aByteArrayArrayArray2[local130][local398][local316] = local14;
										}
									}
								}
							}
						}
						Static58.aByteArrayArrayArray2[local130][local71][local93] = local14;
						local126 = true;
					}
				}
				if (local126) {
					local168 = Static511.aClass52Array3[Static420.anInt7829 + 1].JA(local71, local93);
					if (local168 > Static42.anIntArray135[arg0]) {
						Static42.anIntArray135[arg0] = local168;
					}
					local211 = local71 << 9;
					@Pc(478) int local478 = local93 << 9;
					if (Static526.anIntArray769[arg0] > local211) {
						Static526.anIntArray769[arg0] = local211;
					} else if (local211 > Static188.anIntArray401[arg0]) {
						Static188.anIntArray401[arg0] = local211;
					}
					if (Static227.anIntArray437[arg0] > local478) {
						Static227.anIntArray437[arg0] = local478;
					} else if (local478 > Static142.anIntArray281[arg0]) {
						Static142.anIntArray281[arg0] = local478;
					}
				}
				if (!local109) {
					if (local71 >= 1 && Static58.aByteArrayArrayArray2[Static420.anInt7829][local71 - 1][local93] != local14) {
						Static247.anIntArray453[local53] = local71 - 1 | 0x120000 | 0xD3000000;
						Static29.anIntArray130[local53] = local93 | 0x130000;
						local53 = local53 + 1 & 0xFFF;
						Static58.aByteArrayArrayArray2[Static420.anInt7829][local71 - 1][local93] = local14;
					}
					@Pc(575) int local575 = ~Static549.anInt9482;
					local93++;
					if (local575 < ~local93) {
						if (local71 - 1 >= 0 && local14 != Static58.aByteArrayArrayArray2[Static420.anInt7829][local71 - 1][local93] && (Static232.aByteArrayArrayArray18[Static420.anInt7829][local71][local93] & 0x4) == 0 && (Static232.aByteArrayArrayArray18[Static420.anInt7829][local71 - 1][local93 - 1] & 0x4) == 0) {
							Static247.anIntArray453[local53] = local71 - 1 | 0x120000 | 0x52000000;
							Static29.anIntArray130[local53] = local93 | 0x130000;
							Static58.aByteArrayArrayArray2[Static420.anInt7829][local71 - 1][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
						if (Static58.aByteArrayArrayArray2[Static420.anInt7829][local71][local93] != local14) {
							Static247.anIntArray453[local53] = 0x13000000 | 0x520000 | local71;
							Static29.anIntArray130[local53] = local93 | 0x530000;
							Static58.aByteArrayArrayArray2[Static420.anInt7829][local71][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
						if (Static118.anInt2527 > local71 + 1 && local14 != Static58.aByteArrayArrayArray2[Static420.anInt7829][local71 + 1][local93] && (Static232.aByteArrayArrayArray18[Static420.anInt7829][local71][local93] & 0x4) == 0 && (Static232.aByteArrayArrayArray18[Static420.anInt7829][local71 + 1][local93 - 1] & 0x4) == 0) {
							Static247.anIntArray453[local53] = local71 + 1 | 0x92000000 | 0x520000;
							Static29.anIntArray130[local53] = local93 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static58.aByteArrayArrayArray2[Static420.anInt7829][local71 + 1][local93] = local14;
						}
					}
					local93--;
					if (Static118.anInt2527 > local71 + 1 && Static58.aByteArrayArrayArray2[Static420.anInt7829][local71 + 1][local93] != local14) {
						Static247.anIntArray453[local53] = local71 + 1 | 0x920000 | 0x53000000;
						Static29.anIntArray130[local53] = local93 | 0x930000;
						local53 = local53 + 1 & 0xFFF;
						Static58.aByteArrayArrayArray2[Static420.anInt7829][local71 + 1][local93] = local14;
					}
					local93--;
					if (local93 >= 0) {
						if (local71 - 1 >= 0 && local14 != Static58.aByteArrayArrayArray2[Static420.anInt7829][local71 - 1][local93] && (Static232.aByteArrayArrayArray18[Static420.anInt7829][local71][local93] & 0x4) == 0 && (Static232.aByteArrayArrayArray18[Static420.anInt7829][local71 - 1][local93 + 1] & 0x4) == 0) {
							Static247.anIntArray453[local53] = 0x12000000 | 0xD20000 | local71 - 1;
							Static29.anIntArray130[local53] = local93 | 0xD30000;
							Static58.aByteArrayArrayArray2[Static420.anInt7829][local71 - 1][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local14 != Static58.aByteArrayArrayArray2[Static420.anInt7829][local71][local93]) {
							Static247.anIntArray453[local53] = 0x93000000 | 0xD20000 | local71;
							Static29.anIntArray130[local53] = local93 | 0xD30000;
							local53 = local53 + 1 & 0xFFF;
							Static58.aByteArrayArrayArray2[Static420.anInt7829][local71][local93] = local14;
						}
						if (Static118.anInt2527 > local71 + 1 && Static58.aByteArrayArrayArray2[Static420.anInt7829][local71 + 1][local93] != local14 && (Static232.aByteArrayArrayArray18[Static420.anInt7829][local71][local93] & 0x4) == 0 && (Static232.aByteArrayArrayArray18[Static420.anInt7829][local71 + 1][local93 + 1] & 0x4) == 0) {
							Static247.anIntArray453[local53] = 0xD2000000 | 0x920000 | local71 + 1;
							Static29.anIntArray130[local53] = local93 | 0x930000;
							Static58.aByteArrayArrayArray2[Static420.anInt7829][local71 + 1][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static42.anIntArray135[arg0] != -1000000) {
				Static42.anIntArray135[arg0] += 10;
				Static526.anIntArray769[arg0] -= 50;
				Static188.anIntArray401[arg0] += 50;
				Static142.anIntArray281[arg0] += 50;
				Static227.anIntArray437[arg0] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!kea;I)V")
	public static void method7386(@OriginalArg(0) Class161 arg0) {
		Static351.aClass161_69 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIZ)V")
	public static void method7388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static83.anInt1817 = arg2;
		Static200.anInt9267 = arg1;
		Static149.anInt2991 = arg3;
		Static72.anInt1604 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!kr;II)V")
	public static void method7389(@OriginalArg(0) Class3_Sub27_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(17) boolean local17 = arg0.method4536(1) == 1;
		if (local17) {
			Static345.anIntArray563[Static336.anInt6336++] = arg1;
		}
		@Pc(32) int local32 = arg0.method4536(2);
		@Pc(36) Class6_Sub1_Sub2_Sub1 local36 = Static498.aClass6_Sub1_Sub2_Sub1Array1[arg1];
		if (local32 != 0) {
			@Pc(144) int local144;
			@Pc(149) int local149;
			@Pc(154) int local154;
			if (local32 == 1) {
				local144 = arg0.method4536(3);
				local149 = local36.anIntArray733[0];
				local154 = local36.anIntArray734[0];
				if (local144 == 0) {
					local149--;
					local154--;
				} else if (local144 == 1) {
					local154--;
				} else if (local144 == 2) {
					local154--;
					local149++;
				} else if (local144 == 3) {
					local149--;
				} else if (local144 == 4) {
					local149++;
				} else if (local144 == 5) {
					local149--;
					local154++;
				} else if (local144 == 6) {
					local154++;
				} else if (local144 == 7) {
					local149++;
					local154++;
				}
				if (local17) {
					local36.anInt2308 = local154;
					local36.anInt2283 = local149;
					local36.aBoolean164 = true;
				} else {
					local36.method2053(local149, local154, Static459.aByteArray96[arg1]);
				}
			} else if (local32 == 2) {
				local144 = arg0.method4536(4);
				local149 = local36.anIntArray733[0];
				local154 = local36.anIntArray734[0];
				if (local144 == 0) {
					local149 -= 2;
					local154 -= 2;
				} else if (local144 == 1) {
					local149--;
					local154 -= 2;
				} else if (local144 == 2) {
					local154 -= 2;
				} else if (local144 == 3) {
					local154 -= 2;
					local149++;
				} else if (local144 == 4) {
					local154 -= 2;
					local149 += 2;
				} else if (local144 == 5) {
					local154--;
					local149 -= 2;
				} else if (local144 == 6) {
					local154--;
					local149 += 2;
				} else if (local144 == 7) {
					local149 -= 2;
				} else if (local144 == 8) {
					local149 += 2;
				} else if (local144 == 9) {
					local154++;
					local149 -= 2;
				} else if (local144 == 10) {
					local149 += 2;
					local154++;
				} else if (local144 == 11) {
					local149 -= 2;
					local154 += 2;
				} else if (local144 == 12) {
					local149--;
					local154 += 2;
				} else if (local144 == 13) {
					local154 += 2;
				} else if (local144 == 14) {
					local154 += 2;
					local149++;
				} else if (local144 == 15) {
					local149 += 2;
					local154 += 2;
				}
				if (local17) {
					local36.aBoolean164 = true;
					local36.anInt2283 = local149;
					local36.anInt2308 = local154;
				} else {
					local36.method2053(local149, local154, Static459.aByteArray96[arg1]);
				}
			} else {
				local144 = arg0.method4536(1);
				@Pc(423) int local423;
				@Pc(431) int local431;
				@Pc(443) int local443;
				@Pc(451) int local451;
				if (local144 == 0) {
					local149 = arg0.method4536(12);
					local154 = local149 >> 10;
					local423 = local149 >> 5 & 0x1F;
					if (local423 > 15) {
						local423 -= 32;
					}
					local431 = local149 & 0x1F;
					if (local431 > 15) {
						local431 -= 32;
					}
					local443 = local36.anIntArray733[0] + local423;
					local451 = local36.anIntArray734[0] + local431;
					if (local17) {
						local36.anInt2308 = local451;
						local36.aBoolean164 = true;
						local36.anInt2283 = local443;
					} else {
						local36.method2053(local443, local451, Static459.aByteArray96[arg1]);
					}
					local36.aByte100 = (byte) (local36.aByte100 + local154 & 0x3);
					if (Static342.anInt6448 == arg1) {
						Static420.anInt7829 = local36.aByte100;
					}
				} else {
					local149 = arg0.method4536(30);
					local154 = local149 >> 28;
					local423 = local149 >> 14 & 0x3FFF;
					local431 = local149 & 0x3FFF;
					local443 = (local36.anIntArray733[0] + Static223.anInt4827 + local423 & 0x3FFF) - Static223.anInt4827;
					local451 = (Static150.anInt3027 + local36.anIntArray734[0] + local431 & 0x3FFF) - Static150.anInt3027;
					if (local17) {
						local36.aBoolean164 = true;
						local36.anInt2308 = local451;
						local36.anInt2283 = local443;
					} else {
						local36.method2053(local443, local451, Static459.aByteArray96[arg1]);
					}
					local36.aByte100 = (byte) (local36.aByte100 + local154 & 0x3);
					if (arg1 == Static342.anInt6448) {
						Static420.anInt7829 = local36.aByte100;
					}
				}
			}
		} else if (local17) {
			local36.aBoolean164 = false;
		} else if (Static342.anInt6448 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(60) Class89 local60 = Static462.aClass89Array1[arg1] = new Class89();
			local60.anInt2756 = (local36.anIntArray734[0] + Static150.anInt3027 >> 6) + (local36.anIntArray733[0] + Static223.anInt4827 >> 6 << 14) + (local36.aByte100 << 28);
			if (local36.anInt2290 == -1) {
				local60.anInt2754 = local36.aClass173_7.method4694();
			} else {
				local60.anInt2754 = local36.anInt2290;
			}
			local60.anInt2755 = local36.anInt8563;
			local60.aBoolean203 = local36.aBoolean165;
			if (local36.anInt2317 > 0) {
				Static366.method5734(local36);
			}
			Static498.aClass6_Sub1_Sub2_Sub1Array1[arg1] = null;
			if (arg0.method4536(1) != 0) {
				Static441.method6651(arg1, arg0);
			}
		}
	}
}
