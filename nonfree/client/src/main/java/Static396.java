import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!rg;")
	public static Class310 aClass310_81;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
	public static int anInt6953;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_165 = new Class251(11, 7);

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "J")
	public static long aLong190 = 0L;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method6069() {
		@Pc(7) int local7;
		if (Static630.aClass393Array3 != null) {
			for (local7 = 0; local7 < Static207.anInt3630; local7++) {
				Static630.aClass393Array3[local7] = null;
			}
			Static630.aClass393Array3 = null;
		}
		if (Static600.aClass393Array2 != null) {
			for (local7 = 0; local7 < Static264.anInt4916; local7++) {
				Static600.aClass393Array2[local7] = null;
			}
			Static600.aClass393Array2 = null;
		}
		if (Static572.aClass393Array1 != null) {
			for (local7 = 0; local7 < Static83.anInt1456; local7++) {
				Static572.aClass393Array1[local7] = null;
			}
			Static572.aClass393Array1 = null;
		}
		Static354.anIntArrayArrayArray16 = null;
		Static550.anInt9243 = -1;
		Static55.anInt955 = -1;
		Static682.aClass393Array4 = null;
		Static572.anIntArray493 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!sea;IIII)V")
	public static void method6070(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 < 1 || arg2 < 1 || Static380.anInt6689 - 2 < arg0 || arg2 > Static542.anInt9214 - 2) {
			return;
		}
		if (Static63.aClass89ArrayArrayArray1 == null) {
			return;
		}
		@Pc(39) Interface16 local39 = Static15.aClass49_Sub1_1.method6724(arg2, arg0, arg3, arg4);
		if (local39 == null) {
			return;
		}
		if (local39 instanceof Class4_Sub3_Sub3_Sub2) {
			((Class4_Sub3_Sub3_Sub2) local39).method2369(arg1);
		} else if (local39 instanceof Class4_Sub3_Sub2_Sub1) {
			((Class4_Sub3_Sub2_Sub1) local39).method3243(arg1);
			return;
		} else if (local39 instanceof Class4_Sub3_Sub1_Sub2) {
			((Class4_Sub3_Sub1_Sub2) local39).method8122(arg1);
			return;
		} else if (local39 instanceof Class4_Sub3_Sub5_Sub2) {
			((Class4_Sub3_Sub5_Sub2) local39).method8878(arg1);
			return;
		}
		return;
	}
}
