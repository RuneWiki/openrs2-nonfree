import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class146 implements Interface5 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BJ[II)Ljava/lang/String;")
	@Override
	public String method3765(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			@Pc(19) Class1_Sub2_Sub10 local19 = Static30.method509(arg1[0]);
			return local19.method1765((int) arg0);
		} else if (arg2 == 1 || arg2 == 10) {
			@Pc(38) Class120 local38 = Static183.method4458((int) arg0);
			return local38.aString113;
		} else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
			return Static30.method509(arg1[0]).method1765((int) arg0);
		} else {
			return null;
		}
	}
}
