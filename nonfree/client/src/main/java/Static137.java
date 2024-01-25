import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!eka", name = "P", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_78 = new Class251(67, 7);

	@OriginalMember(owner = "client!eka", name = "h", descriptor = "(I)V")
	public static void method2081() {
		Static127.aClass144_17.xa(((float) Static181.aClass14_Sub26_9.aClass43_Sub22_1.method6272() * 0.1F + 0.7F) * Static119.aFloat13);
		Static127.aClass144_17.ZA(Static665.anInt10879, Static299.aFloat80, Static241.aFloat73, (float) (Static473.anInt8120 << 2), (float) (Static266.anInt10256 << 2), (float) (Static285.anInt5245 << 2));
		Static127.aClass144_17.method6927(Static581.aClass47_3);
	}

	@OriginalMember(owner = "client!eka", name = "i", descriptor = "(I)V")
	public static void method2082() {
		try {
			@Pc(12) int local12;
			if (Static625.anInt11174 == 1) {
				local12 = Static472.aClass14_Sub1_Sub3_3.method1918();
				if (local12 > 0 && Static472.aClass14_Sub1_Sub3_3.method1889()) {
					local12 -= Static338.anInt5769;
					if (local12 < 0) {
						local12 = 0;
					}
					Static472.aClass14_Sub1_Sub3_3.method1890(local12);
					return;
				}
				Static472.aClass14_Sub1_Sub3_3.method1914();
				Static472.aClass14_Sub1_Sub3_3.method1895();
				if (Static431.aClass310_93 == null) {
					Static625.anInt11174 = 0;
				} else {
					Static625.anInt11174 = 2;
				}
				Static2.aClass226_1 = null;
				Static675.aClass14_Sub28_2 = null;
			}
			if (Static625.anInt11174 == 3) {
				local12 = Static472.aClass14_Sub1_Sub3_3.method1918();
				if (local12 < Static210.anInt3677 && Static472.aClass14_Sub1_Sub3_3.method1889()) {
					local12 += Static184.anInt7568;
					if (Static210.anInt3677 < local12) {
						local12 = Static210.anInt3677;
					}
					Static472.aClass14_Sub1_Sub3_3.method1890(local12);
					return;
				}
				Static625.anInt11174 = 0;
				Static184.anInt7568 = 0;
			}
		} catch (@Pc(110) Exception local110) {
			local110.printStackTrace();
			Static472.aClass14_Sub1_Sub3_3.method1914();
			Static431.aClass310_93 = null;
			Static675.aClass14_Sub28_2 = null;
			Static2.aClass226_1 = null;
			Static556.aClass14_Sub1_Sub3_4 = null;
			Static625.anInt11174 = 0;
		}
	}
}
