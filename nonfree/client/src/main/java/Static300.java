import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!mba", name = "p", descriptor = "Lclient!ha;")
	public static Class25 aClass25_15;

	@OriginalMember(owner = "client!mba", name = "t", descriptor = "I")
	public static int anInt5968;

	@OriginalMember(owner = "client!mba", name = "u", descriptor = "Lclient!jq;")
	public static Class5_Sub28_Sub1 aClass5_Sub28_Sub1_1;

	@OriginalMember(owner = "client!mba", name = "m", descriptor = "Lclient!jc;")
	public static final Class155 aClass155_2 = new Class155("runescape", 0);

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BII)Z")
	public static boolean method4969(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static218.aBoolean250) {
			return false;
		}
		@Pc(18) int local18 = arg1 >> 16;
		@Pc(22) int local22 = arg1 & 0xFFFF;
		if (Static139.aClass220ArrayArray1[local18] == null || Static139.aClass220ArrayArray1[local18][local22] == null) {
			return false;
		}
		@Pc(40) Class220 local40 = Static139.aClass220ArrayArray1[local18][local22];
		@Pc(54) Class5_Sub47 local54;
		if (arg0 == -1 && local40.anInt6669 == 0) {
			for (local54 = (Class5_Sub47) Static521.aClass99_78.method2526(); local54 != null; local54 = (Class5_Sub47) Static521.aClass99_78.method2519()) {
				if (local54.anInt8474 == 5 || local54.anInt8474 == 1007 || local54.anInt8474 == 12 || local54.anInt8474 == 22 || local54.anInt8474 == 58) {
					for (@Pc(87) Class220 local87 = Static352.method5447(local54.anInt8477); local87 != null; local87 = Static73.method1344(local87)) {
						if (local40.anInt6661 == local87.anInt6661) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = (Class5_Sub47) Static521.aClass99_78.method2526(); local54 != null; local54 = (Class5_Sub47) Static521.aClass99_78.method2519()) {
				if (local54.anInt8479 == arg0 && local40.anInt6661 == local54.anInt8477 && (local54.anInt8474 == 5 || local54.anInt8474 == 1007 || local54.anInt8474 == 12 || local54.anInt8474 == 22 || local54.anInt8474 == 58)) {
					return true;
				}
			}
		}
		return false;
	}
}
