import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_224 = Static181.method2795("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_225 = Static181.method2795(":chalreq:");

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_226 = Static181.method2795(" GMT");

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)I")
	public static int method645(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)I")
	public static int method646() {
		@Pc(15) int local15 = 3;
		if (Static18.anInt2017 < 310) {
			@Pc(24) int local24 = Static21.anInt567 >> 7;
			@Pc(29) int local29 = Static54.aClass24_Sub4_Sub1_1.anInt3349 >> 7;
			@Pc(34) int local34 = Static54.aClass24_Sub4_Sub1_1.anInt3316 >> 7;
			@Pc(38) int local38 = Static174.anInt3596 >> 7;
			@Pc(50) int local50;
			if (local34 <= local24) {
				local50 = local24 - local34;
			} else {
				local50 = local34 - local24;
			}
			if ((Static9.aByteArrayArrayArray7[Static43.anInt1126][local24][local38] & 0x4) != 0) {
				local15 = Static43.anInt1126;
			}
			@Pc(81) int local81;
			if (local38 >= local29) {
				local81 = local38 - local29;
			} else {
				local81 = local29 - local38;
			}
			@Pc(101) int local101;
			@Pc(103) int local103;
			if (local81 < local50) {
				local101 = local81 * 65536 / local50;
				local103 = 32768;
				while (local24 != local34) {
					if (local24 < local34) {
						local24++;
					} else if (local24 > local34) {
						local24--;
					}
					if ((Static9.aByteArrayArrayArray7[Static43.anInt1126][local24][local38] & 0x4) != 0) {
						local15 = Static43.anInt1126;
					}
					local103 += local101;
					if (local103 >= 65536) {
						local103 -= 65536;
						if (local29 > local38) {
							local38++;
						} else if (local29 < local38) {
							local38--;
						}
						if ((Static9.aByteArrayArrayArray7[Static43.anInt1126][local24][local38] & 0x4) != 0) {
							local15 = Static43.anInt1126;
						}
					}
				}
			} else {
				local101 = local50 * 65536 / local81;
				local103 = 32768;
				while (local29 != local38) {
					local103 += local101;
					if (local29 > local38) {
						local38++;
					} else if (local29 < local38) {
						local38--;
					}
					if ((Static9.aByteArrayArrayArray7[Static43.anInt1126][local24][local38] & 0x4) != 0) {
						local15 = Static43.anInt1126;
					}
					if (local103 >= 65536) {
						local103 -= 65536;
						if (local24 < local34) {
							local24++;
						} else if (local24 > local34) {
							local24--;
						}
						if ((Static9.aByteArrayArrayArray7[Static43.anInt1126][local24][local38] & 0x4) != 0) {
							local15 = Static43.anInt1126;
						}
					}
				}
			}
		}
		if ((Static9.aByteArrayArrayArray7[Static43.anInt1126][Static54.aClass24_Sub4_Sub1_1.anInt3316 >> 7][Static54.aClass24_Sub4_Sub1_1.anInt3349 >> 7] & 0x4) != 0) {
			local15 = Static43.anInt1126;
		}
		return local15;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method647() {
		while (true) {
			if (Static33.aClass2_Sub3_Sub1_1.method277(Static131.anInt2843) >= 11) {
				@Pc(14) int local14 = Static33.aClass2_Sub3_Sub1_1.method285(11);
				if (local14 != 2047) {
					@Pc(19) boolean local19 = false;
					if (Static22.aClass24_Sub4_Sub1Array1[local14] == null) {
						local19 = true;
						Static22.aClass24_Sub4_Sub1Array1[local14] = new Class24_Sub4_Sub1();
						if (Static174.aClass2_Sub3Array1[local14] != null) {
							Static22.aClass24_Sub4_Sub1Array1[local14].method1731(Static174.aClass2_Sub3Array1[local14]);
						}
					}
					Static10.anIntArray18[Static21.anInt572++] = local14;
					@Pc(55) Class24_Sub4_Sub1 local55 = Static22.aClass24_Sub4_Sub1Array1[local14];
					local55.anInt3309 = Static13.anInt386;
					@Pc(63) int local63 = Static33.aClass2_Sub3_Sub1_1.method285(1);
					@Pc(70) int local70 = Static33.aClass2_Sub3_Sub1_1.method285(5);
					@Pc(75) int local75 = Static33.aClass2_Sub3_Sub1_1.method285(1);
					if (local70 > 15) {
						local70 -= 32;
					}
					if (local75 == 1) {
						Static64.anIntArray130[Static177.anInt3619++] = local14;
					}
					@Pc(99) int local99 = Static79.anIntArray171[Static33.aClass2_Sub3_Sub1_1.method285(3)];
					if (local19) {
						local55.anInt3318 = local55.anInt3331 = local99;
					}
					@Pc(112) int local112 = Static33.aClass2_Sub3_Sub1_1.method285(5);
					if (local112 > 15) {
						local112 -= 32;
					}
					local55.method2524(local112 + Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], local63 == 1, local70 + Static54.aClass24_Sub4_Sub1_1.anIntArray319[0]);
					continue;
				}
			}
			Static33.aClass2_Sub3_Sub1_1.method279();
			return;
		}
	}
}
