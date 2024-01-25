import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "[I")
	public static final int[] anIntArray537 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
	public static int anInt7494 = 0;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5982(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static320.method4968(Static529.method7820(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBI)Z")
	public static boolean method5983(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZIII)V")
	public static void method5985(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1 && Static300.anInt5494 == arg2 && arg0 == Static582.anInt8003 && (Static558.anInt9704 == Static391.anInt7128 || Static58.aClass6_Sub17_Sub1_1.method7353(Static79.anInt2700))) {
			return;
		}
		Static300.anInt5494 = arg2;
		Static582.anInt8003 = arg0;
		Static558.anInt9704 = Static391.anInt7128;
		if (Static58.aClass6_Sub17_Sub1_1.method7353(Static79.anInt2700)) {
			Static558.anInt9704 = 0;
		}
		Static436.method6188(arg3);
		Static237.method3695(Static146.aClass103_13.method2355(Static188.anInt28), Static75.aClass82_1, true);
		@Pc(54) int local54 = Static150.anInt2792;
		Static150.anInt2792 = (Static300.anInt5494 - (Static18.anInt5706 >> 4)) * 8;
		@Pc(65) int local65 = Static154.anInt2878;
		Static154.anInt2878 = (Static582.anInt8003 - (Static80.anInt1367 >> 4)) * 8;
		Static364.aClass6_Sub5_Sub2_3 = Static490.method1739(Static300.anInt5494 * 8, Static582.anInt8003 * 8);
		Static577.aClass170_3 = null;
		@Pc(89) int local89 = Static150.anInt2792 - local54;
		@Pc(99) int local99 = Static154.anInt2878 - local65;
		@Pc(118) int local118;
		@Pc(120) int local120;
		@Pc(172) int local172;
		@Pc(279) int local279;
		if (arg3 == 11) {
			for (local279 = 0; local279 < Static192.anInt3744; local279++) {
				@Pc(285) Class6_Sub49 local285 = Static324.aClass6_Sub49Array1[local279];
				if (local285 != null) {
					@Pc(290) Class15_Sub2_Sub4_Sub1 local290 = local285.aClass15_Sub2_Sub4_Sub1_2;
					for (local120 = 0; local120 < 10; local120++) {
						local290.anIntArray638[local120] -= local89;
						local290.anIntArray637[local120] -= local99;
					}
					local290.anInt8913 -= local99 * 512;
					local290.anInt8911 -= local89 * 512;
				}
			}
		} else {
			@Pc(104) boolean local104 = false;
			Static429.anInt7650 = 0;
			@Pc(112) int local112 = Static18.anInt5706 * 512 - 512;
			local118 = (Static80.anInt1367 - 1) * 512;
			for (local120 = 0; local120 < Static192.anInt3744; local120++) {
				@Pc(126) Class6_Sub49 local126 = Static324.aClass6_Sub49Array1[local120];
				if (local126 != null) {
					@Pc(131) Class15_Sub2_Sub4_Sub1 local131 = local126.aClass15_Sub2_Sub4_Sub1_2;
					local131.anInt8913 -= local99 * 512;
					local131.anInt8911 -= local89 * 512;
					if (local131.anInt8911 >= 0 && local131.anInt8911 <= local112 && local131.anInt8913 >= 0 && local131.anInt8913 <= local118) {
						@Pc(170) boolean local170 = true;
						for (local172 = 0; local172 < 10; local172++) {
							local131.anIntArray638[local172] -= local89;
							local131.anIntArray637[local172] -= local99;
							if (local131.anIntArray638[local172] < 0 || Static18.anInt5706 <= local131.anIntArray638[local172] || local131.anIntArray637[local172] < 0 || Static80.anInt1367 <= local131.anIntArray637[local172]) {
								local170 = false;
							}
						}
						if (local170) {
							Static46.anIntArray36[Static429.anInt7650++] = local131.anInt8924;
						} else {
							local131.method4297(null);
							local104 = true;
							local126.method7948();
						}
					} else {
						local131.method4297(null);
						local104 = true;
						local126.method7948();
					}
				}
			}
			if (local104) {
				Static192.anInt3744 = Static251.aClass234_29.method5460();
				Static251.aClass234_29.method5462(Static324.aClass6_Sub49Array1);
			}
		}
		for (local279 = 0; local279 < 2048; local279++) {
			@Pc(348) Class15_Sub2_Sub4_Sub2 local348 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local279];
			if (local348 != null) {
				for (local118 = 0; local118 < 10; local118++) {
					local348.anIntArray638[local118] -= local89;
					local348.anIntArray637[local118] -= local99;
				}
				local348.anInt8911 -= local89 * 512;
				local348.anInt8913 -= local99 * 512;
			}
		}
		@Pc(396) Class279[] local396 = Static168.aClass279Array1;
		for (local118 = 0; local118 < local396.length; local118++) {
			@Pc(404) Class279 local404 = local396[local118];
			if (local404 != null) {
				local404.anInt7961 -= local99 * 512;
				local404.anInt7971 -= local89 * 512;
			}
		}
		for (@Pc(436) Class6_Sub44 local436 = (Class6_Sub44) Static24.aClass298_14.method6809(); local436 != null; local436 = (Class6_Sub44) Static24.aClass298_14.method6821()) {
			local436.anInt8222 -= local89;
			local436.anInt8228 -= local99;
			if (Static126.anInt2172 != 4 && (local436.anInt8222 < 0 || local436.anInt8228 < 0 || Static18.anInt5706 <= local436.anInt8222 || local436.anInt8228 >= Static80.anInt1367)) {
				local436.method7948();
			}
		}
		if (Static126.anInt2172 != 4) {
			for (@Pc(498) Class6_Sub30 local498 = (Class6_Sub30) Static500.aClass234_44.method5469(); local498 != null; local498 = (Class6_Sub30) Static500.aClass234_44.method5465()) {
				@Pc(506) int local506 = (int) (local498.aLong245 & 0x3FFFL);
				@Pc(511) int local511 = local506 - Static150.anInt2792;
				local172 = (int) (local498.aLong245 >> 14 & 0x3FFFL);
				@Pc(524) int local524 = local172 - Static154.anInt2878;
				if (local511 < 0 || local524 < 0 || local511 >= Static18.anInt5706 || local524 >= Static80.anInt1367) {
					local498.method7948();
				}
			}
		}
		if (Static567.anInt9818 != 0) {
			Static542.anInt9320 -= local99;
			Static567.anInt9818 -= local89;
		}
		Static119.method5766();
		if (arg3 != 11) {
			Static208.anInt3949 -= local99 * 512;
			Static342.anInt6506 -= local99;
			Static577.anInt9916 -= local89;
			Static378.anInt6923 -= local89 * 512;
			Static48.anInt8831 -= local89;
			Static478.anInt8409 -= local99;
			if (Math.abs(local89) > Static18.anInt5706 || Math.abs(local99) > Static80.anInt1367) {
				Static323.method4986();
			}
		} else if (Static60.anInt1008 == 4) {
			Static450.anInt7952 -= local99 * 512;
			Static173.anInt3141 -= local89 * 512;
			Static168.anInt3085 -= local99 * 512;
			Static480.anInt8528 -= local89 * 512;
		} else {
			Static60.anInt1008 = 1;
		}
		Static217.method3478();
		Static299.method4522();
		Static432.aClass298_162.method6808();
		Static237.aClass298_93.method6808();
		Static500.aClass349_15.method7897();
		Static392.method5709();
	}
}
