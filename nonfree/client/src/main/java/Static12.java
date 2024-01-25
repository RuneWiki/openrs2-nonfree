import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static12 {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "F")
	public static float aFloat199;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "Lclient!dba;")
	public static final Class74 aClass74_21 = new Class74(13, 4);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
	public static void method8633() {
		if (Static539.anInt8853 == 3) {
			Static42.method560(4);
		} else if (Static539.anInt8853 == 7) {
			Static42.method560(8);
		} else if (Static539.anInt8853 == 10) {
			Static42.method560(11);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZZ)Z")
	public static boolean method8635(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
