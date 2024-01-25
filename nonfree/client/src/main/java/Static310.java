import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static310 {

	@OriginalMember(owner = "client!kf", name = "K", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_111 = new Class359(132, 9);

	@OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
	public static int anInt5910 = 1;

	@OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
	public static int anInt5911 = 0;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(III)Z")
	public static boolean method4900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static316.method4963(arg0, arg1) || Static112.method2102(arg1, arg0);
	}
}
