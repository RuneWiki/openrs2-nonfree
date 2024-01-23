import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
	public static int anInt4243;

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "[I")
	public static int[] anIntArray351 = new int[] { 0, 1, 12, 0, 0, 3, -1, 11, 0, 0, -1, 0, 0, 0, 0, -1, 0, 2, -2, 0, 3, 2, 0, -1, -1, 0, 0, 0, 5, 0, 4, 5, 0, 0, 0, 0, 3, 0, 12, 10, 0, 0, 0, 0, -2, 7, 0, 0, 0, 6, 0, 0, 0, 0, -2, 10, 0, 0, 0, 0, 0, -2, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, -2, 17, 12, 0, 0, 0, 4, 12, 0, 6, 0, 0, 0, 0, -1, 0, 8, 0, 8, 0, 6, 6, 0, 0, 10, 3, 0, 0, -1, 0, 8, 6, 8, 0, 0, 0, -2, 15, -1, 0, 0, 0, 0, 0, 0, 6, 0, -2, -2, 3, 5, 5, 8, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 14, 14, 0, 0, 0, 1, 10, 0, 2, 0, 0, 6, 0, 28, 0, 6, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 3, -1, 0, 0, 0, 0, 0, 2, 0, 0, 0, -1, 0, 0, 0, 0, -2, 0, 0, 6, 0, 2, 0, 0, 0, 0, 7, 0, -1, 0, 0, -1, 7, 0, 3, 0, 0, 0, 0, 0, 0, -2, 1, 1, 0, 0, -1, 6, 0, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 15, 7, 0, 0, 3, 0, 2, 8, 0, -1, 0, 6, 0, 0, 0, 0, 0, -2, 0, -2, 0, 4, 8, 4, 20, 0, 0, 0, 0, 0, 0, -1 };

	@OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
	public static int anInt4249 = -1;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(IB)V")
	public static void method3431() {
		Static109.aClass172_20.method4349(5);
		Static242.aClass172_39.method4349(5);
	}

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)V")
	public static void method3432(@OriginalArg(0) int arg0) {
		Static257.anInt5052 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static246.anInt4853; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static64.anInt1393; local8++) {
				if (Static261.aClass4_Sub21ArrayArrayArray4[arg0][local3][local8] == null) {
					Static261.aClass4_Sub21ArrayArrayArray4[arg0][local3][local8] = new Class4_Sub21(arg0, local3, local8);
				}
			}
		}
	}
}
