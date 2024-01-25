import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static626 {

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
	public static int anInt10074;

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
	public static int anInt10075;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "Lclient!la;")
	public static Class196 aClass196_130;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_147 = new Class200(30, 7);

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "S")
	public static short aShort131 = 32767;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Lclient!g;")
	public static Class96_Sub1 method8630(@OriginalArg(1) int arg0) {
		return Static437.aBoolean548 && arg0 >= Static42.anInt1273 && Static77.anInt1908 >= arg0 ? Static227.aClass96_Sub1Array1[arg0 - Static42.anInt1273] : null;
	}
}
