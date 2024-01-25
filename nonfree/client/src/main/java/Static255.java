import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "Lclient!mga;")
	public static Class238 aClass238_1;

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "I")
	public static int anInt4769;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I[ILclient!iq;B)Lclient!nha;")
	public static Class254 method3993(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class178 arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(9) int[] local9 = null;
		@Pc(11) int[] local11 = null;
		@Pc(19) float[][] local19 = null;
		if (arg2.aByteArray37 != null) {
			@Pc(25) int local25 = arg2.anInt5134;
			@Pc(28) int[] local28 = new int[local25];
			@Pc(31) int[] local31 = new int[local25];
			@Pc(34) int[] local34 = new int[local25];
			@Pc(37) int[] local37 = new int[local25];
			@Pc(40) int[] local40 = new int[local25];
			@Pc(43) int[] local43 = new int[local25];
			for (@Pc(45) int local45 = 0; local45 < local25; local45++) {
				local28[local45] = Integer.MAX_VALUE;
				local31[local45] = -2147483647;
				local34[local45] = Integer.MAX_VALUE;
				local37[local45] = -2147483647;
				local40[local45] = Integer.MAX_VALUE;
				local43[local45] = -2147483647;
			}
			local7 = new int[local25];
			local11 = new int[local25];
			local19 = new float[local25][];
			@Pc(100) int local100;
			@Pc(157) int local157;
			for (@Pc(92) int local92 = 0; local92 < arg0; local92++) {
				local100 = arg1[local92];
				if (arg2.aByteArray37[local100] != -1) {
					@Pc(113) int local113 = arg2.aByteArray37[local100] & 0xFF;
					for (@Pc(115) int local115 = 0; local115 < 3; local115++) {
						@Pc(133) short local133;
						if (local115 == 0) {
							local133 = arg2.aShortArray96[local100];
						} else if (local115 == 1) {
							local133 = arg2.aShortArray95[local100];
						} else {
							local133 = arg2.aShortArray92[local100];
						}
						@Pc(152) int local152 = arg2.anIntArray298[local133];
						local157 = arg2.anIntArray304[local133];
						@Pc(162) int local162 = arg2.anIntArray302[local133];
						if (local152 < local28[local113]) {
							local28[local113] = local152;
						}
						if (local31[local113] < local152) {
							local31[local113] = local152;
						}
						if (local34[local113] > local157) {
							local34[local113] = local157;
						}
						if (local157 > local37[local113]) {
							local37[local113] = local157;
						}
						if (local40[local113] > local162) {
							local40[local113] = local162;
						}
						if (local162 > local43[local113]) {
							local43[local113] = local162;
						}
					}
				}
			}
			local9 = new int[local25];
			for (local100 = 0; local100 < local25; local100++) {
				@Pc(268) byte local268 = arg2.aByteArray41[local100];
				if (local268 > 0) {
					local7[local100] = (local31[local100] + local28[local100]) / 2;
					local9[local100] = (local37[local100] + local34[local100]) / 2;
					local11[local100] = (local40[local100] + local43[local100]) / 2;
					@Pc(325) float local325;
					@Pc(333) float local333;
					@Pc(341) float local341;
					if (local268 == 1) {
						local157 = arg2.anIntArray294[local100];
						if (local157 == 0) {
							local333 = 1.0F;
							local325 = 1.0F;
						} else if (local157 > 0) {
							local333 = (float) local157 / 1024.0F;
							local325 = 1.0F;
						} else {
							local325 = (float) -local157 / 1024.0F;
							local333 = 1.0F;
						}
						local341 = 64.0F / (float) arg2.anIntArray301[local100];
					} else if (local268 == 2) {
						local325 = 64.0F / (float) arg2.anIntArray294[local100];
						local333 = 64.0F / (float) arg2.anIntArray295[local100];
						local341 = 64.0F / (float) arg2.anIntArray301[local100];
					} else {
						local341 = (float) arg2.anIntArray301[local100] / 1024.0F;
						local333 = (float) arg2.anIntArray295[local100] / 1024.0F;
						local325 = (float) arg2.anIntArray294[local100] / 1024.0F;
					}
					local19[local100] = Static134.method2212(arg2.aShortArray93[local100], local333, arg2.aShortArray94[local100], local341, local325, arg2.aByteArray38[local100] & 0xFF, arg2.aShortArray99[local100]);
				}
			}
		}
		return new Class254(local7, local9, local11, local19);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!av;ILclient!av;)V")
	public static void method3994(@OriginalArg(0) Class20 arg0, @OriginalArg(2) Class20 arg1) {
		@Pc(13) Class3_Sub48 local13 = Static89.method1200(Static376.aClass286_65, Static532.aClass400_3.aClass399_2);
		local13.aClass3_Sub28_Sub2_1.method5292(arg1.anInt583);
		local13.aClass3_Sub28_Sub2_1.method5325(arg0.anInt600);
		local13.aClass3_Sub28_Sub2_1.method5309(arg1.anInt600);
		local13.aClass3_Sub28_Sub2_1.method5282(arg1.anInt595);
		local13.aClass3_Sub28_Sub2_1.method5270(arg0.anInt583);
		local13.aClass3_Sub28_Sub2_1.method5270(arg0.anInt595);
		Static532.aClass400_3.method9223(local13);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)Z")
	public static boolean method3996(@OriginalArg(1) int arg0) {
		if (Static273.aBooleanArray16[arg0]) {
			return true;
		} else if (Static125.aClass221_25.method5064(arg0)) {
			@Pc(32) int local32 = Static125.aClass221_25.method5065(arg0);
			if (local32 == 0) {
				Static273.aBooleanArray16[arg0] = true;
				return true;
			}
			if (Static403.aClass20ArrayArray2[arg0] == null) {
				Static403.aClass20ArrayArray2[arg0] = new Class20[local32];
			}
			for (@Pc(57) int local57 = 0; local57 < local32; local57++) {
				if (Static403.aClass20ArrayArray2[arg0][local57] == null) {
					@Pc(73) byte[] local73 = Static125.aClass221_25.method5089(local57, arg0);
					if (local73 != null) {
						@Pc(85) Class20 local85 = Static403.aClass20ArrayArray2[arg0][local57] = new Class20();
						local85.anInt600 = local57 + (arg0 << 16);
						if (local73[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local85.method464(new Class3_Sub28(local73));
					}
				}
			}
			Static273.aBooleanArray16[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(III)Z")
	public static boolean method3997(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static645.method8717(arg0, arg1) | (arg1 & 0x2000) != 0 | Static667.method8875(arg0, arg1)) & Static540.method7593(arg0, arg1);
	}
}
