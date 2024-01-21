import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!v", name = "G", descriptor = "Lclient!r;")
	private static Class61 aClass61_982 = Static129.method2060(" is already on your friend list)3");

	@OriginalMember(owner = "client!v", name = "v", descriptor = "Lclient!r;")
	public static Class61 aClass61_977 = aClass61_982;

	@OriginalMember(owner = "client!v", name = "y", descriptor = "I")
	public static int anInt3090 = 0;

	@OriginalMember(owner = "client!v", name = "z", descriptor = "Lclient!r;")
	private static Class61 aClass61_978 = Static129.method2060("Members only world");

	@OriginalMember(owner = "client!v", name = "A", descriptor = "Lclient!r;")
	public static Class61 aClass61_979 = Static129.method2060("Einloggen");

	@OriginalMember(owner = "client!v", name = "B", descriptor = "Lclient!r;")
	public static Class61 aClass61_980 = Static129.method2060("<)4col>");

	@OriginalMember(owner = "client!v", name = "D", descriptor = "Lclient!r;")
	public static Class61 aClass61_981 = aClass61_978;

	@OriginalMember(owner = "client!v", name = "E", descriptor = "I")
	public static int anInt3091 = -1;

	@OriginalMember(owner = "client!v", name = "J", descriptor = "Lclient!r;")
	private static Class61 aClass61_984 = Static129.method2060("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!v", name = "K", descriptor = "Lclient!r;")
	public static Class61 aClass61_985 = aClass61_984;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
	public static void method1945() {
		aClass61_982 = null;
		aClass61_978 = null;
		aClass61_980 = null;
		aClass61_977 = null;
		aClass61_985 = null;
		aClass61_984 = null;
		aClass61_979 = null;
		aClass61_981 = null;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(B)Z")
	public static boolean method1946() {
		@Pc(16) long local16 = Static102.method1742();
		@Pc(22) int local22 = (int) (local16 - Static76.aLong61);
		if (local22 > 200) {
			local22 = 200;
		}
		Static76.aLong61 = local16;
		Static134.anInt3405 += local22;
		if (Static31.anInt940 == 0 && Static25.anInt735 == 0 && Static113.anInt2957 == 0 && Static50.anInt1257 == 0) {
			return true;
		} else if (Static81.aClass30_14 == null) {
			return false;
		} else {
			try {
				if (Static134.anInt3405 > 30000) {
					throw new IOException();
				}
				@Pc(61) Class5_Sub2_Sub4 local61;
				@Pc(66) Class5_Sub14 local66;
				while (Static25.anInt735 < 20 && Static50.anInt1257 > 0) {
					local61 = (Class5_Sub2_Sub4) Static100.aClass20_10.method655();
					local66 = new Class5_Sub14(4);
					local66.method1440(1);
					local66.method1438((int) local61.aLong100);
					Static81.aClass30_14.method780(local66.aByteArray33, 4);
					Static65.aClass20_7.method647(local61, local61.aLong100);
					Static25.anInt735++;
					Static50.anInt1257--;
				}
				while (Static31.anInt940 < 20 && Static113.anInt2957 > 0) {
					local61 = (Class5_Sub2_Sub4) Static67.aClass83_2.method2198();
					local66 = new Class5_Sub14(4);
					local66.method1440(0);
					local66.method1438((int) local61.aLong100);
					Static81.aClass30_14.method780(local66.aByteArray33, 4);
					local61.method2172();
					Static29.aClass20_4.method647(local61, local61.aLong100);
					Static113.anInt2957--;
					Static31.anInt940++;
				}
				for (@Pc(157) int local157 = 0; local157 < 100; local157++) {
					@Pc(163) int local163 = Static81.aClass30_14.method777();
					if (local163 < 0) {
						throw new IOException();
					}
					if (local163 == 0) {
						break;
					}
					@Pc(179) byte local179 = 0;
					if (Static127.aClass5_Sub2_Sub4_1 == null) {
						local179 = 8;
					} else if (Static127.anInt3198 == 0) {
						local179 = 1;
					}
					Static134.anInt3405 = 0;
					@Pc(205) int local205;
					@Pc(222) int local222;
					@Pc(272) int local272;
					@Pc(280) int local280;
					if (local179 > 0) {
						local205 = local179 - Static30.aClass5_Sub14_2.anInt2199;
						if (local163 < local205) {
							local205 = local163;
						}
						Static81.aClass30_14.method773(Static30.aClass5_Sub14_2.aByteArray33, Static30.aClass5_Sub14_2.anInt2199, local205);
						if (Static67.aByte5 != 0) {
							for (local222 = 0; local222 < local205; local222++) {
								Static30.aClass5_Sub14_2.aByteArray33[local222 + Static30.aClass5_Sub14_2.anInt2199] ^= Static67.aByte5;
							}
						}
						Static30.aClass5_Sub14_2.anInt2199 += local205;
						if (local179 > Static30.aClass5_Sub14_2.anInt2199) {
							break;
						}
						if (Static127.aClass5_Sub2_Sub4_1 == null) {
							Static30.aClass5_Sub14_2.anInt2199 = 0;
							local222 = Static30.aClass5_Sub14_2.method1471();
							local272 = Static30.aClass5_Sub14_2.method1478();
							@Pc(276) int local276 = Static30.aClass5_Sub14_2.method1471();
							local280 = Static30.aClass5_Sub14_2.method1461();
							@Pc(288) long local288 = (long) ((local222 << 16) + local272);
							@Pc(294) Class5_Sub2_Sub4 local294 = (Class5_Sub2_Sub4) Static65.aClass20_7.method656(local288);
							Static44.aBoolean34 = true;
							if (local294 == null) {
								local294 = (Class5_Sub2_Sub4) Static29.aClass20_4.method656(local288);
								Static44.aBoolean34 = false;
							}
							if (local294 == null) {
								throw new IOException();
							}
							Static127.aClass5_Sub2_Sub4_1 = local294;
							@Pc(323) int local323 = local276 == 0 ? 5 : 9;
							Static47.aClass5_Sub14_4 = new Class5_Sub14(local280 + local323 + Static127.aClass5_Sub2_Sub4_1.aByte2);
							Static47.aClass5_Sub14_4.method1440(local276);
							Static47.aClass5_Sub14_4.method1451(local280);
							Static30.aClass5_Sub14_2.anInt2199 = 0;
							Static127.anInt3198 = 8;
						} else if (Static127.anInt3198 == 0) {
							if (Static30.aClass5_Sub14_2.aByteArray33[0] == -1) {
								Static30.aClass5_Sub14_2.anInt2199 = 0;
								Static127.anInt3198 = 1;
							} else {
								Static127.aClass5_Sub2_Sub4_1 = null;
							}
						}
					} else {
						local205 = Static47.aClass5_Sub14_4.aByteArray33.length - Static127.aClass5_Sub2_Sub4_1.aByte2;
						local222 = 512 - Static127.anInt3198;
						if (local222 > local205 - Static47.aClass5_Sub14_4.anInt2199) {
							local222 = local205 - Static47.aClass5_Sub14_4.anInt2199;
						}
						if (local163 < local222) {
							local222 = local163;
						}
						Static81.aClass30_14.method773(Static47.aClass5_Sub14_4.aByteArray33, Static47.aClass5_Sub14_4.anInt2199, local222);
						if (Static67.aByte5 != 0) {
							for (local272 = 0; local272 < local222; local272++) {
								Static47.aClass5_Sub14_4.aByteArray33[Static47.aClass5_Sub14_4.anInt2199 + local272] = (byte) (Static47.aClass5_Sub14_4.aByteArray33[Static47.aClass5_Sub14_4.anInt2199 + local272] ^ Static67.aByte5);
							}
						}
						Static127.anInt3198 += local222;
						Static47.aClass5_Sub14_4.anInt2199 += local222;
						if (Static47.aClass5_Sub14_4.anInt2199 == local205) {
							if (Static127.aClass5_Sub2_Sub4_1.aLong100 == 16711935L) {
								Static23.aClass5_Sub14_1 = Static47.aClass5_Sub14_4;
								for (local272 = 0; local272 < 256; local272++) {
									@Pc(476) Class26_Sub1 local476 = Static40.aClass26_Sub1Array1[local272];
									if (local476 != null) {
										Static23.aClass5_Sub14_1.anInt2199 = local272 * 8 + 5;
										local280 = Static23.aClass5_Sub14_1.method1461();
										@Pc(493) int local493 = Static23.aClass5_Sub14_1.method1461();
										local476.method1048(local280, local493);
									}
								}
							} else {
								Static16.aCRC32_1.reset();
								Static16.aCRC32_1.update(Static47.aClass5_Sub14_4.aByteArray33, 0, local205);
								local272 = (int) Static16.aCRC32_1.getValue();
								if (local272 != Static127.aClass5_Sub2_Sub4_1.anInt895) {
									try {
										Static81.aClass30_14.method779();
									} catch (@Pc(525) Exception local525) {
									}
									Static81.aClass30_14 = null;
									Static67.aByte5 = (byte) (Math.random() * 255.0D + 1.0D);
									Static8.anInt181++;
									return false;
								}
								Static8.anInt181 = 0;
								Static8.anInt194 = 0;
								Static127.aClass5_Sub2_Sub4_1.aClass26_Sub1_4.method1050((Static127.aClass5_Sub2_Sub4_1.aLong100 & 0xFF0000L) == 16711680L, Static47.aClass5_Sub14_4.aByteArray33, (int) (Static127.aClass5_Sub2_Sub4_1.aLong100 & 0xFFFFL), Static44.aBoolean34);
							}
							Static127.aClass5_Sub2_Sub4_1.method2189();
							Static47.aClass5_Sub14_4 = null;
							Static127.aClass5_Sub2_Sub4_1 = null;
							Static127.anInt3198 = 0;
							if (Static44.aBoolean34) {
								Static25.anInt735--;
							} else {
								Static31.anInt940--;
							}
						} else {
							if (Static127.anInt3198 != 512) {
								break;
							}
							Static127.anInt3198 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(606) IOException local606) {
				try {
					Static81.aClass30_14.method779();
				} catch (@Pc(611) Exception local611) {
				}
				Static8.anInt194++;
				Static81.aClass30_14 = null;
				return false;
			}
		}
	}
}
