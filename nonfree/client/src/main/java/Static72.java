import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dj", name = "B", descriptor = "Lclient!qs;")
	public static Class71_Sub1 aClass71_Sub1_1;

	@OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
	public static int anInt1361;

	@OriginalMember(owner = "client!dj", name = "ab", descriptor = "I")
	public static int anInt1374;

	@OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
	public static int anInt1368 = 0;

	@OriginalMember(owner = "client!dj", name = "S", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[200];

	@OriginalMember(owner = "client!dj", name = "Y", descriptor = "I")
	public static int anInt1373 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!qs;B[[B)V")
	public static void method1097(@OriginalArg(0) Class71_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt6060; local14++) {
			Static442.method5918();
			for (@Pc(20) int local20 = 0; local20 < Static80.anInt6558 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static104.anInt2048 >> 3; local24++) {
					@Pc(28) boolean local28 = false;
					@Pc(36) int local36 = Static16.anIntArrayArrayArray9[local14][local20][local24];
					if (local36 != -1) {
						@Pc(45) int local45 = local36 >> 24 & 0x3;
						if (!arg0.aBoolean488 || local45 == 0) {
							@Pc(56) int local56 = local36 >> 1 & 0x3;
							@Pc(62) int local62 = local36 >> 14 & 0x3FF;
							@Pc(68) int local68 = local36 >> 3 & 0x7FF;
							@Pc(79) int local79 = (local62 / 8 << 8) + (local68 / 8);
							for (@Pc(81) int local81 = 0; local81 < Static68.anIntArray59.length; local81++) {
								if (Static68.anIntArray59[local81] == local79 && arg1[local81] != null) {
									@Pc(99) Class1_Sub14 local99 = new Class1_Sub14(arg1[local81]);
									arg0.method4791(local24 * 8, local68, local99, local14, local20 * 8, Static20.aClass181Array2, local62, local45, local56);
									arg0.method4808(local45, local14, local68, local56, local62, local24 * 8, local99, local12[0] == -1 ? local12 : null, Static447.aClass121_11, local20 * 8);
									local28 = true;
									break;
								}
							}
						}
					}
					if (!local28) {
						arg0.method4803(local14, 8, local24 * 8, local20 * 8, 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static448.aClass223_1 = Static377.aClass243_1.method5516(Static347.aClass163_1, local12[3], local12[0], local12[2], local12[1]);
			Static75.anInt1424 = local12[4];
		}
	}
}
