import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!u", name = "K", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_143 = new Class98(97, 1);

	@OriginalMember(owner = "client!u", name = "L", descriptor = "[I")
	public static final int[] anIntArray627 = new int[50];

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(III)Z")
	public static boolean method7029(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static30.method469(arg0, arg1) || Static317.method4952(arg0, arg1);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)V")
	public static void method7030(@OriginalArg(1) int arg0) {
		if (arg0 == Static417.anInt7437) {
			return;
		}
		Static18.anInt5706 = Static80.anInt1367 = Static14.anIntArray508[arg0];
		Static117.method1837();
		Static129.anIntArrayArray17 = new int[Static18.anInt5706][Static80.anInt1367];
		Static245.anIntArrayArrayArray1 = new int[4][Static18.anInt5706 >> 3][Static80.anInt1367 >> 3];
		Static291.anIntArrayArray45 = new int[Static18.anInt5706][Static80.anInt1367];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static30.aClass138Array1[local36] = Static250.method3897(Static18.anInt5706, Static80.anInt1367);
		}
		Static289.aByteArrayArrayArray7 = new byte[4][Static18.anInt5706][Static80.anInt1367];
		Static426.method6067(Static18.anInt5706, Static80.anInt1367);
		Static376.method5504(Static80.anInt1367 >> 3, Static18.anInt5706 >> 3, Static554.aClass90_12);
		Static417.anInt7437 = arg0;
	}
}
