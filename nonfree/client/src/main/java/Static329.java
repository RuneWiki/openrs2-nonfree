import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
	public static int anInt6645;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
	public static int anInt6648;

	@OriginalMember(owner = "client!lm", name = "C", descriptor = "F")
	public static float aFloat156;

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "D")
	public static double aDouble15;

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
	public static int anInt6646 = 0;

	@OriginalMember(owner = "client!lm", name = "F", descriptor = "[I")
	public static final int[] anIntArray398 = new int[2];

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I[Lclient!at;I)V")
	public static void method5655(@OriginalArg(0) int arg0, @OriginalArg(1) Class24[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class24 local13 = arg1[local7];
			if (local13 != null && arg0 == local13.anInt511 && !Static76.method2241(local13)) {
				if (local13.anInt480 == 0) {
					method5655(local13.anInt510, arg1);
					if (local13.aClass24Array1 != null) {
						method5655(local13.anInt510, local13.aClass24Array1);
					}
					@Pc(47) Class2_Sub48 local47 = (Class2_Sub48) Static372.aClass99_51.method3056((long) local13.anInt510);
					if (local47 != null) {
						Static6.method166(local47.anInt10125);
					}
				}
				if (local13.anInt480 == 6 && local13.anInt435 != -1) {
					@Pc(69) Class130 local69 = Static195.aClass193_1.method5573(local13.anInt435);
					if (local69 != null) {
						local13.anInt514 += Static99.anInt2781;
						@Pc(80) int local80 = local13.anInt491;
						while (local13.anInt514 > local69.anIntArray242[local13.anInt491]) {
							local13.anInt514 -= local69.anIntArray242[local13.anInt491];
							local13.anInt491++;
							if (local13.anInt491 >= local69.anIntArray237.length) {
								local13.anInt491 -= local69.anInt4698;
								if (local13.anInt491 < 0 || local69.anIntArray237.length <= local13.anInt491) {
									local13.anInt491 = 0;
								}
							}
							local13.anInt456 = local13.anInt491 + 1;
							if (local69.anIntArray237.length <= local13.anInt456) {
								local13.anInt456 -= local69.anInt4698;
								if (local13.anInt456 < 0 || local13.anInt456 >= local69.anIntArray237.length) {
									local13.anInt456 = -1;
								}
							}
							Static553.method8248(local13);
						}
						if (local80 != local13.anInt491) {
							Static573.method8546(local13.anInt491, local69);
						}
					}
				}
			}
		}
	}
}
