import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)Z")
	public static boolean method7062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILclient!oa;IILclient!e;I)V")
	public static void method7064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface4 arg4, @OriginalArg(6) int arg5) {
		if (Static130.anInt2933 < 100) {
			Static476.method7309(arg4, arg2);
		}
		arg2.ca(arg5, arg1, arg3 + arg5, arg1 - -arg0);
		@Pc(34) int local34;
		@Pc(53) int local53;
		if (Static130.anInt2933 < 100) {
			local34 = arg3 / 2 + arg5;
			arg2.C(arg5, arg1, arg3, arg0, -16777216, 0);
			local53 = arg0 / 2 + arg1 - 20 - 18;
			arg2.method5334(local34 - 152, local53, 304, 34, Static553.aColorArray6[Static4.anInt227].getRGB(), 0);
			arg2.C(local34 - 150, local53 + 2, Static130.anInt2933 * 3, 30, Static144.aColorArray1[Static4.anInt227].getRGB(), 0);
			Static162.aClass111_6.method6681(Static300.aColorArray5[Static4.anInt227].getRGB(), local53 + 20, Static139.aClass101_17.method2841(Static126.anInt2904), local34, -1);
			return;
		}
		@Pc(108) int local108 = Static185.anInt3726 - (int) ((float) arg3 / Static87.aFloat148);
		local34 = (int) ((float) arg0 / Static87.aFloat148) + Static18.anInt597;
		local53 = (int) ((float) arg3 / Static87.aFloat148) + Static185.anInt3726;
		@Pc(132) int local132 = Static18.anInt597 - (int) ((float) arg0 / Static87.aFloat148);
		Static406.anInt7997 = Static18.anInt597 - (int) ((float) arg0 / Static87.aFloat148);
		Static46.anInt1147 = (int) ((float) (arg0 * 2) / Static87.aFloat148);
		Static86.anInt1982 = Static185.anInt3726 - (int) ((float) arg3 / Static87.aFloat148);
		Static22.anInt703 = (int) ((float) (arg3 * 2) / Static87.aFloat148);
		Static87.method5772(local108 + Static87.anInt6928, local34 + Static87.anInt6924, Static87.anInt6928 + local53, local132 - -Static87.anInt6924, arg5, arg1, arg3 + arg5, arg1 + 1 + arg0);
		Static87.method5771(arg2);
		@Pc(194) Class183 local194 = Static87.method5769(arg2);
		Static137.method2799(local194, arg2);
		if (Static568.anInt10054 > 0) {
			Static338.anInt6970--;
			if (Static338.anInt6970 == 0) {
				Static338.anInt6970 = 20;
				Static568.anInt10054--;
			}
		}
		if (!Static126.aBoolean224) {
			return;
		}
		@Pc(225) int local225 = arg3 + arg5 - 5;
		@Pc(231) int local231 = arg0 + arg1 - 8;
		Static137.aClass111_5.method6666("Fps:" + Static156.anInt10168, local231, 16776960, local225);
		@Pc(246) int local246 = local231 - 15;
		@Pc(248) Runtime local248 = Runtime.getRuntime();
		@Pc(258) int local258 = (int) ((local248.totalMemory() - local248.freeMemory()) / 1024L);
		@Pc(260) int local260 = 16776960;
		if (local258 > 65536) {
			local260 = 16711680;
		}
		Static137.aClass111_5.method6666("Mem:" + local258 + "k", local246, local260, local225);
		local231 = local246 - 15;
	}
}
