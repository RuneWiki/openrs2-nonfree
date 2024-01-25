import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4494(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		while (local28 < local31 && Static639.method8741(arg0.charAt(local28))) {
			local28++;
		}
		while (local31 > local28 && Static639.method8741(arg0.charAt(local31 - 1))) {
			local31--;
		}
		@Pc(70) int local70 = local31 - local28;
		if (local70 < 1 || local70 > 12) {
			return null;
		}
		@Pc(85) StringBuffer local85 = new StringBuffer(local70);
		for (@Pc(87) int local87 = local28; local87 < local31; local87++) {
			@Pc(93) char local93 = arg0.charAt(local87);
			if (Static164.method9059(local93)) {
				@Pc(101) char local101 = Static165.method2359(local93);
				if (local101 != '\u0000') {
					local85.append(local101);
				}
			}
		}
		if (local85.length() == 0) {
			return null;
		} else {
			return local85.toString();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "([III[FIIIII[FB[II)V")
	public static void method4495(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float[] arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11) {
		@Pc(19) int local19 = arg5 * arg11 + arg6;
		@Pc(26) int local26 = arg1 * arg7 + arg2;
		@Pc(30) int local30 = arg5 - arg8;
		@Pc(35) int local35 = arg1 - arg8;
		@Pc(39) int local39;
		@Pc(45) int local45;
		if (arg0 == null) {
			for (local39 = 0; local39 < arg4; local39++) {
				local45 = arg8 + local19;
				while (local45 > local19) {
					arg9[local26++] = arg3[local19++];
				}
				local19 += local30;
				local26 += local35;
			}
		} else if (arg3 == null) {
			for (local39 = 0; local39 < arg4; local39++) {
				local45 = arg8 + local19;
				while (local45 > local19) {
					arg10[local26++] = arg0[local19++];
				}
				local26 += local35;
				local19 += local30;
			}
		} else {
			for (local39 = 0; local39 < arg4; local39++) {
				local45 = arg8 + local19;
				while (local45 > local19) {
					arg10[local26] = arg0[local19];
					arg9[local26++] = arg3[local19++];
				}
				local19 += local30;
				local26 += local35;
			}
		}
	}
}
