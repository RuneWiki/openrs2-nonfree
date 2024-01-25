import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static396 {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "Lclient!es;")
	public static Class107 aClass107_1;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
	public static int anInt6520;

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "Lclient!ha;")
	public static Class145 aClass145_6;

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "Z")
	public static boolean aBoolean553 = false;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "Lclient!rh;")
	public static final Class323 aClass323_3 = new Class323();

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static494.method7076(arg0, arg1) | (arg0 & 0x800) != 0 || Static13.method212(arg0, arg1);
	}
}
