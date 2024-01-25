import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class320 implements Interface6 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!tda;[IBJ)Ljava/lang/String;")
	@Override
	public String method7977(@OriginalArg(0) Class273 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2) {
		if (Static452.aClass273_11 == arg0) {
			@Pc(15) Class193 local15 = Static459.aClass240_1.method5913(arg1[0]);
			return local15.method5031((int) arg2);
		} else if (arg0 == Static379.aClass273_10 || Static542.aClass273_14 == arg0) {
			@Pc(33) Class192 local33 = Static454.aClass153_2.method4007((int) arg2);
			return local33.aString55;
		} else if (Static221.aClass273_5 == arg0 || arg0 == Static182.aClass273_3 || arg0 == Static278.aClass273_6) {
			return Static459.aClass240_1.method5913(arg1[0]).method5031((int) arg2);
		} else {
			return null;
		}
	}
}
