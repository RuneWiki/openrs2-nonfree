import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "([BI)V")
	public static void method7136(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class6_Sub8 local10 = new Class6_Sub8(arg0);
		while (true) {
			while (true) {
				@Pc(21) int local21 = local10.method8246();
				if (local21 == 0) {
					return;
				}
				if (local21 == 1) {
					@Pc(35) int[] local35 = Static103.anIntArray97 = new int[6];
					local35[0] = local10.method8220();
					local35[1] = local10.method8220();
					local35[2] = local10.method8220();
					local35[3] = local10.method8220();
					local35[4] = local10.method8220();
					local35[5] = local10.method8220();
				} else {
					@Pc(82) int local82;
					@Pc(87) int local87;
					if (local21 == 4) {
						local82 = local10.method8246();
						Static477.anIntArray433 = new int[local82];
						for (local87 = 0; local87 < local82; local87++) {
							Static477.anIntArray433[local87] = local10.method8220();
							if (Static477.anIntArray433[local87] == 65535) {
								Static477.anIntArray433[local87] = -1;
							}
						}
					} else if (local21 == 5) {
						local82 = local10.method8246();
						Static72.anIntArray80 = new int[local82];
						for (local87 = 0; local87 < local82; local87++) {
							Static72.anIntArray80[local87] = local10.method8220();
							if (Static72.anIntArray80[local87] == 65535) {
								Static72.anIntArray80[local87] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V")
	public static void method7137(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static326.anInt6465 = -1;
		Static554.anInt9496 = 1;
		Static581.method8051(false, arg1, arg0);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BII)Z")
	public static boolean method7138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static141.method2792(arg0, arg1) & Static272.method4854(arg0, arg1);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIIIILclient!ha;II[[[BII)V")
	public static void method7139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class5 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte[][][] arg10, @OriginalArg(11) int arg11) {
		if (arg5 == 0 || arg2 == 0) {
			return;
		}
		if (arg5 == 9) {
			arg0 = arg0 + 1 & 0x3;
			arg5 = 1;
		}
		if (arg5 == 10) {
			arg0 = arg0 + 3 & 0x3;
			arg5 = 1;
		}
		if (arg5 == 11) {
			arg0 = arg0 + 3 & 0x3;
			arg5 = 8;
		}
		arg7.Q(arg3, arg8, arg9, arg4, arg1, arg6, arg10[arg5 - 1][arg0], arg2, arg11);
	}
}
