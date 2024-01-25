import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!ul;")
	public static Class246 aClass246_145;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_136 = new Class107(17, 12);

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "Lclient!oe;")
	public static final Class181 aClass181_48 = new Class181();

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "[I")
	public static final int[] anIntArray405 = new int[8];

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
	public static int anInt4660 = -1;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!js;I[[B)V")
	public static void method3876(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(41) int local41;
		for (@Pc(22) int local22 = 0; local22 < local15; local22++) {
			@Pc(28) byte[] local28 = arg1[local22];
			if (local28 != null) {
				@Pc(35) Class1_Sub5 local35 = new Class1_Sub5(local28);
				local41 = Static266.anIntArray627[local22] >> 8;
				@Pc(47) int local47 = Static266.anIntArray627[local22] & 0xFF;
				@Pc(53) int local53 = local41 * 64 - Static165.anInt3049;
				@Pc(60) int local60 = local47 * 64 - Static345.anInt5799;
				Static435.method5771();
				arg0.method2997(Static345.anInt5799, local53, Static125.aClass188Array1, local60, Static165.anInt3049, local35);
				arg0.method3009(local35, local53, Static415.aClass39_11, local60, local12);
				if (!arg0.aBoolean210 && Static307.anInt5295 / 8 == local41 && Static303.anInt5255 / 8 == local47 && local12[0] != -1) {
					Static432.aClass171_1 = Static303.aClass161_1.method3748(Static117.aClass142_1, local12[3], local12[2], local12[1], local12[0]);
					Static422.anInt6824 = local12[4];
				}
			}
		}
		for (@Pc(133) int local133 = 0; local133 < local15; local133++) {
			@Pc(145) int local145 = (Static266.anIntArray627[local133] >> 8) * 64 - Static165.anInt3049;
			local41 = (Static266.anIntArray627[local133] & 0xFF) * 64 - Static345.anInt5799;
			@Pc(160) byte[] local160 = arg1[local133];
			if (local160 == null && Static303.anInt5255 < 800) {
				Static435.method5771();
				arg0.method2999(local41, local145);
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!ga;Lclient!ya;IIBI)V")
	public static void method3877(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class39 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static301.anInt5202 < 100) {
			Static174.method2802(arg1, arg2);
		}
		arg2.OA(arg0, arg5, arg0 + arg3, arg5 - -arg4);
		@Pc(35) int local35;
		@Pc(47) int local47;
		if (Static301.anInt5202 < 100) {
			local35 = arg0 + arg3 / 2;
			local47 = arg5 + arg4 / 2 - 18 - 20;
			arg2.O(arg0, arg5, arg3, arg4, -16777216, 0);
			arg2.method4513(local35 - 152, local47, 304, 34, Static377.aColorArray3[Static373.anInt6190].getRGB(), 0);
			arg2.O(local35 - 150, local47 - -2, Static301.anInt5202 * 3, 30, Static332.aColorArray2[Static373.anInt6190].getRGB(), 0);
			Static178.aClass71_5.method5446(local47 + 20, Static209.aClass7_96.method331(Static341.anInt5770), -1, Static30.aColorArray1[Static373.anInt6190].getRGB(), local35);
			return;
		}
		@Pc(116) int local116 = Static307.anInt5296 - (int) ((float) arg3 / Static168.aFloat4);
		local35 = (int) ((float) arg4 / Static168.aFloat4) + Static138.anInt6309;
		local47 = (int) ((float) arg3 / Static168.aFloat4) + Static307.anInt5296;
		Static145.anInt2781 = Static138.anInt6309 - (int) ((float) arg4 / Static168.aFloat4);
		Static207.anInt3928 = (int) ((float) (arg3 * 2) / Static168.aFloat4);
		@Pc(157) int local157 = Static138.anInt6309 - (int) ((float) arg4 / Static168.aFloat4);
		Static421.anInt2083 = (int) ((float) (arg4 * 2) / Static168.aFloat4);
		Static379.anInt4315 = Static307.anInt5296 - (int) ((float) arg3 / Static168.aFloat4);
		Static168.method433(Static168.anInt432 + local116, Static168.anInt430 + local35, local47 + Static168.anInt432, local157 - -Static168.anInt430, arg0, arg5, arg3 + arg0, arg4 + (arg5 - -1));
		Static168.method422(arg2);
		@Pc(203) Class181 local203 = Static168.method424(arg2);
		Static341.method4809(local203, arg2);
		if (Static440.anInt7076 > 0) {
			Static434.anInt7031--;
			if (Static434.anInt7031 == 0) {
				Static440.anInt7076--;
				Static434.anInt7031 = 20;
			}
		}
		if (!Static331.aBoolean498) {
			return;
		}
		@Pc(234) int local234 = arg3 + arg0 - 5;
		@Pc(240) int local240 = arg4 + arg5 - 8;
		Static312.aClass71_7.method5451(local240, "Fps:" + Static295.anInt5133, local234, 16776960);
		@Pc(255) int local255 = local240 - 15;
		@Pc(257) Runtime local257 = Runtime.getRuntime();
		@Pc(266) int local266 = (int) ((local257.totalMemory() - local257.freeMemory()) / 1024L);
		@Pc(268) int local268 = 16776960;
		if (local266 > 65536) {
			local268 = 16711680;
		}
		Static312.aClass71_7.method5451(local255, "Mem:" + local266 + "k", local234, local268);
		local240 = local255 - 15;
	}
}
