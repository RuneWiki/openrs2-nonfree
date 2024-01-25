import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class67 implements Interface7 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[IIJ)Ljava/lang/String;")
	@Override
	public String method1573(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2) {
		if (arg0 == 0) {
			@Pc(14) Class3_Sub7_Sub19 local14 = Static42.method733(arg1[0]);
			return local14.method4446((int) arg2);
		} else if (arg0 == 1 || arg0 == 10) {
			@Pc(33) Class41 local33 = Static230.method5537((int) arg2);
			return local33.aString36;
		} else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
			return Static42.method733(arg1[0]).method4446((int) arg2);
		} else {
			return null;
		}
	}
}
