import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Lclient!pb;")
	public static Class41 aClass41_14;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "[I")
	public static int[] anIntArray82;

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "Lclient!ke;")
	public static Class41_Sub1 aClass41_Sub1_2;

	@OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
	public static int anInt654;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "[I")
	public static int[] anIntArray81 = new int[4000];

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!rd;")
	public static Class64 aClass64_380 = Static69.method1153("b12_full");

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "Lclient!rd;")
	private static Class64 aClass64_384 = Static69.method1153("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "Lclient!rd;")
	public static Class64 aClass64_381 = aClass64_384;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "Lclient!rd;")
	private static Class64 aClass64_386 = Static69.method1153("Private chat");

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!rd;")
	public static Class64 aClass64_382 = aClass64_386;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "Lclient!rd;")
	public static Class64 aClass64_383 = Static69.method1153("backbase2");

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_385 = Static69.method1153("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
	public static int anInt649 = 0;

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "Lclient!rd;")
	private static Class64 aClass64_387 = Static69.method1153(" from your ignore list first");

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "Lclient!rd;")
	public static Class64 aClass64_388 = aClass64_387;

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
	public static int anInt655 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[Lclient!nc;IILclient!ua;B[BIII)V")
	public static void method411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class52[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class68 arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(6) Class1_Sub6 local6 = new Class1_Sub6(arg6);
		@Pc(8) int local8 = -1;
		while (true) {
			@Pc(12) int local12 = local6.method1844();
			if (local12 == 0) {
				return;
			}
			local8 += local12;
			@Pc(23) int local23 = 0;
			while (true) {
				@Pc(27) int local27 = local6.method1844();
				if (local27 == 0) {
					break;
				}
				local23 += local27 - 1;
				@Pc(39) int local39 = local23 & 0x3F;
				@Pc(45) int local45 = local23 >> 6 & 0x3F;
				@Pc(49) int local49 = local23 >> 12;
				@Pc(53) int local53 = local6.method1837();
				@Pc(57) int local57 = local53 >> 2;
				@Pc(61) int local61 = local53 & 0x3;
				if (arg8 == local49 && local45 >= arg3 && local45 < arg3 + 8 && arg9 <= local39 && local39 < arg9 + 8) {
					@Pc(92) Class1_Sub1_Sub3 local92 = Static108.method1807(local8);
					@Pc(109) int local109 = arg7 + Static84.method1394(local39 & 0x7, local92.anInt420, local45 & 0x7, local61, arg0, local92.anInt411);
					@Pc(128) int local128 = arg4 + Static19.method389(local92.anInt420, local92.anInt411, local61, local45 & 0x7, arg0, local39 & 0x7);
					if (local109 > 0 && local128 > 0 && local109 < 103 && local128 < 103) {
						@Pc(140) int local140 = arg1;
						if ((Static18.aByteArrayArrayArray2[1][local109][local128] & 0x2) == 2) {
							local140 = arg1 - 1;
						}
						@Pc(154) Class52 local154 = null;
						if (local140 >= 0) {
							local154 = arg2[local140];
						}
						Static13.method288(local128, local57, arg1, arg5, local154, arg0 + local61 & 0x3, local8, local109);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method412() {
		Static55.aClass19_109.method416();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIILclient!e;I)V")
	public static void method413(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub4 arg2, @OriginalArg(4) int arg3) {
		if (Static70.anInt1591 >= 50 || Static69.anInt1549 == 0 || (arg2.anIntArray93 == null || arg2.anIntArray93.length <= arg0)) {
			return;
		}
		@Pc(32) int local32 = arg2.anIntArray93[arg0];
		if (local32 == 0) {
			return;
		}
		@Pc(39) int local39 = local32 >> 8;
		@Pc(45) int local45 = local32 >> 4 & 0x7;
		Static60.anIntArray210[Static70.anInt1591] = local39;
		@Pc(53) int local53 = local32 & 0xF;
		@Pc(59) int local59 = (arg1 - 64) / 128;
		@Pc(65) int local65 = (arg3 - 64) / 128;
		Static119.anIntArray452[Static70.anInt1591] = local45;
		Static7.anIntArray48[Static70.anInt1591] = 0;
		Static25.aClass34Array5[Static70.anInt1591] = null;
		Static37.anIntArray136[Static70.anInt1591] = (local59 << 16) + (local65 << 8) + local53;
		Static70.anInt1591++;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public static void method414() {
		Static52.aBoolean169 = true;
		Static107.aBoolean154 = true;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)V")
	public static void method415(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == Static108.anInt2553 && arg4 == Static53.anInt1237 && (arg2 == Static5.anInt125 || !Static52.aBoolean169)) {
			return;
		}
		Static108.anInt2553 = arg3;
		Static5.anInt125 = arg2;
		if (!Static52.aBoolean169) {
			Static5.anInt125 = 0;
		}
		Static53.anInt1237 = arg4;
		Static10.method258(25);
		Static74.method1233(null, false, Static95.aClass64_1384);
		@Pc(41) int local41 = Static60.anInt1350;
		Static60.anInt1350 = (arg3 - 6) * 8;
		@Pc(49) int local49 = Static53.anInt1236;
		Static53.anInt1236 = arg4 * 8 - 48;
		@Pc(60) int local60 = Static53.anInt1236 - local49;
		@Pc(66) int local66 = Static60.anInt1350 - local41;
		for (@Pc(70) int local70 = 0; local70 < 32768; local70++) {
			@Pc(76) Class1_Sub1_Sub2_Sub1_Sub1 local76 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local70];
			if (local76 != null) {
				for (@Pc(80) int local80 = 0; local80 < 10; local80++) {
					local76.anIntArray354[local80] -= local66;
					local76.anIntArray355[local80] -= local60;
				}
				local76.anInt2412 -= local60 * 128;
				local76.anInt2375 -= local66 * 128;
			}
		}
		for (@Pc(126) int local126 = 0; local126 < 2048; local126++) {
			@Pc(132) Class1_Sub1_Sub2_Sub1_Sub2 local132 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local126];
			if (local132 != null) {
				for (@Pc(136) int local136 = 0; local136 < 10; local136++) {
					local132.anIntArray354[local136] -= local66;
					local132.anIntArray355[local136] -= local60;
				}
				local132.anInt2375 -= local66 * 128;
				local132.anInt2412 -= local60 * 128;
			}
		}
		Static15.anInt463 = arg2;
		@Pc(182) byte local182 = 0;
		Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1689(false, arg0, arg1);
		@Pc(190) byte local190 = 104;
		@Pc(192) byte local192 = 1;
		@Pc(194) byte local194 = 0;
		if (local66 < 0) {
			local182 = 103;
			local192 = -1;
			local190 = -1;
		}
		@Pc(207) byte local207 = 1;
		@Pc(209) byte local209 = 104;
		if (local60 < 0) {
			local207 = -1;
			local209 = -1;
			local194 = 103;
		}
		for (@Pc(219) int local219 = local182; local219 != local190; local219 += local192) {
			for (@Pc(223) int local223 = local194; local223 != local209; local223 += local207) {
				@Pc(230) int local230 = local219 + local66;
				@Pc(234) int local234 = local60 + local223;
				for (@Pc(236) int local236 = 0; local236 < 4; local236++) {
					if (local230 >= 0 && local234 >= 0 && local230 < 104 && local234 < 104) {
						Static64.aClass50ArrayArrayArray1[local236][local219][local223] = Static64.aClass50ArrayArrayArray1[local236][local230][local234];
					} else {
						Static64.aClass50ArrayArrayArray1[local236][local219][local223] = null;
					}
				}
			}
		}
		for (@Pc(301) Class1_Sub9 local301 = (Class1_Sub9) Static60.aClass50_8.method1151(); local301 != null; local301 = (Class1_Sub9) Static60.aClass50_8.method1141()) {
			local301.anInt1882 -= local60;
			local301.anInt1890 -= local66;
			if (local301.anInt1890 < 0 || local301.anInt1882 < 0 || local301.anInt1890 >= 104 || local301.anInt1882 >= 104) {
				local301.method2076();
			}
		}
		Static9.aBoolean21 = false;
		if (Static52.anInt2832 != 0) {
			Static52.anInt2832 -= local66;
			Static70.anInt1578 -= local60;
		}
		Static70.anInt1591 = 0;
		Static2.anInt70 = -1;
		Static46.aClass50_5.method1145();
		Static53.aClass50_7.method1145();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)Lclient!rd;")
	public static Class64 method417(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return Static83.aClass64_1198;
		} else if (local7 < -6) {
			return Static92.aClass64_1305;
		} else if (local7 < -3) {
			return Static52.aClass64_1822;
		} else if (local7 < 0) {
			return Static120.aClass64_1838;
		} else if (local7 > 9) {
			return Static70.aClass64_987;
		} else if (local7 > 6) {
			return Static90.aClass64_344;
		} else if (local7 > 3) {
			return Static79.aClass64_1167;
		} else if (local7 > 0) {
			return Static106.aClass64_1608;
		} else {
			return Static2.aClass64_80;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method418() {
		aClass41_14 = null;
		aClass64_385 = null;
		aClass64_388 = null;
		aClass64_387 = null;
		anIntArray82 = null;
		aClass64_380 = null;
		aClass64_384 = null;
		aClass64_386 = null;
		aClass64_382 = null;
		aClass41_Sub1_2 = null;
		aClass64_383 = null;
		anIntArray81 = null;
		aClass64_381 = null;
	}
}
