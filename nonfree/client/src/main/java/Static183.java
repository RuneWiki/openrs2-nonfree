import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_119 = new Class56(16, -1);

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
	public static int anInt3357 = 0;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)Z")
	public static boolean method2543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static264.anInt4365; local1++) {
			@Pc(6) Class145 local6 = Static399.aClass145Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3599 == 1) {
				local15 = local6.anInt3587 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3593 + (local6.anInt3583 * local15 >> 8);
					local37 = local6.anInt3590 + (local6.anInt3589 * local15 >> 8);
					local47 = local6.anInt3588 + (local6.anInt3594 * local15 >> 8);
					local57 = local6.anInt3584 + (local6.anInt3592 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3599 == 2) {
				local15 = arg0 - local6.anInt3587;
				if (local15 > 0) {
					local27 = local6.anInt3593 + (local6.anInt3583 * local15 >> 8);
					local37 = local6.anInt3590 + (local6.anInt3589 * local15 >> 8);
					local47 = local6.anInt3588 + (local6.anInt3594 * local15 >> 8);
					local57 = local6.anInt3584 + (local6.anInt3592 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3599 == 3) {
				local15 = local6.anInt3593 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3587 + (local6.anInt3582 * local15 >> 8);
					local37 = local6.anInt3598 + (local6.anInt3586 * local15 >> 8);
					local47 = local6.anInt3588 + (local6.anInt3594 * local15 >> 8);
					local57 = local6.anInt3584 + (local6.anInt3592 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3599 == 4) {
				local15 = arg2 - local6.anInt3593;
				if (local15 > 0) {
					local27 = local6.anInt3587 + (local6.anInt3582 * local15 >> 8);
					local37 = local6.anInt3598 + (local6.anInt3586 * local15 >> 8);
					local47 = local6.anInt3588 + (local6.anInt3594 * local15 >> 8);
					local57 = local6.anInt3584 + (local6.anInt3592 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3599 == 5) {
				local15 = arg1 - local6.anInt3588;
				if (local15 > 0) {
					local27 = local6.anInt3587 + (local6.anInt3582 * local15 >> 8);
					local37 = local6.anInt3598 + (local6.anInt3586 * local15 >> 8);
					local47 = local6.anInt3593 + (local6.anInt3583 * local15 >> 8);
					local57 = local6.anInt3590 + (local6.anInt3589 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLclient!wf;Lclient!wf;)V")
	public static void method2544(@OriginalArg(1) Class4_Sub2 arg0, @OriginalArg(2) Class4_Sub2 arg1) {
		if (arg1.aClass4_Sub2_56 != null) {
			arg1.method5538();
		}
		arg1.aClass4_Sub2_57 = arg0.aClass4_Sub2_57;
		arg1.aClass4_Sub2_56 = arg0;
		arg1.aClass4_Sub2_56.aClass4_Sub2_57 = arg1;
		arg1.aClass4_Sub2_57.aClass4_Sub2_56 = arg1;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)V")
	public static void method2545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static247.aClass4_Sub9_Sub2_2.anInt6207 = 0;
		Static247.aClass4_Sub9_Sub2_2.method4999(Static389.aClass44_7.anInt1111);
		Static247.aClass4_Sub9_Sub2_2.method4999(arg3);
		Static247.aClass4_Sub9_Sub2_2.method4999(arg1);
		Static247.aClass4_Sub9_Sub2_2.method5029(arg0);
		Static247.aClass4_Sub9_Sub2_2.method5029(arg2);
		Static26.anInt634 = -3;
		Static313.anInt5081 = 0;
		Static254.anInt4212 = 1;
		Static344.anInt5705 = 0;
	}
}
