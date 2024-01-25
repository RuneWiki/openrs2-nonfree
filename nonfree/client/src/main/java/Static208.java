import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static208 {

	@OriginalMember(owner = "client!hu", name = "u", descriptor = "Lclient!pj;")
	public static Class248 aClass248_31;

	@OriginalMember(owner = "client!hu", name = "w", descriptor = "Lclient!vfa;")
	public static Class329 aClass329_5;

	@OriginalMember(owner = "client!hu", name = "y", descriptor = "I")
	public static int anInt3949;

	@OriginalMember(owner = "client!hu", name = "r", descriptor = "[I")
	public static final int[] anIntArray342 = new int[8];

	@OriginalMember(owner = "client!hu", name = "v", descriptor = "I")
	public static int anInt3948 = -1;

	@OriginalMember(owner = "client!hu", name = "x", descriptor = "[I")
	public static final int[] anIntArray343 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBI)Z")
	public static boolean method3404(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
