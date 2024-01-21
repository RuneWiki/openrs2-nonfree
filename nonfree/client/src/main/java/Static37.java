import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	public static int anInt1220;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "[I")
	public static int[] anIntArray159;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "Lclient!je;")
	public static Class2_Sub1_Sub1_Sub2_Sub2 aClass2_Sub1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!h", name = "o", descriptor = "[I")
	public static int[] anIntArray160;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "Lclient!wb;")
	private static Class65 aClass65_523 = Static24.method441("You have only just left another world)3");

	@OriginalMember(owner = "client!h", name = "a", descriptor = "Lclient!wb;")
	public static Class65 aClass65_519 = aClass65_523;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "Lclient!wb;")
	private static Class65 aClass65_520 = Static24.method441("Connection lost");

	@OriginalMember(owner = "client!h", name = "k", descriptor = "Lclient!wb;")
	private static Class65 aClass65_524 = Static24.method441("Prepared sound engine");

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!wb;")
	public static Class65 aClass65_521 = aClass65_524;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "Lclient!wb;")
	public static Class65 aClass65_522 = aClass65_520;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "I")
	public static int anInt1221 = 0;

	@OriginalMember(owner = "client!h", name = "l", descriptor = "I")
	public static int anInt1223 = 3;

	@OriginalMember(owner = "client!h", name = "m", descriptor = "I")
	public static int anInt1224 = 0;

	@OriginalMember(owner = "client!h", name = "n", descriptor = "I")
	public static int anInt1225 = 0;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method749() {
		aClass65_519 = null;
		anIntArray159 = null;
		aClass65_523 = null;
		aClass65_524 = null;
		aClass2_Sub1_Sub1_Sub2_Sub2_1 = null;
		aClass65_520 = null;
		aClass65_521 = null;
		anIntArray160 = null;
		aClass65_522 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!k;Lclient!wb;Lclient!wb;B)Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2 method750(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) Class65 arg2) {
		@Pc(15) int local15 = arg0.method1149(arg2);
		@Pc(21) int local21 = arg0.method1144(arg1, local15);
		return Static75.method1302(local15, arg0, local21);
	}
}
