import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "Z")
	public static boolean aBoolean533;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_112 = new Class359(26, 6);

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_113 = new Class359(113, -2);

	@OriginalMember(owner = "client!kp", name = "p", descriptor = "Lclient!pf;")
	public static final Class275 aClass275_12 = new Class275();

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "[I")
	public static final int[] anIntArray339 = new int[2048];

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIILclient!fda;I)V")
	public static void method5000(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class28_Sub1_Sub4_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class167 local12 = arg2.method4580();
		@Pc(22) int local22 = arg2.anInt5509 - arg2.aClass306_7.anInt8684 & 0x3FFF;
		if (arg3 == -1) {
			if (local22 != 0 || arg2.anInt5507 > 25) {
				if (arg0 < 0 && local12.anInt4892 != -1) {
					arg2.anInt5479 = local12.anInt4892;
					arg2.aBoolean470 = false;
				} else if (arg0 <= 0 || local12.anInt4888 == -1) {
					arg2.anInt5479 = local12.anInt4913;
				} else {
					arg2.anInt5479 = local12.anInt4888;
				}
				arg2.aBoolean470 = false;
			} else if (!arg2.aBoolean470 || !local12.method4114(arg2.anInt5479)) {
				arg2.anInt5479 = local12.method4117();
				arg2.aBoolean470 = arg2.anInt5479 != -1;
			}
		} else if (arg2.anInt5500 != -1 && (local22 >= 10240 || local22 <= 2048)) {
			@Pc(280) int local280 = Static453.anIntArray432[arg1] - arg2.aClass306_7.anInt8684 & 0x3FFF;
			if (arg3 == 2 && local12.anInt4897 != -1) {
				if (local280 > 2048 && local280 <= 6144 && local12.anInt4900 != -1) {
					arg2.anInt5479 = local12.anInt4900;
				} else if (local280 >= 10240 && local280 < 14336 && local12.anInt4893 != -1) {
					arg2.anInt5479 = local12.anInt4893;
				} else if (local280 <= 6144 || local280 >= 10240 || local12.anInt4909 == -1) {
					arg2.anInt5479 = local12.anInt4897;
				} else {
					arg2.anInt5479 = local12.anInt4909;
				}
			} else if (arg3 == 0 && local12.anInt4881 != -1) {
				if (local280 > 2048 && local280 <= 6144 && local12.anInt4882 != -1) {
					arg2.anInt5479 = local12.anInt4882;
				} else if (local280 >= 10240 && local280 < 14336 && local12.anInt4876 != -1) {
					arg2.anInt5479 = local12.anInt4876;
				} else if (local280 <= 6144 || local280 >= 10240 || local12.anInt4879 == -1) {
					arg2.anInt5479 = local12.anInt4881;
				} else {
					arg2.anInt5479 = local12.anInt4879;
				}
			} else if (local280 > 2048 && local280 <= 6144 && local12.anInt4906 != -1) {
				arg2.anInt5479 = local12.anInt4906;
			} else if (local280 >= 10240 && local280 < 14336 && local12.anInt4890 != -1) {
				arg2.anInt5479 = local12.anInt4890;
			} else if (local280 <= 6144 || local280 >= 10240 || local12.anInt4912 == -1) {
				arg2.anInt5479 = local12.anInt4913;
			} else {
				arg2.anInt5479 = local12.anInt4912;
			}
			arg2.aBoolean470 = false;
		} else if (local22 == 0 && arg2.anInt5507 <= 25) {
			arg2.aBoolean470 = false;
			if (arg3 == 2 && local12.anInt4897 != -1) {
				arg2.anInt5479 = local12.anInt4897;
			} else if (arg3 == 0 && local12.anInt4881 != -1) {
				arg2.anInt5479 = local12.anInt4881;
			} else {
				arg2.anInt5479 = local12.anInt4913;
			}
		} else {
			if (arg3 == 2 && local12.anInt4897 != -1) {
				if (arg0 < 0 && local12.anInt4904 != -1) {
					arg2.anInt5479 = local12.anInt4904;
				} else if (arg0 <= 0 || local12.anInt4916 == -1) {
					arg2.anInt5479 = local12.anInt4897;
				} else {
					arg2.anInt5479 = local12.anInt4916;
				}
			} else if (arg3 == 0 && local12.anInt4881 != -1) {
				if (arg0 < 0 && local12.anInt4917 != -1) {
					arg2.anInt5479 = local12.anInt4917;
				} else if (arg0 <= 0 || local12.anInt4910 == -1) {
					arg2.anInt5479 = local12.anInt4881;
				} else {
					arg2.anInt5479 = local12.anInt4910;
				}
			} else if (arg0 < 0 && local12.anInt4874 != -1) {
				arg2.anInt5479 = local12.anInt4874;
			} else if (arg0 <= 0 || local12.anInt4896 == -1) {
				arg2.anInt5479 = local12.anInt4913;
			} else {
				arg2.anInt5479 = local12.anInt4896;
			}
			arg2.aBoolean470 = false;
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)I")
	public static int method5003() {
		if (Static578.anInt9502 == 0) {
			Static454.aClass280_2.method6526(new Class304("jaclib"));
			if (Static454.aClass280_2.method6527().method8097() != 100) {
				return 1;
			}
			if (!((Class304) Static454.aClass280_2.method6527()).method7323()) {
				Static209.aClient2.method1798();
			}
			Static578.anInt9502 = 1;
		}
		@Pc(230) int local230;
		@Pc(253) int local253;
		@Pc(267) int local267;
		@Pc(275) int local275;
		if (Static578.anInt9502 == 1) {
			Static357.aClass280Array1 = Static454.method6524();
			Static454.aClass280_1.method6526(new Class348(Static137.aClass390_29));
			Static454.aClass280_3.method6526(new Class304("jaggl"));
			Static454.aClass280_4.method6526(new Class304("jagdx"));
			Static454.aClass280_5.method6526(new Class304("jagmisc"));
			Static454.aClass280_6.method6526(new Class304("sw3d"));
			Static454.aClass280_7.method6526(new Class304("hw3d"));
			Static454.aClass280_8.method6526(new Class304("jagtheora"));
			Static454.aClass280_9.method6526(new Class348(Static305.aClass390_77));
			Static454.aClass280_10.method6526(new Class348(Static230.aClass390_52));
			Static454.aClass280_11.method6526(new Class348(Static111.aClass390_79));
			Static454.aClass280_12.method6526(new Class348(Static161.aClass390_71));
			Static454.aClass280_13.method6526(new Class348(Static242.aClass390_56));
			Static454.aClass280_14.method6526(new Class348(Static145.aClass390_31));
			Static454.aClass280_15.method6526(new Class348(Static7.aClass390_1));
			Static454.aClass280_16.method6526(new Class348(Static556.aClass390_110));
			Static454.aClass280_17.method6526(new Class348(Static143.aClass390_30));
			Static454.aClass280_18.method6526(new Class348(Static432.aClass390_85));
			Static454.aClass280_19.method6526(new Class348(Static86.aClass390_16));
			Static454.aClass280_20.method6526(new Class348(Static474.aClass390_90));
			Static454.aClass280_21.method6526(new Class348(Static570.aClass390_113));
			Static454.aClass280_22.method6526(new Class348(Static509.aClass390_99));
			Static454.aClass280_23.method6526(new Class332(Static83.aClass390_15, "huffman"));
			Static454.aClass280_24.method6526(new Class348(Static622.aClass390_120));
			Static454.aClass280_25.method6526(new Class348(Static98.aClass390_19));
			Static454.aClass280_26.method6526(new Class348(Static536.aClass390_104));
			Static454.aClass280_27.method6526(new Class184(Static543.aClass390_106, "details"));
			for (local230 = 0; local230 < Static357.aClass280Array1.length; local230++) {
				if (Static357.aClass280Array1[local230].method6527() == null) {
					throw new RuntimeException();
				}
			}
			local253 = 0;
			@Pc(255) Class280[] local255 = Static357.aClass280Array1;
			for (@Pc(257) int local257 = 0; local257 < local255.length; local257++) {
				@Pc(263) Class280 local263 = local255[local257];
				local267 = local263.method6523();
				local275 = local263.method6527().method8097();
				local253 += local275 * local267 / 100;
			}
			Static134.anInt1981 = local253;
			Static578.anInt9502 = 2;
		}
		if (Static357.aClass280Array1 == null) {
			return 100;
		}
		local230 = 0;
		local253 = 0;
		@Pc(302) boolean local302 = true;
		@Pc(304) Class280[] local304 = Static357.aClass280Array1;
		for (@Pc(306) int local306 = 0; local306 < local304.length; local306++) {
			@Pc(312) Class280 local312 = local304[local306];
			local275 = local312.method6523();
			@Pc(324) int local324 = local312.method6527().method8097();
			local253 += local324 * local275 / 100;
			if (local324 < 100) {
				local302 = false;
			}
			local230 += local275;
		}
		if (local302) {
			if (!((Class304) Static454.aClass280_5.method6527()).method7323()) {
				Static209.aClient2.method1800();
			}
			if (!((Class304) Static454.aClass280_8.method6527()).method7323()) {
				Static77.aBoolean84 = Static209.aClient2.method1793();
			}
			Static357.aClass280Array1 = null;
		}
		local230 -= Static134.anInt1981;
		local253 -= Static134.anInt1981;
		local267 = local230 > 0 ? local253 * 100 / local230 : 100;
		if (!local302 && local267 > 99) {
			local267 = 99;
		}
		return local267;
	}
}
