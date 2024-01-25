import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "Lclient!cr;")
	public static Class41 aClass41_8;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "Lclient!wl;")
	public static Class265 aClass265_30 = new Class265();

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	public static int anInt3900 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIJZ)Ljava/lang/String;")
	public static String method3139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(10) char local10 = '.';
		if (arg1 == 0) {
			local7 = '.';
			local10 = ',';
		}
		if (arg1 == 2) {
			local10 = ' ';
		}
		@Pc(26) boolean local26 = false;
		if (arg2 < 0L) {
			local26 = true;
			arg2 = -arg2;
		}
		@Pc(40) StringBuffer local40 = new StringBuffer(26);
		@Pc(47) int local47;
		@Pc(52) int local52;
		if (arg0 > 0) {
			for (local47 = 0; local47 < arg0; local47++) {
				local52 = (int) arg2;
				arg2 /= 10L;
				local40.append((char) (local52 + 48 - (int) arg2 * 10));
			}
			local40.append(local7);
		}
		local47 = 0;
		while (true) {
			local52 = (int) arg2;
			arg2 /= 10L;
			local40.append((char) (local52 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local26) {
					local40.append('-');
				}
				return local40.reverse().toString();
			}
			if (arg3) {
				local47++;
				if (local47 % 3 == 0) {
					local40.append(local10);
				}
			}
		}
	}
}
