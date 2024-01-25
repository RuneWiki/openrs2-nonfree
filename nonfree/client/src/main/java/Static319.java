import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "Lclient!vi;")
	public static final Class256 aClass256_5 = new Class256("LIVE", 0);

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
	public static int anInt1887 = 0;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(II[B)[B")
	public static byte[] method1369(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[arg0];
		Static469.method6021(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZIIJ)Ljava/lang/String;")
	public static String method1370(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		@Pc(10) char local10 = ',';
		@Pc(12) char local12 = '.';
		if (arg2 == 0) {
			local12 = ',';
			local10 = '.';
		}
		if (arg2 == 2) {
			local12 = ' ';
		}
		@Pc(30) boolean local30 = false;
		if (arg3 < 0L) {
			local30 = true;
			arg3 = -arg3;
		}
		@Pc(46) StringBuffer local46 = new StringBuffer(26);
		@Pc(50) int local50;
		@Pc(54) int local54;
		if (arg0 > 0) {
			for (local50 = 0; local50 < arg0; local50++) {
				local54 = (int) arg3;
				arg3 /= 10L;
				local46.append((char) (local54 + 48 - (int) arg3 * 10));
			}
			local46.append(local10);
		}
		local50 = 0;
		while (true) {
			local54 = (int) arg3;
			arg3 /= 10L;
			local46.append((char) (local54 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local30) {
					local46.append('-');
				}
				return local46.reverse().toString();
			}
			if (arg1) {
				local50++;
				if (local50 % 3 == 0) {
					local46.append(local12);
				}
			}
		}
	}
}
