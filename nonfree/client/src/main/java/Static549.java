import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "B")
	public static byte aByte119;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "Lclient!pf;")
	public static final Class286 aClass286_12 = new Class286("", 14);

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "[Lclient!jga;")
	public static final Class2_Sub33[] aClass2_Sub33Array1 = new Class2_Sub33[300];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)I")
	public static int method7660() {
		@Pc(22) byte local22;
		if (Static510.anInt8117 >= 96) {
			@Pc(13) int local13 = Static246.method3455();
			if (local13 <= 100) {
				Static302.method4224();
				local22 = 4;
			} else if (local13 <= 500) {
				local22 = 3;
				Static46.method598();
			} else if (local13 <= 1000) {
				local22 = 2;
				Static441.method6385();
			} else {
				local22 = 1;
				Static299.method4190();
			}
		} else {
			local22 = 1;
			Static299.method4190();
		}
		if (Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() != 0) {
			Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub20_1);
			Static213.method2982(false, 0);
		}
		Static610.method9380();
		return local22;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZI)Lclient!ac;")
	public static Class2_Sub3 method7662(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg0 > -111) {
			method7662(16, false, 59);
		}
		@Pc(23) long local23 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg2);
		return (Class2_Sub3) Static710.aClass218_45.method5095(local23, 0);
	}
}
