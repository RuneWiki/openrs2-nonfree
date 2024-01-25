import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!bw", name = "w", descriptor = "Lclient!vr;")
	public static Class33 aClass33_2;

	@OriginalMember(owner = "client!bw", name = "C", descriptor = "I")
	public static int anInt1188;

	@OriginalMember(owner = "client!bw", name = "y", descriptor = "I")
	public static int anInt1186 = 0;

	@OriginalMember(owner = "client!bw", name = "z", descriptor = "Z")
	public static boolean aBoolean88 = false;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class3_Sub23 local7 = null;
		for (@Pc(16) Class3_Sub23 local16 = (Class3_Sub23) Static482.aClass338_192.method8177(); local16 != null; local16 = (Class3_Sub23) Static482.aClass338_192.method8168()) {
			if (local16.anInt3177 == arg1 && local16.anInt3189 == arg5 && local16.anInt3188 == arg4 && arg6 == local16.anInt3184) {
				local7 = local16;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class3_Sub23();
			local7.anInt3177 = arg1;
			local7.anInt3188 = arg4;
			local7.anInt3189 = arg5;
			local7.anInt3184 = arg6;
			if (arg5 >= 0 && arg4 >= 0 && arg5 < Static158.anInt927 && Static515.anInt8292 > arg4) {
				Static282.method4523(local7);
			}
			Static482.aClass338_192.method8171(local7);
		}
		local7.aBoolean247 = true;
		local7.anInt3190 = arg0;
		local7.anInt3179 = arg3;
		local7.anInt3181 = arg2;
		local7.aBoolean246 = false;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZII[[[Lclient!jd;I)Z")
	public static boolean method1242(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class164[][][] arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg1 ? 1 : (byte) (Static58.anInt1217 & 0xFF);
		if (local14 == Static302.aByteArrayArrayArray18[Static309.anInt5138][arg4][arg2]) {
			return false;
		} else if ((Static90.aByteArrayArrayArray25[Static309.anInt5138][arg4][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(39) byte local39 = 0;
			@Pc(41) int local41 = 0;
			Static467.anIntArray654[0] = arg4;
			@Pc(48) int local48 = local39 + 1;
			Static56.anIntArray99[0] = arg2;
			Static302.aByteArrayArrayArray18[Static309.anInt5138][arg4][arg2] = local14;
			while (local41 != local48) {
				@Pc(69) int local69 = Static467.anIntArray654[local41] & 0xFFFF;
				@Pc(77) int local77 = Static467.anIntArray654[local41] >> 16 & 0xFF;
				@Pc(85) int local85 = Static467.anIntArray654[local41] >> 24 & 0xFF;
				@Pc(91) int local91 = Static56.anIntArray99[local41] & 0xFFFF;
				@Pc(99) int local99 = Static56.anIntArray99[local41] >> 16 & 0xFF;
				local41 = local41 + 1 & 0xFFF;
				@Pc(107) boolean local107 = false;
				if ((Static90.aByteArrayArrayArray25[Static309.anInt5138][local69][local91] & 0x4) == 0) {
					local107 = true;
				}
				@Pc(121) boolean local121 = false;
				@Pc(127) int local127;
				@Pc(166) int local166;
				@Pc(209) int local209;
				if (arg3 != null) {
					label237: for (local127 = Static309.anInt5138 + 1; local127 <= 3; local127++) {
						if (arg3[local127] != null && (Static90.aByteArrayArrayArray25[local127][local69][local91] & 0x8) == 0) {
							@Pc(311) Class28_Sub1_Sub1 local311;
							@Pc(321) int local321;
							@Pc(300) Class164 local300;
							@Pc(306) Class125 local306;
							if (local107 && arg3[local127][local69][local91] != null) {
								if (arg3[local127][local69][local91].aClass28_Sub1_Sub4_2 != null) {
									local166 = Static144.method2636(local77);
									if (local166 == arg3[local127][local69][local91].aClass28_Sub1_Sub4_2.aShort104 || arg3[local127][local69][local91].aClass28_Sub1_Sub4_1 != null && arg3[local127][local69][local91].aClass28_Sub1_Sub4_1.aShort104 == local166) {
										continue;
									}
									if (local85 != 0) {
										local209 = Static144.method2636(local85);
										if (arg3[local127][local69][local91].aClass28_Sub1_Sub4_2.aShort104 == local209 || arg3[local127][local69][local91].aClass28_Sub1_Sub4_1 != null && arg3[local127][local69][local91].aClass28_Sub1_Sub4_1.aShort104 == local209) {
											continue;
										}
									}
									if (local99 != 0) {
										local209 = Static144.method2636(local99);
										if (arg3[local127][local69][local91].aClass28_Sub1_Sub4_2.aShort104 == local209 || arg3[local127][local69][local91].aClass28_Sub1_Sub4_1 != null && local209 == arg3[local127][local69][local91].aClass28_Sub1_Sub4_1.aShort104) {
											continue;
										}
									}
								}
								local300 = arg3[local127][local69][local91];
								if (local300.aClass125_2 != null) {
									for (local306 = local300.aClass125_2; local306 != null; local306 = local306.aClass125_1) {
										local311 = local306.aClass28_Sub1_Sub1_1;
										if (local311 instanceof Interface11) {
											@Pc(317) Interface11 local317 = (Interface11) local311;
											local321 = local317.method9216();
											@Pc(325) int local325 = local317.method9217();
											if (local321 == 21) {
												local321 = 19;
											}
											@Pc(336) int local336 = local325 << 6 | local321;
											if (local336 == local77 || local85 != 0 && local336 == local85 || local99 != 0 && local336 == local99) {
												continue label237;
											}
										}
									}
								}
							}
							local300 = arg3[local127][local69][local91];
							if (local300 != null && local300.aClass125_2 != null) {
								for (local306 = local300.aClass125_2; local306 != null; local306 = local306.aClass125_1) {
									local311 = local306.aClass28_Sub1_Sub1_1;
									if (local311.aShort124 != local311.aShort125 || local311.aShort122 != local311.aShort123) {
										for (@Pc(406) int local406 = local311.aShort125; local406 <= local311.aShort124; local406++) {
											for (local321 = local311.aShort123; local321 <= local311.aShort122; local321++) {
												Static302.aByteArrayArrayArray18[local127][local406][local321] = local14;
											}
										}
									}
								}
							}
							Static302.aByteArrayArrayArray18[local127][local69][local91] = local14;
							local121 = true;
						}
					}
				}
				if (local121) {
					local127 = Static121.aClass21Array2[Static309.anInt5138 + 1].method7973(local69, local91);
					if (local127 > Static401.anIntArray557[arg0]) {
						Static401.anIntArray557[arg0] = local127;
					}
					local166 = local69 << 9;
					if (Static287.anIntArray442[arg0] > local166) {
						Static287.anIntArray442[arg0] = local166;
					} else if (Static580.anIntArray805[arg0] < local166) {
						Static580.anIntArray805[arg0] = local166;
					}
					local209 = local91 << 9;
					if (Static158.anIntArray77[arg0] > local209) {
						Static158.anIntArray77[arg0] = local209;
					} else if (Static94.anIntArray148[arg0] < local209) {
						Static94.anIntArray148[arg0] = local209;
					}
				}
				if (!local107) {
					if (local69 >= 1 && Static302.aByteArrayArrayArray18[Static309.anInt5138][local69 - 1][local91] != local14) {
						Static467.anIntArray654[local48] = local69 - 1 | 0x120000 | 0xD3000000;
						Static56.anIntArray99[local48] = local91 | 0x130000;
						local48 = local48 + 1 & 0xFFF;
						Static302.aByteArrayArrayArray18[Static309.anInt5138][local69 - 1][local91] = local14;
					}
					@Pc(594) int local594 = ~Static515.anInt8292;
					local91++;
					if (local594 < ~local91) {
						if (local69 - 1 >= 0 && local14 != Static302.aByteArrayArrayArray18[Static309.anInt5138][local69 - 1][local91] && (Static90.aByteArrayArrayArray25[Static309.anInt5138][local69][local91] & 0x4) == 0 && (Static90.aByteArrayArrayArray25[Static309.anInt5138][local69 - 1][local91 - 1] & 0x4) == 0) {
							Static467.anIntArray654[local48] = 0x52000000 | 0x120000 | local69 - 1;
							Static56.anIntArray99[local48] = local91 | 0x130000;
							Static302.aByteArrayArrayArray18[Static309.anInt5138][local69 - 1][local91] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
						if (Static302.aByteArrayArrayArray18[Static309.anInt5138][local69][local91] != local14) {
							Static467.anIntArray654[local48] = 0x13000000 | 0x520000 | local69;
							Static56.anIntArray99[local48] = local91 | 0x530000;
							Static302.aByteArrayArrayArray18[Static309.anInt5138][local69][local91] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
						if (Static158.anInt927 > local69 + 1 && local14 != Static302.aByteArrayArrayArray18[Static309.anInt5138][local69 + 1][local91] && (Static90.aByteArrayArrayArray25[Static309.anInt5138][local69][local91] & 0x4) == 0 && (Static90.aByteArrayArrayArray25[Static309.anInt5138][local69 + 1][local91 - 1] & 0x4) == 0) {
							Static467.anIntArray654[local48] = local69 + 1 | 0x520000 | 0x92000000;
							Static56.anIntArray99[local48] = local91 | 0x530000;
							local48 = local48 + 1 & 0xFFF;
							Static302.aByteArrayArrayArray18[Static309.anInt5138][local69 + 1][local91] = local14;
						}
					}
					local91--;
					if (local69 + 1 < Static158.anInt927 && Static302.aByteArrayArrayArray18[Static309.anInt5138][local69 + 1][local91] != local14) {
						Static467.anIntArray654[local48] = local69 + 1 | 0x920000 | 0x53000000;
						Static56.anIntArray99[local48] = local91 | 0x930000;
						local48 = local48 + 1 & 0xFFF;
						Static302.aByteArrayArrayArray18[Static309.anInt5138][local69 + 1][local91] = local14;
					}
					local91--;
					if (local91 >= 0) {
						if (local69 - 1 >= 0 && Static302.aByteArrayArrayArray18[Static309.anInt5138][local69 - 1][local91] != local14 && (Static90.aByteArrayArrayArray25[Static309.anInt5138][local69][local91] & 0x4) == 0 && (Static90.aByteArrayArrayArray25[Static309.anInt5138][local69 - 1][local91 + 1] & 0x4) == 0) {
							Static467.anIntArray654[local48] = local69 - 1 | 0xD20000 | 0x12000000;
							Static56.anIntArray99[local48] = local91 | 0xD30000;
							Static302.aByteArrayArrayArray18[Static309.anInt5138][local69 - 1][local91] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
						if (Static302.aByteArrayArrayArray18[Static309.anInt5138][local69][local91] != local14) {
							Static467.anIntArray654[local48] = local69 | 0xD20000 | 0x93000000;
							Static56.anIntArray99[local48] = local91 | 0xD30000;
							local48 = local48 + 1 & 0xFFF;
							Static302.aByteArrayArrayArray18[Static309.anInt5138][local69][local91] = local14;
						}
						if (local69 + 1 < Static158.anInt927 && local14 != Static302.aByteArrayArrayArray18[Static309.anInt5138][local69 + 1][local91] && (Static90.aByteArrayArrayArray25[Static309.anInt5138][local69][local91] & 0x4) == 0 && (Static90.aByteArrayArrayArray25[Static309.anInt5138][local69 + 1][local91 + 1] & 0x4) == 0) {
							Static467.anIntArray654[local48] = local69 + 1 | 0xD2000000 | 0x920000;
							Static56.anIntArray99[local48] = local91 | 0x930000;
							Static302.aByteArrayArrayArray18[Static309.anInt5138][local69 + 1][local91] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static401.anIntArray557[arg0] != -1000000) {
				Static401.anIntArray557[arg0] += 40;
				Static287.anIntArray442[arg0] -= 512;
				Static580.anIntArray805[arg0] += 512;
				Static94.anIntArray148[arg0] += 512;
				Static158.anIntArray77[arg0] -= 512;
			}
			return true;
		}
	}
}
