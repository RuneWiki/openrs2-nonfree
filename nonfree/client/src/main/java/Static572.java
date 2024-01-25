import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!su", name = "a", descriptor = "[Lclient!wha;")
	public static Class393[] aClass393Array1;

	@OriginalMember(owner = "client!su", name = "b", descriptor = "[I")
	public static int[] anIntArray493;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!tga;B)Z")
	public static boolean method8155(@OriginalArg(0) Class347 arg0) {
		try {
			return Static75.method1228(arg0);
		} catch (@Pc(16) IOException local16) {
			if (Static387.anInt9114 == 9) {
				arg0.aClass278_2 = null;
				return false;
			} else {
				Static486.method7340();
				return true;
			}
		} catch (@Pc(34) Exception local34) {
			@Pc(109) String local109 = "T2 - " + (arg0.aClass160_244 == null ? -1 : arg0.aClass160_244.method3886()) + "," + (arg0.aClass160_242 == null ? -1 : arg0.aClass160_242.method3886()) + "," + (arg0.aClass160_243 == null ? -1 : arg0.aClass160_243.method3886()) + " - " + arg0.anInt9628 + "," + (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray200[0] + Static36.anInt617) + "," + (Static550.anInt9242 + Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray201[0]) + " - ";
			for (@Pc(111) int local111 = 0; local111 < arg0.anInt9628 && local111 < 50; local111++) {
				local109 = local109 + arg0.aClass14_Sub21_Sub2_1.aByteArray99[local111] + ",";
			}
			Static629.method8829(local109, local34);
			Static334.method5151(false);
			return true;
		}
	}
}
