import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "Lclient!ur;")
	public static Class130 aClass130_4;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILjava/lang/String;)I", line = 9)
	public static int method4652(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			local10 = (local10 << 5) - (local10 - arg0.charAt(local20));
		}
		return local10;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZZLclient!cu;Z)V", line = 994)
	public static void method4656(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub7 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt1368;
		@Pc(12) int local12 = (int) arg1.aLong232;
		arg1.method6469();
		if (arg2) {
			Static152.method2980(local8);
		}
		Static129.method2582(local8);
		@Pc(27) Class161 local27 = Static6.method140(local12);
		if (local27 != null) {
			Static187.method3646(local27);
		}
		Static211.method3990();
		if (!arg0 && Class97.anInt2592 != -1) {
			Static366.method6461(Class97.anInt2592, 1);
		}
		@Pc(49) Class137 local49 = new Class137(Class2_Sub3_Sub34.aClass4_130);
		for (@Pc(54) Class2_Sub7 local54 = (Class2_Sub7) local49.method3562(); local54 != null; local54 = (Class2_Sub7) local49.method3561()) {
			if (!local54.method6463()) {
				local54 = (Class2_Sub7) local49.method3562();
				if (local54 == null) {
					return;
				}
			}
			if (local54.anInt1371 == 3) {
				@Pc(76) int local76 = (int) local54.aLong232;
				if (local76 >>> 16 == local8) {
					method4656(arg0, local54, true);
				}
			}
		}
	}
}
