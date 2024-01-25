import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_139 = new Class40("Loaded shaders", "Shaders geladen", "Nuanceurs chargés", "Sombreamento carregado");

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)V")
	public static void method6757() {
		Static291.aClass1_1.method6838();
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			Static37.aLongArray3[local15] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static325.aLongArray6[local29] = 0L;
		}
		Static545.anInt9127 = 0;
	}

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)Z")
	public static boolean method6758() {
		try {
			return Static426.method6104();
		} catch (@Pc(14) IOException local14) {
			Static493.method6846();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(78) String local78 = "T2 - " + (Static13.aClass150_11 == null ? -1 : Static13.aClass150_11.method3535()) + "," + (Static203.aClass150_90 == null ? -1 : Static203.aClass150_90.method3535()) + "," + (Static473.aClass150_200 == null ? -1 : Static473.aClass150_200.method3535()) + " - " + Static319.anInt6170 + "," + (Static515.anInt3214 + Static35.aClass15_Sub2_Sub1_Sub1_1.anIntArray306[0]) + "," + (Static35.aClass15_Sub2_Sub1_Sub1_1.anIntArray307[0] + Static338.anInt6353) + " - ";
			for (@Pc(80) int local80 = 0; Static319.anInt6170 > local80 && local80 < 50; local80++) {
				local78 = local78 + Static131.aClass5_Sub3_Sub1_1.aByteArray66[local80] + ",";
			}
			Static370.method6434(local78, local19);
			Static286.method4827(false);
			return true;
		}
	}
}
