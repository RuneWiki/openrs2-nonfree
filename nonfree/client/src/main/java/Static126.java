import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
	public static int anInt3116;

	@OriginalMember(owner = "client!ni", name = "G", descriptor = "Lclient!jh;")
	public static Class1_Sub2_Sub5_Sub4_Sub1 aClass1_Sub2_Sub5_Sub4_Sub1_4;

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
	public static int anInt3109 = 0;

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1754 = Static118.method2249("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1755 = Static118.method2249("Login");

	@OriginalMember(owner = "client!ni", name = "y", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1756 = aClass65_1755;

	@OriginalMember(owner = "client!ni", name = "A", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1757 = aClass65_1754;

	@OriginalMember(owner = "client!ni", name = "F", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1758 = Static118.method2249("");

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZIII)V")
	public static void method2387(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static90.anInt4438 = -1;
		Static119.anInt2954 = -1;
		Static94.anInt2345 = arg2 * Static190.anInt4160 / arg3;
		Static23.anInt692 = arg1 * Static25.anInt737 / arg0;
		Static210.method3315();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!cg;I)V")
	public static void method2388(@OriginalArg(0) Class1_Sub2_Sub5_Sub1 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static165.anIntArray434.length; local3++) {
			Static165.anIntArray434[local3] = 0;
		}
		@Pc(28) int local28;
		for (@Pc(19) int local19 = 0; local19 < 5000; local19++) {
			local28 = (int) ((double) 256 * Math.random() * 128.0D);
			Static165.anIntArray434[local28] = (int) (Math.random() * 256.0D);
		}
		@Pc(48) int local48;
		@Pc(51) int local51;
		@Pc(58) int local58;
		for (local28 = 0; local28 < 20; local28++) {
			for (local48 = 1; local48 < 255; local48++) {
				for (local51 = 1; local51 < 127; local51++) {
					local58 = local51 + (local48 << 7);
					Static181.anIntArray461[local58] = (Static165.anIntArray434[local58 - 1] + Static165.anIntArray434[local58 + 1] + Static165.anIntArray434[local58 + -128] + Static165.anIntArray434[local58 + 128]) / 4;
				}
			}
			@Pc(101) int[] local101 = Static165.anIntArray434;
			Static165.anIntArray434 = Static181.anIntArray461;
			Static181.anIntArray461 = local101;
		}
		if (arg0 == null) {
			return;
		}
		local48 = 0;
		for (local51 = 0; local51 < arg0.anInt849; local51++) {
			for (local58 = 0; local58 < arg0.anInt848; local58++) {
				if (arg0.aByteArray11[local48++] != 0) {
					@Pc(137) int local137 = local58 + arg0.anInt847 + 16;
					@Pc(144) int local144 = local51 + arg0.anInt846 + 16;
					@Pc(150) int local150 = (local144 << 7) + local137;
					Static165.anIntArray434[local150] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!bf;IIIIII)Lclient!bf;")
	public static Class6_Sub3 method2389(@OriginalArg(0) Class6_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) long local8 = (long) arg4;
		@Pc(14) Class6_Sub3 local14 = (Class6_Sub3) Static209.aClass67_11.method2570(local8);
		if (local14 == null) {
			@Pc(21) Class6_Sub1 local21 = Static10.method193(Static155.aClass60_Sub1_135, arg4);
			if (local21 == null) {
				return null;
			}
			local14 = local21.method184(64, 768, -50, -10, -50);
			Static209.aClass67_11.method2567(local14, local8);
		}
		@Pc(46) int local46 = arg0.method1172();
		@Pc(49) int local49 = arg0.method1181();
		@Pc(52) int local52 = arg0.method1186();
		@Pc(55) int local55 = arg0.method1176();
		local14 = local14.method1169(true);
		if (arg5 != 0) {
			local14.method1175(arg5);
		}
		@Pc(67) Class6_Sub3_Sub1 local67 = (Class6_Sub3_Sub1) local14;
		if (Static171.method2896(local46 + arg2, Static207.anInt4425, local52 + arg3) != arg1 || arg1 != Static171.method2896(arg2 + local49, Static207.anInt4425, local55 + arg3)) {
			for (@Pc(91) int local91 = 0; local91 < local67.anInt1723; local91++) {
				local67.anIntArray176[local91] += Static171.method2896(local67.anIntArray175[local91] + arg2, Static207.anInt4425, arg3 + local67.anIntArray167[local91]) - arg1;
			}
			local67.aBoolean77 = false;
		}
		return local14;
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)Z")
	public static boolean method2391() {
		@Pc(8) long local8 = Static190.method3141();
		@Pc(13) int local13 = (int) (local8 - Static209.aLong148);
		Static209.aLong148 = local8;
		if (local13 > 200) {
			local13 = 200;
		}
		Static74.anInt1818 += local13;
		if (Static180.anInt3909 == 0 && Static149.anInt3501 == 0 && Static205.anInt4377 == 0 && Static205.anInt4357 == 0) {
			return true;
		} else if (Static202.aClass23_3 == null) {
			return false;
		} else {
			try {
				if (Static74.anInt1818 > 30000) {
					throw new IOException();
				}
				@Pc(65) Class1_Sub2_Sub21 local65;
				@Pc(70) Class1_Sub14 local70;
				while (Static149.anInt3501 < 20 && Static205.anInt4357 > 0) {
					local65 = (Class1_Sub2_Sub21) Static33.aClass99_2.method3288();
					local70 = new Class1_Sub14(4);
					local70.method1710(1);
					local70.method1746((int) local65.aLong150);
					Static202.aClass23_3.method726(4, local70.aByteArray29);
					Static89.aClass99_6.method3290(local65, local65.aLong150);
					Static205.anInt4357--;
					Static149.anInt3501++;
				}
				while (Static180.anInt3909 < 20 && Static205.anInt4377 > 0) {
					local65 = (Class1_Sub2_Sub21) Static49.aClass22_1.method722();
					local70 = new Class1_Sub14(4);
					local70.method1710(0);
					local70.method1746((int) local65.aLong150);
					Static202.aClass23_3.method726(4, local70.aByteArray29);
					local65.method3229();
					Static93.aClass99_7.method3290(local65, local65.aLong150);
					Static180.anInt3909++;
					Static205.anInt4377--;
				}
				for (@Pc(169) int local169 = 0; local169 < 100; local169++) {
					@Pc(175) int local175 = Static202.aClass23_3.method732();
					if (local175 < 0) {
						throw new IOException();
					}
					if (local175 == 0) {
						break;
					}
					Static74.anInt1818 = 0;
					@Pc(193) byte local193 = 0;
					if (Static82.aClass1_Sub2_Sub21_1 == null) {
						local193 = 8;
					} else if (Static157.anInt4278 == 0) {
						local193 = 1;
					}
					@Pc(219) int local219;
					@Pc(224) int local224;
					@Pc(258) int local258;
					@Pc(336) int local336;
					if (local193 <= 0) {
						local219 = Static108.aClass1_Sub14_2.aByteArray29.length - Static82.aClass1_Sub2_Sub21_1.aByte9;
						local224 = 512 - Static157.anInt4278;
						if (local224 > local219 - Static108.aClass1_Sub14_2.anInt2306) {
							local224 = local219 - Static108.aClass1_Sub14_2.anInt2306;
						}
						if (local224 > local175) {
							local224 = local175;
						}
						Static202.aClass23_3.method729(Static108.aClass1_Sub14_2.aByteArray29, Static108.aClass1_Sub14_2.anInt2306, local224);
						if (Static70.aByte6 != 0) {
							for (local258 = 0; local258 < local224; local258++) {
								Static108.aClass1_Sub14_2.aByteArray29[local258 + Static108.aClass1_Sub14_2.anInt2306] ^= Static70.aByte6;
							}
						}
						Static108.aClass1_Sub14_2.anInt2306 += local224;
						Static157.anInt4278 += local224;
						if (local219 == Static108.aClass1_Sub14_2.anInt2306) {
							if (Static82.aClass1_Sub2_Sub21_1.aLong150 == 16711935L) {
								Static195.aClass1_Sub14_4 = Static108.aClass1_Sub14_2;
								for (local258 = 0; local258 < 256; local258++) {
									@Pc(323) Class60_Sub1 local323 = Static124.aClass60_Sub1Array1[local258];
									if (local323 != null) {
										Static195.aClass1_Sub14_4.anInt2306 = local258 * 8 + 5;
										local336 = Static195.aClass1_Sub14_4.method1700();
										@Pc(340) int local340 = Static195.aClass1_Sub14_4.method1700();
										local323.method2350(local336, local340);
									}
								}
							} else {
								Static33.aCRC32_1.reset();
								Static33.aCRC32_1.update(Static108.aClass1_Sub14_2.aByteArray29, 0, local219);
								local258 = (int) Static33.aCRC32_1.getValue();
								if (Static82.aClass1_Sub2_Sub21_1.anInt3705 != local258) {
									try {
										Static202.aClass23_3.method731();
									} catch (@Pc(376) Exception local376) {
									}
									Static202.aClass23_3 = null;
									Static64.anInt1662++;
									Static70.aByte6 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static188.anInt4139 = 0;
								Static64.anInt1662 = 0;
								Static82.aClass1_Sub2_Sub21_1.aClass60_Sub1_141.method2352((int) (Static82.aClass1_Sub2_Sub21_1.aLong150 & 0xFFFFL), Static5.aBoolean5, (Static82.aClass1_Sub2_Sub21_1.aLong150 & 0xFF0000L) == 16711680L, Static108.aClass1_Sub14_2.aByteArray29);
							}
							Static82.aClass1_Sub2_Sub21_1.method3295();
							Static82.aClass1_Sub2_Sub21_1 = null;
							if (Static5.aBoolean5) {
								Static149.anInt3501--;
							} else {
								Static180.anInt3909--;
							}
							Static108.aClass1_Sub14_2 = null;
							Static157.anInt4278 = 0;
						} else {
							if (Static157.anInt4278 != 512) {
								break;
							}
							Static157.anInt4278 = 0;
						}
					} else {
						local219 = local193 - Static120.aClass1_Sub14_3.anInt2306;
						if (local175 < local219) {
							local219 = local175;
						}
						Static202.aClass23_3.method729(Static120.aClass1_Sub14_3.aByteArray29, Static120.aClass1_Sub14_3.anInt2306, local219);
						if (Static70.aByte6 != 0) {
							for (local224 = 0; local224 < local219; local224++) {
								Static120.aClass1_Sub14_3.aByteArray29[local224 + Static120.aClass1_Sub14_3.anInt2306] ^= Static70.aByte6;
							}
						}
						Static120.aClass1_Sub14_3.anInt2306 += local219;
						if (Static120.aClass1_Sub14_3.anInt2306 < local193) {
							break;
						}
						if (Static82.aClass1_Sub2_Sub21_1 == null) {
							Static120.aClass1_Sub14_3.anInt2306 = 0;
							local224 = Static120.aClass1_Sub14_3.method1738();
							local258 = Static120.aClass1_Sub14_3.method1753();
							@Pc(519) int local519 = Static120.aClass1_Sub14_3.method1738();
							@Pc(527) long local527 = (long) ((local224 << 16) + local258);
							local336 = Static120.aClass1_Sub14_3.method1700();
							@Pc(537) Class1_Sub2_Sub21 local537 = (Class1_Sub2_Sub21) Static89.aClass99_6.method3292(local527);
							Static5.aBoolean5 = true;
							if (local537 == null) {
								local537 = (Class1_Sub2_Sub21) Static93.aClass99_7.method3292(local527);
								Static5.aBoolean5 = false;
							}
							if (local537 == null) {
								throw new IOException();
							}
							Static82.aClass1_Sub2_Sub21_1 = local537;
							@Pc(566) int local566 = local519 == 0 ? 5 : 9;
							Static108.aClass1_Sub14_2 = new Class1_Sub14(local336 + local566 + Static82.aClass1_Sub2_Sub21_1.aByte9);
							Static108.aClass1_Sub14_2.method1710(local519);
							Static108.aClass1_Sub14_2.method1724(local336);
							Static157.anInt4278 = 8;
							Static120.aClass1_Sub14_3.anInt2306 = 0;
						} else if (Static157.anInt4278 == 0) {
							if (Static120.aClass1_Sub14_3.aByteArray29[0] == -1) {
								Static157.anInt4278 = 1;
								Static120.aClass1_Sub14_3.anInt2306 = 0;
							} else {
								Static82.aClass1_Sub2_Sub21_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(616) IOException local616) {
				try {
					Static202.aClass23_3.method731();
				} catch (@Pc(621) Exception local621) {
				}
				Static188.anInt4139++;
				Static202.aClass23_3 = null;
				return false;
			}
		}
	}
}
