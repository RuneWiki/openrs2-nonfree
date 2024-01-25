import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ii;IIIII)V")
	public static void method3490(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt6702 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static261.aLongArrayArrayArray1[arg1][local4][local7];
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
						@Pc(35) Class137 local35 = Static45.aClass137Array4[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt6702; local37++) {
							if (arg0.aClass1_Sub7Array2[local37] == local35.aClass1_Sub7_2) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass1_Sub7Array2[arg0.anInt6702++] = local35.aClass1_Sub7_2;
						if (arg0.anInt6702 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt6702; local7 < 4; local7++) {
			arg0.aClass1_Sub7Array2[local7] = null;
		}
	}
}
