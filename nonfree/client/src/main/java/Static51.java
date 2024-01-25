import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "Lclient!re;")
	public static Class207 aClass207_1;

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "Lclient!ap;")
	public static Class14 aClass14_4;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
	public static int anInt913 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)V")
	public static void method805(@OriginalArg(0) int arg0) {
		if (Static426.anIntArray479 == null || Static426.anIntArray479.length < arg0) {
			Static426.anIntArray479 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public static void method806() {
		if (Static383.anInt6298 < 0) {
			return;
		}
		@Pc(11) long local11 = Static446.method5903();
		Static383.anInt6298 = (int) ((long) Static383.anInt6298 + Static359.aLong180 - local11);
		if (Static383.anInt6298 > 0) {
			@Pc(28) int local28 = (Static383.anInt6298 << 8) / Static447.anInt7361;
			@Pc(33) int local33 = 255 - local28;
			@Pc(38) float local38 = (float) local28 / 255.0F;
			@Pc(42) float local42 = 1.0F - local38;
			Static246.anInt3976 = (local33 * (Static424.aClass196_2.anInt5076 & 0xFF00FF) + (Static444.anInt7359 & 0xFF00FF) * local28 & 0xFF00FF00) + (local28 * (Static444.anInt7359 & 0xFF00) + local33 * (Static424.aClass196_2.anInt5076 & 0xFF00) & 0xFF0000) >>> 8;
			Static397.aFloat151 = Static187.aFloat127 + (Static424.aClass196_2.aFloat122 - Static187.aFloat127) * local42;
			Static351.aFloat141 = local42 * (Static424.aClass196_2.aFloat121 - Static441.aFloat179) + Static441.aFloat179;
			Static229.aFloat93 = local42 * (Static424.aClass196_2.aFloat126 - Static105.aFloat37) + Static105.aFloat37;
			Static217.aFloat90 = Static337.aFloat131 + local42 * (Static424.aClass196_2.aFloat125 - Static337.aFloat131);
			Static116.anInt1975 = Static424.aClass196_2.anInt5064 * local33 + Static195.anInt3247 * local28 >> 8;
			Static210.aFloat86 = Static170.aFloat68 + (Static424.aClass196_2.aFloat123 - Static170.aFloat68) * local42;
			Static300.anInt4682 = ((Static23.anInt504 & 0xFF00) * local28 + local33 * (Static424.aClass196_2.anInt5074 & 0xFF00) & 0xFF0000) + ((Static23.anInt504 & 0xFF00FF) * local28 + local33 * (Static424.aClass196_2.anInt5074 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static38.aFloat116 = Static208.aFloat85 + local42 * (Static424.aClass196_2.aFloat124 - Static208.aFloat85);
			if (Static424.aClass196_2.aClass24_3 != Static371.aClass24_4) {
				Static300.aClass24_2 = Static348.aClass200_7.method5823(Static371.aClass24_4, Static424.aClass196_2.aClass24_3, local42, Static300.aClass24_2);
			}
		} else {
			Static300.anInt4682 = Static424.aClass196_2.anInt5074;
			Static246.anInt3976 = Static424.aClass196_2.anInt5076;
			Static217.aFloat90 = Static424.aClass196_2.aFloat125;
			Static397.aFloat151 = Static424.aClass196_2.aFloat122;
			Static229.aFloat93 = Static424.aClass196_2.aFloat126;
			Static116.anInt1975 = Static424.aClass196_2.anInt5064;
			Static300.aClass24_2 = Static424.aClass196_2.aClass24_3;
			Static38.aFloat116 = Static424.aClass196_2.aFloat124;
			Static351.aFloat141 = Static424.aClass196_2.aFloat121;
			Static210.aFloat86 = Static424.aClass196_2.aFloat123;
			Static383.anInt6298 = -1;
		}
		Static359.aLong180 = local11;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BILclient!za;I)V")
	public static void method807(@OriginalArg(1) int arg0, @OriginalArg(2) Class200 arg1, @OriginalArg(3) int arg2) {
		Static277.aClass196ArrayArray1 = new Class196[arg0][arg2];
		Static348.aClass200_7 = arg1;
		if (Static456.anIntArray507 != null) {
			Static191.aClass24_1 = Static32.method545(Static456.anIntArray507[1], Static456.anIntArray507[5], Static456.anIntArray507[0], Static456.anIntArray507[4], Static456.anIntArray507[3], Static456.anIntArray507[2]);
		}
		Static66.aClass196_1 = new Class196();
		Static224.method2950();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZI)I")
	public static int method808(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static347.method4519(arg1 - 1, arg0 + -1) + Static347.method4519(arg1 - 1, arg0 + 1) + Static347.method4519(arg1 - -1, arg0 + -1) + Static347.method4519(arg1 + 1, arg0 + 1);
		@Pc(74) int local74 = Static347.method4519(arg1, arg0 - 1) + Static347.method4519(arg1, arg0 + 1) + Static347.method4519(arg1 - 1, arg0) + Static347.method4519(arg1 + 1, arg0);
		@Pc(79) int local79 = Static347.method4519(arg1, arg0);
		return local79 / 4 + local74 / 8 + local40 / 16;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
	public static void method810(@OriginalArg(1) int arg0) {
		Static264.anIntArray332 = new int[arg0];
		Static275.anIntArray342 = new int[arg0];
		Static439.anIntArray491 = new int[arg0];
		Static432.anIntArray485 = new int[arg0];
		Static238.anIntArray250 = new int[arg0];
	}
}
