import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static370 {

	@OriginalMember(owner = "client!nda", name = "i", descriptor = "Lclient!gba;")
	public static Class125 aClass125_10;

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(B)I")
	public static int method5583() {
		return Static259.anInt5079++;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(III)Z")
	public static boolean method5584(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static158.method2968(arg1, arg0)) {
			return (arg1 & 0xB000) != 0 | Static451.method6640(arg1, arg0) | Static318.method4821(arg1, arg0) ? true : (arg0 & 0x37) == 0 & (Static296.method4637(arg0, arg1) | Static391.method5863(arg1, arg0));
		} else {
			return false;
		}
	}
}
