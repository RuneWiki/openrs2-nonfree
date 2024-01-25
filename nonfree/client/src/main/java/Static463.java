import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!om", name = "f", descriptor = "Lclient!lb;")
	public static Class221 aClass221_124;

	@OriginalMember(owner = "client!om", name = "c", descriptor = "I")
	public static final int anInt8119 = -1;

	@OriginalMember(owner = "client!om", name = "j", descriptor = "I")
	public static final int anInt8122 = 16777215;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!wka;B)V")
	public static void method6846(@OriginalArg(0) Class19_Sub1_Sub3_Sub2 arg0) {
		if (arg0 instanceof Class19_Sub1_Sub3_Sub2_Sub1) {
			@Pc(31) Class19_Sub1_Sub3_Sub2_Sub1 local31 = (Class19_Sub1_Sub3_Sub2_Sub1) arg0;
			if (local31.aClass18_1 != null) {
				Static127.method2136(local31.aByte146 != Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146, local31);
			}
		} else if (arg0 instanceof Class19_Sub1_Sub3_Sub2_Sub2) {
			@Pc(14) Class19_Sub1_Sub3_Sub2_Sub2 local14 = (Class19_Sub1_Sub3_Sub2_Sub2) arg0;
			Static318.method4775(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146 != local14.aByte146, local14);
		}
	}
}
