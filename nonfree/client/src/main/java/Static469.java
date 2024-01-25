import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static469 {

	@OriginalMember(owner = "client!tm", name = "I", descriptor = "Lclient!kea;")
	public static Class161 aClass161_101;

	@OriginalMember(owner = "client!tm", name = "J", descriptor = "F")
	public static float aFloat248;

	@OriginalMember(owner = "client!tm", name = "E", descriptor = "[Lclient!gg;")
	public static final Class105[] aClass105Array1 = new Class105[6];

	@OriginalMember(owner = "client!tm", name = "S", descriptor = "I")
	public static int anInt8466 = -1;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)I")
	public static int method7006(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZ)Z")
	public static boolean method7007(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(IIB)Z")
	public static boolean method7009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}
}
