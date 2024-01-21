import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!hc", name = "eb", descriptor = "Lclient!c;")
	public static Class10 aClass10_57;

	@OriginalMember(owner = "client!hc", name = "U", descriptor = "J")
	public static volatile long aLong84 = 0L;

	@OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
	public static int anInt1515 = 0;

	@OriginalMember(owner = "client!hc", name = "cb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_433 = Static38.method685("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!hc", name = "db", descriptor = "Lclient!ai;")
	public static Class6 aClass6_434 = Static38.method685("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BZZ)I")
	public static int method977() {
		return Static161.anInt3790 + Static77.anInt1912;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZLclient!ai;)V")
	public static void method978(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class6 arg1) {
		@Pc(23) int local23 = Static120.aClass2_Sub3_Sub2_Sub4_Sub1_6.method2523(arg1, 250);
		@Pc(30) int local30 = Static120.aClass2_Sub3_Sub2_Sub4_Sub1_6.method2504(arg1, 250) * 13;
		Static53.method2496(6, 6, local23 + 4 + 4, local30 - -4 + 4, 0);
		Static53.method2501(6, 6, local23 + 4 + 4, local30 - -4 + 4, 16777215);
		Static120.aClass2_Sub3_Sub2_Sub4_Sub1_6.method2522(arg1, 10, 10, local23, local30, 16777215, -1, 1, 1, 0);
		Static133.method2089(6, local23 + 4 + 4, local30 + 4 + 4, 6);
		if (!arg0) {
			Static151.method2325(10, local23, local30, 10);
			return;
		}
		try {
			@Pc(118) Graphics local118 = Static121.aCanvas1.getGraphics();
			Static168.aClass67_1.method2705(local118);
		} catch (@Pc(126) Exception local126) {
			Static121.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V")
	public static void method979() {
		Static170.aClass17_28.method509();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIZ)I")
	public static int method980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)V")
	public static void method981() {
		aClass10_57 = null;
		aClass6_433 = null;
		aClass6_434 = null;
	}
}
