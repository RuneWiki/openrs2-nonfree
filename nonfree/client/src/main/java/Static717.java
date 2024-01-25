import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static717 {

	@OriginalMember(owner = "client!wla", name = "c", descriptor = "Lclient!ig;")
	public static Class176 aClass176_3;

	@OriginalMember(owner = "client!wla", name = "h", descriptor = "I")
	public static int anInt11159 = -50;

	@OriginalMember(owner = "client!wla", name = "a", descriptor = "(II)Lclient!ula;")
	public static Class379 method9502(@OriginalArg(0) int arg0) {
		@Pc(16) Class379[] local16 = Static515.method6957();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class379 local24 = local16[local18];
			if (local24.anInt10100 == arg0) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wla", name = "b", descriptor = "(II)I")
	public static int method9503(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
