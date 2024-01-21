import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "Lclient!fg;")
	public static Class2_Sub4_Sub10 aClass2_Sub4_Sub10_1;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
	public static volatile int anInt3171 = -1;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1866 = Static107.method1838("Sorry invited players only)3");

	@OriginalMember(owner = "client!ra", name = "K", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1867 = aClass28_1866;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBI)I")
	public static int method2184(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1 * 57 + arg0;
		@Pc(15) int local15 = local5 ^ local5 << 13;
		@Pc(34) int local34 = (local15 * 15731 * local15 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
	public static void method2186() {
		Static128.aClass2_Sub2_Sub1_2.method1711(154);
		for (@Pc(20) Class2_Sub22 local20 = (Class2_Sub22) Static121.aClass35_35.method1359(); local20 != null; local20 = (Class2_Sub22) Static121.aClass35_35.method1361()) {
			if (local20.anInt2872 == 0) {
				Static110.method1875(local20, true);
			}
		}
		if (Static177.aClass24_14 != null) {
			Static104.method1828(Static177.aClass24_14);
			Static177.aClass24_14 = null;
		}
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
	public static void method2187() {
		aClass28_1867 = null;
		anIntArrayArrayArray8 = null;
		aClass28_1866 = null;
		aClass2_Sub4_Sub10_1 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BII)V")
	public static void method2188(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static84.anInt2125 != 0 && arg1 != -1) {
			Static59.method1060(0, Static122.aClass40_Sub1_89, arg1, Static84.anInt2125);
			Static148.aBoolean151 = true;
		}
	}
}
