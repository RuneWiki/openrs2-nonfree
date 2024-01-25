import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static664 {

	@OriginalMember(owner = "client!wi", name = "E", descriptor = "[I")
	public static int[] anIntArray938;

	@OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
	public static int anInt10591 = 0;

	@OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
	public static int anInt10594 = 100;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(Z)V")
	public static void method9172() {
		Static535.aClass179_4.method4563();
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(III)Z")
	public static boolean method9173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(BLjava/lang/String;)V")
	public static void method9175(@OriginalArg(1) String arg0) {
		Static450.method6577(0, "", "", arg0, 0, "");
	}
}
