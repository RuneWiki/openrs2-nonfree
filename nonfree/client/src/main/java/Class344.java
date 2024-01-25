import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class344 implements Interface24 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([IBJLclient!ln;)Ljava/lang/String;")
	@Override
	public String method8137(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class216 arg2) {
		if (Static635.aClass216_18 == arg2) {
			@Pc(15) Class318 local15 = Static577.aClass105_1.method2218(arg0[0]);
			return local15.method7634((int) arg1);
		} else if (arg2 == Static136.aClass216_5 || arg2 == Static542.aClass216_15) {
			@Pc(33) Class255 local33 = Static643.aClass275_2.method6641((int) arg1);
			return local33.aString73;
		} else if (arg2 == Static33.aClass216_2 || arg2 == Static576.aClass216_16 || arg2 == Static378.aClass216_10) {
			return Static577.aClass105_1.method2218(arg0[0]).method7634((int) arg1);
		} else {
			return null;
		}
	}
}
