import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "Z")
	public static boolean aBoolean111 = false;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString60 = "Loading config - ";

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
	public static void method1526(@OriginalArg(1) int arg0) {
		Static206.anInt4587 = -1;
		Static87.anInt2033 = arg0;
		Static5.anInt145 = -1;
		Static104.method850();
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)I")
	public static int method1527() {
		return Static241.anInt5295;
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V")
	public static void method1529() {
		for (@Pc(3) int local3 = 0; local3 < Static111.anInt2392; local3++) {
			@Pc(14) int local14 = Static116.anIntArray248[local3]--;
			if (Static116.anIntArray248[local3] >= -10) {
				@Pc(90) Class118 local90 = Static49.aClass118Array1[local3];
				if (local90 == null) {
					local90 = Static307.method3527(Static80.aClass83_49, Static128.anIntArray263[local3], 0);
					if (local90 == null) {
						continue;
					}
					Static116.anIntArray248[local3] += local90.method3525();
					Static49.aClass118Array1[local3] = local90;
				}
				if (Static116.anIntArray248[local3] < 0) {
					@Pc(224) int local224;
					if (Static222.anIntArray513[local3] == 0) {
						local224 = Static40.anIntArray202[local3] * Static11.anInt2931 >> 8;
					} else {
						@Pc(135) int local135 = Static222.anIntArray513[local3] >> 16 & 0xFF;
						@Pc(143) int local143 = (Static222.anIntArray513[local3] & 0xFF) * 128;
						@Pc(153) int local153 = local135 * 128 + 64 - Static239.aClass25_Sub1_Sub1_2.anInt1635;
						@Pc(161) int local161 = Static222.anIntArray513[local3] >> 8 & 0xFF;
						if (local153 < 0) {
							local153 = -local153;
						}
						@Pc(178) int local178 = local161 * 128 + 64 - Static239.aClass25_Sub1_Sub1_2.anInt1604;
						if (local178 < 0) {
							local178 = -local178;
						}
						@Pc(192) int local192 = local153 + local178 - 128;
						if (local143 < local192) {
							Static116.anIntArray248[local3] = -100;
							continue;
						}
						if (local192 < 0) {
							local192 = 0;
						}
						local224 = Static210.anInt4682 * (local143 - local192) * Static40.anIntArray202[local3] / local143 >> 8;
					}
					if (local224 > 0) {
						@Pc(242) Class1_Sub4_Sub1 local242 = local90.method3526().method3838(Static161.aClass135_1);
						@Pc(247) Class1_Sub3_Sub4 local247 = Static304.method2549(local242, local224);
						local247.method2583(Static13.anIntArray22[local3] - 1);
						Static245.aClass1_Sub3_Sub1_2.method522(local247);
					}
					Static116.anIntArray248[local3] = -100;
				}
			} else {
				Static111.anInt2392--;
				for (@Pc(29) int local29 = local3; local29 < Static111.anInt2392; local29++) {
					Static128.anIntArray263[local29] = Static128.anIntArray263[local29 + 1];
					Static49.aClass118Array1[local29] = Static49.aClass118Array1[local29 + 1];
					Static13.anIntArray22[local29] = Static13.anIntArray22[local29 + 1];
					Static116.anIntArray248[local29] = Static116.anIntArray248[local29 + 1];
					Static222.anIntArray513[local29] = Static222.anIntArray513[local29 + 1];
					Static40.anIntArray202[local29] = Static40.anIntArray202[local29 + 1];
				}
				local3--;
			}
		}
		if (Static191.aBoolean212 && !Static233.method4058()) {
			if (Static239.anInt5264 != 0 && Static282.anInt6020 != -1) {
				Static66.method2992(Static210.aClass83_139, Static239.anInt5264, Static282.anInt6020);
			}
			Static191.aBoolean212 = false;
		} else if (Static239.anInt5264 != 0 && Static282.anInt6020 != -1 && !Static233.method4058()) {
			Static81.aClass1_Sub16_Sub1_1.method2676(187);
			Static81.aClass1_Sub16_Sub1_1.method2606(Static282.anInt6020);
			Static282.anInt6020 = -1;
		}
	}
}
