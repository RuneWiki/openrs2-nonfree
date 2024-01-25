import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static13 {

	@OriginalMember(owner = "client!ag", name = "z", descriptor = "F")
	public static float aFloat128;

	@OriginalMember(owner = "client!ag", name = "w", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_195 = new Class272(94, -1);

	@OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
	public static int anInt6202 = -2;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIB)Z")
	public static boolean method5362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static178.method6932(arg1, arg0) | Static442.method7188(arg0, arg1) | Static2.method13(arg1, arg0)) & Static550.method6451(arg0, arg1);
	}
}
