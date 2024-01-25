import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class327 implements Interface25 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "([IJBLclient!jn;)Ljava/lang/String;")
	@Override
	public String method7852(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(3) Class178 arg2) {
		if (Static163.aClass178_6 == arg2) {
			@Pc(21) Class146 local21 = Static324.aClass307_1.method7524(arg0[0]);
			return local21.method3761((int) arg1);
		} else if (Static111.aClass178_3 == arg2 || arg2 == Static380.aClass178_12) {
			@Pc(39) Class259 local39 = Static298.aClass132_1.method3062((int) arg1);
			return local39.aString63;
		} else if (Static463.aClass178_13 == arg2 || Static146.aClass178_5 == arg2 || Static248.aClass178_9 == arg2) {
			return Static324.aClass307_1.method7524(arg0[0]).method3761((int) arg1);
		} else {
			return null;
		}
	}
}
