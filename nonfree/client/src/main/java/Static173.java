import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!haa", name = "f", descriptor = "Lclient!gaa;")
	public static Class102 aClass102_3;

	@OriginalMember(owner = "client!haa", name = "o", descriptor = "I")
	public static int anInt3085;

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "Lclient!im;")
	public static final Class140 aClass140_57 = new Class140(101, 7);

	@OriginalMember(owner = "client!haa", name = "n", descriptor = "[I")
	public static final int[] anIntArray290 = new int[13];

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)V")
	public static void method2613() {
		try {
			if (Static302.anInt5579 == 1) {
				@Pc(14) int local14 = Static106.aClass1_Sub16_Sub3_1.method5263();
				if (local14 > 0 && Static106.aClass1_Sub16_Sub3_1.method5244()) {
					local14 -= Static101.anInt7631;
					if (local14 < 0) {
						local14 = 0;
					}
					Static106.aClass1_Sub16_Sub3_1.method5254(local14);
					return;
				}
				Static106.aClass1_Sub16_Sub3_1.method5253();
				Static106.aClass1_Sub16_Sub3_1.method5268();
				Static181.aClass1_Sub21_1 = null;
				if (Static351.aClass171_102 == null) {
					Static302.anInt5579 = 0;
				} else {
					Static302.anInt5579 = 2;
				}
				Static545.aClass258_1 = null;
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static106.aClass1_Sub16_Sub3_1.method5253();
			Static545.aClass258_1 = null;
			Static302.anInt5579 = 0;
			Static351.aClass171_102 = null;
			Static181.aClass1_Sub21_1 = null;
		}
	}
}
