import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
	public static final int anInt8086 = 1337;

	@OriginalMember(owner = "client!sca", name = "j", descriptor = "F")
	public static float aFloat202 = 0.25F;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!ac;I)V")
	public static void method6500(@OriginalArg(0) Class1_Sub3 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static152.anInt2863; local7++) {
			@Pc(13) int local13 = arg0.method7971();
			@Pc(17) int local17 = arg0.method7945();
			if (local17 == 65535) {
				local17 = -1;
			}
			if (Static337.aClass248_Sub1Array2[local13] != null) {
				Static337.aClass248_Sub1Array2[local13].anInt8293 = local17;
			}
		}
	}
}
