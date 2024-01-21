import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "Lclient!gd;")
	public static Class29_Sub1 aClass29_Sub1_51;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "B")
	public static byte aByte9;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public static int anInt3680 = 0;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1579 = Static51.method932("swe");

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Z")
	public static boolean aBoolean163 = false;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1580 = Static51.method932("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1581 = Static51.method932(":duelreq:");

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1582 = Static51.method932("nav");

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZILclient!cd;)V")
	public static void method2617(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class10 arg1) {
		@Pc(24) int local24 = Static13.aClass2_Sub1_Sub4_Sub1_Sub1_2.method524(arg1, 250);
		@Pc(31) int local31 = Static13.aClass2_Sub1_Sub4_Sub1_Sub1_2.method529(arg1, 250) * 13;
		Static172.method2026(6, 6, local24 + 4 + 4, local31 - -4 + 4, 0);
		Static172.method2018(6, 6, local24 + 4 + 4, local31 - -4 + 4, 16777215);
		Static13.aClass2_Sub1_Sub4_Sub1_Sub1_2.method522(arg1, 10, 10, local24, local31, 16777215, -1, 1, 1, 0);
		Static98.method1627(6, 6, local24 + 4 + 4, local31 + 8);
		if (!arg0) {
			Static64.method1128(local24, 10, local31, 10);
			return;
		}
		try {
			@Pc(111) Graphics local111 = Static25.aCanvas1.getGraphics();
			Static133.aClass40_1.method2106(local111);
		} catch (@Pc(119) Exception local119) {
			Static25.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public static void method2618() {
		aClass10_1582 = null;
		aClass10_1579 = null;
		aBooleanArray18 = null;
		aClass10_1581 = null;
		aClass29_Sub1_51 = null;
		aClass10_1580 = null;
	}
}
