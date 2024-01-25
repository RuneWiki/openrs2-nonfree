import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class70 implements Interface1 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([IBJI)Ljava/lang/String;")
	@Override
	public String method1694(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			@Pc(20) Class159 local20 = Static289.aClass235_1.method5390(arg0[0]);
			return local20.method3549((int) arg1);
		} else if (arg2 == 1 || arg2 == 10) {
			@Pc(40) Class179 local40 = Static15.aClass81_1.method2175((int) arg1);
			return local40.aString51;
		} else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
			return Static289.aClass235_1.method5390(arg0[0]).method3549((int) arg1);
		} else {
			return null;
		}
	}
}
