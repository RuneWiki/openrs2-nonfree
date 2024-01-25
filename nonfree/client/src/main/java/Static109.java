import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "[I")
	public static final int[] anIntArray614 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
	public static int anInt6939 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILclient!m;IIBLclient!qa;)V")
	public static void method5350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class30 arg5) {
		if (Static231.anInt4229 < 100) {
			Static306.method4221(arg5, arg2);
		}
		arg5.pa(arg3, arg0, arg1 + arg3, arg4 + arg0);
		@Pc(34) int local34;
		@Pc(45) int local45;
		if (Static231.anInt4229 < 100) {
			local34 = arg3 + arg1 / 2;
			local45 = arg4 / 2 + arg0 - 20 - 18;
			arg5.NA(arg3, arg0, arg1, arg4, -16777216, 0);
			arg5.method4645(local34 - 152, local45, 304, 34, Static245.aColorArray1[Static383.anInt6697].getRGB(), 0);
			arg5.NA(local34 - 150, local45 + 2, Static231.anInt4229 * 3, 30, Static449.aColorArray2[Static383.anInt6697].getRGB(), 0);
			Static245.aClass105_4.method5604(-1, Static76.aClass242_20.method5320(Static139.anInt2670), Static450.aColorArray3[Static383.anInt6697].getRGB(), local34, local45 + 20);
			return;
		}
		@Pc(109) int local109 = Static348.anInt6296 - (int) ((float) arg1 / Static137.aFloat153);
		local34 = (int) ((float) arg4 / Static137.aFloat153) + Static4.anInt162;
		local45 = (int) ((float) arg1 / Static137.aFloat153) + Static348.anInt6296;
		Static32.anInt748 = Static348.anInt6296 - (int) ((float) arg1 / Static137.aFloat153);
		Static341.anInt6056 = (int) ((float) (arg4 * 2) / Static137.aFloat153);
		Static139.anInt2672 = (int) ((float) (arg1 * 2) / Static137.aFloat153);
		Static19.anInt571 = Static4.anInt162 - (int) ((float) arg4 / Static137.aFloat153);
		@Pc(167) int local167 = Static4.anInt162 - (int) ((float) arg4 / Static137.aFloat153);
		Static137.method4296(local109 + Static137.anInt5581, local34 - -Static137.anInt5584, Static137.anInt5581 + local45, local167 + Static137.anInt5584, arg3, arg0, arg1 + arg3, arg4 + arg0 + 1);
		Static137.method4304(arg5);
		@Pc(201) Class258 local201 = Static137.method4285(arg5);
		Static451.method5812(local201, arg5);
		if (Static2.anInt6973 > 0) {
			Static98.anInt2095--;
			if (Static98.anInt2095 == 0) {
				Static2.anInt6973--;
				Static98.anInt2095 = 20;
			}
		}
		if (!Static107.aBoolean174) {
			return;
		}
		@Pc(235) int local235 = arg1 + arg3 - 5;
		@Pc(241) int local241 = arg0 + arg4 - 8;
		Static390.aClass105_7.method5605(local241, local235, "Fps:" + Static379.anInt6645, 16776960);
		@Pc(256) int local256 = local241 - 15;
		@Pc(258) Runtime local258 = Runtime.getRuntime();
		@Pc(268) int local268 = (int) ((local258.totalMemory() - local258.freeMemory()) / 1024L);
		@Pc(270) int local270 = 16776960;
		if (local268 > 65536) {
			local270 = 16711680;
		}
		Static390.aClass105_7.method5605(local256, local235, "Mem:" + local268 + "k", local270);
		local241 = local256 - 15;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ID)V")
	public static void method5356(@OriginalArg(1) double arg0) {
		if (arg0 == Static250.aDouble9) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(31) int local31 = (int) (Math.pow((double) local19 / 255.0D, arg0) * 255.0D);
			Static197.anIntArray565[local19] = local31 > 255 ? 255 : local31;
		}
		Static250.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[[B[I[B[III[[B)I")
	public static int method5363(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(9) int local9 = arg1[arg5];
		@Pc(16) int local16 = local9 + arg3[arg5];
		@Pc(20) int local20 = arg1[arg4];
		@Pc(26) int local26 = arg3[arg4] + local20;
		@Pc(28) int local28 = local9;
		if (local9 < local20) {
			local28 = local20;
		}
		@Pc(35) int local35 = local16;
		if (local26 < local16) {
			local35 = local26;
		}
		@Pc(50) int local50 = arg2[arg5] & 0xFF;
		if ((arg2[arg4] & 0xFF) < local50) {
			local50 = arg2[arg4] & 0xFF;
		}
		@Pc(67) byte[] local67 = arg6[arg5];
		@Pc(76) byte[] local76 = arg0[arg4];
		@Pc(81) int local81 = local28 - local9;
		@Pc(86) int local86 = local28 - local20;
		for (@Pc(88) int local88 = local28; local88 < local35; local88++) {
			@Pc(100) int local100 = local76[local86++] + local67[local81++];
			if (local100 < local50) {
				local50 = local100;
			}
		}
		return -local50;
	}
}
