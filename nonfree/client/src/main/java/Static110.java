import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
	public static int anInt1841;

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString15;

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "[Lclient!ya;")
	public static Class125[] aClass125Array1;

	@OriginalMember(owner = "client!ew", name = "j", descriptor = "Lclient!um;")
	public static Class243 aClass243_64;

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
	public static int anInt1843 = 2;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILclient!um;)I")
	public static int method1504(@OriginalArg(1) Class243 arg0) {
		@Pc(13) int local13 = 0;
		if (arg0.method5463(Static94.anInt1631)) {
			local13++;
		}
		if (arg0.method5463(Static1.anInt4522)) {
			local13++;
		}
		return local13;
	}
}
