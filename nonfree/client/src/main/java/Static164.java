import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "Lclient!mm;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
	public static int anInt3165;

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method2935(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static330.anInt6194; local19++) {
			if (arg0.equalsIgnoreCase(Static163.aStringArray18[local19])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static107.aClass20_Sub1_Sub1_Sub1_1.aString13);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIZZ)V")
	public static void method2938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && arg0 == Static388.anInt6883 && arg1 == Static225.anInt4357 && (Static514.anInt9103 == Static322.anInt6113 || Static286.aClass1_Sub15_Sub1_1.method6381(Static449.anInt7876))) {
			return;
		}
		Static514.anInt9103 = Static322.anInt6113;
		Static225.anInt4357 = arg1;
		Static388.anInt6883 = arg0;
		if (Static286.aClass1_Sub15_Sub1_1.method6381(Static449.anInt7876)) {
			Static514.anInt9103 = 0;
		}
		Static506.method7745(arg2);
		Static433.method6712(Static246.aClass45_71.method1474(Static544.anInt7853), true, Static186.aClass36_1);
		@Pc(56) int local56 = Static538.anInt9485;
		Static538.anInt9485 = (Static388.anInt6883 - (Static237.anInt4563 >> 4)) * 8;
		@Pc(67) int local67 = Static282.anInt5380;
		Static282.anInt5380 = (Static225.anInt4357 - (Static373.anInt6694 >> 4)) * 8;
		Static220.aClass1_Sub2_Sub12_1 = Static335.method4559(Static388.anInt6883 * 8, Static225.anInt4357 * 8);
		Static260.aClass214_3 = null;
		@Pc(95) int local95 = Static538.anInt9485 - local56;
		@Pc(100) int local100 = Static282.anInt5380 - local67;
		@Pc(121) int local121;
		@Pc(123) int local123;
		@Pc(174) int local174;
		@Pc(287) int local287;
		if (arg2 == 10) {
			for (local287 = 0; local287 < Static342.anInt6322; local287++) {
				@Pc(293) Class1_Sub41 local293 = Static35.aClass1_Sub41Array1[local287];
				if (local293 != null) {
					@Pc(298) Class20_Sub1_Sub1_Sub2 local298 = local293.aClass20_Sub1_Sub1_Sub2_2;
					for (local123 = 0; local123 < 10; local123++) {
						local298.anIntArray780[local123] -= local95;
						local298.anIntArray781[local123] -= local100;
					}
					local298.anInt8949 -= local100 * 128;
					local298.anInt8954 -= local95 * 128;
				}
			}
		} else {
			Static141.anInt2822 = 0;
			@Pc(109) boolean local109 = false;
			@Pc(115) int local115 = Static237.anInt4563 * 128 - 128;
			local121 = (Static373.anInt6694 - 1) * 128;
			for (local123 = 0; local123 < Static342.anInt6322; local123++) {
				@Pc(129) Class1_Sub41 local129 = Static35.aClass1_Sub41Array1[local123];
				if (local129 != null) {
					@Pc(134) Class20_Sub1_Sub1_Sub2 local134 = local129.aClass20_Sub1_Sub1_Sub2_2;
					local134.anInt8954 -= local95 * 128;
					local134.anInt8949 -= local100 * 128;
					if (local134.anInt8954 >= 0 && local134.anInt8954 <= local115 && local134.anInt8949 >= 0 && local134.anInt8949 <= local121) {
						@Pc(172) boolean local172 = true;
						for (local174 = 0; local174 < 10; local174++) {
							local134.anIntArray780[local174] -= local95;
							local134.anIntArray781[local174] -= local100;
							if (local134.anIntArray780[local174] < 0 || local134.anIntArray780[local174] >= Static237.anInt4563 || local134.anIntArray781[local174] < 0 || local134.anIntArray781[local174] >= Static373.anInt6694) {
								local172 = false;
							}
						}
						if (local172) {
							Static220.anIntArray339[Static141.anInt2822++] = local134.anInt8969;
						} else {
							local134.method7826(null);
							local129.method8239();
							local109 = true;
						}
					} else {
						local134.method7826(null);
						local109 = true;
						local129.method8239();
					}
				}
			}
			if (local109) {
				Static342.anInt6322 = Static362.aClass230_46.method6138();
				Static362.aClass230_46.method6143(Static35.aClass1_Sub41Array1);
			}
		}
		for (local287 = 0; local287 < 2048; local287++) {
			@Pc(356) Class20_Sub1_Sub1_Sub1 local356 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local287];
			if (local356 != null) {
				for (local121 = 0; local121 < 10; local121++) {
					local356.anIntArray780[local121] -= local95;
					local356.anIntArray781[local121] -= local100;
				}
				local356.anInt8949 -= local100 * 128;
				local356.anInt8954 -= local95 * 128;
			}
		}
		@Pc(406) Class248[] local406 = Static261.aClass248Array1;
		for (local121 = 0; local121 < local406.length; local121++) {
			@Pc(414) Class248 local414 = local406[local121];
			if (local414 != null) {
				local414.anInt7264 -= local100 * 128;
				local414.anInt7261 -= local95 * 128;
			}
		}
		for (@Pc(446) Class1_Sub46 local446 = (Class1_Sub46) Static30.aClass295_6.method7543(); local446 != null; local446 = (Class1_Sub46) Static30.aClass295_6.method7540()) {
			local446.anInt7922 -= local100;
			local446.anInt7932 -= local95;
			if (Static61.anInt1489 != 4 && (local446.anInt7932 < 0 || local446.anInt7922 < 0 || local446.anInt7932 >= Static237.anInt4563 || local446.anInt7922 >= Static373.anInt6694)) {
				local446.method8239();
			}
		}
		if (Static61.anInt1489 != 4) {
			for (@Pc(510) Class1_Sub20 local510 = (Class1_Sub20) Static4.aClass230_2.method6137(); local510 != null; local510 = (Class1_Sub20) Static4.aClass230_2.method6140()) {
				@Pc(518) int local518 = (int) (local510.aLong251 & 0x3FFFL);
				@Pc(522) int local522 = local518 - Static538.anInt9485;
				local174 = (int) (local510.aLong251 >> 14 & 0x3FFFL);
				@Pc(535) int local535 = local174 - Static282.anInt5380;
				if (local522 < 0 || local535 < 0 || Static237.anInt4563 <= local522 || local535 >= Static373.anInt6694) {
					local510.method8239();
				}
			}
		}
		if (Static52.anInt4659 != 0) {
			Static259.anInt5037 -= local100;
			Static52.anInt4659 -= local95;
		}
		Static155.method2852();
		if (arg2 != 10) {
			Static321.anInt6064 -= local95 * 128;
			Static526.anInt9307 -= local95;
			Static460.anInt7959 -= local100;
			Static241.anInt4647 -= local95;
			Static28.anInt771 -= local100;
			Static46.anInt1256 -= local100 * 128;
			if (Math.abs(local95) > Static237.anInt4563 || Math.abs(local100) > Static373.anInt6694) {
				Static22.method601();
			}
		} else if (Static170.anInt3418 == 4) {
			Static181.anInt3812 -= local100 * 128;
			Static60.anInt1483 -= local100 * 128;
			Static397.anInt6990 -= local95 * 128;
			Static341.anInt6297 -= local95 * 128;
		} else {
			Static170.anInt3418 = 1;
		}
		Static409.method6500();
		Static293.method7812();
		Static330.aClass295_36.method7541();
		Static8.aClass295_3.method7541();
		Static16.aClass184_50.method5136();
		Static395.method6265();
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(FIIILclient!tp;IFBFFF)[B")
	public static byte[] method2942(@OriginalArg(0) float arg0, @OriginalArg(4) Class157 arg1, @OriginalArg(6) float arg2, @OriginalArg(8) float arg3, @OriginalArg(9) float arg4, @OriginalArg(10) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static198.method3757(arg3, 0, arg0, arg2, arg5, arg1, local10, arg4);
		return local10;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIILclient!bq;Lclient!bq;)V")
	public static void method2943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20_Sub2 arg3, @OriginalArg(4) Class20_Sub2 arg4) {
		@Pc(4) Class64 local4 = Static442.method6845(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass20_Sub2_1 = arg3;
			local4.aClass20_Sub2_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZB)Z")
	public static boolean method2944(@OriginalArg(0) boolean arg0) {
		@Pc(6) boolean local6 = Static455.aClass4_11.method7182();
		if (arg0 == local6) {
			return true;
		}
		if (!arg0) {
			Static455.aClass4_11.method7154();
		} else if (!Static455.aClass4_11.method7204()) {
			arg0 = false;
		}
		if (local6 == arg0) {
			return false;
		} else {
			Static286.aClass1_Sub15_Sub1_1.aBoolean520 = arg0;
			Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
			return true;
		}
	}
}
