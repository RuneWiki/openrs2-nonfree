import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "[[Lclient!wb;")
	public static Class1_Sub31[][] aClass1_Sub31ArrayArray3;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "[C")
	public static char[] aCharArray5 = new char[128];

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString321 = "purple:";

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "Z")
	public static boolean aBoolean360 = false;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIB)V")
	public static void method4528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = arg1; local7 <= arg3; local7++) {
			Static273.method4257(arg2, Static183.anIntArrayArray26[local7], arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLclient!wf;)V")
	public static void method4532(@OriginalArg(1) Class15_Sub5_Sub2 arg0) {
		@Pc(20) Class1_Sub8 local20 = (Class1_Sub8) Static132.aClass142_18.method3543(Static124.method4681(arg0.aString336));
		if (local20 == null) {
			return;
		}
		if (local20.aClass1_Sub24_Sub2_1 != null) {
			Static205.aClass1_Sub24_Sub3_1.method4518(local20.aClass1_Sub24_Sub2_1);
			local20.aClass1_Sub24_Sub2_1 = null;
		}
		local20.method4779();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!wc;Z)V")
	public static void method4533(@OriginalArg(0) Class192 arg0) {
		Static117.aClass192_1 = arg0;
	}
}
