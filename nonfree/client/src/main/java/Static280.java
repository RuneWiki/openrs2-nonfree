import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_51 = new Class257(19, -1);

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
	public static int anInt5800 = -1;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!ig;I)V")
	public static void method4737(@OriginalArg(0) Class8_Sub8 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static493.anInt8729; local7++) {
			@Pc(13) int local13 = arg0.method8565();
			@Pc(19) int local19 = arg0.method8578();
			if (local19 == 65535) {
				local19 = -1;
			}
			if (Static364.aClass98_Sub1Array2[local13] != null) {
				Static364.aClass98_Sub1Array2[local13].anInt3674 = local19;
			}
		}
	}
}
