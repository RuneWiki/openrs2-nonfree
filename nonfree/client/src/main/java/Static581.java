import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static581 {

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
	public static int anInt9734;

	@OriginalMember(owner = "client!tp", name = "v", descriptor = "I")
	public static int anInt9735;

	@OriginalMember(owner = "client!tp", name = "n", descriptor = "Z")
	public static boolean aBoolean745;

	@OriginalMember(owner = "client!tp", name = "x", descriptor = "I")
	public static int anInt9737;

	@OriginalMember(owner = "client!tp", name = "D", descriptor = "Lclient!vha;")
	public static final Class370 aClass370_18 = new Class370(14, -1);

	@OriginalMember(owner = "client!tp", name = "u", descriptor = "Z")
	public static boolean aBoolean744 = false;

	@OriginalMember(owner = "client!tp", name = "A", descriptor = "I")
	public static int anInt9736 = -1;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(III)Z")
	public static boolean method8339(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static477.method6966(arg0, arg1) | Static105.method1531(arg0, arg1)) & Static555.method8023(arg1, arg0);
	}

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "(III)Z")
	public static boolean method8340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static234.method3395(arg0, arg1) || Static331.method5044(arg0, arg1);
	}
}
