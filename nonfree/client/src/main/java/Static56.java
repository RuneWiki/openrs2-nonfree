import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ej", name = "K", descriptor = "[I")
	public static int[] anIntArray160 = new int[100];

	@OriginalMember(owner = "client!ej", name = "L", descriptor = "Lclient!qe;")
	public static Class78 aClass78_192 = Static199.method3560("Ausw-=hlen");

	@OriginalMember(owner = "client!ej", name = "O", descriptor = "[I")
	public static int[] anIntArray161 = new int[32];

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "(I)Z")
	public static boolean method730() {
		@Pc(8) long local8 = Static111.method1911();
		@Pc(13) int local13 = (int) (local8 - Static146.aLong125);
		if (local13 > 200) {
			local13 = 200;
		}
		Static176.anInt4068 += local13;
		Static146.aLong125 = local8;
		if (Static16.anInt4875 == 0 && Static74.anInt1595 == 0 && Static36.anInt666 == 0 && Static187.anInt4366 == 0) {
			return true;
		} else if (Static154.aClass105_3 == null) {
			return false;
		} else {
			try {
				if (Static176.anInt4068 > 30000) {
					throw new IOException();
				}
				@Pc(53) Class2_Sub3_Sub16 local53;
				@Pc(58) Class2_Sub23 local58;
				while (Static74.anInt1595 < 20 && Static187.anInt4366 > 0) {
					local53 = (Class2_Sub3_Sub16) Static118.aClass103_16.method3668();
					local58 = new Class2_Sub23(4);
					local58.method2132(1);
					local58.method2112((int) local53.aLong188);
					Static154.aClass105_3.method3692(local58.aByteArray41, 4);
					Static202.aClass103_20.method3665(local53.aLong188, local53);
					Static187.anInt4366--;
					Static74.anInt1595++;
				}
				while (Static16.anInt4875 < 20 && Static36.anInt666 > 0) {
					local53 = (Class2_Sub3_Sub16) Static8.aClass102_1.method3626();
					local58 = new Class2_Sub23(4);
					local58.method2132(0);
					local58.method2112((int) local53.aLong188);
					Static154.aClass105_3.method3692(local58.aByteArray41, 4);
					local53.method3918();
					Static204.aClass103_21.method3665(local53.aLong188, local53);
					Static16.anInt4875++;
					Static36.anInt666--;
				}
				for (@Pc(152) int local152 = 0; local152 < 100; local152++) {
					@Pc(158) int local158 = Static154.aClass105_3.method3690();
					if (local158 < 0) {
						throw new IOException();
					}
					if (local158 == 0) {
						break;
					}
					Static176.anInt4068 = 0;
					@Pc(173) byte local173 = 0;
					if (Static90.aClass2_Sub3_Sub16_1 == null) {
						local173 = 8;
					} else if (Static200.anInt4497 == 0) {
						local173 = 1;
					}
					@Pc(196) int local196;
					@Pc(200) int local200;
					@Pc(237) int local237;
					@Pc(378) int local378;
					if (local173 <= 0) {
						local196 = Static139.aClass2_Sub23_7.aByteArray41.length - Static90.aClass2_Sub3_Sub16_1.aByte10;
						local200 = 512 - Static200.anInt4497;
						if (local196 - Static139.aClass2_Sub23_7.anInt2703 < local200) {
							local200 = local196 - Static139.aClass2_Sub23_7.anInt2703;
						}
						if (local200 > local158) {
							local200 = local158;
						}
						Static154.aClass105_3.method3694(local200, Static139.aClass2_Sub23_7.aByteArray41, Static139.aClass2_Sub23_7.anInt2703);
						if (Static55.aByte5 != 0) {
							for (local237 = 0; local237 < local200; local237++) {
								Static139.aClass2_Sub23_7.aByteArray41[local237 + Static139.aClass2_Sub23_7.anInt2703] ^= Static55.aByte5;
							}
						}
						Static139.aClass2_Sub23_7.anInt2703 += local200;
						Static200.anInt4497 += local200;
						if (local196 == Static139.aClass2_Sub23_7.anInt2703) {
							if (Static90.aClass2_Sub3_Sub16_1.aLong188 == 16711935L) {
								Static107.aClass2_Sub23_5 = Static139.aClass2_Sub23_7;
								for (local237 = 0; local237 < 256; local237++) {
									@Pc(365) Class72_Sub1 local365 = Static103.aClass72_Sub1Array1[local237];
									if (local365 != null) {
										Static107.aClass2_Sub23_5.anInt2703 = local237 * 8 + 5;
										local378 = Static107.aClass2_Sub23_5.method2133();
										@Pc(382) int local382 = Static107.aClass2_Sub23_5.method2133();
										local365.method3198(local378, local382);
									}
								}
							} else {
								Static5.aCRC32_1.reset();
								Static5.aCRC32_1.update(Static139.aClass2_Sub23_7.aByteArray41, 0, local196);
								local237 = (int) Static5.aCRC32_1.getValue();
								if (Static90.aClass2_Sub3_Sub16_1.anInt2304 != local237) {
									try {
										Static154.aClass105_3.method3695();
									} catch (@Pc(309) Exception local309) {
									}
									Static101.anInt2210++;
									Static55.aByte5 = (byte) (Math.random() * 255.0D + 1.0D);
									Static154.aClass105_3 = null;
									return false;
								}
								Static101.anInt2212 = 0;
								Static101.anInt2210 = 0;
								Static90.aClass2_Sub3_Sub16_1.aClass72_Sub1_21.method3199((Static90.aClass2_Sub3_Sub16_1.aLong188 & 0xFF0000L) == 16711680L, Static139.aClass2_Sub23_7.aByteArray41, (int) (Static90.aClass2_Sub3_Sub16_1.aLong188 & 0xFFFFL), Static130.aBoolean120);
							}
							Static90.aClass2_Sub3_Sub16_1.method3986();
							Static139.aClass2_Sub23_7 = null;
							Static200.anInt4497 = 0;
							if (Static130.aBoolean120) {
								Static74.anInt1595--;
							} else {
								Static16.anInt4875--;
							}
							Static90.aClass2_Sub3_Sub16_1 = null;
						} else {
							if (Static200.anInt4497 != 512) {
								break;
							}
							Static200.anInt4497 = 0;
						}
					} else {
						local196 = local173 - Static26.aClass2_Sub23_1.anInt2703;
						if (local158 < local196) {
							local196 = local158;
						}
						Static154.aClass105_3.method3694(local196, Static26.aClass2_Sub23_1.aByteArray41, Static26.aClass2_Sub23_1.anInt2703);
						if (Static55.aByte5 != 0) {
							for (local200 = 0; local200 < local196; local200++) {
								Static26.aClass2_Sub23_1.aByteArray41[Static26.aClass2_Sub23_1.anInt2703 + local200] ^= Static55.aByte5;
							}
						}
						Static26.aClass2_Sub23_1.anInt2703 += local196;
						if (local173 > Static26.aClass2_Sub23_1.anInt2703) {
							break;
						}
						if (Static90.aClass2_Sub3_Sub16_1 == null) {
							Static26.aClass2_Sub23_1.anInt2703 = 0;
							local200 = Static26.aClass2_Sub23_1.method2122();
							local237 = Static26.aClass2_Sub23_1.method2095();
							@Pc(495) long local495 = (long) (local237 + (local200 << 16));
							@Pc(499) int local499 = Static26.aClass2_Sub23_1.method2122();
							local378 = Static26.aClass2_Sub23_1.method2133();
							@Pc(509) Class2_Sub3_Sub16 local509 = (Class2_Sub3_Sub16) Static202.aClass103_20.method3659(local495);
							Static130.aBoolean120 = true;
							if (local509 == null) {
								local509 = (Class2_Sub3_Sub16) Static204.aClass103_21.method3659(local495);
								Static130.aBoolean120 = false;
							}
							if (local509 == null) {
								throw new IOException();
							}
							Static90.aClass2_Sub3_Sub16_1 = local509;
							@Pc(538) int local538 = local499 == 0 ? 5 : 9;
							Static139.aClass2_Sub23_7 = new Class2_Sub23(local538 + local378 + Static90.aClass2_Sub3_Sub16_1.aByte10);
							Static139.aClass2_Sub23_7.method2132(local499);
							Static139.aClass2_Sub23_7.method2134(local378);
							Static26.aClass2_Sub23_1.anInt2703 = 0;
							Static200.anInt4497 = 8;
						} else if (Static200.anInt4497 == 0) {
							if (Static26.aClass2_Sub23_1.aByteArray41[0] == -1) {
								Static26.aClass2_Sub23_1.anInt2703 = 0;
								Static200.anInt4497 = 1;
							} else {
								Static90.aClass2_Sub3_Sub16_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(594) IOException local594) {
				try {
					Static154.aClass105_3.method3695();
				} catch (@Pc(599) Exception local599) {
				}
				Static101.anInt2212++;
				Static154.aClass105_3 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
	public static void method732() {
		Static110.method1908();
		System.gc();
		Static125.method1281(25);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZI)V")
	public static void method733(@OriginalArg(0) boolean arg0) {
		@Pc(1) int local1 = Static180.anInt4193;
		if (arg0) {
			local1 = 1;
		}
		if (Static31.aClass5_Sub2_Sub2_1.anInt1849 >> 7 == Static8.anInt268 && Static66.anInt1316 == Static31.aClass5_Sub2_Sub2_1.anInt1827 >> 7) {
			Static8.anInt268 = 0;
		}
		for (@Pc(30) int local30 = 0; local30 < local1; local30++) {
			@Pc(46) Class5_Sub2_Sub2 local46;
			@Pc(40) long local40;
			if (arg0) {
				local40 = 8791798054912L;
				local46 = Static31.aClass5_Sub2_Sub2_1;
			} else {
				local40 = (long) Static16.anIntArray792[local30] << 32;
				local46 = Static213.aClass5_Sub2_Sub2Array3[Static16.anIntArray792[local30]];
			}
			if (local46 != null && local46.method1479()) {
				@Pc(62) int local62 = local46.anInt1849 >> 7;
				@Pc(67) int local67 = local46.anInt1827 >> 7;
				local46.aBoolean72 = false;
				if ((Static214.aBoolean200 && Static180.anInt4193 > 200 || Static180.anInt4193 > 50) && !arg0 && local46.anInt1878 == local46.anInt1879) {
					local46.aBoolean72 = true;
				}
				if (local62 >= 0 && local62 < 104 && local67 >= 0 && local67 < 104) {
					if (local46.aClass5_Sub3_1 == null || Static123.anInt2808 < local46.anInt1890 || local46.anInt1896 <= Static123.anInt2808) {
						if ((local46.anInt1849 & 0x7F) == 64 && (local46.anInt1827 & 0x7F) == 64) {
							if (Static57.anIntArrayArray12[local62][local67] == Static25.anInt457) {
								continue;
							}
							Static57.anIntArrayArray12[local62][local67] = Static25.anInt457;
						}
						local46.anInt1861 = Static208.method3667(local46.anInt1849, Static137.anInt3136, local46.anInt1827);
						Static183.method3367(Static137.anInt3136, local46.anInt1849, local46.anInt1827, local46.anInt1861, 60, local46, local46.anInt1853, local40, local46.aBoolean71);
					} else {
						local46.aBoolean72 = false;
						local46.anInt1861 = Static208.method3667(local46.anInt1849, Static137.anInt3136, local46.anInt1827);
						Static75.method1253(Static137.anInt3136, local46.anInt1849, local46.anInt1827, local46.anInt1861, local46, local46.anInt1853, local40, local46.anInt1903, local46.anInt1902, local46.anInt1891, local46.anInt1897);
					}
				}
			}
		}
	}
}
