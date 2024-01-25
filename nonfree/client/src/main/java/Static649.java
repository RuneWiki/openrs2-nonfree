import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static649 {

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "F")
	public static float aFloat207;

	@OriginalMember(owner = "client!ww", name = "n", descriptor = "I")
	public static int anInt10496;

	@OriginalMember(owner = "client!ww", name = "q", descriptor = "I")
	public static int anInt10498;

	@OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
	public static int anInt10495 = 0;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIZI[[[Lclient!ih;I)Z")
	public static boolean method8907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class156[][][] arg4) {
		@Pc(14) byte local14 = arg2 ? 1 : (byte) (Static92.anInt9992 & 0xFF);
		if (Static479.aByteArrayArrayArray21[Static299.anInt4751][arg3][arg1] == local14) {
			return false;
		} else if ((Static480.aByteArrayArrayArray19[Static299.anInt4751][arg3][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(39) byte local39 = 0;
			@Pc(41) int local41 = 0;
			Static19.anIntArray32[0] = arg3;
			@Pc(48) int local48 = local39 + 1;
			Static394.anIntArray546[0] = arg1;
			Static479.aByteArrayArrayArray21[Static299.anInt4751][arg3][arg1] = local14;
			while (local41 != local48) {
				@Pc(66) int local66 = Static19.anIntArray32[local41] & 0xFFFF;
				@Pc(74) int local74 = Static19.anIntArray32[local41] >> 16 & 0xFF;
				@Pc(82) int local82 = Static19.anIntArray32[local41] >> 24 & 0xFF;
				@Pc(88) int local88 = Static394.anIntArray546[local41] & 0xFFFF;
				@Pc(96) int local96 = Static394.anIntArray546[local41] >> 16 & 0xFF;
				local41 = local41 + 1 & 0xFFF;
				@Pc(104) boolean local104 = false;
				if ((Static480.aByteArrayArrayArray19[Static299.anInt4751][local66][local88] & 0x4) == 0) {
					local104 = true;
				}
				@Pc(121) boolean local121 = false;
				@Pc(127) int local127;
				@Pc(168) int local168;
				@Pc(217) int local217;
				if (arg4 != null) {
					label237: for (local127 = Static299.anInt4751 + 1; local127 <= 3; local127++) {
						if (arg4[local127] != null && (Static480.aByteArrayArrayArray19[local127][local66][local88] & 0x8) == 0) {
							@Pc(319) Class14_Sub1_Sub1 local319;
							@Pc(329) int local329;
							@Pc(308) Class156 local308;
							@Pc(314) Class66 local314;
							if (local104 && arg4[local127][local66][local88] != null) {
								if (arg4[local127][local66][local88].aClass14_Sub1_Sub3_1 != null) {
									local168 = Static263.method4005(local74);
									if (local168 == arg4[local127][local66][local88].aClass14_Sub1_Sub3_1.aShort115 || arg4[local127][local66][local88].aClass14_Sub1_Sub3_2 != null && arg4[local127][local66][local88].aClass14_Sub1_Sub3_2.aShort115 == local168) {
										continue;
									}
									if (local82 != 0) {
										local217 = Static263.method4005(local82);
										if (local217 == arg4[local127][local66][local88].aClass14_Sub1_Sub3_1.aShort115 || arg4[local127][local66][local88].aClass14_Sub1_Sub3_2 != null && local217 == arg4[local127][local66][local88].aClass14_Sub1_Sub3_2.aShort115) {
											continue;
										}
									}
									if (local96 != 0) {
										local217 = Static263.method4005(local96);
										if (arg4[local127][local66][local88].aClass14_Sub1_Sub3_1.aShort115 == local217 || arg4[local127][local66][local88].aClass14_Sub1_Sub3_2 != null && arg4[local127][local66][local88].aClass14_Sub1_Sub3_2.aShort115 == local217) {
											continue;
										}
									}
								}
								local308 = arg4[local127][local66][local88];
								if (local308.aClass66_2 != null) {
									for (local314 = local308.aClass66_2; local314 != null; local314 = local314.aClass66_1) {
										local319 = local314.aClass14_Sub1_Sub1_1;
										if (local319 instanceof Interface20) {
											@Pc(325) Interface20 local325 = (Interface20) local319;
											local329 = local325.method8015();
											if (local329 == 21) {
												local329 = 19;
											}
											@Pc(340) int local340 = local325.method8012();
											@Pc(346) int local346 = local340 << 6 | local329;
											if (local74 == local346 || local82 != 0 && local346 == local82 || local96 != 0 && local96 == local346) {
												continue label237;
											}
										}
									}
								}
							}
							local308 = arg4[local127][local66][local88];
							if (local308 != null && local308.aClass66_2 != null) {
								for (local314 = local308.aClass66_2; local314 != null; local314 = local314.aClass66_1) {
									local319 = local314.aClass14_Sub1_Sub1_1;
									if (local319.aShort74 != local319.aShort73 || local319.aShort72 != local319.aShort71) {
										for (@Pc(412) int local412 = local319.aShort74; local412 <= local319.aShort73; local412++) {
											for (local329 = local319.aShort71; local329 <= local319.aShort72; local329++) {
												Static479.aByteArrayArrayArray21[local127][local412][local329] = local14;
											}
										}
									}
								}
							}
							local121 = true;
							Static479.aByteArrayArrayArray21[local127][local66][local88] = local14;
						}
					}
				}
				if (local121) {
					local127 = Static299.aClass40Array1[Static299.anInt4751 + 1].method8442(local66, local88);
					if (Static352.anIntArray488[arg0] < local127) {
						Static352.anIntArray488[arg0] = local127;
					}
					local168 = local66 << 9;
					if (Static200.anIntArray291[arg0] > local168) {
						Static200.anIntArray291[arg0] = local168;
					} else if (Static368.anIntArray509[arg0] < local168) {
						Static368.anIntArray509[arg0] = local168;
					}
					local217 = local88 << 9;
					if (local217 < Static131.anIntArray174[arg0]) {
						Static131.anIntArray174[arg0] = local217;
					} else if (Static606.anIntArray803[arg0] < local217) {
						Static606.anIntArray803[arg0] = local217;
					}
				}
				if (!local104) {
					if (local66 >= 1 && local14 != Static479.aByteArrayArrayArray21[Static299.anInt4751][local66 - 1][local88]) {
						Static19.anIntArray32[local48] = local66 - 1 | 0x120000 | 0xD3000000;
						Static394.anIntArray546[local48] = local88 | 0x130000;
						Static479.aByteArrayArrayArray21[Static299.anInt4751][local66 - 1][local88] = local14;
						local48 = local48 + 1 & 0xFFF;
					}
					local88++;
					if (Static279.anInt4567 > local88) {
						if (local66 - 1 >= 0 && local14 != Static479.aByteArrayArrayArray21[Static299.anInt4751][local66 - 1][local88] && (Static480.aByteArrayArrayArray19[Static299.anInt4751][local66][local88] & 0x4) == 0 && (Static480.aByteArrayArrayArray19[Static299.anInt4751][local66 - 1][local88 - 1] & 0x4) == 0) {
							Static19.anIntArray32[local48] = local66 - 1 | 0x120000 | 0x52000000;
							Static394.anIntArray546[local48] = local88 | 0x130000;
							local48 = local48 + 1 & 0xFFF;
							Static479.aByteArrayArrayArray21[Static299.anInt4751][local66 - 1][local88] = local14;
						}
						if (local14 != Static479.aByteArrayArrayArray21[Static299.anInt4751][local66][local88]) {
							Static19.anIntArray32[local48] = local66 | 0x520000 | 0x13000000;
							Static394.anIntArray546[local48] = local88 | 0x530000;
							Static479.aByteArrayArrayArray21[Static299.anInt4751][local66][local88] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
						if (Static111.anInt1752 > local66 + 1 && local14 != Static479.aByteArrayArrayArray21[Static299.anInt4751][local66 + 1][local88] && (Static480.aByteArrayArrayArray19[Static299.anInt4751][local66][local88] & 0x4) == 0 && (Static480.aByteArrayArrayArray19[Static299.anInt4751][local66 + 1][local88 - 1] & 0x4) == 0) {
							Static19.anIntArray32[local48] = local66 + 1 | 0x520000 | 0x92000000;
							Static394.anIntArray546[local48] = local88 | 0x530000;
							local48 = local48 + 1 & 0xFFF;
							Static479.aByteArrayArrayArray21[Static299.anInt4751][local66 + 1][local88] = local14;
						}
					}
					local88--;
					if (Static111.anInt1752 > local66 + 1 && local14 != Static479.aByteArrayArrayArray21[Static299.anInt4751][local66 + 1][local88]) {
						Static19.anIntArray32[local48] = 0x53000000 | 0x920000 | local66 + 1;
						Static394.anIntArray546[local48] = local88 | 0x930000;
						Static479.aByteArrayArrayArray21[Static299.anInt4751][local66 + 1][local88] = local14;
						local48 = local48 + 1 & 0xFFF;
					}
					local88--;
					if (local88 >= 0) {
						if (local66 - 1 >= 0 && Static479.aByteArrayArrayArray21[Static299.anInt4751][local66 - 1][local88] != local14 && (Static480.aByteArrayArrayArray19[Static299.anInt4751][local66][local88] & 0x4) == 0 && (Static480.aByteArrayArrayArray19[Static299.anInt4751][local66 - 1][local88 + 1] & 0x4) == 0) {
							Static19.anIntArray32[local48] = local66 - 1 | 0xD20000 | 0x12000000;
							Static394.anIntArray546[local48] = local88 | 0xD30000;
							local48 = local48 + 1 & 0xFFF;
							Static479.aByteArrayArrayArray21[Static299.anInt4751][local66 - 1][local88] = local14;
						}
						if (local14 != Static479.aByteArrayArrayArray21[Static299.anInt4751][local66][local88]) {
							Static19.anIntArray32[local48] = local66 | 0x93000000 | 0xD20000;
							Static394.anIntArray546[local48] = local88 | 0xD30000;
							Static479.aByteArrayArrayArray21[Static299.anInt4751][local66][local88] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
						if (Static111.anInt1752 > local66 + 1 && local14 != Static479.aByteArrayArrayArray21[Static299.anInt4751][local66 + 1][local88] && (Static480.aByteArrayArrayArray19[Static299.anInt4751][local66][local88] & 0x4) == 0 && (Static480.aByteArrayArrayArray19[Static299.anInt4751][local66 + 1][local88 + 1] & 0x4) == 0) {
							Static19.anIntArray32[local48] = local66 + 1 | 0xD2000000 | 0x920000;
							Static394.anIntArray546[local48] = local88 | 0x930000;
							Static479.aByteArrayArrayArray21[Static299.anInt4751][local66 + 1][local88] = local14;
							local48 = local48 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static352.anIntArray488[arg0] != -1000000) {
				Static352.anIntArray488[arg0] += 40;
				Static200.anIntArray291[arg0] -= 512;
				Static368.anIntArray509[arg0] += 512;
				Static606.anIntArray803[arg0] += 512;
				Static131.anIntArray174[arg0] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!rda;[III[II)Lclient!ew;")
	public static Class1_Sub2 method8908(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			@Pc(27) int local27 = local12 * arg2 + arg4[local12];
			for (@Pc(29) int local29 = 0; local29 < arg1[local12]; local29++) {
				local10[local27++] = -1;
			}
		}
		return new Class1_Sub2(arg0, arg2, arg3, local10);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)I")
	public static int method8909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static413.anIntArrayArray37 == null ? 0 : Static413.anIntArrayArray37[arg0][arg1] & 0xFFFFFF;
	}
}
