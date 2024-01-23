import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class159 implements Interface4 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(JI[II)Ljava/lang/String;")
	@Override
	public String method3844(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			@Pc(14) Class1_Sub1_Sub22 local14 = Static130.method2050(arg1[0]);
			return local14.method4177((int) arg0);
		} else if (arg2 == 1 || arg2 == 10) {
			@Pc(34) Class149 local34 = Static271.method4006((int) arg0);
			return local34.aString159;
		} else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
			return Static130.method2050(arg1[0]).method4177((int) arg0);
		} else {
			return null;
		}
	}
}
