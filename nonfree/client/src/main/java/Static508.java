import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static508 {

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
	public static int anInt9392;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "Lclient!fs;")
	public static final Class109 aClass109_7 = new Class109("LIVE", 0);

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "[C")
	public static final char[] aCharArray10 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IB)I")
	public static int method7618(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
