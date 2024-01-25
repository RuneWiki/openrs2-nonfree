import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!em", name = "ob", descriptor = "I")
	public static int anInt1779 = 0;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!kd;[Lclient!em;)Lclient!em;")
	public static Class45_Sub2 method1841(@OriginalArg(0) Class46_Sub1 arg0, @OriginalArg(1) Class45_Sub2[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class45_Sub2 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class45_Sub2(arg0, arg1);
		}
	}
}
