import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bd", name = "ib", descriptor = "I")
	public static int anInt374 = 0;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!wb;[Lclient!bd;)Lclient!bd;")
	public static Class22_Sub1 method362(@OriginalArg(0) Class164_Sub2 arg0, @OriginalArg(1) Class22_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class22_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class22_Sub1(arg0, arg1);
		}
	}
}
