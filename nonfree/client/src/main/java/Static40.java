import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
	public static int anInt953;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
	public static int anInt956;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
	public static int anInt958;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Lclient!u;")
	private static Class74 aClass74_686 = Static72.method1077("Enter message to send to ");

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "Lclient!u;")
	private static Class74 aClass74_692 = Static72.method1077("The server is being updated)3");

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Lclient!u;")
	public static Class74 aClass74_687 = aClass74_692;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "Lclient!u;")
	public static Class74 aClass74_688 = Static72.method1077("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "Lclient!u;")
	public static Class74 aClass74_689 = Static72.method1077("Standort");

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
	public static int anInt957 = 0;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_690 = aClass74_686;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Lclient!u;")
	public static Class74 aClass74_691 = Static72.method1077("chatback");

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "[I")
	public static int[] anIntArray110 = new int[32768];

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
	public static int anInt960 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public static void method664() {
		try {
			@Pc(2) Graphics local2 = Static51.aCanvas2.getGraphics();
			Static23.aClass9_14.method1585(4, local2, 0);
			Static68.aClass9_32.method1585(357, local2, 0);
			Static102.aClass9_51.method1585(4, local2, 722);
			Static99.aClass9_49.method1585(205, local2, 743);
			Static50.aClass9_25.method1585(0, local2, 0);
			Static72.aClass9_34.method1585(4, local2, 516);
			Static67.aClass9_31.method1585(205, local2, 516);
			Static83.aClass9_40.method1585(357, local2, 496);
			Static23.aClass9_13.method1585(338, local2, 0);
		} catch (@Pc(62) Exception local62) {
			Static51.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ve;I)[I")
	public static int[] method665(@OriginalArg(0) Class2_Sub2_Sub17 arg0) {
		@Pc(10) int local10 = arg0.anInt2794 >> 16;
		if (!Static77.method1209(local10)) {
			return null;
		}
		@Pc(21) int local21 = arg0.anInt2780;
		@Pc(24) int local24 = arg0.anInt2834;
		@Pc(37) Class2_Sub2_Sub17 local37;
		for (@Pc(27) int local27 = arg0.anInt2803; local27 != -1; local27 = local37.anInt2803) {
			local37 = Static89.aClass2_Sub2_Sub17ArrayArray1[local10][local27 & 0xFFFF];
			local21 += local37.anInt2780 - local37.anInt2832;
			local24 += local37.anInt2834 - local37.anInt2836;
		}
		return new int[] { local21, local24 };
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
	public static void method666() {
		anIntArray110 = null;
		aClass74_690 = null;
		aClass74_686 = null;
		aClass74_687 = null;
		aClass74_692 = null;
		aClass74_689 = null;
		aClass74_688 = null;
		aClass74_691 = null;
	}
}
