import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "Z")
	public static boolean aBoolean3 = false;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
	public static int anInt82 = -1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(JIII)Z")
	public static boolean method60(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = (int) arg0 >> 20 & 0x3;
		@Pc(13) int local13 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		@Pc(20) int local20 = (int) arg0 >> 14 & 0x1F;
		if (local20 == 10 || local20 == 11 || local20 == 22) {
			@Pc(64) Class1_Sub2_Sub13 local64 = Static5.method65(local13);
			@Pc(74) int local74;
			@Pc(77) int local77;
			if (local6 == 0 || local6 == 2) {
				local74 = local64.anInt1988;
				local77 = local64.anInt2001;
			} else {
				local74 = local64.anInt2001;
				local77 = local64.anInt1988;
			}
			@Pc(87) int local87 = local64.anInt1981;
			if (local6 != 0) {
				local87 = (local87 << local6 & 0xF) + (local87 >> 4 - local6);
			}
			Static198.method3220(0, local74, arg1, true, local77, local87, 2, arg2, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], 0, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
		} else {
			Static198.method3220(local20 + 1, 0, arg1, true, 0, 0, 2, arg2, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0], local6, Static201.aClass6_Sub4_Sub1_3.anIntArray451[0]);
		}
		Static93.anInt2338 = Static2.anInt67;
		Static26.anInt775 = 2;
		Static184.anInt4067 = 0;
		Static30.anInt880 = Static182.anInt4065;
		return true;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method61(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static111.method2034(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(38) int local38 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(41) int local41;
			do {
				local41 = arg0.nextInt();
			} while (local38 <= local41);
			return Static133.method2534(local41, arg1);
		}
	}
}
