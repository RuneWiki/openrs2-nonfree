import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!we", name = "r", descriptor = "I")
	public static int anInt5161;

	@OriginalMember(owner = "client!we", name = "s", descriptor = "[Lclient!vk;")
	public static Class252[] aClass252Array8;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Z")
	public static boolean aBoolean586 = true;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(CI)Z")
	public static boolean method4038(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static257.method3680(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static278.aCharArray6;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (arg0 == local26) {
					return true;
				}
			}
			@Pc(46) char[] local46 = Static202.aCharArray4;
			for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
				@Pc(54) char local54 = local46[local48];
				if (arg0 == local54) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IBI)Z")
	public static boolean method4042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 | Static18.method270(arg0, arg1) || Static318.method2926(arg0, arg1);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ICLjava/lang/String;)I")
	public static int method4044(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0 == arg1.charAt(local12)) {
				local7++;
			}
		}
		return local7;
	}
}
