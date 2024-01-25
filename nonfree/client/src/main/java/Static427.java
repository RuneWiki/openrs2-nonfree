import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static427 {

	@OriginalMember(owner = "client!qea", name = "A", descriptor = "Lclient!d;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!qea", name = "o", descriptor = "S")
	public static short aShort96 = 1;

	@OriginalMember(owner = "client!qea", name = "z", descriptor = "I")
	public static int anInt7126 = 0;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIB)Z")
	public static boolean method6070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)V")
	public static void method6071() {
		if (Static409.aClass221_6.aBoolean485 && Static551.aClass65_4.anInt2279 != -1) {
			Static19.method419(Static551.aClass65_4.anInt2279, Static551.aClass65_4.aString31);
		}
	}
}
