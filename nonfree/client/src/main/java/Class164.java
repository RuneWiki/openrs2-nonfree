import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class164 implements Interface7 {

	@OriginalMember(owner = "client!no", name = "a", descriptor = "([IIJLclient!wi;)Ljava/lang/String;")
	@Override
	public String method3648(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class263 arg2) {
		if (arg2 == Static105.aClass263_15) {
			@Pc(18) Class168 local18 = Static126.aClass206_1.method4794(arg0[0]);
			return local18.method3718((int) arg1);
		} else if (arg2 == Static50.aClass263_9 || Static175.aClass263_27 == arg2) {
			@Pc(36) Class127 local36 = Static390.aClass204_2.method4629((int) arg1);
			return local36.aString43;
		} else if (Static360.aClass263_48 == arg2 || arg2 == Static132.aClass263_18 || arg2 == Static266.aClass263_38) {
			return Static126.aClass206_1.method4794(arg0[0]).method3718((int) arg1);
		} else {
			return null;
		}
	}
}
