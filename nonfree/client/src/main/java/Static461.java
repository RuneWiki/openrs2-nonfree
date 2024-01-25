import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_106 = new Class173(10, 3);

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "[I")
	public static final int[] anIntArray470 = new int[14];

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZIJI)Ljava/lang/String;")
	public static String method7018(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg3 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg3 == 2) {
			local9 = ' ';
		}
		@Pc(37) boolean local37 = false;
		if (arg2 < 0L) {
			arg2 = -arg2;
			local37 = true;
		}
		@Pc(51) StringBuffer local51 = new StringBuffer(26);
		@Pc(55) int local55;
		@Pc(60) int local60;
		if (arg1 > 0) {
			for (local55 = 0; local55 < arg1; local55++) {
				local60 = (int) arg2;
				arg2 /= 10L;
				local51.append((char) (local60 + 48 - (int) arg2 * 10));
			}
			local51.append(local7);
		}
		local55 = 0;
		while (true) {
			local60 = (int) arg2;
			arg2 /= 10L;
			local51.append((char) (local60 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local37) {
					local51.append('-');
				}
				return local51.reverse().toString();
			}
			if (arg0) {
				local55++;
				if (local55 % 3 == 0) {
					local51.append(local9);
				}
			}
		}
	}
}
