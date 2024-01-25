import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class206 implements Interface20 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([IIJLclient!lj;)Ljava/lang/String;")
	@Override
	public String method4574(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class210 arg2) {
		if (arg2 == Static514.aClass210_13) {
			@Pc(13) Class146 local13 = Static244.aClass205_1.method4571(arg0[0]);
			return local13.method3572((int) arg1);
		} else if (arg2 == Static371.aClass210_8 || Static94.aClass210_3 == arg2) {
			@Pc(33) Class222 local33 = Static195.aClass99_1.method2798((int) arg1);
			return local33.aString72;
		} else if (arg2 == Static165.aClass210_4 || arg2 == Static27.aClass210_1 || Static297.aClass210_5 == arg2) {
			return Static244.aClass205_1.method4571(arg0[0]).method3572((int) arg1);
		} else {
			return null;
		}
	}
}
