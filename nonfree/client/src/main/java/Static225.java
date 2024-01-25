import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
	public static int anInt4520 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!d;[Lclient!nf;)Lclient!nf;")
	public static Class159_Sub1 method4079(@OriginalArg(0) Class48_Sub1 arg0, @OriginalArg(1) Class159_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class159_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class159_Sub1(arg0, arg1);
		}
	}
}
