import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ja", name = "Q", descriptor = "[I")
	public static int[] anIntArray230;

	@OriginalMember(owner = "client!ja", name = "U", descriptor = "Lclient!jd;")
	public static Class34 aClass34_3;

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "Lclient!sc;")
	public static Class66 aClass66_817 = Static106.method1849("<)4col> x");

	@OriginalMember(owner = "client!ja", name = "C", descriptor = "Lclient!sc;")
	public static Class66 aClass66_818 = Static106.method1849("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!ja", name = "D", descriptor = "Lclient!sc;")
	private static Class66 aClass66_819 = Static106.method1849("Login limit exceeded)3");

	@OriginalMember(owner = "client!ja", name = "E", descriptor = "Lclient!sc;")
	public static Class66 aClass66_820 = Static106.method1849("AUS");

	@OriginalMember(owner = "client!ja", name = "F", descriptor = "[[S")
	public static short[][] aShortArrayArray6 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ja", name = "I", descriptor = "I")
	public static int anInt1509 = 0;

	@OriginalMember(owner = "client!ja", name = "K", descriptor = "Lclient!sc;")
	private static Class66 aClass66_822 = Static106.method1849("K");

	@OriginalMember(owner = "client!ja", name = "J", descriptor = "Lclient!sc;")
	public static Class66 aClass66_821 = aClass66_822;

	@OriginalMember(owner = "client!ja", name = "L", descriptor = "Lclient!sc;")
	public static Class66 aClass66_823 = Static106.method1849("Clientscript error in: ");

	@OriginalMember(owner = "client!ja", name = "N", descriptor = "Lclient!sc;")
	public static Class66 aClass66_824 = aClass66_822;

	@OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
	public static final int anInt1511 = 20;

	@OriginalMember(owner = "client!ja", name = "P", descriptor = "Lclient!sc;")
	public static Class66 aClass66_825 = Static106.method1849("Lade Sprites )2 ");

	@OriginalMember(owner = "client!ja", name = "T", descriptor = "Lclient!sc;")
	public static Class66 aClass66_827 = aClass66_819;

	@OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
	public static int anInt1513 = 0;

	@OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
	public static int anInt1515 = 0;

	@OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
	public static int anInt1516 = -1;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLclient!he;)V")
	public static void method1058(@OriginalArg(1) Class1_Sub10 arg0) {
		@Pc(11) int local11 = arg0.anInt1329;
		if (local11 == 324) {
			if (Static122.anInt2833 == -1) {
				Static122.anInt2833 = arg0.anInt1392;
				Static6.anInt314 = arg0.anInt1330;
			}
			if (Static112.aClass38_2.aBoolean71) {
				arg0.anInt1392 = Static122.anInt2833;
			} else {
				arg0.anInt1392 = Static6.anInt314;
			}
		} else if (local11 == 325) {
			if (Static122.anInt2833 == -1) {
				Static6.anInt314 = arg0.anInt1330;
				Static122.anInt2833 = arg0.anInt1392;
			}
			if (Static112.aClass38_2.aBoolean71) {
				arg0.anInt1392 = Static6.anInt314;
			} else {
				arg0.anInt1392 = Static122.anInt2833;
			}
		} else if (local11 == 327) {
			arg0.anInt1402 = 150;
			arg0.anInt1355 = (int) (Math.sin((double) Static22.anInt636 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1337 = 0;
			arg0.anInt1376 = 5;
		} else if (local11 == 328) {
			arg0.anInt1402 = 150;
			arg0.anInt1355 = (int) (Math.sin((double) Static22.anInt636 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1376 = 5;
			arg0.anInt1337 = 1;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Z")
	public static boolean method1059(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLclient!sc;B)V")
	public static void method1060(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class66 arg1) {
		@Pc(24) int local24 = Static114.aClass1_Sub1_Sub2_Sub2_Sub1_4.method774(arg1, 250);
		@Pc(31) int local31 = Static114.aClass1_Sub1_Sub2_Sub2_Sub1_4.method780(arg1, 250) * 13;
		Static115.method1670(6, 6, local24 + 8, local31 + 4 + 4, 0);
		Static115.method1662(6, 6, local24 + 8, 4 + 4 + local31, 16777215);
		Static114.aClass1_Sub1_Sub2_Sub2_Sub1_4.method773(arg1, 10, 10, local24, local31, 16777215, -1, 1, 1, 0);
		Static14.method408(6, local24 + 4 + 4, local31 + 8, 6);
		if (!arg0) {
			Static27.method550(local24, 10, local31, 10);
			return;
		}
		try {
			@Pc(116) Graphics local116 = Static104.aCanvas1.getGraphics();
			Static3.aClass6_1.method906(local116);
		} catch (@Pc(124) Exception local124) {
			Static104.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V")
	public static void method1061() {
		aShortArrayArray6 = null;
		aClass66_825 = null;
		aClass66_819 = null;
		aClass34_3 = null;
		aClass66_822 = null;
		anIntArray230 = null;
		aClass66_817 = null;
		aClass66_820 = null;
		aClass66_824 = null;
		aClass66_818 = null;
		aClass66_827 = null;
		aClass66_823 = null;
		aClass66_821 = null;
	}
}
