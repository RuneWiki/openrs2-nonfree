import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!u", name = "B", descriptor = "Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3 aClass1_Sub2_Sub8_Sub3_7;

	@OriginalMember(owner = "client!u", name = "s", descriptor = "I")
	public static int anInt4151 = 0;

	@OriginalMember(owner = "client!u", name = "t", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!u", name = "w", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1196 = Static81.method1507("Unable to connect)3");

	@OriginalMember(owner = "client!u", name = "u", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1194 = aClass24_1196;

	@OriginalMember(owner = "client!u", name = "v", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1195 = Static81.method1507("null");

	@OriginalMember(owner = "client!u", name = "y", descriptor = "Lclient!s;")
	public static Class87 aClass87_28 = new Class87();

	@OriginalMember(owner = "client!u", name = "z", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1197 = aClass24_1196;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = arg3 * Static75.anInt4697 + arg0 * Static70.anInt3207 >> 16;
		@Pc(19) int local19 = arg3 * Static70.anInt3207 - arg0 * Static75.anInt4697 >> 16;
		@Pc(29) int local29 = arg1 * Static152.anInt3381 + local19 * Static136.anInt3052 >> 16;
		@Pc(39) int local39 = arg1 * Static136.anInt3052 - local19 * Static152.anInt3381 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static152.anInt3381 + local19 * Static136.anInt3052 >> 16;
		@Pc(76) int local76 = arg2 * Static136.anInt3052 - local19 * Static152.anInt3381 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > 3500 && local66 > 3500) {
			return false;
		} else if (local50 < Static55.anInt1374 && local87 < Static55.anInt1374) {
			return false;
		} else if (local50 > Static140.anInt3139 && local87 > Static140.anInt3139) {
			return false;
		} else if (local56 < Static105.anInt2371 && local93 < Static105.anInt2371) {
			return false;
		} else {
			return local56 <= Static172.anInt3846 || local93 <= Static172.anInt3846;
		}
	}
}
