import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
	public static int anInt3365 = 0;

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "Lclient!db;")
	public static final Class20 aClass20_9 = new Class20(4096);

	@OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
	public static int anInt3371 = 0;

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1248 = Static177.method3050("::fps ");

	@OriginalMember(owner = "client!rc", name = "P", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1249 = Static177.method3050("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!rc", name = "Q", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
	public static void method2482() {
		if (Static103.aBoolean113 && Static73.anInt1873 != anInt3365) {
			Static147.method468(Static60.anInt1484, Static55.anInt1366, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], Static73.anInt1873, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0]);
		} else if (Static73.anInt1873 != Static103.anInt2609) {
			Static103.anInt2609 = Static73.anInt1873;
			Static52.method1022(Static73.anInt1873);
		}
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)Z")
	public static boolean method2484() {
		@Pc(4) long local4 = Static149.method2559();
		@Pc(10) int local10 = (int) (local4 - Static159.aLong127);
		if (local10 > 200) {
			local10 = 200;
		}
		Static164.anInt3611 += local10;
		Static159.aLong127 = local4;
		if (Static160.anInt3574 == 0 && Static116.anInt2857 == 0 && Static66.anInt1813 == 0 && Static182.anInt4081 == 0) {
			return true;
		} else if (Static110.aClass27_5 == null) {
			return false;
		} else {
			try {
				if (Static164.anInt3611 > 30000) {
					throw new IOException();
				}
				@Pc(68) Class4_Sub1_Sub16 local68;
				@Pc(73) Class4_Sub11 local73;
				while (Static116.anInt2857 < 20 && Static182.anInt4081 > 0) {
					local68 = (Class4_Sub1_Sub16) Static91.aClass20_3.method504();
					local73 = new Class4_Sub11(4);
					local73.method1238(1);
					local73.method1249((int) local68.aLong148);
					Static110.aClass27_5.method957(local73.aByteArray19, 4);
					Static167.aClass20_13.method499(local68.aLong148, local68);
					Static182.anInt4081--;
					Static116.anInt2857++;
				}
				while (Static160.anInt3574 < 20 && Static66.anInt1813 > 0) {
					local68 = (Class4_Sub1_Sub16) Static140.aClass78_2.method2672();
					local73 = new Class4_Sub11(4);
					local73.method1238(0);
					local73.method1249((int) local68.aLong148);
					Static110.aClass27_5.method957(local73.aByteArray19, 4);
					local68.method3176();
					Static113.aClass20_6.method499(local68.aLong148, local68);
					Static66.anInt1813--;
					Static160.anInt3574++;
				}
				for (@Pc(176) int local176 = 0; local176 < 100; local176++) {
					@Pc(182) int local182 = Static110.aClass27_5.method959();
					if (local182 < 0) {
						throw new IOException();
					}
					if (local182 == 0) {
						break;
					}
					@Pc(195) byte local195 = 0;
					Static164.anInt3611 = 0;
					if (Static182.aClass4_Sub1_Sub16_1 == null) {
						local195 = 8;
					} else if (Static42.anInt1069 == 0) {
						local195 = 1;
					}
					@Pc(217) int local217;
					@Pc(234) int local234;
					@Pc(285) int local285;
					@Pc(295) int local295;
					if (local195 > 0) {
						local217 = local195 - Static14.aClass4_Sub11_1.anInt1597;
						if (local217 > local182) {
							local217 = local182;
						}
						Static110.aClass27_5.method951(Static14.aClass4_Sub11_1.anInt1597, local217, Static14.aClass4_Sub11_1.aByteArray19);
						if (Static131.aByte7 != 0) {
							for (local234 = 0; local234 < local217; local234++) {
								Static14.aClass4_Sub11_1.aByteArray19[Static14.aClass4_Sub11_1.anInt1597 + local234] = (byte) (Static14.aClass4_Sub11_1.aByteArray19[Static14.aClass4_Sub11_1.anInt1597 + local234] ^ Static131.aByte7);
							}
						}
						Static14.aClass4_Sub11_1.anInt1597 += local217;
						if (Static14.aClass4_Sub11_1.anInt1597 < local195) {
							break;
						}
						if (Static182.aClass4_Sub1_Sub16_1 == null) {
							Static14.aClass4_Sub11_1.anInt1597 = 0;
							local234 = Static14.aClass4_Sub11_1.method1253();
							local285 = Static14.aClass4_Sub11_1.method1252();
							@Pc(289) int local289 = Static14.aClass4_Sub11_1.method1253();
							local295 = Static14.aClass4_Sub11_1.method1263();
							@Pc(303) long local303 = (long) ((local234 << 16) + local285);
							@Pc(309) Class4_Sub1_Sub16 local309 = (Class4_Sub1_Sub16) Static167.aClass20_13.method505(local303);
							Static46.aBoolean57 = true;
							if (local309 == null) {
								local309 = (Class4_Sub1_Sub16) Static113.aClass20_6.method505(local303);
								Static46.aBoolean57 = false;
							}
							if (local309 == null) {
								throw new IOException();
							}
							Static182.aClass4_Sub1_Sub16_1 = local309;
							@Pc(335) int local335 = local289 == 0 ? 5 : 9;
							Static104.aClass4_Sub11_4 = new Class4_Sub11(local335 + local295 + Static182.aClass4_Sub1_Sub16_1.aByte8);
							Static104.aClass4_Sub11_4.method1238(local289);
							Static104.aClass4_Sub11_4.method1256(local295);
							Static14.aClass4_Sub11_1.anInt1597 = 0;
							Static42.anInt1069 = 8;
						} else if (Static42.anInt1069 == 0) {
							if (Static14.aClass4_Sub11_1.aByteArray19[0] == -1) {
								Static42.anInt1069 = 1;
								Static14.aClass4_Sub11_1.anInt1597 = 0;
							} else {
								Static182.aClass4_Sub1_Sub16_1 = null;
							}
						}
					} else {
						local217 = Static104.aClass4_Sub11_4.aByteArray19.length - Static182.aClass4_Sub1_Sub16_1.aByte8;
						local234 = 512 - Static42.anInt1069;
						if (local217 - Static104.aClass4_Sub11_4.anInt1597 < local234) {
							local234 = local217 - Static104.aClass4_Sub11_4.anInt1597;
						}
						if (local182 < local234) {
							local234 = local182;
						}
						Static110.aClass27_5.method951(Static104.aClass4_Sub11_4.anInt1597, local234, Static104.aClass4_Sub11_4.aByteArray19);
						if (Static131.aByte7 != 0) {
							for (local285 = 0; local285 < local234; local285++) {
								Static104.aClass4_Sub11_4.aByteArray19[Static104.aClass4_Sub11_4.anInt1597 + local285] ^= Static131.aByte7;
							}
						}
						Static104.aClass4_Sub11_4.anInt1597 += local234;
						Static42.anInt1069 += local234;
						if (Static104.aClass4_Sub11_4.anInt1597 == local217) {
							if (Static182.aClass4_Sub1_Sub16_1.aLong148 == 16711935L) {
								Static68.aClass4_Sub11_3 = Static104.aClass4_Sub11_4;
								for (local285 = 0; local285 < 256; local285++) {
									@Pc(484) Class62_Sub1 local484 = Static27.aClass62_Sub1Array1[local285];
									if (local484 != null) {
										Static68.aClass4_Sub11_3.anInt1597 = local285 * 8 + 5;
										local295 = Static68.aClass4_Sub11_3.method1263();
										@Pc(501) int local501 = Static68.aClass4_Sub11_3.method1263();
										local484.method2890(local501, local295);
									}
								}
							} else {
								Static6.aCRC32_1.reset();
								Static6.aCRC32_1.update(Static104.aClass4_Sub11_4.aByteArray19, 0, local217);
								local285 = (int) Static6.aCRC32_1.getValue();
								if (local285 != Static182.aClass4_Sub1_Sub16_1.anInt3247) {
									try {
										Static110.aClass27_5.method952();
									} catch (@Pc(533) Exception local533) {
									}
									Static131.aByte7 = (byte) (Math.random() * 255.0D + 1.0D);
									Static68.anInt1843++;
									Static110.aClass27_5 = null;
									return false;
								}
								Static68.anInt1843 = 0;
								Static39.anInt1037 = 0;
								Static182.aClass4_Sub1_Sub16_1.aClass62_Sub1_77.method2884((int) (Static182.aClass4_Sub1_Sub16_1.aLong148 & 0xFFFFL), Static46.aBoolean57, Static104.aClass4_Sub11_4.aByteArray19, (Static182.aClass4_Sub1_Sub16_1.aLong148 & 0xFF0000L) == 16711680L);
							}
							Static182.aClass4_Sub1_Sub16_1.method3173();
							if (Static46.aBoolean57) {
								Static116.anInt2857--;
							} else {
								Static160.anInt3574--;
							}
							Static42.anInt1069 = 0;
							Static182.aClass4_Sub1_Sub16_1 = null;
							Static104.aClass4_Sub11_4 = null;
						} else {
							if (Static42.anInt1069 != 512) {
								break;
							}
							Static42.anInt1069 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(615) IOException local615) {
				try {
					Static110.aClass27_5.method952();
				} catch (@Pc(620) Exception local620) {
				}
				Static39.anInt1037++;
				Static110.aClass27_5 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method2485(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static162.method2735(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static38.aClass76_1.anApplet1 != null) {
				@Pc(106) Class84 local106 = Static38.aClass76_1.method2560(new URL(Static38.aClass76_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static93.anInt2385 + "&u=" + Static80.aLong73 + "&v1=" + Static150.aString4 + "&v2=" + Static150.aString5 + "&e=" + local7));
				while (local106.anInt3578 == 0) {
					Static52.method1025(1L);
				}
				if (local106.anInt3578 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local106.anObject4;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}
}
