import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!gd", name = "Y", descriptor = "[B")
	public static byte[] aByteArray38;

	@OriginalMember(owner = "client!gd", name = "ub", descriptor = "[I")
	public static int[] anIntArray260;

	@OriginalMember(owner = "client!gd", name = "Hb", descriptor = "[Lclient!dp;")
	public static Class51[] aClass51Array9;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
	public static int anInt1989 = 0;

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "Lclient!fa;")
	public static final Class77 aClass77_15 = new Class77(8);

	@OriginalMember(owner = "client!gd", name = "Eb", descriptor = "I")
	public static int anInt2044 = -1;

	@OriginalMember(owner = "client!gd", name = "Fb", descriptor = "Ljava/lang/String;")
	public static String aString18 = null;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method1653(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static373.method5218(Static229.method3191(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([I[JZ)V")
	public static void method1661(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static64.method1034(arg1.length - 1, arg0, 0, arg1);
	}
}
