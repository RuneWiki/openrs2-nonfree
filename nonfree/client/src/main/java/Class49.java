import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class49 implements Interface9 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "([IZIJ)Ljava/lang/String;")
	@Override
	public String method1715(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		if (arg1 == 0) {
			@Pc(14) Class14_Sub2_Sub10 local14 = Static282.method4779(arg0[0]);
			return local14.method2989((int) arg2);
		} else if (arg1 == 1 || arg1 == 10) {
			@Pc(39) Class220 local39 = Static296.method5066((int) arg2);
			return local39.aString251;
		} else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
			return Static282.method4779(arg0[0]).method2989((int) arg2);
		} else {
			return null;
		}
	}
}
