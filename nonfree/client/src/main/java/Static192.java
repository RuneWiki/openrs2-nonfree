import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!kt", name = "Bb", descriptor = "I")
	public static int anInt3388 = 0;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!fu;[Lclient!kt;)Lclient!kt;")
	public static Class3_Sub1 method3133(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) Class3_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class3_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class3_Sub1(arg0, arg1);
		}
	}
}
