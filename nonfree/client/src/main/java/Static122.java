import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!fq", name = "t", descriptor = "B")
	public static byte aByte46;

	@OriginalMember(owner = "client!fq", name = "D", descriptor = "I")
	public static int anInt2697;

	@OriginalMember(owner = "client!fq", name = "s", descriptor = "I")
	public static int anInt2689 = -1;

	@OriginalMember(owner = "client!fq", name = "E", descriptor = "[F")
	public static final float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILclient!bl;BI)V")
	public static void method1980(@OriginalArg(0) int arg0, @OriginalArg(1) Class30_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt1303 == arg2 && arg2 != -1) {
			@Pc(19) Class235 local19 = Static107.aClass239_1.method5420(arg2);
			@Pc(22) int local22 = local19.anInt6852;
			if (local22 == 1) {
				arg1.anInt1267 = 1;
				arg1.anInt1260 = 0;
				arg1.anInt1245 = 0;
				arg1.anInt1271 = arg0;
				arg1.anInt1294 = 0;
				Static290.method4258(arg1.anInt7488, arg1.anInt1294, arg1.aByte102, arg1.anInt7490, false, local19);
			}
			if (local22 == 2) {
				arg1.anInt1245 = 0;
				return;
			}
		} else if (arg2 == -1 || arg1.anInt1303 == -1 || Static107.aClass239_1.method5420(arg2).anInt6856 >= Static107.aClass239_1.method5420(arg1.anInt1303).anInt6856) {
			arg1.anInt1245 = 0;
			arg1.anInt1303 = arg2;
			arg1.anInt1260 = 0;
			arg1.anInt1271 = arg0;
			arg1.anInt1267 = 1;
			arg1.anInt1315 = arg1.anInt1314;
			arg1.anInt1294 = 0;
			if (arg1.anInt1303 == -1) {
				return;
			}
			Static290.method4258(arg1.anInt7488, arg1.anInt1294, arg1.aByte102, arg1.anInt7490, false, Static107.aClass239_1.method5420(arg1.anInt1303));
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1982(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + arg0.charAt(local17) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILclient!qs;ZIIII)V")
	public static void method1984(@OriginalArg(0) int arg0, @OriginalArg(1) Class211 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static353.aBoolean476 = false;
		Static249.anInt4852 = 0;
		Static199.anInt4097 = arg2;
		Static225.aClass211_57 = arg1;
		Static269.anInt5203 = arg3;
		Static133.anInt2954 = 1;
		Static385.anInt7047 = Static26.aClass1_Sub19_Sub3_1.method5317() / arg0;
		if (Static385.anInt7047 < 1) {
			Static385.anInt7047 = 1;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "([FIIIIII)V")
	public static void method1985(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static25.method518(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static25.method518(arg2)) {
			@Pc(40) int local40 = Static172.method2853(6408);
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg4 >= arg2 ? arg2 : arg4;
			@Pc(53) int local53 = arg4 >> 1;
			@Pc(57) int local57 = arg2 >> 1;
			@Pc(59) float[] local59 = arg0;
			@Pc(66) float[] local66 = new float[local40 * local53 * local57];
			while (true) {
				OpenGL.glTexImage2Df(3553, local42, 34842, arg4, arg2, 0, 6408, 5126, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(86) int local86 = local40 * arg4;
				for (@Pc(88) int local88 = 0; local88 < local40; local88++) {
					@Pc(91) int local91 = local88;
					@Pc(93) int local93 = local88;
					@Pc(97) int local97 = local88 + local86;
					for (@Pc(99) int local99 = 0; local99 < local57; local99++) {
						for (@Pc(102) int local102 = 0; local102 < local53; local102++) {
							@Pc(107) float local107 = local59[local93];
							local93 += local40;
							@Pc(117) float local117 = local107 + local59[local93];
							local93 += local40;
							@Pc(127) float local127 = local117 + local59[local97];
							local97 += local40;
							@Pc(137) float local137 = local127 + local59[local97];
							local66[local91] = local137 * 0.25F;
							local97 += local40;
							local91 += local40;
						}
						local93 += local86;
						local97 += local86;
					}
				}
				@Pc(181) float[] local181 = local66;
				local66 = local59;
				arg2 = local57;
				arg4 = local53;
				local59 = local181;
				local53 >>= 0x1;
				local42++;
				local57 >>= 0x1;
				local49 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
