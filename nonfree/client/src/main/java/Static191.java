import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!og", name = "c", descriptor = "Lclient!a;")
	public static Class1 aClass1_7;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray8;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString179 = "Please wait...";

	@OriginalMember(owner = "client!og", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString180 = " has logged out.";

	@OriginalMember(owner = "client!og", name = "d", descriptor = "[F")
	public static float[] aFloatArray29 = new float[4];

	@OriginalMember(owner = "client!og", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString181 = "wave2:";

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
	public static void method3989() {
		aString180 = null;
		aString179 = null;
		aClass1_7 = null;
		aString181 = null;
		aFloatArray29 = null;
		aBooleanArrayArray8 = null;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
	public static void method3992(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub2_Sub21 local8 = Static39.method4121(arg0, 5);
		local8.method4361();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!q;BLclient!q;)V")
	public static void method3994(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(2) Class4_Sub2 arg1) {
		if (arg0.aClass4_Sub2_68 != null) {
			arg0.method4396();
		}
		arg0.aClass4_Sub2_69 = arg1.aClass4_Sub2_69;
		arg0.aClass4_Sub2_68 = arg1;
		arg0.aClass4_Sub2_68.aClass4_Sub2_69 = arg0;
		arg0.aClass4_Sub2_69.aClass4_Sub2_68 = arg0;
	}
}
