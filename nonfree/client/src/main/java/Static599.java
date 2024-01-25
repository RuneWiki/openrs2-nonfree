import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!so", name = "c", descriptor = "I")
	public static int anInt9087 = 0;

	@OriginalMember(owner = "client!so", name = "b", descriptor = "I")
	public static int anInt9088 = 0;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)V")
	public static void method7699(@OriginalArg(1) int arg0) {
		if (Static203.anInt3380 == arg0) {
			return;
		}
		Static497.anInt7926 = Static646.anInt9979 = Static43.anIntArray78[arg0];
		Static648.method8530();
		Static672.anIntArrayArray64 = new int[Static497.anInt7926][Static646.anInt9979];
		Static44.anIntArrayArray5 = new int[Static497.anInt7926][Static646.anInt9979];
		Static66.anIntArrayArrayArray1 = new int[4][Static497.anInt7926 >> 3][Static646.anInt9979 >> 3];
		for (@Pc(48) int local48 = 0; local48 < 4; local48++) {
			Static455.aClass109Array1[local48] = Static390.method5301(Static497.anInt7926, Static646.anInt9979);
		}
		Static153.aByteArrayArrayArray3 = new byte[4][Static497.anInt7926][Static646.anInt9979];
		Static354.method4973(Static497.anInt7926, Static646.anInt9979);
		Static256.method2679(Static153.aClass22_4, Static646.anInt9979 >> 3, Static497.anInt7926 >> 3);
		Static203.anInt3380 = arg0;
	}
}
