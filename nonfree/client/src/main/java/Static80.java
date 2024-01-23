import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!fi", name = "V", descriptor = "[I")
	public static int[] anIntArray125 = new int[128];

	@OriginalMember(owner = "client!fi", name = "hb", descriptor = "[I")
	public static int[] anIntArray127 = new int[64];

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([SB)[S")
	public static short[] method1396(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(12) short[] local12 = new short[arg0.length];
			Static316.method78(arg0, 0, local12, 0, arg0.length);
			return local12;
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)I")
	public static int method1397(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(BI)Lclient!qg;")
	public static Class146 method1400(@OriginalArg(1) int arg0) {
		@Pc(10) Class146 local10 = (Class146) Static287.aClass26_55.method518((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static46.aClass58_22.method1372(34, arg0);
		local10 = new Class146();
		if (local28 != null) {
			local10.method3593(arg0, new Class4_Sub10(local28));
		}
		Static287.aClass26_55.method510(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!wf;IIB)V")
	public static void method1401(@OriginalArg(0) Class189 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static35.aClass189_1 != null || Static18.aBoolean17 || (arg0 == null || method1403(arg0) == null)) {
			return;
		}
		Static35.aClass189_1 = arg0;
		Static38.aClass189_2 = method1403(arg0);
		Static128.aBoolean173 = false;
		Static105.anInt2165 = 0;
		Static194.anInt5205 = arg1;
		Static41.anInt777 = arg2;
	}

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "(I)V")
	public static void method1402() {
		if (Static215.aString256.toLowerCase().indexOf("microsoft") != -1) {
			Static213.anIntArray445[188] = 71;
			Static213.anIntArray445[223] = 28;
			Static213.anIntArray445[219] = 42;
			Static213.anIntArray445[192] = 58;
			Static213.anIntArray445[221] = 43;
			Static213.anIntArray445[190] = 72;
			Static213.anIntArray445[189] = 26;
			Static213.anIntArray445[222] = 59;
			Static213.anIntArray445[186] = 57;
			Static213.anIntArray445[220] = 74;
			Static213.anIntArray445[187] = 27;
			Static213.anIntArray445[191] = 73;
			return;
		}
		Static213.anIntArray445[61] = 27;
		Static213.anIntArray445[46] = 72;
		if (Static215.aMethod2 == null) {
			Static213.anIntArray445[192] = 58;
			Static213.anIntArray445[222] = 59;
		} else {
			Static213.anIntArray445[520] = 59;
			Static213.anIntArray445[192] = 28;
			Static213.anIntArray445[222] = 58;
		}
		Static213.anIntArray445[92] = 74;
		Static213.anIntArray445[91] = 42;
		Static213.anIntArray445[93] = 43;
		Static213.anIntArray445[45] = 26;
		Static213.anIntArray445[44] = 71;
		Static213.anIntArray445[47] = 73;
		Static213.anIntArray445[59] = 57;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!wf;I)Lclient!wf;")
	private static Class189 method1403(@OriginalArg(0) Class189 arg0) {
		@Pc(2) Class189 local2 = Static41.method691(arg0);
		if (local2 == null) {
			local2 = arg0.aClass189_17;
		}
		return local2;
	}
}
