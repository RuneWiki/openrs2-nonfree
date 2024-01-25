import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!is", name = "c", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_56 = new Class181(29, -1);

	@OriginalMember(owner = "client!is", name = "a", descriptor = "([B[BIIIIIII)V")
	public static void method4111(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg7++;
				arg0[local26] += arg1[arg4++];
				@Pc(38) int local38 = arg7++;
				arg0[local38] += arg1[arg4++];
				@Pc(50) int local50 = arg7++;
				arg0[local50] += arg1[arg4++];
				@Pc(62) int local62 = arg7++;
				arg0[local62] += arg1[arg4++];
			}
			for (@Pc(80) int local80 = local15; local80 < 0; local80++) {
				local26 = arg7++;
				arg0[local26] += arg1[arg4++];
			}
			arg7 += arg6;
			arg4 += arg2;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ZIILjava/lang/String;IZIJLjava/lang/String;II)V")
	public static void method4112(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static218.aBoolean366 && Static205.anInt4369 < 500) {
			@Pc(17) int local17 = arg9 == -1 ? Static530.anInt9191 : arg9;
			@Pc(36) Class6_Sub42 local36 = new Class6_Sub42(arg7, arg2, local17, arg8, arg1, arg6, arg3, arg5, arg4, arg0);
			Static207.aClass211_29.method5173(local36);
			Static205.anInt4369++;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BI)I")
	public static int method4115(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
