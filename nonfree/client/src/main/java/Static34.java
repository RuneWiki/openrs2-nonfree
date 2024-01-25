import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "Lclient!vfa;")
	public static Class357 aClass357_1;

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "Lclient!uk;")
	public static Class346 aClass346_2;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
	public static void method637() {
		try {
			@Pc(12) int local12;
			if (Static571.anInt9391 == 1) {
				local12 = Static275.aClass5_Sub16_Sub1_5.method2572();
				if (local12 > 0 && Static275.aClass5_Sub16_Sub1_5.method2569()) {
					local12 -= Static3.anInt29;
					if (local12 < 0) {
						local12 = 0;
					}
					Static275.aClass5_Sub16_Sub1_5.method2567(local12);
					return;
				}
				Static275.aClass5_Sub16_Sub1_5.method2574();
				Static275.aClass5_Sub16_Sub1_5.method2564();
				Static80.aClass173_1 = null;
				Static388.aClass5_Sub45_2 = null;
				if (Static166.aClass384_43 == null) {
					Static571.anInt9391 = 0;
				} else {
					Static571.anInt9391 = 2;
				}
			}
			if (Static571.anInt9391 == 3) {
				local12 = Static275.aClass5_Sub16_Sub1_5.method2572();
				if (Static210.anInt3640 > local12 && Static275.aClass5_Sub16_Sub1_5.method2569()) {
					local12 += Static598.anInt9770;
					if (Static210.anInt3640 < local12) {
						local12 = Static210.anInt3640;
					}
					Static275.aClass5_Sub16_Sub1_5.method2567(local12);
				} else {
					Static598.anInt9770 = 0;
					Static571.anInt9391 = 0;
				}
			}
		} catch (@Pc(98) Exception local98) {
			local98.printStackTrace();
			Static275.aClass5_Sub16_Sub1_5.method2574();
			Static166.aClass384_43 = null;
			Static571.anInt9391 = 0;
			Static388.aClass5_Sub45_2 = null;
			Static583.aClass5_Sub16_Sub1_6 = null;
			Static80.aClass173_1 = null;
		}
	}
}
