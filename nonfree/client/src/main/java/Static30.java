import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "[Lclient!qb;")
	public static Class3_Sub1_Sub4_Sub3[] aClass3_Sub1_Sub4_Sub3Array7;

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "Lclient!he;")
	public static Class26 aClass26_464 = Static6.method100("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ef", name = "D", descriptor = "[I")
	public static int[] anIntArray97 = new int[2000];

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "Lclient!he;")
	public static Class26 aClass26_465 = Static6.method100("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!ef", name = "N", descriptor = "J")
	public static long aLong26 = 0L;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLclient!he;B)V")
	public static void method555(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class26 arg1) {
		@Pc(24) int local24 = Static91.aClass3_Sub1_Sub4_Sub2_Sub1_3.method1608(arg1, 250);
		@Pc(31) int local31 = Static91.aClass3_Sub1_Sub4_Sub2_Sub1_3.method1610(arg1, 250) * 13;
		Static77.method2214(6, 6, local24 + 8, local31 + 4 - -4, 0);
		Static77.method2228(6, 6, local24 + 4 + 4, local31 + 4 - -4, 16777215);
		Static91.aClass3_Sub1_Sub4_Sub2_Sub1_3.method1606(arg1, 10, 10, local24, local31, 16777215, -1, 1, 1, 0);
		Static118.method2126(6, local24 + 4 + 4, 6, local31 + 4 + 4);
		if (!arg0) {
			Static110.method2003(10, local24, local31, 10);
			return;
		}
		try {
			@Pc(108) Graphics local108 = Static58.aCanvas1.getGraphics();
			Static102.aClass6_1.method881(local108);
		} catch (@Pc(116) Exception local116) {
			Static58.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(ZI)Z")
	public static boolean method570(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
	public static void method577() {
		aClass26_465 = null;
		aClass3_Sub1_Sub4_Sub3Array7 = null;
		anIntArray97 = null;
		aClass26_464 = null;
	}
}
