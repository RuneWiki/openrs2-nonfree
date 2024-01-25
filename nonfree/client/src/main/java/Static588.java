import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!ed;Z)I")
	public static int method7845(@OriginalArg(0) Class84 arg0) {
		if (Static587.aClass84_6 == arg0) {
			return 5890;
		} else if (Static328.aClass84_3 == arg0) {
			return 34167;
		} else if (arg0 == Static266.aClass84_5) {
			return 34168;
		} else if (arg0 == Static135.aClass84_1) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!kba;B)V")
	public static void method7846(@OriginalArg(0) Class20_Sub2_Sub4_Sub1_Sub1 arg0) {
		@Pc(17) Class1_Sub30 local17 = (Class1_Sub30) Static332.aClass356_27.method7796((long) arg0.anInt6407);
		if (local17 == null) {
			Static140.method2298(arg0.aByte116, arg0, null, 0, arg0.anIntArray437[0], arg0.anIntArray436[0], null);
		} else {
			local17.method4968();
		}
	}
}
