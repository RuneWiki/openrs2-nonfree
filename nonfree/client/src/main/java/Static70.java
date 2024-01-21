import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "Lclient!he;")
	public static Class11 aClass11_65;

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "Lclient!bc;")
	public static Class10_Sub1_Sub1_Sub1 aClass10_Sub1_Sub1_Sub1_58;

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_26;

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
	public static int anInt2671 = 0;

	@OriginalMember(owner = "client!oa", name = "W", descriptor = "Lclient!va;")
	private static Class61 aClass61_1082 = Static88.method1421("wave2:");

	@OriginalMember(owner = "client!oa", name = "S", descriptor = "Lclient!va;")
	public static Class61 aClass61_1079 = aClass61_1082;

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "Lclient!va;")
	private static Class61 aClass61_1080 = Static88.method1421("Connecting to friendserver");

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "Lclient!va;")
	public static Class61 aClass61_1081 = aClass61_1080;

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "Lclient!va;")
	public static Class61 aClass61_1083 = Static88.method1421("@yel@*V");

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "I")
	public static int anInt2675 = 0;

	@OriginalMember(owner = "client!oa", name = "cb", descriptor = "Lclient!va;")
	public static Class61 aClass61_1084 = Static88.method1421(" x ");

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	public static void method1661() {
		for (@Pc(7) int local7 = 0; local7 < Static34.anInt1005; local7++) {
			@Pc(18) int local18 = Static1.anIntArray3[local7];
			@Pc(22) Class10_Sub1_Sub5_Sub2_Sub1 local22 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local18];
			if (local22 != null) {
				Static55.method813(local22, local22.aClass10_Sub1_Sub3_1.anInt397);
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	public static void method1662() {
		aClass61_1084 = null;
		aClass61_1082 = null;
		aClass61_1083 = null;
		aClass11_65 = null;
		aClass61_1080 = null;
		aClass10_Sub1_Sub1_Sub1_58 = null;
		aClass61_1079 = null;
		aClass61_1081 = null;
		aClass10_Sub1_Sub1_Sub2_26 = null;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	public static void method1665() {
		Static20.aClass29_75.method646();
	}
}
