import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "Ljava/lang/Object;")
	public static Object anObject33;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
	public static int anInt6886 = 0;

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "Z")
	public static boolean aBoolean628 = false;

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "[I")
	public static final int[] anIntArray527 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
	public static int anInt6887 = 0;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(CI)Z")
	public static boolean method5334(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)Z")
	public static boolean method5336() {
		return Static27.anInt461 == 0 ? Static56.aClass4_Sub15_Sub1_1.method1434() : true;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIBI)V")
	public static void method5340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static376.anInt6287 <= arg0 && arg0 <= Static168.anInt3256) {
			@Pc(15) int local15 = Static332.method4519(Static208.anInt2656, arg1, Static354.anInt6186);
			@Pc(21) int local21 = Static332.method4519(Static208.anInt2656, arg3, Static354.anInt6186);
			Static340.method4613(local21, arg0, arg2, local15);
		}
	}
}
