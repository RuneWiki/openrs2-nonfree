import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
	public static int anInt2082 = 0;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!dq;[Lclient!eq;)Lclient!eq;")
	public static Class38_Sub2 method1942(@OriginalArg(0) Class47_Sub1 arg0, @OriginalArg(1) Class38_Sub2[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class38_Sub2 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class38_Sub2(arg0, arg1);
		}
	}
}
