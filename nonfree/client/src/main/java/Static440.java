import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static440 {

	@OriginalMember(owner = "client!rea", name = "E", descriptor = "I")
	public static int anInt8039;

	@OriginalMember(owner = "client!rea", name = "F", descriptor = "I")
	public static int anInt8040 = -1;

	@OriginalMember(owner = "client!rea", name = "h", descriptor = "(I)Z")
	public static boolean method6724() {
		return Static302.aBoolean510;
	}

	@OriginalMember(owner = "client!rea", name = "i", descriptor = "(I)V")
	public static void method6725() {
		Static52.aClass305_9.method7440();
		Static121.aClass305_16.method7440();
	}

	@OriginalMember(owner = "client!rea", name = "e", descriptor = "(III)Z")
	public static boolean method6726(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZI)V")
	public static void method6727(@OriginalArg(0) boolean arg0) {
		if (Static466.aString103.length() == 0) {
			return;
		}
		Static280.method3700("--> " + Static466.aString103);
		Static27.method980(arg0, false, Static466.aString103);
		Static466.aString103 = "";
		Static342.anInt6342 = 0;
		Static43.anInt1259 = 0;
	}
}
