import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
	public static int anInt7392;

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "[I")
	public static final int[] anIntArray537 = new int[2048];

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
	public static int anInt7398 = 0;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BZIII)Lclient!lja;")
	public static Class14_Sub32 method5994(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class14_Sub32 local7 = new Class14_Sub32();
		local7.anInt6351 = arg2;
		local7.anInt6350 = arg3;
		Static547.aClass187_69.method4077((long) arg1, local7);
		Static6.method37(arg2);
		@Pc(26) Class230 local26 = Static655.method9094(arg1);
		if (local26 != null) {
			Static634.method8860(local26);
		}
		if (Static354.aClass230_5 != null) {
			Static634.method8860(Static354.aClass230_5);
			Static354.aClass230_5 = null;
		}
		Static494.method7325();
		if (local26 != null) {
			Static163.method2629(local26, !arg0);
		}
		if (!arg0) {
			Static632.method8837(arg2);
		}
		if (!arg0 && Static563.anInt9769 != -1) {
			Static233.method3542(Static563.anInt9769, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BIIII)V")
	public static void method5995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 != 8 && arg1 != 16) {
			@Pc(96) Class58 local96 = Static486.aClass58ArrayArrayArray2[arg0][arg2][arg3];
			if (local96 != null) {
				if (arg1 == 1) {
					local96.aShort23 = 0;
				} else if (arg1 == 2) {
					local96.aShort24 = 0;
				}
			}
			Static469.method9293();
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static297.anInt5234; local19++) {
			@Pc(25) Class296 local25 = Static505.aClass296Array2[local19];
			if (arg1 == local25.aByte130 && local25.aShort91 == arg2 && local25.aShort92 == arg3 || local25.aShort93 == arg2 && local25.aShort92 == arg3) {
				if (local19 != Static297.anInt5234) {
					Static681.method2481(Static505.aClass296Array2, local19 + 1, Static505.aClass296Array2, local19, Static505.aClass296Array2.length - local19 - 1);
				}
				Static297.anInt5234--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIII)I")
	public static int method6001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg5 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(14) int local14 = arg3;
			arg3 = arg4;
			arg4 = local14;
		}
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 + 1 - arg2 - arg3;
		} else {
			return 7 + 1 - arg0 - arg4;
		}
	}
}
