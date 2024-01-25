import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!qq", name = "u", descriptor = "I")
	public static int anInt5192;

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
	public static int anInt5188 = 0;

	@OriginalMember(owner = "client!qq", name = "n", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)I")
	public static int method4511(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method4513(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static295.anInt5953; local11++) {
			if (arg0.equalsIgnoreCase(Static301.aStringArray36[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static127.aClass10_Sub1_Sub2_Sub2_1.aString152);
	}
}
