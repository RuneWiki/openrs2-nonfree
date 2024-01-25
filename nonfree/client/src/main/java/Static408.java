import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "[I")
	public static final int[] anIntArray247 = new int[4096];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)Z")
	public static boolean method2560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x40000) != 0 | Static331.method4765(arg1, arg0) || Static540.method7100(arg0, arg1);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2561(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = local8;
		@Pc(17) int local17 = local11 - 1;
		if (local17 != 0) {
			@Pc(21) int local21 = 0;
			while (true) {
				local21 = arg0.indexOf(13, local21);
				if (local21 < 0) {
					break;
				}
				local13 += local17;
				local21++;
			}
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(local13);
		@Pc(45) int local45 = 0;
		while (true) {
			@Pc(50) int local50 = arg0.indexOf(13, local45);
			if (local50 < 0) {
				local43.append(arg0.substring(local45));
				return local43.toString();
			}
			local43.append(arg0.substring(local45, local50));
			local45 = local50 + 1;
			local43.append(arg1);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI[B)[B")
	public static byte[] method2562(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[arg0];
		Static598.method4261(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
