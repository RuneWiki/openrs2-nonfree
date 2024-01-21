import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Lclient!kd;")
	public static Class40_Sub1 aClass40_Sub1_10;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "Lclient!he;")
	public static Class30 aClass30_7;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "Lclient!qc;")
	private static Class60 aClass60_600 = Static121.method2047("This world is full)3");

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Lclient!qc;")
	public static Class60 aClass60_599 = aClass60_600;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "I")
	public static int anInt1695 = 0;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "[I")
	public static int[] anIntArray169 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!l", name = "j", descriptor = "I")
	public static int anInt1698 = 1;

	@OriginalMember(owner = "client!l", name = "k", descriptor = "Z")
	public static boolean aBoolean62 = false;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "Lclient!qc;")
	public static Class60 aClass60_601 = Static121.method2047("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
	public static void method1268(@OriginalArg(1) int arg0) {
		Static93.anInt2268 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public static void method1269() {
		Static61.aBoolean57 = false;
		Static44.aBoolean41 = false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)I")
	public static int method1270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 0) {
				arg0 = 0;
			} else if (arg0 > 127) {
				arg0 = 127;
			}
			return 127 - arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) / 128;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	public static void method1271() {
		aClass60_599 = null;
		aClass60_600 = null;
		aClass30_7 = null;
		anIntArray169 = null;
		aClass60_601 = null;
		aClass40_Sub1_10 = null;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
	public static void method1272() {
		@Pc(6) int local6 = Static105.aClass4_Sub13_Sub1_3.method1260(8);
		@Pc(15) int local15;
		if (Static43.anInt1107 > local6) {
			for (local15 = local6; local15 < Static43.anInt1107; local15++) {
				Static73.anIntArray190[Static128.anInt2631++] = Static94.anIntArray231[local15];
			}
		}
		if (local6 > Static43.anInt1107) {
			throw new RuntimeException("gppov1");
		}
		Static43.anInt1107 = 0;
		for (local15 = 0; local15 < local6; local15++) {
			@Pc(54) int local54 = Static94.anIntArray231[local15];
			@Pc(58) Class4_Sub4_Sub1_Sub2_Sub2 local58 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local54];
			@Pc(63) int local63 = Static105.aClass4_Sub13_Sub1_3.method1260(1);
			if (local63 == 0) {
				Static94.anIntArray231[Static43.anInt1107++] = local54;
				local58.anInt2592 = Static81.anInt1944;
			} else {
				@Pc(83) int local83 = Static105.aClass4_Sub13_Sub1_3.method1260(2);
				if (local83 == 0) {
					Static94.anIntArray231[Static43.anInt1107++] = local54;
					local58.anInt2592 = Static81.anInt1944;
					Static35.anIntArray68[Static85.anInt2030++] = local54;
				} else {
					@Pc(130) int local130;
					@Pc(140) int local140;
					if (local83 == 1) {
						Static94.anIntArray231[Static43.anInt1107++] = local54;
						local58.anInt2592 = Static81.anInt1944;
						local130 = Static105.aClass4_Sub13_Sub1_3.method1260(3);
						local58.method1875(false, local130);
						local140 = Static105.aClass4_Sub13_Sub1_3.method1260(1);
						if (local140 == 1) {
							Static35.anIntArray68[Static85.anInt2030++] = local54;
						}
					} else if (local83 == 2) {
						Static94.anIntArray231[Static43.anInt1107++] = local54;
						local58.anInt2592 = Static81.anInt1944;
						local130 = Static105.aClass4_Sub13_Sub1_3.method1260(3);
						local58.method1875(true, local130);
						local140 = Static105.aClass4_Sub13_Sub1_3.method1260(3);
						local58.method1875(true, local140);
						@Pc(200) int local200 = Static105.aClass4_Sub13_Sub1_3.method1260(1);
						if (local200 == 1) {
							Static35.anIntArray68[Static85.anInt2030++] = local54;
						}
					} else if (local83 == 3) {
						Static73.anIntArray190[Static128.anInt2631++] = local54;
					}
				}
			}
		}
	}
}
