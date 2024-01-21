import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "[I")
	public static int[] anIntArray92;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "Lclient!pa;")
	public static Class51 aClass51_17;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "[I")
	public static int[] anIntArray94;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
	public static int anInt840 = 0;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Lclient!ke;")
	public static Class39 aClass39_387 = Static2.method66(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "Lclient!ke;")
	private static Class39 aClass39_389 = Static2.method66("Enter message to send to ");

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Lclient!ke;")
	public static Class39 aClass39_388 = aClass39_389;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "[J")
	public static long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "[I")
	public static int[] anIntArray93 = new int[128];

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
	public static int anInt844 = -1;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method571() {
		aLongArray3 = null;
		aClass39_387 = null;
		aClass39_388 = null;
		aClass51_17 = null;
		aClass39_389 = null;
		anIntArray94 = null;
		anIntArray92 = null;
		anIntArray93 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
	public static void method572(@OriginalArg(0) int arg0) {
		if (!Static66.method1376()) {
			return;
		}
		if (Static55.aBoolean84) {
			Static25.anInt694 = arg0;
		} else {
			Static27.method557(arg0);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)Z")
	public static boolean method573() {
		@Pc(12) long local12 = System.currentTimeMillis();
		@Pc(18) int local18 = (int) (local12 - Static48.aLong33);
		Static48.aLong33 = local12;
		if (local18 > 200) {
			local18 = 200;
		}
		Static99.anInt2694 += local18;
		if (Static79.anInt2769 == 0 && Static76.anInt2105 == 0 && Static80.anInt2185 == 0 && Static101.anInt2761 == 0) {
			return true;
		} else if (Static94.aClass10_4 == null) {
			return false;
		} else {
			try {
				if (Static99.anInt2694 > 30000) {
					throw new IOException();
				}
				@Pc(68) Class2_Sub1_Sub14 local68;
				@Pc(73) Class2_Sub5 local73;
				while (Static76.anInt2105 < 20 && Static101.anInt2761 > 0) {
					local68 = (Class2_Sub1_Sub14) Static76.aClass57_2.method1673();
					local73 = new Class2_Sub5(4);
					local73.method1252(1);
					local73.method1246((int) local68.aLong82);
					Static94.aClass10_4.method260(4, local73.aByteArray16);
					Static80.aClass57_3.method1671(local68.aLong82, local68);
					Static76.anInt2105++;
					Static101.anInt2761--;
				}
				while (Static79.anInt2769 < 20 && Static80.anInt2185 > 0) {
					local68 = (Class2_Sub1_Sub14) Static102.aClass28_2.method817();
					local73 = new Class2_Sub5(4);
					local73.method1252(0);
					local73.method1246((int) local68.aLong82);
					Static94.aClass10_4.method260(4, local73.aByteArray16);
					local68.method2053();
					Static97.aClass57_6.method1671(local68.aLong82, local68);
					Static80.anInt2185--;
					Static79.anInt2769++;
				}
				for (@Pc(172) int local172 = 0; local172 < 100; local172++) {
					@Pc(178) int local178 = Static94.aClass10_4.method259();
					if (local178 < 0) {
						throw new IOException();
					}
					if (local178 == 0) {
						break;
					}
					Static99.anInt2694 = 0;
					@Pc(193) byte local193 = 0;
					if (Static96.aClass2_Sub1_Sub14_1 == null) {
						local193 = 8;
					} else if (Static20.anInt580 == 0) {
						local193 = 1;
					}
					@Pc(215) int local215;
					@Pc(220) int local220;
					@Pc(254) int local254;
					@Pc(325) int local325;
					if (local193 <= 0) {
						local215 = Static5.aClass2_Sub5_1.aByteArray16.length - Static96.aClass2_Sub1_Sub14_1.aByte3;
						local220 = 512 - Static20.anInt580;
						if (local220 > local215 - Static5.aClass2_Sub5_1.anInt1772) {
							local220 = local215 - Static5.aClass2_Sub5_1.anInt1772;
						}
						if (local220 > local178) {
							local220 = local178;
						}
						Static94.aClass10_4.method261(Static5.aClass2_Sub5_1.aByteArray16, local220, Static5.aClass2_Sub5_1.anInt1772);
						if (Static5.aByte1 != 0) {
							for (local254 = 0; local254 < local220; local254++) {
								Static5.aClass2_Sub5_1.aByteArray16[local254 + Static5.aClass2_Sub5_1.anInt1772] ^= Static5.aByte1;
							}
						}
						Static20.anInt580 += local220;
						Static5.aClass2_Sub5_1.anInt1772 += local220;
						if (local215 == Static5.aClass2_Sub5_1.anInt1772) {
							if (Static96.aClass2_Sub1_Sub14_1.aLong82 == 16711935L) {
								Static77.aClass2_Sub5_4 = Static5.aClass2_Sub5_1;
								for (local254 = 0; local254 < 256; local254++) {
									@Pc(312) Class36_Sub1 local312 = Static9.aClass36_Sub1Array1[local254];
									if (local312 != null) {
										Static77.aClass2_Sub5_4.anInt1772 = local254 * 4 + 5;
										local325 = Static77.aClass2_Sub5_4.method1276();
										local312.method1783(local325);
									}
								}
							} else {
								Static60.aCRC32_7.reset();
								Static60.aCRC32_7.update(Static5.aClass2_Sub5_1.aByteArray16, 0, local215);
								local254 = (int) Static60.aCRC32_7.getValue();
								if (Static96.aClass2_Sub1_Sub14_1.anInt2382 != local254) {
									try {
										Static94.aClass10_4.method251();
									} catch (@Pc(360) Exception local360) {
									}
									Static5.aByte1 = (byte) (Math.random() * 255.0D + 1.0D);
									Static46.anInt1256++;
									Static94.aClass10_4 = null;
									return false;
								}
								Static47.anInt1325 = 0;
								Static46.anInt1256 = 0;
								Static96.aClass2_Sub1_Sub14_1.aClass36_Sub1_19.method1785(Static5.aClass2_Sub5_1.aByteArray16, (int) (Static96.aClass2_Sub1_Sub14_1.aLong82 & 0xFFFFL), Static88.aBoolean64, (Static96.aClass2_Sub1_Sub14_1.aLong82 & 0xFF0000L) == 16711680L);
							}
							Static96.aClass2_Sub1_Sub14_1.method2045();
							Static20.anInt580 = 0;
							Static5.aClass2_Sub5_1 = null;
							Static96.aClass2_Sub1_Sub14_1 = null;
							if (Static88.aBoolean64) {
								Static76.anInt2105--;
							} else {
								Static79.anInt2769--;
							}
						} else {
							if (Static20.anInt580 != 512) {
								break;
							}
							Static20.anInt580 = 0;
						}
					} else {
						local215 = local193 - Static56.aClass2_Sub5_2.anInt1772;
						if (local178 < local215) {
							local215 = local178;
						}
						Static94.aClass10_4.method261(Static56.aClass2_Sub5_2.aByteArray16, local215, Static56.aClass2_Sub5_2.anInt1772);
						if (Static5.aByte1 != 0) {
							for (local220 = 0; local220 < local215; local220++) {
								Static56.aClass2_Sub5_2.aByteArray16[Static56.aClass2_Sub5_2.anInt1772 + local220] = (byte) (Static56.aClass2_Sub5_2.aByteArray16[Static56.aClass2_Sub5_2.anInt1772 + local220] ^ Static5.aByte1);
							}
						}
						Static56.aClass2_Sub5_2.anInt1772 += local215;
						if (Static56.aClass2_Sub5_2.anInt1772 < local193) {
							break;
						}
						if (Static96.aClass2_Sub1_Sub14_1 == null) {
							Static56.aClass2_Sub5_2.anInt1772 = 0;
							local220 = Static56.aClass2_Sub5_2.method1281();
							local254 = Static56.aClass2_Sub5_2.method1273();
							@Pc(533) int local533 = Static56.aClass2_Sub5_2.method1281();
							local325 = Static56.aClass2_Sub5_2.method1276();
							@Pc(544) long local544 = (long) (local254 + (local220 << 16));
							@Pc(550) Class2_Sub1_Sub14 local550 = (Class2_Sub1_Sub14) Static80.aClass57_3.method1678(local544);
							Static88.aBoolean64 = true;
							if (local550 == null) {
								local550 = (Class2_Sub1_Sub14) Static97.aClass57_6.method1678(local544);
								Static88.aBoolean64 = false;
							}
							if (local550 == null) {
								throw new IOException();
							}
							Static96.aClass2_Sub1_Sub14_1 = local550;
							@Pc(576) int local576 = local533 == 0 ? 5 : 9;
							Static5.aClass2_Sub5_1 = new Class2_Sub5(Static96.aClass2_Sub1_Sub14_1.aByte3 + local325 + local576);
							Static5.aClass2_Sub5_1.method1252(local533);
							Static5.aClass2_Sub5_1.method1298(local325);
							Static20.anInt580 = 8;
							Static56.aClass2_Sub5_2.anInt1772 = 0;
						} else if (Static20.anInt580 == 0) {
							if (Static56.aClass2_Sub5_2.aByteArray16[0] == -1) {
								Static20.anInt580 = 1;
								Static56.aClass2_Sub5_2.anInt1772 = 0;
							} else {
								Static96.aClass2_Sub1_Sub14_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(633) IOException local633) {
				try {
					Static94.aClass10_4.method251();
				} catch (@Pc(638) Exception local638) {
				}
				Static94.aClass10_4 = null;
				Static47.anInt1325++;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public static void method574() {
		@Pc(14) int local14;
		if (Static72.anInt2062 > 0) {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static72.anInt2062 > 768) {
					Static83.anIntArray298[local14] = Static60.method1134(1024 - Static72.anInt2062, Static5.anIntArray14[local14], Static35.anIntArray369[local14]);
				} else if (Static72.anInt2062 > 256) {
					Static83.anIntArray298[local14] = Static5.anIntArray14[local14];
				} else {
					Static83.anIntArray298[local14] = Static60.method1134(256 - Static72.anInt2062, Static35.anIntArray369[local14], Static5.anIntArray14[local14]);
				}
			}
		} else if (Static94.anInt2478 > 0) {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static94.anInt2478 > 768) {
					Static83.anIntArray298[local14] = Static60.method1134(1024 - Static94.anInt2478, Static108.anIntArray370[local14], Static35.anIntArray369[local14]);
				} else if (Static94.anInt2478 <= 256) {
					Static83.anIntArray298[local14] = Static60.method1134(256 - Static94.anInt2478, Static35.anIntArray369[local14], Static108.anIntArray370[local14]);
				} else {
					Static83.anIntArray298[local14] = Static108.anIntArray370[local14];
				}
			}
		} else {
			for (local14 = 0; local14 < 256; local14++) {
				Static83.anIntArray298[local14] = Static35.anIntArray369[local14];
			}
		}
		for (local14 = 0; local14 < 33920; local14++) {
			Static35.aClass51_62.anIntArray334[local14] = Static72.aClass2_Sub1_Sub4_Sub2_5.anIntArray209[local14];
		}
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 1152;
		@Pc(187) int local187;
		@Pc(192) int local192;
		@Pc(205) int local205;
		@Pc(212) int local212;
		@Pc(219) int local219;
		@Pc(224) int local224;
		@Pc(233) int local233;
		for (@Pc(174) int local174 = 1; local174 < 255; local174++) {
			local187 = Static75.anIntArray53[local174] * (256 - local174) / 256;
			local192 = local187 + 22;
			if (local192 < 0) {
				local192 = 0;
			}
			local170 += local192;
			for (local205 = local192; local205 < 128; local205++) {
				local212 = Static71.anIntArray254[local170++];
				if (local212 == 0) {
					local172++;
				} else {
					local219 = local212;
					local224 = 256 - local212;
					local212 = Static83.anIntArray298[local212];
					local233 = Static35.aClass51_62.anIntArray334[local172];
					Static35.aClass51_62.anIntArray334[local172++] = ((local212 & 0xFF00) * local219 + local224 * (local233 & 0xFF00) & 0xFF0000) + (local224 * (local233 & 0xFF00FF) + local219 * (local212 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local172 += local192;
		}
		local172 = 1176;
		local170 = 0;
		for (local187 = 0; local187 < 33920; local187++) {
			Static48.aClass51_28.anIntArray334[local187] = Static26.aClass2_Sub1_Sub4_Sub2_2.anIntArray209[local187];
		}
		for (local192 = 1; local192 < 255; local192++) {
			local205 = Static75.anIntArray53[local192] * (256 - local192) / 256;
			local172 += local205;
			local212 = 103 - local205;
			for (local219 = 0; local219 < local212; local219++) {
				local224 = Static71.anIntArray254[local170++];
				if (local224 == 0) {
					local172++;
				} else {
					local233 = local224;
					@Pc(346) int local346 = 256 - local224;
					local224 = Static83.anIntArray298[local224];
					@Pc(355) int local355 = Static48.aClass51_28.anIntArray334[local172];
					Static48.aClass51_28.anIntArray334[local172++] = (local233 * (local224 & 0xFF00) + local346 * (local355 & 0xFF00) & 0xFF0000) + (local346 * (local355 & 0xFF00FF) + local233 * (local224 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local170 += 128 - local212;
			local172 += 128 - local212 - local205;
		}
	}
}
