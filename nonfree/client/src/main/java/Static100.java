import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!md", name = "N", descriptor = "[I")
	public static int[] anIntArray243;

	@OriginalMember(owner = "client!md", name = "D", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1010 = Static51.method932("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!md", name = "G", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1011 = Static51.method932("hitmarks");

	@OriginalMember(owner = "client!md", name = "H", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1012 = Static51.method932(")1");

	@OriginalMember(owner = "client!md", name = "I", descriptor = "Lclient!sa;")
	public static Class72 aClass72_19 = new Class72(50);

	@OriginalMember(owner = "client!md", name = "L", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1013 = Static51.method932("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!md", name = "M", descriptor = "Lclient!me;")
	public static Class53 aClass53_1 = new Class53();

	@OriginalMember(owner = "client!md", name = "O", descriptor = "Lclient!kg;")
	public static Class2_Sub11_Sub1 aClass2_Sub11_Sub1_2 = new Class2_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!md", name = "R", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1015 = Static51.method932("skill)2");

	@OriginalMember(owner = "client!md", name = "P", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1014 = aClass10_1015;

	@OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
	public static int anInt2340 = 0;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
	public static void method1657() {
		if (Static20.anIntArray37 != null && Static45.anIntArray135 != null) {
			return;
		}
		Static20.anIntArray37 = new int[256];
		Static45.anIntArray135 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static20.anIntArray37[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static45.anIntArray135[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V")
	public static void method1658() {
		anIntArray243 = null;
		aClass2_Sub11_Sub1_2 = null;
		aClass10_1013 = null;
		aClass53_1 = null;
		aClass10_1014 = null;
		aClass72_19 = null;
		aClass10_1012 = null;
		aClass10_1010 = null;
		aClass10_1015 = null;
		aClass10_1011 = null;
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(I)V")
	public static void method1659() {
		for (@Pc(6) Class2_Sub15 local6 = (Class2_Sub15) Static30.aClass18_2.method687(); local6 != null; local6 = (Class2_Sub15) Static30.aClass18_2.method682()) {
			@Pc(19) int local19 = local6.anInt2387;
			if (Static76.method1263(local19)) {
				@Pc(25) boolean local25 = true;
				@Pc(29) Class23[] local29 = Static90.aClass23ArrayArray1[local19];
				for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
					if (local29[local31] != null) {
						local25 = local29[local31].aBoolean37;
						break;
					}
				}
				if (!local25) {
					@Pc(55) int local55 = (int) local6.aLong139;
					@Pc(59) Class23 local59 = Static102.method2541(local55);
					if (local59 != null) {
						Static3.method34(local59);
					}
				}
			}
		}
	}
}
