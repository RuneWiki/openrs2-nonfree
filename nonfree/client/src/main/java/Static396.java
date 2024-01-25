import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray33;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "Lclient!wm;")
	public static Class390 aClass390_82;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "J")
	public static long aLong181 = 0L;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
	public static int anInt7026 = 1;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!mc;I)Lclient!ei;")
	public static Class100 method5822(@OriginalArg(0) Class5_Sub41 arg0) {
		@Pc(7) int local7 = arg0.method7804();
		return new Class100(local7);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZJB)Ljava/lang/String;")
	public static String method5827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		@Pc(5) char local5 = ',';
		@Pc(7) char local7 = '.';
		if (arg1 == 0) {
			local5 = '.';
			local7 = ',';
		}
		if (arg1 == 2) {
			local7 = ' ';
		}
		@Pc(22) boolean local22 = false;
		if (arg3 < 0L) {
			local22 = true;
			arg3 = -arg3;
		}
		@Pc(36) StringBuffer local36 = new StringBuffer(26);
		@Pc(40) int local40;
		@Pc(44) int local44;
		if (arg0 > 0) {
			for (local40 = 0; local40 < arg0; local40++) {
				local44 = (int) arg3;
				arg3 /= 10L;
				local36.append((char) (local44 + 48 - (int) arg3 * 10));
			}
			local36.append(local5);
		}
		local40 = 0;
		while (true) {
			local44 = (int) arg3;
			arg3 /= 10L;
			local36.append((char) (local44 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local22) {
					local36.append('-');
				}
				return local36.reverse().toString();
			}
			if (arg2) {
				local40++;
				if (local40 % 3 == 0) {
					local36.append(local7);
				}
			}
		}
	}
}
