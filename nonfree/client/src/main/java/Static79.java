import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ne", name = "Z", descriptor = "Lclient!kf;")
	public static Class22 aClass22_1;

	@OriginalMember(owner = "client!ne", name = "Ab", descriptor = "I")
	public static int anInt1769;

	@OriginalMember(owner = "client!ne", name = "Cb", descriptor = "I")
	public static int anInt1771;

	@OriginalMember(owner = "client!ne", name = "ab", descriptor = "Lclient!u;")
	private static Class74 aClass74_1208 = Static72.method1077(" from your friend list first");

	@OriginalMember(owner = "client!ne", name = "bb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1209 = Static72.method1077("Titelbild geladen)3");

	@OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
	public static int anInt1754 = -1;

	@OriginalMember(owner = "client!ne", name = "gb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1210 = Static72.method1077("Registrierter Benutzer");

	@OriginalMember(owner = "client!ne", name = "jb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1211 = aClass74_1208;

	@OriginalMember(owner = "client!ne", name = "rb", descriptor = "Z")
	public static boolean aBoolean71 = false;

	@OriginalMember(owner = "client!ne", name = "tb", descriptor = "Lclient!u;")
	private static Class74 aClass74_1212 = Static72.method1077("Hidden");

	@OriginalMember(owner = "client!ne", name = "ub", descriptor = "Lclient!u;")
	public static Class74 aClass74_1213 = aClass74_1212;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V")
	public static void method1241() {
		aClass74_1210 = null;
		aClass74_1209 = null;
		aClass74_1208 = null;
		aClass74_1212 = null;
		aClass22_1 = null;
		aClass74_1211 = null;
		aClass74_1213 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!vd;III)V")
	public static void method1243(@OriginalArg(0) Class2_Sub2_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21;
		@Pc(25) int local25;
		if ((arg2 & 0x8) != 0) {
			local21 = Static19.aClass2_Sub10_Sub1_1.method1503();
			local25 = Static19.aClass2_Sub10_Sub1_1.method1518();
			arg0.method1862(local21, local25, Static107.anInt2338);
			arg0.anInt2667 = Static107.anInt2338 + 300;
			arg0.anInt2694 = Static19.aClass2_Sub10_Sub1_1.method1503();
			arg0.anInt2671 = Static19.aClass2_Sub10_Sub1_1.method1518();
		}
		if ((arg2 & 0x100) != 0) {
			arg0.anInt2660 = Static19.aClass2_Sub10_Sub1_1.method1522();
			local21 = Static19.aClass2_Sub10_Sub1_1.method1527();
			arg0.anInt2696 = 0;
			arg0.anInt2685 = local21 >> 16;
			if (arg0.anInt2660 == 65535) {
				arg0.anInt2660 = -1;
			}
			arg0.anInt2715 = 0;
			arg0.anInt2689 = (local21 & 0xFFFF) + Static107.anInt2338;
			if (arg0.anInt2689 > Static107.anInt2338) {
				arg0.anInt2696 = -1;
			}
		}
		if ((arg2 & 0x4) != 0) {
			arg0.anInt2717 = Static19.aClass2_Sub10_Sub1_1.method1517();
			if (arg0.anInt2717 == 65535) {
				arg0.anInt2717 = -1;
			}
		}
		if ((arg2 & 0x200) != 0) {
			arg0.anInt2702 = Static19.aClass2_Sub10_Sub1_1.method1518();
			arg0.anInt2686 = Static19.aClass2_Sub10_Sub1_1.method1490();
			arg0.anInt2721 = Static19.aClass2_Sub10_Sub1_1.method1514();
			arg0.anInt2698 = Static19.aClass2_Sub10_Sub1_1.method1503();
			arg0.anInt2701 = Static19.aClass2_Sub10_Sub1_1.method1525() + Static107.anInt2338;
			arg0.anInt2716 = Static19.aClass2_Sub10_Sub1_1.method1517() + Static107.anInt2338;
			arg0.anInt2680 = Static19.aClass2_Sub10_Sub1_1.method1514();
			arg0.anInt2691 = 1;
			arg0.anInt2684 = 0;
		}
		if ((arg2 & 0x10) != 0) {
			local21 = Static19.aClass2_Sub10_Sub1_1.method1518();
			@Pc(183) byte[] local183 = new byte[local21];
			@Pc(188) Class2_Sub10 local188 = new Class2_Sub10(local183);
			Static19.aClass2_Sub10_Sub1_1.method1499(local183, local21);
			Static64.aClass2_Sub10Array1[arg1] = local188;
			arg0.method1868(local188);
		}
		if ((arg2 & 0x400) != 0) {
			local21 = Static19.aClass2_Sub10_Sub1_1.method1518();
			local25 = Static19.aClass2_Sub10_Sub1_1.method1503();
			arg0.method1862(local21, local25, Static107.anInt2338);
			arg0.anInt2667 = Static107.anInt2338 + 300;
			arg0.anInt2694 = Static19.aClass2_Sub10_Sub1_1.method1503();
			arg0.anInt2671 = Static19.aClass2_Sub10_Sub1_1.method1518();
		}
		if ((arg2 & 0x1) != 0) {
			local21 = Static19.aClass2_Sub10_Sub1_1.method1506();
			if (local21 == 65535) {
				local21 = -1;
			}
			local25 = Static19.aClass2_Sub10_Sub1_1.method1490();
			Static113.method1687(arg0, local21, local25);
		}
		if ((arg2 & 0x2) != 0) {
			local21 = Static19.aClass2_Sub10_Sub1_1.method1506();
			local25 = Static19.aClass2_Sub10_Sub1_1.method1518();
			@Pc(279) int local279 = Static19.aClass2_Sub10_Sub1_1.method1503();
			@Pc(282) int local282 = Static19.aClass2_Sub10_Sub1_1.anInt2187;
			if (arg0.aClass74_1661 != null && arg0.aClass14_2 != null) {
				@Pc(290) boolean local290 = false;
				@Pc(295) long local295 = arg0.aClass74_1661.method1696();
				if (local25 <= 1) {
					for (@Pc(300) int local300 = 0; local300 < Static101.anInt2247; local300++) {
						if (Static10.aLongArray6[local300] == local295) {
							local290 = true;
							break;
						}
					}
				}
				if (!local290 && Static116.anInt2490 == 0) {
					Static2.aClass2_Sub10_3.anInt2187 = 0;
					Static19.aClass2_Sub10_Sub1_1.method1499(Static2.aClass2_Sub10_3.aByteArray27, local279);
					Static2.aClass2_Sub10_3.anInt2187 = 0;
					@Pc(339) Class74 local339 = Static111.method1677(Static2.aClass2_Sub10_3).method1710();
					arg0.aClass74_1657 = local339.method1718();
					arg0.anInt2662 = local21 & 0xFF;
					arg0.anInt2687 = 150;
					arg0.anInt2678 = local21 >> 8;
					if (local25 == 2 || local25 == 3) {
						Static67.method1024(1, Static91.method1340(new Class74[] { Static21.aClass74_474, arg0.aClass74_1661 }), local339);
					} else if (local25 == 1) {
						Static67.method1024(1, Static91.method1340(new Class74[] { Static48.aClass74_838, arg0.aClass74_1661 }), local339);
					} else {
						Static67.method1024(2, arg0.aClass74_1661, local339);
					}
				}
			}
			Static19.aClass2_Sub10_Sub1_1.anInt2187 = local279 + local282;
		}
		if ((arg2 & 0x80) != 0) {
			arg0.anInt2664 = Static19.aClass2_Sub10_Sub1_1.method1525();
			arg0.anInt2713 = Static19.aClass2_Sub10_Sub1_1.method1525();
		}
		if ((arg2 & 0x20) == 0) {
			return;
		}
		arg0.aClass74_1657 = Static19.aClass2_Sub10_Sub1_1.method1530();
		if (arg0.aClass74_1657.method1703(0) == 126) {
			arg0.aClass74_1657 = arg0.aClass74_1657.method1697(1);
			Static67.method1024(2, arg0.aClass74_1661, arg0.aClass74_1657);
		} else if (Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1 == arg0) {
			Static67.method1024(2, arg0.aClass74_1661, arg0.aClass74_1657);
		}
		arg0.anInt2678 = 0;
		arg0.anInt2687 = 150;
		arg0.anInt2662 = 0;
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
	public static void method1244() {
		if (Static21.anInt619 > 0) {
			Static124.method1874();
		} else {
			Static106.method1597(40);
			Static64.aClass62_3 = Static88.aClass62_4;
			Static88.aClass62_4 = null;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
	public static void method1247() {
		Static91.method1338(Static14.anInt401);
		if (Static98.anInt2115 != -1) {
			Static91.method1338(Static98.anInt2115);
		}
		Static15.anInt429 = 0;
		Static123.aClass9_56.method1589();
		Static44.method728();
		Static58.method698();
		Static85.method1295(0, 503, 765, Static14.anInt401);
		if (Static98.anInt2115 != -1) {
			Static85.method1295(0, 503, 765, Static98.anInt2115);
		}
		if (Static109.aBoolean103) {
			Static52.method877();
		} else {
			Static63.method1003();
			Static8.method167();
		}
		try {
			@Pc(56) Graphics local56 = Static51.aCanvas2.getGraphics();
			Static123.aClass9_56.method1585(0, local56, 0);
		} catch (@Pc(64) Exception local64) {
			Static51.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLclient!g;Lclient!g;Lclient!cc;Z)V")
	public static void method1248(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) Class2_Sub2_Sub1_Sub3 arg3) {
		Static56.aBoolean51 = arg0;
		Static68.aClass26_14 = arg2;
		Static67.aClass26_13 = arg1;
		Static106.anInt2328 = Static68.aClass26_14.method1369(10);
		Static47.aClass2_Sub2_Sub1_Sub3_4 = arg3;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBILclient!u;Lclient!u;II)V")
	public static void method1250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class74 arg2, @OriginalArg(4) Class74 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static112.anInt2421 >= 500) {
			return;
		}
		if (arg2.method1695() <= 0) {
			Static92.aClass74Array14[Static112.anInt2421] = arg3;
		} else {
			Static92.aClass74Array14[Static112.anInt2421] = Static91.method1340(new Class74[] { arg3, Static48.aClass74_834, arg2 });
		}
		Static57.anIntArray159[Static112.anInt2421] = arg5;
		Static88.anIntArray261[Static112.anInt2421] = arg4;
		Static55.anIntArray53[Static112.anInt2421] = arg1;
		Static77.anIntArray246[Static112.anInt2421] = arg0;
		Static112.anInt2421++;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!g;I)V")
	public static void method1251(@OriginalArg(0) Class26 arg0) {
		Static90.aClass26_23 = arg0;
		Static52.anInt1261 = Static90.aClass26_23.method1369(16);
	}
}
