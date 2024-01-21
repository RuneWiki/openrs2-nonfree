import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!mh", name = "T", descriptor = "[Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4[] aClass3_Sub1_Sub3_Sub4Array8;

	@OriginalMember(owner = "client!mh", name = "ab", descriptor = "I")
	public static int anInt2353;

	@OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
	public static int anInt2351 = 0;

	@OriginalMember(owner = "client!mh", name = "W", descriptor = "Lclient!b;")
	public static Class7 aClass7_17 = new Class7(64);

	@OriginalMember(owner = "client!mh", name = "Y", descriptor = "Z")
	public static boolean aBoolean157 = false;

	@OriginalMember(owner = "client!mh", name = "Z", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1344 = Static122.method531(" )2>");

	@OriginalMember(owner = "client!mh", name = "bb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1345 = Static122.method531("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!mh", name = "cb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1346 = Static122.method531("T");

	@OriginalMember(owner = "client!mh", name = "db", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1347 = Static122.method531("::clientdrop");

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)V")
	public static void method1815() {
		aClass3_Sub1_Sub3_Sub4Array8 = null;
		aClass73_1344 = null;
		aClass73_1345 = null;
		aClass7_17 = null;
		aClass73_1346 = null;
		aClass73_1347 = null;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZLclient!sd;)V")
	public static void method1816(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class73 arg1) {
		@Pc(19) int local19 = Static82.aClass3_Sub1_Sub3_Sub1_Sub1_1.method1077(arg1, 250);
		@Pc(26) int local26 = Static82.aClass3_Sub1_Sub3_Sub1_Sub1_1.method1052(arg1, 250) * 13;
		Static15.method2297(6, 6, local19 + 8, 4 + 4 + local26, 0);
		Static15.method2303(6, 6, local19 + 4 + 4, local26 + 4 + 4, 16777215);
		Static82.aClass3_Sub1_Sub3_Sub1_Sub1_1.method1070(arg1, 10, 10, local19, local26, 16777215, -1, 1, 1, 0);
		Static23.method500(local26 + 8, 6, 6, local19 + 4 + 4);
		if (!arg0) {
			Static143.method2384(local26, 10, 10, local19);
			return;
		}
		try {
			@Pc(114) Graphics local114 = Static102.aCanvas1.getGraphics();
			Static87.aClass30_1.method2026(local114);
		} catch (@Pc(122) Exception local122) {
			Static102.aCanvas1.repaint();
		}
	}
}
