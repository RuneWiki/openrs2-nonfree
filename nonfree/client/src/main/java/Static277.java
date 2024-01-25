import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString38 = "";

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)I")
	public static int method4015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = 255 - arg1;
		@Pc(34) int local34 = ((arg2 & 0xFF00) * arg1 & 0xFF0000 | (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
		return local34 + (((arg0 & 0xFF00FF) * local16 & 0xFF00FF00 | (arg0 & 0xFF00) * local16 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZII)Z")
	public static boolean method4017(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class182 local13 = Static71.aClass105_6.method2336(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local13.method4384(arg1);
	}
}
