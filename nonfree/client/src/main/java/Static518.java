import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!rp", name = "o", descriptor = "Lclient!dv;")
	public static final Class96 aClass96_18 = new Class96(7, 0, 1, 1);

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZI)V")
	public static void method7510(@OriginalArg(1) int arg0) {
		if (arg0 == Static462.anInt7862) {
			return;
		}
		Static544.anInt9261 = Static282.anInt4887 = Static511.anIntArray428[arg0];
		Static197.method8873();
		Static107.anIntArrayArrayArray7 = new int[4][Static544.anInt9261 >> 3][Static282.anInt4887 >> 3];
		Static555.anIntArrayArray50 = new int[Static544.anInt9261][Static282.anInt4887];
		Static300.anIntArrayArray34 = new int[Static544.anInt9261][Static282.anInt4887];
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			Static670.aClass88Array1[local42] = Static416.method8826(Static544.anInt9261, Static282.anInt4887);
		}
		Static240.aByteArrayArrayArray15 = new byte[4][Static544.anInt9261][Static282.anInt4887];
		Static171.method2491(Static544.anInt9261, Static282.anInt4887);
		Static155.method2137(Static282.anInt4887 >> 3, Static544.anInt9261 >> 3, Static457.aClass57_11);
		Static462.anInt7862 = arg0;
	}
}
