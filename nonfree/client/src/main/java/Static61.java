import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static61 {

	@OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
	public static int anInt1105;

	@OriginalMember(owner = "client!ct", name = "s", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_20 = new Class146(73, 3);

	@OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
	public static int anInt1104 = 0;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
	public static void method861() {
		Static451.anIntArray570 = Static419.method5189(0.4F);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)I")
	public static int method862(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
