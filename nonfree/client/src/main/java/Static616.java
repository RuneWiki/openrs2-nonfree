import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static616 {

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
	public static int anInt9561;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZLclient!qj;)V")
	public static void method8089(@OriginalArg(1) Class3_Sub44 arg0) {
		Static584.aClass193_62.method4462(arg0);
		arg0.anInt8295 = arg0.aClass3_Sub17_Sub2_3.lb;
		arg0.aClass3_Sub17_Sub2_3.lb = 0;
		Static337.anInt6127 += arg0.anInt8295;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
	public static void method8090() {
		if (Static212.aClass232_2 != null) {
			Static212.aClass232_2.method8519();
		}
		if (Static18.aClass232_1 != null) {
			Static18.aClass232_1.method8519();
		}
	}
}
