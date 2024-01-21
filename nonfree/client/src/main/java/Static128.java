import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!qa", name = "qb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1145 = Static146.method2172("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!qa", name = "rb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1146 = Static146.method2172("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!qa", name = "sb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1147 = aClass77_1145;

	@OriginalMember(owner = "client!qa", name = "tb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1148 = Static146.method2172("Versteckt");

	@OriginalMember(owner = "client!qa", name = "ub", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1149 = Static146.method2172("<br>(X100(U(Y");

	@OriginalMember(owner = "client!qa", name = "vb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1150 = aClass77_1146;

	@OriginalMember(owner = "client!qa", name = "wb", descriptor = "I")
	public static int anInt3108 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!sg;ILclient!sg;Lclient!sg;)V")
	public static void method2194(@OriginalArg(0) Class77 arg0, @OriginalArg(2) Class77 arg1, @OriginalArg(3) Class77 arg2) {
		Static39.aClass77_448 = arg1;
		Static39.aClass77_443 = arg0;
		Static39.aClass77_439 = arg2;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
	public static void method2195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static113.method1244(arg0, arg1, arg3 + arg0, arg2 + arg1);
		Static12.method256();
		anInt3108++;
		Static180.method3006(true);
		Static59.method1098(true);
		Static180.method3006(false);
		Static59.method1098(false);
		Static8.method126();
		Static49.method944();
		@Pc(43) int local43;
		@Pc(50) int local50;
		if (!Static16.aBoolean29) {
			local43 = Static146.anInt3057;
			local50 = Static28.anInt832 + Static149.anInt3649 & 0x7FF;
			if (Static33.anInt970 / 256 > local43) {
				local43 = Static33.anInt970 / 256;
			}
			if (Static31.aBooleanArray4[4] && local43 < Static84.anIntArray464[4] + 128) {
				local43 = Static84.anIntArray464[4] + 128;
			}
			Static59.method1100(local50, Static161.method2725(Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400, Static54.anInt1472, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385) - 50, Static96.anInt2437, local43, local43 * 3 + 600, Static100.anInt779);
		}
		if (Static16.aBoolean29) {
			local43 = Static9.method143();
		} else {
			local43 = Static56.method1057();
		}
		@Pc(115) int local115 = Static160.anInt4578;
		local50 = Static7.anInt215;
		@Pc(119) int local119 = Static130.anInt3165;
		@Pc(121) int local121 = Static121.anInt2979;
		@Pc(123) int local123 = Static155.anInt3844;
		@Pc(166) int local166;
		for (@Pc(125) int local125 = 0; local125 < 5; local125++) {
			if (Static31.aBooleanArray4[local125]) {
				local166 = (int) ((double) -Static126.anIntArray377[local125] + (double) (Static126.anIntArray377[local125] * 2 + 1) * Math.random() + Math.sin((double) Static144.anIntArray514[local125] / 100.0D * (double) Static119.anIntArray449[local125]) * (double) Static84.anIntArray464[local125]);
				if (local125 == 1) {
					Static160.anInt4578 += local166;
				}
				if (local125 == 0) {
					Static7.anInt215 += local166;
				}
				if (local125 == 2) {
					Static121.anInt2979 += local166;
				}
				if (local125 == 4) {
					Static130.anInt3165 += local166;
					if (Static130.anInt3165 < 128) {
						Static130.anInt3165 = 128;
					}
					if (Static130.anInt3165 > 383) {
						Static130.anInt3165 = 383;
					}
				}
				if (local125 == 3) {
					Static155.anInt3844 = local166 + Static155.anInt3844 & 0x7FF;
				}
			}
		}
		local166 = Static20.anInt631;
		@Pc(231) int local231 = Static132.anInt3185;
		if (local166 >= arg0 && local166 < arg3 + arg0 && arg1 <= local231 && arg2 + arg1 > local231) {
			Static22.anInt862 = Static20.anInt631 - arg0;
			Static22.aBoolean46 = true;
			Static22.anInt858 = 0;
			Static22.anInt860 = Static132.anInt3185 - arg1;
		} else {
			Static22.aBoolean46 = false;
			Static22.anInt858 = 0;
		}
		Static34.method700();
		Static113.method1243(arg0, arg1, arg3, arg2, 0);
		Static34.method700();
		Static172.aClass60_1.method2096(Static7.anInt215, Static160.anInt4578, Static121.anInt2979, Static130.anInt3165, Static155.anInt3844, local43);
		Static34.method700();
		Static172.aClass60_1.method2075();
		Static93.method1685(arg2, arg0, arg1, arg3);
		Static16.method346(arg1, arg0);
		((Class46) Static12.anInterface2_1).method1666(Static131.anInt4359);
		Static112.method1996(arg2, arg1, arg0, arg3);
		Static130.anInt3165 = local119;
		Static121.anInt2979 = local121;
		Static160.anInt4578 = local115;
		Static155.anInt3844 = local123;
		Static7.anInt215 = local50;
		if (Static44.aBoolean58 && Static145.method2443() == 0) {
			Static44.aBoolean58 = false;
		}
		if (Static44.aBoolean58) {
			Static113.method1243(arg0, arg1, arg3, arg2, 0);
			Static91.method1669(Static131.aClass77_1491, false);
		}
		if (!Static44.aBoolean58 && !Static166.aBoolean181 && local166 >= arg0 && arg3 + arg0 > local166 && local231 >= arg1 && local231 < arg1 + arg2) {
			Static165.method2762(arg1, local231, arg0, local166);
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V")
	public static void method2196() {
		if (Static130.anIntArray465 != null && Static108.anIntArray424 != null) {
			return;
		}
		Static108.anIntArray424 = new int[256];
		Static130.anIntArray465 = new int[256];
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(32) double local32 = (double) local23 / 255.0D * 6.283185307179586D;
			Static130.anIntArray465[local23] = (int) (Math.sin(local32) * 4096.0D);
			Static108.anIntArray424[local23] = (int) (Math.cos(local32) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V")
	public static void method2197() {
		aClass77_1148 = null;
		aClass77_1147 = null;
		aClass77_1150 = null;
		aClass77_1145 = null;
		aClass77_1146 = null;
		aClass77_1149 = null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!gd;I)V")
	public static void method2198(@OriginalArg(0) Class2_Sub2_Sub3_Sub3 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static133.anIntArray476.length; local3++) {
			Static133.anIntArray476[local3] = 0;
		}
		@Pc(30) int local30;
		for (@Pc(15) int local15 = 0; local15 < 5000; local15++) {
			local30 = (int) ((double) 256 * Math.random() * 128.0D);
			Static133.anIntArray476[local30] = (int) (Math.random() * 256.0D);
		}
		@Pc(50) int local50;
		@Pc(53) int local53;
		@Pc(60) int local60;
		for (local30 = 0; local30 < 20; local30++) {
			for (local50 = 1; local50 < 255; local50++) {
				for (local53 = 1; local53 < 127; local53++) {
					local60 = (local50 << 7) + local53;
					Static94.anIntArray386[local60] = (Static133.anIntArray476[local60 - 1] + Static133.anIntArray476[local60 + 1] + Static133.anIntArray476[local60 - 128] + Static133.anIntArray476[local60 + 128]) / 4;
				}
			}
			@Pc(109) int[] local109 = Static133.anIntArray476;
			Static133.anIntArray476 = Static94.anIntArray386;
			Static94.anIntArray386 = local109;
		}
		if (arg0 == null) {
			return;
		}
		local50 = 0;
		for (local53 = 0; local53 < arg0.anInt1449; local53++) {
			for (local60 = 0; local60 < arg0.anInt1451; local60++) {
				if (arg0.aByteArray24[local50++] != 0) {
					@Pc(140) int local140 = arg0.anInt1448 + local60 + 16;
					@Pc(147) int local147 = arg0.anInt1453 + local53 + 16;
					@Pc(153) int local153 = local140 + (local147 << 7);
					Static133.anIntArray476[local153] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)V")
	public static void method2199(@OriginalArg(1) int arg0) {
		if (Static176.anInt4481 == 0) {
			Static136.aClass2_Sub9_Sub3_1.method2463(arg0);
		} else {
			Static58.anInt1528 = arg0;
		}
	}
}
