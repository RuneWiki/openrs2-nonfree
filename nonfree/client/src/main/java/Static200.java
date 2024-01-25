import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
	public static int anInt3837;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "Lclient!bg;")
	public static Class22 aClass22_3;

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
	public static int anInt3843 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([FIIIIIIFFIIIF)V")
	public static void method3249(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float arg11) {
		@Pc(5) int local5 = arg2 - arg9;
		@Pc(9) int local9 = arg3 - arg4;
		@Pc(13) int local13 = arg10 - arg8;
		@Pc(38) float local38 = arg0[1] * (float) local13 + (float) local5 * arg0[0] + (float) local9 * arg0[2];
		@Pc(63) float local63 = arg0[4] * (float) local13 + arg0[3] * (float) local5 + arg0[5] * (float) local9;
		@Pc(84) float local84 = arg0[6] * (float) local5 + arg0[7] * (float) local13 + arg0[8] * (float) local9;
		@Pc(106) float local106;
		@Pc(100) float local100;
		if (arg1 == 0) {
			local100 = arg7 + 0.5F - local84;
			local106 = local38 + arg6 + 0.5F;
		} else if (arg1 == 1) {
			local100 = local84 + arg7 + 0.5F;
			local106 = local38 + arg6 + 0.5F;
		} else if (arg1 == 2) {
			local100 = arg11 + 0.5F - local63;
			local106 = arg6 + 0.5F - local38;
		} else if (arg1 == 3) {
			local106 = local38 + arg6 + 0.5F;
			local100 = arg11 + 0.5F - local63;
		} else if (arg1 == 4) {
			local106 = arg7 + local84 + 0.5F;
			local100 = arg11 + 0.5F - local63;
		} else {
			local100 = arg11 + 0.5F - local63;
			local106 = arg7 + 0.5F - local84;
		}
		@Pc(209) float local209;
		if (arg5 == 1) {
			local209 = local106;
			local106 = -local100;
			local100 = local209;
		} else if (arg5 == 2) {
			local100 = -local100;
			local106 = -local106;
		} else if (arg5 == 3) {
			local209 = local106;
			local106 = local100;
			local100 = -local209;
		}
		Static9.aFloat93 = local106;
		Static134.aFloat15 = local100;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3250(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			@Pc(19) char local19 = arg0.charAt(local10);
			if (local19 == '<' || local19 == '>') {
				local8 += 3;
			}
		}
		@Pc(45) StringBuffer local45 = new StringBuffer(local6 + local8);
		for (@Pc(47) int local47 = 0; local47 < local6; local47++) {
			@Pc(52) char local52 = arg0.charAt(local47);
			if (local52 == '<') {
				local45.append("<lt>");
			} else if (local52 == '>') {
				local45.append("<gt>");
			} else {
				local45.append(local52);
			}
		}
		return local45.toString();
	}
}
