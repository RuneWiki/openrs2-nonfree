import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
	public static int anInt3142;

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_64 = new Class83("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_65 = new Class83("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
	public static int anInt3147 = -1;

	@OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
	public static int anInt3148 = 503;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!iv;II)V")
	public static void method2669(@OriginalArg(0) Class4_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (Static394.aClass139_4 == null) {
			return;
		}
		try {
			Static394.aClass139_4.method3466(0L);
			Static394.aClass139_4.method3464(arg1, arg0.aByteArray36, 24);
		} catch (@Pc(18) Exception local18) {
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)V")
	public static void method2673(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static216.anInt4008 = arg0;
	}
}
