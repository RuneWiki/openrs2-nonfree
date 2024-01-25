import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static447 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIB)Z")
	public static boolean method5933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static272.method3621(arg1, arg0) & Static222.method3018(arg0, arg1);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	public static void method5934() {
		if (Static54.anInt860 < 0) {
			Static202.anInt3606 = -1;
			Static54.anInt860 = 0;
			Static107.anInt2008 = -1;
		}
		if (Static54.anInt860 > Static292.anInt6145) {
			Static107.anInt2008 = -1;
			Static54.anInt860 = Static292.anInt6145;
			Static202.anInt3606 = -1;
		}
		if (Static458.anInt6588 < 0) {
			Static458.anInt6588 = 0;
			Static202.anInt3606 = -1;
			Static107.anInt2008 = -1;
		}
		if (Static458.anInt6588 > Static292.anInt6146) {
			Static458.anInt6588 = Static292.anInt6146;
			Static202.anInt3606 = -1;
			Static107.anInt2008 = -1;
		}
	}
}
