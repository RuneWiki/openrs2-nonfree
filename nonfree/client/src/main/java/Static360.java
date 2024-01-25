import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static360 {

	@OriginalMember(owner = "client!no", name = "cc", descriptor = "I")
	public static int anInt6332;

	@OriginalMember(owner = "client!no", name = "Gc", descriptor = "I")
	public static int anInt6361;

	@OriginalMember(owner = "client!no", name = "Uc", descriptor = "I")
	public static int anInt6375;

	@OriginalMember(owner = "client!no", name = "Qd", descriptor = "Lclient!bi;")
	public static Class31 aClass31_78;

	@OriginalMember(owner = "client!no", name = "Ad", descriptor = "[I")
	public static final int[] anIntArray514 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!no", name = "e", descriptor = "(III)Z")
	public static boolean method5416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
