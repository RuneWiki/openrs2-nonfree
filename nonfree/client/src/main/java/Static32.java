import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	public static int[] anIntArray50;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	public static int anInt750 = 0;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "Z")
	public static boolean aBoolean39 = false;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!el;B)Z")
	public static boolean method785(@OriginalArg(0) Class52 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean111) {
			return false;
		} else if (!arg0.method1767()) {
			return false;
		} else if (Static327.aClass25_35.method691((long) arg0.anInt1741) == null) {
			return Static96.aClass25_7.method691((long) arg0.anInt1756) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)S")
	public static short method786(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(44) int local44 = local19 > 64 ? local15 * (127 - local19) >> 7 : local19 * local15 >> 7;
		@Pc(48) int local48 = local44 + local19;
		@Pc(54) int local54;
		if (local48 == 0) {
			local54 = local44 << 1;
		} else {
			local54 = (local44 << 8) / local48;
		}
		return (short) (local54 >> 4 << 7 | local9 << 10 | local48);
	}
}
