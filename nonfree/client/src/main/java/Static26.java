import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(II)V")
	public static void method712(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static305.anInt5572 = arg0;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)V")
	public static void method713() {
		Static137.aClass229_23 = new Class229();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([JZ[I)V")
	public static void method714(@OriginalArg(0) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static10.method245(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIII)V")
	public static void method716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg3 - arg4;
		@Pc(15) int local15 = arg2 - arg0;
		if (local15 == 0) {
			if (local10 != 0) {
				Static355.method5027(arg4, arg0, arg3, arg1);
			}
		} else if (local10 == 0) {
			Static275.method4097(arg4, arg1, arg2, arg0);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(69) boolean local69 = local10 > local15;
			@Pc(73) int local73;
			@Pc(77) int local77;
			if (local69) {
				local73 = arg0;
				arg0 = arg4;
				local77 = arg2;
				arg4 = local73;
				arg2 = arg3;
				arg3 = local77;
			}
			if (arg2 < arg0) {
				local73 = arg0;
				arg0 = arg2;
				local77 = arg4;
				arg2 = local73;
				arg4 = arg3;
				arg3 = local77;
			}
			local73 = arg4;
			local77 = arg2 - arg0;
			@Pc(113) int local113 = arg3 - arg4;
			@Pc(118) int local118 = -(local77 >> 1);
			if (local113 < 0) {
				local113 = -local113;
			}
			@Pc(134) int local134 = arg4 < arg3 ? 1 : -1;
			@Pc(138) int local138;
			if (local69) {
				for (local138 = arg0; local138 <= arg2; local138++) {
					Static376.anIntArrayArray64[local138][local73] = arg1;
					local118 += local113;
					if (local118 > 0) {
						local73 += local134;
						local118 -= local77;
					}
				}
			} else {
				for (local138 = arg0; local138 <= arg2; local138++) {
					local118 += local113;
					Static376.anIntArrayArray64[local73][local138] = arg1;
					if (local118 > 0) {
						local118 -= local77;
						local73 += local134;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BB)C")
	public static char method717(@OriginalArg(0) byte arg0) {
		@Pc(15) int local15 = arg0 & 0xFF;
		if (local15 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local15, 16) + " provided");
		}
		if (local15 >= 128 && local15 < 160) {
			@Pc(44) char local44 = Static203.aCharArray7[local15 - 128];
			if (local44 == '\u0000') {
				local44 = '?';
			}
			local15 = local44;
		}
		return (char) local15;
	}
}
