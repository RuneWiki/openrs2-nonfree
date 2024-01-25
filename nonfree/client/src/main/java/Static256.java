import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static256 {

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_149 = new Class288(74, 28);

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "Lclient!bh;")
	public static final Class32 aClass32_44 = new Class32(260);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBI)Z")
	public static boolean method3530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}
}
