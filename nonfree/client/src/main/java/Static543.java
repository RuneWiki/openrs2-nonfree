import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "Lclient!kr;")
	public static Class171 aClass171_154;

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
	public static int anInt9158 = 0;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I[FIIIIIFIIFIF)V")
	public static void method7536(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float arg11) {
		@Pc(5) int local5 = arg0 - arg10;
		@Pc(13) int local13 = arg8 - arg7;
		@Pc(17) int local17 = arg4 - arg5;
		@Pc(38) float local38 = arg1[0] * (float) local17 + (float) local5 * arg1[1] + (float) local13 * arg1[2];
		@Pc(59) float local59 = arg1[3] * (float) local17 + arg1[4] * (float) local5 + arg1[5] * (float) local13;
		@Pc(80) float local80 = (float) local13 * arg1[8] + arg1[6] * (float) local17 + (float) local5 * arg1[7];
		@Pc(109) float local109;
		@Pc(102) float local102;
		if (arg2 == 0) {
			local102 = arg11 + 0.5F - local80;
			local109 = local38 + arg9 + 0.5F;
		} else if (arg2 == 1) {
			local109 = local38 + arg9 + 0.5F;
			local102 = local80 + arg11 + 0.5F;
		} else if (arg2 == 2) {
			local102 = arg6 + 0.5F - local59;
			local109 = arg9 + 0.5F - local38;
		} else if (arg2 == 3) {
			local102 = arg6 + 0.5F - local59;
			local109 = arg9 + local38 + 0.5F;
		} else if (arg2 == 4) {
			local109 = local80 + arg11 + 0.5F;
			local102 = arg6 + 0.5F - local59;
		} else {
			local102 = arg6 + 0.5F - local59;
			local109 = arg11 + 0.5F - local80;
		}
		@Pc(209) float local209;
		if (arg3 == 1) {
			local209 = local109;
			local109 = -local102;
			local102 = local209;
		} else if (arg3 == 2) {
			local109 = -local109;
			local102 = -local102;
		} else if (arg3 == 3) {
			local209 = local109;
			local109 = local102;
			local102 = -local209;
		}
		Static368.aFloat140 = local102;
		Static433.aFloat145 = local109;
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)V")
	public static void method7538() {
		Static15.aBoolean16 = false;
		Static518.method7137(Static260.anInt5040, Static541.anInt9145, Static13.anInt305, Static188.anInt3359);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZLjava/lang/String;IB)I")
	public static int method7540(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		for (@Pc(41) int local41 = 0; local41 < local31; local41++) {
			@Pc(47) char local47 = arg0.charAt(local41);
			if (local41 == 0) {
				if (local47 == '-') {
					local24 = true;
					continue;
				}
				if (local47 == '+') {
					continue;
				}
			}
			@Pc(79) int local79;
			if (local47 >= '0' && local47 <= '9') {
				local79 = local47 - '0';
			} else if (local47 >= 'A' && local47 <= 'Z') {
				local79 = local47 - '7';
			} else if (local47 >= 'a' && local47 <= 'z') {
				local79 = local47 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local79 >= arg1) {
				throw new NumberFormatException();
			}
			if (local24) {
				local79 = -local79;
			}
			@Pc(128) int local128 = local28 * arg1 + local79;
			if (local28 != local128 / arg1) {
				throw new NumberFormatException();
			}
			local26 = true;
			local28 = local128;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local28;
	}
}
