import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
	public static int anInt7379;

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
	public static int anInt7380;

	@OriginalMember(owner = "client!vf", name = "s", descriptor = "[[Lclient!tn;")
	public static Class229[][] aClass229ArrayArray2;

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_141 = new Class254(66, 2);

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BII[B)[B")
	public static byte[] method5697(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static459.method1552(arg1, arg0, local11, 0, 32768);
		return local11;
	}
}
