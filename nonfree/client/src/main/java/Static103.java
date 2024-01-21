import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "Lclient!p;")
	public static Class33_Sub1 aClass33_Sub1_20;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
	public static int anInt2663 = -1;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1409 = Static23.method501("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1407 = aClass42_1409;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1408 = Static23.method501("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1410 = Static23.method501("Unexpected server response");

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
	public static int anInt2676 = 0;

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1411 = aClass42_1410;

	@OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
	public static int anInt2678 = 0;

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1412 = Static23.method501("Hierhin gehen");

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
	public static void method1815() {
		if (Static80.anInt2104 != 1) {
			return;
		}
		if (Static8.anInt247 >= 6 && Static8.anInt247 <= 106 && Static59.anInt1998 >= 467 && Static59.anInt1998 <= 499) {
			Static59.anInt1999 = (Static59.anInt1999 + 1) % 4;
			Static45.aBoolean100 = true;
			Static28.aBoolean41 = true;
			Static98.aClass1_Sub8_Sub1_3.method1236(4);
			Static98.aClass1_Sub8_Sub1_3.method1185(Static59.anInt1999);
			Static98.aClass1_Sub8_Sub1_3.method1185(Static30.anInt834);
			Static98.aClass1_Sub8_Sub1_3.method1185(Static63.anInt1526);
		}
		if (Static8.anInt247 >= 135 && Static8.anInt247 <= 235 && Static59.anInt1998 >= 467 && Static59.anInt1998 <= 499) {
			Static30.anInt834 = (Static30.anInt834 + 1) % 3;
			Static28.aBoolean41 = true;
			Static45.aBoolean100 = true;
			Static98.aClass1_Sub8_Sub1_3.method1236(4);
			Static98.aClass1_Sub8_Sub1_3.method1185(Static59.anInt1999);
			Static98.aClass1_Sub8_Sub1_3.method1185(Static30.anInt834);
			Static98.aClass1_Sub8_Sub1_3.method1185(Static63.anInt1526);
		}
		if (Static8.anInt247 >= 273 && Static8.anInt247 <= 373 && Static59.anInt1998 >= 467 && Static59.anInt1998 <= 499) {
			Static28.aBoolean41 = true;
			Static45.aBoolean100 = true;
			Static63.anInt1526 = (Static63.anInt1526 + 1) % 3;
			Static98.aClass1_Sub8_Sub1_3.method1236(4);
			Static98.aClass1_Sub8_Sub1_3.method1185(Static59.anInt1999);
			Static98.aClass1_Sub8_Sub1_3.method1185(Static30.anInt834);
			Static98.aClass1_Sub8_Sub1_3.method1185(Static63.anInt1526);
		}
		if (Static8.anInt247 < 412 || Static8.anInt247 > 512 || Static59.anInt1998 < 467 || Static59.anInt1998 > 499) {
			return;
		}
		if (Static108.anInt2743 != -1) {
			Static24.method509(Static11.aClass42_195, 0, Static46.aClass42_664);
			return;
		}
		Static39.method308();
		if (Static25.anInt735 != -1) {
			Static48.aBoolean67 = false;
			Static13.anInt449 = Static108.anInt2743 = Static25.anInt735;
			Static11.aClass42_190 = Static11.aClass42_195;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[BILclient!be;)V")
	public static void method1816(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class8 arg2) {
		@Pc(7) Class1_Sub9 local7 = new Class1_Sub9();
		local7.aByteArray16 = arg1;
		local7.aClass8_2 = arg2;
		local7.aLong83 = arg0;
		local7.anInt1408 = 0;
		@Pc(22) Class22 local22 = Static72.aClass22_11;
		synchronized (Static72.aClass22_11) {
			Static72.aClass22_11.method512(local7);
		}
		Static80.method1481();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	public static void method1817() {
		aClass42_1408 = null;
		aClass33_Sub1_20 = null;
		aClass42_1409 = null;
		aClass42_1411 = null;
		aClass42_1412 = null;
		aClass42_1407 = null;
		aClass42_1410 = null;
	}
}
