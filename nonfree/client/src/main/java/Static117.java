import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "[Lclient!mi;")
	public static Class46[] aClass46Array5;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Lclient!ls;")
	public static final Class2_Sub34 aClass2_Sub34_1 = new Class2_Sub34(0, 0);

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray12 = new int[6][];

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
	public static int anInt3131 = 0;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "[Lclient!bh;")
	public static final Class32[] aClass32Array1 = new Class32[4];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIBI)V")
	public static void method2900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static303.anInt111 / (float) Static303.anInt106;
		@Pc(11) int local11 = arg0;
		@Pc(13) int local13 = arg1;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg0);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(40) int local40 = arg2 - (arg0 - local11) / 2;
		@Pc(49) int local49 = arg3 - (arg1 - local13) / 2;
		Static248.anInt5350 = -1;
		Static536.anInt9677 = Static303.anInt111 - Static303.anInt111 * local49 / local13;
		Static491.anInt9082 = Static303.anInt106 * local40 / local11;
		Static535.anInt9666 = -1;
		Static245.method4529();
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public static void method2902() {
		if (!Static475.aBoolean695) {
			return;
		}
		@Pc(16) Class24 local16 = Static330.method5694(Static194.anInt4509, Static397.anInt7582);
		if (local16 != null && local16.anObjectArray3 != null) {
			@Pc(25) Class2_Sub44 local25 = new Class2_Sub44();
			local25.aClass24_15 = local16;
			local25.anObjectArray32 = local16.anObjectArray3;
			Static284.method5153(local25);
		}
		Static64.anInt2065 = -1;
		Static475.aBoolean695 = false;
		Static151.anInt3895 = -1;
		if (local16 != null) {
			Static553.method8248(local16);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method2904(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg2.indexOf(arg1); local9 != -1; local9 = arg2.indexOf(arg1, arg0.length() + local9)) {
			arg2 = arg2.substring(0, local9) + arg0 + arg2.substring(arg1.length() + local9);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
	public static void method2905() {
		if (Static186.aClass20_4 == null) {
			return;
		}
		if (Static487.aBoolean676) {
			Static457.method7121();
		}
		Static292.aClass182_1.method5402();
		Static286.method5211();
		Static180.method3757();
		Static588.method8689();
		Static152.method3428();
		Static436.method6913();
		if (Static566.aClass376_1 != null) {
			Static566.aClass376_1.method9212();
		}
		Static591.method5435();
		Static261.method4784();
		Static239.method4463();
		Static184.method3867();
		Static328.method5641(false);
		for (@Pc(47) int local47 = 0; local47 < 2048; local47++) {
			@Pc(53) Class3_Sub1_Sub3_Sub3_Sub2 local53 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local47];
			if (local53 != null) {
				for (@Pc(57) int local57 = 0; local57 < local53.aClass166Array3.length; local57++) {
					local53.aClass166Array3[local57] = null;
				}
			}
		}
		for (@Pc(78) int local78 = 0; local78 < Static474.anInt8881; local78++) {
			@Pc(85) Class3_Sub1_Sub3_Sub3_Sub1 local85 = Static62.aClass2_Sub33Array1[local78].aClass3_Sub1_Sub3_Sub3_Sub1_2;
			if (local85 != null) {
				for (@Pc(89) int local89 = 0; local89 < local85.aClass166Array3.length; local89++) {
					local85.aClass166Array3[local89] = null;
				}
			}
		}
		Static172.aClass30_6 = null;
		Static45.aClass30_3 = null;
		Static186.aClass20_4.method7238();
		Static186.aClass20_4 = null;
	}
}
