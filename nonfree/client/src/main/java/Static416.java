import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static416 {

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "Lclient!pl;")
	public static Class250 aClass250_1;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
	public static int anInt7784;

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
	public static int anInt7781 = 0;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean570 = false;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "Lclient!kba;")
	public static final Class176 aClass176_1 = Static327.method5257();

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
	public static int anInt7786 = 0;

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_87 = new Class181(22, 0);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLclient!cea;)I")
	public static int method6499(@OriginalArg(1) Class50 arg0) {
		if (arg0 == Static503.aClass50_4) {
			return 5890;
		} else if (Static237.aClass50_3 == arg0) {
			return 34167;
		} else if (arg0 == Static49.aClass50_1) {
			return 34168;
		} else if (Static140.aClass50_2 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
