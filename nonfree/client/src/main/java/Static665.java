import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static665 {

	@OriginalMember(owner = "client!wga", name = "r", descriptor = "[Lclient!kha;")
	public static Class204[] aClass204Array3;

	@OriginalMember(owner = "client!wga", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString55;

	@OriginalMember(owner = "client!wga", name = "m", descriptor = "Lclient!jca;")
	public static final Class182 aClass182_4 = new Class182(1);

	@OriginalMember(owner = "client!wga", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIII[FI)V")
	public static void method4487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5) {
		if (arg3 > 0 && !Static197.method3300(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static197.method3300(arg1)) {
			@Pc(41) int local41 = Static453.method6398(6408);
			@Pc(43) int local43 = 0;
			@Pc(51) int local51 = arg1 <= arg3 ? arg1 : arg3;
			@Pc(55) int local55 = arg3 >> 1;
			@Pc(59) int local59 = arg1 >> 1;
			@Pc(61) float[] local61 = arg4;
			@Pc(68) float[] local68 = new float[local41 * local55 * local59];
			while (true) {
				OpenGL.glTexImage2Df(3553, local43, 34842, arg3, arg1, 0, 6408, 5126, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(90) int local90 = arg3 * local41;
				@Pc(92) float[] local92 = local68;
				for (@Pc(94) int local94 = 0; local94 < local41; local94++) {
					@Pc(100) int local100 = local94;
					@Pc(102) int local102 = local94;
					@Pc(106) int local106 = local94 + local90;
					for (@Pc(108) int local108 = 0; local108 < local59; local108++) {
						for (@Pc(112) int local112 = 0; local112 < local55; local112++) {
							@Pc(118) float local118 = local61[local102];
							local102 += local41;
							@Pc(128) float local128 = local118 + local61[local102];
							@Pc(134) float local134 = local128 + local61[local106];
							local102 += local41;
							local106 += local41;
							@Pc(148) float local148 = local134 + local61[local106];
							local68[local100] = local148 * 0.25F;
							local106 += local41;
							local100 += local41;
						}
						local106 += local90;
						local102 += local90;
					}
				}
				local68 = local61;
				local61 = local92;
				arg1 = local59;
				arg3 = local55;
				local43++;
				local59 >>= 0x1;
				local55 >>= 0x1;
				local51 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V")
	public static void method4488() {
		@Pc(3) Class387[] local3 = Class231.aClass387Array1;
		synchronized (Class231.aClass387Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class231.aClass387Array1.length; local7++) {
				Class231.aClass387Array1[local7] = new Class387();
				Static17.anIntArray27[local7] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIB)V")
	public static void method4492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub1_Sub18 local8 = Static123.method1827(0L, 15);
		local8.method7441();
		local8.anInt8632 = arg0;
		local8.anInt8635 = arg1;
	}
}
