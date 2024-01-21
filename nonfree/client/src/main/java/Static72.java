import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!me", name = "n", descriptor = "Lclient!pc;")
	public static Class64 aClass64_1;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "I")
	public static int anInt1650;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "Lclient!pe;")
	public static Class65 aClass65_709 = Static119.method1462("compass");

	@OriginalMember(owner = "client!me", name = "f", descriptor = "I")
	public static int anInt1645 = 0;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Lclient!cd;")
	public static Class13 aClass13_11 = new Class13();

	@OriginalMember(owner = "client!me", name = "i", descriptor = "I")
	public static int anInt1647 = 0;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "I")
	public static int anInt1648 = 0;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "I")
	public static int anInt1649 = 0;

	@OriginalMember(owner = "client!me", name = "l", descriptor = "Lclient!pe;")
	public static Class65 aClass65_710 = Static119.method1462(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!me", name = "m", descriptor = "Lclient!pe;")
	public static Class65 aClass65_711 = Static119.method1462("Cabbage");

	@OriginalMember(owner = "client!me", name = "p", descriptor = "[S")
	public static short[] aShortArray19 = new short[] { -1, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method1239() {
		aClass65_709 = null;
		aClass65_711 = null;
		aClass13_11 = null;
		aClass65_710 = null;
		aShortArray19 = null;
		aClass64_1 = null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIB)I")
	public static int method1240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(25) int local25 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local25;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)Lclient!pe;")
	public static Class65 method1241(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static120.method1871(arg0) : Static17.aClass65_137;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!l;)V")
	public static void method1242(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static63.aBoolean54) {
			Static60.method316(arg0);
			return;
		}
		if (Static17.anInt390 == 1 && Static96.anInt2190 >= 715 && Static100.anInt2282 >= 453) {
			Static34.aBoolean33 = !Static34.aBoolean33;
			if (Static34.aBoolean33) {
				Static36.method650();
			} else {
				Static18.method280(Static88.aClass56_Sub1_19, Static57.aClass65_629, Static3.aClass65_51);
			}
		}
		if (Static129.anInt2753 == 5) {
			return;
		}
		Static106.anInt2392++;
		if (Static129.anInt2753 != 10) {
			return;
		}
		if (Static70.anInt1634 != 2 && Static73.anInt1662 == 0) {
			if (Static17.anInt390 == 1 && Static96.anInt2190 >= 5 && Static96.anInt2190 <= 105 && Static100.anInt2282 >= 463 && Static100.anInt2282 <= 498) {
				Static126.method1929();
				return;
			}
			if (Static105.aClass69_1 != null) {
				Static126.method1929();
			}
		}
		@Pc(126) int local126 = Static96.anInt2190;
		@Pc(128) int local128 = Static17.anInt390;
		@Pc(130) int local130 = Static100.anInt2282;
		if (Static122.anInt2624 == 0) {
			if (local128 == 1 && local126 >= 227 && local126 <= 377 && local130 >= 271 && local130 <= 311) {
				Static122.anInt2624 = 3;
				Static103.anInt2342 = 0;
			}
			if (local128 != 1 || local126 < 387 || local126 > 537 || local130 < 271 || local130 > 311) {
				return;
			}
			Static122.anInt2624 = 2;
			Static57.aClass65_633 = Static22.aClass65_258;
			Static57.aClass65_624 = Static60.aClass65_213;
			Static103.anInt2342 = 0;
			Static57.aClass65_631 = Static60.aClass65_188;
			return;
		}
		if (Static122.anInt2624 == 2) {
			@Pc(142) short local142 = 231;
			@Pc(143) int local143 = local142 + 30;
			if (local128 == 1 && local130 >= 246 && local130 < 261) {
				Static103.anInt2342 = 0;
			}
			local143 += 15;
			if (local128 == 1 && local130 >= 261 && local130 < 276) {
				Static103.anInt2342 = 1;
			}
			local143 += 15;
			if (local128 == 1 && local126 >= 227 && local126 <= 377 && local130 >= 301 && local130 <= 341) {
				Static57.aClass65_627 = Static57.aClass65_627.method1481().method1506();
				if (Static57.aClass65_627.method1502() == 0) {
					Static40.method674(Static102.aClass65_976, Static60.aClass65_220, Static60.aClass65_218);
					return;
				}
				if (Static57.aClass65_634.method1502() == 0) {
					Static40.method674(Static113.aClass65_1072, Static60.aClass65_222, Static60.aClass65_189);
					return;
				}
				Static40.method674(Static110.aClass65_1043, Static60.aClass65_223, Static60.aClass65_221);
				Static98.method1604(20);
				return;
			}
			if (local128 == 1 && local126 >= 387 && local126 <= 537 && local130 >= 301 && local130 <= 341) {
				Static57.aClass65_634 = Static57.aClass65_629;
				Static122.anInt2624 = 0;
				Static57.aClass65_627 = Static57.aClass65_629;
			}
			while (true) {
				while (Static115.method1838()) {
					@Pc(319) boolean local319 = false;
					for (@Pc(321) int local321 = 0; local321 < Static117.aClass65_1112.method1502(); local321++) {
						if (Static94.anInt2129 == Static117.aClass65_1112.method1510(local321)) {
							local319 = true;
							break;
						}
					}
					if (Static103.anInt2342 == 0) {
						if (Static70.anInt1633 == 85 && Static57.aClass65_627.method1502() > 0) {
							Static57.aClass65_627 = Static57.aClass65_627.method1476(Static57.aClass65_627.method1502() - 1, 0);
						}
						if (Static70.anInt1633 == 84 || Static70.anInt1633 == 80) {
							Static103.anInt2342 = 1;
						}
						if (local319 && Static57.aClass65_627.method1502() < 12) {
							Static57.aClass65_627 = Static57.aClass65_627.method1475(Static94.anInt2129);
						}
					} else if (Static103.anInt2342 == 1) {
						if (Static70.anInt1633 == 85 && Static57.aClass65_634.method1502() > 0) {
							Static57.aClass65_634 = Static57.aClass65_634.method1476(Static57.aClass65_634.method1502() - 1, 0);
						}
						if (Static70.anInt1633 == 84 || Static70.anInt1633 == 80) {
							Static103.anInt2342 = 0;
						}
						if (Static67.anInt1595 == 2 && Static70.anInt1633 == 84) {
							Static57.aClass65_627 = Static57.aClass65_627.method1481().method1506();
							if (Static57.aClass65_627.method1502() == 0) {
								Static40.method674(Static102.aClass65_976, Static60.aClass65_220, Static60.aClass65_218);
								return;
							}
							if (Static57.aClass65_634.method1502() == 0) {
								Static40.method674(Static113.aClass65_1072, Static60.aClass65_222, Static60.aClass65_189);
								return;
							}
							Static40.method674(Static110.aClass65_1043, Static60.aClass65_223, Static60.aClass65_221);
							Static98.method1604(20);
							return;
						}
						if (local319 && Static57.aClass65_634.method1502() < 20) {
							Static57.aClass65_634 = Static57.aClass65_634.method1475(Static94.anInt2129);
						}
					}
				}
				return;
			}
		}
		if (Static122.anInt2624 == 3 && local128 == 1 && local126 >= 307 && local126 <= 457 && local130 >= 301 && local130 <= 341) {
			Static122.anInt2624 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public static void method1243() {
		for (@Pc(10) Class2_Sub7 local10 = (Class2_Sub7) Static112.aClass40_21.method854(); local10 != null; local10 = (Class2_Sub7) Static112.aClass40_21.method852()) {
			@Pc(15) int local15 = local10.anInt1527;
			if (Static94.method1566(local15)) {
				@Pc(21) boolean local21 = true;
				@Pc(25) Class2_Sub22[] local25 = Static95.aClass2_Sub22ArrayArray1[local15];
				for (@Pc(27) int local27 = 0; local27 < local25.length; local27++) {
					if (local25[local27] != null) {
						local21 = local25[local27].aBoolean124;
						break;
					}
				}
				if (!local21) {
					@Pc(51) int local51 = (int) local10.aLong100;
					@Pc(55) Class2_Sub22 local55 = Static35.method645(local51);
					if (local55 != null) {
						Static116.method1853(local55);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1244(@OriginalArg(1) byte[] arg0) {
		@Pc(14) int local14 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local14];
		Static135.method359(arg0, 0, local17, 0, local14);
		return local17;
	}
}
