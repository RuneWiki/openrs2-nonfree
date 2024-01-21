import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!rb", name = "W", descriptor = "Lclient!ug;")
	public static Class89 aClass89_1 = new Class89();

	@OriginalMember(owner = "client!rb", name = "gb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1613 = Static187.method3089("Attack");

	@OriginalMember(owner = "client!rb", name = "hb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1614 = aClass92_1613;

	@OriginalMember(owner = "client!rb", name = "ib", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1615 = Static187.method3089("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!rb", name = "jb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1616 = Static187.method3089("<)4col>");

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)I")
	public static int method2501() {
		return Static11.anInt253;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ba;III)V")
	public static void method2502(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static161.aClass11_15 != null || Static35.aBoolean61 || (arg0 == null || Static141.method2096(arg0) == null)) {
			return;
		}
		Static161.aClass11_15 = arg0;
		Static50.aClass11_13 = Static141.method2096(arg0);
		Static119.anInt2552 = arg2;
		Static165.anInt3438 = arg1;
		Static92.anInt1970 = 0;
		Static75.aBoolean101 = false;
	}

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "(I)V")
	public static void method2503() {
		for (@Pc(11) int local11 = -1; local11 < Static35.anInt992; local11++) {
			@Pc(20) int local20;
			if (local11 == -1) {
				local20 = 2047;
			} else {
				local20 = Static111.anIntArray181[local11];
			}
			@Pc(28) Class8_Sub3_Sub1 local28 = Static47.aClass8_Sub3_Sub1Array1[local20];
			if (local28 != null) {
				Static4.method93(local28, 1);
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "(I)V")
	public static void method2505() {
		Static72.aClass47_11.method1276();
	}
}
