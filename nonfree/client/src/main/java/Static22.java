import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!dc", name = "tb", descriptor = "[I")
	public static int[] anIntArray161;

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "Lclient!fc;")
	public static Class25 aClass25_341 = null;

	@OriginalMember(owner = "client!dc", name = "kb", descriptor = "Lclient!p;")
	public static Class63 aClass63_4 = new Class63(260);

	@OriginalMember(owner = "client!dc", name = "xb", descriptor = "[B")
	public static byte[] aByteArray14 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!dc", name = "yb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_342 = Static78.method1313("Checking for updates )2 ");

	@OriginalMember(owner = "client!dc", name = "Fb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_344 = Static78.method1313("Take");

	@OriginalMember(owner = "client!dc", name = "zb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_343 = aClass25_344;

	@OriginalMember(owner = "client!dc", name = "Eb", descriptor = "[Lclient!cf;")
	public static Class16[] aClass16Array2 = new Class16[50];

	@OriginalMember(owner = "client!dc", name = "Hb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_345 = Static78.method1313(" weitere Optionen");

	@OriginalMember(owner = "client!dc", name = "Ib", descriptor = "Lclient!fc;")
	public static Class25 aClass25_346 = Static78.method1313("Side panel redrawn");

	@OriginalMember(owner = "client!dc", name = "Jb", descriptor = "[I")
	public static int[] anIntArray162 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!dc", name = "Lb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_347 = aClass25_342;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
	public static void method632() {
		aClass25_344 = null;
		anIntArray162 = null;
		anIntArray161 = null;
		aClass25_342 = null;
		aClass25_343 = null;
		aClass25_345 = null;
		aClass16Array2 = null;
		aByteArray14 = null;
		aClass25_347 = null;
		aClass63_4 = null;
		aClass25_346 = null;
		aClass25_341 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ob;I)Z")
	public static boolean method646(@OriginalArg(0) Class1_Sub2_Sub14 arg0) {
		@Pc(6) int local6 = arg0.anInt1934;
		if (Static50.anInt1235 == 2) {
			if (local6 == 201) {
				Static110.aBoolean113 = true;
				Static54.anInt1288 = 1;
				Static104.anInt2372 = 0;
				Static92.aClass25_982 = Static92.aClass25_985;
				Static92.aClass25_981 = Static118.aClass25_1327;
				Static110.aBoolean115 = true;
			}
			if (local6 == 202) {
				Static54.anInt1288 = 2;
				Static92.aClass25_981 = Static88.aClass25_946;
				Static104.anInt2372 = 0;
				Static110.aBoolean113 = true;
				Static92.aClass25_982 = Static92.aClass25_985;
				Static110.aBoolean115 = true;
			}
		}
		if (local6 == 205) {
			Static88.anInt1970 = 250;
			return true;
		}
		if (local6 == 501) {
			Static54.anInt1288 = 4;
			Static92.aClass25_982 = Static92.aClass25_985;
			Static92.aClass25_981 = Static6.aClass25_59;
			Static110.aBoolean115 = true;
			Static104.anInt2372 = 0;
			Static110.aBoolean113 = true;
		}
		if (local6 == 502) {
			Static92.aClass25_982 = Static92.aClass25_985;
			Static54.anInt1288 = 5;
			Static110.aBoolean115 = true;
			Static104.anInt2372 = 0;
			Static92.aClass25_981 = Static82.aClass25_871;
			Static110.aBoolean113 = true;
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (local6 >= 300 && local6 <= 313) {
			local90 = (local6 - 300) / 2;
			local94 = local6 & 0x1;
			Static48.aClass75_1.method1856(local90, local94 == 1);
		}
		if (local6 >= 314 && local6 <= 323) {
			local90 = (local6 - 314) / 2;
			local94 = local6 & 0x1;
			Static48.aClass75_1.method1847(local94 == 1, local90);
		}
		if (local6 == 324) {
			Static48.aClass75_1.method1855(false);
		}
		if (local6 == 325) {
			Static48.aClass75_1.method1855(true);
		}
		if (local6 == 326) {
			Static68.aClass1_Sub5_Sub1_2.method688(131);
			Static48.aClass75_1.method1851(Static68.aClass1_Sub5_Sub1_2);
			return true;
		}
		if (local6 == 620) {
			Static89.aBoolean17 = !Static89.aBoolean17;
		}
		if (local6 >= 601 && local6 <= 613) {
			Static9.method238();
			if (Static92.aClass25_979.method762() > 0) {
				Static68.aClass1_Sub5_Sub1_2.method688(220);
				Static68.aClass1_Sub5_Sub1_2.method640(Static92.aClass25_979.method770());
				Static68.aClass1_Sub5_Sub1_2.method676(local6 - 601);
				Static68.aClass1_Sub5_Sub1_2.method676(Static89.aBoolean17 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBZI[I)V")
	public static void method678(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		Static105.aClass7_16.method1096();
		Static76.aClass1_Sub2_Sub2_Sub4_11.method1953(0, 0);
		if (arg1) {
			if (arg3[arg2] != -1) {
				if (arg2 == 0) {
					Static54.aClass1_Sub2_Sub2_Sub4_7.method1953(22, 10);
				}
				if (arg2 == 1) {
					Static106.aClass1_Sub2_Sub2_Sub4_15.method1953(54, 8);
				}
				if (arg2 == 2) {
					Static106.aClass1_Sub2_Sub2_Sub4_15.method1953(82, 8);
				}
				if (arg2 == 3) {
					Static112.aClass1_Sub2_Sub2_Sub4_18.method1953(110, 8);
				}
				if (arg2 == 4) {
					Static75.aClass1_Sub2_Sub2_Sub4_10.method1953(153, 8);
				}
				if (arg2 == 5) {
					Static75.aClass1_Sub2_Sub2_Sub4_10.method1953(181, 8);
				}
				if (arg2 == 6) {
					Static106.aClass1_Sub2_Sub2_Sub4_16.method1953(209, 9);
				}
			}
			if (arg3[0] != -1 && arg0 != 0) {
				Static93.aClass1_Sub2_Sub2_Sub4Array8[0].method1953(29, 13);
			}
			if (arg3[1] != -1 && arg0 != 1) {
				Static93.aClass1_Sub2_Sub2_Sub4Array8[1].method1953(53, 11);
			}
			if (arg3[2] != -1 && arg0 != 2) {
				Static93.aClass1_Sub2_Sub2_Sub4Array8[2].method1953(82, 11);
			}
			if (arg3[3] != -1 && arg0 != 3) {
				Static93.aClass1_Sub2_Sub2_Sub4Array8[3].method1953(115, 12);
			}
			if (arg3[4] != -1 && arg0 != 4) {
				Static93.aClass1_Sub2_Sub2_Sub4Array8[4].method1953(153, 13);
			}
			if (arg3[5] != -1 && arg0 != 5) {
				Static93.aClass1_Sub2_Sub2_Sub4Array8[5].method1953(180, 11);
			}
			if (arg3[6] != -1 && arg0 != 6) {
				Static93.aClass1_Sub2_Sub2_Sub4Array8[6].method1953(208, 13);
			}
		}
		Static59.aClass7_8.method1096();
		Static7.aClass1_Sub2_Sub2_Sub4_2.method1953(0, 0);
		if (arg1) {
			if (arg3[arg2] != -1) {
				if (arg2 == 7) {
					Static52.aClass1_Sub2_Sub2_Sub4_6.method1953(42, 0);
				}
				if (arg2 == 8) {
					Static100.aClass1_Sub2_Sub2_Sub4_14.method1953(74, 0);
				}
				if (arg2 == 9) {
					Static100.aClass1_Sub2_Sub2_Sub4_14.method1953(102, 0);
				}
				if (arg2 == 10) {
					Static28.aClass1_Sub2_Sub2_Sub4_5.method1953(130, 1);
				}
				if (arg2 == 11) {
					Static115.aClass1_Sub2_Sub2_Sub4_19.method1953(173, 0);
				}
				if (arg2 == 12) {
					Static115.aClass1_Sub2_Sub2_Sub4_19.method1953(201, 0);
				}
				if (arg2 == 13) {
					Static121.aClass1_Sub2_Sub2_Sub4_20.method1953(229, 0);
				}
			}
			if (arg3[8] != -1 && arg0 != 8) {
				Static93.aClass1_Sub2_Sub2_Sub4Array8[7].method1953(74, 2);
			}
			if (arg3[9] != -1 && arg0 != 9) {
				Static93.aClass1_Sub2_Sub2_Sub4Array8[8].method1953(102, 3);
			}
			if (arg3[10] != -1 && arg0 != 10) {
				Static93.aClass1_Sub2_Sub2_Sub4Array8[9].method1953(137, 4);
			}
			if (arg3[11] != -1 && arg0 != 11) {
				Static93.aClass1_Sub2_Sub2_Sub4Array8[10].method1953(174, 2);
			}
			if (arg3[12] != -1 && arg0 != 12) {
				Static93.aClass1_Sub2_Sub2_Sub4Array8[11].method1953(201, 2);
			}
			if (arg3[13] != -1 && arg0 != 13) {
				Static93.aClass1_Sub2_Sub2_Sub4Array8[12].method1953(226, 2);
			}
		}
		try {
			@Pc(356) Graphics local356 = Static119.aCanvas1.getGraphics();
			Static105.aClass7_16.method1095(local356, 516, 160);
			Static59.aClass7_8.method1095(local356, 496, 466);
		} catch (@Pc(370) Exception local370) {
			Static119.aCanvas1.repaint();
		}
	}
}
