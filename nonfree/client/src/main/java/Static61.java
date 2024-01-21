import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "Lclient!bg;")
	public static Class11 aClass11_53;

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "Lclient!sh;")
	public static Class2_Sub14_Sub3 aClass2_Sub14_Sub3_1;

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "Lclient!lf;")
	private static Class49 aClass49_668 = Static32.method683("cyan:");

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "Lclient!lf;")
	public static Class49 aClass49_666 = aClass49_668;

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "Lclient!lf;")
	public static Class49 aClass49_667 = aClass49_668;

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
	public static volatile int anInt1317 = 0;

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
	public static int anInt1318 = 0;

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "Lclient!lf;")
	public static Class49 aClass49_669 = Static32.method683("Freie Welt");

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "Lclient!lf;")
	public static Class49 aClass49_670 = Static32.method683("headicons_prayer");

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
	public static int anInt1320 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!lf;Lclient!lf;Lclient!lf;)V")
	public static void method1068(@OriginalArg(1) Class49 arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) Class49 arg2) {
		Static129.aClass49_1267 = arg0;
		Static129.aClass49_1275 = arg2;
		Static129.aClass49_1274 = arg1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
	public static void method1069() {
		Static90.aClass74_58.method2347();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	public static void method1070() {
		aClass49_666 = null;
		aClass49_668 = null;
		aClass2_Sub14_Sub3_1 = null;
		aClass49_667 = null;
		aClass49_670 = null;
		aClass49_669 = null;
		aClass11_53 = null;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
	public static void method1071() {
		@Pc(1) Object local1 = Static179.anObject4;
		synchronized (Static179.anObject4) {
			if (Static20.anInt445 == 0) {
				Static45.aClass45_1.method1479(new Class87(), 5);
			}
			Static20.anInt445 = 600;
		}
	}
}
