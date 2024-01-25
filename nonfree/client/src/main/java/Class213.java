import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class213 implements Interface3 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(JLclient!ef;I[I)Ljava/lang/String;")
	@Override
	public String method4540(@OriginalArg(0) long arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 == Static247.aClass61_6) {
			@Pc(13) Class197 local13 = Static106.aClass211_1.method4512(arg2[0]);
			return local13.method4325((int) arg0);
		} else if (Static244.aClass61_5 == arg1 || arg1 == Static396.aClass61_12) {
			@Pc(33) Class81 local33 = Static314.aClass12_2.method327((int) arg0);
			return local33.aString17;
		} else if (arg1 == Static151.aClass61_1 || Static275.aClass61_8 == arg1 || Static421.aClass61_13 == arg1) {
			return Static106.aClass211_1.method4512(arg2[0]).method4325((int) arg0);
		} else {
			return null;
		}
	}
}
