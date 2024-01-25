import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
	public static int anInt4974 = 0;

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
	public static int anInt4975 = 255;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
	public static void method4345() {
		Static246.aClass11_Sub25_Sub1_3.method2464();
		@Pc(13) int local13 = Static246.aClass11_Sub25_Sub1_3.method2462(1);
		if (local13 == 0) {
			return;
		}
		@Pc(21) int local21 = Static246.aClass11_Sub25_Sub1_3.method2462(2);
		if (local21 == 0) {
			Static309.anIntArray498[Static90.anInt4650++] = 2047;
			return;
		}
		@Pc(42) int local42;
		@Pc(52) int local52;
		if (local21 == 1) {
			local42 = Static246.aClass11_Sub25_Sub1_3.method2462(3);
			Static156.aClass67_Sub3_Sub3_Sub2_2.method4386(1, local42);
			local52 = Static246.aClass11_Sub25_Sub1_3.method2462(1);
			if (local52 == 1) {
				Static309.anIntArray498[Static90.anInt4650++] = 2047;
			}
		} else if (local21 == 2) {
			if (Static246.aClass11_Sub25_Sub1_3.method2462(1) == 1) {
				local42 = Static246.aClass11_Sub25_Sub1_3.method2462(3);
				Static156.aClass67_Sub3_Sub3_Sub2_2.method4386(2, local42);
				local52 = Static246.aClass11_Sub25_Sub1_3.method2462(3);
				Static156.aClass67_Sub3_Sub3_Sub2_2.method4386(2, local52);
			} else {
				local42 = Static246.aClass11_Sub25_Sub1_3.method2462(3);
				Static156.aClass67_Sub3_Sub3_Sub2_2.method4386(0, local42);
			}
			local42 = Static246.aClass11_Sub25_Sub1_3.method2462(1);
			if (local42 == 1) {
				Static309.anIntArray498[Static90.anInt4650++] = 2047;
			}
		} else if (local21 == 3) {
			local42 = Static246.aClass11_Sub25_Sub1_3.method2462(7);
			local52 = Static246.aClass11_Sub25_Sub1_3.method2462(7);
			@Pc(144) int local144 = Static246.aClass11_Sub25_Sub1_3.method2462(1);
			if (local144 == 1) {
				Static309.anIntArray498[Static90.anInt4650++] = 2047;
			}
			Static322.anInt6250 = Static246.aClass11_Sub25_Sub1_3.method2462(2);
			@Pc(165) int local165 = Static246.aClass11_Sub25_Sub1_3.method2462(1);
			Static156.aClass67_Sub3_Sub3_Sub2_2.method4384(local52, local165 == 1, local42, Static322.anInt6250);
		}
	}
}
