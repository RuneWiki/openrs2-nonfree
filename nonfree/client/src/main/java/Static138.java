import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static138 {

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	public static int anInt8423;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)I")
	public static int method6950(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
