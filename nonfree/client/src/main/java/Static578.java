import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static578 {

	@OriginalMember(owner = "client!uia", name = "c", descriptor = "I")
	public static int anInt9504;

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_130 = new Class130(16, 6);

	@OriginalMember(owner = "client!uia", name = "e", descriptor = "Lclient!af;")
	public static final Class9 aClass9_5 = new Class9();

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(IC)Z")
	public static boolean method8187(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
