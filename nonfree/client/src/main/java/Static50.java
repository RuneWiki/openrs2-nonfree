import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_38 = new Class103(56, 11);

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Z")
	public static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_39 = new Class103(2, -1);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Z")
	public static boolean method826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
	public static void method828() {
		Static97.anIntArray122 = null;
		Static311.aBoolean612 = false;
		Static72.anIntArray65 = null;
		Static245.anIntArray293 = null;
		Static245.anIntArray294 = null;
		Static153.anIntArray178 = null;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([I[Ljava/lang/Object;III)V")
	public static void method829(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) int local20 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local20;
		@Pc(34) Object local34 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local34;
		@Pc(53) int local53 = ~local20 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg3; local55 < arg2; local55++) {
			if (arg0[local55] < local20 + (local53 & local55)) {
				@Pc(70) int local70 = arg0[local55];
				arg0[local55] = arg0[local16];
				arg0[local16] = local70;
				@Pc(84) Object local84 = arg1[local55];
				arg1[local55] = arg1[local16];
				arg1[local16++] = local84;
			}
		}
		arg0[arg2] = arg0[local16];
		arg0[local16] = local20;
		arg1[arg2] = arg1[local16];
		arg1[local16] = local34;
		method829(arg0, arg1, local16 - 1, arg3);
		method829(arg0, arg1, arg2, local16 + 1);
	}
}
