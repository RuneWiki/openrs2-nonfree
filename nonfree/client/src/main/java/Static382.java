import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "F")
	public static float aFloat81;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
	public static int anInt6199;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "[Lclient!je;")
	public static Class117[] aClass117Array2;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Lclient!ui;")
	public static Class230 aClass230_85;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
	public static int anInt6197 = 0;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "[Lclient!pp;")
	public static final Class185[] aClass185Array2 = new Class185[14];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z[IIII)V")
	public static void method5419(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(16) int local16 = arg2 - 1;
		@Pc(20) int local20 = local16 - 7;
		while (local20 > arg1) {
			@Pc(24) int local24 = arg1 + 1;
			arg0[local24] = arg3;
			@Pc(29) int local29 = local24 + 1;
			arg0[local29] = arg3;
			@Pc(34) int local34 = local29 + 1;
			arg0[local34] = arg3;
			@Pc(39) int local39 = local34 + 1;
			arg0[local39] = arg3;
			@Pc(44) int local44 = local39 + 1;
			arg0[local44] = arg3;
			@Pc(49) int local49 = local44 + 1;
			arg0[local49] = arg3;
			@Pc(54) int local54 = local49 + 1;
			arg0[local54] = arg3;
			arg1 = local54 + 1;
			arg0[arg1] = arg3;
		}
		while (local16 > arg1) {
			arg1++;
			arg0[arg1] = arg3;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BILclient!re;)Ljava/lang/String;")
	public static String method5420(@OriginalArg(2) Class1_Sub33 arg0) {
		try {
			@Pc(7) int local7 = arg0.method5181();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(24) byte[] local24 = new byte[local7];
			arg0.lb += Static201.aClass220_1.method4810(local7, 0, local24, arg0.aByteArray86, arg0.lb);
			return Static41.method635(local7, local24, 0);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method5421(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg0 < 128 || arg5 < 128 || arg0 > Static92.anInt1675 * 128 - 256 || arg5 > Static262.anInt6340 * 128 - 256) {
			Static202.anIntArray421[0] = Static202.anIntArray421[1] = -1;
			return;
		}
		@Pc(40) int local40 = Static236.method3260(arg2, arg5, arg0) - arg6;
		Static112.aClass127_3.method5260(arg4, 0, 0);
		Static66.aClass164_2.method5357(Static112.aClass127_3);
		Static66.aClass164_2.method5331(arg0, local40, arg5, Static202.anIntArray421);
		Static112.aClass127_3.method5260(-arg4, 0, 0);
		Static66.aClass164_2.method5357(Static112.aClass127_3);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIBI)V")
	public static void method5422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static194.anInt3448 <= arg3 && Static264.anInt4589 >= arg3) {
			@Pc(20) int local20 = Static140.method5231(arg1, Static98.anInt1774, Static372.anInt1561);
			@Pc(26) int local26 = Static140.method5231(arg2, Static98.anInt1774, Static372.anInt1561);
			Static194.method2811(local26, arg3, arg0, local20);
		}
	}
}
