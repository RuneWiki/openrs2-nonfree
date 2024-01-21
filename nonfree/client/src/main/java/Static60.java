import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "Lclient!v;")
	public static Class66 aClass66_1;

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "Lclient!oc;")
	public static Class34 aClass34_48;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
	public static int anInt1806 = 0;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!gd;")
	private static Class23 aClass23_985 = Static15.method178("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "Lclient!gd;")
	private static Class23 aClass23_990 = Static15.method178(" has logged out)3");

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Lclient!gd;")
	public static Class23 aClass23_986 = aClass23_990;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "[I")
	public static int[] anIntArray207 = new int[4000];

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "Lclient!gd;")
	private static Class23 aClass23_996 = Static15.method178("System update in: ");

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!gd;")
	public static Class23 aClass23_987 = aClass23_996;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "Lclient!gd;")
	public static Class23 aClass23_988 = aClass23_985;

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "Lclient!gd;")
	private static Class23 aClass23_993 = Static15.method178("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!gd;")
	public static Class23 aClass23_989 = aClass23_993;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "[I")
	public static int[] anIntArray208 = new int[128];

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "Lclient!gd;")
	public static Class23 aClass23_991 = Static15.method178("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!gd;")
	public static Class23 aClass23_992 = Static15.method178("backleft1");

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "Lclient!gd;")
	private static Class23 aClass23_994 = Static15.method178("Enter name of player to add to list");

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
	public static int anInt1813 = 0;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "Lclient!gd;")
	public static Class23 aClass23_995 = Static15.method178("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "Lclient!gd;")
	public static Class23 aClass23_997 = aClass23_994;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public static void method1125() {
		if (Static9.aBoolean7 && Static61.anInt1894 != Static79.anInt2137) {
			Static8.method101(Static79.anInt2137, Static110.anInt2867, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], Static104.anInt2681);
		} else if (Static79.anInt2137 != Static105.anInt2698) {
			Static105.anInt2698 = Static79.anInt2137;
			Static45.method952(Static79.anInt2137);
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
	public static void method1126() {
		aClass23_988 = null;
		aClass23_996 = null;
		aClass23_992 = null;
		aClass23_990 = null;
		aClass23_985 = null;
		aClass23_989 = null;
		aClass23_995 = null;
		aClass23_987 = null;
		aClass23_993 = null;
		anIntArray207 = null;
		aClass23_986 = null;
		anIntArray208 = null;
		aClass23_991 = null;
		aClass23_994 = null;
		aClass23_997 = null;
		aClass34_48 = null;
		aClass66_1 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!rc;Lclient!gd;)I")
	public static int method1127(@OriginalArg(1) Class1_Sub5 arg0, @OriginalArg(2) Class23 arg1) {
		@Pc(6) int local6 = arg0.anInt1266;
		arg0.method687(arg1.anInt965);
		arg0.anInt1266 += aClass66_1.method1787(arg1.anInt965, arg1.aByteArray4, 0, arg0.aByteArray6, arg0.anInt1266);
		return arg0.anInt1266 - local6;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
	public static void method1128() {
		try {
			@Pc(7) Graphics local7 = Static26.aCanvas1.getGraphics();
			aClass34_48.method1144(4, local7, 4);
		} catch (@Pc(15) Exception local15) {
			Static26.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)Z")
	public static boolean method1129() {
		@Pc(8) long local8 = Static82.method1454();
		@Pc(14) int local14 = (int) (local8 - Static48.aLong41);
		Static48.aLong41 = local8;
		if (local14 > 200) {
			local14 = 200;
		}
		Static17.anInt428 += local14;
		if (Static42.anInt1444 == 0 && Static94.anInt2484 == 0 && Static88.anInt1218 == 0 && Static52.anInt1630 == 0) {
			return true;
		} else if (Static13.aClass68_1 == null) {
			return false;
		} else {
			try {
				if (Static17.anInt428 > 30000) {
					throw new IOException();
				}
				@Pc(67) Class1_Sub1_Sub11 local67;
				@Pc(72) Class1_Sub5 local72;
				while (Static94.anInt2484 < 20 && Static52.anInt1630 > 0) {
					local67 = (Class1_Sub1_Sub11) Static29.aClass14_4.method340();
					local72 = new Class1_Sub5(4);
					local72.method674(1);
					local72.method680((int) local67.aLong85);
					Static13.aClass68_1.method1942(local72.aByteArray6, 4);
					Static31.aClass14_6.method345(local67, local67.aLong85);
					Static94.anInt2484++;
					Static52.anInt1630--;
				}
				while (Static42.anInt1444 < 20 && Static88.anInt1218 > 0) {
					local67 = (Class1_Sub1_Sub11) Static75.aClass38_2.method1208();
					local72 = new Class1_Sub5(4);
					local72.method674(0);
					local72.method680((int) local67.aLong85);
					Static13.aClass68_1.method1942(local72.aByteArray6, 4);
					local67.method1855();
					Static29.aClass14_5.method345(local67, local67.aLong85);
					Static42.anInt1444++;
					Static88.anInt1218--;
				}
				for (@Pc(175) int local175 = 0; local175 < 100; local175++) {
					@Pc(181) int local181 = Static13.aClass68_1.method1941();
					if (local181 < 0) {
						throw new IOException();
					}
					if (local181 == 0) {
						break;
					}
					@Pc(194) byte local194 = 0;
					Static17.anInt428 = 0;
					if (Static105.aClass1_Sub1_Sub11_1 == null) {
						local194 = 8;
					} else if (Static7.anInt178 == 0) {
						local194 = 1;
					}
					@Pc(220) int local220;
					@Pc(241) int local241;
					@Pc(291) int local291;
					@Pc(299) int local299;
					if (local194 > 0) {
						local220 = local194 - Static96.aClass1_Sub5_9.anInt1266;
						if (local220 > local181) {
							local220 = local181;
						}
						Static13.aClass68_1.method1937(Static96.aClass1_Sub5_9.aByteArray6, local220, Static96.aClass1_Sub5_9.anInt1266);
						if (Static105.aByte2 != 0) {
							for (local241 = 0; local241 < local220; local241++) {
								Static96.aClass1_Sub5_9.aByteArray6[Static96.aClass1_Sub5_9.anInt1266 + local241] ^= Static105.aByte2;
							}
						}
						Static96.aClass1_Sub5_9.anInt1266 += local220;
						if (Static96.aClass1_Sub5_9.anInt1266 < local194) {
							break;
						}
						if (Static105.aClass1_Sub1_Sub11_1 == null) {
							Static96.aClass1_Sub5_9.anInt1266 = 0;
							local241 = Static96.aClass1_Sub5_9.method716();
							local291 = Static96.aClass1_Sub5_9.method715();
							@Pc(295) int local295 = Static96.aClass1_Sub5_9.method716();
							local299 = Static96.aClass1_Sub5_9.method692();
							@Pc(306) long local306 = (long) ((local241 << 16) + local291);
							@Pc(312) Class1_Sub1_Sub11 local312 = (Class1_Sub1_Sub11) Static31.aClass14_6.method343(local306);
							Static63.aBoolean95 = true;
							if (local312 == null) {
								local312 = (Class1_Sub1_Sub11) Static29.aClass14_5.method343(local306);
								Static63.aBoolean95 = false;
							}
							if (local312 == null) {
								throw new IOException();
							}
							Static105.aClass1_Sub1_Sub11_1 = local312;
							@Pc(341) int local341 = local295 == 0 ? 5 : 9;
							Static34.aClass1_Sub5_4 = new Class1_Sub5(local341 + local299 + Static105.aClass1_Sub1_Sub11_1.aByte1);
							Static34.aClass1_Sub5_4.method674(local295);
							Static34.aClass1_Sub5_4.method679(local299);
							Static7.anInt178 = 8;
							Static96.aClass1_Sub5_9.anInt1266 = 0;
						} else if (Static7.anInt178 == 0) {
							if (Static96.aClass1_Sub5_9.aByteArray6[0] == -1) {
								Static96.aClass1_Sub5_9.anInt1266 = 0;
								Static7.anInt178 = 1;
							} else {
								Static105.aClass1_Sub1_Sub11_1 = null;
							}
						}
					} else {
						local241 = 512 - Static7.anInt178;
						local220 = Static34.aClass1_Sub5_4.aByteArray6.length - Static105.aClass1_Sub1_Sub11_1.aByte1;
						if (local220 - Static34.aClass1_Sub5_4.anInt1266 < local241) {
							local241 = local220 - Static34.aClass1_Sub5_4.anInt1266;
						}
						if (local241 > local181) {
							local241 = local181;
						}
						Static13.aClass68_1.method1937(Static34.aClass1_Sub5_4.aByteArray6, local241, Static34.aClass1_Sub5_4.anInt1266);
						if (Static105.aByte2 != 0) {
							for (local291 = 0; local291 < local241; local291++) {
								Static34.aClass1_Sub5_4.aByteArray6[Static34.aClass1_Sub5_4.anInt1266 + local291] ^= Static105.aByte2;
							}
						}
						Static7.anInt178 += local241;
						Static34.aClass1_Sub5_4.anInt1266 += local241;
						if (Static34.aClass1_Sub5_4.anInt1266 == local220) {
							if (Static105.aClass1_Sub1_Sub11_1.aLong85 == 16711935L) {
								Static25.aClass1_Sub5_3 = Static34.aClass1_Sub5_4;
								for (local291 = 0; local291 < 256; local291++) {
									@Pc(576) Class55_Sub1 local576 = Static89.aClass55_Sub1Array1[local291];
									if (local576 != null) {
										Static25.aClass1_Sub5_3.anInt1266 = local291 * 4 + 5;
										local299 = Static25.aClass1_Sub5_3.method692();
										local576.method1892(local299);
									}
								}
							} else {
								Static94.aCRC32_1.reset();
								Static94.aCRC32_1.update(Static34.aClass1_Sub5_4.aByteArray6, 0, local220);
								local291 = (int) Static94.aCRC32_1.getValue();
								if (local291 != Static105.aClass1_Sub1_Sub11_1.anInt2003) {
									try {
										Static13.aClass68_1.method1935();
									} catch (@Pc(518) Exception local518) {
									}
									Static13.aClass68_1 = null;
									Static51.anInt1623++;
									Static105.aByte2 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static51.anInt1623 = 0;
								Static95.anInt2504 = 0;
								Static105.aClass1_Sub1_Sub11_1.aClass55_Sub1_13.method1899(Static34.aClass1_Sub5_4.aByteArray6, Static63.aBoolean95, (int) (Static105.aClass1_Sub1_Sub11_1.aLong85 & 0xFFFFL), (Static105.aClass1_Sub1_Sub11_1.aLong85 & 0xFF0000L) == 16711680L);
							}
							Static105.aClass1_Sub1_Sub11_1.method1913();
							Static7.anInt178 = 0;
							Static105.aClass1_Sub1_Sub11_1 = null;
							Static34.aClass1_Sub5_4 = null;
							if (Static63.aBoolean95) {
								Static94.anInt2484--;
							} else {
								Static42.anInt1444--;
							}
						} else {
							if (Static7.anInt178 != 512) {
								break;
							}
							Static7.anInt178 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(629) IOException local629) {
				try {
					Static13.aClass68_1.method1935();
				} catch (@Pc(634) Exception local634) {
				}
				Static13.aClass68_1 = null;
				Static95.anInt2504++;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public static void method1130() {
		@Pc(1) Object local1 = Static62.anObject1;
		synchronized (Static62.anObject1) {
			if (Static12.anInt2429 != 0) {
				Static12.anInt2429 = 1;
				try {
					Static62.anObject1.wait();
				} catch (@Pc(14) InterruptedException local14) {
				}
			}
		}
	}
}
