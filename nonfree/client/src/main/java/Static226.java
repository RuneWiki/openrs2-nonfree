import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	public static int anInt5617;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "Lclient!he;")
	public static Class100 aClass100_61;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "I")
	public static int anInt5628;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "I")
	public static int anInt5623 = 0;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "[S")
	public static short[] aShortArray87 = new short[256];

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
	public static void method4723() {
		@Pc(10) Class6_Sub33 local10 = (Class6_Sub33) Static124.aClass244_13.method5976();
		@Pc(21) boolean local21 = Static240.aClass239_8 != null || Static378.anInt6770 > 0;
		if (local21) {
			Static154.anInt3149 = 1;
		}
		if (Static395.aBoolean453 && Static54.aClass187_1.method4602(81) && Static151.anInt3129 > 2) {
			if (local21) {
				Static113.aClass6_Sub40_1 = (Class6_Sub40) Static292.aClass244_25.aClass6_220.aClass6_251.aClass6_251;
			} else {
				Static202.method3123(local10.method5287(), (Class6_Sub40) Static292.aClass244_25.aClass6_220.aClass6_251.aClass6_251, local10.method5290());
			}
		} else if (local21) {
			Static113.aClass6_Sub40_1 = (Class6_Sub40) Static292.aClass244_25.aClass6_220.aClass6_251;
		} else {
			Static202.method3123(local10.method5287(), (Class6_Sub40) Static292.aClass244_25.aClass6_220.aClass6_251, local10.method5290());
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIIII)V")
	public static void method4724(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			Static298.method4405(Static62.anIntArrayArray7[arg0], arg1, arg2, arg3);
		} else {
			Static298.method4405(Static62.anIntArrayArray7[arg0], arg1, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V")
	public static void method4727() {
		Static22.aClass239Array1 = null;
		Static16.method472(Static348.anInt6272, 0, 0, -1, 0, 0, Static199.anInt3767, Static36.anInt1129);
		if (Static22.aClass239Array1 != null) {
			Static415.method6099(Static199.anInt3767, -1412584499, Static348.anInt6272, Static22.aClass239Array1, Static59.anInt1659, 0, Static97.aClass239_3.anInt6972, Static259.anInt4725, 0);
			Static22.aClass239Array1 = null;
		}
	}
}
