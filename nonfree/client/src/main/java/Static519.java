import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "Lclient!xa;")
	public static Class58 aClass58_43;

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "Lclient!dga;")
	public static final Class68 aClass68_6 = new Class68();

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "[S")
	private static final short[] aShortArray134 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "[S")
	private static final short[] aShortArray135 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!tu", name = "n", descriptor = "[S")
	private static final short[] aShortArray136 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "[[S")
	public static final short[][] aShortArrayArray10 = new short[][] { aShortArray134, aShortArray135, aShortArray136 };

	@OriginalMember(owner = "client!tu", name = "r", descriptor = "Z")
	public static boolean aBoolean635 = false;

	@OriginalMember(owner = "client!tu", name = "s", descriptor = "[I")
	public static final int[] anIntArray646 = new int[8];

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7157(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			@Pc(17) Class6_Sub31 local17 = Static114.method2007(Static288.aClass47_86, Static337.aClass324_1);
			local17.aClass6_Sub21_Sub2_2.method6062(Static391.method5746(arg0));
			local17.aClass6_Sub21_Sub2_2.method6022(arg0);
			Static534.method7251(local17);
		}
	}
}
