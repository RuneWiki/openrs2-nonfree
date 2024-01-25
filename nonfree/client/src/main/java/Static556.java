import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!waa;[Lclient!kl;)Lclient!kl;")
	public static Class145_Sub1_Sub2 method4287(@OriginalArg(0) Class122_Sub1_Sub2 arg0, @OriginalArg(1) Class145_Sub1_Sub2[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class145_Sub1_Sub2 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class145_Sub1_Sub2(arg0, arg1);
		}
	}
}
