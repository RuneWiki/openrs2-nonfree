import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Lclient!of;")
	public static final Class188 aClass188_47 = new Class188(4);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
	public static void method4907(@OriginalArg(1) int arg0) {
		for (@Pc(13) Class2 local13 = Static439.aClass220_43.method5096(); local13 != null; local13 = Static439.aClass220_43.method5098()) {
			if ((long) arg0 == (local13.aLong401 >> 48 & 0xFFFFL)) {
				local13.method6260();
			}
		}
	}
}
