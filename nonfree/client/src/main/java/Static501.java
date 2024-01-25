import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
	public static int anInt5842;

	@OriginalMember(owner = "client!pw", name = "m", descriptor = "[Lclient!nk;")
	public static final Class260[] aClass260Array4 = new Class260[37];

	@OriginalMember(owner = "client!pw", name = "o", descriptor = "Lclient!via;")
	public static final Class386 aClass386_8 = new Class386("LOCAL", "", "local", 4);

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIIZI)V")
	public static void method5233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(21) int local21 = arg4 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(51) int local51 = Static640.aShort126 + local21 * (Static135.aShort41 - Static640.aShort126) / 100;
		if (local51 < Static8.aShort1) {
			local51 = Static8.aShort1;
		} else if (local51 > Static353.aShort131) {
			local51 = Static353.aShort131;
		}
		@Pc(79) int local79 = local51 * 512 * arg4 / (arg2 * 334);
		@Pc(118) int local118;
		@Pc(125) int local125;
		@Pc(89) short local89;
		if (Static538.aShort115 > local79) {
			local89 = Static538.aShort115;
			local51 = arg2 * local89 * 334 / (arg4 * 512);
			if (Static353.aShort131 < local51) {
				local51 = Static353.aShort131;
				local118 = arg4 * local51 * 512 / (local89 * 334);
				local125 = (arg2 - local118) / 2;
				if (arg3) {
					Static396.aClass145_6.la();
					Static396.aClass145_6.method9637(local125, arg4, arg0, -16777216, arg1);
					Static396.aClass145_6.method9637(local125, arg4, arg0, -16777216, arg2 + arg1 - local125);
				}
				arg2 -= local125 * 2;
				arg1 += local125;
			}
		} else if (Static323.aShort61 < local79) {
			local89 = Static323.aShort61;
			local51 = arg2 * 334 * local89 / (arg4 * 512);
			if (local51 < Static8.aShort1) {
				local51 = Static8.aShort1;
				local118 = arg2 * local89 * 334 / (local51 * 512);
				local125 = (arg4 - local118) / 2;
				if (arg3) {
					Static396.aClass145_6.la();
					Static396.aClass145_6.method9637(arg2, local125, arg0, -16777216, arg1);
					Static396.aClass145_6.method9637(arg2, local125, arg4 + arg0 - local125, -16777216, arg1);
				}
				arg0 += local125;
				arg4 -= local125 * 2;
			}
		}
		Static537.anInt5294 = (short) arg4;
		Static497.anInt7958 = arg4 * local51 / 334;
		Static395.anInt6514 = (short) arg2;
		Static345.anInt5346 = arg1;
		Static630.anInt9743 = arg0;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(BC)Z")
	public static boolean method5236(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)I")
	public static int method5237() {
		return Static240.anInt10701 == 1 ? anInt5842 : Static482.anInt7726;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIII[[[BILclient!ha;IIIII)V")
	public static void method5238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class145 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg2 == 0 || arg9 == 0) {
			return;
		}
		if (arg2 == 9) {
			arg2 = 1;
			arg1 = arg1 + 1 & 0x3;
		}
		if (arg2 == 10) {
			arg1 = arg1 + 3 & 0x3;
			arg2 = 1;
		}
		if (arg2 == 11) {
			arg2 = 8;
			arg1 = arg1 + 3 & 0x3;
		}
		arg7.Q(arg8, arg4, arg10, arg3, arg6, arg0, arg5[arg2 - 1][arg1], arg9, arg11);
	}
}
