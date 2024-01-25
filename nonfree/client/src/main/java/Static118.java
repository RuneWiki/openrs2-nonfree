import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "F")
	public static float aFloat54;

	@OriginalMember(owner = "client!fv", name = "r", descriptor = "Lclient!l;")
	public static Class17 aClass17_18;

	@OriginalMember(owner = "client!fv", name = "s", descriptor = "Lclient!mq;")
	public static Class165 aClass165_2;

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "F")
	public static float aFloat53 = 0.0F;

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "[I")
	public static final int[] anIntArray209 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString34 = null;

	@OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
	public static int anInt2673 = 0;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method2093(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg6 && arg3 == arg0 && arg5 == arg2 && arg1 == arg7) {
			Static369.method5015(arg6, arg1, arg8, arg2, arg0);
			return;
		}
		@Pc(23) int local23 = arg6;
		@Pc(25) int local25 = arg0;
		@Pc(29) int local29 = arg6 * 3;
		@Pc(33) int local33 = arg0 * 3;
		@Pc(37) int local37 = arg4 * 3;
		@Pc(41) int local41 = arg3 * 3;
		@Pc(45) int local45 = arg5 * 3;
		@Pc(49) int local49 = arg7 * 3;
		@Pc(59) int local59 = arg2 + local37 - arg6 - local45;
		@Pc(69) int local69 = arg1 + local41 - arg0 - local49;
		@Pc(80) int local80 = local45 + local29 - local37 - local37;
		@Pc(90) int local90 = local49 + local33 - local41 - local41;
		@Pc(95) int local95 = local37 - local29;
		@Pc(100) int local100 = local41 - local33;
		for (@Pc(102) int local102 = 128; local102 <= 4096; local102 += 128) {
			@Pc(110) int local110 = local102 * local102 >> 12;
			@Pc(116) int local116 = local110 * local102 >> 12;
			@Pc(120) int local120 = local116 * local59;
			@Pc(124) int local124 = local116 * local69;
			@Pc(128) int local128 = local110 * local80;
			@Pc(132) int local132 = local90 * local110;
			@Pc(136) int local136 = local102 * local95;
			@Pc(140) int local140 = local100 * local102;
			@Pc(150) int local150 = (local136 + local128 + local120 >> 12) + arg6;
			@Pc(162) int local162 = arg0 + (local132 + local124 + local140 >> 12);
			Static369.method5015(local23, local162, arg8, local150, local25);
			local25 = local162;
			local23 = local150;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
	public static void method2094() {
		Static291.aClass98_1 = new Class98(8);
		Static349.anInt5938 = 0;
		for (@Pc(17) Class8_Sub3 local17 = (Class8_Sub3) Static28.aClass112_3.method2553(); local17 != null; local17 = (Class8_Sub3) Static28.aClass112_3.method2550()) {
			local17.method564();
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(III)V")
	public static void method2095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static60.anInt1343 = arg1 - Static88.anInt4520;
		Static314.anInt5538 = arg0 - Static88.anInt4515;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!ya;I)V")
	public static void method2096(@OriginalArg(0) Class49 arg0) {
		if (Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89 != Static85.anInt2110 && (Static440.aClass106ArrayArrayArray3 != null && Static76.method1392(arg0, Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89))) {
			Static85.anInt2110 = Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89;
		}
	}
}
