import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
	public static int anInt4349;

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
	public static int anInt4343 = 0;

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
	public static int anInt4344 = 2;

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
	public static int anInt4347 = 0;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray34 = new int[128][128];

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)I")
	public static int method3850(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static147.method2948(4, arg0 + 91923, arg1 + 45365) + (Static147.method2948(2, arg0 + 37821, arg1 + 10294) - 128 >> 1) + (Static147.method2948(1, arg0, arg1) + -128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V")
	public static void method3851(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static151.anInt3238 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZB)V")
	public static void method3853(@OriginalArg(0) boolean arg0) {
		Static263.method4429();
		if (Static85.anInt2215 != 30 && Static85.anInt2215 != 25) {
			return;
		}
		Static68.anInt1704++;
		if (Static68.anInt1704 < 50 && !arg0) {
			return;
		}
		Static68.anInt1704 = 0;
		if (!Static168.aBoolean259 && Static193.aClass61_1 != null) {
			Static29.aClass7_Sub3_Sub2_1.method2799(210);
			try {
				Static193.aClass61_1.method1377(Static29.aClass7_Sub3_Sub2_1.aByteArray33, Static29.aClass7_Sub3_Sub2_1.anInt3005);
				Static29.aClass7_Sub3_Sub2_1.anInt3005 = 0;
			} catch (@Pc(56) IOException local56) {
				Static168.aBoolean259 = true;
			}
		}
		Static263.method4429();
	}
}
