import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
	public static int anInt8684 = -1;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	public static void method7143() {
		Static442.aClass119_26 = null;
		Static223.aClass119_17 = null;
		Static358.aClass119_20 = null;
		Static46.aClass119_4 = null;
		Static48.aClass119_5 = null;
		Static525.aClass119Array16 = null;
		Static101.aClass119_8 = null;
		Static129.aClass119_11 = null;
		Static494.aClass119_30 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)S")
	public static short method7144(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(42) int local42 = local24 > 64 ? (127 - local24) * local20 >> 7 : local20 * local24 >> 7;
		@Pc(47) int local47 = local24 + local42;
		@Pc(58) int local58;
		if (local47 == 0) {
			local58 = local42 << 1;
		} else {
			local58 = (local42 << 8) / local47;
		}
		return (short) (local47 | local14 << 10 | local58 >> 4 << 7);
	}
}
