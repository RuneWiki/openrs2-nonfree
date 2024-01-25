import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!vu", name = "q", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread9;

	@OriginalMember(owner = "client!vu", name = "x", descriptor = "Lclient!f;")
	public static Class5 aClass5_25;

	@OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
	public static int anInt6884 = 0;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
	public static void method5559() {
		@Pc(8) int local8 = Static380.aByteArrayArray18.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static380.aByteArrayArray18[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static592.anInt9719; local20++) {
					if (Static91.anIntArray519[local10] == Static17.anIntArray19[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static17.anIntArray19[Static592.anInt9719] = Static91.anIntArray519[local10];
					local18 = Static592.anInt9719++;
				}
				@Pc(63) Class1_Sub3 local63 = new Class1_Sub3(Static380.aByteArrayArray18[local10]);
				@Pc(65) int local65 = 0;
				while (Static380.aByteArrayArray18[local10].length > local63.anInt9802 && local65 < 511 && Static306.anInt4911 < 1023) {
					@Pc(86) int local86 = local65++ << 6 | local18;
					@Pc(90) int local90 = local63.method7945();
					@Pc(94) int local94 = local90 >> 14;
					@Pc(100) int local100 = local90 >> 7 & 0x3F;
					@Pc(104) int local104 = local90 & 0x3F;
					@Pc(118) int local118 = (Static91.anIntArray519[local10] >> 8) * 64 + local100 - Static539.anInt9045;
					@Pc(131) int local131 = local104 + (Static91.anIntArray519[local10] & 0xFF) * 64 - Static311.anInt5708;
					@Pc(138) Class354 local138 = Static84.aClass242_1.method5281(local63.method7945());
					@Pc(145) Class1_Sub33 local145 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local86);
					if (local145 == null && (local138.aByte123 & 0x1) > 0 && Static398.anInt7155 == local94 && local118 >= 0 && Static458.anInt9736 > local118 + local138.anInt9418 && local131 >= 0 && local131 + local138.anInt9418 < Static378.anInt6747) {
						@Pc(184) Class11_Sub1_Sub1_Sub3_Sub2 local184 = new Class11_Sub1_Sub1_Sub3_Sub2();
						local184.anInt7524 = local86;
						@Pc(192) Class1_Sub33 local192 = new Class1_Sub33(local184);
						Static372.aClass91_30.method2269((long) local86, local192);
						Static501.aClass1_Sub33Array1[Static547.anInt9151++] = local192;
						Static11.anIntArray12[Static306.anInt4911++] = local86;
						local184.anInt7540 = Static518.anInt9331;
						local184.method6080(local138);
						local184.method6071(local184.aClass354_1.anInt9418);
						local184.anInt7565 = local184.aClass354_1.anInt9432 << 3;
						local184.method6072(true, local184.aClass354_1.aByte124 + 4 << 11 & 0x381F);
						local184.method6082(local94, local131, local118, true, local184.method6058());
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BII)Z")
	public static boolean method5561(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "([[BILclient!wca;)V")
	public static void method5567(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class234_Sub1 arg1) {
		@Pc(17) int[] local17 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(19) int local19 = 0; local19 < arg1.anInt9510; local19++) {
			Static275.method4012();
			for (@Pc(25) int local25 = 0; local25 < Static458.anInt9736 >> 3; local25++) {
				for (@Pc(29) int local29 = 0; local29 < Static378.anInt6747 >> 3; local29++) {
					@Pc(39) int local39 = Static593.anIntArrayArrayArray20[local19][local25][local29];
					if (local39 != -1) {
						@Pc(49) int local49 = local39 >> 24 & 0x3;
						if (!arg1.aBoolean709 || local49 == 0) {
							@Pc(60) int local60 = local39 >> 1 & 0x3;
							@Pc(66) int local66 = local39 >> 14 & 0x3FF;
							@Pc(72) int local72 = local39 >> 3 & 0x7FF;
							@Pc(82) int local82 = local72 / 8 + (local66 / 8 << 8);
							for (@Pc(84) int local84 = 0; local84 < Static91.anIntArray519.length; local84++) {
								if (local82 == Static91.anIntArray519[local84] && arg0[local84] != null) {
									@Pc(102) Class1_Sub3 local102 = new Class1_Sub3(arg0[local84]);
									arg1.method7742(local66, local19, local60, Static590.aClass240Array1, local72, local49, local102, local29 * 8, local25 * 8);
									arg1.method7750(local102, local72, local66, local19, local60, local17[0] == -1 ? local17 : null, local49, local25 * 8, local29 * 8, Static31.aClass78_18);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local17[0] != -1) {
			Static242.aClass289_1 = Static544.aClass237_1.method5206(local17[0], local17[1], local17[3], local17[2], Static40.aClass164_1);
			Static100.anInt1765 = local17[4];
		}
	}
}
