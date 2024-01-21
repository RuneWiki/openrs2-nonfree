import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!m", name = "y", descriptor = "I")
	public static int anInt1701;

	@OriginalMember(owner = "client!m", name = "B", descriptor = "Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_13;

	@OriginalMember(owner = "client!m", name = "D", descriptor = "Lclient!md;")
	public static Class40_Sub1 aClass40_Sub1_24;

	@OriginalMember(owner = "client!m", name = "O", descriptor = "Lclient!eb;")
	public static Class6_Sub2_Sub2_Sub2 aClass6_Sub2_Sub2_Sub2_9;

	@OriginalMember(owner = "client!m", name = "P", descriptor = "I")
	public static int anInt1710;

	@OriginalMember(owner = "client!m", name = "E", descriptor = "Lclient!rc;")
	private static Class55 aClass55_663 = Static34.method846("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!m", name = "t", descriptor = "Lclient!rc;")
	public static Class55 aClass55_661 = aClass55_663;

	@OriginalMember(owner = "client!m", name = "K", descriptor = "Lclient!rc;")
	private static Class55 aClass55_664 = Static34.method846("Username: ");

	@OriginalMember(owner = "client!m", name = "C", descriptor = "Lclient!rc;")
	public static Class55 aClass55_662 = aClass55_664;

	@OriginalMember(owner = "client!m", name = "F", descriptor = "I")
	public static int anInt1704 = 0;

	@OriginalMember(owner = "client!m", name = "H", descriptor = "I")
	public static int anInt1706 = 0;

	@OriginalMember(owner = "client!m", name = "I", descriptor = "[Lclient!he;")
	public static Class28[] aClass28Array1 = new Class28[50];

	@OriginalMember(owner = "client!m", name = "L", descriptor = "Lclient!rc;")
	public static Class55 aClass55_665 = Static34.method846("l");

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(B)V")
	public static void method1169() {
		aClass6_Sub2_Sub2_Sub2_9 = null;
		aClass55_664 = null;
		aClass55_663 = null;
		aClass55_661 = null;
		aClass55_662 = null;
		aClass55_665 = null;
		aClass6_Sub2_Sub2_Sub1_13 = null;
		aClass40_Sub1_24 = null;
		aClass28Array1 = null;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
	public static void method1170() {
		try {
			@Pc(11) Graphics local11 = Static32.aCanvas1.getGraphics();
			Static99.aClass21_20.method1442(17, local11, 357);
		} catch (@Pc(19) Exception local19) {
			Static32.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)I")
	public static int method1171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
	public static void method1172() {
		Static23.aClass36_12.method1155();
		Static29.aClass36_13.method1155();
	}
}
