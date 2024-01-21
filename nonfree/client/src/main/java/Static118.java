import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!uc", name = "db", descriptor = "Lclient!vc;")
	public static Class76 aClass76_4;

	@OriginalMember(owner = "client!uc", name = "ib", descriptor = "B")
	public static byte aByte8;

	@OriginalMember(owner = "client!uc", name = "jb", descriptor = "I")
	public static int anInt3105;

	@OriginalMember(owner = "client!uc", name = "ub", descriptor = "[I")
	public static int[] anIntArray376;

	@OriginalMember(owner = "client!uc", name = "Eb", descriptor = "I")
	public static int anInt3118;

	@OriginalMember(owner = "client!uc", name = "lb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1671 = Static6.method100("(U5");

	@OriginalMember(owner = "client!uc", name = "yb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1672 = Static6.method100("<img=1>");

	@OriginalMember(owner = "client!uc", name = "Cb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1673 = Static6.method100("runes");

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
	public static void method2120() {
		aClass26_1671 = null;
		aClass26_1672 = null;
		aClass26_1673 = null;
		aClass76_4 = null;
		anIntArray376 = null;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)Z")
	public static boolean method2123() {
		@Pc(8) long local8 = Static87.method1625();
		@Pc(14) int local14 = (int) (local8 - Static13.aLong10);
		if (local14 > 200) {
			local14 = 200;
		}
		Static13.aLong10 = local8;
		Static115.anInt3045 += local14;
		if (Static8.anInt200 == 0 && Static103.anInt2778 == 0 && Static124.anInt3201 == 0 && Static52.anInt1615 == 0) {
			return true;
		} else if (Static63.aClass76_3 == null) {
			return false;
		} else {
			try {
				if (Static115.anInt3045 > 30000) {
					throw new IOException();
				}
				@Pc(54) Class3_Sub1_Sub11 local54;
				@Pc(59) Class3_Sub11 local59;
				while (Static103.anInt2778 < 20 && Static52.anInt1615 > 0) {
					local54 = (Class3_Sub1_Sub11) Static63.aClass17_13.method598();
					local59 = new Class3_Sub11(4);
					local59.method992(1);
					local59.method996((int) local54.aLong100);
					Static63.aClass76_3.method2185(4, local59.aByteArray13);
					Static85.aClass17_15.method594(local54, local54.aLong100);
					Static103.anInt2778++;
					Static52.anInt1615--;
				}
				while (Static8.anInt200 < 20 && Static124.anInt3201 > 0) {
					local54 = (Class3_Sub1_Sub11) Static4.aClass1_1.method2();
					local59 = new Class3_Sub11(4);
					local59.method992(0);
					local59.method996((int) local54.aLong100);
					Static63.aClass76_3.method2185(4, local59.aByteArray13);
					local54.method2210();
					Static60.aClass17_11.method594(local54, local54.aLong100);
					Static8.anInt200++;
					Static124.anInt3201--;
				}
				for (@Pc(158) int local158 = 0; local158 < 100; local158++) {
					@Pc(164) int local164 = Static63.aClass76_3.method2191();
					if (local164 < 0) {
						throw new IOException();
					}
					if (local164 == 0) {
						break;
					}
					Static115.anInt3045 = 0;
					@Pc(179) byte local179 = 0;
					if (Static56.aClass3_Sub1_Sub11_1 == null) {
						local179 = 8;
					} else if (Static115.anInt3048 == 0) {
						local179 = 1;
					}
					@Pc(197) int local197;
					@Pc(218) int local218;
					@Pc(268) int local268;
					@Pc(276) int local276;
					if (local179 > 0) {
						local197 = local179 - Static122.aClass3_Sub11_35.anInt1562;
						if (local197 > local164) {
							local197 = local164;
						}
						Static63.aClass76_3.method2188(Static122.aClass3_Sub11_35.aByteArray13, Static122.aClass3_Sub11_35.anInt1562, local197);
						if (Static14.aByte1 != 0) {
							for (local218 = 0; local218 < local197; local218++) {
								Static122.aClass3_Sub11_35.aByteArray13[Static122.aClass3_Sub11_35.anInt1562 + local218] ^= Static14.aByte1;
							}
						}
						Static122.aClass3_Sub11_35.anInt1562 += local197;
						if (local179 > Static122.aClass3_Sub11_35.anInt1562) {
							break;
						}
						if (Static56.aClass3_Sub1_Sub11_1 == null) {
							Static122.aClass3_Sub11_35.anInt1562 = 0;
							local218 = Static122.aClass3_Sub11_35.method981();
							local268 = Static122.aClass3_Sub11_35.method974();
							@Pc(272) int local272 = Static122.aClass3_Sub11_35.method981();
							local276 = Static122.aClass3_Sub11_35.method984();
							@Pc(283) long local283 = (long) (local268 + (local218 << 16));
							@Pc(289) Class3_Sub1_Sub11 local289 = (Class3_Sub1_Sub11) Static85.aClass17_15.method599(local283);
							Static24.aBoolean48 = true;
							if (local289 == null) {
								local289 = (Class3_Sub1_Sub11) Static60.aClass17_11.method599(local283);
								Static24.aBoolean48 = false;
							}
							if (local289 == null) {
								throw new IOException();
							}
							Static56.aClass3_Sub1_Sub11_1 = local289;
							@Pc(315) int local315 = local272 == 0 ? 5 : 9;
							Static64.aClass3_Sub11_21 = new Class3_Sub11(Static56.aClass3_Sub1_Sub11_1.aByte6 + local276 + local315);
							Static64.aClass3_Sub11_21.method992(local272);
							Static64.aClass3_Sub11_21.method1001(local276);
							Static115.anInt3048 = 8;
							Static122.aClass3_Sub11_35.anInt1562 = 0;
						} else if (Static115.anInt3048 == 0) {
							if (Static122.aClass3_Sub11_35.aByteArray13[0] == -1) {
								Static115.anInt3048 = 1;
								Static122.aClass3_Sub11_35.anInt1562 = 0;
							} else {
								Static56.aClass3_Sub1_Sub11_1 = null;
							}
						}
					} else {
						local197 = Static64.aClass3_Sub11_21.aByteArray13.length - Static56.aClass3_Sub1_Sub11_1.aByte6;
						local218 = 512 - Static115.anInt3048;
						if (local197 - Static64.aClass3_Sub11_21.anInt1562 < local218) {
							local218 = local197 - Static64.aClass3_Sub11_21.anInt1562;
						}
						if (local164 < local218) {
							local218 = local164;
						}
						Static63.aClass76_3.method2188(Static64.aClass3_Sub11_21.aByteArray13, Static64.aClass3_Sub11_21.anInt1562, local218);
						if (Static14.aByte1 != 0) {
							for (local268 = 0; local268 < local218; local268++) {
								Static64.aClass3_Sub11_21.aByteArray13[Static64.aClass3_Sub11_21.anInt1562 + local268] = (byte) (Static64.aClass3_Sub11_21.aByteArray13[Static64.aClass3_Sub11_21.anInt1562 + local268] ^ Static14.aByte1);
							}
						}
						Static64.aClass3_Sub11_21.anInt1562 += local218;
						Static115.anInt3048 += local218;
						if (local197 == Static64.aClass3_Sub11_21.anInt1562) {
							if (Static56.aClass3_Sub1_Sub11_1.aLong100 == 16711935L) {
								Static100.aClass3_Sub11_36 = Static64.aClass3_Sub11_21;
								for (local268 = 0; local268 < 256; local268++) {
									@Pc(482) Class16_Sub1 local482 = Static15.aClass16_Sub1Array1[local268];
									if (local482 != null) {
										Static100.aClass3_Sub11_36.anInt1562 = local268 * 8 + 5;
										local276 = Static100.aClass3_Sub11_36.method984();
										@Pc(499) int local499 = Static100.aClass3_Sub11_36.method984();
										local482.method580(local499, local276);
									}
								}
							} else {
								Static48.aCRC32_3.reset();
								Static48.aCRC32_3.update(Static64.aClass3_Sub11_21.aByteArray13, 0, local197);
								local268 = (int) Static48.aCRC32_3.getValue();
								if (local268 != Static56.aClass3_Sub1_Sub11_1.anInt2029) {
									try {
										Static63.aClass76_3.method2183();
									} catch (@Pc(537) Exception local537) {
									}
									Static14.aByte1 = (byte) (Math.random() * 255.0D + 1.0D);
									Static47.anInt1430++;
									Static63.aClass76_3 = null;
									return false;
								}
								Static109.anInt2925 = 0;
								Static47.anInt1430 = 0;
								Static56.aClass3_Sub1_Sub11_1.aClass16_Sub1_9.method586((Static56.aClass3_Sub1_Sub11_1.aLong100 & 0xFF0000L) == 16711680L, (int) (Static56.aClass3_Sub1_Sub11_1.aLong100 & 0xFFFFL), Static24.aBoolean48, Static64.aClass3_Sub11_21.aByteArray13);
							}
							Static56.aClass3_Sub1_Sub11_1.method2201();
							if (Static24.aBoolean48) {
								Static103.anInt2778--;
							} else {
								Static8.anInt200--;
							}
							Static115.anInt3048 = 0;
							Static56.aClass3_Sub1_Sub11_1 = null;
							Static64.aClass3_Sub11_21 = null;
						} else {
							if (Static115.anInt3048 != 512) {
								break;
							}
							Static115.anInt3048 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(609) IOException local609) {
				try {
					Static63.aClass76_3.method2183();
				} catch (@Pc(614) Exception local614) {
				}
				Static109.anInt2925++;
				Static63.aClass76_3 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIII)V")
	public static void method2126(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static15.anInt403; local3++) {
			if (Static39.anIntArray134[local3] + Static125.anIntArray386[local3] > arg2 && arg1 + arg2 > Static39.anIntArray134[local3] && arg0 < Static31.anIntArray328[local3] + Static66.anIntArray296[local3] && Static66.anIntArray296[local3] < arg0 + arg3) {
				Static72.aBooleanArray19[local3] = true;
			}
		}
	}
}
