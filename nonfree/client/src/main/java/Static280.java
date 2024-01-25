import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!jt", name = "l", descriptor = "Lclient!jt;")
	public static final Class182 aClass182_5 = new Class182(1);

	@OriginalMember(owner = "client!jt", name = "m", descriptor = "Lclient!jt;")
	public static final Class182 aClass182_6 = new Class182(2);

	@OriginalMember(owner = "client!jt", name = "n", descriptor = "Lclient!jt;")
	public static final Class182 aClass182_7 = new Class182(4);

	@OriginalMember(owner = "client!jt", name = "o", descriptor = "Lclient!jt;")
	public static final Class182 aClass182_8 = new Class182(1);

	@OriginalMember(owner = "client!jt", name = "p", descriptor = "Lclient!jt;")
	public static final Class182 aClass182_9 = new Class182(2);

	@OriginalMember(owner = "client!jt", name = "q", descriptor = "Lclient!jt;")
	public static final Class182 aClass182_10 = new Class182(4);

	@OriginalMember(owner = "client!jt", name = "r", descriptor = "Lclient!jt;")
	public static final Class182 aClass182_11 = new Class182(2);

	@OriginalMember(owner = "client!jt", name = "s", descriptor = "Lclient!jt;")
	public static final Class182 aClass182_12 = new Class182(4);

	@OriginalMember(owner = "client!jt", name = "t", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_161 = new Class194(30, -2);

	@OriginalMember(owner = "client!jt", name = "u", descriptor = "I")
	public static final int anInt5388 = 1400;

	@OriginalMember(owner = "client!jt", name = "v", descriptor = "Z")
	public static boolean aBoolean393 = false;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILclient!aea;)Lclient!aea;")
	public static Class3_Sub3_Sub1 method4566(@OriginalArg(1) Class3_Sub3_Sub1 arg0) {
		@Pc(19) Class3_Sub3_Sub1 local19 = arg0 == null ? new Class3_Sub3_Sub1() : new Class3_Sub3_Sub1(arg0);
		local19.method137();
		return local19;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!cea;ILclient!wq;IIILclient!ts;I)V")
	public static void method4567(@OriginalArg(0) Class9_Sub2_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class9_Sub2_Sub1_Sub2_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class330 arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class3_Sub31 local7 = new Class3_Sub31();
		local7.anInt5941 = arg3 << 9;
		local7.anInt5937 = arg6 << 9;
		local7.anInt5940 = arg4;
		if (arg5 != null) {
			local7.aClass330_1 = arg5;
			@Pc(182) int local182 = arg5.anInt9221;
			@Pc(185) int local185 = arg5.anInt9193;
			if (arg1 == 1 || arg1 == 3) {
				local185 = arg5.anInt9221;
				local182 = arg5.anInt9193;
			}
			local7.anIntArray317 = arg5.anIntArray579;
			local7.anInt5935 = arg5.anInt9225;
			local7.anInt5934 = local185 + arg6 << 9;
			local7.anInt5931 = arg5.anInt9205;
			local7.aBoolean436 = arg5.aBoolean683;
			local7.anInt5939 = arg5.anInt9206;
			local7.anInt5949 = arg5.anInt9215 << 9;
			local7.anInt5943 = arg5.anInt9208;
			local7.aBoolean435 = arg5.aBoolean685;
			local7.anInt5947 = local182 + arg3 << 9;
			local7.anInt5936 = arg5.anInt9224 << 9;
			local7.anInt5932 = arg5.anInt9189;
			local7.anInt5938 = arg5.anInt9188;
			if (arg5.anIntArray581 != null) {
				local7.aBoolean434 = true;
				local7.method5121();
			}
			if (local7.anIntArray317 != null) {
				local7.anInt5946 = local7.anInt5943 + (int) ((double) (local7.anInt5939 - local7.anInt5943) * Math.random());
			}
			Static402.aClass216_51.method5449(local7);
		} else if (arg2 != null) {
			local7.aClass9_Sub2_Sub1_Sub2_Sub2_1 = arg2;
			@Pc(105) Class309 local105 = arg2.aClass309_1;
			if (local105.anIntArray553 != null) {
				local7.aBoolean434 = true;
				local105 = local105.method7594(Static183.aClass285_1);
			}
			if (local105 != null) {
				local7.anInt5934 = local105.anInt8833 + arg6 << 9;
				local7.anInt5947 = local105.anInt8833 + arg3 << 9;
				local7.anInt5932 = Static14.method244(arg2);
				local7.anInt5931 = local105.anInt8854;
				local7.anInt5936 = local105.lb << 9;
				local7.anInt5949 = local105.anInt8848 << 9;
				local7.anInt5935 = local105.anInt8835;
				local7.anInt5938 = local105.anInt8861;
				local7.aBoolean436 = local105.aBoolean657;
			}
			Static413.aClass216_52.method5449(local7);
		} else if (arg0 != null) {
			local7.aClass9_Sub2_Sub1_Sub2_Sub1_2 = arg0;
			local7.anInt5947 = arg3 + arg0.method8619() << 9;
			local7.anInt5934 = arg6 + arg0.method8619() << 9;
			local7.anInt5932 = Static471.method6968(arg0);
			local7.anInt5935 = 256;
			local7.anInt5936 = arg0.anInt1324 << 9;
			local7.anInt5938 = 256;
			local7.aBoolean436 = arg0.aBoolean78;
			local7.anInt5949 = 0;
			local7.anInt5931 = arg0.anInt1304;
			Static554.aClass25_41.method434((long) arg0.anInt10204, local7);
			return;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIZLclient!ha;)Lclient!oh;")
	public static Class249 method4568(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class82 arg2) {
		if (arg0 == -1) {
			return null;
		}
		if (Static65.anIntArray96 != null) {
			for (@Pc(14) int local14 = 0; local14 < Static65.anIntArray96.length; local14++) {
				if (arg0 == Static65.anIntArray96[local14]) {
					return Static133.aClass249Array30[local14];
				}
			}
		}
		@Pc(37) Class249 local37 = (Class249) Static468.aClass136_55.method3134((long) arg0);
		if (local37 != null) {
			if (arg1 && local37.aClass93_10 == null) {
				@Pc(49) Class93 local49 = Static382.method6021(arg0, Static258.aClass343_130);
				if (local49 == null) {
					return null;
				}
				local37.aClass93_10 = local49;
			}
			return local37;
		}
		@Pc(62) Class251[] local62 = Static656.method6341(Static347.aClass343_168, arg0);
		if (local62 == null) {
			return null;
		}
		@Pc(71) Class93 local71 = Static382.method6021(arg0, Static258.aClass343_130);
		if (local71 == null) {
			return null;
		}
		if (arg1) {
			local37 = new Class249(arg2.method6127(local71, local62), local71);
		} else {
			local37 = new Class249(arg2.method6127(local71, local62));
		}
		Static468.aClass136_55.method3135(local37, (long) arg0);
		return local37;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)I")
	public static int method4569() {
		return Static179.anInt3439;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z[B)Lclient!fi;")
	public static Class3_Sub7_Sub10 method4570(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class3_Sub7_Sub10 local9 = new Class3_Sub7_Sub10();
		@Pc(14) Class3_Sub9 local14 = new Class3_Sub9(arg0);
		local14.anInt6453 = local14.aByteArray51.length - 2;
		@Pc(25) int local25 = local14.method5610();
		@Pc(36) int local36 = local14.aByteArray51.length - local25 - 2 - 12;
		local14.anInt6453 = local36;
		@Pc(43) int local43 = local14.method5585();
		local9.anInt3149 = local14.method5610();
		local9.anInt3157 = local14.method5610();
		local9.anInt3155 = local14.method5610();
		local9.anInt3154 = local14.method5610();
		@Pc(67) int local67 = local14.method5633();
		@Pc(78) int local78;
		@Pc(84) int local84;
		if (local67 > 0) {
			local9.aClass25Array1 = new Class25[local67];
			for (local78 = 0; local78 < local67; local78++) {
				local84 = local14.method5610();
				@Pc(91) Class25 local91 = new Class25(Static533.method1203(local84));
				local9.aClass25Array1[local78] = local91;
				while (local84-- > 0) {
					@Pc(102) int local102 = local14.method5585();
					@Pc(106) int local106 = local14.method5585();
					local91.method434((long) local102, new Class3_Sub51(local106));
				}
			}
		}
		local14.anInt6453 = 0;
		local9.aString22 = local14.method5584();
		local9.anIntArray197 = new int[local43];
		local9.anIntArray196 = new int[local43];
		local9.aStringArray25 = new String[local43];
		local78 = 0;
		while (local14.anInt6453 < local36) {
			local84 = local14.method5610();
			if (local84 == 3) {
				local9.aStringArray25[local78] = local14.method5607().intern();
			} else if (local84 >= 100 || local84 == 21 || local84 == 38 || local84 == 39) {
				local9.anIntArray197[local78] = local14.method5633();
			} else {
				local9.anIntArray197[local78] = local14.method5585();
			}
			local9.anIntArray196[local78++] = local84;
		}
		return local9;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!ida;IIIIIIILclient!ha;III)V")
	public static void method4571(@OriginalArg(0) Class3_Sub7_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class82 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg4 < arg6 && arg4 + arg1 > arg6 && arg5 > arg9 - 13 && arg9 + 3 > arg5) {
			arg7 = arg10;
		}
		@Pc(41) String local41 = Static424.method6731(arg0);
		Static374.aClass63_9.method7756(arg4 + 3, Static307.aClass103Array12, arg9, Static234.anIntArray255, local41, arg7);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILclient!jm;Z)V")
	public static void method4572(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) boolean arg1) {
		if (arg0.aBoolean387) {
			if (arg0.anInt5295 < 0 || Static4.method78(arg0.anInt5295, arg0.anInt5291)) {
				if (arg1) {
					Static114.method2109(arg0.anInt5286, arg0.anInt5293, arg0.anInt5290, (Class187) null, arg0.anInt5296);
				} else {
					Static233.method3996(-1, arg0.anInt5295, arg0.anInt5293, arg0.anInt5299, arg0.anInt5296, arg0.anInt5286, arg0.anInt5290, arg0.anInt5291);
				}
				arg0.method8682();
			}
		} else if (arg0.aBoolean386 && arg0.anInt5296 >= 1 && arg0.anInt5286 >= 1 && arg0.anInt5296 <= Static399.anInt7121 - 2 && arg0.anInt5286 <= Static24.anInt345 - 2 && (arg0.anInt5294 < 0 || Static4.method78(arg0.anInt5294, arg0.anInt5289))) {
			if (arg1) {
				Static114.method2109(arg0.anInt5286, arg0.anInt5293, arg0.anInt5290, arg0.aClass187_2, arg0.anInt5296);
			} else {
				Static233.method3996(-1, arg0.anInt5294, arg0.anInt5293, arg0.anInt5292, arg0.anInt5296, arg0.anInt5286, arg0.anInt5290, arg0.anInt5289);
			}
			arg0.aBoolean386 = false;
			if (!arg1 && arg0.anInt5295 == arg0.anInt5294 && arg0.anInt5295 == -1) {
				arg0.method8682();
			} else if (!arg1 && arg0.anInt5294 == arg0.anInt5295 && arg0.anInt5299 == arg0.anInt5292 && arg0.anInt5289 == arg0.anInt5291) {
				arg0.method8682();
			}
		}
	}
}
