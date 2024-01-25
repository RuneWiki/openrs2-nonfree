import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static23 {

	@OriginalMember(owner = "client!ar", name = "x", descriptor = "I")
	public static int anInt8695;

	@OriginalMember(owner = "client!ar", name = "k", descriptor = "[C")
	public static final char[] aCharArray49 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)I")
	public static int method7118() {
		return 42;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IZI)Z")
	public static boolean method7120(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(IZI)Z")
	public static boolean method7129(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
