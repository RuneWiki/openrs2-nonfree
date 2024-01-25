import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class166 implements Interface4 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(JLclient!tk;I[I)Ljava/lang/String;")
	@Override
	public String method3893(@OriginalArg(0) long arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 == Static321.aClass225_18) {
			@Pc(13) Class46 local13 = Static304.aClass15_1.method387(arg2[0]);
			return local13.method1132((int) arg0);
		} else if (Static454.aClass225_26 == arg1 || Static165.aClass225_11 == arg1) {
			@Pc(31) Class268 local31 = Static196.aClass139_1.method3228((int) arg0);
			return local31.aString66;
		} else if (arg1 == Static280.aClass225_15 || arg1 == Static337.aClass225_25 || arg1 == Static105.aClass225_8) {
			return Static304.aClass15_1.method387(arg2[0]).method1132((int) arg0);
		} else {
			return null;
		}
	}
}
