import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(BI)V")
	public static void method3746(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static502.aBooleanArray32[arg0]) {
			Static123.aClass308_49.method6556(arg0);
			Static115.aClass160ArrayArray1[arg0] = null;
			Static549.aClass160ArrayArray2[arg0] = null;
			Static502.aBooleanArray32[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V")
	public static void method3747() {
		while (true) {
			if (Static158.aClass1_Sub3_Sub1_2.method4992(Static464.anInt8696) >= 15) {
				@Pc(12) int local12 = Static158.aClass1_Sub3_Sub1_2.method4994(15);
				if (local12 != 32767) {
					@Pc(17) boolean local17 = false;
					@Pc(24) Class1_Sub33 local24 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local12);
					@Pc(30) Class11_Sub1_Sub1_Sub3_Sub2 local30;
					if (local24 == null) {
						local30 = new Class11_Sub1_Sub1_Sub3_Sub2();
						local30.anInt7524 = local12;
						local24 = new Class1_Sub33(local30);
						Static372.aClass91_30.method2269((long) local12, local24);
						Static501.aClass1_Sub33Array1[Static547.anInt9151++] = local24;
						local17 = true;
					}
					local30 = local24.aClass11_Sub1_Sub1_Sub3_Sub2_2;
					Static11.anIntArray12[Static306.anInt4911++] = local12;
					local30.anInt7540 = Static518.anInt9331;
					if (local30.aClass354_1 != null && local30.aClass354_1.method7671()) {
						Static510.method7148(local30);
					}
					@Pc(86) int local86 = Static158.aClass1_Sub3_Sub1_2.method4994(5);
					if (local86 > 15) {
						local86 -= 32;
					}
					@Pc(97) int local97 = Static158.aClass1_Sub3_Sub1_2.method4994(1);
					if (local97 == 1) {
						Static423.anIntArray444[Static386.anInt6908++] = local12;
					}
					@Pc(115) int local115 = Static158.aClass1_Sub3_Sub1_2.method4994(5);
					if (local115 > 15) {
						local115 -= 32;
					}
					@Pc(126) int local126 = Static158.aClass1_Sub3_Sub1_2.method4994(2);
					@Pc(131) int local131 = Static158.aClass1_Sub3_Sub1_2.method4994(1);
					local30.method6080(Static84.aClass242_1.method5281(Static158.aClass1_Sub3_Sub1_2.method4994(14)));
					@Pc(152) int local152 = (Static158.aClass1_Sub3_Sub1_2.method4994(3) + 4 & 0x70A00007) << 11;
					local30.method6071(local30.aClass354_1.anInt9418);
					local30.anInt7565 = local30.aClass354_1.anInt9432 << 3;
					if (local17) {
						local30.method6072(true, local152);
					}
					local30.method6082(local126, local86 + Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray454[0], local115 + Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray455[0], local131 == 1, local30.method6058());
					if (local30.aClass354_1.method7671()) {
						Static224.method3330(null, local30.anIntArray455[0], null, local30, local30.anIntArray454[0], 0, local30.aByte113);
					}
					continue;
				}
			}
			Static158.aClass1_Sub3_Sub1_2.method4997();
			return;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method3748(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(19) int local19 = 0;
		@Pc(25) int local25 = arg1 ? 32768 : 0;
		@Pc(35) int local35 = local25 + (arg1 ? Static109.aClass211_1.anInt5643 : Static109.aClass211_1.anInt5642);
		for (@Pc(37) int local37 = local25; local37 < local35; local37++) {
			@Pc(44) Class1_Sub8_Sub17 local44 = Static109.aClass211_1.method4599(local37);
			if (local44.aBoolean660 && local44.method7109().toLowerCase().indexOf(local8) != -1) {
				if (local19 >= 50) {
					Static401.anInt7187 = -1;
					Static413.aShortArray100 = null;
					return;
				}
				if (local11.length <= local19) {
					@Pc(79) short[] local79 = new short[local11.length * 2];
					for (@Pc(81) int local81 = 0; local81 < local19; local81++) {
						local79[local81] = local11[local81];
					}
					local11 = local79;
				}
				local11[local19++] = (short) local37;
			}
		}
		Static401.anInt7187 = local19;
		Static577.anInt9528 = 0;
		Static413.aShortArray100 = local11;
		@Pc(118) String[] local118 = new String[Static401.anInt7187];
		for (@Pc(120) int local120 = 0; local120 < Static401.anInt7187; local120++) {
			local118[local120] = Static109.aClass211_1.method4599(local11[local120]).method7109();
		}
		Static315.method4681(local118, Static413.aShortArray100);
	}
}
