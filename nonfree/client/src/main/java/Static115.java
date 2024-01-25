import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!efa", name = "I", descriptor = "I")
	public static int anInt2655;

	@OriginalMember(owner = "client!efa", name = "m", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_73 = new Class272(84, -1);

	@OriginalMember(owner = "client!efa", name = "q", descriptor = "Lclient!fca;")
	public static final Class92 aClass92_1 = new Class92(14, 1);

	@OriginalMember(owner = "client!efa", name = "u", descriptor = "Lclient!fca;")
	public static final Class92 aClass92_2 = new Class92(15, 4);

	@OriginalMember(owner = "client!efa", name = "v", descriptor = "Lclient!fca;")
	public static final Class92 aClass92_3 = new Class92(16, -2);

	@OriginalMember(owner = "client!efa", name = "w", descriptor = "Lclient!fca;")
	public static final Class92 aClass92_4 = new Class92(17, 0);

	@OriginalMember(owner = "client!efa", name = "x", descriptor = "Lclient!fca;")
	public static final Class92 aClass92_5 = new Class92(18, -2);

	@OriginalMember(owner = "client!efa", name = "y", descriptor = "Lclient!fca;")
	public static final Class92 aClass92_6 = new Class92(19, -2);

	@OriginalMember(owner = "client!efa", name = "z", descriptor = "Lclient!fca;")
	public static final Class92 aClass92_7 = new Class92(20, 6);

	@OriginalMember(owner = "client!efa", name = "A", descriptor = "Lclient!fca;")
	public static final Class92 aClass92_8 = new Class92(21, 9);

	@OriginalMember(owner = "client!efa", name = "B", descriptor = "Lclient!fca;")
	public static final Class92 aClass92_9 = new Class92(22, -2);

	@OriginalMember(owner = "client!efa", name = "C", descriptor = "Lclient!fca;")
	public static final Class92 aClass92_10 = new Class92(23, 4);

	@OriginalMember(owner = "client!efa", name = "D", descriptor = "Lclient!fca;")
	public static final Class92 aClass92_11 = new Class92(24, -1);

	@OriginalMember(owner = "client!efa", name = "E", descriptor = "Lclient!fca;")
	public static final Class92 aClass92_12 = new Class92(25, -2);

	@OriginalMember(owner = "client!efa", name = "F", descriptor = "Lclient!fca;")
	public static final Class92 aClass92_13 = new Class92(26, 0);

	@OriginalMember(owner = "client!efa", name = "G", descriptor = "Lclient!fca;")
	public static final Class92 aClass92_14 = new Class92(27, 0);

	@OriginalMember(owner = "client!efa", name = "J", descriptor = "[J")
	public static final long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lclient!bw;II)V")
	public static void method2380(@OriginalArg(0) Class3_Sub11_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.method990(1) == 1;
		if (local15) {
			Static394.anIntArray542[Static348.anInt6099++] = arg1;
		}
		@Pc(30) int local30 = arg0.method990(2);
		@Pc(34) Class9_Sub1_Sub1_Sub2_Sub2 local34 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[arg1];
		if (local30 != 0) {
			@Pc(148) int local148;
			@Pc(153) int local153;
			@Pc(158) int local158;
			if (local30 == 1) {
				local148 = arg0.method990(3);
				local153 = local34.anIntArray518[0];
				local158 = local34.anIntArray517[0];
				if (local148 == 0) {
					local158--;
					local153--;
				} else if (local148 == 1) {
					local158--;
				} else if (local148 == 2) {
					local153++;
					local158--;
				} else if (local148 == 3) {
					local153--;
				} else if (local148 == 4) {
					local153++;
				} else if (local148 == 5) {
					local158++;
					local153--;
				} else if (local148 == 6) {
					local158++;
				} else if (local148 == 7) {
					local153++;
					local158++;
				}
				if (local15) {
					local34.anInt6502 = local158;
					local34.aBoolean532 = true;
					local34.anInt6505 = local153;
				} else {
					local34.method5587(local158, local153, Static203.aByteArray38[arg1]);
				}
			} else if (local30 == 2) {
				local148 = arg0.method990(4);
				local153 = local34.anIntArray518[0];
				local158 = local34.anIntArray517[0];
				if (local148 == 0) {
					local158 -= 2;
					local153 -= 2;
				} else if (local148 == 1) {
					local153--;
					local158 -= 2;
				} else if (local148 == 2) {
					local158 -= 2;
				} else if (local148 == 3) {
					local158 -= 2;
					local153++;
				} else if (local148 == 4) {
					local158 -= 2;
					local153 += 2;
				} else if (local148 == 5) {
					local153 -= 2;
					local158--;
				} else if (local148 == 6) {
					local158--;
					local153 += 2;
				} else if (local148 == 7) {
					local153 -= 2;
				} else if (local148 == 8) {
					local153 += 2;
				} else if (local148 == 9) {
					local153 -= 2;
					local158++;
				} else if (local148 == 10) {
					local153 += 2;
					local158++;
				} else if (local148 == 11) {
					local153 -= 2;
					local158 += 2;
				} else if (local148 == 12) {
					local158 += 2;
					local153--;
				} else if (local148 == 13) {
					local158 += 2;
				} else if (local148 == 14) {
					local158 += 2;
					local153++;
				} else if (local148 == 15) {
					local158 += 2;
					local153 += 2;
				}
				if (local15) {
					local34.aBoolean532 = true;
					local34.anInt6505 = local153;
					local34.anInt6502 = local158;
				} else {
					local34.method5587(local158, local153, Static203.aByteArray38[arg1]);
				}
			} else {
				local148 = arg0.method990(1);
				@Pc(421) int local421;
				@Pc(431) int local431;
				@Pc(444) int local444;
				@Pc(451) int local451;
				if (local148 == 0) {
					local153 = arg0.method990(12);
					local158 = local153 >> 10;
					local421 = local153 >> 5 & 0x1F;
					if (local421 > 15) {
						local421 -= 32;
					}
					local431 = local153 & 0x1F;
					if (local431 > 15) {
						local431 -= 32;
					}
					local444 = local421 + local34.anIntArray518[0];
					local451 = local431 + local34.anIntArray517[0];
					if (local15) {
						local34.aBoolean532 = true;
						local34.anInt6505 = local444;
						local34.anInt6502 = local451;
					} else {
						local34.method5587(local451, local444, Static203.aByteArray38[arg1]);
					}
					local34.aByte126 = local34.aByte125 = (byte) (local34.aByte126 + local158 & 0x3);
					if (Static425.method6053(local444, local451)) {
						local34.aByte125++;
					}
					if (arg1 == Static502.anInt8011) {
						Static209.anInt8182 = local34.aByte126;
					}
				} else {
					local153 = arg0.method990(30);
					local158 = local153 >> 28;
					local421 = local153 >> 14 & 0x3FFF;
					local431 = local153 & 0x3FFF;
					local444 = (local421 + local34.anIntArray518[0] + Static529.anInt8344 & 0x3FFF) - Static529.anInt8344;
					local451 = (local34.anIntArray517[0] + Static463.anInt7588 + local431 & 0x3FFF) - Static463.anInt7588;
					if (local15) {
						local34.aBoolean532 = true;
						local34.anInt6505 = local444;
						local34.anInt6502 = local451;
					} else {
						local34.method5587(local451, local444, Static203.aByteArray38[arg1]);
					}
					local34.aByte126 = local34.aByte125 = (byte) (local158 + local34.aByte126 & 0x3);
					if (Static425.method6053(local444, local451)) {
						local34.aByte125++;
					}
					if (arg1 == Static502.anInt8011) {
						Static209.anInt8182 = local34.aByte126;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean532 = false;
		} else if (Static502.anInt8011 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(61) Class74 local61 = Static250.aClass74Array1[arg1] = new Class74();
			local61.anInt2639 = (local34.anIntArray517[0] + Static463.anInt7588 >> 6) + (local34.anIntArray518[0] + Static529.anInt8344 >> 6 << 14) + (local34.aByte126 << 28);
			if (local34.anInt6497 == -1) {
				local61.anInt2638 = local34.aClass147_7.method3814();
			} else {
				local61.anInt2638 = local34.anInt6497;
			}
			local61.aBoolean213 = local34.aBoolean535;
			local61.anInt2641 = local34.anInt6463;
			if (local34.anInt6476 > 0) {
				Static575.method7625(local34);
			}
			Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[arg1] = null;
			if (arg0.method990(1) != 0) {
				Static400.method5835(arg0, arg1);
			}
		}
	}
}
