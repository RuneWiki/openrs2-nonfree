import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ai", name = "C", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_5 = new Class144(61, 18);

	@OriginalMember(owner = "client!ai", name = "z", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_11 = new Class397(44, -2);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[IIIIIII)Z")
	public static boolean method556(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (arg5 > Static587.anInt8944) {
			arg5 = Static587.anInt8944;
		}
		if (arg5 <= arg3) {
			return true;
		}
		@Pc(32) int local32 = arg5 - arg3 >> 2;
		arg4 += arg2 * arg3;
		arg0 += arg3 - 1;
		@Pc(56) int local56;
		@Pc(58) int local58;
		@Pc(72) int local72;
		if (Static245.anInt3870 == 1) {
			Static532.anInt8283 += local32;
			while (true) {
				local32--;
				if (local32 < 0) {
					local32 = arg5 - arg3 & 0x3;
					while (true) {
						local32--;
						if (local32 < 0) {
							return true;
						}
						arg0++;
						if (arg4 < arg1[arg0]) {
							arg1[arg0] = arg4;
						}
						arg4 += arg2;
					}
				}
				local58 = arg0 + 1;
				if (arg1[local58] > arg4) {
					arg1[local58] = arg4;
				}
				local72 = arg4 + arg2;
				local56 = ~local72;
				local58++;
				if (local56 > ~arg1[local58]) {
					arg1[local58] = local72;
				}
				local72 += arg2;
				local58++;
				if (local72 < arg1[local58]) {
					arg1[local58] = local72;
				}
				local72 += arg2;
				arg0 = local58 + 1;
				if (arg1[arg0] > local72) {
					arg1[arg0] = local72;
				}
				arg4 = local72 + arg2;
			}
		} else {
			arg4 -= 38400;
			while (true) {
				local32--;
				if (local32 < 0) {
					local32 = arg5 - arg3 & 0x3;
					while (true) {
						local32--;
						if (local32 < 0) {
							return true;
						}
						arg0++;
						if (arg1[arg0] > arg4) {
							return false;
						}
						arg4 += arg2;
					}
				}
				local56 = ~arg4;
				local58 = arg0 + 1;
				if (local56 > ~arg1[local58]) {
					return false;
				}
				local72 = arg4 + arg2;
				local58++;
				if (local72 < arg1[local58]) {
					return false;
				}
				local72 += arg2;
				local58++;
				if (arg1[local58] > local72) {
					return false;
				}
				local72 += arg2;
				local56 = ~local72;
				arg0 = local58 + 1;
				if (local56 > ~arg1[arg0]) {
					return false;
				}
				arg4 = local72 + arg2;
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZJI)Ljava/lang/String;")
	public static String method557(@OriginalArg(2) long arg0, @OriginalArg(3) int arg1) {
		Static273.method3852(arg0);
		@Pc(10) Calendar local10 = Static280.aCalendar2;
		@Pc(28) int local28 = local10.get(5);
		@Pc(34) int local34 = local10.get(2) + 1;
		@Pc(38) int local38 = local10.get(1);
		@Pc(42) int local42 = local10.get(11);
		@Pc(46) int local46 = local10.get(12);
		return Integer.toString(local28 / 10) + local28 % 10 + "/" + local34 / 10 + local34 % 10 + "/" + local38 % 100 / 10 + local38 % 10 + " " + local42 / 10 + local42 % 10 + ":" + local46 / 10 + local46 % 10;
	}
}
