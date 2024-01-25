import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray15;

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
	public static int anInt2196;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIILclient!um;ZI)V")
	public static void method1752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class243 arg2) {
		Static340.anInt5517 = 10000;
		Static199.aClass243_113 = arg2;
		Static216.anInt3609 = arg0;
		Static215.anInt3592 = 0;
		Static178.anInt5791 = arg1;
		Static223.anInt3720 = 1;
		Static151.aBoolean499 = false;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II[B[BIBIII)V")
	public static void method1753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(18) int local18 = -(arg0 >> 2);
		@Pc(23) int local23 = -(arg0 & 0x3);
		for (@Pc(26) int local26 = -arg6; local26 < 0; local26++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local18; local30 < 0; local30++) {
				local34 = arg1++;
				arg2[local34] += arg3[arg7++];
				@Pc(46) int local46 = arg1++;
				arg2[local46] += arg3[arg7++];
				@Pc(58) int local58 = arg1++;
				arg2[local58] += arg3[arg7++];
				@Pc(70) int local70 = arg1++;
				arg2[local70] += arg3[arg7++];
			}
			for (@Pc(88) int local88 = local23; local88 < 0; local88++) {
				local34 = arg1++;
				arg2[local34] += arg3[arg7++];
			}
			arg7 += arg5;
			arg1 += arg4;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZZ)Z")
	public static boolean method1754(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!um;)V")
	public static void method1756(@OriginalArg(1) Class243 arg0) {
		Static280.aClass243_153 = arg0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)Z")
	public static boolean method1757(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 6 || arg0 == 9;
	}
}
