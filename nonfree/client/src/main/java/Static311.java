import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!kga", name = "f", descriptor = "Lclient!in;")
	public static final Class169 aClass169_150 = new Class169(83, -1);

	@OriginalMember(owner = "client!kga", name = "i", descriptor = "I")
	public static int anInt5615 = 0;

	@OriginalMember(owner = "client!kga", name = "k", descriptor = "Lclient!in;")
	public static final Class169 aClass169_151 = new Class169(50, -2);

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IILclient!ha;B)V")
	public static void method5095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class101 arg2) {
		Static347.aClass363ArrayArray1 = new Class363[arg1][arg0];
		Static595.aClass101_14 = arg2;
		if (Static345.anIntArray317 != null) {
			Static218.aClass3_1 = Static517.method8015(Static345.anIntArray317[4], Static345.anIntArray317[5], Static345.anIntArray317[0], Static345.anIntArray317[2], Static345.anIntArray317[3], Static345.anIntArray317[1]);
		}
		Static50.aClass363_1 = new Class363();
		Static169.method3350();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!sv;BLclient!jf;)Lclient!vi;")
	public static Class2_Sub52 method5098(@OriginalArg(0) Class341 arg0, @OriginalArg(2) Class179 arg1) {
		@Pc(6) Class2_Sub52 local6 = Static512.method7980();
		local6.aClass341_108 = arg0;
		local6.anInt10946 = arg0.anInt9728;
		if (local6.anInt10946 == -1) {
			local6.aClass2_Sub8_Sub2_2 = new Class2_Sub8_Sub2(260);
		} else if (local6.anInt10946 == -2) {
			local6.aClass2_Sub8_Sub2_2 = new Class2_Sub8_Sub2(10000);
		} else if (local6.anInt10946 <= 18) {
			local6.aClass2_Sub8_Sub2_2 = new Class2_Sub8_Sub2(20);
		} else if (local6.anInt10946 <= 98) {
			local6.aClass2_Sub8_Sub2_2 = new Class2_Sub8_Sub2(100);
		} else {
			local6.aClass2_Sub8_Sub2_2 = new Class2_Sub8_Sub2(260);
		}
		local6.aClass2_Sub8_Sub2_2.method5232(arg1);
		local6.aClass2_Sub8_Sub2_2.method5241(local6.aClass341_108.method8531());
		local6.anInt10944 = 0;
		return local6;
	}
}
