import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class11 implements Interface3 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II[IJ)Ljava/lang/String;")
	@Override
	public String method236(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2) {
		if (arg0 == 0) {
			@Pc(12) Class4_Sub2_Sub2 local12 = Static160.method2583(arg1[0]);
			return local12.method307((int) arg2);
		} else if (arg0 == 1 || arg0 == 10) {
			@Pc(32) Class29 local32 = Static187.method3128((int) arg2);
			return local32.aString35;
		} else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
			return Static160.method2583(arg1[0]).method307((int) arg2);
		} else {
			return null;
		}
	}
}
