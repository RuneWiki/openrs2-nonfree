import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class69 implements Interface4 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[IIJ)Ljava/lang/String;")
	@Override
	public String method1629(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		if (arg1 == 0) {
			@Pc(12) Class7_Sub1_Sub16 local12 = Static288.method1010(arg0[0]);
			return local12.method4895((int) arg2);
		} else if (arg1 == 1 || arg1 == 10) {
			@Pc(29) Class138 local29 = Static17.method4472((int) arg2);
			return local29.aString261;
		} else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
			return Static288.method1010(arg0[0]).method4895((int) arg2);
		} else {
			return null;
		}
	}
}
