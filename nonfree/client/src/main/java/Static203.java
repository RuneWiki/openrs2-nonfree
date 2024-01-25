import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!le", name = "f", descriptor = "Lclient!fc;")
	public static Class79 aClass79_6;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "I")
	public static final int anInt3550 = 328;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString38 = "";

	@OriginalMember(owner = "client!le", name = "g", descriptor = "I")
	public static int anInt3552 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IILclient!vg;)V")
	public static void method2877(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33_Sub2 arg1) {
		@Pc(17) boolean local17 = arg1.method5191(1) == 1;
		if (local17) {
			Static144.anIntArray324[Static143.anInt2673++] = arg0;
		}
		@Pc(32) int local32 = arg1.method5191(2);
		@Pc(36) Class25_Sub1_Sub1_Sub1 local36 = Static225.aClass25_Sub1_Sub1_Sub1Array3[arg0];
		if (local32 != 0) {
			@Pc(140) int local140;
			@Pc(145) int local145;
			@Pc(150) int local150;
			if (local32 == 1) {
				local140 = arg1.method5191(3);
				local145 = local36.anIntArray296[0];
				local150 = local36.anIntArray295[0];
				if (local140 == 0) {
					local150--;
					local145--;
				} else if (local140 == 1) {
					local150--;
				} else if (local140 == 2) {
					local150--;
					local145++;
				} else if (local140 == 3) {
					local145--;
				} else if (local140 == 4) {
					local145++;
				} else if (local140 == 5) {
					local150++;
					local145--;
				} else if (local140 == 6) {
					local150++;
				} else if (local140 == 7) {
					local145++;
					local150++;
				}
				if (local17) {
					local36.anInt599 = local145;
					local36.anInt613 = local150;
				} else {
					local36.anInt599 = -1;
					local36.method464(Static268.aByteArray75[arg0], local145, local150);
				}
			} else if (local32 == 2) {
				local140 = arg1.method5191(4);
				local145 = local36.anIntArray296[0];
				local150 = local36.anIntArray295[0];
				if (local140 == 0) {
					local150 -= 2;
					local145 -= 2;
				} else if (local140 == 1) {
					local150 -= 2;
					local145--;
				} else if (local140 == 2) {
					local150 -= 2;
				} else if (local140 == 3) {
					local150 -= 2;
					local145++;
				} else if (local140 == 4) {
					local150 -= 2;
					local145 += 2;
				} else if (local140 == 5) {
					local150--;
					local145 -= 2;
				} else if (local140 == 6) {
					local145 += 2;
					local150--;
				} else if (local140 == 7) {
					local145 -= 2;
				} else if (local140 == 8) {
					local145 += 2;
				} else if (local140 == 9) {
					local145 -= 2;
					local150++;
				} else if (local140 == 10) {
					local145 += 2;
					local150++;
				} else if (local140 == 11) {
					local145 -= 2;
					local150 += 2;
				} else if (local140 == 12) {
					local145--;
					local150 += 2;
				} else if (local140 == 13) {
					local150 += 2;
				} else if (local140 == 14) {
					local150 += 2;
					local145++;
				} else if (local140 == 15) {
					local145 += 2;
					local150 += 2;
				}
				if (local17) {
					local36.anInt599 = local145;
					local36.anInt613 = local150;
				} else {
					local36.anInt599 = -1;
					local36.method464(Static268.aByteArray75[arg0], local145, local150);
				}
			} else {
				local140 = arg1.method5191(1);
				@Pc(411) int local411;
				@Pc(419) int local419;
				@Pc(432) int local432;
				@Pc(440) int local440;
				if (local140 == 0) {
					local145 = arg1.method5191(12);
					local150 = local145 >> 10;
					local411 = local145 >> 5 & 0x1F;
					if (local411 > 15) {
						local411 -= 32;
					}
					local419 = local145 & 0x1F;
					if (local419 > 15) {
						local419 -= 32;
					}
					local432 = local36.anIntArray296[0] + local411;
					local440 = local36.anIntArray295[0] + local419;
					if (local17) {
						local36.anInt613 = local440;
						local36.anInt599 = local432;
					} else {
						local36.anInt599 = -1;
						local36.method464(Static268.aByteArray75[arg0], local432, local440);
					}
					local36.aByte70 = (byte) (local36.aByte70 + local150 & 0x3);
					if (Static43.anInt861 == arg0) {
						Static122.anInt2188 = local36.aByte70;
					}
				} else {
					local145 = arg1.method5191(30);
					local150 = local145 >> 28;
					local411 = local145 >> 14 & 0x3FFF;
					local419 = local145 & 0x3FFF;
					local432 = (local411 + Static256.anInt4410 + local36.anIntArray296[0] & 0x3FFF) - Static256.anInt4410;
					local440 = (Static293.anInt5053 + local36.anIntArray295[0] + local419 & 0x3FFF) - Static293.anInt5053;
					if (local17) {
						local36.anInt613 = local440;
						local36.anInt599 = local432;
					} else {
						local36.anInt599 = -1;
						local36.method464(Static268.aByteArray75[arg0], local432, local440);
					}
					local36.aByte70 = (byte) (local150 + local36.aByte70 & 0x3);
					if (arg0 == Static43.anInt861) {
						Static122.anInt2188 = local36.aByte70;
					}
				}
			}
		} else if (local17) {
			local36.anInt599 = -1;
		} else if (Static43.anInt861 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			Static16.anIntArray29[arg0] = (local36.anIntArray296[0] + Static256.anInt4410 >> 6 << 14) + (local36.aByte70 << 28) + (local36.anIntArray295[0] + Static293.anInt5053 >> 6);
			if (local36.anInt579 == -1) {
				Static131.anIntArray301[arg0] = local36.aClass99_7.method2036();
			} else {
				Static131.anIntArray301[arg0] = local36.anInt579;
			}
			Static253.anIntArray538[arg0] = local36.anInt2353;
			if (local36.anInt581 > 0) {
				Static31.method494(local36);
			}
			Static225.aClass25_Sub1_Sub1_Sub1Array3[arg0] = null;
			if (arg1.method5191(1) != 0) {
				Static267.method4124(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BII)V")
	public static void method2879(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class1_Sub6_Sub11 local16 = Static295.method4455(arg1, 12);
		local16.method3004();
		local16.anInt3686 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)V")
	public static void method2880(@OriginalArg(1) int arg0) {
		if (Static271.anInt4720 == 0) {
			Static197.aClass1_Sub7_Sub1_3.method1065(arg0);
		} else {
			Static243.anInt4123 = arg0;
		}
	}
}
