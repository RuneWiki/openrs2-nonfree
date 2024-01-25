import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static188 {

	@OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
	public static int anInt10382;

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "[S")
	public static short[] aShortArray191 = new short[256];

	@OriginalMember(owner = "client!gl", name = "v", descriptor = "[I")
	public static final int[] anIntArray835 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
	public static int anInt10386 = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIB)Z")
	public static boolean method8826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static567.method8018(arg0, arg1) | Static542.method7724(arg0, arg1) | Static325.method5029(arg1, arg0)) & Static139.method2090(arg1, arg0);
	}
}
