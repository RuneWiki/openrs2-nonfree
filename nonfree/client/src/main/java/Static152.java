import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "Lclient!p;")
	public static Class133 aClass133_6;

	@OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
	public static int anInt3130;

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "Lclient!in;")
	public static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!ld", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString101 = "Starting 3d Library";

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
	public static int anInt3132 = 0;

	@OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
	public static int anInt3136 = 0;

	@OriginalMember(owner = "client!ld", name = "X", descriptor = "[I")
	public static int[] anIntArray249 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!ld", name = "Y", descriptor = "Z")
	public static boolean aBoolean228 = true;

	@OriginalMember(owner = "client!ld", name = "cb", descriptor = "I")
	public static int anInt3139 = 0;

	@OriginalMember(owner = "client!ld", name = "db", descriptor = "Ljava/lang/String;")
	public static String aString102 = " has logged out.";

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!ph;)V")
	public static void method2500(@OriginalArg(1) Class138 arg0) {
		Static109.aClass138_37 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(B)V")
	public static void method2501() {
		for (@Pc(7) int local7 = -1; local7 < Static222.anInt4329; local7++) {
			@Pc(23) int local23;
			if (local7 == -1) {
				local23 = 2047;
			} else {
				local23 = Static46.anIntArray79[local7];
			}
			@Pc(31) Class22_Sub3_Sub2 local31 = Static195.aClass22_Sub3_Sub2Array1[local23];
			if (local31 != null) {
				Static236.method3732(local31, local31.method3660());
			}
		}
	}
}
