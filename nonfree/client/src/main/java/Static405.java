import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!u", name = "p", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_103 = new Class142("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!u", name = "v", descriptor = "Lclient!mg;")
	public static final Class156 aClass156_4 = new Class156("LIVE", 0);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)V")
	public static void method5209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static430.anInt4137 / (float) Static430.anInt4144;
		@Pc(11) int local11 = arg0;
		@Pc(13) int local13 = arg1;
		if (local9 < (float) 1) {
			local13 = (int) ((float) arg0 * local9);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(40) int local40 = arg2 - (arg0 - local11) / 2;
		@Pc(49) int local49 = arg3 - (arg1 - local13) / 2;
		Static454.anInt7226 = -1;
		Static173.anInt2855 = Static430.anInt4137 - local49 * Static430.anInt4137 / local13;
		Static223.anInt5659 = Static430.anInt4144 * local40 / local11;
		Static112.anInt1711 = -1;
		Static160.method2120();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)V")
	public static void method5211(@OriginalArg(1) int arg0) {
		if (Static31.anInt456 == arg0) {
			return;
		}
		Static147.anInt2300 = Static293.anInt4886 = Static49.anIntArray105[arg0];
		Static203.method2957();
		Static291.anIntArrayArrayArray6 = new int[4][Static147.anInt2300 >> 3][Static293.anInt4886 >> 3];
		Static462.anIntArrayArray59 = new int[Static147.anInt2300][Static293.anInt4886];
		Static180.anIntArrayArray23 = new int[Static147.anInt2300][Static293.anInt4886];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static385.aClass158Array1[local36] = Static306.method4067(Static147.anInt2300, Static293.anInt4886);
		}
		Static380.aByteArrayArrayArray17 = new byte[4][Static147.anInt2300][Static293.anInt4886];
		Static66.method880(Static293.anInt4886, Static147.anInt2300);
		Static453.method5843(Static186.aClass117_3, Static293.anInt4886 >> 3, Static147.anInt2300 >> 3);
		Static31.anInt456 = arg0;
	}
}
