import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!bu", name = "S", descriptor = "F")
	public static float aFloat42;

	@OriginalMember(owner = "client!bu", name = "G", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!bu", name = "L", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_14 = new Class257(49, -1);

	@OriginalMember(owner = "client!bu", name = "Q", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_15 = new Class257(1, 7);

	@OriginalMember(owner = "client!bu", name = "R", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray6 = new String[200];

	@OriginalMember(owner = "client!bu", name = "T", descriptor = "[S")
	public static short[] aShortArray4 = new short[256];

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)V")
	public static void method1597() {
		if (Static44.anInt1555 == -1 || Static266.anInt5675 == -1) {
			return;
		}
		@Pc(23) int local23 = (Static456.anInt8379 * (Static642.anInt10687 - Static114.anInt2996) >> 16) + Static114.anInt2996;
		Static456.anInt8379 += local23;
		if (Static456.anInt8379 < 65535) {
			Static596.aBoolean731 = false;
			Static16.aBoolean77 = false;
		} else {
			Static456.anInt8379 = 65535;
			if (Static596.aBoolean731) {
				Static16.aBoolean77 = false;
			} else {
				Static16.aBoolean77 = true;
			}
			Static596.aBoolean731 = true;
		}
		@Pc(53) float local53 = (float) Static456.anInt8379 / 65535.0F;
		@Pc(56) float[] local56 = new float[3];
		@Pc(65) int local65 = Static583.anInt10014 * 2;
		@Pc(91) int local91;
		@Pc(125) int local125;
		@Pc(133) int local133;
		@Pc(138) int local138;
		@Pc(147) int local147;
		@Pc(164) int local164;
		for (@Pc(67) int local67 = 0; local67 < 3; local67++) {
			@Pc(79) int local79 = Static412.anIntArrayArrayArray11[Static44.anInt1555][local65][local67] * 3;
			local91 = Static412.anIntArrayArrayArray11[Static44.anInt1555][local65 + 1][local67] * 3;
			local125 = (Static412.anIntArrayArrayArray11[Static44.anInt1555][local65 + 2][local67] + Static412.anIntArrayArrayArray11[Static44.anInt1555][local65 + 2][local67] - Static412.anIntArrayArrayArray11[Static44.anInt1555][local65 + 3][local67]) * 3;
			local133 = Static412.anIntArrayArrayArray11[Static44.anInt1555][local65][local67];
			local138 = local91 - local79;
			local147 = local79 + local125 - local91 * 2;
			local164 = Static412.anIntArrayArrayArray11[Static44.anInt1555][local65 + 2][local67] + local91 - local133 - local125;
			local56[local67] = (float) local133 + ((local53 * (float) local164 + (float) local147) * local53 + (float) local138) * local53;
		}
		Static504.anInt8868 = (int) local56[1] * -1;
		Static377.anInt7114 = (int) local56[2] - Static594.anInt10160 * 512;
		Static637.anInt10650 = (int) local56[0] - Static628.anInt10493 * 512;
		@Pc(220) float[] local220 = new float[3];
		local91 = Static532.anInt9170 * 2;
		for (local125 = 0; local125 < 3; local125++) {
			local133 = Static412.anIntArrayArrayArray11[Static266.anInt5675][local91][local125] * 3;
			local138 = Static412.anIntArrayArrayArray11[Static266.anInt5675][local91 + 1][local125] * 3;
			local147 = (Static412.anIntArrayArrayArray11[Static266.anInt5675][local91 + 2][local125] + Static412.anIntArrayArrayArray11[Static266.anInt5675][local91 + 2][local125] - Static412.anIntArrayArrayArray11[Static266.anInt5675][local91 + 3][local125]) * 3;
			local164 = Static412.anIntArrayArrayArray11[Static266.anInt5675][local91][local125];
			@Pc(296) int local296 = local138 - local133;
			@Pc(305) int local305 = local147 + local133 - local138 * 2;
			@Pc(323) int local323 = local138 + Static412.anIntArrayArrayArray11[Static266.anInt5675][local91 + 2][local125] - local164 - local147;
			local220[local125] = (float) local164 + (((float) local305 + (float) local323 * local53) * local53 + (float) local296) * local53;
		}
		@Pc(356) float local356 = local220[0] - local56[0];
		@Pc(367) float local367 = -1.0F * (local220[1] - local56[1]);
		@Pc(375) float local375 = local220[2] - local56[2];
		@Pc(385) double local385 = Math.sqrt((double) (local375 * local375 + local356 * local356));
		Static443.anInt8245 = (int) (Math.atan2((double) local367, local385) * 2607.5945876176133D) & 0x3FFF;
		Static25.anInt1035 = (int) (-Math.atan2((double) local356, (double) local375) * 2607.5945876176133D) & 0x3FFF;
		Static512.anInt8976 = Static412.anIntArrayArrayArray11[Static44.anInt1555][local65][3] + (Static456.anInt8379 * (Static412.anIntArrayArrayArray11[Static44.anInt1555][local65 + 2][3] - Static412.anIntArrayArrayArray11[Static44.anInt1555][local65][3]) >> 16);
	}
}
