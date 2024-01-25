import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	public static int anInt426;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	public static int anInt424 = -2;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IC)Z")
	public static boolean method358(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static241.method4019(arg0)) {
			return true;
		} else {
			@Pc(23) char[] local23 = Static185.aCharArray2;
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				@Pc(31) char local31 = local23[local25];
				if (arg0 == local31) {
					return true;
				}
			}
			@Pc(43) char[] local43 = Static257.aCharArray3;
			for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
				@Pc(51) char local51 = local43[local45];
				if (local51 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[BI)I")
	public static int method359(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static289.method4466(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)I")
	public static int method360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 >= arg1) {
			return arg2 <= arg0 ? arg2 : arg0;
		} else {
			return arg1;
		}
	}
}
