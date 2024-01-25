import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!c", name = "Zc", descriptor = "I")
	public static int anInt732;

	@OriginalMember(owner = "client!c", name = "td", descriptor = "Lclient!ph;")
	public static Class154 aClass154_7 = new Class154(64);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)I")
	public static int method650(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static188.anIntArray347[arg1 & 0x3] : Static178.anIntArray512[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!c", name = "l", descriptor = "(I)V")
	public static void method658() {
		for (@Pc(7) int local7 = 0; local7 < Static143.anInt3194; local7++) {
			@Pc(13) Class201 local13 = Static22.method397(local7);
			if (local13 != null && local13.anInt6348 == 0) {
				Static73.anIntArray161[local7] = 0;
				Static103.anIntArray295[local7] = 0;
			}
		}
		Static264.aClass198_22 = new Class198(16);
	}

	@OriginalMember(owner = "client!c", name = "h", descriptor = "(B)V")
	public static void method660() {
		@Pc(5) Class154 local5 = Static319.aClass154_99;
		synchronized (Static319.aClass154_99) {
			Static319.aClass154_99.method4212();
		}
	}
}
