import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_6 = new Class84("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIII)I")
	public static int method341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(8) int local8 = arg4;
			arg4 = arg3;
			arg3 = local8;
		}
		@Pc(20) int local20 = arg1 & 0x3;
		if (local20 == 0) {
			return arg0;
		} else if (local20 == 1) {
			return 1 + 7 - arg4 - arg2;
		} else if (local20 == 2) {
			return 1 + 7 - arg3 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)I")
	public static int method342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(30) int local30 = (local7 * (arg0 & 0xFF00) & 0xFF0000 | local7 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(35) int local35 = 255 - local7;
		return local30 + ((local35 * (arg1 & 0xFF00) & 0xFF0000 | (arg1 & 0xFF00FF) * local35 & 0xFF00FF00) >>> 8);
	}
}
