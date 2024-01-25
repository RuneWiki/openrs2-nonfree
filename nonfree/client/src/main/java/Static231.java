import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZILclient!cb;)Lclient!qda;")
	public static Class59 method799(@OriginalArg(1) int arg0, @OriginalArg(2) Class50 arg1) {
		@Pc(10) Class59 local10 = (Class59) Static539.aClass265_58.method6577((long) arg0);
		if (local10 == null) {
			if (Static551.aBoolean652) {
				local10 = Static563.aClass143_13.method6247(Static684.method7235(arg1, arg0), true);
			} else {
				local10 = Static47.method625(arg1.method915(arg0));
			}
			Static539.aClass265_58.method6566(local10, (long) arg0);
		}
		return local10;
	}
}
