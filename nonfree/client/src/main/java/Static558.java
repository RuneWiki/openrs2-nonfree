import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!hv;[Lclient!pe;)Lclient!pe;")
	public static Class2_Sub1_Sub2 method5817(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) Class2_Sub1_Sub2[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class2_Sub1_Sub2 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class2_Sub1_Sub2(arg0, arg1);
		}
	}
}
