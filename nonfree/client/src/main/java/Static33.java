import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static33 {

	@OriginalMember(owner = "client!e", name = "q", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!e", name = "r", descriptor = "[B")
	public static byte[] aByteArray3 = new byte[520];

	@OriginalMember(owner = "client!e", name = "t", descriptor = "Lclient!ai;")
	private static Class6 aClass6_250 = Static38.method685("Close");

	@OriginalMember(owner = "client!e", name = "s", descriptor = "Lclient!ai;")
	public static Class6 aClass6_249 = aClass6_250;

	@OriginalMember(owner = "client!e", name = "u", descriptor = "Lclient!ai;")
	public static Class6 aClass6_251 = Static38.method685("(U2");

	@OriginalMember(owner = "client!e", name = "w", descriptor = "Lclient!ai;")
	public static Class6 aClass6_252 = Static38.method685("null");

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public static void method601() {
		aByteArray3 = null;
		aClass6_252 = null;
		aClass6_250 = null;
		aClass6_251 = null;
		aCRC32_1 = null;
		aClass6_249 = null;
	}
}
