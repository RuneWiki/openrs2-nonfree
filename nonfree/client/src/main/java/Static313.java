import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
	public static int anInt5975;

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_50 = new Class208(20, 4);

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(III)I")
	public static int method5233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static42.anIntArray56[arg1 & 0x3] : Static294.anIntArray352[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(CI)Z")
	public static boolean method5234(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static214.method3650(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static184.aCharArray6;
			for (@Pc(25) int local25 = 0; local25 < local18.length; local25++) {
				@Pc(31) char local31 = local18[local25];
				if (arg0 == local31) {
					return true;
				}
			}
			@Pc(47) char[] local47 = Static274.aCharArray12;
			for (@Pc(49) int local49 = 0; local49 < local47.length; local49++) {
				@Pc(55) char local55 = local47[local49];
				if (local55 == arg0) {
					return true;
				}
			}
			return false;
		}
	}
}
