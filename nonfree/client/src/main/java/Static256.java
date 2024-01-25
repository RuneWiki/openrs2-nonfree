import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method3989(@OriginalArg(1) String arg0) {
		return Static547.method5858(arg0, 16);
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(IZ)Lclient!it;")
	public static Class2_Sub3_Sub8 method3992(@OriginalArg(0) int arg0) {
		@Pc(15) Class2_Sub3_Sub8 local15 = (Class2_Sub3_Sub8) Static358.aClass209_7.method4599((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static355.aClass259_113.method5985(0, arg0);
		if (local25 == null || local25.length <= 1) {
			return null;
		}
		try {
			local15 = Static352.method5249(local25);
		} catch (@Pc(39) Exception local39) {
			throw new RuntimeException(local39.getMessage() + " S: " + arg0);
		}
		Static358.aClass209_7.method4596(local15, (long) arg0);
		return local15;
	}
}
