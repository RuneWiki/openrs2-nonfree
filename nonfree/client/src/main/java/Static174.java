import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static174 {

	@OriginalMember(owner = "client!fv", name = "v", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!fv", name = "O", descriptor = "I")
	public static int anInt3061 = 0;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BJ)I")
	public static int method2856(@OriginalArg(1) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)V")
	public static void method2858() {
		Static201.method3062(-1, 255);
	}
}
