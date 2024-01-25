import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class109 implements Interface21 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BJLclient!lda;[I)Ljava/lang/String;")
	@Override
	public String method2684(@OriginalArg(1) long arg0, @OriginalArg(2) Class225 arg1, @OriginalArg(3) int[] arg2) {
		if (Static311.aClass225_8 == arg1) {
			@Pc(13) Class59 local13 = Static170.aClass191_1.method4685(arg2[0]);
			return local13.method1295((int) arg0);
		} else if (Static56.aClass225_2 == arg1 || Static589.aClass225_13 == arg1) {
			@Pc(33) Class91 local33 = Static243.aClass406_2.method9394((int) arg0);
			return local33.aString47;
		} else if (Static439.aClass225_10 == arg1 || arg1 == Static435.aClass225_9 || arg1 == Static672.aClass225_14) {
			return Static170.aClass191_1.method4685(arg2[0]).method1295((int) arg0);
		} else {
			return null;
		}
	}
}
