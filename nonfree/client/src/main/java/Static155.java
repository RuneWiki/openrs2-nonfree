import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!ep", name = "D", descriptor = "Lclient!nca;")
	public static Class254 aClass254_59;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!jb;B)I")
	public static int method2223(@OriginalArg(0) Class2_Sub6_Sub7 arg0) {
		@Pc(15) String local15 = Static370.method3242(arg0);
		return Static277.aClass289_8.method6930(local15, Static467.aClass43Array17);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2226(@OriginalArg(0) String arg0) {
		Static296.method4163(0, "", arg0, 0, "", "");
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method2227(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < arg1; local20++) {
			@Pc(30) int local30 = arg2[local20 + arg0] & 0xFF;
			if (local30 != 0) {
				if (local30 >= 128 && local30 < 160) {
					@Pc(55) char local55 = Static456.aCharArray7[local30 - 128];
					if (local55 == '\u0000') {
						local55 = '?';
					}
					local30 = local55;
				}
				local8[local10++] = (char) local30;
			}
		}
		return new String(local8, 0, local10);
	}
}
