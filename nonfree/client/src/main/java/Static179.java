import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!tf", name = "Ub", descriptor = "Lclient!ba;")
	public static Class11 aClass11_19;

	@OriginalMember(owner = "client!tf", name = "Yb", descriptor = "[[[Lclient!lc;")
	public static Class1_Sub17[][][] aClass1_Sub17ArrayArrayArray1;

	@OriginalMember(owner = "client!tf", name = "ac", descriptor = "Lclient!le;")
	public static Class57 aClass57_4;

	@OriginalMember(owner = "client!tf", name = "Y", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[5];

	@OriginalMember(owner = "client!tf", name = "kb", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!tf", name = "Cb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1847 = Static187.method3089("logo");

	@OriginalMember(owner = "client!tf", name = "bc", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1850 = Static187.method3089("Discard");

	@OriginalMember(owner = "client!tf", name = "Tb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1848 = aClass92_1850;

	@OriginalMember(owner = "client!tf", name = "Wb", descriptor = "I")
	public static int anInt3907 = 1;

	@OriginalMember(owner = "client!tf", name = "Xb", descriptor = "I")
	public static int anInt3908 = 0;

	@OriginalMember(owner = "client!tf", name = "Zb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1849 = Static187.method3089("<col=ff3000>");

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB[Lclient!vd;I)Lclient!vd;")
	public static Class92 method2928(@OriginalArg(0) int arg0, @OriginalArg(2) Class92[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			if (arg1[arg2 + local9] == null) {
				arg1[arg2 + local9] = Static94.aClass92_875;
			}
			local7 += arg1[local9 + arg2].anInt4244;
		}
		@Pc(38) int local38 = 0;
		@Pc(41) byte[] local41 = new byte[local7];
		@Pc(51) Class92 local51;
		for (@Pc(43) int local43 = 0; local43 < arg0; local43++) {
			local51 = arg1[arg2 + local43];
			Static216.method2200(local51.aByteArray52, 0, local41, local38, local51.anInt4244);
			local38 += local51.anInt4244;
		}
		local51 = new Class92();
		local51.aByteArray52 = local41;
		local51.anInt4244 = local7;
		return local51;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!ba;IIII)V")
	public static void method2929(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static140.method2075();
		Static46.method3170(arg3, arg1, arg0.anInt312 + arg3, arg0.anInt263 + arg1);
		if (Static61.anInt1466 == 2 || Static61.anInt1466 == 5) {
			Static46.method3172(arg3, arg1, arg0.anIntArray27, arg0.anIntArray32);
		} else {
			@Pc(50) int local50 = Static106.anInt2306 + Static31.anInt742 & 0x7FF;
			@Pc(57) int local57 = Static15.aClass8_Sub3_Sub1_1.anInt3600 / 32 + 48;
			@Pc(65) int local65 = 464 - Static15.aClass8_Sub3_Sub1_1.anInt3606 / 32;
			Static141.aClass1_Sub3_Sub1_Sub1_4.method366(arg3, arg1, arg0.anInt312, arg0.anInt263, local57, local65, local50, Static183.anInt3930 + 256, arg0.anIntArray27, arg0.anIntArray32);
			@Pc(114) int local114;
			@Pc(101) int local101;
			for (@Pc(85) int local85 = 0; local85 < Static74.anInt1651; local85++) {
				local101 = Static52.anIntArray92[local85] * 4 + 2 - Static15.aClass8_Sub3_Sub1_1.anInt3606 / 32;
				local114 = Static10.anIntArray21[local85] * 4 + 2 - Static15.aClass8_Sub3_Sub1_1.anInt3600 / 32;
				@Pc(120) Class1_Sub3_Sub5 local120 = Static154.method2362(Static203.anIntArray362[local85]);
				if (local120.anIntArray116 != null) {
					local120 = local120.method959();
					if (local120 == null || local120.anInt1412 == -1) {
						continue;
					}
				}
				Static202.method3346(local114, arg3, arg1, Static52.aClass1_Sub3_Sub1_Sub1Array12[local120.anInt1412], local101, arg0);
			}
			@Pc(196) int local196;
			for (local114 = 0; local114 < 104; local114++) {
				for (local101 = 0; local101 < 104; local101++) {
					@Pc(170) Class20 local170 = Static210.aClass20ArrayArrayArray1[Static192.anInt4180][local114][local101];
					if (local170 != null) {
						@Pc(184) int local184 = local114 * 4 + 2 - Static15.aClass8_Sub3_Sub1_1.anInt3600 / 32;
						local196 = local101 * 4 + 2 - Static15.aClass8_Sub3_Sub1_1.anInt3606 / 32;
						Static202.method3346(local184, arg3, arg1, Static209.aClass1_Sub3_Sub1_Sub1Array21[0], local196, arg0);
					}
				}
			}
			@Pc(260) int local260;
			for (local101 = 0; local101 < Static153.anInt3186; local101++) {
				@Pc(224) Class8_Sub3_Sub2 local224 = Static177.aClass8_Sub3_Sub2Array1[Static103.anIntArray167[local101]];
				if (local224 != null && local224.method2681()) {
					@Pc(233) Class1_Sub3_Sub13 local233 = local224.aClass1_Sub3_Sub13_1;
					if (local233 != null && local233.anIntArray169 != null) {
						local233 = local233.method1581();
					}
					if (local233 != null && local233.aBoolean130 && local233.aBoolean131) {
						local260 = local224.anInt3606 / 32 - Static15.aClass8_Sub3_Sub1_1.anInt3606 / 32;
						local196 = local224.anInt3600 / 32 - Static15.aClass8_Sub3_Sub1_1.anInt3600 / 32;
						Static202.method3346(local196, arg3, arg1, Static209.aClass1_Sub3_Sub1_Sub1Array21[1], local260, arg0);
					}
				}
			}
			for (@Pc(291) int local291 = 0; local291 < Static35.anInt992; local291++) {
				@Pc(299) Class8_Sub3_Sub1 local299 = Static47.aClass8_Sub3_Sub1Array1[Static111.anIntArray181[local291]];
				if (local299 != null && local299.method2681()) {
					local196 = local299.anInt3600 / 32 - Static15.aClass8_Sub3_Sub1_1.anInt3600 / 32;
					local260 = local299.anInt3606 / 32 - Static15.aClass8_Sub3_Sub1_1.anInt3606 / 32;
					@Pc(329) boolean local329 = false;
					@Pc(334) long local334 = local299.aClass92_374.method3217();
					for (@Pc(336) int local336 = 0; local336 < Static78.anInt1731; local336++) {
						if (Static106.aLongArray7[local336] == local334 && Static33.anIntArray61[local336] != 0) {
							local329 = true;
							break;
						}
					}
					@Pc(365) boolean local365 = false;
					if (Static15.aClass8_Sub3_Sub1_1.anInt986 != 0 && local299.anInt986 != 0 && Static15.aClass8_Sub3_Sub1_1.anInt986 == local299.anInt986) {
						local365 = true;
					}
					if (local329) {
						Static202.method3346(local196, arg3, arg1, Static209.aClass1_Sub3_Sub1_Sub1Array21[3], local260, arg0);
					} else if (local365) {
						Static202.method3346(local196, arg3, arg1, Static209.aClass1_Sub3_Sub1_Sub1Array21[4], local260, arg0);
					} else {
						Static202.method3346(local196, arg3, arg1, Static209.aClass1_Sub3_Sub1_Sub1Array21[2], local260, arg0);
					}
				}
			}
			@Pc(436) Class55[] local436 = Static117.aClass55Array1;
			@Pc(551) int local551;
			for (local196 = 0; local196 < local436.length; local196++) {
				@Pc(444) Class55 local444 = local436[local196];
				if (local444 != null && local444.anInt2276 != 0 && Static155.anInt2981 % 20 < 10) {
					@Pc(495) int local495;
					@Pc(506) int local506;
					if (local444.anInt2276 == 1 && local444.anInt2281 >= 0 && local444.anInt2281 < Static177.aClass8_Sub3_Sub2Array1.length) {
						@Pc(482) Class8_Sub3_Sub2 local482 = Static177.aClass8_Sub3_Sub2Array1[local444.anInt2281];
						if (local482 != null) {
							local495 = local482.anInt3606 / 32 - Static15.aClass8_Sub3_Sub1_1.anInt3606 / 32;
							local506 = local482.anInt3600 / 32 - Static15.aClass8_Sub3_Sub1_1.anInt3600 / 32;
							Static69.method1082(local495, local506, local444.anInt2275, arg0, arg1, arg3);
						}
					}
					if (local444.anInt2276 == 2) {
						local506 = (local444.anInt2274 - Static138.anInt2800) * 4 + 2 - Static15.aClass8_Sub3_Sub1_1.anInt3606 / 32;
						local551 = (local444.anInt2280 - Static100.anInt2141) * 4 + 2 - Static15.aClass8_Sub3_Sub1_1.anInt3600 / 32;
						Static69.method1082(local506, local551, local444.anInt2275, arg0, arg1, arg3);
					}
					if (local444.anInt2276 == 10 && local444.anInt2281 >= 0 && Static47.aClass8_Sub3_Sub1Array1.length > local444.anInt2281) {
						@Pc(583) Class8_Sub3_Sub1 local583 = Static47.aClass8_Sub3_Sub1Array1[local444.anInt2281];
						if (local583 != null) {
							local506 = local583.anInt3600 / 32 - Static15.aClass8_Sub3_Sub1_1.anInt3600 / 32;
							local495 = local583.anInt3606 / 32 - Static15.aClass8_Sub3_Sub1_1.anInt3606 / 32;
							Static69.method1082(local495, local506, local444.anInt2275, arg0, arg1, arg3);
						}
					}
				}
			}
			if (Static120.anInt2555 != 0) {
				local260 = Static120.anInt2555 * 4 + 2 - Static15.aClass8_Sub3_Sub1_1.anInt3600 / 32;
				local551 = Static189.anInt4125 * 4 + 2 - Static15.aClass8_Sub3_Sub1_1.anInt3606 / 32;
				Static202.method3346(local260, arg3, arg1, Static176.aClass1_Sub3_Sub1_Sub1_6, local551, arg0);
			}
			Static46.method3173(arg0.anInt312 / 2 + arg3 - 1, arg0.anInt263 / 2 + arg1 + -1, 3, 3, 16777215);
		}
		Static143.aBooleanArray13[arg2] = true;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BJ)Lclient!vd;")
	public static Class92 method2937(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(37) int local37 = 0;
			@Pc(39) long local39 = arg0;
			while (local39 != 0L) {
				local39 /= 37L;
				local37++;
			}
			@Pc(53) byte[] local53 = new byte[local37];
			while (arg0 != 0L) {
				@Pc(57) long local57 = arg0;
				arg0 /= 37L;
				local37--;
				local53[local37] = Static208.aByteArray4[(int) (local57 - arg0 * 37L)];
			}
			@Pc(84) Class92 local84 = new Class92();
			local84.aByteArray52 = local53;
			local84.anInt4244 = local53.length;
			return local84;
		}
	}
}
