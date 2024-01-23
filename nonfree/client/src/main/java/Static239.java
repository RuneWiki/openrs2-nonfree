import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!se", name = "N", descriptor = "I")
	public static int anInt4738;

	@OriginalMember(owner = "client!se", name = "O", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!se", name = "U", descriptor = "Z")
	public static boolean aBoolean362;

	@OriginalMember(owner = "client!se", name = "W", descriptor = "Z")
	public static boolean aBoolean363;

	@OriginalMember(owner = "client!se", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString275 = "Loaded wordpack";

	@OriginalMember(owner = "client!se", name = "S", descriptor = "I")
	public static int anInt4742 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II[[[Lclient!pi;IZI)Z")
	public static boolean method3685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub26[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(10) byte local10 = arg4 ? 1 : (byte) (Static279.anInt5382 & 0xFF);
		if (local10 == Static35.aByteArrayArrayArray12[Static140.anInt3034][arg1][arg3]) {
			return false;
		} else if ((Static260.aByteArrayArrayArray25[Static140.anInt3034][arg1][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(45) byte local45 = 0;
			Static119.anIntArray252[0] = arg1;
			@Pc(52) int local52 = local45 + 1;
			Static168.anIntArray321[0] = arg3;
			Static35.aByteArrayArrayArray12[Static140.anInt3034][arg1][arg3] = local10;
			@Pc(64) int local64 = 0;
			while (local52 != local64) {
				@Pc(75) int local75 = Static119.anIntArray252[local64] >> 24 & 0xFF;
				@Pc(81) int local81 = Static119.anIntArray252[local64] & 0xFFFF;
				@Pc(89) int local89 = Static119.anIntArray252[local64] >> 16 & 0xFF;
				@Pc(95) int local95 = Static168.anIntArray321[local64] & 0xFFFF;
				@Pc(97) boolean local97 = false;
				@Pc(105) int local105 = Static168.anIntArray321[local64] >> 16 & 0xFF;
				@Pc(107) boolean local107 = false;
				local64 = local64 + 1 & 0xFFF;
				if ((Static260.aByteArrayArrayArray25[Static140.anInt3034][local81][local95] & 0x4) == 0) {
					local107 = true;
				}
				@Pc(129) int local129;
				@Pc(172) int local172;
				label243: for (local129 = Static140.anInt3034 + 1; local129 <= 3; local129++) {
					if ((Static260.aByteArrayArrayArray25[local129][local81][local95] & 0x8) == 0) {
						@Pc(207) int local207;
						@Pc(346) int local346;
						if (local107 && arg2[local129][local81][local95] != null) {
							if (arg2[local129][local81][local95].aClass72_1 != null) {
								local172 = Static244.method3755(local89);
								if (arg2[local129][local81][local95].aClass72_1.anInt2731 == local172 || local172 == arg2[local129][local81][local95].aClass72_1.anInt2740) {
									continue;
								}
								if (local75 != 0) {
									local207 = Static244.method3755(local75);
									if (local207 == arg2[local129][local81][local95].aClass72_1.anInt2731 || arg2[local129][local81][local95].aClass72_1.anInt2740 == local207) {
										continue;
									}
								}
								if (local105 != 0) {
									local207 = Static244.method3755(local105);
									if (local207 == arg2[local129][local81][local95].aClass72_1.anInt2731 || arg2[local129][local81][local95].aClass72_1.anInt2740 == local207) {
										continue;
									}
								}
							}
							if (arg2[local129][local81][local95].aClass25Array4 != null) {
								for (local172 = 0; local172 < arg2[local129][local81][local95].anInt4090; local172++) {
									local207 = (int) (arg2[local129][local81][local95].aClass25Array4[local172].aLong39 >> 14 & 0x3FL);
									if (local207 == 21) {
										local207 = 19;
									}
									@Pc(340) int local340 = (int) (arg2[local129][local81][local95].aClass25Array4[local172].aLong39 >> 20 & 0x3L);
									local346 = local207 | local340 << 6;
									if (local346 == local89 || local75 != 0 && local75 == local346 || local105 != 0 && local346 == local105) {
										continue label243;
									}
								}
							}
						}
						local97 = true;
						@Pc(387) Class1_Sub26 local387 = arg2[local129][local81][local95];
						if (local387 != null && local387.anInt4090 > 0) {
							for (local207 = 0; local207 < local387.anInt4090; local207++) {
								@Pc(404) Class25 local404 = local387.aClass25Array4[local207];
								if (local404.anInt1003 != local404.anInt1004 || local404.anInt999 != local404.anInt1000) {
									for (local346 = local404.anInt1003; local346 <= local404.anInt1004; local346++) {
										for (@Pc(432) int local432 = local404.anInt1000; local432 <= local404.anInt999; local432++) {
											Static35.aByteArrayArrayArray12[local129][local346][local432] = local10;
										}
									}
								}
							}
						}
						Static35.aByteArrayArrayArray12[local129][local81][local95] = local10;
					}
				}
				if (local97) {
					if (Static125.anIntArray258[arg0] < Static55.anIntArrayArrayArray3[Static140.anInt3034 + 1][local81][local95]) {
						Static125.anIntArray258[arg0] = Static55.anIntArrayArrayArray3[Static140.anInt3034 + 1][local81][local95];
					}
					local172 = local95 << 7;
					local129 = local81 << 7;
					if (Static232.anIntArray405[arg0] > local129) {
						Static232.anIntArray405[arg0] = local129;
					} else if (local129 > Static100.anIntArray212[arg0]) {
						Static100.anIntArray212[arg0] = local129;
					}
					if (local172 < Static14.anIntArray33[arg0]) {
						Static14.anIntArray33[arg0] = local172;
					} else if (local172 > Static18.anIntArray42[arg0]) {
						Static18.anIntArray42[arg0] = local172;
					}
				}
				if (!local107) {
					if (local81 >= 1 && Static35.aByteArrayArrayArray12[Static140.anInt3034][local81 - 1][local95] != local10) {
						Static119.anIntArray252[local52] = local81 - 1 | 0x120000 | 0xD3000000;
						Static168.anIntArray321[local52] = local95 | 0x130000;
						Static35.aByteArrayArrayArray12[Static140.anInt3034][local81 - 1][local95] = local10;
						local52 = local52 + 1 & 0xFFF;
					}
					local95++;
					if (local95 < 104) {
						if (local81 - 1 >= 0 && Static35.aByteArrayArrayArray12[Static140.anInt3034][local81 - 1][local95] != local10 && (Static260.aByteArrayArrayArray25[Static140.anInt3034][local81][local95] & 0x4) == 0 && (Static260.aByteArrayArrayArray25[Static140.anInt3034][local81 - 1][local95 - 1] & 0x4) == 0) {
							Static119.anIntArray252[local52] = 0x52000000 | 0x120000 | local81 - 1;
							Static168.anIntArray321[local52] = local95 | 0x130000;
							local52 = local52 + 1 & 0xFFF;
							Static35.aByteArrayArrayArray12[Static140.anInt3034][local81 - 1][local95] = local10;
						}
						if (Static35.aByteArrayArrayArray12[Static140.anInt3034][local81][local95] != local10) {
							Static119.anIntArray252[local52] = local81 | 0x520000 | 0x13000000;
							Static168.anIntArray321[local52] = local95 | 0x530000;
							local52 = local52 + 1 & 0xFFF;
							Static35.aByteArrayArrayArray12[Static140.anInt3034][local81][local95] = local10;
						}
						if (local81 + 1 < 104 && Static35.aByteArrayArrayArray12[Static140.anInt3034][local81 + 1][local95] != local10 && (Static260.aByteArrayArrayArray25[Static140.anInt3034][local81][local95] & 0x4) == 0 && (Static260.aByteArrayArrayArray25[Static140.anInt3034][local81 + 1][local95 - 1] & 0x4) == 0) {
							Static119.anIntArray252[local52] = local81 + 1 | 0x520000 | 0x92000000;
							Static168.anIntArray321[local52] = local95 | 0x530000;
							local52 = local52 + 1 & 0xFFF;
							Static35.aByteArrayArrayArray12[Static140.anInt3034][local81 + 1][local95] = local10;
						}
					}
					local95--;
					if (local81 + 1 < 104 && local10 != Static35.aByteArrayArrayArray12[Static140.anInt3034][local81 + 1][local95]) {
						Static119.anIntArray252[local52] = local81 + 1 | 0x53000000 | 0x920000;
						Static168.anIntArray321[local52] = local95 | 0x930000;
						Static35.aByteArrayArrayArray12[Static140.anInt3034][local81 + 1][local95] = local10;
						local52 = local52 + 1 & 0xFFF;
					}
					local95--;
					if (local95 >= 0) {
						if (local81 - 1 >= 0 && local10 != Static35.aByteArrayArrayArray12[Static140.anInt3034][local81 - 1][local95] && (Static260.aByteArrayArrayArray25[Static140.anInt3034][local81][local95] & 0x4) == 0 && (Static260.aByteArrayArrayArray25[Static140.anInt3034][local81 - 1][local95 + 1] & 0x4) == 0) {
							Static119.anIntArray252[local52] = local81 - 1 | 0x12000000 | 0xD20000;
							Static168.anIntArray321[local52] = local95 | 0xD30000;
							Static35.aByteArrayArrayArray12[Static140.anInt3034][local81 - 1][local95] = local10;
							local52 = local52 + 1 & 0xFFF;
						}
						if (local10 != Static35.aByteArrayArrayArray12[Static140.anInt3034][local81][local95]) {
							Static119.anIntArray252[local52] = 0x93000000 | 0xD20000 | local81;
							Static168.anIntArray321[local52] = local95 | 0xD30000;
							Static35.aByteArrayArrayArray12[Static140.anInt3034][local81][local95] = local10;
							local52 = local52 + 1 & 0xFFF;
						}
						if (local81 + 1 < 104 && Static35.aByteArrayArrayArray12[Static140.anInt3034][local81 + 1][local95] != local10 && (Static260.aByteArrayArrayArray25[Static140.anInt3034][local81][local95] & 0x4) == 0 && (Static260.aByteArrayArrayArray25[Static140.anInt3034][local81 + 1][local95 + 1] & 0x4) == 0) {
							Static119.anIntArray252[local52] = local81 + 1 | 0x920000 | 0xD2000000;
							Static168.anIntArray321[local52] = local95 | 0x930000;
							local52 = local52 + 1 & 0xFFF;
							Static35.aByteArrayArrayArray12[Static140.anInt3034][local81 + 1][local95] = local10;
						}
					}
				}
			}
			if (Static125.anIntArray258[arg0] != -1000000) {
				Static125.anIntArray258[arg0] += 10;
				Static232.anIntArray405[arg0] -= 50;
				Static100.anIntArray212[arg0] += 50;
				Static18.anIntArray42[arg0] += 50;
				Static14.anIntArray33[arg0] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZLclient!in;)V")
	public static void method3686(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class71 arg1) {
		@Pc(11) int local11 = arg1.anInt2650 == 0 ? arg1.anInt2698 : arg1.anInt2650;
		@Pc(33) int local33 = arg1.anInt2647 == 0 ? arg1.anInt2722 : arg1.anInt2647;
		Static178.method3185(local11, Static77.aClass71ArrayArray1[arg1.anInt2655 >> 16], arg1.anInt2655, local33, arg0);
		if (arg1.aClass71Array1 != null) {
			Static178.method3185(local11, arg1.aClass71Array1, arg1.anInt2655, local33, arg0);
		}
		@Pc(72) Class1_Sub17 local72 = (Class1_Sub17) Static256.aClass70_17.method2075((long) arg1.anInt2655);
		if (local72 != null) {
			Static146.method2567(local11, arg0, local33, local72.anInt2431);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLclient!wa;)V")
	public static void method3687(@OriginalArg(1) Class175 arg0) {
		@Pc(3) Class115 local3 = null;
		try {
			@Pc(8) Class116 local8 = arg0.method4338("runescape");
			while (local8.anInt3812 == 0) {
				Static48.method934(1L);
			}
			if (local8.anInt3812 == 1) {
				local3 = (Class115) local8.anObject5;
				@Pc(33) Class1_Sub11 local33 = Static262.method4020();
				local3.method3061(0, local33.anInt3264, local33.aByteArray47);
			}
		} catch (@Pc(51) Exception local51) {
		}
		try {
			if (local3 != null) {
				local3.method3060();
			}
		} catch (@Pc(63) Exception local63) {
		}
	}
}
