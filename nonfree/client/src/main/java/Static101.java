import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!me", name = "pb", descriptor = "[Z")
	public static boolean[] aBooleanArray10 = new boolean[8];

	@OriginalMember(owner = "client!me", name = "rb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1305 = Static122.method531("Hidden)2use");

	@OriginalMember(owner = "client!me", name = "sb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1306 = Static122.method531("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!me", name = "vb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1307 = Static122.method531("Connection timed out)3");

	@OriginalMember(owner = "client!me", name = "wb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1308 = Static122.method531(":assistreq:");

	@OriginalMember(owner = "client!me", name = "yb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1309 = Static122.method531(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!me", name = "Ab", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1310 = aClass73_1307;

	@OriginalMember(owner = "client!me", name = "Bb", descriptor = "[J")
	public static long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!me", name = "Cb", descriptor = "I")
	public static int anInt2290 = 0;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIILclient!ff;IIII)V")
	public static void method1772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub12 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(37) int local37;
		if (arg5 < 0 || arg5 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				local37 = arg3.method1354();
				if (local37 == 0) {
					return;
				}
				if (local37 == 1) {
					arg3.method1354();
					return;
				}
				if (local37 <= 49) {
					arg3.method1354();
				}
			}
			return;
		}
		Static110.aByteArrayArrayArray5[arg6][arg5][arg4] = 0;
		while (true) {
			local37 = arg3.method1354();
			if (local37 == 0) {
				if (arg6 == 0) {
					Static65.anIntArrayArrayArray5[0][arg5][arg4] = -Static61.method1113(arg2 + arg4 + 556238, 932731 - -arg5 - -arg0) * 8;
					return;
				} else {
					Static65.anIntArrayArrayArray5[arg6][arg5][arg4] = Static65.anIntArrayArrayArray5[arg6 - 1][arg5][arg4] - 240;
					return;
				}
			}
			if (local37 == 1) {
				@Pc(100) int local100 = arg3.method1354();
				if (local100 == 1) {
					local100 = 0;
				}
				if (arg6 != 0) {
					Static65.anIntArrayArrayArray5[arg6][arg5][arg4] = Static65.anIntArrayArrayArray5[arg6 - 1][arg5][arg4] - local100 * 8;
					return;
				}
				Static65.anIntArrayArrayArray5[0][arg5][arg4] = -local100 * 8;
				return;
			}
			if (local37 <= 49) {
				Static167.aByteArrayArrayArray8[arg6][arg5][arg4] = arg3.method1342();
				Static165.aByteArrayArrayArray2[arg6][arg5][arg4] = (byte) ((local37 - 2) / 4);
				Static135.aByteArrayArrayArray6[arg6][arg5][arg4] = (byte) (arg1 + local37 - 2 & 0x3);
			} else if (local37 <= 81) {
				Static110.aByteArrayArrayArray5[arg6][arg5][arg4] = (byte) (local37 - 49);
			} else {
				Static90.aByteArrayArrayArray4[arg6][arg5][arg4] = (byte) (local37 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(IIII)I")
	public static int method1773(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static110.aByteArrayArrayArray5[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static110.aByteArrayArrayArray5[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!me", name = "g", descriptor = "(I)Z")
	public static boolean method1774() {
		@Pc(8) long local8 = Static88.method1536();
		@Pc(14) int local14 = (int) (local8 - Static17.aLong179);
		if (local14 > 200) {
			local14 = 200;
		}
		Static17.aLong179 = local8;
		Static37.anInt896 += local14;
		if (Static108.anInt2486 == 0 && Static124.anInt2868 == 0 && Static31.anInt806 == 0 && Static163.anInt3163 == 0) {
			return true;
		} else if (Static139.aClass2_5 == null) {
			return false;
		} else {
			try {
				if (Static37.anInt896 > 30000) {
					throw new IOException();
				}
				@Pc(61) Class3_Sub1_Sub11 local61;
				@Pc(66) Class3_Sub12 local66;
				while (Static124.anInt2868 < 20 && Static163.anInt3163 > 0) {
					local61 = (Class3_Sub1_Sub11) Static6.aClass16_1.method551();
					local66 = new Class3_Sub12(4);
					local66.method1383(1);
					local66.method1346((int) local61.aLong183);
					Static139.aClass2_5.method15(4, local66.aByteArray16);
					Static158.aClass16_11.method546(local61, local61.aLong183);
					Static163.anInt3163--;
					Static124.anInt2868++;
				}
				while (Static108.anInt2486 < 20 && Static31.anInt806 > 0) {
					local61 = (Class3_Sub1_Sub11) Static123.aClass50_2.method1595();
					local66 = new Class3_Sub12(4);
					local66.method1383(0);
					local66.method1346((int) local61.aLong183);
					Static139.aClass2_5.method15(4, local66.aByteArray16);
					local61.method2681();
					Static40.aClass16_3.method546(local61, local61.aLong183);
					Static108.anInt2486++;
					Static31.anInt806--;
				}
				for (@Pc(170) int local170 = 0; local170 < 100; local170++) {
					@Pc(176) int local176 = Static139.aClass2_5.method16();
					if (local176 < 0) {
						throw new IOException();
					}
					if (local176 == 0) {
						break;
					}
					Static37.anInt896 = 0;
					@Pc(194) byte local194 = 0;
					if (Static132.aClass3_Sub1_Sub11_1 == null) {
						local194 = 8;
					} else if (Static159.anInt3486 == 0) {
						local194 = 1;
					}
					@Pc(217) int local217;
					@Pc(238) int local238;
					@Pc(291) int local291;
					@Pc(299) int local299;
					if (local194 > 0) {
						local217 = local194 - Static19.aClass3_Sub12_3.anInt1793;
						if (local176 < local217) {
							local217 = local176;
						}
						Static139.aClass2_5.method13(Static19.aClass3_Sub12_3.aByteArray16, Static19.aClass3_Sub12_3.anInt1793, local217);
						if (Static116.aByte7 != 0) {
							for (local238 = 0; local238 < local217; local238++) {
								Static19.aClass3_Sub12_3.aByteArray16[Static19.aClass3_Sub12_3.anInt1793 + local238] = (byte) (Static19.aClass3_Sub12_3.aByteArray16[Static19.aClass3_Sub12_3.anInt1793 + local238] ^ Static116.aByte7);
							}
						}
						Static19.aClass3_Sub12_3.anInt1793 += local217;
						if (local194 > Static19.aClass3_Sub12_3.anInt1793) {
							break;
						}
						if (Static132.aClass3_Sub1_Sub11_1 == null) {
							Static19.aClass3_Sub12_3.anInt1793 = 0;
							local238 = Static19.aClass3_Sub12_3.method1354();
							local291 = Static19.aClass3_Sub12_3.method1359();
							@Pc(295) int local295 = Static19.aClass3_Sub12_3.method1354();
							local299 = Static19.aClass3_Sub12_3.method1373();
							@Pc(306) long local306 = (long) ((local238 << 16) + local291);
							@Pc(312) Class3_Sub1_Sub11 local312 = (Class3_Sub1_Sub11) Static158.aClass16_11.method554(local306);
							Static99.aBoolean145 = true;
							if (local312 == null) {
								local312 = (Class3_Sub1_Sub11) Static40.aClass16_3.method554(local306);
								Static99.aBoolean145 = false;
							}
							if (local312 == null) {
								throw new IOException();
							}
							Static132.aClass3_Sub1_Sub11_1 = local312;
							@Pc(338) int local338 = local295 == 0 ? 5 : 9;
							Static54.aClass3_Sub12_5 = new Class3_Sub12(local299 + local338 + Static132.aClass3_Sub1_Sub11_1.aByte3);
							Static54.aClass3_Sub12_5.method1383(local295);
							Static54.aClass3_Sub12_5.method1392(local299);
							Static19.aClass3_Sub12_3.anInt1793 = 0;
							Static159.anInt3486 = 8;
						} else if (Static159.anInt3486 == 0) {
							if (Static19.aClass3_Sub12_3.aByteArray16[0] == -1) {
								Static19.aClass3_Sub12_3.anInt1793 = 0;
								Static159.anInt3486 = 1;
							} else {
								Static132.aClass3_Sub1_Sub11_1 = null;
							}
						}
					} else {
						local217 = Static54.aClass3_Sub12_5.aByteArray16.length - Static132.aClass3_Sub1_Sub11_1.aByte3;
						local238 = 512 - Static159.anInt3486;
						if (local217 - Static54.aClass3_Sub12_5.anInt1793 < local238) {
							local238 = local217 - Static54.aClass3_Sub12_5.anInt1793;
						}
						if (local176 < local238) {
							local238 = local176;
						}
						Static139.aClass2_5.method13(Static54.aClass3_Sub12_5.aByteArray16, Static54.aClass3_Sub12_5.anInt1793, local238);
						if (Static116.aByte7 != 0) {
							for (local291 = 0; local291 < local238; local291++) {
								Static54.aClass3_Sub12_5.aByteArray16[local291 + Static54.aClass3_Sub12_5.anInt1793] ^= Static116.aByte7;
							}
						}
						Static159.anInt3486 += local238;
						Static54.aClass3_Sub12_5.anInt1793 += local238;
						if (Static54.aClass3_Sub12_5.anInt1793 == local217) {
							if (Static132.aClass3_Sub1_Sub11_1.aLong183 == 16711935L) {
								Static2.aClass3_Sub12_1 = Static54.aClass3_Sub12_5;
								for (local291 = 0; local291 < 256; local291++) {
									@Pc(564) Class13_Sub1 local564 = Static162.aClass13_Sub1Array1[local291];
									if (local564 != null) {
										Static2.aClass3_Sub12_1.anInt1793 = local291 * 8 + 5;
										local299 = Static2.aClass3_Sub12_1.method1373();
										@Pc(583) int local583 = Static2.aClass3_Sub12_1.method1373();
										local564.method376(local583, local299);
									}
								}
							} else {
								Static135.aCRC32_3.reset();
								Static135.aCRC32_3.update(Static54.aClass3_Sub12_5.aByteArray16, 0, local217);
								local291 = (int) Static135.aCRC32_3.getValue();
								if (local291 != Static132.aClass3_Sub1_Sub11_1.anInt1736) {
									try {
										Static139.aClass2_5.method12();
									} catch (@Pc(510) Exception local510) {
									}
									Static116.aByte7 = (byte) (Math.random() * 255.0D + 1.0D);
									Static139.aClass2_5 = null;
									Static118.anInt3946++;
									return false;
								}
								Static118.anInt3946 = 0;
								Static52.anInt1278 = 0;
								Static132.aClass3_Sub1_Sub11_1.aClass13_Sub1_8.method369(Static99.aBoolean145, (Static132.aClass3_Sub1_Sub11_1.aLong183 & 0xFF0000L) == 16711680L, Static54.aClass3_Sub12_5.aByteArray16, (int) (Static132.aClass3_Sub1_Sub11_1.aLong183 & 0xFFFFL));
							}
							Static132.aClass3_Sub1_Sub11_1.method2783();
							if (Static99.aBoolean145) {
								Static124.anInt2868--;
							} else {
								Static108.anInt2486--;
							}
							Static132.aClass3_Sub1_Sub11_1 = null;
							Static159.anInt3486 = 0;
							Static54.aClass3_Sub12_5 = null;
						} else {
							if (Static159.anInt3486 != 512) {
								break;
							}
							Static159.anInt3486 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(622) IOException local622) {
				try {
					Static139.aClass2_5.method12();
				} catch (@Pc(627) Exception local627) {
				}
				Static52.anInt1278++;
				Static139.aClass2_5 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)V")
	public static void method1775() {
		aClass73_1305 = null;
		aClass73_1306 = null;
		aClass73_1309 = null;
		aBooleanArray10 = null;
		aClass73_1308 = null;
		aClass73_1310 = null;
		aLongArray2 = null;
		aClass73_1307 = null;
	}
}
