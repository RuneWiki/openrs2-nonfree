import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "Lclient!cg;")
	public static Class22 aClass22_85;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "Z")
	public static boolean aBoolean339 = false;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray32 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!cg;B)V")
	public static void method3942(@OriginalArg(0) Class22 arg0) {
		Static240.aClass22_45 = arg0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * Static174.anInt3534 + arg0 * Static222.anInt4454 >> 16;
		@Pc(19) int local19 = arg3 * Static222.anInt4454 - arg0 * Static174.anInt3534 >> 16;
		@Pc(29) int local29 = arg1 * Static45.anInt1014 + local19 * Static99.anInt1944 >> 16;
		@Pc(39) int local39 = arg1 * Static99.anInt1944 - local19 * Static45.anInt1014 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static45.anInt1014 + local19 * Static99.anInt1944 >> 16;
		@Pc(76) int local76 = arg2 * Static99.anInt1944 - local19 * Static45.anInt1014 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Static190.anInt3867 && local87 < Static190.anInt3867) {
			return false;
		} else if (local50 > Static60.anInt1354 && local87 > Static60.anInt1354) {
			return false;
		} else if (local56 < Static244.anInt4816 && local93 < Static244.anInt4816) {
			return false;
		} else {
			return local56 <= Static157.anInt314 || local93 <= Static157.anInt314;
		}
	}
}
