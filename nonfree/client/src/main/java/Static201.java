import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "[I")
	public static int[] anIntArray347;

	@OriginalMember(owner = "client!pf", name = "O", descriptor = "Lclient!jd;")
	public static Class84 aClass84_85;

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "[Lclient!kk;")
	public static Class36_Sub3_Sub1[] aClass36_Sub3_Sub1Array1 = new Class36_Sub3_Sub1[32768];

	@OriginalMember(owner = "client!pf", name = "U", descriptor = "Z")
	public static boolean aBoolean347 = false;

	@OriginalMember(owner = "client!pf", name = "Z", descriptor = "I")
	public static int anInt4204 = 50;

	@OriginalMember(owner = "client!pf", name = "cb", descriptor = "I")
	public static int anInt4207 = -1;

	@OriginalMember(owner = "client!pf", name = "eb", descriptor = "[I")
	public static int[] anIntArray348 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
	public static void method3392() {
		Static98.aClass46_13.method1077();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(14) int local14 = arg3 - arg1;
		@Pc(18) int local18 = arg4 - arg1;
		@Pc(20) int local20 = 0;
		@Pc(24) int local24 = arg4 * arg4;
		@Pc(28) int local28 = arg3 * arg3;
		@Pc(32) int local32 = local18 * local18;
		@Pc(48) int local48 = local14 * local14;
		@Pc(52) int local52 = local24 << 1;
		@Pc(56) int local56 = local28 << 1;
		@Pc(60) int local60 = local32 << 1;
		@Pc(64) int local64 = local48 << 1;
		@Pc(68) int local68 = arg3 << 1;
		@Pc(77) int local77 = local56 + (1 - local68) * local24;
		@Pc(85) int local85 = local28 - local52 * (local68 - 1);
		@Pc(89) int local89 = local14 << 1;
		@Pc(98) int local98 = local64 + (1 - local89) * local32;
		@Pc(102) int local102 = local24 << 2;
		@Pc(111) int local111 = local48 - local60 * (local89 - 1);
		@Pc(115) int local115 = local28 << 2;
		@Pc(119) int local119 = local32 << 2;
		@Pc(123) int local123 = local48 << 2;
		@Pc(127) int local127 = local56 * 3;
		@Pc(133) int local133 = (local68 - 3) * local52;
		@Pc(139) int local139 = local60 * (local89 - 3);
		@Pc(143) int local143 = local64 * 3;
		@Pc(149) int local149 = (arg3 - 1) * local102;
		@Pc(155) int local155 = local119 * (local14 - 1);
		@Pc(157) int local157 = local115;
		@Pc(177) int local177;
		@Pc(185) int local185;
		@Pc(194) int local194;
		@Pc(202) int local202;
		if (arg5 >= Static127.anInt2664 && arg5 <= Static290.anInt6021) {
			@Pc(168) int[] local168 = Static274.anIntArrayArray50[arg5];
			local177 = Static202.method3411(Static68.anInt1509, arg2 - arg4, Static43.anInt1054);
			local185 = Static202.method3411(Static68.anInt1509, arg4 + arg2, Static43.anInt1054);
			local194 = Static202.method3411(Static68.anInt1509, arg2 - local18, Static43.anInt1054);
			local202 = Static202.method3411(Static68.anInt1509, local18 + arg2, Static43.anInt1054);
			Static133.method2321(local194, local177, local168, arg6);
			Static133.method2321(local202, local194, local168, arg0);
			Static133.method2321(local185, local202, local168, arg6);
		}
		@Pc(222) int local222 = local123;
		while (local9 > 0) {
			@Pc(234) boolean local234 = local14 >= local9;
			if (local234) {
				if (local98 < 0) {
					while (local98 < 0) {
						local98 += local143;
						local143 += local123;
						local111 += local222;
						local222 += local123;
						local20++;
					}
				}
				if (local111 < 0) {
					local20++;
					local111 += local222;
					local98 += local143;
					local222 += local123;
					local143 += local123;
				}
				local111 += -local139;
				local139 -= local119;
				local98 += -local155;
				local155 -= local119;
			}
			if (local77 < 0) {
				while (local77 < 0) {
					local77 += local127;
					local85 += local157;
					local127 += local115;
					local7++;
					local157 += local115;
				}
			}
			local9--;
			local177 = arg5 - local9;
			local185 = local9 + arg5;
			if (local85 < 0) {
				local7++;
				local85 += local157;
				local157 += local115;
				local77 += local127;
				local127 += local115;
			}
			if (local185 >= Static127.anInt2664 && Static290.anInt6021 >= local177) {
				local194 = Static202.method3411(Static68.anInt1509, arg2 + local7, Static43.anInt1054);
				local202 = Static202.method3411(Static68.anInt1509, arg2 - local7, Static43.anInt1054);
				if (local234) {
					@Pc(432) int local432 = Static202.method3411(Static68.anInt1509, local20 + arg2, Static43.anInt1054);
					@Pc(441) int local441 = Static202.method3411(Static68.anInt1509, arg2 - local20, Static43.anInt1054);
					@Pc(449) int[] local449;
					if (Static127.anInt2664 <= local177) {
						local449 = Static274.anIntArrayArray50[local177];
						Static133.method2321(local441, local202, local449, arg6);
						Static133.method2321(local432, local441, local449, arg0);
						Static133.method2321(local194, local432, local449, arg6);
					}
					if (Static290.anInt6021 >= local185) {
						local449 = Static274.anIntArrayArray50[local185];
						Static133.method2321(local441, local202, local449, arg6);
						Static133.method2321(local432, local441, local449, arg0);
						Static133.method2321(local194, local432, local449, arg6);
					}
				} else {
					if (Static127.anInt2664 <= local177) {
						Static133.method2321(local194, local202, Static274.anIntArrayArray50[local177], arg6);
					}
					if (local185 <= Static290.anInt6021) {
						Static133.method2321(local194, local202, Static274.anIntArrayArray50[local185], arg6);
					}
				}
			}
			local85 += -local133;
			local133 -= local102;
			local77 += -local149;
			local149 -= local102;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!mn;IIILclient!rj;II)V")
	public static void method3394(@OriginalArg(0) Class115 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub3_Sub1 arg4, @OriginalArg(6) int arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(13) int local13 = Static293.anInt6086 + (int) Static142.aFloat31 & 0x7FF;
		@Pc(25) int local25 = Math.max(arg0.anInt3555 / 2, arg0.anInt3487 / 2) + 10;
		@Pc(33) int local33 = arg5 * arg5 + arg2 * arg2;
		if (local25 * local25 < local33) {
			return;
		}
		@Pc(53) int local53 = Class66.anIntArray153[local13];
		@Pc(61) int local61 = local53 * 256 / (Static266.anInt5527 + 256);
		@Pc(65) int local65 = Class66.anIntArray148[local13];
		@Pc(73) int local73 = local65 * 256 / (Static266.anInt5527 + 256);
		@Pc(84) int local84 = arg2 * local61 - arg5 * local73 >> 16;
		@Pc(94) int local94 = local73 * arg2 + local61 * arg5 >> 16;
		if (Static60.aBoolean106) {
			((Class2_Sub3_Sub1_Sub2) arg4).method614(local94 + arg0.anInt3555 / 2 + arg1 - arg4.anInt5466 / 2, -local84 + arg0.anInt3487 / 2 + arg3 - arg4.anInt5457 / 2, (Class2_Sub3_Sub1_Sub2) arg0.method2854(false));
		} else {
			((Class2_Sub3_Sub1_Sub1) arg4).method4391(arg1 + arg0.anInt3555 / 2 + local94 - arg4.anInt5466 / 2, arg3 - (-(arg0.anInt3487 / 2) - -local84) + -(arg4.anInt5457 / 2), arg0.anIntArray269, arg0.anIntArray277);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V")
	public static void method3397(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static207.anInt4318 = arg0;
		Static106.aString119 = arg2;
		Static16.aString24 = arg1;
		if (Static16.aString24.equals("") || Static106.aString119.equals("")) {
			Static231.anInt4770 = 3;
		} else if (Static186.anInt3934 == -1) {
			Static231.anInt4770 = -3;
			Static263.anInt5392 = 0;
			Static243.anInt3781 = 0;
			Static162.anInt3417 = 1;
			@Pc(40) Class2_Sub26 local40 = new Class2_Sub26(128);
			local40.method4239(10);
			local40.method4260((int) (Math.random() * 9.9999999E7D));
			local40.method4225(Static61.method2447(Static16.aString24));
			local40.method4260((int) (Math.random() * 9.9999999E7D));
			local40.method4253(Static106.aString119);
			local40.method4260((int) (Math.random() * 9.9999999E7D));
			local40.method4268(Static248.aBigInteger3, Static125.aBigInteger4);
			Static95.aClass2_Sub26_Sub1_1.anInt5328 = 0;
			Static95.aClass2_Sub26_Sub1_1.method4239(24);
			Static95.aClass2_Sub26_Sub1_1.method4239(local40.anInt5328 + 2);
			Static95.aClass2_Sub26_Sub1_1.method4231(543);
			Static95.aClass2_Sub26_Sub1_1.method4246(local40.aByteArray72, local40.anInt5328);
		} else {
			Static287.method4763();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)V")
	public static void method3398(@OriginalArg(1) boolean arg0) {
		Static203.method3422();
		if (Static236.anInt4804 != 30 && Static236.anInt4804 != 25) {
			return;
		}
		Static185.anInt3925++;
		if (Static185.anInt3925 < 50 && !arg0) {
			return;
		}
		Static185.anInt3925 = 0;
		if (!Static47.aBoolean83 && Static42.aClass45_1 != null) {
			Static95.aClass2_Sub26_Sub1_1.method4287(84);
			try {
				Static42.aClass45_1.method1043(Static95.aClass2_Sub26_Sub1_1.anInt5328, Static95.aClass2_Sub26_Sub1_1.aByteArray72);
				Static95.aClass2_Sub26_Sub1_1.anInt5328 = 0;
			} catch (@Pc(57) IOException local57) {
				Static47.aBoolean83 = true;
			}
		}
		Static203.method3422();
	}
}
