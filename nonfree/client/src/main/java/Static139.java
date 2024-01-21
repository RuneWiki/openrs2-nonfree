import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!rc", name = "K", descriptor = "Lclient!ug;")
	public static Class8 aClass8_1;

	@OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
	public static int anInt3222;

	@OriginalMember(owner = "client!rc", name = "cb", descriptor = "Lclient!eh;")
	public static Class12 aClass12_2;

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1116 = Static65.method1172("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1115 = aClass46_1116;

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
	public static int anInt3221 = 0;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "[I")
	public static int[] anIntArray371 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!rc", name = "R", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1117 = Static65.method1172("Sorry invited players only)3");

	@OriginalMember(owner = "client!rc", name = "W", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1118 = aClass46_1117;

	@OriginalMember(owner = "client!rc", name = "bb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1119 = Static65.method1172("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!kb;ZI)V")
	public static void method2339(@OriginalArg(0) Class46 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(18) int local18 = Static24.aClass3_Sub2_Sub3_Sub1_Sub1_2.method811(arg0, 250);
		@Pc(25) int local25 = Static24.aClass3_Sub2_Sub3_Sub1_Sub1_2.method829(arg0, 250) * 13;
		Static103.method2210(6, 6, local18 + 4 + 4, local25 - -4 + 4, 0);
		Static103.method2228(6, 6, local18 + 4 + 4, local25 - -8, 16777215);
		Static24.aClass3_Sub2_Sub3_Sub1_Sub1_2.method819(arg0, 10, 10, local18, local25, 16777215, -1, 1, 1, 0);
		Static66.method1174(6, 6, local25 + 4 + 4, local18 - -4 + 4);
		if (!arg1) {
			Static126.method2150(10, local18, 10, local25);
			return;
		}
		try {
			@Pc(110) Graphics local110 = Static100.aCanvas1.getGraphics();
			aClass8_1.method524(local110);
		} catch (@Pc(118) Exception local118) {
			Static100.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(JI)V")
	public static void method2341(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static52.anInt1391; local12++) {
			if (arg0 == Static133.aLongArray2[local12]) {
				Static52.anInt1391--;
				for (@Pc(34) int local34 = local12; local34 < Static52.anInt1391; local34++) {
					Static158.aClass46Array23[local34] = Static158.aClass46Array23[local34 + 1];
					Static99.anIntArray246[local34] = Static99.anIntArray246[local34 + 1];
					Static133.aLongArray2[local34] = Static133.aLongArray2[local34 + 1];
					Static180.anIntArray441[local34] = Static180.anIntArray441[local34 + 1];
				}
				Static16.anInt418 = Static178.anInt3928;
				Static133.aClass3_Sub4_Sub1_3.method233(208);
				Static133.aClass3_Sub4_Sub1_3.method201(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method2345(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static156.aClass70_1);
		arg0.removeMouseMotionListener(Static156.aClass70_1);
		arg0.removeFocusListener(Static156.aClass70_1);
		Static55.anInt1456 = 0;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(Z)V")
	public static void method2346() {
		aClass46_1115 = null;
		anIntArray371 = null;
		aClass8_1 = null;
		aClass46_1119 = null;
		aClass46_1117 = null;
		aClass46_1118 = null;
		aClass46_1116 = null;
		aClass12_2 = null;
	}
}
