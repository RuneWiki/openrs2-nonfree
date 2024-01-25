import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_94 = new Class216(27, 3);

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V")
	public static void method4699(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class4 local14 = Static598.aClass66_42.method1992(); local14 != null; local14 = Static598.aClass66_42.method1984()) {
			if ((local14.aLong307 >> 48 & 0xFFFFL) == (long) arg0) {
				local14.method9000();
			}
		}
	}
}
