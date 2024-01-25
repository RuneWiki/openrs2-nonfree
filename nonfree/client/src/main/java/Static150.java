import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!em", name = "p", descriptor = "I")
	public static int anInt2707;

	@OriginalMember(owner = "client!em", name = "u", descriptor = "Lclient!fr;")
	public static final Class123 aClass123_1 = new Class123(6, 0, 4, 2);

	@OriginalMember(owner = "client!em", name = "m", descriptor = "F")
	public static float aFloat57 = 0.0F;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)S")
	public static short method2497(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = arg0 >> 10 & 0x3F;
		@Pc(24) int local24 = arg0 >> 3 & 0x70;
		@Pc(28) int local28 = arg0 & 0x7F;
		@Pc(49) int local49 = local28 <= 64 ? local24 * local28 >> 7 : local24 * (127 - local28) >> 7;
		@Pc(53) int local53 = local49 + local28;
		@Pc(59) int local59;
		if (local53 == 0) {
			local59 = local49 << 1;
		} else {
			local59 = (local49 << 8) / local53;
		}
		return (short) (local53 | local59 >> 4 << 7 | local18 << 10);
	}
}
