import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!rfa", name = "o", descriptor = "Lclient!jh;")
	public static final Class188 aClass188_47 = new Class188();

	@OriginalMember(owner = "client!rfa", name = "r", descriptor = "[I")
	public static final int[] anIntArray617 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIZ)Lclient!cn;")
	public static Class73 method9206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class73 local7 = Static259.method3831(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass73Array1 == null || arg1 >= local7.aClass73Array1.length) {
			return null;
		} else {
			return local7.aClass73Array1[arg1];
		}
	}
}
