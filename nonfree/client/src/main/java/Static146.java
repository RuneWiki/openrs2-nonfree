import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!js", name = "m", descriptor = "[I")
	public static int[] anIntArray446;

	@OriginalMember(owner = "client!js", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString181 = "wave:";

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([JII[II)V")
	public static void method4164(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(20) int local20 = (arg3 + arg1) / 2;
		@Pc(22) int local22 = arg3;
		@Pc(26) long local26 = arg0[local20];
		arg0[local20] = arg0[arg1];
		arg0[arg1] = local26;
		@Pc(40) int local40 = arg2[local20];
		arg2[local20] = arg2[arg1];
		arg2[arg1] = local40;
		for (@Pc(52) int local52 = arg3; local52 < arg1; local52++) {
			if (arg0[local52] < local26 + (long) (local52 & 0x1)) {
				@Pc(69) long local69 = arg0[local52];
				arg0[local52] = arg0[local22];
				arg0[local22] = local69;
				@Pc(83) int local83 = arg2[local52];
				arg2[local52] = arg2[local22];
				arg2[local22++] = local83;
			}
		}
		arg0[arg1] = arg0[local22];
		arg0[local22] = local26;
		arg2[arg1] = arg2[local22];
		arg2[local22] = local40;
		method4164(arg0, local22 - 1, arg2, arg3);
		method4164(arg0, arg1, arg2, local22 + 1);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IZIII)V")
	public static void method4165(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static119.aLong56 = 0L;
		@Pc(14) int local14 = Static151.method2632();
		if (arg0 == 3 || local14 == 3) {
			arg1 = true;
		}
		if (!Static217.aClass105_5.method4254()) {
			arg1 = true;
		}
		Static163.method2867(arg3, arg2, local14, arg0, arg1);
	}

	@OriginalMember(owner = "client!js", name = "f", descriptor = "(I)V")
	public static void method4166() {
		@Pc(1) Class37 local1 = Static128.aClass37_56;
		synchronized (Static128.aClass37_56) {
			Static128.aClass37_56.method919();
		}
		local1 = Static53.aClass37_25;
		synchronized (Static53.aClass37_25) {
			Static53.aClass37_25.method919();
		}
		local1 = Static354.aClass37_112;
		synchronized (Static354.aClass37_112) {
			Static354.aClass37_112.method919();
		}
		local1 = Static79.aClass37_109;
		synchronized (Static79.aClass37_109) {
			Static79.aClass37_109.method919();
		}
	}
}
