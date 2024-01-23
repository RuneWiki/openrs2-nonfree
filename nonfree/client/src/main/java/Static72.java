import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "Lclient!qe;")
	public static Class13_Sub5_Sub1 aClass13_Sub5_Sub1_1;

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString57 = "Opened title screen";

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
	public static int anInt1466 = 0;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString58 = "flash2:";

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method1221() {
		if (Static208.anInt4072 < 0) {
			Static230.anInt4619 = -1;
			Static208.anInt4072 = 0;
			Static165.anInt3317 = -1;
		}
		if (Static207.anInt2141 < Static208.anInt4072) {
			Static165.anInt3317 = -1;
			Static208.anInt4072 = Static207.anInt2141;
			Static230.anInt4619 = -1;
		}
		if (Static104.anInt2092 < 0) {
			Static165.anInt3317 = -1;
			Static230.anInt4619 = -1;
			Static104.anInt2092 = 0;
		}
		if (Static104.anInt2092 > Static158.anInt3242) {
			Static104.anInt2092 = Static158.anInt3242;
			Static230.anInt4619 = -1;
			Static165.anInt3317 = -1;
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	public static void method1223() {
		@Pc(4) int[] local4 = new int[Static94.anInt1868];
		@Pc(6) int local6 = 0;
		@Pc(18) int local18;
		for (local18 = 0; local18 < Static94.anInt1868; local18++) {
			@Pc(25) Class29 local25 = Static187.method3128(local18);
			if (local25.anInt1021 >= 0 || local25.anInt1010 >= 0) {
				local4[local6++] = local18;
			}
		}
		Static246.anIntArray385 = new int[local6];
		for (local18 = 0; local18 < local6; local18++) {
			Static246.anIntArray385[local18] = local4[local18];
		}
	}
}
