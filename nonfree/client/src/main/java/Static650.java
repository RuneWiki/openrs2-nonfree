import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static650 {

	@OriginalMember(owner = "client!uka", name = "C", descriptor = "Lclient!gl;")
	public static Class2_Sub30 aClass2_Sub30_29;

	@OriginalMember(owner = "client!uka", name = "t", descriptor = "J")
	public static long aLong317;

	@OriginalMember(owner = "client!uka", name = "q", descriptor = "Lclient!ug;")
	public static Class43 aClass43_29;

	@OriginalMember(owner = "client!uka", name = "D", descriptor = "Lclient!dka;")
	public static final Class85 aClass85_66 = new Class85(260);

	@OriginalMember(owner = "client!uka", name = "s", descriptor = "Lclient!oh;")
	public static Class273 aClass273_17 = null;

	@OriginalMember(owner = "client!uka", name = "y", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_196 = new Class225(65, 1);

	@OriginalMember(owner = "client!uka", name = "b", descriptor = "(Z)V")
	public static void method8942() {
		@Pc(17) Class2_Sub46 local17;
		for (local17 = (Class2_Sub46) Static237.aClass60_235.method1226(7); local17 != null; local17 = (Class2_Sub46) Static237.aClass60_235.method1228()) {
			if (local17.aBoolean652) {
				local17.method9872();
			} else {
				local17.aBoolean653 = true;
				if (local17.anInt7501 >= 0 && local17.anInt7498 >= 0 && local17.anInt7501 < Static426.anInt6942 && local17.anInt7498 < Static280.anInt6752) {
					Static80.method1204(local17);
				}
			}
		}
		for (local17 = (Class2_Sub46) Static556.aClass60_180.method1226(7); local17 != null; local17 = (Class2_Sub46) Static556.aClass60_180.method1228()) {
			if (local17.aBoolean652) {
				local17.method9872();
			} else {
				local17.aBoolean653 = true;
			}
		}
	}
}
