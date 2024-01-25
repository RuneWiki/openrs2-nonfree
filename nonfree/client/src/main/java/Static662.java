import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static662 {

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZI)I")
	public static int method9201(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!nca;B)V")
	public static void method9202(@OriginalArg(0) Class254 arg0) {
		Static609.anInt9447 = arg0.method6077("p11_full");
		Static212.anInt3397 = arg0.method6077("p12_full");
		Static59.anInt1028 = arg0.method6077("b12_full");
	}
}
