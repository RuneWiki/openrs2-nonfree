import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!r", name = "h", descriptor = "I")
	public static int anInt9658;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "I")
	public static int anInt9651 = -1;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "I")
	public static int anInt9653 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BC)Z")
	public static boolean method7996(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static153.method3044(arg0)) {
			return true;
		} else {
			@Pc(26) char[] local26 = Static371.aCharArray5;
			for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
				@Pc(34) char local34 = local26[local28];
				if (local34 == arg0) {
					return true;
				}
			}
			@Pc(50) char[] local50 = Static255.aCharArray4;
			for (@Pc(52) int local52 = 0; local52 < local50.length; local52++) {
				@Pc(58) char local58 = local50[local52];
				if (arg0 == local58) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Z")
	public static boolean method8002(@OriginalArg(0) int arg0) {
		for (@Pc(15) Class12_Sub20 local15 = (Class12_Sub20) Static192.aClass73_33.method2005(); local15 != null; local15 = (Class12_Sub20) Static192.aClass73_33.method2009()) {
			if (Static197.method3743(local15.anInt4329) && local15.aLong116 == (long) arg0) {
				return true;
			}
		}
		return false;
	}
}
