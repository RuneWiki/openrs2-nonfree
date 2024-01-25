import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!un", name = "D", descriptor = "I")
	public static int anInt10745;

	@OriginalMember(owner = "client!un", name = "w", descriptor = "Lclient!up;")
	public static final Class362 aClass362_153 = new Class362();

	@OriginalMember(owner = "client!un", name = "E", descriptor = "Lclient!vb;")
	public static final Class368 aClass368_22 = new Class368(11, 2);

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZIII)I")
	public static int method9193(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1) {
			return arg0;
		}
		@Pc(17) int local17 = 128 - arg2;
		@Pc(32) int local32 = (arg0 & 0x7F) * local17 + arg2 * (arg1 & 0x7F) >> 7;
		@Pc(51) int local51 = (arg1 & 0x380) * arg2 + local17 * (arg0 & 0x380) >> 7;
		@Pc(65) int local65 = (arg0 & 0xFC00) * local17 + arg2 * (arg1 & 0xFC00) >> 7;
		return local51 & 0x380 | local65 & 0xFC00 | local32 & 0x7F;
	}
}
