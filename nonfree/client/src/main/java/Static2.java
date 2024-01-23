import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
	public static int anInt5658;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "F")
	public static float aFloat186;

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString184;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "Lclient!ok;")
	public static Class116 aClass116_16 = null;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIII)Z")
	public static boolean method4407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * Static132.anInt2996 + arg0 * anInt5658 >> 16;
		@Pc(19) int local19 = arg3 * anInt5658 - arg0 * Static132.anInt2996 >> 16;
		@Pc(29) int local29 = arg1 * Static125.anInt2794 + local19 * Static145.anInt3480 >> 16;
		@Pc(39) int local39 = arg1 * Static145.anInt3480 - local19 * Static125.anInt2794 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static125.anInt2794 + local19 * Static145.anInt3480 >> 16;
		@Pc(76) int local76 = arg2 * Static145.anInt3480 - local19 * Static125.anInt2794 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Static9.anInt271 && local87 < Static9.anInt271) {
			return false;
		} else if (local50 > Static148.anInt3502 && local87 > Static148.anInt3502) {
			return false;
		} else if (local56 < Static91.anInt2137 && local93 < Static91.anInt2137) {
			return false;
		} else {
			return local56 <= Static234.anInt5157 || local93 <= Static234.anInt5157;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method4409() {
		if (!Static16.aBoolean22) {
			return;
		}
		@Pc(11) Class116 local11 = Static127.method2179(Static19.anInt461, Static148.anInt3504);
		if (local11 != null && local11.anObjectArray11 != null) {
			@Pc(22) Class1_Sub27 local22 = new Class1_Sub27();
			local22.aClass116_13 = local11;
			local22.anObjectArray32 = local11.anObjectArray11;
			Static22.method392(local22);
		}
		Static16.aBoolean22 = false;
		Static78.anInt1880 = -1;
		Static189.method3378(local11);
	}
}
