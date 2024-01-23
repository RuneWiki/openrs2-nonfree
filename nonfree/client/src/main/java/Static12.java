import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "o", descriptor = "Lclient!nk;")
	public static Class121 aClass121_10;

	@OriginalMember(owner = "client!al", name = "w", descriptor = "I")
	public static int anInt179;

	@OriginalMember(owner = "client!al", name = "l", descriptor = "I")
	public static int anInt176 = 0;

	@OriginalMember(owner = "client!al", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString17 = "Starting 3d Library";

	@OriginalMember(owner = "client!al", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString18 = "level: ";

	@OriginalMember(owner = "client!al", name = "v", descriptor = "[J")
	public static long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)Z")
	public static boolean method165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static197.anIntArrayArrayArray11[arg0][arg1][arg2];
		if (local7 == -Static186.anInt3555) {
			return false;
		} else if (local7 == Static186.anInt3555) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static154.method2639(local22 + 1, Static24.anIntArrayArrayArray2[arg0][arg1][arg2], local26 + 1) && Static154.method2639(local22 + 128 - 1, Static24.anIntArrayArrayArray2[arg0][arg1 + 1][arg2], local26 + 1) && Static154.method2639(local22 + 128 - 1, Static24.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static154.method2639(local22 + 1, Static24.anIntArrayArrayArray2[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static197.anIntArrayArrayArray11[arg0][arg1][arg2] = Static186.anInt3555;
				return true;
			} else {
				Static197.anIntArrayArrayArray11[arg0][arg1][arg2] = -Static186.anInt3555;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!nk;ILclient!nk;)V")
	public static void method166(@OriginalArg(0) Class121 arg0, @OriginalArg(2) Class121 arg1) {
		Static29.aClass121_15 = arg0;
		Static312.aClass121_136 = arg1;
		Static84.anInt1666 = Static312.aClass121_136.method3125(3);
	}
}
