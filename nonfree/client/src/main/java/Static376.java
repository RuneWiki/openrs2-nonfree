import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!pp", name = "n", descriptor = "[Lclient!ha;")
	public static Class35[] aClass35Array31;

	@OriginalMember(owner = "client!pp", name = "C", descriptor = "[I")
	public static int[] anIntArray566;

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_69 = new Class243(26, 8);

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "Lclient!pn;")
	public static final Class224 aClass224_4 = new Class224();

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
	public static int anInt6978 = 0;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	public static void method5913() {
		Static16.anInt362 = 0;
		for (@Pc(16) int local16 = 0; local16 < 2048; local16++) {
			Static12.aClass2_Sub29Array1[local16] = null;
			Static452.aByteArray107[local16] = 1;
			Static370.aClass317Array1[local16] = null;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!cd;B)I")
	public static int method5914(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		if (arg0.anInt5082 == 0) {
			return 0;
		}
		@Pc(68) int local68;
		@Pc(61) int local61;
		if (arg0.anInt5062 != -1) {
			@Pc(22) Class1_Sub1_Sub2 local22 = null;
			if (arg0.anInt5062 < 32768) {
				@Pc(36) Class2_Sub11 local36 = (Class2_Sub11) Static71.aClass127_13.method3205((long) arg0.anInt5062);
				if (local36 != null) {
					local22 = local36.aClass1_Sub1_Sub2_Sub2_1;
				}
			} else if (arg0.anInt5062 >= 32768) {
				local22 = Static278.aClass1_Sub1_Sub2_Sub1Array1[arg0.anInt5062 - 32768];
			}
			if (local22 != null) {
				local61 = arg0.anInt7660 - local22.anInt7660;
				local68 = arg0.anInt7659 - local22.anInt7659;
				if (local61 != 0 || local68 != 0) {
					arg0.method4380((int) (Math.atan2((double) local61, (double) local68) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class1_Sub1_Sub2_Sub1) {
			@Pc(161) Class1_Sub1_Sub2_Sub1 local161 = (Class1_Sub1_Sub2_Sub1) arg0;
			if (local161.anInt3271 != -1 && (local161.anInt5102 == 0 || local161.anInt5104 > 0)) {
				local161.method4380(local161.anInt3271);
				local161.anInt3271 = -1;
			}
		} else if (arg0 instanceof Class1_Sub1_Sub2_Sub2) {
			@Pc(97) Class1_Sub1_Sub2_Sub2 local97 = (Class1_Sub1_Sub2_Sub2) arg0;
			if (local97.anInt5107 != -1 && (local97.anInt5102 == 0 || local97.anInt5104 > 0)) {
				local61 = local97.anInt7660 - (local97.anInt5107 - Static238.anInt4280 - Static238.anInt4280) * 64;
				local68 = local97.anInt7659 - (local97.anInt5119 - Static371.anInt6936 - Static371.anInt6936) * 64;
				if (local61 != 0 || local68 != 0) {
					local97.method4380((int) (Math.atan2((double) local61, (double) local68) * 2607.5945876176133D) & 0x3FFF);
				}
				local97.anInt5107 = -1;
			}
		}
		return arg0.method4381();
	}
}
