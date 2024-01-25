import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class35 implements Interface2 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[IJ)Ljava/lang/String;")
	@Override
	public String method637(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2) {
		if (arg0 == 0) {
			@Pc(14) Class5_Sub1_Sub15 local14 = Static109.method1935(arg1[0]);
			return local14.method4039((int) arg2);
		} else if (arg0 == 1 || arg0 == 10) {
			@Pc(35) Class130 local35 = Static322.method544((int) arg2);
			return local35.aString26;
		} else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
			return Static109.method1935(arg1[0]).method4039((int) arg2);
		} else {
			return null;
		}
	}
}
