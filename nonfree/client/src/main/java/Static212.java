import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!oe", name = "J", descriptor = "Lclient!vf;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!oe", name = "P", descriptor = "Lclient!cq;")
	public static Class8 aClass8_19;

	@OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
	public static int anInt4526 = 1;

	@OriginalMember(owner = "client!oe", name = "R", descriptor = "[Lclient!rj;")
	public static final Class177[] aClass177Array1 = new Class177[14];

	@OriginalMember(owner = "client!oe", name = "T", descriptor = "Ljava/lang/String;")
	public static final String aString171 = "green:";

	@OriginalMember(owner = "client!oe", name = "U", descriptor = "[I")
	public static final int[] anIntArray415 = new int[250];

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(II)V")
	public static void method3946(@OriginalArg(1) int arg0) {
		Static273.anInt5603 = arg0;
		@Pc(7) Class37 local7 = Static211.aClass37_70;
		synchronized (Static211.aClass37_70) {
			Static211.aClass37_70.method919();
		}
		local7 = Static287.aClass37_91;
		synchronized (Static287.aClass37_91) {
			Static287.aClass37_91.method919();
		}
	}
}
