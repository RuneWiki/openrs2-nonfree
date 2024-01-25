import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class197 implements Interface11 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([ILclient!rr;IJ)Ljava/lang/String;")
	@Override
	public String method4408(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class220 arg1, @OriginalArg(3) long arg2) {
		if (arg1 == Static287.aClass220_7) {
			@Pc(13) Class216 local13 = Static118.aClass145_3.method3324(arg0[0]);
			return local13.method4949((int) arg2);
		} else if (Static263.aClass220_5 == arg1 || arg1 == Static457.aClass220_13) {
			@Pc(35) Class168 local35 = Static43.aClass57_1.method1414((int) arg2);
			return local35.aString37;
		} else if (arg1 == Static19.aClass220_1 || arg1 == Static422.aClass220_12 || arg1 == Static402.aClass220_10) {
			return Static118.aClass145_3.method3324(arg0[0]).method4949((int) arg2);
		} else {
			return null;
		}
	}
}
