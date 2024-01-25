import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static193 {

	@OriginalMember(owner = "client!jp", name = "I", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!sp;B)Z")
	public static boolean method3034(@OriginalArg(0) Class219 arg0) {
		return Static53.aClass219_1 == arg0 || arg0 == Static217.aClass219_3 || arg0 == Static420.aClass219_7 || arg0 == Static229.aClass219_4;
	}
}
