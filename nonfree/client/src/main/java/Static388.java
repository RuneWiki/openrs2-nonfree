import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
	public static int anInt7302;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)V")
	public static void method6214(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class6_Sub2_Sub9 local16 = Static144.method2332(6, arg0);
		local16.method3723();
		local16.anInt4294 = arg1;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IB)V")
	public static void method6215(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static627.aBooleanArray59[arg0]) {
			Static603.aClass353_129.method8421(arg0);
			Static605.aClass302ArrayArray4[arg0] = null;
			Static590.aClass302ArrayArray3[arg0] = null;
			Static627.aBooleanArray59[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "([B[BIIIIIII)V")
	public static void method6216(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = -(arg7 >> 2);
		@Pc(19) int local19 = -(arg7 & 0x3);
		for (@Pc(22) int local22 = -arg3; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local14; local26 < 0; local26++) {
				local30 = arg5++;
				arg0[local30] += arg1[arg4++];
				@Pc(42) int local42 = arg5++;
				arg0[local42] += arg1[arg4++];
				@Pc(54) int local54 = arg5++;
				arg0[local54] += arg1[arg4++];
				@Pc(66) int local66 = arg5++;
				arg0[local66] += arg1[arg4++];
			}
			for (@Pc(84) int local84 = local19; local84 < 0; local84++) {
				local30 = arg5++;
				arg0[local30] += arg1[arg4++];
			}
			arg4 += arg2;
			arg5 += arg6;
		}
	}
}
