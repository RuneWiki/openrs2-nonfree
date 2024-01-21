import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
	public static int anInt15;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!bb;")
	public static final Class8 aClass8_3 = new Class8(64);

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "Lclient!bb;")
	public static final Class8 aClass8_4 = new Class8(64);

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_7 = Static161.method2452("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_8 = Static161.method2452("scrollen:");

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIII)Z")
	public static boolean method42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = arg3 * Static110.anInt2297 + arg0 * Static172.anInt3670 >> 16;
		@Pc(19) int local19 = arg3 * Static172.anInt3670 - arg0 * Static110.anInt2297 >> 16;
		@Pc(29) int local29 = arg1 * Static50.anInt1081 + local19 * Static36.anInt781 >> 16;
		@Pc(39) int local39 = arg1 * Static36.anInt781 - local19 * Static50.anInt1081 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static50.anInt1081 + local19 * Static36.anInt781 >> 16;
		@Pc(76) int local76 = arg2 * Static36.anInt781 - local19 * Static50.anInt1081 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > 3500 && local66 > 3500) {
			return false;
		} else if (local50 < Static92.anInt1966 && local87 < Static92.anInt1966) {
			return false;
		} else if (local50 > Static46.anInt1033 && local87 > Static46.anInt1033) {
			return false;
		} else if (local56 < Static200.anInt3942 && local93 < Static200.anInt3942) {
			return false;
		} else {
			return local56 <= Static38.anInt828 || local93 <= Static38.anInt828;
		}
	}
}
