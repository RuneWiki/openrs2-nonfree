import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Lclient!th;")
	public static Interface2 anInterface2_2;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "Lclient!ig;")
	public static Class39 aClass39_6;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Lclient!rf;")
	public static Class70 aClass70_189 = Static49.method1293("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!c", name = "t", descriptor = "Lclient!rf;")
	private static Class70 aClass70_195 = Static49.method1293("Continue");

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Lclient!rf;")
	public static Class70 aClass70_190 = aClass70_195;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Lclient!rf;")
	public static Class70 aClass70_191 = Static49.method1293("(Y");

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public static int anInt551 = 0;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	public static int anInt552 = 0;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "Lclient!rf;")
	private static Class70 aClass70_192 = Static49.method1293("Free world");

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[I")
	public static int[] anIntArray33 = new int[5];

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1 = new byte[4][104][104];

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[S")
	public static short[] aShortArray7 = new short[500];

	@OriginalMember(owner = "client!c", name = "o", descriptor = "Lclient!rf;")
	public static Class70 aClass70_193 = aClass70_192;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[Lclient!mh;")
	public static Class53[] aClass53Array1 = new Class53[5000];

	@OriginalMember(owner = "client!c", name = "r", descriptor = "Lclient!rf;")
	public static Class70 aClass70_194 = Static49.method1293("Weiter");

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ig;B)I")
	public static int method439(@OriginalArg(0) Class39 arg0) {
		@Pc(13) Class1_Sub4 local13 = (Class1_Sub4) Static6.aClass30_1.method1467(((long) arg0.anInt2355 << 32) + (long) arg0.anInt2344);
		return local13 == null ? arg0.anInt2327 : local13.anInt468;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Z")
	public static boolean method440() {
		try {
			if (Static160.anInt4192 == 2) {
				if (Static30.aClass1_Sub7_1 == null) {
					Static30.aClass1_Sub7_1 = Static186.method1052(Static143.aClass76_111, Static47.anInt1655, Static144.anInt3804);
					if (Static30.aClass1_Sub7_1 == null) {
						return false;
					}
				}
				if (Static171.aClass6_1 == null) {
					Static171.aClass6_1 = new Class6(Static101.aClass76_82, Static63.aClass76_54);
				}
				if (Static45.aClass1_Sub8_Sub2_1.method2146(Static30.aClass1_Sub7_1, Static171.aClass6_1, Static86.aClass76_75)) {
					Static45.aClass1_Sub8_Sub2_1.method2161();
					Static45.aClass1_Sub8_Sub2_1.method2153(Static184.anInt4567);
					Static45.aClass1_Sub8_Sub2_1.method2166(Static30.aClass1_Sub7_1, Static143.aBoolean142);
					Static171.aClass6_1 = null;
					Static143.aClass76_111 = null;
					Static30.aClass1_Sub7_1 = null;
					Static160.anInt4192 = 0;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static45.aClass1_Sub8_Sub2_1.method2157();
			Static143.aClass76_111 = null;
			Static160.anInt4192 = 0;
			Static30.aClass1_Sub7_1 = null;
			Static171.aClass6_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public static void method441() {
		aClass70_194 = null;
		aClass39_6 = null;
		anInterface2_2 = null;
		aFont1 = null;
		aClass53Array1 = null;
		aShortArray7 = null;
		aClass70_193 = null;
		aClass70_189 = null;
		anIntArray33 = null;
		aClass70_191 = null;
		aClass70_195 = null;
		aClass70_192 = null;
		aByteArrayArrayArray1 = null;
		aClass70_190 = null;
	}
}
