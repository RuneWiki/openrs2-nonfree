import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ha", name = "S", descriptor = "[I")
	public static int[] anIntArray126;

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
	public static int anInt1555 = 0;

	@OriginalMember(owner = "client!ha", name = "V", descriptor = "Lclient!hh;")
	public static Class50 aClass50_516 = Static186.method3527("<col=ffffff>");

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLclient!hh;B)V")
	public static void method1123(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class50 arg1) {
		@Pc(24) int local24 = Static130.aClass1_Sub1_Sub10_2.method1822(arg1, 250);
		@Pc(31) int local31 = Static130.aClass1_Sub1_Sub10_2.method1829(arg1, 250) * 13;
		Static29.method423(6, 6, local24 + 4 + 4, local31 + 8, 0);
		Static29.method411(6, 6, local24 + 4 + 4, local31 + 4 - -4, 16777215);
		Static130.aClass1_Sub1_Sub10_2.method1818(arg1, 10, 10, local24, local31, 16777215, -1, 1, 1, 0);
		Static73.method2567(6, local31 + 4 + 4, local24 + 4 - -4, 6);
		if (!arg0) {
			Static109.method1729(10, local24, 10, local31);
			return;
		}
		try {
			@Pc(114) Graphics local114 = Static193.aCanvas4.getGraphics();
			Static133.aClass35_1.method3257(local114);
		} catch (@Pc(122) Exception local122) {
			Static193.aCanvas4.repaint();
		}
	}
}
