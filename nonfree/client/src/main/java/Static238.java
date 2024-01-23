import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString276;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "Z")
	public static boolean aBoolean311 = false;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
	public static int anInt4472 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([Lclient!wf;ZIIII)V")
	public static void method3697(@OriginalArg(0) Class189[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(19) Class189 local19 = arg0[local7];
			if (local19 != null && local19.anInt5941 == arg3) {
				Static34.method526(arg1, arg2, local19, arg4);
				Static294.method3849(arg2, arg4, local19);
				if (local19.anInt5935 > local19.anInt5891 - local19.anInt5953) {
					local19.anInt5935 = local19.anInt5891 - local19.anInt5953;
				}
				if (local19.anInt5936 > local19.anInt5889 - local19.anInt5897) {
					local19.anInt5936 = local19.anInt5889 - local19.anInt5897;
				}
				if (local19.anInt5935 < 0) {
					local19.anInt5935 = 0;
				}
				if (local19.anInt5936 < 0) {
					local19.anInt5936 = 0;
				}
				if (local19.anInt5915 == 0) {
					Static272.method4288(arg1, local19);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)V")
	public static void method3698(@OriginalArg(1) int arg0) {
		Static216.anInt4216 = 100;
		Static145.anInt2853 = 3;
		Static81.anInt1874 = -1;
		Static204.anInt3920 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg0 && arg4 == arg5 && arg8 == arg2 && arg1 == arg6) {
			Static257.method4059(arg5, arg6, arg7, arg0, arg2);
			return;
		}
		@Pc(32) int local32 = arg0;
		@Pc(34) int local34 = arg5;
		@Pc(38) int local38 = arg0 * 3;
		@Pc(42) int local42 = arg4 * 3;
		@Pc(46) int local46 = arg3 * 3;
		@Pc(50) int local50 = arg8 * 3;
		@Pc(61) int local61 = arg2 + local46 - arg0 - local50;
		@Pc(65) int local65 = arg5 * 3;
		@Pc(75) int local75 = local38 + local50 - local46 - local46;
		@Pc(79) int local79 = arg1 * 3;
		@Pc(90) int local90 = local79 + local65 - local42 - local42;
		@Pc(100) int local100 = local42 + arg6 - arg5 - local79;
		@Pc(104) int local104 = local46 - local38;
		@Pc(108) int local108 = local42 - local65;
		for (@Pc(110) int local110 = 128; local110 <= 4096; local110 += 128) {
			@Pc(119) int local119 = local110 * local110 >> 12;
			@Pc(123) int local123 = local119 * local75;
			@Pc(129) int local129 = local110 * local119 >> 12;
			@Pc(133) int local133 = local129 * local61;
			@Pc(137) int local137 = local108 * local110;
			@Pc(141) int local141 = local90 * local119;
			@Pc(145) int local145 = local100 * local129;
			@Pc(149) int local149 = local104 * local110;
			@Pc(159) int local159 = (local149 + local123 + local133 >> 12) + arg0;
			@Pc(170) int local170 = (local137 + local145 + local141 >> 12) + arg5;
			Static257.method4059(local34, local170, arg7, local32, local159);
			local34 = local170;
			local32 = local159;
		}
	}
}
