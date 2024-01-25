import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "F")
	public static float aFloat60;

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_38 = new Class156(83, -1);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZIII)I")
	public static int method1896(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static455.anInt7370 < 100) {
			return -2;
		}
		@Pc(21) int local21 = -2;
		@Pc(23) int local23 = Integer.MAX_VALUE;
		@Pc(28) int local28 = arg1 - Static491.anInt622;
		@Pc(32) int local32 = arg0 - Static491.anInt617;
		for (@Pc(37) Class5_Sub49 local37 = (Class5_Sub49) Static491.aClass20_4.method378(); local37 != null; local37 = (Class5_Sub49) Static491.aClass20_4.method366()) {
			if (arg2 == local37.anInt8675) {
				@Pc(52) int local52 = local37.anInt8671;
				@Pc(55) int local55 = local37.anInt8670;
				@Pc(65) int local65 = local52 + Static491.anInt622 << 14 | Static491.anInt617 + local55;
				@Pc(85) int local85 = (local32 - local55) * (-local55 + local32) + (local28 - local52) * (-local52 + local28);
				if (local21 < 0 || local23 > local85) {
					local21 = local65;
					local23 = local85;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
	public static void method1898() {
		if (Static124.anInt2052 < 0) {
			Static124.anInt2052 = 0;
			Static403.anInt6785 = -1;
			Static272.anInt4913 = -1;
		}
		if (Static491.anInt624 < Static124.anInt2052) {
			Static272.anInt4913 = -1;
			Static124.anInt2052 = Static491.anInt624;
			Static403.anInt6785 = -1;
		}
		if (Static381.anInt6410 < 0) {
			Static272.anInt4913 = -1;
			Static381.anInt6410 = 0;
			Static403.anInt6785 = -1;
		}
		if (Static381.anInt6410 > Static491.anInt619) {
			Static272.anInt4913 = -1;
			Static381.anInt6410 = Static491.anInt619;
			Static403.anInt6785 = -1;
		}
	}
}
