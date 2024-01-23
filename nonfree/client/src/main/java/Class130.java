import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class130 implements Interface2 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(JI[II)Ljava/lang/String;")
	@Override
	public String method3374(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			@Pc(13) Class1_Sub3_Sub14 local13 = Static94.method1608(arg1[0]);
			return local13.method2804((int) arg0);
		} else if (arg2 == 1 || arg2 == 10) {
			@Pc(38) Class57 local38 = Static56.method1050((int) arg0);
			return local38.aString102;
		} else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
			return Static94.method1608(arg1[0]).method2804((int) arg0);
		} else {
			return null;
		}
	}
}
