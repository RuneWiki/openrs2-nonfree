import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
	public static int anInt625;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_16 = new Class48(10, 1);

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString7 = null;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
	public static void method478() {
		for (@Pc(10) Class1_Sub44 local10 = (Class1_Sub44) Static26.aClass17_7.method202(); local10 != null; local10 = (Class1_Sub44) Static26.aClass17_7.method207()) {
			if (Static25.aClass132ArrayArrayArray1 == null) {
				local10.method5577();
			} else {
				@Pc(28) int local28;
				@Pc(169) Class25_Sub5 local169;
				@Pc(182) Class25_Sub5_Sub2 local182;
				@Pc(98) Class25_Sub4 local98;
				@Pc(54) Class25_Sub1 local54;
				@Pc(133) Class25_Sub3 local133;
				@Pc(111) Class25_Sub4_Sub2 local111;
				@Pc(146) Class25_Sub3_Sub1 local146;
				if (Static366.anInt5883 >= local10.anInt6141) {
					local28 = Static140.anIntArray722[local10.anInt6144];
					if (local28 == 0) {
						local169 = Static186.method2676(local10.anInt6147, local10.anInt6145, local10.anInt6137);
						if (local169 instanceof Class25_Sub5_Sub2) {
							Static284.method4331(local10.anInt6147, local10.anInt6145, local10.anInt6137);
							local182 = (Class25_Sub5_Sub2) local169;
							if (local182.aClass25_Sub5_3 != null) {
								Static248.method3689(local10.anInt6147, local10.anInt6145, local10.anInt6137, local182.aClass25_Sub5_3, null);
							}
						}
					} else if (local28 == 1) {
						local133 = Static153.method2323(local10.anInt6147, local10.anInt6145, local10.anInt6137);
						if (local133 instanceof Class25_Sub3_Sub1) {
							Static215.method3003(local10.anInt6147, local10.anInt6145, local10.anInt6137);
							local146 = (Class25_Sub3_Sub1) local133;
							if (local146.aClass25_Sub3_3 != null) {
								Static313.method4639(local10.anInt6147, local10.anInt6145, local10.anInt6137, local146.aClass25_Sub3_3, null);
							}
						}
					} else if (local28 == 2) {
						local54 = Static67.method1123(local10.anInt6147, local10.anInt6145, local10.anInt6137, ki.class);
						if (local54 instanceof Class25_Sub1_Sub5) {
							Static155.method2335(local10.anInt6147, local10.anInt6145, local10.anInt6137, ki.class);
							@Pc(75) Class25_Sub1_Sub5 local75 = (Class25_Sub1_Sub5) local54;
							if (local75.aClass25_Sub1_2 != null) {
								Static31.method498(local75.aClass25_Sub1_2, false);
							}
						}
					} else if (local28 == 3) {
						local98 = Static91.method1355(local10.anInt6147, local10.anInt6145, local10.anInt6137);
						if (local98 instanceof Class25_Sub4_Sub2) {
							Static115.method1701(local10.anInt6147, local10.anInt6145, local10.anInt6137);
							local111 = (Class25_Sub4_Sub2) local98;
							if (local111.aClass25_Sub4_1 != null) {
								Static227.method4205(local10.anInt6147, local10.anInt6145, local10.anInt6137, local111.aClass25_Sub4_1);
							}
						}
					}
					local10.method5577();
				} else if (Static366.anInt5883 == local10.anInt6143) {
					local28 = Static140.anIntArray722[local10.anInt6144];
					if (local28 == 0) {
						local169 = Static186.method2676(local10.anInt6147, local10.anInt6145, local10.anInt6137);
						if (local169 instanceof Class25_Sub5_Sub2) {
							local10.method5577();
						} else if (Static47.method724(local10.anInt6147, local10.anInt6145, local10.anInt6137) == null) {
							local182 = new Class25_Sub5_Sub2(local10.anInt6144, local10.anInt6151, local10.anInt6140, local10.anInt6135, local10.anInt6133, local169);
							Static248.method3689(local10.anInt6147, local10.anInt6145, local10.anInt6137, local182, null);
						} else {
							local10.method5577();
						}
					} else if (local28 == 1) {
						local133 = Static153.method2323(local10.anInt6147, local10.anInt6145, local10.anInt6137);
						if (local133 instanceof Class25_Sub3_Sub1) {
							local10.method5577();
						} else if (Static233.method3205(local10.anInt6147, local10.anInt6145, local10.anInt6137) == null) {
							local146 = new Class25_Sub3_Sub1(local10.anInt6144, local10.anInt6151, local10.anInt6140, local10.anInt6135, local10.anInt6133, local133);
							Static313.method4639(local10.anInt6147, local10.anInt6145, local10.anInt6137, local146, null);
						} else {
							local10.method5577();
						}
					} else if (local28 == 2) {
						local54 = Static67.method1123(local10.anInt6147, local10.anInt6145, local10.anInt6137, ki.class);
						if (local54 instanceof Class25_Sub1_Sub5) {
							local10.method5577();
						} else {
							Static155.method2335(local10.anInt6147, local10.anInt6145, local10.anInt6137, ki.class);
							@Pc(264) Class236 local264 = Static54.aClass153_1.method3081(local10.anInt6139);
							@Pc(280) int local280;
							@Pc(277) int local277;
							if (local10.anInt6151 == 1 || local10.anInt6151 == 3) {
								local277 = local264.anInt5893;
								local280 = local264.anInt5912;
							} else {
								local277 = local264.anInt5912;
								local280 = local264.anInt5893;
							}
							@Pc(321) Class25_Sub1_Sub5 local321 = new Class25_Sub1_Sub5(local10.anInt6144, local10.anInt6151, local10.anInt6147, local10.anInt6140, local10.anInt6135, local10.anInt6133, local10.anInt6145, local280 + local10.anInt6145 - 1, local10.anInt6137, local277 + local10.anInt6137 - 1, local54);
							Static31.method498(local321, false);
						}
					} else if (local28 == 3) {
						local98 = Static91.method1355(local10.anInt6147, local10.anInt6145, local10.anInt6137);
						if (local98 instanceof Class25_Sub4_Sub2) {
							local10.method5577();
						} else {
							local111 = new Class25_Sub4_Sub2(local10.anInt6140, local10.anInt6135, local10.anInt6133, local98);
							Static227.method4205(local10.anInt6147, local10.anInt6145, local10.anInt6137, local111);
						}
					}
				}
			}
		}
	}
}
