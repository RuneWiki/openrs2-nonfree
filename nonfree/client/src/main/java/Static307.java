import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "[Lclient!kba;")
	public static Class198[] aClass198Array1;

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(Lclient!lb;IB)Lclient!bka;")
	public static Class9 method4661(@OriginalArg(0) Class221 arg0, @OriginalArg(1) int arg1) {
		@Pc(17) Class9 local17 = (Class9) Static384.aClass338_36.method8049((long) arg1);
		if (local17 == null) {
			if (Static711.aBoolean802) {
				local17 = Static488.aClass67_12.method7659(Static728.method4751(arg0, arg1), true);
			} else {
				local17 = Static141.method2358(arg0.method5077(arg1));
			}
			Static384.aClass338_36.method8044((long) arg1, local17);
		}
		return local17;
	}
}
