import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class265 implements Interface1 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BJLclient!cg;[I)Ljava/lang/String;")
	@Override
	public String method6030(@OriginalArg(1) long arg0, @OriginalArg(2) Class37 arg1, @OriginalArg(3) int[] arg2) {
		if (Static278.aClass37_16 == arg1) {
			@Pc(13) Class221 local13 = Static384.aClass162_1.method3228(arg2[0]);
			return local13.method5114((int) arg0);
		} else if (Static118.aClass37_8 == arg1 || arg1 == Static125.aClass37_13) {
			@Pc(36) Class218 local36 = Static413.aClass271_2.method6193((int) arg0);
			return local36.aString65;
		} else if (Static97.aClass37_6 == arg1 || Static271.aClass37_15 == arg1 || Static266.aClass37_14 == arg1) {
			return Static384.aClass162_1.method3228(arg2[0]).method5114((int) arg0);
		} else {
			return null;
		}
	}
}
