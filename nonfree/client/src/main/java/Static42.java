import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bm", name = "r", descriptor = "[I")
	public static final int[] anIntArray83 = new int[5];

	@OriginalMember(owner = "client!bm", name = "t", descriptor = "Lclient!mf;")
	public static final Class222 aClass222_3 = new Class222(10);

	@OriginalMember(owner = "client!bm", name = "w", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_32 = new Class235(59, 8);

	@OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
	public static int anInt691 = 0;

	@OriginalMember(owner = "client!bm", name = "D", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_33 = new Class235(68, 2);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIII)V")
	public static void method633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(14) int local14 = -1;
		@Pc(23) int local23 = Static176.method2504(arg3 + arg2, Static162.anInt2935, Static270.anInt4759);
		@Pc(33) int local33 = Static176.method2504(arg3 - arg2, Static162.anInt2935, Static270.anInt4759);
		Static433.method6039(arg1, local23, Static171.anIntArrayArray79[arg0], local33);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(65) int local65;
			@Pc(70) int local70;
			@Pc(89) int local89;
			@Pc(97) int local97;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local65 = arg0 - local9;
				local70 = arg0 + local9;
				if (local70 >= Static514.anInt8722 && local65 <= Static451.anInt7775) {
					local89 = Static176.method2504(arg3 + local7, Static162.anInt2935, Static270.anInt4759);
					local97 = Static176.method2504(arg3 - local7, Static162.anInt2935, Static270.anInt4759);
					if (Static451.anInt7775 >= local70) {
						Static433.method6039(arg1, local89, Static171.anIntArrayArray79[local70], local97);
					}
					if (Static514.anInt8722 <= local65) {
						Static433.method6039(arg1, local89, Static171.anIntArrayArray79[local65], local97);
					}
				}
			}
			local7++;
			local65 = arg0 - local7;
			local70 = arg0 + local7;
			if (Static514.anInt8722 <= local70 && local65 <= Static451.anInt7775) {
				local89 = Static176.method2504(local9 + arg3, Static162.anInt2935, Static270.anInt4759);
				local97 = Static176.method2504(arg3 - local9, Static162.anInt2935, Static270.anInt4759);
				if (Static451.anInt7775 >= local70) {
					Static433.method6039(arg1, local89, Static171.anIntArrayArray79[local70], local97);
				}
				if (Static514.anInt8722 <= local65) {
					Static433.method6039(arg1, local89, Static171.anIntArrayArray79[local65], local97);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(FZFF)F")
	public static float method634(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return (arg1 - arg0) * arg2 + arg0;
	}
}
