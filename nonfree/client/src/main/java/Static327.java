import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "[I")
	public static int[] anIntArray374;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
	public static int anInt5512;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_94 = new Class349(91, 17);

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Z")
	public static boolean aBoolean433 = false;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!rg;B)I")
	public static int method4750(@OriginalArg(0) Class12_Sub2_Sub1_Sub4 arg0) {
		if (arg0.anInt8395 == 0) {
			return 0;
		}
		@Pc(69) int local69;
		@Pc(62) int local62;
		if (arg0.anInt8424 != -1) {
			@Pc(20) Class12_Sub2_Sub1_Sub4 local20 = null;
			if (arg0.anInt8424 < 32768) {
				@Pc(48) Class2_Sub5 local48 = (Class2_Sub5) Static436.aClass90_26.method1685((long) arg0.anInt8424);
				if (local48 != null) {
					local20 = local48.aClass12_Sub2_Sub1_Sub4_Sub2_1;
				}
			} else if (arg0.anInt8424 >= 32768) {
				local20 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[arg0.anInt8424 - 32768];
			}
			if (local20 != null) {
				local62 = arg0.anInt9374 - local20.anInt9374;
				local69 = arg0.anInt9375 - local20.anInt9375;
				if (local62 != 0 || local69 != 0) {
					arg0.method6763((int) (Math.atan2((double) local62, (double) local69) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class12_Sub2_Sub1_Sub4_Sub1) {
			@Pc(165) Class12_Sub2_Sub1_Sub4_Sub1 local165 = (Class12_Sub2_Sub1_Sub4_Sub1) arg0;
			if (local165.anInt5815 != -1 && (local165.anInt8431 == 0 || local165.anInt8428 > 0)) {
				local165.method6763(local165.anInt5815);
				local165.anInt5815 = -1;
			}
		} else if (arg0 instanceof Class12_Sub2_Sub1_Sub4_Sub2) {
			@Pc(95) Class12_Sub2_Sub1_Sub4_Sub2 local95 = (Class12_Sub2_Sub1_Sub4_Sub2) arg0;
			if (local95.anInt8442 != -1 && (local95.anInt8431 == 0 || local95.anInt8428 > 0)) {
				local62 = local95.anInt9374 - (local95.anInt8442 - Static485.anInt7725 - Static485.anInt7725) * 256;
				local69 = local95.anInt9375 - (local95.anInt8436 - Static310.anInt5129 - Static310.anInt5129) * 256;
				if (local62 != 0 || local69 != 0) {
					local95.method6763((int) (Math.atan2((double) local62, (double) local69) * 2607.5945876176133D) & 0x3FFF);
				}
				local95.anInt8442 = -1;
			}
		}
		return arg0.method6771();
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)Z")
	public static boolean method4752() {
		@Pc(12) Class2 local12 = Static411.aClass70_43.aClass2_39.aClass2_285;
		if (local12 == null || Static411.aClass70_43.aClass2_39 == local12) {
			return false;
		}
		@Pc(23) Class2_Sub27 local23 = (Class2_Sub27) local12;
		if (local23.anInt4323 >= 2000) {
			local23.anInt4323 -= 2000;
		}
		return local23.anInt4323 == 1008;
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(B)V")
	public static void method4753() {
		if (Static417.aClass162_17 == null) {
			return;
		}
		Static224.aClass220_4.method4657();
		Static411.method5545();
		Static429.method5683();
		Static238.method3428();
		Static136.method1878();
		Static50.method863();
		if (Static320.aClass358_1 != null) {
			Static320.aClass358_1.method7469();
		}
		Static50.method864();
		Static507.method6604();
		Static407.method5538();
		Static33.method557();
		Static169.method2209(false);
		for (@Pc(46) int local46 = 0; local46 < 2048; local46++) {
			@Pc(52) Class12_Sub2_Sub1_Sub4_Sub1 local52 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local46];
			if (local52 != null) {
				for (@Pc(56) int local56 = 0; local56 < local52.aClass33Array3.length; local56++) {
					local52.aClass33Array3[local56] = null;
				}
			}
		}
		for (@Pc(81) int local81 = 0; local81 < Static51.anInt912; local81++) {
			@Pc(88) Class12_Sub2_Sub1_Sub4_Sub2 local88 = Static379.aClass2_Sub5Array1[local81].aClass12_Sub2_Sub1_Sub4_Sub2_1;
			if (local88 != null) {
				for (@Pc(92) int local92 = 0; local92 < local88.aClass33Array3.length; local92++) {
					local88.aClass33Array3[local92] = null;
				}
			}
		}
		Static468.aClass25_6 = null;
		Static300.aClass25_4 = null;
		Static417.aClass162_17.method6821();
		Static417.aClass162_17 = null;
	}
}
