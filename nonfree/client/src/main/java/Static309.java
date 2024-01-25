import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!kha", name = "l", descriptor = "[S")
	public static short[] aShortArray79;

	@OriginalMember(owner = "client!kha", name = "k", descriptor = "I")
	public static int anInt5494;

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(ILclient!cn;)V")
	public static void method4714(@OriginalArg(1) Class73 arg0) {
		@Pc(12) Class73 local12 = Static446.method6636(arg0);
		@Pc(17) int local17;
		@Pc(20) int local20;
		if (local12 == null) {
			local20 = Static631.anInt10283;
			local17 = Static70.anInt1125;
		} else {
			local17 = local12.anInt1384;
			local20 = local12.anInt1394;
		}
		Static395.method5773(local17, arg0, false, local20);
		Static542.method7940(local17, local20, arg0);
	}
}
