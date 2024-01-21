import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!gd", name = "hb", descriptor = "[I")
	public static int[] anIntArray135;

	@OriginalMember(owner = "client!gd", name = "yb", descriptor = "I")
	public static int anInt1550;

	@OriginalMember(owner = "client!gd", name = "jb", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[100];

	@OriginalMember(owner = "client!gd", name = "kb", descriptor = "I")
	public static int anInt1542 = 0;

	@OriginalMember(owner = "client!gd", name = "lb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_883 = Static107.method1838("Mem:");

	@OriginalMember(owner = "client!gd", name = "xb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_887 = Static107.method1838("Welcome to RuneScape");

	@OriginalMember(owner = "client!gd", name = "nb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_884 = aClass28_887;

	@OriginalMember(owner = "client!gd", name = "qb", descriptor = "Z")
	public static volatile boolean aBoolean79 = true;

	@OriginalMember(owner = "client!gd", name = "sb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_885 = Static107.method1838("Enter your username (V password)3");

	@OriginalMember(owner = "client!gd", name = "ub", descriptor = "Lclient!gg;")
	public static Class28 aClass28_886 = Static107.method1838("<col=00ffff>");

	@OriginalMember(owner = "client!gd", name = "zb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_888 = aClass28_885;

	@OriginalMember(owner = "client!gd", name = "Cb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_889 = Static107.method1838("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!bh;B)V")
	public static void method1056(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static142.anInt3248 != 1) {
			return;
		}
		if (Static101.anInt449 >= 280 && Static101.anInt449 <= 294 && Static130.anInt3042 >= 4 && Static130.anInt3042 <= 18) {
			Static95.method1644(0, 0);
			return;
		}
		if (Static101.anInt449 >= 295 && Static101.anInt449 <= 360 && Static130.anInt3042 >= 4 && Static130.anInt3042 <= 18) {
			Static95.method1644(1, 0);
			return;
		}
		if (Static101.anInt449 >= 390 && Static101.anInt449 <= 404 && Static130.anInt3042 >= 4 && Static130.anInt3042 <= 18) {
			Static95.method1644(0, 1);
			return;
		}
		if (Static101.anInt449 >= 405 && Static101.anInt449 <= 470 && Static130.anInt3042 >= 4 && Static130.anInt3042 <= 18) {
			Static95.method1644(1, 1);
			return;
		}
		if (Static101.anInt449 >= 500 && Static101.anInt449 <= 514 && Static130.anInt3042 >= 4 && Static130.anInt3042 <= 18) {
			Static95.method1644(0, 2);
			return;
		}
		if (Static101.anInt449 >= 515 && Static101.anInt449 <= 580 && Static130.anInt3042 >= 4 && Static130.anInt3042 <= 18) {
			Static95.method1644(1, 2);
			return;
		}
		if (Static101.anInt449 >= 610 && Static101.anInt449 <= 624 && Static130.anInt3042 >= 4 && Static130.anInt3042 <= 18) {
			Static95.method1644(0, 3);
			return;
		}
		if (Static101.anInt449 >= 625 && Static101.anInt449 <= 690 && Static130.anInt3042 >= 4 && Static130.anInt3042 <= 18) {
			Static95.method1644(1, 3);
			return;
		}
		if (Static101.anInt449 >= 708 && Static130.anInt3042 >= 4 && Static101.anInt449 <= 758 && Static130.anInt3042 <= 20) {
			Static82.aBoolean103 = false;
			Static105.aClass2_Sub4_Sub3_Sub4_5.method2823(0, 0);
			Static113.aClass2_Sub4_Sub3_Sub4_6.method2823(382, 0);
			Static42.aClass2_Sub4_Sub3_Sub3_1.method2242(382 - Static42.aClass2_Sub4_Sub3_Sub3_1.anInt3233 / 2, 18);
			return;
		}
		if (Static56.anInt1497 == -1) {
			return;
		}
		@Pc(274) Class31 local274 = Static47.aClass31Array3[Static56.anInt1497];
		if (local274.aBoolean91 == Static51.aBoolean96) {
			@Pc(302) byte[] local302 = Static83.method1481(new Class28[] { local274.aClass28_1046, Static15.aClass28_419 }).method1143();
			Static79.aString2 = new String(local302, 0, local302.length);
			if (Static158.anInt3499 != 0) {
				Static158.anInt3499 = 0;
				Static167.anInt3751 = 43594;
				Static151.anInt3389 = 43594;
				Static180.anInt4033 = 443;
			}
			Static97.anInt2448 = local274.anInt1795;
			Static82.aBoolean103 = false;
			Static105.aClass2_Sub4_Sub3_Sub4_5.method2823(0, 0);
			Static113.aClass2_Sub4_Sub3_Sub4_6.method2823(382, 0);
			Static42.aClass2_Sub4_Sub3_Sub3_1.method2242(382 - Static42.aClass2_Sub4_Sub3_Sub3_1.anInt3233 / 2, 18);
			return;
		}
		@Pc(403) Class28 local403 = Static83.method1481(new Class28[] { Static111.aClass28_1582, local274.aClass28_1046, Static15.aClass28_419, Static136.aClass28_1829, Static87.aClass28_1342, Static158.method2411(Static177.aBoolean170 ? 1 : 0), Static85.aClass28_1279, Static158.method2411(Static58.anInt1513), Static33.aClass28_550, Static158.method2411(Static85.anInt2162) });
		try {
			arg0.getAppletContext().showDocument(local403.method1110(), "_self");
		} catch (@Pc(412) Exception local412) {
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!jc;Lclient!jc;BLclient!jc;Lclient!jc;)V")
	public static void method1057(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(3) Class40 arg2, @OriginalArg(4) Class40 arg3) {
		Static172.aClass40_38 = arg0;
		Static31.aClass40_40 = arg1;
		Static84.aClass40_22 = arg3;
		Static177.aClass40_39 = arg2;
		Static23.aClass24ArrayArray1 = new Class24[Static84.aClass40_22.method1789()][];
		Static14.aBooleanArray8 = new boolean[Static84.aClass40_22.method1789()];
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	public static void method1058() {
		aClass28_887 = null;
		anIntArray135 = null;
		aClass28_886 = null;
		aClass28_883 = null;
		aClass28_888 = null;
		aClass28_885 = null;
		aBooleanArray11 = null;
		aClass28_884 = null;
		aClass28_889 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIII)V")
	public static void method1059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) long local6 = Static41.method740(arg4, arg1, arg2);
		@Pc(17) int local17;
		@Pc(24) int local24;
		@Pc(33) int local33;
		@Pc(49) int local49;
		@Pc(31) int local31;
		if (local6 != 0L) {
			local17 = (int) local6 >> 20 & 0x3;
			local24 = (int) local6 >> 14 & 0x1F;
			local31 = Integer.MAX_VALUE & (int) (local6 >>> 32);
			local33 = arg3;
			@Pc(36) int[] local36 = Static94.aClass2_Sub4_Sub3_Sub4_4.anIntArray366;
			local49 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
			if (local6 > 0L) {
				local33 = arg0;
			}
			@Pc(61) Class2_Sub4_Sub6 local61 = Static151.method2339(local31);
			if (local61.anInt1019 == -1) {
				if (local24 == 0 || local24 == 2) {
					if (local17 == 0) {
						local36[local49] = local33;
						local36[local49 + 512] = local33;
						local36[local49 + 1024] = local33;
						local36[local49 + 1536] = local33;
					} else if (local17 == 1) {
						local36[local49] = local33;
						local36[local49 + 1] = local33;
						local36[local49 + 2] = local33;
						local36[local49 + 3] = local33;
					} else if (local17 == 2) {
						local36[local49 + 3] = local33;
						local36[local49 + 3 + 512] = local33;
						local36[local49 + 1024 + 3] = local33;
						local36[local49 + 1536 + 3] = local33;
					} else if (local17 == 3) {
						local36[local49 + 1536] = local33;
						local36[local49 + 1536 + 1] = local33;
						local36[local49 + 2 + 1536] = local33;
						local36[local49 + 1536 + 3] = local33;
					}
				}
				if (local24 == 3) {
					if (local17 == 0) {
						local36[local49] = local33;
					} else if (local17 == 1) {
						local36[local49 + 3] = local33;
					} else if (local17 == 2) {
						local36[local49 + 3 + 1536] = local33;
					} else if (local17 == 3) {
						local36[local49 + 1536] = local33;
					}
				}
				if (local24 == 2) {
					if (local17 == 3) {
						local36[local49] = local33;
						local36[local49 + 512] = local33;
						local36[local49 + 1024] = local33;
						local36[local49 + 1536] = local33;
					} else if (local17 == 0) {
						local36[local49] = local33;
						local36[local49 + 1] = local33;
						local36[local49 + 2] = local33;
						local36[local49 + 3] = local33;
					} else if (local17 == 1) {
						local36[local49 + 3] = local33;
						local36[local49 + 515] = local33;
						local36[local49 + 1027] = local33;
						local36[local49 + 1536 + 3] = local33;
					} else if (local17 == 2) {
						local36[local49 + 1536] = local33;
						local36[local49 + 1537] = local33;
						local36[local49 + 1536 + 2] = local33;
						local36[local49 + 1536 + 3] = local33;
					}
				}
			} else {
				@Pc(70) Class2_Sub4_Sub3_Sub3 local70 = Static102.aClass2_Sub4_Sub3_Sub3Array4[local61.anInt1019];
				if (local70 != null) {
					@Pc(82) int local82 = (local61.anInt1037 * 4 - local70.anInt3234) / 2;
					@Pc(93) int local93 = (local61.anInt1050 * 4 - local70.anInt3233) / 2;
					local70.method2242(arg1 * 4 + local93 + 48, local82 + 48 - -((-local61.anInt1037 + -arg2 + 104) * 4));
				}
			}
		}
		local6 = Static107.method1837(arg4, arg1, arg2);
		if (local6 != 0L) {
			local24 = (int) local6 >> 14 & 0x1F;
			local17 = (int) local6 >> 20 & 0x3;
			local33 = Integer.MAX_VALUE & (int) (local6 >>> 32);
			@Pc(460) Class2_Sub4_Sub6 local460 = Static151.method2339(local33);
			@Pc(495) int local495;
			if (local460.anInt1019 != -1) {
				@Pc(568) Class2_Sub4_Sub3_Sub3 local568 = Static102.aClass2_Sub4_Sub3_Sub3Array4[local460.anInt1019];
				if (local568 != null) {
					local31 = (local460.anInt1050 * 4 - local568.anInt3233) / 2;
					local495 = (local460.anInt1037 * 4 - local568.anInt3234) / 2;
					local568.method2242(arg1 * 4 + local31 + 48, local495 + (-local460.anInt1037 + 104 + -arg2) * 4 + 48);
				}
			} else if (local24 == 9) {
				local49 = 15658734;
				if (local6 > 0L) {
					local49 = 15597568;
				}
				@Pc(480) int[] local480 = Static94.aClass2_Sub4_Sub3_Sub4_4.anIntArray366;
				local495 = arg1 * 4 + (52736 - arg2 * 512) * 4 + 24624;
				if (local17 == 0 || local17 == 2) {
					local480[local495 + 1536] = local49;
					local480[local495 + 1024 + 1] = local49;
					local480[local495 + 2 + 512] = local49;
					local480[local495 + 3] = local49;
				} else {
					local480[local495] = local49;
					local480[local495 + 512 + 1] = local49;
					local480[local495 + 1026] = local49;
					local480[local495 + 3 + 1536] = local49;
				}
			}
		}
		local6 = Static21.method469(arg4, arg1, arg2);
		if (local6 == 0L) {
			return;
		}
		local17 = (int) (local6 >>> 32) & Integer.MAX_VALUE;
		@Pc(637) Class2_Sub4_Sub6 local637 = Static151.method2339(local17);
		if (local637.anInt1019 == -1) {
			return;
		}
		@Pc(646) Class2_Sub4_Sub3_Sub3 local646 = Static102.aClass2_Sub4_Sub3_Sub3Array4[local637.anInt1019];
		if (local646 != null) {
			@Pc(658) int local658 = (local637.anInt1050 * 4 - local646.anInt3233) / 2;
			local49 = (local637.anInt1037 * 4 - local646.anInt3234) / 2;
			local646.method2242(arg1 * 4 + local658 + 48, 48 - -((104 - (arg2 - -local637.anInt1037)) * 4) - -local49);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILclient!jc;ZII)V")
	public static void method1060(@OriginalArg(0) int arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static108.anInt2633 = 10000;
		Static135.anInt3102 = arg0;
		Static49.aClass40_14 = arg1;
		Static84.aBoolean104 = false;
		Static43.anInt1114 = 1;
		Static94.anInt2360 = arg3;
		Static90.anInt2314 = arg2;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZILclient!gg;)V")
	public static void method1061(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class28 arg1) {
		@Pc(26) int local26 = Static61.aClass2_Sub4_Sub3_Sub2_Sub1_3.method2459(arg1, 250);
		@Pc(33) int local33 = Static61.aClass2_Sub4_Sub3_Sub2_Sub1_3.method2455(arg1, 250) * 13;
		Static161.method2809(6, 6, local26 + 4 + 4, local33 + 4 - -4, 0);
		Static161.method2804(6, 6, local26 + 4 + 4, local33 + 4 + 4, 16777215);
		Static61.aClass2_Sub4_Sub3_Sub2_Sub1_3.method2458(arg1, 10, 10, local26, local33, 16777215, -1, 1, 1, 0);
		Static19.method609(local33 + 4 + 4, 6, 6, local26 + 4 + 4);
		if (!arg0) {
			Static45.method874(local26, 10, 10, local33);
			return;
		}
		try {
			@Pc(120) Graphics local120 = Static49.aCanvas1.getGraphics();
			Static62.aClass8_1.method2590(local120);
		} catch (@Pc(128) Exception local128) {
			Static49.aCanvas1.repaint();
		}
	}
}
