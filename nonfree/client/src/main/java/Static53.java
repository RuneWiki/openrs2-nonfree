import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_16 = new Class198("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray4 = new boolean[100];

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "[S")
	public static final short[] aShortArray1 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!ck", name = "s", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_17 = new Class198("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "Z")
	public static volatile boolean aBoolean76 = false;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)Z")
	public static boolean method829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!za;I)V")
	public static void method830(@OriginalArg(0) Class200 arg0) {
		if (Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105 != Static183.anInt3097 && (Static319.aClass258ArrayArrayArray3 != null && Static61.method963(Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105, arg0))) {
			Static183.anInt3097 = Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZI[[[Lclient!vt;II)Z")
	public static boolean method831(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class258[][][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg1 ? 1 : (byte) (Static409.anInt6832 & 0xFF);
		if (local14 == Static264.aByteArrayArrayArray15[Static6.anInt131][arg3][arg0]) {
			return false;
		} else if ((Static452.aByteArrayArrayArray16[Static6.anInt131][arg3][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(44) byte local44 = 0;
			Static168.anIntArray366[0] = arg3;
			@Pc(50) int local50 = 0;
			@Pc(53) int local53 = local44 + 1;
			Static412.anIntArray469[0] = arg0;
			Static264.aByteArrayArrayArray15[Static6.anInt131][arg3][arg0] = local14;
			while (local53 != local50) {
				@Pc(71) int local71 = Static168.anIntArray366[local50] & 0xFFFF;
				@Pc(79) int local79 = Static168.anIntArray366[local50] >> 16 & 0xFF;
				@Pc(87) int local87 = Static168.anIntArray366[local50] >> 24 & 0xFF;
				@Pc(93) int local93 = Static412.anIntArray469[local50] & 0xFFFF;
				@Pc(101) int local101 = Static412.anIntArray469[local50] >> 16 & 0xFF;
				local50 = local50 + 1 & 0xFFF;
				@Pc(109) boolean local109 = false;
				if ((Static452.aByteArrayArrayArray16[Static6.anInt131][local71][local93] & 0x4) == 0) {
					local109 = true;
				}
				@Pc(126) boolean local126 = false;
				@Pc(168) int local168;
				@Pc(210) int local210;
				label231: for (@Pc(130) int local130 = Static6.anInt131 + 1; local130 <= 3; local130++) {
					if ((Static452.aByteArrayArrayArray16[local130][local71][local93] & 0x8) == 0) {
						@Pc(316) Class2_Sub1 local316;
						@Pc(328) int local328;
						@Pc(305) Class258 local305;
						@Pc(311) Class122 local311;
						if (local109 && arg2[local130][local71][local93] != null) {
							if (arg2[local130][local71][local93].aClass2_Sub4_2 != null) {
								local168 = Static22.method378(local79);
								if (arg2[local130][local71][local93].aClass2_Sub4_2.anInt6417 == local168 || arg2[local130][local71][local93].aClass2_Sub4_3 != null && local168 == arg2[local130][local71][local93].aClass2_Sub4_3.anInt6417) {
									continue;
								}
								if (local87 != 0) {
									local210 = Static22.method378(local87);
									if (arg2[local130][local71][local93].aClass2_Sub4_2.anInt6417 == local210 || arg2[local130][local71][local93].aClass2_Sub4_3 != null && local210 == arg2[local130][local71][local93].aClass2_Sub4_3.anInt6417) {
										continue;
									}
								}
								if (local101 != 0) {
									local210 = Static22.method378(local101);
									if (arg2[local130][local71][local93].aClass2_Sub4_2.anInt6417 == local210 || arg2[local130][local71][local93].aClass2_Sub4_3 != null && arg2[local130][local71][local93].aClass2_Sub4_3.anInt6417 == local210) {
										continue;
									}
								}
							}
							local305 = arg2[local130][local71][local93];
							if (local305.aClass122_3 != null) {
								for (local311 = local305.aClass122_3; local311 != null; local311 = local311.aClass122_1) {
									local316 = local311.aClass2_Sub1_1;
									if (local316 instanceof Interface2) {
										@Pc(322) Interface2 local322 = (Interface2) local316;
										local328 = local322.method6035();
										@Pc(332) int local332 = local322.method6034();
										if (local328 == 21) {
											local328 = 19;
										}
										@Pc(343) int local343 = local332 << 6 | local328;
										if (local79 == local343 || local87 != 0 && local343 == local87 || local101 != 0 && local343 == local101) {
											continue label231;
										}
									}
								}
							}
						}
						local305 = arg2[local130][local71][local93];
						if (local305 != null && local305.aClass122_3 != null) {
							for (local311 = local305.aClass122_3; local311 != null; local311 = local311.aClass122_1) {
								local316 = local311.aClass2_Sub1_1;
								if (local316.aShort104 != local316.aShort107 || local316.aShort105 != local316.aShort106) {
									for (@Pc(415) int local415 = local316.aShort107; local415 <= local316.aShort104; local415++) {
										for (local328 = local316.aShort106; local328 <= local316.aShort105; local328++) {
											Static264.aByteArrayArrayArray15[local130][local415][local328] = local14;
										}
									}
								}
							}
						}
						local126 = true;
						Static264.aByteArrayArrayArray15[local130][local71][local93] = local14;
					}
				}
				if (local126) {
					local168 = Static410.aClass125Array3[Static6.anInt131 + 1].ua(local71, local93);
					if (Static264.anIntArray332[arg4] < local168) {
						Static264.anIntArray332[arg4] = local168;
					}
					local210 = local71 << 7;
					if (Static275.anIntArray342[arg4] > local210) {
						Static275.anIntArray342[arg4] = local210;
					} else if (Static238.anIntArray250[arg4] < local210) {
						Static238.anIntArray250[arg4] = local210;
					}
					@Pc(513) int local513 = local93 << 7;
					if (local513 < Static439.anIntArray491[arg4]) {
						Static439.anIntArray491[arg4] = local513;
					} else if (local513 > Static432.anIntArray485[arg4]) {
						Static432.anIntArray485[arg4] = local513;
					}
				}
				if (!local109) {
					if (local71 >= 1 && Static264.aByteArrayArrayArray15[Static6.anInt131][local71 - 1][local93] != local14) {
						Static168.anIntArray366[local53] = local71 - 1 | 0xD3000000 | 0x120000;
						Static412.anIntArray469[local53] = local93 | 0x130000;
						Static264.aByteArrayArrayArray15[Static6.anInt131][local71 - 1][local93] = local14;
						local53 = local53 + 1 & 0xFFF;
					}
					local93++;
					if (local93 < Static418.anInt6969) {
						if (local71 - 1 >= 0 && local14 != Static264.aByteArrayArrayArray15[Static6.anInt131][local71 - 1][local93] && (Static452.aByteArrayArrayArray16[Static6.anInt131][local71][local93] & 0x4) == 0 && (Static452.aByteArrayArrayArray16[Static6.anInt131][local71 - 1][local93 - 1] & 0x4) == 0) {
							Static168.anIntArray366[local53] = local71 - 1 | 0x52000000 | 0x120000;
							Static412.anIntArray469[local53] = local93 | 0x130000;
							local53 = local53 + 1 & 0xFFF;
							Static264.aByteArrayArrayArray15[Static6.anInt131][local71 - 1][local93] = local14;
						}
						if (local14 != Static264.aByteArrayArrayArray15[Static6.anInt131][local71][local93]) {
							Static168.anIntArray366[local53] = local71 | 0x520000 | 0x13000000;
							Static412.anIntArray469[local53] = local93 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static264.aByteArrayArrayArray15[Static6.anInt131][local71][local93] = local14;
						}
						if (Static433.anInt7210 > local71 + 1 && Static264.aByteArrayArrayArray15[Static6.anInt131][local71 + 1][local93] != local14 && (Static452.aByteArrayArrayArray16[Static6.anInt131][local71][local93] & 0x4) == 0 && (Static452.aByteArrayArrayArray16[Static6.anInt131][local71 + 1][local93 - 1] & 0x4) == 0) {
							Static168.anIntArray366[local53] = 0x92000000 | 0x520000 | local71 + 1;
							Static412.anIntArray469[local53] = local93 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static264.aByteArrayArrayArray15[Static6.anInt131][local71 + 1][local93] = local14;
						}
					}
					local93--;
					if (Static433.anInt7210 > local71 + 1 && local14 != Static264.aByteArrayArrayArray15[Static6.anInt131][local71 + 1][local93]) {
						Static168.anIntArray366[local53] = local71 + 1 | 0x920000 | 0x53000000;
						Static412.anIntArray469[local53] = local93 | 0x930000;
						Static264.aByteArrayArrayArray15[Static6.anInt131][local71 + 1][local93] = local14;
						local53 = local53 + 1 & 0xFFF;
					}
					local93--;
					if (local93 >= 0) {
						if (local71 - 1 >= 0 && Static264.aByteArrayArrayArray15[Static6.anInt131][local71 - 1][local93] != local14 && (Static452.aByteArrayArrayArray16[Static6.anInt131][local71][local93] & 0x4) == 0 && (Static452.aByteArrayArrayArray16[Static6.anInt131][local71 - 1][local93 + 1] & 0x4) == 0) {
							Static168.anIntArray366[local53] = local71 - 1 | 0xD20000 | 0x12000000;
							Static412.anIntArray469[local53] = local93 | 0xD30000;
							local53 = local53 + 1 & 0xFFF;
							Static264.aByteArrayArrayArray15[Static6.anInt131][local71 - 1][local93] = local14;
						}
						if (Static264.aByteArrayArrayArray15[Static6.anInt131][local71][local93] != local14) {
							Static168.anIntArray366[local53] = local71 | 0x93000000 | 0xD20000;
							Static412.anIntArray469[local53] = local93 | 0xD30000;
							local53 = local53 + 1 & 0xFFF;
							Static264.aByteArrayArrayArray15[Static6.anInt131][local71][local93] = local14;
						}
						if (local71 + 1 < Static433.anInt7210 && local14 != Static264.aByteArrayArrayArray15[Static6.anInt131][local71 + 1][local93] && (Static452.aByteArrayArrayArray16[Static6.anInt131][local71][local93] & 0x4) == 0 && (Static452.aByteArrayArrayArray16[Static6.anInt131][local71 + 1][local93 + 1] & 0x4) == 0) {
							Static168.anIntArray366[local53] = local71 + 1 | 0x920000 | 0xD2000000;
							Static412.anIntArray469[local53] = local93 | 0x930000;
							Static264.aByteArrayArrayArray15[Static6.anInt131][local71 + 1][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static264.anIntArray332[arg4] != -1000000) {
				Static264.anIntArray332[arg4] += 10;
				Static275.anIntArray342[arg4] -= 50;
				Static238.anIntArray250[arg4] += 50;
				Static432.anIntArray485[arg4] += 50;
				Static439.anIntArray491[arg4] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!fi;I)V")
	public static void method833(@OriginalArg(0) Class76 arg0) {
		if (arg0.anInt2110 == Static59.anInt1107) {
			Static99.aBooleanArray5[arg0.anInt2122] = true;
		}
	}
}
