import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!qm", name = "F", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_148 = new Class298(72, -1);

	@OriginalMember(owner = "client!qm", name = "G", descriptor = "I")
	public static int anInt7196 = 0;

	@OriginalMember(owner = "client!qm", name = "H", descriptor = "I")
	public static int anInt7197 = 0;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBLclient!as;)V")
	public static void method6109(@OriginalArg(0) int arg0, @OriginalArg(2) Class17 arg1) {
		if (Static407.anInt6912 >= 50 || (arg1 == null || arg1.anIntArrayArray2 == null || arg1.anIntArrayArray2.length <= arg0 || arg1.anIntArrayArray2[arg0] == null)) {
			return;
		}
		@Pc(32) int local32 = arg1.anIntArrayArray2[arg0][0];
		@Pc(36) int local36 = local32 >> 8;
		if (arg1.anIntArrayArray2[arg0].length > 1) {
			@Pc(55) int local55 = (int) (Math.random() * (double) arg1.anIntArrayArray2[arg0].length);
			if (local55 > 0) {
				local36 = arg1.anIntArrayArray2[arg0][local55];
			}
		}
		@Pc(73) int local73 = local32 >> 5 & 0x7;
		if (arg1.aBoolean48) {
			Static544.method7134(255, 0, false, local73, local36);
		} else {
			Static34.method576(255, 0, local73, local36);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "([[II)V")
	public static void method6110(@OriginalArg(0) int[][] arg0) {
		Static176.anIntArrayArray28 = arg0;
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(B)V")
	public static void method6111() {
		@Pc(13) int local13 = 0;
		if (Static278.aClass3_Sub13_Sub1_1 != null) {
			local13 = Static278.aClass3_Sub13_Sub1_1.method4483(Static260.anInt4932);
		}
		@Pc(32) int local32;
		@Pc(50) int local50;
		if (local13 == 2) {
			local32 = Static56.anInt1315 > 800 ? 800 : Static56.anInt1315;
			Static318.anInt5754 = local32;
			Static26.anInt8939 = (Static56.anInt1315 - local32) / 2;
			local50 = Static224.anInt4385 > 600 ? 600 : Static224.anInt4385;
			Static447.anInt7372 = local50;
			Static212.anInt4225 = 0;
		} else if (local13 == 1) {
			local32 = Static56.anInt1315 > 1024 ? 1024 : Static56.anInt1315;
			Static26.anInt8939 = (Static56.anInt1315 - local32) / 2;
			Static318.anInt5754 = local32;
			local50 = Static224.anInt4385 <= 768 ? Static224.anInt4385 : 768;
			Static447.anInt7372 = local50;
			Static212.anInt4225 = 0;
		} else {
			Static212.anInt4225 = 0;
			Static318.anInt5754 = Static56.anInt1315;
			Static447.anInt7372 = Static224.anInt4385;
			Static26.anInt8939 = 0;
		}
	}
}
