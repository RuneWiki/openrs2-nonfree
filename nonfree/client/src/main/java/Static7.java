import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	public static int anInt133;

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!rc;")
	public static Class74 aClass74_6 = new Class74(20);

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Lclient!lf;")
	public static Class49 aClass49_82 = Static32.method683(" loggt sich ein)3");

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "[I")
	public static int[] anIntArray9 = new int[1000];

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
	public static int anInt137 = 0;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "Lclient!lf;")
	public static Class49 aClass49_83 = Static32.method683("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "Lclient!lf;")
	public static Class49 aClass49_84 = Static32.method683("headicons_hint");

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
	public static int anInt138 = -1;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)V")
	public static void method107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static9.anInt167 == 0 || arg0 == 0 || Static84.anInt1796 >= 50 || arg1 == -1) {
			return;
		}
		Static66.anIntArray168[Static84.anInt1796] = arg1;
		Static146.anIntArray284[Static84.anInt1796] = arg0;
		Static133.anIntArray327[Static84.anInt1796] = arg2;
		Static117.aClass53Array1[Static84.anInt1796] = null;
		Static30.anIntArray62[Static84.anInt1796] = 0;
		Static84.anInt1796++;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!vg;)Lclient!lf;")
	public static Class49 method108(@OriginalArg(1) Class85 arg0) {
		if (Static28.method506(Static111.method1895(arg0)) == 0) {
			return null;
		} else if (arg0.aClass49_1710 == null || arg0.aClass49_1710.method1641().method1653() == 0) {
			return Static140.aBoolean127 ? Static49.aClass49_565 : null;
		} else {
			return arg0.aClass49_1710;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static182.anIntArrayArrayArray8[arg0][local16][local20] == -Static90.anInt1923) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static27.anIntArrayArrayArray2[arg0][arg1][arg3] + arg5;
			if (!Static1.method1(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static1.method1(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static1.method1(local20, local156, local182)) {
				return false;
			} else if (Static1.method1(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static177.method2902(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static1.method1(local16 + 1, Static27.anIntArrayArrayArray2[arg0][arg1][arg3] + arg5, local20 + 1) && Static1.method1(local16 + 128 - 1, Static27.anIntArrayArrayArray2[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static1.method1(local16 + 128 - 1, Static27.anIntArrayArrayArray2[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static1.method1(local16 + 1, Static27.anIntArrayArrayArray2[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	public static void method110() {
		aClass49_82 = null;
		aClass74_6 = null;
		aClass49_84 = null;
		aClass49_83 = null;
		anIntArray9 = null;
	}
}
