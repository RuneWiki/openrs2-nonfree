import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
	public static int anInt8777;

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_105 = new Class241(80, 7);

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
	public static int anInt8776 = 0;

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
	public static int anInt8782 = -1;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!ha;IZI)Lclient!da;")
	public static Class67 method7689(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class92 local9 = Static228.method4065(arg0, arg2, arg1);
		return local9 == null ? null : local9.aClass67_3;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V")
	public static void method7690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class243 local7 = Static334.aClass243ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class243 local28 = Static334.aClass243ArrayArrayArray2[local9][arg0][arg1] = Static334.aClass243ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class123 local33 = local28.aClass123_5; local33 != null; local33 = local33.aClass123_1) {
					@Pc(37) Class60_Sub1_Sub1 local37 = local33.aClass60_Sub1_Sub1_1;
					if (local37.aShort100 == arg0 && local37.aShort102 == arg1) {
						local37.aByte135--;
					}
				}
				if (local28.aClass60_Sub1_Sub2_1 != null) {
					local28.aClass60_Sub1_Sub2_1.aByte135--;
				}
				if (local28.aClass60_Sub1_Sub3_1 != null) {
					local28.aClass60_Sub1_Sub3_1.aByte135--;
				}
				if (local28.aClass60_Sub1_Sub3_2 != null) {
					local28.aClass60_Sub1_Sub3_2.aByte135--;
				}
				if (local28.aClass60_Sub1_Sub5_1 != null) {
					local28.aClass60_Sub1_Sub5_1.aByte135--;
				}
				if (local28.aClass60_Sub1_Sub5_2 != null) {
					local28.aClass60_Sub1_Sub5_2.aByte135--;
				}
			}
		}
		if (Static334.aClass243ArrayArrayArray2[0][arg0][arg1] == null) {
			Static334.aClass243ArrayArrayArray2[0][arg0][arg1] = new Class243(0);
			Static334.aClass243ArrayArrayArray2[0][arg0][arg1].aByte97 = 1;
		}
		Static334.aClass243ArrayArrayArray2[0][arg0][arg1].aClass243_1 = local7;
		Static334.aClass243ArrayArrayArray2[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!d;Ljava/awt/Canvas;III)Lclient!ha;")
	public static Class75 method7694(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class75_Sub2(arg1, arg0, arg2, arg3);
	}
}
