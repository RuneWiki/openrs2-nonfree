import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static154 {

	@OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
	public static int anInt2804;

	@OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
	public static int anInt2803 = -1;

	@OriginalMember(owner = "client!hk", name = "N", descriptor = "Lclient!la;")
	public static final Class136 aClass136_74 = new Class136(36, -2);

	@OriginalMember(owner = "client!hk", name = "O", descriptor = "Lclient!iv;")
	public static Class113 aClass113_3 = null;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)Z")
	public static boolean method2395(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static432.method5866(arg1, arg0) | (arg0 & 0x70000) != 0 || Static314.method4404(arg0, arg1);
	}
}
