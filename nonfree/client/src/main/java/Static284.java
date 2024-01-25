import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!it", name = "p", descriptor = "I")
	public static int anInt4408;

	@OriginalMember(owner = "client!it", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!it", name = "h", descriptor = "Lclient!dka;")
	public static final Class85 aClass85_32 = new Class85(64);

	@OriginalMember(owner = "client!it", name = "j", descriptor = "[I")
	public static final int[] anIntArray321 = new int[2];

	@OriginalMember(owner = "client!it", name = "c", descriptor = "Z")
	public static boolean aBoolean385 = false;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BZ)I")
	public static int method3976(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static240.anInt10701;
		if (local5 == 0) {
			return arg0 ? 0 : Static15.anInt227;
		} else if (local5 == 1) {
			return Static15.anInt227;
		} else if (local5 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)V")
	public static void method3979() {
		if (Static459.method6651(-870, Static357.anInt5722)) {
			Static264.method3744(false);
		} else {
			Static162.aClass5_1 = Static487.aClass221_2.aClass5_2;
			Static487.aClass221_2.aClass5_2 = null;
			Static261.method9374(-96, 14);
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)Z")
	public static boolean method3981(@OriginalArg(1) int arg0) {
		if (arg0 == 11 || arg0 == 10 || arg0 == 44 || arg0 == 21 || arg0 == 8 || arg0 == 1007) {
			return true;
		} else {
			return arg0 == 46;
		}
	}
}
