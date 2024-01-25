import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!nw", name = "m", descriptor = "D")
	public static double aDouble25;

	@OriginalMember(owner = "client!nw", name = "n", descriptor = "J")
	public static long aLong192;

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "Lclient!maa;")
	public static final Class223 aClass223_3 = new Class223(false);

	@OriginalMember(owner = "client!nw", name = "j", descriptor = "Lclient!maa;")
	public static Class223 aClass223_4 = aClass223_3;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(BI)V")
	public static void method5753(@OriginalArg(1) int arg0) {
		Static300.anInt4711 = 100;
		Static294.anInt4646 = arg0;
		Static591.anInt9102 = -1;
		Static215.anInt3479 = 3;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V")
	public static void method5754() {
		Static8.aClass163_2.method3643();
		Static384.anInt5662 = 0;
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)V")
	public static void method5759(@OriginalArg(0) int arg0) {
		Static117.anInt2243 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static51.anInt1108; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static245.anInt7888; local6++) {
				if (Static267.aClass73ArrayArrayArray2[arg0][local3][local6] == null) {
					Static267.aClass73ArrayArrayArray2[arg0][local3][local6] = new Class73(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "(B)V")
	public static void method5760() {
		if (Static618.anInt9708 == 0) {
			return;
		}
		if (Static375.aClass192_2 != null) {
			Static375.aClass192_2.method7791();
			Static375.aClass192_2 = null;
		}
		Static44.method820();
		Static256.method3700();
	}
}
