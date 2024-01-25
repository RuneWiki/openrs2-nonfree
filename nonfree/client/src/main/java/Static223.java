import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "Lclient!fs;")
	public static Class134 aClass134_23;

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "Lclient!el;")
	public static final Class109 aClass109_80 = new Class109(98, 9);

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_41 = new Class387(80, -1);

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "[I")
	public static final int[] anIntArray208 = new int[5];

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
	public static int anInt3642 = -1;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
	public static String method3181(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(17) int local17 = arg0.indexOf(arg1); local17 != -1; local17 = arg0.indexOf(arg1, arg2.length() + local17)) {
			arg0 = arg0.substring(0, local17) + arg2 + arg0.substring(local17 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!pda;)Ljava/lang/String;")
	public static String method3186(@OriginalArg(1) Class5_Sub5_Sub18 arg0) {
		return arg0.aString102 + " <col=ffffff>>";
	}
}
