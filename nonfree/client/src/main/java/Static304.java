import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!tg", name = "Tb", descriptor = "I")
	public static int anInt5862 = 0;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!s;[Lclient!tg;)Lclient!tg;")
	public static Class101_Sub2 method5204(@OriginalArg(0) Class59_Sub2 arg0, @OriginalArg(1) Class101_Sub2[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class101_Sub2 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class101_Sub2(arg0, arg1);
		}
	}
}
