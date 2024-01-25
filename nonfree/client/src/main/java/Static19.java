import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
	public static int anInt397 = 0;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString12 = "Loading config - ";

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!qj;Lclient!be;ZLclient!qj;Lclient!qj;)Z")
	public static boolean method440(@OriginalArg(0) Class165 arg0, @OriginalArg(1) Class1_Sub6_Sub1 arg1, @OriginalArg(3) Class165 arg2, @OriginalArg(4) Class165 arg3) {
		Static28.aClass165_9 = arg0;
		Static156.aClass165_55 = arg2;
		Static281.aClass165_84 = arg3;
		Static121.aClass1_Sub6_Sub1_2 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZILclient!cp;)Lclient!ba;")
	public static Class17 method441(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		@Pc(7) Class17 local7;
		if (Static58.aClass17_2 == null) {
			local7 = new Class17();
		} else {
			local7 = Static58.aClass17_2;
			Static58.aClass17_2 = Static58.aClass17_2.aClass17_1;
			local7.aClass17_1 = null;
			Static30.anInt775--;
		}
		local7.anInt399 = arg0;
		local7.aClass5_Sub3_1 = arg1;
		return local7;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V")
	public static void method444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 < arg2) {
			Static97.method1784(arg0, Static327.anIntArrayArray63[arg1], arg3, arg2);
		} else {
			Static97.method1784(arg2, Static327.anIntArrayArray63[arg1], arg3, arg0);
		}
	}
}
