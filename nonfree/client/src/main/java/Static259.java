import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "Lclient!pe;")
	public static Class89 aClass89_7;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
	public static int anInt5007 = 0;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString316 = "glow3:";

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
	public static int anInt5012 = 0;

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
	public static int anInt5013 = -1;

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
	public static int anInt5015 = 0;

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "[I")
	public static final int[] anIntArray656 = new int[1000];

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Z")
	public static boolean method4349(@OriginalArg(0) int arg0) {
		if (arg0 == 41 || arg0 == 35 || arg0 == 7 || arg0 == 22 || arg0 == 23) {
			return true;
		} else {
			return arg0 == 11 || arg0 == 32 || arg0 == 1008;
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	public static void method4351() {
		@Pc(1) Class202 local1 = Static263.aClass202_1;
		synchronized (Static263.aClass202_1) {
			Static180.anInt3668 = Static296.anInt5941;
			Static81.anInt2142++;
			Static240.anInt6396 = Static91.anInt5974;
			Static100.anInt2436 = Static150.anInt1955;
			Static354.anInt6682 = Static176.anInt3626;
			Static169.anInt3518 = Static121.anInt2741;
			Static108.anInt1312 = Static303.anInt5807;
			Static169.aLong124 = Static164.aLong118;
			Static176.anInt3626 = 0;
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)I")
	public static int method4352(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(20) int local20 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local20 == 0) {
				return 1;
			}
			if (local20 == 1) {
				return 2;
			}
			if (local20 == 2) {
				return 4;
			}
			if (local20 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local20 == 0) {
				return 16;
			}
			if (local20 == 1) {
				return 32;
			}
			if (local20 == 2) {
				return 64;
			}
			if (local20 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(II)Lclient!af;")
	public static Class7_Sub1_Sub1 method4353(@OriginalArg(0) int arg0) {
		@Pc(10) Class7_Sub1_Sub1 local10 = (Class7_Sub1_Sub1) Static305.aClass154_8.method4079((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28;
		if (arg0 < 32768) {
			local28 = Static286.aClass180_79.method4560(arg0, 1);
		} else {
			local28 = Static211.aClass180_54.method4560(arg0 & 0x7FFF, 1);
		}
		local10 = new Class7_Sub1_Sub1();
		if (local28 != null) {
			local10.method103(new Class7_Sub3(local28));
		}
		if (arg0 >= 32768) {
			local10.method101();
		}
		Static305.aClass154_8.method4078(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLclient!pe;I)V")
	public static void method4354(@OriginalArg(1) Class89 arg0, @OriginalArg(2) int arg1) {
		Static89.method1862(arg0);
		@Pc(20) int local20;
		@Pc(24) int local24;
		if (arg1 > 1) {
			for (local20 = 0; local20 < Static15.anInt287; local20++) {
				for (local24 = 0; local24 < Static325.anInt6173; local24++) {
					if ((Static92.aByteArrayArrayArray3[1][local20][local24] & 0x2) == 2) {
						Static124.method2592(local20, local24);
					}
				}
			}
		}
		for (local20 = 0; local20 < arg1; local20++) {
			for (local24 = 0; local24 <= Static325.anInt6173; local24++) {
				for (@Pc(58) int local58 = 0; local58 <= Static15.anInt287; local58++) {
					@Pc(75) int local75;
					@Pc(77) int local77;
					@Pc(79) int local79;
					@Pc(123) int local123;
					@Pc(127) int local127;
					@Pc(214) int local214;
					@Pc(222) int local222;
					@Pc(242) int local242;
					@Pc(246) int local246;
					if ((Static220.aByteArrayArrayArray9[local20][local58][local24] & 0x1) != 0) {
						local75 = local24;
						local77 = local24;
						local79 = local20;
						while (Static325.anInt6173 > local77 && (Static220.aByteArrayArrayArray9[local20][local58][local77 + 1] & 0x1) != 0) {
							local77++;
						}
						while (local75 > 0 && (Static220.aByteArrayArrayArray9[local20][local58][local75 - 1] & 0x1) != 0) {
							local75--;
						}
						local123 = local20;
						label164: while (local79 > 0) {
							for (local127 = local75; local127 <= local77; local127++) {
								if ((Static220.aByteArrayArrayArray9[local79 - 1][local58][local127] & 0x1) == 0) {
									break label164;
								}
							}
							local79--;
						}
						label153: while (local123 < 3) {
							for (local127 = local75; local127 <= local77; local127++) {
								if ((Static220.aByteArrayArrayArray9[local123 + 1][local58][local127] & 0x1) == 0) {
									break label153;
								}
							}
							local123++;
						}
						local127 = (local123 + 1 - local79) * (local77 + 1 - local75);
						if (local127 >= 2) {
							local214 = Static23.anIntArrayArrayArray15[local123][local58][local75] - 240;
							local222 = Static23.anIntArrayArrayArray15[local79][local58][local75];
							Static337.method5366(1, local58 * 128, local58 * 128, local75 * 128, local77 * 128 + 128, local214, local222);
							for (local242 = local79; local242 <= local123; local242++) {
								for (local246 = local75; local246 <= local77; local246++) {
									Static220.aByteArrayArrayArray9[local242][local58][local246] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static220.aByteArrayArrayArray9[local20][local58][local24] & 0x2) != 0) {
						local75 = local58;
						local77 = local58;
						local79 = local20;
						local123 = local20;
						while (local77 < Static15.anInt287 && (Static220.aByteArrayArrayArray9[local20][local77 + 1][local24] & 0x2) != 0) {
							local77++;
						}
						while (local75 > 0 && (Static220.aByteArrayArrayArray9[local20][local75 - 1][local24] & 0x2) != 0) {
							local75--;
						}
						label218: while (local79 > 0) {
							for (local127 = local75; local127 <= local77; local127++) {
								if ((Static220.aByteArrayArrayArray9[local79 - 1][local127][local24] & 0x2) == 0) {
									break label218;
								}
							}
							local79--;
						}
						label207: while (local123 < 3) {
							for (local127 = local75; local127 <= local77; local127++) {
								if ((Static220.aByteArrayArrayArray9[local123 + 1][local127][local24] & 0x2) == 0) {
									break label207;
								}
							}
							local123++;
						}
						local127 = (local123 + 1 - local79) * (local77 + 1 - local75);
						if (local127 >= 2) {
							local214 = Static23.anIntArrayArrayArray15[local123][local75][local24] - 240;
							local222 = Static23.anIntArrayArrayArray15[local79][local75][local24];
							Static337.method5366(2, local75 * 128, local77 * 128 + 128, local24 * 128, local24 * 128, local214, local222);
							for (local242 = local79; local242 <= local123; local242++) {
								for (local246 = local75; local246 <= local77; local246++) {
									Static220.aByteArrayArrayArray9[local242][local246][local24] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static220.aByteArrayArrayArray9[local20][local58][local24] & 0x4) != 0) {
						local75 = local58;
						local77 = local58;
						for (local79 = local24; local79 > 0 && (Static220.aByteArrayArrayArray9[local20][local58][local79 - 1] & 0x4) != 0; local79--) {
						}
						for (local123 = local24; local123 < Static325.anInt6173 && (Static220.aByteArrayArrayArray9[local20][local58][local123 + 1] & 0x4) != 0; local123++) {
						}
						label271: while (local75 > 0) {
							for (local127 = local79; local127 <= local123; local127++) {
								if ((Static220.aByteArrayArrayArray9[local20][local75 - 1][local127] & 0x4) == 0) {
									break label271;
								}
							}
							local75--;
						}
						label260: while (local77 < Static15.anInt287) {
							for (local127 = local79; local127 <= local123; local127++) {
								if ((Static220.aByteArrayArrayArray9[local20][local77 + 1][local127] & 0x4) == 0) {
									break label260;
								}
							}
							local77++;
						}
						if ((local77 + 1 - local75) * ((local123 + 1) - local79) >= 4) {
							local127 = Static23.anIntArrayArrayArray15[local20][local75][local79];
							Static337.method5366(4, local75 * 128, local77 * 128 + 128, local79 * 128, local123 * 128 + 128, local127, local127);
							for (@Pc(659) int local659 = local75; local659 <= local77; local659++) {
								for (local214 = local79; local214 <= local123; local214++) {
									Static220.aByteArrayArrayArray9[local20][local659][local214] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}
}
