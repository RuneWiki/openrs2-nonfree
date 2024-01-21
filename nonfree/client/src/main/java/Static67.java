import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "Lclient!ob;")
	public static Class60 aClass60_2;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!ed;")
	public static Class23 aClass23_647 = Static169.method2903("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "Lclient!ed;")
	public static Class23 aClass23_648 = Static169.method2903("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
	public static int anInt1756 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Lclient!ed;")
	public static Class23 aClass23_649 = Static169.method2903("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "Lclient!ed;")
	public static Class23 aClass23_650 = Static169.method2903("<)4col>");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) Class1_Sub17 local10 = (Class1_Sub17) Static158.aClass56_15.method1853();
		@Pc(12) Class1_Sub17 local12 = null;
		while (local10 != null) {
			if (local10.anInt3225 == arg1 && local10.anInt3231 == arg5 && local10.anInt3228 == arg4 && arg8 == local10.anInt3221) {
				local12 = local10;
				break;
			}
			local10 = (Class1_Sub17) Static158.aClass56_15.method1855();
		}
		if (local12 == null) {
			local12 = new Class1_Sub17();
			local12.anInt3228 = arg4;
			local12.anInt3225 = arg1;
			local12.anInt3231 = arg5;
			local12.anInt3221 = arg8;
			Static125.method2228(local12);
			Static158.aClass56_15.method1856(local12);
		}
		local12.anInt3226 = arg7;
		local12.anInt3232 = arg0;
		local12.anInt3229 = arg2;
		local12.anInt3224 = arg3;
		local12.anInt3222 = arg6;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ga;BLclient!ga;)V")
	public static void method1181(@OriginalArg(0) Class30 arg0, @OriginalArg(2) Class30 arg1) {
		Static110.aClass30_39 = arg1;
		Static23.aClass30_11 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method1186() {
		aClass23_650 = null;
		aClass60_2 = null;
		aClass23_647 = null;
		aClass23_649 = null;
		aClass23_648 = null;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)Z")
	public static boolean method1187() {
		return Static141.anInt3602 == 0 ? Static35.aClass1_Sub11_Sub2_1.method1764() : true;
	}
}
