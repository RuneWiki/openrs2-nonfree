import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static452 {

	@OriginalMember(owner = "client!pca", name = "q", descriptor = "I")
	public static int anInt7275 = -1;

	@OriginalMember(owner = "client!pca", name = "u", descriptor = "J")
	public static long aLong201 = 0L;

	@OriginalMember(owner = "client!pca", name = "w", descriptor = "Z")
	public static boolean aBoolean521 = false;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BII)Z")
	public static boolean method6106(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static512.method6691(arg0, arg1) | (arg0 & 0x60000) != 0 || Static506.method6604(arg1, arg0) || Static193.method2999(arg0, arg1);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)Z")
	public static boolean method6107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
