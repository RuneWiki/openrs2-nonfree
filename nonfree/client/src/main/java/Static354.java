import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static354 {

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray75;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(III)Z")
	public static boolean method8517(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static460.method6620(arg0, arg1) || Static344.method5202(arg1, arg0);
	}
}
