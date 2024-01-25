import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "Lclient!ef;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
	public static int anInt5574 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILclient!ps;Lclient!qa;I)V")
	public static void method4631(@OriginalArg(2) Class193 arg0, @OriginalArg(3) Class167 arg1) {
		Static107.aClass193_23.method4524();
		if (Static207.aBoolean274) {
			return;
		}
		for (@Pc(25) Class3_Sub16 local25 = (Class3_Sub16) arg0.method4519(); local25 != null; local25 = (Class3_Sub16) arg0.method4525()) {
			@Pc(33) Class152 local33 = Static211.aClass45_2.method1255(local25.anInt1896);
			if (Static289.method3819(local33)) {
				@Pc(45) boolean local45 = Static307.method4634(arg1, local33, local25);
				if (local45) {
					Static167.method2557(local33, arg1, local25);
				}
			}
		}
	}
}
