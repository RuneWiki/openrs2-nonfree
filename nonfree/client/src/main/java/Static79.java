import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
	public static int anInt1139;

	@OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
	public static int anInt1140;

	@OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
	public static int anInt1141;

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "Lclient!vha;")
	public static final Class368 aClass368_1 = new Class368("WIP", 2);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "([[[Lclient!mf;ZIIII)Z")
	public static boolean method1036(@OriginalArg(0) Class226[][][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(20) byte local20 = arg1 ? 1 : (byte) (Static349.anInt6360 & 0xFF);
		if (local20 == Static104.aByteArrayArrayArray5[Static481.anInt8082][arg3][arg2]) {
			return false;
		} else if ((Static7.aByteArrayArrayArray1[Static481.anInt8082][arg3][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(48) byte local48 = 0;
			@Pc(50) int local50 = 0;
			Static199.anIntArray187[0] = arg3;
			@Pc(57) int local57 = local48 + 1;
			Static227.anIntArray212[0] = arg2;
			Static104.aByteArrayArrayArray5[Static481.anInt8082][arg3][arg2] = local20;
			while (local57 != local50) {
				@Pc(74) int local74 = Static199.anIntArray187[local50] & 0xFFFF;
				@Pc(82) int local82 = Static199.anIntArray187[local50] >> 16 & 0xFF;
				@Pc(90) int local90 = Static199.anIntArray187[local50] >> 24 & 0xFF;
				@Pc(96) int local96 = Static227.anIntArray212[local50] & 0xFFFF;
				@Pc(104) int local104 = Static227.anIntArray212[local50] >> 16 & 0xFF;
				local50 = local50 + 1 & 0xFFF;
				@Pc(112) boolean local112 = false;
				if ((Static7.aByteArrayArrayArray1[Static481.anInt8082][local74][local96] & 0x4) == 0) {
					local112 = true;
				}
				@Pc(129) boolean local129 = false;
				@Pc(135) int local135;
				@Pc(173) int local173;
				@Pc(218) int local218;
				if (arg0 != null) {
					label237: for (local135 = Static481.anInt8082 + 1; local135 <= 3; local135++) {
						if (arg0[local135] != null && (Static7.aByteArrayArrayArray1[local135][local74][local96] & 0x8) == 0) {
							@Pc(317) Class28_Sub1_Sub4 local317;
							@Pc(327) int local327;
							@Pc(307) Class226 local307;
							@Pc(313) Class41 local313;
							if (local112 && arg0[local135][local74][local96] != null) {
								if (arg0[local135][local74][local96].aClass28_Sub1_Sub5_2 != null) {
									local173 = Static23.method290(local82);
									if (arg0[local135][local74][local96].aClass28_Sub1_Sub5_2.aShort59 == local173 || arg0[local135][local74][local96].aClass28_Sub1_Sub5_1 != null && local173 == arg0[local135][local74][local96].aClass28_Sub1_Sub5_1.aShort59) {
										continue;
									}
									if (local90 != 0) {
										local218 = Static23.method290(local90);
										if (arg0[local135][local74][local96].aClass28_Sub1_Sub5_2.aShort59 == local218 || arg0[local135][local74][local96].aClass28_Sub1_Sub5_1 != null && local218 == arg0[local135][local74][local96].aClass28_Sub1_Sub5_1.aShort59) {
											continue;
										}
									}
									if (local104 != 0) {
										local218 = Static23.method290(local104);
										if (arg0[local135][local74][local96].aClass28_Sub1_Sub5_2.aShort59 == local218 || arg0[local135][local74][local96].aClass28_Sub1_Sub5_1 != null && local218 == arg0[local135][local74][local96].aClass28_Sub1_Sub5_1.aShort59) {
											continue;
										}
									}
								}
								local307 = arg0[local135][local74][local96];
								if (local307.aClass41_3 != null) {
									for (local313 = local307.aClass41_3; local313 != null; local313 = local313.aClass41_2) {
										local317 = local313.aClass28_Sub1_Sub4_1;
										if (local317 instanceof Interface1) {
											@Pc(323) Interface1 local323 = (Interface1) local317;
											local327 = local323.method8984();
											@Pc(331) int local331 = local323.method8987();
											if (local327 == 21) {
												local327 = 19;
											}
											@Pc(344) int local344 = local331 << 6 | local327;
											if (local82 == local344 || local90 != 0 && local90 == local344 || local104 != 0 && local104 == local344) {
												continue label237;
											}
										}
									}
								}
							}
							local307 = arg0[local135][local74][local96];
							if (local307 != null && local307.aClass41_3 != null) {
								for (local313 = local307.aClass41_3; local313 != null; local313 = local313.aClass41_2) {
									local317 = local313.aClass28_Sub1_Sub4_1;
									if (local317.aShort122 != local317.aShort124 || local317.aShort123 != local317.aShort121) {
										for (@Pc(416) int local416 = local317.aShort124; local416 <= local317.aShort122; local416++) {
											for (local327 = local317.aShort121; local327 <= local317.aShort123; local327++) {
												Static104.aByteArrayArrayArray5[local135][local416][local327] = local20;
											}
										}
									}
								}
							}
							local129 = true;
							Static104.aByteArrayArrayArray5[local135][local74][local96] = local20;
						}
					}
				}
				if (local129) {
					local135 = Static495.aClass109Array4[Static481.anInt8082 + 1].method7695(local96, local74);
					if (local135 > Static416.anIntArray418[arg4]) {
						Static416.anIntArray418[arg4] = local135;
					}
					local173 = local74 << 9;
					local218 = local96 << 9;
					if (Static621.anIntArray558[arg4] > local173) {
						Static621.anIntArray558[arg4] = local173;
					} else if (local173 > Static678.anIntArray612[arg4]) {
						Static678.anIntArray612[arg4] = local173;
					}
					if (local218 < Static234.anIntArray216[arg4]) {
						Static234.anIntArray216[arg4] = local218;
					} else if (Static595.anIntArray539[arg4] < local218) {
						Static595.anIntArray539[arg4] = local218;
					}
				}
				if (!local112) {
					if (local74 >= 1 && local20 != Static104.aByteArrayArrayArray5[Static481.anInt8082][local74 - 1][local96]) {
						Static199.anIntArray187[local57] = local74 - 1 | 0x120000 | 0xD3000000;
						Static227.anIntArray212[local57] = local96 | 0x130000;
						Static104.aByteArrayArrayArray5[Static481.anInt8082][local74 - 1][local96] = local20;
						local57 = local57 + 1 & 0xFFF;
					}
					local96++;
					if (local96 < Static626.anInt10238) {
						if (local74 - 1 >= 0 && local20 != Static104.aByteArrayArrayArray5[Static481.anInt8082][local74 - 1][local96] && (Static7.aByteArrayArrayArray1[Static481.anInt8082][local74][local96] & 0x4) == 0 && (Static7.aByteArrayArrayArray1[Static481.anInt8082][local74 - 1][local96 - 1] & 0x4) == 0) {
							Static199.anIntArray187[local57] = 0x52000000 | 0x120000 | local74 - 1;
							Static227.anIntArray212[local57] = local96 | 0x130000;
							local57 = local57 + 1 & 0xFFF;
							Static104.aByteArrayArrayArray5[Static481.anInt8082][local74 - 1][local96] = local20;
						}
						if (Static104.aByteArrayArrayArray5[Static481.anInt8082][local74][local96] != local20) {
							Static199.anIntArray187[local57] = local74 | 0x520000 | 0x13000000;
							Static227.anIntArray212[local57] = local96 | 0x530000;
							Static104.aByteArrayArrayArray5[Static481.anInt8082][local74][local96] = local20;
							local57 = local57 + 1 & 0xFFF;
						}
						if (Static201.anInt3834 > local74 + 1 && local20 != Static104.aByteArrayArrayArray5[Static481.anInt8082][local74 + 1][local96] && (Static7.aByteArrayArrayArray1[Static481.anInt8082][local74][local96] & 0x4) == 0 && (Static7.aByteArrayArrayArray1[Static481.anInt8082][local74 + 1][local96 - 1] & 0x4) == 0) {
							Static199.anIntArray187[local57] = local74 + 1 | 0x520000 | 0x92000000;
							Static227.anIntArray212[local57] = local96 | 0x530000;
							local57 = local57 + 1 & 0xFFF;
							Static104.aByteArrayArrayArray5[Static481.anInt8082][local74 + 1][local96] = local20;
						}
					}
					local96--;
					if (Static201.anInt3834 > local74 + 1 && Static104.aByteArrayArrayArray5[Static481.anInt8082][local74 + 1][local96] != local20) {
						Static199.anIntArray187[local57] = 0x53000000 | 0x920000 | local74 + 1;
						Static227.anIntArray212[local57] = local96 | 0x930000;
						local57 = local57 + 1 & 0xFFF;
						Static104.aByteArrayArrayArray5[Static481.anInt8082][local74 + 1][local96] = local20;
					}
					local96--;
					if (local96 >= 0) {
						if (local74 - 1 >= 0 && Static104.aByteArrayArrayArray5[Static481.anInt8082][local74 - 1][local96] != local20 && (Static7.aByteArrayArrayArray1[Static481.anInt8082][local74][local96] & 0x4) == 0 && (Static7.aByteArrayArrayArray1[Static481.anInt8082][local74 - 1][local96 + 1] & 0x4) == 0) {
							Static199.anIntArray187[local57] = 0x12000000 | 0xD20000 | local74 - 1;
							Static227.anIntArray212[local57] = local96 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static104.aByteArrayArrayArray5[Static481.anInt8082][local74 - 1][local96] = local20;
						}
						if (local20 != Static104.aByteArrayArrayArray5[Static481.anInt8082][local74][local96]) {
							Static199.anIntArray187[local57] = local74 | 0x93000000 | 0xD20000;
							Static227.anIntArray212[local57] = local96 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static104.aByteArrayArrayArray5[Static481.anInt8082][local74][local96] = local20;
						}
						if (Static201.anInt3834 > local74 + 1 && local20 != Static104.aByteArrayArrayArray5[Static481.anInt8082][local74 + 1][local96] && (Static7.aByteArrayArrayArray1[Static481.anInt8082][local74][local96] & 0x4) == 0 && (Static7.aByteArrayArrayArray1[Static481.anInt8082][local74 + 1][local96 + 1] & 0x4) == 0) {
							Static199.anIntArray187[local57] = local74 + 1 | 0x920000 | 0xD2000000;
							Static227.anIntArray212[local57] = local96 | 0x930000;
							local57 = local57 + 1 & 0xFFF;
							Static104.aByteArrayArrayArray5[Static481.anInt8082][local74 + 1][local96] = local20;
						}
					}
				}
			}
			if (Static416.anIntArray418[arg4] != -1000000) {
				Static416.anIntArray418[arg4] += 40;
				Static621.anIntArray558[arg4] -= 512;
				Static678.anIntArray612[arg4] += 512;
				Static595.anIntArray539[arg4] += 512;
				Static234.anIntArray216[arg4] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)V")
	public static void method1037() {
		Static137.aFont1 = null;
		Static336.anImage13 = null;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method1039(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		while (local9 < local12 && Static420.method7348(arg0.charAt(local9))) {
			local9++;
		}
		while (local9 < local12 && Static420.method7348(arg0.charAt(local12 - 1))) {
			local12--;
		}
		@Pc(45) int local45 = local12 - local9;
		if (local45 < 1 || local45 > 12) {
			return null;
		}
		@Pc(62) StringBuffer local62 = new StringBuffer(local45);
		for (@Pc(64) int local64 = local9; local64 < local12; local64++) {
			@Pc(69) char local69 = arg0.charAt(local64);
			if (Static52.method695(local69)) {
				@Pc(77) char local77 = Static548.method7633(local69);
				if (local77 != '\u0000') {
					local62.append(local77);
				}
			}
		}
		if (local62.length() == 0) {
			return null;
		} else {
			return local62.toString();
		}
	}
}
