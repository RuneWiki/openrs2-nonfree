import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static658 {

	@OriginalMember(owner = "client!us", name = "r", descriptor = "F")
	public static float aFloat141;

	@OriginalMember(owner = "client!us", name = "m", descriptor = "I")
	public static int anInt8473 = 0;

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(III)Z")
	public static boolean method7507(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static71.method4092(arg1, arg0) || Static13.method212(arg0, arg1);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(III)V")
	public static void method7510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static121.method1814()) {
			return;
		}
		if (Static233.anInt3710 != arg0) {
			Static465.aString87 = "";
		}
		Static690.anInt10620 = arg1;
		Static233.anInt3710 = arg0;
		Static261.method9374(-78, 6);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!uja;Z)V")
	public static void method7511(@OriginalArg(0) Class145_Sub3 arg0) {
		@Pc(16) byte[] local16;
		if (Static496.anObject12 == null) {
			@Pc(9) Class105_Sub1_Sub1 local9 = new Class105_Sub1_Sub1();
			local16 = local9.method4223();
			Static496.anObject12 = Static195.method2764(local16);
		}
		if (Static39.anObject1 == null) {
			@Pc(27) Class105_Sub2_Sub1 local27 = new Class105_Sub2_Sub1();
			local16 = local27.method3316();
			Static39.anObject1 = Static195.method2764(local16);
		}
		@Pc(49) Class121 local49 = arg0.aClass121_1;
		if (local49.method2620() && Static626.anObject15 == null) {
			local16 = Static94.method1461(0.5F, 4.0F, new Class111_Sub1(419684), 16.0F, 4.0F, 0.6F);
			Static626.anObject15 = Static195.method2764(local16);
		}
	}
}
