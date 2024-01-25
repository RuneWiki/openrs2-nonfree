import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static179 {

	@OriginalMember(owner = "client!it", name = "j", descriptor = "I")
	public static int anInt3077;

	@OriginalMember(owner = "client!it", name = "k", descriptor = "I")
	public static int anInt3078;

	@OriginalMember(owner = "client!it", name = "u", descriptor = "I")
	public static int anInt3085;

	@OriginalMember(owner = "client!it", name = "v", descriptor = "Lclient!dk;")
	public static Class54 aClass54_51;

	@OriginalMember(owner = "client!it", name = "s", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_106 = new Class102(10, 3);

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(III)I")
	public static int method2500(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static175.anIntArray241[arg1 & 0x3] : 256;
	}
}
