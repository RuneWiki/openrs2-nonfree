import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "F")
	public static float aFloat200;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "Lclient!sl;")
	public static final Class222 aClass222_10 = new Class222("", 12);

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_171 = new Class81(27, 6);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBI)Z")
	public static boolean method5277(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(18) Class250 local18 = Static406.aClass150_3.method3508(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local18.method5586(arg0);
	}
}
