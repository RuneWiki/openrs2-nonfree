import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!gj", name = "M", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_94 = new Class92(26, 7);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)I")
	public static int method2319(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BIII)V")
	public static void method2322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(19) int local19 = arg0 << 3;
		Static265.aFloat64 = local3;
		Static235.aFloat60 = local19;
		if (Static107.anInt2382 == 2) {
			Static285.anInt5234 = 0;
			Static430.anInt7326 = local19;
			Static141.anInt3177 = local3;
		}
		Static338.method1150();
		Static189.aBoolean300 = true;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(Z)V")
	public static void method2323() {
		if (Static162.aString38.toLowerCase().indexOf("microsoft") != -1) {
			Static157.anIntArray256[219] = 42;
			Static157.anIntArray256[190] = 72;
			Static157.anIntArray256[222] = 59;
			Static157.anIntArray256[220] = 74;
			Static157.anIntArray256[191] = 73;
			Static157.anIntArray256[186] = 57;
			Static157.anIntArray256[221] = 43;
			Static157.anIntArray256[192] = 58;
			Static157.anIntArray256[189] = 26;
			Static157.anIntArray256[223] = 28;
			Static157.anIntArray256[188] = 71;
			Static157.anIntArray256[187] = 27;
			return;
		}
		Static157.anIntArray256[59] = 57;
		Static157.anIntArray256[93] = 43;
		Static157.anIntArray256[44] = 71;
		if (Static162.aMethod2 == null) {
			Static157.anIntArray256[222] = 59;
			Static157.anIntArray256[192] = 58;
		} else {
			Static157.anIntArray256[520] = 59;
			Static157.anIntArray256[222] = 58;
			Static157.anIntArray256[192] = 28;
		}
		Static157.anIntArray256[46] = 72;
		Static157.anIntArray256[92] = 74;
		Static157.anIntArray256[61] = 27;
		Static157.anIntArray256[91] = 42;
		Static157.anIntArray256[45] = 26;
		Static157.anIntArray256[47] = 73;
	}
}
