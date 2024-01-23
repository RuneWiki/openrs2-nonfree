import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!i;")
	public static Class41 aClass41_813 = Static184.method2923(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Lclient!i;")
	public static Class41 aClass41_814 = Static184.method2923("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "[[[Lclient!wi;")
	public static Class108[][][] aClass108ArrayArrayArray1 = new Class108[4][104][104];

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Lclient!i;")
	public static Class41 aClass41_815 = Static184.method2923("Abbrechen");

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!i;")
	public static Class41 aClass41_816 = Static184.method2923("(U5");

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "[I")
	public static int[] anIntArray307 = new int[1000];

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
	public static int anInt2867 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIBIII)V")
	public static void method2004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg2;
		Static204.method3147(arg0 - arg1, arg4, arg0 + arg1, Static3.anIntArrayArray1[arg3]);
		@Pc(29) int local29 = arg1 * arg1;
		@Pc(31) int local31 = 0;
		@Pc(35) int local35 = arg2 * arg2;
		@Pc(39) int local39 = local35 << 1;
		@Pc(43) int local43 = local29 << 1;
		@Pc(47) int local47 = arg2 << 1;
		@Pc(56) int local56 = local35 - local43 * (local47 - 1);
		@Pc(65) int local65 = local39 + local29 * (1 - local47);
		@Pc(69) int local69 = local29 << 2;
		@Pc(77) int local77 = local43 * ((arg2 << 1) - 3);
		@Pc(81) int local81 = local35 << 2;
		@Pc(87) int local87 = local81;
		@Pc(95) int local95 = local39 * 3;
		@Pc(101) int local101 = (arg2 - 1) * local69;
		while (local7 > 0) {
			if (local65 < 0) {
				while (local65 < 0) {
					local31++;
					local65 += local95;
					local56 += local87;
					local95 += local81;
					local87 += local81;
				}
			}
			local7--;
			@Pc(131) int local131 = arg3 - local7;
			if (local56 < 0) {
				local65 += local95;
				local31++;
				local95 += local81;
				local56 += local87;
				local87 += local81;
			}
			@Pc(154) int local154 = local7 + arg3;
			local65 += -local101;
			local101 -= local69;
			@Pc(168) int local168 = arg0 + local31;
			@Pc(173) int local173 = arg0 - local31;
			Static204.method3147(local173, arg4, local168, Static3.anIntArrayArray1[local131]);
			local56 += -local77;
			local77 -= local69;
			Static204.method3147(local173, arg4, local168, Static3.anIntArrayArray1[local154]);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZB)V")
	public static void method2005(@OriginalArg(0) boolean arg0) {
		Static194.method3305();
		Static129.anInt566++;
		if (Static129.anInt566 < 50 && !arg0) {
			return;
		}
		Static129.anInt566 = 0;
		if (Static53.aBoolean83 || Static30.aClass63_1 == null) {
			return;
		}
		Static131.aClass2_Sub3_Sub1_2.method221(19);
		try {
			Static30.aClass63_1.method2037(Static131.aClass2_Sub3_Sub1_2.anInt239, Static131.aClass2_Sub3_Sub1_2.aByteArray4);
			Static131.aClass2_Sub3_Sub1_2.anInt239 = 0;
		} catch (@Pc(47) IOException local47) {
			Static53.aBoolean83 = true;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method2006() {
		Static14.aFont1 = null;
		Static177.aFontMetrics1 = null;
		Static128.anImage4 = null;
	}
}
