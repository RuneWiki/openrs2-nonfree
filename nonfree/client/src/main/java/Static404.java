import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static404 {

	@OriginalMember(owner = "client!ql", name = "A", descriptor = "I")
	public static int anInt7234;

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_65 = new Class236(30, 3);

	@OriginalMember(owner = "client!ql", name = "x", descriptor = "Z")
	public static boolean aBoolean510 = false;

	@OriginalMember(owner = "client!ql", name = "z", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_180 = new Class150(25, 8);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BII)Z")
	public static boolean method5867(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static423.method6078(arg1, arg0)) {
			return (arg1 & 0x9000) != 0 | Static66.method1217(arg1, arg0) | Static33.method799(arg1, arg0) ? true : (arg0 & 0x37) == 0 & (Static77.method4917(arg1, arg0) | (arg1 & 0x2000) != 0 | Static280.method4570(arg1, arg0));
		} else {
			return false;
		}
	}
}
