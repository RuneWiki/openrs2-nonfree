import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!rca", name = "m", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_67 = new Class236(66, 8);

	@OriginalMember(owner = "client!rca", name = "n", descriptor = "I")
	public static int anInt7412 = 0;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(II)V")
	public static void method6021(@OriginalArg(0) int arg0) {
		@Pc(12) Class5_Sub2_Sub7 local12 = Static144.method2728(arg0, 11);
		local12.method1324();
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIIB)I")
	public static int method6023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 <= arg1) {
			return arg2 >= arg1 ? arg1 : arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIZI)I")
	public static int method6024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg2) {
			return arg1;
		}
		@Pc(17) int local17 = 128 - arg0;
		@Pc(36) int local36 = (arg2 & 0x7F) * arg0 + (arg1 & 0x7F) * local17 >> 7;
		@Pc(51) int local51 = (arg1 & 0x380) * local17 + (arg2 & 0x380) * arg0 >> 7;
		@Pc(65) int local65 = (arg2 & 0xFC00) * arg0 + local17 * (arg1 & 0xFC00) >> 7;
		return local51 & 0x380 | local65 & 0xFC00 | local36 & 0x7F;
	}

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)V")
	public static void method6025() {
		if (Static9.aString5.toLowerCase().indexOf("microsoft") != -1) {
			Static169.anIntArray251[221] = 43;
			Static169.anIntArray251[191] = 73;
			Static169.anIntArray251[190] = 72;
			Static169.anIntArray251[187] = 27;
			Static169.anIntArray251[192] = 58;
			Static169.anIntArray251[186] = 57;
			Static169.anIntArray251[188] = 71;
			Static169.anIntArray251[222] = 59;
			Static169.anIntArray251[219] = 42;
			Static169.anIntArray251[220] = 74;
			Static169.anIntArray251[189] = 26;
			Static169.anIntArray251[223] = 28;
			return;
		}
		Static169.anIntArray251[46] = 72;
		Static169.anIntArray251[47] = 73;
		Static169.anIntArray251[44] = 71;
		Static169.anIntArray251[91] = 42;
		Static169.anIntArray251[61] = 27;
		Static169.anIntArray251[59] = 57;
		Static169.anIntArray251[92] = 74;
		Static169.anIntArray251[93] = 43;
		if (Static9.aMethod1 == null) {
			Static169.anIntArray251[222] = 59;
			Static169.anIntArray251[192] = 58;
		} else {
			Static169.anIntArray251[222] = 58;
			Static169.anIntArray251[192] = 28;
			Static169.anIntArray251[520] = 59;
		}
		Static169.anIntArray251[45] = 26;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!gp;I)I")
	public static int method6026(@OriginalArg(0) Class117 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method2973(Static33.anInt859)) {
			local10++;
		}
		if (arg0.method2973(Static397.anInt7134)) {
			local10++;
		}
		return local10;
	}
}
