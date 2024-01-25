import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class177 implements Interface6 {

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(JLclient!hi;[II)Ljava/lang/String;")
	@Override
	public String method4094(@OriginalArg(0) long arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) int[] arg2) {
		if (Static339.aClass106_12 == arg1) {
			@Pc(17) Class143 local17 = Static35.aClass122_1.method2750(arg2[0]);
			return local17.method3277((int) arg0);
		} else if (Static199.aClass106_5 == arg1 || Static161.aClass106_2 == arg1) {
			@Pc(35) Class32 local35 = Static354.aClass170_2.method3865((int) arg0);
			return local35.aString8;
		} else if (arg1 == Static188.aClass106_4 || arg1 == Static274.aClass106_9 || Static208.aClass106_6 == arg1) {
			return Static35.aClass122_1.method2750(arg2[0]).method3277((int) arg0);
		} else {
			return null;
		}
	}
}
