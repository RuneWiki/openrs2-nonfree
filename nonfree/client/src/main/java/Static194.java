import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[200];

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
	public static int anInt3448 = 0;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!ak;IIIII)V")
	public static void method2809(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt3592 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static295.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class1_Sub27_Sub1 local35 = Static300.aClass1_Sub27_Sub1Array3[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt3592; local37++) {
							if (arg0.aClass1_Sub27_Sub1Array2[local37] == local35) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass1_Sub27_Sub1Array2[arg0.anInt3592++] = local35;
						if (arg0.anInt3592 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt3592; local7 < 4; local7++) {
			arg0.aClass1_Sub27_Sub1Array2[local7] = null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIB)V")
	public static void method2811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 > arg0) {
			Static382.method5419(Static369.anIntArrayArray35[arg1], arg0, arg3, arg2);
		} else {
			Static382.method5419(Static369.anIntArrayArray35[arg1], arg3, arg0, arg2);
		}
	}
}
