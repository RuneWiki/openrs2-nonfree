import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_76 = new Class25(30, -1);

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray75 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)I")
	public static int method2581(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	public static void method2583() {
		Static161.aClass115_1.method2371();
		Static196.aClass126_1.method5357();
		Static94.aClient2.method856();
		Static291.aCanvas6.setBackground(Color.black);
		Static63.anInt6767 = -1;
		Static161.aClass115_1 = Static192.method2762(Static291.aCanvas6);
		Static196.aClass126_1 = Static282.method3989(Static291.aCanvas6);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZIZ)V")
	public static void method2584(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static433.anInt7313--;
			if (Static433.anInt7313 == 0) {
				Static64.anIntArray85 = null;
			}
		}
		if (arg1) {
			Static124.anInt2080--;
			if (Static124.anInt2080 == 0) {
				Static268.anIntArray402 = null;
			}
		}
	}
}
