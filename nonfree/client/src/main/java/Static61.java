import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!he", name = "n", descriptor = "[Lclient!vd;")
	public static Class83[] aClass83Array1;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "I")
	public static int anInt1455 = -1;

	@OriginalMember(owner = "client!he", name = "g", descriptor = "Lclient!sd;")
	public static Class73 aClass73_809 = Static122.method531("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!he", name = "h", descriptor = "[I")
	public static int[] anIntArray156 = new int[2000];

	@OriginalMember(owner = "client!he", name = "k", descriptor = "Lclient!sd;")
	public static Class73 aClass73_810 = Static122.method531("");

	@OriginalMember(owner = "client!he", name = "r", descriptor = "I")
	public static int anInt1463 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
	public static void method1111() {
		aClass83Array1 = null;
		anIntArray156 = null;
		aClass73_809 = null;
		aClass73_810 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;")
	public static Object method1112(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static138.aBoolean213) {
			try {
				@Pc(25) Class14 local25 = (Class14) Class.forName("Class14_Sub1").getDeclaredConstructor().newInstance();
				local25.method487(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static138.aBoolean213 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IBI)I")
	public static int method1113(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(36) int local36 = Static39.method693(arg1 + 45365, 4, arg0 + 91923) + (Static39.method693(arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (Static39.method693(arg1, 1, arg0) - 128 >> 2) - 128;
		local36 = (int) ((double) local36 * 0.3D) + 35;
		if (local36 < 10) {
			local36 = 10;
		} else if (local36 > 60) {
			local36 = 60;
		}
		return local36;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([Lclient!sd;III)Lclient!sd;")
	public static Class73 method1114(@OriginalArg(0) Class73[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg2; local9++) {
			if (arg0[arg1 + local9] == null) {
				arg0[local9 + arg1] = Static51.aClass73_684;
			}
			local7 += arg0[local9 + arg1].anInt3356;
		}
		@Pc(44) byte[] local44 = new byte[local7];
		@Pc(46) int local46 = 0;
		@Pc(62) Class73 local62;
		for (@Pc(53) int local53 = 0; local53 < arg2; local53++) {
			local62 = arg0[arg1 + local53];
			Static184.method1123(local62.aByteArray36, 0, local44, local46, local62.anInt3356);
			local46 += local62.anInt3356;
		}
		local62 = new Class73();
		local62.aByteArray36 = local44;
		local62.anInt3356 = local7;
		return local62;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZI)Z")
	public static boolean method1115(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BLclient!nf;II)V")
	public static void method1116(@OriginalArg(1) Class3_Sub1_Sub4_Sub7_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13;
		if ((arg1 & 0x2) != 0) {
			local13 = Static159.aClass3_Sub12_Sub1_4.method1378();
			@Pc(16) byte[] local16 = new byte[local13];
			@Pc(21) Class3_Sub12 local21 = new Class3_Sub12(local16);
			Static159.aClass3_Sub12_Sub1_4.method1369(local13, local16);
			Static79.aClass3_Sub12Array1[arg2] = local21;
			arg0.method2021(local21);
		}
		if ((arg1 & 0x8) != 0) {
			arg0.aClass73_1747 = Static159.aClass3_Sub12_Sub1_4.method1390();
			if (arg0.aClass73_1747.method2444(0) == 126) {
				arg0.aClass73_1747 = arg0.aClass73_1747.method2447(1);
				Static135.method2234(2, arg0.aClass73_1747, arg0.aClass73_1521);
			} else if (arg0 == Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1) {
				Static135.method2234(2, arg0.aClass73_1747, arg0.aClass73_1521);
			}
			arg0.anInt3147 = 0;
			arg0.anInt3170 = 150;
			arg0.anInt3178 = 0;
		}
		@Pc(101) int local101;
		if ((arg1 & 0x100) != 0) {
			local13 = Static159.aClass3_Sub12_Sub1_4.method1387();
			local101 = Static159.aClass3_Sub12_Sub1_4.method1347();
			arg0.method2265(local13, local101, Static44.anInt1024);
			arg0.anInt3137 = Static44.anInt1024 + 300;
			arg0.anInt3186 = Static159.aClass3_Sub12_Sub1_4.method1378();
			arg0.anInt3150 = Static159.aClass3_Sub12_Sub1_4.method1347();
		}
		if ((arg1 & 0x1) != 0) {
			local13 = Static159.aClass3_Sub12_Sub1_4.method1354();
			local101 = Static159.aClass3_Sub12_Sub1_4.method1387();
			arg0.method2265(local13, local101, Static44.anInt1024);
			arg0.anInt3137 = Static44.anInt1024 + 300;
			arg0.anInt3186 = Static159.aClass3_Sub12_Sub1_4.method1354();
			arg0.anInt3150 = Static159.aClass3_Sub12_Sub1_4.method1378();
		}
		if ((arg1 & 0x20) != 0) {
			arg0.anInt3148 = Static159.aClass3_Sub12_Sub1_4.method1352();
			arg0.anInt3136 = Static159.aClass3_Sub12_Sub1_4.method1381();
		}
		if ((arg1 & 0x80) != 0) {
			arg0.anInt3145 = Static159.aClass3_Sub12_Sub1_4.method1381();
			if (arg0.anInt3145 == 65535) {
				arg0.anInt3145 = -1;
			}
		}
		if ((arg1 & 0x4) != 0) {
			local13 = Static159.aClass3_Sub12_Sub1_4.method1377();
			local101 = Static159.aClass3_Sub12_Sub1_4.method1347();
			@Pc(209) int local209 = Static159.aClass3_Sub12_Sub1_4.method1347();
			@Pc(212) int local212 = Static159.aClass3_Sub12_Sub1_4.anInt1793;
			if (arg0.aClass73_1521 != null && arg0.aClass52_2 != null) {
				@Pc(223) long local223 = arg0.aClass73_1521.method2425();
				@Pc(225) boolean local225 = false;
				if (local101 <= 1) {
					for (@Pc(230) int local230 = 0; local230 < Static107.anInt2468; local230++) {
						if (local223 == Static63.aLongArray1[local230]) {
							local225 = true;
							break;
						}
					}
				}
				if (!local225 && Static51.anInt1228 == 0) {
					Static52.aClass3_Sub12_4.anInt1793 = 0;
					Static159.aClass3_Sub12_Sub1_4.method1386(local209, Static52.aClass3_Sub12_4.aByteArray16);
					Static52.aClass3_Sub12_4.anInt1793 = 0;
					@Pc(281) Class73 local281 = Static21.method1055(Static30.method578(Static52.aClass3_Sub12_4).method2437());
					arg0.aClass73_1747 = local281.method2442();
					arg0.anInt3178 = local13 & 0xFF;
					arg0.anInt3147 = local13 >> 8;
					arg0.anInt3170 = 150;
					if (local101 == 2 || local101 == 3) {
						Static135.method2234(1, local281, Static19.method372(new Class73[] { Static78.aClass73_930, arg0.aClass73_1521 }));
					} else if (local101 == 1) {
						Static135.method2234(1, local281, Static19.method372(new Class73[] { Static80.aClass73_965, arg0.aClass73_1521 }));
					} else {
						Static135.method2234(2, local281, arg0.aClass73_1521);
					}
				}
			}
			Static159.aClass3_Sub12_Sub1_4.anInt1793 = local212 + local209;
		}
		if ((arg1 & 0x10) != 0) {
			local13 = Static159.aClass3_Sub12_Sub1_4.method1377();
			if (local13 == 65535) {
				local13 = -1;
			}
			local101 = Static159.aClass3_Sub12_Sub1_4.method1354();
			Static110.method1963(local101, arg0, local13);
		}
		if ((arg1 & 0x400) != 0) {
			arg0.anInt3165 = Static159.aClass3_Sub12_Sub1_4.method1387();
			arg0.anInt3158 = Static159.aClass3_Sub12_Sub1_4.method1347();
			arg0.anInt3143 = Static159.aClass3_Sub12_Sub1_4.method1347();
			arg0.anInt3166 = Static159.aClass3_Sub12_Sub1_4.method1347();
			arg0.anInt3128 = Static159.aClass3_Sub12_Sub1_4.method1377() + Static44.anInt1024;
			arg0.anInt3131 = Static159.aClass3_Sub12_Sub1_4.method1359() + Static44.anInt1024;
			arg0.anInt3167 = Static159.aClass3_Sub12_Sub1_4.method1378();
			arg0.anInt3135 = 0;
			arg0.anInt3160 = 1;
		}
		if ((arg1 & 0x200) == 0) {
			return;
		}
		arg0.anInt3149 = Static159.aClass3_Sub12_Sub1_4.method1377();
		local13 = Static159.aClass3_Sub12_Sub1_4.method1384();
		arg0.anInt3176 = (local13 & 0xFFFF) + Static44.anInt1024;
		if (arg0.anInt3149 == 65535) {
			arg0.anInt3149 = -1;
		}
		arg0.anInt3189 = 0;
		arg0.anInt3157 = local13 >> 16;
		if (arg0.anInt3176 > Static44.anInt1024) {
			arg0.anInt3189 = -1;
		}
		arg0.anInt3162 = 0;
	}
}
