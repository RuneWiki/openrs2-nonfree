import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!g", name = "e", descriptor = "I")
	public static int anInt918;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!w;")
	public static Class15 aClass15_16;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "Lclient!he;")
	public static Class11 aClass11_25;

	@OriginalMember(owner = "client!g", name = "r", descriptor = "Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_7;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Lclient!va;")
	private static Class61 aClass61_362 = Static88.method1421("Your account is already logged in)3");

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Lclient!va;")
	private static Class61 aClass61_368 = Static88.method1421("Loading config )2 ");

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Lclient!va;")
	public static Class61 aClass61_363 = aClass61_368;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!i;")
	public static Class29 aClass29_25 = new Class29(50);

	@OriginalMember(owner = "client!g", name = "i", descriptor = "Lclient!va;")
	public static Class61 aClass61_364 = Static88.method1421(" )2>");

	@OriginalMember(owner = "client!g", name = "j", descriptor = "Lclient!va;")
	private static Class61 aClass61_365 = Static88.method1421("Login server offline)3");

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Lclient!va;")
	public static Class61 aClass61_366 = aClass61_362;

	@OriginalMember(owner = "client!g", name = "m", descriptor = "Lclient!va;")
	public static Class61 aClass61_367 = aClass61_365;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "I")
	public static int anInt922 = 0;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "[J")
	public static long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!g", name = "s", descriptor = "I")
	public static int anInt923 = 0;

	@OriginalMember(owner = "client!g", name = "t", descriptor = "[I")
	public static int[] anIntArray101 = new int[1000];

	@OriginalMember(owner = "client!g", name = "u", descriptor = "Lclient!va;")
	public static Class61 aClass61_369 = Static88.method1421("@or1@");

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IBII)I")
	public static int method551(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static21.aByteArrayArrayArray4[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static21.aByteArrayArrayArray4[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method552() {
		try {
			@Pc(11) Graphics local11 = Static38.aCanvas1.getGraphics();
			Static94.aClass15_35.method594(205, 553, local11);
		} catch (@Pc(19) Exception local19) {
			Static38.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!d;)V")
	public static void method553(@OriginalArg(1) Class10_Sub1_Sub4 arg0) {
		@Pc(8) int local8 = arg0.anInt600;
		@Pc(75) int local75;
		if (local8 >= 1 && local8 <= 100 || local8 >= 701 && local8 <= 800) {
			if (local8 == 1 && Static18.anInt611 == 0) {
				arg0.anInt581 = 0;
				arg0.aClass61_192 = Static36.aClass61_416;
			} else if (local8 == 1 && Static18.anInt611 == 1) {
				arg0.aClass61_192 = Static70.aClass61_1081;
				arg0.anInt581 = 0;
			} else if (local8 == 2 && Static18.anInt611 != 2) {
				arg0.aClass61_192 = Static104.aClass61_1061;
				arg0.anInt581 = 0;
			} else {
				local75 = Static6.anInt70;
				if (local8 > 700) {
					local8 -= 601;
				} else {
					local8--;
				}
				if (Static18.anInt611 != 2) {
					local75 = 0;
				}
				if (local8 >= local75) {
					arg0.aClass61_192 = Static15.aClass61_166;
					arg0.anInt581 = 0;
				} else {
					arg0.aClass61_192 = Static106.aClass61Array15[local8];
					arg0.anInt581 = 1;
				}
			}
		} else if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
			if (local8 > 800) {
				local8 -= 701;
			} else {
				local8 -= 101;
			}
			local75 = Static6.anInt70;
			if (Static18.anInt611 != 2) {
				local75 = 0;
			}
			if (local8 >= local75) {
				arg0.aClass61_192 = Static15.aClass61_166;
				arg0.anInt581 = 0;
			} else {
				if (Static33.anIntArray112[local8] == 0) {
					arg0.aClass61_192 = Static93.method1156(new Class61[] { Static71.aClass61_757, Static95.aClass61_976 });
				} else if (Static33.anIntArray112[local8] >= 5000) {
					if (Static33.anIntArray112[local8] == Static18.anInt614) {
						arg0.aClass61_192 = Static93.method1156(new Class61[] { Static20.aClass61_1075, Static51.aClass61_587, Static29.method529(Static33.anIntArray112[local8] - 5000) });
					} else {
						arg0.aClass61_192 = Static93.method1156(new Class61[] { Static76.aClass61_815, Static51.aClass61_587, Static29.method529(Static33.anIntArray112[local8] - 5000) });
					}
				} else if (Static18.anInt614 == Static33.anIntArray112[local8]) {
					arg0.aClass61_192 = Static93.method1156(new Class61[] { Static20.aClass61_1075, Static63.aClass61_174, Static29.method529(Static33.anIntArray112[local8]) });
				} else {
					arg0.aClass61_192 = Static93.method1156(new Class61[] { Static76.aClass61_815, Static63.aClass61_174, Static29.method529(Static33.anIntArray112[local8]) });
				}
				arg0.anInt581 = 1;
			}
		} else if (local8 == 203) {
			local75 = Static6.anInt70;
			if (Static18.anInt611 != 2) {
				local75 = 0;
			}
			arg0.anInt575 = local75 * 15 + 20;
			if (arg0.anInt575 <= arg0.anInt557) {
				arg0.anInt575 = arg0.anInt557 + 1;
			}
		} else if (local8 >= 401 && local8 <= 500) {
			local8 -= 401;
			if (local8 == 0 && Static18.anInt611 == 0) {
				arg0.anInt581 = 0;
				arg0.aClass61_192 = Static37.aClass61_437;
			} else if (local8 == 1 && Static18.anInt611 == 0) {
				arg0.anInt581 = 0;
				arg0.aClass61_192 = Static104.aClass61_1061;
			} else {
				local75 = Static80.anInt2155;
				if (Static18.anInt611 == 0) {
					local75 = 0;
				}
				if (local75 <= local8) {
					arg0.aClass61_192 = Static15.aClass61_166;
					arg0.anInt581 = 0;
				} else {
					arg0.aClass61_192 = Static78.method1234(Static57.aLongArray4[local8]).method1617();
					arg0.anInt581 = 1;
				}
			}
		} else if (local8 == 503) {
			arg0.anInt575 = Static80.anInt2155 * 15 + 20;
			if (arg0.anInt557 >= arg0.anInt575) {
				arg0.anInt575 = arg0.anInt557 + 1;
			}
		} else if (local8 == 327) {
			arg0.anInt582 = 150;
			arg0.anInt566 = (int) (Math.sin((double) Static95.anInt2442 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt560 = 5;
			arg0.anInt558 = 0;
		} else if (local8 == 324) {
			if (Static7.anInt87 == -1) {
				Static42.anInt2375 = arg0.anInt567;
				Static7.anInt87 = arg0.anInt555;
			}
			if (Static80.aClass44_2.aBoolean82) {
				arg0.anInt555 = Static7.anInt87;
			} else {
				arg0.anInt555 = Static42.anInt2375;
			}
		} else if (local8 == 325) {
			if (Static7.anInt87 == -1) {
				Static42.anInt2375 = arg0.anInt567;
				Static7.anInt87 = arg0.anInt555;
			}
			if (Static80.aClass44_2.aBoolean82) {
				arg0.anInt555 = Static42.anInt2375;
			} else {
				arg0.anInt555 = Static7.anInt87;
			}
		} else if (local8 == 600) {
			arg0.aClass61_192 = Static15.aClass61_144;
			if (Static95.anInt2442 % 20 < 10) {
				arg0.aClass61_192 = arg0.aClass61_192.method1612(124);
			} else {
				arg0.aClass61_192 = arg0.aClass61_192.method1612(32);
			}
		} else if (local8 == 620) {
			if (Static44.anInt1242 < 1) {
				arg0.aClass61_192 = Static15.aClass61_166;
			} else if (Static16.aBoolean23) {
				arg0.anInt605 = 16711680;
				arg0.aClass61_192 = Static104.aClass61_1052;
			} else {
				arg0.anInt605 = 16777215;
				arg0.aClass61_192 = Static51.aClass61_583;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public static void method554() {
		aClass61_369 = null;
		aClass10_Sub1_Sub1_Sub2_7 = null;
		aClass61_362 = null;
		aClass11_25 = null;
		aClass61_368 = null;
		aClass15_16 = null;
		aClass61_367 = null;
		aClass29_25 = null;
		aClass61_364 = null;
		aClass61_363 = null;
		aClass61_365 = null;
		aLongArray3 = null;
		anIntArray101 = null;
		aClass61_366 = null;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void method555() {
		Static23.aClass29_18.method646();
		Static93.aClass29_56.method646();
	}
}
