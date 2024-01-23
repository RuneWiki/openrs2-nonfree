import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class103 implements Interface1 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II[IJ)Ljava/lang/String;")
	@Override
	public String method2410(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2) {
		if (arg0 == 0) {
			@Pc(21) Class8_Sub1_Sub18 local21 = Static140.method2220(arg1[0]);
			return local21.method3690((int) arg2);
		} else if (arg0 == 1 || arg0 == 10) {
			@Pc(38) Class10 local38 = Static140.method2222((int) arg2);
			return local38.aString13;
		} else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
			return Static140.method2220(arg1[0]).method3690((int) arg2);
		} else {
			return null;
		}
	}
}
