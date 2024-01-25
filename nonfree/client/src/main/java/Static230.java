import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!hn", name = "S", descriptor = "Lclient!dea;")
	public static final Class85 aClass85_3 = new Class85();

	@OriginalMember(owner = "client!hn", name = "U", descriptor = "I")
	public static int anInt3776 = 0;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIZII)V")
	public static void method3288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static492.anInt8231 = arg3;
		Static373.anInt6397 = arg2;
		Static105.anInt1713 = arg0;
		Static470.anInt8834 = arg1;
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(II)S")
	public static short method3289(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(25) int local25 = arg0 & 0x7F;
		@Pc(44) int local44 = local25 <= 64 ? local25 * local15 >> 7 : local15 * (127 - local25) >> 7;
		@Pc(48) int local48 = local44 + local25;
		@Pc(59) int local59;
		if (local48 == 0) {
			local59 = local44 << 1;
		} else {
			local59 = (local44 << 8) / local48;
		}
		return (short) (local48 | local9 << 10 | local59 >> 4 << 7);
	}
}
