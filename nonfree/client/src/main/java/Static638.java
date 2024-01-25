import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
	public static int anInt9839;

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
	public static int anInt9840;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray106 = new int[128][128];

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
	public static void method8379() {
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub19_2, 1);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub19_1, 1);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub11_2, 1);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub11_1, 1);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub23_1, 1);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub22_1, 1);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub24_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub10_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub29_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub21_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub12_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub2_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub5_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub27_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub17_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub17_2, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub1_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub14_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub28_1, 0);
		Static270.method4313();
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub8_1, 2);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub13_1, 2);
		Static260.method4105();
		Static225.method3512();
		Static515.aBoolean646 = true;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!uv;)V")
	public static void method8380(@OriginalArg(1) Class23_Sub2_Sub1_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt10162 == Static621.anInt9665 || arg0.anInt10135 == -1 || arg0.anInt10186 != 0) {
			local5 = true;
		} else {
			@Pc(26) Class48 local26 = Static483.aClass373_2.method8323(arg0.anInt10135);
			if (local26.aBoolean139 || local26.anIntArray68[arg0.anInt10163] < arg0.anInt10140 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(54) int local54 = arg0.anInt10162 - arg0.anInt10151;
			@Pc(60) int local60 = Static621.anInt9665 - arg0.anInt10151;
			@Pc(71) int local71 = arg0.anInt10129 * 512 + arg0.method8625() * 256;
			@Pc(83) int local83 = arg0.anInt10134 * 512 + arg0.method8625() * 256;
			@Pc(94) int local94 = arg0.anInt10130 * 512 + arg0.method8625() * 256;
			@Pc(105) int local105 = arg0.anInt10159 * 512 + arg0.method8625() * 256;
			arg0.anInt10109 = (local83 * (local54 - local60) + local105 * local60) / local54;
			arg0.anInt10108 = (local60 * local94 + local71 * (local54 - local60)) / local54;
		}
		arg0.anInt10191 = 0;
		if (arg0.anInt10139 == 0) {
			arg0.method8623(8192, false);
		}
		if (arg0.anInt10139 == 1) {
			arg0.method8623(12288, false);
		}
		if (arg0.anInt10139 == 2) {
			arg0.method8623(0, false);
		}
		if (arg0.anInt10139 == 3) {
			arg0.method8623(4096, false);
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method8382() {
		@Pc(11) String local11 = "www";
		if (Static229.aClass309_8 == Static115.aClass309_3) {
			local11 = "www-wtrc";
		} else if (Static625.aClass309_9 == Static229.aClass309_8) {
			local11 = "www-wtqa";
		} else if (Static17.aClass309_1 == Static229.aClass309_8) {
			local11 = "www-wtwip";
		}
		@Pc(32) String local32 = "";
		if (Static605.aString120 != null) {
			local32 = "/p=" + Static605.aString120;
		}
		return "http://" + local11 + "." + Static102.aClass181_38.aString62 + ".com/l=" + Static319.anInt5939 + "/a=" + Static88.anInt1933 + local32 + "/";
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZI)V")
	public static void method8383(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg0) {
			@Pc(10) Class3_Sub44 local10 = Static275.method5689(Static331.aClass376_141, Static540.aClass282_4);
			local10.aClass3_Sub17_Sub2_3.method4876(arg1);
			Static616.method8089(local10);
		} else {
			Static543.method7514(Static600.aClass239_12, arg1, -1);
		}
	}
}
