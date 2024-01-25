import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
	public static int anInt1195;

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "[S")
	public static short[] aShortArray12 = new short[256];

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "Z")
	public static boolean aBoolean84 = false;

	@OriginalMember(owner = "client!cr", name = "n", descriptor = "Lclient!jk;")
	public static Class98 aClass98_1 = new Class98();

	@OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
	public static int anInt1196 = 64;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIILclient!ra;ZII)V")
	public static void method1043(@OriginalArg(0) int arg0, @OriginalArg(3) Class170 arg1, @OriginalArg(6) int arg2) {
		Static200.anInt5712 = 1;
		Static163.anInt3276 = 2;
		Static249.anInt4841 = arg0;
		Static27.anInt5261 = arg2;
		Static52.anInt1325 = 0;
		Static110.aClass170_48 = arg1;
		Static147.aBoolean216 = false;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIZ[[[Lclient!dn;II)Z")
	public static boolean method1044(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class51[][][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg1 ? 1 : (byte) (Static117.anInt2497 & 0xFF);
		if (Static293.aByteArrayArrayArray25[Static156.anInt3123][arg3][arg4] == local14) {
			return false;
		} else if ((Static32.aByteArrayArrayArray4[Static156.anInt3123][arg3][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(39) byte local39 = 0;
			Static28.anIntArray39[0] = arg3;
			@Pc(45) int local45 = 0;
			@Pc(48) int local48 = local39 + 1;
			Static70.anIntArray84[0] = arg4;
			Static293.aByteArrayArrayArray25[Static156.anInt3123][arg3][arg4] = local14;
			while (local45 != local48) {
				@Pc(71) int local71 = Static28.anIntArray39[local45] & 0xFFFF;
				@Pc(79) int local79 = Static28.anIntArray39[local45] >> 16 & 0xFF;
				@Pc(87) int local87 = Static28.anIntArray39[local45] >> 24 & 0xFF;
				@Pc(93) int local93 = Static70.anIntArray84[local45] & 0xFFFF;
				@Pc(101) int local101 = Static70.anIntArray84[local45] >> 16 & 0xFF;
				local45 = local45 + 1 & 0xFFF;
				@Pc(109) boolean local109 = false;
				if ((Static32.aByteArrayArrayArray4[Static156.anInt3123][local71][local93] & 0x4) == 0) {
					local109 = true;
				}
				@Pc(123) boolean local123 = false;
				@Pc(167) int local167;
				@Pc(213) int local213;
				label231: for (@Pc(127) int local127 = Static156.anInt3123 + 1; local127 <= 3; local127++) {
					if ((Static32.aByteArrayArrayArray4[local127][local71][local93] & 0x8) == 0) {
						@Pc(308) Class25_Sub1 local308;
						@Pc(318) int local318;
						@Pc(297) Class51 local297;
						@Pc(303) Class103 local303;
						if (local109 && arg2[local127][local71][local93] != null) {
							if (arg2[local127][local71][local93].aClass25_Sub2_1 != null) {
								local167 = Static60.method1249(local79);
								if (arg2[local127][local71][local93].aClass25_Sub2_1.anInt4336 == local167 || arg2[local127][local71][local93].aClass25_Sub2_2 != null && local167 == arg2[local127][local71][local93].aClass25_Sub2_2.anInt4336) {
									continue;
								}
								if (local87 != 0) {
									local213 = Static60.method1249(local87);
									if (local213 == arg2[local127][local71][local93].aClass25_Sub2_1.anInt4336 || arg2[local127][local71][local93].aClass25_Sub2_2 != null && local213 == arg2[local127][local71][local93].aClass25_Sub2_2.anInt4336) {
										continue;
									}
								}
								if (local101 != 0) {
									local213 = Static60.method1249(local101);
									if (local213 == arg2[local127][local71][local93].aClass25_Sub2_1.anInt4336 || arg2[local127][local71][local93].aClass25_Sub2_2 != null && arg2[local127][local71][local93].aClass25_Sub2_2.anInt4336 == local213) {
										continue;
									}
								}
							}
							local297 = arg2[local127][local71][local93];
							if (local297.aClass103_1 != null) {
								for (local303 = local297.aClass103_1; local303 != null; local303 = local303.aClass103_2) {
									local308 = local303.aClass25_Sub1_1;
									if (local308 instanceof Interface8) {
										@Pc(314) Interface8 local314 = (Interface8) local308;
										local318 = local314.method5554();
										@Pc(322) int local322 = local314.method5552();
										if (local318 == 21) {
											local318 = 19;
										}
										@Pc(335) int local335 = local322 << 6 | local318;
										if (local79 == local335 || local87 != 0 && local87 == local335 || local101 != 0 && local101 == local335) {
											continue label231;
										}
									}
								}
							}
						}
						local297 = arg2[local127][local71][local93];
						if (local297 != null && local297.aClass103_1 != null) {
							for (local303 = local297.aClass103_1; local303 != null; local303 = local303.aClass103_2) {
								local308 = local303.aClass25_Sub1_1;
								if (local308.aShort73 != local308.aShort76 || local308.aShort75 != local308.aShort74) {
									for (@Pc(404) int local404 = local308.aShort76; local404 <= local308.aShort73; local404++) {
										for (local318 = local308.aShort75; local318 <= local308.aShort74; local318++) {
											Static293.aByteArrayArrayArray25[local127][local404][local318] = local14;
										}
									}
								}
							}
						}
						Static293.aByteArrayArrayArray25[local127][local71][local93] = local14;
						local123 = true;
					}
				}
				if (local123) {
					local167 = Static130.aClass3Array2[Static156.anInt3123 + 1].method5638(local71, local93);
					if (Static28.anIntArray40[arg0] < local167) {
						Static28.anIntArray40[arg0] = local167;
					}
					local213 = local71 << 7;
					if (local213 < Static346.anIntArray555[arg0]) {
						Static346.anIntArray555[arg0] = local213;
					} else if (local213 > Static203.anIntArray285[arg0]) {
						Static203.anIntArray285[arg0] = local213;
					}
					@Pc(504) int local504 = local93 << 7;
					if (Static75.anIntArray97[arg0] > local504) {
						Static75.anIntArray97[arg0] = local504;
					} else if (Static302.anIntArray447[arg0] < local504) {
						Static302.anIntArray447[arg0] = local504;
					}
				}
				if (!local109) {
					if (local71 >= 1 && Static293.aByteArrayArrayArray25[Static156.anInt3123][local71 - 1][local93] != local14) {
						Static28.anIntArray39[local48] = local71 - 1 | 0x120000 | 0xD3000000;
						Static70.anIntArray84[local48] = local93 | 0x130000;
						local48 = local48 + 1 & 0xFFF;
						Static293.aByteArrayArrayArray25[Static156.anInt3123][local71 - 1][local93] = local14;
					}
					local93++;
					if (local93 < Static339.anInt6352) {
						if (local71 - 1 >= 0 && local14 != Static293.aByteArrayArrayArray25[Static156.anInt3123][local71 - 1][local93] && (Static32.aByteArrayArrayArray4[Static156.anInt3123][local71][local93] & 0x4) == 0 && (Static32.aByteArrayArrayArray4[Static156.anInt3123][local71 - 1][local93 - 1] & 0x4) == 0) {
							Static28.anIntArray39[local48] = local71 - 1 | 0x120000 | 0x52000000;
							Static70.anIntArray84[local48] = local93 | 0x130000;
							local48 = local48 + 1 & 0xFFF;
							Static293.aByteArrayArrayArray25[Static156.anInt3123][local71 - 1][local93] = local14;
						}
						if (Static293.aByteArrayArrayArray25[Static156.anInt3123][local71][local93] != local14) {
							Static28.anIntArray39[local48] = local71 | 0x520000 | 0x13000000;
							Static70.anIntArray84[local48] = local93 | 0x530000;
							Static293.aByteArrayArrayArray25[Static156.anInt3123][local71][local93] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
						if (Static266.anInt5101 > local71 + 1 && local14 != Static293.aByteArrayArrayArray25[Static156.anInt3123][local71 + 1][local93] && (Static32.aByteArrayArrayArray4[Static156.anInt3123][local71][local93] & 0x4) == 0 && (Static32.aByteArrayArrayArray4[Static156.anInt3123][local71 + 1][local93 - 1] & 0x4) == 0) {
							Static28.anIntArray39[local48] = 0x92000000 | 0x520000 | local71 + 1;
							Static70.anIntArray84[local48] = local93 | 0x530000;
							local48 = local48 + 1 & 0xFFF;
							Static293.aByteArrayArrayArray25[Static156.anInt3123][local71 + 1][local93] = local14;
						}
					}
					local93--;
					if (Static266.anInt5101 > local71 + 1 && Static293.aByteArrayArrayArray25[Static156.anInt3123][local71 + 1][local93] != local14) {
						Static28.anIntArray39[local48] = 0x53000000 | 0x920000 | local71 + 1;
						Static70.anIntArray84[local48] = local93 | 0x930000;
						local48 = local48 + 1 & 0xFFF;
						Static293.aByteArrayArrayArray25[Static156.anInt3123][local71 + 1][local93] = local14;
					}
					local93--;
					if (local93 >= 0) {
						if (local71 - 1 >= 0 && Static293.aByteArrayArrayArray25[Static156.anInt3123][local71 - 1][local93] != local14 && (Static32.aByteArrayArrayArray4[Static156.anInt3123][local71][local93] & 0x4) == 0 && (Static32.aByteArrayArrayArray4[Static156.anInt3123][local71 - 1][local93 + 1] & 0x4) == 0) {
							Static28.anIntArray39[local48] = local71 - 1 | 0xD20000 | 0x12000000;
							Static70.anIntArray84[local48] = local93 | 0xD30000;
							Static293.aByteArrayArrayArray25[Static156.anInt3123][local71 - 1][local93] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
						if (Static293.aByteArrayArrayArray25[Static156.anInt3123][local71][local93] != local14) {
							Static28.anIntArray39[local48] = local71 | 0xD20000 | 0x93000000;
							Static70.anIntArray84[local48] = local93 | 0xD30000;
							Static293.aByteArrayArrayArray25[Static156.anInt3123][local71][local93] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
						if (Static266.anInt5101 > local71 + 1 && Static293.aByteArrayArrayArray25[Static156.anInt3123][local71 + 1][local93] != local14 && (Static32.aByteArrayArrayArray4[Static156.anInt3123][local71][local93] & 0x4) == 0 && (Static32.aByteArrayArrayArray4[Static156.anInt3123][local71 + 1][local93 + 1] & 0x4) == 0) {
							Static28.anIntArray39[local48] = local71 + 1 | 0x920000 | 0xD2000000;
							Static70.anIntArray84[local48] = local93 | 0x930000;
							Static293.aByteArrayArrayArray25[Static156.anInt3123][local71 + 1][local93] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static28.anIntArray40[arg0] != -1000000) {
				Static28.anIntArray40[arg0] += 10;
				Static346.anIntArray555[arg0] -= 50;
				Static203.anIntArray285[arg0] += 50;
				Static302.anIntArray447[arg0] += 50;
				Static75.anIntArray97[arg0] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(CII)I")
	public static int method1047(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local17 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local17 = 1762;
		}
		return local17;
	}
}
