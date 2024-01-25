import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!pb", name = "zb", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_112 = new Class253(17, 3);

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "(II)Lclient!tq;")
	public static Class7_Sub4_Sub16 method3995(@OriginalArg(1) int arg0) {
		@Pc(10) Class7_Sub4_Sub16 local10 = (Class7_Sub4_Sub16) Static201.aClass86_2.method2019((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static78.aClass178_20.method3838(0, arg0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local10 = Static28.method312(local25);
			Static201.aClass86_2.method2018(local10, (long) arg0);
			return local10;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIILclient!ma;Lclient!l;ILclient!go;I)V")
	public static void method3997(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class119 arg2, @OriginalArg(4) Class11 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class95 arg5, @OriginalArg(7) int arg6) {
		if (arg3 == null) {
			return;
		}
		@Pc(18) int local18;
		if (Static9.anInt60 == 4) {
			local18 = (int) Static97.aFloat52 & 0x3FFF;
		} else {
			local18 = Static436.anInt7298 + (int) Static97.aFloat52 & 0x3FFF;
		}
		@Pc(45) int local45 = Math.max(arg5.anInt2595 / 2, arg5.anInt2638 / 2) + 10;
		@Pc(53) int local53 = arg1 * arg1 + arg6 * arg6;
		if (local45 * local45 < local53) {
			return;
		}
		@Pc(67) int local67 = Class22_Sub7.anIntArray411[local18];
		@Pc(71) int local71 = Class22_Sub7.anIntArray410[local18];
		if (Static9.anInt60 != 4) {
			local67 = local67 * 256 / (Static3.anInt11 + 256);
			local71 = local71 * 256 / (Static3.anInt11 + 256);
		}
		@Pc(103) int local103 = arg6 * local67 + arg1 * local71 >> 15;
		@Pc(114) int local114 = local71 * arg6 - local67 * arg1 >> 15;
		arg3.method4396(local103 + arg5.anInt2595 / 2 + arg4 - arg3.j() / 2, -local114 + arg5.anInt2638 / 2 + arg0 + -(arg3.T() / 2), arg2, arg4, arg0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!go;IZ)V")
	public static void method3998(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2) {
		Static12.anInt145 = arg0;
		Static341.aClass95_13 = arg1;
		Static408.anInt6458 = arg2;
	}

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "(I)V")
	public static void method3999() {
		if (Static85.aString14.toLowerCase().indexOf("microsoft") != -1) {
			Static198.anIntArray316[188] = 71;
			Static198.anIntArray316[223] = 28;
			Static198.anIntArray316[219] = 42;
			Static198.anIntArray316[191] = 73;
			Static198.anIntArray316[187] = 27;
			Static198.anIntArray316[192] = 58;
			Static198.anIntArray316[190] = 72;
			Static198.anIntArray316[186] = 57;
			Static198.anIntArray316[221] = 43;
			Static198.anIntArray316[189] = 26;
			Static198.anIntArray316[220] = 74;
			Static198.anIntArray316[222] = 59;
			return;
		}
		Static198.anIntArray316[92] = 74;
		Static198.anIntArray316[45] = 26;
		Static198.anIntArray316[61] = 27;
		Static198.anIntArray316[91] = 42;
		Static198.anIntArray316[46] = 72;
		Static198.anIntArray316[59] = 57;
		Static198.anIntArray316[44] = 71;
		Static198.anIntArray316[47] = 73;
		if (Static85.aMethod1 == null) {
			Static198.anIntArray316[192] = 58;
			Static198.anIntArray316[222] = 59;
		} else {
			Static198.anIntArray316[222] = 58;
			Static198.anIntArray316[520] = 59;
			Static198.anIntArray316[192] = 28;
		}
		Static198.anIntArray316[93] = 43;
	}
}
