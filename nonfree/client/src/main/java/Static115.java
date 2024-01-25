import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "[S")
	public static short[] aShortArray43 = new short[256];

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
	public static int anInt2217 = 0;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
	public static int anInt2219 = 0;

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "[I")
	public static final int[] anIntArray218 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
	public static int anInt2221 = -1;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)Lclient!dt;")
	public static Class62 method1862(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static375.aClass62ArrayArray2[local7] == null || Static375.aClass62ArrayArray2[local7][local11] == null) {
			@Pc(25) boolean local25 = Static212.method3305(local7);
			if (!local25) {
				return null;
			}
		}
		return Static375.aClass62ArrayArray2[local7][local11];
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)V")
	public static void method1863(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub7_Sub8 local8 = Static275.method4307(16, arg0);
		local8.method3217();
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)V")
	public static void method1864() {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static12.anInt161; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static44.anInt787; local18++) {
				if (Static189.method2997(local18, Static69.aClass48ArrayArrayArray1, local12, true, local14)) {
					local12++;
				}
				if (local12 >= 512) {
					return;
				}
			}
		}
	}
}
