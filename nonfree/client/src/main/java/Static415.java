import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!os", name = "k", descriptor = "I")
	public static int anInt7579;

	@OriginalMember(owner = "client!os", name = "l", descriptor = "I")
	public static int anInt7580;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "Lclient!nt;")
	public static final Class238 aClass238_51 = new Class238();

	@OriginalMember(owner = "client!os", name = "g", descriptor = "I")
	public static int anInt7576 = 0;

	@OriginalMember(owner = "client!os", name = "j", descriptor = "[F")
	public static final float[] aFloatArray66 = new float[4];

	@OriginalMember(owner = "client!os", name = "n", descriptor = "I")
	public static int anInt7581 = -1;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BI)S")
	public static short method6349(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(39) int local39 = local19 <= 64 ? local15 * local19 >> 7 : (127 - local19) * local15 >> 7;
		@Pc(43) int local43 = local19 + local39;
		@Pc(52) int local52;
		if (local43 == 0) {
			local52 = local39 << 1;
		} else {
			local52 = (local39 << 8) / local43;
		}
		return (short) (local43 | local52 >> 4 << 7 | local9 << 10);
	}
}
