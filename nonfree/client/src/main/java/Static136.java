import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!es", name = "m", descriptor = "D")
	public static double aDouble6;

	@OriginalMember(owner = "client!es", name = "c", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_31 = new Class94(6, -1);

	@OriginalMember(owner = "client!es", name = "n", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_32 = new Class94(64, -1);

	@OriginalMember(owner = "client!es", name = "s", descriptor = "[J")
	public static final long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZIJI)Ljava/lang/String;")
	public static String method3074(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(27) boolean local27 = false;
		if (arg3 < 0L) {
			arg3 = -arg3;
			local27 = true;
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(26);
		@Pc(50) int local50;
		@Pc(55) int local55;
		if (arg0 > 0) {
			for (local50 = 0; local50 < arg0; local50++) {
				local55 = (int) arg3;
				arg3 /= 10L;
				local43.append((char) (local55 + 48 - (int) arg3 * 10));
			}
			local43.append(local7);
		}
		local50 = 0;
		while (true) {
			local55 = (int) arg3;
			arg3 /= 10L;
			local43.append((char) (local55 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local27) {
					local43.append('-');
				}
				return local43.reverse().toString();
			}
			if (arg1) {
				local50++;
				if (local50 % 3 == 0) {
					local43.append(local9);
				}
			}
		}
	}
}
