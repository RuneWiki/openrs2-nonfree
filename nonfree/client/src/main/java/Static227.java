import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
	public static int anInt4588;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "[I")
	public static final int[] anIntArray379 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method4128(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static139.anInt2976; local16++) {
			if (arg0.equalsIgnoreCase(Static30.aStringArray6[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!ab;ILclient!cr;Ljava/lang/String;IIBLclient!hg;ILclient!bg;I)V")
	public static void method4129(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class44 arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class8 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class24 arg9, @OriginalArg(11) int arg10) {
		@Pc(21) int local21;
		if (Static198.anInt4108 == 4) {
			local21 = (int) Static350.aFloat74 & 0x3FFF;
		} else {
			local21 = (int) Static350.aFloat74 + Static319.anInt5841 & 0x3FFF;
		}
		@Pc(40) int local40 = Math.max(arg1.anInt64 / 2, arg1.anInt116 / 2) + 10;
		@Pc(48) int local48 = arg2 * arg2 + arg10 * arg10;
		if (local40 * local40 < local48) {
			return;
		}
		@Pc(58) int local58 = Class106.anIntArray240[local21];
		@Pc(62) int local62 = Class106.anIntArray242[local21];
		if (Static198.anInt4108 != 4) {
			local58 = local58 * 256 / (Static59.anInt1283 + 256);
			local62 = local62 * 256 / (Static59.anInt1283 + 256);
		}
		@Pc(91) int local91 = arg10 * local62 + local58 * arg2 >> 15;
		@Pc(102) int local102 = local62 * arg2 - arg10 * local58 >> 15;
		@Pc(109) int local109 = arg9.method331(100, null, arg4);
		@Pc(115) int local115 = local91 - local109 / 2;
		@Pc(123) int local123 = arg9.method322(null, arg4);
		if (local115 >= -arg1.anInt64 && arg1.anInt64 >= local115 && -arg1.anInt116 <= local102 && arg1.anInt116 >= local102) {
			arg3.method4660(0, arg7, arg1.anInt116 / 2 + arg8 - local102 - arg0 - local123, null, 1, arg5, local109, arg8, null, arg5 + local115 + arg1.anInt64 / 2, arg4, 0, 0, 50, arg6);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBLclient!ve;ILclient!cj;)V")
	public static void method4130(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub24_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub2_Sub1_Sub1 arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(18) int local18;
		@Pc(24) int local24;
		if ((arg0 & 0x8) != 0) {
			local18 = arg1.method5722();
			local24 = arg1.method5733();
			arg3.method4797(local18, local24, Static339.anInt6265);
			arg3.anInt5385 = Static339.anInt6265 + 300;
			arg3.anInt5384 = arg1.method5777();
		}
		if ((arg0 & 0x200) != 0) {
			arg3.aString51 = arg1.method5744();
			if (arg3.aString51.charAt(0) == '~') {
				arg3.aString51 = arg3.aString51.substring(1);
				Static383.method6001(2, arg3.method706(), 0, arg3.method705(), arg3.aString51);
			} else if (Static182.aClass1_Sub2_Sub1_Sub1_1 == arg3) {
				Static383.method6001(2, arg3.method706(), 0, arg3.method705(), arg3.aString51);
			}
			arg3.anInt5422 = 0;
			arg3.anInt5397 = 150;
			arg3.anInt5386 = 0;
		}
		if ((arg0 & 0x40) != 0) {
			arg3.anInt972 = arg1.method5753();
			if (arg3.anInt5432 == 0) {
				arg3.method4793(arg3.anInt972);
				arg3.anInt972 = -1;
			}
		}
		if ((arg0 & 0x20) != 0) {
			Static345.aByteArray95[arg2] = arg1.method5759();
		}
		if ((arg0 & 0x2) != 0) {
			local18 = arg1.method5719();
			if (local18 == 65535) {
				local18 = -1;
			}
			arg3.anInt5418 = local18;
		}
		if ((arg0 & 0x100) != 0) {
			arg3.anInt5378 = arg1.method5742();
			arg3.anInt5392 = arg1.method5742();
			arg3.anInt5379 = arg1.method5763();
			arg3.anInt5395 = arg1.method5742();
			arg3.anInt5416 = arg1.method5753() + Static339.anInt6265;
			arg3.anInt5415 = arg1.method5767() + Static339.anInt6265;
			arg3.anInt5376 = arg1.method5723();
			if (arg3.anInt951 == -1) {
				arg3.anInt5378 += arg3.anIntArray466[0];
				arg3.anInt5392 += arg3.anIntArray465[0];
				arg3.anInt5395 += arg3.anIntArray465[0];
				arg3.anInt5432 = 1;
				arg3.anInt5379 += arg3.anIntArray466[0];
			} else {
				arg3.anInt5378 += arg3.anInt951;
				arg3.anInt5395 += arg3.anInt959;
				arg3.anInt5392 += arg3.anInt959;
				arg3.anInt5379 += arg3.anInt951;
				arg3.anInt5432 = 0;
			}
			arg3.anInt5431 = 0;
		}
		@Pc(424) int local424;
		@Pc(472) int local472;
		@Pc(389) int local389;
		if ((arg0 & 0x400) != 0) {
			local18 = arg1.method5719();
			local24 = arg1.method5745();
			if (local18 == 65535) {
				local18 = -1;
			}
			@Pc(303) boolean local303 = true;
			@Pc(348) Class102 local348;
			if (local18 != -1 && arg3.anInt5396 != -1) {
				@Pc(324) Class182 local324;
				if (arg3.anInt5396 == local18) {
					local324 = Static153.aClass116_1.method2791(local18);
					if (local324.aBoolean374 && local324.anInt5101 != -1) {
						@Pc(386) Class102 local386 = Static333.aClass50_2.method1175(local324.anInt5101);
						local389 = local386.anInt2985;
						if (local389 == 0) {
							local303 = false;
						} else if (local389 == 1) {
							local303 = true;
						} else if (local389 == 2) {
							arg3.anInt5414 = 0;
							local303 = false;
						}
					}
				} else {
					local324 = Static153.aClass116_1.method2791(local18);
					@Pc(332) Class182 local332 = Static153.aClass116_1.method2791(arg3.anInt5396);
					if (local324.anInt5101 != -1 && local332.anInt5101 != -1) {
						local348 = Static333.aClass50_2.method1175(local324.anInt5101);
						@Pc(354) Class102 local354 = Static333.aClass50_2.method1175(local332.anInt5101);
						if (local354.anInt2992 > local348.anInt2992) {
							local303 = false;
						}
					}
				}
			}
			if (local303) {
				arg3.anInt5423 = local24 >> 16;
				local424 = Static339.anInt6265;
				arg3.anInt5396 = local18;
				arg3.anInt5364 = 1;
				arg3.anInt5391 = 0;
				arg3.anInt5390 = local424 + (local24 & 0xFFFF);
				arg3.anInt5404 = 0;
				if (arg3.anInt5390 > local424) {
					arg3.anInt5404 = -1;
				}
				if (arg3.anInt5396 != -1 && local424 == arg3.anInt5390) {
					local472 = Static153.aClass116_1.method2791(arg3.anInt5396).anInt5101;
					if (local472 != -1) {
						local348 = Static333.aClass50_2.method1175(local472);
						if (local348 != null && local348.anIntArray231 != null) {
							Static343.method5495(local348, Static182.aClass1_Sub2_Sub1_Sub1_1 == arg3, arg3.anInt6800, 0, arg3.anInt6798, arg3.aByte73);
						}
					}
				}
			}
		}
		if ((arg0 & 0x2000) != 0) {
			local7 = arg1.method5742();
		}
		if ((arg0 & 0x4000) != 0) {
			local18 = arg1.method5777();
			@Pc(526) int[] local526 = new int[local18];
			@Pc(529) int[] local529 = new int[local18];
			@Pc(532) int[] local532 = new int[local18];
			for (local472 = 0; local472 < local18; local472++) {
				local389 = arg1.method5767();
				if (local389 == 65535) {
					local389 = -1;
				}
				local526[local472] = local389;
				local529[local472] = arg1.method5732();
				local532[local472] = arg1.method5719();
			}
			Static30.method347(local529, local532, arg3, local526);
		}
		@Pc(596) int local596;
		if ((arg0 & 0x1) != 0) {
			local18 = arg1.method5719();
			local24 = arg1.method5733();
			local596 = arg1.method5723();
			local424 = arg1.anInt6669;
			@Pc(607) boolean local607 = (local18 & 0x8000) != 0;
			if (arg3.aString12 != null && arg3.aClass158_1 != null) {
				@Pc(615) boolean local615 = false;
				if (local24 <= 1) {
					if (!local607 && (Static243.aBoolean352 && !Static184.aBoolean280 || Static142.aBoolean215)) {
						local615 = true;
					} else if (Static14.method170(arg3.aString12)) {
						local615 = true;
					}
				}
				if (!local615 && Static350.anInt6468 == 0) {
					Static218.aClass2_Sub24_3.anInt6669 = 0;
					arg1.method5761(Static218.aClass2_Sub24_3.aByteArray100, local596);
					Static218.aClass2_Sub24_3.anInt6669 = 0;
					@Pc(658) int local658 = -1;
					@Pc(670) String local670;
					if (local607) {
						local18 &= 0x7FFF;
						@Pc(680) Class193 local680 = Static221.method5897(Static218.aClass2_Sub24_3);
						local658 = local680.anInt5276;
						local670 = local680.aClass2_Sub7_Sub4_1.method1718(Static218.aClass2_Sub24_3);
					} else {
						local670 = Static252.method4379(Static266.method4525(Static324.method5229(Static218.aClass2_Sub24_3)));
					}
					arg3.aString51 = local670.trim();
					arg3.anInt5386 = local18 >> 8;
					arg3.anInt5397 = 150;
					arg3.anInt5422 = local18 & 0xFF;
					@Pc(718) int local718;
					if (local24 == 1 || local24 == 2) {
						local718 = local607 ? 17 : 1;
					} else {
						local718 = local607 ? 17 : 2;
					}
					if (local24 == 2) {
						Static295.method4840("<img=1>" + arg3.method706(), local658, local670, local718, 0, "<img=1>" + arg3.method705(), null);
					} else if (local24 == 1) {
						Static295.method4840("<img=0>" + arg3.method706(), local658, local670, local718, 0, "<img=0>" + arg3.method705(), null);
					} else {
						Static295.method4840(arg3.method706(), local658, local670, local718, 0, arg3.method705(), null);
					}
				}
			}
			arg1.anInt6669 = local596 + local424;
		}
		if ((arg0 & 0x1000) != 0) {
			local18 = arg1.method5753();
			arg3.anInt5419 = arg1.method5732();
			arg3.anInt5380 = arg1.method5733();
			arg3.aBoolean396 = (local18 & 0x8000) != 0;
			arg3.anInt5371 = local18 & 0x7FFF;
			arg3.anInt5412 = arg3.anInt5419 + Static339.anInt6265 + arg3.anInt5371;
		}
		if ((arg0 & 0x10) != 0) {
			local18 = arg1.method5719();
			if (local18 == 65535) {
				local18 = -1;
			}
			local24 = arg1.method5723();
			Static77.method1329(local18, arg3, local24);
		}
		if ((arg0 & 0x80) != 0) {
			local18 = arg1.method5733();
			@Pc(908) byte[] local908 = new byte[local18];
			@Pc(913) Class2_Sub24 local913 = new Class2_Sub24(local908);
			arg1.method5737(local18, local908);
			Static287.aClass2_Sub24Array1[arg2] = local913;
			arg3.method699(local913);
		}
		if ((arg0 & 0x800) != 0) {
			local18 = Static339.anInt6265;
			local24 = arg1.method5722();
			local596 = arg1.method5733();
			arg3.method4797(local24, local596, local18);
		}
		if (arg3.anInt951 == -1) {
			return;
		}
		if (local7 == 127) {
			arg3.method703(arg3.anInt959, arg3.anInt951);
			return;
		}
		@Pc(966) byte local966;
		if (local7 == -1) {
			local966 = Static345.aByteArray95[arg2];
		} else {
			local966 = local7;
		}
		arg3.method698(arg3.anInt951, arg3.anInt959, local966);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	public static void method4131() {
		Static313.aClass126_5.method3295();
		Static14.aClass233_1.method5626();
		Static182.aClass170_2.method4308();
		Static230.aClass96_4.method2295();
		Static207.aClass32_1.method573();
		Static57.aClass196_1.method4824();
		Static333.aClass50_2.method1178();
		Static153.aClass116_1.method2786();
		Static19.aClass132_1.method3439();
		Static179.aClass204_1.method5025();
		Static59.aClass194_1.method4751();
		Static197.aClass30_2.method535();
		Static78.aClass195_2.method4810();
		Static261.aClass97_1.method2363();
		Static57.aClass79_1.method1850();
		Static194.aClass52_1.method1205();
		Static371.aClass162_1.method4137();
		Static15.aClass36_1.method602();
		Static253.aClass67_2.method1495();
		Static80.aClass172_1.method4331();
		Static164.method2905();
		Static272.method4579();
		Static30.method342();
		if (Static306.aClass49_7 != Static158.aClass49_3) {
			for (@Pc(76) int local76 = 0; local76 < Static132.aByteArrayArray10.length; local76++) {
				Static132.aByteArrayArray10[local76] = null;
			}
			Static232.anInt4640 = 0;
		}
		Static147.method2658();
		Static342.method5478();
		Static151.method3886();
		Static32.method362();
		Static183.method3404();
		Static351.aClass41_71.method825();
		Static383.aClass48_9.method2465();
		Static40.aClass105_1.method2626();
		Static11.method105();
		Static45.aClass83_117.method1969();
		Static235.aClass83_85.method1969();
		Static48.aClass83_29.method1969();
		Static208.aClass83_76.method1969();
		Static141.aClass83_59.method1969();
		Static90.aClass83_42.method1969();
		Static279.aClass83_95.method1969();
		Static88.aClass83_41.method1969();
		Static324.aClass83_116.method1969();
		Static169.aClass83_110.method1969();
		Static130.aClass83_119.method1969();
		Static311.aClass83_61.method1969();
		Static51.aClass83_30.method1969();
		Static381.aClass83_125.method1969();
		Static316.aClass83_113.method1969();
		Static280.aClass83_98.method1969();
		Static221.aClass83_129.method1969();
		Static350.aClass83_122.method1969();
		Static97.aClass83_46.method1969();
		Static1.aClass83_131.method1969();
		Static281.aClass83_99.method1969();
		Static210.aClass83_127.method1969();
		Static33.aClass83_5.method1969();
		Static86.aClass83_38.method1969();
		Static235.aClass83_84.method1969();
		Static12.aClass83_6.method1969();
		Static48.aClass83_28.method1969();
		Static301.aClass83_108.method1969();
		Static222.aClass83_79.method1969();
		Static263.aClass41_59.method825();
		Static189.aClass41_3.method825();
		Static253.aClass41_58.method825();
		Static230.aClass41_53.method825();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IC)C")
	public static char method4133(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
