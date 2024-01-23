import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static206 {

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "Z")
	public static boolean aBoolean196 = false;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
	public static int anInt4570 = 0;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "Lclient!qe;")
	private static Class78 aClass78_811 = Static199.method3560("Loaded wordpack");

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "Lclient!qe;")
	public static Class78 aClass78_812 = aClass78_811;

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "[I")
	public static int[] anIntArray734 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
	public static int anInt4578 = 500;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!oe;ILclient!oe;)V")
	public static void method3623(@OriginalArg(0) Class72 arg0, @OriginalArg(2) Class72 arg1) {
		Static110.aClass2_Sub3_Sub7_2 = Static8.method182(arg1, arg0, Static212.anInt4667);
		Static72.aClass2_Sub3_Sub7_Sub1_Sub1_3 = (Class2_Sub3_Sub7_Sub1_Sub1) Static110.aClass2_Sub3_Sub7_2;
		Static211.aClass2_Sub3_Sub7_3 = Static8.method182(arg1, arg0, Static64.anInt1245);
		Static75.aClass2_Sub3_Sub7_1 = Static8.method182(arg1, arg0, Static27.anInt489);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!oe;)V")
	public static void method3624(@OriginalArg(1) Class72 arg0) {
		Static140.aClass72_194 = arg0;
	}
}
