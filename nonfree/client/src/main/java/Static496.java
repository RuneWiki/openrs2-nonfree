import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!ur", name = "M", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!ur", name = "H", descriptor = "I")
	public static int anInt8444 = 0;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!mt;I)Z")
	public static boolean method7129(@OriginalArg(0) Class199 arg0) {
		return arg0 == Static348.aClass199_11 || Static168.aClass199_6 == arg0 || Static295.aClass199_10 == arg0 || arg0 == Static353.aClass199_12;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(III)Z")
	public static boolean method7130(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(BI)I")
	public static int method7132(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(31) int local31 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(39) int local39 = (local31 >>> 4) + local31 & 0xF0F0F0F;
		@Pc(45) int local45 = local39 + (local39 >>> 8);
		@Pc(51) int local51 = local45 + (local45 >>> 16);
		return local51 & 0xFF;
	}
}
