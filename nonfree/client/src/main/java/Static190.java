import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Lclient!ob;")
	public static Class2_Sub7_Sub12 aClass2_Sub7_Sub12_2;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "[Lclient!rg;")
	public static Class27[] aClass27Array33;

	@OriginalMember(owner = "client!l", name = "k", descriptor = "Lclient!rg;")
	public static Class27 aClass27_12;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray19 = new String[100];

	@OriginalMember(owner = "client!l", name = "h", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_107 = new Class208(54, 2);

	@OriginalMember(owner = "client!l", name = "j", descriptor = "I")
	public static int anInt3986 = 3;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "I")
	public static int anInt3987 = -1;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([[[Lclient!qa;IZIII)Z")
	public static boolean method3482(@OriginalArg(0) Class188[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg2 ? 1 : (byte) (Static87.anInt1878 & 0xFF);
		if (local14 == Static116.aByteArrayArrayArray2[Static241.anInt2711][arg1][arg3]) {
			return false;
		} else if ((Static329.aByteArrayArrayArray17[Static241.anInt2711][arg1][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(43) byte local43 = 0;
			Static263.anIntArray407[0] = arg1;
			@Pc(54) int local54 = 0;
			@Pc(57) int local57 = local43 + 1;
			Static9.anIntArray20[0] = arg3;
			Static116.aByteArrayArrayArray2[Static241.anInt2711][arg1][arg3] = local14;
			while (local57 != local54) {
				@Pc(75) int local75 = Static263.anIntArray407[local54] & 0xFFFF;
				@Pc(83) int local83 = Static263.anIntArray407[local54] >> 16 & 0xFF;
				@Pc(91) int local91 = Static263.anIntArray407[local54] >> 24 & 0xFF;
				@Pc(97) int local97 = Static9.anIntArray20[local54] & 0xFFFF;
				@Pc(105) int local105 = Static9.anIntArray20[local54] >> 16 & 0xFF;
				local54 = local54 + 1 & 0xFFF;
				@Pc(113) boolean local113 = false;
				if ((Static329.aByteArrayArrayArray17[Static241.anInt2711][local75][local97] & 0x4) == 0) {
					local113 = true;
				}
				@Pc(130) boolean local130 = false;
				@Pc(172) int local172;
				@Pc(215) int local215;
				label231: for (@Pc(134) int local134 = Static241.anInt2711 + 1; local134 <= 3; local134++) {
					if ((Static329.aByteArrayArrayArray17[local134][local75][local97] & 0x8) == 0) {
						@Pc(315) Class1_Sub2 local315;
						@Pc(325) int local325;
						@Pc(304) Class188 local304;
						@Pc(310) Class168 local310;
						if (local113 && arg0[local134][local75][local97] != null) {
							if (arg0[local134][local75][local97].aClass1_Sub5_2 != null) {
								local172 = Static273.method4583(local83);
								if (arg0[local134][local75][local97].aClass1_Sub5_2.anInt6722 == local172 || arg0[local134][local75][local97].aClass1_Sub5_1 != null && local172 == arg0[local134][local75][local97].aClass1_Sub5_1.anInt6722) {
									continue;
								}
								if (local91 != 0) {
									local215 = Static273.method4583(local91);
									if (arg0[local134][local75][local97].aClass1_Sub5_2.anInt6722 == local215 || arg0[local134][local75][local97].aClass1_Sub5_1 != null && local215 == arg0[local134][local75][local97].aClass1_Sub5_1.anInt6722) {
										continue;
									}
								}
								if (local105 != 0) {
									local215 = Static273.method4583(local105);
									if (arg0[local134][local75][local97].aClass1_Sub5_2.anInt6722 == local215 || arg0[local134][local75][local97].aClass1_Sub5_1 != null && local215 == arg0[local134][local75][local97].aClass1_Sub5_1.anInt6722) {
										continue;
									}
								}
							}
							local304 = arg0[local134][local75][local97];
							if (local304.aClass168_2 != null) {
								for (local310 = local304.aClass168_2; local310 != null; local310 = local310.aClass168_1) {
									local315 = local310.aClass1_Sub2_1;
									if (local315 instanceof Interface8) {
										@Pc(321) Interface8 local321 = (Interface8) local315;
										local325 = local321.method6027();
										if (local325 == 21) {
											local325 = 19;
										}
										@Pc(336) int local336 = local321.method6031();
										@Pc(342) int local342 = local336 << 6 | local325;
										if (local83 == local342 || local91 != 0 && local342 == local91 || local105 != 0 && local105 == local342) {
											continue label231;
										}
									}
								}
							}
						}
						local304 = arg0[local134][local75][local97];
						if (local304 != null && local304.aClass168_2 != null) {
							for (local310 = local304.aClass168_2; local310 != null; local310 = local310.aClass168_1) {
								local315 = local310.aClass1_Sub2_1;
								if (local315.aShort95 != local315.aShort97 || local315.aShort96 != local315.aShort94) {
									for (@Pc(400) int local400 = local315.aShort95; local400 <= local315.aShort97; local400++) {
										for (local325 = local315.aShort96; local325 <= local315.aShort94; local325++) {
											Static116.aByteArrayArrayArray2[local134][local400][local325] = local14;
										}
									}
								}
							}
						}
						local130 = true;
						Static116.aByteArrayArrayArray2[local134][local75][local97] = local14;
					}
				}
				if (local130) {
					local172 = Static128.aClass149Array1[Static241.anInt2711 + 1].method5837(local75, local97);
					if (local172 > Static172.anIntArray273[arg4]) {
						Static172.anIntArray273[arg4] = local172;
					}
					local215 = local75 << 7;
					if (local215 < Static67.anIntArray112[arg4]) {
						Static67.anIntArray112[arg4] = local215;
					} else if (local215 > Static230.anIntArray383[arg4]) {
						Static230.anIntArray383[arg4] = local215;
					}
					@Pc(496) int local496 = local97 << 7;
					if (local496 < Static345.anIntArray541[arg4]) {
						Static345.anIntArray541[arg4] = local496;
					} else if (local496 > Static17.anIntArray51[arg4]) {
						Static17.anIntArray51[arg4] = local496;
					}
				}
				if (!local113) {
					if (local75 >= 1 && local14 != Static116.aByteArrayArrayArray2[Static241.anInt2711][local75 - 1][local97]) {
						Static263.anIntArray407[local57] = local75 - 1 | 0x120000 | 0xD3000000;
						Static9.anIntArray20[local57] = local97 | 0x130000;
						Static116.aByteArrayArrayArray2[Static241.anInt2711][local75 - 1][local97] = local14;
						local57 = local57 + 1 & 0xFFF;
					}
					local97++;
					if (Static85.anInt1839 > local97) {
						if (local75 - 1 >= 0 && local14 != Static116.aByteArrayArrayArray2[Static241.anInt2711][local75 - 1][local97] && (Static329.aByteArrayArrayArray17[Static241.anInt2711][local75][local97] & 0x4) == 0 && (Static329.aByteArrayArrayArray17[Static241.anInt2711][local75 - 1][local97 - 1] & 0x4) == 0) {
							Static263.anIntArray407[local57] = local75 - 1 | 0x120000 | 0x52000000;
							Static9.anIntArray20[local57] = local97 | 0x130000;
							local57 = local57 + 1 & 0xFFF;
							Static116.aByteArrayArrayArray2[Static241.anInt2711][local75 - 1][local97] = local14;
						}
						if (local14 != Static116.aByteArrayArrayArray2[Static241.anInt2711][local75][local97]) {
							Static263.anIntArray407[local57] = local75 | 0x520000 | 0x13000000;
							Static9.anIntArray20[local57] = local97 | 0x530000;
							local57 = local57 + 1 & 0xFFF;
							Static116.aByteArrayArrayArray2[Static241.anInt2711][local75][local97] = local14;
						}
						if (Static89.anInt1891 > local75 + 1 && local14 != Static116.aByteArrayArrayArray2[Static241.anInt2711][local75 + 1][local97] && (Static329.aByteArrayArrayArray17[Static241.anInt2711][local75][local97] & 0x4) == 0 && (Static329.aByteArrayArrayArray17[Static241.anInt2711][local75 + 1][local97 - 1] & 0x4) == 0) {
							Static263.anIntArray407[local57] = local75 + 1 | 0x92000000 | 0x520000;
							Static9.anIntArray20[local57] = local97 | 0x530000;
							local57 = local57 + 1 & 0xFFF;
							Static116.aByteArrayArrayArray2[Static241.anInt2711][local75 + 1][local97] = local14;
						}
					}
					local97--;
					if (Static89.anInt1891 > local75 + 1 && Static116.aByteArrayArrayArray2[Static241.anInt2711][local75 + 1][local97] != local14) {
						Static263.anIntArray407[local57] = local75 + 1 | 0x920000 | 0x53000000;
						Static9.anIntArray20[local57] = local97 | 0x930000;
						Static116.aByteArrayArrayArray2[Static241.anInt2711][local75 + 1][local97] = local14;
						local57 = local57 + 1 & 0xFFF;
					}
					local97--;
					if (local97 >= 0) {
						if (local75 - 1 >= 0 && Static116.aByteArrayArrayArray2[Static241.anInt2711][local75 - 1][local97] != local14 && (Static329.aByteArrayArrayArray17[Static241.anInt2711][local75][local97] & 0x4) == 0 && (Static329.aByteArrayArrayArray17[Static241.anInt2711][local75 - 1][local97 + 1] & 0x4) == 0) {
							Static263.anIntArray407[local57] = local75 - 1 | 0xD20000 | 0x12000000;
							Static9.anIntArray20[local57] = local97 | 0xD30000;
							Static116.aByteArrayArrayArray2[Static241.anInt2711][local75 - 1][local97] = local14;
							local57 = local57 + 1 & 0xFFF;
						}
						if (local14 != Static116.aByteArrayArrayArray2[Static241.anInt2711][local75][local97]) {
							Static263.anIntArray407[local57] = local75 | 0xD20000 | 0x93000000;
							Static9.anIntArray20[local57] = local97 | 0xD30000;
							Static116.aByteArrayArrayArray2[Static241.anInt2711][local75][local97] = local14;
							local57 = local57 + 1 & 0xFFF;
						}
						if (Static89.anInt1891 > local75 + 1 && Static116.aByteArrayArrayArray2[Static241.anInt2711][local75 + 1][local97] != local14 && (Static329.aByteArrayArrayArray17[Static241.anInt2711][local75][local97] & 0x4) == 0 && (Static329.aByteArrayArrayArray17[Static241.anInt2711][local75 + 1][local97 + 1] & 0x4) == 0) {
							Static263.anIntArray407[local57] = local75 + 1 | 0x920000 | 0xD2000000;
							Static9.anIntArray20[local57] = local97 | 0x930000;
							Static116.aByteArrayArrayArray2[Static241.anInt2711][local75 + 1][local97] = local14;
							local57 = local57 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static172.anIntArray273[arg4] != -1000000) {
				Static172.anIntArray273[arg4] += 10;
				Static67.anIntArray112[arg4] -= 50;
				Static230.anIntArray383[arg4] += 50;
				Static17.anIntArray51[arg4] += 50;
				Static345.anIntArray541[arg4] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)V")
	public static void method3483(@OriginalArg(1) int arg0) {
		Static31.anInt460 = arg0;
		Static120.aClass41_29.method825();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)V")
	public static void method3484(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static328.method5290(8, arg0);
		local8.method1197();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V")
	public static void method3486(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static8.anInt492 = arg0 - Static20.anInt4611;
		Static79.anInt1735 = arg1 - Static20.anInt4606;
	}
}
