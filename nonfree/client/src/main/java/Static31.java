import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	public static int anInt525;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!ld;")
	public static Class4_Sub6_Sub2 aClass4_Sub6_Sub2_2;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public static int anInt526;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString43 = "yellow:";

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z")
	public static boolean method508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static71.anIntArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == -Static81.anInt1871) {
			return false;
		} else if (local7 == Static81.anInt1871) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static264.method4156(local22 + 1, Static243.anIntArrayArrayArray13[arg0][arg1][arg2], local26 + 1) && Static264.method4156(local22 + 128 - 1, Static243.anIntArrayArrayArray13[arg0][arg1 + 1][arg2], local26 + 1) && Static264.method4156(local22 + 128 - 1, Static243.anIntArrayArrayArray13[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static264.method4156(local22 + 1, Static243.anIntArrayArrayArray13[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static71.anIntArrayArrayArray3[arg0][arg1][arg2] = Static81.anInt1871;
				return true;
			} else {
				Static71.anIntArrayArrayArray3[arg0][arg1][arg2] = -Static81.anInt1871;
				return false;
			}
		}
	}
}
