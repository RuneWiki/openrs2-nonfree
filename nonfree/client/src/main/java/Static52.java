import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!je", name = "f", descriptor = "I")
	public static int anInt1378;

	@OriginalMember(owner = "client!je", name = "t", descriptor = "Z")
	public static boolean aBoolean66;

	@OriginalMember(owner = "client!je", name = "u", descriptor = "Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_6;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!ae;")
	private static Class5 aClass5_678 = Static56.method972("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!ae;")
	public static Class5 aClass5_677 = aClass5_678;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Lclient!ae;")
	public static Class5 aClass5_679 = Static56.method972("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!ae;")
	private static Class5 aClass5_680 = Static56.method972("Checking for updates )2 ");

	@OriginalMember(owner = "client!je", name = "j", descriptor = "[I")
	public static int[] anIntArray162 = new int[500];

	@OriginalMember(owner = "client!je", name = "s", descriptor = "Lclient!ae;")
	private static Class5 aClass5_685 = Static56.method972("Loading game screen )2 ");

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Lclient!ae;")
	public static Class5 aClass5_681 = aClass5_685;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Lclient!ae;")
	public static Class5 aClass5_682 = aClass5_680;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "Lclient!ae;")
	private static Class5 aClass5_684 = Static56.method972("Friends");

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Lclient!ae;")
	public static Class5 aClass5_683 = aClass5_684;

	@OriginalMember(owner = "client!je", name = "r", descriptor = "J")
	public static long aLong47 = 0L;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Z")
	public static boolean method914() {
		@Pc(10) long local10 = Static3.method125();
		@Pc(16) int local16 = (int) (local10 - Static99.aLong73);
		Static99.aLong73 = local10;
		if (local16 > 200) {
			local16 = 200;
		}
		Static61.anInt1650 += local16;
		if (Static72.anInt1862 == 0 && Static1.anInt2 == 0 && Static62.anInt1664 == 0 && Static44.anInt1250 == 0) {
			return true;
		} else if (Static82.aClass18_2 == null) {
			return false;
		} else {
			try {
				if (Static61.anInt1650 > 30000) {
					throw new IOException();
				}
				@Pc(69) Class3_Sub1_Sub5 local69;
				@Pc(74) Class3_Sub6 local74;
				while (Static1.anInt2 < 20 && Static44.anInt1250 > 0) {
					local69 = (Class3_Sub1_Sub5) Static35.aClass21_6.method453();
					local74 = new Class3_Sub6(4);
					local74.method1608(1);
					local74.method1609((int) local69.aLong85);
					Static82.aClass18_2.method409(local74.aByteArray17, 4);
					Static7.aClass21_1.method452(local69.aLong85, local69);
					Static44.anInt1250--;
					Static1.anInt2++;
				}
				while (Static72.anInt1862 < 20 && Static62.anInt1664 > 0) {
					local69 = (Class3_Sub1_Sub5) Static48.aClass56_2.method1538();
					local74 = new Class3_Sub6(4);
					local74.method1608(0);
					local74.method1609((int) local69.aLong85);
					Static82.aClass18_2.method409(local74.aByteArray17, 4);
					local69.method1931();
					Static23.aClass21_5.method452(local69.aLong85, local69);
					Static62.anInt1664--;
					Static72.anInt1862++;
				}
				for (@Pc(165) int local165 = 0; local165 < 100; local165++) {
					@Pc(178) int local178 = Static82.aClass18_2.method408();
					if (local178 < 0) {
						throw new IOException();
					}
					if (local178 == 0) {
						break;
					}
					Static61.anInt1650 = 0;
					@Pc(193) byte local193 = 0;
					if (Static108.aClass3_Sub1_Sub5_1 == null) {
						local193 = 8;
					} else if (Static45.anInt1270 == 0) {
						local193 = 1;
					}
					@Pc(214) int local214;
					@Pc(234) int local234;
					@Pc(285) int local285;
					@Pc(300) int local300;
					if (local193 > 0) {
						local214 = local193 - Static94.aClass3_Sub6_3.anInt2416;
						if (local214 > local178) {
							local214 = local178;
						}
						Static82.aClass18_2.method404(local214, Static94.aClass3_Sub6_3.aByteArray17, Static94.aClass3_Sub6_3.anInt2416);
						if (Static94.aByte2 != 0) {
							for (local234 = 0; local234 < local214; local234++) {
								Static94.aClass3_Sub6_3.aByteArray17[Static94.aClass3_Sub6_3.anInt2416 + local234] = (byte) (Static94.aClass3_Sub6_3.aByteArray17[Static94.aClass3_Sub6_3.anInt2416 + local234] ^ Static94.aByte2);
							}
						}
						Static94.aClass3_Sub6_3.anInt2416 += local214;
						if (local193 > Static94.aClass3_Sub6_3.anInt2416) {
							break;
						}
						if (Static108.aClass3_Sub1_Sub5_1 == null) {
							Static94.aClass3_Sub6_3.anInt2416 = 0;
							local234 = Static94.aClass3_Sub6_3.method1587();
							local285 = Static94.aClass3_Sub6_3.method1603();
							@Pc(289) int local289 = Static94.aClass3_Sub6_3.method1587();
							@Pc(296) long local296 = (long) (local285 + (local234 << 16));
							local300 = Static94.aClass3_Sub6_3.method1614();
							@Pc(306) Class3_Sub1_Sub5 local306 = (Class3_Sub1_Sub5) Static7.aClass21_1.method459(local296);
							Static62.aBoolean78 = true;
							if (local306 == null) {
								local306 = (Class3_Sub1_Sub5) Static23.aClass21_5.method459(local296);
								Static62.aBoolean78 = false;
							}
							if (local306 == null) {
								throw new IOException();
							}
							Static108.aClass3_Sub1_Sub5_1 = local306;
							@Pc(335) int local335 = local289 == 0 ? 5 : 9;
							Static64.aClass3_Sub6_5 = new Class3_Sub6(local335 + local300 + Static108.aClass3_Sub1_Sub5_1.aByte3);
							Static64.aClass3_Sub6_5.method1608(local289);
							Static64.aClass3_Sub6_5.method1611(local300);
							Static45.anInt1270 = 8;
							Static94.aClass3_Sub6_3.anInt2416 = 0;
						} else if (Static45.anInt1270 == 0) {
							if (Static94.aClass3_Sub6_3.aByteArray17[0] == -1) {
								Static94.aClass3_Sub6_3.anInt2416 = 0;
								Static45.anInt1270 = 1;
							} else {
								Static108.aClass3_Sub1_Sub5_1 = null;
							}
						}
					} else {
						local214 = Static64.aClass3_Sub6_5.aByteArray17.length - Static108.aClass3_Sub1_Sub5_1.aByte3;
						local234 = 512 - Static45.anInt1270;
						if (local214 - Static64.aClass3_Sub6_5.anInt2416 < local234) {
							local234 = local214 - Static64.aClass3_Sub6_5.anInt2416;
						}
						if (local178 < local234) {
							local234 = local178;
						}
						Static82.aClass18_2.method404(local234, Static64.aClass3_Sub6_5.aByteArray17, Static64.aClass3_Sub6_5.anInt2416);
						if (Static94.aByte2 != 0) {
							for (local285 = 0; local285 < local234; local285++) {
								Static64.aClass3_Sub6_5.aByteArray17[Static64.aClass3_Sub6_5.anInt2416 + local285] = (byte) (Static64.aClass3_Sub6_5.aByteArray17[Static64.aClass3_Sub6_5.anInt2416 + local285] ^ Static94.aByte2);
							}
						}
						Static64.aClass3_Sub6_5.anInt2416 += local234;
						Static45.anInt1270 += local234;
						if (local214 == Static64.aClass3_Sub6_5.anInt2416) {
							if (Static108.aClass3_Sub1_Sub5_1.aLong85 == 16711935L) {
								Static83.aClass3_Sub6_6 = Static64.aClass3_Sub6_5;
								for (local285 = 0; local285 < 256; local285++) {
									@Pc(484) Class11_Sub1 local484 = Static49.aClass11_Sub1Array1[local285];
									if (local484 != null) {
										Static83.aClass3_Sub6_6.anInt2416 = local285 * 4 + 5;
										local300 = Static83.aClass3_Sub6_6.method1614();
										local484.method1887(local300);
									}
								}
							} else {
								Static101.aCRC32_2.reset();
								Static101.aCRC32_2.update(Static64.aClass3_Sub6_5.aByteArray17, 0, local214);
								local285 = (int) Static101.aCRC32_2.getValue();
								if (Static108.aClass3_Sub1_Sub5_1.anInt882 != local285) {
									try {
										Static82.aClass18_2.method405();
									} catch (@Pc(528) Exception local528) {
									}
									Static94.aByte2 = (byte) (Math.random() * 255.0D + 1.0D);
									Static82.aClass18_2 = null;
									Static24.anInt740++;
									return false;
								}
								Static109.anInt2870 = 0;
								Static24.anInt740 = 0;
								Static108.aClass3_Sub1_Sub5_1.aClass11_Sub1_31.method1892(Static64.aClass3_Sub6_5.aByteArray17, Static62.aBoolean78, (Static108.aClass3_Sub1_Sub5_1.aLong85 & 0xFF0000L) == 16711680L, (int) (Static108.aClass3_Sub1_Sub5_1.aLong85 & 0xFFFFL));
							}
							Static108.aClass3_Sub1_Sub5_1.method1966();
							if (Static62.aBoolean78) {
								Static1.anInt2--;
							} else {
								Static72.anInt1862--;
							}
							Static108.aClass3_Sub1_Sub5_1 = null;
							Static64.aClass3_Sub6_5 = null;
							Static45.anInt1270 = 0;
						} else {
							if (Static45.anInt1270 != 512) {
								break;
							}
							Static45.anInt1270 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(613) IOException local613) {
				try {
					Static82.aClass18_2.method405();
				} catch (@Pc(618) Exception local618) {
				}
				Static82.aClass18_2 = null;
				Static109.anInt2870++;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
	public static void method915() {
		aClass3_Sub1_Sub2_Sub4_6 = null;
		aClass5_681 = null;
		aClass5_678 = null;
		aClass5_677 = null;
		aClass5_682 = null;
		aClass5_685 = null;
		aClass5_684 = null;
		anIntArray162 = null;
		aClass5_683 = null;
		aClass5_680 = null;
		aClass5_679 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)I")
	public static int method916() {
		return 5;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BILclient!mc;)V")
	public static void method917(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub1_Sub1 arg1) {
		Static5.method177(arg0, arg1.anInt1543, arg1.anInt1567);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLclient!ba;Lclient!vb;I)V")
	public static void method918(@OriginalArg(1) Class8 arg0, @OriginalArg(2) Class11_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class3_Sub9 local7 = new Class3_Sub9();
		local7.aClass11_Sub1_72 = arg1;
		local7.aClass8_2 = arg0;
		local7.aLong85 = arg2;
		local7.anInt1958 = 1;
		@Pc(26) Class51 local26 = Static18.aClass51_5;
		synchronized (Static18.aClass51_5) {
			Static18.aClass51_5.method1303(local7);
		}
		Static109.method1899();
	}
}
