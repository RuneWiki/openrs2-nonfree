import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "Lclient!kp;")
	public static Class192 aClass192_1;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
	public static int anInt1778 = 0;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	public static void method1513() {
		Static31.aClass305_1.method6566();
		Static545.aClass201_5.method4714();
		Static107.aClass352_2.method7551();
		Static476.aClass69_5.method2182();
		Static510.aClass284_2.method6286();
		Static517.aClass145_1.method3788();
		Static330.aClass279_2.method6217();
		Static547.aClass248_2.method5705();
		Static165.aClass212_1.method5093();
		Static157.aClass195_1.method4541();
		Static363.aClass135_1.method3662();
		Static453.aClass348_3.method7404();
		Static191.aClass168_2.method4066();
		Static268.aClass79_1.method2479();
		Static69.aClass118_1.method3021();
		Static257.aClass182_1.method4394();
		Static125.aClass349_1.method7439();
		Static483.aClass2_1.method14();
		Static172.aClass219_1.method5179();
		Static405.aClass71_1.method2253();
		Static169.method2948();
		Static526.method6985();
		Static455.method6314();
		Static80.method7506();
		if (Static555.aClass173_8 != Static559.aClass173_9) {
			for (@Pc(91) int local91 = 0; local91 < Static366.aByteArrayArray16.length; local91++) {
				Static366.aByteArrayArray16[local91] = null;
			}
			Static438.anInt4408 = 0;
		}
		Static455.method6316();
		Static510.method6827();
		Static315.method4946();
		Static420.method6012();
		Static529.method6995();
		Static149.aClass10_14.method263();
		Static4.aClass43_1.method7202();
		Static341.method5184();
		Static334.method5138();
		Static104.aClass246_56.method5662();
		Static287.aClass246_135.method5662();
		Static531.aClass246_249.method5662();
		Static415.aClass246_259.method5662();
		Static35.aClass246_28.method5662();
		Static565.aClass246_261.method5662();
		Static576.aClass246_267.method5662();
		Static384.aClass246_184.method5662();
		Static171.aClass246_84.method5662();
		Static202.aClass246_101.method5662();
		Static325.aClass246_158.method5662();
		Static444.aClass246_208.method5662();
		Static151.aClass246_77.method5662();
		Static467.aClass246_221.method5662();
		Static437.aClass246_205.method5662();
		Static500.aClass246_235.method5662();
		Static114.aClass246_67.method5662();
		Static463.aClass246_219.method5662();
		Static79.aClass246_44.method5662();
		Static329.aClass246_162.method5662();
		Static462.aClass246_218.method5662();
		Static530.aClass246_248.method5662();
		Static334.aClass246_165.method5662();
		Static494.aClass246_232.method5662();
		Static376.aClass246_180.method5662();
		Static285.aClass246_133.method5662();
		Static89.aClass246_46.method5662();
		Static207.aClass246_105.method5662();
		Static549.aClass246_251.method5662();
		Static89.aClass246_47.method5662();
		Static329.aClass246_161.method5662();
		Static542.aClass246_250.method5662();
		Static421.aClass10_45.method263();
		Static582.aClass10_67.method263();
		Static209.aClass10_58.method263();
		Static450.aClass10_48.method263();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)Lclient!ar;")
	public static Class16 method1514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class63 local7 = Static554.aClass63ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass16_3;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[IBIIIII)V")
	public static void method1515(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg4 > 0 && !Static159.method2855(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static159.method2855(arg2)) {
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg2 <= arg4 ? arg2 : arg4;
			@Pc(51) int local51 = arg4 >> 1;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(65) int[] local65 = arg1;
			@Pc(70) int[] local70 = new int[local51 * local55];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local40, arg5, arg4, arg2, 0, 32993, arg3, local65, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(87) int local87 = 0;
				@Pc(89) int local89 = 0;
				@Pc(93) int local93 = arg4;
				for (@Pc(95) int local95 = 0; local95 < local55; local95++) {
					for (@Pc(99) int local99 = 0; local99 < local51; local99++) {
						@Pc(106) int local106 = local65[local89++];
						@Pc(111) int local111 = local65[local89++];
						@Pc(116) int local116 = local65[local93++];
						@Pc(122) int local122 = local106 >> 24 & 0xFF;
						@Pc(127) int local127 = local65[local93++];
						@Pc(133) int local133 = local106 >> 16 & 0xFF;
						@Pc(137) int local137 = local106 & 0xFF;
						@Pc(143) int local143 = local106 >> 8 & 0xFF;
						@Pc(151) int local151 = local122 + (local111 >> 24 & 0xFF);
						@Pc(159) int local159 = local143 + (local111 >> 8 & 0xFF);
						@Pc(165) int local165 = local137 + (local111 & 0xFF);
						@Pc(173) int local173 = local133 + (local111 >> 16 & 0xFF);
						@Pc(179) int local179 = local165 + (local116 & 0xFF);
						@Pc(187) int local187 = local151 + (local116 >> 24 & 0xFF);
						@Pc(195) int local195 = local173 + (local116 >> 16 & 0xFF);
						@Pc(203) int local203 = local159 + (local116 >> 8 & 0xFF);
						@Pc(209) int local209 = local179 + (local127 & 0xFF);
						@Pc(217) int local217 = local195 + (local127 >> 16 & 0xFF);
						@Pc(225) int local225 = local203 + (local127 >> 8 & 0xFF);
						@Pc(233) int local233 = local187 + (local127 >> 24 & 0xFF);
						local70[local87++] = local209 >> 2 & 0xFF | (local225 & 0x3FC) << 6 | (local233 & 0x3FC) << 22 | (local217 & 0x3FC) << 14;
					}
					local93 += arg4;
					local89 += arg4;
				}
				@Pc(286) int[] local286 = local70;
				local70 = local65;
				arg2 = local55;
				arg4 = local51;
				local65 = local286;
				local55 >>= 0x1;
				local51 >>= 0x1;
				local47 >>= 0x1;
				local40++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZII)V")
	public static void method1516(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub3_Sub7 local13 = Static363.method5457(arg0, 6);
		local13.method839();
		local13.anInt1088 = arg1;
	}
}
