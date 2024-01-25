import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "Z")
	public static boolean aBoolean259 = false;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!np;)V")
	public static void method2985(@OriginalArg(1) Class3_Sub11 arg0) {
		if (arg0.aByteArray62.length - arg0.anInt6128 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method5175();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray62.length - arg0.anInt6128 < 2) {
			return;
		}
		@Pc(52) int local52 = arg0.method5198();
		if (arg0.aByteArray62.length - arg0.anInt6128 < local52 * 6) {
			return;
		}
		for (@Pc(66) int local66 = 0; local66 < local52; local66++) {
			@Pc(72) int local72 = arg0.method5198();
			@Pc(76) int local76 = arg0.method5186();
			if (Static468.anIntArray497.length > local72 && Static351.aBooleanArray21[local72] && (Static341.aClass32_1.method655(local72).aChar1 != '1' || local76 >= -1 && local76 <= 1)) {
				Static468.anIntArray497[local72] = local76;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIB)Z")
	public static boolean method2986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
