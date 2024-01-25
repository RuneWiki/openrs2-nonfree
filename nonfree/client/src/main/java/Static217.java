import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "Lclient!fu;")
	public static Class106 aClass106_3;

	@OriginalMember(owner = "client!ida", name = "g", descriptor = "I")
	public static int anInt4277;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(BLclient!og;BII)V")
	public static void method3779(@OriginalArg(1) Class9_Sub1_Sub1_Sub2_Sub2 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(18) int local18 = arg0.anIntArray518[0];
		@Pc(23) int local23 = arg0.anIntArray517[0];
		if (local18 < 0 || Static400.anInt6818 <= local18 || local23 < 0 || Static271.anInt5050 <= local23 || (arg2 < 0 || Static400.anInt6818 <= arg2 || arg1 < 0 || Static271.anInt5050 <= arg1)) {
			return;
		}
		@Pc(91) int local91 = Static258.method4312(Static583.anIntArray691, 0, -4, true, 0, 0, arg1, 0, Static221.aClass95Array2[arg0.aByte126], local23, arg0.method5569(), local18, arg2, Static10.anIntArray18);
		if (local91 >= 1 && local91 <= 3) {
			for (@Pc(103) int local103 = 0; local103 < local91 - 1; local103++) {
				arg0.method5580(Static583.anIntArray691[local103], (byte) 2, Static10.anIntArray18[local103]);
			}
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lclient!cm;BLclient!cm;)V")
	public static void method3781(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(2) Class3_Sub3 arg1) {
		if (arg0.aClass3_Sub3_62 != null) {
			arg0.method7720();
		}
		arg0.aClass3_Sub3_62 = arg1;
		arg0.aClass3_Sub3_61 = arg1.aClass3_Sub3_61;
		arg0.aClass3_Sub3_62.aClass3_Sub3_61 = arg0;
		arg0.aClass3_Sub3_61.aClass3_Sub3_62 = arg0;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IBLclient!pl;)V")
	public static void method3785(@OriginalArg(0) int arg0, @OriginalArg(2) Class9_Sub1_Sub1_Sub2 arg1) {
		if (arg1.anIntArray515 == null) {
			return;
		}
		@Pc(13) int local13 = arg1.anIntArray515[arg0 + 1];
		if (local13 == arg1.anInt6453) {
			return;
		}
		arg1.anInt6385 = 0;
		arg1.anInt6469 = arg1.anInt6468;
		arg1.anInt6423 = 0;
		arg1.anInt6453 = local13;
		arg1.anInt6441 = 0;
		arg1.anInt6440 = 1;
		if (arg1.anInt6453 != -1) {
			Static351.method5300(arg1.anInt6385, Static330.aClass279_2.method6216(arg1.anInt6453), arg1.anInt8980, arg1.anInt8975, arg1.aByte126, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 == arg1);
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lclient!gfa;Z)V")
	public static void method3786(@OriginalArg(0) Class9_Sub1 arg0) {
		if (Static495.aBoolean622) {
			Static366.aClass66Array1[Static366.aClass66Array1.length - 1].method2158(arg0);
		} else {
			Static372.method5515(arg0, Static518.aClass3_Sub22Array5);
		}
	}
}
