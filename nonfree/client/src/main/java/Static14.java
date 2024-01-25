import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "Lclient!fc;")
	public static Class71 aClass71_1;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)B")
	public static byte method432(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
	public static void method433() {
		if (Static226.anInt4223 == -1) {
			return;
		}
		@Pc(16) int local16 = Static138.aClass78_1.method1804();
		@Pc(20) int local20 = Static138.aClass78_1.method1808();
		if (Static345.aClass2_Sub10_1 != null) {
			local16 = Static345.aClass2_Sub10_1.method1124();
			local20 = Static345.aClass2_Sub10_1.method1116();
		}
		Static54.method1046(0, local20, 0, 0, Static263.anInt4662, local16, 0, Static335.anInt5875, Static226.anInt4223);
		if (Static360.aClass155_37 != null) {
			Static98.method1775(local16, local20);
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)I")
	public static int method435() {
		return ((Static107.anInt2129 == 0 ? 0 : 1) << 20) + (Static301.anInt5429 << 17) + ((Static194.aBoolean254 ? 1 : 0) << 15) + ((Static37.aBoolean52 ? 1 : 0) << 13) + ((Static193.anInt6663 & 0x3) << 11) + ((Static264.aBoolean341 ? 1 : 0) << 6) + ((Static364.aBoolean378 ? 1 : 0) << 5) + ((Static335.aBoolean450 ? 1 : 0) << 3) + (Static146.anInt2670 & 0x7) - (-((Static136.aBoolean194 ? 1 : 0) << 4) + -((Static364.aBoolean379 ? 1 : 0) << 8)) + ((Static158.aBoolean211 ? 1 : 0) << 9) + ((Static80.aBoolean128 ? 1 : 0) << 10) + ((Static116.aBoolean177 ? 1 : 0) << 16) + ((Static265.aBoolean343 ? 1 : 0) << 19) + ((Static193.anInt6666 == 0 ? 0 : 1) << 21) + ((Static16.anInt400 == 0 ? 0 : 1) << 22) + (Static142.method3057() << 23) - (-(Static235.anInt4315 << 25) - (((Static265.aBoolean344 ? 1 : 0) << 27) + (Static193.anInt6668 << 28)));
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII)I")
	public static int method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(25) int local25 = (arg2 * (arg0 & 0xFF00) & 0xFF0000 | arg2 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(30) int local30 = 255 - arg2;
		return local25 + ((local30 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local30 * (arg1 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z[BI)I")
	public static int method437(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static63.method1158(arg1, 0, arg0);
	}
}
