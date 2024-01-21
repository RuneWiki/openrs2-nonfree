import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!oc", name = "db", descriptor = "Lclient!cb;")
	public static Class13_Sub1 aClass13_Sub1_13;

	@OriginalMember(owner = "client!oc", name = "hb", descriptor = "I")
	public static int anInt2799;

	@OriginalMember(owner = "client!oc", name = "bb", descriptor = "I")
	public static int anInt2796 = 0;

	@OriginalMember(owner = "client!oc", name = "cb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1569 = Static122.method531("mapdots");

	@OriginalMember(owner = "client!oc", name = "gb", descriptor = "Lclient!qc;")
	public static Class64 aClass64_1 = new Class64();

	@OriginalMember(owner = "client!oc", name = "ib", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1570 = Static122.method531(")3");

	@OriginalMember(owner = "client!oc", name = "jb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1571 = Static122.method531("swe");

	@OriginalMember(owner = "client!oc", name = "kb", descriptor = "[Lclient!qh;")
	public static Class66[] aClass66Array1 = new Class66[50];

	@OriginalMember(owner = "client!oc", name = "lb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1572 = Static122.method531("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
	public static void method2064() {
		aClass73_1570 = null;
		aClass13_Sub1_13 = null;
		aClass73_1569 = null;
		aClass66Array1 = null;
		aClass73_1571 = null;
		aClass64_1 = null;
		aClass73_1572 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIB)I")
	public static int method2065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIBII)V")
	public static void method2066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = 0;
		@Pc(12) int local12 = 2048 - arg5 & 0x7FF;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = arg3;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(48) int local48;
		if (local12 != 0) {
			local34 = Class3_Sub1_Sub3_Sub2.anIntArray87[local12];
			local38 = Class3_Sub1_Sub3_Sub2.anIntArray88[local12];
			local48 = local38 * 0 - local34 * arg3 >> 16;
			local25 = local38 * arg3 + local34 * 0 >> 16;
			local23 = local48;
		}
		@Pc(67) int local67 = 2048 - arg1 & 0x7FF;
		if (local67 != 0) {
			local34 = Class3_Sub1_Sub3_Sub2.anIntArray87[local67];
			local38 = Class3_Sub1_Sub3_Sub2.anIntArray88[local67];
			local48 = local38 * 0 + local25 * local34 >> 16;
			local25 = local38 * local25 - local34 * 0 >> 16;
			local5 = local48;
		}
		Static34.anInt834 = arg2 - local5;
		Static19.anInt513 = arg4 - local25;
		Static141.anInt3252 = arg1;
		Static55.anInt1291 = arg0 - local23;
		Static130.anInt2973 = arg5;
	}
}
