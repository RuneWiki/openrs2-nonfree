import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static121 {

	@OriginalMember(owner = "client!eh", name = "ub", descriptor = "I")
	public static int anInt7255;

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString83 = null;

	@OriginalMember(owner = "client!eh", name = "w", descriptor = "Z")
	public static boolean aBoolean522 = false;

	@OriginalMember(owner = "client!eh", name = "db", descriptor = "I")
	public static int anInt7239 = 16777215;

	@OriginalMember(owner = "client!eh", name = "zb", descriptor = "I")
	public static int anInt7260 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Z")
	public static boolean method5991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static573.method7820(arg1, arg0) || Static270.method4371(arg1, arg0);
	}
}
