import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!jn", name = "z", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_75 = new Class47(39, 8);

	@OriginalMember(owner = "client!jn", name = "A", descriptor = "[I")
	public static final int[] anIntArray286 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!jn", name = "D", descriptor = "[I")
	public static final int[] anIntArray287 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!jn", name = "F", descriptor = "J")
	public static final long aLong129 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!pv;IIIII)V")
	public static void method4099(@OriginalArg(0) Class260 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt9438 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static362.aLongArrayArrayArray1[arg1][local4][local7];
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
						@Pc(35) Class78 local35 = Static478.aClass78Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt9438; local37++) {
							if (arg0.aClass6_Sub7Array6[local37] == local35.aClass6_Sub7_1) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass6_Sub7Array6[arg0.anInt9438++] = local35.aClass6_Sub7_1;
						if (arg0.anInt9438 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt9438; local7 < 4; local7++) {
			arg0.aClass6_Sub7Array6[local7] = null;
		}
	}
}
