import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!j", name = "n", descriptor = "[I")
	public static int[] anIntArray307;

	@OriginalMember(owner = "client!j", name = "u", descriptor = "I")
	public static int anInt2897;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray28 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!j", name = "s", descriptor = "Lclient!us;")
	public static final Class234 aClass234_63 = new Class234(74, 2);

	@OriginalMember(owner = "client!j", name = "t", descriptor = "I")
	public static int anInt2896 = 13156520;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!rp;IILclient!mj;)V")
	public static void method2508(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class156 arg2) {
		@Pc(9) Class3_Sub39 local9 = new Class3_Sub39();
		local9.anInt5761 = arg0.method2739();
		local9.anInt5763 = arg0.method2726();
		local9.aClass133Array1 = new Class133[local9.anInt5761];
		local9.aClass133Array2 = new Class133[local9.anInt5761];
		local9.anIntArray624 = new int[local9.anInt5761];
		local9.anIntArray626 = new int[local9.anInt5761];
		local9.anIntArray625 = new int[local9.anInt5761];
		local9.aByteArrayArrayArray19 = new byte[local9.anInt5761][][];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt5761; local51++) {
			try {
				@Pc(57) int local57 = arg0.method2739();
				@Pc(79) String local79;
				@Pc(83) String local83;
				@Pc(89) int local89;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local79 = arg0.method2788();
					local83 = arg0.method2788();
					local89 = 0;
					if (local57 == 1) {
						local89 = arg0.method2726();
					}
					local9.anIntArray626[local51] = local57;
					local9.anIntArray624[local51] = local89;
					local9.aClass133Array1[local51] = arg2.method3654(Static332.method5071(local79), local83);
				} else if (local57 == 3 || local57 == 4) {
					local79 = arg0.method2788();
					local83 = arg0.method2788();
					local89 = arg0.method2739();
					@Pc(92) String[] local92 = new String[local89];
					for (@Pc(94) int local94 = 0; local94 < local89; local94++) {
						local92[local94] = arg0.method2788();
					}
					@Pc(109) byte[][] local109 = new byte[local89][];
					@Pc(124) int local124;
					if (local57 == 3) {
						for (@Pc(116) int local116 = 0; local116 < local89; local116++) {
							local124 = arg0.method2726();
							local109[local116] = new byte[local124];
							arg0.method2744(local109[local116], local124);
						}
					}
					local9.anIntArray626[local51] = local57;
					@Pc(151) Class[] local151 = new Class[local89];
					for (local124 = 0; local124 < local89; local124++) {
						local151[local124] = Static332.method5071(local92[local124]);
					}
					local9.aClass133Array2[local51] = arg2.method3653(local151, local83, Static332.method5071(local79));
					local9.aByteArrayArrayArray19[local51] = local109;
				}
			} catch (@Pc(232) ClassNotFoundException local232) {
				local9.anIntArray625[local51] = -1;
			} catch (@Pc(239) SecurityException local239) {
				local9.anIntArray625[local51] = -2;
			} catch (@Pc(246) NullPointerException local246) {
				local9.anIntArray625[local51] = -3;
			} catch (@Pc(253) Exception local253) {
				local9.anIntArray625[local51] = -4;
			} catch (@Pc(260) Throwable local260) {
				local9.anIntArray625[local51] = -5;
			}
		}
		Static331.aClass138_40.method3053(local9);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
	public static void method2510(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub7_Sub8 local8 = Static275.method4307(13, arg0);
		local8.method3219();
		local8.anInt3670 = arg1;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!np;Lclient!in;IIIII)V")
	public static void method2511(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static164.anInt2901) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static44.anInt791) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static103.anInt2050 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class48 local62 = Static69.aClass48ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static337.aClass7Array3[local17].method5648(local23, local32) + Static337.aClass7Array3[local17].method5648(local23 + 1, local32) + Static337.aClass7Array3[local17].method5648(local23, local32 + 1) + Static337.aClass7Array3[local17].method5648(local23 + 1, local32 + 1)) / 4 - (Static337.aClass7Array3[arg2].method5648(arg3, arg4) + Static337.aClass7Array3[arg2].method5648(arg3 + 1, arg4) + Static337.aClass7Array3[arg2].method5648(arg3, arg4 + 1) + Static337.aClass7Array3[arg2].method5648(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class28_Sub3 local143 = local62.aClass28_Sub3_1;
									@Pc(146) Class28_Sub3 local146 = local62.aClass28_Sub3_2;
									if (local143 != null && local143.method5413()) {
										arg1.method5410((local32 - arg4) * Static258.anInt4653 + (1 - arg6) * Static132.anInt2502, local143, local140, arg0, local1, (local23 - arg3) * Static258.anInt4653 + (1 - arg5) * Static132.anInt2502);
									}
									if (local146 != null && local146.method5413()) {
										arg1.method5410((local32 - arg4) * Static258.anInt4653 + (1 - arg6) * Static132.anInt2502, local146, local140, arg0, local1, (local23 - arg3) * Static258.anInt4653 + (1 - arg5) * Static132.anInt2502);
									}
									for (@Pc(219) Class50 local219 = local62.aClass50_1; local219 != null; local219 = local219.aClass50_2) {
										@Pc(223) Class28_Sub1 local223 = local219.aClass28_Sub1_1;
										if (local223 != null && local223.method5413() && (local23 == local223.aShort89 || local23 == local3) && (local32 == local223.aShort87 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort88 + 1 - local223.aShort89;
											@Pc(260) int local260 = local223.aShort90 + 1 - local223.aShort87;
											arg1.method5410((local223.aShort87 - arg4) * Static258.anInt4653 + (local260 - arg6) * Static132.anInt2502, local223, local140, arg0, local1, (local223.aShort89 - arg3) * Static258.anInt4653 + (local252 - arg5) * Static132.anInt2502);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
	public static void method2512() {
		Static52.method947(Static164.aClass154_Sub1_1.anInt6063);
		@Pc(17) int local17 = (Static206.anInt3639 >> 10) + (Static21.anInt265 >> 3);
		@Pc(26) int local26 = (Static339.anInt5726 >> 10) + (Static103.anInt2044 >> 3);
		Static363.anInt6170 = Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73 = 0;
		Static226.aClass28_Sub1_Sub1_Sub2_2.method4023(8, 8);
		Static49.aByteArrayArray20 = new byte[18][];
		Static91.anIntArray351 = new int[18];
		Static56.aByteArrayArray5 = new byte[18][];
		Static191.anIntArrayArray36 = new int[18][4];
		Static361.aByteArrayArray22 = new byte[18][];
		Static44.anIntArray80 = new int[18];
		Static185.aByteArrayArray9 = new byte[18][];
		Static136.anIntArray273 = new int[18];
		Static219.anIntArray421 = new int[18];
		Static282.aByteArrayArray18 = new byte[18][];
		Static220.anIntArray422 = new int[18];
		Static146.anIntArray291 = new int[18];
		@Pc(77) int local77 = 0;
		@Pc(101) int local101;
		for (@Pc(90) int local90 = (local17 - (Static12.anInt161 >> 4)) / 8; local90 <= (local17 + (Static12.anInt161 >> 4)) / 8; local90++) {
			for (local101 = (local26 - (Static44.anInt787 >> 4)) / 8; local101 <= ((Static44.anInt787 >> 4) + local26) / 8; local101++) {
				@Pc(109) int local109 = local101 + (local90 << 8);
				Static136.anIntArray273[local77] = local109;
				Static91.anIntArray351[local77] = Static179.aClass20_44.method230("m" + local90 + "_" + local101);
				Static44.anIntArray80[local77] = Static179.aClass20_44.method230("l" + local90 + "_" + local101);
				Static219.anIntArray421[local77] = Static179.aClass20_44.method230("n" + local90 + "_" + local101);
				Static146.anIntArray291[local77] = Static179.aClass20_44.method230("um" + local90 + "_" + local101);
				Static220.anIntArray422[local77] = Static179.aClass20_44.method230("ul" + local90 + "_" + local101);
				if (Static219.anIntArray421[local77] == -1) {
					Static91.anIntArray351[local77] = -1;
					Static44.anIntArray80[local77] = -1;
					Static146.anIntArray291[local77] = -1;
					Static220.anIntArray422[local77] = -1;
				}
				local77++;
			}
		}
		for (local101 = local77; local101 < Static219.anIntArray421.length; local101++) {
			Static219.anIntArray421[local101] = -1;
			Static91.anIntArray351[local101] = -1;
			Static44.anIntArray80[local101] = -1;
			Static146.anIntArray291[local101] = -1;
			Static220.anIntArray422[local101] = -1;
		}
		Static279.method5262(local17, true, local26, false);
	}
}
