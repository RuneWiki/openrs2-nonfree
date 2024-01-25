import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static40 {

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "Lclient!fs;")
	public static Class84 aClass84_1;

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_22 = new Class209("K", "T", "K", "K");

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "S")
	public static short aShort2 = 256;

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
	public static int anInt754 = -60;

	@OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
	public static int anInt755 = -1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)[Lclient!rm;")
	public static Class216[] method644() {
		return new Class216[] { Static281.aClass216_16, Static80.aClass216_15, Static128.aClass216_8 };
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZI)Z")
	public static boolean method645(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static227.aByteArrayArrayArray8[1][arg1][arg0] & 0x2) != 0;
	}
}
