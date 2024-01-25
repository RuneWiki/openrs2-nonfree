import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!tea", name = "A", descriptor = "Lclient!ur;")
	public static Class367 aClass367_1;

	@OriginalMember(owner = "client!tea", name = "g", descriptor = "[I")
	public static int[] anIntArray604;

	@OriginalMember(owner = "client!tea", name = "l", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_175 = new Class322(90, -2);

	@OriginalMember(owner = "client!tea", name = "m", descriptor = "S")
	public static short aShort117 = 256;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!jn;I)V")
	public static void method8109(@OriginalArg(0) Class6_Sub17 arg0) {
		arg0.aBoolean693 = false;
		if (arg0.aClass6_Sub54_6 != null) {
			arg0.aClass6_Sub54_6.anInt9978 = 0;
		}
		for (@Pc(27) Class6_Sub17 local27 = arg0.method8140(); local27 != null; local27 = arg0.method8143()) {
			method8109(local27);
		}
	}
}
