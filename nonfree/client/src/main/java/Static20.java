import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!da", name = "K", descriptor = "Lclient!pe;")
	public static Class65 aClass65_247 = Static119.method1462("Ausw-=hlen");

	@OriginalMember(owner = "client!da", name = "L", descriptor = "Lclient!pe;")
	private static Class65 aClass65_248 = Static119.method1462("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!da", name = "M", descriptor = "I")
	public static int anInt505 = -1;

	@OriginalMember(owner = "client!da", name = "N", descriptor = "I")
	public static int anInt506 = 0;

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "[S")
	public static short[] aShortArray1 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!da", name = "T", descriptor = "Lclient!pe;")
	public static Class65 aClass65_249 = aClass65_248;

	@OriginalMember(owner = "client!da", name = "U", descriptor = "Lclient!pe;")
	public static Class65 aClass65_250 = Static119.method1462("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!da", name = "bb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_251 = Static119.method1462(":assist:");

	@OriginalMember(owner = "client!da", name = "fb", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[104][104];

	@OriginalMember(owner = "client!da", name = "hb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_252 = Static119.method1462("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!da", name = "ib", descriptor = "Lclient!pe;")
	public static Class65 aClass65_253 = Static119.method1462(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!da", name = "jb", descriptor = "I")
	public static int anInt520 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!pe;ZB)V")
	public static void method338(@OriginalArg(0) Class65 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(10) int local10 = Static127.aClass2_Sub1_Sub4_Sub3_Sub1_4.method2082(arg0, 250);
		@Pc(22) int local22 = Static127.aClass2_Sub1_Sub4_Sub3_Sub1_4.method2096(arg0, 250) * 13;
		Static118.method2081(6, 6, local10 + 8, local22 + 4 - -4, 0);
		Static118.method2078(6, 6, local10 + 4 + 4, local22 - -4 + 4, 16777215);
		Static127.aClass2_Sub1_Sub4_Sub3_Sub1_4.method2105(arg0, 10, 10, local10, local22, 16777215, -1, 1, 1, 0);
		Static7.method151(local22 + 4 + 4, local10 - -4 + 4, 6, 6);
		if (!arg1) {
			Static116.method1852(10, 10, local10, local22);
			return;
		}
		try {
			@Pc(111) Graphics local111 = Static115.aCanvas1.getGraphics();
			Static59.aClass6_1.method1601(local111);
		} catch (@Pc(119) Exception local119) {
			Static115.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(B)V")
	public static void method341() {
		Static100.aClass8_50.method171();
		Static117.aClass8_57.method171();
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)Z")
	public static boolean method343(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(19) int local19 = Static126.anIntArray355[arg0];
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		return local19 == 1003;
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(B)V")
	public static void method344() {
		aClass65_248 = null;
		aShortArray1 = null;
		aClass65_249 = null;
		aClass65_251 = null;
		anIntArrayArray1 = null;
		aClass65_250 = null;
		aClass65_247 = null;
		aClass65_252 = null;
		aClass65_253 = null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)Lclient!pe;")
	public static Class65 method345(@OriginalArg(0) int arg0) {
		@Pc(7) Class65 local7 = Static120.method1871(arg0);
		for (@Pc(13) int local13 = local7.method1502() - 3; local13 > 0; local13 -= 3) {
			local7 = Static35.method647(new Class65[] { local7.method1476(local13, 0), Static62.aClass65_657, local7.method1501(local13) });
		}
		if (local7.method1502() > 9) {
			return Static35.method647(new Class65[] { Static8.aClass65_99, local7.method1476(local7.method1502() - 8, 0), Static95.aClass65_904, Static33.aClass65_366, local7, Static103.aClass65_988 });
		} else if (local7.method1502() > 6) {
			return Static35.method647(new Class65[] { Static111.aClass65_1055, local7.method1476(local7.method1502() - 4, 0), Static115.aClass65_1091, Static33.aClass65_366, local7, Static103.aClass65_988 });
		} else {
			return Static35.method647(new Class65[] { Static83.aClass65_788, local7, Static77.aClass65_739 });
		}
	}
}
