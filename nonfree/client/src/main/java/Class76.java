import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class76 implements Interface6 {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IJ[IZ)Ljava/lang/String;")
	@Override
	public String method2165(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int[] arg2) {
		if (arg0 == 0) {
			@Pc(14) Class5_Sub9_Sub5 local14 = Static66.method1397(arg2[0]);
			return local14.method1764((int) arg1);
		} else if (arg0 == 1 || arg0 == 10) {
			@Pc(35) Class165 local35 = Static88.method1382((int) arg1);
			return local35.aString291;
		} else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
			return Static66.method1397(arg2[0]).method1764((int) arg1);
		} else {
			return null;
		}
	}
}
