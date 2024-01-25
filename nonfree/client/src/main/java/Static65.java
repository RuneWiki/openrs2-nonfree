import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cda", name = "n", descriptor = "Lclient!jd;")
	public static Class20 aClass20_3;

	@OriginalMember(owner = "client!cda", name = "v", descriptor = "I")
	public static int anInt1519;

	@OriginalMember(owner = "client!cda", name = "o", descriptor = "I")
	public static int anInt1515 = 0;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
	public static void method1316() {
		@Pc(8) Class14_Sub30 local8 = (Class14_Sub30) Static425.aClass262_44.method6318();
		@Pc(21) boolean local21 = Static299.aClass230_4 != null || Static119.anInt2451 > 0;
		@Pc(25) int local25 = local8.method8578();
		@Pc(31) int local31 = local8.method8571();
		if (local21) {
			Static277.anInt4826 = 1;
		}
		if (local21) {
			Static633.aClass14_Sub3_Sub11_3 = Static12.aClass14_Sub3_Sub11_1;
		} else {
			Static192.method2991(local25, local31, Static12.aClass14_Sub3_Sub11_1);
		}
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)V")
	public static void method1317() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static70.aClass175Array1[local3] = null;
		}
		Static37.anInt990 = 0;
	}
}
