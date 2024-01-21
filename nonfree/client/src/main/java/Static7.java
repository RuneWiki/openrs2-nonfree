import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "Lclient!q;")
	public static Class62_Sub1 aClass62_Sub1_1;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "Lclient!q;")
	public static Class62_Sub1 aClass62_Sub1_2;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "Lclient!vb;")
	public static Class3_Sub1_Sub15 aClass3_Sub1_Sub15_2;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!te;")
	public static Class75 aClass75_5 = new Class75(30);

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "Lclient!na;")
	private static Class53 aClass53_84 = Static109.method1737("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Lclient!na;")
	public static Class53 aClass53_82 = aClass53_84;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!na;")
	public static Class53 aClass53_83 = Static109.method1737("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Lclient!na;")
	public static Class53 aClass53_85 = Static109.method1737("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "Lclient!na;")
	private static Class53 aClass53_87 = Static109.method1737(" has logged out)3");

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "Lclient!na;")
	public static Class53 aClass53_86 = aClass53_87;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Lclient!na;")
	public static Class53 aClass53_88 = Static109.method1737("Freund hinzuf-Ugen");

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	public static int anInt197 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!jb;BZ)V")
	public static void method129(@OriginalArg(0) Class37 arg0, @OriginalArg(2) boolean arg1) {
		if (Static106.aClass37_4 != null) {
			try {
				Static106.aClass37_4.method948();
			} catch (@Pc(12) Exception local12) {
			}
			Static106.aClass37_4 = null;
		}
		Static106.aClass37_4 = arg0;
		Static32.method704(arg1);
		Static19.aClass3_Sub7_7 = null;
		Static126.aClass3_Sub1_Sub12_2 = null;
		Static72.aClass3_Sub7_5.anInt964 = 0;
		Static85.anInt2071 = 0;
		while (true) {
			@Pc(33) Class3_Sub1_Sub12 local33 = (Class3_Sub1_Sub12) Static42.aClass77_5.method1803();
			if (local33 == null) {
				while (true) {
					local33 = (Class3_Sub1_Sub12) Static18.aClass77_2.method1803();
					if (local33 == null) {
						if (Static60.aByte1 != 0) {
							try {
								@Pc(87) Class3_Sub7 local87 = new Class3_Sub7(4);
								local87.method625(4);
								local87.method625(Static60.aByte1);
								local87.method622(0);
								Static106.aClass37_4.method953(4, local87.aByteArray15);
							} catch (@Pc(108) IOException local108) {
								try {
									Static106.aClass37_4.method948();
								} catch (@Pc(113) Exception local113) {
								}
								Static106.aClass37_4 = null;
								Static20.anInt691++;
							}
						}
						Static44.anInt1251 = 0;
						Static99.aLong73 = Static89.method1462();
						return;
					}
					Static35.aClass41_1.method1073(local33);
					Static56.aClass77_7.method1810(local33, local33.aLong94);
					Static51.anInt1331++;
					Static40.anInt1193--;
				}
			}
			Static4.aClass77_1.method1810(local33, local33.aLong94);
			Static2.anInt63++;
			Static111.anInt2561--;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public static void method130() {
		aClass75_5 = null;
		aClass62_Sub1_2 = null;
		aClass53_85 = null;
		aClass53_88 = null;
		aClass3_Sub1_Sub15_2 = null;
		aClass53_86 = null;
		aClass53_84 = null;
		aClass53_82 = null;
		aByteArrayArray1 = null;
		aClass53_83 = null;
		aClass62_Sub1_1 = null;
		aClass53_87 = null;
	}
}
