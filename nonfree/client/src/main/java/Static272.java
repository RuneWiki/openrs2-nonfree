import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static272 {

	@OriginalMember(owner = "client!iha", name = "Tb", descriptor = "Lclient!rb;")
	public static Class314 aClass314_7;

	@OriginalMember(owner = "client!iha", name = "pb", descriptor = "I")
	public static int anInt5005;

	@OriginalMember(owner = "client!iha", name = "mc", descriptor = "[I")
	public static final int[] anIntArray280 = new int[5];

	@OriginalMember(owner = "client!iha", name = "Xb", descriptor = "Z")
	public static boolean aBoolean432 = false;

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(BII)Z")
	public static boolean method4183(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
