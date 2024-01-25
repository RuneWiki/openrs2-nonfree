import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static78 {

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "[Lclient!vk;")
	public static Class252[] aClass252Array5;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "Lclient!wc;")
	public static Class262 aClass262_8;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
	public static int anInt3512 = 0;

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
	public static int anInt3517 = 0;

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "I")
	public static int anInt3523 = -1;

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(IIB)B")
	public static byte method2856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
