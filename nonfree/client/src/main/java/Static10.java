import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
	public static int anInt148;

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
	public static int anInt171;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
	public static int anInt151 = -1;

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "[I")
	public static int[] anIntArray26 = new int[50];

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "Lclient!g;")
	public static Class56 aClass56_1 = null;

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString11 = "slide:";

	@OriginalMember(owner = "client!aj", name = "T", descriptor = "S")
	public static short aShort3 = 256;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIZIIIIZ)V")
	public static void method154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		if (!arg2 && Static180.anInt3907 == arg0 && Static261.anInt5142 == arg1 && (Static194.anInt4082 == arg3 || Static69.method2440())) {
			return;
		}
		Static180.anInt3907 = arg0;
		Static194.anInt4082 = arg3;
		Static261.anInt5142 = arg1;
		if (Static69.method2440()) {
			Static194.anInt4082 = 0;
		}
		if (arg6) {
			Static305.method4624(28);
		} else {
			Static305.method4624(25);
		}
		Static63.method1183(Static269.aString179, true);
		@Pc(62) int local62 = Static160.anInt5159;
		Static160.anInt5159 = arg0 * 8 - 48;
		@Pc(70) int local70 = Static234.anInt4705;
		Static234.anInt4705 = (arg1 - 6) * 8;
		Static94.aClass2_Sub8_Sub16_1 = Static250.method2530(Static180.anInt3907 * 8, Static261.anInt5142 * 8);
		@Pc(88) int local88 = Static160.anInt5159 - local62;
		Static27.aClass57_7 = null;
		@Pc(97) int local97 = Static234.anInt4705 - local70;
		@Pc(103) int local103;
		@Pc(112) Class15_Sub2_Sub1 local112;
		@Pc(118) int local118;
		if (arg6) {
			Static57.anInt1448 = 0;
			for (local103 = 0; local103 < 32768; local103++) {
				local112 = Static35.aClass15_Sub2_Sub1Array2[local103];
				if (local112 != null) {
					local112.anInt5371 -= local97 * 128;
					local112.anInt5358 -= local88 * 128;
					if (local112.anInt5358 >= 0 && local112.anInt5358 <= 13184 && local112.anInt5371 >= 0 && local112.anInt5371 <= 13184) {
						for (local118 = 0; local118 < 10; local118++) {
							local112.anIntArray516[local118] -= local88;
							local112.anIntArray518[local118] -= local97;
						}
						Static89.anIntArray194[Static57.anInt1448++] = local103;
					} else {
						Static35.aClass15_Sub2_Sub1Array2[local103].method633(null);
						Static35.aClass15_Sub2_Sub1Array2[local103] = null;
					}
				}
			}
		} else {
			for (local103 = 0; local103 < 32768; local103++) {
				local112 = Static35.aClass15_Sub2_Sub1Array2[local103];
				if (local112 != null) {
					for (local118 = 0; local118 < 10; local118++) {
						local112.anIntArray516[local118] -= local88;
						local112.anIntArray518[local118] -= local97;
					}
					local112.anInt5371 -= local97 * 128;
					local112.anInt5358 -= local88 * 128;
				}
			}
		}
		for (local103 = 0; local103 < 2048; local103++) {
			@Pc(275) Class15_Sub2_Sub2 local275 = Static188.aClass15_Sub2_Sub2Array41[local103];
			if (local275 != null) {
				for (local118 = 0; local118 < 10; local118++) {
					local275.anIntArray516[local118] -= local88;
					local275.anIntArray518[local118] -= local97;
				}
				local275.anInt5358 -= local88 * 128;
				local275.anInt5371 -= local97 * 128;
			}
		}
		@Pc(326) byte local326 = 0;
		Static32.anInt876 = arg3;
		@Pc(330) byte local330 = 104;
		Static22.aClass15_Sub2_Sub2_1.method4305(false, arg5, arg4);
		@Pc(340) byte local340 = 1;
		@Pc(342) byte local342 = 0;
		if (local88 < 0) {
			local340 = -1;
			local330 = -1;
			local326 = 103;
		}
		@Pc(355) byte local355 = 1;
		@Pc(357) byte local357 = 104;
		if (local97 < 0) {
			local357 = -1;
			local355 = -1;
			local342 = 103;
		}
		for (@Pc(383) int local383 = local326; local383 != local330; local383 += local340) {
			for (@Pc(388) int local388 = local342; local388 != local357; local388 += local355) {
				@Pc(399) int local399 = local88 + local383;
				@Pc(404) int local404 = local388 + local97;
				for (@Pc(406) int local406 = 0; local406 < 4; local406++) {
					if (local399 >= 0 && local404 >= 0 && local399 < 104 && local404 < 104) {
						Static121.aClass44ArrayArrayArray1[local406][local383][local388] = Static121.aClass44ArrayArrayArray1[local406][local399][local404];
					} else {
						Static121.aClass44ArrayArrayArray1[local406][local383][local388] = null;
					}
				}
			}
		}
		for (@Pc(467) Class2_Sub29 local467 = (Class2_Sub29) Static300.aClass44_26.method1352(); local467 != null; local467 = (Class2_Sub29) Static300.aClass44_26.method1360()) {
			local467.anInt5687 -= local88;
			local467.anInt5681 -= local97;
			if (local467.anInt5687 < 0 || local467.anInt5681 < 0 || local467.anInt5687 >= 104 || local467.anInt5681 >= 104) {
				local467.method4743();
			}
		}
		if (Static302.anInt5847 != 0) {
			Static269.anInt5272 -= local97;
			Static302.anInt5847 -= local88;
		}
		Static76.anInt1889 = 0;
		if (arg6) {
			Static80.anInt1911 -= local88 * 128;
			Static136.anInt3064 -= local97;
			Static192.anInt4017 -= local97 * 128;
			Static59.anInt1482 -= local88;
			Static13.anInt262 -= local97;
			Static206.anInt4289 -= local88;
		} else if (Static16.anInt342 == 4) {
			Static254.anInt4978 -= local88 * 128;
			Static279.anInt5490 -= local97 * 128;
			Static101.anInt2397 -= local97 * 128;
			Static75.anInt1869 -= local88 * 128;
		} else {
			Static16.anInt342 = 1;
		}
		if (Static116.aBoolean184 && arg6 && (Math.abs(local88) > 104 || Math.abs(local97) > 104)) {
			Static43.method820();
		}
		Static150.method2672();
		Static88.aClass44_8.method1361();
		Static34.aClass44_2.method1361();
		Static97.method1685();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public static void method156() {
		Static175.aClass157_33.method4027();
		Static215.aClass157_36.method4027();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Lclient!qn;")
	public static Class146 method158(@OriginalArg(0) int arg0) {
		@Pc(8) Class146 local8 = (Class146) Static28.aClass157_6.method4031((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(26) byte[] local26 = Static218.aClass42_68.method1256(Static145.method2548(arg0), Static141.method2499(arg0));
		local8 = new Class146();
		local8.anInt4724 = arg0;
		if (local26 != null) {
			local8.method3812(new Class2_Sub16(local26));
		}
		local8.method3818();
		if (local8.aBoolean320) {
			local8.aBoolean317 = false;
			local8.anInt4746 = 0;
		}
		if (!Static169.aBoolean248 && local8.aBoolean312) {
			local8.aStringArray37 = null;
		}
		Static28.aClass157_6.method4026((long) arg0, local8);
		return local8;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!ek;I)V")
	public static void method159(@OriginalArg(0) Class42 arg0) {
		Static67.aClass42_19 = arg0;
		Static49.anInt1235 = Static67.aClass42_19.method1269(16);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[IJI)Ljava/lang/String;")
	public static String method160(@OriginalArg(1) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		if (Static105.anInterface4_2 != null) {
			@Pc(19) String local19 = Static105.anInterface4_2.method3902(arg1, arg2, arg0);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg1);
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V")
	public static void method163(@OriginalArg(0) int arg0) {
		Static72.aClass157_12.method4027();
		Static72.aClass157_12 = new Class157(arg0);
	}
}
