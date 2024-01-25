import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString88 = "";

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method5857(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg1.length() > 320 || !Static610.method6274()) {
			return;
		}
		Static563.method7342();
		Static565.anInt8601 = arg2;
		Static110.aString41 = arg1;
		Static612.aString118 = arg0;
		Static336.method4832(6);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
	public static void method5858() {
		for (@Pc(6) Class3_Sub7_Sub9 local6 = (Class3_Sub7_Sub9) Static53.aClass313_6.method7103(); local6 != null; local6 = (Class3_Sub7_Sub9) Static53.aClass313_6.method7110()) {
			@Pc(11) Class9_Sub1_Sub1_Sub3 local11 = local6.aClass9_Sub1_Sub1_Sub3_1;
			local11.method1285();
			if (local11.method1288()) {
				local6.method9596();
				local11.method1293();
			} else if (Static448.aClass364ArrayArrayArray2 != null && local11.method1287()) {
				Static507.method6900(local11, true);
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(JJ)J")
	public static long method5860(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}
}
