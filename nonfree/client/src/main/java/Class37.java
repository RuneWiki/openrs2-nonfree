import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class37 implements Interface1 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IJ[II)Ljava/lang/String;")
	@Override
	public String method921(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			@Pc(18) Class4_Sub2_Sub10 local18 = Static279.method4164(arg1[0]);
			return local18.method1445((int) arg0);
		} else if (arg2 == 1 || arg2 == 10) {
			@Pc(36) Class163 local36 = Static277.method4117((int) arg0);
			return local36.aString169;
		} else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
			return Static279.method4164(arg1[0]).method1445((int) arg0);
		} else {
			return null;
		}
	}
}
