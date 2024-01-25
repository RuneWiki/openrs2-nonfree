import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static270 {

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "Lclient!qw;")
	public static final Class284 aClass284_13 = new Class284(1, 6);

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IBI)Z")
	public static boolean method4371(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static453.method6412(arg0, arg1)) {
			return Static570.method7801(arg0, arg1) | (arg1 & 0xB000) != 0 | Static573.method7820(arg0, arg1) ? true : (Static299.method4652(arg0, arg1) | Static313.method4800(arg1, arg0)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
	public static void method4373() {
		if (Static222.aString51.toLowerCase().indexOf("microsoft") != -1) {
			Static409.anIntArray692[187] = 27;
			Static409.anIntArray692[221] = 43;
			Static409.anIntArray692[188] = 71;
			Static409.anIntArray692[219] = 42;
			Static409.anIntArray692[220] = 74;
			Static409.anIntArray692[192] = 58;
			Static409.anIntArray692[191] = 73;
			Static409.anIntArray692[190] = 72;
			Static409.anIntArray692[222] = 59;
			Static409.anIntArray692[189] = 26;
			Static409.anIntArray692[186] = 57;
			Static409.anIntArray692[223] = 28;
			return;
		}
		Static409.anIntArray692[44] = 71;
		Static409.anIntArray692[46] = 72;
		Static409.anIntArray692[91] = 42;
		Static409.anIntArray692[61] = 27;
		Static409.anIntArray692[47] = 73;
		Static409.anIntArray692[92] = 74;
		Static409.anIntArray692[59] = 57;
		Static409.anIntArray692[93] = 43;
		Static409.anIntArray692[45] = 26;
		if (Static222.aMethod2 == null) {
			Static409.anIntArray692[192] = 58;
			Static409.anIntArray692[222] = 59;
		} else {
			Static409.anIntArray692[192] = 28;
			Static409.anIntArray692[222] = 58;
			Static409.anIntArray692[520] = 59;
		}
	}
}
