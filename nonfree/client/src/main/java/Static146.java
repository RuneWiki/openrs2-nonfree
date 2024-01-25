import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!hf", name = "db", descriptor = "[[[Lclient!mm;")
	public static Class162[][][] aClass162ArrayArrayArray1;

	@OriginalMember(owner = "client!hf", name = "eb", descriptor = "Lclient!eu;")
	public static Class4_Sub14 aClass4_Sub14_2;

	@OriginalMember(owner = "client!hf", name = "fb", descriptor = "Lclient!rv;")
	public static Class228 aClass228_1;

	@OriginalMember(owner = "client!hf", name = "U", descriptor = "Lclient!sc;")
	public static final Class231 aClass231_1 = new Class231();

	@OriginalMember(owner = "client!hf", name = "V", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[100];

	@OriginalMember(owner = "client!hf", name = "Z", descriptor = "S")
	public static short aShort24 = 32767;

	@OriginalMember(owner = "client!hf", name = "ab", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_45 = new Class212(1, -1);

	@OriginalMember(owner = "client!hf", name = "cb", descriptor = "I")
	public static int anInt3029 = 765;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V")
	public static void method2690() {
		if (Static248.anInt4793 == -1) {
			return;
		}
		@Pc(12) int local12 = Static329.aClass95_1.method5170();
		@Pc(16) int local16 = Static329.aClass95_1.method5175();
		@Pc(21) Class4_Sub15 local21 = (Class4_Sub15) Static296.aClass91_50.method2584();
		if (local21 != null) {
			local12 = local21.method5049();
			local16 = local21.method5050();
		}
		Static381.method5394(0, 0, Static248.anInt4793, 0, local12, local16, 0, Static30.anInt518, Static374.anInt6595);
		if (Static89.aClass240_7 != null) {
			Static26.method399(local16, local12);
		}
	}

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)V")
	public static void method2691() {
		if (Static107.anIntArray200 != null) {
			return;
		}
		Static107.anIntArray200 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
			@Pc(41) float local41 = ((float) (local28 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(50) float local50 = (float) (local28 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(52) int local52 = 0; local52 < 128; local52++) {
				@Pc(59) float local59 = (float) local52 / 128.0F;
				@Pc(61) float local61 = 0.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(69) float local69 = local41 / 60.0F;
				@Pc(72) int local72 = (int) local69;
				@Pc(76) int local76 = local72 % 6;
				@Pc(81) float local81 = local69 - (float) local72;
				@Pc(87) float local87 = local59 * (1.0F - local50);
				@Pc(95) float local95 = (1.0F - local50 * local81) * local59;
				@Pc(106) float local106 = (1.0F - local50 * (1.0F - local81)) * local59;
				if (local76 == 0) {
					local63 = local106;
					local61 = local59;
					local65 = local87;
				} else if (local76 == 1) {
					local63 = local59;
					local61 = local95;
					local65 = local87;
				} else if (local76 == 2) {
					local63 = local59;
					local65 = local106;
					local61 = local87;
				} else if (local76 == 3) {
					local65 = local59;
					local61 = local87;
					local63 = local95;
				} else if (local76 == 4) {
					local61 = local106;
					local65 = local59;
					local63 = local87;
				} else if (local76 == 5) {
					local63 = local87;
					local61 = local59;
					local65 = local95;
				}
				local61 = (float) Math.pow((double) local61, local24);
				local63 = (float) Math.pow((double) local63, local24);
				local65 = (float) Math.pow((double) local65, local24);
				@Pc(201) int local201 = (int) (local61 * 256.0F);
				@Pc(206) int local206 = (int) (local63 * 256.0F);
				@Pc(211) int local211 = (int) (local65 * 256.0F);
				@Pc(223) int local223 = (local201 << 16) + (local206 << 8) + local211 - 16777216;
				Static107.anIntArray200[local26++] = local223;
			}
		}
	}
}
