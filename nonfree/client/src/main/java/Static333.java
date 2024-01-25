import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "Lclient!io;")
	public static Class177 aClass177_6;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "Lclient!vq;")
	public static final Class382 aClass382_20 = new Class382(4, 1, 1, 1);

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_259 = new Class160(103, 7);

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "J")
	public static long aLong289 = 1L;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIII)V")
	public static void method8696(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0 && Static406.anInt7033 == arg2 && arg3 == Static306.anInt6137 && (Static114.anInt1886 == Static391.anInt6811 || Static181.aClass14_Sub26_9.aClass43_Sub19_1.method5412() == 1)) {
			return;
		}
		Static406.anInt7033 = arg2;
		Static306.anInt6137 = arg3;
		Static114.anInt1886 = Static391.anInt6811;
		if (Static181.aClass14_Sub26_9.aClass43_Sub19_1.method5412() == 1) {
			Static114.anInt1886 = 0;
		}
		Static160.method2323(arg1);
		Static478.method7167(Static372.aClass350_5, Static446.aClass68_8, true, Static21.aClass21_11.method324(Static26.anInt352), Static103.aClass144_3);
		@Pc(76) int local76 = Static36.anInt617;
		Static36.anInt617 = (Static406.anInt7033 - (Static380.anInt6689 >> 4)) * 8;
		@Pc(86) int local86 = Static550.anInt9242;
		Static550.anInt9242 = (Static306.anInt6137 - (Static542.anInt9214 >> 4)) * 8;
		Static688.aClass14_Sub2_Sub10_3 = Static224.method1312(Static406.anInt7033 * 8, Static306.anInt6137 * 8);
		Static131.aClass309_3 = null;
		@Pc(110) int local110 = Static36.anInt617 - local76;
		@Pc(115) int local115 = Static550.anInt9242 - local86;
		@Pc(122) int local122;
		@Pc(134) int local134;
		@Pc(259) int local259;
		@Pc(195) int local195;
		if (arg1 == 12) {
			for (local122 = 0; local122 < Static549.anInt1216; local122++) {
				@Pc(127) Class14_Sub44 local127 = Static28.aClass14_Sub44Array2[local122];
				if (local127 != null) {
					@Pc(132) Class4_Sub3_Sub3_Sub3_Sub1 local132 = local127.aClass4_Sub3_Sub3_Sub3_Sub1_2;
					for (local134 = 0; local134 < 10; local134++) {
						local132.anIntArray200[local134] -= local110;
						local132.anIntArray201[local134] -= local115;
					}
					local132.anInt11184 -= local110 * 512;
					local132.anInt11178 -= local115 * 512;
				}
			}
		} else {
			Static662.anInt10795 = 0;
			@Pc(183) boolean local183 = false;
			@Pc(189) int local189 = Static380.anInt6689 * 512 - 512;
			local195 = Static542.anInt9214 * 512 - 512;
			for (local134 = 0; local134 < Static549.anInt1216; local134++) {
				@Pc(202) Class14_Sub44 local202 = Static28.aClass14_Sub44Array2[local134];
				if (local202 != null) {
					@Pc(207) Class4_Sub3_Sub3_Sub3_Sub1 local207 = local202.aClass4_Sub3_Sub3_Sub3_Sub1_2;
					local207.anInt11184 -= local110 * 512;
					local207.anInt11178 -= local115 * 512;
					if (local207.anInt11184 >= 0 && local207.anInt11184 <= local189 && local207.anInt11178 >= 0 && local207.anInt11178 <= local195) {
						@Pc(257) boolean local257 = true;
						for (local259 = 0; local259 < 10; local259++) {
							local207.anIntArray200[local259] -= local110;
							local207.anIntArray201[local259] -= local115;
							if (local207.anIntArray200[local259] < 0 || Static380.anInt6689 <= local207.anIntArray200[local259] || local207.anIntArray201[local259] < 0 || Static542.anInt9214 <= local207.anIntArray201[local259]) {
								local257 = false;
							}
						}
						if (local257) {
							Static253.anIntArray241[Static662.anInt10795++] = local207.anInt3238;
						} else {
							local207.method2572((Class362) null);
							local202.method9513();
							local183 = true;
						}
					} else {
						local207.method2572((Class362) null);
						local202.method9513();
						local183 = true;
					}
				}
			}
			if (local183) {
				Static549.anInt1216 = Static100.aClass125_9.method2624();
				Static100.aClass125_9.method2629(Static28.aClass14_Sub44Array2);
			}
		}
		for (local122 = 0; local122 < 2048; local122++) {
			@Pc(370) Class4_Sub3_Sub3_Sub3_Sub2 local370 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local122];
			if (local370 != null) {
				for (local195 = 0; local195 < 10; local195++) {
					local370.anIntArray200[local195] -= local110;
					local370.anIntArray201[local195] -= local115;
				}
				local370.anInt11178 -= local115 * 512;
				local370.anInt11184 -= local110 * 512;
			}
		}
		@Pc(419) Class136[] local419 = Static8.aClass136Array1;
		for (local195 = 0; local195 < local419.length; local195++) {
			@Pc(426) Class136 local426 = local419[local195];
			if (local426 != null) {
				local426.anInt3420 -= local115 * 512;
				local426.anInt3425 -= local110 * 512;
			}
		}
		@Pc(460) Class14_Sub3 local460;
		for (local460 = (Class14_Sub3) Static461.aClass32_44.method584(); local460 != null; local460 = (Class14_Sub3) Static461.aClass32_44.method577()) {
			local460.anInt224 -= local115;
			local460.anInt233 -= local110;
			if (Static627.anInt10289 != 4 && (local460.anInt233 < 0 || local460.anInt224 < 0 || Static380.anInt6689 <= local460.anInt233 || Static542.anInt9214 <= local460.anInt224)) {
				local460.method9513();
			}
		}
		for (local460 = (Class14_Sub3) Static74.aClass32_2.method584(); local460 != null; local460 = (Class14_Sub3) Static74.aClass32_2.method577()) {
			local460.anInt224 -= local115;
			local460.anInt233 -= local110;
			if (Static627.anInt10289 != 4 && (local460.anInt233 < 0 || local460.anInt224 < 0 || Static380.anInt6689 <= local460.anInt233 || Static542.anInt9214 <= local460.anInt224)) {
				local460.method9513();
			}
		}
		if (Static627.anInt10289 != 4) {
			for (@Pc(585) Class14_Sub25 local585 = (Class14_Sub25) Static282.aClass125_17.method2633(); local585 != null; local585 = (Class14_Sub25) Static282.aClass125_17.method2627()) {
				@Pc(592) int local592 = (int) (local585.aLong324 & 0x3FFFL);
				@Pc(596) int local596 = local592 - Static36.anInt617;
				local259 = (int) (local585.aLong324 >> 14 & 0x3FFFL);
				@Pc(608) int local608 = local259 - Static550.anInt9242;
				if (local596 < 0 || local608 < 0 || Static380.anInt6689 <= local596 || local608 >= Static542.anInt9214) {
					local585.method9513();
				}
			}
		}
		if (Static60.anInt998 != 0) {
			Static60.anInt998 -= local110;
			Static605.anInt7003 -= local115;
		}
		Static281.method4722();
		if (arg1 != 12) {
			Static24.anInt330 -= local110;
			Static229.anInt4393 -= local115 * 512;
			Static70.anInt1085 -= local110 * 512;
			Static119.anInt1918 -= local115;
			Static81.anInt1406 -= local110;
			Static470.anInt8102 -= local115;
			if (Math.abs(local110) > Static380.anInt6689 || Math.abs(local115) > Static542.anInt9214) {
				Static452.method6681();
			}
		} else if (Static304.anInt5410 == 4) {
			Static173.anInt2835 -= local110 * 512;
			Static351.anInt11027 -= local115 * 512;
			Static660.anInt6758 -= local115 * 512;
			Static295.anInt5319 -= local110 * 512;
		} else {
			Static124.anInt2024 = -1;
			Static507.anInt8817 = -1;
			Static304.anInt5410 = 1;
		}
		Static523.method7771();
		Static563.method4401();
		Static598.aClass125_42.method2628();
		Static230.aClass32_24.method588();
		Static505.aClass283_12.method6797();
		Static223.method3821();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBI)Z")
	public static boolean method8698(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static511.method7646(arg1, arg0) | Static357.method5429(arg0, arg1)) & Static474.method7099(arg0, arg1);
	}
}
