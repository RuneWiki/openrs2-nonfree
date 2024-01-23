import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "[I")
	public static int[] anIntArray523;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!ek;")
	public static Class42 aClass42_97;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
	public static int anInt5486;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!ek;")
	public static Class42 aClass42_98;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "Lclient!ek;")
	public static Class42 aClass42_99;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
	public static int[] anIntArray524 = new int[50];

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray39 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString191 = "wave2:";

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Lclient!tk;")
	public static Class170 method4341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub13 local7 = Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1544; local13++) {
			@Pc(22) Class170 local22 = local7.aClass170Array1[local13];
			if ((local22.aLong195 >> 29 & 0x3L) == 2L && local22.anInt5433 == arg1 && local22.anInt5437 == arg2) {
				return local22;
			}
		}
		return null;
	}
}
