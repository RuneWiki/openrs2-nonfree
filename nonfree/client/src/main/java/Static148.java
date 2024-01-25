import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fga", name = "E", descriptor = "[Lclient!f;")
	public static Class73[] aClass73Array6;

	@OriginalMember(owner = "client!fga", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString76 = null;

	@OriginalMember(owner = "client!fga", name = "v", descriptor = "Lclient!vg;")
	public static final Class342 aClass342_58 = new Class342(10);

	@OriginalMember(owner = "client!fga", name = "y", descriptor = "I")
	public static int anInt3449 = 0;

	@OriginalMember(owner = "client!fga", name = "K", descriptor = "[F")
	public static final float[] aFloatArray34 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZIIII)V")
	public static void method2817(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0 && arg3 == Static347.anInt6235 && Static100.anInt9658 == arg1 && (Static594.anInt10310 == Static286.anInt5361 || Static348.aClass3_Sub51_Sub1_5.method7837(Static37.anInt1122))) {
			return;
		}
		Static286.anInt5361 = Static594.anInt10310;
		Static100.anInt9658 = arg1;
		Static347.anInt6235 = arg3;
		if (Static348.aClass3_Sub51_Sub1_5.method7837(Static37.anInt1122)) {
			Static286.anInt5361 = 0;
		}
		Static27.method293(arg2);
		Static452.method6235(Static2.aClass63_1, Static573.aClass350_16.method7730(Static201.anInt4321), Static319.aClass31_11, Static318.aClass328_8, true);
		@Pc(71) int local71 = Static321.anInt5874;
		@Pc(73) int local73 = Static137.anInt3293;
		Static321.anInt5874 = (Static347.anInt6235 - (Static345.anInt6228 >> 4)) * 8;
		Static137.anInt3293 = (Static100.anInt9658 - (Static535.anInt9341 >> 4)) * 8;
		Static5.aClass3_Sub7_Sub1_1 = Static157.method2239(Static347.anInt6235 * 8, Static100.anInt9658 * 8);
		Static425.aClass57_3 = null;
		@Pc(106) int local106 = Static321.anInt5874 - local71;
		@Pc(111) int local111 = Static137.anInt3293 - local73;
		@Pc(132) int local132;
		@Pc(134) int local134;
		@Pc(196) int local196;
		@Pc(294) int local294;
		if (arg2 == 11) {
			for (local294 = 0; local294 < Static238.anInt4737; local294++) {
				@Pc(300) Class3_Sub39 local300 = Static33.aClass3_Sub39Array1[local294];
				if (local300 != null) {
					@Pc(305) Class25_Sub2_Sub2_Sub5_Sub2 local305 = local300.aClass25_Sub2_Sub2_Sub5_Sub2_2;
					for (local134 = 0; local134 < 10; local134++) {
						local305.anIntArray512[local134] -= local106;
						local305.anIntArray513[local134] -= local111;
					}
					local305.anInt8482 -= local111 * 512;
					local305.anInt8476 -= local106 * 512;
				}
			}
		} else {
			@Pc(118) boolean local118 = false;
			Static60.anInt1599 = 0;
			@Pc(126) int local126 = (Static345.anInt6228 - 1) * 512;
			local132 = (Static535.anInt9341 - 1) * 512;
			for (local134 = 0; local134 < Static238.anInt4737; local134++) {
				@Pc(140) Class3_Sub39 local140 = Static33.aClass3_Sub39Array1[local134];
				if (local140 != null) {
					@Pc(145) Class25_Sub2_Sub2_Sub5_Sub2 local145 = local140.aClass25_Sub2_Sub2_Sub5_Sub2_2;
					local145.anInt8482 -= local111 * 512;
					local145.anInt8476 -= local106 * 512;
					if (local145.anInt8476 >= 0 && local126 >= local145.anInt8476 && local145.anInt8482 >= 0 && local132 >= local145.anInt8482) {
						@Pc(194) boolean local194 = true;
						for (local196 = 0; local196 < 10; local196++) {
							local145.anIntArray512[local196] -= local106;
							local145.anIntArray513[local196] -= local111;
							if (local145.anIntArray512[local196] < 0 || local145.anIntArray512[local196] >= Static345.anInt6228 || local145.anIntArray513[local196] < 0 || Static535.anInt9341 <= local145.anIntArray513[local196]) {
								local194 = false;
							}
						}
						if (local194) {
							Static529.anIntArray535[Static60.anInt1599++] = local145.anInt8529;
						} else {
							local145.method6690(null);
							local140.method8128();
							local118 = true;
						}
					} else {
						local145.method6690(null);
						local118 = true;
						local140.method8128();
					}
				}
			}
			if (local118) {
				Static238.anInt4737 = Static581.aClass297_39.method6528();
				Static581.aClass297_39.method6536(Static33.aClass3_Sub39Array1);
			}
		}
		for (local294 = 0; local294 < 2048; local294++) {
			@Pc(361) Class25_Sub2_Sub2_Sub5_Sub1 local361 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local294];
			if (local361 != null) {
				for (local132 = 0; local132 < 10; local132++) {
					local361.anIntArray512[local132] -= local106;
					local361.anIntArray513[local132] -= local111;
				}
				local361.anInt8482 -= local111 * 512;
				local361.anInt8476 -= local106 * 512;
			}
		}
		@Pc(411) Class167[] local411 = Static98.aClass167Array1;
		for (local132 = 0; local132 < local411.length; local132++) {
			@Pc(419) Class167 local419 = local411[local132];
			if (local419 != null) {
				local419.anInt5101 -= local111 * 512;
				local419.anInt5104 -= local106 * 512;
			}
		}
		for (@Pc(451) Class3_Sub29 local451 = (Class3_Sub29) Static391.aClass244_52.method5572(); local451 != null; local451 = (Class3_Sub29) Static391.aClass244_52.method5576()) {
			local451.anInt5007 -= local106;
			local451.anInt5012 -= local111;
			if (Static47.anInt1279 != 4 && (local451.anInt5007 < 0 || local451.anInt5012 < 0 || Static345.anInt6228 <= local451.anInt5007 || Static535.anInt9341 <= local451.anInt5012)) {
				local451.method8128();
			}
		}
		if (Static47.anInt1279 != 4) {
			for (@Pc(516) Class3_Sub4 local516 = (Class3_Sub4) Static537.aClass297_34.method6529(); local516 != null; local516 = (Class3_Sub4) Static537.aClass297_34.method6532()) {
				@Pc(524) int local524 = (int) (local516.aLong262 & 0x3FFFL);
				@Pc(529) int local529 = local524 - Static321.anInt5874;
				local196 = (int) (local516.aLong262 >> 14 & 0x3FFFL);
				@Pc(541) int local541 = local196 - Static137.anInt3293;
				if (local529 < 0 || local541 < 0 || Static345.anInt6228 <= local529 || Static535.anInt9341 <= local541) {
					local516.method8128();
				}
			}
		}
		if (Static349.anInt6239 != 0) {
			Static349.anInt6239 -= local106;
			Static262.anInt5041 -= local111;
		}
		Static117.method2295();
		if (arg2 != 11) {
			Static512.anInt8854 -= local111;
			Static418.anInt7466 -= local111 * 512;
			Static258.anInt5017 -= local111;
			Static407.anInt7345 -= local106 * 512;
			Static472.anInt8217 -= local106;
			Static429.anInt7994 -= local106;
			if (Math.abs(local106) > Static345.anInt6228 || Math.abs(local111) > Static535.anInt9341) {
				Static38.method1056();
			}
		} else if (Static188.anInt4080 == 4) {
			Static377.anInt6530 -= local106 * 512;
			Static262.anInt5037 -= local111 * 512;
			Static372.anInt6492 -= local111 * 512;
			Static357.anInt6340 -= local106 * 512;
		} else {
			Static188.anInt4080 = 1;
			Static481.anInt8356 = -1;
			Static357.anInt6345 = -1;
		}
		Static501.method6728();
		Static253.method3969();
		Static410.aClass244_55.method5581();
		Static110.aClass244_20.method5581();
		Static6.aClass269_1.method5969();
		Static116.method2288();
	}

	@OriginalMember(owner = "client!fga", name = "i", descriptor = "(I)V")
	public static void method2818() {
		@Pc(17) Class3_Sub10 local17 = Static129.method2403(Static452.aClass353_2, Static434.aClass287_126);
		local17.aClass3_Sub26_Sub1_1.method6769(Static538.anInt9387);
		Static193.method3398(local17);
	}
}
