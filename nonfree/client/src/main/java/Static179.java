import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
	public static int anInt3563 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!ma;[Lclient!lj;)Lclient!lj;")
	public static Class126_Sub1 method3014(@OriginalArg(0) Class129_Sub1 arg0, @OriginalArg(1) Class126_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class126_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class126_Sub1(arg0, arg1);
		}
	}
}
