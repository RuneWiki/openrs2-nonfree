import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class82 implements Interface2 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IBJ[I)Lclient!dc;")
	@Override
	public Class20 method2324(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2) {
		if (arg0 == 0) {
			@Pc(11) Class5_Sub2_Sub13 local11 = Static7.method166(arg2[0]);
			return local11.method1969((int) arg1);
		} else if (arg0 == 1) {
			@Pc(25) Class5_Sub2_Sub11 local25 = Static196.method2908((int) arg1);
			return local25.aClass20_861;
		} else if (arg0 == 6) {
			return Static7.method166(arg2[0]).method1969((int) arg1);
		} else {
			return null;
		}
	}
}
