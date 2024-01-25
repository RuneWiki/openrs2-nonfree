import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "Lclient!bt;")
	public static Class34 aClass34_4;

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
	public static void method473() {
		for (@Pc(15) Class4_Sub34 local15 = (Class4_Sub34) Static255.aClass66_18.method1992(); local15 != null; local15 = (Class4_Sub34) Static255.aClass66_18.method1984()) {
			Static343.method4655(local15.anInt5684);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([[F[[SI)[[S")
	public static short[][] method477(@OriginalArg(0) float[][] arg0, @OriginalArg(1) short[][] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			for (@Pc(12) int local12 = 0; local12 < arg1[local8].length; local12++) {
				arg1[local8][local12] = (short) (int) (arg0[local8][local12] * 16383.0F);
			}
		}
		return arg1;
	}
}
