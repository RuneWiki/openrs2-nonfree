import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "[I")
	public static int[] anIntArray19;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
	public static int anInt227;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_3 = new Class77(40, -1);

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
	public static void method352(@OriginalArg(1) int arg0) {
		Static288.anInt5602 = arg0;
		Static420.anInt7807 = -1;
		Static247.anInt5085 = 3;
		Static40.anInt812 = 100;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "([SI[Ljava/lang/String;)V")
	public static void method353(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static355.method5551(0, arg1.length - 1, arg1, arg0);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!an;B)I")
	public static int method354(@OriginalArg(0) Class16 arg0) {
		@Pc(11) int local11 = 0;
		if (arg0.method389(Static5.anInt73)) {
			local11++;
		}
		if (arg0.method389(Static214.anInt4675)) {
			local11++;
		}
		return local11;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II[BIIZI)Z")
	public static boolean method355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg3 + 7) / 8);
		@Pc(41) int local41 = -((arg4 + 8 - 1) / 8);
		for (@Pc(43) int local43 = local32; local43 < 0; local43++) {
			for (@Pc(47) int local47 = local41; local47 < 0; local47++) {
				if (arg2[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local19;
			if (arg2[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg0;
		}
		return false;
	}
}
