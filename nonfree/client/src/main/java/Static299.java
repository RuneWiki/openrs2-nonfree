import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
	public static int anInt5947;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
	public static int anInt5948;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "Lclient!ir;")
	public static Class100 aClass100_117;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "[[S")
	public static final short[][] aShortArrayArray7 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString220 = "Loaded client variable data";

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!nb;IIIII)V")
	public static void method5072(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt63 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) int local16 = Static145.anIntArrayArrayArray4[arg1][local4][local7];
				@Pc(18) int local18 = 0;
				while (true) {
					label49: while (true) {
						if (local18 > 24) {
							continue label54;
						}
						@Pc(25) int local25 = local16 >>> local18 & 0xFF;
						if (local25 <= 0) {
							continue label54;
						}
						@Pc(33) Class3_Sub13_Sub1 local33 = Static13.aClass3_Sub13_Sub1Array3[local25 - 1];
						for (@Pc(35) int local35 = 0; local35 < arg0.anInt63; local35++) {
							if (arg0.aClass3_Sub13_Sub1Array2[local35] == local33) {
								local18 += 8;
								continue label49;
							}
						}
						arg0.aClass3_Sub13_Sub1Array2[arg0.anInt63++] = local33;
						if (arg0.anInt63 == 4) {
							break label56;
						}
						local18 += 8;
					}
				}
			}
		}
		for (local7 = arg0.anInt63; local7 < 4; local7++) {
			arg0.aClass3_Sub13_Sub1Array2[local7] = null;
		}
	}
}
