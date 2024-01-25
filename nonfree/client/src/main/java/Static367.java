import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static367 {

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
	public static int anInt6201;

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "Lclient!lj;")
	public static final Class230 aClass230_2 = new Class230();

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "Lclient!lj;")
	public static final Class230 aClass230_3 = new Class230();

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "Lclient!lj;")
	public static final Class230 aClass230_4 = new Class230();

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "Z")
	public static boolean aBoolean490 = false;

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray5 = new int[2][][];

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)Z")
	public static boolean method5250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static10.method141(arg1, arg0) | (arg0 & 0x40000) != 0 || Static284.method4284(arg0, arg1);
	}
}
