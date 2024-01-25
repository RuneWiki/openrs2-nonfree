import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static677 {

	@OriginalMember(owner = "client!vea", name = "h", descriptor = "[Z")
	public static boolean[] aBooleanArray33;

	@OriginalMember(owner = "client!vea", name = "e", descriptor = "Lclient!ik;")
	public static Class182 aClass182_125;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "Lclient!hw;")
	public static Class169 aClass169_12;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(IIZI[[[Lclient!tr;Z)Z")
	public static boolean method9030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class364[][][] arg3, @OriginalArg(5) boolean arg4) {
		@Pc(15) byte local15 = arg4 ? 1 : (byte) (Static247.anInt3877 & 0xFF);
		if (local15 == Static153.aByteArrayArrayArray3[Static723.anInt11225][arg2][arg1]) {
			return false;
		} else if ((Static510.aByteArrayArrayArray11[Static723.anInt11225][arg2][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(42) byte local42 = 0;
			@Pc(44) int local44 = 0;
			Static213.anIntArray245[0] = arg2;
			@Pc(57) int local57 = local42 + 1;
			Static138.anIntArray160[0] = arg1;
			Static153.aByteArrayArrayArray3[Static723.anInt11225][arg2][arg1] = local15;
			while (local44 != local57) {
				@Pc(75) int local75 = Static213.anIntArray245[local44] & 0xFFFF;
				@Pc(83) int local83 = Static213.anIntArray245[local44] >> 16 & 0xFF;
				@Pc(91) int local91 = Static213.anIntArray245[local44] >> 24 & 0xFF;
				@Pc(97) int local97 = Static138.anIntArray160[local44] & 0xFFFF;
				@Pc(105) int local105 = Static138.anIntArray160[local44] >> 16 & 0xFF;
				local44 = local44 + 1 & 0xFFF;
				@Pc(113) boolean local113 = false;
				if ((Static510.aByteArrayArrayArray11[Static723.anInt11225][local75][local97] & 0x4) == 0) {
					local113 = true;
				}
				@Pc(127) boolean local127 = false;
				@Pc(133) int local133;
				@Pc(180) int local180;
				@Pc(227) int local227;
				if (arg3 != null) {
					label237: for (local133 = Static723.anInt11225 + 1; local133 <= 3; local133++) {
						if (arg3[local133] != null && (Static510.aByteArrayArrayArray11[local133][local75][local97] & 0x8) == 0) {
							@Pc(340) Class9_Sub1_Sub1 local340;
							@Pc(350) int local350;
							@Pc(329) Class364 local329;
							@Pc(335) Class181 local335;
							if (local113 && arg3[local133][local75][local97] != null) {
								if (arg3[local133][local75][local97].aClass9_Sub1_Sub2_2 != null) {
									local180 = Static139.method2387(local83);
									if (arg3[local133][local75][local97].aClass9_Sub1_Sub2_2.aShort52 == local180 || arg3[local133][local75][local97].aClass9_Sub1_Sub2_1 != null && arg3[local133][local75][local97].aClass9_Sub1_Sub2_1.aShort52 == local180) {
										continue;
									}
									if (local91 != 0) {
										local227 = Static139.method2387(local91);
										if (arg3[local133][local75][local97].aClass9_Sub1_Sub2_2.aShort52 == local227 || arg3[local133][local75][local97].aClass9_Sub1_Sub2_1 != null && local227 == arg3[local133][local75][local97].aClass9_Sub1_Sub2_1.aShort52) {
											continue;
										}
									}
									if (local105 != 0) {
										local227 = Static139.method2387(local105);
										if (local227 == arg3[local133][local75][local97].aClass9_Sub1_Sub2_2.aShort52 || arg3[local133][local75][local97].aClass9_Sub1_Sub2_1 != null && arg3[local133][local75][local97].aClass9_Sub1_Sub2_1.aShort52 == local227) {
											continue;
										}
									}
								}
								local329 = arg3[local133][local75][local97];
								if (local329.aClass181_3 != null) {
									for (local335 = local329.aClass181_3; local335 != null; local335 = local335.aClass181_2) {
										local340 = local335.aClass9_Sub1_Sub1_1;
										if (local340 instanceof Interface9) {
											@Pc(346) Interface9 local346 = (Interface9) local340;
											local350 = local346.method9102();
											if (local350 == 21) {
												local350 = 19;
											}
											@Pc(361) int local361 = local346.method9105();
											@Pc(367) int local367 = local350 | local361 << 6;
											if (local367 == local83 || local91 != 0 && local367 == local91 || local105 != 0 && local105 == local367) {
												continue label237;
											}
										}
									}
								}
							}
							local329 = arg3[local133][local75][local97];
							if (local329 != null && local329.aClass181_3 != null) {
								for (local335 = local329.aClass181_3; local335 != null; local335 = local335.aClass181_2) {
									local340 = local335.aClass9_Sub1_Sub1_1;
									if (local340.aShort122 != local340.aShort123 || local340.aShort121 != local340.aShort120) {
										for (@Pc(448) int local448 = local340.aShort123; local448 <= local340.aShort122; local448++) {
											for (local350 = local340.aShort120; local350 <= local340.aShort121; local350++) {
												Static153.aByteArrayArrayArray3[local133][local448][local350] = local15;
											}
										}
									}
								}
							}
							Static153.aByteArrayArrayArray3[local133][local75][local97] = local15;
							local127 = true;
						}
					}
				}
				if (local127) {
					local133 = Static477.aClass259Array3[Static723.anInt11225 + 1].method9295(local97, local75);
					if (Static694.anIntArray777[arg0] < local133) {
						Static694.anIntArray777[arg0] = local133;
					}
					local180 = local75 << 9;
					if (Static650.anIntArray724[arg0] > local180) {
						Static650.anIntArray724[arg0] = local180;
					} else if (local180 > Static502.anIntArray581[arg0]) {
						Static502.anIntArray581[arg0] = local180;
					}
					local227 = local97 << 9;
					if (Static267.anIntArray326[arg0] > local227) {
						Static267.anIntArray326[arg0] = local227;
					} else if (Static196.anIntArray284[arg0] < local227) {
						Static196.anIntArray284[arg0] = local227;
					}
				}
				if (!local113) {
					if (local75 >= 1 && local15 != Static153.aByteArrayArrayArray3[Static723.anInt11225][local75 - 1][local97]) {
						Static213.anIntArray245[local57] = 0xD3000000 | 0x120000 | local75 - 1;
						Static138.anIntArray160[local57] = local97 | 0x130000;
						local57 = local57 + 1 & 0xFFF;
						Static153.aByteArrayArrayArray3[Static723.anInt11225][local75 - 1][local97] = local15;
					}
					local97++;
					if (Static646.anInt9979 > local97) {
						if (local75 - 1 >= 0 && local15 != Static153.aByteArrayArrayArray3[Static723.anInt11225][local75 - 1][local97] && (Static510.aByteArrayArrayArray11[Static723.anInt11225][local75][local97] & 0x4) == 0 && (Static510.aByteArrayArrayArray11[Static723.anInt11225][local75 - 1][local97 - 1] & 0x4) == 0) {
							Static213.anIntArray245[local57] = 0x52000000 | 0x120000 | local75 - 1;
							Static138.anIntArray160[local57] = local97 | 0x130000;
							Static153.aByteArrayArrayArray3[Static723.anInt11225][local75 - 1][local97] = local15;
							local57 = local57 + 1 & 0xFFF;
						}
						if (local15 != Static153.aByteArrayArrayArray3[Static723.anInt11225][local75][local97]) {
							Static213.anIntArray245[local57] = local75 | 0x520000 | 0x13000000;
							Static138.anIntArray160[local57] = local97 | 0x530000;
							Static153.aByteArrayArrayArray3[Static723.anInt11225][local75][local97] = local15;
							local57 = local57 + 1 & 0xFFF;
						}
						if (Static497.anInt7926 > local75 + 1 && Static153.aByteArrayArrayArray3[Static723.anInt11225][local75 + 1][local97] != local15 && (Static510.aByteArrayArrayArray11[Static723.anInt11225][local75][local97] & 0x4) == 0 && (Static510.aByteArrayArrayArray11[Static723.anInt11225][local75 + 1][local97 - 1] & 0x4) == 0) {
							Static213.anIntArray245[local57] = 0x92000000 | 0x520000 | local75 + 1;
							Static138.anIntArray160[local57] = local97 | 0x530000;
							local57 = local57 + 1 & 0xFFF;
							Static153.aByteArrayArrayArray3[Static723.anInt11225][local75 + 1][local97] = local15;
						}
					}
					local97--;
					if (Static497.anInt7926 > local75 + 1 && local15 != Static153.aByteArrayArrayArray3[Static723.anInt11225][local75 + 1][local97]) {
						Static213.anIntArray245[local57] = local75 + 1 | 0x920000 | 0x53000000;
						Static138.anIntArray160[local57] = local97 | 0x930000;
						Static153.aByteArrayArrayArray3[Static723.anInt11225][local75 + 1][local97] = local15;
						local57 = local57 + 1 & 0xFFF;
					}
					local97--;
					if (local97 >= 0) {
						if (local75 - 1 >= 0 && local15 != Static153.aByteArrayArrayArray3[Static723.anInt11225][local75 - 1][local97] && (Static510.aByteArrayArrayArray11[Static723.anInt11225][local75][local97] & 0x4) == 0 && (Static510.aByteArrayArrayArray11[Static723.anInt11225][local75 - 1][local97 + 1] & 0x4) == 0) {
							Static213.anIntArray245[local57] = local75 - 1 | 0xD20000 | 0x12000000;
							Static138.anIntArray160[local57] = local97 | 0xD30000;
							Static153.aByteArrayArrayArray3[Static723.anInt11225][local75 - 1][local97] = local15;
							local57 = local57 + 1 & 0xFFF;
						}
						if (local15 != Static153.aByteArrayArrayArray3[Static723.anInt11225][local75][local97]) {
							Static213.anIntArray245[local57] = 0x93000000 | 0xD20000 | local75;
							Static138.anIntArray160[local57] = local97 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static153.aByteArrayArrayArray3[Static723.anInt11225][local75][local97] = local15;
						}
						if (local75 + 1 < Static497.anInt7926 && local15 != Static153.aByteArrayArrayArray3[Static723.anInt11225][local75 + 1][local97] && (Static510.aByteArrayArrayArray11[Static723.anInt11225][local75][local97] & 0x4) == 0 && (Static510.aByteArrayArrayArray11[Static723.anInt11225][local75 + 1][local97 + 1] & 0x4) == 0) {
							Static213.anIntArray245[local57] = local75 + 1 | 0x920000 | 0xD2000000;
							Static138.anIntArray160[local57] = local97 | 0x930000;
							local57 = local57 + 1 & 0xFFF;
							Static153.aByteArrayArrayArray3[Static723.anInt11225][local75 + 1][local97] = local15;
						}
					}
				}
			}
			if (Static694.anIntArray777[arg0] != -1000000) {
				Static694.anIntArray777[arg0] += 40;
				Static650.anIntArray724[arg0] -= 512;
				Static502.anIntArray581[arg0] += 512;
				Static196.anIntArray284[arg0] += 512;
				Static267.anIntArray326[arg0] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "()V")
	public static void method9032() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static647.aClass405Array1.length; local3++) {
				if (Static647.aClass405Array1[local3].method9486()) {
					Static158.aLongArray10[local3] = Static647.aClass405Array1[local3].method9483();
				} else {
					synchronized (Static647.aClass405Array1[local3]) {
						Static647.aClass405Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static647.aClass405Array1[Static647.aClass405Array1.length - 1].method9482();
				Static101.method1990(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static647.aClass405Array1.length - 1; local3++) {
						if (!Static647.aClass405Array1[local3].method9486()) {
							synchronized (Static647.aClass405Array1[local3]) {
								Static647.aClass405Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(106) int local106 = 1; local106 < Static647.aClass405Array1.length - 2; local106++) {
							Static647.aClass405Array1[local106].method9482();
						}
						Static101.method1990(2);
						while (!Static647.aClass405Array1[0].method9486()) {
							synchronized (Static647.aClass405Array1[0]) {
								Static647.aClass405Array1[0].notify();
							}
							try {
								Static550.method7219(1L);
							} catch (@Pc(148) Exception local148) {
							}
						}
						Static647.aClass405Array1[0].method9482();
						return;
					}
					try {
						Static550.method7219(1L);
					} catch (@Pc(103) Exception local103) {
					}
				}
			}
			try {
				Static550.method7219(1L);
			} catch (@Pc(49) Exception local49) {
			}
		}
	}
}
