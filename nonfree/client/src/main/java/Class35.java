import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class35 implements Interface6 {

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([IBJI)Ljava/lang/String;")
	@Override
	public String method834(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			@Pc(15) Class69 local15 = Static290.aClass105_1.method2446(arg0[0]);
			return local15.method1535((int) arg1);
		} else if (arg2 == 1 || arg2 == 10) {
			@Pc(35) Class117 local35 = Static106.aClass250_1.method5735((int) arg1);
			return local35.aString27;
		} else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
			return Static290.aClass105_1.method2446(arg0[0]).method1535((int) arg1);
		} else {
			return null;
		}
	}
}
