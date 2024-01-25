import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
	public static int anInt4547;

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "Lclient!oe;")
	public static final Class181 aClass181_43 = new Class181();

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_53 = new Class179(76, 0);

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
	public static int anInt4553 = -1;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZI)S")
	public static short method3750(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(44) int local44 = local24 > 64 ? local15 * (127 - local24) >> 7 : local24 * local15 >> 7;
		@Pc(49) int local49 = local24 + local44;
		@Pc(58) int local58;
		if (local49 == 0) {
			local58 = local44 << 1;
		} else {
			local58 = (local44 << 8) / local49;
		}
		return (short) (local58 >> 4 << 7 | local9 << 10 | local49);
	}
}
