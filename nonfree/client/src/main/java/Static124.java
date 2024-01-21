import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "Lclient!wb;")
	public static Class2_Sub17 aClass2_Sub17_6;

	@OriginalMember(owner = "client!wa", name = "D", descriptor = "J")
	public static long aLong92;

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1196 = Static2.method59("backbase1");

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1197 = Static2.method59("::");

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
	public static int anInt3134 = -1;

	@OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
	public static int anInt3137 = 0;

	@OriginalMember(owner = "client!wa", name = "v", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1199 = Static2.method59("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!wa", name = "u", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1198 = aClass80_1199;

	@OriginalMember(owner = "client!wa", name = "E", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1201 = Static2.method59("Existing User");

	@OriginalMember(owner = "client!wa", name = "x", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1200 = aClass80_1201;

	@OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
	public static int anInt3139 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	public static void method1977() {
		aClass80_1198 = null;
		aClass80_1197 = null;
		aClass2_Sub17_6 = null;
		aClass80_1201 = null;
		aClass80_1196 = null;
		aClass80_1199 = null;
		aClass80_1200 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!wb;B)Lclient!wd;")
	public static Class80 method1978(@OriginalArg(0) Class2_Sub17 arg0) {
		return Static21.method488(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public static void method1980() {
		try {
			@Pc(6) Graphics local6 = Static119.aCanvas2.getGraphics();
			Static79.aClass22_14.method1065(local6, 4, 0);
			Static127.aClass22_20.method1065(local6, 357, 0);
			Static97.aClass22_17.method1065(local6, 4, 722);
			Static86.aClass22_16.method1065(local6, 205, 743);
			Static18.aClass22_3.method1065(local6, 0, 0);
			Static16.aClass22_2.method1065(local6, 4, 516);
			Static32.aClass22_6.method1065(local6, 205, 516);
			Static1.aClass22_1.method1065(local6, 357, 496);
			Static25.aClass22_5.method1065(local6, 338, 0);
		} catch (@Pc(67) Exception local67) {
			Static119.aCanvas2.repaint();
		}
	}
}
