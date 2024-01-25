import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "[I")
	public static int[] anIntArray418;

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "Lclient!tj;")
	public static Class193 aClass193_87;

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
	public static int anInt5050 = 0;

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "I")
	public static int anInt5052 = 0;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)I")
	public static int method4389() {
		if (Static103.aClass21_5 == null) {
			if (!Static272.aBoolean393 && Static105.anInt2645 > 0) {
				if (Static73.aBoolean139 && Static264.aClass92_3.method2620(81) && Static105.anInt2645 > 2) {
					return ((Class4_Sub39) Static58.aClass116_7.aClass4_121.aClass4_251.aClass4_251).anInt5717;
				}
				return ((Class4_Sub39) Static58.aClass116_7.aClass4_121.aClass4_251).anInt5717;
			}
			@Pc(48) int local48 = Static258.aClass127_1.method3588();
			@Pc(52) int local52 = Static258.aClass127_1.method3595();
			@Pc(54) int local54 = Static70.anInt1838;
			@Pc(56) int local56 = Static127.anInt3018;
			@Pc(58) int local58 = Static302.anInt5773;
			if (local54 < local48 && local54 + local58 > local48) {
				@Pc(77) int local77 = -1;
				@Pc(96) int local96;
				for (@Pc(79) int local79 = 0; local79 < Static105.anInt2645; local79++) {
					if (Static140.aBoolean255) {
						local96 = (Static105.anInt2645 - local79 - 1) * 16 + local56 + 33;
						if (local96 - 13 < local52 && local52 <= local96 + 3) {
							local77 = local79;
						}
					} else {
						local96 = local56 + (Static105.anInt2645 - local79 - 1) * 16 + 31;
						if (local96 - 13 < local52 && local96 + 3 >= local52) {
							local77 = local79;
						}
					}
				}
				if (local77 != -1) {
					local96 = 0;
					@Pc(154) Class37 local154 = new Class37(Static58.aClass116_7);
					for (@Pc(159) Class4_Sub39 local159 = (Class4_Sub39) local154.method1016(); local159 != null; local159 = (Class4_Sub39) local154.method1018()) {
						if (local96++ == local77) {
							return local159.anInt5717;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIBFZII)[[I")
	public static int[][] method4391(@OriginalArg(5) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class4_Sub6_Sub9 local13 = new Class4_Sub6_Sub9();
		local13.anInt1628 = (int) (arg0 * 4096.0F);
		local13.anInt1627 = 3;
		local13.anInt1638 = 4;
		local13.aBoolean115 = false;
		local13.anInt1633 = 8;
		local13.method5700();
		Static265.method4581(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method1309(local45, local9[local45]);
		}
		return local9;
	}
}
