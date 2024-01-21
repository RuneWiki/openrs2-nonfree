import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Lclient!wa;")
	public static Class79 aClass79_1;

	@OriginalMember(owner = "client!g", name = "r", descriptor = "I")
	public static int anInt1051;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	public static int anInt1044 = 0;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "Lclient!af;")
	public static Class5 aClass5_488 = Static45.method1937("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!g", name = "d", descriptor = "[I")
	public static int[] anIntArray182 = new int[2000];

	@OriginalMember(owner = "client!g", name = "e", descriptor = "[B")
	public static byte[] aByteArray22 = new byte[520];

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public static int anInt1046 = 0;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Lclient!af;")
	private static Class5 aClass5_491 = Static45.method1937("Please wait)3)3)3");

	@OriginalMember(owner = "client!g", name = "g", descriptor = "Lclient!af;")
	public static Class5 aClass5_489 = aClass5_491;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "I")
	public static int anInt1047 = 0;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!af;")
	public static Class5 aClass5_490 = Static45.method1937("0(U");

	@OriginalMember(owner = "client!g", name = "m", descriptor = "[I")
	public static int[] anIntArray183 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Lclient!af;")
	public static Class5 aClass5_492 = Static45.method1937("::fpson");

	@OriginalMember(owner = "client!g", name = "q", descriptor = "I")
	public static int anInt1050 = 0;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "Lclient!af;")
	public static Class5 aClass5_493 = Static45.method1937("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public static void method780() {
		aByteArray22 = null;
		aClass5_491 = null;
		anIntArray182 = null;
		aClass5_493 = null;
		anIntArray183 = null;
		aClass79_1 = null;
		aClass5_490 = null;
		aClass5_489 = null;
		aClass5_488 = null;
		aClass5_492 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Lclient!be;")
	public static Class8 method782() {
		try {
			return (Class8) Class.forName("Class8_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class8_Sub1();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!af;Z)V")
	public static void method783(@OriginalArg(1) Class5 arg0, @OriginalArg(2) boolean arg1) {
		Static33.method1984(6, 6, 200, 30, 0);
		Static33.method1979(6, 6, 200, 30, 16777215);
		Static124.aClass1_Sub3_Sub1_Sub1_4.method153(arg0, 6, 6, 200, 30, 16777215, -1, 1, 1, 0);
		Static98.method1648(6, 6, 200, 30);
		if (!arg1) {
			Static129.method2253(200, 30, 6, 6);
			return;
		}
		try {
			@Pc(54) Graphics local54 = Static12.aCanvas3.getGraphics();
			Static90.aClass43_1.method2199(local54);
		} catch (@Pc(62) Exception local62) {
			Static12.aCanvas3.repaint();
		}
	}
}
