import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!um", name = "H", descriptor = "Lclient!qo;")
	public static final Class277 aClass277_10 = new Class277();

	@OriginalMember(owner = "client!um", name = "N", descriptor = "[I")
	public static final int[] anIntArray580 = new int[4096];

	@OriginalMember(owner = "client!um", name = "P", descriptor = "I")
	public static int anInt9974 = 0;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V")
	public static void method8093() {
		@Pc(7) Class379 local7 = null;
		try {
			local7 = Static175.method3409("2");
			@Pc(20) Class8_Sub8 local20 = new Class8_Sub8(Static503.anInt9960 * 6 + 3);
			local20.method8562(1);
			local20.method8548(Static503.anInt9960);
			for (@Pc(34) int local34 = 0; local34 < Static69.anIntArray417.length; local34++) {
				if (Static378.aBooleanArray19[local34]) {
					local20.method8548(local34);
					local20.method8523(Static69.anIntArray417[local34]);
				}
			}
			local7.method8632(0, local20.anInt10588, local20.aByteArray107);
		} catch (@Pc(65) Exception local65) {
		}
		try {
			if (local7 != null) {
				local7.method8628();
			}
		} catch (@Pc(72) Exception local72) {
		}
		Static11.aLong6 = Static342.method5463();
		Static359.aBoolean485 = false;
	}
}
