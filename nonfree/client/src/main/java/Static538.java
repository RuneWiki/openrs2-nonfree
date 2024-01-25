import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString84;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
	public static int anInt9338;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger7 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "Lclient!bt;")
	public static Class37 aClass37_4 = null;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "Lclient!wf;")
	public static final Class316 aClass316_64 = new Class316(32);

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "[I")
	public static final int[] anIntArray787 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "Z")
	public static boolean aBoolean651 = false;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "[Lclient!cu;")
	public static Class50_Sub1[] aClass50_Sub1Array2 = new Class50_Sub1[0];

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIZIII)V")
	public static void method7876(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) long local17 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg2);
		@Pc(23) Class1_Sub49 local23 = (Class1_Sub49) Static393.aClass174_27.method4422(local17);
		if (local23 == null) {
			local23 = new Class1_Sub49();
			Static393.aClass174_27.method4420(local23, local17);
		}
		if (local23.anIntArray747.length <= arg3) {
			@Pc(48) int[] local48 = new int[arg3 + 1];
			@Pc(53) int[] local53 = new int[arg3 + 1];
			for (@Pc(55) int local55 = 0; local55 < local23.anIntArray747.length; local55++) {
				local48[local55] = local23.anIntArray747[local55];
				local53[local55] = local23.anIntArray746[local55];
			}
			for (@Pc(84) int local84 = local23.anIntArray747.length; local84 < arg3; local84++) {
				local48[local84] = -1;
				local53[local84] = 0;
			}
			local23.anIntArray746 = local53;
			local23.anIntArray747 = local48;
		}
		local23.anIntArray747[arg3] = arg4;
		local23.anIntArray746[arg3] = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method7878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg2 && arg0 == arg8 && arg1 == arg6 && arg4 == arg5) {
			Static130.method2849(arg2, arg8, arg1, arg5, arg7);
			return;
		}
		@Pc(40) int local40 = arg2;
		@Pc(42) int local42 = arg8;
		@Pc(46) int local46 = arg2 * 3;
		@Pc(50) int local50 = arg8 * 3;
		@Pc(54) int local54 = arg3 * 3;
		@Pc(58) int local58 = arg0 * 3;
		@Pc(62) int local62 = arg6 * 3;
		@Pc(66) int local66 = arg4 * 3;
		@Pc(74) int local74 = arg1 + local54 - local62 - arg2;
		@Pc(85) int local85 = arg5 + local58 - arg8 - local66;
		@Pc(94) int local94 = local46 + local62 - local54 - local54;
		@Pc(103) int local103 = local50 + local66 - local58 - local58;
		@Pc(108) int local108 = local54 - local46;
		@Pc(113) int local113 = local58 - local50;
		for (@Pc(115) int local115 = 128; local115 <= 4096; local115 += 128) {
			@Pc(123) int local123 = local115 * local115 >> 12;
			@Pc(129) int local129 = local115 * local123 >> 12;
			@Pc(133) int local133 = local129 * local74;
			@Pc(137) int local137 = local129 * local85;
			@Pc(141) int local141 = local94 * local123;
			@Pc(145) int local145 = local123 * local103;
			@Pc(149) int local149 = local115 * local108;
			@Pc(153) int local153 = local113 * local115;
			@Pc(165) int local165 = arg2 + (local133 + local141 + local149 >> 12);
			@Pc(175) int local175 = (local153 + local145 + local137 >> 12) + arg8;
			Static130.method2849(local40, local42, local165, local175, arg7);
			local42 = local175;
			local40 = local165;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!wca;BII)V")
	public static void method7882(@OriginalArg(0) Class1_Sub50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0 == Static475.aClass38_69.aClass1_27) {
			return;
		}
		@Pc(13) int local13 = arg0.anInt8981;
		@Pc(16) int local16 = arg0.anInt8979;
		@Pc(19) int local19 = arg0.anInt8983;
		@Pc(23) int local23 = (int) arg0.aLong236;
		@Pc(26) long local26 = arg0.aLong236;
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		@Pc(41) Class47_Sub2_Sub3_Sub2 local41;
		if (local19 == 48) {
			local41 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local23];
			if (local41 != null) {
				Static222.anInt4503 = 0;
				Static237.anInt4614 = arg2;
				Static336.anInt6301 = arg1;
				Static302.anInt5846 = 2;
				Static444.method6416(Static155.aClass186_49);
				Static192.aClass1_Sub13_Sub2_1.method3047(Static126.aClass60_1.method5384(82) ? 1 : 0);
				Static192.aClass1_Sub13_Sub2_1.method3023(local23);
				Static76.method1968(local41.anIntArray362[0], local41.method4350(), true, local41.anIntArray361[0], local41.method4350(), -2, 0, 0);
			}
		}
		if (local19 == 15) {
			Static237.anInt4614 = arg2;
			Static302.anInt5846 = 2;
			Static336.anInt6301 = arg1;
			Static222.anInt4503 = 0;
			Static444.method6416(Static284.aClass186_79);
			Static192.aClass1_Sub13_Sub2_1.method3038(Static423.anInt8970);
			Static192.aClass1_Sub13_Sub2_1.method3047(Static126.aClass60_1.method5384(82) ? 1 : 0);
			Static192.aClass1_Sub13_Sub2_1.method3023(Static368.anInt6563);
			Static192.aClass1_Sub13_Sub2_1.method3064(Static323.anInt6116);
			Static192.aClass1_Sub13_Sub2_1.method3019((int) (local26 >>> 32) & Integer.MAX_VALUE);
			Static192.aClass1_Sub13_Sub2_1.method3019(local13 + Static324.anInt6132);
			Static192.aClass1_Sub13_Sub2_1.method3028(Static517.anInt8716 + local16);
			Static242.method1909(local13, local26, local16);
		}
		if (local19 == 4) {
			Static336.anInt6301 = arg1;
			Static302.anInt5846 = 1;
			Static237.anInt4614 = arg2;
			Static222.anInt4503 = 0;
			Static444.method6416(Static35.aClass186_10);
			Static192.aClass1_Sub13_Sub2_1.method3038(Static324.anInt6132 + local13);
			Static192.aClass1_Sub13_Sub2_1.method3038(local16 + Static517.anInt8716);
			Static192.aClass1_Sub13_Sub2_1.method3038(Static368.anInt6563);
			Static192.aClass1_Sub13_Sub2_1.method3069(Static323.anInt6116);
			Static192.aClass1_Sub13_Sub2_1.method3038(Static423.anInt8970);
			Static76.method1968(local13, 1, true, local16, 1, -4, 0, 0);
		}
		@Pc(239) Class47_Sub2_Sub3_Sub1 local239;
		@Pc(234) Class1_Sub10 local234;
		if (local19 == 1006) {
			Static222.anInt4503 = 0;
			Static336.anInt6301 = arg1;
			Static302.anInt5846 = 2;
			Static237.anInt4614 = arg2;
			local234 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local23);
			if (local234 != null) {
				local239 = local234.aClass47_Sub2_Sub3_Sub1_2;
				@Pc(242) Class238 local242 = local239.aClass238_1;
				if (local242.anIntArray511 != null) {
					local242 = local242.method5866(Static343.aClass286_1);
				}
				if (local242 != null) {
					Static444.method6416(Static138.aClass186_120);
					Static192.aClass1_Sub13_Sub2_1.method3038(local242.anInt6770);
				}
			}
		}
		if (local19 == 22) {
			Static302.anInt5846 = 2;
			Static237.anInt4614 = arg2;
			Static336.anInt6301 = arg1;
			Static222.anInt4503 = 0;
			Static444.method6416(Static434.aClass186_102);
			Static192.aClass1_Sub13_Sub2_1.method3060(Static126.aClass60_1.method5384(82) ? 1 : 0);
			Static192.aClass1_Sub13_Sub2_1.method3023(Static517.anInt8716 + local16);
			Static192.aClass1_Sub13_Sub2_1.method3038(Static324.anInt6132 + local13);
			Static192.aClass1_Sub13_Sub2_1.method3028(Integer.MAX_VALUE & (int) (local26 >>> 32));
			Static242.method1909(local13, local26, local16);
		}
		if (local19 == 50) {
			local41 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local23];
			if (local41 != null) {
				Static222.anInt4503 = 0;
				Static336.anInt6301 = arg1;
				Static302.anInt5846 = 2;
				Static237.anInt4614 = arg2;
				Static444.method6416(Static414.aClass186_98);
				Static192.aClass1_Sub13_Sub2_1.method3065(Static126.aClass60_1.method5384(82) ? 1 : 0);
				Static192.aClass1_Sub13_Sub2_1.method3028(local23);
				Static76.method1968(local41.anIntArray362[0], local41.method4350(), true, local41.anIntArray361[0], local41.method4350(), -2, 0, 0);
			}
		}
		if (local19 == 45) {
			local234 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local23);
			if (local234 != null) {
				Static237.anInt4614 = arg2;
				Static302.anInt5846 = 2;
				local239 = local234.aClass47_Sub2_Sub3_Sub1_2;
				Static336.anInt6301 = arg1;
				Static222.anInt4503 = 0;
				Static444.method6416(Static193.aClass186_63);
				Static192.aClass1_Sub13_Sub2_1.method3023(local23);
				Static192.aClass1_Sub13_Sub2_1.method3047(Static126.aClass60_1.method5384(82) ? 1 : 0);
				Static76.method1968(local239.anIntArray362[0], local239.method4350(), true, local239.anIntArray361[0], local239.method4350(), -2, 0, 0);
			}
		}
		if (local19 == 59) {
			Static222.anInt4503 = 0;
			Static302.anInt5846 = 2;
			Static237.anInt4614 = arg2;
			Static336.anInt6301 = arg1;
			Static444.method6416(Static196.aClass186_64);
			Static192.aClass1_Sub13_Sub2_1.method3028(local16 + Static517.anInt8716);
			Static192.aClass1_Sub13_Sub2_1.method3028(local13 + Static324.anInt6132);
			Static192.aClass1_Sub13_Sub2_1.method3028(local23);
			Static192.aClass1_Sub13_Sub2_1.method3047(Static126.aClass60_1.method5384(82) ? 1 : 0);
			Static138.method7945(local16, local13);
		}
		@Pc(507) Class309 local507;
		if (local19 == 2) {
			local507 = Static210.method3818(local16, local13);
			if (local507 != null) {
				Static214.method3846();
				@Pc(514) Class1_Sub51 local514 = Static62.method1740(local507);
				Static139.method2954(local514.anInt9473, local514.method7990(), local507);
				Static433.aString72 = Static288.method4856(local507);
				if (Static433.aString72 == null) {
					Static433.aString72 = "Null";
				}
				Static469.aString69 = local507.aString81 + "<col=ffffff>";
			}
			return;
		}
		if (local19 == 18) {
			if (Static351.anInt6430 > 0 && Static126.aClass60_1.method5384(82) && Static126.aClass60_1.method5384(81)) {
				Static86.method2085(Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94, Static517.anInt8716 + local16, local13 + Static324.anInt6132);
			} else {
				Static231.method6240(local13, local16, local23);
				if (local23 == 1) {
					Static192.aClass1_Sub13_Sub2_1.method3060(-1);
					Static192.aClass1_Sub13_Sub2_1.method3060(-1);
					Static192.aClass1_Sub13_Sub2_1.method3038((int) Static443.aFloat151);
					Static192.aClass1_Sub13_Sub2_1.method3060(57);
					Static192.aClass1_Sub13_Sub2_1.method3060(Static96.anInt2375);
					Static192.aClass1_Sub13_Sub2_1.method3060(Static189.anInt4000);
					Static192.aClass1_Sub13_Sub2_1.method3060(89);
					Static192.aClass1_Sub13_Sub2_1.method3038(Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189);
					Static192.aClass1_Sub13_Sub2_1.method3038(Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191);
					Static192.aClass1_Sub13_Sub2_1.method3060(63);
				} else {
					Static302.anInt5846 = 1;
					Static237.anInt4614 = arg2;
					Static336.anInt6301 = arg1;
					Static222.anInt4503 = 0;
				}
				Static76.method1968(local13, 1, true, local16, 1, -4, 0, 0);
			}
		}
		if (local19 == 60) {
			Static302.anInt5846 = 2;
			Static222.anInt4503 = 0;
			Static237.anInt4614 = arg2;
			Static336.anInt6301 = arg1;
			Static444.method6416(Static292.aClass186_83);
			Static192.aClass1_Sub13_Sub2_1.method3019(Static324.anInt6132 + local13);
			Static192.aClass1_Sub13_Sub2_1.method3028(Static517.anInt8716 + local16);
			Static192.aClass1_Sub13_Sub2_1.method3047(Static126.aClass60_1.method5384(82) ? 1 : 0);
			Static192.aClass1_Sub13_Sub2_1.method3019(local23);
			Static138.method7945(local16, local13);
		}
		if (local19 == 1009) {
			Static302.anInt5846 = 2;
			Static222.anInt4503 = 0;
			Static336.anInt6301 = arg1;
			Static237.anInt4614 = arg2;
			Static444.method6416(Static2.aClass186_78);
			Static192.aClass1_Sub13_Sub2_1.method3038(local23);
		}
		if (local19 == 25) {
			if (Static351.anInt6430 > 0 && Static126.aClass60_1.method5384(82) && Static126.aClass60_1.method5384(81)) {
				Static86.method2085(Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94, local16 + Static517.anInt8716, local13 + Static324.anInt6132);
			} else {
				Static237.anInt4614 = arg2;
				Static302.anInt5846 = 1;
				Static336.anInt6301 = arg1;
				Static222.anInt4503 = 0;
				Static444.method6416(Static107.aClass186_34);
				Static192.aClass1_Sub13_Sub2_1.method3028(local13 + Static324.anInt6132);
				Static192.aClass1_Sub13_Sub2_1.method3023(Static517.anInt8716 + local16);
			}
		}
		if (local19 == 1011) {
			Static237.anInt4614 = arg2;
			Static222.anInt4503 = 0;
			Static302.anInt5846 = 2;
			Static336.anInt6301 = arg1;
			Static444.method6416(Static204.aClass186_66);
			Static192.aClass1_Sub13_Sub2_1.method3028(Static517.anInt8716 + local16);
			Static192.aClass1_Sub13_Sub2_1.method3021(Static126.aClass60_1.method5384(82) ? 1 : 0);
			Static192.aClass1_Sub13_Sub2_1.method3038(local13 + Static324.anInt6132);
			Static192.aClass1_Sub13_Sub2_1.method3038((int) (local26 >>> 32) & Integer.MAX_VALUE);
			Static242.method1909(local13, local26, local16);
		}
		if (local19 == 46) {
			local234 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local23);
			if (local234 != null) {
				Static222.anInt4503 = 0;
				Static237.anInt4614 = arg2;
				local239 = local234.aClass47_Sub2_Sub3_Sub1_2;
				Static302.anInt5846 = 2;
				Static336.anInt6301 = arg1;
				Static444.method6416(Static275.aClass186_76);
				Static192.aClass1_Sub13_Sub2_1.method3028(local23);
				Static192.aClass1_Sub13_Sub2_1.method3021(Static126.aClass60_1.method5384(82) ? 1 : 0);
				Static76.method1968(local239.anIntArray362[0], local239.method4350(), true, local239.anIntArray361[0], local239.method4350(), -2, 0, 0);
			}
		}
		if (local19 == 9) {
			Static237.anInt4614 = arg2;
			Static336.anInt6301 = arg1;
			Static222.anInt4503 = 0;
			Static302.anInt5846 = 2;
			Static444.method6416(Static539.aClass186_118);
			Static192.aClass1_Sub13_Sub2_1.method3019(local13 + Static324.anInt6132);
			Static192.aClass1_Sub13_Sub2_1.method3021(Static126.aClass60_1.method5384(82) ? 1 : 0);
			Static192.aClass1_Sub13_Sub2_1.method3038(Integer.MAX_VALUE & (int) (local26 >>> 32));
			Static192.aClass1_Sub13_Sub2_1.method3019(Static517.anInt8716 + local16);
			Static242.method1909(local13, local26, local16);
		}
		if (local19 == 44) {
			local41 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local23];
			if (local41 != null) {
				Static222.anInt4503 = 0;
				Static237.anInt4614 = arg2;
				Static336.anInt6301 = arg1;
				Static302.anInt5846 = 2;
				Static444.method6416(Static68.aClass186_25);
				Static192.aClass1_Sub13_Sub2_1.method3019(local23);
				Static192.aClass1_Sub13_Sub2_1.method3021(Static126.aClass60_1.method5384(82) ? 1 : 0);
				Static76.method1968(local41.anIntArray362[0], local41.method4350(), true, local41.anIntArray361[0], local41.method4350(), -2, 0, 0);
			}
		}
		if (local19 == 47) {
			local234 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local23);
			if (local234 != null) {
				Static302.anInt5846 = 2;
				Static237.anInt4614 = arg2;
				Static222.anInt4503 = 0;
				Static336.anInt6301 = arg1;
				local239 = local234.aClass47_Sub2_Sub3_Sub1_2;
				Static444.method6416(Static175.aClass186_52);
				Static192.aClass1_Sub13_Sub2_1.method3038(local23);
				Static192.aClass1_Sub13_Sub2_1.method3021(Static126.aClass60_1.method5384(82) ? 1 : 0);
				Static76.method1968(local239.anIntArray362[0], local239.method4350(), true, local239.anIntArray361[0], local239.method4350(), -2, 0, 0);
			}
		}
		if (local19 == 1012) {
			Static336.anInt6301 = arg1;
			Static237.anInt4614 = arg2;
			Static222.anInt4503 = 0;
			Static302.anInt5846 = 2;
			Static444.method6416(Static104.aClass186_32);
			Static192.aClass1_Sub13_Sub2_1.method3038(local23);
		}
		if (local19 == 20) {
			Static222.anInt4503 = 0;
			Static336.anInt6301 = arg1;
			Static302.anInt5846 = 2;
			Static237.anInt4614 = arg2;
			Static444.method6416(Static242.aClass186_27);
			Static192.aClass1_Sub13_Sub2_1.method3064(Static323.anInt6116);
			Static192.aClass1_Sub13_Sub2_1.method3023(Static517.anInt8716 + local16);
			Static192.aClass1_Sub13_Sub2_1.method3038(local23);
			Static192.aClass1_Sub13_Sub2_1.method3019(Static324.anInt6132 + local13);
			Static192.aClass1_Sub13_Sub2_1.method3038(Static368.anInt6563);
			Static192.aClass1_Sub13_Sub2_1.method3038(Static423.anInt8970);
			Static192.aClass1_Sub13_Sub2_1.method3065(Static126.aClass60_1.method5384(82) ? 1 : 0);
			Static138.method7945(local16, local13);
		}
		if (local19 == 57) {
			local41 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local23];
			if (local41 != null) {
				Static302.anInt5846 = 2;
				Static336.anInt6301 = arg1;
				Static237.anInt4614 = arg2;
				Static222.anInt4503 = 0;
				Static444.method6416(Static16.aClass186_3);
				Static192.aClass1_Sub13_Sub2_1.method3047(Static126.aClass60_1.method5384(82) ? 1 : 0);
				Static192.aClass1_Sub13_Sub2_1.method3028(local23);
				Static76.method1968(local41.anIntArray362[0], local41.method4350(), true, local41.anIntArray361[0], local41.method4350(), -2, 0, 0);
			}
		}
		if (local19 == 51) {
			local41 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local23];
			if (local41 != null) {
				Static336.anInt6301 = arg1;
				Static237.anInt4614 = arg2;
				Static222.anInt4503 = 0;
				Static302.anInt5846 = 2;
				Static444.method6416(Static89.aClass186_29);
				Static192.aClass1_Sub13_Sub2_1.method3023(local23);
				Static192.aClass1_Sub13_Sub2_1.method3021(Static126.aClass60_1.method5384(82) ? 1 : 0);
				Static76.method1968(local41.anIntArray362[0], local41.method4350(), true, local41.anIntArray361[0], local41.method4350(), -2, 0, 0);
			}
		}
		if (local19 == 19) {
			local41 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local23];
			if (local41 != null) {
				Static336.anInt6301 = arg1;
				Static237.anInt4614 = arg2;
				Static222.anInt4503 = 0;
				Static302.anInt5846 = 2;
				Static444.method6416(Static180.aClass186_57);
				Static192.aClass1_Sub13_Sub2_1.method3038(Static423.anInt8970);
				Static192.aClass1_Sub13_Sub2_1.method3069(Static323.anInt6116);
				Static192.aClass1_Sub13_Sub2_1.method3023(local23);
				Static192.aClass1_Sub13_Sub2_1.method3065(Static126.aClass60_1.method5384(82) ? 1 : 0);
				Static192.aClass1_Sub13_Sub2_1.method3028(Static368.anInt6563);
				Static76.method1968(local41.anIntArray362[0], local41.method4350(), true, local41.anIntArray361[0], local41.method4350(), -2, 0, 0);
			}
		}
		if (local19 == 23) {
			local41 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local23];
			if (local41 != null) {
				Static336.anInt6301 = arg1;
				Static302.anInt5846 = 2;
				Static222.anInt4503 = 0;
				Static237.anInt4614 = arg2;
				Static444.method6416(Static38.aClass186_11);
				Static192.aClass1_Sub13_Sub2_1.method3047(Static126.aClass60_1.method5384(82) ? 1 : 0);
				Static192.aClass1_Sub13_Sub2_1.method3038(local23);
				Static76.method1968(local41.anIntArray362[0], local41.method4350(), true, local41.anIntArray361[0], local41.method4350(), -2, 0, 0);
			}
		}
		if (local19 == 5) {
			local507 = Static210.method3818(local16, local13);
			if (local507 != null) {
				Static481.method6971(local507);
			}
		}
		if (local19 == 16 || local19 == 1002) {
			Static51.method6738(local16, arg0.aString83, local13, local23);
		}
		if (local19 == 10 && Static531.aClass309_14 == null) {
			Static339.method5500(local13, local16);
			Static531.aClass309_14 = Static210.method3818(local16, local13);
			Static291.method4908(Static531.aClass309_14);
		}
		if (local19 == 17) {
			local41 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local23];
			if (local41 != null) {
				Static222.anInt4503 = 0;
				Static237.anInt4614 = arg2;
				Static336.anInt6301 = arg1;
				Static302.anInt5846 = 2;
				Static444.method6416(Static172.aClass186_48);
				Static192.aClass1_Sub13_Sub2_1.method3047(Static126.aClass60_1.method5384(82) ? 1 : 0);
				Static192.aClass1_Sub13_Sub2_1.method3038(local23);
				Static76.method1968(local41.anIntArray362[0], local41.method4350(), true, local41.anIntArray361[0], local41.method4350(), -2, 0, 0);
			}
		}
		if (local19 == 3) {
			local234 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local23);
			if (local234 != null) {
				Static336.anInt6301 = arg1;
				Static222.anInt4503 = 0;
				Static302.anInt5846 = 2;
				local239 = local234.aClass47_Sub2_Sub3_Sub1_2;
				Static237.anInt4614 = arg2;
				Static444.method6416(Static155.aClass186_50);
				Static192.aClass1_Sub13_Sub2_1.method3019(local23);
				Static192.aClass1_Sub13_Sub2_1.method3065(Static126.aClass60_1.method5384(82) ? 1 : 0);
				Static76.method1968(local239.anIntArray362[0], local239.method4350(), true, local239.anIntArray361[0], local239.method4350(), -2, 0, 0);
			}
		}
		if (local19 == 49) {
			Static302.anInt5846 = 2;
			Static336.anInt6301 = arg1;
			Static222.anInt4503 = 0;
			Static237.anInt4614 = arg2;
			Static444.method6416(Static476.aClass186_99);
			Static192.aClass1_Sub13_Sub2_1.method3023(Static517.anInt8716 + local16);
			Static192.aClass1_Sub13_Sub2_1.method3047(Static126.aClass60_1.method5384(82) ? 1 : 0);
			Static192.aClass1_Sub13_Sub2_1.method3019(Static324.anInt6132 + local13);
			Static192.aClass1_Sub13_Sub2_1.method3028((int) (local26 >>> 32) & Integer.MAX_VALUE);
			Static242.method1909(local13, local26, local16);
		}
		if (local19 == 30) {
			local234 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local23);
			if (local234 != null) {
				Static237.anInt4614 = arg2;
				Static302.anInt5846 = 2;
				Static222.anInt4503 = 0;
				local239 = local234.aClass47_Sub2_Sub3_Sub1_2;
				Static336.anInt6301 = arg1;
				Static444.method6416(Static409.aClass186_97);
				Static192.aClass1_Sub13_Sub2_1.method3060(Static126.aClass60_1.method5384(82) ? 1 : 0);
				Static192.aClass1_Sub13_Sub2_1.method3028(Static423.anInt8970);
				Static192.aClass1_Sub13_Sub2_1.method3028(local23);
				Static192.aClass1_Sub13_Sub2_1.method3064(Static323.anInt6116);
				Static192.aClass1_Sub13_Sub2_1.method3019(Static368.anInt6563);
				Static76.method1968(local239.anIntArray362[0], local239.method4350(), true, local239.anIntArray361[0], local239.method4350(), -2, 0, 0);
			}
		}
		if (local19 == 13) {
			Static222.anInt4503 = 0;
			Static302.anInt5846 = 2;
			Static336.anInt6301 = arg1;
			Static237.anInt4614 = arg2;
			Static444.method6416(Static34.aClass186_9);
			Static192.aClass1_Sub13_Sub2_1.method3023(Static324.anInt6132 + local13);
			Static192.aClass1_Sub13_Sub2_1.method3047(Static126.aClass60_1.method5384(82) ? 1 : 0);
			Static192.aClass1_Sub13_Sub2_1.method3028(local23);
			Static192.aClass1_Sub13_Sub2_1.method3038(Static517.anInt8716 + local16);
			Static138.method7945(local16, local13);
		}
		if (local19 == 12) {
			Static302.anInt5846 = 2;
			Static237.anInt4614 = arg2;
			Static336.anInt6301 = arg1;
			Static222.anInt4503 = 0;
			Static444.method6416(Static298.aClass186_84);
			Static192.aClass1_Sub13_Sub2_1.method3019(local16 + Static517.anInt8716);
			Static192.aClass1_Sub13_Sub2_1.method3047(Static126.aClass60_1.method5384(82) ? 1 : 0);
			Static192.aClass1_Sub13_Sub2_1.method3038(Integer.MAX_VALUE & (int) (local26 >>> 32));
			Static192.aClass1_Sub13_Sub2_1.method3023(Static324.anInt6132 + local13);
			Static242.method1909(local13, local26, local16);
		}
		if (local19 == 21) {
			Static237.anInt4614 = arg2;
			Static336.anInt6301 = arg1;
			Static222.anInt4503 = 0;
			Static302.anInt5846 = 2;
			Static444.method6416(Static246.aClass186_71);
			Static192.aClass1_Sub13_Sub2_1.method3023(local16 + Static517.anInt8716);
			Static192.aClass1_Sub13_Sub2_1.method3023(Static324.anInt6132 + local13);
			Static192.aClass1_Sub13_Sub2_1.method3019(local23);
			Static192.aClass1_Sub13_Sub2_1.method3021(Static126.aClass60_1.method5384(82) ? 1 : 0);
			Static138.method7945(local16, local13);
		}
		if (local19 == 6) {
			Static222.anInt4503 = 0;
			Static237.anInt4614 = arg2;
			Static302.anInt5846 = 2;
			Static336.anInt6301 = arg1;
			Static444.method6416(Static222.aClass186_69);
			Static192.aClass1_Sub13_Sub2_1.method3019(local16 + Static517.anInt8716);
			Static192.aClass1_Sub13_Sub2_1.method3065(Static126.aClass60_1.method5384(82) ? 1 : 0);
			Static192.aClass1_Sub13_Sub2_1.method3023(local23);
			Static192.aClass1_Sub13_Sub2_1.method3019(Static324.anInt6132 + local13);
			Static138.method7945(local16, local13);
		}
		if (local19 == 11) {
			local234 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local23);
			if (local234 != null) {
				Static237.anInt4614 = arg2;
				Static222.anInt4503 = 0;
				local239 = local234.aClass47_Sub2_Sub3_Sub1_2;
				Static302.anInt5846 = 2;
				Static336.anInt6301 = arg1;
				Static444.method6416(Static134.aClass186_44);
				Static192.aClass1_Sub13_Sub2_1.method3023(local23);
				Static192.aClass1_Sub13_Sub2_1.method3060(Static126.aClass60_1.method5384(82) ? 1 : 0);
				Static76.method1968(local239.anIntArray362[0], local239.method4350(), true, local239.anIntArray361[0], local239.method4350(), -2, 0, 0);
			}
		}
		if (local19 == 1007 || local19 == 1008 || local19 == 1010 || local19 == 1003 || local19 == 1004) {
			Static224.method3953(local19, local13, local23);
		}
		if (local19 == 8) {
			local41 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local23];
			if (local41 != null) {
				Static336.anInt6301 = arg1;
				Static222.anInt4503 = 0;
				Static237.anInt4614 = arg2;
				Static302.anInt5846 = 2;
				Static444.method6416(Static144.aClass186_46);
				Static192.aClass1_Sub13_Sub2_1.method3060(Static126.aClass60_1.method5384(82) ? 1 : 0);
				Static192.aClass1_Sub13_Sub2_1.method3023(local23);
				Static76.method1968(local41.anIntArray362[0], local41.method4350(), true, local41.anIntArray361[0], local41.method4350(), -2, 0, 0);
			}
		}
		if (local19 == 58) {
			Static222.anInt4503 = 0;
			Static237.anInt4614 = arg2;
			Static336.anInt6301 = arg1;
			Static302.anInt5846 = 2;
			Static444.method6416(Static180.aClass186_57);
			Static192.aClass1_Sub13_Sub2_1.method3038(Static423.anInt8970);
			Static192.aClass1_Sub13_Sub2_1.method3069(Static323.anInt6116);
			Static192.aClass1_Sub13_Sub2_1.method3023(Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5045);
			Static192.aClass1_Sub13_Sub2_1.method3065(Static126.aClass60_1.method5384(82) ? 1 : 0);
			Static192.aClass1_Sub13_Sub2_1.method3028(Static368.anInt6563);
		}
		if (Static382.aBoolean440) {
			Static214.method3846();
		}
		if (Static447.aClass309_12 != null && Static183.anInt3920 == 0) {
			Static291.method4908(Static447.aClass309_12);
		}
	}
}
