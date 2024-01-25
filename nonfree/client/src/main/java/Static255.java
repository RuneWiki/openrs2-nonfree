import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
	public static int anInt4904;

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_54 = new Class341(35, 2);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)I")
	public static int method4444() {
		if (Static102.aFrame2 == null) {
			return Static448.aBoolean605 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)V")
	public static void method4446(@OriginalArg(0) int arg0) {
		if (arg0 == Static565.anInt9782) {
			return;
		}
		Static222.anInt4533 = Static668.anInt11370 = Static527.anIntArray473[arg0];
		Static359.method6153();
		Static236.anIntArrayArray14 = new int[Static222.anInt4533][Static668.anInt11370];
		Static23.anIntArrayArray6 = new int[Static222.anInt4533][Static668.anInt11370];
		Static232.anIntArrayArrayArray21 = new int[4][Static222.anInt4533 >> 3][Static668.anInt11370 >> 3];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static196.aClass200Array1[local36] = Static100.method1446(Static222.anInt4533, Static668.anInt11370);
		}
		Static516.aByteArrayArrayArray18 = new byte[4][Static222.anInt4533][Static668.anInt11370];
		Static11.method158(Static668.anInt11370, Static222.anInt4533);
		Static311.method5095(Static668.anInt11370 >> 3, Static222.anInt4533 >> 3, Static607.aClass101_15);
		Static565.anInt9782 = arg0;
	}
}
