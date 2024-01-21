import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ld", name = "U", descriptor = "Lclient!wc;")
	public static Class1_Sub2_Sub8_Sub5 aClass1_Sub2_Sub8_Sub5_25;

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_732 = Static81.method1507("p12_full");

	@OriginalMember(owner = "client!ld", name = "L", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_733 = Static81.method1507("::");

	@OriginalMember(owner = "client!ld", name = "cb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_735 = Static81.method1507("Your account has been disabled)3");

	@OriginalMember(owner = "client!ld", name = "Z", descriptor = "Lclient!dj;")
	public static Class24 aClass24_734 = aClass24_735;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	public static void method1890() {
		Static192.aClass1_Sub7_Sub1_31.method2809();
		@Pc(13) int local13 = Static192.aClass1_Sub7_Sub1_31.method2811(8);
		@Pc(22) int local22;
		if (local13 < Static138.anInt3107) {
			for (local22 = local13; local22 < Static138.anInt3107; local22++) {
				Static57.anIntArray125[Static160.anInt4675++] = Static138.anIntArray254[local22];
			}
		}
		if (Static138.anInt3107 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static138.anInt3107 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(60) int local60 = Static138.anIntArray254[local22];
			@Pc(64) Class5_Sub2_Sub2 local64 = Static148.aClass5_Sub2_Sub2Array1[local60];
			@Pc(69) int local69 = Static192.aClass1_Sub7_Sub1_31.method2811(1);
			if (local69 == 0) {
				Static138.anIntArray254[Static138.anInt3107++] = local60;
				local64.anInt2489 = Static42.anInt1100;
			} else {
				@Pc(89) int local89 = Static192.aClass1_Sub7_Sub1_31.method2811(2);
				if (local89 == 0) {
					Static138.anIntArray254[Static138.anInt3107++] = local60;
					local64.anInt2489 = Static42.anInt1100;
					Static127.anIntArray222[Static24.anInt663++] = local60;
				} else {
					@Pc(131) int local131;
					@Pc(141) int local141;
					if (local89 == 1) {
						Static138.anIntArray254[Static138.anInt3107++] = local60;
						local64.anInt2489 = Static42.anInt1100;
						local131 = Static192.aClass1_Sub7_Sub1_31.method2811(3);
						local64.method1892(false, local131);
						local141 = Static192.aClass1_Sub7_Sub1_31.method2811(1);
						if (local141 == 1) {
							Static127.anIntArray222[Static24.anInt663++] = local60;
						}
					} else if (local89 == 2) {
						Static138.anIntArray254[Static138.anInt3107++] = local60;
						local64.anInt2489 = Static42.anInt1100;
						local131 = Static192.aClass1_Sub7_Sub1_31.method2811(3);
						local64.method1892(true, local131);
						local141 = Static192.aClass1_Sub7_Sub1_31.method2811(3);
						local64.method1892(true, local141);
						@Pc(193) int local193 = Static192.aClass1_Sub7_Sub1_31.method2811(1);
						if (local193 == 1) {
							Static127.anIntArray222[Static24.anInt663++] = local60;
						}
					} else if (local89 == 3) {
						Static57.anIntArray125[Static160.anInt4675++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!ve;Lclient!ve;)I")
	public static int method1891(@OriginalArg(1) Class69 arg0, @OriginalArg(2) Class69 arg1) {
		@Pc(13) int local13 = 0;
		if (arg0.method2209(Static140.anInt3138)) {
			local13++;
		}
		if (arg1.method2209(Static126.anInt2768)) {
			local13++;
		}
		if (arg1.method2209(Static55.anInt1378)) {
			local13++;
		}
		if (arg1.method2209(Static114.anInt2567)) {
			local13++;
		}
		if (arg1.method2209(Static111.anInt2531)) {
			local13++;
		}
		if (arg1.method2209(Static195.anInt4329)) {
			local13++;
		}
		arg1.method2209(Static16.anInt379);
		arg1.method2209(Static147.anInt3282);
		arg1.method2209(Static125.anInt2736);
		arg1.method2209(Static145.anInt3265);
		arg1.method2209(Static134.anInt2974);
		return local13;
	}
}
