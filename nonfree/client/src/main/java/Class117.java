import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class117 implements Interface1 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IJ[II)Lclient!ia;")
	@Override
	public Class51 method3497(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			@Pc(14) Class1_Sub2_Sub6 local14 = Static19.method3354(arg1[0]);
			return local14.method1183((int) arg0);
		} else if (arg2 == 1 || arg2 == 10) {
			@Pc(37) Class92 local37 = Static36.method637((int) arg0);
			return local37.aClass51_1254;
		} else if (arg2 == 6 || arg2 == 7) {
			return Static19.method3354(arg1[0]).method1183((int) arg0);
		} else {
			return null;
		}
	}
}
