import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
	public static int anInt6541;

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "Lclient!he;")
	public static final Class128 aClass128_23 = new Class128(64);

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
	public static int anInt6540 = 1;

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
	public static int anInt6542 = 0;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
	public static void method5616() {
		if (Static578.method5706(Static554.anInt1821) || Static578.method5704(Static554.anInt1821)) {
			Static44.method826(Static524.anInt9123 >> 12, Static580.anInt9662 >> 12, 5000);
		} else {
			@Pc(20) int local20 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray335[0] >> 3;
			@Pc(27) int local27 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray336[0] >> 3;
			if (local20 >= 0 && Static442.anInt7975 >> 3 > local20 && local27 >= 0 && local27 < Static284.anInt7916 >> 3) {
				Static44.method826(local27, local20, 5000);
			} else {
				Static44.method826(Static284.anInt7916 >> 4, Static442.anInt7975 >> 4, 0);
			}
		}
		Static282.method4955();
		Static309.method5212();
		Static410.method6505();
		Static54.method903();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLclient!bs;II)V")
	public static void method5618(@OriginalArg(1) Class20_Sub2_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static655.method5835(local6, 0, local6.length, arg1);
		Static315.method5285(arg0, arg2, local6);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIBII)V")
	public static void method5621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static469.anInt8256 != 1) {
			return;
		}
		@Pc(13) int local13 = arg3 / Static345.anInt6515;
		@Pc(17) int local17 = arg1 / Static345.anInt6515;
		@Pc(21) int local21 = arg2 / Static11.anInt221;
		@Pc(25) int local25 = arg0 / Static11.anInt221;
		if (Static406.anInt7520 <= local13 || local17 < 0 || local21 >= Static316.anInt6064 || local25 < 0) {
			return;
		}
		if (Static316.anInt6064 <= local25) {
			local25 = Static316.anInt6064 - 1;
		}
		if (local21 < 0) {
			local21 = 0;
		}
		if (Static406.anInt7520 <= local17) {
			local17 = Static406.anInt7520 - 1;
		}
		if (local13 < 0) {
			local13 = 0;
		}
		for (@Pc(86) int local86 = local21; local86 <= local25; local86++) {
			@Pc(98) int local98 = Static507.method7514(Static316.anInt6064, local86 + Static14.anInt268) * Static406.anInt7520;
			for (@Pc(100) int local100 = local13; local100 <= local17; local100++) {
				@Pc(111) int local111 = local98 + Static507.method7514(Static406.anInt7520, Static426.anInt7764 + local100);
				Static446.anIntArray511[local111] = Static302.anInt5876;
			}
		}
	}
}
