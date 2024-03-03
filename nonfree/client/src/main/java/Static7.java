import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
	public static int anInt7227;

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "Lclient!bu;")
	public static Class29_Sub1 aClass29_Sub1_120;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!dg;IIIIIIIIII)Z", line = 21)
	public static boolean method6464(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg3;
		@Pc(18) int local18 = arg9 - 64;
		Class2_Sub3_Sub30.anIntArrayArray49[64][64] = 99;
		@Pc(28) int local28 = arg3 - 64;
		Class11_Sub1_Sub1.anIntArrayArray4[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Class37_Sub1.anIntArray90[0] = arg9;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Class14.anIntArray257[0] = arg3;
		@Pc(55) int[][] local55 = arg0.anIntArrayArray14;
		while (local50 != local47) {
			local7 = Class37_Sub1.anIntArray90[local47];
			local9 = Class14.anIntArray257[local47];
			@Pc(71) int local71 = local9 - arg0.anInt1482;
			local47 = local47 + 1 & 0xFFF;
			@Pc(82) int local82 = local9 - local28;
			@Pc(86) int local86 = local7 - local18;
			@Pc(92) int local92 = local7 - arg0.anInt1466;
			if (arg6 == -4) {
				if (local7 == arg5 && local9 == arg4) {
					Static170.anInt3418 = local9;
					Static172.anInt3431 = local7;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static23.method856(arg8, local9, arg4, local7, arg5, 1, arg1, 1)) {
					Static170.anInt3418 = local9;
					Static172.anInt3431 = local7;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg0.method1639(arg8, local7, arg4, 1, arg7, arg5, local9, 1, arg1)) {
					Static170.anInt3418 = local9;
					Static172.anInt3431 = local7;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg0.method1642(arg7, arg5, arg8, local7, arg4, arg1, local9, 1)) {
					Static172.anInt3431 = local7;
					Static170.anInt3418 = local9;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg0.method1631(1, arg5, arg6, arg4, arg2, local9, local7)) {
					Static172.anInt3431 = local7;
					Static170.anInt3418 = local9;
					return true;
				}
			} else if (arg0.method1632(arg2, 1, local9, local7, arg6, arg4, arg5)) {
				Static170.anInt3418 = local9;
				Static172.anInt3431 = local7;
				return true;
			}
			@Pc(236) int local236 = Class11_Sub1_Sub1.anIntArrayArray4[local86][local82] + 1;
			if (local86 > 0 && Class2_Sub3_Sub30.anIntArrayArray49[local86 - 1][local82] == 0 && (local55[local92 - 1][local71] & 0x42240000) == 0) {
				Class37_Sub1.anIntArray90[local50] = local7 - 1;
				Class14.anIntArray257[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Class2_Sub3_Sub30.anIntArrayArray49[local86 - 1][local82] = 2;
				Class11_Sub1_Sub1.anIntArrayArray4[local86 - 1][local82] = local236;
			}
			if (local86 < 127 && Class2_Sub3_Sub30.anIntArrayArray49[local86 + 1][local82] == 0 && (local55[local92 + 1][local71] & 0x60240000) == 0) {
				Class37_Sub1.anIntArray90[local50] = local7 + 1;
				Class14.anIntArray257[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Class2_Sub3_Sub30.anIntArrayArray49[local86 + 1][local82] = 8;
				Class11_Sub1_Sub1.anIntArrayArray4[local86 + 1][local82] = local236;
			}
			if (local82 > 0 && Class2_Sub3_Sub30.anIntArrayArray49[local86][local82 - 1] == 0 && (local55[local92][local71 - 1] & 0x40A40000) == 0) {
				Class37_Sub1.anIntArray90[local50] = local7;
				Class14.anIntArray257[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Class2_Sub3_Sub30.anIntArrayArray49[local86][local82 - 1] = 1;
				Class11_Sub1_Sub1.anIntArrayArray4[local86][local82 - 1] = local236;
			}
			if (local82 < 127 && Class2_Sub3_Sub30.anIntArrayArray49[local86][local82 + 1] == 0 && (local55[local92][local71 + 1] & 0x48240000) == 0) {
				Class37_Sub1.anIntArray90[local50] = local7;
				Class14.anIntArray257[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Class2_Sub3_Sub30.anIntArrayArray49[local86][local82 + 1] = 4;
				Class11_Sub1_Sub1.anIntArrayArray4[local86][local82 + 1] = local236;
			}
			if (local86 > 0 && local82 > 0 && Class2_Sub3_Sub30.anIntArrayArray49[local86 - 1][local82 - 1] == 0 && (local55[local92 - 1][local71 - 1] & 0x43A40000) == 0 && (local55[local92 - 1][local71] & 0x42240000) == 0 && (local55[local92][local71 - 1] & 0x40A40000) == 0) {
				Class37_Sub1.anIntArray90[local50] = local7 - 1;
				Class14.anIntArray257[local50] = local9 - 1;
				Class2_Sub3_Sub30.anIntArrayArray49[local86 - 1][local82 - 1] = 3;
				local50 = local50 + 1 & 0xFFF;
				Class11_Sub1_Sub1.anIntArrayArray4[local86 - 1][local82 - 1] = local236;
			}
			if (local86 < 127 && local82 > 0 && Class2_Sub3_Sub30.anIntArrayArray49[local86 + 1][local82 - 1] == 0 && (local55[local92 + 1][local71 - 1] & 0x60E40000) == 0 && (local55[local92 + 1][local71] & 0x60240000) == 0 && (local55[local92][local71 - 1] & 0x40A40000) == 0) {
				Class37_Sub1.anIntArray90[local50] = local7 + 1;
				Class14.anIntArray257[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Class2_Sub3_Sub30.anIntArrayArray49[local86 + 1][local82 - 1] = 9;
				Class11_Sub1_Sub1.anIntArrayArray4[local86 + 1][local82 - 1] = local236;
			}
			if (local86 > 0 && local82 < 127 && Class2_Sub3_Sub30.anIntArrayArray49[local86 - 1][local82 + 1] == 0 && (local55[local92 - 1][local71 + 1] & 0x4E240000) == 0 && (local55[local92 - 1][local71] & 0x42240000) == 0 && (local55[local92][local71 + 1] & 0x48240000) == 0) {
				Class37_Sub1.anIntArray90[local50] = local7 - 1;
				Class14.anIntArray257[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Class2_Sub3_Sub30.anIntArrayArray49[local86 - 1][local82 + 1] = 6;
				Class11_Sub1_Sub1.anIntArrayArray4[local86 - 1][local82 + 1] = local236;
			}
			if (local86 < 127 && local82 < 127 && Class2_Sub3_Sub30.anIntArrayArray49[local86 + 1][local82 + 1] == 0 && (local55[local92 + 1][local71 + 1] & 0x78240000) == 0 && (local55[local92 + 1][local71] & 0x60240000) == 0 && (local55[local92][local71 + 1] & 0x48240000) == 0) {
				Class37_Sub1.anIntArray90[local50] = local7 + 1;
				Class14.anIntArray257[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Class2_Sub3_Sub30.anIntArrayArray49[local86 + 1][local82 + 1] = 12;
				Class11_Sub1_Sub1.anIntArrayArray4[local86 + 1][local82 + 1] = local236;
			}
		}
		Static172.anInt3431 = local7;
		Static170.anInt3418 = local9;
		return false;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!qg;II)V", line = 264)
	public static void method6465(@OriginalArg(0) Class2_Sub4_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.method4869(1) == 1;
		if (local15) {
			Class2_Sub2_Sub5.anIntArray100[Class218.anInt6067++] = arg1;
		}
		@Pc(30) int local30 = arg0.method4869(2);
		@Pc(34) Class11_Sub5_Sub2_Sub1 local34 = Class9.aClass11_Sub5_Sub2_Sub1Array1[arg1];
		if (local30 != 0) {
			@Pc(136) int local136;
			@Pc(141) int local141;
			@Pc(146) int local146;
			if (local30 == 1) {
				local136 = arg0.method4869(3);
				local141 = local34.anIntArray316[0];
				local146 = local34.anIntArray317[0];
				if (local136 == 0) {
					local146--;
					local141--;
				} else if (local136 == 1) {
					local146--;
				} else if (local136 == 2) {
					local146--;
					local141++;
				} else if (local136 == 3) {
					local141--;
				} else if (local136 == 4) {
					local141++;
				} else if (local136 == 5) {
					local146++;
					local141--;
				} else if (local136 == 6) {
					local146++;
				} else if (local136 == 7) {
					local141++;
					local146++;
				}
				if (local15) {
					local34.anInt4163 = local141;
					local34.anInt4175 = local146;
					local34.aBoolean276 = true;
				} else {
					local34.method4069(local146, local141, Class222.aByteArray92[arg1]);
				}
			} else if (local30 == 2) {
				local136 = arg0.method4869(4);
				local141 = local34.anIntArray316[0];
				local146 = local34.anIntArray317[0];
				if (local136 == 0) {
					local141 -= 2;
					local146 -= 2;
				} else if (local136 == 1) {
					local141--;
					local146 -= 2;
				} else if (local136 == 2) {
					local146 -= 2;
				} else if (local136 == 3) {
					local141++;
					local146 -= 2;
				} else if (local136 == 4) {
					local141 += 2;
					local146 -= 2;
				} else if (local136 == 5) {
					local146--;
					local141 -= 2;
				} else if (local136 == 6) {
					local146--;
					local141 += 2;
				} else if (local136 == 7) {
					local141 -= 2;
				} else if (local136 == 8) {
					local141 += 2;
				} else if (local136 == 9) {
					local146++;
					local141 -= 2;
				} else if (local136 == 10) {
					local146++;
					local141 += 2;
				} else if (local136 == 11) {
					local141 -= 2;
					local146 += 2;
				} else if (local136 == 12) {
					local141--;
					local146 += 2;
				} else if (local136 == 13) {
					local146 += 2;
				} else if (local136 == 14) {
					local146 += 2;
					local141++;
				} else if (local136 == 15) {
					local146 += 2;
					local141 += 2;
				}
				if (local15) {
					local34.anInt4175 = local146;
					local34.aBoolean276 = true;
					local34.anInt4163 = local141;
				} else {
					local34.method4069(local146, local141, Class222.aByteArray92[arg1]);
				}
			} else {
				local136 = arg0.method4869(1);
				@Pc(411) int local411;
				@Pc(419) int local419;
				@Pc(432) int local432;
				@Pc(439) int local439;
				if (local136 == 0) {
					local141 = arg0.method4869(12);
					local146 = local141 >> 10;
					local411 = local141 >> 5 & 0x1F;
					if (local411 > 15) {
						local411 -= 32;
					}
					local419 = local141 & 0x1F;
					if (local419 > 15) {
						local419 -= 32;
					}
					local432 = local411 + local34.anIntArray316[0];
					local439 = local419 + local34.anIntArray317[0];
					if (local15) {
						local34.anInt4175 = local439;
						local34.aBoolean276 = true;
						local34.anInt4163 = local432;
					} else {
						local34.method4069(local439, local432, Class222.aByteArray92[arg1]);
					}
					local34.aByte78 = (byte) (local146 + local34.aByte78 & 0x3);
					if (arg1 == Class11_Sub3_Sub2.anInt4220) {
						Static330.anInt6573 = local34.aByte78;
					}
				} else {
					local141 = arg0.method4869(30);
					local146 = local141 >> 28;
					local411 = local141 >> 14 & 0x3FFF;
					local419 = local141 & 0x3FFF;
					local432 = (local411 + Static154.anInt3136 + local34.anIntArray316[0] & 0x3FFF) - Static154.anInt3136;
					local439 = (local34.anIntArray317[0] + Static139.anInt2716 + local419 & 0x3FFF) - Static139.anInt2716;
					if (local15) {
						local34.aBoolean276 = true;
						local34.anInt4175 = local439;
						local34.anInt4163 = local432;
					} else {
						local34.method4069(local439, local432, Class222.aByteArray92[arg1]);
					}
					local34.aByte78 = (byte) (local34.aByte78 + local146 & 0x3);
					if (Class11_Sub3_Sub2.anInt4220 == arg1) {
						Static330.anInt6573 = local34.aByte78;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean276 = false;
		} else if (arg1 == Class11_Sub3_Sub2.anInt4220) {
			throw new RuntimeException("s:lr");
		} else {
			Class2_Sub2_Sub10.anIntArray422[arg1] = (Static154.anInt3136 + local34.anIntArray316[0] >> 6 << 14) + (local34.aByte78 << 28) + (Static139.anInt2716 + local34.anIntArray317[0] >> 6);
			if (local34.anInt4168 == -1) {
				Class217.anIntArray410[arg1] = local34.aClass248_7.method6442();
			} else {
				Class217.anIntArray410[arg1] = local34.anInt4168;
			}
			Class11_Sub4_Sub1.anIntArray260[arg1] = local34.anInt4602;
			if (local34.anInt4176 > 0) {
				Static275.method2425(local34);
			}
			Class9.aClass11_Sub5_Sub2_Sub1Array1[arg1] = null;
			if (arg0.method4869(1) != 0) {
				Static360.method6034(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!nk;B)Lclient!nk;", line = 572)
	public static Class161 method6466(@OriginalArg(0) Class161 arg0) {
		if (arg0.anInt4268 != -1) {
			return Static6.method140(arg0.anInt4268);
		}
		@Pc(25) int local25 = arg0.anInt4310 >>> 16;
		@Pc(30) Class137 local30 = new Class137(Class2_Sub3_Sub34.aClass4_130);
		for (@Pc(35) Class2_Sub7 local35 = (Class2_Sub7) local30.method3562(); local35 != null; local35 = (Class2_Sub7) local30.method3561()) {
			if (local35.anInt1368 == local25) {
				return Static6.method140((int) local35.aLong232);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZI)I", line = 602)
	public static int method6467(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static99.method2237(4, arg0 + 45365, arg1 - -91923) + (Static99.method2237(2, arg0 + 10294, arg1 + 37821) - 128 >> 1) + (Static99.method2237(1, arg0, arg1) - 128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)Lclient!ac;", line = 625)
	public static Class3_Sub1 method6468(@OriginalArg(0) int arg0) {
		return Class55.aBoolean130 && arg0 >= Static350.anInt7029 && Static289.anInt5831 >= arg0 ? Static272.aClass3_Sub1Array1[arg0 - Static350.anInt7029] : null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V", line = 658)
	public static void method6470(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub2_Sub7 local12 = Static293.method5414(14, arg1);
		local12.method2313();
		local12.anInt2286 = arg0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!bh;IZ)V", line = 673)
	public static void method6471(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		if (Class162.aBoolean297) {
			Class162.aBoolean297 = false;
			arg1 = 0;
		}
		if (Static288.aClass21_2 != null && Static288.aClass21_2.method854(arg0)) {
			return;
		}
		Static288.aClass21_2 = arg0;
		Class1.aLong1 = Static190.method3686();
		Class2_Sub2_Sub5.anInt1392 = arg1;
		Class174.anInt4793 = arg1;
		if (Class174.anInt4793 != 0) {
			Static164.anInt3347 = Static339.anInt6804;
			Static330.anInt6553 = Static106.anInt2334;
			Static63.aFloat30 = Static147.aFloat34;
			Static95.aFloat40 = Static132.aFloat33;
			Static212.anInt4041 = Static92.anInt2092;
			Static316.aFloat75 = Static154.aFloat37;
			Static203.aFloat29 = Static322.aFloat76;
			Static75.aClass42_4 = Static23.aClass42_2;
			Static216.aFloat62 = Static294.aFloat73;
			Static179.aFloat39 = Static125.aFloat32;
			return;
		}
		Static131.method2625();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!nk;I)Z", line = 738)
	public static boolean method6473(@OriginalArg(0) Class161 arg0) {
		if (arg0.anInt4266 == Class124.anInt3406) {
			Class11_Sub3_Sub1.anInt1868 = 250;
			return true;
		} else {
			return false;
		}
	}
}
