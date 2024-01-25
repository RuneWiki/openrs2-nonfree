import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!mda", name = "I", descriptor = "I")
	public static int anInt5413 = -1;

	@OriginalMember(owner = "client!mda", name = "J", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_166 = new Class202("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!mda", name = "P", descriptor = "Lclient!qc;")
	public static final Class231 aClass231_46 = new Class231(8);

	@OriginalMember(owner = "client!mda", name = "Q", descriptor = "I")
	public static int anInt5419 = -1;

	@OriginalMember(owner = "client!mda", name = "g", descriptor = "(I)V")
	public static void method4658() {
		try {
			if (Static517.anInt9002 == 1) {
				@Pc(14) int local14 = Static519.aClass2_Sub12_Sub1_3.method1019();
				if (local14 > 0 && Static519.aClass2_Sub12_Sub1_3.method1027()) {
					local14 -= Static473.anInt8462;
					if (local14 < 0) {
						local14 = 0;
					}
					Static519.aClass2_Sub12_Sub1_3.method1028(local14);
				} else {
					Static519.aClass2_Sub12_Sub1_3.method1005();
					Static519.aClass2_Sub12_Sub1_3.method1039();
					Static147.aClass2_Sub8_2 = null;
					if (Static289.aClass53_83 == null) {
						Static517.anInt9002 = 0;
					} else {
						Static517.anInt9002 = 2;
					}
					Static162.aClass108_1 = null;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static519.aClass2_Sub12_Sub1_3.method1005();
			Static289.aClass53_83 = null;
			Static162.aClass108_1 = null;
			Static517.anInt9002 = 0;
			Static147.aClass2_Sub8_2 = null;
		}
	}
}
