import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!as", name = "P", descriptor = "Lclient!dp;")
	public static Class53 aClass53_14;

	@OriginalMember(owner = "client!as", name = "J", descriptor = "I")
	public static int anInt278 = -1;

	@OriginalMember(owner = "client!as", name = "M", descriptor = "I")
	public static int anInt281 = 0;

	@OriginalMember(owner = "client!as", name = "W", descriptor = "I")
	public static int anInt290 = 0;

	@OriginalMember(owner = "client!as", name = "ab", descriptor = "Z")
	public static boolean aBoolean24 = false;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)I")
	public static int method271(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(CZ)Z")
	public static boolean method272(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(34) char[] local34 = Static240.aCharArray6;
			for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
				@Pc(42) char local42 = local34[local36];
				if (arg0 == local42) {
					return true;
				}
			}
		}
		return false;
	}
}
