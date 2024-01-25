import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "J")
	public static long aLong42;

	@OriginalMember(owner = "client!ei", name = "xb", descriptor = "Lclient!q;")
	public static Class93 aClass93_6;

	@OriginalMember(owner = "client!ei", name = "q", descriptor = "Lclient!dd;")
	public static final Class68 aClass68_3 = new Class68("runescape", 0);

	@OriginalMember(owner = "client!ei", name = "O", descriptor = "Lclient!bf;")
	public static final Class30 aClass30_1 = new Class30();

	@OriginalMember(owner = "client!ei", name = "kb", descriptor = "I")
	public static int anInt2172 = 0;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IJIIZ)Ljava/lang/String;")
	public static String method1948(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(25) boolean local25 = false;
		if (arg1 < 0L) {
			arg1 = -arg1;
			local25 = true;
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(26);
		@Pc(48) int local48;
		@Pc(53) int local53;
		if (arg0 > 0) {
			for (local48 = 0; local48 < arg0; local48++) {
				local53 = (int) arg1;
				arg1 /= 10L;
				local41.append((char) (local53 + 48 - (int) arg1 * 10));
			}
			local41.append(local7);
		}
		local48 = 0;
		while (true) {
			local53 = (int) arg1;
			arg1 /= 10L;
			local41.append((char) (local53 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local25) {
					local41.append('-');
				}
				return local41.reverse().toString();
			}
			if (arg3) {
				local48++;
				if (local48 % 3 == 0) {
					local41.append(local9);
				}
			}
		}
	}
}
