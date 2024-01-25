import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!aca", name = "n", descriptor = "Lclient!mt;")
	public static final Class228 aClass228_1 = new Class228(11, 0, 1, 2);

	@OriginalMember(owner = "client!aca", name = "o", descriptor = "I")
	public static int anInt69 = -50;

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(I)V")
	public static void method130() {
		@Pc(7) int local7 = Static393.anInt6147;
		@Pc(9) int[] local9 = Static430.anIntArray612;
		for (@Pc(15) int local15 = 0; local15 < local7; local15++) {
			@Pc(23) Class28_Sub1_Sub1_Sub1_Sub1 local23 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local9[local15]];
			if (local23 != null && local23.anInt10809 > 0) {
				local23.anInt10809--;
				if (local23.anInt10809 == 0) {
					local23.aString125 = null;
				}
			}
		}
		for (@Pc(49) int local49 = 0; local49 < Static561.anInt9114; local49++) {
			@Pc(56) long local56 = (long) Static131.anIntArray226[local49];
			@Pc(62) Class3_Sub3 local62 = (Class3_Sub3) Static522.aClass83_34.method2368(local56);
			if (local62 != null) {
				@Pc(67) Class28_Sub1_Sub1_Sub1_Sub2 local67 = local62.aClass28_Sub1_Sub1_Sub1_Sub2_1;
				if (local67.anInt10809 > 0) {
					local67.anInt10809--;
					if (local67.anInt10809 == 0) {
						local67.aString125 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)Z")
	public static boolean method131(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIII)I")
	public static int method132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return arg0;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}
}
