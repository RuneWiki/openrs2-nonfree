import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	public static int anInt388;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "Lclient!ml;")
	public static Class1_Sub2_Sub16 aClass1_Sub2_Sub16_1;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	public static int anInt391;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
	public static int anInt379 = 0;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString11 = "white:";

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	public static int anInt390 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BZ)V")
	public static void method309(@OriginalArg(1) boolean arg0) {
		if (Static215.aBoolean264 != arg0) {
			Static215.aBoolean264 = arg0;
			Static148.method2782();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!kb;I)V")
	public static void method310(@OriginalArg(0) Class83 arg0) {
		Static272.aClass83_192 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!im;I)V")
	public static void method312(@OriginalArg(0) Class1_Sub16 arg0) {
		label125: while (true) {
			if (arg0.aByteArray39.length > arg0.anInt3328) {
				@Pc(29) boolean local29 = false;
				@Pc(31) int local31 = 0;
				@Pc(33) int local33 = 0;
				if (arg0.method2655() == 1) {
					local31 = arg0.method2655();
					local33 = arg0.method2655();
					local29 = true;
				}
				@Pc(53) int local53 = arg0.method2655();
				@Pc(57) int local57 = arg0.method2655();
				@Pc(64) int local64 = local53 * 64 - Static234.anInt5158;
				@Pc(75) int local75 = Static48.anInt1347 + Static173.anInt3932 - local57 * 64 - 1;
				@Pc(98) int local98;
				@Pc(113) int local113;
				if (local64 >= 0 && local75 - 63 >= 0 && Static178.anInt4022 > local64 + 63 && local75 < Static173.anInt3932) {
					local98 = local64 >> 6;
					local113 = local75 >> 6;
					@Pc(168) int local168 = 0;
					while (true) {
						if (local168 >= 64) {
							continue label125;
						}
						for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
							if (!local29 || local168 >= local31 * 8 && local168 < local31 * 8 + 8 && local33 * 8 <= local175 && local33 * 8 + 8 > local175) {
								@Pc(214) int local214 = arg0.method2655();
								if (local214 != 0) {
									@Pc(233) int local233;
									if ((local214 & 0x1) == 1) {
										local233 = arg0.method2655();
										if (Static191.aByteArrayArrayArray38[local98][local113] == null) {
											Static191.aByteArrayArrayArray38[local98][local113] = new byte[4096];
										}
										Static191.aByteArrayArrayArray38[local98][local113][(63 - local175 << 6) + local168] = (byte) local233;
									}
									if ((local214 & 0x2) == 2) {
										local233 = arg0.method2634();
										if (Static76.anIntArrayArrayArray17[local98][local113] == null) {
											Static76.anIntArrayArrayArray17[local98][local113] = new int[4096];
										}
										Static76.anIntArrayArrayArray17[local98][local113][(63 - local175 << 6) + local168] = local233;
									}
									if ((local214 & 0x4) == 4) {
										local233 = arg0.method2634();
										if (Static179.anIntArrayArrayArray15[local98][local113] == null) {
											Static179.anIntArrayArrayArray15[local98][local113] = new int[4096];
										}
										local233--;
										@Pc(332) Class30 local332 = Static268.method4511(local233);
										if (local332.anIntArray93 != null) {
											local332 = local332.method688();
											if (local332 == null || local332.anInt832 == -1) {
												continue;
											}
										}
										Static179.anIntArrayArrayArray15[local98][local113][(63 - local175 << 6) + local168] = local332.anInt875 + 1;
										@Pc(373) Class1_Sub33 local373 = new Class1_Sub33();
										local373.anInt6044 = local64;
										local373.anInt6050 = local332.anInt832;
										local373.anInt6043 = local75;
										Static265.aClass131_25.method3799(local373);
									}
								}
							}
						}
						local168++;
					}
				}
				local98 = 0;
				while (true) {
					if (local98 >= (local29 ? 64 : 4096)) {
						continue label125;
					}
					local113 = arg0.method2655();
					if (local113 != 0) {
						if ((local113 & 0x1) == 1) {
							arg0.anInt3328++;
						}
						if ((local113 & 0x2) == 2) {
							arg0.anInt3328 += 2;
						}
						if ((local113 & 0x4) == 4) {
							arg0.anInt3328 += 3;
						}
					}
					local98++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = arg0;
		@Pc(11) int local11 = arg4 - arg3;
		@Pc(13) int local13 = 0;
		@Pc(18) int local18 = arg0 - arg3;
		@Pc(20) int local20 = 0;
		@Pc(24) int local24 = arg4 * arg4;
		@Pc(28) int local28 = arg0 * arg0;
		@Pc(36) int local36 = local11 * local11;
		@Pc(40) int local40 = local18 * local18;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local28 << 1;
		@Pc(52) int local52 = local40 << 1;
		@Pc(56) int local56 = local18 << 1;
		@Pc(60) int local60 = local36 << 1;
		@Pc(70) int local70 = local36 * (1 - local56) + local52;
		@Pc(74) int local74 = arg0 << 1;
		@Pc(84) int local84 = (1 - local74) * local24 + local48;
		@Pc(88) int local88 = local24 << 2;
		@Pc(96) int local96 = local40 - (local56 - 1) * local60;
		@Pc(105) int local105 = local28 - local44 * (local74 - 1);
		@Pc(109) int local109 = local28 << 2;
		@Pc(113) int local113 = local36 << 2;
		@Pc(117) int local117 = local48 * 3;
		@Pc(121) int local121 = local40 << 2;
		@Pc(127) int local127 = (local74 - 3) * local44;
		@Pc(133) int local133 = (local56 - 3) * local60;
		@Pc(137) int local137 = local52 * 3;
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = (arg0 - 1) * local88;
		@Pc(147) int local147 = local121;
		@Pc(153) int local153 = (local18 - 1) * local113;
		@Pc(172) int local172;
		@Pc(183) int local183;
		@Pc(192) int local192;
		@Pc(201) int local201;
		if (arg6 >= Static152.anInt3532 && Static223.anInt1245 >= arg6) {
			@Pc(164) int[] local164 = Static57.anIntArrayArray9[arg6];
			local172 = Static223.method941(arg1 - arg4, Static88.anInt2052, Static102.anInt2239);
			local183 = Static223.method941(arg1 + arg4, Static88.anInt2052, Static102.anInt2239);
			local192 = Static223.method941(arg1 - local11, Static88.anInt2052, Static102.anInt2239);
			local201 = Static223.method941(arg1 + local11, Static88.anInt2052, Static102.anInt2239);
			Static89.method1538(local164, local192, local172, arg5);
			Static89.method1538(local164, local201, local192, arg2);
			Static89.method1538(local164, local183, local201, arg5);
		}
		while (local7 > 0) {
			if (local84 < 0) {
				while (local84 < 0) {
					local13++;
					local84 += local117;
					local117 += local109;
					local105 += local139;
					local139 += local109;
				}
			}
			@Pc(260) boolean local260 = local7 <= local18;
			if (local105 < 0) {
				local84 += local117;
				local105 += local139;
				local139 += local109;
				local13++;
				local117 += local109;
			}
			local7--;
			if (local260) {
				if (local70 < 0) {
					while (local70 < 0) {
						local20++;
						local96 += local147;
						local147 += local121;
						local70 += local137;
						local137 += local121;
					}
				}
				if (local96 < 0) {
					local20++;
					local70 += local137;
					local96 += local147;
					local137 += local121;
					local147 += local121;
				}
				local96 += -local133;
				local133 -= local113;
				local70 += -local153;
				local153 -= local113;
			}
			local105 += -local127;
			local84 += -local145;
			local127 -= local88;
			local172 = arg6 - local7;
			local183 = local7 + arg6;
			local145 -= local88;
			if (local183 >= Static152.anInt3532 && local172 <= Static223.anInt1245) {
				local192 = Static223.method941(local13 + arg1, Static88.anInt2052, Static102.anInt2239);
				local201 = Static223.method941(arg1 - local13, Static88.anInt2052, Static102.anInt2239);
				if (local260) {
					@Pc(414) int local414 = Static223.method941(local20 + arg1, Static88.anInt2052, Static102.anInt2239);
					@Pc(422) int local422 = Static223.method941(arg1 - local20, Static88.anInt2052, Static102.anInt2239);
					@Pc(434) int[] local434;
					if (local172 >= Static152.anInt3532) {
						local434 = Static57.anIntArrayArray9[local172];
						Static89.method1538(local434, local422, local201, arg5);
						Static89.method1538(local434, local414, local422, arg2);
						Static89.method1538(local434, local192, local414, arg5);
					}
					if (Static223.anInt1245 >= local183) {
						local434 = Static57.anIntArrayArray9[local183];
						Static89.method1538(local434, local422, local201, arg5);
						Static89.method1538(local434, local414, local422, arg2);
						Static89.method1538(local434, local192, local414, arg5);
					}
				} else {
					if (local172 >= Static152.anInt3532) {
						Static89.method1538(Static57.anIntArrayArray9[local172], local192, local201, arg5);
					}
					if (Static223.anInt1245 >= local183) {
						Static89.method1538(Static57.anIntArrayArray9[local183], local192, local201, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class1_Sub14 local7 = Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass133_1 != null && local7.aClass133_1.aLong160 == arg3) {
			return true;
		} else if (local7.aClass101_1 != null && local7.aClass101_1.aLong131 == arg3) {
			return true;
		} else if (local7.aClass162_1 != null && local7.aClass162_1.aLong192 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt2332; local46++) {
				if (local7.aClass152Array1[local46].aLong181 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
	public static void method317() {
		if (Static239.aClass25_Sub1_Sub1_2 != null && Static239.aClass25_Sub1_Sub1_2.anInt1635 - (Static239.aClass25_Sub1_Sub1_2.method1243() - 1) * 64 >> 7 == Static4.anInt139 && Static239.aClass25_Sub1_Sub1_2.anInt1604 + 64 - Static239.aClass25_Sub1_Sub1_2.method1243() * 64 >> 7 == Static52.anInt1401) {
			Static4.anInt139 = 0;
		}
		@Pc(47) int local47;
		for (local47 = 0; local47 < 104; local47++) {
			for (@Pc(52) int local52 = 0; local52 < 104; local52++) {
				Static150.anIntArrayArray12[local47][local52] = 0;
			}
		}
		for (local47 = 0; local47 < Static266.anInt5789; local47++) {
			@Pc(96) Class25_Sub1_Sub1 local96 = Static271.aClass25_Sub1_Sub1Array1[Static39.anIntArray108[local47]];
			if (local96 != null) {
				local96.aBoolean88 = false;
			}
		}
		for (local47 = 0; local47 < Static147.anInt3493; local47++) {
			@Pc(116) Class25_Sub1_Sub2 local116 = Static27.aClass25_Sub1_Sub2Array1[Static65.anIntArray25[local47]];
			if (local116 != null) {
				local116.aBoolean88 = false;
			}
		}
	}
}
