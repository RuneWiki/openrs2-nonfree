import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
	public static int anInt4509;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
	public static int anInt4508 = 0;

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "[Lclient!ql;")
	public static final Class5_Sub3_Sub3_Sub2[] aClass5_Sub3_Sub3_Sub2Array2 = new Class5_Sub3_Sub3_Sub2[32768];

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
	public static int anInt4512 = 0;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!tr;)Z")
	public static boolean method4147(@OriginalArg(1) Interface8 arg0) {
		@Pc(9) Class188 local9 = Static126.method2405(arg0.method5697());
		if (local9.anInt5537 == -1) {
			return true;
		} else {
			@Pc(20) Class185 local20 = Static28.method822(local9.anInt5537);
			return local20.anInt5464 == -1 ? true : local20.method4853();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZI)I")
	public static int method4148(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local9 & 0x33333333) + ((local9 & 0xCCCCCCCD) >>> 2);
		@Pc(32) int local32 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(43) int local43 = local32 + (local32 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	public static void method4149() {
		while (true) {
			if (Static232.aClass1_Sub7_Sub1_4.method726(Static230.anInt4529) >= 11) {
				@Pc(18) int local18 = Static232.aClass1_Sub7_Sub1_4.method733(11);
				if (local18 != 2047) {
					@Pc(25) boolean local25 = false;
					if (Static254.aClass5_Sub3_Sub3_Sub1Array1[local18] == null) {
						Static254.aClass5_Sub3_Sub3_Sub1Array1[local18] = new Class5_Sub3_Sub3_Sub1();
						Static254.aClass5_Sub3_Sub3_Sub1Array1[local18].anInt4920 = local18;
						if (Static30.aClass1_Sub7Array1[local18] != null) {
							Static254.aClass5_Sub3_Sub3_Sub1Array1[local18].method3062(Static30.aClass1_Sub7Array1[local18]);
						}
						local25 = true;
					}
					Static123.anIntArray290[Static334.anInt6370++] = local18;
					@Pc(66) Class5_Sub3_Sub3_Sub1 local66 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local18];
					local66.anInt4932 = Static215.anInt4246;
					@Pc(74) int local74 = Static232.aClass1_Sub7_Sub1_4.method733(5);
					if (local74 > 15) {
						local74 -= 32;
					}
					@Pc(83) int local83 = Static232.aClass1_Sub7_Sub1_4.method733(5);
					if (local83 > 15) {
						local83 -= 32;
					}
					@Pc(94) int local94 = Static93.anIntArray226[Static232.aClass1_Sub7_Sub1_4.method733(3)];
					@Pc(99) int local99 = Static232.aClass1_Sub7_Sub1_4.method733(1);
					if (local99 == 1) {
						Static320.anIntArray768[Static125.anInt2470++] = local18;
					}
					@Pc(115) int local115 = Static232.aClass1_Sub7_Sub1_4.method733(1);
					if (local25) {
						local66.method4548(local94);
					}
					local66.method3067(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0] + local83, local115 == 1, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0] + local74, Static285.anInt5511);
					continue;
				}
			}
			Static232.aClass1_Sub7_Sub1_4.method727();
			return;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)Lclient!nq;")
	public static Class142 method4150(@OriginalArg(0) int arg0) {
		@Pc(10) Class142 local10 = (Class142) Static13.aClass140_10.method3816((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static344.aClass165_101.method4508(arg0, 29);
		local10 = new Class142();
		if (local20 != null) {
			local10.method3948(arg0, new Class1_Sub7(local20));
		}
		Static13.aClass140_10.method3817((long) arg0, local10);
		return local10;
	}
}
