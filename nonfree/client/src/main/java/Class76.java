import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class76 implements Interface4 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([IIJI)Lclient!i;")
	@Override
	public Class41 method2310(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		if (arg1 == 0) {
			@Pc(16) Class2_Sub2_Sub6 local16 = Static150.method2351(arg0[0]);
			return local16.method902((int) arg2);
		} else if (arg1 == 1 || arg1 == 10) {
			@Pc(35) Class2_Sub2_Sub15 local35 = Static63.method1158((int) arg2);
			return local35.aClass41_858;
		} else if (arg1 == 6 || arg1 == 7) {
			return Static150.method2351(arg0[0]).method902((int) arg2);
		} else {
			return null;
		}
	}
}
