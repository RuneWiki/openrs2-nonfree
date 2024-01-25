import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static390 {

	@OriginalMember(owner = "client!ng", name = "z", descriptor = "Lclient!ae;")
	public static Class8 aClass8_101;

	@OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
	public static int anInt6562;

	@OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
	public static int anInt6563;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "[I")
	public static final int[] anIntArray415 = new int[8];

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "Lclient!tq;")
	public static final Class342 aClass342_5 = new Class342();

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_95 = new Class289(17, 2);

	@OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
	public static int anInt6561 = -1;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)I")
	public static int method5562(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(B)Z")
	public static boolean method5563() {
		return Static183.anInt3155 > 0;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(III)Z")
	public static boolean method5564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
