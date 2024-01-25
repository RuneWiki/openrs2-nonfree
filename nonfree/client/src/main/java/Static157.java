import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static157 {

	@OriginalMember(owner = "client!fv", name = "k", descriptor = "F")
	public static float aFloat57;

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "Lclient!pb;")
	public static final Class262 aClass262_4 = new Class262(12, 5);

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
	public static int anInt2490 = 0;

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
	public static int anInt2491 = 0;

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "[I")
	public static final int[] anIntArray211 = new int[4];

	@OriginalMember(owner = "client!fv", name = "l", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_42 = new Class349(109, -1);

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIB)Z")
	public static boolean method2132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
