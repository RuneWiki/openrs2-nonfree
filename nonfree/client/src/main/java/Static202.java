import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!p", name = "i", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Lclient!dd;")
	public static Class31 aClass31_4;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(DI)V")
	public static void method3250(@OriginalArg(0) double arg0) {
		if (arg0 == Static279.aDouble9) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(25) int local25 = (int) (Math.pow((double) local12 / 255.0D, arg0) * 255.0D);
			Static244.anIntArray382[local12] = local25 <= 255 ? local25 : 255;
		}
		Static279.aDouble9 = arg0;
	}
}
