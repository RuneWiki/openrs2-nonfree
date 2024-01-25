import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
	public static int anInt8406;

	@OriginalMember(owner = "client!ui", name = "D", descriptor = "F")
	public static float aFloat185;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "[I")
	public static final int[] anIntArray637 = new int[14];

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
	public static int anInt8399 = 0;

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
	public static int anInt8401 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	public static void method7042() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static252.aClass177Array1[local7] = null;
		}
		Static596.anInt9430 = 0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLjava/lang/String;BLjava/lang/String;)V")
	public static void method7048(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		Static354.aBoolean499 = arg0;
		Static412.aString100 = arg1;
		Static594.aString129 = arg2;
		if (!Static354.aBoolean499 && Static209.anInt8184 != 3 && (Static412.aString100.equals("") || Static594.aString129.equals(""))) {
			Static337.method5148(3);
			return;
		}
		Static447.aBoolean581 = false;
		if (Static209.anInt8184 != 1) {
			Static462.anInt7552 = -1;
			Static138.anInt2947 = 0;
		}
		Static337.method5148(-3);
		Static376.anInt6365 = 0;
		Static582.anInt9301 = 1;
		Static192.anInt3722 = 0;
	}
}
