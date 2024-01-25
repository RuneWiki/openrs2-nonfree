import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)Lclient!ne;")
	public static Class240 method4416(@OriginalArg(0) int arg0) {
		@Pc(13) Class240[] local13 = Static224.method3463();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class240 local21 = local13[local15];
			if (arg0 == local21.anInt7180) {
				return local21;
			}
		}
		return null;
	}
}
