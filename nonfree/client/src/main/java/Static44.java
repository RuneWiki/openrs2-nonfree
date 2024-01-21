import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!h", name = "G", descriptor = "Z")
	private static boolean aBoolean75;

	@OriginalMember(owner = "client!h", name = "I", descriptor = "I")
	public static int anInt2165;

	@OriginalMember(owner = "client!h", name = "R", descriptor = "Lclient!dd;")
	public static Class16 aClass16_13;

	@OriginalMember(owner = "client!h", name = "K", descriptor = "I")
	public static int anInt2167 = 0;

	@OriginalMember(owner = "client!h", name = "L", descriptor = "Lclient!od;")
	public static Class60 aClass60_892 = Static41.method597("huffman");

	@OriginalMember(owner = "client!h", name = "S", descriptor = "Lclient!od;")
	private static Class60 aClass60_895 = Static41.method597("level)2");

	@OriginalMember(owner = "client!h", name = "N", descriptor = "Lclient!od;")
	public static Class60 aClass60_893 = aClass60_895;

	@OriginalMember(owner = "client!h", name = "Q", descriptor = "Lclient!od;")
	public static Class60 aClass60_894 = Static41.method597("p11_full");

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
	public static void method1483() {
		aClass60_892 = null;
		aClass60_895 = null;
		aClass60_893 = null;
		aClass60_894 = null;
		aClass16_13 = null;
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)Z")
	public static boolean method1486() {
		@Pc(4) long local4 = Static8.method75();
		@Pc(14) int local14 = (int) (local4 - Static56.aLong49);
		if (local14 > 200) {
			local14 = 200;
		}
		Static76.anInt1844 += local14;
		Static56.aLong49 = local4;
		if (Static99.anInt592 == 0 && Static70.anInt1739 == 0 && Static32.anInt942 == 0 && Static91.anInt2146 == 0) {
			return true;
		} else if (Static11.aClass37_2 == null) {
			return false;
		} else {
			try {
				if (Static76.anInt1844 > 30000) {
					throw new IOException();
				}
				@Pc(56) Class4_Sub3_Sub9 local56;
				@Pc(61) Class4_Sub9 local61;
				while (Static70.anInt1739 < 20 && Static91.anInt2146 > 0) {
					local56 = (Class4_Sub3_Sub9) Static41.aClass75_6.method1897();
					local61 = new Class4_Sub9(4);
					local61.method819(1);
					local61.method799((int) local56.aLong100);
					Static11.aClass37_2.method875(4, local61.aByteArray6);
					Static132.aClass75_15.method1892(local56.aLong100, local56);
					Static91.anInt2146--;
					Static70.anInt1739++;
				}
				while (Static99.anInt592 < 20 && Static32.anInt942 > 0) {
					local56 = (Class4_Sub3_Sub9) Static56.aClass59_2.method1285();
					local61 = new Class4_Sub9(4);
					local61.method819(0);
					local61.method799((int) local56.aLong100);
					Static11.aClass37_2.method875(4, local61.aByteArray6);
					local56.method1996();
					Static26.aClass75_5.method1892(local56.aLong100, local56);
					Static99.anInt592++;
					Static32.anInt942--;
				}
				for (@Pc(158) int local158 = 0; local158 < 100; local158++) {
					@Pc(164) int local164 = Static11.aClass37_2.method876();
					if (local164 < 0) {
						throw new IOException();
					}
					if (local164 == 0) {
						break;
					}
					Static76.anInt1844 = 0;
					@Pc(179) byte local179 = 0;
					if (Static36.aClass4_Sub3_Sub9_1 == null) {
						local179 = 8;
					} else if (Static102.anInt2402 == 0) {
						local179 = 1;
					}
					@Pc(201) int local201;
					@Pc(205) int local205;
					@Pc(237) int local237;
					@Pc(386) int local386;
					if (local179 <= 0) {
						local201 = Static117.aClass4_Sub9_5.aByteArray6.length - Static36.aClass4_Sub3_Sub9_1.aByte6;
						local205 = 512 - Static102.anInt2402;
						if (local201 - Static117.aClass4_Sub9_5.anInt1312 < local205) {
							local205 = local201 - Static117.aClass4_Sub9_5.anInt1312;
						}
						if (local205 > local164) {
							local205 = local164;
						}
						Static11.aClass37_2.method873(local205, Static117.aClass4_Sub9_5.anInt1312, Static117.aClass4_Sub9_5.aByteArray6);
						if (Static7.aByte1 != 0) {
							for (local237 = 0; local237 < local205; local237++) {
								Static117.aClass4_Sub9_5.aByteArray6[local237 + Static117.aClass4_Sub9_5.anInt1312] ^= Static7.aByte1;
							}
						}
						Static102.anInt2402 += local205;
						Static117.aClass4_Sub9_5.anInt1312 += local205;
						if (Static117.aClass4_Sub9_5.anInt1312 == local201) {
							if (Static36.aClass4_Sub3_Sub9_1.aLong100 == 16711935L) {
								Static9.aClass4_Sub9_2 = Static117.aClass4_Sub9_5;
								for (local237 = 0; local237 < 256; local237++) {
									@Pc(373) Class10_Sub1 local373 = Static71.aClass10_Sub1Array1[local237];
									if (local373 != null) {
										Static9.aClass4_Sub9_2.anInt1312 = local237 * 8 + 5;
										local386 = Static9.aClass4_Sub9_2.method780();
										@Pc(390) int local390 = Static9.aClass4_Sub9_2.method780();
										local373.method1797(local386, local390);
									}
								}
							} else {
								Static79.aCRC32_1.reset();
								Static79.aCRC32_1.update(Static117.aClass4_Sub9_5.aByteArray6, 0, local201);
								local237 = (int) Static79.aCRC32_1.getValue();
								if (local237 != Static36.aClass4_Sub3_Sub9_1.anInt1741) {
									try {
										Static11.aClass37_2.method877();
									} catch (@Pc(319) Exception local319) {
									}
									Static7.aByte1 = (byte) (Math.random() * 255.0D + 1.0D);
									Static11.aClass37_2 = null;
									Static39.anInt1049++;
									return false;
								}
								Static5.anInt65 = 0;
								Static39.anInt1049 = 0;
								Static36.aClass4_Sub3_Sub9_1.aClass10_Sub1_13.method1794(Static117.aClass4_Sub9_5.aByteArray6, (Static36.aClass4_Sub3_Sub9_1.aLong100 & 0xFF0000L) == 16711680L, aBoolean75, (int) (Static36.aClass4_Sub3_Sub9_1.aLong100 & 0xFFFFL));
							}
							Static36.aClass4_Sub3_Sub9_1.method1989();
							if (aBoolean75) {
								Static70.anInt1739--;
							} else {
								Static99.anInt592--;
							}
							Static36.aClass4_Sub3_Sub9_1 = null;
							Static117.aClass4_Sub9_5 = null;
							Static102.anInt2402 = 0;
						} else {
							if (Static102.anInt2402 != 512) {
								break;
							}
							Static102.anInt2402 = 0;
						}
					} else {
						local201 = local179 - Static3.aClass4_Sub9_1.anInt1312;
						if (local201 > local164) {
							local201 = local164;
						}
						Static11.aClass37_2.method873(local201, Static3.aClass4_Sub9_1.anInt1312, Static3.aClass4_Sub9_1.aByteArray6);
						if (Static7.aByte1 != 0) {
							for (local205 = 0; local205 < local201; local205++) {
								Static3.aClass4_Sub9_1.aByteArray6[local205 + Static3.aClass4_Sub9_1.anInt1312] ^= Static7.aByte1;
							}
						}
						Static3.aClass4_Sub9_1.anInt1312 += local201;
						if (local179 > Static3.aClass4_Sub9_1.anInt1312) {
							break;
						}
						if (Static36.aClass4_Sub3_Sub9_1 == null) {
							Static3.aClass4_Sub9_1.anInt1312 = 0;
							local205 = Static3.aClass4_Sub9_1.method773();
							local237 = Static3.aClass4_Sub9_1.method816();
							@Pc(512) long local512 = (long) (local237 + (local205 << 16));
							@Pc(516) int local516 = Static3.aClass4_Sub9_1.method773();
							local386 = Static3.aClass4_Sub9_1.method780();
							@Pc(526) Class4_Sub3_Sub9 local526 = (Class4_Sub3_Sub9) Static132.aClass75_15.method1896(local512);
							aBoolean75 = true;
							if (local526 == null) {
								local526 = (Class4_Sub3_Sub9) Static26.aClass75_5.method1896(local512);
								aBoolean75 = false;
							}
							if (local526 == null) {
								throw new IOException();
							}
							Static36.aClass4_Sub3_Sub9_1 = local526;
							@Pc(555) int local555 = local516 == 0 ? 5 : 9;
							Static117.aClass4_Sub9_5 = new Class4_Sub9(Static36.aClass4_Sub3_Sub9_1.aByte6 + local386 + local555);
							Static117.aClass4_Sub9_5.method819(local516);
							Static117.aClass4_Sub9_5.method808(local386);
							Static102.anInt2402 = 8;
							Static3.aClass4_Sub9_1.anInt1312 = 0;
						} else if (Static102.anInt2402 == 0) {
							if (Static3.aClass4_Sub9_1.aByteArray6[0] == -1) {
								Static102.anInt2402 = 1;
								Static3.aClass4_Sub9_1.anInt1312 = 0;
							} else {
								Static36.aClass4_Sub3_Sub9_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(613) IOException local613) {
				try {
					Static11.aClass37_2.method877();
				} catch (@Pc(618) Exception local618) {
				}
				Static11.aClass37_2 = null;
				Static5.anInt65++;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "(I)V")
	public static void method1487() {
		if (Static113.aClass11_2 != null) {
			Static113.aClass11_2.method1846();
		}
		if (Static85.aClass11_3 != null) {
			Static85.aClass11_3.method1846();
		}
	}

	@OriginalMember(owner = "client!h", name = "i", descriptor = "(I)V")
	public static void method1488() {
		Static11.aClass12_3.method284();
		Static96.aClass12_22.method284();
		Static125.aClass12_27.method284();
	}
}
