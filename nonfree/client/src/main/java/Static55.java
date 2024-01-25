import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!bma", name = "l", descriptor = "I")
	public static int anInt908 = 0;

	@OriginalMember(owner = "client!bma", name = "a", descriptor = "(I)Z")
	public static boolean method715() {
		try {
			@Pc(7) Class306 local7 = new Class306();
			@Pc(12) byte[] local12 = local7.method7470(Static170.aByteArray16);
			Static141.method2358(local12);
			return true;
		} catch (@Pc(25) Exception local25) {
			return false;
		}
	}

	@OriginalMember(owner = "client!bma", name = "a", descriptor = "(BLclient!av;)Lclient!av;")
	public static Class20 method716(@OriginalArg(1) Class20 arg0) {
		if (arg0.anInt556 != -1) {
			return Static118.method2045(arg0.anInt556);
		}
		@Pc(20) int local20 = arg0.anInt600 >>> 16;
		@Pc(25) Class346 local25 = new Class346(Static170.aClass136_19);
		for (@Pc(39) Class3_Sub52 local39 = (Class3_Sub52) local25.method8213(); local39 != null; local39 = (Class3_Sub52) local25.method8215()) {
			if (local39.anInt10202 == local20) {
				return Static118.method2045((int) local39.aLong382);
			}
		}
		return null;
	}
}
