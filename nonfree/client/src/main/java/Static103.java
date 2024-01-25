import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!di", name = "M", descriptor = "Lclient!cb;")
	public static Class50 aClass50_30;

	@OriginalMember(owner = "client!di", name = "s", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_30 = new Class187(42, 2);

	@OriginalMember(owner = "client!di", name = "i", descriptor = "(I)V")
	public static void method1740() {
		Static28.anInt387 = 0;
		Static41.aClass180Array1 = new Class180[500];
		Static198.anIntArrayArrayArray3 = new int[Static202.anInt3256][Static665.anInt7330 + 1][Static92.anInt1526 + 1];
		Static370.aClass180Array6 = new Class180[500];
		Static252.anInt4008 = 0;
		Static277.anInt4345 = Static108.anInt1949;
		Static652.aBoolean748 = false;
		Static509.anInt5962 = 0;
		Static194.aClass180Array8 = new Class180[2000];
		Static367.anInt6413 = Static108.anInt1949;
		Static32.anInt447 = 0;
		Static105.aClass180Array4 = new Class180[1000];
		if (Static267.aClass143_6 instanceof oa) {
			Static649.aBoolean743 = false;
		} else {
			Static649.aBoolean743 = true;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)Z")
	public static boolean method1741(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static649.aBoolean743 || !Static662.aBoolean761) {
			return false;
		} else if (Static309.anInt5508 < 100) {
			return false;
		} else {
			@Pc(24) int local24 = Static198.anIntArrayArrayArray3[arg0][arg2][arg1];
			if (local24 == -Static513.anInt8675) {
				return false;
			} else if (local24 == Static513.anInt8675) {
				return true;
			} else if (Static176.aClass88Array1 == Static298.aClass88Array3) {
				return false;
			} else {
				@Pc(52) int local52 = arg2 << Static138.anInt2287;
				@Pc(56) int local56 = arg1 << Static138.anInt2287;
				if (Static13.method189(Static298.aClass88Array3[arg0].method8749(arg2, arg1), local52 + 1, Static298.aClass88Array3[arg0].method8749(arg2 + 1, arg1 + 1), Static108.anInt1949 + local56 - 1, local56 + -1 - -Static108.anInt1949, Static298.aClass88Array3[arg0].method8749(arg2, arg1 + 1), Static108.anInt1949 + local52 - 1, local52 + 1, local56 + 1) && Static13.method189(Static298.aClass88Array3[arg0].method8749(arg2, arg1), local52 + 1, Static298.aClass88Array3[arg0].method8749(arg2 + 1, arg1), local56 + 1, Static108.anInt1949 + -1 + local56, Static298.aClass88Array3[arg0].method8749(arg2 + 1, arg1 + 1), local52 + Static108.anInt1949 - 1, Static108.anInt1949 + -1 + local52, local56 + 1)) {
					Static224.anInt3589++;
					Static198.anIntArrayArrayArray3[arg0][arg2][arg1] = Static513.anInt8675;
					return true;
				} else {
					Static198.anIntArrayArrayArray3[arg0][arg2][arg1] = -Static513.anInt8675;
					return false;
				}
			}
		}
	}
}
