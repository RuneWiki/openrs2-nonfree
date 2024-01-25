import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static279 {

	@OriginalMember(owner = "client!li", name = "o", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!an;I)V")
	public static void method4635(@OriginalArg(0) Class16 arg0) {
		Static323.aClass16_81 = arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)V")
	public static void method4637(@OriginalArg(0) boolean arg0) {
		if (Static21.aString93.length() == 0) {
			return;
		}
		Static479.method7197("--> " + Static21.aString93);
		Static351.method5495(arg0, Static21.aString93, false);
		Static21.aString93 = "";
		Static535.anInt9522 = 0;
		Static465.anInt8475 = 0;
	}
}
