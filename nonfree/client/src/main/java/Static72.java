import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static72 {

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
	public static int anInt1376;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
	public static int anInt1377;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "Lclient!dq;")
	public static final Class54 aClass54_1 = new Class54(100);

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "S")
	public static short aShort6 = 256;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!uq;I)V")
	public static void method1113(@OriginalArg(0) Class10_Sub6 arg0) {
		arg0.aClass67_Sub3_Sub3_1 = null;
		if (Static16.anInt275 < 20) {
			Static29.aClass210_1.method5612(arg0);
			Static16.anInt275++;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)I")
	public static int method1115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
