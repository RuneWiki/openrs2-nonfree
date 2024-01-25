import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "Lclient!wf;")
	public static Class388 aClass388_1;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "[Lclient!sf;")
	public static Class41_Sub1[] aClass41_Sub1Array2;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
	public static int anInt2181;

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString19;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
	public static int anInt2180 = 64;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1975(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public static void method1977() {
		if (Static127.aClass247Array1 == null) {
			Static127.aClass247Array1 = Static400.method5876();
			Static382.aClass247_2 = Static127.aClass247Array1[0];
			Static542.aLong271 = Static124.method1947();
		}
		if (Static459.aClass204_1 == null) {
			Static134.method1737();
		}
		@Pc(46) Class247 local46 = Static382.aClass247_2;
		@Pc(49) int local49 = Static206.method2866();
		if (Static382.aClass247_2 == local46) {
			Static353.aString62 = Static382.aClass247_2.aClass42_64.method730(Static259.anInt4113);
			if (Static382.aClass247_2.aBoolean497) {
				Static596.anInt9714 = Static382.aClass247_2.anInt6917 + (Static382.aClass247_2.anInt6916 - Static382.aClass247_2.anInt6917) * local49 / 100;
			}
			if (Static382.aClass247_2.aBoolean498) {
				Static353.aString62 = Static353.aString62 + Static596.anInt9714 + "%";
			}
		} else if (Static400.aClass247_23 == Static382.aClass247_2) {
			Static459.aClass204_1 = null;
			Static42.method560(3);
		} else {
			Static353.aString62 = local46.aClass42_63.method730(Static259.anInt4113);
			Static596.anInt9714 = local46.anInt6916;
			if (Static382.aClass247_2.aBoolean498) {
				Static353.aString62 = Static353.aString62 + local46.anInt6916 + "%";
			}
			if (Static382.aClass247_2.aBoolean497 || local46.aBoolean497) {
				Static542.aLong271 = Static124.method1947();
			}
		}
		if (Static459.aClass204_1 == null) {
			return;
		}
		Static459.aClass204_1.method4786(Static542.aLong271, Static382.aClass247_2, Static353.aString62, Static596.anInt9714);
		if (Static603.anInterface7Array1 == null) {
			return;
		}
		for (@Pc(148) int local148 = Static3.anInt25 + 1; local148 < Static603.anInterface7Array1.length; local148++) {
			if (Static603.anInterface7Array1[local148].method8440() >= 100 && Static3.anInt25 == local148 - 1 && Static539.anInt8853 >= 1 && Static459.aClass204_1.method4781()) {
				try {
					Static603.anInterface7Array1[local148].method8442();
				} catch (@Pc(180) Exception local180) {
					Static603.anInterface7Array1 = null;
					return;
				}
				Static459.aClass204_1.method4787(Static603.anInterface7Array1[local148]);
				Static3.anInt25++;
				if (Static3.anInt25 >= Static603.anInterface7Array1.length - 1 && Static603.anInterface7Array1.length > 1) {
					Static3.anInt25 = Static13.aClass337_1.method7814() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static662.aBoolean761 = true;
		Static246.aBoolean276 = Static267.aClass143_6.method6237() > 0;
		Static281.aBoolean294 = true;
		Static281.anInt4404 = arg1 >> Static138.anInt2287;
		Static411.anInt7045 = arg3 >> Static138.anInt2287;
		Static62.anInt988 = arg1;
		Static668.anInt10414 = arg3;
		Static530.anInt8770 = arg2;
		Static15.anInt230 = Static281.anInt4404 - Static537.anInt10357;
		if (Static15.anInt230 < 0) {
			Static453.anInt7906 = -Static15.anInt230;
			Static15.anInt230 = 0;
		} else {
			Static453.anInt7906 = 0;
		}
		Static582.anInt9578 = Static411.anInt7045 - Static537.anInt10357;
		if (Static582.anInt9578 < 0) {
			Static512.anInt8631 = -Static582.anInt9578;
			Static582.anInt9578 = 0;
		} else {
			Static512.anInt8631 = 0;
		}
		Static544.anInt8920 = Static281.anInt4404 + Static537.anInt10357;
		if (Static544.anInt8920 > Static665.anInt7330) {
			Static544.anInt8920 = Static665.anInt7330;
		}
		Static264.anInt4215 = Static411.anInt7045 + Static537.anInt10357;
		if (Static264.anInt4215 > Static92.anInt1526) {
			Static264.anInt4215 = Static92.anInt1526;
		}
		@Pc(72) boolean[][] local72 = Static10.aBooleanArrayArray1;
		@Pc(74) boolean[][] local74 = Static115.aBooleanArrayArray3;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static281.aBoolean294) {
			for (local78 = 0; local78 < Static537.anInt10357 + Static537.anInt10357 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static537.anInt10357 + Static537.anInt10357 + 2; local85++) {
					if (local85 > 1) {
						Static652.anIntArray595[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static281.anInt4404 + local78 - Static537.anInt10357;
					@Pc(109) int local109 = Static411.anInt7045 + local85 - Static537.anInt10357;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static665.anInt7330 && local109 < Static92.anInt1526) {
						local123 = local103 << Static138.anInt2287;
						@Pc(127) int local127 = local109 << Static138.anInt2287;
						@Pc(144) int local144 = Static230.aClass88Array2[Static230.aClass88Array2.length - 1].method8749(local103, local109) - (0x3E8 << Static138.anInt2287 - 7);
						@Pc(166) int local166 = Static176.aClass88Array1 == null ? Static230.aClass88Array2[0].method8749(local103, local109) + Static108.anInt1949 : Static176.aClass88Array1[0].method8749(local103, local109) + Static108.anInt1949;
						local83 = arg15 >= 0 ? Static267.aClass143_6.r(local123, local144, local127, local123, local166, local127, arg15) : Static267.aClass143_6.JA(local123, local144, local127, local123, local166, local127);
						Static115.aBooleanArrayArray3[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static115.aBooleanArrayArray3[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static652.anIntArray595[local85 - 1] & Static652.anIntArray595[local85] & local81 & local83;
						Static10.aBooleanArrayArray1[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static652.anIntArray595[Static537.anInt10357 + Static537.anInt10357] = local81;
				Static652.anIntArray595[Static537.anInt10357 + Static537.anInt10357 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static662.aBoolean761 = false;
			} else {
				Static395.anIntArray385 = arg5;
				Static184.anIntArray171 = arg6;
				Static147.anIntArray598 = arg7;
				Static515.anIntArray233 = arg8;
				Static676.anIntArray511 = arg9;
				Static636.method8437(arg10, Static267.aClass143_6);
			}
		} else {
			if (Static409.aBooleanArrayArray6 == null) {
				Static409.aBooleanArrayArray6 = new boolean[Static665.anInt7330 + Static665.anInt7330 + 1][Static92.anInt1526 + Static665.anInt7330 + 1];
			}
			for (local78 = 0; local78 < Static409.aBooleanArrayArray6.length; local78++) {
				for (local81 = 0; local81 < Static409.aBooleanArrayArray6[0].length; local81++) {
					Static409.aBooleanArrayArray6[local78][local81] = true;
				}
			}
			Static115.aBooleanArrayArray3 = Static409.aBooleanArrayArray6;
			Static10.aBooleanArrayArray1 = Static409.aBooleanArrayArray6;
			Static15.anInt230 = 0;
			Static582.anInt9578 = 0;
			Static544.anInt8920 = Static665.anInt7330;
			Static264.anInt4215 = Static92.anInt1526;
			Static662.aBoolean761 = false;
		}
		Static299.method4068(Static267.aClass143_6);
		if (!Static508.aClass89_1.aBoolean147) {
			@Pc(349) Class102 local349 = Static508.aClass89_1.aClass102_1;
			for (@Pc(354) Class41_Sub3 local354 = (Class41_Sub3) local349.method2062(); local354 != null; local354 = (Class41_Sub3) local349.method2054()) {
				local354.method8644();
				Static492.method5401(local354);
			}
		}
		if (Static246.aBoolean276) {
			for (local78 = 0; local78 < Static111.anInt10678; local78++) {
				Static602.aClass371Array5[local78].method8365(arg0, arg14);
			}
		}
		if (Static362.aBoolean459) {
			Static405.anIntArray389 = Static267.aClass143_6.Y();
			Static267.aClass143_6.K(Static556.anIntArray498);
			local78 = (Static556.anIntArray498[2] - Static556.anIntArray498[0]) / Static286.anInt4496;
			for (local81 = 0; local81 < Static286.anInt4496 - 1; local81++) {
				Static439.anIntArray432[local81] = local78 * (local81 + 1) + Static224.anIntArray200[local81];
			}
			for (local83 = 0; local83 < Static460.aClass360Array1.length; local83++) {
				Static460.aClass360Array1[local83].method8172();
			}
		}
		if (Static549.aClass313ArrayArrayArray6 != null) {
			if (Static362.aBoolean459) {
				Static509.method5084(0);
			}
			Static249.method3525(true);
			Static267.aClass143_6.ra(-1, 1583160, 40, 127);
			Static529.method7386(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static362.aBoolean459) {
				Static121.method1928();
			}
			Static267.aClass143_6.pa();
			Static249.method3525(false);
		}
		Static529.method7386(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static362.aBoolean459) {
			for (local78 = 0; local78 < Static202.anInt3256; local78++) {
				Static11.aBooleanArrayArrayArray1[local78] = Static630.aBooleanArrayArrayArray2[local78];
			}
			Static509.method5084(0);
			for (local81 = 0; local81 < Static460.aClass360Array1.length; local81++) {
				Static460.aClass360Array1[local81].method8172();
			}
		}
		if (Static362.aBoolean459) {
			Static121.method1928();
			for (local78 = 0; local78 < Static202.anInt3256; local78++) {
				Static630.aBooleanArrayArrayArray2[local78] = Static11.aBooleanArrayArrayArray1[local78];
			}
			if (Static298.anInt4621 == 2) {
				@Pc(543) int local543;
				if (Static289.aLongArray11[0] < Static289.aLongArray11[1]) {
					if (Static439.anIntArray432[0] + Static224.anIntArray200[0] > Static556.anIntArray498[0]) {
						local543 = Static224.anIntArray200[0]++;
					}
				} else if (Static289.aLongArray11[0] > Static289.aLongArray11[1] && Static439.anIntArray432[0] + Static224.anIntArray200[0] < Static556.anIntArray498[2]) {
					local543 = Static224.anIntArray200[0]--;
				}
			}
		}
		if (!Static281.aBoolean294) {
			Static10.aBooleanArrayArray1 = local72;
			Static115.aBooleanArrayArray3 = local74;
		}
		Static586.method7997();
	}
}
