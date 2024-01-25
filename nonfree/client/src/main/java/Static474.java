import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static474 {

	@OriginalMember(owner = "client!qw", name = "z", descriptor = "I")
	public static int anInt8886;

	@OriginalMember(owner = "client!qw", name = "I", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread5;

	@OriginalMember(owner = "client!qw", name = "M", descriptor = "Lclient!in;")
	public static Class157 aClass157_237;

	@OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
	public static int anInt8881 = 0;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V")
	public static void method7454(@OriginalArg(0) int arg0) {
		Static261.anInt5567 = arg0;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(BLclient!sia;)I")
	public static int method7457(@OriginalArg(1) Class315 arg0) {
		if (arg0 == Static492.aClass315_4) {
			return 7681;
		} else if (Static425.aClass315_3 == arg0) {
			return 8448;
		} else if (arg0 == Static542.aClass315_5) {
			return 34165;
		} else if (Static361.aClass315_2 == arg0) {
			return 260;
		} else if (arg0 == Static176.aClass315_1) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
