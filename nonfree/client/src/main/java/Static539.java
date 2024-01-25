import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static539 {

	@OriginalMember(owner = "client!vda", name = "r", descriptor = "Lclient!vv;")
	public static Class339 aClass339_6;

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "Lclient!fv;")
	public static final Class112 aClass112_15 = new Class112(10, 2, 2, 0);

	@OriginalMember(owner = "client!vda", name = "m", descriptor = "I")
	public static int anInt9278 = 0;

	@OriginalMember(owner = "client!vda", name = "n", descriptor = "F")
	public static float aFloat193 = 1.0F;

	@OriginalMember(owner = "client!vda", name = "q", descriptor = "[I")
	public static final int[] anIntArray808 = new int[6];

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(III)Z")
	public static boolean method7769(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static356.aByteArrayArrayArray17[1][arg0][arg1] & 0x2) != 0;
	}
}
