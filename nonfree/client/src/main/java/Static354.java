import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "Lclient!mo;")
	public static Class170 aClass170_2;

	@OriginalMember(owner = "client!rp", name = "u", descriptor = "I")
	public static int anInt5973;

	@OriginalMember(owner = "client!rp", name = "r", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_109 = new Class186(72, 10);

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!tq;I)V")
	public static void method4992(@OriginalArg(0) Class239 arg0) {
		if (arg0.anInt6475 == Static272.anInt4644) {
			Static194.aBooleanArray25[arg0.anInt6467] = true;
		}
	}

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "(I)V")
	public static void method4997() {
		Static416.anInt4773 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static362.aClass6_Sub15Array1[local9] = null;
			Static49.aByteArray15[local9] = 1;
			Static337.aClass2Array1[local9] = null;
		}
	}
}
