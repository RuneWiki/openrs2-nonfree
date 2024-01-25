import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
	public static int anInt1604;

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_32 = new Class133(60, -1);

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BC)C")
	public static char method1460(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(II[BIIIIB[B)V")
	public static void method1462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg5 >> 2);
		@Pc(15) int local15 = -(arg5 & 0x3);
		for (@Pc(18) int local18 = -arg4; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg6++;
				arg7[local26] += arg2[arg1++];
				@Pc(38) int local38 = arg6++;
				arg7[local38] += arg2[arg1++];
				@Pc(50) int local50 = arg6++;
				arg7[local50] += arg2[arg1++];
				@Pc(62) int local62 = arg6++;
				arg7[local62] += arg2[arg1++];
			}
			for (@Pc(77) int local77 = local15; local77 < 0; local77++) {
				local26 = arg6++;
				arg7[local26] += arg2[arg1++];
			}
			arg6 += arg0;
			arg1 += arg3;
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(III)Lclient!hh;")
	public static Class6_Sub3 method1464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class290 local7 = Static279.aClass290ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null || local7.aClass6_Sub3_2 == null ? null : local7.aClass6_Sub3_2;
	}
}
