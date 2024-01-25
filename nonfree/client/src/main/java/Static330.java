import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "[I")
	public static int[] anIntArray389;

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString71 = null;

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[100];

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
	public static int anInt6599 = 0;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIBI)I")
	public static int method5524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static102.anInt9953 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(21) int local21 = arg0 - Static361.anInt2229;
		@Pc(31) int local31 = arg1 - Static361.anInt2230;
		for (@Pc(36) Class3_Sub22 local36 = (Class3_Sub22) Static361.aClass276_14.method6907(); local36 != null; local36 = (Class3_Sub22) Static361.aClass276_14.method6912()) {
			if (local36.anInt4123 == arg2) {
				@Pc(49) int local49 = local36.anInt4124;
				@Pc(52) int local52 = local36.anInt4117;
				@Pc(62) int local62 = Static361.anInt2230 + local52 | Static361.anInt2229 + local49 << 14;
				@Pc(81) int local81 = (local21 - local49) * (local21 - local49) + (local31 - local52) * (-local52 + local31);
				if (local14 < 0 || local16 > local81) {
					local16 = local81;
					local14 = local62;
				}
			}
		}
		return local14;
	}
}
