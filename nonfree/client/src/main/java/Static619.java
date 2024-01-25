import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static619 {

	@OriginalMember(owner = "client!v", name = "p", descriptor = "I")
	public static int anInt9981;

	@OriginalMember(owner = "client!v", name = "k", descriptor = "[I")
	public static int[] anIntArray553;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "[I")
	public static final int[] anIntArray554 = new int[256];

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Z")
	public static final boolean aBoolean699 = false;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_203 = new Class156(90, 5);

	@OriginalMember(owner = "client!v", name = "n", descriptor = "I")
	public static int anInt9987 = 100;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)Z")
	public static boolean method8483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static540.method7411(arg1, arg0) | (arg0 & 0x40000) != 0 || Static226.method3581(arg0, arg1);
	}
}
