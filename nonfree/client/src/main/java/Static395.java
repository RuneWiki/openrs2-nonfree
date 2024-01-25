import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString73 = null;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
	public static int anInt7584 = 0;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "Lclient!gfa;")
	public static final Class116 aClass116_7 = new Class116(9, 0, 4, 1);

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;CI)Ljava/lang/String;")
	public static String method6257(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = local8;
		@Pc(17) int local17 = local11 - 1;
		if (local17 != 0) {
			@Pc(24) int local24 = 0;
			while (true) {
				local24 = arg1.indexOf(13, local24);
				if (local24 < 0) {
					break;
				}
				local24++;
				local13 += local17;
			}
		}
		@Pc(46) StringBuffer local46 = new StringBuffer(local13);
		@Pc(48) int local48 = 0;
		while (true) {
			@Pc(53) int local53 = arg1.indexOf(13, local48);
			if (local53 < 0) {
				local46.append(arg1.substring(local48));
				return local46.toString();
			}
			local46.append(arg1.substring(local48, local53));
			local46.append(arg0);
			local48 = local53 + 1;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method6258(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(17) int local17 = arg1.indexOf(arg0); local17 != -1; local17 = arg1.indexOf(arg0, arg2.length() + local17)) {
			arg1 = arg1.substring(0, local17) + arg2 + arg1.substring(local17 + arg0.length());
		}
		return arg1;
	}
}
