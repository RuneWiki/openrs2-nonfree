import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!g;")
	public static Class2_Sub5 aClass2_Sub5_4;

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "Lclient!le;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Z")
	public static boolean aBoolean99 = false;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
	public static int anInt2108 = 3;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!ke;")
	private static Class39 aClass39_943 = Static2.method66("Prepared sound engine");

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "Lclient!ke;")
	public static Class39 aClass39_942 = aClass39_943;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
	public static int anInt2110 = 0;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "[I")
	public static int[] anIntArray276 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
	public static int anInt2111 = 0;

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "Lclient!ke;")
	public static Class39 aClass39_944 = Static2.method66("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
	public static int anInt2113 = -1;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!ec;I)V")
	public static void method1514(@OriginalArg(0) Class2_Sub1_Sub6 arg0) {
		@Pc(2) int local2 = arg0.anInt722;
		@Pc(79) int local79;
		if ((local2 < 1 || local2 > 100) && (local2 < 701 || local2 > 800)) {
			if (local2 >= 101 && local2 <= 200 || local2 >= 801 && local2 <= 900) {
				if (local2 <= 800) {
					local2 -= 101;
				} else {
					local2 -= 701;
				}
				local79 = Static72.anInt2061;
				if (Static18.anInt526 != 2) {
					local79 = 0;
				}
				if (local2 >= local79) {
					arg0.anInt698 = 0;
					arg0.aClass39_341 = Static86.aClass39_1048;
				} else {
					if (Static45.anIntArray177[local2] == 0) {
						arg0.aClass39_341 = Static20.method431(new Class39[] { Static71.aClass39_899, Static16.aClass39_245 });
					} else if (Static45.anIntArray177[local2] < 5000) {
						if (Static88.anInt1141 == Static45.anIntArray177[local2]) {
							arg0.aClass39_341 = Static20.method431(new Class39[] { Static42.aClass39_536, Static92.aClass39_1098, Static31.method1267(Static45.anIntArray177[local2]) });
						} else {
							arg0.aClass39_341 = Static20.method431(new Class39[] { Static44.aClass39_547, Static92.aClass39_1098, Static31.method1267(Static45.anIntArray177[local2]) });
						}
					} else if (Static88.anInt1141 == Static45.anIntArray177[local2]) {
						arg0.aClass39_341 = Static20.method431(new Class39[] { Static42.aClass39_536, Static83.aClass39_1028, Static31.method1267(Static45.anIntArray177[local2] - 5000) });
					} else {
						arg0.aClass39_341 = Static20.method431(new Class39[] { Static44.aClass39_547, Static83.aClass39_1028, Static31.method1267(Static45.anIntArray177[local2] - 5000) });
					}
					arg0.anInt698 = 1;
				}
			} else if (local2 == 203) {
				local79 = Static72.anInt2061;
				if (Static18.anInt526 != 2) {
					local79 = 0;
				}
				arg0.anInt701 = local79 * 15 + 20;
				if (arg0.anInt701 <= arg0.anInt725) {
					arg0.anInt701 = arg0.anInt725 + 1;
				}
			} else if (local2 >= 401 && local2 <= 500) {
				local2 -= 401;
				if (local2 == 0 && Static18.anInt526 == 0) {
					arg0.aClass39_341 = Static71.aClass39_900;
					arg0.anInt698 = 0;
				} else if (local2 == 1 && Static18.anInt526 == 0) {
					arg0.anInt698 = 0;
					arg0.aClass39_341 = Static38.aClass39_501;
				} else {
					local79 = Static41.anInt1196;
					if (Static18.anInt526 == 0) {
						local79 = 0;
					}
					if (local79 <= local2) {
						arg0.anInt698 = 0;
						arg0.aClass39_341 = Static86.aClass39_1048;
					} else {
						arg0.aClass39_341 = Static24.method488(Static30.aLongArray3[local2]).method1120();
						arg0.anInt698 = 1;
					}
				}
			} else if (local2 == 503) {
				arg0.anInt701 = Static41.anInt1196 * 15 + 20;
				if (arg0.anInt725 >= arg0.anInt701) {
					arg0.anInt701 = arg0.anInt725 + 1;
				}
			} else if (local2 == 327) {
				arg0.anInt693 = 150;
				arg0.anInt724 = (int) (Math.sin((double) Static64.anInt1889 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt718 = 0;
				arg0.anInt711 = 5;
			} else if (local2 == 324) {
				if (Static65.anInt1900 == -1) {
					Static7.anInt148 = arg0.anInt708;
					Static65.anInt1900 = arg0.anInt739;
				}
				if (Static28.aClass35_1.aBoolean70) {
					arg0.anInt739 = Static65.anInt1900;
				} else {
					arg0.anInt739 = Static7.anInt148;
				}
			} else if (local2 == 325) {
				if (Static65.anInt1900 == -1) {
					Static7.anInt148 = arg0.anInt708;
					Static65.anInt1900 = arg0.anInt739;
				}
				if (Static28.aClass35_1.aBoolean70) {
					arg0.anInt739 = Static7.anInt148;
				} else {
					arg0.anInt739 = Static65.anInt1900;
				}
			} else if (local2 == 600) {
				arg0.aClass39_341 = Static20.method431(new Class39[] { Static86.aClass39_1050, Static7.aClass39_74 });
			} else if (local2 == 620) {
				if (anInt2111 < 1) {
					arg0.aClass39_341 = Static86.aClass39_1048;
				} else if (Static67.aBoolean96) {
					arg0.aClass39_341 = Static24.aClass39_318;
					arg0.anInt713 = 16711680;
				} else {
					arg0.anInt713 = 16777215;
					arg0.aClass39_341 = Static41.aClass39_517;
				}
			}
		} else if (local2 == 1 && Static18.anInt526 == 0) {
			arg0.anInt698 = 0;
			arg0.aClass39_341 = Static101.aClass39_1257;
		} else if (local2 == 1 && Static18.anInt526 == 1) {
			arg0.anInt698 = 0;
			arg0.aClass39_341 = Static53.aClass39_647;
		} else if (local2 == 2 && Static18.anInt526 != 2) {
			arg0.aClass39_341 = Static38.aClass39_501;
			arg0.anInt698 = 0;
		} else {
			if (local2 <= 700) {
				local2--;
			} else {
				local2 -= 601;
			}
			local79 = Static72.anInt2061;
			if (Static18.anInt526 != 2) {
				local79 = 0;
			}
			if (local79 <= local2) {
				arg0.aClass39_341 = Static86.aClass39_1048;
				arg0.anInt698 = 0;
			} else {
				arg0.aClass39_341 = Static75.aClass39Array4[local2];
				arg0.anInt698 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)Lclient!ua;")
	public static Class2_Sub1_Sub16 method1515(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub16 local10 = (Class2_Sub1_Sub16) Static8.aClass54_5.method1634((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static2.method51(arg0, Static15.aClass36_74, Static8.aClass36_7);
		if (local10 != null) {
			Static8.aClass54_5.method1637((long) arg0, local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
	public static void method1516() {
		try {
			@Pc(12) Graphics local12 = Static7.aCanvas1.getGraphics();
			Static94.aClass51_51.method1967(553, 205, local12);
		} catch (@Pc(20) Exception local20) {
			Static7.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)V")
	public static void method1517() {
		aClass39_944 = null;
		aClass43_1 = null;
		anIntArray276 = null;
		aClass39_942 = null;
		aClass39_943 = null;
		aClass2_Sub5_4 = null;
	}
}
