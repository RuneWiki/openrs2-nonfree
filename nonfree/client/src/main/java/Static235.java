import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "[I")
	public static int[] anIntArray574;

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "[Z")
	public static boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "Lclient!km;")
	public static Class99 aClass99_1;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "[I")
	public static int[] anIntArray575 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
	public static int anInt4895 = 0;

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
	public static int anInt4896 = 2;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)Z")
	public static boolean method3738() {
		try {
			return Static264.method1816();
		} catch (@Pc(16) IOException local16) {
			Static276.method4249();
			return true;
		} catch (@Pc(23) Exception local23) {
			@Pc(64) String local64 = "T2 - " + Static221.anInt4611 + "," + Static258.anInt5207 + "," + Static297.anInt5891 + " - " + Static292.anInt5802 + "," + (Static28.aClass6_Sub6_Sub2_1.anIntArray519[0] + Static224.anInt4695) + "," + (Static28.aClass6_Sub6_Sub2_1.anIntArray516[0] + Static158.anInt2961) + " - ";
			for (@Pc(66) int local66 = 0; Static292.anInt5802 > local66 && local66 < 50; local66++) {
				local64 = local64 + Static63.aClass1_Sub18_Sub1_1.aByteArray71[local66] + ",";
			}
			Static6.method149(local23, local64);
			Static51.method877();
			return true;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B[J[I)V")
	public static void method3739(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static46.method827(arg1, arg0.length - 1, 0, arg0);
	}
}
