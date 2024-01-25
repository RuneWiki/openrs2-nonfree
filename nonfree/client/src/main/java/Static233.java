import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "Lclient!wl;")
	public static Class29 aClass29_2;

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
	public static int anInt4834;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "Lclient!lm;")
	public static Class134 aClass134_111;

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString183 = "Drop";

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "Lclient!ps;")
	public static Class163 aClass163_14 = null;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
	public static int anInt4835 = 0;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([II[III)V")
	public static void method4189(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg3) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) int local20 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local20;
		@Pc(34) int local34 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local34;
		for (@Pc(46) int local46 = arg1; local46 < arg3; local46++) {
			if (local20 + (local46 & 0x1) > arg2[local46]) {
				@Pc(62) int local62 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16] = local62;
				@Pc(76) int local76 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local76;
			}
		}
		arg2[arg3] = arg2[local16];
		arg2[local16] = local20;
		arg0[arg3] = arg0[local16];
		arg0[local16] = local34;
		method4189(arg0, arg1, arg2, local16 - 1);
		method4189(arg0, local16 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	public static void method4190() {
		Static305.aClass1_Sub21_Sub2_3.method5757(195);
		Static305.aClass1_Sub21_Sub2_3.method5718(0);
	}
}
