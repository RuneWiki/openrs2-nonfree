import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static203 {

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
	public static int anInt3324;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "Lclient!nd;")
	public static Class165 aClass165_1;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "[Lclient!lj;")
	public static Class147[] aClass147Array2;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_106 = new Class151("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_107 = new Class151("M", "M", "M", "M");

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_128 = new Class214(47, 5);

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "[I")
	public static final int[] anIntArray180 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
	public static int method2772(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
