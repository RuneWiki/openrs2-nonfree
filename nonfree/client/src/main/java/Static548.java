import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!sj", name = "nb", descriptor = "Lclient!in;")
	public static final Class169 aClass169_231 = new Class169(24, -1);

	@OriginalMember(owner = "client!sj", name = "pb", descriptor = "Z")
	public static boolean aBoolean708 = false;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!ol;I)V")
	public static void method8413(@OriginalArg(0) Class2_Sub8 arg0) {
		if (arg0.lb.length - arg0.anInt5725 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method5203();
		if (local19 < 0 || local19 > 1 || arg0.lb.length - arg0.anInt5725 < 2) {
			return;
		}
		@Pc(46) int local46 = arg0.method5211();
		if (local46 * 6 > arg0.lb.length - arg0.anInt5725) {
			return;
		}
		for (@Pc(64) int local64 = 0; local64 < local46; local64++) {
			@Pc(70) int local70 = arg0.method5211();
			@Pc(76) int local76 = arg0.method5172();
			if (Static100.anIntArray75.length > local70 && Static546.aBooleanArray56[local70] && (Static294.aClass97_1.method2526(local70).aChar1 != '1' || local76 >= -1 && local76 <= 1)) {
				Static100.anIntArray75[local70] = local76;
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(III[I[Ljava/lang/Object;)V")
	public static void method8414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(23) int local23 = (arg0 + arg1) / 2;
		@Pc(25) int local25 = arg1;
		@Pc(29) int local29 = arg2[local23];
		arg2[local23] = arg2[arg0];
		arg2[arg0] = local29;
		@Pc(43) Object local43 = arg3[local23];
		arg3[local23] = arg3[arg0];
		arg3[arg0] = local43;
		@Pc(60) int local60 = local29 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(62) int local62 = arg1; local62 < arg0; local62++) {
			if ((local60 & local62) + local29 > arg2[local62]) {
				@Pc(77) int local77 = arg2[local62];
				arg2[local62] = arg2[local25];
				arg2[local25] = local77;
				@Pc(91) Object local91 = arg3[local62];
				arg3[local62] = arg3[local25];
				arg3[local25++] = local91;
			}
		}
		arg2[arg0] = arg2[local25];
		arg2[local25] = local29;
		arg3[arg0] = arg3[local25];
		arg3[local25] = local43;
		method8414(local25 - 1, arg1, arg2, arg3);
		method8414(arg0, local25 + 1, arg2, arg3);
	}
}
