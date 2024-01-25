import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gda", name = "q", descriptor = "Lclient!rh;")
	public static Class296 aClass296_3;

	@OriginalMember(owner = "client!gda", name = "A", descriptor = "Lclient!iba;")
	public static Class145 aClass145_1;

	@OriginalMember(owner = "client!gda", name = "r", descriptor = "Lclient!sia;")
	public static final Class315 aClass315_1 = new Class315();

	@OriginalMember(owner = "client!gda", name = "y", descriptor = "J")
	public static long aLong92 = -1L;

	@OriginalMember(owner = "client!gda", name = "z", descriptor = "I")
	public static int anInt4216 = 0;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IB)V")
	public static void method3672(@OriginalArg(0) int arg0) {
		if (!Static80.method2326(arg0)) {
			return;
		}
		@Pc(18) Class24[] local18 = Static631.aClass24ArrayArray2[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Class24 local26 = local18[local20];
			if (local26 != null) {
				local26.anInt491 = 0;
				local26.anInt456 = 1;
				local26.anInt514 = 0;
			}
		}
	}
}
