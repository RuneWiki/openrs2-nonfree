import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray11;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
	public static int anInt1874 = 0;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
	public static int anInt1876 = 0;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "Z")
	public static boolean aBoolean106 = true;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([BI)[B")
	public static byte[] method1318(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static274.method2685(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIZJI)Ljava/lang/String;")
	public static String method1320(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = '.';
		@Pc(9) boolean local9 = false;
		if (arg2 < 0L) {
			local9 = true;
			arg2 = -arg2;
		}
		@Pc(25) char local25 = ',';
		if (arg0 == 0) {
			local7 = ',';
			local25 = '.';
		}
		if (arg0 == 2) {
			local7 = ' ';
		}
		@Pc(44) StringBuffer local44 = new StringBuffer(26);
		@Pc(48) int local48;
		@Pc(53) int local53;
		if (arg3 > 0) {
			for (local48 = 0; local48 < arg3; local48++) {
				local53 = (int) arg2;
				arg2 /= 10L;
				local44.append((char) (local53 + 48 - (int) arg2 * 10));
			}
			local44.append(local25);
		}
		local48 = 0;
		while (true) {
			local53 = (int) arg2;
			arg2 /= 10L;
			local44.append((char) (local53 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local9) {
					local44.append('-');
				}
				return local44.reverse().toString();
			}
			if (arg1) {
				local48++;
				if (local48 % 3 == 0) {
					local44.append(local7);
				}
			}
		}
	}
}
