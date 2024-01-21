import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "Lclient!lf;")
	private static Class49 aClass49_802 = Static32.method683("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Lclient!lf;")
	public static Class49 aClass49_801 = aClass49_802;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
	public static int anInt1529 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "[I")
	public static int[] anIntArray179 = new int[5];

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "Lclient!lf;")
	public static Class49 aClass49_803 = Static32.method683("<col=00ffff>");

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "[I")
	public static int[] anIntArray180 = new int[128];

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "Lclient!lf;")
	public static Class49 aClass49_804 = Static32.method683("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "Z")
	public static volatile boolean aBoolean68 = true;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public static void method1212() {
		if (Static89.aString2.toLowerCase().indexOf("microsoft") != -1) {
			Static95.anIntArray203[188] = 71;
			Static95.anIntArray203[186] = 57;
			Static95.anIntArray203[222] = 59;
			Static95.anIntArray203[190] = 72;
			Static95.anIntArray203[191] = 73;
			Static95.anIntArray203[220] = 74;
			Static95.anIntArray203[223] = 28;
			Static95.anIntArray203[221] = 43;
			Static95.anIntArray203[192] = 58;
			Static95.anIntArray203[187] = 27;
			Static95.anIntArray203[189] = 26;
			Static95.anIntArray203[219] = 42;
			return;
		}
		Static95.anIntArray203[44] = 71;
		Static95.anIntArray203[93] = 43;
		Static95.anIntArray203[92] = 74;
		Static95.anIntArray203[47] = 73;
		if (Static89.aMethod2 == null) {
			Static95.anIntArray203[192] = 58;
			Static95.anIntArray203[222] = 59;
		} else {
			Static95.anIntArray203[520] = 59;
			Static95.anIntArray203[192] = 28;
			Static95.anIntArray203[222] = 58;
		}
		Static95.anIntArray203[59] = 57;
		Static95.anIntArray203[61] = 27;
		Static95.anIntArray203[45] = 26;
		Static95.anIntArray203[46] = 72;
		Static95.anIntArray203[91] = 42;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BII)I")
	public static int method1213(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local12 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * local12;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public static void method1215() {
		aClass49_803 = null;
		anIntArray180 = null;
		aClass49_802 = null;
		aClass49_801 = null;
		anIntArray179 = null;
		aClass49_804 = null;
	}
}
