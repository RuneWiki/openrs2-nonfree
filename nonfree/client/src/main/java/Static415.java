import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static415 {

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
	public static int anInt7306;

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "[I")
	public static int[] anIntArray701;

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "[Lclient!ha;")
	public static Class2[] aClass2Array14;

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
	public static int anInt7308 = 0;

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
	public static int anInt7309 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZI)Z")
	public static boolean method6110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static489.method6716(arg0, arg1) || Static210.method3585(arg1, arg0);
	}
}
