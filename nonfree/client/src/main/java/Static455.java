import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static455 {

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
	public static int anInt8610;

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "F")
	public static float aFloat177;

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "Lclient!jaa;")
	public static Class3_Sub27_Sub1 aClass3_Sub27_Sub1_1;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_121 = new Class276(12, 0);

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_122 = new Class276(46, 14);

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_123 = new Class276(96, 6);

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
	public static int anInt8611 = 0;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZZZ)V")
	public static void method7048(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static195.anInt3800--;
			if (Static195.anInt3800 == 0) {
				Static373.anIntArray469 = null;
			}
		}
		if (arg1) {
			Static234.anInt4849--;
			if (Static234.anInt4849 == 0) {
				Static331.anIntArray442 = null;
			}
		}
	}
}
