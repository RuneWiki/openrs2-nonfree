import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!mb;")
	public static Class45 aClass45_372 = Static63.method1251("(Udns");

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
	public static int anInt776 = -1;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Lclient!sa;")
	public static Class67 aClass67_7 = new Class67(30);

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
	public static int anInt777 = 0;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Lclient!mb;")
	public static Class45 aClass45_373 = Static63.method1251("scape main");

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "Z")
	public static final boolean aBoolean34 = false;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "[I")
	public static int[] anIntArray130 = new int[25];

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "[J")
	public static long[] aLongArray1 = new long[200];

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Lclient!mb;")
	private static Class45 aClass45_374 = Static63.method1251("Loaded textures");

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Lclient!mb;")
	public static Class45 aClass45_375 = Static63.method1251("Hidden)2use");

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "Lclient!mb;")
	public static Class45 aClass45_376 = Static63.method1251("@gr2@");

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "Lclient!mb;")
	public static Class45 aClass45_377 = aClass45_374;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
	public static void method542(@OriginalArg(1) int arg0) {
		Static48.anInt1589 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ia;I)V")
	public static void method543(@OriginalArg(0) Class5_Sub2_Sub8 arg0) {
		@Pc(8) int local8 = arg0.anInt1267;
		@Pc(98) int local98;
		if (local8 >= 1 && local8 <= 100 || !(local8 < 701 || local8 > 800)) {
			if (Static62.anInt1817 == 0) {
				if (local8 == 1) {
					arg0.aClass45_544 = Static102.aClass45_1179;
					arg0.anInt1268 = 0;
					return;
				}
				if (local8 == 2) {
					arg0.aClass45_544 = Static96.aClass45_1110;
					arg0.anInt1268 = 0;
					return;
				}
			}
			if (Static62.anInt1817 == 1) {
				if (local8 == 1) {
					arg0.anInt1268 = 0;
					arg0.aClass45_544 = Static103.aClass45_1185;
					return;
				}
				if (local8 == 2) {
					arg0.anInt1268 = 0;
					arg0.aClass45_544 = Static96.aClass45_1111;
					return;
				}
				if (local8 == 3) {
					arg0.aClass45_544 = Static61.aClass45_753;
					arg0.anInt1268 = 0;
					return;
				}
			}
			if (local8 > 700) {
				local8 -= 601;
			} else {
				local8--;
			}
			local98 = Static104.anInt2772;
			if (Static62.anInt1817 != 2) {
				local98 = 0;
			}
			if (local8 >= local98) {
				arg0.aClass45_544 = Static78.aClass45_929;
				arg0.anInt1268 = 0;
			} else {
				arg0.aClass45_544 = Static21.aClass45Array7[local8];
				arg0.anInt1268 = 1;
			}
		} else if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
			if (local8 <= 800) {
				local8 -= 101;
			} else {
				local8 -= 701;
			}
			local98 = Static104.anInt2772;
			if (Static62.anInt1817 != 2) {
				local98 = 0;
			}
			if (local8 >= local98) {
				arg0.aClass45_544 = Static78.aClass45_929;
				arg0.anInt1268 = 0;
			} else {
				if (Static56.anIntArray257[local8] == 0) {
					arg0.aClass45_544 = Static39.method1443(new Class45[] { Static60.aClass45_715, Static28.aClass45_428 });
				} else if (Static56.anIntArray257[local8] >= 5000) {
					if (Static56.anIntArray257[local8] == Static62.anInt1821) {
						arg0.aClass45_544 = Static39.method1443(new Class45[] { Static90.aClass45_1055, Static55.aClass45_673, Static76.method1476(Static56.anIntArray257[local8] - 5000) });
					} else {
						arg0.aClass45_544 = Static39.method1443(new Class45[] { Static79.aClass45_946, Static55.aClass45_673, Static76.method1476(Static56.anIntArray257[local8] - 5000) });
					}
				} else if (Static56.anIntArray257[local8] == Static62.anInt1821) {
					arg0.aClass45_544 = Static39.method1443(new Class45[] { Static90.aClass45_1055, Static71.aClass45_878, Static76.method1476(Static56.anIntArray257[local8]) });
				} else {
					arg0.aClass45_544 = Static39.method1443(new Class45[] { Static79.aClass45_946, Static71.aClass45_878, Static76.method1476(Static56.anIntArray257[local8]) });
				}
				arg0.anInt1268 = 1;
			}
		} else if (local8 == 203) {
			local98 = Static104.anInt2772;
			if (Static62.anInt1817 != 2) {
				local98 = 0;
			}
			arg0.anInt1232 = local98 * 15 + 20;
			if (arg0.anInt1232 <= arg0.anInt1243) {
				arg0.anInt1232 = arg0.anInt1243 + 1;
			}
		} else if (local8 >= 401 && local8 <= 500) {
			local8 -= 401;
			if (local8 == 0 && Static62.anInt1817 == 0) {
				arg0.anInt1268 = 0;
				arg0.aClass45_544 = Static97.aClass45_1114;
			} else if (local8 == 1 && Static62.anInt1817 == 0) {
				arg0.anInt1268 = 0;
				arg0.aClass45_544 = Static96.aClass45_1110;
			} else {
				local98 = Static69.anInt1993;
				if (Static62.anInt1817 == 0) {
					local98 = 0;
				}
				if (local98 <= local8) {
					arg0.anInt1268 = 0;
					arg0.aClass45_544 = Static78.aClass45_929;
				} else {
					arg0.aClass45_544 = Static10.method217(Static56.aLongArray3[local8]).method1303();
					arg0.anInt1268 = 1;
				}
			}
		} else if (local8 == 503) {
			arg0.anInt1232 = Static69.anInt1993 * 15 + 20;
			if (arg0.anInt1243 >= arg0.anInt1232) {
				arg0.anInt1232 = arg0.anInt1243 + 1;
			}
		} else if (local8 == 324) {
			if (Static19.anInt628 == -1) {
				Static17.anInt531 = arg0.anInt1299;
				Static19.anInt628 = arg0.anInt1237;
			}
			if (Static34.aClass32_1.aBoolean56) {
				arg0.anInt1237 = Static19.anInt628;
			} else {
				arg0.anInt1237 = Static17.anInt531;
			}
		} else if (local8 == 325) {
			if (Static19.anInt628 == -1) {
				Static17.anInt531 = arg0.anInt1299;
				Static19.anInt628 = arg0.anInt1237;
			}
			if (Static34.aClass32_1.aBoolean56) {
				arg0.anInt1237 = Static17.anInt531;
			} else {
				arg0.anInt1237 = Static19.anInt628;
			}
		} else if (local8 == 327) {
			arg0.anInt1266 = 150;
			arg0.anInt1235 = (int) (Math.sin((double) Static3.anInt94 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1254 = 0;
			arg0.anInt1291 = 5;
		} else if (local8 == 328) {
			arg0.anInt1266 = 150;
			arg0.anInt1235 = (int) (Math.sin((double) Static3.anInt94 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1291 = 5;
			arg0.anInt1254 = 1;
		} else if (local8 == 600) {
			arg0.aClass45_544 = Static39.method1443(new Class45[] { Static78.aClass45_922, Static16.aClass45_225 });
		} else if (local8 == 620) {
			if (Static84.anInt2332 < 1) {
				arg0.aClass45_544 = Static78.aClass45_929;
			} else if (Static14.aBoolean13) {
				arg0.aClass45_544 = Static33.aClass45_471;
				arg0.anInt1233 = 16711680;
			} else {
				arg0.anInt1233 = 16777215;
				arg0.aClass45_544 = Static41.aClass45_963;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
	public static void method544() {
		aClass45_372 = null;
		aClass45_376 = null;
		aClass45_377 = null;
		aClass45_375 = null;
		aClass45_374 = null;
		aLongArray1 = null;
		aClass67_7 = null;
		anIntArray130 = null;
		aClass45_373 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public static void method545() {
		for (@Pc(11) Class5_Sub11 local11 = (Class5_Sub11) Static48.aClass10_7.method230(); local11 != null; local11 = (Class5_Sub11) Static48.aClass10_7.method233()) {
			if (local11.aClass5_Sub2_Sub7_1 != null) {
				local11.method977();
			}
		}
	}
}
