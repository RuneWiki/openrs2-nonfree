import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!saa", name = "F", descriptor = "I")
	public static int anInt8150;

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(I)V")
	public static void method6743() {
		Static482.method6797();
		Static352.method5248();
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIII)I")
	public static int method6744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(II)Lclient!tda;")
	public static Class315 method6745(@OriginalArg(1) int arg0) {
		@Pc(13) Class315[] local13 = Static148.method2479();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class315 local21 = local13[local15];
			if (arg0 == local21.anInt8431) {
				return local21;
			}
		}
		return null;
	}
}
