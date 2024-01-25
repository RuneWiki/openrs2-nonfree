import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
	public static int anInt7117;

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_221 = new Class194(122, -2);

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IB)Lclient!bk;")
	public static Class34 method6268(@OriginalArg(0) int arg0) {
		@Pc(13) Class34[] local13 = Static504.method7330();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class34 local21 = local13[local15];
			if (arg0 == local21.anInt780) {
				return local21;
			}
		}
		return null;
	}
}
