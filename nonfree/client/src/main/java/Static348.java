import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "I")
	public static int anInt6555 = -1;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString431 = "Starting 3d Library";

	@OriginalMember(owner = "client!we", name = "j", descriptor = "I")
	public static int anInt6562 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III[[[Lclient!dg;BZ)Z")
	public static boolean method5582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class49[][][] arg3, @OriginalArg(5) boolean arg4) {
		@Pc(12) byte local12 = arg4 ? 1 : (byte) (Static233.anInt4634 & 0xFF);
		if (Static301.aByteArrayArrayArray11[Static168.anInt3508][arg2][arg0] == local12) {
			return false;
		} else if ((Static92.aByteArrayArrayArray3[Static168.anInt3508][arg2][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(44) byte local44 = 0;
			@Pc(51) int local51 = 0;
			Static59.anIntArray225[0] = arg2;
			@Pc(58) int local58 = local44 + 1;
			Static2.anIntArray1[0] = arg0;
			Static301.aByteArrayArrayArray11[Static168.anInt3508][arg2][arg0] = local12;
			while (local58 != local51) {
				@Pc(75) int local75 = Static59.anIntArray225[local51] & 0xFFFF;
				@Pc(83) int local83 = Static59.anIntArray225[local51] >> 16 & 0xFF;
				@Pc(91) int local91 = Static59.anIntArray225[local51] >> 24 & 0xFF;
				@Pc(97) int local97 = Static2.anIntArray1[local51] & 0xFFFF;
				@Pc(105) int local105 = Static2.anIntArray1[local51] >> 16 & 0xFF;
				local51 = local51 + 1 & 0xFFF;
				@Pc(113) boolean local113 = false;
				if ((Static92.aByteArrayArrayArray3[Static168.anInt3508][local75][local97] & 0x4) == 0) {
					local113 = true;
				}
				@Pc(130) boolean local130 = false;
				@Pc(171) int local171;
				@Pc(220) int local220;
				label231: for (@Pc(134) int local134 = Static168.anInt3508 + 1; local134 <= 3; local134++) {
					if ((Static92.aByteArrayArrayArray3[local134][local75][local97] & 0x8) == 0) {
						@Pc(312) Class22_Sub2 local312;
						@Pc(322) int local322;
						@Pc(302) Class49 local302;
						@Pc(308) Class47 local308;
						if (local113 && arg3[local134][local75][local97] != null) {
							if (arg3[local134][local75][local97].aClass22_Sub4_1 != null) {
								local171 = Static259.method4352(local83);
								if (local171 == arg3[local134][local75][local97].aClass22_Sub4_1.anInt6015 || arg3[local134][local75][local97].aClass22_Sub4_2 != null && arg3[local134][local75][local97].aClass22_Sub4_2.anInt6015 == local171) {
									continue;
								}
								if (local91 != 0) {
									local220 = Static259.method4352(local91);
									if (arg3[local134][local75][local97].aClass22_Sub4_1.anInt6015 == local220 || arg3[local134][local75][local97].aClass22_Sub4_2 != null && arg3[local134][local75][local97].aClass22_Sub4_2.anInt6015 == local220) {
										continue;
									}
								}
								if (local105 != 0) {
									local220 = Static259.method4352(local105);
									if (arg3[local134][local75][local97].aClass22_Sub4_1.anInt6015 == local220 || arg3[local134][local75][local97].aClass22_Sub4_2 != null && arg3[local134][local75][local97].aClass22_Sub4_2.anInt6015 == local220) {
										continue;
									}
								}
							}
							local302 = arg3[local134][local75][local97];
							if (local302.aClass47_3 != null) {
								for (local308 = local302.aClass47_3; local308 != null; local308 = local308.aClass47_2) {
									local312 = local308.aClass22_Sub2_1;
									if (local312 instanceof Interface1) {
										@Pc(318) Interface1 local318 = (Interface1) local312;
										local322 = local318.method5361();
										if (local322 == 21) {
											local322 = 19;
										}
										@Pc(333) int local333 = local318.method5360();
										@Pc(339) int local339 = local333 << 6 | local322;
										if (local83 == local339 || local91 != 0 && local339 == local91 || local105 != 0 && local339 == local105) {
											continue label231;
										}
									}
								}
							}
						}
						local302 = arg3[local134][local75][local97];
						if (local302 != null && local302.aClass47_3 != null) {
							for (local308 = local302.aClass47_3; local308 != null; local308 = local308.aClass47_2) {
								local312 = local308.aClass22_Sub2_1;
								if (local312.aShort83 != local312.aShort82 || local312.aShort84 != local312.aShort81) {
									for (@Pc(407) int local407 = local312.aShort83; local407 <= local312.aShort82; local407++) {
										for (local322 = local312.aShort81; local322 <= local312.aShort84; local322++) {
											Static301.aByteArrayArrayArray11[local134][local407][local322] = local12;
										}
									}
								}
							}
						}
						Static301.aByteArrayArrayArray11[local134][local75][local97] = local12;
						local130 = true;
					}
				}
				if (local130) {
					local171 = Static331.aClass8Array5[Static168.anInt3508 + 1].method4173(local75, local97);
					if (local171 > Static88.anIntArray550[arg1]) {
						Static88.anIntArray550[arg1] = local171;
					}
					local220 = local75 << 7;
					if (local220 < Static168.anIntArray473[arg1]) {
						Static168.anIntArray473[arg1] = local220;
					} else if (Static272.anIntArray689[arg1] < local220) {
						Static272.anIntArray689[arg1] = local220;
					}
					@Pc(512) int local512 = local97 << 7;
					if (local512 < Static346.anIntArray831[arg1]) {
						Static346.anIntArray831[arg1] = local512;
					} else if (local512 > Static273.anIntArray692[arg1]) {
						Static273.anIntArray692[arg1] = local512;
					}
				}
				if (!local113) {
					if (local75 >= 1 && local12 != Static301.aByteArrayArrayArray11[Static168.anInt3508][local75 - 1][local97]) {
						Static59.anIntArray225[local58] = 0xD3000000 | 0x120000 | local75 - 1;
						Static2.anIntArray1[local58] = local97 | 0x130000;
						local58 = local58 + 1 & 0xFFF;
						Static301.aByteArrayArrayArray11[Static168.anInt3508][local75 - 1][local97] = local12;
					}
					local97++;
					if (Static325.anInt6173 > local97) {
						if (local75 - 1 >= 0 && Static301.aByteArrayArrayArray11[Static168.anInt3508][local75 - 1][local97] != local12 && (Static92.aByteArrayArrayArray3[Static168.anInt3508][local75][local97] & 0x4) == 0 && (Static92.aByteArrayArrayArray3[Static168.anInt3508][local75 - 1][local97 - 1] & 0x4) == 0) {
							Static59.anIntArray225[local58] = 0x52000000 | 0x120000 | local75 - 1;
							Static2.anIntArray1[local58] = local97 | 0x130000;
							Static301.aByteArrayArrayArray11[Static168.anInt3508][local75 - 1][local97] = local12;
							local58 = local58 + 1 & 0xFFF;
						}
						if (Static301.aByteArrayArrayArray11[Static168.anInt3508][local75][local97] != local12) {
							Static59.anIntArray225[local58] = local75 | 0x520000 | 0x13000000;
							Static2.anIntArray1[local58] = local97 | 0x530000;
							Static301.aByteArrayArrayArray11[Static168.anInt3508][local75][local97] = local12;
							local58 = local58 + 1 & 0xFFF;
						}
						if (local75 + 1 < Static15.anInt287 && Static301.aByteArrayArrayArray11[Static168.anInt3508][local75 + 1][local97] != local12 && (Static92.aByteArrayArrayArray3[Static168.anInt3508][local75][local97] & 0x4) == 0 && (Static92.aByteArrayArrayArray3[Static168.anInt3508][local75 + 1][local97 - 1] & 0x4) == 0) {
							Static59.anIntArray225[local58] = local75 + 1 | 0x92000000 | 0x520000;
							Static2.anIntArray1[local58] = local97 | 0x530000;
							local58 = local58 + 1 & 0xFFF;
							Static301.aByteArrayArrayArray11[Static168.anInt3508][local75 + 1][local97] = local12;
						}
					}
					local97--;
					if (Static15.anInt287 > local75 + 1 && Static301.aByteArrayArrayArray11[Static168.anInt3508][local75 + 1][local97] != local12) {
						Static59.anIntArray225[local58] = local75 + 1 | 0x920000 | 0x53000000;
						Static2.anIntArray1[local58] = local97 | 0x930000;
						Static301.aByteArrayArrayArray11[Static168.anInt3508][local75 + 1][local97] = local12;
						local58 = local58 + 1 & 0xFFF;
					}
					local97--;
					if (local97 >= 0) {
						if (local75 - 1 >= 0 && Static301.aByteArrayArrayArray11[Static168.anInt3508][local75 - 1][local97] != local12 && (Static92.aByteArrayArrayArray3[Static168.anInt3508][local75][local97] & 0x4) == 0 && (Static92.aByteArrayArrayArray3[Static168.anInt3508][local75 - 1][local97 + 1] & 0x4) == 0) {
							Static59.anIntArray225[local58] = local75 - 1 | 0xD20000 | 0x12000000;
							Static2.anIntArray1[local58] = local97 | 0xD30000;
							Static301.aByteArrayArrayArray11[Static168.anInt3508][local75 - 1][local97] = local12;
							local58 = local58 + 1 & 0xFFF;
						}
						if (local12 != Static301.aByteArrayArrayArray11[Static168.anInt3508][local75][local97]) {
							Static59.anIntArray225[local58] = 0x93000000 | 0xD20000 | local75;
							Static2.anIntArray1[local58] = local97 | 0xD30000;
							local58 = local58 + 1 & 0xFFF;
							Static301.aByteArrayArrayArray11[Static168.anInt3508][local75][local97] = local12;
						}
						if (local75 + 1 < Static15.anInt287 && local12 != Static301.aByteArrayArrayArray11[Static168.anInt3508][local75 + 1][local97] && (Static92.aByteArrayArrayArray3[Static168.anInt3508][local75][local97] & 0x4) == 0 && (Static92.aByteArrayArrayArray3[Static168.anInt3508][local75 + 1][local97 + 1] & 0x4) == 0) {
							Static59.anIntArray225[local58] = 0xD2000000 | 0x920000 | local75 + 1;
							Static2.anIntArray1[local58] = local97 | 0x930000;
							local58 = local58 + 1 & 0xFFF;
							Static301.aByteArrayArrayArray11[Static168.anInt3508][local75 + 1][local97] = local12;
						}
					}
				}
			}
			if (Static88.anIntArray550[arg1] != -1000000) {
				Static88.anIntArray550[arg1] += 10;
				Static168.anIntArray473[arg1] -= 50;
				Static272.anIntArray689[arg1] += 50;
				Static273.anIntArray692[arg1] += 50;
				Static346.anIntArray831[arg1] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)Z")
	public static boolean method5588() {
		if (Static94.aBoolean158) {
			try {
				if ((Boolean) Static362.method3353("showingVideoAd", Static116.aClass21_4.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)I")
	public static int method5591(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(28) int local28 = (local10 >>> 2 & 0x33333333) + (local10 & 0x33333333);
		@Pc(36) int local36 = (local28 >>> 4) + local28 & 0xF0F0F0F;
		@Pc(42) int local42 = local36 + (local36 >>> 8);
		@Pc(48) int local48 = local42 + (local42 >>> 16);
		return local48 & 0xFF;
	}
}
