import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static285 {

	@OriginalMember(owner = "client!it", name = "b", descriptor = "I")
	public static int anInt5167;

	@OriginalMember(owner = "client!it", name = "g", descriptor = "I")
	public static int anInt5168 = 0;

	@OriginalMember(owner = "client!it", name = "e", descriptor = "Lclient!m;")
	public static final Class235 aClass235_28 = new Class235(11);

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
	public static void method4299() {
		if (Static75.aString26.toLowerCase().indexOf("microsoft") != -1) {
			Static655.anIntArray588[186] = 57;
			Static655.anIntArray588[189] = 26;
			Static655.anIntArray588[190] = 72;
			Static655.anIntArray588[223] = 28;
			Static655.anIntArray588[188] = 71;
			Static655.anIntArray588[222] = 59;
			Static655.anIntArray588[220] = 74;
			Static655.anIntArray588[221] = 43;
			Static655.anIntArray588[219] = 42;
			Static655.anIntArray588[187] = 27;
			Static655.anIntArray588[191] = 73;
			Static655.anIntArray588[192] = 58;
			return;
		}
		Static655.anIntArray588[93] = 43;
		Static655.anIntArray588[91] = 42;
		Static655.anIntArray588[44] = 71;
		Static655.anIntArray588[46] = 72;
		Static655.anIntArray588[92] = 74;
		if (Static75.aMethod2 == null) {
			Static655.anIntArray588[222] = 59;
			Static655.anIntArray588[192] = 58;
		} else {
			Static655.anIntArray588[192] = 28;
			Static655.anIntArray588[520] = 59;
			Static655.anIntArray588[222] = 58;
		}
		Static655.anIntArray588[47] = 73;
		Static655.anIntArray588[45] = 26;
		Static655.anIntArray588[59] = 57;
		Static655.anIntArray588[61] = 27;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)I")
	public static int method4300() {
		return (int) (1000000000L / Static11.aLong14);
	}

	@OriginalMember(owner = "client!it", name = "d", descriptor = "(I)V")
	public static void method4301() {
		Static33.aClass288Array1 = null;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(II)Z")
	public static boolean method4303(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)Z")
	public static boolean method4304(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
