import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!pga", name = "me", descriptor = "I")
	public static int anInt8345;

	@OriginalMember(owner = "client!pga", name = "Yd", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_108 = new Class179(27, 15);

	@OriginalMember(owner = "client!pga", name = "he", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_284 = new Class288(2, -2);

	@OriginalMember(owner = "client!pga", name = "ie", descriptor = "Lclient!jia;")
	public static final Class171 aClass171_9 = new Class171();

	@OriginalMember(owner = "client!pga", name = "ke", descriptor = "Lclient!bh;")
	public static final Class32 aClass32_75 = new Class32(128, 4);

	@OriginalMember(owner = "client!pga", name = "le", descriptor = "[[I")
	public static final int[][] anIntArrayArray51 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!pga", name = "oe", descriptor = "I")
	public static final int anInt8346 = 0;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILclient!wn;I)V")
	public static void method7015(@OriginalArg(1) Class2_Sub22_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.method8569(1) == 1;
		if (local15) {
			Static556.anIntArray698[Static620.anInt9966++] = arg1;
		}
		@Pc(30) int local30 = arg0.method8569(2);
		@Pc(34) Class13_Sub1_Sub1_Sub1_Sub2 local34 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		if (local30 != 0) {
			@Pc(150) int local150;
			@Pc(155) int local155;
			@Pc(160) int local160;
			if (local30 == 1) {
				local150 = arg0.method8569(3);
				local155 = local34.anIntArray307[0];
				local160 = local34.anIntArray306[0];
				if (local150 == 0) {
					local155--;
					local160--;
				} else if (local150 == 1) {
					local160--;
				} else if (local150 == 2) {
					local160--;
					local155++;
				} else if (local150 == 3) {
					local155--;
				} else if (local150 == 4) {
					local155++;
				} else if (local150 == 5) {
					local160++;
					local155--;
				} else if (local150 == 6) {
					local160++;
				} else if (local150 == 7) {
					local155++;
					local160++;
				}
				if (local15) {
					local34.anInt4662 = local155;
					local34.aBoolean325 = true;
					local34.anInt4671 = local160;
				} else {
					local34.method3970(local160, Static148.aByteArray34[arg1], local155);
				}
			} else if (local30 == 2) {
				local150 = arg0.method8569(4);
				local155 = local34.anIntArray307[0];
				local160 = local34.anIntArray306[0];
				if (local150 == 0) {
					local155 -= 2;
					local160 -= 2;
				} else if (local150 == 1) {
					local155--;
					local160 -= 2;
				} else if (local150 == 2) {
					local160 -= 2;
				} else if (local150 == 3) {
					local155++;
					local160 -= 2;
				} else if (local150 == 4) {
					local160 -= 2;
					local155 += 2;
				} else if (local150 == 5) {
					local160--;
					local155 -= 2;
				} else if (local150 == 6) {
					local160--;
					local155 += 2;
				} else if (local150 == 7) {
					local155 -= 2;
				} else if (local150 == 8) {
					local155 += 2;
				} else if (local150 == 9) {
					local160++;
					local155 -= 2;
				} else if (local150 == 10) {
					local155 += 2;
					local160++;
				} else if (local150 == 11) {
					local160 += 2;
					local155 -= 2;
				} else if (local150 == 12) {
					local155--;
					local160 += 2;
				} else if (local150 == 13) {
					local160 += 2;
				} else if (local150 == 14) {
					local155++;
					local160 += 2;
				} else if (local150 == 15) {
					local155 += 2;
					local160 += 2;
				}
				if (local15) {
					local34.anInt4662 = local155;
					local34.anInt4671 = local160;
					local34.aBoolean325 = true;
				} else {
					local34.method3970(local160, Static148.aByteArray34[arg1], local155);
				}
			} else {
				local150 = arg0.method8569(1);
				@Pc(429) int local429;
				@Pc(437) int local437;
				@Pc(450) int local450;
				@Pc(458) int local458;
				if (local150 == 0) {
					local155 = arg0.method8569(12);
					local160 = local155 >> 10;
					local429 = local155 >> 5 & 0x1F;
					if (local429 > 15) {
						local429 -= 32;
					}
					local437 = local155 & 0x1F;
					if (local437 > 15) {
						local437 -= 32;
					}
					local450 = local34.anIntArray307[0] + local429;
					local458 = local34.anIntArray306[0] + local437;
					if (local15) {
						local34.anInt4662 = local450;
						local34.anInt4671 = local458;
						local34.aBoolean325 = true;
					} else {
						local34.method3970(local458, Static148.aByteArray34[arg1], local450);
					}
					local34.aByte127 = local34.aByte126 = (byte) (local160 + local34.aByte127 & 0x3);
					if (Static181.method2642(local458, local450)) {
						local34.aByte126++;
					}
					if (arg1 == Static528.anInt8672) {
						if (local34.aByte127 != Static91.anInt1705) {
							Static116.aBoolean155 = true;
						}
						Static91.anInt1705 = local34.aByte127;
					}
				} else {
					local155 = arg0.method8569(30);
					local160 = local155 >> 28;
					local429 = local155 >> 14 & 0x3FFF;
					local437 = local155 & 0x3FFF;
					local450 = (local429 + local34.anIntArray307[0] + Static132.anInt2246 & 0x3FFF) - Static132.anInt2246;
					local458 = (local437 + Static123.anInt2176 + local34.anIntArray306[0] & 0x3FFF) - Static123.anInt2176;
					if (local15) {
						local34.aBoolean325 = true;
						local34.anInt4662 = local450;
						local34.anInt4671 = local458;
					} else {
						local34.method3970(local458, Static148.aByteArray34[arg1], local450);
					}
					local34.aByte127 = local34.aByte126 = (byte) (local160 + local34.aByte127 & 0x3);
					if (Static181.method2642(local458, local450)) {
						local34.aByte126++;
					}
					if (Static528.anInt8672 == arg1) {
						Static91.anInt1705 = local34.aByte127;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean325 = false;
		} else if (arg1 == Static528.anInt8672) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(61) Class336 local61 = Static4.aClass336Array1[arg1] = new Class336();
			local61.anInt8969 = (local34.anIntArray307[0] + Static132.anInt2246 >> 6 << 14) + (local34.aByte127 << 28) + (local34.anIntArray306[0] + Static123.anInt2176 >> 6);
			if (local34.anInt4652 == -1) {
				local61.anInt8972 = local34.aClass116_7.method2590();
			} else {
				local61.anInt8972 = local34.anInt4652;
			}
			local61.anInt8971 = local34.anInt4580;
			local61.aBoolean670 = local34.aBoolean323;
			if (local34.anInt4674 > 0) {
				Static165.method5090(local34);
			}
			Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[arg1] = null;
			if (arg0.method8569(1) != 0) {
				Static255.method3523(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!pga", name = "g", descriptor = "()V")
	public static void method7070() {
		for (@Pc(1) int local1 = 0; local1 < Static498.aClass212Array1.length; local1++) {
			Static498.aClass212Array1[local1].method4412();
		}
		Static498.aClass212Array1 = null;
	}

	@OriginalMember(owner = "client!pga", name = "h", descriptor = "(II)V")
	public static void method7125() {
		Static493.aClass32_72.method634(50);
	}
}
