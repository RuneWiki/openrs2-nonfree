import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!pf", name = "xb", descriptor = "I")
	public static int anInt4890 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!sq;[Lclient!pf;)Lclient!pf;")
	public static Class112_Sub2 method4354(@OriginalArg(0) Class55_Sub2 arg0, @OriginalArg(1) Class112_Sub2[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class112_Sub2 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class112_Sub2(arg0, arg1);
		}
	}
}
