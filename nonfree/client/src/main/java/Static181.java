import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "B")
	public static byte aByte8;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
	public static int anInt4508;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1568 = Static49.method1293("<col=00ff00>");

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1569 = Static49.method1293("Schlie-8en");

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1570 = Static49.method1293("::noclip");

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1571 = Static49.method1293("::fps ");

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
	public static int anInt4516 = 0;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	public static void method3472() {
		aClass70_1568 = null;
		aClass70_1571 = null;
		aClass70_1570 = null;
		aClass5_1 = null;
		aClass70_1569 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V")
	public static void method3473(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg1 + (arg0 << 16));
		@Pc(16) Class1_Sub1_Sub5 local16 = (Class1_Sub1_Sub5) Static139.aClass30_13.method1467(local10);
		if (local16 != null) {
			Static130.aClass27_2.method1342(local16);
		}
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
	public static void method3476() {
		if (Static156.aClass62_1 != null) {
			@Pc(11) Class62 local11 = Static156.aClass62_1;
			synchronized (Static156.aClass62_1) {
				Static156.aClass62_1 = null;
			}
		}
	}
}
