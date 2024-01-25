import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "Lclient!e;")
	public static Class46 aClass46_7;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
	public static void method4488() {
		if (Static218.aClass46_5 == null) {
			return;
		}
		Static184.aClass126_4.method3398();
		Static57.method1296();
		Static255.method4392();
		Static272.method4617();
		Static106.method2291();
		Static298.method5083();
		if (Static253.aClass208_2 != null) {
			Static253.aClass208_2.method5822();
		}
		Static132.method2702();
		Static244.method4283();
		Static4.method122();
		Static297.method5075(false);
		Static215.method3861();
		for (@Pc(42) int local42 = 0; local42 < 2048; local42++) {
			@Pc(48) Class10_Sub3_Sub3_Sub2 local48 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local42];
			if (local48 != null) {
				local48.anInterface7_3 = null;
				for (@Pc(55) int local55 = 0; local55 < local48.aClass45Array3.length; local55++) {
					local48.aClass45Array3[local55] = null;
				}
			}
		}
		for (@Pc(76) int local76 = 0; local76 < Static266.aClass10_Sub3_Sub3_Sub1Array1.length; local76++) {
			@Pc(82) Class10_Sub3_Sub3_Sub1 local82 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local76];
			if (local82 != null) {
				for (@Pc(86) int local86 = 0; local86 < local82.aClass45Array3.length; local86++) {
					local82.aClass45Array3[local86] = null;
				}
			}
		}
		Static218.aClass46_5.method5158();
		Static218.aClass46_5 = null;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Lclient!tg;")
	public static Class194 method4489(@OriginalArg(1) int arg0) {
		@Pc(10) Class194 local10 = (Class194) Static117.aClass11_120.method209((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static68.aClass143_40.method3745(31, arg0);
		local10 = new Class194();
		if (local20 != null) {
			local10.method5307(new Class14_Sub4(local20), arg0);
		}
		Static117.aClass11_120.method219((long) arg0, local10);
		return local10;
	}
}
