import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!c", name = "r", descriptor = "Lclient!ce;")
	public static Class14 aClass14_2;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "I")
	public static int anInt2418 = 0;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "Lclient!ai;")
	public static Class6 aClass6_694 = Static38.method685("jlv");

	@OriginalMember(owner = "client!c", name = "H", descriptor = "Lclient!ai;")
	public static Class6 aClass6_695 = Static38.method685("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!c", name = "M", descriptor = "I")
	public static int anInt2431 = 0;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	public static void method1591() {
		Static66.aClass2_Sub13_Sub1_2.method1455(9);
		Static66.aClass2_Sub13_Sub1_2.method1418(0L);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
	public static void method1592() {
		aClass6_695 = null;
		aClass14_2 = null;
		aClass6_694 = null;
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V")
	public static void method1603() {
		while (true) {
			@Pc(8) Class84 local8 = Static25.aClass84_2;
			@Pc(15) Class2_Sub12 local15;
			synchronized (Static25.aClass84_2) {
				local15 = (Class2_Sub12) Static118.aClass84_8.method2703();
			}
			if (local15 == null) {
				return;
			}
			local15.aClass10_Sub1_9.method1608((int) local15.aLong241, local15.aByteArray7, false, local15.aClass40_1);
		}
	}
}
