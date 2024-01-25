import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!so", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!so", name = "q", descriptor = "Lclient!an;")
	public static Class1_Sub5 aClass1_Sub5_2;

	@OriginalMember(owner = "client!so", name = "u", descriptor = "I")
	public static int anInt5811 = 0;

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V")
	public static void method4967() {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = -1; local7 < Static357.anInt4331; local7++) {
			if (local7 == -1) {
				local15 = 2047;
			} else {
				local15 = Static298.anIntArray492[local7];
			}
			@Pc(25) Class17_Sub1_Sub1_Sub1 local25 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local15];
			if (local25 != null && local25.anInt4880 > 0) {
				local25.anInt4880--;
				if (local25.anInt4880 == 0) {
					local25.aString50 = null;
				}
			}
		}
		for (local15 = 0; local15 < Static5.anInt200; local15++) {
			@Pc(64) int local64 = Static171.anIntArray333[local15];
			@Pc(68) Class17_Sub1_Sub1_Sub2 local68 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local64];
			if (local68 != null && local68.anInt4880 > 0) {
				local68.anInt4880--;
				if (local68.anInt4880 == 0) {
					local68.aString50 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)I")
	public static int method4969(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method4970(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static59.method1514(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local45 >= local37);
			return Static356.method5685(arg1, local45);
		}
	}
}
