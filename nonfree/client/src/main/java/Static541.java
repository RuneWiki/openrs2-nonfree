import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!sfa", name = "e", descriptor = "I")
	public static int anInt8830;

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(I)V")
	public static void method7490() {
		@Pc(10) int local10 = Static227.aClass3_Sub15_11.aClass17_Sub11_1.method4522();
		if (local10 == 0) {
			Static588.aByteArrayArrayArray18 = null;
			Static141.method2442(0);
		} else if (local10 == 1) {
			Static637.method8372((byte) 0);
			Static141.method2442(512);
			if (Static338.aByteArrayArrayArray13 != null) {
				Static352.method5283();
			}
		} else {
			Static637.method8372((byte) (Static156.anInt5851 - 4 & 0xFF));
			Static141.method2442(2);
		}
		Static265.anInt9359 = Static576.anInt9136;
	}
}
