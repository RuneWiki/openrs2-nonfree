import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class102 implements Interface4 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "([IIBJ)Ljava/lang/String;")
	@Override
	public String method2587(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2) {
		if (arg1 == 0) {
			@Pc(19) Class1_Sub5_Sub15 local19 = Static114.method2082(arg0[0]);
			return local19.method3182((int) arg2);
		} else if (arg1 == 1 || arg1 == 10) {
			@Pc(40) Class3 local40 = Static69.method1330((int) arg2);
			return local40.aString3;
		} else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
			return Static114.method2082(arg0[0]).method3182((int) arg2);
		} else {
			return null;
		}
	}
}
