import java.awt.Canvas;
import java.awt.Dimension;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bh", name = "H", descriptor = "Lclient!in;")
	public static Class157 aClass157_33;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BILjava/util/Random;)I")
	public static int method1597(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static468.method7401(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(34) int local34 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(42) int local42;
			do {
				local42 = arg1.nextInt();
			} while (local34 <= local42);
			return Static126.method2964(local42, arg0);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	public static void method1608(@OriginalArg(1) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static317.method5512(local6.height, local6.width);
		if (Static66.anInt10075 == 1) {
			Static214.aClass20_7.method7246(arg0, Static37.anInt816, Static506.anInt9325);
		} else {
			Static214.aClass20_7.method7246(arg0, Static487.anInt9598, Static353.anInt7031);
		}
	}
}
