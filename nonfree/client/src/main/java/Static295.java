import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "[S")
	public static short[] aShortArray90 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
	public static int anInt5297 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)V")
	public static void method4495(@OriginalArg(1) int arg0) {
		if (!Static85.method1597(arg0)) {
			return;
		}
		@Pc(15) Class66[] local15 = Static274.aClass66ArrayArray1[arg0];
		for (@Pc(25) int local25 = 0; local25 < local15.length; local25++) {
			@Pc(37) Class66 local37 = local15[local25];
			if (local37 != null) {
				local37.anInt2131 = 0;
				local37.anInt2182 = 1;
				local37.anInt2149 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)I")
	public static int method4496(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)V")
	public static void method4497() {
		Static192.aClass187_102.method4534(5);
		Static80.aClass187_50.method4534(5);
		Static79.aClass187_49.method4534(5);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
	public static void method4499(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static278.aFloat154 = arg0;
		Static49.aFloat32 = arg1;
		if (Static167.anInt3292 == 2) {
			Static277.anInt4987 = arg0;
			Static93.anInt1895 = arg1;
		}
		Static37.method677();
		Static114.aBoolean142 = true;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(IZ)Z")
	public static boolean method4500(@OriginalArg(0) int arg0) {
		if (Static3.anInt18 == arg0) {
			return false;
		}
		Static57.anIntArrayArray8 = new int[104][104];
		Static4.anIntArrayArrayArray1 = new int[4][13][13];
		Static281.anIntArrayArray41 = new int[104][104];
		Static123.anIntArrayArray18 = new int[104][104];
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			Static240.aClass118Array1[local38] = new Class118(104, 104);
		}
		Static104.aByteArrayArrayArray3 = new byte[4][104][104];
		Static257.aByteArrayArrayArray20 = new byte[4][104][104];
		Static270.aClass59ArrayArrayArray1 = new Class59[4][104][104];
		if (Static156.aBoolean211) {
			Static101.method1830();
			Static150.method2544();
			Static85.aClass126ArrayArray1 = new Class126[13][13];
		}
		Static3.anInt18 = arg0;
		return true;
	}
}
