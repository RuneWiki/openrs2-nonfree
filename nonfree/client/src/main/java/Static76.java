import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!hf", name = "ab", descriptor = "Lclient!vi;")
	public static Class99 aClass99_1;

	@OriginalMember(owner = "client!hf", name = "O", descriptor = "[I")
	public static final int[] anIntArray154 = new int[4000];

	@OriginalMember(owner = "client!hf", name = "V", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_558 = Static81.method1507("<br>");

	@OriginalMember(owner = "client!hf", name = "Z", descriptor = "I")
	public static int anInt1816 = -1;

	@OriginalMember(owner = "client!hf", name = "bb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_559 = Static81.method1507("rect_debug=");

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)I")
	public static int method1413(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(B)Z")
	public static boolean method1419() {
		@Pc(8) long local8 = Static24.method503();
		@Pc(14) int local14 = (int) (local8 - Static132.aLong94);
		if (local14 > 200) {
			local14 = 200;
		}
		Static132.aLong94 = local8;
		Static70.anInt3210 += local14;
		if (Static183.anInt4091 == 0 && Static143.anInt3203 == 0 && Static49.anInt1246 == 0 && Static3.anInt116 == 0) {
			return true;
		} else if (Static108.aClass53_3 == null) {
			return false;
		} else {
			try {
				if (Static70.anInt3210 > 30000) {
					throw new IOException();
				}
				@Pc(62) Class1_Sub2_Sub24 local62;
				@Pc(67) Class1_Sub7 local67;
				while (Static143.anInt3203 < 20 && Static3.anInt116 > 0) {
					local62 = (Class1_Sub2_Sub24) Static162.aClass57_36.method1876();
					local67 = new Class1_Sub7(4);
					local67.method2753(1);
					local67.method2748((int) local62.aLong149);
					Static108.aClass53_3.method1717(local67.aByteArray38, 4);
					Static176.aClass57_45.method1874(local62, local62.aLong149);
					Static3.anInt116--;
					Static143.anInt3203++;
				}
				while (Static183.anInt4091 < 20 && Static49.anInt1246 > 0) {
					local62 = (Class1_Sub2_Sub24) Static79.aClass58_1.method1915();
					local67 = new Class1_Sub7(4);
					local67.method2753(0);
					local67.method2748((int) local62.aLong149);
					Static108.aClass53_3.method1717(local67.aByteArray38, 4);
					local62.method3549();
					Static104.aClass57_21.method1874(local62, local62.aLong149);
					Static49.anInt1246--;
					Static183.anInt4091++;
				}
				for (@Pc(156) int local156 = 0; local156 < 100; local156++) {
					@Pc(162) int local162 = Static108.aClass53_3.method1718();
					if (local162 < 0) {
						throw new IOException();
					}
					if (local162 == 0) {
						break;
					}
					Static70.anInt3210 = 0;
					@Pc(180) byte local180 = 0;
					if (Static208.aClass1_Sub2_Sub24_1 == null) {
						local180 = 8;
					} else if (Static161.anInt3568 == 0) {
						local180 = 1;
					}
					@Pc(200) int local200;
					@Pc(205) int local205;
					@Pc(246) int local246;
					@Pc(320) int local320;
					if (local180 <= 0) {
						local200 = Static85.aClass1_Sub7_3.aByteArray38.length - Static208.aClass1_Sub2_Sub24_1.aByte13;
						local205 = 512 - Static161.anInt3568;
						if (local200 - Static85.aClass1_Sub7_3.anInt3592 < local205) {
							local205 = local200 - Static85.aClass1_Sub7_3.anInt3592;
						}
						if (local205 > local162) {
							local205 = local162;
						}
						Static108.aClass53_3.method1719(Static85.aClass1_Sub7_3.aByteArray38, Static85.aClass1_Sub7_3.anInt3592, local205);
						if (Static52.aByte3 != 0) {
							for (local246 = 0; local246 < local205; local246++) {
								Static85.aClass1_Sub7_3.aByteArray38[Static85.aClass1_Sub7_3.anInt3592 + local246] = (byte) (Static85.aClass1_Sub7_3.aByteArray38[Static85.aClass1_Sub7_3.anInt3592 + local246] ^ Static52.aByte3);
							}
						}
						Static85.aClass1_Sub7_3.anInt3592 += local205;
						Static161.anInt3568 += local205;
						if (local200 == Static85.aClass1_Sub7_3.anInt3592) {
							if (Static208.aClass1_Sub2_Sub24_1.aLong149 == 16711935L) {
								Static108.aClass1_Sub7_2 = Static85.aClass1_Sub7_3;
								for (local246 = 0; local246 < 256; local246++) {
									@Pc(307) Class69_Sub1 local307 = Static85.aClass69_Sub1Array2[local246];
									if (local307 != null) {
										Static108.aClass1_Sub7_2.anInt3592 = local246 * 8 + 5;
										local320 = Static108.aClass1_Sub7_2.method2793();
										@Pc(324) int local324 = Static108.aClass1_Sub7_2.method2793();
										local307.method2231(local324, local320);
									}
								}
							} else {
								Static66.aCRC32_1.reset();
								Static66.aCRC32_1.update(Static85.aClass1_Sub7_3.aByteArray38, 0, local200);
								local246 = (int) Static66.aCRC32_1.getValue();
								if (Static208.aClass1_Sub2_Sub24_1.anInt4641 != local246) {
									try {
										Static108.aClass53_3.method1713();
									} catch (@Pc(362) Exception local362) {
									}
									Static108.aClass53_3 = null;
									Static52.aByte3 = (byte) (Math.random() * 255.0D + 1.0D);
									Static50.anInt1253++;
									return false;
								}
								Static49.anInt1249 = 0;
								Static50.anInt1253 = 0;
								Static208.aClass1_Sub2_Sub24_1.aClass69_Sub1_159.method2227(Static83.aBoolean97, (Static208.aClass1_Sub2_Sub24_1.aLong149 & 0xFF0000L) == 16711680L, Static85.aClass1_Sub7_3.aByteArray38, (int) (Static208.aClass1_Sub2_Sub24_1.aLong149 & 0xFFFFL));
							}
							Static208.aClass1_Sub2_Sub24_1.method3563();
							Static208.aClass1_Sub2_Sub24_1 = null;
							Static85.aClass1_Sub7_3 = null;
							Static161.anInt3568 = 0;
							if (Static83.aBoolean97) {
								Static143.anInt3203--;
							} else {
								Static183.anInt4091--;
							}
						} else {
							if (Static161.anInt3568 != 512) {
								break;
							}
							Static161.anInt3568 = 0;
						}
					} else {
						local200 = local180 - Static174.aClass1_Sub7_5.anInt3592;
						if (local162 < local200) {
							local200 = local162;
						}
						Static108.aClass53_3.method1719(Static174.aClass1_Sub7_5.aByteArray38, Static174.aClass1_Sub7_5.anInt3592, local200);
						if (Static52.aByte3 != 0) {
							for (local205 = 0; local205 < local200; local205++) {
								Static174.aClass1_Sub7_5.aByteArray38[local205 + Static174.aClass1_Sub7_5.anInt3592] ^= Static52.aByte3;
							}
						}
						Static174.aClass1_Sub7_5.anInt3592 += local200;
						if (Static174.aClass1_Sub7_5.anInt3592 < local180) {
							break;
						}
						if (Static208.aClass1_Sub2_Sub24_1 == null) {
							Static174.aClass1_Sub7_5.anInt3592 = 0;
							local205 = Static174.aClass1_Sub7_5.method2771();
							local246 = Static174.aClass1_Sub7_5.method2765();
							@Pc(522) int local522 = Static174.aClass1_Sub7_5.method2771();
							local320 = Static174.aClass1_Sub7_5.method2793();
							@Pc(533) long local533 = (long) (local246 + (local205 << 16));
							@Pc(539) Class1_Sub2_Sub24 local539 = (Class1_Sub2_Sub24) Static176.aClass57_45.method1872(local533);
							Static83.aBoolean97 = true;
							if (local539 == null) {
								local539 = (Class1_Sub2_Sub24) Static104.aClass57_21.method1872(local533);
								Static83.aBoolean97 = false;
							}
							if (local539 == null) {
								throw new IOException();
							}
							Static208.aClass1_Sub2_Sub24_1 = local539;
							@Pc(568) int local568 = local522 == 0 ? 5 : 9;
							Static85.aClass1_Sub7_3 = new Class1_Sub7(local568 + local320 + Static208.aClass1_Sub2_Sub24_1.aByte13);
							Static85.aClass1_Sub7_3.method2753(local522);
							Static85.aClass1_Sub7_3.method2754(local320);
							Static161.anInt3568 = 8;
							Static174.aClass1_Sub7_5.anInt3592 = 0;
						} else if (Static161.anInt3568 == 0) {
							if (Static174.aClass1_Sub7_5.aByteArray38[0] == -1) {
								Static161.anInt3568 = 1;
								Static174.aClass1_Sub7_5.anInt3592 = 0;
							} else {
								Static208.aClass1_Sub2_Sub24_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(623) IOException local623) {
				try {
					Static108.aClass53_3.method1713();
				} catch (@Pc(628) Exception local628) {
				}
				Static49.anInt1249++;
				Static108.aClass53_3 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[B)V")
	public static void method1420(@OriginalArg(1) byte[] arg0) {
		@Pc(10) int local10 = 0;
		while (true) {
			while (arg0.length > local10) {
				@Pc(21) int local21 = arg0[local10++] * 64 - Static174.anInt3876;
				@Pc(31) int local31 = arg0[local10++] * 64 - Static122.anInt2713;
				@Pc(56) int local56;
				@Pc(65) int local65;
				if (local21 > 0 && local31 > 0 && local21 + 64 < Static146.anInt3124 && local31 + 64 < Static189.anInt4212) {
					local56 = local21 >> 6;
					local65 = Static189.anInt4212 - local31 - 1 >> 6;
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						for (@Pc(70) int local70 = -64; local70 < 0; local70++) {
							@Pc(76) byte local76 = arg0[local10++];
							if (local76 != 0) {
								@Pc(88) byte local88;
								if ((local76 & 0x1) == 1) {
									local88 = arg0[local10++];
									if (Static72.aByteArrayArrayArray4[local56][local65] == null) {
										Static72.aByteArrayArrayArray4[local56][local65] = new byte[4096];
									}
									Static72.aByteArrayArrayArray4[local56][local65][(-(local70 + 1) << 6) + local67] = (byte) local88;
								}
								if ((local76 & 0x2) == 2) {
									local88 = arg0[local10++];
									if (Static157.aByteArrayArrayArray11[local56][local65] == null) {
										Static157.aByteArrayArrayArray11[local56][local65] = new byte[4096];
									}
									Static157.aByteArrayArrayArray11[local56][local65][local67 + (-(local70 + 1) << 6)] = (byte) (local88 - 28);
								}
								if ((local76 & 0x4) == 4) {
									local10 += 3;
									@Pc(199) int local199 = ((arg0[local10 - 2] & 0xFF) << 8) + (((arg0[local10 - 3] & 0xFF) << 16) + (arg0[local10 - 1] & 0xFF));
									if (Static65.anIntArrayArrayArray4[local56][local65] == null) {
										Static65.anIntArrayArrayArray4[local56][local65] = new int[4096];
									}
									local199--;
									@Pc(217) Class1_Sub2_Sub5 local217 = Static37.method702(local199);
									if (local217.anIntArray85 != null) {
										local217 = local217.method695();
										if (local217 == null || local217.anInt957 == -1) {
											continue;
										}
									}
									Static65.anIntArrayArrayArray4[local56][local65][local67 + (-(local70 + 1) << 6)] = local217.anInt980 + 1;
									@Pc(254) Class1_Sub23 local254 = new Class1_Sub23();
									local254.anInt4153 = local217.anInt957;
									local254.anInt4149 = Static189.anInt4212 - local31;
									local254.anInt4152 = local21;
									Static168.aClass87_25.method2823(local254);
								}
							}
						}
					}
				} else {
					for (local56 = 0; local56 < 64; local56++) {
						for (local65 = -64; local65 < 0; local65++) {
							@Pc(290) byte local290 = arg0[local10++];
							if (local290 != 0) {
								if ((local290 & 0x1) == 1) {
									local10++;
								}
								if ((local290 & 0x2) == 2) {
									local10++;
								}
								if ((local290 & 0x4) == 4) {
									local10 += 3;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(B)V")
	public static void method1421() {
		if (Static203.aString3.toLowerCase().indexOf("microsoft") != -1) {
			Static71.anIntArray147[220] = 74;
			Static71.anIntArray147[188] = 71;
			Static71.anIntArray147[186] = 57;
			Static71.anIntArray147[191] = 73;
			Static71.anIntArray147[219] = 42;
			Static71.anIntArray147[190] = 72;
			Static71.anIntArray147[187] = 27;
			Static71.anIntArray147[221] = 43;
			Static71.anIntArray147[222] = 59;
			Static71.anIntArray147[189] = 26;
			Static71.anIntArray147[192] = 58;
			Static71.anIntArray147[223] = 28;
			return;
		}
		Static71.anIntArray147[59] = 57;
		Static71.anIntArray147[91] = 42;
		Static71.anIntArray147[45] = 26;
		Static71.anIntArray147[61] = 27;
		Static71.anIntArray147[93] = 43;
		Static71.anIntArray147[47] = 73;
		Static71.anIntArray147[44] = 71;
		Static71.anIntArray147[92] = 74;
		if (Static203.aMethod1 == null) {
			Static71.anIntArray147[192] = 58;
			Static71.anIntArray147[222] = 59;
		} else {
			Static71.anIntArray147[192] = 28;
			Static71.anIntArray147[222] = 58;
			Static71.anIntArray147[520] = 59;
		}
		Static71.anIntArray147[46] = 72;
	}
}
