import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
	public static int anInt2385;

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "Lclient!hb;")
	public static final Class117 aClass117_8 = new Class117(14, 16);

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_50 = new Class133(102, 8);

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "[I")
	public static int[] anIntArray248 = new int[1];

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(IZ)Z")
	public static boolean method2103(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2105(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static3.aStringArray3.length; local7++) {
			if (Static3.aStringArray3[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}
}
