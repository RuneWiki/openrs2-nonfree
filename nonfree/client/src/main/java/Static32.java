import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!fa", name = "Z", descriptor = "Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_22;

	@OriginalMember(owner = "client!fa", name = "J", descriptor = "Lclient!oa;")
	public static Class56 aClass56_519 = Static33.method650("Wen m-Ochten Sie von der Liste entfernen?");

	@OriginalMember(owner = "client!fa", name = "L", descriptor = "Lclient!oa;")
	private static Class56 aClass56_521 = Static33.method650("Please wait)3)3)3");

	@OriginalMember(owner = "client!fa", name = "K", descriptor = "Lclient!oa;")
	public static Class56 aClass56_520 = aClass56_521;

	@OriginalMember(owner = "client!fa", name = "N", descriptor = "Lclient!oa;")
	private static Class56 aClass56_522 = Static33.method650("Loaded fonts");

	@OriginalMember(owner = "client!fa", name = "O", descriptor = "Lclient!oa;")
	public static Class56 aClass56_523 = aClass56_522;

	@OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
	public static int anInt951 = 0;

	@OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
	public static int anInt953 = 0;

	@OriginalMember(owner = "client!fa", name = "ab", descriptor = "Lclient!oa;")
	public static Class56 aClass56_524 = aClass56_521;

	@OriginalMember(owner = "client!fa", name = "bb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_525 = Static33.method650("Schlie-8en");

	@OriginalMember(owner = "client!fa", name = "db", descriptor = "I")
	public static int anInt956 = 0;

	@OriginalMember(owner = "client!fa", name = "gb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_526 = Static33.method650("l");

	@OriginalMember(owner = "client!fa", name = "ib", descriptor = "Z")
	public static volatile boolean aBoolean48 = true;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[I[III[Lclient!v;)V")
	public static void method646(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75[] arg4) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(17) int local17 = arg2 - 1;
		@Pc(24) int local24 = (arg2 + arg3) / 2;
		@Pc(28) int local28 = arg3 + 1;
		@Pc(32) Class75 local32 = arg4[local24];
		arg4[local24] = arg4[arg2];
		arg4[arg2] = local32;
		while (local17 < local28) {
			@Pc(46) boolean local46 = true;
			@Pc(49) int local49;
			@Pc(77) int local77;
			@Pc(84) int local84;
			do {
				local28--;
				for (local49 = 0; local49 < 4; local49++) {
					if (arg1[local49] == 2) {
						local77 = arg4[local28].anInt2969;
						local84 = local32.anInt2969;
					} else if (arg1[local49] == 1) {
						local84 = local32.anInt2975;
						if (local84 == -1 && arg0[local49] == 1) {
							local84 = 2001;
						}
						local77 = arg4[local28].anInt2975;
						if (local77 == -1 && arg0[local49] == 1) {
							local77 = 2001;
						}
					} else if (arg1[local49] == 3) {
						local77 = arg4[local28].aBoolean161 ? 1 : 0;
						local84 = local32.aBoolean161 ? 1 : 0;
					} else {
						local84 = local32.anInt2973;
						local77 = arg4[local28].anInt2973;
					}
					if (local77 != local84) {
						if ((arg0[local49] != 1 || local84 >= local77) && (arg0[local49] != 0 || local77 >= local84)) {
							local46 = false;
						}
						break;
					}
					if (local49 == 3) {
						local46 = false;
					}
				}
			} while (local46);
			local46 = true;
			do {
				local17++;
				for (local49 = 0; local49 < 4; local49++) {
					if (arg1[local49] == 2) {
						local84 = local32.anInt2969;
						local77 = arg4[local17].anInt2969;
					} else if (arg1[local49] == 1) {
						local77 = arg4[local17].anInt2975;
						if (local77 == -1 && arg0[local49] == 1) {
							local77 = 2001;
						}
						local84 = local32.anInt2975;
						if (local84 == -1 && arg0[local49] == 1) {
							local84 = 2001;
						}
					} else if (arg1[local49] == 3) {
						local84 = local32.aBoolean161 ? 1 : 0;
						local77 = arg4[local17].aBoolean161 ? 1 : 0;
					} else {
						local84 = local32.anInt2973;
						local77 = arg4[local17].anInt2973;
					}
					if (local84 != local77) {
						if ((arg0[local49] != 1 || local77 >= local84) && (arg0[local49] != 0 || local77 <= local84)) {
							local46 = false;
						}
						break;
					}
					if (local49 == 3) {
						local46 = false;
					}
				}
			} while (local46);
			if (local28 > local17) {
				@Pc(329) Class75 local329 = arg4[local17];
				arg4[local17] = arg4[local28];
				arg4[local28] = local329;
			}
		}
		method646(arg0, arg1, arg2, local28, arg4);
		method646(arg0, arg1, local28 + 1, arg3, arg4);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIZ)Lclient!oa;")
	public static Class56 method647(@OriginalArg(0) int arg0) {
		return Static21.method464(arg0, true);
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)V")
	public static void method648() {
		aClass56_522 = null;
		aClass56_525 = null;
		aClass56_520 = null;
		aClass56_521 = null;
		aClass56_519 = null;
		aClass56_523 = null;
		aClass3_Sub1_Sub1_Sub4_22 = null;
		aClass56_526 = null;
		aClass56_524 = null;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)Z")
	public static boolean method649() {
		@Pc(4) long local4 = Static38.method694();
		@Pc(9) int local9 = (int) (local4 - Static63.aLong47);
		if (local9 > 200) {
			local9 = 200;
		}
		Static63.aLong47 = local4;
		Static46.anInt2268 += local9;
		if (Static22.anInt685 == 0 && Static19.anInt591 == 0 && Static81.anInt2164 == 0 && Static50.anInt1438 == 0) {
			return true;
		} else if (Static64.aClass17_3 == null) {
			return false;
		} else {
			try {
				if (Static46.anInt2268 > 30000) {
					throw new IOException();
				}
				@Pc(62) Class3_Sub1_Sub14 local62;
				@Pc(67) Class3_Sub2 local67;
				while (Static19.anInt591 < 20 && Static50.anInt1438 > 0) {
					local62 = (Class3_Sub1_Sub14) Static109.aClass2_5.method10();
					local67 = new Class3_Sub2(4);
					local67.method303(1);
					local67.method282((int) local62.aLong94);
					Static64.aClass17_3.method493(local67.aByteArray7, 4);
					Static92.aClass2_9.method12(local62, local62.aLong94);
					Static50.anInt1438--;
					Static19.anInt591++;
				}
				while (Static22.anInt685 < 20 && Static81.anInt2164 > 0) {
					local62 = (Class3_Sub1_Sub14) Static5.aClass68_1.method1735();
					local67 = new Class3_Sub2(4);
					local67.method303(0);
					local67.method282((int) local62.aLong94);
					Static64.aClass17_3.method493(local67.aByteArray7, 4);
					local62.method2024();
					Static87.aClass2_8.method12(local62, local62.aLong94);
					Static81.anInt2164--;
					Static22.anInt685++;
				}
				for (@Pc(162) int local162 = 0; local162 < 100; local162++) {
					@Pc(168) int local168 = Static64.aClass17_3.method499();
					if (local168 < 0) {
						throw new IOException();
					}
					if (local168 == 0) {
						break;
					}
					Static46.anInt2268 = 0;
					@Pc(183) byte local183 = 0;
					if (Static51.aClass3_Sub1_Sub14_1 == null) {
						local183 = 8;
					} else if (Static56.anInt1586 == 0) {
						local183 = 1;
					}
					@Pc(208) int local208;
					@Pc(200) int local200;
					@Pc(244) int local244;
					@Pc(319) int local319;
					if (local183 <= 0) {
						local200 = 512 - Static56.anInt1586;
						local208 = Static65.aClass3_Sub2_4.aByteArray7.length - Static51.aClass3_Sub1_Sub14_1.aByte4;
						if (local200 > local208 - Static65.aClass3_Sub2_4.anInt413) {
							local200 = local208 - Static65.aClass3_Sub2_4.anInt413;
						}
						if (local200 > local168) {
							local200 = local168;
						}
						Static64.aClass17_3.method500(Static65.aClass3_Sub2_4.anInt413, local200, Static65.aClass3_Sub2_4.aByteArray7);
						if (Static40.aByte2 != 0) {
							for (local244 = 0; local244 < local200; local244++) {
								Static65.aClass3_Sub2_4.aByteArray7[Static65.aClass3_Sub2_4.anInt413 + local244] ^= Static40.aByte2;
							}
						}
						Static56.anInt1586 += local200;
						Static65.aClass3_Sub2_4.anInt413 += local200;
						if (Static65.aClass3_Sub2_4.anInt413 == local208) {
							if (Static51.aClass3_Sub1_Sub14_1.aLong94 == 16711935L) {
								Static47.aClass3_Sub2_2 = Static65.aClass3_Sub2_4;
								for (local244 = 0; local244 < 256; local244++) {
									@Pc(306) Class44_Sub1 local306 = Static111.aClass44_Sub1Array1[local244];
									if (local306 != null) {
										Static47.aClass3_Sub2_2.anInt413 = local244 * 4 + 5;
										local319 = Static47.aClass3_Sub2_2.method278();
										local306.method1170(local319);
									}
								}
							} else {
								Static91.aCRC32_2.reset();
								Static91.aCRC32_2.update(Static65.aClass3_Sub2_4.aByteArray7, 0, local208);
								local244 = (int) Static91.aCRC32_2.getValue();
								if (Static51.aClass3_Sub1_Sub14_1.anInt2539 != local244) {
									try {
										Static64.aClass17_3.method498();
									} catch (@Pc(356) Exception local356) {
									}
									Static64.aClass17_3 = null;
									Static40.aByte2 = (byte) (Math.random() * 255.0D + 1.0D);
									Static11.anInt297++;
									return false;
								}
								Static11.anInt297 = 0;
								Static31.anInt923 = 0;
								Static51.aClass3_Sub1_Sub14_1.aClass44_Sub1_64.method1166((Static51.aClass3_Sub1_Sub14_1.aLong94 & 0xFF0000L) == 16711680L, Static23.aBoolean31, (int) (Static51.aClass3_Sub1_Sub14_1.aLong94 & 0xFFFFL), Static65.aClass3_Sub2_4.aByteArray7);
							}
							Static51.aClass3_Sub1_Sub14_1.method2055();
							if (Static23.aBoolean31) {
								Static19.anInt591--;
							} else {
								Static22.anInt685--;
							}
							Static56.anInt1586 = 0;
							Static65.aClass3_Sub2_4 = null;
							Static51.aClass3_Sub1_Sub14_1 = null;
						} else {
							if (Static56.anInt1586 != 512) {
								break;
							}
							Static56.anInt1586 = 0;
						}
					} else {
						local208 = local183 - Static5.aClass3_Sub2_1.anInt413;
						if (local208 > local168) {
							local208 = local168;
						}
						Static64.aClass17_3.method500(Static5.aClass3_Sub2_1.anInt413, local208, Static5.aClass3_Sub2_1.aByteArray7);
						if (Static40.aByte2 != 0) {
							for (local200 = 0; local200 < local208; local200++) {
								Static5.aClass3_Sub2_1.aByteArray7[Static5.aClass3_Sub2_1.anInt413 + local200] ^= Static40.aByte2;
							}
						}
						Static5.aClass3_Sub2_1.anInt413 += local208;
						if (Static5.aClass3_Sub2_1.anInt413 < local183) {
							break;
						}
						if (Static51.aClass3_Sub1_Sub14_1 == null) {
							Static5.aClass3_Sub2_1.anInt413 = 0;
							local200 = Static5.aClass3_Sub2_1.method270();
							local244 = Static5.aClass3_Sub2_1.method276();
							@Pc(505) int local505 = Static5.aClass3_Sub2_1.method270();
							@Pc(512) long local512 = (long) (local244 + (local200 << 16));
							local319 = Static5.aClass3_Sub2_1.method278();
							@Pc(522) Class3_Sub1_Sub14 local522 = (Class3_Sub1_Sub14) Static92.aClass2_9.method17(local512);
							Static23.aBoolean31 = true;
							if (local522 == null) {
								local522 = (Class3_Sub1_Sub14) Static87.aClass2_8.method17(local512);
								Static23.aBoolean31 = false;
							}
							if (local522 == null) {
								throw new IOException();
							}
							Static51.aClass3_Sub1_Sub14_1 = local522;
							@Pc(553) int local553 = local505 == 0 ? 5 : 9;
							Static65.aClass3_Sub2_4 = new Class3_Sub2(local553 + local319 + Static51.aClass3_Sub1_Sub14_1.aByte4);
							Static65.aClass3_Sub2_4.method303(local505);
							Static65.aClass3_Sub2_4.method280(local319);
							Static5.aClass3_Sub2_1.anInt413 = 0;
							Static56.anInt1586 = 8;
						} else if (Static56.anInt1586 == 0) {
							if (Static5.aClass3_Sub2_1.aByteArray7[0] == -1) {
								Static5.aClass3_Sub2_1.anInt413 = 0;
								Static56.anInt1586 = 1;
							} else {
								Static51.aClass3_Sub1_Sub14_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(606) IOException local606) {
				try {
					Static64.aClass17_3.method498();
				} catch (@Pc(613) Exception local613) {
				}
				Static31.anInt923++;
				Static64.aClass17_3 = null;
				return false;
			}
		}
	}
}
