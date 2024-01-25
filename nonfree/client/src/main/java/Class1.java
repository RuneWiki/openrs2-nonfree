import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 implements Interface3 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IJLclient!ak;[I)Ljava/lang/String;")
	@Override
	public String method2(@OriginalArg(1) long arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 == Static400.aClass10_20) {
			@Pc(13) Class79 local13 = Static176.aClass192_1.method4482(arg2[0]);
			return local13.method2014((int) arg0);
		} else if (Static441.aClass10_26 == arg1 || Static167.aClass10_22 == arg1) {
			@Pc(31) Class4 local31 = Static380.aClass231_2.method5648((int) arg0);
			return local31.aString1;
		} else if (Static294.aClass10_15 == arg1 || arg1 == Static248.aClass10_25 || Static214.aClass10_13 == arg1) {
			return Static176.aClass192_1.method4482(arg2[0]).method2014((int) arg0);
		} else {
			return null;
		}
	}
}
