import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!fw;[Lclient!kg;)Lclient!kg;")
	public static Class97_Sub1_Sub1 method4402(@OriginalArg(0) Class4_Sub1_Sub2 arg0, @OriginalArg(1) Class97_Sub1_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class97_Sub1_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class97_Sub1_Sub1(arg0, arg1);
		}
	}
}
