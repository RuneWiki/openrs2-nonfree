import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZII)I")
	public static int method2561(@OriginalArg(2) int arg0) {
		@Pc(15) Class6_Sub3 local15 = Static536.method7657(false, arg0);
		if (local15 == null) {
			return Static544.aClass233_1.method5597(arg0).anInt8005;
		}
		@Pc(26) int local26 = 0;
		for (@Pc(38) int local38 = 0; local38 < local15.anIntArray21.length; local38++) {
			if (local15.anIntArray21[local38] == -1) {
				local26++;
			}
		}
		return local26 + Static544.aClass233_1.method5597(arg0).anInt8005 - local15.anIntArray21.length;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!in;ZZI)V")
	public static void method2562(@OriginalArg(0) Class6_Sub25 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(13) int local13 = arg0.anInt5007;
		@Pc(17) int local17 = (int) arg0.aLong346;
		arg0.method9051();
		if (arg1) {
			Static333.method5172(local13);
		}
		Static55.method5000(local13);
		@Pc(36) Class381 local36 = Static69.method899(local17);
		if (local36 != null) {
			Static168.method3312(local36);
		}
		Static367.method5557(-104);
		if (!arg2 && Static635.anInt9910 != -1) {
			Static490.method7251(1, Static635.anInt9910);
		}
		@Pc(66) Class289 local66 = new Class289(Static477.aClass74_31);
		for (@Pc(71) Class6_Sub25 local71 = (Class6_Sub25) local66.method7032(); local71 != null; local71 = (Class6_Sub25) local66.method7033()) {
			if (!local71.method9050()) {
				local71 = (Class6_Sub25) local66.method7032();
				if (local71 == null) {
					return;
				}
			}
			if (local71.anInt5008 == 3) {
				@Pc(96) int local96 = (int) local71.aLong346;
				if (local96 >>> 16 == local13) {
					method2562(local71, true, arg2);
				}
			}
		}
	}
}
