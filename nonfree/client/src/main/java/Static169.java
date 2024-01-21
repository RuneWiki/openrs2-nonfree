import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
	public static int anInt658;

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
	public static int anInt674;

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
	public static int anInt683;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "Lclient!eh;")
	private static Class28 aClass28_253 = Static170.method3101("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!ve", name = "C", descriptor = "Lclient!eh;")
	public static Class28 aClass28_254 = aClass28_253;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public static void method649() {
		@Pc(8) int local8 = Static18.aClass3_Sub8_Sub1_1.method1557(8);
		if (Static112.anInt2872 > local8) {
			for (@Pc(17) int local17 = local8; local17 < Static112.anInt2872; local17++) {
				Static93.anIntArray446[Static80.anInt3606++] = Static126.anIntArray557[local17];
			}
		}
		if (local8 > Static112.anInt2872) {
			throw new RuntimeException("gppov1");
		}
		Static112.anInt2872 = 0;
		for (@Pc(60) int local60 = 0; local60 < local8; local60++) {
			@Pc(65) int local65 = Static126.anIntArray557[local60];
			@Pc(69) Class3_Sub2_Sub1_Sub2_Sub1 local69 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local65];
			@Pc(74) int local74 = Static18.aClass3_Sub8_Sub1_1.method1557(1);
			if (local74 == 0) {
				Static126.anIntArray557[Static112.anInt2872++] = local65;
				local69.anInt1830 = Static14.anInt481;
			} else {
				@Pc(96) int local96 = Static18.aClass3_Sub8_Sub1_1.method1557(2);
				if (local96 == 0) {
					Static126.anIntArray557[Static112.anInt2872++] = local65;
					local69.anInt1830 = Static14.anInt481;
					Static171.anIntArray684[Static81.anInt2370++] = local65;
				} else {
					@Pc(142) int local142;
					@Pc(152) int local152;
					if (local96 == 1) {
						Static126.anIntArray557[Static112.anInt2872++] = local65;
						local69.anInt1830 = Static14.anInt481;
						local142 = Static18.aClass3_Sub8_Sub1_1.method1557(3);
						local69.method1437(local142, false);
						local152 = Static18.aClass3_Sub8_Sub1_1.method1557(1);
						if (local152 == 1) {
							Static171.anIntArray684[Static81.anInt2370++] = local65;
						}
					} else if (local96 == 2) {
						Static126.anIntArray557[Static112.anInt2872++] = local65;
						local69.anInt1830 = Static14.anInt481;
						local142 = Static18.aClass3_Sub8_Sub1_1.method1557(3);
						local69.method1437(local142, true);
						local152 = Static18.aClass3_Sub8_Sub1_1.method1557(3);
						local69.method1437(local152, true);
						@Pc(207) int local207 = Static18.aClass3_Sub8_Sub1_1.method1557(1);
						if (local207 == 1) {
							Static171.anIntArray684[Static81.anInt2370++] = local65;
						}
					} else if (local96 == 3) {
						Static93.anIntArray446[Static80.anInt3606++] = local65;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
	public static void method657() {
		aClass28_254 = null;
		aClass28_253 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZJ)V")
	public static void method658(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(9) InterruptedException local9) {
		}
	}
}
