import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static153 {

	@OriginalMember(owner = "client!la", name = "U", descriptor = "Lclient!fh;")
	public static Class58 aClass58_68;

	@OriginalMember(owner = "client!la", name = "S", descriptor = "I")
	public static int anInt3017 = -1;

	@OriginalMember(owner = "client!la", name = "W", descriptor = "I")
	public static int anInt3020 = -1;

	@OriginalMember(owner = "client!la", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString185 = "Hidden";

	@OriginalMember(owner = "client!la", name = "Z", descriptor = "[J")
	public static long[] aLongArray24 = new long[100];

	@OriginalMember(owner = "client!la", name = "cb", descriptor = "Z")
	public static boolean aBoolean210 = false;

	@OriginalMember(owner = "client!la", name = "db", descriptor = "I")
	public static int anInt3024 = -1;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!lh;BLclient!lh;)V")
	public static void method2459(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(2) Class4_Sub3 arg1) {
		if (arg1.aClass4_Sub3_74 != null) {
			arg1.method4856();
		}
		arg1.aClass4_Sub3_75 = arg0.aClass4_Sub3_75;
		arg1.aClass4_Sub3_74 = arg0;
		arg1.aClass4_Sub3_74.aClass4_Sub3_75 = arg1;
		arg1.aClass4_Sub3_75.aClass4_Sub3_74 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZB)V")
	public static void method2460(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static43.aBoolean200) {
			Static43.aBoolean200 = arg0;
			Static179.method2822();
		}
	}
}
