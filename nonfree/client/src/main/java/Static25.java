import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Lclient!oe;")
	public static Class58 aClass58_21 = new Class58(4096);

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!u;")
	public static Class74 aClass74_516 = Static72.method1077("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1");

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "Lclient!u;")
	private static Class74 aClass74_523 = Static72.method1077("Enter object name");

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "Lclient!u;")
	public static Class74 aClass74_517 = aClass74_523;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "Lclient!u;")
	public static Class74 aClass74_518 = Static72.method1077(")3");

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "[I")
	public static int[] anIntArray69 = new int[1000];

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "[S")
	public static short[] aShortArray3 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "Lclient!u;")
	private static Class74 aClass74_520 = Static72.method1077("Loading sprites )2 ");

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Lclient!u;")
	public static Class74 aClass74_519 = aClass74_520;

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "Lclient!u;")
	private static Class74 aClass74_525 = Static72.method1077("flash3:");

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "Lclient!u;")
	public static Class74 aClass74_521 = aClass74_525;

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "Lclient!u;")
	public static Class74 aClass74_522 = aClass74_525;

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "Lclient!u;")
	public static Class74 aClass74_524 = Static72.method1077("backbase2");

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "Lclient!u;")
	public static Class74 aClass74_526 = null;

	@OriginalMember(owner = "client!ea", name = "C", descriptor = "Lclient!u;")
	public static Class74 aClass74_527 = Static72.method1077("weiss:");

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)[Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1[] method493() {
		@Pc(4) Class2_Sub2_Sub1_Sub1[] local4 = new Class2_Sub2_Sub1_Sub1[Static46.anInt1064];
		for (@Pc(6) int local6 = 0; local6 < Static46.anInt1064; local6++) {
			@Pc(16) Class2_Sub2_Sub1_Sub1 local16 = local4[local6] = new Class2_Sub2_Sub1_Sub1();
			local16.anInt120 = Static66.anInt1466;
			local16.anInt117 = Static41.anInt966;
			local16.anInt121 = Static51.anIntArray312[local6];
			local16.anInt119 = Static91.anIntArray265[local6];
			local16.anInt116 = Static71.anIntArray194[local6];
			local16.anInt118 = Static17.anIntArray54[local6];
			local16.anIntArray17 = Static57.anIntArray156;
			local16.aByteArray1 = Static24.aByteArrayArray3[local6];
		}
		Static37.method1354();
		return local4;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!u;ILclient!g;Lclient!u;)[Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1[] method494(@OriginalArg(0) Class74 arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class74 arg2) {
		@Pc(8) int local8 = arg1.method1351(arg0);
		@Pc(19) int local19 = arg1.method1374(local8, arg2);
		return Static81.method1263(arg1, local19, local8);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!g;ZLclient!g;)V")
	public static void method495(@OriginalArg(0) Class26 arg0, @OriginalArg(2) Class26 arg1) {
		Static47.aClass26_8 = arg1;
		Static4.aClass26_1 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!cc;BIII)V")
	public static void method496(@OriginalArg(0) Class2_Sub2_Sub1_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static37.aClass9_43.method1589();
		Static90.aClass2_Sub2_Sub1_Sub1_38.method97(0, 0);
		arg0.method317(Static1.aClass74_1408, 55, 28, 16777215, true);
		if (arg3 == 0) {
			arg0.method317(Static67.aClass74_1038, 55, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg0.method317(Static49.aClass74_848, 55, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg0.method317(Static72.aClass74_1098, 55, 41, 16711680, true);
		}
		if (arg3 == 3) {
			arg0.method317(Static99.aClass74_1424, 55, 41, 65535, true);
		}
		arg0.method317(Static103.aClass74_1478, 184, 28, 16777215, true);
		if (arg2 == 0) {
			arg0.method317(Static67.aClass74_1038, 184, 41, 65280, true);
		}
		if (arg2 == 1) {
			arg0.method317(Static49.aClass74_848, 184, 41, 16776960, true);
		}
		if (arg2 == 2) {
			arg0.method317(Static72.aClass74_1098, 184, 41, 16711680, true);
		}
		arg0.method317(Static109.aClass74_1525, 324, 28, 16777215, true);
		if (arg1 == 0) {
			arg0.method317(Static67.aClass74_1038, 324, 41, 65280, true);
		}
		if (arg1 == 1) {
			arg0.method317(Static49.aClass74_848, 324, 41, 16776960, true);
		}
		if (arg1 == 2) {
			arg0.method317(Static72.aClass74_1098, 324, 41, 16711680, true);
		}
		arg0.method311(Static105.aClass74_1484, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			@Pc(168) Graphics local168 = Static51.aCanvas2.getGraphics();
			Static37.aClass9_43.method1585(453, local168, 0);
		} catch (@Pc(176) Exception local176) {
			Static51.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!u;Lclient!u;ILclient!g;)[Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2[] method497(@OriginalArg(0) Class74 arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(3) Class26 arg2) {
		@Pc(16) int local16 = arg2.method1351(arg0);
		@Pc(22) int local22 = arg2.method1374(local16, arg1);
		return Static49.method800(arg2, local22, local16);
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
	public static void method498() {
		aClass74_527 = null;
		aClass74_516 = null;
		aClass74_518 = null;
		aClass74_522 = null;
		aClass74_526 = null;
		aClass74_524 = null;
		aClass74_519 = null;
		aClass74_517 = null;
		aClass74_525 = null;
		anIntArray69 = null;
		aClass58_21 = null;
		aShortArray3 = null;
		aClass74_520 = null;
		aClass74_521 = null;
		aClass74_523 = null;
	}
}
