import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "[Lclient!ch;")
	public static Class1_Sub1_Sub6[] aClass1_Sub1_Sub6Array9;

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "[I")
	public static int[] anIntArray452 = new int[25];

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "Lclient!ge;")
	public static Class39 aClass39_19 = new Class39(64);

	@OriginalMember(owner = "client!qb", name = "O", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1206 = Static200.method3116("Unexpected server response)3");

	@OriginalMember(owner = "client!qb", name = "B", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1205 = aClass60_1206;

	@OriginalMember(owner = "client!qb", name = "F", descriptor = "[Lclient!vb;")
	public static Class7_Sub1[] aClass7_Sub1Array1 = new Class7_Sub1[256];

	@OriginalMember(owner = "client!qb", name = "S", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1207 = Static200.method3116(" weitere Optionen");

	@OriginalMember(owner = "client!qb", name = "Z", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1210 = Static200.method3116("scroll:");

	@OriginalMember(owner = "client!qb", name = "X", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1208 = aClass60_1210;

	@OriginalMember(owner = "client!qb", name = "Y", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1209 = aClass60_1210;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZ[B)Z")
	public static boolean method2651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = -1;
		@Pc(14) Class1_Sub9 local14 = new Class1_Sub9(arg2);
		label68: while (true) {
			@Pc(18) int local18 = local14.method896();
			if (local18 == 0) {
				return local7;
			}
			@Pc(22) int local22 = 0;
			local9 += local18;
			@Pc(28) boolean local28 = false;
			while (true) {
				@Pc(48) int local48;
				@Pc(91) Class1_Sub1_Sub23 local91;
				do {
					@Pc(58) int local58;
					@Pc(67) int local67;
					do {
						do {
							do {
								do {
									@Pc(34) int local34;
									while (local28) {
										local34 = local14.method900();
										if (local34 == 0) {
											continue label68;
										}
										local14.method895();
									}
									local34 = local14.method900();
									if (local34 == 0) {
										continue label68;
									}
									local22 += local34 - 1;
									local48 = local14.method895() >> 2;
									@Pc(54) int local54 = local22 >> 6 & 0x3F;
									local58 = arg0 + local54;
									@Pc(62) int local62 = local22 & 0x3F;
									local67 = local62 + arg1;
								} while (local58 <= 0);
							} while (local67 <= 0);
						} while (local58 >= 103);
					} while (local67 >= 103);
					local91 = Static44.method760(local9);
				} while (local48 == 22 && Static148.aBoolean266 && local91.anInt4027 == 0 && local91.anInt4023 != 1 && !local91.aBoolean216);
				local28 = true;
				if (!local91.method2948()) {
					local7 = false;
					Static3.anInt70++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V")
	public static void method2653(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static147.anInt3278 == 1) {
			Static83.aClass1_Sub1_Sub6Array5[Static154.anInt3436 / 100].method2164(Static129.anInt1190 - 8, Static122.anInt2728 - 8);
		}
		if (Static147.anInt3278 == 2) {
			Static83.aClass1_Sub1_Sub6Array5[Static154.anInt3436 / 100 + 4].method2164(Static129.anInt1190 - 8, Static122.anInt2728 + -8);
		}
		Static46.method799();
		if (!Static9.aBoolean249) {
			return;
		}
		@Pc(49) int local49 = arg2 + 512 - 5;
		@Pc(53) int local53 = arg3 + 20;
		Static49.aClass1_Sub1_Sub14_3.method3308(Static34.method611(new Class60[] { Static12.aClass60_102, Static40.method681(Static35.anInt837) }), local49, local53, 16776960, -1);
		@Pc(74) int local74 = local53 + 15;
		@Pc(76) Runtime local76 = Runtime.getRuntime();
		@Pc(86) int local86 = (int) ((local76.totalMemory() - local76.freeMemory()) / 1024L);
		@Pc(88) int local88 = 16776960;
		if (local86 > 32768 && Static148.aBoolean266) {
			local88 = 16711680;
		}
		if (local86 > 65536 && !Static148.aBoolean266) {
			local88 = 16711680;
		}
		Static49.aClass1_Sub1_Sub14_3.method3308(Static34.method611(new Class60[] { Static7.aClass60_70, Static40.method681(local86), Static64.aClass60_505 }), local49, local74, local88, -1);
		local53 = local74 + 15;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ah;I)Lclient!ah;")
	public static Class6 method2654(@OriginalArg(0) Class6 arg0) {
		@Pc(7) Class6 local7 = Static160.method2688(arg0);
		if (local7 == null) {
			local7 = arg0.aClass6_1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIB)Lclient!gg;")
	public static Class1_Sub11 method2656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub11 local7 = new Class1_Sub11();
		local7.anInt1627 = arg0;
		local7.anInt1626 = arg1;
		Static10.aClass33_1.method1072((long) arg2, local7);
		Static93.method1621(arg1);
		@Pc(33) Class6 local33 = Static107.method1857(arg2);
		if (local33 != null) {
			Static57.method1068(local33);
		}
		if (Static168.aClass6_14 != null) {
			Static57.method1068(Static168.aClass6_14);
			Static168.aClass6_14 = null;
		}
		Static91.anInt2134 = 0;
		Static162.aBoolean261 = false;
		Static191.method2989(Static29.anInt709, Static102.anInt2345, Static108.anInt2506, Static89.anInt2075);
		if (local33 != null) {
			Static178.method2848(false, local33);
		}
		Static129.method922(arg1);
		if (Static83.anInt1958 != -1) {
			Static140.method2400(Static83.anInt1958, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)Z")
	public static boolean method2657() {
		@Pc(8) long local8 = Static3.method57();
		@Pc(20) int local20 = (int) (local8 - Static41.aLong34);
		if (local20 > 200) {
			local20 = 200;
		}
		Static41.aLong34 = local8;
		Static114.anInt2615 += local20;
		if (Static193.anInt4131 == 0 && Static165.anInt2955 == 0 && Static32.anInt813 == 0 && Static43.anInt924 == 0) {
			return true;
		} else if (Static205.aClass55_4 == null) {
			return false;
		} else {
			try {
				if (Static114.anInt2615 > 30000) {
					throw new IOException();
				}
				@Pc(60) Class1_Sub1_Sub20 local60;
				@Pc(65) Class1_Sub9 local65;
				while (Static165.anInt2955 < 20 && Static43.anInt924 > 0) {
					local60 = (Class1_Sub1_Sub20) Static85.aClass33_5.method1067();
					local65 = new Class1_Sub9(4);
					local65.method899(1);
					local65.method929((int) local60.aLong150);
					Static205.aClass55_4.method1756(local65.aByteArray20, 4);
					Static204.aClass33_17.method1072(local60.aLong150, local60);
					Static165.anInt2955++;
					Static43.anInt924--;
				}
				while (Static193.anInt4131 < 20 && Static32.anInt813 > 0) {
					local60 = (Class1_Sub1_Sub20) Static34.aClass52_1.method1677();
					local65 = new Class1_Sub9(4);
					local65.method899(0);
					local65.method929((int) local60.aLong150);
					Static205.aClass55_4.method1756(local65.aByteArray20, 4);
					local60.method3434();
					Static64.aClass33_3.method1072(local60.aLong150, local60);
					Static193.anInt4131++;
					Static32.anInt813--;
				}
				for (@Pc(161) int local161 = 0; local161 < 100; local161++) {
					@Pc(167) int local167 = Static205.aClass55_4.method1757();
					if (local167 < 0) {
						throw new IOException();
					}
					if (local167 == 0) {
						break;
					}
					Static114.anInt2615 = 0;
					@Pc(185) byte local185 = 0;
					if (Static209.aClass1_Sub1_Sub20_1 == null) {
						local185 = 8;
					} else if (Static86.anInt2000 == 0) {
						local185 = 1;
					}
					@Pc(206) int local206;
					@Pc(223) int local223;
					@Pc(273) int local273;
					@Pc(281) int local281;
					if (local185 > 0) {
						local206 = local185 - Static94.aClass1_Sub9_5.anInt1192;
						if (local167 < local206) {
							local206 = local167;
						}
						Static205.aClass55_4.method1759(local206, Static94.aClass1_Sub9_5.anInt1192, Static94.aClass1_Sub9_5.aByteArray20);
						if (Static177.aByte13 != 0) {
							for (local223 = 0; local223 < local206; local223++) {
								Static94.aClass1_Sub9_5.aByteArray20[Static94.aClass1_Sub9_5.anInt1192 + local223] ^= Static177.aByte13;
							}
						}
						Static94.aClass1_Sub9_5.anInt1192 += local206;
						if (Static94.aClass1_Sub9_5.anInt1192 < local185) {
							break;
						}
						if (Static209.aClass1_Sub1_Sub20_1 == null) {
							Static94.aClass1_Sub9_5.anInt1192 = 0;
							local223 = Static94.aClass1_Sub9_5.method895();
							local273 = Static94.aClass1_Sub9_5.method946();
							@Pc(277) int local277 = Static94.aClass1_Sub9_5.method895();
							local281 = Static94.aClass1_Sub9_5.method915();
							@Pc(288) long local288 = (long) ((local223 << 16) + local273);
							@Pc(294) Class1_Sub1_Sub20 local294 = (Class1_Sub1_Sub20) Static204.aClass33_17.method1071(local288);
							Static184.aBoolean213 = true;
							if (local294 == null) {
								local294 = (Class1_Sub1_Sub20) Static64.aClass33_3.method1071(local288);
								Static184.aBoolean213 = false;
							}
							if (local294 == null) {
								throw new IOException();
							}
							@Pc(318) int local318 = local277 == 0 ? 5 : 9;
							Static209.aClass1_Sub1_Sub20_1 = local294;
							Static38.aClass1_Sub9_3 = new Class1_Sub9(local318 + local281 + Static209.aClass1_Sub1_Sub20_1.aByte10);
							Static38.aClass1_Sub9_3.method899(local277);
							Static38.aClass1_Sub9_3.method921(local281);
							Static86.anInt2000 = 8;
							Static94.aClass1_Sub9_5.anInt1192 = 0;
						} else if (Static86.anInt2000 == 0) {
							if (Static94.aClass1_Sub9_5.aByteArray20[0] == -1) {
								Static86.anInt2000 = 1;
								Static94.aClass1_Sub9_5.anInt1192 = 0;
							} else {
								Static209.aClass1_Sub1_Sub20_1 = null;
							}
						}
					} else {
						local206 = Static38.aClass1_Sub9_3.aByteArray20.length - Static209.aClass1_Sub1_Sub20_1.aByte10;
						local223 = 512 - Static86.anInt2000;
						if (local206 - Static38.aClass1_Sub9_3.anInt1192 < local223) {
							local223 = local206 - Static38.aClass1_Sub9_3.anInt1192;
						}
						if (local167 < local223) {
							local223 = local167;
						}
						Static205.aClass55_4.method1759(local223, Static38.aClass1_Sub9_3.anInt1192, Static38.aClass1_Sub9_3.aByteArray20);
						if (Static177.aByte13 != 0) {
							for (local273 = 0; local273 < local223; local273++) {
								Static38.aClass1_Sub9_3.aByteArray20[local273 + Static38.aClass1_Sub9_3.anInt1192] ^= Static177.aByte13;
							}
						}
						Static38.aClass1_Sub9_3.anInt1192 += local223;
						Static86.anInt2000 += local223;
						if (local206 == Static38.aClass1_Sub9_3.anInt1192) {
							if (Static209.aClass1_Sub1_Sub20_1.aLong150 == 16711935L) {
								Static38.aClass1_Sub9_2 = Static38.aClass1_Sub9_3;
								for (local273 = 0; local273 < 256; local273++) {
									@Pc(540) Class7_Sub1 local540 = aClass7_Sub1Array1[local273];
									if (local540 != null) {
										Static38.aClass1_Sub9_2.anInt1192 = local273 * 8 + 5;
										local281 = Static38.aClass1_Sub9_2.method915();
										@Pc(557) int local557 = Static38.aClass1_Sub9_2.method915();
										local540.method3257(local281, local557);
									}
								}
							} else {
								Static166.aCRC32_2.reset();
								Static166.aCRC32_2.update(Static38.aClass1_Sub9_3.aByteArray20, 0, local206);
								local273 = (int) Static166.aCRC32_2.getValue();
								if (local273 != Static209.aClass1_Sub1_Sub20_1.anInt3283) {
									try {
										Static205.aClass55_4.method1754();
									} catch (@Pc(484) Exception local484) {
									}
									Static1.anInt39++;
									Static205.aClass55_4 = null;
									Static177.aByte13 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static4.anInt104 = 0;
								Static1.anInt39 = 0;
								Static209.aClass1_Sub1_Sub20_1.aClass7_Sub1_21.method3253(Static184.aBoolean213, (int) (Static209.aClass1_Sub1_Sub20_1.aLong150 & 0xFFFFL), (Static209.aClass1_Sub1_Sub20_1.aLong150 & 0xFF0000L) == 16711680L, Static38.aClass1_Sub9_3.aByteArray20);
							}
							Static209.aClass1_Sub1_Sub20_1.method3530();
							Static209.aClass1_Sub1_Sub20_1 = null;
							if (Static184.aBoolean213) {
								Static165.anInt2955--;
							} else {
								Static193.anInt4131--;
							}
							Static86.anInt2000 = 0;
							Static38.aClass1_Sub9_3 = null;
						} else {
							if (Static86.anInt2000 != 512) {
								break;
							}
							Static86.anInt2000 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(602) IOException local602) {
				try {
					Static205.aClass55_4.method1754();
				} catch (@Pc(607) Exception local607) {
				}
				Static205.aClass55_4 = null;
				Static4.anInt104++;
				return false;
			}
		}
	}
}
