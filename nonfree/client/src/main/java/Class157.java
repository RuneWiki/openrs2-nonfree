import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class157 implements Interface13 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!ff;JI[I)Ljava/lang/String;")
	@Override
	public String method3416(@OriginalArg(0) Class101 arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int[] arg2) {
		if (Static458.aClass101_13 == arg0) {
			@Pc(17) Class289 local17 = Static243.aClass118_1.method2290(arg2[0]);
			return local17.method6237((int) arg1);
		} else if (Static401.aClass101_11 == arg0 || Static150.aClass101_4 == arg0) {
			@Pc(35) Class245 local35 = Static175.aClass114_4.method2217((int) arg1);
			return local35.aString62;
		} else if (Static401.aClass101_10 == arg0 || arg0 == Static336.aClass101_9 || arg0 == Static188.aClass101_6) {
			return Static243.aClass118_1.method2290(arg2[0]).method6237((int) arg1);
		} else {
			return null;
		}
	}
}
