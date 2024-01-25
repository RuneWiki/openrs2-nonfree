import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class67 implements Interface20 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BJ[ILclient!dj;)Ljava/lang/String;")
	@Override
	public String method2077(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class74 arg2) {
		if (arg2 == Static141.aClass74_6) {
			@Pc(18) Class290 local18 = Static571.aClass31_1.method1344(arg1[0]);
			return local18.method7229((int) arg0);
		} else if (Static41.aClass74_2 == arg2 || arg2 == Static585.aClass74_15) {
			@Pc(36) Class38 local36 = Static320.aClass53_2.method1770((int) arg0);
			return local36.aString6;
		} else if (arg2 == Static141.aClass74_5 || Static329.aClass74_12 == arg2 || Static205.aClass74_8 == arg2) {
			return Static571.aClass31_1.method1344(arg1[0]).method7229((int) arg0);
		} else {
			return null;
		}
	}
}
