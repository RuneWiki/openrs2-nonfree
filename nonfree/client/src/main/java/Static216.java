import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static216 {

	@OriginalMember(owner = "client!kj", name = "H", descriptor = "I")
	public static int anInt7641;

	@OriginalMember(owner = "client!kj", name = "R", descriptor = "[I")
	public static final int[] anIntArray629 = new int[1000];

	@OriginalMember(owner = "client!kj", name = "Z", descriptor = "Ljava/lang/String;")
	public static String aString73 = "";

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZI)Z")
	public static boolean method6223(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static213.method3021(arg1, arg0) || Static296.method4225(arg0, arg1);
	}
}
