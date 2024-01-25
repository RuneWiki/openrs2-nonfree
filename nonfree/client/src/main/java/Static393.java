import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "[Lclient!kv;")
	public static Class204[] aClass204Array1;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "[Lclient!lq;")
	public static Class28_Sub1[] aClass28_Sub1Array4;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "Lclient!qt;")
	public static final Class294 aClass294_6 = new Class294();

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_142 = new Class359(54, 6);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!ha;Lclient!g;ILclient!kj;Lclient!ek;IZI)V")
	public static void method5760(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub36 arg4, @OriginalArg(5) Class103 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) int local12 = arg6 - arg3 / 2 - 5;
		@Pc(16) int local16 = arg0 + 2;
		if (arg5.anInt2793 != 0) {
			arg1.method6900(local12, local16, arg3 + 10, arg5.anInt2793, arg0 + arg2.method3090() * arg7 + 1 - local16);
		}
		if (arg5.anInt2809 != 0) {
			arg1.method6943(local12, arg3 + 10, arg7 * arg2.method3090() + 1 + arg0 - local16, local16, arg5.anInt2809);
		}
		@Pc(69) int local69 = arg5.anInt2797;
		if (arg4.aBoolean527 && arg5.anInt2803 != -1) {
			local69 = arg5.anInt2803;
		}
		for (@Pc(86) int local86 = 0; local86 < arg7; local86++) {
			@Pc(91) String local91 = Static205.aStringArray12[local86];
			if (local86 < arg7 - 1) {
				local91 = local91.substring(0, local91.length() - 4);
			}
			arg2.method3092(arg1, local91, arg6, arg0, local69);
			arg0 += arg2.method3090();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZIII)V")
	public static void method5767(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!arg1 && Static427.anInt7491 == arg0 && Static436.anInt7546 == arg2 && (Static419.anInt7416 == Static481.anInt8082 || Static172.aClass5_Sub50_14.aClass12_Sub8_2.method2213() == 1)) {
			return;
		}
		Static436.anInt7546 = arg2;
		Static427.anInt7491 = arg0;
		Static419.anInt7416 = Static481.anInt8082;
		if (Static172.aClass5_Sub50_14.aClass12_Sub8_2.method2213() == 1) {
			Static419.anInt7416 = 0;
		}
		Static271.method4671(arg3);
		Static270.method4168(Static64.aClass52_12.method907(Static544.anInt8937), Static208.aClass65_7, Static604.aClass73_15, true, Static247.aClass247_16);
		@Pc(56) int local56 = Static153.anInt3147;
		Static153.anInt3147 = (Static427.anInt7491 - (Static201.anInt3834 >> 4)) * 8;
		@Pc(66) int local66 = Static201.anInt3839;
		Static201.anInt3839 = (Static436.anInt7546 - (Static626.anInt10238 >> 4)) * 8;
		Static301.aClass5_Sub3_Sub16_3 = Static330.method684(Static427.anInt7491 * 8, Static436.anInt7546 * 8);
		Static404.aClass116_3 = null;
		@Pc(88) int local88 = Static153.anInt3147 - local56;
		@Pc(93) int local93 = Static201.anInt3839 - local66;
		@Pc(100) int local100;
		@Pc(112) int local112;
		@Pc(233) int local233;
		@Pc(170) int local170;
		if (arg3 == 11) {
			for (local100 = 0; local100 < Static37.anInt617; local100++) {
				@Pc(105) Class5_Sub25 local105 = Static317.aClass5_Sub25Array1[local100];
				if (local105 != null) {
					@Pc(110) Class28_Sub1_Sub4_Sub2_Sub1 local110 = local105.aClass28_Sub1_Sub4_Sub2_Sub1_1;
					for (local112 = 0; local112 < 10; local112++) {
						local110.anIntArray308[local112] -= local88;
						local110.anIntArray307[local112] -= local93;
					}
					local110.anInt10784 -= local93 * 512;
					local110.anInt10781 -= local88 * 512;
				}
			}
		} else {
			@Pc(156) boolean local156 = false;
			Static36.anInt607 = 0;
			@Pc(164) int local164 = (Static201.anInt3834 - 1) * 512;
			local170 = Static626.anInt10238 * 512 - 512;
			for (local112 = 0; local112 < Static37.anInt617; local112++) {
				@Pc(177) Class5_Sub25 local177 = Static317.aClass5_Sub25Array1[local112];
				if (local177 != null) {
					@Pc(182) Class28_Sub1_Sub4_Sub2_Sub1 local182 = local177.aClass28_Sub1_Sub4_Sub2_Sub1_1;
					local182.anInt10784 -= local93 * 512;
					local182.anInt10781 -= local88 * 512;
					if (local182.anInt10781 >= 0 && local182.anInt10781 <= local164 && local182.anInt10784 >= 0 && local182.anInt10784 <= local170) {
						@Pc(231) boolean local231 = true;
						for (local233 = 0; local233 < 10; local233++) {
							local182.anIntArray308[local233] -= local88;
							local182.anIntArray307[local233] -= local93;
							if (local182.anIntArray308[local233] < 0 || local182.anIntArray308[local233] >= Static201.anInt3834 || local182.anIntArray307[local233] < 0 || local182.anIntArray307[local233] >= Static626.anInt10238) {
								local231 = false;
							}
						}
						if (local231) {
							Static588.anIntArray533[Static36.anInt607++] = local182.anInt5512;
						} else {
							local182.method3061((Class134) null);
							local156 = true;
							local177.method9052();
						}
					} else {
						local182.method3061((Class134) null);
						local177.method9052();
						local156 = true;
					}
				}
			}
			if (local156) {
				Static37.anInt617 = Static56.aClass300_8.method7190();
				Static56.aClass300_8.method7184(Static317.aClass5_Sub25Array1);
			}
		}
		for (local100 = 0; local100 < 2048; local100++) {
			@Pc(330) Class28_Sub1_Sub4_Sub2_Sub2 local330 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local100];
			if (local330 != null) {
				for (local170 = 0; local170 < 10; local170++) {
					local330.anIntArray308[local170] -= local88;
					local330.anIntArray307[local170] -= local93;
				}
				local330.anInt10784 -= local93 * 512;
				local330.anInt10781 -= local88 * 512;
			}
		}
		@Pc(379) Class371[] local379 = Static564.aClass371Array6;
		for (local170 = 0; local170 < local379.length; local170++) {
			@Pc(386) Class371 local386 = local379[local170];
			if (local386 != null) {
				local386.anInt10316 -= local88 * 512;
				local386.anInt10323 -= local93 * 512;
			}
		}
		@Pc(414) Class5_Sub6 local414;
		for (local414 = (Class5_Sub6) Static173.aClass114_20.method2805(); local414 != null; local414 = (Class5_Sub6) Static173.aClass114_20.method2814()) {
			local414.anInt547 -= local93;
			local414.anInt548 -= local88;
			if (Static31.anInt483 != 4 && (local414.anInt548 < 0 || local414.anInt547 < 0 || local414.anInt548 >= Static201.anInt3834 || Static626.anInt10238 <= local414.anInt547)) {
				local414.method9052();
			}
		}
		for (local414 = (Class5_Sub6) Static256.aClass114_27.method2805(); local414 != null; local414 = (Class5_Sub6) Static256.aClass114_27.method2814()) {
			local414.anInt547 -= local93;
			local414.anInt548 -= local88;
			if (Static31.anInt483 != 4 && (local414.anInt548 < 0 || local414.anInt547 < 0 || Static201.anInt3834 <= local414.anInt548 || Static626.anInt10238 <= local414.anInt547)) {
				local414.method9052();
			}
		}
		if (Static31.anInt483 != 4) {
			for (@Pc(530) Class5_Sub31 local530 = (Class5_Sub31) Static548.aClass300_41.method7182(); local530 != null; local530 = (Class5_Sub31) Static548.aClass300_41.method7192()) {
				@Pc(537) int local537 = (int) (local530.aLong307 & 0x3FFFL);
				@Pc(542) int local542 = local537 - Static153.anInt3147;
				local233 = (int) (local530.aLong307 >> 14 & 0x3FFFL);
				@Pc(555) int local555 = local233 - Static201.anInt3839;
				if (local542 < 0 || local555 < 0 || local542 >= Static201.anInt3834 || Static626.anInt10238 <= local555) {
					local530.method9052();
				}
			}
		}
		if (Static680.anInt10897 != 0) {
			Static54.anInt802 -= local93;
			Static680.anInt10897 -= local88;
		}
		Static354.method5342();
		if (arg3 != 11) {
			Static392.anInt6960 -= local88;
			Static332.anInt6132 -= local88 * 512;
			Static260.anInt4823 -= local93;
			Static407.anInt7215 -= local93 * 512;
			Static680.anInt10895 -= local93;
			Static184.anInt3595 -= local88;
			if (Math.abs(local88) > Static201.anInt3834 || Math.abs(local93) > Static626.anInt10238) {
				Static459.method6575();
			}
		} else if (Static660.anInt10605 == 4) {
			Static599.anInt9833 -= local93 * 512;
			Static40.anInt662 -= local88 * 512;
			Static541.anInt8929 -= local93 * 512;
			Static251.anInt4573 -= local88 * 512;
		} else {
			Static493.anInt8261 = -1;
			Static513.anInt8562 = -1;
			Static660.anInt10605 = 1;
		}
		Static377.method5635();
		Static551.method7650();
		Static456.aClass114_53.method2808();
		Static641.aClass114_67.method2808();
		Static394.aClass156_4.method3782();
		Static314.method4949();
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)[Lclient!pf;")
	public static Class275[] method5771() {
		return new Class275[] { Static69.aClass275_18, Static370.aClass275_15, Static321.aClass275_12 };
	}
}
