import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "Lclient!cm;")
	public static Class36 aClass36_5;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
	public static int anInt2745;

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "[I")
	public static final int[] anIntArray179 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "[I")
	public static final int[] anIntArray180 = new int[1024];

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)Z")
	public static boolean method2222() {
		return Static13.aBoolean25;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public static void method2223() {
		if (Static59.aString43.toLowerCase().indexOf("microsoft") != -1) {
			Static255.anIntArray506[191] = 73;
			Static255.anIntArray506[189] = 26;
			Static255.anIntArray506[219] = 42;
			Static255.anIntArray506[187] = 27;
			Static255.anIntArray506[222] = 59;
			Static255.anIntArray506[186] = 57;
			Static255.anIntArray506[192] = 58;
			Static255.anIntArray506[190] = 72;
			Static255.anIntArray506[188] = 71;
			Static255.anIntArray506[223] = 28;
			Static255.anIntArray506[221] = 43;
			Static255.anIntArray506[220] = 74;
			return;
		}
		Static255.anIntArray506[61] = 27;
		Static255.anIntArray506[91] = 42;
		Static255.anIntArray506[47] = 73;
		Static255.anIntArray506[44] = 71;
		Static255.anIntArray506[59] = 57;
		Static255.anIntArray506[45] = 26;
		Static255.anIntArray506[93] = 43;
		if (Static59.aMethod2 == null) {
			Static255.anIntArray506[222] = 59;
			Static255.anIntArray506[192] = 58;
		} else {
			Static255.anIntArray506[520] = 59;
			Static255.anIntArray506[222] = 58;
			Static255.anIntArray506[192] = 28;
		}
		Static255.anIntArray506[46] = 72;
		Static255.anIntArray506[92] = 74;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	public static void method2224(@OriginalArg(0) int arg0) {
		Static265.anInt5321 = -1;
		Static114.anInt2413 = arg0;
		Static265.anInt5321 = -1;
		Static149.method2422();
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
	public static void method2225() {
		if (Static3.anInt56 <= 0) {
			Static159.aString118 = "";
			return;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static265.aStringArray34.length; local18++) {
			if (Static265.aStringArray34[local18].startsWith("--> ")) {
				local16++;
				if (Static3.anInt56 == local16) {
					Static159.aString118 = Static265.aStringArray34[local18].substring(4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIB)I")
	public static int method2226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(46) int local46 = Static346.method5644(arg1 - 1, arg0 + -1) + Static346.method5644(arg1 + 1, arg0 - 1) + Static346.method5644(arg1 - 1, arg0 + 1) + Static346.method5644(arg1 + 1, arg0 + 1);
		@Pc(75) int local75 = Static346.method5644(arg1 - 1, arg0) + Static346.method5644(arg1 + 1, arg0) + Static346.method5644(arg1, arg0 - 1) + Static346.method5644(arg1, arg0 + 1);
		@Pc(80) int local80 = Static346.method5644(arg1, arg0);
		return local80 / 4 + local46 / 16 + local75 / 8;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIB)V")
	public static void method2228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(arg1, 12);
		local8.method2509();
		local8.anInt3054 = arg0;
	}
}
