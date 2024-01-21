import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "Lclient!k;")
	public static Class33 aClass33_28;

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
	public static int anInt1723;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "Lclient!wb;")
	public static Class65 aClass65_769 = Static24.method441("Hier klicken)1 um fortzufahren)3)3)3");

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
	public static int anInt1714 = 0;

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "Lclient!wb;")
	private static Class65 aClass65_770 = Static24.method441("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "Lclient!wb;")
	public static Class65 aClass65_771 = aClass65_770;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Lclient!wb;")
	public static Class65 aClass65_772 = Static24.method441("Titelbild geladen)3");

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "Lclient!wb;")
	private static Class65 aClass65_773 = Static24.method441("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "Lclient!wb;")
	public static Class65 aClass65_774 = Static24.method441(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
	public static int anInt1718 = 0;

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "Lclient!wb;")
	public static Class65 aClass65_775 = aClass65_773;

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray5 = new byte[250][];

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)V")
	public static synchronized void method995() {
		if (Static48.method845()) {
			Static48.method842();
			Static84.aClass33_38 = null;
			Static40.aBoolean77 = false;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public static void method996() {
		aClass33_28 = null;
		aByteArrayArray5 = null;
		aClass65_769 = null;
		aClass65_774 = null;
		aClass65_773 = null;
		aClass65_775 = null;
		aClass65_772 = null;
		aClass65_771 = null;
		aClass65_770 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	public static synchronized void method997() {
		if (!Static48.method845()) {
			return;
		}
		if (Static40.aBoolean77) {
			@Pc(31) byte[] local31 = Static77.method1332(Static84.aClass33_38, Static102.anInt2801, Static50.anInt1417, Static21.anInt2500);
			if (local31 != null) {
				if (Static26.anInt2915 >= 0) {
					Static108.method1757(Static26.anInt2915, Static42.anInt1349, local31, Static29.aBoolean57);
				} else if (Static39.anInt1248 < 0) {
					Static107.method1753(Static42.anInt1349, local31, Static29.aBoolean57);
				} else {
					method1001(Static39.anInt1248, local31, Static29.aBoolean57, Static42.anInt1349);
				}
				Static84.aClass33_38 = null;
				Static40.aBoolean77 = false;
			}
		}
		Static51.method902();
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
	public static synchronized void method998() {
		if (Static48.method845()) {
			Static13.method280();
			Static40.aBoolean77 = false;
			Static84.aClass33_38 = null;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!wb;ZIIILclient!k;Lclient!wb;)V")
	public static synchronized void method999(@OriginalArg(1) Class65 arg0, @OriginalArg(4) int arg1, @OriginalArg(6) Class33 arg2, @OriginalArg(7) Class65 arg3) {
		if (Static48.method845()) {
			@Pc(17) int local17 = arg2.method1149(arg3);
			@Pc(23) int local23 = arg2.method1144(arg0, local17);
			method1002(local23, local17, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
	public static void method1000() {
		for (@Pc(10) Class2_Sub3 local10 = (Class2_Sub3) Static22.aClass52_4.method1587(); local10 != null; local10 = (Class2_Sub3) Static22.aClass52_4.method1588()) {
			if (local10.aClass2_Sub1_Sub14_1 != null) {
				local10.method417();
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[BZZI)V")
	private static void method1001(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static78.aClass14_2 == null) {
			return;
		}
		if (Static27.anInt785 >= 0) {
			arg0 -= 20;
			if (arg0 < 1) {
				arg0 = 1;
			}
			Static39.anInt1240 = arg0;
			if (Static27.anInt785 == 0) {
				Static2.anInt109 = 0;
			} else {
				@Pc(51) int local51 = Static82.method1423(Static27.anInt785);
				@Pc(55) int local55 = local51 - Static110.anInt2937;
				Static2.anInt109 = (arg0 + local55 + 3600 - 1) / arg0;
			}
			Static6.aBoolean20 = arg2;
			Static74.aByteArray44 = arg1;
			Static12.anInt414 = arg3;
		} else if (Static39.anInt1240 == 0) {
			Static107.method1753(arg3, arg1, arg2);
		} else {
			Static74.aByteArray44 = arg1;
			Static12.anInt414 = arg3;
			Static6.aBoolean20 = arg2;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIILclient!k;ZI)V")
	public static synchronized void method1002(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class33 arg2, @OriginalArg(7) int arg3) {
		if (!Static48.method845()) {
			return;
		}
		Static84.aClass33_38 = arg2;
		Static26.anInt2915 = 10;
		Static42.anInt1349 = arg3;
		Static102.anInt2801 = arg1;
		Static39.anInt1248 = -1;
		Static29.aBoolean57 = false;
		Static40.aBoolean77 = true;
		Static50.anInt1417 = 0;
		Static21.anInt2500 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!k;IIZIB)V")
	public static synchronized void method1003(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (!Static48.method845()) {
			return;
		}
		Static50.anInt1417 = arg2;
		Static29.aBoolean57 = false;
		Static102.anInt2801 = arg0;
		Static40.aBoolean77 = true;
		Static26.anInt2915 = -1;
		Static21.anInt2500 = 0;
		Static42.anInt1349 = arg3;
		Static84.aClass33_38 = arg1;
		Static39.anInt1248 = -1;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
	public static void method1004() {
		if (Static39.aClass13_2 != null) {
			Static39.aClass13_2.method316();
		}
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
	public static synchronized void method1005() {
		Static85.method1494();
	}
}
