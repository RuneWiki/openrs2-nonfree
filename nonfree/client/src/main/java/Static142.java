import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "Lclient!fd;")
	public static Class73 aClass73_2;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	public static int anInt2934;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;")
	public static String[] method2449(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static52.method1200(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg1 != arg0.charAt(local25); local25++) {
			}
			local15[local17++] = arg0.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Lclient!et;")
	public static Class3_Sub3 method2451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class101 local7 = Static409.aClass101ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub3_1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIJBZ)Ljava/lang/String;")
	public static String method2452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(4) boolean arg3) {
		@Pc(12) char local12 = ',';
		@Pc(14) char local14 = '.';
		if (arg0 == 0) {
			local12 = '.';
			local14 = ',';
		}
		if (arg0 == 2) {
			local14 = ' ';
		}
		@Pc(29) boolean local29 = false;
		if (arg2 < 0L) {
			local29 = true;
			arg2 = -arg2;
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(26);
		@Pc(47) int local47;
		@Pc(52) int local52;
		if (arg1 > 0) {
			for (local47 = 0; local47 < arg1; local47++) {
				local52 = (int) arg2;
				arg2 /= 10L;
				local43.append((char) (local52 + 48 - (int) arg2 * 10));
			}
			local43.append(local12);
		}
		local47 = 0;
		while (true) {
			local52 = (int) arg2;
			arg2 /= 10L;
			local43.append((char) (local52 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local29) {
					local43.append('-');
				}
				return local43.reverse().toString();
			}
			if (arg3) {
				local47++;
				if (local47 % 3 == 0) {
					local43.append(local14);
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method2453() {
		Static79.aClass74_9.method1888();
	}
}
