import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "Lclient!nd;")
	public static Class60_Sub1 aClass60_Sub1_64;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
	public static int anInt1630;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "Lclient!wd;")
	public static Class97 aClass97_6;

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "[I")
	public static int[] anIntArray158;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "Lclient!nd;")
	public static Class60_Sub1 aClass60_Sub1_65;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_978 = Static118.method2249("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "J")
	public static long aLong49 = 0L;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "Z")
	private static boolean aBoolean69 = false;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([BZB)Ljava/lang/Object;")
	public static Object method1109(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !aBoolean69) {
			try {
				@Pc(25) Class26 local25 = (Class26) Class.forName("Class26_Sub1").getDeclaredConstructor().newInstance();
				local25.method985(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				aBoolean69 = true;
			}
		}
		return arg0;
	}
}
