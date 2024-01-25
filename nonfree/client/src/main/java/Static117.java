import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
	public static int anInt2483 = 1;

	@OriginalMember(owner = "client!hi", name = "gb", descriptor = "[[S")
	public static final short[][] aShortArrayArray5 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
	public static void method2096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class57 local7 = Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass2_Sub4_1 != null) {
			local7.aClass2_Sub4_1 = null;
		}
		if (local7.aClass2_Sub4_2 != null) {
			local7.aClass2_Sub4_2 = null;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!tq;II)Ljava/lang/String;")
	public static String method2098(@OriginalArg(0) Class4_Sub7 arg0) {
		try {
			@Pc(9) int local9 = arg0.method2413();
			if (local9 > 32767) {
				local9 = 32767;
			}
			@Pc(17) byte[] local17 = new byte[local9];
			arg0.anInt2667 += Static298.aClass126_1.method3430(arg0.aByteArray42, arg0.anInt2667, 0, local9, local17);
			return Static257.method4397(local9, 0, local17);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}
}
