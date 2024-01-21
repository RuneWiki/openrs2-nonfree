import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "[Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3[] aClass1_Sub2_Sub5_Sub3Array10;

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
	public static int anInt3359;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
	public static int anInt3355 = 0;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
	public static int anInt3358 = 0;

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1873 = Static118.method2249("<col=00ffff>");

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1875 = Static118.method2249("Bad session id)3");

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1874 = aClass65_1875;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIB)I")
	public static int method2572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(32) int local32 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local32;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
	public static void method2573() {
		for (@Pc(4) Class1_Sub20 local4 = (Class1_Sub20) Static200.aClass99_14.method3288(); local4 != null; local4 = (Class1_Sub20) Static200.aClass99_14.method3289()) {
			@Pc(10) int local10 = local4.anInt3111;
			if (Static173.method2925(local10)) {
				@Pc(16) boolean local16 = true;
				@Pc(20) Class97[] local20 = Static99.aClass97ArrayArray1[local10];
				for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
					if (local20[local22] != null) {
						local16 = local20[local22].aBoolean181;
						break;
					}
				}
				if (!local16) {
					@Pc(44) int local44 = (int) local4.aLong150;
					@Pc(50) Class97 local50 = Static154.method2691(local44);
					if (local50 != null) {
						Static25.method448(local50);
					}
				}
			}
		}
	}
}
