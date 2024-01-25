import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static662 {

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
	public static int anInt10762 = 1;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIBII)Z")
	public static boolean method9083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static429.aBoolean478 || !Static343.aBoolean381) {
			return false;
		} else if (Static547.anInt8693 < 100) {
			return false;
		} else if (Static339.method5086(arg1, arg2, arg0)) {
			@Pc(37) int local37 = arg1 << Static314.anInt5377;
			@Pc(41) int local41 = arg0 << Static314.anInt5377;
			if (Static414.method6095(local37, Static492.anInt7972, Static177.aClass84Array2[arg2].method7620(arg0, arg1), Static492.anInt7972, local41, arg3)) {
				Static424.anInt6889++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Z")
	public static boolean method9084(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIBI)I")
	public static int method9085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg0;
		}
		@Pc(23) int local23 = 128 - arg2;
		@Pc(38) int local38 = (arg0 & 0x7F) * local23 + (arg1 & 0x7F) * arg2 >> 7;
		@Pc(52) int local52 = local23 * (arg0 & 0x380) + (arg1 & 0x380) * arg2 >> 7;
		@Pc(66) int local66 = (arg1 & 0xFC00) * arg2 + (arg0 & 0xFC00) * local23 >> 7;
		return local38 & 0x7F | local52 & 0x380 | local66 & 0xFC00;
	}
}
