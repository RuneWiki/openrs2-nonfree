import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static495 {

	@OriginalMember(owner = "client!qv", name = "s", descriptor = "I")
	public static final int anInt8274 = 4;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IC)Z")
	public static boolean method7131(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
