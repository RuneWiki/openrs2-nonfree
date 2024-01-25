import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "Lclient!uk;")
	public static Class243 aClass243_1;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!wm;BIII)V")
	public static void method5313(@OriginalArg(0) Class1_Sub44 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) long local20 = (long) (arg3 | arg2 << 28 | arg1 << 14);
		@Pc(28) Class1_Sub34 local28 = (Class1_Sub34) Static346.aClass51_22.method930(local20);
		if (local28 == null) {
			local28 = new Class1_Sub34();
			Static346.aClass51_22.method931(local28, local20);
			local28.aClass142_43.method3212(arg0);
			return;
		}
		@Pc(55) Class206 local55 = Static388.aClass193_3.method4249(arg0.anInt7736);
		@Pc(58) int local58 = local55.anInt6279;
		if (local55.anInt6289 == 1) {
			local58 *= arg0.anInt7735 + 1;
		}
		for (@Pc(75) Class1_Sub44 local75 = (Class1_Sub44) local28.aClass142_43.method3199(); local75 != null; local75 = (Class1_Sub44) local28.aClass142_43.method3198()) {
			local55 = Static388.aClass193_3.method4249(local75.anInt7736);
			@Pc(86) int local86 = local55.anInt6279;
			if (local55.anInt6289 == 1) {
				local86 *= local75.anInt7735 + 1;
			}
			if (local58 > local86) {
				Static158.method2502(arg0, local75);
				return;
			}
		}
		local28.aClass142_43.method3212(arg0);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lclient!ss;")
	public static Class1_Sub1_Sub14 method5317(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub14 local10 = (Class1_Sub1_Sub14) Static413.aClass116_3.method2530((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static29.aClass109_14.method2349(arg0, 0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static81.method1175(local20);
			Static413.aClass116_3.method2526(local10, (long) arg0);
			return local10;
		}
	}
}
