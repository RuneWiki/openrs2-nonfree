import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!aq;[Lclient!uh;)Lclient!uh;")
	public static Class20_Sub1_Sub2 method7295(@OriginalArg(0) Class14_Sub1_Sub1 arg0, @OriginalArg(1) Class20_Sub1_Sub2[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class20_Sub1_Sub2 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class20_Sub1_Sub2(arg0, arg1);
		}
	}
}
