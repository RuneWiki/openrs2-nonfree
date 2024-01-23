import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class130 implements Interface1 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(J[IBI)Ljava/lang/String;")
	@Override
	public String method3237(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			@Pc(18) Class4_Sub3_Sub3 local18 = Static138.method2057(arg1[0]);
			return local18.method606((int) arg0);
		} else if (arg2 == 1 || arg2 == 10) {
			@Pc(38) Class165 local38 = Static287.method4398((int) arg0);
			return local38.aString315;
		} else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
			return Static138.method2057(arg1[0]).method606((int) arg0);
		} else {
			return null;
		}
	}
}
