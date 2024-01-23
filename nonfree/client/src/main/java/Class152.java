import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class152 implements Interface3 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IJ[II)Ljava/lang/String;")
	@Override
	public String method3806(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int[] arg2) {
		if (arg0 == 0) {
			@Pc(12) Class1_Sub2_Sub17 local12 = Static215.method3402(arg2[0]);
			return local12.method3435((int) arg1);
		} else if (arg0 == 1 || arg0 == 10) {
			@Pc(32) Class42 local32 = Static112.method2060((int) arg1);
			return local32.aString87;
		} else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
			return Static215.method3402(arg2[0]).method3435((int) arg1);
		} else {
			return null;
		}
	}
}
