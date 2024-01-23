import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!fj", name = "Fb", descriptor = "I")
	public static int anInt1292;

	@OriginalMember(owner = "client!fj", name = "Ob", descriptor = "Lclient!n;")
	public static Class65 aClass65_1;

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)Z")
	public static boolean method1051(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)I")
	public static int method1052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local9 ^ local9 << 13;
		@Pc(34) int local34 = (local20 * local20 * 15731 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)V")
	public static void method1055() {
		Static198.aClass2_Sub12ArrayArrayArray2 = new Class2_Sub12[4][104][104];
		Static11.anIntArrayArrayArray1 = new int[4][105][105];
		Static85.method1494();
		Static173.anInt3981 = 104;
		Static159.anInt4174 = 104;
		Static89.anIntArrayArrayArray3 = new int[4][105][105];
		Static199.method3558();
		Static125.anInt1642 = 25;
		Static17.aBooleanArrayArray2 = new boolean[Static125.anInt1642 + Static125.anInt1642 + 1][Static125.anInt1642 + Static125.anInt1642 + 1];
		Static14.aBooleanArrayArray4 = new boolean[Static125.anInt1642 + Static125.anInt1642 + 2][Static125.anInt1642 + Static125.anInt1642 + 2];
	}

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)V")
	public static void method1058() {
		if (Static202.aClass105_4 != null) {
			Static202.aClass105_4.method3695();
			Static202.aClass105_4 = null;
		}
		Static168.aClass33_18 = Static133.aClass41_2.method1264(Static113.aString6, Static227.anInt4919);
		Static97.anInt2140 = 1;
	}
}
