import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
	public static int anInt2634 = 0;

	@OriginalMember(owner = "client!ek", name = "u", descriptor = "Z")
	public static final boolean aBoolean210 = false;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)V")
	public static void method2419(@OriginalArg(1) int arg0) {
		if (arg0 == Static545.anInt8886) {
			return;
		}
		Static251.anInt4680 = Static406.anInt6924 = Static153.anIntArray191[arg0];
		Static337.method5137();
		Static657.anIntArrayArray109 = new int[Static251.anInt4680][Static406.anInt6924];
		Static104.anIntArrayArrayArray3 = new int[4][Static251.anInt4680 >> 3][Static406.anInt6924 >> 3];
		Static470.anIntArrayArray79 = new int[Static251.anInt4680][Static406.anInt6924];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static27.aClass198Array1[local40] = Static48.method1277(Static251.anInt4680, Static406.anInt6924);
		}
		Static588.aByteArrayArrayArray18 = new byte[4][Static251.anInt4680][Static406.anInt6924];
		Static573.method7745(Static251.anInt4680, Static406.anInt6924);
		Static257.method4063(Static406.anInt6924 >> 3, Static582.aClass16_12, Static251.anInt4680 >> 3);
		Static545.anInt8886 = arg0;
	}
}
