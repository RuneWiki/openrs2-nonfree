import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!eo;IIIII)V")
	public static void method2187(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt3075 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static351.aLongArrayArrayArray2[arg1][local4][local7];
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
						@Pc(35) Class170 local35 = Static140.aClass170Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt3075; local37++) {
							if (arg0.aClass2_Sub20Array3[local37] == local35.aClass2_Sub20_1) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass2_Sub20Array3[arg0.anInt3075++] = local35.aClass2_Sub20_1;
						if (arg0.anInt3075 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt3075; local7 < 4; local7++) {
			arg0.aClass2_Sub20Array3[local7] = null;
		}
	}
}
