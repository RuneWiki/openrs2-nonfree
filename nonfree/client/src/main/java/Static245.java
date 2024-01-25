import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!pn", name = "Qc", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_178 = new Class198(50);

	@OriginalMember(owner = "client!pn", name = "Xc", descriptor = "I")
	public static int anInt5012 = 0;

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "(B)V")
	public static void method4352() {
		Static127.aClass4_Sub11_Sub1_3.method705();
		@Pc(13) int local13 = Static127.aClass4_Sub11_Sub1_3.method711(8);
		@Pc(18) int local18;
		if (local13 < Static145.anInt3273) {
			for (local18 = local13; local18 < Static145.anInt3273; local18++) {
				Static227.anIntArray51[Static212.anInt2908++] = Static354.anIntArray510[local18];
			}
		}
		if (Static145.anInt3273 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static145.anInt3273 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(61) int local61 = Static354.anIntArray510[local18];
			@Pc(65) Class8_Sub1_Sub2_Sub2 local65 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local61];
			@Pc(70) int local70 = Static127.aClass4_Sub11_Sub1_3.method711(1);
			if (local70 == 0) {
				Static354.anIntArray510[Static145.anInt3273++] = local61;
				local65.anInt4940 = Static199.anInt4137;
			} else {
				@Pc(90) int local90 = Static127.aClass4_Sub11_Sub1_3.method711(2);
				if (local90 == 0) {
					Static354.anIntArray510[Static145.anInt3273++] = local61;
					local65.anInt4940 = Static199.anInt4137;
					Static311.anIntArray474[Static244.anInt4894++] = local61;
				} else {
					@Pc(137) int local137;
					@Pc(149) int local149;
					if (local90 == 1) {
						Static354.anIntArray510[Static145.anInt3273++] = local61;
						local65.anInt4940 = Static199.anInt4137;
						local137 = Static127.aClass4_Sub11_Sub1_3.method711(3);
						local65.method4353(1, local137);
						local149 = Static127.aClass4_Sub11_Sub1_3.method711(1);
						if (local149 == 1) {
							Static311.anIntArray474[Static244.anInt4894++] = local61;
						}
					} else if (local90 == 2) {
						Static354.anIntArray510[Static145.anInt3273++] = local61;
						local65.anInt4940 = Static199.anInt4137;
						if (Static127.aClass4_Sub11_Sub1_3.method711(1) == 1) {
							local137 = Static127.aClass4_Sub11_Sub1_3.method711(3);
							local65.method4353(2, local137);
							local149 = Static127.aClass4_Sub11_Sub1_3.method711(3);
							local65.method4353(2, local149);
						} else {
							local137 = Static127.aClass4_Sub11_Sub1_3.method711(3);
							local65.method4353(0, local137);
						}
						local137 = Static127.aClass4_Sub11_Sub1_3.method711(1);
						if (local137 == 1) {
							Static311.anIntArray474[Static244.anInt4894++] = local61;
						}
					} else if (local90 == 3) {
						Static227.anIntArray51[Static212.anInt2908++] = local61;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)I")
	public static int method4355(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(III)V")
	public static void method4358(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static341.anIntArray9[arg1] = arg0;
		@Pc(21) Class4_Sub13 local21 = (Class4_Sub13) Static108.aClass43_13.method1273((long) arg1);
		if (local21 == null) {
			local21 = new Class4_Sub13(4611686018427387905L);
			Static108.aClass43_13.method1276(local21, (long) arg1);
		} else if (local21.aLong45 != 4611686018427387905L) {
			local21.aLong45 = Static208.method3879() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIB)V")
	public static void method4360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static349.anInt6619 <= arg2 && Static195.anInt4097 >= arg2) {
			@Pc(13) int local13 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg3);
			@Pc(19) int local19 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg1);
			Static96.method5421(arg0, local13, local19, arg2);
		}
	}
}
