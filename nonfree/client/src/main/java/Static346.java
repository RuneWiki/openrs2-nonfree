import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!ts", name = "R", descriptor = "I")
	public static int anInt6113 = 0;

	@OriginalMember(owner = "client!ts", name = "S", descriptor = "[I")
	public static final int[] anIntArray730 = new int[1024];

	@OriginalMember(owner = "client!ts", name = "T", descriptor = "Z")
	public static boolean aBoolean460 = false;

	@OriginalMember(owner = "client!ts", name = "U", descriptor = "I")
	public static int anInt6114 = -50;

	@OriginalMember(owner = "client!ts", name = "Y", descriptor = "[I")
	public static final int[] anIntArray731 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5273(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZLjava/lang/String;Lclient!lk;)I")
	public static int method5274(@OriginalArg(1) String arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		@Pc(6) int local6 = arg1.anInt4788;
		@Pc(15) byte[] local15 = Static333.method5094(arg0);
		arg1.method4219(local15.length);
		arg1.anInt4788 += Static63.aClass60_1.method1299(local15, 0, arg1.aByteArray77, arg1.anInt4788, local15.length);
		return arg1.anInt4788 - local6;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(IB)V")
	public static void method5275(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static344.anInt6324 = arg0;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)V")
	public static void method5276() {
		if (Static319.anInt5631 <= 0) {
			Static251.aString44 = "";
			return;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static98.aStringArray12.length; local18++) {
			if (Static98.aStringArray12[local18].startsWith("--> ")) {
				local16++;
				if (local16 == Static319.anInt5631) {
					Static251.aString44 = Static98.aStringArray12[local18].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!bc;ILclient!km;III)V")
	public static void method5277(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class82 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static74.anInt4012 < 100) {
			Static94.method4863(arg2, arg0);
		}
		arg2.method4477(arg3, arg5, arg3 + arg1, arg5 + arg4);
		@Pc(32) int local32;
		@Pc(42) int local42;
		if (Static74.anInt4012 < 100) {
			local32 = arg3 + arg1 / 2;
			local42 = arg4 / 2 + arg5 - 18 - 20;
			arg2.method4482(arg3, arg5, arg1, arg4, -16777216, 0);
			arg2.method4552(local32 - 152, local42, 304, 34, Static238.aColorArray3[Static196.anInt3591].getRGB(), 0);
			arg2.method4482(local32 - 150, local42 + 2, Static74.anInt4012 * 3, 30, Static43.aColorArray1[Static196.anInt3591].getRGB(), 0);
			Static34.aClass13_1.method5617(local32, Static194.aColorArray2[Static196.anInt3591].getRGB(), -1, Static136.aClass221_96.method5229(Static189.anInt5185), local42 + 20);
			return;
		}
		@Pc(107) int local107 = Static284.anInt5040 - (int) ((float) arg1 / Static302.aFloat7);
		local32 = Static318.anInt4656 + (int) ((float) arg4 / Static302.aFloat7);
		local42 = Static284.anInt5040 + (int) ((float) arg1 / Static302.aFloat7);
		Static134.anInt2482 = (int) ((float) (arg1 * 2) / Static302.aFloat7);
		@Pc(151) int local151 = Static318.anInt4656 - (int) ((float) arg4 / Static302.aFloat7);
		Static363.anInt5935 = Static284.anInt5040 - (int) ((float) arg1 / Static302.aFloat7);
		Static86.anInt5376 = Static318.anInt4656 - (int) ((float) arg4 / Static302.aFloat7);
		Static92.anInt1721 = (int) ((float) (arg4 * 2) / Static302.aFloat7);
		Static302.method471(local107 + Static302.anInt396, local32 - -Static302.anInt387, Static302.anInt396 + local42, local151 - -Static302.anInt387, arg3, arg5, arg1 + arg3, arg5 + 1 + arg4);
		Static302.method474(arg2);
		@Pc(207) Class210 local207 = Static302.method477(arg2);
		Static215.method3630(local207, arg2);
		if (Static276.anInt4916 > 0) {
			Static269.anInt4775--;
			if (Static269.anInt4775 == 0) {
				Static269.anInt4775 = 20;
				Static276.anInt4916--;
			}
		}
		if (!Static340.aBoolean454) {
			return;
		}
		@Pc(242) int local242 = arg3 + arg1 - 5;
		@Pc(248) int local248 = arg4 + arg5 - 8;
		Static246.aClass13_4.method5605("Fps:" + Static280.anInt4946, local242, local248, 16776960);
		@Pc(263) int local263 = local248 - 15;
		@Pc(265) Runtime local265 = Runtime.getRuntime();
		@Pc(275) int local275 = (int) ((local265.totalMemory() - local265.freeMemory()) / 1024L);
		@Pc(277) int local277 = 16776960;
		if (local275 > 65536) {
			local277 = 16711680;
		}
		Static246.aClass13_4.method5605("Mem:" + local275 + "k", local242, local263, local277);
		local248 = local263 - 15;
	}
}
