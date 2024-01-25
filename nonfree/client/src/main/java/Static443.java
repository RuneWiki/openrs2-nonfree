import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!vs", name = "A", descriptor = "I")
	public static int anInt7442;

	@OriginalMember(owner = "client!vs", name = "G", descriptor = "F")
	public static float aFloat104;

	@OriginalMember(owner = "client!vs", name = "x", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_188 = new Class163(61, 3);

	@OriginalMember(owner = "client!vs", name = "E", descriptor = "J")
	public static long aLong241 = -1L;

	@OriginalMember(owner = "client!vs", name = "F", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_189 = new Class163(19, 7);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(III[FIII)V")
	public static void method6067(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 > 0 && !Static94.method1600(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static94.method1600(arg4)) {
			@Pc(31) int local31 = Static358.method5008(6408);
			@Pc(33) int local33 = 0;
			@Pc(44) int local44 = arg0 >= arg4 ? arg4 : arg0;
			@Pc(48) int local48 = arg0 >> 1;
			@Pc(52) int local52 = arg4 >> 1;
			@Pc(54) float[] local54 = arg2;
			@Pc(61) float[] local61 = new float[local31 * local48 * local52];
			while (true) {
				OpenGL.glTexImage2Df(3553, local33, 34842, arg0, arg4, 0, 6408, 5126, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(83) int local83 = local31 * arg0;
				for (@Pc(85) int local85 = 0; local85 < local31; local85++) {
					@Pc(89) int local89 = local85;
					@Pc(91) int local91 = local85;
					@Pc(95) int local95 = local85 + local83;
					for (@Pc(97) int local97 = 0; local97 < local52; local97++) {
						for (@Pc(101) int local101 = 0; local101 < local48; local101++) {
							@Pc(107) float local107 = local54[local91];
							local91 += local31;
							@Pc(117) float local117 = local107 + local54[local91];
							@Pc(123) float local123 = local117 + local54[local95];
							local91 += local31;
							local95 += local31;
							@Pc(137) float local137 = local123 + local54[local95];
							local61[local89] = local137 * 0.25F;
							local95 += local31;
							local89 += local31;
						}
						local91 += local83;
						local95 += local83;
					}
				}
				@Pc(173) float[] local173 = local61;
				local61 = local54;
				arg0 = local48;
				local54 = local173;
				arg4 = local52;
				local33++;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local48 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method6068(@OriginalArg(1) Class167 arg0) {
		if (Static71.aBoolean86) {
			Static332.method4599(arg0);
		} else {
			Static281.method3885(arg0);
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "()V")
	public static void method6070() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static257.aClass227ArrayArrayArray4 != null) {
			for (local3 = 0; local3 < Static257.aClass227ArrayArrayArray4.length; local3++) {
				for (local6 = 0; local6 < Static459.anInt5916; local6++) {
					for (local9 = 0; local9 < Static342.anInt5746; local9++) {
						if (Static257.aClass227ArrayArrayArray4[local3][local6][local9] != null) {
							Static257.aClass227ArrayArrayArray4[local3][local6][local9].method5249();
						}
						Static257.aClass227ArrayArrayArray4[local3][local6][local9] = null;
					}
				}
			}
		}
		Static257.aClass227ArrayArrayArray4 = null;
		Static182.aClass55Array2 = null;
		if (Static137.aClass227ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static137.aClass227ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static459.anInt5916; local6++) {
					for (local9 = 0; local9 < Static342.anInt5746; local9++) {
						if (Static137.aClass227ArrayArrayArray1[local3][local6][local9] != null) {
							Static137.aClass227ArrayArrayArray1[local3][local6][local9].method5249();
						}
						Static137.aClass227ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static137.aClass227ArrayArrayArray1 = null;
		Static349.aClass55Array3 = null;
		Static389.aClass227ArrayArrayArray3 = null;
		Static178.aClass55Array1 = null;
		Static339.anInt5688 = 0;
		if (Static178.aClass103Array1 != null) {
			for (local3 = 0; local3 < Static339.anInt5688; local3++) {
				Static178.aClass103Array1[local3] = null;
			}
		}
		if (Static424.aClass1_Sub2Array3 != null) {
			for (local3 = 0; local3 < Static17.anInt290; local3++) {
				Static424.aClass1_Sub2Array3[local3] = null;
			}
			Static17.anInt290 = 0;
		}
		if (Static197.aClass226Array1 != null) {
			for (local3 = 0; local3 < Static329.anInt5518; local3++) {
				Static197.aClass226Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static174.anInt3263; local6++) {
				for (local9 = 0; local9 < Static459.anInt5916; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static342.anInt5746; local160++) {
						Static60.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static329.anInt5518 = 0;
		}
		Static28.anIntArrayArrayArray1 = null;
		Static360.method5047();
		Static74.aClass194_1.method4583();
		Static422.aByteArrayArray23 = null;
		Static328.anIntArrayArray46 = null;
		Static404.aShortArrayArray6 = null;
		Static316.aClass12_1 = null;
		Static56.aClass11_2 = null;
		Static157.aClass167_7 = null;
	}
}
