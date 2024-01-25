import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class30 implements Interface13 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ui;IJ[I)Ljava/lang/String;")
	@Override
	public String method506(@OriginalArg(0) Class329 arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2) {
		if (Static499.aClass329_39 == arg0) {
			@Pc(20) Class70 local20 = Static227.aClass344_1.method7704(arg2[0]);
			return local20.method2041((int) arg1);
		} else if (Static215.aClass329_26 == arg0 || arg0 == Static540.aClass329_62) {
			@Pc(38) Class133 local38 = Static272.aClass121_2.method3327((int) arg1);
			return local38.aString106;
		} else if (arg0 == Static360.aClass329_70 || Static478.aClass329_54 == arg0 || arg0 == Static243.aClass329_60) {
			return Static227.aClass344_1.method7704(arg2[0]).method2041((int) arg1);
		} else {
			return null;
		}
	}
}
