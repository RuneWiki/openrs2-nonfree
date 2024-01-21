import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!la", name = "W", descriptor = "Lclient!ab;")
	public static Class3 aClass3_20;

	@OriginalMember(owner = "client!la", name = "S", descriptor = "I")
	public static int anInt2343 = 0;

	@OriginalMember(owner = "client!la", name = "V", descriptor = "I")
	public static int anInt2346 = 0;

	@OriginalMember(owner = "client!la", name = "Y", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_18 = new Class47(64);

	@OriginalMember(owner = "client!la", name = "bb", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 22461, -21571, 11200, 957, -10317, 5056, -31808, 123, 22453, -21579, 11191, 949, -10325, 4023, -31817, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20366, 20401, 662, 827, 7054, 5056, -21734, -21564, -14444, -15424, 11032, 11200, 4, 123, 61, -18792, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 8412, 8301, 8076, 6936, 5675, 941, 5056, 15795, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)I")
	public static int method1628(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class1_Sub25 local14 = (Class1_Sub25) Static71.aClass97_7.method3375((long) arg0);
		if (local14 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < local14.anIntArray325.length; local29++) {
				if (local14.anIntArray326[local29] == arg1) {
					local27 += local14.anIntArray325[local29];
				}
			}
			return local27;
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)Z")
	public static boolean method1631(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!la", name = "f", descriptor = "(I)Z")
	public static boolean method1635() {
		@Pc(13) long local13 = Static124.method1828();
		@Pc(19) int local19 = (int) (local13 - Static55.aLong59);
		if (local19 > 200) {
			local19 = 200;
		}
		Static55.aLong59 = local13;
		Static113.anInt2436 += local19;
		if (Static175.anInt3777 == 0 && Static170.anInt3546 == 0 && Static104.anInt2259 == 0 && Static106.anInt2305 == 0) {
			return true;
		} else if (Static47.aClass57_2 == null) {
			return false;
		} else {
			try {
				if (Static113.anInt2436 > 30000) {
					throw new IOException();
				}
				@Pc(63) Class1_Sub3_Sub23 local63;
				@Pc(68) Class1_Sub14 local68;
				while (Static170.anInt3546 < 20 && Static106.anInt2305 > 0) {
					local63 = (Class1_Sub3_Sub23) Static106.aClass97_12.method3372();
					local68 = new Class1_Sub14(4);
					local68.method3024(1);
					local68.method3025((int) local63.aLong251);
					Static47.aClass57_2.method1673(local68.aByteArray49, 4);
					Static193.aClass97_16.method3374(local63, local63.aLong251);
					Static170.anInt3546++;
					Static106.anInt2305--;
				}
				while (Static175.anInt3777 < 20 && Static104.anInt2259 > 0) {
					local63 = (Class1_Sub3_Sub23) Static143.aClass86_2.method2887();
					local68 = new Class1_Sub14(4);
					local68.method3024(0);
					local68.method3025((int) local63.aLong251);
					Static47.aClass57_2.method1673(local68.aByteArray49, 4);
					local63.method3367();
					Static193.aClass97_17.method3374(local63, local63.aLong251);
					Static175.anInt3777++;
					Static104.anInt2259--;
				}
				for (@Pc(169) int local169 = 0; local169 < 100; local169++) {
					@Pc(175) int local175 = Static47.aClass57_2.method1674();
					if (local175 < 0) {
						throw new IOException();
					}
					if (local175 == 0) {
						break;
					}
					Static113.anInt2436 = 0;
					@Pc(190) byte local190 = 0;
					if (Static95.aClass1_Sub3_Sub23_1 == null) {
						local190 = 8;
					} else if (Static96.anInt2014 == 0) {
						local190 = 1;
					}
					@Pc(213) int local213;
					@Pc(234) int local234;
					@Pc(288) int local288;
					@Pc(303) int local303;
					if (local190 > 0) {
						local213 = local190 - Static68.aClass1_Sub14_3.anInt4061;
						if (local175 < local213) {
							local213 = local175;
						}
						Static47.aClass57_2.method1671(Static68.aClass1_Sub14_3.anInt4061, Static68.aClass1_Sub14_3.aByteArray49, local213);
						if (Static53.aByte5 != 0) {
							for (local234 = 0; local234 < local213; local234++) {
								Static68.aClass1_Sub14_3.aByteArray49[local234 + Static68.aClass1_Sub14_3.anInt4061] ^= Static53.aByte5;
							}
						}
						Static68.aClass1_Sub14_3.anInt4061 += local213;
						if (Static68.aClass1_Sub14_3.anInt4061 < local190) {
							break;
						}
						if (Static95.aClass1_Sub3_Sub23_1 == null) {
							Static68.aClass1_Sub14_3.anInt4061 = 0;
							local234 = Static68.aClass1_Sub14_3.method3010();
							local288 = Static68.aClass1_Sub14_3.method3023();
							@Pc(292) int local292 = Static68.aClass1_Sub14_3.method3010();
							@Pc(299) long local299 = (long) (local288 + (local234 << 16));
							local303 = Static68.aClass1_Sub14_3.method3058();
							@Pc(309) Class1_Sub3_Sub23 local309 = (Class1_Sub3_Sub23) Static193.aClass97_16.method3375(local299);
							Static5.aBoolean7 = true;
							if (local309 == null) {
								local309 = (Class1_Sub3_Sub23) Static193.aClass97_17.method3375(local299);
								Static5.aBoolean7 = false;
							}
							if (local309 == null) {
								throw new IOException();
							}
							Static95.aClass1_Sub3_Sub23_1 = local309;
							@Pc(335) int local335 = local292 == 0 ? 5 : 9;
							Static139.aClass1_Sub14_4 = new Class1_Sub14(Static95.aClass1_Sub3_Sub23_1.aByte12 + local335 + local303);
							Static139.aClass1_Sub14_4.method3024(local292);
							Static139.aClass1_Sub14_4.method3032(local303);
							Static96.anInt2014 = 8;
							Static68.aClass1_Sub14_3.anInt4061 = 0;
						} else if (Static96.anInt2014 == 0) {
							if (Static68.aClass1_Sub14_3.aByteArray49[0] == -1) {
								Static96.anInt2014 = 1;
								Static68.aClass1_Sub14_3.anInt4061 = 0;
							} else {
								Static95.aClass1_Sub3_Sub23_1 = null;
							}
						}
					} else {
						local213 = Static139.aClass1_Sub14_4.aByteArray49.length - Static95.aClass1_Sub3_Sub23_1.aByte12;
						local234 = 512 - Static96.anInt2014;
						if (local213 - Static139.aClass1_Sub14_4.anInt4061 < local234) {
							local234 = local213 - Static139.aClass1_Sub14_4.anInt4061;
						}
						if (local234 > local175) {
							local234 = local175;
						}
						Static47.aClass57_2.method1671(Static139.aClass1_Sub14_4.anInt4061, Static139.aClass1_Sub14_4.aByteArray49, local234);
						if (Static53.aByte5 != 0) {
							for (local288 = 0; local288 < local234; local288++) {
								Static139.aClass1_Sub14_4.aByteArray49[local288 + Static139.aClass1_Sub14_4.anInt4061] ^= Static53.aByte5;
							}
						}
						Static139.aClass1_Sub14_4.anInt4061 += local234;
						Static96.anInt2014 += local234;
						if (local213 == Static139.aClass1_Sub14_4.anInt4061) {
							if (Static95.aClass1_Sub3_Sub23_1.aLong251 == 16711935L) {
								Static51.aClass1_Sub14_2 = Static139.aClass1_Sub14_4;
								for (local288 = 0; local288 < 256; local288++) {
									@Pc(490) Class3_Sub1 local490 = Static110.aClass3_Sub1Array1[local288];
									if (local490 != null) {
										Static51.aClass1_Sub14_2.anInt4061 = local288 * 8 + 5;
										local303 = Static51.aClass1_Sub14_2.method3058();
										@Pc(509) int local509 = Static51.aClass1_Sub14_2.method3058();
										local490.method3284(local303, local509);
									}
								}
							} else {
								Static179.aCRC32_2.reset();
								Static179.aCRC32_2.update(Static139.aClass1_Sub14_4.aByteArray49, 0, local213);
								local288 = (int) Static179.aCRC32_2.getValue();
								if (local288 != Static95.aClass1_Sub3_Sub23_1.anInt4096) {
									try {
										Static47.aClass57_2.method1672();
									} catch (@Pc(543) Exception local543) {
									}
									Static53.aByte5 = (byte) (Math.random() * 255.0D + 1.0D);
									Static47.aClass57_2 = null;
									Static107.anInt2317++;
									return false;
								}
								Static107.anInt2317 = 0;
								Static157.anInt3249 = 0;
								Static95.aClass1_Sub3_Sub23_1.aClass3_Sub1_25.method3283(Static139.aClass1_Sub14_4.aByteArray49, (int) (Static95.aClass1_Sub3_Sub23_1.aLong251 & 0xFFFFL), Static5.aBoolean7, (Static95.aClass1_Sub3_Sub23_1.aLong251 & 0xFF0000L) == 16711680L);
							}
							Static95.aClass1_Sub3_Sub23_1.method3414();
							Static95.aClass1_Sub3_Sub23_1 = null;
							Static96.anInt2014 = 0;
							Static139.aClass1_Sub14_4 = null;
							if (Static5.aBoolean7) {
								Static170.anInt3546--;
							} else {
								Static175.anInt3777--;
							}
						} else {
							if (Static96.anInt2014 != 512) {
								break;
							}
							Static96.anInt2014 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(617) IOException local617) {
				try {
					Static47.aClass57_2.method1672();
				} catch (@Pc(624) Exception local624) {
				}
				Static157.anInt3249++;
				Static47.aClass57_2 = null;
				return false;
			}
		}
	}
}
