import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!jo", name = "I", descriptor = "[Lclient!bka;")
	public static Class9[] aClass9Array21;

	@OriginalMember(owner = "client!jo", name = "E", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_53 = new Class286(89, 3);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IB)Lclient!hda;")
	public static Class146 method4725(@OriginalArg(0) int arg0) {
		@Pc(14) Class146[] local14 = Static12.method153();
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class146 local22 = local14[local16];
			if (local22.anInt4453 == arg0) {
				return local22;
			}
		}
		return null;
	}
}
