import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_238 = new Class381(75, -1);

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
	public static int anInt8972 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)Lclient!mm;")
	public static Class240 method7706(@OriginalArg(1) int arg0) {
		@Pc(17) Class240[] local17 = Static288.method4586();
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(25) Class240 local25 = local17[local19];
			if (local25.anInt6237 == arg0) {
				return local25;
			}
		}
		return null;
	}
}
