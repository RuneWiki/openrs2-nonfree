import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!qe", name = "C", descriptor = "[[I")
	public static int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!qe", name = "P", descriptor = "Lclient!jd;")
	public static final Class119 aClass119_15 = new Class119(10, 2, 2, 0);

	@OriginalMember(owner = "client!qe", name = "Bb", descriptor = "I")
	public static int anInt5863 = -1;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lclient!eo;")
	public static Class68 method4661(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(15) int local15 = arg0 & 0xFFFF;
		if (Static300.aClass68ArrayArray3[local7] == null || Static300.aClass68ArrayArray3[local7][local15] == null) {
			@Pc(31) boolean local31 = Static294.method4291(local7);
			if (!local31) {
				return null;
			}
		}
		return Static300.aClass68ArrayArray3[local7][local15];
	}
}
