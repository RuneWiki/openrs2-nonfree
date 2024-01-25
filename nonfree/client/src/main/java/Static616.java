import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static616 {

	@OriginalMember(owner = "client!tia", name = "F", descriptor = "I")
	public static int anInt9968;

	@OriginalMember(owner = "client!tia", name = "J", descriptor = "F")
	public static float aFloat185;

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(ZII)Z")
	public static boolean method8388(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!tia", name = "e", descriptor = "(I)V")
	public static void method8389() {
		if (Static319.anInt10907 == 10) {
			Static319.anInt10907 = 11;
		}
	}
}
