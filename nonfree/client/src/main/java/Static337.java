import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!lga", name = "i", descriptor = "I")
	public static int anInt6126;

	@OriginalMember(owner = "client!lga", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString75 = "";

	@OriginalMember(owner = "client!lga", name = "k", descriptor = "I")
	public static int anInt6127 = 0;

	@OriginalMember(owner = "client!lga", name = "l", descriptor = "I")
	public static int anInt6128 = 0;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILclient!fca;)V")
	public static void method5136(@OriginalArg(1) Class3_Sub17 arg0) {
		if (arg0.aByteArray59.length - arg0.lb < 1) {
			return;
		}
		@Pc(27) int local27 = arg0.method4888();
		if (local27 < 0 || local27 > 1 || arg0.aByteArray59.length - arg0.lb < 2) {
			return;
		}
		@Pc(51) int local51 = arg0.method4858();
		if (local51 * 6 > arg0.aByteArray59.length - arg0.lb) {
			return;
		}
		for (@Pc(69) int local69 = 0; local69 < local51; local69++) {
			@Pc(75) int local75 = arg0.method4858();
			@Pc(79) int local79 = arg0.method4868();
			if (local75 < Static79.anIntArray121.length && Static440.aBooleanArray22[local75] && (Static81.aClass278_1.method6562(local75).aChar6 != '1' || local79 >= -1 && local79 <= 1)) {
				Static79.anIntArray121[local75] = local79;
			}
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Z)V")
	public static void method5137() {
		Static426.anInt7224 = (int) ((double) Static251.anInt4680 * 34.46D);
		Static591.anInt9343 = 200;
		Static426.anInt7224 <<= 0x2;
		if (Static582.aClass16_12.method8192()) {
			Static426.anInt7224 += 512;
		}
		Static241.method3895(false);
	}
}
