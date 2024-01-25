import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static265 {

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_66 = new Class276(55, 2);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZI)Z")
	public static boolean method4659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII)Z")
	public static boolean method4661(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static329.method5691(arg1, arg0) | (arg0 & 0x60000) != 0 || Static251.method4498(arg0, arg1) || Static391.method6248(arg0, arg1);
	}
}
