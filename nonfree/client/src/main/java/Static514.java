import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "Lclient!eq;")
	public static final Class99 aClass99_71 = new Class99(512);

	@OriginalMember(owner = "client!sga", name = "f", descriptor = "I")
	public static int anInt9425 = 64;

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IZ)V")
	public static void method7843(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static555.anInt9950;
		@Pc(7) int local7 = Static476.anInt8913;
		if (arg0 && Static639.aBoolean753) {
			local5 <<= 0x1;
			local7 = -local5;
		}
		Static186.aClass20_4.f(local7, local5);
	}
}
