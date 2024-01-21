import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
	public static int anInt1480;

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
	public static int anInt1481;

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "Lclient!k;")
	public static Class33 aClass33_24;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!ge;")
	public static Class21 aClass21_22 = new Class21(30);

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "Lclient!wb;")
	private static Class65 aClass65_685 = Static24.method441("Your account is already logged in)3");

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "Lclient!wb;")
	public static Class65 aClass65_683 = aClass65_685;

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "Z")
	public static boolean aBoolean83 = false;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "Lclient!wb;")
	public static Class65 aClass65_684 = Static24.method441("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5 = new int[4][13][13];

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
	public static int anInt1482 = 0;

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "Lclient!wb;")
	public static Class65 aClass65_686 = Static24.method441("compass");

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "Lclient!wb;")
	public static Class65 aClass65_687 = Static24.method441("redstone3");

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "Lclient!wb;")
	public static Class65 aClass65_688 = Static24.method441("Wen m-Ochten Sie der Liste hinzuf-Ugen?");

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "[[I")
	public static int[][] anIntArrayArray13 = new int[104][104];

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!k;I)[Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2[] method898(@OriginalArg(1) int arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) int arg2) {
		return Static23.method425(arg1, arg2, arg0) ? Static108.method1777() : null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 method899() {
		@Pc(7) Class2_Sub1_Sub4_Sub3 local7 = new Class2_Sub1_Sub4_Sub3();
		local7.anInt2451 = Static82.anInt2367;
		local7.anInt2446 = Static90.anInt1399;
		local7.anInt2447 = Static28.anIntArray110[0];
		local7.anInt2449 = Static17.anIntArray79[0];
		local7.anInt2448 = Static98.anIntArray404[0];
		local7.anInt2450 = Static24.anIntArray98[0];
		local7.anIntArray318 = Static28.anIntArray109;
		local7.aByteArray62 = Static101.aByteArrayArray9[0];
		Static13.method284();
		return local7;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
	public static void method900() {
		Static61.method1080(Static96.anInt2688);
		if (Static46.anInt1375 != -1) {
			Static61.method1080(Static46.anInt1375);
		}
		Static28.anInt794 = 0;
		Static46.aClass15_34.method1098();
		Static56.anIntArray223 = Static10.method243(Static56.anIntArray223);
		Static43.method1808();
		Static76.method1305(0, 0, -1, 0, Static96.anInt2688, 0, 765, 503);
		if (Static46.anInt1375 != -1) {
			Static76.method1305(0, 0, -1, 0, Static46.anInt1375, 0, 765, 503);
		}
		if (aBoolean83) {
			Static7.method153();
		} else {
			Static67.method1209();
			Static95.method1176();
		}
		try {
			@Pc(67) Graphics local67 = Static70.aCanvas1.getGraphics();
			Static46.aClass15_34.method1104(0, local67, 0);
		} catch (@Pc(75) Exception local75) {
			Static70.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)V")
	public static void method901() {
		aClass65_685 = null;
		aClass65_686 = null;
		anIntArrayArray13 = null;
		anIntArrayArrayArray5 = null;
		aClass65_687 = null;
		aClass33_24 = null;
		aClass21_22 = null;
		aClass65_684 = null;
		aClass65_688 = null;
		aClass65_683 = null;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method902() {
		if (Static78.aClass14_2 == null) {
			return;
		}
		if (Static27.anInt785 < 0) {
			if (Static39.anInt1240 > 0) {
				Static39.anInt1240--;
				if (Static39.anInt1240 == 0) {
					if (Static74.aByteArray44 == null) {
						Static78.aClass14_2.method1557(256);
					} else {
						Static78.aClass14_2.method1557(Static12.anInt414);
						Static27.anInt785 = Static12.anInt414;
						Static78.aClass14_2.method1555(Static74.aByteArray44, Static12.anInt414, Static6.aBoolean20);
						Static74.aByteArray44 = null;
					}
					Static110.anInt2937 = 0;
				}
			}
		} else if (Static39.anInt1240 > 0) {
			Static110.anInt2937 += Static2.anInt109;
			Static78.aClass14_2.method1549(Static27.anInt785, Static110.anInt2937);
			Static39.anInt1240--;
			if (Static39.anInt1240 == 0) {
				Static78.aClass14_2.method1554();
				Static39.anInt1240 = 20;
				Static27.anInt785 = -1;
			}
		}
		Static78.aClass14_2.method1550();
	}
}
