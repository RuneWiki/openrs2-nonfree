import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!uj", name = "N", descriptor = "I")
	public static int anInt6899;

	@OriginalMember(owner = "client!uj", name = "O", descriptor = "Lclient!qn;")
	public static Class211 aClass211_91;

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_244 = new Class56(60, 8);

	@OriginalMember(owner = "client!uj", name = "L", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_124 = new Class15("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!uj", name = "M", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_96 = new Class146(23, 7);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLclient!qn;)V")
	public static void method5547(@OriginalArg(1) Class211 arg0) {
		Static187.anInt3443 = arg0.method4384("titlebg");
		Static343.anInt5691 = arg0.method4384("logo");
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)S")
	public static short method5551(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(42) int local42 = local24 <= 64 ? local24 * local20 >> 7 : local20 * (127 - local24) >> 7;
		@Pc(46) int local46 = local42 + local24;
		@Pc(57) int local57;
		if (local46 == 0) {
			local57 = local42 << 1;
		} else {
			local57 = (local42 << 8) / local46;
		}
		return (short) (local57 >> 4 << 7 | local9 << 10 | local46);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([I[IIII)V")
	public static void method5552(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg2 + arg3) / 2;
		@Pc(17) int local17 = arg2;
		@Pc(21) int local21 = arg0[local15];
		arg0[local15] = arg0[arg3];
		arg0[arg3] = local21;
		@Pc(35) int local35 = arg1[local15];
		arg1[local15] = arg1[arg3];
		arg1[arg3] = local35;
		@Pc(52) int local52 = local21 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(54) int local54 = arg2; local54 < arg3; local54++) {
			if (arg0[local54] < (local52 & local54) + local21) {
				@Pc(73) int local73 = arg0[local54];
				arg0[local54] = arg0[local17];
				arg0[local17] = local73;
				@Pc(87) int local87 = arg1[local54];
				arg1[local54] = arg1[local17];
				arg1[local17++] = local87;
			}
		}
		arg0[arg3] = arg0[local17];
		arg0[local17] = local21;
		arg1[arg3] = arg1[local17];
		arg1[local17] = local35;
		method5552(arg0, arg1, arg2, local17 - 1);
		method5552(arg0, arg1, local17 + 1, arg3);
	}
}
