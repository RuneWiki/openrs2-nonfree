import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
	public static int anInt3356 = 0;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!co;[Lclient!ka;)Lclient!ka;")
	public static Class73_Sub1 method3060(@OriginalArg(0) Class32_Sub1 arg0, @OriginalArg(1) Class73_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class73_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class73_Sub1(arg0, arg1);
		}
	}
}
