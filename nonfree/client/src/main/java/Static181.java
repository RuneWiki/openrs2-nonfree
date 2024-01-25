import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
	public static int anInt3889;

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "Lclient!hca;")
	public static Class115 aClass115_2;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "[I")
	public static final int[] anIntArray298 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!gw;I)Ljava/lang/String;")
	public static String method3469(@OriginalArg(1) Class1_Sub13 arg0) {
		try {
			@Pc(7) int local7 = arg0.method3066();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt3400 += Static434.aClass283_1.method6934(local7, local15, 0, arg0.aByteArray45, arg0.anInt3400);
			return Static475.method6888(0, local15, local7);
		} catch (@Pc(52) Exception local52) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
	public static void method3473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class1_Sub1_Sub13 local12 = Static476.method6225(13, arg1);
		local12.method4919();
		local12.anInt5686 = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZI[[[Lclient!nj;ZII)Z")
	public static boolean method3475(@OriginalArg(1) int arg0, @OriginalArg(2) Class206[][][] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) byte local12 = arg2 ? 1 : (byte) (Static15.anInt833 & 0xFF);
		if (local12 == Static388.aByteArrayArrayArray16[Static245.anInt4747][arg4][arg3]) {
			return false;
		} else if ((Static542.aByteArrayArrayArray17[Static245.anInt4747][arg4][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(37) byte local37 = 0;
			@Pc(39) int local39 = 0;
			Static339.anIntArray471[0] = arg4;
			@Pc(57) int local57 = local37 + 1;
			Static369.anIntArray491[0] = arg3;
			Static388.aByteArrayArrayArray16[Static245.anInt4747][arg4][arg3] = local12;
			while (local39 != local57) {
				@Pc(74) int local74 = Static339.anIntArray471[local39] & 0xFFFF;
				@Pc(82) int local82 = Static339.anIntArray471[local39] >> 16 & 0xFF;
				@Pc(90) int local90 = Static339.anIntArray471[local39] >> 24 & 0xFF;
				@Pc(96) int local96 = Static369.anIntArray491[local39] & 0xFFFF;
				@Pc(104) int local104 = Static369.anIntArray491[local39] >> 16 & 0xFF;
				local39 = local39 + 1 & 0xFFF;
				@Pc(112) boolean local112 = false;
				if ((Static542.aByteArrayArrayArray17[Static245.anInt4747][local74][local96] & 0x4) == 0) {
					local112 = true;
				}
				@Pc(129) boolean local129 = false;
				@Pc(167) int local167;
				@Pc(209) int local209;
				label231: for (@Pc(133) int local133 = Static245.anInt4747 + 1; local133 <= 3; local133++) {
					if ((Static542.aByteArrayArrayArray17[local133][local74][local96] & 0x8) == 0) {
						@Pc(312) Class47_Sub2 local312;
						@Pc(322) int local322;
						@Pc(302) Class206 local302;
						@Pc(308) Class168 local308;
						if (local112 && arg1[local133][local74][local96] != null) {
							if (arg1[local133][local74][local96].aClass47_Sub4_2 != null) {
								local167 = Static380.method5783(local82);
								if (local167 == arg1[local133][local74][local96].aClass47_Sub4_2.anInt8074 || arg1[local133][local74][local96].aClass47_Sub4_1 != null && local167 == arg1[local133][local74][local96].aClass47_Sub4_1.anInt8074) {
									continue;
								}
								if (local90 != 0) {
									local209 = Static380.method5783(local90);
									if (arg1[local133][local74][local96].aClass47_Sub4_2.anInt8074 == local209 || arg1[local133][local74][local96].aClass47_Sub4_1 != null && local209 == arg1[local133][local74][local96].aClass47_Sub4_1.anInt8074) {
										continue;
									}
								}
								if (local104 != 0) {
									local209 = Static380.method5783(local104);
									if (arg1[local133][local74][local96].aClass47_Sub4_2.anInt8074 == local209 || arg1[local133][local74][local96].aClass47_Sub4_1 != null && local209 == arg1[local133][local74][local96].aClass47_Sub4_1.anInt8074) {
										continue;
									}
								}
							}
							local302 = arg1[local133][local74][local96];
							if (local302.aClass168_2 != null) {
								for (local308 = local302.aClass168_2; local308 != null; local308 = local308.aClass168_1) {
									local312 = local308.aClass47_Sub2_2;
									if (local312 instanceof Interface17) {
										@Pc(318) Interface17 local318 = (Interface17) local312;
										local322 = local318.method7176();
										if (local322 == 21) {
											local322 = 19;
										}
										@Pc(331) int local331 = local318.method7173();
										@Pc(337) int local337 = local331 << 6 | local322;
										if (local337 == local82 || local90 != 0 && local90 == local337 || local104 != 0 && local104 == local337) {
											continue label231;
										}
									}
								}
							}
						}
						local302 = arg1[local133][local74][local96];
						if (local302 != null && local302.aClass168_2 != null) {
							for (local308 = local302.aClass168_2; local308 != null; local308 = local308.aClass168_1) {
								local312 = local308.aClass47_Sub2_2;
								if (local312.aShort115 != local312.aShort116 || local312.aShort117 != local312.aShort114) {
									for (@Pc(404) int local404 = local312.aShort115; local404 <= local312.aShort116; local404++) {
										for (local322 = local312.aShort117; local322 <= local312.aShort114; local322++) {
											Static388.aByteArrayArrayArray16[local133][local404][local322] = local12;
										}
									}
								}
							}
						}
						local129 = true;
						Static388.aByteArrayArrayArray16[local133][local74][local96] = local12;
					}
				}
				if (local129) {
					local167 = Static290.aClass10Array7[Static245.anInt4747 + 1].ba(local74, local96);
					if (Static213.anIntArray327[arg0] < local167) {
						Static213.anIntArray327[arg0] = local167;
					}
					local209 = local74 << 7;
					@Pc(484) int local484 = local96 << 7;
					if (local209 < Static298.anIntArray407[arg0]) {
						Static298.anIntArray407[arg0] = local209;
					} else if (Static9.anIntArray16[arg0] < local209) {
						Static9.anIntArray16[arg0] = local209;
					}
					if (local484 < Static460.anIntArray621[arg0]) {
						Static460.anIntArray621[arg0] = local484;
					} else if (local484 > Static55.anIntArray141[arg0]) {
						Static55.anIntArray141[arg0] = local484;
					}
				}
				if (!local112) {
					if (local74 >= 1 && local12 != Static388.aByteArrayArrayArray16[Static245.anInt4747][local74 - 1][local96]) {
						Static339.anIntArray471[local57] = local74 - 1 | 0x120000 | 0xD3000000;
						Static369.anIntArray491[local57] = local96 | 0x130000;
						Static388.aByteArrayArrayArray16[Static245.anInt4747][local74 - 1][local96] = local12;
						local57 = local57 + 1 & 0xFFF;
					}
					local96++;
					if (local96 < Static36.anInt1324) {
						if (local74 - 1 >= 0 && local12 != Static388.aByteArrayArrayArray16[Static245.anInt4747][local74 - 1][local96] && (Static542.aByteArrayArrayArray17[Static245.anInt4747][local74][local96] & 0x4) == 0 && (Static542.aByteArrayArrayArray17[Static245.anInt4747][local74 - 1][local96 - 1] & 0x4) == 0) {
							Static339.anIntArray471[local57] = local74 - 1 | 0x120000 | 0x52000000;
							Static369.anIntArray491[local57] = local96 | 0x130000;
							Static388.aByteArrayArrayArray16[Static245.anInt4747][local74 - 1][local96] = local12;
							local57 = local57 + 1 & 0xFFF;
						}
						if (Static388.aByteArrayArrayArray16[Static245.anInt4747][local74][local96] != local12) {
							Static339.anIntArray471[local57] = 0x13000000 | 0x520000 | local74;
							Static369.anIntArray491[local57] = local96 | 0x530000;
							Static388.aByteArrayArrayArray16[Static245.anInt4747][local74][local96] = local12;
							local57 = local57 + 1 & 0xFFF;
						}
						if (Static542.anInt9387 > local74 + 1 && local12 != Static388.aByteArrayArrayArray16[Static245.anInt4747][local74 + 1][local96] && (Static542.aByteArrayArrayArray17[Static245.anInt4747][local74][local96] & 0x4) == 0 && (Static542.aByteArrayArrayArray17[Static245.anInt4747][local74 + 1][local96 - 1] & 0x4) == 0) {
							Static339.anIntArray471[local57] = local74 + 1 | 0x520000 | 0x92000000;
							Static369.anIntArray491[local57] = local96 | 0x530000;
							local57 = local57 + 1 & 0xFFF;
							Static388.aByteArrayArrayArray16[Static245.anInt4747][local74 + 1][local96] = local12;
						}
					}
					local96--;
					if (Static542.anInt9387 > local74 + 1 && local12 != Static388.aByteArrayArrayArray16[Static245.anInt4747][local74 + 1][local96]) {
						Static339.anIntArray471[local57] = local74 + 1 | 0x53000000 | 0x920000;
						Static369.anIntArray491[local57] = local96 | 0x930000;
						Static388.aByteArrayArrayArray16[Static245.anInt4747][local74 + 1][local96] = local12;
						local57 = local57 + 1 & 0xFFF;
					}
					local96--;
					if (local96 >= 0) {
						if (local74 - 1 >= 0 && local12 != Static388.aByteArrayArrayArray16[Static245.anInt4747][local74 - 1][local96] && (Static542.aByteArrayArrayArray17[Static245.anInt4747][local74][local96] & 0x4) == 0 && (Static542.aByteArrayArrayArray17[Static245.anInt4747][local74 - 1][local96 + 1] & 0x4) == 0) {
							Static339.anIntArray471[local57] = local74 - 1 | 0xD20000 | 0x12000000;
							Static369.anIntArray491[local57] = local96 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static388.aByteArrayArrayArray16[Static245.anInt4747][local74 - 1][local96] = local12;
						}
						if (Static388.aByteArrayArrayArray16[Static245.anInt4747][local74][local96] != local12) {
							Static339.anIntArray471[local57] = local74 | 0xD20000 | 0x93000000;
							Static369.anIntArray491[local57] = local96 | 0xD30000;
							Static388.aByteArrayArrayArray16[Static245.anInt4747][local74][local96] = local12;
							local57 = local57 + 1 & 0xFFF;
						}
						if (Static542.anInt9387 > local74 + 1 && Static388.aByteArrayArrayArray16[Static245.anInt4747][local74 + 1][local96] != local12 && (Static542.aByteArrayArrayArray17[Static245.anInt4747][local74][local96] & 0x4) == 0 && (Static542.aByteArrayArrayArray17[Static245.anInt4747][local74 + 1][local96 + 1] & 0x4) == 0) {
							Static339.anIntArray471[local57] = local74 + 1 | 0x920000 | 0xD2000000;
							Static369.anIntArray491[local57] = local96 | 0x930000;
							local57 = local57 + 1 & 0xFFF;
							Static388.aByteArrayArrayArray16[Static245.anInt4747][local74 + 1][local96] = local12;
						}
					}
				}
			}
			if (Static213.anIntArray327[arg0] != -1000000) {
				Static213.anIntArray327[arg0] += 10;
				Static298.anIntArray407[arg0] -= 50;
				Static9.anIntArray16[arg0] += 50;
				Static55.anIntArray141[arg0] += 50;
				Static460.anIntArray621[arg0] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIII)V")
	public static void method3478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static193.method3621(Static341.anInt6379, arg3, Static92.anInt2338);
		@Pc(17) int local17 = Static193.method3621(Static341.anInt6379, arg0, Static92.anInt2338);
		@Pc(23) int local23 = Static193.method3621(Static299.anInt4491, arg5, Static95.anInt2358);
		@Pc(29) int local29 = Static193.method3621(Static299.anInt4491, arg4, Static95.anInt2358);
		@Pc(37) int local37 = Static193.method3621(Static341.anInt6379, arg2 + arg3, Static92.anInt2338);
		@Pc(46) int local46 = Static193.method3621(Static341.anInt6379, arg0 - arg2, Static92.anInt2338);
		for (@Pc(52) int local52 = local11; local52 < local37; local52++) {
			Static227.method7421(local23, arg1, local29, Static81.anIntArrayArray25[local52]);
		}
		for (@Pc(68) int local68 = local17; local68 > local46; local68--) {
			Static227.method7421(local23, arg1, local29, Static81.anIntArrayArray25[local68]);
		}
		@Pc(95) int local95 = Static193.method3621(Static299.anInt4491, arg5 + arg2, Static95.anInt2358);
		@Pc(104) int local104 = Static193.method3621(Static299.anInt4491, arg4 - arg2, Static95.anInt2358);
		for (@Pc(106) int local106 = local37; local106 <= local46; local106++) {
			@Pc(112) int[] local112 = Static81.anIntArrayArray25[local106];
			Static227.method7421(local23, arg1, local95, local112);
			Static227.method7421(local104, arg1, local29, local112);
		}
	}
}
