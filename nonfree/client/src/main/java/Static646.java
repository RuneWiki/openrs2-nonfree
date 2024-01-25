import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static646 {

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "[I")
	public static int[] anIntArray479;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "Lclient!up;")
	public static final Class357 aClass357_6 = new Class357();

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_90 = new Class387(42, 7);

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_91 = new Class387(6, 8);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)I")
	public static int method7024(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(44) int local44 = (arg0 & 0x7F) * 96 >> 7;
			if (local44 < 2) {
				local44 = 2;
			} else if (local44 > 126) {
				local44 = 126;
			}
			return local44 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "([IIIZI)V")
	public static void method7025(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(18) int local18 = arg2 - 1;
		@Pc(22) int local22 = local18 - 7;
		while (local22 > arg1) {
			@Pc(26) int local26 = arg1 + 1;
			arg0[local26] = arg3;
			@Pc(31) int local31 = local26 + 1;
			arg0[local31] = arg3;
			@Pc(36) int local36 = local31 + 1;
			arg0[local36] = arg3;
			@Pc(41) int local41 = local36 + 1;
			arg0[local41] = arg3;
			@Pc(46) int local46 = local41 + 1;
			arg0[local46] = arg3;
			@Pc(51) int local51 = local46 + 1;
			arg0[local51] = arg3;
			@Pc(56) int local56 = local51 + 1;
			arg0[local56] = arg3;
			arg1 = local56 + 1;
			arg0[arg1] = arg3;
		}
		while (arg1 < local18) {
			arg1++;
			arg0[arg1] = arg3;
		}
	}
}
