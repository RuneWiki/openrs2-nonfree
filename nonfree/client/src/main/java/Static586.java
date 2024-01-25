import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "Z")
	private static boolean aBoolean123;

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "Z")
	private static boolean aBoolean124;

	@OriginalMember(owner = "client!wg", name = "N", descriptor = "Z")
	private static boolean aBoolean125;

	@OriginalMember(owner = "client!wg", name = "O", descriptor = "Z")
	private static boolean aBoolean126;

	@OriginalMember(owner = "client!wg", name = "P", descriptor = "I")
	private static int anInt1408;

	@OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
	private static int anInt1409;

	@OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
	private static int anInt1410;

	@OriginalMember(owner = "client!wg", name = "S", descriptor = "Z")
	private static boolean aBoolean127;

	@OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
	private static int anInt1411;

	@OriginalMember(owner = "client!wg", name = "U", descriptor = "Z")
	private static boolean aBoolean128;

	@OriginalMember(owner = "client!wg", name = "V", descriptor = "Z")
	private static boolean aBoolean129;

	@OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
	private static int anInt1412;

	@OriginalMember(owner = "client!wg", name = "X", descriptor = "Z")
	private static boolean aBoolean130;

	@OriginalMember(owner = "client!wg", name = "Y", descriptor = "Z")
	private static boolean aBoolean131;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "Lclient!db;")
	public static final Class64 aClass64_69 = new Class64(65, 4);

	@OriginalMember(owner = "client!wg", name = "G", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_16 = new Class61(18, 4);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method1200(@OriginalArg(1) Class66 arg0) {
		Static271.aClass352Array1 = new Class352[Static61.anIntArray145.length];
		for (@Pc(11) int local11 = 0; local11 < Static61.anIntArray145.length; local11++) {
			@Pc(17) int local17 = Static61.anIntArray145[local11];
			@Pc(22) Class196 local22 = Static533.method7421(Static433.aClass31_96, local17);
			@Pc(30) Class91 local30 = arg0.method6829(local22, Static607.method5871(Static149.aClass31_32, local17));
			Static271.aClass352Array1[local11] = new Class352(local30, local22);
		}
	}
}
