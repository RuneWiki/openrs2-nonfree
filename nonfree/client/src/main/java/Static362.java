import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!se", name = "o", descriptor = "I")
	public static int anInt6144;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_157 = new Class131(49, -1);

	@OriginalMember(owner = "client!se", name = "f", descriptor = "I")
	public static int anInt6137 = -1;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZJ)V")
	public static void method4955(@OriginalArg(1) long arg0) {
		Static232.aClass1_Sub1_Sub1_2.anInt5056 = 0;
		Static232.aClass1_Sub1_Sub1_2.method4115(Static20.aClass108_7.anInt2675);
		Static232.aClass1_Sub1_Sub1_2.method4107(arg0);
		Static423.anInt7327 = -3;
		Static402.anInt6944 = 1;
		Static53.anInt1070 = 0;
		Static148.anInt2522 = 0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZIILjava/lang/String;)Z")
	public static boolean method4956(@OriginalArg(3) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(71) int local71;
			if (local46 >= '0' && local46 <= '9') {
				local71 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local71 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local71 = local46 - 'W';
			} else {
				return false;
			}
			if (local71 >= 10) {
				return false;
			}
			if (local26) {
				local71 = -local71;
			}
			@Pc(116) int local116 = local35 * 10 + local71;
			if (local116 / 10 != local35) {
				return false;
			}
			local28 = true;
			local35 = local116;
		}
		return local28;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III[BII[BBI)V")
	public static void method4957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg5 >> 2);
		@Pc(15) int local15 = -(arg5 & 0x3);
		for (@Pc(18) int local18 = -arg1; local18 < 0; local18++) {
			@Pc(28) int local28;
			for (@Pc(24) int local24 = local10; local24 < 0; local24++) {
				local28 = arg2++;
				arg3[local28] += arg6[arg4++];
				@Pc(40) int local40 = arg2++;
				arg3[local40] += arg6[arg4++];
				@Pc(52) int local52 = arg2++;
				arg3[local52] += arg6[arg4++];
				@Pc(64) int local64 = arg2++;
				arg3[local64] += arg6[arg4++];
			}
			for (@Pc(79) int local79 = local15; local79 < 0; local79++) {
				local28 = arg2++;
				arg3[local28] += arg6[arg4++];
			}
			arg4 += arg0;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIII[B[B)V")
	public static void method4962(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(31) int local31 = -arg5; local31 < 0; local31++) {
			@Pc(39) int local39;
			for (@Pc(35) int local35 = local10; local35 < 0; local35++) {
				local39 = arg2++;
				arg6[local39] = (byte) (arg6[local39] - arg7[arg4++]);
				@Pc(52) int local52 = arg2++;
				arg6[local52] = (byte) (arg6[local52] - arg7[arg4++]);
				@Pc(65) int local65 = arg2++;
				arg6[local65] = (byte) (arg6[local65] - arg7[arg4++]);
				@Pc(78) int local78 = arg2++;
				arg6[local78] = (byte) (arg6[local78] - arg7[arg4++]);
			}
			for (@Pc(97) int local97 = local15; local97 < 0; local97++) {
				local39 = arg2++;
				arg6[local39] = (byte) (arg6[local39] - arg7[arg4++]);
			}
			arg4 += arg3;
			arg2 += arg0;
		}
	}
}
