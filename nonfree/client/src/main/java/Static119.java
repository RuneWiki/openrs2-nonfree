import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "Lclient!qj;")
	public static Class165 aClass165_41;

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "[I")
	public static int[] anIntArray251;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray17 = null;

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "J")
	public static long aLong83 = 0L;

	@OriginalMember(owner = "client!hd", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString76 = null;

	@OriginalMember(owner = "client!hd", name = "P", descriptor = "Z")
	public static boolean aBoolean174 = false;

	@OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
	public static int anInt2038 = 1;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)I")
	public static int method1861(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static143.anIntArray329[arg0 & 0x3] : Static314.anIntArray758[arg0 & 0x3];
	}
}
