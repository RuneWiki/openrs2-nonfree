import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ri", name = "N", descriptor = "[[[Lclient!bf;")
	public static Class5_Sub3[][][] aClass5_Sub3ArrayArrayArray3;

	@OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
	public static int anInt3386 = 0;

	@OriginalMember(owner = "client!ri", name = "F", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1249 = Static161.method2452("::gc");

	@OriginalMember(owner = "client!ri", name = "K", descriptor = "Z")
	public static volatile boolean aBoolean150 = true;

	@OriginalMember(owner = "client!ri", name = "S", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1250 = Static161.method2452("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!ri", name = "db", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1254 = Static161.method2452("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!ri", name = "U", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1251 = aClass20_1254;

	@OriginalMember(owner = "client!ri", name = "W", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1252 = Static161.method2452("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!ri", name = "Z", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1253 = Static161.method2452("details)3dat");

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)Z")
	public static boolean method2571() {
		@Pc(8) long local8 = Static188.method2822();
		@Pc(14) int local14 = (int) (local8 - Static46.aLong56);
		if (local14 > 200) {
			local14 = 200;
		}
		Static119.anInt2509 += local14;
		Static46.aLong56 = local8;
		if (Static201.anInt1746 == 0 && Static9.anInt210 == 0 && Static129.anInt2691 == 0 && Static26.anInt4032 == 0) {
			return true;
		} else if (Static146.aClass39_2 == null) {
			return false;
		} else {
			try {
				if (Static119.anInt2509 > 30000) {
					throw new IOException();
				}
				@Pc(65) Class5_Sub2_Sub26 local65;
				@Pc(70) Class5_Sub6 local70;
				while (Static9.anInt210 < 20 && Static26.anInt4032 > 0) {
					local65 = (Class5_Sub2_Sub26) Static18.aClass75_2.method2067();
					local70 = new Class5_Sub6(4);
					local70.method3061(1);
					local70.method3058((int) local65.aLong253);
					Static146.aClass39_2.method1176(4, local70.aByteArray56);
					Static86.aClass75_9.method2069(local65, local65.aLong253);
					Static9.anInt210++;
					Static26.anInt4032--;
				}
				while (Static201.anInt1746 < 20 && Static129.anInt2691 > 0) {
					local65 = (Class5_Sub2_Sub26) Static217.aClass32_2.method921();
					local70 = new Class5_Sub6(4);
					local70.method3061(0);
					local70.method3058((int) local65.aLong253);
					Static146.aClass39_2.method1176(4, local70.aByteArray56);
					local65.method3014();
					Static178.aClass75_14.method2069(local65, local65.aLong253);
					Static129.anInt2691--;
					Static201.anInt1746++;
				}
				for (@Pc(164) int local164 = 0; local164 < 100; local164++) {
					@Pc(170) int local170 = Static146.aClass39_2.method1172();
					if (local170 < 0) {
						throw new IOException();
					}
					if (local170 == 0) {
						break;
					}
					Static119.anInt2509 = 0;
					@Pc(185) byte local185 = 0;
					if (Static3.aClass5_Sub2_Sub26_1 == null) {
						local185 = 8;
					} else if (Static101.anInt2162 == 0) {
						local185 = 1;
					}
					@Pc(205) int local205;
					@Pc(210) int local210;
					@Pc(243) int local243;
					@Pc(318) int local318;
					if (local185 <= 0) {
						local205 = Static52.aClass5_Sub6_1.aByteArray56.length - Static3.aClass5_Sub2_Sub26_1.aByte14;
						local210 = 512 - Static101.anInt2162;
						if (local205 - Static52.aClass5_Sub6_1.anInt4050 < local210) {
							local210 = local205 - Static52.aClass5_Sub6_1.anInt4050;
						}
						if (local210 > local170) {
							local210 = local170;
						}
						Static146.aClass39_2.method1173(local210, Static52.aClass5_Sub6_1.anInt4050, Static52.aClass5_Sub6_1.aByteArray56);
						if (Static189.aByte12 != 0) {
							for (local243 = 0; local243 < local210; local243++) {
								Static52.aClass5_Sub6_1.aByteArray56[Static52.aClass5_Sub6_1.anInt4050 + local243] = (byte) (Static52.aClass5_Sub6_1.aByteArray56[Static52.aClass5_Sub6_1.anInt4050 + local243] ^ Static189.aByte12);
							}
						}
						Static52.aClass5_Sub6_1.anInt4050 += local210;
						Static101.anInt2162 += local210;
						if (local205 == Static52.aClass5_Sub6_1.anInt4050) {
							if (Static3.aClass5_Sub2_Sub26_1.aLong253 == 16711935L) {
								Static177.aClass5_Sub6_4 = Static52.aClass5_Sub6_1;
								for (local243 = 0; local243 < 256; local243++) {
									@Pc(305) Class23_Sub1 local305 = Static105.aClass23_Sub1Array1[local243];
									if (local305 != null) {
										Static177.aClass5_Sub6_4.anInt4050 = local243 * 8 + 5;
										local318 = Static177.aClass5_Sub6_4.method3073();
										@Pc(322) int local322 = Static177.aClass5_Sub6_4.method3073();
										local305.method760(local322, local318);
									}
								}
							} else {
								Static109.aCRC32_1.reset();
								Static109.aCRC32_1.update(Static52.aClass5_Sub6_1.aByteArray56, 0, local205);
								local243 = (int) Static109.aCRC32_1.getValue();
								if (local243 != Static3.aClass5_Sub2_Sub26_1.anInt3985) {
									try {
										Static146.aClass39_2.method1175();
									} catch (@Pc(356) Exception local356) {
									}
									Static146.aClass39_2 = null;
									Static189.aByte12 = (byte) (Math.random() * 255.0D + 1.0D);
									Static146.anInt3022++;
									return false;
								}
								Static103.anInt2175 = 0;
								Static146.anInt3022 = 0;
								Static3.aClass5_Sub2_Sub26_1.aClass23_Sub1_27.method764((Static3.aClass5_Sub2_Sub26_1.aLong253 & 0xFF0000L) == 16711680L, (int) (Static3.aClass5_Sub2_Sub26_1.aLong253 & 0xFFFFL), Static29.aBoolean36, Static52.aClass5_Sub6_1.aByteArray56);
							}
							Static3.aClass5_Sub2_Sub26_1.method3207();
							if (Static29.aBoolean36) {
								Static9.anInt210--;
							} else {
								Static201.anInt1746--;
							}
							Static3.aClass5_Sub2_Sub26_1 = null;
							Static101.anInt2162 = 0;
							Static52.aClass5_Sub6_1 = null;
						} else {
							if (Static101.anInt2162 != 512) {
								break;
							}
							Static101.anInt2162 = 0;
						}
					} else {
						local205 = local185 - Static144.aClass5_Sub6_2.anInt4050;
						if (local205 > local170) {
							local205 = local170;
						}
						Static146.aClass39_2.method1173(local205, Static144.aClass5_Sub6_2.anInt4050, Static144.aClass5_Sub6_2.aByteArray56);
						if (Static189.aByte12 != 0) {
							for (local210 = 0; local210 < local205; local210++) {
								Static144.aClass5_Sub6_2.aByteArray56[Static144.aClass5_Sub6_2.anInt4050 + local210] ^= Static189.aByte12;
							}
						}
						Static144.aClass5_Sub6_2.anInt4050 += local205;
						if (local185 > Static144.aClass5_Sub6_2.anInt4050) {
							break;
						}
						if (Static3.aClass5_Sub2_Sub26_1 == null) {
							Static144.aClass5_Sub6_2.anInt4050 = 0;
							local210 = Static144.aClass5_Sub6_2.method3062();
							local243 = Static144.aClass5_Sub6_2.method3077();
							@Pc(508) int local508 = Static144.aClass5_Sub6_2.method3062();
							@Pc(515) long local515 = (long) ((local210 << 16) + local243);
							local318 = Static144.aClass5_Sub6_2.method3073();
							@Pc(525) Class5_Sub2_Sub26 local525 = (Class5_Sub2_Sub26) Static86.aClass75_9.method2072(local515);
							Static29.aBoolean36 = true;
							if (local525 == null) {
								local525 = (Class5_Sub2_Sub26) Static178.aClass75_14.method2072(local515);
								Static29.aBoolean36 = false;
							}
							if (local525 == null) {
								throw new IOException();
							}
							Static3.aClass5_Sub2_Sub26_1 = local525;
							@Pc(551) int local551 = local508 == 0 ? 5 : 9;
							Static52.aClass5_Sub6_1 = new Class5_Sub6(local318 + local551 + Static3.aClass5_Sub2_Sub26_1.aByte14);
							Static52.aClass5_Sub6_1.method3061(local508);
							Static52.aClass5_Sub6_1.method3030(local318);
							Static101.anInt2162 = 8;
							Static144.aClass5_Sub6_2.anInt4050 = 0;
						} else if (Static101.anInt2162 == 0) {
							if (Static144.aClass5_Sub6_2.aByteArray56[0] == -1) {
								Static101.anInt2162 = 1;
								Static144.aClass5_Sub6_2.anInt4050 = 0;
							} else {
								Static3.aClass5_Sub2_Sub26_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(606) IOException local606) {
				try {
					Static146.aClass39_2.method1175();
				} catch (@Pc(611) Exception local611) {
				}
				Static146.aClass39_2 = null;
				Static103.anInt2175++;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Lclient!oh;")
	public static Class5_Sub2_Sub15 method2575(@OriginalArg(0) int arg0) {
		@Pc(12) Class5_Sub2_Sub15 local12 = (Class5_Sub2_Sub15) Static191.aClass8_35.method227((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(32) byte[] local32;
		if (arg0 < 32768) {
			local32 = Static87.aClass23_49.method738(arg0, 0);
		} else {
			local32 = Static217.aClass23_79.method738(arg0 & 0x7FFF, 0);
		}
		local12 = new Class5_Sub2_Sub15();
		if (local32 != null) {
			local12.method2175(new Class5_Sub6(local32));
		}
		Static191.aClass8_35.method232((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)Lclient!dc;")
	public static Class20 method2576(@OriginalArg(0) int arg0) {
		return Static193.aClass20Array31[arg0].method582() <= 0 ? Static203.aClass20Array32[arg0] : Static70.method1166(new Class20[] { Static203.aClass20Array32[arg0], Static28.aClass20_210, Static193.aClass20Array31[arg0] });
	}
}
