import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!es", name = "o", descriptor = "I")
	public static int anInt2119 = 2;

	@OriginalMember(owner = "client!es", name = "u", descriptor = "J")
	public static long aLong50 = 0L;

	@OriginalMember(owner = "client!es", name = "w", descriptor = "[I")
	public static final int[] anIntArray178 = new int[500];

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(Z)V")
	public static void method1758(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static469.aClass228ArrayArrayArray6 = Static526.aClass228ArrayArrayArray7;
			Static114.aClass151Array1 = Static320.aClass151Array3;
		} else {
			Static469.aClass228ArrayArrayArray6 = Static185.aClass228ArrayArrayArray4;
			Static114.aClass151Array1 = Static261.aClass151Array2;
		}
		Static450.anInt7223 = Static469.aClass228ArrayArrayArray6.length;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!ac;Z)V")
	public static void method1759(@OriginalArg(0) Class2_Sub3 arg0) {
		arg0.aBoolean699 = false;
		if (arg0.aClass2_Sub13_5 != null) {
			arg0.aClass2_Sub13_5.anInt9543 = 0;
		}
		for (@Pc(18) Class2_Sub3 local18 = arg0.method6701(); local18 != null; local18 = arg0.method6703()) {
			method1759(local18);
		}
	}
}
