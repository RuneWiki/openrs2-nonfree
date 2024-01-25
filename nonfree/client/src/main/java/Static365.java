import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!wq", name = "kc", descriptor = "I")
	public static int anInt7025 = 0;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!me;[Lclient!wq;)Lclient!wq;")
	public static Class49_Sub2 method5861(@OriginalArg(0) Class37_Sub2 arg0, @OriginalArg(1) Class49_Sub2[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class49_Sub2 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class49_Sub2(arg0, arg1);
		}
	}
}
