import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
	public static int anInt5424;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "Lclient!fg;")
	public static Class95 aClass95_1;

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "S")
	public static short aShort65 = 256;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
	public static void method4683() {
		if (Static294.anInterface12Array1 == null) {
			return;
		}
		@Pc(5) Interface12[] local5 = Static294.anInterface12Array1;
		for (@Pc(7) int local7 = 0; local7 < local5.length; local7++) {
			@Pc(13) Interface12 local13 = local5[local7];
			local13.method5729();
		}
	}
}
