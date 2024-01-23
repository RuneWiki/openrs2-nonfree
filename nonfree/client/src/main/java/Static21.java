import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bl", name = "o", descriptor = "Lclient!wf;")
	public static Class191 aClass191_3 = null;

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(III)V")
	public static void method449() {
		for (@Pc(1) int local1 = 0; local1 < Static155.anInt3493; local1++) {
			for (@Pc(6) int local6 = 0; local6 < Static90.anInt2091; local6++) {
				for (@Pc(11) int local11 = 0; local11 < Static77.anInt1766; local11++) {
					@Pc(22) Class1_Sub2 local22 = Static7.aClass1_Sub2ArrayArrayArray1[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Class136 local27 = local22.aClass136_1;
						if (local27 != null && local27.aClass2_10.method3946()) {
							Static17.method416(local27.aClass2_10, local1, local6, local11, 1, 1);
							if (local27.aClass2_9 != null && local27.aClass2_9.method3946()) {
								Static17.method416(local27.aClass2_9, local1, local6, local11, 1, 1);
								local27.aClass2_10.method3949(local27.aClass2_9, 0, 0, 0, false);
								local27.aClass2_9 = local27.aClass2_9.method3943();
							}
							local27.aClass2_10 = local27.aClass2_10.method3943();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.anInt45; local83++) {
							@Pc(92) Class7 local92 = local22.aClass7Array1[local83];
							if (local92 != null && local92.aClass2_1.method3946()) {
								Static17.method416(local92.aClass2_1, local1, local6, local11, local92.anInt218 + 1 - local92.anInt214, local92.anInt212 - local92.anInt220 + 1);
								local92.aClass2_1 = local92.aClass2_1.method3943();
							}
						}
						@Pc(131) Class119 local131 = local22.aClass119_1;
						if (local131 != null && local131.aClass2_7.method3946()) {
							Static68.method1162(local131.aClass2_7, local1, local6, local11);
							local131.aClass2_7 = local131.aClass2_7.method3943();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!th;II)[Lclient!ml;")
	public static Class1_Sub3_Sub13[] method450(@OriginalArg(1) Class168 arg0, @OriginalArg(3) int arg1) {
		return Static131.method2257(0, arg0, arg1) ? Static219.method3468() : null;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z[[[Lclient!aa;IIII)Z")
	public static boolean method453(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub2[][][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg0 ? 1 : (byte) (Static207.anInt4467 & 0xFF);
		if (local14 == Static53.aByteArrayArrayArray2[Static185.anInt4085][arg4][arg3]) {
			return false;
		} else if ((Static303.aByteArrayArrayArray19[Static185.anInt4085][arg4][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(43) byte local43 = 0;
			@Pc(45) int local45 = 0;
			Static78.anIntArray189[0] = arg4;
			@Pc(52) int local52 = local43 + 1;
			Static134.anIntArray290[0] = arg3;
			Static53.aByteArrayArrayArray2[Static185.anInt4085][arg4][arg3] = local14;
			while (local45 != local52) {
				@Pc(81) int local81 = Static78.anIntArray189[local45] & 0xFFFF;
				@Pc(89) int local89 = Static78.anIntArray189[local45] >> 16 & 0xFF;
				@Pc(97) int local97 = Static78.anIntArray189[local45] >> 24 & 0xFF;
				@Pc(103) int local103 = Static134.anIntArray290[local45] & 0xFFFF;
				@Pc(111) int local111 = Static134.anIntArray290[local45] >> 16 & 0xFF;
				@Pc(113) boolean local113 = false;
				@Pc(115) boolean local115 = false;
				if ((Static303.aByteArrayArrayArray19[Static185.anInt4085][local81][local103] & 0x4) == 0) {
					local113 = true;
				}
				@Pc(135) int local135;
				@Pc(175) int local175;
				label234: for (local135 = Static185.anInt4085 + 1; local135 <= 3; local135++) {
					if ((Static303.aByteArrayArrayArray19[local135][local81][local103] & 0x8) == 0) {
						@Pc(214) int local214;
						@Pc(346) int local346;
						if (local113 && arg1[local135][local81][local103] != null) {
							if (arg1[local135][local81][local103].aClass136_1 != null) {
								local175 = Static248.method3836(local89);
								if (arg1[local135][local81][local103].aClass136_1.anInt4700 == local175 || local175 == arg1[local135][local81][local103].aClass136_1.anInt4694) {
									continue;
								}
								if (local97 != 0) {
									local214 = Static248.method3836(local97);
									if (arg1[local135][local81][local103].aClass136_1.anInt4700 == local214 || arg1[local135][local81][local103].aClass136_1.anInt4694 == local214) {
										continue;
									}
								}
								if (local111 != 0) {
									local214 = Static248.method3836(local111);
									if (local214 == arg1[local135][local81][local103].aClass136_1.anInt4700 || arg1[local135][local81][local103].aClass136_1.anInt4694 == local214) {
										continue;
									}
								}
							}
							if (arg1[local135][local81][local103].aClass7Array1 != null) {
								for (local175 = 0; local175 < arg1[local135][local81][local103].anInt45; local175++) {
									@Pc(316) int local316 = (int) (arg1[local135][local81][local103].aClass7Array1[local175].aLong7 >> 20 & 0x3L);
									local214 = (int) (arg1[local135][local81][local103].aClass7Array1[local175].aLong7 >> 14 & 0x3FL);
									if (local214 == 21) {
										local214 = 19;
									}
									local346 = local214 | local316 << 6;
									if (local346 == local89 || local97 != 0 && local97 == local346 || local111 != 0 && local111 == local346) {
										continue label234;
									}
								}
							}
						}
						local115 = true;
						@Pc(390) Class1_Sub2 local390 = arg1[local135][local81][local103];
						if (local390 != null && local390.anInt45 > 0) {
							for (local214 = 0; local214 < local390.anInt45; local214++) {
								@Pc(407) Class7 local407 = local390.aClass7Array1[local214];
								if (local407.anInt218 != local407.anInt214 || local407.anInt212 != local407.anInt220) {
									for (local346 = local407.anInt214; local346 <= local407.anInt218; local346++) {
										for (@Pc(435) int local435 = local407.anInt220; local435 <= local407.anInt212; local435++) {
											Static53.aByteArrayArrayArray2[local135][local346][local435] = local14;
										}
									}
								}
							}
						}
						Static53.aByteArrayArrayArray2[local135][local81][local103] = local14;
					}
				}
				if (local115) {
					if (Static38.anIntArray120[arg2] < Static46.anIntArrayArrayArray1[Static185.anInt4085 + 1][local81][local103]) {
						Static38.anIntArray120[arg2] = Static46.anIntArrayArrayArray1[Static185.anInt4085 + 1][local81][local103];
					}
					local175 = local103 << 7;
					local135 = local81 << 7;
					if (local135 < Static43.anIntArray130[arg2]) {
						Static43.anIntArray130[arg2] = local135;
					} else if (local135 > Static162.anIntArray323[arg2]) {
						Static162.anIntArray323[arg2] = local135;
					}
					if (Static18.anIntArray44[arg2] > local175) {
						Static18.anIntArray44[arg2] = local175;
					} else if (Static49.anIntArray146[arg2] < local175) {
						Static49.anIntArray146[arg2] = local175;
					}
				}
				local45 = local45 + 1 & 0xFFF;
				if (!local113) {
					if (local81 >= 1 && local14 != Static53.aByteArrayArrayArray2[Static185.anInt4085][local81 - 1][local103]) {
						Static78.anIntArray189[local52] = local81 - 1 | 0x120000 | 0xD3000000;
						Static134.anIntArray290[local52] = local103 | 0x130000;
						local52 = local52 + 1 & 0xFFF;
						Static53.aByteArrayArrayArray2[Static185.anInt4085][local81 - 1][local103] = local14;
					}
					local103++;
					if (local103 < 104) {
						if (local81 - 1 >= 0 && Static53.aByteArrayArrayArray2[Static185.anInt4085][local81 - 1][local103] != local14 && (Static303.aByteArrayArrayArray19[Static185.anInt4085][local81][local103] & 0x4) == 0 && (Static303.aByteArrayArrayArray19[Static185.anInt4085][local81 - 1][local103 - 1] & 0x4) == 0) {
							Static78.anIntArray189[local52] = local81 - 1 | 0x120000 | 0x52000000;
							Static134.anIntArray290[local52] = local103 | 0x130000;
							Static53.aByteArrayArrayArray2[Static185.anInt4085][local81 - 1][local103] = local14;
							local52 = local52 + 1 & 0xFFF;
						}
						if (local14 != Static53.aByteArrayArrayArray2[Static185.anInt4085][local81][local103]) {
							Static78.anIntArray189[local52] = local81 | 0x520000 | 0x13000000;
							Static134.anIntArray290[local52] = local103 | 0x530000;
							Static53.aByteArrayArrayArray2[Static185.anInt4085][local81][local103] = local14;
							local52 = local52 + 1 & 0xFFF;
						}
						if (local81 + 1 < 104 && local14 != Static53.aByteArrayArrayArray2[Static185.anInt4085][local81 + 1][local103] && (Static303.aByteArrayArrayArray19[Static185.anInt4085][local81][local103] & 0x4) == 0 && (Static303.aByteArrayArrayArray19[Static185.anInt4085][local81 + 1][local103 - 1] & 0x4) == 0) {
							Static78.anIntArray189[local52] = 0x92000000 | 0x520000 | local81 + 1;
							Static134.anIntArray290[local52] = local103 | 0x530000;
							local52 = local52 + 1 & 0xFFF;
							Static53.aByteArrayArrayArray2[Static185.anInt4085][local81 + 1][local103] = local14;
						}
					}
					local103--;
					if (local81 + 1 < 104 && local14 != Static53.aByteArrayArrayArray2[Static185.anInt4085][local81 + 1][local103]) {
						Static78.anIntArray189[local52] = local81 + 1 | 0x920000 | 0x53000000;
						Static134.anIntArray290[local52] = local103 | 0x930000;
						local52 = local52 + 1 & 0xFFF;
						Static53.aByteArrayArrayArray2[Static185.anInt4085][local81 + 1][local103] = local14;
					}
					local103--;
					if (local103 >= 0) {
						if (local81 - 1 >= 0 && local14 != Static53.aByteArrayArrayArray2[Static185.anInt4085][local81 - 1][local103] && (Static303.aByteArrayArrayArray19[Static185.anInt4085][local81][local103] & 0x4) == 0 && (Static303.aByteArrayArrayArray19[Static185.anInt4085][local81 - 1][local103 + 1] & 0x4) == 0) {
							Static78.anIntArray189[local52] = local81 - 1 | 0xD20000 | 0x12000000;
							Static134.anIntArray290[local52] = local103 | 0xD30000;
							Static53.aByteArrayArrayArray2[Static185.anInt4085][local81 - 1][local103] = local14;
							local52 = local52 + 1 & 0xFFF;
						}
						if (local14 != Static53.aByteArrayArrayArray2[Static185.anInt4085][local81][local103]) {
							Static78.anIntArray189[local52] = 0x93000000 | 0xD20000 | local81;
							Static134.anIntArray290[local52] = local103 | 0xD30000;
							Static53.aByteArrayArrayArray2[Static185.anInt4085][local81][local103] = local14;
							local52 = local52 + 1 & 0xFFF;
						}
						if (local81 + 1 < 104 && local14 != Static53.aByteArrayArrayArray2[Static185.anInt4085][local81 + 1][local103] && (Static303.aByteArrayArrayArray19[Static185.anInt4085][local81][local103] & 0x4) == 0 && (Static303.aByteArrayArrayArray19[Static185.anInt4085][local81 + 1][local103 + 1] & 0x4) == 0) {
							Static78.anIntArray189[local52] = local81 + 1 | 0x920000 | 0xD2000000;
							Static134.anIntArray290[local52] = local103 | 0x930000;
							Static53.aByteArrayArrayArray2[Static185.anInt4085][local81 + 1][local103] = local14;
							local52 = local52 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static38.anIntArray120[arg2] != -1000000) {
				Static38.anIntArray120[arg2] += 10;
				Static43.anIntArray130[arg2] -= 50;
				Static162.anIntArray323[arg2] += 50;
				Static49.anIntArray146[arg2] += 50;
				Static18.anIntArray44[arg2] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method455(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
			Static264.anInt5305 = -1;
			Static18.anInt482 = -1;
			return;
		}
		@Pc(37) int local37 = Static93.method1576(arg0, arg2, Static185.anInt4085) - arg4;
		@Pc(41) int local41 = Class146.anIntArray461[Static44.anInt1071];
		@Pc(45) int local45 = arg2 - Static58.anInt1269;
		@Pc(49) int local49 = local37 - Static315.anInt6297;
		@Pc(53) int local53 = Class146.anIntArray463[Static44.anInt1071];
		@Pc(57) int local57 = Class146.anIntArray461[Static120.anInt6251];
		@Pc(61) int local61 = arg0 - Static94.anInt2161;
		@Pc(65) int local65 = Class146.anIntArray463[Static120.anInt6251];
		@Pc(75) int local75 = local45 * local65 + local57 * local61 >> 16;
		@Pc(86) int local86 = local65 * local61 - local57 * local45 >> 16;
		@Pc(92) int local92 = local75 + arg3;
		@Pc(103) int local103 = local53 * local49 - local41 * local86 >> 16;
		@Pc(113) int local113 = local49 * local41 + local86 * local53 >> 16;
		if (local113 < 50) {
			Static18.anInt482 = -1;
			Static264.anInt5305 = -1;
		} else if (Static294.aBoolean367) {
			@Pc(134) int local134 = arg5 * 512 >> 8;
			Static18.anInt482 = arg6 + local134 * local92 / local113;
			@Pc(148) int local148 = arg7 * 512 >> 8;
			Static264.anInt5305 = arg1 + local148 * local103 / local113;
		} else {
			Static18.anInt482 = arg6 + (local92 << 9) / local113;
			Static264.anInt5305 = arg1 + (local103 << 9) / local113;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)I")
	public static int method457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + ((arg2 >> 2 << 10) + (arg0 >> 1));
	}
}
