import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!hm", name = "w", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_54 = new Class200(73, 6);

	@OriginalMember(owner = "client!hm", name = "M", descriptor = "Z")
	public static boolean aBoolean285 = false;

	@OriginalMember(owner = "client!hm", name = "N", descriptor = "I")
	public static int anInt4151 = 0;

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(II)Z")
	public static boolean method3673(@OriginalArg(0) int arg0) {
		if (Static44.aBooleanArray5[arg0]) {
			return true;
		} else if (Static583.aClass196_121.method5119(arg0)) {
			@Pc(25) int local25 = Static583.aClass196_121.method5118(arg0);
			if (local25 == 0) {
				Static44.aBooleanArray5[arg0] = true;
				return true;
			}
			if (Static92.aClass279ArrayArray1[arg0] == null) {
				Static92.aClass279ArrayArray1[arg0] = new Class279[local25];
			}
			for (@Pc(52) int local52 = 0; local52 < local25; local52++) {
				if (Static92.aClass279ArrayArray1[arg0][local52] == null) {
					@Pc(68) byte[] local68 = Static583.aClass196_121.method5102(arg0, local52);
					if (local68 != null) {
						@Pc(80) Class279 local80 = Static92.aClass279ArrayArray1[arg0][local52] = new Class279();
						local80.anInt8185 = local52 + (arg0 << 16);
						if (local68[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local80.method7072(new Class3_Sub3(local68));
					}
				}
			}
			Static44.aBooleanArray5[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3674(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg0; local7 <= arg3; local7++) {
			for (@Pc(14) int local14 = arg4; local14 <= arg2; local14++) {
				if (arg1 == Static609.anIntArrayArray63[local7][local14] && Static85.anIntArrayArray11[local7][local14] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IILclient!d;IILclient!ha;I)V")
	public static void method3677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5) {
		if (Static368.anInt6962 < 100) {
			Static325.method5298(arg4, arg2);
		}
		arg4.KA(arg3, arg1, arg3 + arg0, arg1 - -arg5);
		@Pc(34) int local34;
		@Pc(45) int local45;
		if (Static368.anInt6962 < 100) {
			local34 = arg0 / 2 + arg3;
			local45 = arg5 / 2 + arg1 - 38;
			arg4.aa(arg3, arg1, arg0, arg5, -16777216, 0);
			arg4.method7506(local34 - 152, local45, 304, 34, Static131.aColorArray11[Static459.anInt8079].getRGB(), 0);
			arg4.aa(local34 - 150, local45 + 2, Static368.anInt6962 * 3, 30, Static128.aColorArray10[Static459.anInt8079].getRGB(), 0);
			Static460.aClass62_9.method8363(-1, local45 + 20, local34, Static59.aClass43_18.method1598(Static325.anInt6083), Static281.aColorArray22[Static459.anInt8079].getRGB());
			return;
		}
		@Pc(108) int local108 = Static365.anInt6941 - (int) ((float) arg0 / Static110.aFloat79);
		local34 = (int) ((float) arg5 / Static110.aFloat79) + Static561.anInt9391;
		local45 = Static365.anInt6941 + (int) ((float) arg0 / Static110.aFloat79);
		Static396.anInt6640 = Static365.anInt6941 - (int) ((float) arg0 / Static110.aFloat79);
		Static44.anInt1312 = (int) ((float) (arg0 * 2) / Static110.aFloat79);
		@Pc(157) int local157 = Static561.anInt9391 - (int) ((float) arg5 / Static110.aFloat79);
		Static149.anInt2952 = (int) ((float) (arg5 * 2) / Static110.aFloat79);
		Static366.anInt6950 = Static561.anInt9391 - (int) ((float) arg5 / Static110.aFloat79);
		Static110.method2798(local108 + Static110.anInt3014, local34 + Static110.anInt3012, local45 + Static110.anInt3014, local157 - -Static110.anInt3012, arg3, arg1, arg3 + arg0, arg5 + 1 + arg1);
		Static110.method2803(arg4);
		@Pc(204) Class223 local204 = Static110.method2783(arg4);
		Static530.method7796(arg4, local204);
		if (Static238.anInt4463 > 0) {
			Static165.anInt3234--;
			if (Static165.anInt3234 == 0) {
				Static238.anInt4463--;
				Static165.anInt3234 = 20;
			}
		}
		if (!Static106.aBoolean155) {
			return;
		}
		@Pc(235) int local235 = arg3 + arg0 - 5;
		@Pc(241) int local241 = arg5 + arg1 - 8;
		Static187.aClass62_4.method8366(-1, local235, "Fps:" + Static295.anInt5199, local241, 16776960);
		@Pc(256) int local256 = local241 - 15;
		@Pc(258) Runtime local258 = Runtime.getRuntime();
		@Pc(267) int local267 = (int) ((local258.totalMemory() - local258.freeMemory()) / 1024L);
		@Pc(269) int local269 = 16776960;
		if (local267 > 65536) {
			local269 = 16711680;
		}
		Static187.aClass62_4.method8366(-1, local235, "Mem:" + local267 + "k", local256, local269);
		local241 = local256 - 15;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!sl;)Lclient!nj;")
	public static Class141_Sub2 method3680(@OriginalArg(1) Class3_Sub3 arg0) {
		return new Class141_Sub2(arg0.method4209(), arg0.method4209(), arg0.method4209(), arg0.method4209(), arg0.method4204(), arg0.method4204(), arg0.method4225());
	}
}
