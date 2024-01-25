import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!vda", name = "o", descriptor = "Lclient!qca;")
	public static final Class271 aClass271_13 = new Class271(2, 4, 4, 0);

	@OriginalMember(owner = "client!vda", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray94 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZIIIJ)Ljava/lang/String;")
	public static String method8170(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		@Pc(15) char local15 = ',';
		@Pc(17) char local17 = '.';
		if (arg2 == 0) {
			local17 = ',';
			local15 = '.';
		}
		if (arg2 == 2) {
			local17 = ' ';
		}
		@Pc(32) boolean local32 = false;
		if (arg3 < 0L) {
			arg3 = -arg3;
			local32 = true;
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(26);
		@Pc(52) int local52;
		@Pc(56) int local56;
		if (arg1 > 0) {
			for (local52 = 0; local52 < arg1; local52++) {
				local56 = (int) arg3;
				arg3 /= 10L;
				local48.append((char) (local56 + 48 - (int) arg3 * 10));
			}
			local48.append(local15);
		}
		local52 = 0;
		while (true) {
			local56 = (int) arg3;
			arg3 /= 10L;
			local48.append((char) (local56 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local32) {
					local48.append('-');
				}
				return local48.reverse().toString();
			}
			if (arg0) {
				local52++;
				if (local52 % 3 == 0) {
					local48.append(local17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method8173(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			local18 = Static124.method2512(arg0.charAt(local20)) + (local18 << 5) - local18;
		}
		return local18;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!dm;II)I")
	public static int method8174(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		if (!Static69.method1332(arg0).method6407(arg1) && arg0.anObjectArray15 == null) {
			return -1;
		} else if (arg0.anIntArray180 == null || arg0.anIntArray180.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray180[arg1];
		}
	}
}
