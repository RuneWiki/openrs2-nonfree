import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class42 implements Interface21 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(JLclient!fia;I[I)Ljava/lang/String;")
	@Override
	public String method1205(@OriginalArg(0) long arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(3) int[] arg2) {
		if (Static480.aClass117_11 == arg1) {
			@Pc(13) Class295 local13 = Static132.aClass184_1.method4465(arg2[0]);
			return local13.method6817((int) arg0);
		} else if (arg1 == Static539.aClass117_13 || arg1 == Static114.aClass117_6) {
			@Pc(31) Class327 local31 = Static470.aClass250_1.method5960((int) arg0);
			return local31.aString86;
		} else if (arg1 == Static492.aClass117_12 || Static416.aClass117_10 == arg1 || Static467.aClass117_21 == arg1) {
			return Static132.aClass184_1.method4465(arg2[0]).method6817((int) arg0);
		} else {
			return null;
		}
	}
}
